/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dao

import anorm.{SQL, SqlParser}
import com.mlasaf.dto._
import java.util.Date


 class AlgorithmRunTypeDao extends DaoBase { 

  def getAlgorithmRunTypesList() : List[AlgorithmRunTypeDto] = {
   implicit val connection = getConnection();
   val dtos : List[AlgorithmRunTypeDto]= SQL("select * from algorithmRunType").as(anorm.Macro.namedParser[AlgorithmRunTypeDto].*);
   releaseConnection(connection);
   dtos
  }
  def getAlgorithmRunTypesCount() : Long = {
   implicit val connection = getConnection();
   val cnt : Long = SQL("select count(*) as cnt from algorithmRunType").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);
   releaseConnection(connection);
   cnt
  }
  def getAlgorithmRunTypesLastInsertDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from algorithmRunType").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);
   releaseConnection(connection);
   ld
  }
  def getAlgorithmRunTypesLastUpdatedDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from algorithmRunType").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);
   releaseConnection(connection);
   ld
  }
  def getAlgorithmRunTypeFirst() : AlgorithmRunTypeDto = {
   implicit val connection = getConnection();
   val dtos : AlgorithmRunTypeDto= SQL("select * from algorithmRunType order by insertedRowDate asc ").as(anorm.Macro.namedParser[AlgorithmRunTypeDto].*).head;
   releaseConnection(connection);
   dtos
  }
  def getAlgorithmRunTypeLast() : AlgorithmRunTypeDto = {
   implicit val connection = getConnection();
   val dtos : AlgorithmRunTypeDto= SQL("select * from algorithmRunType order by insertedRowDate desc ").as(anorm.Macro.namedParser[AlgorithmRunTypeDto].*).head;
   releaseConnection(connection);
   dtos
  }
  def getAlgorithmRunTypesByField(fieldName : String, fieldValue : String) : List[AlgorithmRunTypeDto] = {
   implicit val connection = getConnection();
   val dtos : List[AlgorithmRunTypeDto]= SQL("select * from algorithmRunType where " + fieldName + " = {fieldValue} ").on("fieldValue" -> fieldValue).as(anorm.Macro.namedParser[AlgorithmRunTypeDto].*);
   releaseConnection(connection);
   dtos
  }
  def getAlgorithmRunTypeByGuid(guid : Long) : AlgorithmRunTypeDto = {
   implicit val connection = getConnection();
   val dtos : AlgorithmRunTypeDto= SQL("select * from algorithmRunType where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[AlgorithmRunTypeDto].single);
   releaseConnection(connection);
   dtos
  }  
 def getAlgorithmRunTypeByPk(pkColValue : Long) : AlgorithmRunTypeDto = { 
   implicit val connection = getConnection();  
   val dto : AlgorithmRunTypeDto = SQL("select * from algorithmRunType where algorithmRunTypeId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[AlgorithmRunTypeDto].single);  
   releaseConnection(connection);  
   dto  
 }  
 def getAlgorithmRunTypeMaxId() : Long = { 
   implicit val connection = getConnection();  
   val maxid : Long = SQL("select max(algorithmRunTypeId) as maxId from algorithmRunType ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;  
   releaseConnection(connection);  
   maxid  
 }  
 def getAlgorithmRunTypeByName(nameColValue : String) : List[AlgorithmRunTypeDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[AlgorithmRunTypeDto] = SQL("select * from algorithmRunType where algorithmRunTypeName = {nameColValue} ").on("nameColValue" -> nameColValue).as(anorm.Macro.namedParser[AlgorithmRunTypeDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getAlgorithmRunTypeFirstByName(nameColValue : String) : Option[AlgorithmRunTypeDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[AlgorithmRunTypeDto] = SQL("select * from algorithmRunType where algorithmRunTypeName = {nameColValue} ").on("nameColValue" -> nameColValue).as(anorm.Macro.namedParser[AlgorithmRunTypeDto].*);  
   releaseConnection(connection);  
   if (dtos.size > 0) Some(dtos.head) else None  
 }  
 def insertAlgorithmRunTypeDto(dto : AlgorithmRunTypeDto): AlgorithmRunTypeDto = { 
    implicit val connection = getConnection(); 
    val stat = dto.prepareInsert(getConnection()); 
    val resCnt = stat.executeUpdate(); 
    val rs = stat.getGeneratedKeys(); 
    if (rs.next()) { 
      val pkValue = rs.getLong(1); 
      val r = SQL("select * from algorithmRunType where algorithmRunTypeId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[AlgorithmRunTypeDto].single); 
      releaseConnection(connection);  
      r 
    } else { 
      releaseConnection(connection);  
      null; 
    } 
 } 
  def createAndInsertAlgorithmRunTypeDto(algorithmRunTypeName : String) : AlgorithmRunTypeDto = {
    val dto = new AlgorithmRunTypeDto(0,0,new Date(),new Date(),algorithmRunTypeName)
    insertAlgorithmRunTypeDto(dto);   
  }   
  def updateAlgorithmRunTypeDto(dto : AlgorithmRunTypeDto): AlgorithmRunTypeDto = {  
    implicit val connection = getConnection();  
      val resCnt = SQL("update algorithmRunType set  lastUpdatedDate = {lastUpdatedDate} ,  algorithmRunTypeName = {algorithmRunTypeName}  where  algorithmRunTypeId = {algorithmRunTypeId}  ")
      .on("lastUpdatedDate" -> dto.lastUpdatedDate , "algorithmRunTypeName" -> dto.algorithmRunTypeName, "algorithmRunTypeId" -> dto.algorithmRunTypeId ).executeInsert() 
   releaseConnection(connection);  
     getAlgorithmRunTypeByPk(dto.algorithmRunTypeId) 
    } 

} 