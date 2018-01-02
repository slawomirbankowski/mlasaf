/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dao

import anorm.{SQL, SqlParser}
import com.mlasaf.dto._
import java.util.Date


 class AlgorithmScheduleDao extends DaoBase { 

  def getAlgorithmSchedulesList() : List[AlgorithmScheduleDto] = {
   implicit val connection = getConnection();
   val dtos : List[AlgorithmScheduleDto]= SQL("select * from algorithmSchedule").as(anorm.Macro.namedParser[AlgorithmScheduleDto].*);
   releaseConnection(connection);
   dtos
  }
  def getAlgorithmSchedulesCount() : Long = {
   implicit val connection = getConnection();
   val cnt : Long = SQL("select count(*) as cnt from algorithmSchedule").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);
   releaseConnection(connection);
   cnt
  }
  def getAlgorithmSchedulesLastInsertDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from algorithmSchedule").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);
   releaseConnection(connection);
   ld
  }
  def getAlgorithmSchedulesLastUpdatedDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from algorithmSchedule").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);
   releaseConnection(connection);
   ld
  }
  def getAlgorithmScheduleFirst() : AlgorithmScheduleDto = {
   implicit val connection = getConnection();
   val dtos : AlgorithmScheduleDto= SQL("select * from algorithmSchedule order by insertedRowDate asc ").as(anorm.Macro.namedParser[AlgorithmScheduleDto].*).head;
   releaseConnection(connection);
   dtos
  }
  def getAlgorithmScheduleLast() : AlgorithmScheduleDto = {
   implicit val connection = getConnection();
   val dtos : AlgorithmScheduleDto= SQL("select * from algorithmSchedule order by insertedRowDate desc ").as(anorm.Macro.namedParser[AlgorithmScheduleDto].*).head;
   releaseConnection(connection);
   dtos
  }
  def getAlgorithmSchedulesByField(fieldName : String, fieldValue : String) : List[AlgorithmScheduleDto] = {
   implicit val connection = getConnection();
   val dtos : List[AlgorithmScheduleDto]= SQL("select * from algorithmSchedule where " + fieldName + " = {fieldValue} ").on("fieldValue" -> fieldValue).as(anorm.Macro.namedParser[AlgorithmScheduleDto].*);
   releaseConnection(connection);
   dtos
  }
  def getAlgorithmScheduleByGuid(guid : Long) : AlgorithmScheduleDto = {
   implicit val connection = getConnection();
   val dtos : AlgorithmScheduleDto= SQL("select * from algorithmSchedule where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[AlgorithmScheduleDto].single);
   releaseConnection(connection);
   dtos
  }  
 def getAlgorithmScheduleByPk(pkColValue : Long) : AlgorithmScheduleDto = { 
   implicit val connection = getConnection();  
   val dto : AlgorithmScheduleDto = SQL("select * from algorithmSchedule where algorithmScheduleId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[AlgorithmScheduleDto].single);  
   releaseConnection(connection);  
   dto  
 }  
 def getAlgorithmScheduleMaxId() : Long = { 
   implicit val connection = getConnection();  
   val maxid : Long = SQL("select max(algorithmScheduleId) as maxId from algorithmSchedule ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;  
   releaseConnection(connection);  
   maxid  
 }  
 def getAlgorithmScheduleByFkAlgorithmImplementationId(fkColValue : Long) : List[AlgorithmScheduleDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[AlgorithmScheduleDto] = SQL("select * from algorithmSchedule where algorithmImplementationId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[AlgorithmScheduleDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getAlgorithmScheduleByFkAlgorithmScheduleTypeId(fkColValue : Long) : List[AlgorithmScheduleDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[AlgorithmScheduleDto] = SQL("select * from algorithmSchedule where algorithmScheduleTypeId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[AlgorithmScheduleDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getAlgorithmScheduleByName(nameColValue : String) : List[AlgorithmScheduleDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[AlgorithmScheduleDto] = SQL("select * from algorithmSchedule where algorithmScheduleName = {nameColValue} ").on("nameColValue" -> nameColValue).as(anorm.Macro.namedParser[AlgorithmScheduleDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getAlgorithmScheduleFirstByName(nameColValue : String) : Option[AlgorithmScheduleDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[AlgorithmScheduleDto] = SQL("select * from algorithmSchedule where algorithmScheduleName = {nameColValue} ").on("nameColValue" -> nameColValue).as(anorm.Macro.namedParser[AlgorithmScheduleDto].*);  
   releaseConnection(connection);  
   if (dtos.size > 0) Some(dtos.head) else None  
 }  
 def insertAlgorithmScheduleDto(dto : AlgorithmScheduleDto): AlgorithmScheduleDto = { 
    implicit val connection = getConnection(); 
    val stat = dto.prepareInsert(getConnection()); 
    val resCnt = stat.executeUpdate(); 
    val rs = stat.getGeneratedKeys(); 
    if (rs.next()) { 
      val pkValue = rs.getLong(1); 
      val r = SQL("select * from algorithmSchedule where algorithmScheduleId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[AlgorithmScheduleDto].single); 
      releaseConnection(connection);  
      r 
    } else { 
      releaseConnection(connection);  
      null; 
    } 
 } 
  def createAndInsertAlgorithmScheduleDto(algorithmImplementationId : Long, algorithmScheduleTypeId : Long, algorithmScheduleName : String, isScheduled : Int, intervalValue : Long, isRunning : Int) : AlgorithmScheduleDto = {
    val dto = new AlgorithmScheduleDto(0,0,new Date(),new Date(),algorithmImplementationId,algorithmScheduleTypeId,algorithmScheduleName,isScheduled,intervalValue,isRunning)
    insertAlgorithmScheduleDto(dto);   
  }   
  def updateAlgorithmScheduleDto(dto : AlgorithmScheduleDto): AlgorithmScheduleDto = {  
    implicit val connection = getConnection();  
      val resCnt = SQL("update algorithmSchedule set  lastUpdatedDate = {lastUpdatedDate} ,  algorithmImplementationId = {algorithmImplementationId} ,  algorithmScheduleTypeId = {algorithmScheduleTypeId} ,  algorithmScheduleName = {algorithmScheduleName} ,  isScheduled = {isScheduled} ,  intervalValue = {intervalValue} ,  isRunning = {isRunning}  where  algorithmScheduleId = {algorithmScheduleId}  ")
      .on("lastUpdatedDate" -> dto.lastUpdatedDate , "algorithmImplementationId" -> dto.algorithmImplementationId , "algorithmScheduleTypeId" -> dto.algorithmScheduleTypeId , "algorithmScheduleName" -> dto.algorithmScheduleName , "isScheduled" -> dto.isScheduled , "intervalValue" -> dto.intervalValue , "isRunning" -> dto.isRunning, "algorithmScheduleId" -> dto.algorithmScheduleId ).executeInsert() 
   releaseConnection(connection);  
     getAlgorithmScheduleByPk(dto.algorithmScheduleId) 
    } 

} 