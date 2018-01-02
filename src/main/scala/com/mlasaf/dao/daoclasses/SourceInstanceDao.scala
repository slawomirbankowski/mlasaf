/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dao

import anorm.{SQL, SqlParser}
import com.mlasaf.dto._
import java.util.Date


 class SourceInstanceDao extends DaoBase { 

  def getSourceInstancesList() : List[SourceInstanceDto] = {
   implicit val connection = getConnection();
   val dtos : List[SourceInstanceDto]= SQL("select * from sourceInstance").as(anorm.Macro.namedParser[SourceInstanceDto].*);
   releaseConnection(connection);
   dtos
  }
  def getSourceInstancesCount() : Long = {
   implicit val connection = getConnection();
   val cnt : Long = SQL("select count(*) as cnt from sourceInstance").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);
   releaseConnection(connection);
   cnt
  }
  def getSourceInstancesLastInsertDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from sourceInstance").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);
   releaseConnection(connection);
   ld
  }
  def getSourceInstancesLastUpdatedDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from sourceInstance").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);
   releaseConnection(connection);
   ld
  }
  def getSourceInstanceFirst() : SourceInstanceDto = {
   implicit val connection = getConnection();
   val dtos : SourceInstanceDto= SQL("select * from sourceInstance order by insertedRowDate asc ").as(anorm.Macro.namedParser[SourceInstanceDto].*).head;
   releaseConnection(connection);
   dtos
  }
  def getSourceInstanceLast() : SourceInstanceDto = {
   implicit val connection = getConnection();
   val dtos : SourceInstanceDto= SQL("select * from sourceInstance order by insertedRowDate desc ").as(anorm.Macro.namedParser[SourceInstanceDto].*).head;
   releaseConnection(connection);
   dtos
  }
  def getSourceInstancesByField(fieldName : String, fieldValue : String) : List[SourceInstanceDto] = {
   implicit val connection = getConnection();
   val dtos : List[SourceInstanceDto]= SQL("select * from sourceInstance where " + fieldName + " = {fieldValue} ").on("fieldValue" -> fieldValue).as(anorm.Macro.namedParser[SourceInstanceDto].*);
   releaseConnection(connection);
   dtos
  }
  def getSourceInstanceByGuid(guid : Long) : SourceInstanceDto = {
   implicit val connection = getConnection();
   val dtos : SourceInstanceDto= SQL("select * from sourceInstance where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[SourceInstanceDto].single);
   releaseConnection(connection);
   dtos
  }  
 def getSourceInstanceByPk(pkColValue : Long) : SourceInstanceDto = { 
   implicit val connection = getConnection();  
   val dto : SourceInstanceDto = SQL("select * from sourceInstance where sourceInstanceId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[SourceInstanceDto].single);  
   releaseConnection(connection);  
   dto  
 }  
 def getSourceInstanceMaxId() : Long = { 
   implicit val connection = getConnection();  
   val maxid : Long = SQL("select max(sourceInstanceId) as maxId from sourceInstance ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;  
   releaseConnection(connection);  
   maxid  
 }  
 def getSourceInstanceByFkSourceTypeId(fkColValue : Long) : List[SourceInstanceDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[SourceInstanceDto] = SQL("select * from sourceInstance where sourceTypeId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[SourceInstanceDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getSourceInstanceByName(nameColValue : String) : List[SourceInstanceDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[SourceInstanceDto] = SQL("select * from sourceInstance where sourceInstanceName = {nameColValue} ").on("nameColValue" -> nameColValue).as(anorm.Macro.namedParser[SourceInstanceDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getSourceInstanceFirstByName(nameColValue : String) : Option[SourceInstanceDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[SourceInstanceDto] = SQL("select * from sourceInstance where sourceInstanceName = {nameColValue} ").on("nameColValue" -> nameColValue).as(anorm.Macro.namedParser[SourceInstanceDto].*);  
   releaseConnection(connection);  
   if (dtos.size > 0) Some(dtos.head) else None  
 }  
 def insertSourceInstanceDto(dto : SourceInstanceDto): SourceInstanceDto = { 
    implicit val connection = getConnection(); 
    val stat = dto.prepareInsert(getConnection()); 
    val resCnt = stat.executeUpdate(); 
    val rs = stat.getGeneratedKeys(); 
    if (rs.next()) { 
      val pkValue = rs.getLong(1); 
      val r = SQL("select * from sourceInstance where sourceInstanceId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[SourceInstanceDto].single); 
      releaseConnection(connection);  
      r 
    } else { 
      releaseConnection(connection);  
      null; 
    } 
 } 
  def createAndInsertSourceInstanceDto(sourceTypeId : Long, sourceInstanceName : String, errorCount : Long, correctCount : Long, lastStatus : String, lastConnectionDate : java.util.Date) : SourceInstanceDto = {
    val dto = new SourceInstanceDto(0,0,new Date(),new Date(),sourceTypeId,sourceInstanceName,errorCount,correctCount,lastStatus,lastConnectionDate)
    insertSourceInstanceDto(dto);   
  }   
  def updateSourceInstanceDto(dto : SourceInstanceDto): SourceInstanceDto = {  
    implicit val connection = getConnection();  
      val resCnt = SQL("update sourceInstance set  lastUpdatedDate = {lastUpdatedDate} ,  sourceTypeId = {sourceTypeId} ,  sourceInstanceName = {sourceInstanceName} ,  errorCount = {errorCount} ,  correctCount = {correctCount} ,  lastStatus = {lastStatus} ,  lastConnectionDate = {lastConnectionDate}  where  sourceInstanceId = {sourceInstanceId}  ")
      .on("lastUpdatedDate" -> dto.lastUpdatedDate , "sourceTypeId" -> dto.sourceTypeId , "sourceInstanceName" -> dto.sourceInstanceName , "errorCount" -> dto.errorCount , "correctCount" -> dto.correctCount , "lastStatus" -> dto.lastStatus , "lastConnectionDate" -> dto.lastConnectionDate, "sourceInstanceId" -> dto.sourceInstanceId ).executeInsert() 
   releaseConnection(connection);  
     getSourceInstanceByPk(dto.sourceInstanceId) 
    } 

} 
