/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dao

import anorm.{SQL, SqlParser}
import com.mlasaf.dto._
import java.util.Date


 class ResourceManagerCheckDao extends DaoBase { 

  def getResourceManagerChecksList() : List[ResourceManagerCheckDto] = {
   implicit val connection = getConnection();
   val dtos : List[ResourceManagerCheckDto]= SQL("select * from resourceManagerCheck").as(anorm.Macro.namedParser[ResourceManagerCheckDto].*);
   releaseConnection(connection);
   dtos
  }
  def getResourceManagerChecksCount() : Long = {
   implicit val connection = getConnection();
   val cnt : Long = SQL("select count(*) as cnt from resourceManagerCheck").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);
   releaseConnection(connection);
   cnt
  }
  def getResourceManagerChecksLastInsertDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from resourceManagerCheck").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);
   releaseConnection(connection);
   ld
  }
  def getResourceManagerChecksLastUpdatedDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from resourceManagerCheck").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);
   releaseConnection(connection);
   ld
  }
  def getResourceManagerCheckFirst() : ResourceManagerCheckDto = {
   implicit val connection = getConnection();
   val dtos : ResourceManagerCheckDto= SQL("select * from resourceManagerCheck order by insertedRowDate asc ").as(anorm.Macro.namedParser[ResourceManagerCheckDto].*).head;
   releaseConnection(connection);
   dtos
  }
  def getResourceManagerCheckLast() : ResourceManagerCheckDto = {
   implicit val connection = getConnection();
   val dtos : ResourceManagerCheckDto= SQL("select * from resourceManagerCheck order by insertedRowDate desc ").as(anorm.Macro.namedParser[ResourceManagerCheckDto].*).head;
   releaseConnection(connection);
   dtos
  }
  def getResourceManagerChecksByField(fieldName : String, fieldValue : String) : List[ResourceManagerCheckDto] = {
   implicit val connection = getConnection();
   val dtos : List[ResourceManagerCheckDto]= SQL("select * from resourceManagerCheck where " + fieldName + " = {fieldValue} ").on("fieldValue" -> fieldValue).as(anorm.Macro.namedParser[ResourceManagerCheckDto].*);
   releaseConnection(connection);
   dtos
  }
  def getResourceManagerCheckByGuid(guid : Long) : ResourceManagerCheckDto = {
   implicit val connection = getConnection();
   val dtos : ResourceManagerCheckDto= SQL("select * from resourceManagerCheck where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[ResourceManagerCheckDto].single);
   releaseConnection(connection);
   dtos
  }  
 def getResourceManagerCheckByPk(pkColValue : Long) : ResourceManagerCheckDto = { 
   implicit val connection = getConnection();  
   val dto : ResourceManagerCheckDto = SQL("select * from resourceManagerCheck where resourceManagerCheckId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[ResourceManagerCheckDto].single);  
   releaseConnection(connection);  
   dto  
 }  
 def getResourceManagerCheckMaxId() : Long = { 
   implicit val connection = getConnection();  
   val maxid : Long = SQL("select max(resourceManagerCheckId) as maxId from resourceManagerCheck ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;  
   releaseConnection(connection);  
   maxid  
 }  
 def getResourceManagerCheckByFkExecutorHostId(fkColValue : Long) : List[ResourceManagerCheckDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[ResourceManagerCheckDto] = SQL("select * from resourceManagerCheck where executorHostId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[ResourceManagerCheckDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getResourceManagerCheckByFkResourceManagerId(fkColValue : Long) : List[ResourceManagerCheckDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[ResourceManagerCheckDto] = SQL("select * from resourceManagerCheck where resourceManagerId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[ResourceManagerCheckDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def insertResourceManagerCheckDto(dto : ResourceManagerCheckDto): ResourceManagerCheckDto = { 
    implicit val connection = getConnection(); 
    val stat = dto.prepareInsert(getConnection()); 
    val resCnt = stat.executeUpdate(); 
    val rs = stat.getGeneratedKeys(); 
    if (rs.next()) { 
      val pkValue = rs.getLong(1); 
      val r = SQL("select * from resourceManagerCheck where resourceManagerCheckId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[ResourceManagerCheckDto].single); 
      releaseConnection(connection);  
      r 
    } else { 
      releaseConnection(connection);  
      null; 
    } 
 } 
  def createAndInsertResourceManagerCheckDto(resourceManagerId : Long, executorHostId : Long, resourceManagerStatus : String) : ResourceManagerCheckDto = {
    val dto = new ResourceManagerCheckDto(0,0,new Date(),new Date(),resourceManagerId,executorHostId,resourceManagerStatus)
    insertResourceManagerCheckDto(dto);   
  }   
  def updateResourceManagerCheckDto(dto : ResourceManagerCheckDto): ResourceManagerCheckDto = {  
    implicit val connection = getConnection();  
      val resCnt = SQL("update resourceManagerCheck set  lastUpdatedDate = {lastUpdatedDate} ,  resourceManagerId = {resourceManagerId} ,  executorHostId = {executorHostId} ,  resourceManagerStatus = {resourceManagerStatus}  where  resourceManagerCheckId = {resourceManagerCheckId}  ")
      .on("lastUpdatedDate" -> dto.lastUpdatedDate , "resourceManagerId" -> dto.resourceManagerId , "executorHostId" -> dto.executorHostId , "resourceManagerStatus" -> dto.resourceManagerStatus, "resourceManagerCheckId" -> dto.resourceManagerCheckId ).executeInsert() 
   releaseConnection(connection);  
     getResourceManagerCheckByPk(dto.resourceManagerCheckId) 
    } 

} 
