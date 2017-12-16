/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.dao

import java.sql.{Connection, DriverManager}

class DaoBase {

  val logger = org.slf4j.LoggerFactory.getLogger("Context");
  var isInitialized = false;
  /** DAO to be used by connection*/
  var daoConnection : DaoConnection = null;

  /** initialize connection - create template */
  def initialize(daoConn : DaoConnection) = {
    daoConnection = daoConn;
    println("Initialization of new DAO of class: " + this.getClass.getName + " with DaoConnection: " + daoConn);
    isInitialized = true;
  }
  def getConnection() : Connection = {
    daoConnection.getConnection();
  }

}
