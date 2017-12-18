/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.dao

import java.sql.{Connection, DriverManager}

/** base class for all generated DAO classes in Daos.scala*/
class DaoBase {

  /** logger for subclasses*/
  val logger = org.slf4j.LoggerFactory.getLogger("Context");
  /** if current DAO is initialized and DAO connection is set*/
  var isInitialized = false;
  /** DAO to be used by connection*/
  var daoConnection : DaoConnection = null;

  /** initialize connection - create template */
  def initialize(daoConn : DaoConnection) = {
    daoConnection = daoConn;
    println("Initialization of new DAO of class: " + this.getClass.getName + " with DaoConnection: " + daoConn);
    isInitialized = true;
  }
  /** get JDBC connection object for subclass to read/write data */
  def getConnection() : Connection = {
    daoConnection.getConnection();
  }

}
