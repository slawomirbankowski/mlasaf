/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dao

import anorm.{SQL, SqlParser}
import com.mlasaf.dto._
import java.util.Date


 class VAlgorithmTypeOutputTypeDao extends DaoBase { 

  def getVAlgorithmTypeOutputTypesList() : List[VAlgorithmTypeOutputTypeDto] = {
   implicit val connection = getConnection();
   val dtos : List[VAlgorithmTypeOutputTypeDto]= SQL("select * from vAlgorithmTypeOutputType").as(anorm.Macro.namedParser[VAlgorithmTypeOutputTypeDto].*);
   dtos
  }
  def getVAlgorithmTypeOutputTypesCount() : Long = {
   implicit val connection = getConnection();
   val cnt : Long = SQL("select count(*) as cnt from vAlgorithmTypeOutputType").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
   cnt
  }
  def getVAlgorithmTypeOutputTypesLastInsertDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from vAlgorithmTypeOutputType").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
   ld
  }
  def getVAlgorithmTypeOutputTypesLastUpdatedDate() : java.util.Date = {
   implicit val connection = getConnection();
   val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from vAlgorithmTypeOutputType").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
   ld
  }
  def getVAlgorithmTypeOutputTypeFirst() : VAlgorithmTypeOutputTypeDto = {
   implicit val connection = getConnection();
   val dtos : VAlgorithmTypeOutputTypeDto= SQL("select * from vAlgorithmTypeOutputType order by insertedRowDate asc ").as(anorm.Macro.namedParser[VAlgorithmTypeOutputTypeDto].*).head;
   dtos
  }
  def getVAlgorithmTypeOutputTypeLast() : VAlgorithmTypeOutputTypeDto = {
   implicit val connection = getConnection();
   val dtos : VAlgorithmTypeOutputTypeDto= SQL("select * from vAlgorithmTypeOutputType order by insertedRowDate desc ").as(anorm.Macro.namedParser[VAlgorithmTypeOutputTypeDto].*).head;
   dtos
  }
  def getVAlgorithmTypeOutputTypeByGuid(guid : Long) : VAlgorithmTypeOutputTypeDto = {
   implicit val connection = getConnection();
   val dtos : VAlgorithmTypeOutputTypeDto= SQL("select * from vAlgorithmTypeOutputType where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VAlgorithmTypeOutputTypeDto].single);
   dtos
  }  
 def getDtosByAlgorithmTypeOutputTypeId(colValue : Long) : List[VAlgorithmTypeOutputTypeDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmTypeOutputTypeDto] = SQL("select * from vAlgorithmTypeOutputType where algorithmTypeOutputTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmTypeOutputTypeDto].*);  
   dtos  
 }  
 def getDtosByGuid(colValue : Long) : List[VAlgorithmTypeOutputTypeDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmTypeOutputTypeDto] = SQL("select * from vAlgorithmTypeOutputType where guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmTypeOutputTypeDto].*);  
   dtos  
 }  
 def getDtosByInsertedRowDate(colValue : java.util.Date) : List[VAlgorithmTypeOutputTypeDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmTypeOutputTypeDto] = SQL("select * from vAlgorithmTypeOutputType where insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmTypeOutputTypeDto].*);  
   dtos  
 }  
 def getDtosByLastUpdatedDate(colValue : java.util.Date) : List[VAlgorithmTypeOutputTypeDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmTypeOutputTypeDto] = SQL("select * from vAlgorithmTypeOutputType where lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmTypeOutputTypeDto].*);  
   dtos  
 }  
 def getDtosByAlgorithmTypeVersionId(colValue : Long) : List[VAlgorithmTypeOutputTypeDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmTypeOutputTypeDto] = SQL("select * from vAlgorithmTypeOutputType where algorithmTypeVersionId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmTypeOutputTypeDto].*);  
   dtos  
 }  
 def getDtosByAlgorithmOutputTypeId(colValue : Long) : List[VAlgorithmTypeOutputTypeDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmTypeOutputTypeDto] = SQL("select * from vAlgorithmTypeOutputType where algorithmOutputTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmTypeOutputTypeDto].*);  
   dtos  
 }  
 def getDtosByIsMandatory(colValue : Int) : List[VAlgorithmTypeOutputTypeDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmTypeOutputTypeDto] = SQL("select * from vAlgorithmTypeOutputType where isMandatory = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmTypeOutputTypeDto].*);  
   dtos  
 }  
 def getDtosByAlgorithmOutputType_algorithmOutputTypeId(colValue : Long) : List[VAlgorithmTypeOutputTypeDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmTypeOutputTypeDto] = SQL("select * from vAlgorithmTypeOutputType where algorithmOutputType_algorithmOutputTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmTypeOutputTypeDto].*);  
   dtos  
 }  
 def getDtosByAlgorithmOutputType_guid(colValue : Long) : List[VAlgorithmTypeOutputTypeDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmTypeOutputTypeDto] = SQL("select * from vAlgorithmTypeOutputType where algorithmOutputType_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmTypeOutputTypeDto].*);  
   dtos  
 }  
 def getDtosByAlgorithmOutputType_insertedRowDate(colValue : java.util.Date) : List[VAlgorithmTypeOutputTypeDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmTypeOutputTypeDto] = SQL("select * from vAlgorithmTypeOutputType where algorithmOutputType_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmTypeOutputTypeDto].*);  
   dtos  
 }  
 def getDtosByAlgorithmOutputType_lastUpdatedDate(colValue : java.util.Date) : List[VAlgorithmTypeOutputTypeDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmTypeOutputTypeDto] = SQL("select * from vAlgorithmTypeOutputType where algorithmOutputType_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmTypeOutputTypeDto].*);  
   dtos  
 }  
 def getDtosByAlgorithmOutputType_algorithmOutputTypeName(colValue : String) : List[VAlgorithmTypeOutputTypeDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmTypeOutputTypeDto] = SQL("select * from vAlgorithmTypeOutputType where algorithmOutputType_algorithmOutputTypeName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmTypeOutputTypeDto].*);  
   dtos  
 }  
 def getDtosByAlgorithmTypeVersion_algorithmTypeVersionId(colValue : Long) : List[VAlgorithmTypeOutputTypeDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmTypeOutputTypeDto] = SQL("select * from vAlgorithmTypeOutputType where algorithmTypeVersion_algorithmTypeVersionId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmTypeOutputTypeDto].*);  
   dtos  
 }  
 def getDtosByAlgorithmTypeVersion_insertedRowDate(colValue : java.util.Date) : List[VAlgorithmTypeOutputTypeDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmTypeOutputTypeDto] = SQL("select * from vAlgorithmTypeOutputType where algorithmTypeVersion_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmTypeOutputTypeDto].*);  
   dtos  
 }  
 def getDtosByAlgorithmTypeVersion_lastUpdatedDate(colValue : java.util.Date) : List[VAlgorithmTypeOutputTypeDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmTypeOutputTypeDto] = SQL("select * from vAlgorithmTypeOutputType where algorithmTypeVersion_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmTypeOutputTypeDto].*);  
   dtos  
 }  
 def getDtosByAlgorithmTypeVersion_guid(colValue : Long) : List[VAlgorithmTypeOutputTypeDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmTypeOutputTypeDto] = SQL("select * from vAlgorithmTypeOutputType where algorithmTypeVersion_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmTypeOutputTypeDto].*);  
   dtos  
 }  
 def getDtosByAlgorithmTypeVersion_algorithmTypeId(colValue : Long) : List[VAlgorithmTypeOutputTypeDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmTypeOutputTypeDto] = SQL("select * from vAlgorithmTypeOutputType where algorithmTypeVersion_algorithmTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmTypeOutputTypeDto].*);  
   dtos  
 }  
 def getDtosByAlgorithmTypeVersion_algorithmTypeVersionName(colValue : String) : List[VAlgorithmTypeOutputTypeDto] = { 
   implicit val connection = getConnection();  
   val dtos : List[VAlgorithmTypeOutputTypeDto] = SQL("select * from vAlgorithmTypeOutputType where algorithmTypeVersion_algorithmTypeVersionName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmTypeOutputTypeDto].*);  
   dtos  
 }  

} 
