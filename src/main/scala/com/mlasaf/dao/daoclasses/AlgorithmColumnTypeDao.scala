/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dao

import anorm.{SQL, SqlParser}
import com.mlasaf.dto._
import java.util.Date


 class AlgorithmColumnTypeDao extends DaoBase { 

  def getAlgorithmColumnTypesList() : List[AlgorithmColumnTypeDto] = {
   implicit val connection = getConnection();
   val dtos : List[AlgorithmColumnTypeDto]= SQL("select * from algorithmColumnType").as(anorm.Macro.namedParser[AlgorithmColumnTypeDto].*);
   releaseConnection(connection);
   dtos
  }
  def getAlgorithmColumnTypesCount() : Long = {
   implicit val connection = getConnection();
   val cnt : Long = SQL("select count(*) as cnt from algorithmColumnType").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);
   releaseConnection(connection);
   cnt
  }
  def getAlgorithmColumnTypesLastInsertDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from algorithmColumnType").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);
   releaseConnection(connection);
   ld
  }
  def getAlgorithmColumnTypesLastUpdatedDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from algorithmColumnType").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);
   releaseConnection(connection);
   ld
  }
  def getAlgorithmColumnTypeFirst() : AlgorithmColumnTypeDto = {
   implicit val connection = getConnection();
   val dtos : AlgorithmColumnTypeDto= SQL("select * from algorithmColumnType order by insertedRowDate asc ").as(anorm.Macro.namedParser[AlgorithmColumnTypeDto].*).head;
   releaseConnection(connection);
   dtos
  }
  def getAlgorithmColumnTypeLast() : AlgorithmColumnTypeDto = {
   implicit val connection = getConnection();
   val dtos : AlgorithmColumnTypeDto= SQL("select * from algorithmColumnType order by insertedRowDate desc ").as(anorm.Macro.namedParser[AlgorithmColumnTypeDto].*).head;
   releaseConnection(connection);
   dtos
  }
  def getAlgorithmColumnTypesByField(fieldName : String, fieldValue : String) : List[AlgorithmColumnTypeDto] = {
   implicit val connection = getConnection();
   val dtos : List[AlgorithmColumnTypeDto]= SQL("select * from algorithmColumnType where " + fieldName + " = {fieldValue} ").on("fieldValue" -> fieldValue).as(anorm.Macro.namedParser[AlgorithmColumnTypeDto].*);
   releaseConnection(connection);
   dtos
  }
  def getAlgorithmColumnTypeByGuid(guid : Long) : AlgorithmColumnTypeDto = {
   implicit val connection = getConnection();
   val dtos : AlgorithmColumnTypeDto= SQL("select * from algorithmColumnType where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[AlgorithmColumnTypeDto].single);
   releaseConnection(connection);
   dtos
  }  
 def getAlgorithmColumnTypeByPk(pkColValue : Long) : AlgorithmColumnTypeDto = { 
   implicit val connection = getConnection();  
   val dto : AlgorithmColumnTypeDto = SQL("select * from algorithmColumnType where algorithmColumnTypeId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[AlgorithmColumnTypeDto].single);  
   releaseConnection(connection);  
   dto  
 }  
 def getAlgorithmColumnTypeMaxId() : Long = { 
   implicit val connection = getConnection();  
   val maxid : Long = SQL("select max(algorithmColumnTypeId) as maxId from algorithmColumnType ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;  
   releaseConnection(connection);  
   maxid  
 }  
 def getAlgorithmColumnTypeByName(nameColValue : String) : List[AlgorithmColumnTypeDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[AlgorithmColumnTypeDto] = SQL("select * from algorithmColumnType where algorithmColumnTypeName = {nameColValue} ").on("nameColValue" -> nameColValue).as(anorm.Macro.namedParser[AlgorithmColumnTypeDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getAlgorithmColumnTypeFirstByName(nameColValue : String) : Option[AlgorithmColumnTypeDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[AlgorithmColumnTypeDto] = SQL("select * from algorithmColumnType where algorithmColumnTypeName = {nameColValue} ").on("nameColValue" -> nameColValue).as(anorm.Macro.namedParser[AlgorithmColumnTypeDto].*);  
   releaseConnection(connection);  
   if (dtos.size > 0) Some(dtos.head) else None  
 }  
 def insertAlgorithmColumnTypeDto(dto : AlgorithmColumnTypeDto): AlgorithmColumnTypeDto = { 
    implicit val connection = getConnection(); 
    val stat = dto.prepareInsert(getConnection()); 
    val resCnt = stat.executeUpdate(); 
    val rs = stat.getGeneratedKeys(); 
    if (rs.next()) { 
      val pkValue = rs.getLong(1); 
      val r = SQL("select * from algorithmColumnType where algorithmColumnTypeId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[AlgorithmColumnTypeDto].single); 
      releaseConnection(connection);  
      r 
    } else { 
      releaseConnection(connection);  
      null; 
    } 
 } 
  def createAndInsertAlgorithmColumnTypeDto(algorithmColumnTypeName : String, algorithmColumnTypeDescription : String) : AlgorithmColumnTypeDto = {
    val dto = new AlgorithmColumnTypeDto(0,0,new Date(),new Date(),algorithmColumnTypeName,algorithmColumnTypeDescription)
    insertAlgorithmColumnTypeDto(dto);   
  }   
  def updateAlgorithmColumnTypeDto(dto : AlgorithmColumnTypeDto): AlgorithmColumnTypeDto = {  
    implicit val connection = getConnection();  
      val resCnt = SQL("update algorithmColumnType set  lastUpdatedDate = {lastUpdatedDate} ,  algorithmColumnTypeName = {algorithmColumnTypeName} ,  algorithmColumnTypeDescription = {algorithmColumnTypeDescription}  where  algorithmColumnTypeId = {algorithmColumnTypeId}  ")
      .on("lastUpdatedDate" -> dto.lastUpdatedDate , "algorithmColumnTypeName" -> dto.algorithmColumnTypeName , "algorithmColumnTypeDescription" -> dto.algorithmColumnTypeDescription, "algorithmColumnTypeId" -> dto.algorithmColumnTypeId ).executeInsert() 
   releaseConnection(connection);  
     getAlgorithmColumnTypeByPk(dto.algorithmColumnTypeId) 
    } 

} 
