/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dao

import anorm.{SQL, SqlParser}
import com.mlasaf.dto._
import java.util.Date


 class ExecutorHostDao extends DaoBase { 

  def getExecutorHostsList() : List[ExecutorHostDto] = {
   implicit val connection = getConnection();
   val dtos : List[ExecutorHostDto]= SQL("select * from executorHost").as(anorm.Macro.namedParser[ExecutorHostDto].*);
   releaseConnection(connection);
   dtos
  }
  def getExecutorHostsCount() : Long = {
   implicit val connection = getConnection();
   val cnt : Long = SQL("select count(*) as cnt from executorHost").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);
   releaseConnection(connection);
   cnt
  }
  def getExecutorHostsLastInsertDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from executorHost").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);
   releaseConnection(connection);
   ld
  }
  def getExecutorHostsLastUpdatedDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from executorHost").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);
   releaseConnection(connection);
   ld
  }
  def getExecutorHostFirst() : ExecutorHostDto = {
   implicit val connection = getConnection();
   val dtos : ExecutorHostDto= SQL("select * from executorHost order by insertedRowDate asc ").as(anorm.Macro.namedParser[ExecutorHostDto].*).head;
   releaseConnection(connection);
   dtos
  }
  def getExecutorHostLast() : ExecutorHostDto = {
   implicit val connection = getConnection();
   val dtos : ExecutorHostDto= SQL("select * from executorHost order by insertedRowDate desc ").as(anorm.Macro.namedParser[ExecutorHostDto].*).head;
   releaseConnection(connection);
   dtos
  }
  def getExecutorHostsByField(fieldName : String, fieldValue : String) : List[ExecutorHostDto] = {
   implicit val connection = getConnection();
   val dtos : List[ExecutorHostDto]= SQL("select * from executorHost where " + fieldName + " = {fieldValue} ").on("fieldValue" -> fieldValue).as(anorm.Macro.namedParser[ExecutorHostDto].*);
   releaseConnection(connection);
   dtos
  }
  def getExecutorHostByGuid(guid : Long) : ExecutorHostDto = {
   implicit val connection = getConnection();
   val dtos : ExecutorHostDto= SQL("select * from executorHost where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[ExecutorHostDto].single);
   releaseConnection(connection);
   dtos
  }  
 def getExecutorHostByPk(pkColValue : Long) : ExecutorHostDto = { 
   implicit val connection = getConnection();  
   val dto : ExecutorHostDto = SQL("select * from executorHost where executorHostId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[ExecutorHostDto].single);  
   releaseConnection(connection);  
   dto  
 }  
 def getExecutorHostMaxId() : Long = { 
   implicit val connection = getConnection();  
   val maxid : Long = SQL("select max(executorHostId) as maxId from executorHost ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;  
   releaseConnection(connection);  
   maxid  
 }  
 def insertExecutorHostDto(dto : ExecutorHostDto): ExecutorHostDto = { 
    implicit val connection = getConnection(); 
    val stat = dto.prepareInsert(getConnection()); 
    val resCnt = stat.executeUpdate(); 
    val rs = stat.getGeneratedKeys(); 
    if (rs.next()) { 
      val pkValue = rs.getLong(1); 
      val r = SQL("select * from executorHost where executorHostId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[ExecutorHostDto].single); 
      releaseConnection(connection);  
      r 
    } else { 
      releaseConnection(connection);  
      null; 
    } 
 } 
  def createAndInsertExecutorHostDto(hostName : String, hostIp : String, hostDomain : String, hostOsType : String, hostOsVersion : String, isWorking : Int) : ExecutorHostDto = {
    val dto = new ExecutorHostDto(0,0,new Date(),new Date(),hostName,hostIp,hostDomain,hostOsType,hostOsVersion,isWorking)
    insertExecutorHostDto(dto);   
  }   
  def updateExecutorHostDto(dto : ExecutorHostDto): ExecutorHostDto = {  
    implicit val connection = getConnection();  
      val resCnt = SQL("update executorHost set  lastUpdatedDate = {lastUpdatedDate} ,  hostName = {hostName} ,  hostIp = {hostIp} ,  hostDomain = {hostDomain} ,  hostOsType = {hostOsType} ,  hostOsVersion = {hostOsVersion} ,  isWorking = {isWorking}  where  executorHostId = {executorHostId}  ")
      .on("lastUpdatedDate" -> dto.lastUpdatedDate , "hostName" -> dto.hostName , "hostIp" -> dto.hostIp , "hostDomain" -> dto.hostDomain , "hostOsType" -> dto.hostOsType , "hostOsVersion" -> dto.hostOsVersion , "isWorking" -> dto.isWorking, "executorHostId" -> dto.executorHostId ).executeInsert() 
   releaseConnection(connection);  
     getExecutorHostByPk(dto.executorHostId) 
    } 

} 