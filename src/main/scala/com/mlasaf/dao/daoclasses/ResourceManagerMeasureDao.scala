/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dao

import anorm.{SQL, SqlParser}
import com.mlasaf.dto._
import java.util.Date


 class ResourceManagerMeasureDao extends DaoBase { 

  def getResourceManagerMeasuresList() : List[ResourceManagerMeasureDto] = {
   implicit val connection = getConnection();
   val dtos : List[ResourceManagerMeasureDto]= SQL("select * from resourceManagerMeasure").as(anorm.Macro.namedParser[ResourceManagerMeasureDto].*);
   dtos
  }
  def getResourceManagerMeasuresCount() : Long = {
   implicit val connection = getConnection();
   val cnt : Long = SQL("select count(*) as cnt from resourceManagerMeasure").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
   cnt
  }
  def getResourceManagerMeasuresLastInsertDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from resourceManagerMeasure").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
   ld
  }
  def getResourceManagerMeasuresLastUpdatedDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from resourceManagerMeasure").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
   ld
  }
  def getResourceManagerMeasureFirst() : ResourceManagerMeasureDto = {
   implicit val connection = getConnection();
   val dtos : ResourceManagerMeasureDto= SQL("select * from resourceManagerMeasure order by insertedRowDate asc ").as(anorm.Macro.namedParser[ResourceManagerMeasureDto].*).head;
   dtos
  }
  def getResourceManagerMeasureLast() : ResourceManagerMeasureDto = {
   implicit val connection = getConnection();
   val dtos : ResourceManagerMeasureDto= SQL("select * from resourceManagerMeasure order by insertedRowDate desc ").as(anorm.Macro.namedParser[ResourceManagerMeasureDto].*).head;
   dtos
  }
  def getResourceManagerMeasureByGuid(guid : Long) : ResourceManagerMeasureDto = {
   implicit val connection = getConnection();
   val dtos : ResourceManagerMeasureDto= SQL("select * from resourceManagerMeasure where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[ResourceManagerMeasureDto].single);
   dtos
  }  
 def getResourceManagerMeasureByPk(pkColValue : Long) : ResourceManagerMeasureDto = { 
   implicit val connection = getConnection();  
   val dto : ResourceManagerMeasureDto = SQL("select * from resourceManagerMeasure where resourceManagerMeasureId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[ResourceManagerMeasureDto].single);  
   dto  
 }  
 def getResourceManagerMeasureMaxId() : Long = { 
   implicit val connection = getConnection();  
   val maxid : Long = SQL("select max(resourceManagerMeasureId) as maxId from resourceManagerMeasure ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;  
   maxid  
 }  
 def getResourceManagerMeasureByFkResourceManagerId(fkColValue : Long) : List[ResourceManagerMeasureDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[ResourceManagerMeasureDto] = SQL("select * from resourceManagerMeasure where resourceManagerId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[ResourceManagerMeasureDto].*);  
   dtos  
 }  
 def getResourceManagerMeasureByFkResourceMeasureId(fkColValue : Long) : List[ResourceManagerMeasureDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[ResourceManagerMeasureDto] = SQL("select * from resourceManagerMeasure where resourceMeasureId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[ResourceManagerMeasureDto].*);  
   dtos  
 }  
 def insertResourceManagerMeasureDto(dto : ResourceManagerMeasureDto): ResourceManagerMeasureDto = { 
    implicit val connection = getConnection(); 
    val stat = dto.prepareInsert(getConnection()); 
    val resCnt = stat.executeUpdate(); 
    val rs = stat.getGeneratedKeys(); 
    if (rs.next()) { 
      val pkValue = rs.getLong(1); 
      SQL("select * from resourceManagerMeasure where resourceManagerMeasureId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[ResourceManagerMeasureDto].single); 
    } else { 
      null; 
    } 
 } 
  def createAndInsertResourceManagerMeasureDto(resourceManagerId : Long, resourceMeasureId : Long, measureString : String, measureValue : Double) : ResourceManagerMeasureDto = {
    val dto = new ResourceManagerMeasureDto(0,0,new Date(),new Date(),resourceManagerId,resourceMeasureId,measureString,measureValue)
    insertResourceManagerMeasureDto(dto);   
  }   
  def updateResourceManagerMeasureDto(dto : ResourceManagerMeasureDto): ResourceManagerMeasureDto = {  
    implicit val connection = getConnection();  
      val resCnt = SQL("update resourceManagerMeasure set  lastUpdatedDate = {lastUpdatedDate} ,  resourceManagerId = {resourceManagerId} ,  resourceMeasureId = {resourceMeasureId} ,  measureString = {measureString} ,  measureValue = {measureValue}  where  resourceManagerMeasureId = {resourceManagerMeasureId}  ")
      .on("lastUpdatedDate" -> dto.lastUpdatedDate , "resourceManagerId" -> dto.resourceManagerId , "resourceMeasureId" -> dto.resourceMeasureId , "measureString" -> dto.measureString , "measureValue" -> dto.measureValue, "resourceManagerMeasureId" -> dto.resourceManagerMeasureId ).executeInsert() 
     getResourceManagerMeasureByPk(dto.resourceManagerMeasureId) 
    } 

} 
