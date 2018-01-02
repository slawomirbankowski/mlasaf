/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dao

import anorm.{SQL, SqlParser}
import com.mlasaf.dto._
import java.util.Date


 class SourceTypeParamDao extends DaoBase { 

  def getSourceTypeParamsList() : List[SourceTypeParamDto] = {
   implicit val connection = getConnection();
   val dtos : List[SourceTypeParamDto]= SQL("select * from sourceTypeParam").as(anorm.Macro.namedParser[SourceTypeParamDto].*);
   releaseConnection(connection);
   dtos
  }
  def getSourceTypeParamsCount() : Long = {
   implicit val connection = getConnection();
   val cnt : Long = SQL("select count(*) as cnt from sourceTypeParam").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);
   releaseConnection(connection);
   cnt
  }
  def getSourceTypeParamsLastInsertDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from sourceTypeParam").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);
   releaseConnection(connection);
   ld
  }
  def getSourceTypeParamsLastUpdatedDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from sourceTypeParam").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);
   releaseConnection(connection);
   ld
  }
  def getSourceTypeParamFirst() : SourceTypeParamDto = {
   implicit val connection = getConnection();
   val dtos : SourceTypeParamDto= SQL("select * from sourceTypeParam order by insertedRowDate asc ").as(anorm.Macro.namedParser[SourceTypeParamDto].*).head;
   releaseConnection(connection);
   dtos
  }
  def getSourceTypeParamLast() : SourceTypeParamDto = {
   implicit val connection = getConnection();
   val dtos : SourceTypeParamDto= SQL("select * from sourceTypeParam order by insertedRowDate desc ").as(anorm.Macro.namedParser[SourceTypeParamDto].*).head;
   releaseConnection(connection);
   dtos
  }
  def getSourceTypeParamsByField(fieldName : String, fieldValue : String) : List[SourceTypeParamDto] = {
   implicit val connection = getConnection();
   val dtos : List[SourceTypeParamDto]= SQL("select * from sourceTypeParam where " + fieldName + " = {fieldValue} ").on("fieldValue" -> fieldValue).as(anorm.Macro.namedParser[SourceTypeParamDto].*);
   releaseConnection(connection);
   dtos
  }
  def getSourceTypeParamByGuid(guid : Long) : SourceTypeParamDto = {
   implicit val connection = getConnection();
   val dtos : SourceTypeParamDto= SQL("select * from sourceTypeParam where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[SourceTypeParamDto].single);
   releaseConnection(connection);
   dtos
  }  
 def getSourceTypeParamByPk(pkColValue : Long) : SourceTypeParamDto = { 
   implicit val connection = getConnection();  
   val dto : SourceTypeParamDto = SQL("select * from sourceTypeParam where sourceTypeParamId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[SourceTypeParamDto].single);  
   releaseConnection(connection);  
   dto  
 }  
 def getSourceTypeParamMaxId() : Long = { 
   implicit val connection = getConnection();  
   val maxid : Long = SQL("select max(sourceTypeParamId) as maxId from sourceTypeParam ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;  
   releaseConnection(connection);  
   maxid  
 }  
 def getSourceTypeParamByFkSourceParamId(fkColValue : Long) : List[SourceTypeParamDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[SourceTypeParamDto] = SQL("select * from sourceTypeParam where sourceParamId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[SourceTypeParamDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getSourceTypeParamByFkSourceTypeId(fkColValue : Long) : List[SourceTypeParamDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[SourceTypeParamDto] = SQL("select * from sourceTypeParam where sourceTypeId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[SourceTypeParamDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def insertSourceTypeParamDto(dto : SourceTypeParamDto): SourceTypeParamDto = { 
    implicit val connection = getConnection(); 
    val stat = dto.prepareInsert(getConnection()); 
    val resCnt = stat.executeUpdate(); 
    val rs = stat.getGeneratedKeys(); 
    if (rs.next()) { 
      val pkValue = rs.getLong(1); 
      val r = SQL("select * from sourceTypeParam where sourceTypeParamId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[SourceTypeParamDto].single); 
      releaseConnection(connection);  
      r 
    } else { 
      releaseConnection(connection);  
      null; 
    } 
 } 
  def createAndInsertSourceTypeParamDto(sourceTypeId : Long, sourceParamId : Long, sourceTypeName : String, sourceParamName : String, isRequired : Int) : SourceTypeParamDto = {
    val dto = new SourceTypeParamDto(0,0,new Date(),new Date(),sourceTypeId,sourceParamId,sourceTypeName,sourceParamName,isRequired)
    insertSourceTypeParamDto(dto);   
  }   
  def updateSourceTypeParamDto(dto : SourceTypeParamDto): SourceTypeParamDto = {  
    implicit val connection = getConnection();  
      val resCnt = SQL("update sourceTypeParam set  lastUpdatedDate = {lastUpdatedDate} ,  sourceTypeId = {sourceTypeId} ,  sourceParamId = {sourceParamId} ,  sourceTypeName = {sourceTypeName} ,  sourceParamName = {sourceParamName} ,  isRequired = {isRequired}  where  sourceTypeParamId = {sourceTypeParamId}  ")
      .on("lastUpdatedDate" -> dto.lastUpdatedDate , "sourceTypeId" -> dto.sourceTypeId , "sourceParamId" -> dto.sourceParamId , "sourceTypeName" -> dto.sourceTypeName , "sourceParamName" -> dto.sourceParamName , "isRequired" -> dto.isRequired, "sourceTypeParamId" -> dto.sourceTypeParamId ).executeInsert() 
   releaseConnection(connection);  
     getSourceTypeParamByPk(dto.sourceTypeParamId) 
    } 

} 
