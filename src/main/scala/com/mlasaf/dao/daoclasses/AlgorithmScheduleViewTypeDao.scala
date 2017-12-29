/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dao

import anorm.{SQL, SqlParser}
import com.mlasaf.dto._
import java.util.Date


 class AlgorithmScheduleViewTypeDao extends DaoBase { 

  def getAlgorithmScheduleViewTypesList() : List[AlgorithmScheduleViewTypeDto] = {
   implicit val connection = getConnection();
   val dtos : List[AlgorithmScheduleViewTypeDto]= SQL("select * from algorithmScheduleViewType").as(anorm.Macro.namedParser[AlgorithmScheduleViewTypeDto].*);
   dtos
  }
  def getAlgorithmScheduleViewTypesCount() : Long = {
   implicit val connection = getConnection();
   val cnt : Long = SQL("select count(*) as cnt from algorithmScheduleViewType").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
   cnt
  }
  def getAlgorithmScheduleViewTypesLastInsertDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from algorithmScheduleViewType").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
   ld
  }
  def getAlgorithmScheduleViewTypesLastUpdatedDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from algorithmScheduleViewType").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
   ld
  }
  def getAlgorithmScheduleViewTypeFirst() : AlgorithmScheduleViewTypeDto = {
   implicit val connection = getConnection();
   val dtos : AlgorithmScheduleViewTypeDto= SQL("select * from algorithmScheduleViewType order by insertedRowDate asc ").as(anorm.Macro.namedParser[AlgorithmScheduleViewTypeDto].*).head;
   dtos
  }
  def getAlgorithmScheduleViewTypeLast() : AlgorithmScheduleViewTypeDto = {
   implicit val connection = getConnection();
   val dtos : AlgorithmScheduleViewTypeDto= SQL("select * from algorithmScheduleViewType order by insertedRowDate desc ").as(anorm.Macro.namedParser[AlgorithmScheduleViewTypeDto].*).head;
   dtos
  }
  def getAlgorithmScheduleViewTypeByGuid(guid : Long) : AlgorithmScheduleViewTypeDto = {
   implicit val connection = getConnection();
   val dtos : AlgorithmScheduleViewTypeDto= SQL("select * from algorithmScheduleViewType where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[AlgorithmScheduleViewTypeDto].single);
   dtos
  }  
 def getAlgorithmScheduleViewTypeByPk(pkColValue : Long) : AlgorithmScheduleViewTypeDto = { 
   implicit val connection = getConnection();  
   val dto : AlgorithmScheduleViewTypeDto = SQL("select * from algorithmScheduleViewType where algorithmScheduleViewTypeId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[AlgorithmScheduleViewTypeDto].single);  
   dto  
 }  
 def getAlgorithmScheduleViewTypeMaxId() : Long = { 
   implicit val connection = getConnection();  
   val maxid : Long = SQL("select max(algorithmScheduleViewTypeId) as maxId from algorithmScheduleViewType ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;  
   maxid  
 }  
 def getAlgorithmScheduleViewTypeByName(nameColValue : String) : List[AlgorithmScheduleViewTypeDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[AlgorithmScheduleViewTypeDto] = SQL("select * from algorithmScheduleViewType where algorithmScheduleViewTypeName = {nameColValue} ").on("nameColValue" -> nameColValue).as(anorm.Macro.namedParser[AlgorithmScheduleViewTypeDto].*);  
   dtos  
 }  
 def getAlgorithmScheduleViewTypeFirstByName(nameColValue : String) : Option[AlgorithmScheduleViewTypeDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[AlgorithmScheduleViewTypeDto] = SQL("select * from algorithmScheduleViewType where algorithmScheduleViewTypeName = {nameColValue} ").on("nameColValue" -> nameColValue).as(anorm.Macro.namedParser[AlgorithmScheduleViewTypeDto].*);  
   if (dtos.size > 0) Some(dtos.head) else None  
 }  
 def insertAlgorithmScheduleViewTypeDto(dto : AlgorithmScheduleViewTypeDto): AlgorithmScheduleViewTypeDto = { 
    implicit val connection = getConnection(); 
    val stat = dto.prepareInsert(getConnection()); 
    val resCnt = stat.executeUpdate(); 
    val rs = stat.getGeneratedKeys(); 
    if (rs.next()) { 
      val pkValue = rs.getLong(1); 
      SQL("select * from algorithmScheduleViewType where algorithmScheduleViewTypeId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[AlgorithmScheduleViewTypeDto].single); 
    } else { 
      null; 
    } 
 } 
  def createAndInsertAlgorithmScheduleViewTypeDto(algorithmScheduleViewTypeName : String) : AlgorithmScheduleViewTypeDto = {
    val dto = new AlgorithmScheduleViewTypeDto(0,0,new Date(),new Date(),algorithmScheduleViewTypeName)
    insertAlgorithmScheduleViewTypeDto(dto);   
  }   
  def updateAlgorithmScheduleViewTypeDto(dto : AlgorithmScheduleViewTypeDto): AlgorithmScheduleViewTypeDto = {  
    implicit val connection = getConnection();  
      val resCnt = SQL("update algorithmScheduleViewType set  lastUpdatedDate = {lastUpdatedDate} ,  algorithmScheduleViewTypeName = {algorithmScheduleViewTypeName}  where  algorithmScheduleViewTypeId = {algorithmScheduleViewTypeId}  ")
      .on("lastUpdatedDate" -> dto.lastUpdatedDate , "algorithmScheduleViewTypeName" -> dto.algorithmScheduleViewTypeName, "algorithmScheduleViewTypeId" -> dto.algorithmScheduleViewTypeId ).executeInsert() 
     getAlgorithmScheduleViewTypeByPk(dto.algorithmScheduleViewTypeId) 
    } 

} 
