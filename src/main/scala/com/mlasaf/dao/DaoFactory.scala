/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.dao

import java.sql._
import anorm._
import com.mlasaf.dto._
import com.mlasaf.utils._
import org.apache.commons.dbcp._
//import com.lucidchart.relate._


import java.sql.Connection

/** main factory class for all DAOs and connection managers */
  class DaoFactory {
    /** add DAO objects for all DTOs */
    val daos : Daos = new Daos();
    /** connection manager for all DAOs*/
    val daoConn : DaoConnection = new DaoConnection();
    val daoCustom : DaoCustom = new DaoCustom();
    /** logger for current class*/
    val logger = org.slf4j.LoggerFactory.getLogger("Context");

    /** */
    def DaoFactory() = {
    }

    /** initialize connection - create template */
    def initialize(jdbc : String, user: String, pass : String) = {
      println("Creating connection to configurational DB: " + jdbc + " with user: " + user);
      daoConn.initialize(jdbc, user, pass)
      daos.initialize(daoConn);
      daoCustom.initialize(this);
    }
    def insert(d : BaseDto): Unit = {
      implicit val conn = daoConn.getConnection();
      val insertParams = d.fields.split(",").map(f => "{" + f + "}").mkString(",")
      val sql = "insert into " + d.getClass.getName + "(" + d.fields + ") values (" + insertParams + ") ";
      val stat = conn.prepareStatement("");
      val fv = d.toAnyArray();
      //conn.prepareStatement()
      //d.fields.map(x => d.get(x)).toArray;
      //val ar = Array[AnyRef](1, "", 4.6, "");
      //stat.setObject(1, "");
      //val dtoAttribs = d.fields.split(",").map(x => d.get(x));
      //dtoAttribs.
      //d.get("")
      //val paramValues = d.fields.map(p => ParameterValue.toParameterValue(p)).toArray;
      //SQL(sql).onParams(paramValues.toSeq).executeInsert()(conn);
    }

    def selectCount(d : BaseDto) : Long = {
      implicit val conn = daoConn.getConnection();
      val sql = "select count(*) as cnt from " + d.getClass.getName;
      val queryRes = SQL(sql)
        .executeQuery()(conn).as[Int](SqlParser.int("cnt").single)(conn);;
      queryRes
    }
    def selectCount(d : java.lang.Class[BaseDto]) : Long = {
      implicit val conn = daoConn.getConnection();
      val sql = "select count(*) as cnt from " + d.getName;
      val queryRes = SQL(sql)
        .executeQuery()(conn).as[Int](SqlParser.int("cnt").single)(conn);;
      queryRes
    }
    def executeQuery(sql : String, params : Seq[Object]) = {

    }

}

