/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dao

import anorm.{SQL, SqlParser}
import com.mlasaf.dto._
import java.util.Date


 class ExecutorRestCallDao extends DaoBase { 

  def getExecutorRestCallsList() : List[ExecutorRestCallDto] = {
   implicit val connection = getConnection();
   val dtos : List[ExecutorRestCallDto]= SQL("select * from executorRestCall").as(anorm.Macro.namedParser[ExecutorRestCallDto].*);
   releaseConnection(connection);
   dtos
  }
  def getExecutorRestCallsCount() : Long = {
   implicit val connection = getConnection();
   val cnt : Long = SQL("select count(*) as cnt from executorRestCall").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);
   releaseConnection(connection);
   cnt
  }
  def getExecutorRestCallsLastInsertDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from executorRestCall").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);
   releaseConnection(connection);
   ld
  }
  def getExecutorRestCallsLastUpdatedDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from executorRestCall").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);
   releaseConnection(connection);
   ld
  }
  def getExecutorRestCallFirst() : ExecutorRestCallDto = {
   implicit val connection = getConnection();
   val dtos : ExecutorRestCallDto= SQL("select * from executorRestCall order by insertedRowDate asc ").as(anorm.Macro.namedParser[ExecutorRestCallDto].*).head;
   releaseConnection(connection);
   dtos
  }
  def getExecutorRestCallLast() : ExecutorRestCallDto = {
   implicit val connection = getConnection();
   val dtos : ExecutorRestCallDto= SQL("select * from executorRestCall order by insertedRowDate desc ").as(anorm.Macro.namedParser[ExecutorRestCallDto].*).head;
   releaseConnection(connection);
   dtos
  }
  def getExecutorRestCallsByField(fieldName : String, fieldValue : String) : List[ExecutorRestCallDto] = {
   implicit val connection = getConnection();
   val dtos : List[ExecutorRestCallDto]= SQL("select * from executorRestCall where " + fieldName + " = {fieldValue} ").on("fieldValue" -> fieldValue).as(anorm.Macro.namedParser[ExecutorRestCallDto].*);
   releaseConnection(connection);
   dtos
  }
  def getExecutorRestCallByGuid(guid : Long) : ExecutorRestCallDto = {
   implicit val connection = getConnection();
   val dtos : ExecutorRestCallDto= SQL("select * from executorRestCall where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[ExecutorRestCallDto].single);
   releaseConnection(connection);
   dtos
  }  
 def getExecutorRestCallByPk(pkColValue : Long) : ExecutorRestCallDto = { 
   implicit val connection = getConnection();  
   val dto : ExecutorRestCallDto = SQL("select * from executorRestCall where executorRestCallId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[ExecutorRestCallDto].single);  
   releaseConnection(connection);  
   dto  
 }  
 def getExecutorRestCallMaxId() : Long = { 
   implicit val connection = getConnection();  
   val maxid : Long = SQL("select max(executorRestCallId) as maxId from executorRestCall ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;  
   releaseConnection(connection);  
   maxid  
 }  
 def getExecutorRestCallByFkExecutorHostId(fkColValue : Long) : List[ExecutorRestCallDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[ExecutorRestCallDto] = SQL("select * from executorRestCall where executorHostId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[ExecutorRestCallDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getExecutorRestCallByFkExecutorRestId(fkColValue : Long) : List[ExecutorRestCallDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[ExecutorRestCallDto] = SQL("select * from executorRestCall where executorRestId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[ExecutorRestCallDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def insertExecutorRestCallDto(dto : ExecutorRestCallDto): ExecutorRestCallDto = { 
    implicit val connection = getConnection(); 
    val stat = dto.prepareInsert(getConnection()); 
    val resCnt = stat.executeUpdate(); 
    val rs = stat.getGeneratedKeys(); 
    if (rs.next()) { 
      val pkValue = rs.getLong(1); 
      val r = SQL("select * from executorRestCall where executorRestCallId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[ExecutorRestCallDto].single); 
      releaseConnection(connection);  
      r 
    } else { 
      releaseConnection(connection);  
      null; 
    } 
 } 
  def createAndInsertExecutorRestCallDto(executorHostId : Long, executorRestId : Long, requestMethod : String, requestHeader : String, requestBody : String, responseBody : String) : ExecutorRestCallDto = {
    val dto = new ExecutorRestCallDto(0,0,new Date(),new Date(),executorHostId,executorRestId,requestMethod,requestHeader,requestBody,responseBody)
    insertExecutorRestCallDto(dto);   
  }   
  def updateExecutorRestCallDto(dto : ExecutorRestCallDto): ExecutorRestCallDto = {  
    implicit val connection = getConnection();  
      val resCnt = SQL("update executorRestCall set  lastUpdatedDate = {lastUpdatedDate} ,  executorHostId = {executorHostId} ,  executorRestId = {executorRestId} ,  requestMethod = {requestMethod} ,  requestHeader = {requestHeader} ,  requestBody = {requestBody} ,  responseBody = {responseBody}  where  executorRestCallId = {executorRestCallId}  ")
      .on("lastUpdatedDate" -> dto.lastUpdatedDate , "executorHostId" -> dto.executorHostId , "executorRestId" -> dto.executorRestId , "requestMethod" -> dto.requestMethod , "requestHeader" -> dto.requestHeader , "requestBody" -> dto.requestBody , "responseBody" -> dto.responseBody, "executorRestCallId" -> dto.executorRestCallId ).executeInsert() 
   releaseConnection(connection);  
     getExecutorRestCallByPk(dto.executorRestCallId) 
    } 

} 
