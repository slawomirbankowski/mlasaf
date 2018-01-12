/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dao

import anorm.{SQL, SqlParser}
import com.mlasaf.dto._
import java.util.Date


 class VExecutorContextThreadDao extends DaoBase { 

  def getVExecutorContextThreadsList() : List[VExecutorContextThreadDto] = {
   implicit val connection = getConnection();
   val dtos : List[VExecutorContextThreadDto]= SQL("select * from vExecutorContextThread").as(anorm.Macro.namedParser[VExecutorContextThreadDto].*);
   releaseConnection(connection);
   dtos
  }
  def getVExecutorContextThreadsCount() : Long = {
   implicit val connection = getConnection();
   val cnt : Long = SQL("select count(*) as cnt from vExecutorContextThread").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);
   releaseConnection(connection);
   cnt
  }
  def getVExecutorContextThreadsLastInsertDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from vExecutorContextThread").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);
   releaseConnection(connection);
   ld
  }
  def getVExecutorContextThreadsLastUpdatedDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from vExecutorContextThread").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);
   releaseConnection(connection);
   ld
  }
  def getVExecutorContextThreadFirst() : VExecutorContextThreadDto = {
   implicit val connection = getConnection();
   val dtos : VExecutorContextThreadDto= SQL("select * from vExecutorContextThread order by insertedRowDate asc ").as(anorm.Macro.namedParser[VExecutorContextThreadDto].*).head;
   releaseConnection(connection);
   dtos
  }
  def getVExecutorContextThreadLast() : VExecutorContextThreadDto = {
   implicit val connection = getConnection();
   val dtos : VExecutorContextThreadDto= SQL("select * from vExecutorContextThread order by insertedRowDate desc ").as(anorm.Macro.namedParser[VExecutorContextThreadDto].*).head;
   releaseConnection(connection);
   dtos
  }
  def getVExecutorContextThreadsByField(fieldName : String, fieldValue : String) : List[VExecutorContextThreadDto] = {
   implicit val connection = getConnection();
   val dtos : List[VExecutorContextThreadDto]= SQL("select * from vExecutorContextThread where " + fieldName + " = {fieldValue} ").on("fieldValue" -> fieldValue).as(anorm.Macro.namedParser[VExecutorContextThreadDto].*);
   releaseConnection(connection);
   dtos
  }
  def getVExecutorContextThreadByGuid(guid : Long) : VExecutorContextThreadDto = {
   implicit val connection = getConnection();
   val dtos : VExecutorContextThreadDto= SQL("select * from vExecutorContextThread where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VExecutorContextThreadDto].single);
   releaseConnection(connection);
   dtos
  }  
 def getDtosByExecutorContextThreadId(colValue : Long) : List[VExecutorContextThreadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorContextThreadDto] = SQL("select * from vExecutorContextThread where executorContextThreadId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorContextThreadDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByGuid(colValue : Long) : List[VExecutorContextThreadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorContextThreadDto] = SQL("select * from vExecutorContextThread where guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorContextThreadDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByInsertedRowDate(colValue : java.util.Date) : List[VExecutorContextThreadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorContextThreadDto] = SQL("select * from vExecutorContextThread where insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorContextThreadDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByLastUpdatedDate(colValue : java.util.Date) : List[VExecutorContextThreadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorContextThreadDto] = SQL("select * from vExecutorContextThread where lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorContextThreadDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByExecutorContextId(colValue : Long) : List[VExecutorContextThreadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorContextThreadDto] = SQL("select * from vExecutorContextThread where executorContextId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorContextThreadDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByThreadId(colValue : Int) : List[VExecutorContextThreadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorContextThreadDto] = SQL("select * from vExecutorContextThread where threadId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorContextThreadDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByThreadName(colValue : String) : List[VExecutorContextThreadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorContextThreadDto] = SQL("select * from vExecutorContextThread where threadName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorContextThreadDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByThreadPriority(colValue : Int) : List[VExecutorContextThreadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorContextThreadDto] = SQL("select * from vExecutorContextThread where threadPriority = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorContextThreadDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByThreadStatus(colValue : String) : List[VExecutorContextThreadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorContextThreadDto] = SQL("select * from vExecutorContextThread where threadStatus = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorContextThreadDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByIsRunning(colValue : Int) : List[VExecutorContextThreadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorContextThreadDto] = SQL("select * from vExecutorContextThread where isRunning = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorContextThreadDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByIsInitialized(colValue : Int) : List[VExecutorContextThreadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorContextThreadDto] = SQL("select * from vExecutorContextThread where isInitialized = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorContextThreadDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByIsWorking(colValue : Int) : List[VExecutorContextThreadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorContextThreadDto] = SQL("select * from vExecutorContextThread where isWorking = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorContextThreadDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByIsStopped(colValue : Int) : List[VExecutorContextThreadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorContextThreadDto] = SQL("select * from vExecutorContextThread where isStopped = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorContextThreadDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByIsDaemon(colValue : Int) : List[VExecutorContextThreadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorContextThreadDto] = SQL("select * from vExecutorContextThread where isDaemon = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorContextThreadDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByRunInterval(colValue : Int) : List[VExecutorContextThreadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorContextThreadDto] = SQL("select * from vExecutorContextThread where runInterval = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorContextThreadDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByStartTime(colValue : java.util.Date) : List[VExecutorContextThreadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorContextThreadDto] = SQL("select * from vExecutorContextThread where startTime = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorContextThreadDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByStopTime(colValue : java.util.Date) : List[VExecutorContextThreadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorContextThreadDto] = SQL("select * from vExecutorContextThread where stopTime = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorContextThreadDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByEndTime(colValue : java.util.Date) : List[VExecutorContextThreadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorContextThreadDto] = SQL("select * from vExecutorContextThread where endTime = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorContextThreadDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByExecutorContext_executorContextId(colValue : Long) : List[VExecutorContextThreadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorContextThreadDto] = SQL("select * from vExecutorContextThread where executorContext_executorContextId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorContextThreadDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByExecutorContext_guid(colValue : Long) : List[VExecutorContextThreadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorContextThreadDto] = SQL("select * from vExecutorContextThread where executorContext_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorContextThreadDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByExecutorContext_insertedRowDate(colValue : java.util.Date) : List[VExecutorContextThreadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorContextThreadDto] = SQL("select * from vExecutorContextThread where executorContext_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorContextThreadDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByExecutorContext_lastUpdatedDate(colValue : java.util.Date) : List[VExecutorContextThreadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorContextThreadDto] = SQL("select * from vExecutorContextThread where executorContext_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorContextThreadDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByExecutorContext_executorHostId(colValue : Long) : List[VExecutorContextThreadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorContextThreadDto] = SQL("select * from vExecutorContextThread where executorContext_executorHostId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorContextThreadDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByExecutorContext_isWorking(colValue : Int) : List[VExecutorContextThreadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorContextThreadDto] = SQL("select * from vExecutorContextThread where executorContext_isWorking = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorContextThreadDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByExecutorContext_properties(colValue : String) : List[VExecutorContextThreadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorContextThreadDto] = SQL("select * from vExecutorContextThread where executorContext_properties = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorContextThreadDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByExecutorContext_properties2(colValue : String) : List[VExecutorContextThreadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorContextThreadDto] = SQL("select * from vExecutorContextThread where executorContext_properties2 = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorContextThreadDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByExecutorContext_properties3(colValue : String) : List[VExecutorContextThreadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorContextThreadDto] = SQL("select * from vExecutorContextThread where executorContext_properties3 = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorContextThreadDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDtosByExecutorContext_entryParams(colValue : String) : List[VExecutorContextThreadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorContextThreadDto] = SQL("select * from vExecutorContextThread where executorContext_entryParams = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorContextThreadDto].*);  
   releaseConnection(connection);  
   dtos  
 }  

} 
