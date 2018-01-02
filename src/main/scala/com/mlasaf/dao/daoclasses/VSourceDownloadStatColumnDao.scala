/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dao

import anorm.{SQL, SqlParser}
import com.mlasaf.dto._
import java.util.Date


 class VSourceDownloadStatColumnDao extends DaoBase { 

  def getVSourceDownloadStatColumnsList() : List[VSourceDownloadStatColumnDto] = {
   implicit val connection = getConnection();
   val dtos : List[VSourceDownloadStatColumnDto]= SQL("select * from vSourceDownloadStatColumn").as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*);
   releaseConnection(connection);
   dtos
  }
  def getVSourceDownloadStatColumnsCount() : Long = {
   implicit val connection = getConnection();
   val cnt : Long = SQL("select count(*) as cnt from vSourceDownloadStatColumn").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);
   releaseConnection(connection);
   cnt
  }
  def getVSourceDownloadStatColumnsLastInsertDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from vSourceDownloadStatColumn").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);
   releaseConnection(connection);
   ld
  }
  def getVSourceDownloadStatColumnsLastUpdatedDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from vSourceDownloadStatColumn").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);
   releaseConnection(connection);
   ld
  }
  def getVSourceDownloadStatColumnFirst() : VSourceDownloadStatColumnDto = {
   implicit val connection = getConnection();
   val dtos : VSourceDownloadStatColumnDto= SQL("select * from vSourceDownloadStatColumn order by insertedRowDate asc ").as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*).head;
   releaseConnection(connection);
   dtos
  }
  def getVSourceDownloadStatColumnLast() : VSourceDownloadStatColumnDto = {
   implicit val connection = getConnection();
   val dtos : VSourceDownloadStatColumnDto= SQL("select * from vSourceDownloadStatColumn order by insertedRowDate desc ").as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*).head;
   releaseConnection(connection);
   dtos
  }
  def getVSourceDownloadStatColumnsByField(fieldName : String, fieldValue : String) : List[VSourceDownloadStatColumnDto] = {
   implicit val connection = getConnection();
   val dtos : List[VSourceDownloadStatColumnDto]= SQL("select * from vSourceDownloadStatColumn where " + fieldName + " = {fieldValue} ").on("fieldValue" -> fieldValue).as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*);
   releaseConnection(connection);
   dtos
  }
  def getVSourceDownloadStatColumnByGuid(guid : Long) : VSourceDownloadStatColumnDto = {
   implicit val connection = getConnection();
   val dtos : VSourceDownloadStatColumnDto= SQL("select * from vSourceDownloadStatColumn where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].single);
   releaseConnection(connection);
   dtos
  }  
 def getDtosBySourceDownloadStatColumnId(colValue : Long) : List[VSourceDownloadStatColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadStatColumnDto] = SQL("select * from vSourceDownloadStatColumn where sourceDownloadStatColumnId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByGuid(colValue : Long) : List[VSourceDownloadStatColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadStatColumnDto] = SQL("select * from vSourceDownloadStatColumn where guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByInsertedRowDate(colValue : java.util.Date) : List[VSourceDownloadStatColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadStatColumnDto] = SQL("select * from vSourceDownloadStatColumn where insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByLastUpdatedDate(colValue : java.util.Date) : List[VSourceDownloadStatColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadStatColumnDto] = SQL("select * from vSourceDownloadStatColumn where lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceDownloadId(colValue : Long) : List[VSourceDownloadStatColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadStatColumnDto] = SQL("select * from vSourceDownloadStatColumn where sourceDownloadId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceViewColumnId(colValue : Long) : List[VSourceDownloadStatColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadStatColumnDto] = SQL("select * from vSourceDownloadStatColumn where sourceViewColumnId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByColumnMinNumber(colValue : Double) : List[VSourceDownloadStatColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadStatColumnDto] = SQL("select * from vSourceDownloadStatColumn where columnMinNumber = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByColumnMaxNumber(colValue : Double) : List[VSourceDownloadStatColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadStatColumnDto] = SQL("select * from vSourceDownloadStatColumn where columnMaxNumber = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByColumnMinStr(colValue : String) : List[VSourceDownloadStatColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadStatColumnDto] = SQL("select * from vSourceDownloadStatColumn where columnMinStr = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByColumnMaxStr(colValue : String) : List[VSourceDownloadStatColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadStatColumnDto] = SQL("select * from vSourceDownloadStatColumn where columnMaxStr = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByColumnNonemptyCount(colValue : Long) : List[VSourceDownloadStatColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadStatColumnDto] = SQL("select * from vSourceDownloadStatColumn where columnNonemptyCount = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceDownload_sourceDownloadId(colValue : Long) : List[VSourceDownloadStatColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadStatColumnDto] = SQL("select * from vSourceDownloadStatColumn where sourceDownload_sourceDownloadId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceDownload_guid(colValue : Long) : List[VSourceDownloadStatColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadStatColumnDto] = SQL("select * from vSourceDownloadStatColumn where sourceDownload_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceDownload_insertedRowDate(colValue : java.util.Date) : List[VSourceDownloadStatColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadStatColumnDto] = SQL("select * from vSourceDownloadStatColumn where sourceDownload_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceDownload_lastUpdatedDate(colValue : java.util.Date) : List[VSourceDownloadStatColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadStatColumnDto] = SQL("select * from vSourceDownloadStatColumn where sourceDownload_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceDownload_sourceScheduleId(colValue : Long) : List[VSourceDownloadStatColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadStatColumnDto] = SQL("select * from vSourceDownloadStatColumn where sourceDownload_sourceScheduleId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceDownload_executorHostId(colValue : Long) : List[VSourceDownloadStatColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadStatColumnDto] = SQL("select * from vSourceDownloadStatColumn where sourceDownload_executorHostId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceDownload_executorContextId(colValue : Long) : List[VSourceDownloadStatColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadStatColumnDto] = SQL("select * from vSourceDownloadStatColumn where sourceDownload_executorContextId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceDownload_sourceViewId(colValue : Long) : List[VSourceDownloadStatColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadStatColumnDto] = SQL("select * from vSourceDownloadStatColumn where sourceDownload_sourceViewId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceDownload_retryNumber(colValue : Int) : List[VSourceDownloadStatColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadStatColumnDto] = SQL("select * from vSourceDownloadStatColumn where sourceDownload_retryNumber = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceDownload_isRunning(colValue : Int) : List[VSourceDownloadStatColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadStatColumnDto] = SQL("select * from vSourceDownloadStatColumn where sourceDownload_isRunning = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceDownload_isFinished(colValue : Int) : List[VSourceDownloadStatColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadStatColumnDto] = SQL("select * from vSourceDownloadStatColumn where sourceDownload_isFinished = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceDownload_isExcecption(colValue : Int) : List[VSourceDownloadStatColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadStatColumnDto] = SQL("select * from vSourceDownloadStatColumn where sourceDownload_isExcecption = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceDownload_excecptionDescription(colValue : String) : List[VSourceDownloadStatColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadStatColumnDto] = SQL("select * from vSourceDownloadStatColumn where sourceDownload_excecptionDescription = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceViewColumn_sourceViewColumnId(colValue : Long) : List[VSourceDownloadStatColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadStatColumnDto] = SQL("select * from vSourceDownloadStatColumn where sourceViewColumn_sourceViewColumnId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceViewColumn_guid(colValue : Long) : List[VSourceDownloadStatColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadStatColumnDto] = SQL("select * from vSourceDownloadStatColumn where sourceViewColumn_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceViewColumn_insertedRowDate(colValue : java.util.Date) : List[VSourceDownloadStatColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadStatColumnDto] = SQL("select * from vSourceDownloadStatColumn where sourceViewColumn_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceViewColumn_lastUpdatedDate(colValue : java.util.Date) : List[VSourceDownloadStatColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadStatColumnDto] = SQL("select * from vSourceDownloadStatColumn where sourceViewColumn_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceViewColumn_sourceViewId(colValue : Long) : List[VSourceDownloadStatColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadStatColumnDto] = SQL("select * from vSourceDownloadStatColumn where sourceViewColumn_sourceViewId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceViewColumn_columnName(colValue : String) : List[VSourceDownloadStatColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadStatColumnDto] = SQL("select * from vSourceDownloadStatColumn where sourceViewColumn_columnName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceViewColumn_columnType(colValue : String) : List[VSourceDownloadStatColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadStatColumnDto] = SQL("select * from vSourceDownloadStatColumn where sourceViewColumn_columnType = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  

} 
