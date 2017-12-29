/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dao

import anorm.{SQL, SqlParser}
import com.mlasaf.dto._
import java.util.Date


 class VExecutorInstanceDao extends DaoBase { 

  def getVExecutorInstancesList() : List[VExecutorInstanceDto] = {
   implicit val connection = getConnection();
   val dtos : List[VExecutorInstanceDto]= SQL("select * from vExecutorInstance").as(anorm.Macro.namedParser[VExecutorInstanceDto].*);
   dtos
  }
  def getVExecutorInstancesCount() : Long = {
   implicit val connection = getConnection();
   val cnt : Long = SQL("select count(*) as cnt from vExecutorInstance").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
   cnt
  }
  def getVExecutorInstancesLastInsertDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from vExecutorInstance").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
   ld
  }
  def getVExecutorInstancesLastUpdatedDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from vExecutorInstance").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
   ld
  }
  def getVExecutorInstanceFirst() : VExecutorInstanceDto = {
   implicit val connection = getConnection();
   val dtos : VExecutorInstanceDto= SQL("select * from vExecutorInstance order by insertedRowDate asc ").as(anorm.Macro.namedParser[VExecutorInstanceDto].*).head;
   dtos
  }
  def getVExecutorInstanceLast() : VExecutorInstanceDto = {
   implicit val connection = getConnection();
   val dtos : VExecutorInstanceDto= SQL("select * from vExecutorInstance order by insertedRowDate desc ").as(anorm.Macro.namedParser[VExecutorInstanceDto].*).head;
   dtos
  }
  def getVExecutorInstanceByGuid(guid : Long) : VExecutorInstanceDto = {
   implicit val connection = getConnection();
   val dtos : VExecutorInstanceDto= SQL("select * from vExecutorInstance where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VExecutorInstanceDto].single);
   dtos
  }  
 def getDtosByExecutorInstanceId(colValue : Long) : List[VExecutorInstanceDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorInstanceDto] = SQL("select * from vExecutorInstance where executorInstanceId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceDto].*);  
   dtos  
 }  
 def getDtosByGuid(colValue : Long) : List[VExecutorInstanceDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorInstanceDto] = SQL("select * from vExecutorInstance where guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceDto].*);  
   dtos  
 }  
 def getDtosByInsertedRowDate(colValue : java.util.Date) : List[VExecutorInstanceDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorInstanceDto] = SQL("select * from vExecutorInstance where insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceDto].*);  
   dtos  
 }  
 def getDtosByLastUpdatedDate(colValue : java.util.Date) : List[VExecutorInstanceDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorInstanceDto] = SQL("select * from vExecutorInstance where lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceDto].*);  
   dtos  
 }  
 def getDtosByExecutorTypeId(colValue : Long) : List[VExecutorInstanceDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorInstanceDto] = SQL("select * from vExecutorInstance where executorTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceDto].*);  
   dtos  
 }  
 def getDtosByExecutorHostId(colValue : Long) : List[VExecutorInstanceDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorInstanceDto] = SQL("select * from vExecutorInstance where executorHostId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceDto].*);  
   dtos  
 }  
 def getDtosByExecutorContextId(colValue : Long) : List[VExecutorInstanceDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorInstanceDto] = SQL("select * from vExecutorInstance where executorContextId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceDto].*);  
   dtos  
 }  
 def getDtosByExecutorInstanceName(colValue : String) : List[VExecutorInstanceDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorInstanceDto] = SQL("select * from vExecutorInstance where executorInstanceName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceDto].*);  
   dtos  
 }  
 def getDtosByIsRunning(colValue : Int) : List[VExecutorInstanceDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorInstanceDto] = SQL("select * from vExecutorInstance where isRunning = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceDto].*);  
   dtos  
 }  
 def getDtosByIsFinished(colValue : Int) : List[VExecutorInstanceDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorInstanceDto] = SQL("select * from vExecutorInstance where isFinished = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceDto].*);  
   dtos  
 }  
 def getDtosByPortNumber(colValue : Int) : List[VExecutorInstanceDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorInstanceDto] = SQL("select * from vExecutorInstance where portNumber = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceDto].*);  
   dtos  
 }  
 def getDtosByEndDate(colValue : java.util.Date) : List[VExecutorInstanceDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorInstanceDto] = SQL("select * from vExecutorInstance where endDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceDto].*);  
   dtos  
 }  
 def getDtosByExecutorContext_executorContextId(colValue : Long) : List[VExecutorInstanceDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorInstanceDto] = SQL("select * from vExecutorInstance where executorContext_executorContextId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceDto].*);  
   dtos  
 }  
 def getDtosByExecutorContext_guid(colValue : Long) : List[VExecutorInstanceDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorInstanceDto] = SQL("select * from vExecutorInstance where executorContext_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceDto].*);  
   dtos  
 }  
 def getDtosByExecutorContext_insertedRowDate(colValue : java.util.Date) : List[VExecutorInstanceDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorInstanceDto] = SQL("select * from vExecutorInstance where executorContext_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceDto].*);  
   dtos  
 }  
 def getDtosByExecutorContext_lastUpdatedDate(colValue : java.util.Date) : List[VExecutorInstanceDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorInstanceDto] = SQL("select * from vExecutorInstance where executorContext_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceDto].*);  
   dtos  
 }  
 def getDtosByExecutorContext_executorHostId(colValue : Long) : List[VExecutorInstanceDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorInstanceDto] = SQL("select * from vExecutorInstance where executorContext_executorHostId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceDto].*);  
   dtos  
 }  
 def getDtosByExecutorContext_isWorking(colValue : Int) : List[VExecutorInstanceDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorInstanceDto] = SQL("select * from vExecutorInstance where executorContext_isWorking = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceDto].*);  
   dtos  
 }  
 def getDtosByExecutorContext_properties(colValue : String) : List[VExecutorInstanceDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorInstanceDto] = SQL("select * from vExecutorInstance where executorContext_properties = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceDto].*);  
   dtos  
 }  
 def getDtosByExecutorHost_executorHostId(colValue : Long) : List[VExecutorInstanceDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorInstanceDto] = SQL("select * from vExecutorInstance where executorHost_executorHostId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceDto].*);  
   dtos  
 }  
 def getDtosByExecutorHost_guid(colValue : Long) : List[VExecutorInstanceDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorInstanceDto] = SQL("select * from vExecutorInstance where executorHost_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceDto].*);  
   dtos  
 }  
 def getDtosByExecutorHost_insertedRowDate(colValue : java.util.Date) : List[VExecutorInstanceDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorInstanceDto] = SQL("select * from vExecutorInstance where executorHost_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceDto].*);  
   dtos  
 }  
 def getDtosByExecutorHost_lastUpdatedDate(colValue : java.util.Date) : List[VExecutorInstanceDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorInstanceDto] = SQL("select * from vExecutorInstance where executorHost_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceDto].*);  
   dtos  
 }  
 def getDtosByExecutorHost_hostName(colValue : String) : List[VExecutorInstanceDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorInstanceDto] = SQL("select * from vExecutorInstance where executorHost_hostName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceDto].*);  
   dtos  
 }  
 def getDtosByExecutorHost_hostIp(colValue : String) : List[VExecutorInstanceDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorInstanceDto] = SQL("select * from vExecutorInstance where executorHost_hostIp = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceDto].*);  
   dtos  
 }  
 def getDtosByExecutorHost_hostDomain(colValue : String) : List[VExecutorInstanceDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorInstanceDto] = SQL("select * from vExecutorInstance where executorHost_hostDomain = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceDto].*);  
   dtos  
 }  
 def getDtosByExecutorHost_hostOsType(colValue : String) : List[VExecutorInstanceDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorInstanceDto] = SQL("select * from vExecutorInstance where executorHost_hostOsType = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceDto].*);  
   dtos  
 }  
 def getDtosByExecutorHost_hostOsVersion(colValue : String) : List[VExecutorInstanceDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorInstanceDto] = SQL("select * from vExecutorInstance where executorHost_hostOsVersion = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceDto].*);  
   dtos  
 }  
 def getDtosByExecutorHost_isWorking(colValue : Int) : List[VExecutorInstanceDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorInstanceDto] = SQL("select * from vExecutorInstance where executorHost_isWorking = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceDto].*);  
   dtos  
 }  
 def getDtosByExecutorType_executorTypeId(colValue : Long) : List[VExecutorInstanceDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorInstanceDto] = SQL("select * from vExecutorInstance where executorType_executorTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceDto].*);  
   dtos  
 }  
 def getDtosByExecutorType_guid(colValue : Long) : List[VExecutorInstanceDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorInstanceDto] = SQL("select * from vExecutorInstance where executorType_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceDto].*);  
   dtos  
 }  
 def getDtosByExecutorType_insertedRowDate(colValue : java.util.Date) : List[VExecutorInstanceDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorInstanceDto] = SQL("select * from vExecutorInstance where executorType_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceDto].*);  
   dtos  
 }  
 def getDtosByExecutorType_lastUpdatedDate(colValue : java.util.Date) : List[VExecutorInstanceDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorInstanceDto] = SQL("select * from vExecutorInstance where executorType_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceDto].*);  
   dtos  
 }  
 def getDtosByExecutorType_executorTypeName(colValue : String) : List[VExecutorInstanceDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorInstanceDto] = SQL("select * from vExecutorInstance where executorType_executorTypeName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceDto].*);  
   dtos  
 }  
 def getDtosByExecutorType_executorTypeClass(colValue : String) : List[VExecutorInstanceDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorInstanceDto] = SQL("select * from vExecutorInstance where executorType_executorTypeClass = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceDto].*);  
   dtos  
 }  

} 
