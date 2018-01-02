/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dao

import anorm.{SQL, SqlParser}
import com.mlasaf.dto._
import java.util.Date


 class VSourceParamValueDao extends DaoBase { 

  def getVSourceParamValuesList() : List[VSourceParamValueDto] = {
   implicit val connection = getConnection();
   val dtos : List[VSourceParamValueDto]= SQL("select * from vSourceParamValue").as(anorm.Macro.namedParser[VSourceParamValueDto].*);
   releaseConnection(connection);
   dtos
  }
  def getVSourceParamValuesCount() : Long = {
   implicit val connection = getConnection();
   val cnt : Long = SQL("select count(*) as cnt from vSourceParamValue").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);
   releaseConnection(connection);
   cnt
  }
  def getVSourceParamValuesLastInsertDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from vSourceParamValue").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);
   releaseConnection(connection);
   ld
  }
  def getVSourceParamValuesLastUpdatedDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from vSourceParamValue").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);
   releaseConnection(connection);
   ld
  }
  def getVSourceParamValueFirst() : VSourceParamValueDto = {
   implicit val connection = getConnection();
   val dtos : VSourceParamValueDto= SQL("select * from vSourceParamValue order by insertedRowDate asc ").as(anorm.Macro.namedParser[VSourceParamValueDto].*).head;
   releaseConnection(connection);
   dtos
  }
  def getVSourceParamValueLast() : VSourceParamValueDto = {
   implicit val connection = getConnection();
   val dtos : VSourceParamValueDto= SQL("select * from vSourceParamValue order by insertedRowDate desc ").as(anorm.Macro.namedParser[VSourceParamValueDto].*).head;
   releaseConnection(connection);
   dtos
  }
  def getVSourceParamValuesByField(fieldName : String, fieldValue : String) : List[VSourceParamValueDto] = {
   implicit val connection = getConnection();
   val dtos : List[VSourceParamValueDto]= SQL("select * from vSourceParamValue where " + fieldName + " = {fieldValue} ").on("fieldValue" -> fieldValue).as(anorm.Macro.namedParser[VSourceParamValueDto].*);
   releaseConnection(connection);
   dtos
  }
  def getVSourceParamValueByGuid(guid : Long) : VSourceParamValueDto = {
   implicit val connection = getConnection();
   val dtos : VSourceParamValueDto= SQL("select * from vSourceParamValue where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VSourceParamValueDto].single);
   releaseConnection(connection);
   dtos
  }  
 def getDtosBySourceParamValueId(colValue : Long) : List[VSourceParamValueDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceParamValueDto] = SQL("select * from vSourceParamValue where sourceParamValueId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceParamValueDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByGuid(colValue : Long) : List[VSourceParamValueDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceParamValueDto] = SQL("select * from vSourceParamValue where guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceParamValueDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByInsertedRowDate(colValue : java.util.Date) : List[VSourceParamValueDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceParamValueDto] = SQL("select * from vSourceParamValue where insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceParamValueDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByLastUpdatedDate(colValue : java.util.Date) : List[VSourceParamValueDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceParamValueDto] = SQL("select * from vSourceParamValue where lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceParamValueDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceInstanceId(colValue : Long) : List[VSourceParamValueDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceParamValueDto] = SQL("select * from vSourceParamValue where sourceInstanceId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceParamValueDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceParamId(colValue : Long) : List[VSourceParamValueDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceParamValueDto] = SQL("select * from vSourceParamValue where sourceParamId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceParamValueDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceParamValueVersion(colValue : String) : List[VSourceParamValueDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceParamValueDto] = SQL("select * from vSourceParamValue where sourceParamValueVersion = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceParamValueDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByParamValue(colValue : String) : List[VSourceParamValueDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceParamValueDto] = SQL("select * from vSourceParamValue where paramValue = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceParamValueDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceInstance_sourceInstanceId(colValue : Long) : List[VSourceParamValueDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceParamValueDto] = SQL("select * from vSourceParamValue where sourceInstance_sourceInstanceId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceParamValueDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceInstance_guid(colValue : Long) : List[VSourceParamValueDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceParamValueDto] = SQL("select * from vSourceParamValue where sourceInstance_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceParamValueDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceInstance_insertedRowDate(colValue : java.util.Date) : List[VSourceParamValueDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceParamValueDto] = SQL("select * from vSourceParamValue where sourceInstance_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceParamValueDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceInstance_lastUpdatedDate(colValue : java.util.Date) : List[VSourceParamValueDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceParamValueDto] = SQL("select * from vSourceParamValue where sourceInstance_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceParamValueDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceInstance_sourceTypeId(colValue : Long) : List[VSourceParamValueDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceParamValueDto] = SQL("select * from vSourceParamValue where sourceInstance_sourceTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceParamValueDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceInstance_sourceInstanceName(colValue : String) : List[VSourceParamValueDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceParamValueDto] = SQL("select * from vSourceParamValue where sourceInstance_sourceInstanceName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceParamValueDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceInstance_errorCount(colValue : Long) : List[VSourceParamValueDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceParamValueDto] = SQL("select * from vSourceParamValue where sourceInstance_errorCount = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceParamValueDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceInstance_correctCount(colValue : Long) : List[VSourceParamValueDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceParamValueDto] = SQL("select * from vSourceParamValue where sourceInstance_correctCount = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceParamValueDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceInstance_lastStatus(colValue : String) : List[VSourceParamValueDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceParamValueDto] = SQL("select * from vSourceParamValue where sourceInstance_lastStatus = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceParamValueDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceInstance_lastConnectionDate(colValue : java.util.Date) : List[VSourceParamValueDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceParamValueDto] = SQL("select * from vSourceParamValue where sourceInstance_lastConnectionDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceParamValueDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceParam_sourceParamId(colValue : Long) : List[VSourceParamValueDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceParamValueDto] = SQL("select * from vSourceParamValue where sourceParam_sourceParamId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceParamValueDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceParam_guid(colValue : Long) : List[VSourceParamValueDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceParamValueDto] = SQL("select * from vSourceParamValue where sourceParam_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceParamValueDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceParam_insertedRowDate(colValue : java.util.Date) : List[VSourceParamValueDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceParamValueDto] = SQL("select * from vSourceParamValue where sourceParam_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceParamValueDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceParam_lastUpdatedDate(colValue : java.util.Date) : List[VSourceParamValueDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceParamValueDto] = SQL("select * from vSourceParamValue where sourceParam_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceParamValueDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceParam_sourceParamName(colValue : String) : List[VSourceParamValueDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceParamValueDto] = SQL("select * from vSourceParamValue where sourceParam_sourceParamName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceParamValueDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceParam_sourceParamType(colValue : String) : List[VSourceParamValueDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceParamValueDto] = SQL("select * from vSourceParamValue where sourceParam_sourceParamType = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceParamValueDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySourceParam_possibleValues(colValue : String) : List[VSourceParamValueDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceParamValueDto] = SQL("select * from vSourceParamValue where sourceParam_possibleValues = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceParamValueDto].*);  
   releaseConnection(connection);  
   dtos  
 }  

} 
