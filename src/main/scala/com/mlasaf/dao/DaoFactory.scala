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
    /** dao with custom functions */
    val daoCustom : DaoCustom = new DaoCustom();
    /** logger for current class*/
    val logger = org.slf4j.LoggerFactory.getLogger("Context");

    /** */
    def DaoFactory() = {
    }
    /** initialize connection - create template */
    def initialize(jdbc : String, user: String, pass : String, driverClass : String) = {
      println("Creating connection to configurational DB: " + jdbc + " with user: " + user + ", driver: " + driverClass);
      daoConn.initialize(jdbc, user, pass, driverClass)
      daos.initialize(daoConn);
      daoCustom.initialize(this);
    }
    def selectCount(d : BaseDto) : Long = {
      implicit val conn = daoConn.getConnection();
      val sql = "select count(*) as cnt from " + d.tableName
      val queryRes = SQL(sql)
        .executeQuery()(conn).as[Int](SqlParser.int("cnt").single)(conn);;
      queryRes
    }
    def selectCount(d : java.lang.Class[BaseDto]) : Long = {
      implicit val conn = daoConn.getConnection();
      val sql = "select count(*) as cnt from " + d.getName
      val queryRes = SQL(sql)
        .executeQuery()(conn).as[Int](SqlParser.int("cnt").single)(conn);;
      queryRes
    }
    def executeQuery(sql : String, params : Seq[Object]) = {

    }

}

