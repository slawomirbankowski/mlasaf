/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dao

import anorm.{SQL, SqlParser}
import com.mlasaf.dto._
import java.util.Date


 class VSourceDownloadStatDao extends DaoBase { 

  def getVSourceDownloadStatsList() : List[VSourceDownloadStatDto] = {
   implicit val connection = getConnection();
   val dtos : List[VSourceDownloadStatDto]= SQL("select * from vSourceDownloadStat").as(anorm.Macro.namedParser[VSourceDownloadStatDto].*);
   dtos
  }
  def getVSourceDownloadStatsCount() : Long = {
   implicit val connection = getConnection();
   val cnt : Long = SQL("select count(*) as cnt from vSourceDownloadStat").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
   cnt
  }
  def getVSourceDownloadStatsLastInsertDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from vSourceDownloadStat").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
   ld
  }
  def getVSourceDownloadStatsLastUpdatedDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from vSourceDownloadStat").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
   ld
  }
  def getVSourceDownloadStatFirst() : VSourceDownloadStatDto = {
   implicit val connection = getConnection();
   val dtos : VSourceDownloadStatDto= SQL("select * from vSourceDownloadStat order by insertedRowDate asc ").as(anorm.Macro.namedParser[VSourceDownloadStatDto].*).head;
   dtos
  }
  def getVSourceDownloadStatLast() : VSourceDownloadStatDto = {
   implicit val connection = getConnection();
   val dtos : VSourceDownloadStatDto= SQL("select * from vSourceDownloadStat order by insertedRowDate desc ").as(anorm.Macro.namedParser[VSourceDownloadStatDto].*).head;
   dtos
  }
  def getVSourceDownloadStatByGuid(guid : Long) : VSourceDownloadStatDto = {
   implicit val connection = getConnection();
   val dtos : VSourceDownloadStatDto= SQL("select * from vSourceDownloadStat where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VSourceDownloadStatDto].single);
   dtos
  }  
 def getDtosBySourceDownloadStatId(colValue : Long) : List[VSourceDownloadStatDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadStatDto] = SQL("select * from vSourceDownloadStat where sourceDownloadStatId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatDto].*);  
   dtos  
 }  
 def getDtosByGuid(colValue : Long) : List[VSourceDownloadStatDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadStatDto] = SQL("select * from vSourceDownloadStat where guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatDto].*);  
   dtos  
 }  
 def getDtosBySourceDownloadId(colValue : Long) : List[VSourceDownloadStatDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadStatDto] = SQL("select * from vSourceDownloadStat where sourceDownloadId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatDto].*);  
   dtos  
 }  
 def getDtosByInsertedRowDate(colValue : java.util.Date) : List[VSourceDownloadStatDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadStatDto] = SQL("select * from vSourceDownloadStat where insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatDto].*);  
   dtos  
 }  
 def getDtosByLastUpdatedDate(colValue : java.util.Date) : List[VSourceDownloadStatDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadStatDto] = SQL("select * from vSourceDownloadStat where lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatDto].*);  
   dtos  
 }  
 def getDtosByRowsCount(colValue : Long) : List[VSourceDownloadStatDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadStatDto] = SQL("select * from vSourceDownloadStat where rowsCount = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatDto].*);  
   dtos  
 }  
 def getDtosByErrorRowsCount(colValue : Long) : List[VSourceDownloadStatDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadStatDto] = SQL("select * from vSourceDownloadStat where errorRowsCount = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatDto].*);  
   dtos  
 }  
 def getDtosByTotalBytesCount(colValue : Long) : List[VSourceDownloadStatDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadStatDto] = SQL("select * from vSourceDownloadStat where totalBytesCount = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatDto].*);  
   dtos  
 }  
 def getDtosByEmpryRowsCount(colValue : Long) : List[VSourceDownloadStatDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadStatDto] = SQL("select * from vSourceDownloadStat where empryRowsCount = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatDto].*);  
   dtos  
 }  
 def getDtosBySourceDownload_sourceDownloadId(colValue : Long) : List[VSourceDownloadStatDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadStatDto] = SQL("select * from vSourceDownloadStat where sourceDownload_sourceDownloadId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatDto].*);  
   dtos  
 }  
 def getDtosBySourceDownload_guid(colValue : Long) : List[VSourceDownloadStatDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadStatDto] = SQL("select * from vSourceDownloadStat where sourceDownload_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatDto].*);  
   dtos  
 }  
 def getDtosBySourceDownload_insertedRowDate(colValue : java.util.Date) : List[VSourceDownloadStatDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadStatDto] = SQL("select * from vSourceDownloadStat where sourceDownload_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatDto].*);  
   dtos  
 }  
 def getDtosBySourceDownload_lastUpdatedDate(colValue : java.util.Date) : List[VSourceDownloadStatDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadStatDto] = SQL("select * from vSourceDownloadStat where sourceDownload_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatDto].*);  
   dtos  
 }  
 def getDtosBySourceDownload_sourceScheduleId(colValue : Long) : List[VSourceDownloadStatDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadStatDto] = SQL("select * from vSourceDownloadStat where sourceDownload_sourceScheduleId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatDto].*);  
   dtos  
 }  
 def getDtosBySourceDownload_executorHostId(colValue : Long) : List[VSourceDownloadStatDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadStatDto] = SQL("select * from vSourceDownloadStat where sourceDownload_executorHostId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatDto].*);  
   dtos  
 }  
 def getDtosBySourceDownload_executorContextId(colValue : Long) : List[VSourceDownloadStatDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadStatDto] = SQL("select * from vSourceDownloadStat where sourceDownload_executorContextId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatDto].*);  
   dtos  
 }  
 def getDtosBySourceDownload_sourceViewId(colValue : Long) : List[VSourceDownloadStatDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadStatDto] = SQL("select * from vSourceDownloadStat where sourceDownload_sourceViewId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatDto].*);  
   dtos  
 }  
 def getDtosBySourceDownload_retryNumber(colValue : Int) : List[VSourceDownloadStatDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadStatDto] = SQL("select * from vSourceDownloadStat where sourceDownload_retryNumber = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatDto].*);  
   dtos  
 }  
 def getDtosBySourceDownload_isRunning(colValue : Int) : List[VSourceDownloadStatDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadStatDto] = SQL("select * from vSourceDownloadStat where sourceDownload_isRunning = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatDto].*);  
   dtos  
 }  
 def getDtosBySourceDownload_isFinished(colValue : Int) : List[VSourceDownloadStatDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadStatDto] = SQL("select * from vSourceDownloadStat where sourceDownload_isFinished = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatDto].*);  
   dtos  
 }  
 def getDtosBySourceDownload_isExcecption(colValue : Int) : List[VSourceDownloadStatDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadStatDto] = SQL("select * from vSourceDownloadStat where sourceDownload_isExcecption = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatDto].*);  
   dtos  
 }  
 def getDtosBySourceDownload_excecptionDescription(colValue : String) : List[VSourceDownloadStatDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceDownloadStatDto] = SQL("select * from vSourceDownloadStat where sourceDownload_excecptionDescription = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatDto].*);  
   dtos  
 }  

} 
