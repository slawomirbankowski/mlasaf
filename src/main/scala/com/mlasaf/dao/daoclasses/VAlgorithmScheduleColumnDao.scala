/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dao

import anorm.{SQL, SqlParser}
import com.mlasaf.dto._
import java.util.Date


 class VAlgorithmScheduleColumnDao extends DaoBase { 

  def getVAlgorithmScheduleColumnsList() : List[VAlgorithmScheduleColumnDto] = {
   implicit val connection = getConnection();
   val dtos : List[VAlgorithmScheduleColumnDto]= SQL("select * from vAlgorithmScheduleColumn").as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);
   releaseConnection(connection);
   dtos
  }
  def getVAlgorithmScheduleColumnsCount() : Long = {
   implicit val connection = getConnection();
   val cnt : Long = SQL("select count(*) as cnt from vAlgorithmScheduleColumn").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);
   releaseConnection(connection);
   cnt
  }
  def getVAlgorithmScheduleColumnsLastInsertDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from vAlgorithmScheduleColumn").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);
   releaseConnection(connection);
   ld
  }
  def getVAlgorithmScheduleColumnsLastUpdatedDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from vAlgorithmScheduleColumn").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);
   releaseConnection(connection);
   ld
  }
  def getVAlgorithmScheduleColumnFirst() : VAlgorithmScheduleColumnDto = {
   implicit val connection = getConnection();
   val dtos : VAlgorithmScheduleColumnDto= SQL("select * from vAlgorithmScheduleColumn order by insertedRowDate asc ").as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*).head;
   releaseConnection(connection);
   dtos
  }
  def getVAlgorithmScheduleColumnLast() : VAlgorithmScheduleColumnDto = {
   implicit val connection = getConnection();
   val dtos : VAlgorithmScheduleColumnDto= SQL("select * from vAlgorithmScheduleColumn order by insertedRowDate desc ").as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*).head;
   releaseConnection(connection);
   dtos
  }
  def getVAlgorithmScheduleColumnsByField(fieldName : String, fieldValue : String) : List[VAlgorithmScheduleColumnDto] = {
   implicit val connection = getConnection();
   val dtos : List[VAlgorithmScheduleColumnDto]= SQL("select * from vAlgorithmScheduleColumn where " + fieldName + " = {fieldValue} ").on("fieldValue" -> fieldValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);
   releaseConnection(connection);
   dtos
  }
  def getVAlgorithmScheduleColumnByGuid(guid : Long) : VAlgorithmScheduleColumnDto = {
   implicit val connection = getConnection();
   val dtos : VAlgorithmScheduleColumnDto= SQL("select * from vAlgorithmScheduleColumn where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].single);
   releaseConnection(connection);
   dtos
  }  
 def getDtosByAlgorithmScheduleColumnId(colValue : Long) : List[VAlgorithmScheduleColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where algorithmScheduleColumnId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByGuid(colValue : Long) : List[VAlgorithmScheduleColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByInsertedRowDate(colValue : java.util.Date) : List[VAlgorithmScheduleColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByLastUpdatedDate(colValue : java.util.Date) : List[VAlgorithmScheduleColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByAlgorithmScheduleId(colValue : Long) : List[VAlgorithmScheduleColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where algorithmScheduleId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByAlgorithmColumnTypeId(colValue : Long) : List[VAlgorithmScheduleColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where algorithmColumnTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByAlgorithmScheduleViewId(colValue : Long) : List[VAlgorithmScheduleColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where algorithmScheduleViewId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceViewId(colValue : Long) : List[VAlgorithmScheduleColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where sourceViewId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceViewColumnId(colValue : Long) : List[VAlgorithmScheduleColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where sourceViewColumnId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByExtendedProperties(colValue : String) : List[VAlgorithmScheduleColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where extendedProperties = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByAlgorithmColumnType_algorithmColumnTypeId(colValue : Long) : List[VAlgorithmScheduleColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where algorithmColumnType_algorithmColumnTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByAlgorithmColumnType_guid(colValue : Long) : List[VAlgorithmScheduleColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where algorithmColumnType_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByAlgorithmColumnType_insertedRowDate(colValue : java.util.Date) : List[VAlgorithmScheduleColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where algorithmColumnType_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByAlgorithmColumnType_lastUpdatedDate(colValue : java.util.Date) : List[VAlgorithmScheduleColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where algorithmColumnType_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByAlgorithmColumnType_algorithmColumnTypeName(colValue : String) : List[VAlgorithmScheduleColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where algorithmColumnType_algorithmColumnTypeName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByAlgorithmColumnType_algorithmColumnTypeDescription(colValue : String) : List[VAlgorithmScheduleColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where algorithmColumnType_algorithmColumnTypeDescription = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByAlgorithmColumnType_verificationClassName(colValue : String) : List[VAlgorithmScheduleColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where algorithmColumnType_verificationClassName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByAlgorithmColumnType_verificationDefinition(colValue : String) : List[VAlgorithmScheduleColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where algorithmColumnType_verificationDefinition = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByAlgorithmSchedule_algorithmScheduleId(colValue : Long) : List[VAlgorithmScheduleColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where algorithmSchedule_algorithmScheduleId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByAlgorithmSchedule_guid(colValue : Long) : List[VAlgorithmScheduleColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where algorithmSchedule_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByAlgorithmSchedule_insertedRowDate(colValue : java.util.Date) : List[VAlgorithmScheduleColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where algorithmSchedule_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByAlgorithmSchedule_lastUpdatedDate(colValue : java.util.Date) : List[VAlgorithmScheduleColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where algorithmSchedule_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByAlgorithmSchedule_algorithmImplementationId(colValue : Long) : List[VAlgorithmScheduleColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where algorithmSchedule_algorithmImplementationId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByAlgorithmSchedule_algorithmScheduleTypeId(colValue : Long) : List[VAlgorithmScheduleColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where algorithmSchedule_algorithmScheduleTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByAlgorithmSchedule_algorithmScheduleName(colValue : String) : List[VAlgorithmScheduleColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where algorithmSchedule_algorithmScheduleName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByAlgorithmSchedule_isScheduled(colValue : Int) : List[VAlgorithmScheduleColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where algorithmSchedule_isScheduled = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByAlgorithmSchedule_intervalValue(colValue : Long) : List[VAlgorithmScheduleColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where algorithmSchedule_intervalValue = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByAlgorithmSchedule_isRunning(colValue : Int) : List[VAlgorithmScheduleColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where algorithmSchedule_isRunning = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByAlgorithmScheduleView_algorithmScheduleViewId(colValue : Long) : List[VAlgorithmScheduleColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where algorithmScheduleView_algorithmScheduleViewId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByAlgorithmScheduleView_guid(colValue : Long) : List[VAlgorithmScheduleColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where algorithmScheduleView_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByAlgorithmScheduleView_insertedRowDate(colValue : java.util.Date) : List[VAlgorithmScheduleColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where algorithmScheduleView_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByAlgorithmScheduleView_lastUpdatedDate(colValue : java.util.Date) : List[VAlgorithmScheduleColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where algorithmScheduleView_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByAlgorithmScheduleView_algorithmScheduleViewTypeId(colValue : Long) : List[VAlgorithmScheduleColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where algorithmScheduleView_algorithmScheduleViewTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByAlgorithmScheduleView_algorithmScheduleId(colValue : Long) : List[VAlgorithmScheduleColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where algorithmScheduleView_algorithmScheduleId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByAlgorithmScheduleView_sourceViewId(colValue : Long) : List[VAlgorithmScheduleColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where algorithmScheduleView_sourceViewId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByAlgorithmScheduleView_joinOnDefinition(colValue : String) : List[VAlgorithmScheduleColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where algorithmScheduleView_joinOnDefinition = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceView_sourceViewId(colValue : Long) : List[VAlgorithmScheduleColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where sourceView_sourceViewId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceView_guid(colValue : Long) : List[VAlgorithmScheduleColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where sourceView_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceView_insertedRowDate(colValue : java.util.Date) : List[VAlgorithmScheduleColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where sourceView_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceView_lastUpdatedDate(colValue : java.util.Date) : List[VAlgorithmScheduleColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where sourceView_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceView_sourceInstanceId(colValue : Long) : List[VAlgorithmScheduleColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where sourceView_sourceInstanceId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceView_sourceViewTypeId(colValue : Long) : List[VAlgorithmScheduleColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where sourceView_sourceViewTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceView_sourceViewFormatId(colValue : Long) : List[VAlgorithmScheduleColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where sourceView_sourceViewFormatId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceView_sourceViewName(colValue : String) : List[VAlgorithmScheduleColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where sourceView_sourceViewName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceView_sourceViewDefinition(colValue : String) : List[VAlgorithmScheduleColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where sourceView_sourceViewDefinition = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceView_isExisting(colValue : Int) : List[VAlgorithmScheduleColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where sourceView_isExisting = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceView_isCustom(colValue : Int) : List[VAlgorithmScheduleColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where sourceView_isCustom = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceViewColumn_sourceViewColumnId(colValue : Long) : List[VAlgorithmScheduleColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where sourceViewColumn_sourceViewColumnId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceViewColumn_guid(colValue : Long) : List[VAlgorithmScheduleColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where sourceViewColumn_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceViewColumn_insertedRowDate(colValue : java.util.Date) : List[VAlgorithmScheduleColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where sourceViewColumn_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceViewColumn_lastUpdatedDate(colValue : java.util.Date) : List[VAlgorithmScheduleColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where sourceViewColumn_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceViewColumn_sourceViewId(colValue : Long) : List[VAlgorithmScheduleColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where sourceViewColumn_sourceViewId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceViewColumn_columnName(colValue : String) : List[VAlgorithmScheduleColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where sourceViewColumn_columnName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceViewColumn_columnType(colValue : String) : List[VAlgorithmScheduleColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where sourceViewColumn_columnType = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  

} 
