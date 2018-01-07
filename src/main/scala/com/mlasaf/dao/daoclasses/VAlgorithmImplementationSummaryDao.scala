/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dao

import anorm.{SQL, SqlParser}
import com.mlasaf.dto._
import java.util.Date


 class VAlgorithmImplementationSummaryDao extends DaoBase { 

  def getVAlgorithmImplementationSummarysList() : List[VAlgorithmImplementationSummaryDto] = {
   implicit val connection = getConnection();
   val dtos : List[VAlgorithmImplementationSummaryDto]= SQL("select * from vAlgorithmImplementationSummary").as(anorm.Macro.namedParser[VAlgorithmImplementationSummaryDto].*);
   releaseConnection(connection);
   dtos
  }
  def getVAlgorithmImplementationSummarysCount() : Long = {
   implicit val connection = getConnection();
   val cnt : Long = SQL("select count(*) as cnt from vAlgorithmImplementationSummary").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);
   releaseConnection(connection);
   cnt
  }
  def getVAlgorithmImplementationSummarysLastInsertDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from vAlgorithmImplementationSummary").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);
   releaseConnection(connection);
   ld
  }
  def getVAlgorithmImplementationSummarysLastUpdatedDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from vAlgorithmImplementationSummary").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);
   releaseConnection(connection);
   ld
  }
  def getVAlgorithmImplementationSummaryFirst() : VAlgorithmImplementationSummaryDto = {
   implicit val connection = getConnection();
   val dtos : VAlgorithmImplementationSummaryDto= SQL("select * from vAlgorithmImplementationSummary order by insertedRowDate asc ").as(anorm.Macro.namedParser[VAlgorithmImplementationSummaryDto].*).head;
   releaseConnection(connection);
   dtos
  }
  def getVAlgorithmImplementationSummaryLast() : VAlgorithmImplementationSummaryDto = {
   implicit val connection = getConnection();
   val dtos : VAlgorithmImplementationSummaryDto= SQL("select * from vAlgorithmImplementationSummary order by insertedRowDate desc ").as(anorm.Macro.namedParser[VAlgorithmImplementationSummaryDto].*).head;
   releaseConnection(connection);
   dtos
  }
  def getVAlgorithmImplementationSummarysByField(fieldName : String, fieldValue : String) : List[VAlgorithmImplementationSummaryDto] = {
   implicit val connection = getConnection();
   val dtos : List[VAlgorithmImplementationSummaryDto]= SQL("select * from vAlgorithmImplementationSummary where " + fieldName + " = {fieldValue} ").on("fieldValue" -> fieldValue).as(anorm.Macro.namedParser[VAlgorithmImplementationSummaryDto].*);
   releaseConnection(connection);
   dtos
  }
  def getVAlgorithmImplementationSummaryByGuid(guid : Long) : VAlgorithmImplementationSummaryDto = {
   implicit val connection = getConnection();
   val dtos : VAlgorithmImplementationSummaryDto= SQL("select * from vAlgorithmImplementationSummary where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VAlgorithmImplementationSummaryDto].single);
   releaseConnection(connection);
   dtos
  }  
 def getDtosByAlgorithmImplementationId(colValue : Long) : List[VAlgorithmImplementationSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmImplementationSummaryDto] = SQL("select * from vAlgorithmImplementationSummary where algorithmImplementationId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmImplementationSummaryDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByGuid(colValue : Long) : List[VAlgorithmImplementationSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmImplementationSummaryDto] = SQL("select * from vAlgorithmImplementationSummary where guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmImplementationSummaryDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByInsertedRowDate(colValue : java.util.Date) : List[VAlgorithmImplementationSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmImplementationSummaryDto] = SQL("select * from vAlgorithmImplementationSummary where insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmImplementationSummaryDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByLastUpdatedDate(colValue : java.util.Date) : List[VAlgorithmImplementationSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmImplementationSummaryDto] = SQL("select * from vAlgorithmImplementationSummary where lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmImplementationSummaryDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByAlgorithmTypeId(colValue : Long) : List[VAlgorithmImplementationSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmImplementationSummaryDto] = SQL("select * from vAlgorithmImplementationSummary where algorithmTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmImplementationSummaryDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByAlgorithmVersionId(colValue : Long) : List[VAlgorithmImplementationSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmImplementationSummaryDto] = SQL("select * from vAlgorithmImplementationSummary where algorithmVersionId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmImplementationSummaryDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByExecutorTypeId(colValue : Long) : List[VAlgorithmImplementationSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmImplementationSummaryDto] = SQL("select * from vAlgorithmImplementationSummary where executorTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmImplementationSummaryDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByAlgorithmImplementationName(colValue : String) : List[VAlgorithmImplementationSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmImplementationSummaryDto] = SQL("select * from vAlgorithmImplementationSummary where algorithmImplementationName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmImplementationSummaryDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByAlgorithmImplementationClass(colValue : String) : List[VAlgorithmImplementationSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmImplementationSummaryDto] = SQL("select * from vAlgorithmImplementationSummary where algorithmImplementationClass = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmImplementationSummaryDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByAlgorithmImplementationDescription(colValue : String) : List[VAlgorithmImplementationSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmImplementationSummaryDto] = SQL("select * from vAlgorithmImplementationSummary where algorithmImplementationDescription = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmImplementationSummaryDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByAlgorithmStorageSupport_count(colValue : Int) : List[VAlgorithmImplementationSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmImplementationSummaryDto] = SQL("select * from vAlgorithmImplementationSummary where algorithmStorageSupport_count = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmImplementationSummaryDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByAlgorithmSchedule_count(colValue : Int) : List[VAlgorithmImplementationSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmImplementationSummaryDto] = SQL("select * from vAlgorithmImplementationSummary where algorithmSchedule_count = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmImplementationSummaryDto].*);  
   releaseConnection(connection);  
   dtos  
 }  

} 
