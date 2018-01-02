/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dao

import anorm.{SQL, SqlParser}
import com.mlasaf.dto._
import java.util.Date


 class VAlgorithmImplementationDao extends DaoBase { 

  def getVAlgorithmImplementationsList() : List[VAlgorithmImplementationDto] = {
   implicit val connection = getConnection();
   val dtos : List[VAlgorithmImplementationDto]= SQL("select * from vAlgorithmImplementation").as(anorm.Macro.namedParser[VAlgorithmImplementationDto].*);
   releaseConnection(connection);
   dtos
  }
  def getVAlgorithmImplementationsCount() : Long = {
   implicit val connection = getConnection();
   val cnt : Long = SQL("select count(*) as cnt from vAlgorithmImplementation").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);
   releaseConnection(connection);
   cnt
  }
  def getVAlgorithmImplementationsLastInsertDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from vAlgorithmImplementation").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);
   releaseConnection(connection);
   ld
  }
  def getVAlgorithmImplementationsLastUpdatedDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from vAlgorithmImplementation").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);
   releaseConnection(connection);
   ld
  }
  def getVAlgorithmImplementationFirst() : VAlgorithmImplementationDto = {
   implicit val connection = getConnection();
   val dtos : VAlgorithmImplementationDto= SQL("select * from vAlgorithmImplementation order by insertedRowDate asc ").as(anorm.Macro.namedParser[VAlgorithmImplementationDto].*).head;
   releaseConnection(connection);
   dtos
  }
  def getVAlgorithmImplementationLast() : VAlgorithmImplementationDto = {
   implicit val connection = getConnection();
   val dtos : VAlgorithmImplementationDto= SQL("select * from vAlgorithmImplementation order by insertedRowDate desc ").as(anorm.Macro.namedParser[VAlgorithmImplementationDto].*).head;
   releaseConnection(connection);
   dtos
  }
  def getVAlgorithmImplementationsByField(fieldName : String, fieldValue : String) : List[VAlgorithmImplementationDto] = {
   implicit val connection = getConnection();
   val dtos : List[VAlgorithmImplementationDto]= SQL("select * from vAlgorithmImplementation where " + fieldName + " = {fieldValue} ").on("fieldValue" -> fieldValue).as(anorm.Macro.namedParser[VAlgorithmImplementationDto].*);
   releaseConnection(connection);
   dtos
  }
  def getVAlgorithmImplementationByGuid(guid : Long) : VAlgorithmImplementationDto = {
   implicit val connection = getConnection();
   val dtos : VAlgorithmImplementationDto= SQL("select * from vAlgorithmImplementation where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VAlgorithmImplementationDto].single);
   releaseConnection(connection);
   dtos
  }  
 def getDtosByAlgorithmImplementationId(colValue : Long) : List[VAlgorithmImplementationDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmImplementationDto] = SQL("select * from vAlgorithmImplementation where algorithmImplementationId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmImplementationDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByGuid(colValue : Long) : List[VAlgorithmImplementationDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmImplementationDto] = SQL("select * from vAlgorithmImplementation where guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmImplementationDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByInsertedRowDate(colValue : java.util.Date) : List[VAlgorithmImplementationDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmImplementationDto] = SQL("select * from vAlgorithmImplementation where insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmImplementationDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByLastUpdatedDate(colValue : java.util.Date) : List[VAlgorithmImplementationDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmImplementationDto] = SQL("select * from vAlgorithmImplementation where lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmImplementationDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByAlgorithmTypeVersionId(colValue : Long) : List[VAlgorithmImplementationDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmImplementationDto] = SQL("select * from vAlgorithmImplementation where algorithmTypeVersionId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmImplementationDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByExecutorTypeId(colValue : Long) : List[VAlgorithmImplementationDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmImplementationDto] = SQL("select * from vAlgorithmImplementation where executorTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmImplementationDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByAlgorithmImplementationName(colValue : String) : List[VAlgorithmImplementationDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmImplementationDto] = SQL("select * from vAlgorithmImplementation where algorithmImplementationName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmImplementationDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByAlgorithmImplementationClass(colValue : String) : List[VAlgorithmImplementationDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmImplementationDto] = SQL("select * from vAlgorithmImplementation where algorithmImplementationClass = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmImplementationDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByAlgorithmTypeVersion_algorithmTypeVersionId(colValue : Long) : List[VAlgorithmImplementationDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmImplementationDto] = SQL("select * from vAlgorithmImplementation where algorithmTypeVersion_algorithmTypeVersionId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmImplementationDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByAlgorithmTypeVersion_insertedRowDate(colValue : java.util.Date) : List[VAlgorithmImplementationDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmImplementationDto] = SQL("select * from vAlgorithmImplementation where algorithmTypeVersion_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmImplementationDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByAlgorithmTypeVersion_lastUpdatedDate(colValue : java.util.Date) : List[VAlgorithmImplementationDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmImplementationDto] = SQL("select * from vAlgorithmImplementation where algorithmTypeVersion_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmImplementationDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByAlgorithmTypeVersion_guid(colValue : Long) : List[VAlgorithmImplementationDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmImplementationDto] = SQL("select * from vAlgorithmImplementation where algorithmTypeVersion_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmImplementationDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByAlgorithmTypeVersion_algorithmTypeId(colValue : Long) : List[VAlgorithmImplementationDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmImplementationDto] = SQL("select * from vAlgorithmImplementation where algorithmTypeVersion_algorithmTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmImplementationDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByAlgorithmTypeVersion_algorithmTypeVersionName(colValue : String) : List[VAlgorithmImplementationDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmImplementationDto] = SQL("select * from vAlgorithmImplementation where algorithmTypeVersion_algorithmTypeVersionName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmImplementationDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByExecutorType_executorTypeId(colValue : Long) : List[VAlgorithmImplementationDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmImplementationDto] = SQL("select * from vAlgorithmImplementation where executorType_executorTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmImplementationDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByExecutorType_guid(colValue : Long) : List[VAlgorithmImplementationDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmImplementationDto] = SQL("select * from vAlgorithmImplementation where executorType_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmImplementationDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByExecutorType_insertedRowDate(colValue : java.util.Date) : List[VAlgorithmImplementationDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmImplementationDto] = SQL("select * from vAlgorithmImplementation where executorType_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmImplementationDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByExecutorType_lastUpdatedDate(colValue : java.util.Date) : List[VAlgorithmImplementationDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmImplementationDto] = SQL("select * from vAlgorithmImplementation where executorType_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmImplementationDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByExecutorType_executorTypeName(colValue : String) : List[VAlgorithmImplementationDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmImplementationDto] = SQL("select * from vAlgorithmImplementation where executorType_executorTypeName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmImplementationDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByExecutorType_executorTypeClass(colValue : String) : List[VAlgorithmImplementationDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmImplementationDto] = SQL("select * from vAlgorithmImplementation where executorType_executorTypeClass = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmImplementationDto].*);  
   releaseConnection(connection);  
   dtos  
 }  

} 