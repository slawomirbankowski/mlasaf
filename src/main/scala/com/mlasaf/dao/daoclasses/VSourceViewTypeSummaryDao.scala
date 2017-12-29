/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dao

import anorm.{SQL, SqlParser}
import com.mlasaf.dto._
import java.util.Date


 class VSourceViewTypeSummaryDao extends DaoBase { 

  def getVSourceViewTypeSummarysList() : List[VSourceViewTypeSummaryDto] = {
   implicit val connection = getConnection();
   val dtos : List[VSourceViewTypeSummaryDto]= SQL("select * from vSourceViewTypeSummary").as(anorm.Macro.namedParser[VSourceViewTypeSummaryDto].*);
   dtos
  }
  def getVSourceViewTypeSummarysCount() : Long = {
   implicit val connection = getConnection();
   val cnt : Long = SQL("select count(*) as cnt from vSourceViewTypeSummary").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
   cnt
  }
  def getVSourceViewTypeSummarysLastInsertDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from vSourceViewTypeSummary").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
   ld
  }
  def getVSourceViewTypeSummarysLastUpdatedDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from vSourceViewTypeSummary").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
   ld
  }
  def getVSourceViewTypeSummaryFirst() : VSourceViewTypeSummaryDto = {
   implicit val connection = getConnection();
   val dtos : VSourceViewTypeSummaryDto= SQL("select * from vSourceViewTypeSummary order by insertedRowDate asc ").as(anorm.Macro.namedParser[VSourceViewTypeSummaryDto].*).head;
   dtos
  }
  def getVSourceViewTypeSummaryLast() : VSourceViewTypeSummaryDto = {
   implicit val connection = getConnection();
   val dtos : VSourceViewTypeSummaryDto= SQL("select * from vSourceViewTypeSummary order by insertedRowDate desc ").as(anorm.Macro.namedParser[VSourceViewTypeSummaryDto].*).head;
   dtos
  }
  def getVSourceViewTypeSummaryByGuid(guid : Long) : VSourceViewTypeSummaryDto = {
   implicit val connection = getConnection();
   val dtos : VSourceViewTypeSummaryDto= SQL("select * from vSourceViewTypeSummary where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VSourceViewTypeSummaryDto].single);
   dtos
  }  
 def getDtosBySourceViewTypeId(colValue : Long) : List[VSourceViewTypeSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceViewTypeSummaryDto] = SQL("select * from vSourceViewTypeSummary where sourceViewTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewTypeSummaryDto].*);  
   dtos  
 }  
 def getDtosByGuid(colValue : Long) : List[VSourceViewTypeSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceViewTypeSummaryDto] = SQL("select * from vSourceViewTypeSummary where guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewTypeSummaryDto].*);  
   dtos  
 }  
 def getDtosByInsertedRowDate(colValue : java.util.Date) : List[VSourceViewTypeSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceViewTypeSummaryDto] = SQL("select * from vSourceViewTypeSummary where insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewTypeSummaryDto].*);  
   dtos  
 }  
 def getDtosByLastUpdatedDate(colValue : java.util.Date) : List[VSourceViewTypeSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceViewTypeSummaryDto] = SQL("select * from vSourceViewTypeSummary where lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewTypeSummaryDto].*);  
   dtos  
 }  
 def getDtosBySourceViewTypeName(colValue : String) : List[VSourceViewTypeSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceViewTypeSummaryDto] = SQL("select * from vSourceViewTypeSummary where sourceViewTypeName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewTypeSummaryDto].*);  
   dtos  
 }  
 def getDtosBySourceViewTypeClass(colValue : String) : List[VSourceViewTypeSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceViewTypeSummaryDto] = SQL("select * from vSourceViewTypeSummary where sourceViewTypeClass = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewTypeSummaryDto].*);  
   dtos  
 }  
 def getDtosBySourceView_count(colValue : Int) : List[VSourceViewTypeSummaryDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceViewTypeSummaryDto] = SQL("select * from vSourceViewTypeSummary where sourceView_count = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewTypeSummaryDto].*);  
   dtos  
 }  

} 
