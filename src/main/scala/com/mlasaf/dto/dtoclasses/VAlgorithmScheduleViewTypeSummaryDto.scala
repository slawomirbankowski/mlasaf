/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dto 
 
 
case class VAlgorithmScheduleViewTypeSummaryDto ( 
     val algorithmScheduleViewTypeId : Long
     , val guid : Long
     , val insertedRowDate : java.util.Date
     , val lastUpdatedDate : java.util.Date
     , val algorithmScheduleViewTypeName : String
     , val algorithmScheduleView_count : Int 
     ) extends BaseReadOnlyDto {  
   def tableName : String = {    "vAlgorithmScheduleViewTypeSummary";    }  
   def fields : String = {    "algorithmScheduleViewTypeId,guid,insertedRowDate,lastUpdatedDate,algorithmScheduleViewTypeName,algorithmScheduleView_count";    }  
   def pkFields : String = {    "";    }  
   def fkFields : String = {    "";    }  
   def nameField : String = {    "";    }  
 def getPk() : Long = {    algorithmScheduleViewTypeId  }  
 def getInsertedRowDate() : java.util.Date = {    insertedRowDate  }  
 def getLastUpdatedDate() : java.util.Date = {    lastUpdatedDate  }  
 def getGuid() : Long = {    guid  }  
 def toAnyArray() : Array[Any] = {    Array(algorithmScheduleViewTypeId,guid,insertedRowDate,lastUpdatedDate,algorithmScheduleViewTypeName,algorithmScheduleView_count)  }  
 def toStringArray() : Array[String] = {    Array(""+algorithmScheduleViewTypeId,""+guid,""+insertedRowDate,""+lastUpdatedDate,""+algorithmScheduleViewTypeName,""+algorithmScheduleView_count)   }  
 def toJson() : String = {   "{" + "\"algorithmScheduleViewTypeId\":\""+algorithmScheduleViewTypeId+"\""+","+"\"guid\":\""+guid+"\""+","+"\"insertedRowDate\":\""+insertedRowDate+"\""+","+"\"lastUpdatedDate\":\""+lastUpdatedDate+"\""+","+"\"algorithmScheduleViewTypeName\":\""+algorithmScheduleViewTypeName+"\""+","+"\"algorithmScheduleView_count\":\""+algorithmScheduleView_count+"\"" + "}"   }  
 def toFullString() : String = {    "algorithmScheduleViewTypeId:'"+algorithmScheduleViewTypeId+"'"+","+"guid:'"+guid+"'"+","+"insertedRowDate:'"+insertedRowDate+"'"+","+"lastUpdatedDate:'"+lastUpdatedDate+"'"+","+"algorithmScheduleViewTypeName:'"+algorithmScheduleViewTypeName+"'"+","+"algorithmScheduleView_count:'"+algorithmScheduleView_count+"'"   } 
   def getFieldValue(name : String) : Any = { 
    val ret = name match { 
    case "algorithmScheduleViewTypeId" => algorithmScheduleViewTypeId  
     case "guid" => guid  
     case "insertedRowDate" => insertedRowDate  
     case "lastUpdatedDate" => lastUpdatedDate  
     case "algorithmScheduleViewTypeName" => algorithmScheduleViewTypeName  
     case "algorithmScheduleView_count" => algorithmScheduleView_count   
    case _ => null 
    } 
    ret 
  } 
   def getFieldTypeName(name : String) : String = { 
    val ret = name match { 
    case "algorithmScheduleViewTypeId" => "Long"  
     case "guid" => "Long"  
     case "insertedRowDate" => "java.util.Date"  
     case "lastUpdatedDate" => "java.util.Date"  
     case "algorithmScheduleViewTypeName" => "String"  
     case "algorithmScheduleView_count" => "Int"   
    case _ => "Object" 
    } 
    ret 
  } 
 } 
object VAlgorithmScheduleViewTypeSummaryDto { 
  val TABLE_NAME = "vAlgorithmScheduleViewTypeSummary"; 
   val FIELD_algorithmScheduleViewTypeId = "algorithmScheduleViewTypeId";
   val FIELD_guid = "guid";
   val FIELD_insertedRowDate = "insertedRowDate";
   val FIELD_lastUpdatedDate = "lastUpdatedDate";
   val FIELD_algorithmScheduleViewTypeName = "algorithmScheduleViewTypeName";
   val FIELD_algorithmScheduleView_count = "algorithmScheduleView_count";

}

 
