/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dao

import anorm.{SQL, SqlParser}
import com.mlasaf.dto._
import java.util.Date


 class AlgorithmRunViewDao extends DaoBase { 

  def getAlgorithmRunViewsList() : List[AlgorithmRunViewDto] = {
   implicit val connection = getConnection();
   val dtos : List[AlgorithmRunViewDto]= SQL("select * from algorithmRunView").as(anorm.Macro.namedParser[AlgorithmRunViewDto].*);
   dtos
  }
  def getAlgorithmRunViewsCount() : Long = {
   implicit val connection = getConnection();
   val cnt : Long = SQL("select count(*) as cnt from algorithmRunView").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
   cnt
  }
  def getAlgorithmRunViewsLastInsertDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from algorithmRunView").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
   ld
  }
  def getAlgorithmRunViewsLastUpdatedDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from algorithmRunView").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
   ld
  }
  def getAlgorithmRunViewFirst() : AlgorithmRunViewDto = {
   implicit val connection = getConnection();
   val dtos : AlgorithmRunViewDto= SQL("select * from algorithmRunView order by insertedRowDate asc ").as(anorm.Macro.namedParser[AlgorithmRunViewDto].*).head;
   dtos
  }
  def getAlgorithmRunViewLast() : AlgorithmRunViewDto = {
   implicit val connection = getConnection();
   val dtos : AlgorithmRunViewDto= SQL("select * from algorithmRunView order by insertedRowDate desc ").as(anorm.Macro.namedParser[AlgorithmRunViewDto].*).head;
   dtos
  }
  def getAlgorithmRunViewByGuid(guid : Long) : AlgorithmRunViewDto = {
   implicit val connection = getConnection();
   val dtos : AlgorithmRunViewDto= SQL("select * from algorithmRunView where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[AlgorithmRunViewDto].single);
   dtos
  }  
 def getAlgorithmRunViewByPk(pkColValue : Long) : AlgorithmRunViewDto = { 
   implicit val connection = getConnection();  
   val dto : AlgorithmRunViewDto = SQL("select * from algorithmRunView where algorithmRunViewId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[AlgorithmRunViewDto].single);  
   dto  
 }  
 def getAlgorithmRunViewMaxId() : Long = { 
   implicit val connection = getConnection();  
   val maxid : Long = SQL("select max(algorithmRunViewId) as maxId from algorithmRunView ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;  
   maxid  
 }  
 def getAlgorithmRunViewByFkAlgorithmRunId(fkColValue : Long) : List[AlgorithmRunViewDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[AlgorithmRunViewDto] = SQL("select * from algorithmRunView where algorithmRunId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[AlgorithmRunViewDto].*);  
   dtos  
 }  
 def getAlgorithmRunViewByFkAlgorithmScheduleViewId(fkColValue : Long) : List[AlgorithmRunViewDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[AlgorithmRunViewDto] = SQL("select * from algorithmRunView where algorithmScheduleViewId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[AlgorithmRunViewDto].*);  
   dtos  
 }  
 def getAlgorithmRunViewByFkExecutorStorageViewId(fkColValue : Long) : List[AlgorithmRunViewDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[AlgorithmRunViewDto] = SQL("select * from algorithmRunView where executorStorageViewId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[AlgorithmRunViewDto].*);  
   dtos  
 }  
 def insertAlgorithmRunViewDto(dto : AlgorithmRunViewDto): AlgorithmRunViewDto = { 
    implicit val connection = getConnection(); 
    val stat = dto.prepareInsert(getConnection()); 
    val resCnt = stat.executeUpdate(); 
    val rs = stat.getGeneratedKeys(); 
    if (rs.next()) { 
      val pkValue = rs.getLong(1); 
      SQL("select * from algorithmRunView where algorithmRunViewId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[AlgorithmRunViewDto].single); 
    } else { 
      null; 
    } 
 } 
  def createAndInsertAlgorithmRunViewDto(algorithmRunId : Long, executorStorageViewId : Long, algorithmScheduleViewId : Long, isDownloaded : Int) : AlgorithmRunViewDto = {
    val dto = new AlgorithmRunViewDto(0,0,new Date(),new Date(),algorithmRunId,executorStorageViewId,algorithmScheduleViewId,isDownloaded)
    insertAlgorithmRunViewDto(dto);   
  }   
  def updateAlgorithmRunViewDto(dto : AlgorithmRunViewDto): AlgorithmRunViewDto = {  
    implicit val connection = getConnection();  
      val resCnt = SQL("update algorithmRunView set  lastUpdatedDate = {lastUpdatedDate} ,  algorithmRunId = {algorithmRunId} ,  executorStorageViewId = {executorStorageViewId} ,  algorithmScheduleViewId = {algorithmScheduleViewId} ,  isDownloaded = {isDownloaded}  where  algorithmRunViewId = {algorithmRunViewId}  ")
      .on("lastUpdatedDate" -> dto.lastUpdatedDate , "algorithmRunId" -> dto.algorithmRunId , "executorStorageViewId" -> dto.executorStorageViewId , "algorithmScheduleViewId" -> dto.algorithmScheduleViewId , "isDownloaded" -> dto.isDownloaded, "algorithmRunViewId" -> dto.algorithmRunViewId ).executeInsert() 
     getAlgorithmRunViewByPk(dto.algorithmRunViewId) 
    } 

} 
