/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dao

import anorm.{SQL, SqlParser}
import com.mlasaf.dto._
import java.util.Date


 class ExecutorContextCommandDao extends DaoBase { 

  def getExecutorContextCommandsList() : List[ExecutorContextCommandDto] = {
   implicit val connection = getConnection();
   val dtos : List[ExecutorContextCommandDto]= SQL("select * from executorContextCommand").as(anorm.Macro.namedParser[ExecutorContextCommandDto].*);
   releaseConnection(connection);
   dtos
  }
  def getExecutorContextCommandsCount() : Long = {
   implicit val connection = getConnection();
   val cnt : Long = SQL("select count(*) as cnt from executorContextCommand").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);
   releaseConnection(connection);
   cnt
  }
  def getExecutorContextCommandsLastInsertDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from executorContextCommand").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);
   releaseConnection(connection);
   ld
  }
  def getExecutorContextCommandsLastUpdatedDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from executorContextCommand").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);
   releaseConnection(connection);
   ld
  }
  def getExecutorContextCommandFirst() : ExecutorContextCommandDto = {
   implicit val connection = getConnection();
   val dtos : ExecutorContextCommandDto= SQL("select * from executorContextCommand order by insertedRowDate asc ").as(anorm.Macro.namedParser[ExecutorContextCommandDto].*).head;
   releaseConnection(connection);
   dtos
  }
  def getExecutorContextCommandLast() : ExecutorContextCommandDto = {
   implicit val connection = getConnection();
   val dtos : ExecutorContextCommandDto= SQL("select * from executorContextCommand order by insertedRowDate desc ").as(anorm.Macro.namedParser[ExecutorContextCommandDto].*).head;
   releaseConnection(connection);
   dtos
  }
  def getExecutorContextCommandsByField(fieldName : String, fieldValue : String) : List[ExecutorContextCommandDto] = {
   implicit val connection = getConnection();
   val dtos : List[ExecutorContextCommandDto]= SQL("select * from executorContextCommand where " + fieldName + " = {fieldValue} ").on("fieldValue" -> fieldValue).as(anorm.Macro.namedParser[ExecutorContextCommandDto].*);
   releaseConnection(connection);
   dtos
  }
  def getExecutorContextCommandByGuid(guid : Long) : ExecutorContextCommandDto = {
   implicit val connection = getConnection();
   val dtos : ExecutorContextCommandDto= SQL("select * from executorContextCommand where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[ExecutorContextCommandDto].single);
   releaseConnection(connection);
   dtos
  }  
 def getExecutorContextCommandByPk(pkColValue : Long) : ExecutorContextCommandDto = { 
   implicit val connection = getConnection();  
   val dto : ExecutorContextCommandDto = SQL("select * from executorContextCommand where executorContextCommandId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[ExecutorContextCommandDto].single);  
   releaseConnection(connection);  
   dto  
 }  
 def getExecutorContextCommandMaxId() : Long = { 
   implicit val connection = getConnection();  
   val maxid : Long = SQL("select max(executorContextCommandId) as maxId from executorContextCommand ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;  
   releaseConnection(connection);  
   maxid  
 }  
 def getExecutorContextCommandByFkExecutorContextId(fkColValue : Long) : List[ExecutorContextCommandDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[ExecutorContextCommandDto] = SQL("select * from executorContextCommand where executorContextId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[ExecutorContextCommandDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getExecutorContextCommandByFkExecutorCommandId(fkColValue : Long) : List[ExecutorContextCommandDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[ExecutorContextCommandDto] = SQL("select * from executorContextCommand where executorCommandId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[ExecutorContextCommandDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def insertExecutorContextCommandDto(dto : ExecutorContextCommandDto): ExecutorContextCommandDto = { 
    implicit val connection = getConnection(); 
    val stat = dto.prepareInsert(getConnection()); 
    val resCnt = stat.executeUpdate(); 
    val rs = stat.getGeneratedKeys(); 
    if (rs.next()) { 
      val pkValue = rs.getLong(1); 
      val r = SQL("select * from executorContextCommand where executorContextCommandId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[ExecutorContextCommandDto].single); 
      releaseConnection(connection);  
      r 
    } else { 
      releaseConnection(connection);  
      null; 
    } 
 } 
  def createAndInsertExecutorContextCommandDto(executorContextId : Long, executorCommandId : Long, isRunning : Int, isExecuted : Int, commandParam1 : String, commandParam2 : String, commandParam3 : String, commandParam4 : String, commandParam5 : String) : ExecutorContextCommandDto = {
    val dto = new ExecutorContextCommandDto(0,0,new Date(),new Date(),executorContextId,executorCommandId,isRunning,isExecuted,commandParam1,commandParam2,commandParam3,commandParam4,commandParam5)
    insertExecutorContextCommandDto(dto);   
  }   
  def updateExecutorContextCommandDto(dto : ExecutorContextCommandDto): ExecutorContextCommandDto = {  
    implicit val connection = getConnection();  
      val resCnt = SQL("update executorContextCommand set  lastUpdatedDate = {lastUpdatedDate} ,  executorContextId = {executorContextId} ,  executorCommandId = {executorCommandId} ,  isRunning = {isRunning} ,  isExecuted = {isExecuted} ,  commandParam1 = {commandParam1} ,  commandParam2 = {commandParam2} ,  commandParam3 = {commandParam3} ,  commandParam4 = {commandParam4} ,  commandParam5 = {commandParam5}  where  executorContextCommandId = {executorContextCommandId}  ")
      .on("lastUpdatedDate" -> dto.lastUpdatedDate , "executorContextId" -> dto.executorContextId , "executorCommandId" -> dto.executorCommandId , "isRunning" -> dto.isRunning , "isExecuted" -> dto.isExecuted , "commandParam1" -> dto.commandParam1 , "commandParam2" -> dto.commandParam2 , "commandParam3" -> dto.commandParam3 , "commandParam4" -> dto.commandParam4 , "commandParam5" -> dto.commandParam5, "executorContextCommandId" -> dto.executorContextCommandId ).executeInsert() 
   releaseConnection(connection);  
     getExecutorContextCommandByPk(dto.executorContextCommandId) 
    } 

} 
