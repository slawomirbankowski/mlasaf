/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.dao

import java.sql.{Connection, DriverManager, PreparedStatement}

import com.mlasaf.dto._

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
  /** insert DTO to DB with new PK value */
  def insertDto(dto : BaseDto): Int = {
    val stat = dto.prepareInsert(getConnection());
    stat.executeUpdate();
  }
  def updateDto(dto : BaseDto) : Int = {
    0
  }

}
