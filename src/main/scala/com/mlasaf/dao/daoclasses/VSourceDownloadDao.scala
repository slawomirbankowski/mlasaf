/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dao

import anorm.{SQL, SqlParser}
import com.mlasaf.dto._
import java.util.Date


 class VSourceDownloadDao extends DaoBase { 

  def getVSourceDownloadsList() : List[VSourceDownloadDto] = {
   implicit val connection = getConnection();
   val dtos : List[VSourceDownloadDto]= SQL("select * from vSourceDownload").as(anorm.Macro.namedParser[VSourceDownloadDto].*);
   dtos
  }
  def getVSourceDownloadsCount() : Long = {
   implicit val connection = getConnection();
   val cnt : Long = SQL("select count(*) as cnt from vSourceDownload").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
   cnt
  }
  def getVSourceDownloadsLastInsertDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from vSourceDownload").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
   ld
  }
  def getVSourceDownloadsLastUpdatedDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from vSourceDownload").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
   ld
  }
  def getVSourceDownloadFirst() : VSourceDownloadDto = {
   implicit val connection = getConnection();
   val dtos : VSourceDownloadDto= SQL("select * from vSourceDownload order by insertedRowDate asc ").as(anorm.Macro.namedParser[VSourceDownloadDto].*).head;
   dtos
  }
  def getVSourceDownloadLast() : VSourceDownloadDto = {
   implicit val connection = getConnection();
   val dtos : VSourceDownloadDto= SQL("select * from vSourceDownload order by insertedRowDate desc ").as(anorm.Macro.namedParser[VSourceDownloadDto].*).head;
   dtos
  }
  def getVSourceDownloadByGuid(guid : Long) : VSourceDownloadDto = {
   implicit val connection = getConnection();
   val dtos : VSourceDownloadDto= SQL("select * from vSourceDownload where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VSourceDownloadDto].single);
   dtos
  }  
 def getDtosBySourceDownloadId(colValue : Long) : List[VSourceDownloadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where sourceDownloadId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);  
   dtos  
 }  
 def getDtosByGuid(colValue : Long) : List[VSourceDownloadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);  
   dtos  
 }  
 def getDtosByInsertedRowDate(colValue : java.util.Date) : List[VSourceDownloadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);  
   dtos  
 }  
 def getDtosByLastUpdatedDate(colValue : java.util.Date) : List[VSourceDownloadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);  
   dtos  
 }  
 def getDtosBySourceScheduleId(colValue : Long) : List[VSourceDownloadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where sourceScheduleId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);  
   dtos  
 }  
 def getDtosByExecutorHostId(colValue : Long) : List[VSourceDownloadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where executorHostId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);  
   dtos  
 }  
 def getDtosByExecutorContextId(colValue : Long) : List[VSourceDownloadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where executorContextId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);  
   dtos  
 }  
 def getDtosBySourceViewId(colValue : Long) : List[VSourceDownloadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where sourceViewId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);  
   dtos  
 }  
 def getDtosByRetryNumber(colValue : Int) : List[VSourceDownloadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where retryNumber = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);  
   dtos  
 }  
 def getDtosByIsRunning(colValue : Int) : List[VSourceDownloadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where isRunning = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);  
   dtos  
 }  
 def getDtosByIsFinished(colValue : Int) : List[VSourceDownloadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where isFinished = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);  
   dtos  
 }  
 def getDtosByIsExcecption(colValue : Int) : List[VSourceDownloadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where isExcecption = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);  
   dtos  
 }  
 def getDtosByExcecptionDescription(colValue : String) : List[VSourceDownloadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where excecptionDescription = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);  
   dtos  
 }  
 def getDtosByExecutorContext_executorContextId(colValue : Long) : List[VSourceDownloadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where executorContext_executorContextId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);  
   dtos  
 }  
 def getDtosByExecutorContext_guid(colValue : Long) : List[VSourceDownloadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where executorContext_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);  
   dtos  
 }  
 def getDtosByExecutorContext_insertedRowDate(colValue : java.util.Date) : List[VSourceDownloadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where executorContext_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);  
   dtos  
 }  
 def getDtosByExecutorContext_lastUpdatedDate(colValue : java.util.Date) : List[VSourceDownloadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where executorContext_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);  
   dtos  
 }  
 def getDtosByExecutorContext_executorHostId(colValue : Long) : List[VSourceDownloadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where executorContext_executorHostId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);  
   dtos  
 }  
 def getDtosByExecutorContext_isWorking(colValue : Int) : List[VSourceDownloadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where executorContext_isWorking = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);  
   dtos  
 }  
 def getDtosByExecutorContext_properties(colValue : String) : List[VSourceDownloadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where executorContext_properties = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);  
   dtos  
 }  
 def getDtosByExecutorContext_properties2(colValue : String) : List[VSourceDownloadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where executorContext_properties2 = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);  
   dtos  
 }  
 def getDtosByExecutorContext_properties3(colValue : String) : List[VSourceDownloadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where executorContext_properties3 = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);  
   dtos  
 }  
 def getDtosByExecutorContext_entryParams(colValue : String) : List[VSourceDownloadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where executorContext_entryParams = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);  
   dtos  
 }  
 def getDtosByExecutorHost_executorHostId(colValue : Long) : List[VSourceDownloadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where executorHost_executorHostId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);  
   dtos  
 }  
 def getDtosByExecutorHost_guid(colValue : Long) : List[VSourceDownloadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where executorHost_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);  
   dtos  
 }  
 def getDtosByExecutorHost_insertedRowDate(colValue : java.util.Date) : List[VSourceDownloadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where executorHost_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);  
   dtos  
 }  
 def getDtosByExecutorHost_lastUpdatedDate(colValue : java.util.Date) : List[VSourceDownloadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where executorHost_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);  
   dtos  
 }  
 def getDtosByExecutorHost_hostName(colValue : String) : List[VSourceDownloadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where executorHost_hostName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);  
   dtos  
 }  
 def getDtosByExecutorHost_hostIp(colValue : String) : List[VSourceDownloadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where executorHost_hostIp = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);  
   dtos  
 }  
 def getDtosByExecutorHost_hostDomain(colValue : String) : List[VSourceDownloadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where executorHost_hostDomain = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);  
   dtos  
 }  
 def getDtosByExecutorHost_hostOsType(colValue : String) : List[VSourceDownloadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where executorHost_hostOsType = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);  
   dtos  
 }  
 def getDtosByExecutorHost_hostOsVersion(colValue : String) : List[VSourceDownloadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where executorHost_hostOsVersion = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);  
   dtos  
 }  
 def getDtosByExecutorHost_isWorking(colValue : Int) : List[VSourceDownloadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where executorHost_isWorking = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);  
   dtos  
 }  
 def getDtosBySourceSchedule_sourceScheduleId(colValue : Long) : List[VSourceDownloadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where sourceSchedule_sourceScheduleId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);  
   dtos  
 }  
 def getDtosBySourceSchedule_guid(colValue : Long) : List[VSourceDownloadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where sourceSchedule_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);  
   dtos  
 }  
 def getDtosBySourceSchedule_insertedRowDate(colValue : java.util.Date) : List[VSourceDownloadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where sourceSchedule_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);  
   dtos  
 }  
 def getDtosBySourceSchedule_lastUpdatedDate(colValue : java.util.Date) : List[VSourceDownloadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where sourceSchedule_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);  
   dtos  
 }  
 def getDtosBySourceSchedule_sourceViewId(colValue : Long) : List[VSourceDownloadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where sourceSchedule_sourceViewId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);  
   dtos  
 }  
 def getDtosBySourceSchedule_executorStorageId(colValue : Long) : List[VSourceDownloadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where sourceSchedule_executorStorageId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);  
   dtos  
 }  
 def getDtosBySourceSchedule_onDemand(colValue : Int) : List[VSourceDownloadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where sourceSchedule_onDemand = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);  
   dtos  
 }  
 def getDtosBySourceSchedule_startTime(colValue : java.util.Date) : List[VSourceDownloadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where sourceSchedule_startTime = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);  
   dtos  
 }  
 def getDtosBySourceSchedule_intervalValue(colValue : Long) : List[VSourceDownloadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where sourceSchedule_intervalValue = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);  
   dtos  
 }  
 def getDtosBySourceSchedule_isScheduled(colValue : Int) : List[VSourceDownloadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where sourceSchedule_isScheduled = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);  
   dtos  
 }  
 def getDtosBySourceSchedule_deleteOldCopies(colValue : Int) : List[VSourceDownloadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where sourceSchedule_deleteOldCopies = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);  
   dtos  
 }  
 def getDtosBySourceView_sourceViewId(colValue : Long) : List[VSourceDownloadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where sourceView_sourceViewId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);  
   dtos  
 }  
 def getDtosBySourceView_guid(colValue : Long) : List[VSourceDownloadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where sourceView_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);  
   dtos  
 }  
 def getDtosBySourceView_insertedRowDate(colValue : java.util.Date) : List[VSourceDownloadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where sourceView_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);  
   dtos  
 }  
 def getDtosBySourceView_lastUpdatedDate(colValue : java.util.Date) : List[VSourceDownloadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where sourceView_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);  
   dtos  
 }  
 def getDtosBySourceView_sourceInstanceId(colValue : Long) : List[VSourceDownloadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where sourceView_sourceInstanceId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);  
   dtos  
 }  
 def getDtosBySourceView_sourceViewTypeId(colValue : Long) : List[VSourceDownloadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where sourceView_sourceViewTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);  
   dtos  
 }  
 def getDtosBySourceView_sourceViewName(colValue : String) : List[VSourceDownloadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where sourceView_sourceViewName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);  
   dtos  
 }  
 def getDtosBySourceView_sourceViewDefinition(colValue : String) : List[VSourceDownloadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where sourceView_sourceViewDefinition = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);  
   dtos  
 }  
 def getDtosBySourceView_isExisting(colValue : Int) : List[VSourceDownloadDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where sourceView_isExisting = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);  
   dtos  
 }  

} 
