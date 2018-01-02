/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dao

import anorm.{SQL, SqlParser}
import com.mlasaf.dto._
import java.util.Date


 class SourceDownloadStatColumnDao extends DaoBase { 

  def getSourceDownloadStatColumnsList() : List[SourceDownloadStatColumnDto] = {
   implicit val connection = getConnection();
   val dtos : List[SourceDownloadStatColumnDto]= SQL("select * from sourceDownloadStatColumn").as(anorm.Macro.namedParser[SourceDownloadStatColumnDto].*);
   releaseConnection(connection);
   dtos
  }
  def getSourceDownloadStatColumnsCount() : Long = {
   implicit val connection = getConnection();
   val cnt : Long = SQL("select count(*) as cnt from sourceDownloadStatColumn").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);
   releaseConnection(connection);
   cnt
  }
  def getSourceDownloadStatColumnsLastInsertDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from sourceDownloadStatColumn").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);
   releaseConnection(connection);
   ld
  }
  def getSourceDownloadStatColumnsLastUpdatedDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from sourceDownloadStatColumn").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);
   releaseConnection(connection);
   ld
  }
  def getSourceDownloadStatColumnFirst() : SourceDownloadStatColumnDto = {
   implicit val connection = getConnection();
   val dtos : SourceDownloadStatColumnDto= SQL("select * from sourceDownloadStatColumn order by insertedRowDate asc ").as(anorm.Macro.namedParser[SourceDownloadStatColumnDto].*).head;
   releaseConnection(connection);
   dtos
  }
  def getSourceDownloadStatColumnLast() : SourceDownloadStatColumnDto = {
   implicit val connection = getConnection();
   val dtos : SourceDownloadStatColumnDto= SQL("select * from sourceDownloadStatColumn order by insertedRowDate desc ").as(anorm.Macro.namedParser[SourceDownloadStatColumnDto].*).head;
   releaseConnection(connection);
   dtos
  }
  def getSourceDownloadStatColumnsByField(fieldName : String, fieldValue : String) : List[SourceDownloadStatColumnDto] = {
   implicit val connection = getConnection();
   val dtos : List[SourceDownloadStatColumnDto]= SQL("select * from sourceDownloadStatColumn where " + fieldName + " = {fieldValue} ").on("fieldValue" -> fieldValue).as(anorm.Macro.namedParser[SourceDownloadStatColumnDto].*);
   releaseConnection(connection);
   dtos
  }
  def getSourceDownloadStatColumnByGuid(guid : Long) : SourceDownloadStatColumnDto = {
   implicit val connection = getConnection();
   val dtos : SourceDownloadStatColumnDto= SQL("select * from sourceDownloadStatColumn where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[SourceDownloadStatColumnDto].single);
   releaseConnection(connection);
   dtos
  }  
 def getSourceDownloadStatColumnByPk(pkColValue : Long) : SourceDownloadStatColumnDto = { 
   implicit val connection = getConnection();  
   val dto : SourceDownloadStatColumnDto = SQL("select * from sourceDownloadStatColumn where sourceDownloadStatColumnId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[SourceDownloadStatColumnDto].single);  
   releaseConnection(connection);  
   dto  
 }  
 def getSourceDownloadStatColumnMaxId() : Long = { 
   implicit val connection = getConnection();  
   val maxid : Long = SQL("select max(sourceDownloadStatColumnId) as maxId from sourceDownloadStatColumn ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;  
   releaseConnection(connection);  
   maxid  
 }  
 def getSourceDownloadStatColumnByFkSourceDownloadId(fkColValue : Long) : List[SourceDownloadStatColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[SourceDownloadStatColumnDto] = SQL("select * from sourceDownloadStatColumn where sourceDownloadId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[SourceDownloadStatColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getSourceDownloadStatColumnByFkSourceViewColumnId(fkColValue : Long) : List[SourceDownloadStatColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[SourceDownloadStatColumnDto] = SQL("select * from sourceDownloadStatColumn where sourceViewColumnId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[SourceDownloadStatColumnDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def insertSourceDownloadStatColumnDto(dto : SourceDownloadStatColumnDto): SourceDownloadStatColumnDto = { 
    implicit val connection = getConnection(); 
    val stat = dto.prepareInsert(getConnection()); 
    val resCnt = stat.executeUpdate(); 
    val rs = stat.getGeneratedKeys(); 
    if (rs.next()) { 
      val pkValue = rs.getLong(1); 
      val r = SQL("select * from sourceDownloadStatColumn where sourceDownloadStatColumnId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[SourceDownloadStatColumnDto].single); 
      releaseConnection(connection);  
      r 
    } else { 
      releaseConnection(connection);  
      null; 
    } 
 } 
  def createAndInsertSourceDownloadStatColumnDto(sourceDownloadId : Long, sourceViewColumnId : Long, columnMinNumber : Double, columnMaxNumber : Double, columnMinStr : String, columnMaxStr : String, columnNonemptyCount : Long) : SourceDownloadStatColumnDto = {
    val dto = new SourceDownloadStatColumnDto(0,0,new Date(),new Date(),sourceDownloadId,sourceViewColumnId,columnMinNumber,columnMaxNumber,columnMinStr,columnMaxStr,columnNonemptyCount)
    insertSourceDownloadStatColumnDto(dto);   
  }   
  def updateSourceDownloadStatColumnDto(dto : SourceDownloadStatColumnDto): SourceDownloadStatColumnDto = {  
    implicit val connection = getConnection();  
      val resCnt = SQL("update sourceDownloadStatColumn set  lastUpdatedDate = {lastUpdatedDate} ,  sourceDownloadId = {sourceDownloadId} ,  sourceViewColumnId = {sourceViewColumnId} ,  columnMinNumber = {columnMinNumber} ,  columnMaxNumber = {columnMaxNumber} ,  columnMinStr = {columnMinStr} ,  columnMaxStr = {columnMaxStr} ,  columnNonemptyCount = {columnNonemptyCount}  where  sourceDownloadStatColumnId = {sourceDownloadStatColumnId}  ")
      .on("lastUpdatedDate" -> dto.lastUpdatedDate , "sourceDownloadId" -> dto.sourceDownloadId , "sourceViewColumnId" -> dto.sourceViewColumnId , "columnMinNumber" -> dto.columnMinNumber , "columnMaxNumber" -> dto.columnMaxNumber , "columnMinStr" -> dto.columnMinStr , "columnMaxStr" -> dto.columnMaxStr , "columnNonemptyCount" -> dto.columnNonemptyCount, "sourceDownloadStatColumnId" -> dto.sourceDownloadStatColumnId ).executeInsert() 
   releaseConnection(connection);  
     getSourceDownloadStatColumnByPk(dto.sourceDownloadStatColumnId) 
    } 

} 
