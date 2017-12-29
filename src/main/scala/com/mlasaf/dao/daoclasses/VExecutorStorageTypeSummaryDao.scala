/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dao

import anorm.{SQL, SqlParser}
import com.mlasaf.dto._
import java.util.Date


 class VExecutorStorageTypeSummaryDao extends DaoBase { 

  def getVExecutorStorageTypeSummarysList() : List[VExecutorStorageTypeSummaryDto] = {
   implicit val connection = getConnection();
   val dtos : List[VExecutorStorageTypeSummaryDto]= SQL("select * from vExecutorStorageTypeSummary").as(anorm.Macro.namedParser[VExecutorStorageTypeSummaryDto].*);
   dtos
  }
  def getVExecutorStorageTypeSummarysCount() : Long = {
   implicit val connection = getConnection();
   val cnt : Long = SQL("select count(*) as cnt from vExecutorStorageTypeSummary").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
   cnt
  }
  def getVExecutorStorageTypeSummarysLastInsertDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from vExecutorStorageTypeSummary").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
   ld
  }
  def getVExecutorStorageTypeSummarysLastUpdatedDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from vExecutorStorageTypeSummary").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
   ld
  }
  def getVExecutorStorageTypeSummaryFirst() : VExecutorStorageTypeSummaryDto = {
   implicit val connection = getConnection();
   val dtos : VExecutorStorageTypeSummaryDto= SQL("select * from vExecutorStorageTypeSummary order by insertedRowDate asc ").as(anorm.Macro.namedParser[VExecutorStorageTypeSummaryDto].*).head;
   dtos
  }
  def getVExecutorStorageTypeSummaryLast() : VExecutorStorageTypeSummaryDto = {
   implicit val connection = getConnection();
   val dtos : VExecutorStorageTypeSummaryDto= SQL("select * from vExecutorStorageTypeSummary order by insertedRowDate desc ").as(anorm.Macro.namedParser[VExecutorStorageTypeSummaryDto].*).head;
   dtos
  }
  def getVExecutorStorageTypeSummaryByGuid(guid : Long) : VExecutorStorageTypeSummaryDto = {
   implicit val connection = getConnection();
   val dtos : VExecutorStorageTypeSummaryDto= SQL("select * from vExecutorStorageTypeSummary where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VExecutorStorageTypeSummaryDto].single);
   dtos
  }  
 def getDtosByExecutorStorageTypeId(colValue : Long) : List[VExecutorStorageTypeSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorStorageTypeSummaryDto] = SQL("select * from vExecutorStorageTypeSummary where executorStorageTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageTypeSummaryDto].*);  
   dtos  
 }  
 def getDtosByGuid(colValue : Long) : List[VExecutorStorageTypeSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorStorageTypeSummaryDto] = SQL("select * from vExecutorStorageTypeSummary where guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageTypeSummaryDto].*);  
   dtos  
 }  
 def getDtosByInsertedRowDate(colValue : java.util.Date) : List[VExecutorStorageTypeSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorStorageTypeSummaryDto] = SQL("select * from vExecutorStorageTypeSummary where insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageTypeSummaryDto].*);  
   dtos  
 }  
 def getDtosByLastUpdatedDate(colValue : java.util.Date) : List[VExecutorStorageTypeSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorStorageTypeSummaryDto] = SQL("select * from vExecutorStorageTypeSummary where lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageTypeSummaryDto].*);  
   dtos  
 }  
 def getDtosByExecutorStorageTypeName(colValue : String) : List[VExecutorStorageTypeSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorStorageTypeSummaryDto] = SQL("select * from vExecutorStorageTypeSummary where executorStorageTypeName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageTypeSummaryDto].*);  
   dtos  
 }  
 def getDtosByExecutorStorageTypeClass(colValue : String) : List[VExecutorStorageTypeSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorStorageTypeSummaryDto] = SQL("select * from vExecutorStorageTypeSummary where executorStorageTypeClass = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageTypeSummaryDto].*);  
   dtos  
 }  
 def getDtosByExecutorStorage_count(colValue : Int) : List[VExecutorStorageTypeSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorStorageTypeSummaryDto] = SQL("select * from vExecutorStorageTypeSummary where executorStorage_count = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageTypeSummaryDto].*);  
   dtos  
 }  
 def getDtosByAlgorithmStorageSupport_count(colValue : Int) : List[VExecutorStorageTypeSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorStorageTypeSummaryDto] = SQL("select * from vExecutorStorageTypeSummary where algorithmStorageSupport_count = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageTypeSummaryDto].*);  
   dtos  
 }  

} 
