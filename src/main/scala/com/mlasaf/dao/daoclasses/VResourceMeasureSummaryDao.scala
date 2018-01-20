/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dao

import anorm.{SQL, SqlParser}
import com.mlasaf.dto._
import java.util.Date


 class VResourceMeasureSummaryDao extends DaoBase { 

  def getVResourceMeasureSummarysList() : List[VResourceMeasureSummaryDto] = {
   implicit val connection = getConnection();
   val dtos : List[VResourceMeasureSummaryDto]= SQL("select * from vResourceMeasureSummary").as(anorm.Macro.namedParser[VResourceMeasureSummaryDto].*);
   releaseConnection(connection);
   dtos
  }
  def getVResourceMeasureSummarysCount() : Long = {
   implicit val connection = getConnection();
   val cnt : Long = SQL("select count(*) as cnt from vResourceMeasureSummary").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);
   releaseConnection(connection);
   cnt
  }
  def getVResourceMeasureSummarysLastInsertDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from vResourceMeasureSummary").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);
   releaseConnection(connection);
   ld
  }
  def getVResourceMeasureSummarysLastUpdatedDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from vResourceMeasureSummary").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);
   releaseConnection(connection);
   ld
  }
  def getVResourceMeasureSummaryFirst() : VResourceMeasureSummaryDto = {
   implicit val connection = getConnection();
   val dtos : VResourceMeasureSummaryDto= SQL("select * from vResourceMeasureSummary order by insertedRowDate asc ").as(anorm.Macro.namedParser[VResourceMeasureSummaryDto].*).head;
   releaseConnection(connection);
   dtos
  }
  def getVResourceMeasureSummaryLast() : VResourceMeasureSummaryDto = {
   implicit val connection = getConnection();
   val dtos : VResourceMeasureSummaryDto= SQL("select * from vResourceMeasureSummary order by insertedRowDate desc ").as(anorm.Macro.namedParser[VResourceMeasureSummaryDto].*).head;
   releaseConnection(connection);
   dtos
  }
  def getVResourceMeasureSummarysByField(fieldName : String, fieldValue : String) : List[VResourceMeasureSummaryDto] = {
   implicit val connection = getConnection();
   val dtos : List[VResourceMeasureSummaryDto]= SQL("select * from vResourceMeasureSummary where " + fieldName + " = {fieldValue} ").on("fieldValue" -> fieldValue).as(anorm.Macro.namedParser[VResourceMeasureSummaryDto].*);
   releaseConnection(connection);
   dtos
  }
  def getVResourceMeasureSummaryByGuid(guid : Long) : VResourceMeasureSummaryDto = {
   implicit val connection = getConnection();
   val dtos : VResourceMeasureSummaryDto= SQL("select * from vResourceMeasureSummary where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VResourceMeasureSummaryDto].single);
   releaseConnection(connection);
   dtos
  }  
 def getDtosByResourceMeasureId(colValue : Long) : List[VResourceMeasureSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VResourceMeasureSummaryDto] = SQL("select * from vResourceMeasureSummary where resourceMeasureId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VResourceMeasureSummaryDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByGuid(colValue : Long) : List[VResourceMeasureSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VResourceMeasureSummaryDto] = SQL("select * from vResourceMeasureSummary where guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VResourceMeasureSummaryDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByInsertedRowDate(colValue : java.util.Date) : List[VResourceMeasureSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VResourceMeasureSummaryDto] = SQL("select * from vResourceMeasureSummary where insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VResourceMeasureSummaryDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByLastUpdatedDate(colValue : java.util.Date) : List[VResourceMeasureSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VResourceMeasureSummaryDto] = SQL("select * from vResourceMeasureSummary where lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VResourceMeasureSummaryDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByResourceMeasureName(colValue : String) : List[VResourceMeasureSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VResourceMeasureSummaryDto] = SQL("select * from vResourceMeasureSummary where resourceMeasureName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VResourceMeasureSummaryDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByResourceMeasureClass(colValue : String) : List[VResourceMeasureSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VResourceMeasureSummaryDto] = SQL("select * from vResourceMeasureSummary where resourceMeasureClass = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VResourceMeasureSummaryDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByResourceManagerMeasure_count(colValue : Int) : List[VResourceMeasureSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VResourceMeasureSummaryDto] = SQL("select * from vResourceMeasureSummary where resourceManagerMeasure_count = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VResourceMeasureSummaryDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByResourceManagerAllocation_count(colValue : Int) : List[VResourceMeasureSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VResourceMeasureSummaryDto] = SQL("select * from vResourceMeasureSummary where resourceManagerAllocation_count = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VResourceMeasureSummaryDto].*);  
   releaseConnection(connection);  
   dtos  
 }  

} 
