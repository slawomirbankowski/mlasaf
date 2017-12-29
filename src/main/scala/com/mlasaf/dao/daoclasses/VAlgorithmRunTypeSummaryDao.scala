/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dao

import anorm.{SQL, SqlParser}
import com.mlasaf.dto._
import java.util.Date


 class VAlgorithmRunTypeSummaryDao extends DaoBase { 

  def getVAlgorithmRunTypeSummarysList() : List[VAlgorithmRunTypeSummaryDto] = {
   implicit val connection = getConnection();
   val dtos : List[VAlgorithmRunTypeSummaryDto]= SQL("select * from vAlgorithmRunTypeSummary").as(anorm.Macro.namedParser[VAlgorithmRunTypeSummaryDto].*);
   dtos
  }
  def getVAlgorithmRunTypeSummarysCount() : Long = {
   implicit val connection = getConnection();
   val cnt : Long = SQL("select count(*) as cnt from vAlgorithmRunTypeSummary").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
   cnt
  }
  def getVAlgorithmRunTypeSummarysLastInsertDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from vAlgorithmRunTypeSummary").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
   ld
  }
  def getVAlgorithmRunTypeSummarysLastUpdatedDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from vAlgorithmRunTypeSummary").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
   ld
  }
  def getVAlgorithmRunTypeSummaryFirst() : VAlgorithmRunTypeSummaryDto = {
   implicit val connection = getConnection();
   val dtos : VAlgorithmRunTypeSummaryDto= SQL("select * from vAlgorithmRunTypeSummary order by insertedRowDate asc ").as(anorm.Macro.namedParser[VAlgorithmRunTypeSummaryDto].*).head;
   dtos
  }
  def getVAlgorithmRunTypeSummaryLast() : VAlgorithmRunTypeSummaryDto = {
   implicit val connection = getConnection();
   val dtos : VAlgorithmRunTypeSummaryDto= SQL("select * from vAlgorithmRunTypeSummary order by insertedRowDate desc ").as(anorm.Macro.namedParser[VAlgorithmRunTypeSummaryDto].*).head;
   dtos
  }
  def getVAlgorithmRunTypeSummaryByGuid(guid : Long) : VAlgorithmRunTypeSummaryDto = {
   implicit val connection = getConnection();
   val dtos : VAlgorithmRunTypeSummaryDto= SQL("select * from vAlgorithmRunTypeSummary where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VAlgorithmRunTypeSummaryDto].single);
   dtos
  }  
 def getDtosByAlgorithmRunTypeId(colValue : Long) : List[VAlgorithmRunTypeSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmRunTypeSummaryDto] = SQL("select * from vAlgorithmRunTypeSummary where algorithmRunTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunTypeSummaryDto].*);  
   dtos  
 }  
 def getDtosByGuid(colValue : Long) : List[VAlgorithmRunTypeSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmRunTypeSummaryDto] = SQL("select * from vAlgorithmRunTypeSummary where guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunTypeSummaryDto].*);  
   dtos  
 }  
 def getDtosByInsertedRowDate(colValue : java.util.Date) : List[VAlgorithmRunTypeSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmRunTypeSummaryDto] = SQL("select * from vAlgorithmRunTypeSummary where insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunTypeSummaryDto].*);  
   dtos  
 }  
 def getDtosByLastUpdatedDate(colValue : java.util.Date) : List[VAlgorithmRunTypeSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmRunTypeSummaryDto] = SQL("select * from vAlgorithmRunTypeSummary where lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunTypeSummaryDto].*);  
   dtos  
 }  
 def getDtosByAlgorithmRunTypeName(colValue : String) : List[VAlgorithmRunTypeSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmRunTypeSummaryDto] = SQL("select * from vAlgorithmRunTypeSummary where algorithmRunTypeName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunTypeSummaryDto].*);  
   dtos  
 }  
 def getDtosByAlgorithmRun_count(colValue : Int) : List[VAlgorithmRunTypeSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmRunTypeSummaryDto] = SQL("select * from vAlgorithmRunTypeSummary where algorithmRun_count = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunTypeSummaryDto].*);  
   dtos  
 }  

} 
