/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.dao

import java.sql.{Connection, DriverManager, PreparedStatement}
import anorm.{SQL, SqlParser}

import com.mlasaf.dto._

/** base class for all generated DAO classes in DaoClasses.scala */
class DaoBase {

  /** logger for subclasses*/
  val logger = org.slf4j.LoggerFactory.getLogger("DaoBase");
  /** if current DAO is initialized and DAO connection is set*/
  var isInitialized = false;
  /** DAO to be used by connection*/
  var daoConnection : DaoConnection = null;

  /** initialize connection - create template */
  def initialize(daoConn : DaoConnection) = {
    daoConnection = daoConn;
    logger.info("Initialization of new DAO of class: " + this.getClass.getName + " with DaoConnection: " + daoConn);
    isInitialized = true;
  }
  /** get JDBC connection object for subclass to read/write data */
  def getConnection() : Connection = {
    daoConnection.getConnection();
  }
  /** insert DTO to DB with new PK value */
  def insertDto(dto : BaseDto): Int = {
    val stat = dto.prepareInsert(getConnection());
    val resCnt = stat.executeUpdate();
    resCnt
  }
  /** update all fields of DTO based on PK value */
  def changeUpdatedDate(dto : BaseDto): Int = {
    implicit val connection = getConnection();
    val id = dto.getFieldValue(dto.pkFields).asInstanceOf[Long];
    val lastUpdatedDate = new java.util.Date();
    val sql = "update " + dto.tableName + " set lastUpdatedDate = {lastUpdatedDate} where " + dto.pkFields + " = {id}";
    logger.info("EXECUTING: " + sql)
    val resCnt = SQL(sql)
      .on("id" -> id, "lastUpdatedDate" -> lastUpdatedDate).executeUpdate();
    resCnt
  }
  /** */
  def getFieldValue(dto: BaseDto, fieldName : String) : Any = {
    implicit val connection = getConnection();
    val sql = "select  " + fieldName + " from " + dto.tableName + " where " + dto.pkFields + " = {id} ";
    logger.info("EXECUTING: " + sql)
    val retValue = SQL(sql).on("id" -> dto.getPk())
        .executeQuery().as[String](SqlParser.str(fieldName).single)(connection);;
    retValue
  }
  /** */
  def getFieldValue(tableName : String, id : Long , fieldName : String) : String = {
    implicit val connection = getConnection();
    val pkName = DtoMetadata.getPkNameForTable(tableName);
    val sql = "select  " + fieldName + " from " + tableName + " where " + pkName + " = {id} ";
    logger.info("EXECUTING: " + sql)
    val retValue = SQL(sql).on("id" -> id)
      .executeQuery().as[String](SqlParser.str(fieldName).single)(connection);
    retValue
  }
  def getFieldValues(tableName : String, fieldName : String) : List[String] = {
    implicit val connection = getConnection();
    val pkName =  DtoMetadata.getPkNameForTable(tableName);
    val sql = "select  cast(" + fieldName + " as char(2000)) as " + fieldName + " from " + tableName;
    println("EXECUTING: " + sql)
    val retValue = SQL(sql)
      .executeQuery().as[List[String]](SqlParser.str(fieldName).*)(connection);;
    retValue
  }
  def updateField(dto : BaseDto, fieldName : String, newValue : Any) : Int = {
    implicit val connection = getConnection();
    val sql = "update " + dto.tableName + " set " + fieldName + " = {fieldName} where " + dto.pkFields + " = {id} ";
    logger.info("EXECUTING: " + sql)
    val resCnt = SQL(sql)
      .on("fieldName" -> newValue.toString, "id" -> dto.getPk())
      .executeUpdate();
    resCnt
  }
  def updateField(tableName : String, id: Long, fieldName : String, newValue : Any) : Int = {
    implicit val connection = getConnection();
    val pkName = "id";
    val sql = "update " + tableName + " set " + fieldName + " = {fieldName} where " + pkName + " = {id} ";
    logger.info("EXECUTING: " + sql)
    val resCnt = SQL(sql)
      .on("fieldName" -> newValue.toString, "id" -> id)
      .executeUpdate();
    resCnt
  }
}
