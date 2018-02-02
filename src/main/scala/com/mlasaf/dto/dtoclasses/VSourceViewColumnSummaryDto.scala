/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dto 
 
 
case class VSourceViewColumnSummaryDto ( 
     val sourceViewColumnId : Long
     , val guid : Long
     , val insertedRowDate : java.util.Date
     , val lastUpdatedDate : java.util.Date
     , val sourceViewId : Long
     , val columnName : String
     , val columnType : String
     , val sourceDownloadStatColumn_count : Int
     , val downloadTransformColumn_count : Int
     , val algorithmScheduleColumn_count : Int 
     ) extends BaseReadOnlyDto {  
   def tableName : String = {    "vSourceViewColumnSummary";    }  
   def fields : String = {    "sourceViewColumnId,guid,insertedRowDate,lastUpdatedDate,sourceViewId,columnName,columnType,sourceDownloadStatColumn_count,downloadTransformColumn_count,algorithmScheduleColumn_count";    }  
   def pkFields : String = {    "";    }  
   def fkFields : String = {    "";    }  
   def nameField : String = {    "";    }  
 def getPk() : Long = {    sourceViewColumnId  }  
 def getInsertedRowDate() : java.util.Date = {    insertedRowDate  }  
 def getLastUpdatedDate() : java.util.Date = {    lastUpdatedDate  }  
 def getGuid() : Long = {    guid  }  
 def toAnyArray() : Array[Any] = {    Array(sourceViewColumnId,guid,insertedRowDate,lastUpdatedDate,sourceViewId,columnName,columnType,sourceDownloadStatColumn_count,downloadTransformColumn_count,algorithmScheduleColumn_count)  }  
 def toStringArray() : Array[String] = {    Array(""+sourceViewColumnId,""+guid,""+insertedRowDate,""+lastUpdatedDate,""+sourceViewId,""+columnName,""+columnType,""+sourceDownloadStatColumn_count,""+downloadTransformColumn_count,""+algorithmScheduleColumn_count)   }  
 def toJson() : String = {   "{" + "\"sourceViewColumnId\":\""+sourceViewColumnId+"\""+","+"\"guid\":\""+guid+"\""+","+"\"insertedRowDate\":\""+insertedRowDate+"\""+","+"\"lastUpdatedDate\":\""+lastUpdatedDate+"\""+","+"\"sourceViewId\":\""+sourceViewId+"\""+","+"\"columnName\":\""+columnName+"\""+","+"\"columnType\":\""+columnType+"\""+","+"\"sourceDownloadStatColumn_count\":\""+sourceDownloadStatColumn_count+"\""+","+"\"downloadTransformColumn_count\":\""+downloadTransformColumn_count+"\""+","+"\"algorithmScheduleColumn_count\":\""+algorithmScheduleColumn_count+"\"" + "}"   }  
 def toFullString() : String = {    "sourceViewColumnId:'"+sourceViewColumnId+"'"+","+"guid:'"+guid+"'"+","+"insertedRowDate:'"+insertedRowDate+"'"+","+"lastUpdatedDate:'"+lastUpdatedDate+"'"+","+"sourceViewId:'"+sourceViewId+"'"+","+"columnName:'"+columnName+"'"+","+"columnType:'"+columnType+"'"+","+"sourceDownloadStatColumn_count:'"+sourceDownloadStatColumn_count+"'"+","+"downloadTransformColumn_count:'"+downloadTransformColumn_count+"'"+","+"algorithmScheduleColumn_count:'"+algorithmScheduleColumn_count+"'"   } 
   def getFieldValue(name : String) : Any = { 
    val ret = name match { 
    case "sourceViewColumnId" => sourceViewColumnId  
     case "guid" => guid  
     case "insertedRowDate" => insertedRowDate  
     case "lastUpdatedDate" => lastUpdatedDate  
     case "sourceViewId" => sourceViewId  
     case "columnName" => columnName  
     case "columnType" => columnType  
     case "sourceDownloadStatColumn_count" => sourceDownloadStatColumn_count  
     case "downloadTransformColumn_count" => downloadTransformColumn_count  
     case "algorithmScheduleColumn_count" => algorithmScheduleColumn_count   
    case _ => null 
    } 
    ret 
  } 
   def getFieldTypeName(name : String) : String = { 
    val ret = name match { 
    case "sourceViewColumnId" => "Long"  
     case "guid" => "Long"  
     case "insertedRowDate" => "java.util.Date"  
     case "lastUpdatedDate" => "java.util.Date"  
     case "sourceViewId" => "Long"  
     case "columnName" => "String"  
     case "columnType" => "String"  
     case "sourceDownloadStatColumn_count" => "Int"  
     case "downloadTransformColumn_count" => "Int"  
     case "algorithmScheduleColumn_count" => "Int"   
    case _ => "Object" 
    } 
    ret 
  } 
 } 
object VSourceViewColumnSummaryDto { 
  val TABLE_NAME = "vSourceViewColumnSummary"; 
   val FIELD_sourceViewColumnId = "sourceViewColumnId";
   val FIELD_guid = "guid";
   val FIELD_insertedRowDate = "insertedRowDate";
   val FIELD_lastUpdatedDate = "lastUpdatedDate";
   val FIELD_sourceViewId = "sourceViewId";
   val FIELD_columnName = "columnName";
   val FIELD_columnType = "columnType";
   val FIELD_sourceDownloadStatColumn_count = "sourceDownloadStatColumn_count";
   val FIELD_downloadTransformColumn_count = "downloadTransformColumn_count";
   val FIELD_algorithmScheduleColumn_count = "algorithmScheduleColumn_count";

}

 
