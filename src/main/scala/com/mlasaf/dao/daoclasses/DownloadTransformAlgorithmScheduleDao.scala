/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dao

import anorm.{SQL, SqlParser}
import com.mlasaf.dto._
import java.util.Date


 class DownloadTransformAlgorithmScheduleDao extends DaoBase { 

  def getDownloadTransformAlgorithmSchedulesList() : List[DownloadTransformAlgorithmScheduleDto] = {
   implicit val connection = getConnection();
   val dtos : List[DownloadTransformAlgorithmScheduleDto]= SQL("select * from downloadTransformAlgorithmSchedule").as(anorm.Macro.namedParser[DownloadTransformAlgorithmScheduleDto].*);
   releaseConnection(connection);
   dtos
  }
  def getDownloadTransformAlgorithmSchedulesCount() : Long = {
   implicit val connection = getConnection();
   val cnt : Long = SQL("select count(*) as cnt from downloadTransformAlgorithmSchedule").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);
   releaseConnection(connection);
   cnt
  }
  def getDownloadTransformAlgorithmSchedulesLastInsertDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from downloadTransformAlgorithmSchedule").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);
   releaseConnection(connection);
   ld
  }
  def getDownloadTransformAlgorithmSchedulesLastUpdatedDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from downloadTransformAlgorithmSchedule").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);
   releaseConnection(connection);
   ld
  }
  def getDownloadTransformAlgorithmScheduleFirst() : DownloadTransformAlgorithmScheduleDto = {
   implicit val connection = getConnection();
   val dtos : DownloadTransformAlgorithmScheduleDto= SQL("select * from downloadTransformAlgorithmSchedule order by insertedRowDate asc ").as(anorm.Macro.namedParser[DownloadTransformAlgorithmScheduleDto].*).head;
   releaseConnection(connection);
   dtos
  }
  def getDownloadTransformAlgorithmScheduleLast() : DownloadTransformAlgorithmScheduleDto = {
   implicit val connection = getConnection();
   val dtos : DownloadTransformAlgorithmScheduleDto= SQL("select * from downloadTransformAlgorithmSchedule order by insertedRowDate desc ").as(anorm.Macro.namedParser[DownloadTransformAlgorithmScheduleDto].*).head;
   releaseConnection(connection);
   dtos
  }
  def getDownloadTransformAlgorithmSchedulesByField(fieldName : String, fieldValue : String) : List[DownloadTransformAlgorithmScheduleDto] = {
   implicit val connection = getConnection();
   val dtos : List[DownloadTransformAlgorithmScheduleDto]= SQL("select * from downloadTransformAlgorithmSchedule where " + fieldName + " = {fieldValue} ").on("fieldValue" -> fieldValue).as(anorm.Macro.namedParser[DownloadTransformAlgorithmScheduleDto].*);
   releaseConnection(connection);
   dtos
  }
  def getDownloadTransformAlgorithmScheduleByGuid(guid : Long) : DownloadTransformAlgorithmScheduleDto = {
   implicit val connection = getConnection();
   val dtos : DownloadTransformAlgorithmScheduleDto= SQL("select * from downloadTransformAlgorithmSchedule where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[DownloadTransformAlgorithmScheduleDto].single);
   releaseConnection(connection);
   dtos
  }  
 def getDownloadTransformAlgorithmScheduleByPk(pkColValue : Long) : DownloadTransformAlgorithmScheduleDto = { 
   implicit val connection = getConnection();  
   val dto : DownloadTransformAlgorithmScheduleDto = SQL("select * from downloadTransformAlgorithmSchedule where downloadTransformAlgorithmScheduleId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[DownloadTransformAlgorithmScheduleDto].single);  
   releaseConnection(connection);  
   dto  
 }  
 def getDownloadTransformAlgorithmScheduleMaxId() : Long = { 
   implicit val connection = getConnection();  
   val maxid : Long = SQL("select max(downloadTransformAlgorithmScheduleId) as maxId from downloadTransformAlgorithmSchedule ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;  
   releaseConnection(connection);  
   maxid  
 }  
 def getDownloadTransformAlgorithmScheduleByFkAlgorithmScheduleViewId(fkColValue : Long) : List[DownloadTransformAlgorithmScheduleDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[DownloadTransformAlgorithmScheduleDto] = SQL("select * from downloadTransformAlgorithmSchedule where algorithmScheduleViewId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[DownloadTransformAlgorithmScheduleDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getDownloadTransformAlgorithmScheduleByFkDownloadTransformGroupId(fkColValue : Long) : List[DownloadTransformAlgorithmScheduleDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[DownloadTransformAlgorithmScheduleDto] = SQL("select * from downloadTransformAlgorithmSchedule where downloadTransformGroupId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[DownloadTransformAlgorithmScheduleDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def insertDownloadTransformAlgorithmScheduleDto(dto : DownloadTransformAlgorithmScheduleDto): DownloadTransformAlgorithmScheduleDto = { 
    implicit val connection = getConnection(); 
    val stat = dto.prepareInsert(getConnection()); 
    val resCnt = stat.executeUpdate(); 
    val rs = stat.getGeneratedKeys(); 
    if (rs.next()) { 
      val pkValue = rs.getLong(1); 
      val r = SQL("select * from downloadTransformAlgorithmSchedule where downloadTransformAlgorithmScheduleId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[DownloadTransformAlgorithmScheduleDto].single); 
      releaseConnection(connection);  
      r 
    } else { 
      releaseConnection(connection);  
      null; 
    } 
 } 
  def createAndInsertDownloadTransformAlgorithmScheduleDto(downloadTransformGroupId : Long, algorithmScheduleViewId : Long) : DownloadTransformAlgorithmScheduleDto = {
    val dto = new DownloadTransformAlgorithmScheduleDto(0,0,new Date(),new Date(),downloadTransformGroupId,algorithmScheduleViewId)
    insertDownloadTransformAlgorithmScheduleDto(dto);   
  }   
  def updateDownloadTransformAlgorithmScheduleDto(dto : DownloadTransformAlgorithmScheduleDto): DownloadTransformAlgorithmScheduleDto = {  
    implicit val connection = getConnection();  
      val resCnt = SQL("update downloadTransformAlgorithmSchedule set  lastUpdatedDate = {lastUpdatedDate} ,  downloadTransformGroupId = {downloadTransformGroupId} ,  algorithmScheduleViewId = {algorithmScheduleViewId}  where  downloadTransformAlgorithmScheduleId = {downloadTransformAlgorithmScheduleId}  ")
      .on("lastUpdatedDate" -> dto.lastUpdatedDate , "downloadTransformGroupId" -> dto.downloadTransformGroupId , "algorithmScheduleViewId" -> dto.algorithmScheduleViewId, "downloadTransformAlgorithmScheduleId" -> dto.downloadTransformAlgorithmScheduleId ).executeInsert() 
   releaseConnection(connection);  
     getDownloadTransformAlgorithmScheduleByPk(dto.downloadTransformAlgorithmScheduleId) 
    } 

} 
