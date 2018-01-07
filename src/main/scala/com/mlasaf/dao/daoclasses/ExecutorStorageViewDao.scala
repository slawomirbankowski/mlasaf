/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dao

import anorm.{SQL, SqlParser}
import com.mlasaf.dto._
import java.util.Date


 class ExecutorStorageViewDao extends DaoBase { 

  def getExecutorStorageViewsList() : List[ExecutorStorageViewDto] = {
   implicit val connection = getConnection();
   val dtos : List[ExecutorStorageViewDto]= SQL("select * from executorStorageView").as(anorm.Macro.namedParser[ExecutorStorageViewDto].*);
   releaseConnection(connection);
   dtos
  }
  def getExecutorStorageViewsCount() : Long = {
   implicit val connection = getConnection();
   val cnt : Long = SQL("select count(*) as cnt from executorStorageView").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);
   releaseConnection(connection);
   cnt
  }
  def getExecutorStorageViewsLastInsertDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from executorStorageView").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);
   releaseConnection(connection);
   ld
  }
  def getExecutorStorageViewsLastUpdatedDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from executorStorageView").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);
   releaseConnection(connection);
   ld
  }
  def getExecutorStorageViewFirst() : ExecutorStorageViewDto = {
   implicit val connection = getConnection();
   val dtos : ExecutorStorageViewDto= SQL("select * from executorStorageView order by insertedRowDate asc ").as(anorm.Macro.namedParser[ExecutorStorageViewDto].*).head;
   releaseConnection(connection);
   dtos
  }
  def getExecutorStorageViewLast() : ExecutorStorageViewDto = {
   implicit val connection = getConnection();
   val dtos : ExecutorStorageViewDto= SQL("select * from executorStorageView order by insertedRowDate desc ").as(anorm.Macro.namedParser[ExecutorStorageViewDto].*).head;
   releaseConnection(connection);
   dtos
  }
  def getExecutorStorageViewsByField(fieldName : String, fieldValue : String) : List[ExecutorStorageViewDto] = {
   implicit val connection = getConnection();
   val dtos : List[ExecutorStorageViewDto]= SQL("select * from executorStorageView where " + fieldName + " = {fieldValue} ").on("fieldValue" -> fieldValue).as(anorm.Macro.namedParser[ExecutorStorageViewDto].*);
   releaseConnection(connection);
   dtos
  }
  def getExecutorStorageViewByGuid(guid : Long) : ExecutorStorageViewDto = {
   implicit val connection = getConnection();
   val dtos : ExecutorStorageViewDto= SQL("select * from executorStorageView where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[ExecutorStorageViewDto].single);
   releaseConnection(connection);
   dtos
  }  
 def getExecutorStorageViewByPk(pkColValue : Long) : ExecutorStorageViewDto = { 
   implicit val connection = getConnection();  
   val dto : ExecutorStorageViewDto = SQL("select * from executorStorageView where executorStorageViewId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[ExecutorStorageViewDto].single);  
   releaseConnection(connection);  
   dto  
 }  
 def getExecutorStorageViewMaxId() : Long = { 
   implicit val connection = getConnection();  
   val maxid : Long = SQL("select max(executorStorageViewId) as maxId from executorStorageView ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;  
   releaseConnection(connection);  
   maxid  
 }  
 def getExecutorStorageViewByFkExecutorStorageId(fkColValue : Long) : List[ExecutorStorageViewDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[ExecutorStorageViewDto] = SQL("select * from executorStorageView where executorStorageId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[ExecutorStorageViewDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getExecutorStorageViewByFkExecutorStorageResourceId(fkColValue : Long) : List[ExecutorStorageViewDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[ExecutorStorageViewDto] = SQL("select * from executorStorageView where executorStorageResourceId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[ExecutorStorageViewDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getExecutorStorageViewByFkExecutorStorageSnapshotId(fkColValue : Long) : List[ExecutorStorageViewDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[ExecutorStorageViewDto] = SQL("select * from executorStorageView where executorStorageSnapshotId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[ExecutorStorageViewDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getExecutorStorageViewByFkSourceDownloadId(fkColValue : Long) : List[ExecutorStorageViewDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[ExecutorStorageViewDto] = SQL("select * from executorStorageView where sourceDownloadId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[ExecutorStorageViewDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def getExecutorStorageViewByFkSourceViewId(fkColValue : Long) : List[ExecutorStorageViewDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[ExecutorStorageViewDto] = SQL("select * from executorStorageView where sourceViewId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[ExecutorStorageViewDto].*);  
   releaseConnection(connection);  
   dtos  
 }  
 def insertExecutorStorageViewDto(dto : ExecutorStorageViewDto): ExecutorStorageViewDto = { 
    implicit val connection = getConnection(); 
    val stat = dto.prepareInsert(connection); 
    val resCnt = stat.executeUpdate(); 
    val rs = stat.getGeneratedKeys(); 
    if (rs.next()) { 
      val pkValue = rs.getLong(1); 
      val r = SQL("select * from executorStorageView where executorStorageViewId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[ExecutorStorageViewDto].single); 
      releaseConnection(connection);  
      r 
    } else { 
      releaseConnection(connection);  
      null; 
    } 
 } 
  def createAndInsertExecutorStorageViewDto(executorStorageSnapshotId : Long, executorStorageId : Long, sourceDownloadId : Long, sourceViewId : Long, executorStorageResourceId : Long) : ExecutorStorageViewDto = {
    val dto = new ExecutorStorageViewDto(0,0,new Date(),new Date(),executorStorageSnapshotId,executorStorageId,sourceDownloadId,sourceViewId,executorStorageResourceId)
    insertExecutorStorageViewDto(dto);   
  }   
  def updateExecutorStorageViewDto(dto : ExecutorStorageViewDto): ExecutorStorageViewDto = {  
    implicit val connection = getConnection();  
      val resCnt = SQL("update executorStorageView set  lastUpdatedDate = {lastUpdatedDate} ,  executorStorageSnapshotId = {executorStorageSnapshotId} ,  executorStorageId = {executorStorageId} ,  sourceDownloadId = {sourceDownloadId} ,  sourceViewId = {sourceViewId} ,  executorStorageResourceId = {executorStorageResourceId}  where  executorStorageViewId = {executorStorageViewId}  ")
      .on("lastUpdatedDate" -> dto.lastUpdatedDate , "executorStorageSnapshotId" -> dto.executorStorageSnapshotId , "executorStorageId" -> dto.executorStorageId , "sourceDownloadId" -> dto.sourceDownloadId , "sourceViewId" -> dto.sourceViewId , "executorStorageResourceId" -> dto.executorStorageResourceId, "executorStorageViewId" -> dto.executorStorageViewId ).executeInsert() 
   releaseConnection(connection);  
     getExecutorStorageViewByPk(dto.executorStorageViewId) 
    } 

} 
