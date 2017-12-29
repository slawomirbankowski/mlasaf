/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dao

import anorm.{SQL, SqlParser}
import com.mlasaf.dto._
import java.util.Date


 class VSourceViewColumnDao extends DaoBase { 

  def getVSourceViewColumnsList() : List[VSourceViewColumnDto] = {
   implicit val connection = getConnection();
   val dtos : List[VSourceViewColumnDto]= SQL("select * from vSourceViewColumn").as(anorm.Macro.namedParser[VSourceViewColumnDto].*);
   dtos
  }
  def getVSourceViewColumnsCount() : Long = {
   implicit val connection = getConnection();
   val cnt : Long = SQL("select count(*) as cnt from vSourceViewColumn").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
   cnt
  }
  def getVSourceViewColumnsLastInsertDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from vSourceViewColumn").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
   ld
  }
  def getVSourceViewColumnsLastUpdatedDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from vSourceViewColumn").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
   ld
  }
  def getVSourceViewColumnFirst() : VSourceViewColumnDto = {
   implicit val connection = getConnection();
   val dtos : VSourceViewColumnDto= SQL("select * from vSourceViewColumn order by insertedRowDate asc ").as(anorm.Macro.namedParser[VSourceViewColumnDto].*).head;
   dtos
  }
  def getVSourceViewColumnLast() : VSourceViewColumnDto = {
   implicit val connection = getConnection();
   val dtos : VSourceViewColumnDto= SQL("select * from vSourceViewColumn order by insertedRowDate desc ").as(anorm.Macro.namedParser[VSourceViewColumnDto].*).head;
   dtos
  }
  def getVSourceViewColumnByGuid(guid : Long) : VSourceViewColumnDto = {
   implicit val connection = getConnection();
   val dtos : VSourceViewColumnDto= SQL("select * from vSourceViewColumn where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VSourceViewColumnDto].single);
   dtos
  }  
 def getDtosBySourceViewColumnId(colValue : Long) : List[VSourceViewColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceViewColumnDto] = SQL("select * from vSourceViewColumn where sourceViewColumnId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewColumnDto].*);  
   dtos  
 }  
 def getDtosByGuid(colValue : Long) : List[VSourceViewColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceViewColumnDto] = SQL("select * from vSourceViewColumn where guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewColumnDto].*);  
   dtos  
 }  
 def getDtosByInsertedRowDate(colValue : java.util.Date) : List[VSourceViewColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceViewColumnDto] = SQL("select * from vSourceViewColumn where insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewColumnDto].*);  
   dtos  
 }  
 def getDtosByLastUpdatedDate(colValue : java.util.Date) : List[VSourceViewColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceViewColumnDto] = SQL("select * from vSourceViewColumn where lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewColumnDto].*);  
   dtos  
 }  
 def getDtosBySourceViewId(colValue : Long) : List[VSourceViewColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceViewColumnDto] = SQL("select * from vSourceViewColumn where sourceViewId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewColumnDto].*);  
   dtos  
 }  
 def getDtosByColumnName(colValue : String) : List[VSourceViewColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceViewColumnDto] = SQL("select * from vSourceViewColumn where columnName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewColumnDto].*);  
   dtos  
 }  
 def getDtosByColumnType(colValue : String) : List[VSourceViewColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceViewColumnDto] = SQL("select * from vSourceViewColumn where columnType = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewColumnDto].*);  
   dtos  
 }  
 def getDtosBySourceView_sourceViewId(colValue : Long) : List[VSourceViewColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceViewColumnDto] = SQL("select * from vSourceViewColumn where sourceView_sourceViewId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewColumnDto].*);  
   dtos  
 }  
 def getDtosBySourceView_guid(colValue : Long) : List[VSourceViewColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceViewColumnDto] = SQL("select * from vSourceViewColumn where sourceView_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewColumnDto].*);  
   dtos  
 }  
 def getDtosBySourceView_insertedRowDate(colValue : java.util.Date) : List[VSourceViewColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceViewColumnDto] = SQL("select * from vSourceViewColumn where sourceView_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewColumnDto].*);  
   dtos  
 }  
 def getDtosBySourceView_lastUpdatedDate(colValue : java.util.Date) : List[VSourceViewColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceViewColumnDto] = SQL("select * from vSourceViewColumn where sourceView_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewColumnDto].*);  
   dtos  
 }  
 def getDtosBySourceView_sourceInstanceId(colValue : Long) : List[VSourceViewColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceViewColumnDto] = SQL("select * from vSourceViewColumn where sourceView_sourceInstanceId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewColumnDto].*);  
   dtos  
 }  
 def getDtosBySourceView_sourceViewTypeId(colValue : Long) : List[VSourceViewColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceViewColumnDto] = SQL("select * from vSourceViewColumn where sourceView_sourceViewTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewColumnDto].*);  
   dtos  
 }  
 def getDtosBySourceView_sourceViewName(colValue : String) : List[VSourceViewColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceViewColumnDto] = SQL("select * from vSourceViewColumn where sourceView_sourceViewName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewColumnDto].*);  
   dtos  
 }  
 def getDtosBySourceView_sourceViewDefinition(colValue : String) : List[VSourceViewColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceViewColumnDto] = SQL("select * from vSourceViewColumn where sourceView_sourceViewDefinition = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewColumnDto].*);  
   dtos  
 }  
 def getDtosBySourceView_isExisting(colValue : Int) : List[VSourceViewColumnDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VSourceViewColumnDto] = SQL("select * from vSourceViewColumn where sourceView_isExisting = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewColumnDto].*);  
   dtos  
 }  

} 
