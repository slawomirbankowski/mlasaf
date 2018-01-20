/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dao

import anorm.{SQL, SqlParser}
import com.mlasaf.dto._
import java.util.Date


 class VAlgorithmVersionSummaryDao extends DaoBase { 

  def getVAlgorithmVersionSummarysList() : List[VAlgorithmVersionSummaryDto] = {
   implicit val connection = getConnection();
   val dtos : List[VAlgorithmVersionSummaryDto]= SQL("select * from vAlgorithmVersionSummary").as(anorm.Macro.namedParser[VAlgorithmVersionSummaryDto].*);
   releaseConnection(connection);
   dtos
  }
  def getVAlgorithmVersionSummarysCount() : Long = {
   implicit val connection = getConnection();
   val cnt : Long = SQL("select count(*) as cnt from vAlgorithmVersionSummary").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);
   releaseConnection(connection);
   cnt
  }
  def getVAlgorithmVersionSummarysLastInsertDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from vAlgorithmVersionSummary").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);
   releaseConnection(connection);
   ld
  }
  def getVAlgorithmVersionSummarysLastUpdatedDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from vAlgorithmVersionSummary").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);
   releaseConnection(connection);
   ld
  }
  def getVAlgorithmVersionSummaryFirst() : VAlgorithmVersionSummaryDto = {
   implicit val connection = getConnection();
   val dtos : VAlgorithmVersionSummaryDto= SQL("select * from vAlgorithmVersionSummary order by insertedRowDate asc ").as(anorm.Macro.namedParser[VAlgorithmVersionSummaryDto].*).head;
   releaseConnection(connection);
   dtos
  }
  def getVAlgorithmVersionSummaryLast() : VAlgorithmVersionSummaryDto = {
   implicit val connection = getConnection();
   val dtos : VAlgorithmVersionSummaryDto= SQL("select * from vAlgorithmVersionSummary order by insertedRowDate desc ").as(anorm.Macro.namedParser[VAlgorithmVersionSummaryDto].*).head;
   releaseConnection(connection);
   dtos
  }
  def getVAlgorithmVersionSummarysByField(fieldName : String, fieldValue : String) : List[VAlgorithmVersionSummaryDto] = {
   implicit val connection = getConnection();
   val dtos : List[VAlgorithmVersionSummaryDto]= SQL("select * from vAlgorithmVersionSummary where " + fieldName + " = {fieldValue} ").on("fieldValue" -> fieldValue).as(anorm.Macro.namedParser[VAlgorithmVersionSummaryDto].*);
   releaseConnection(connection);
   dtos
  }
  def getVAlgorithmVersionSummaryByGuid(guid : Long) : VAlgorithmVersionSummaryDto = {
   implicit val connection = getConnection();
   val dtos : VAlgorithmVersionSummaryDto= SQL("select * from vAlgorithmVersionSummary where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VAlgorithmVersionSummaryDto].single);
   releaseConnection(connection);
   dtos
  }  
 def getDtosByAlgorithmVersionId(colValue : Long) : List[VAlgorithmVersionSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmVersionSummaryDto] = SQL("select * from vAlgorithmVersionSummary where algorithmVersionId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmVersionSummaryDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByInsertedRowDate(colValue : java.util.Date) : List[VAlgorithmVersionSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmVersionSummaryDto] = SQL("select * from vAlgorithmVersionSummary where insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmVersionSummaryDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByLastUpdatedDate(colValue : java.util.Date) : List[VAlgorithmVersionSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmVersionSummaryDto] = SQL("select * from vAlgorithmVersionSummary where lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmVersionSummaryDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByGuid(colValue : Long) : List[VAlgorithmVersionSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmVersionSummaryDto] = SQL("select * from vAlgorithmVersionSummary where guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmVersionSummaryDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByAlgorithmTypeId(colValue : Long) : List[VAlgorithmVersionSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmVersionSummaryDto] = SQL("select * from vAlgorithmVersionSummary where algorithmTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmVersionSummaryDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByAlgorithmVersionName(colValue : String) : List[VAlgorithmVersionSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmVersionSummaryDto] = SQL("select * from vAlgorithmVersionSummary where algorithmVersionName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmVersionSummaryDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByAlgorithmImplementation_count(colValue : Int) : List[VAlgorithmVersionSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmVersionSummaryDto] = SQL("select * from vAlgorithmVersionSummary where algorithmImplementation_count = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmVersionSummaryDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByAlgorithmVersionParamType_count(colValue : Int) : List[VAlgorithmVersionSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmVersionSummaryDto] = SQL("select * from vAlgorithmVersionSummary where algorithmVersionParamType_count = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmVersionSummaryDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByAlgorithmVersionColumnType_count(colValue : Int) : List[VAlgorithmVersionSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmVersionSummaryDto] = SQL("select * from vAlgorithmVersionSummary where algorithmVersionColumnType_count = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmVersionSummaryDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByAlgorithmVersionOutputType_count(colValue : Int) : List[VAlgorithmVersionSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmVersionSummaryDto] = SQL("select * from vAlgorithmVersionSummary where algorithmVersionOutputType_count = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmVersionSummaryDto].*);  
   releaseConnection(connection);  
   dtos  
 }  

} 
