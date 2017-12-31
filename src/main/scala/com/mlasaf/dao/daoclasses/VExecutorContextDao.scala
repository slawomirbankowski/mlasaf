/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dao

import anorm.{SQL, SqlParser}
import com.mlasaf.dto._
import java.util.Date


 class VExecutorContextDao extends DaoBase { 

  def getVExecutorContextsList() : List[VExecutorContextDto] = {
   implicit val connection = getConnection();
   val dtos : List[VExecutorContextDto]= SQL("select * from vExecutorContext").as(anorm.Macro.namedParser[VExecutorContextDto].*);
   dtos
  }
  def getVExecutorContextsCount() : Long = {
   implicit val connection = getConnection();
   val cnt : Long = SQL("select count(*) as cnt from vExecutorContext").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
   cnt
  }
  def getVExecutorContextsLastInsertDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from vExecutorContext").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
   ld
  }
  def getVExecutorContextsLastUpdatedDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from vExecutorContext").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
   ld
  }
  def getVExecutorContextFirst() : VExecutorContextDto = {
   implicit val connection = getConnection();
   val dtos : VExecutorContextDto= SQL("select * from vExecutorContext order by insertedRowDate asc ").as(anorm.Macro.namedParser[VExecutorContextDto].*).head;
   dtos
  }
  def getVExecutorContextLast() : VExecutorContextDto = {
   implicit val connection = getConnection();
   val dtos : VExecutorContextDto= SQL("select * from vExecutorContext order by insertedRowDate desc ").as(anorm.Macro.namedParser[VExecutorContextDto].*).head;
   dtos
  }
  def getVExecutorContextByGuid(guid : Long) : VExecutorContextDto = {
   implicit val connection = getConnection();
   val dtos : VExecutorContextDto= SQL("select * from vExecutorContext where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VExecutorContextDto].single);
   dtos
  }  
 def getDtosByExecutorContextId(colValue : Long) : List[VExecutorContextDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorContextDto] = SQL("select * from vExecutorContext where executorContextId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorContextDto].*);  
   dtos  
 }  
 def getDtosByGuid(colValue : Long) : List[VExecutorContextDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorContextDto] = SQL("select * from vExecutorContext where guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorContextDto].*);  
   dtos  
 }  
 def getDtosByInsertedRowDate(colValue : java.util.Date) : List[VExecutorContextDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorContextDto] = SQL("select * from vExecutorContext where insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorContextDto].*);  
   dtos  
 }  
 def getDtosByLastUpdatedDate(colValue : java.util.Date) : List[VExecutorContextDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorContextDto] = SQL("select * from vExecutorContext where lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorContextDto].*);  
   dtos  
 }  
 def getDtosByExecutorHostId(colValue : Long) : List[VExecutorContextDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorContextDto] = SQL("select * from vExecutorContext where executorHostId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorContextDto].*);  
   dtos  
 }  
 def getDtosByIsWorking(colValue : Int) : List[VExecutorContextDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorContextDto] = SQL("select * from vExecutorContext where isWorking = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorContextDto].*);  
   dtos  
 }  
 def getDtosByProperties(colValue : String) : List[VExecutorContextDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorContextDto] = SQL("select * from vExecutorContext where properties = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorContextDto].*);  
   dtos  
 }  
 def getDtosByProperties2(colValue : String) : List[VExecutorContextDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorContextDto] = SQL("select * from vExecutorContext where properties2 = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorContextDto].*);  
   dtos  
 }  
 def getDtosByProperties3(colValue : String) : List[VExecutorContextDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorContextDto] = SQL("select * from vExecutorContext where properties3 = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorContextDto].*);  
   dtos  
 }  
 def getDtosByEntryParams(colValue : String) : List[VExecutorContextDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorContextDto] = SQL("select * from vExecutorContext where entryParams = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorContextDto].*);  
   dtos  
 }  
 def getDtosByExecutorHost_executorHostId(colValue : Long) : List[VExecutorContextDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorContextDto] = SQL("select * from vExecutorContext where executorHost_executorHostId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorContextDto].*);  
   dtos  
 }  
 def getDtosByExecutorHost_guid(colValue : Long) : List[VExecutorContextDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorContextDto] = SQL("select * from vExecutorContext where executorHost_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorContextDto].*);  
   dtos  
 }  
 def getDtosByExecutorHost_insertedRowDate(colValue : java.util.Date) : List[VExecutorContextDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorContextDto] = SQL("select * from vExecutorContext where executorHost_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorContextDto].*);  
   dtos  
 }  
 def getDtosByExecutorHost_lastUpdatedDate(colValue : java.util.Date) : List[VExecutorContextDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorContextDto] = SQL("select * from vExecutorContext where executorHost_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorContextDto].*);  
   dtos  
 }  
 def getDtosByExecutorHost_hostName(colValue : String) : List[VExecutorContextDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorContextDto] = SQL("select * from vExecutorContext where executorHost_hostName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorContextDto].*);  
   dtos  
 }  
 def getDtosByExecutorHost_hostIp(colValue : String) : List[VExecutorContextDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorContextDto] = SQL("select * from vExecutorContext where executorHost_hostIp = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorContextDto].*);  
   dtos  
 }  
 def getDtosByExecutorHost_hostDomain(colValue : String) : List[VExecutorContextDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorContextDto] = SQL("select * from vExecutorContext where executorHost_hostDomain = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorContextDto].*);  
   dtos  
 }  
 def getDtosByExecutorHost_hostOsType(colValue : String) : List[VExecutorContextDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorContextDto] = SQL("select * from vExecutorContext where executorHost_hostOsType = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorContextDto].*);  
   dtos  
 }  
 def getDtosByExecutorHost_hostOsVersion(colValue : String) : List[VExecutorContextDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorContextDto] = SQL("select * from vExecutorContext where executorHost_hostOsVersion = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorContextDto].*);  
   dtos  
 }  
 def getDtosByExecutorHost_isWorking(colValue : Int) : List[VExecutorContextDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VExecutorContextDto] = SQL("select * from vExecutorContext where executorHost_isWorking = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorContextDto].*);  
   dtos  
 }  

} 
