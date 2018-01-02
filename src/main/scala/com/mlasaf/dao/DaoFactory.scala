/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.dao

import java.sql._

import anorm._
import com.mlasaf.base.ThreadBase
import com.mlasaf.dto._
import com.mlasaf.utils._
import org.apache.commons.dbcp._


import java.sql.Connection

/** main factory class for all DAOs and connection managers */
class DaoFactory extends ThreadBase {

    /** add DAO objects for all DTOs */
    val daos : Daos = new Daos();
    /** connection manager for all DAOs*/
    val daoConn : DaoConnection = new DaoConnection();
    /** dao with custom functions */
    val daoCustom : DaoCustom = new DaoCustom();

    /** */
    def DaoFactory() = {
    }
    /** initialize connection - create template */
    def initialize(jdbc : String, user: String, pass : String, driverClass : String) = {
      logger.info("Creating connection to configurational DB: " + jdbc + " with user: " + user + ", driver: " + driverClass);
      daoConn.initialize(jdbc, user, pass, driverClass)
      daos.initialize(daoConn);
      daoCustom.initialize(this);
    }
    def getName() : String = "DAO_FACTORY";
    def onRunBegin() = {
    }
    def onRun() = {
      logger.info("Connections free: " + daoConn.connectionsFree.size + ", inUse: " + daoConn.connectionsInUse.size + ", isInitialized: " + daoConn.isInitialized)
    }
    def onRunEnd() = {
    }
    def onStop() : Unit = {
      logger.info("Stopping DAO Factory...");
    }
    def selectCount(d : BaseDto) : Long = {
      implicit val conn = daoConn.getConnection();
      val sql = "select count(*) as cnt from " + d.tableName
      logger.info("Executing QUERY: " + sql);
      val queryRes = SQL(sql)
        .executeQuery()(conn).as[Int](SqlParser.int("cnt").single)(conn);;
      queryRes
    }
    def selectCount(d : java.lang.Class[BaseDto]) : Long = {
      implicit val conn = daoConn.getConnection();
      val sql = "select count(*) as cnt from " + d.getName
      logger.info("Executing QUERY: " + sql);
      val queryRes = SQL(sql)
        .executeQuery()(conn).as[Int](SqlParser.int("cnt").single)(conn);;
      queryRes
    }
    def executeQuery(sql : String, params : Seq[Object]) = {
    }
    def getInfoJson() : String = {
      " { \"connectionCounter\":" + daoConn.connTotalCounter + ",\"daoCount\":" + daos.getClass.getFields.size + ",\"connectionsInUseCount\":" + daoConn.connInUse.size() + ", \"jdbcString\":\"" + daoConn.jdbcString + "\", \"jdbcUser\":\"" + daoConn.jdbcUser + "\",\"jdbcDriverClass\":\"" + daoConn.jdbcDriverClass + "\" } "
    }

}

