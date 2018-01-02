/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dao

import anorm.{SQL, SqlParser}
import com.mlasaf.dto._
import java.util.Date


 class AlgorithmTypeVersionDao extends DaoBase { 

  def getAlgorithmTypeVersionsList() : List[AlgorithmTypeVersionDto] = {
   implicit val connection = getConnection();
   val dtos : List[AlgorithmTypeVersionDto]= SQL("select * from algorithmTypeVersion").as(anorm.Macro.namedParser[AlgorithmTypeVersionDto].*);
   releaseConnection(connection);
   dtos
  }
  def getAlgorithmTypeVersionsCount() : Long = {
   implicit val connection = getConnection();
   val cnt : Long = SQL("select count(*) as cnt from algorithmTypeVersion").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);
   releaseConnection(connection);
   cnt
  }
  def getAlgorithmTypeVersionsLastInsertDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from algorithmTypeVersion").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);
   releaseConnection(connection);
   ld
  }
  def getAlgorithmTypeVersionsLastUpdatedDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from algorithmTypeVersion").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);
   releaseConnection(connection);
   ld
  }
  def getAlgorithmTypeVersionFirst() : AlgorithmTypeVersionDto = {
   implicit val connection = getConnection();
   val dtos : AlgorithmTypeVersionDto= SQL("select * from algorithmTypeVersion order by insertedRowDate asc ").as(anorm.Macro.namedParser[AlgorithmTypeVersionDto].*).head;
   releaseConnection(connection);
   dtos
  }
  def getAlgorithmTypeVersionLast() : AlgorithmTypeVersionDto = {
   implicit val connection = getConnection();
   val dtos : AlgorithmTypeVersionDto= SQL("select * from algorithmTypeVersion order by insertedRowDate desc ").as(anorm.Macro.namedParser[AlgorithmTypeVersionDto].*).head;
   releaseConnection(connection);
   dtos
  }
  def getAlgorithmTypeVersionsByField(fieldName : String, fieldValue : String) : List[AlgorithmTypeVersionDto] = {
   implicit val connection = getConnection();
   val dtos : List[AlgorithmTypeVersionDto]= SQL("select * from algorithmTypeVersion where " + fieldName + " = {fieldValue} ").on("fieldValue" -> fieldValue).as(anorm.Macro.namedParser[AlgorithmTypeVersionDto].*);
   releaseConnection(connection);
   dtos
  }
  def getAlgorithmTypeVersionByGuid(guid : Long) : AlgorithmTypeVersionDto = {
   implicit val connection = getConnection();
   val dtos : AlgorithmTypeVersionDto= SQL("select * from algorithmTypeVersion where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[AlgorithmTypeVersionDto].single);
   releaseConnection(connection);
   dtos
  }  
 def getAlgorithmTypeVersionByPk(pkColValue : Long) : AlgorithmTypeVersionDto = { 
   implicit val connection = getConnection();  
   val dto : AlgorithmTypeVersionDto = SQL("select * from algorithmTypeVersion where algorithmTypeVersionId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[AlgorithmTypeVersionDto].single);  
   releaseConnection(connection);  
   dto  
 }  
 def getAlgorithmTypeVersionMaxId() : Long = { 
   implicit val connection = getConnection();  
   val maxid : Long = SQL("select max(algorithmTypeVersionId) as maxId from algorithmTypeVersion ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;  
   releaseConnection(connection);  
   maxid  
 }  
 def getAlgorithmTypeVersionByFkAlgorithmTypeId(fkColValue : Long) : List[AlgorithmTypeVersionDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[AlgorithmTypeVersionDto] = SQL("select * from algorithmTypeVersion where algorithmTypeId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[AlgorithmTypeVersionDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getAlgorithmTypeVersionByName(nameColValue : String) : List[AlgorithmTypeVersionDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[AlgorithmTypeVersionDto] = SQL("select * from algorithmTypeVersion where algorithmTypeVersionName = {nameColValue} ").on("nameColValue" -> nameColValue).as(anorm.Macro.namedParser[AlgorithmTypeVersionDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getAlgorithmTypeVersionFirstByName(nameColValue : String) : Option[AlgorithmTypeVersionDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[AlgorithmTypeVersionDto] = SQL("select * from algorithmTypeVersion where algorithmTypeVersionName = {nameColValue} ").on("nameColValue" -> nameColValue).as(anorm.Macro.namedParser[AlgorithmTypeVersionDto].*);  
   releaseConnection(connection);  
   if (dtos.size > 0) Some(dtos.head) else None  
 }  
 def insertAlgorithmTypeVersionDto(dto : AlgorithmTypeVersionDto): AlgorithmTypeVersionDto = { 
    implicit val connection = getConnection(); 
    val stat = dto.prepareInsert(getConnection()); 
    val resCnt = stat.executeUpdate(); 
    val rs = stat.getGeneratedKeys(); 
    if (rs.next()) { 
      val pkValue = rs.getLong(1); 
      val r = SQL("select * from algorithmTypeVersion where algorithmTypeVersionId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[AlgorithmTypeVersionDto].single); 
      releaseConnection(connection);  
      r 
    } else { 
      releaseConnection(connection);  
      null; 
    } 
 } 
  def createAndInsertAlgorithmTypeVersionDto(algorithmTypeId : Long, algorithmTypeVersionName : String) : AlgorithmTypeVersionDto = {
    val dto = new AlgorithmTypeVersionDto(0,new Date(),new Date(),0,algorithmTypeId,algorithmTypeVersionName)
    insertAlgorithmTypeVersionDto(dto);   
  }   
  def updateAlgorithmTypeVersionDto(dto : AlgorithmTypeVersionDto): AlgorithmTypeVersionDto = {  
    implicit val connection = getConnection();  
      val resCnt = SQL("update algorithmTypeVersion set  lastUpdatedDate = {lastUpdatedDate} ,  algorithmTypeId = {algorithmTypeId} ,  algorithmTypeVersionName = {algorithmTypeVersionName}  where  algorithmTypeVersionId = {algorithmTypeVersionId}  ")
      .on("lastUpdatedDate" -> dto.lastUpdatedDate , "algorithmTypeId" -> dto.algorithmTypeId , "algorithmTypeVersionName" -> dto.algorithmTypeVersionName, "algorithmTypeVersionId" -> dto.algorithmTypeVersionId ).executeInsert() 
   releaseConnection(connection);  
     getAlgorithmTypeVersionByPk(dto.algorithmTypeVersionId) 
    } 

} 
