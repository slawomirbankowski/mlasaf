/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dao

import anorm.{SQL, SqlParser}
import com.mlasaf.dto._
import java.util.Date


 class VExecutorInstanceSummaryDao extends DaoBase { 

  def getVExecutorInstanceSummarysList() : List[VExecutorInstanceSummaryDto] = {
   implicit val connection = getConnection();
   val dtos : List[VExecutorInstanceSummaryDto]= SQL("select * from vExecutorInstanceSummary").as(anorm.Macro.namedParser[VExecutorInstanceSummaryDto].*);
   dtos
  }
  def getVExecutorInstanceSummarysCount() : Long = {
   implicit val connection = getConnection();
   val cnt : Long = SQL("select count(*) as cnt from vExecutorInstanceSummary").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
   cnt
  }
  def getVExecutorInstanceSummarysLastInsertDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from vExecutorInstanceSummary").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
   ld
  }
  def getVExecutorInstanceSummarysLastUpdatedDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from vExecutorInstanceSummary").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
   ld
  }
  def getVExecutorInstanceSummaryFirst() : VExecutorInstanceSummaryDto = {
   implicit val connection = getConnection();
   val dtos : VExecutorInstanceSummaryDto= SQL("select * from vExecutorInstanceSummary order by insertedRowDate asc ").as(anorm.Macro.namedParser[VExecutorInstanceSummaryDto].*).head;
   dtos
  }
  def getVExecutorInstanceSummaryLast() : VExecutorInstanceSummaryDto = {
   implicit val connection = getConnection();
   val dtos : VExecutorInstanceSummaryDto= SQL("select * from vExecutorInstanceSummary order by insertedRowDate desc ").as(anorm.Macro.namedParser[VExecutorInstanceSummaryDto].*).head;
   dtos
  }
  def getVExecutorInstanceSummaryByGuid(guid : Long) : VExecutorInstanceSummaryDto = {
   implicit val connection = getConnection();
   val dtos : VExecutorInstanceSummaryDto= SQL("select * from vExecutorInstanceSummary where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VExecutorInstanceSummaryDto].single);
   dtos
  }  
 def getDtosByExecutorInstanceId(colValue : Long) : List[VExecutorInstanceSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorInstanceSummaryDto] = SQL("select * from vExecutorInstanceSummary where executorInstanceId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceSummaryDto].*);  
   dtos  
 }  
 def getDtosByGuid(colValue : Long) : List[VExecutorInstanceSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorInstanceSummaryDto] = SQL("select * from vExecutorInstanceSummary where guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceSummaryDto].*);  
   dtos  
 }  
 def getDtosByInsertedRowDate(colValue : java.util.Date) : List[VExecutorInstanceSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorInstanceSummaryDto] = SQL("select * from vExecutorInstanceSummary where insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceSummaryDto].*);  
   dtos  
 }  
 def getDtosByLastUpdatedDate(colValue : java.util.Date) : List[VExecutorInstanceSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorInstanceSummaryDto] = SQL("select * from vExecutorInstanceSummary where lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceSummaryDto].*);  
   dtos  
 }  
 def getDtosByExecutorTypeId(colValue : Long) : List[VExecutorInstanceSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorInstanceSummaryDto] = SQL("select * from vExecutorInstanceSummary where executorTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceSummaryDto].*);  
   dtos  
 }  
 def getDtosByExecutorHostId(colValue : Long) : List[VExecutorInstanceSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorInstanceSummaryDto] = SQL("select * from vExecutorInstanceSummary where executorHostId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceSummaryDto].*);  
   dtos  
 }  
 def getDtosByExecutorContextId(colValue : Long) : List[VExecutorInstanceSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorInstanceSummaryDto] = SQL("select * from vExecutorInstanceSummary where executorContextId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceSummaryDto].*);  
   dtos  
 }  
 def getDtosByExecutorInstanceName(colValue : String) : List[VExecutorInstanceSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorInstanceSummaryDto] = SQL("select * from vExecutorInstanceSummary where executorInstanceName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceSummaryDto].*);  
   dtos  
 }  
 def getDtosByIsRunning(colValue : Int) : List[VExecutorInstanceSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorInstanceSummaryDto] = SQL("select * from vExecutorInstanceSummary where isRunning = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceSummaryDto].*);  
   dtos  
 }  
 def getDtosByIsFinished(colValue : Int) : List[VExecutorInstanceSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorInstanceSummaryDto] = SQL("select * from vExecutorInstanceSummary where isFinished = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceSummaryDto].*);  
   dtos  
 }  
 def getDtosByPortNumber(colValue : Int) : List[VExecutorInstanceSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorInstanceSummaryDto] = SQL("select * from vExecutorInstanceSummary where portNumber = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceSummaryDto].*);  
   dtos  
 }  
 def getDtosByEndDate(colValue : java.util.Date) : List[VExecutorInstanceSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorInstanceSummaryDto] = SQL("select * from vExecutorInstanceSummary where endDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceSummaryDto].*);  
   dtos  
 }  
 def getDtosByResourceManagerAllocation_count(colValue : Int) : List[VExecutorInstanceSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorInstanceSummaryDto] = SQL("select * from vExecutorInstanceSummary where resourceManagerAllocation_count = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceSummaryDto].*);  
   dtos  
 }  
 def getDtosByAlgorithmRun_count(colValue : Int) : List[VExecutorInstanceSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorInstanceSummaryDto] = SQL("select * from vExecutorInstanceSummary where algorithmRun_count = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceSummaryDto].*);  
   dtos  
 }  
 def getDtosByExecutorInstanceState_count(colValue : Int) : List[VExecutorInstanceSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorInstanceSummaryDto] = SQL("select * from vExecutorInstanceSummary where executorInstanceState_count = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceSummaryDto].*);  
   dtos  
 }  
 def getDtosByExecutorStorageSnapshot_count(colValue : Int) : List[VExecutorInstanceSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorInstanceSummaryDto] = SQL("select * from vExecutorInstanceSummary where executorStorageSnapshot_count = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceSummaryDto].*);  
   dtos  
 }  

} 
