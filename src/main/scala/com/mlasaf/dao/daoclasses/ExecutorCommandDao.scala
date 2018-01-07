/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dao

import anorm.{SQL, SqlParser}
import com.mlasaf.dto._
import java.util.Date


 class ExecutorCommandDao extends DaoBase { 

  def getExecutorCommandsList() : List[ExecutorCommandDto] = {
   implicit val connection = getConnection();
   val dtos : List[ExecutorCommandDto]= SQL("select * from executorCommand").as(anorm.Macro.namedParser[ExecutorCommandDto].*);
   releaseConnection(connection);
   dtos
  }
  def getExecutorCommandsCount() : Long = {
   implicit val connection = getConnection();
   val cnt : Long = SQL("select count(*) as cnt from executorCommand").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);
   releaseConnection(connection);
   cnt
  }
  def getExecutorCommandsLastInsertDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from executorCommand").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);
   releaseConnection(connection);
   ld
  }
  def getExecutorCommandsLastUpdatedDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from executorCommand").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);
   releaseConnection(connection);
   ld
  }
  def getExecutorCommandFirst() : ExecutorCommandDto = {
   implicit val connection = getConnection();
   val dtos : ExecutorCommandDto= SQL("select * from executorCommand order by insertedRowDate asc ").as(anorm.Macro.namedParser[ExecutorCommandDto].*).head;
   releaseConnection(connection);
   dtos
  }
  def getExecutorCommandLast() : ExecutorCommandDto = {
   implicit val connection = getConnection();
   val dtos : ExecutorCommandDto= SQL("select * from executorCommand order by insertedRowDate desc ").as(anorm.Macro.namedParser[ExecutorCommandDto].*).head;
   releaseConnection(connection);
   dtos
  }
  def getExecutorCommandsByField(fieldName : String, fieldValue : String) : List[ExecutorCommandDto] = {
   implicit val connection = getConnection();
   val dtos : List[ExecutorCommandDto]= SQL("select * from executorCommand where " + fieldName + " = {fieldValue} ").on("fieldValue" -> fieldValue).as(anorm.Macro.namedParser[ExecutorCommandDto].*);
   releaseConnection(connection);
   dtos
  }
  def getExecutorCommandByGuid(guid : Long) : ExecutorCommandDto = {
   implicit val connection = getConnection();
   val dtos : ExecutorCommandDto= SQL("select * from executorCommand where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[ExecutorCommandDto].single);
   releaseConnection(connection);
   dtos
  }  
 def getExecutorCommandByPk(pkColValue : Long) : ExecutorCommandDto = { 
   implicit val connection = getConnection();  
   val dto : ExecutorCommandDto = SQL("select * from executorCommand where executorCommandId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[ExecutorCommandDto].single);  
   releaseConnection(connection);  
   dto  
 }  
 def getExecutorCommandMaxId() : Long = { 
   implicit val connection = getConnection();  
   val maxid : Long = SQL("select max(executorCommandId) as maxId from executorCommand ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;  
   releaseConnection(connection);  
   maxid  
 }  
 def getExecutorCommandByName(nameColValue : String) : List[ExecutorCommandDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[ExecutorCommandDto] = SQL("select * from executorCommand where executorCommandName = {nameColValue} ").on("nameColValue" -> nameColValue).as(anorm.Macro.namedParser[ExecutorCommandDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getExecutorCommandFirstByName(nameColValue : String) : Option[ExecutorCommandDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[ExecutorCommandDto] = SQL("select * from executorCommand where executorCommandName = {nameColValue} ").on("nameColValue" -> nameColValue).as(anorm.Macro.namedParser[ExecutorCommandDto].*);  
   releaseConnection(connection);  
   if (dtos.size > 0) Some(dtos.head) else None  
 }  
 def insertExecutorCommandDto(dto : ExecutorCommandDto): ExecutorCommandDto = { 
    implicit val connection = getConnection(); 
    val stat = dto.prepareInsert(connection); 
    val resCnt = stat.executeUpdate(); 
    val rs = stat.getGeneratedKeys(); 
    if (rs.next()) { 
      val pkValue = rs.getLong(1); 
      val r = SQL("select * from executorCommand where executorCommandId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[ExecutorCommandDto].single); 
      releaseConnection(connection);  
      r 
    } else { 
      releaseConnection(connection);  
      null; 
    } 
 } 
  def createAndInsertExecutorCommandDto(executorCommandName : String, executorCommandClass : String) : ExecutorCommandDto = {
    val dto = new ExecutorCommandDto(0,0,new Date(),new Date(),executorCommandName,executorCommandClass)
    insertExecutorCommandDto(dto);   
  }   
  def updateExecutorCommandDto(dto : ExecutorCommandDto): ExecutorCommandDto = {  
    implicit val connection = getConnection();  
      val resCnt = SQL("update executorCommand set  lastUpdatedDate = {lastUpdatedDate} ,  executorCommandName = {executorCommandName} ,  executorCommandClass = {executorCommandClass}  where  executorCommandId = {executorCommandId}  ")
      .on("lastUpdatedDate" -> dto.lastUpdatedDate , "executorCommandName" -> dto.executorCommandName , "executorCommandClass" -> dto.executorCommandClass, "executorCommandId" -> dto.executorCommandId ).executeInsert() 
   releaseConnection(connection);  
     getExecutorCommandByPk(dto.executorCommandId) 
    } 

} 
