/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dao

import anorm.{SQL, SqlParser}
import com.mlasaf.dto._
import java.util.Date


 class VAlgorithmStorageSupportDao extends DaoBase { 

  def getVAlgorithmStorageSupportsList() : List[VAlgorithmStorageSupportDto] = {
   implicit val connection = getConnection();
   val dtos : List[VAlgorithmStorageSupportDto]= SQL("select * from vAlgorithmStorageSupport").as(anorm.Macro.namedParser[VAlgorithmStorageSupportDto].*);
   releaseConnection(connection);
   dtos
  }
  def getVAlgorithmStorageSupportsCount() : Long = {
   implicit val connection = getConnection();
   val cnt : Long = SQL("select count(*) as cnt from vAlgorithmStorageSupport").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);
   releaseConnection(connection);
   cnt
  }
  def getVAlgorithmStorageSupportsLastInsertDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from vAlgorithmStorageSupport").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);
   releaseConnection(connection);
   ld
  }
  def getVAlgorithmStorageSupportsLastUpdatedDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from vAlgorithmStorageSupport").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);
   releaseConnection(connection);
   ld
  }
  def getVAlgorithmStorageSupportFirst() : VAlgorithmStorageSupportDto = {
   implicit val connection = getConnection();
   val dtos : VAlgorithmStorageSupportDto= SQL("select * from vAlgorithmStorageSupport order by insertedRowDate asc ").as(anorm.Macro.namedParser[VAlgorithmStorageSupportDto].*).head;
   releaseConnection(connection);
   dtos
  }
  def getVAlgorithmStorageSupportLast() : VAlgorithmStorageSupportDto = {
   implicit val connection = getConnection();
   val dtos : VAlgorithmStorageSupportDto= SQL("select * from vAlgorithmStorageSupport order by insertedRowDate desc ").as(anorm.Macro.namedParser[VAlgorithmStorageSupportDto].*).head;
   releaseConnection(connection);
   dtos
  }
  def getVAlgorithmStorageSupportsByField(fieldName : String, fieldValue : String) : List[VAlgorithmStorageSupportDto] = {
   implicit val connection = getConnection();
   val dtos : List[VAlgorithmStorageSupportDto]= SQL("select * from vAlgorithmStorageSupport where " + fieldName + " = {fieldValue} ").on("fieldValue" -> fieldValue).as(anorm.Macro.namedParser[VAlgorithmStorageSupportDto].*);
   releaseConnection(connection);
   dtos
  }
  def getVAlgorithmStorageSupportByGuid(guid : Long) : VAlgorithmStorageSupportDto = {
   implicit val connection = getConnection();
   val dtos : VAlgorithmStorageSupportDto= SQL("select * from vAlgorithmStorageSupport where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VAlgorithmStorageSupportDto].single);
   releaseConnection(connection);
   dtos
  }  
 def getDtosByAlgorithmStorageSupportId(colValue : Long) : List[VAlgorithmStorageSupportDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmStorageSupportDto] = SQL("select * from vAlgorithmStorageSupport where algorithmStorageSupportId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmStorageSupportDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByGuid(colValue : Long) : List[VAlgorithmStorageSupportDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmStorageSupportDto] = SQL("select * from vAlgorithmStorageSupport where guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmStorageSupportDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByInsertedRowDate(colValue : java.util.Date) : List[VAlgorithmStorageSupportDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmStorageSupportDto] = SQL("select * from vAlgorithmStorageSupport where insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmStorageSupportDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByLastUpdatedDate(colValue : java.util.Date) : List[VAlgorithmStorageSupportDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmStorageSupportDto] = SQL("select * from vAlgorithmStorageSupport where lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmStorageSupportDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByAlgorithmImplementationId(colValue : Long) : List[VAlgorithmStorageSupportDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmStorageSupportDto] = SQL("select * from vAlgorithmStorageSupport where algorithmImplementationId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmStorageSupportDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByExecutorStorageTypeId(colValue : Long) : List[VAlgorithmStorageSupportDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmStorageSupportDto] = SQL("select * from vAlgorithmStorageSupport where executorStorageTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmStorageSupportDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosBySupportPriority(colValue : Int) : List[VAlgorithmStorageSupportDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmStorageSupportDto] = SQL("select * from vAlgorithmStorageSupport where supportPriority = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmStorageSupportDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByAlgorithmImplementation_algorithmImplementationId(colValue : Long) : List[VAlgorithmStorageSupportDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmStorageSupportDto] = SQL("select * from vAlgorithmStorageSupport where algorithmImplementation_algorithmImplementationId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmStorageSupportDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByAlgorithmImplementation_guid(colValue : Long) : List[VAlgorithmStorageSupportDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmStorageSupportDto] = SQL("select * from vAlgorithmStorageSupport where algorithmImplementation_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmStorageSupportDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByAlgorithmImplementation_insertedRowDate(colValue : java.util.Date) : List[VAlgorithmStorageSupportDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmStorageSupportDto] = SQL("select * from vAlgorithmStorageSupport where algorithmImplementation_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmStorageSupportDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByAlgorithmImplementation_lastUpdatedDate(colValue : java.util.Date) : List[VAlgorithmStorageSupportDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmStorageSupportDto] = SQL("select * from vAlgorithmStorageSupport where algorithmImplementation_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmStorageSupportDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByAlgorithmImplementation_algorithmTypeVersionId(colValue : Long) : List[VAlgorithmStorageSupportDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmStorageSupportDto] = SQL("select * from vAlgorithmStorageSupport where algorithmImplementation_algorithmTypeVersionId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmStorageSupportDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByAlgorithmImplementation_executorTypeId(colValue : Long) : List[VAlgorithmStorageSupportDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmStorageSupportDto] = SQL("select * from vAlgorithmStorageSupport where algorithmImplementation_executorTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmStorageSupportDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByAlgorithmImplementation_algorithmImplementationName(colValue : String) : List[VAlgorithmStorageSupportDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmStorageSupportDto] = SQL("select * from vAlgorithmStorageSupport where algorithmImplementation_algorithmImplementationName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmStorageSupportDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByAlgorithmImplementation_algorithmImplementationClass(colValue : String) : List[VAlgorithmStorageSupportDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmStorageSupportDto] = SQL("select * from vAlgorithmStorageSupport where algorithmImplementation_algorithmImplementationClass = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmStorageSupportDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByExecutorStorageType_executorStorageTypeId(colValue : Long) : List[VAlgorithmStorageSupportDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmStorageSupportDto] = SQL("select * from vAlgorithmStorageSupport where executorStorageType_executorStorageTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmStorageSupportDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByExecutorStorageType_guid(colValue : Long) : List[VAlgorithmStorageSupportDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmStorageSupportDto] = SQL("select * from vAlgorithmStorageSupport where executorStorageType_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmStorageSupportDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByExecutorStorageType_insertedRowDate(colValue : java.util.Date) : List[VAlgorithmStorageSupportDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmStorageSupportDto] = SQL("select * from vAlgorithmStorageSupport where executorStorageType_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmStorageSupportDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByExecutorStorageType_lastUpdatedDate(colValue : java.util.Date) : List[VAlgorithmStorageSupportDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmStorageSupportDto] = SQL("select * from vAlgorithmStorageSupport where executorStorageType_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmStorageSupportDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByExecutorStorageType_executorStorageTypeName(colValue : String) : List[VAlgorithmStorageSupportDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmStorageSupportDto] = SQL("select * from vAlgorithmStorageSupport where executorStorageType_executorStorageTypeName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmStorageSupportDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByExecutorStorageType_executorStorageTypeClass(colValue : String) : List[VAlgorithmStorageSupportDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmStorageSupportDto] = SQL("select * from vAlgorithmStorageSupport where executorStorageType_executorStorageTypeClass = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmStorageSupportDto].*);  
   releaseConnection(connection);  
   dtos  
 }  

} 
