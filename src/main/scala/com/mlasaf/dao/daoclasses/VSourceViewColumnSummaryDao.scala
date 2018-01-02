/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dao

import anorm.{SQL, SqlParser}
import com.mlasaf.dto._
import java.util.Date


 class VSourceViewColumnSummaryDao extends DaoBase { 

  def getVSourceViewColumnSummarysList() : List[VSourceViewColumnSummaryDto] = {
   implicit val connection = getConnection();
   val dtos : List[VSourceViewColumnSummaryDto]= SQL("select * from vSourceViewColumnSummary").as(anorm.Macro.namedParser[VSourceViewColumnSummaryDto].*);
   releaseConnection(connection);
   dtos
  }
  def getVSourceViewColumnSummarysCount() : Long = {
   implicit val connection = getConnection();
   val cnt : Long = SQL("select count(*) as cnt from vSourceViewColumnSummary").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);
   releaseConnection(connection);
   cnt
  }
  def getVSourceViewColumnSummarysLastInsertDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from vSourceViewColumnSummary").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);
   releaseConnection(connection);
   ld
  }
  def getVSourceViewColumnSummarysLastUpdatedDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from vSourceViewColumnSummary").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);
   releaseConnection(connection);
   ld
  }
  def getVSourceViewColumnSummaryFirst() : VSourceViewColumnSummaryDto = {
   implicit val connection = getConnection();
   val dtos : VSourceViewColumnSummaryDto= SQL("select * from vSourceViewColumnSummary order by insertedRowDate asc ").as(anorm.Macro.namedParser[VSourceViewColumnSummaryDto].*).head;
   releaseConnection(connection);
   dtos
  }
  def getVSourceViewColumnSummaryLast() : VSourceViewColumnSummaryDto = {
   implicit val connection = getConnection();
   val dtos : VSourceViewColumnSummaryDto= SQL("select * from vSourceViewColumnSummary order by insertedRowDate desc ").as(anorm.Macro.namedParser[VSourceViewColumnSummaryDto].*).head;
   releaseConnection(connection);
   dtos
  }
  def getVSourceViewColumnSummarysByField(fieldName : String, fieldValue : String) : List[VSourceViewColumnSummaryDto] = {
   implicit val connection = getConnection();
   val dtos : List[VSourceViewColumnSummaryDto]= SQL("select * from vSourceViewColumnSummary where " + fieldName + " = {fieldValue} ").on("fieldValue" -> fieldValue).as(anorm.Macro.namedParser[VSourceViewColumnSummaryDto].*);
   releaseConnection(connection);
   dtos
  }
  def getVSourceViewColumnSummaryByGuid(guid : Long) : VSourceViewColumnSummaryDto = {
   implicit val connection = getConnection();
   val dtos : VSourceViewColumnSummaryDto= SQL("select * from vSourceViewColumnSummary where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VSourceViewColumnSummaryDto].single);
   releaseConnection(connection);
   dtos
  }  
 def getDtosBySourceViewColumnId(colValue : Long) : List[VSourceViewColumnSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceViewColumnSummaryDto] = SQL("select * from vSourceViewColumnSummary where sourceViewColumnId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewColumnSummaryDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByGuid(colValue : Long) : List[VSourceViewColumnSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceViewColumnSummaryDto] = SQL("select * from vSourceViewColumnSummary where guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewColumnSummaryDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByInsertedRowDate(colValue : java.util.Date) : List[VSourceViewColumnSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceViewColumnSummaryDto] = SQL("select * from vSourceViewColumnSummary where insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewColumnSummaryDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByLastUpdatedDate(colValue : java.util.Date) : List[VSourceViewColumnSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceViewColumnSummaryDto] = SQL("select * from vSourceViewColumnSummary where lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewColumnSummaryDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceViewId(colValue : Long) : List[VSourceViewColumnSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceViewColumnSummaryDto] = SQL("select * from vSourceViewColumnSummary where sourceViewId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewColumnSummaryDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByColumnName(colValue : String) : List[VSourceViewColumnSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceViewColumnSummaryDto] = SQL("select * from vSourceViewColumnSummary where columnName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewColumnSummaryDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByColumnType(colValue : String) : List[VSourceViewColumnSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceViewColumnSummaryDto] = SQL("select * from vSourceViewColumnSummary where columnType = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewColumnSummaryDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByDownloadTransformColumn_count(colValue : Int) : List[VSourceViewColumnSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceViewColumnSummaryDto] = SQL("select * from vSourceViewColumnSummary where downloadTransformColumn_count = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewColumnSummaryDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByAlgorithmScheduleColumn_count(colValue : Int) : List[VSourceViewColumnSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceViewColumnSummaryDto] = SQL("select * from vSourceViewColumnSummary where algorithmScheduleColumn_count = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewColumnSummaryDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceDownloadStatColumn_count(colValue : Int) : List[VSourceViewColumnSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceViewColumnSummaryDto] = SQL("select * from vSourceViewColumnSummary where sourceDownloadStatColumn_count = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewColumnSummaryDto].*);  
   releaseConnection(connection);  
   dtos  
 }  

} 