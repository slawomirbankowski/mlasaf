/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dao

import anorm.{SQL, SqlParser}
import com.mlasaf.dto._
import java.util.Date


 class ExecutorContextStateDao extends DaoBase { 

  def getExecutorContextStatesList() : List[ExecutorContextStateDto] = {
   implicit val connection = getConnection();
   val dtos : List[ExecutorContextStateDto]= SQL("select * from executorContextState").as(anorm.Macro.namedParser[ExecutorContextStateDto].*);
   releaseConnection(connection);
   dtos
  }
  def getExecutorContextStatesCount() : Long = {
   implicit val connection = getConnection();
   val cnt : Long = SQL("select count(*) as cnt from executorContextState").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);
   releaseConnection(connection);
   cnt
  }
  def getExecutorContextStatesLastInsertDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from executorContextState").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);
   releaseConnection(connection);
   ld
  }
  def getExecutorContextStatesLastUpdatedDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from executorContextState").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);
   releaseConnection(connection);
   ld
  }
  def getExecutorContextStateFirst() : ExecutorContextStateDto = {
   implicit val connection = getConnection();
   val dtos : ExecutorContextStateDto= SQL("select * from executorContextState order by insertedRowDate asc ").as(anorm.Macro.namedParser[ExecutorContextStateDto].*).head;
   releaseConnection(connection);
   dtos
  }
  def getExecutorContextStateLast() : ExecutorContextStateDto = {
   implicit val connection = getConnection();
   val dtos : ExecutorContextStateDto= SQL("select * from executorContextState order by insertedRowDate desc ").as(anorm.Macro.namedParser[ExecutorContextStateDto].*).head;
   releaseConnection(connection);
   dtos
  }
  def getExecutorContextStatesByField(fieldName : String, fieldValue : String) : List[ExecutorContextStateDto] = {
   implicit val connection = getConnection();
   val dtos : List[ExecutorContextStateDto]= SQL("select * from executorContextState where " + fieldName + " = {fieldValue} ").on("fieldValue" -> fieldValue).as(anorm.Macro.namedParser[ExecutorContextStateDto].*);
   releaseConnection(connection);
   dtos
  }
  def getExecutorContextStateByGuid(guid : Long) : ExecutorContextStateDto = {
   implicit val connection = getConnection();
   val dtos : ExecutorContextStateDto= SQL("select * from executorContextState where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[ExecutorContextStateDto].single);
   releaseConnection(connection);
   dtos
  }  
 def getExecutorContextStateByPk(pkColValue : Long) : ExecutorContextStateDto = { 
   implicit val connection = getConnection();  
   val dto : ExecutorContextStateDto = SQL("select * from executorContextState where executorContextStateId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[ExecutorContextStateDto].single);  
   releaseConnection(connection);  
   dto  
 }  
 def getExecutorContextStateMaxId() : Long = { 
   implicit val connection = getConnection();  
   val maxid : Long = SQL("select max(executorContextStateId) as maxId from executorContextState ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;  
   releaseConnection(connection);  
   maxid  
 }  
 def getExecutorContextStateByFkExecutorContextId(fkColValue : Long) : List[ExecutorContextStateDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[ExecutorContextStateDto] = SQL("select * from executorContextState where executorContextId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[ExecutorContextStateDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def insertExecutorContextStateDto(dto : ExecutorContextStateDto): ExecutorContextStateDto = { 
    implicit val connection = getConnection(); 
    val stat = dto.prepareInsert(connection); 
    val resCnt = stat.executeUpdate(); 
    val rs = stat.getGeneratedKeys(); 
    if (rs.next()) { 
      val pkValue = rs.getLong(1); 
      val r = SQL("select * from executorContextState where executorContextStateId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[ExecutorContextStateDto].single); 
      releaseConnection(connection);  
      r 
    } else { 
      releaseConnection(connection);  
      null; 
    } 
 } 
  def createAndInsertExecutorContextStateDto(executorContextId : Long, stateName : String, infoContent : String, exceptionDescription : String) : ExecutorContextStateDto = {
    val dto = new ExecutorContextStateDto(0,0,new Date(),new Date(),executorContextId,stateName,infoContent,exceptionDescription)
    insertExecutorContextStateDto(dto);   
  }   
  def updateExecutorContextStateDto(dto : ExecutorContextStateDto): ExecutorContextStateDto = {  
    implicit val connection = getConnection();  
      val resCnt = SQL("update executorContextState set  lastUpdatedDate = {lastUpdatedDate} ,  executorContextId = {executorContextId} ,  stateName = {stateName} ,  infoContent = {infoContent} ,  exceptionDescription = {exceptionDescription}  where  executorContextStateId = {executorContextStateId}  ")
      .on("lastUpdatedDate" -> dto.lastUpdatedDate , "executorContextId" -> dto.executorContextId , "stateName" -> dto.stateName , "infoContent" -> dto.infoContent , "exceptionDescription" -> dto.exceptionDescription, "executorContextStateId" -> dto.executorContextStateId ).executeInsert() 
   releaseConnection(connection);  
     getExecutorContextStateByPk(dto.executorContextStateId) 
    } 

} 
