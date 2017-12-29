/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dao

import anorm.{SQL, SqlParser}
import com.mlasaf.dto._
import java.util.Date


 class ExecutorInstanceDao extends DaoBase { 

  def getExecutorInstancesList() : List[ExecutorInstanceDto] = {
   implicit val connection = getConnection();
   val dtos : List[ExecutorInstanceDto]= SQL("select * from executorInstance").as(anorm.Macro.namedParser[ExecutorInstanceDto].*);
   dtos
  }
  def getExecutorInstancesCount() : Long = {
   implicit val connection = getConnection();
   val cnt : Long = SQL("select count(*) as cnt from executorInstance").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
   cnt
  }
  def getExecutorInstancesLastInsertDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from executorInstance").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
   ld
  }
  def getExecutorInstancesLastUpdatedDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from executorInstance").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
   ld
  }
  def getExecutorInstanceFirst() : ExecutorInstanceDto = {
   implicit val connection = getConnection();
   val dtos : ExecutorInstanceDto= SQL("select * from executorInstance order by insertedRowDate asc ").as(anorm.Macro.namedParser[ExecutorInstanceDto].*).head;
   dtos
  }
  def getExecutorInstanceLast() : ExecutorInstanceDto = {
   implicit val connection = getConnection();
   val dtos : ExecutorInstanceDto= SQL("select * from executorInstance order by insertedRowDate desc ").as(anorm.Macro.namedParser[ExecutorInstanceDto].*).head;
   dtos
  }
  def getExecutorInstanceByGuid(guid : Long) : ExecutorInstanceDto = {
   implicit val connection = getConnection();
   val dtos : ExecutorInstanceDto= SQL("select * from executorInstance where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[ExecutorInstanceDto].single);
   dtos
  }  
 def getExecutorInstanceByPk(pkColValue : Long) : ExecutorInstanceDto = { 
   implicit val connection = getConnection();  
   val dto : ExecutorInstanceDto = SQL("select * from executorInstance where executorInstanceId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[ExecutorInstanceDto].single);  
   dto  
 }  
 def getExecutorInstanceMaxId() : Long = { 
   implicit val connection = getConnection();  
   val maxid : Long = SQL("select max(executorInstanceId) as maxId from executorInstance ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;  
   maxid  
 }  
 def getExecutorInstanceByFkExecutorContextId(fkColValue : Long) : List[ExecutorInstanceDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[ExecutorInstanceDto] = SQL("select * from executorInstance where executorContextId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[ExecutorInstanceDto].*);  
   dtos  
 }  
 def getExecutorInstanceByFkExecutorHostId(fkColValue : Long) : List[ExecutorInstanceDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[ExecutorInstanceDto] = SQL("select * from executorInstance where executorHostId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[ExecutorInstanceDto].*);  
   dtos  
 }  
 def getExecutorInstanceByFkExecutorTypeId(fkColValue : Long) : List[ExecutorInstanceDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[ExecutorInstanceDto] = SQL("select * from executorInstance where executorTypeId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[ExecutorInstanceDto].*);  
   dtos  
 }  
 def getExecutorInstanceByName(nameColValue : String) : List[ExecutorInstanceDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[ExecutorInstanceDto] = SQL("select * from executorInstance where executorInstanceName = {nameColValue} ").on("nameColValue" -> nameColValue).as(anorm.Macro.namedParser[ExecutorInstanceDto].*);  
   dtos  
 }  
 def getExecutorInstanceFirstByName(nameColValue : String) : Option[ExecutorInstanceDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[ExecutorInstanceDto] = SQL("select * from executorInstance where executorInstanceName = {nameColValue} ").on("nameColValue" -> nameColValue).as(anorm.Macro.namedParser[ExecutorInstanceDto].*);  
   if (dtos.size > 0) Some(dtos.head) else None  
 }  
 def insertExecutorInstanceDto(dto : ExecutorInstanceDto): ExecutorInstanceDto = { 
    implicit val connection = getConnection(); 
    val stat = dto.prepareInsert(getConnection()); 
    val resCnt = stat.executeUpdate(); 
    val rs = stat.getGeneratedKeys(); 
    if (rs.next()) { 
      val pkValue = rs.getLong(1); 
      SQL("select * from executorInstance where executorInstanceId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[ExecutorInstanceDto].single); 
    } else { 
      null; 
    } 
 } 
  def createAndInsertExecutorInstanceDto(executorTypeId : Long, executorHostId : Long, executorContextId : Long, executorInstanceName : String, isRunning : Int, isFinished : Int, portNumber : Int, endDate : java.util.Date) : ExecutorInstanceDto = {
    val dto = new ExecutorInstanceDto(0,0,new Date(),new Date(),executorTypeId,executorHostId,executorContextId,executorInstanceName,isRunning,isFinished,portNumber,endDate)
    insertExecutorInstanceDto(dto);   
  }   
  def updateExecutorInstanceDto(dto : ExecutorInstanceDto): ExecutorInstanceDto = {  
    implicit val connection = getConnection();  
      val resCnt = SQL("update executorInstance set  lastUpdatedDate = {lastUpdatedDate} ,  executorTypeId = {executorTypeId} ,  executorHostId = {executorHostId} ,  executorContextId = {executorContextId} ,  executorInstanceName = {executorInstanceName} ,  isRunning = {isRunning} ,  isFinished = {isFinished} ,  portNumber = {portNumber} ,  endDate = {endDate}  where  executorInstanceId = {executorInstanceId}  ")
      .on("lastUpdatedDate" -> dto.lastUpdatedDate , "executorTypeId" -> dto.executorTypeId , "executorHostId" -> dto.executorHostId , "executorContextId" -> dto.executorContextId , "executorInstanceName" -> dto.executorInstanceName , "isRunning" -> dto.isRunning , "isFinished" -> dto.isFinished , "portNumber" -> dto.portNumber , "endDate" -> dto.endDate, "executorInstanceId" -> dto.executorInstanceId ).executeInsert() 
     getExecutorInstanceByPk(dto.executorInstanceId) 
    } 

} 
