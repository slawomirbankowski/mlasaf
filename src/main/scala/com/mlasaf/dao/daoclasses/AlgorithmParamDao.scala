/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dao

import anorm.{SQL, SqlParser}
import com.mlasaf.dto._
import java.util.Date


 class AlgorithmParamDao extends DaoBase { 

  def getAlgorithmParamsList() : List[AlgorithmParamDto] = {
   implicit val connection = getConnection();
   val dtos : List[AlgorithmParamDto]= SQL("select * from algorithmParam").as(anorm.Macro.namedParser[AlgorithmParamDto].*);
   releaseConnection(connection);
   dtos
  }
  def getAlgorithmParamsCount() : Long = {
   implicit val connection = getConnection();
   val cnt : Long = SQL("select count(*) as cnt from algorithmParam").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);
   releaseConnection(connection);
   cnt
  }
  def getAlgorithmParamsLastInsertDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from algorithmParam").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);
   releaseConnection(connection);
   ld
  }
  def getAlgorithmParamsLastUpdatedDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from algorithmParam").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);
   releaseConnection(connection);
   ld
  }
  def getAlgorithmParamFirst() : AlgorithmParamDto = {
   implicit val connection = getConnection();
   val dtos : AlgorithmParamDto= SQL("select * from algorithmParam order by insertedRowDate asc ").as(anorm.Macro.namedParser[AlgorithmParamDto].*).head;
   releaseConnection(connection);
   dtos
  }
  def getAlgorithmParamLast() : AlgorithmParamDto = {
   implicit val connection = getConnection();
   val dtos : AlgorithmParamDto= SQL("select * from algorithmParam order by insertedRowDate desc ").as(anorm.Macro.namedParser[AlgorithmParamDto].*).head;
   releaseConnection(connection);
   dtos
  }
  def getAlgorithmParamsByField(fieldName : String, fieldValue : String) : List[AlgorithmParamDto] = {
   implicit val connection = getConnection();
   val dtos : List[AlgorithmParamDto]= SQL("select * from algorithmParam where " + fieldName + " = {fieldValue} ").on("fieldValue" -> fieldValue).as(anorm.Macro.namedParser[AlgorithmParamDto].*);
   releaseConnection(connection);
   dtos
  }
  def getAlgorithmParamByGuid(guid : Long) : AlgorithmParamDto = {
   implicit val connection = getConnection();
   val dtos : AlgorithmParamDto= SQL("select * from algorithmParam where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[AlgorithmParamDto].single);
   releaseConnection(connection);
   dtos
  }  
 def getAlgorithmParamByPk(pkColValue : Long) : AlgorithmParamDto = { 
   implicit val connection = getConnection();  
   val dto : AlgorithmParamDto = SQL("select * from algorithmParam where algorithmParamId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[AlgorithmParamDto].single);  
   releaseConnection(connection);  
   dto  
 }  
 def getAlgorithmParamMaxId() : Long = { 
   implicit val connection = getConnection();  
   val maxid : Long = SQL("select max(algorithmParamId) as maxId from algorithmParam ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;  
   releaseConnection(connection);  
   maxid  
 }  
 def getAlgorithmParamByName(nameColValue : String) : List[AlgorithmParamDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[AlgorithmParamDto] = SQL("select * from algorithmParam where algorithmParamName = {nameColValue} ").on("nameColValue" -> nameColValue).as(anorm.Macro.namedParser[AlgorithmParamDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getAlgorithmParamFirstByName(nameColValue : String) : Option[AlgorithmParamDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[AlgorithmParamDto] = SQL("select * from algorithmParam where algorithmParamName = {nameColValue} ").on("nameColValue" -> nameColValue).as(anorm.Macro.namedParser[AlgorithmParamDto].*);  
   releaseConnection(connection);  
   if (dtos.size > 0) Some(dtos.head) else None  
 }  
 def insertAlgorithmParamDto(dto : AlgorithmParamDto): AlgorithmParamDto = { 
    implicit val connection = getConnection(); 
    val stat = dto.prepareInsert(getConnection()); 
    val resCnt = stat.executeUpdate(); 
    val rs = stat.getGeneratedKeys(); 
    if (rs.next()) { 
      val pkValue = rs.getLong(1); 
      val r = SQL("select * from algorithmParam where algorithmParamId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[AlgorithmParamDto].single); 
      releaseConnection(connection);  
      r 
    } else { 
      releaseConnection(connection);  
      null; 
    } 
 } 
  def createAndInsertAlgorithmParamDto(algorithmParamName : String, algorithmParamDescription : String, algorithmParamType : String) : AlgorithmParamDto = {
    val dto = new AlgorithmParamDto(0,0,new Date(),new Date(),algorithmParamName,algorithmParamDescription,algorithmParamType)
    insertAlgorithmParamDto(dto);   
  }   
  def updateAlgorithmParamDto(dto : AlgorithmParamDto): AlgorithmParamDto = {  
    implicit val connection = getConnection();  
      val resCnt = SQL("update algorithmParam set  lastUpdatedDate = {lastUpdatedDate} ,  algorithmParamName = {algorithmParamName} ,  algorithmParamDescription = {algorithmParamDescription} ,  algorithmParamType = {algorithmParamType}  where  algorithmParamId = {algorithmParamId}  ")
      .on("lastUpdatedDate" -> dto.lastUpdatedDate , "algorithmParamName" -> dto.algorithmParamName , "algorithmParamDescription" -> dto.algorithmParamDescription , "algorithmParamType" -> dto.algorithmParamType, "algorithmParamId" -> dto.algorithmParamId ).executeInsert() 
   releaseConnection(connection);  
     getAlgorithmParamByPk(dto.algorithmParamId) 
    } 

} 
