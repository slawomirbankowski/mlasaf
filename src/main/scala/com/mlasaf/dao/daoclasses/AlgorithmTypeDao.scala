/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dao

import anorm.{SQL, SqlParser}
import com.mlasaf.dto._
import java.util.Date


 class AlgorithmTypeDao extends DaoBase { 

  def getAlgorithmTypesList() : List[AlgorithmTypeDto] = {
   implicit val connection = getConnection();
   val dtos : List[AlgorithmTypeDto]= SQL("select * from algorithmType").as(anorm.Macro.namedParser[AlgorithmTypeDto].*);
   dtos
  }
  def getAlgorithmTypesCount() : Long = {
   implicit val connection = getConnection();
   val cnt : Long = SQL("select count(*) as cnt from algorithmType").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
   cnt
  }
  def getAlgorithmTypesLastInsertDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from algorithmType").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
   ld
  }
  def getAlgorithmTypesLastUpdatedDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from algorithmType").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
   ld
  }
  def getAlgorithmTypeFirst() : AlgorithmTypeDto = {
   implicit val connection = getConnection();
   val dtos : AlgorithmTypeDto= SQL("select * from algorithmType order by insertedRowDate asc ").as(anorm.Macro.namedParser[AlgorithmTypeDto].*).head;
   dtos
  }
  def getAlgorithmTypeLast() : AlgorithmTypeDto = {
   implicit val connection = getConnection();
   val dtos : AlgorithmTypeDto= SQL("select * from algorithmType order by insertedRowDate desc ").as(anorm.Macro.namedParser[AlgorithmTypeDto].*).head;
   dtos
  }
  def getAlgorithmTypeByGuid(guid : Long) : AlgorithmTypeDto = {
   implicit val connection = getConnection();
   val dtos : AlgorithmTypeDto= SQL("select * from algorithmType where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[AlgorithmTypeDto].single);
   dtos
  }  
 def getAlgorithmTypeByPk(pkColValue : Long) : AlgorithmTypeDto = { 
   implicit val connection = getConnection();  
   val dto : AlgorithmTypeDto = SQL("select * from algorithmType where algorithmTypeId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[AlgorithmTypeDto].single);  
   dto  
 }  
 def getAlgorithmTypeMaxId() : Long = { 
   implicit val connection = getConnection();  
   val maxid : Long = SQL("select max(algorithmTypeId) as maxId from algorithmType ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;  
   maxid  
 }  
 def getAlgorithmTypeByName(nameColValue : String) : List[AlgorithmTypeDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[AlgorithmTypeDto] = SQL("select * from algorithmType where algorithmTypeName = {nameColValue} ").on("nameColValue" -> nameColValue).as(anorm.Macro.namedParser[AlgorithmTypeDto].*);  
   dtos  
 }  
 def getAlgorithmTypeFirstByName(nameColValue : String) : Option[AlgorithmTypeDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[AlgorithmTypeDto] = SQL("select * from algorithmType where algorithmTypeName = {nameColValue} ").on("nameColValue" -> nameColValue).as(anorm.Macro.namedParser[AlgorithmTypeDto].*);  
   if (dtos.size > 0) Some(dtos.head) else None  
 }  
 def insertAlgorithmTypeDto(dto : AlgorithmTypeDto): AlgorithmTypeDto = { 
    implicit val connection = getConnection(); 
    val stat = dto.prepareInsert(getConnection()); 
    val resCnt = stat.executeUpdate(); 
    val rs = stat.getGeneratedKeys(); 
    if (rs.next()) { 
      val pkValue = rs.getLong(1); 
      SQL("select * from algorithmType where algorithmTypeId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[AlgorithmTypeDto].single); 
    } else { 
      null; 
    } 
 } 
  def createAndInsertAlgorithmTypeDto(algorithmTypeName : String, algorithmTypeDescription : String) : AlgorithmTypeDto = {
    val dto = new AlgorithmTypeDto(0,0,new Date(),new Date(),algorithmTypeName,algorithmTypeDescription)
    insertAlgorithmTypeDto(dto);   
  }   
  def updateAlgorithmTypeDto(dto : AlgorithmTypeDto): AlgorithmTypeDto = {  
    implicit val connection = getConnection();  
      val resCnt = SQL("update algorithmType set  lastUpdatedDate = {lastUpdatedDate} ,  algorithmTypeName = {algorithmTypeName} ,  algorithmTypeDescription = {algorithmTypeDescription}  where  algorithmTypeId = {algorithmTypeId}  ")
      .on("lastUpdatedDate" -> dto.lastUpdatedDate , "algorithmTypeName" -> dto.algorithmTypeName , "algorithmTypeDescription" -> dto.algorithmTypeDescription, "algorithmTypeId" -> dto.algorithmTypeId ).executeInsert() 
     getAlgorithmTypeByPk(dto.algorithmTypeId) 
    } 

} 
