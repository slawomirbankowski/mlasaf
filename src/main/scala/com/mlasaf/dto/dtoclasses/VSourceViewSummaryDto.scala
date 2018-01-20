/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dto 
 
 
case class VSourceViewSummaryDto ( 
     val sourceViewId : Long
     , val guid : Long
     , val insertedRowDate : java.util.Date
     , val lastUpdatedDate : java.util.Date
     , val sourceInstanceId : Long
     , val sourceViewTypeId : Long
     , val sourceViewFormatId : Long
     , val sourceViewName : String
     , val sourceViewDefinition : String
     , val isExisting : Int
     , val isCustom : Int
     , val algorithmScheduleView_count : Int
     , val algorithmScheduleColumn_count : Int
     , val sourceViewColumn_count : Int
     , val sourceSchedule_count : Int
     , val sourceDownload_count : Int
     , val executorStorageView_count : Int 
     ) extends BaseReadOnlyDto {  
   def tableName : String = {    "vSourceViewSummary";    }  
   def fields : String = {    "sourceViewId,guid,insertedRowDate,lastUpdatedDate,sourceInstanceId,sourceViewTypeId,sourceViewFormatId,sourceViewName,sourceViewDefinition,isExisting,isCustom,algorithmScheduleView_count,algorithmScheduleColumn_count,sourceViewColumn_count,sourceSchedule_count,sourceDownload_count,executorStorageView_count";    }  
   def pkFields : String = {    "";    }  
   def fkFields : String = {    "";    }  
   def nameField : String = {    "";    }  
 def getPk() : Long = {    sourceViewId  }  
 def getInsertedRowDate() : java.util.Date = {    insertedRowDate  }  
 def getLastUpdatedDate() : java.util.Date = {    lastUpdatedDate  }  
 def getGuid() : Long = {    guid  }  
 def toAnyArray() : Array[Any] = {    Array(sourceViewId,guid,insertedRowDate,lastUpdatedDate,sourceInstanceId,sourceViewTypeId,sourceViewFormatId,sourceViewName,sourceViewDefinition,isExisting,isCustom,algorithmScheduleView_count,algorithmScheduleColumn_count,sourceViewColumn_count,sourceSchedule_count,sourceDownload_count,executorStorageView_count)  }  
 def toStringArray() : Array[String] = {    Array(""+sourceViewId,""+guid,""+insertedRowDate,""+lastUpdatedDate,""+sourceInstanceId,""+sourceViewTypeId,""+sourceViewFormatId,""+sourceViewName,""+sourceViewDefinition,""+isExisting,""+isCustom,""+algorithmScheduleView_count,""+algorithmScheduleColumn_count,""+sourceViewColumn_count,""+sourceSchedule_count,""+sourceDownload_count,""+executorStorageView_count)   }  
 def toJson() : String = {   "{" + "\"sourceViewId\":\""+sourceViewId+"\""+","+"\"guid\":\""+guid+"\""+","+"\"insertedRowDate\":\""+insertedRowDate+"\""+","+"\"lastUpdatedDate\":\""+lastUpdatedDate+"\""+","+"\"sourceInstanceId\":\""+sourceInstanceId+"\""+","+"\"sourceViewTypeId\":\""+sourceViewTypeId+"\""+","+"\"sourceViewFormatId\":\""+sourceViewFormatId+"\""+","+"\"sourceViewName\":\""+sourceViewName+"\""+","+"\"sourceViewDefinition\":\""+sourceViewDefinition+"\""+","+"\"isExisting\":\""+isExisting+"\""+","+"\"isCustom\":\""+isCustom+"\""+","+"\"algorithmScheduleView_count\":\""+algorithmScheduleView_count+"\""+","+"\"algorithmScheduleColumn_count\":\""+algorithmScheduleColumn_count+"\""+","+"\"sourceViewColumn_count\":\""+sourceViewColumn_count+"\""+","+"\"sourceSchedule_count\":\""+sourceSchedule_count+"\""+","+"\"sourceDownload_count\":\""+sourceDownload_count+"\""+","+"\"executorStorageView_count\":\""+executorStorageView_count+"\"" + "}"   }  
 def toFullString() : String = {    "sourceViewId:'"+sourceViewId+"'"+","+"guid:'"+guid+"'"+","+"insertedRowDate:'"+insertedRowDate+"'"+","+"lastUpdatedDate:'"+lastUpdatedDate+"'"+","+"sourceInstanceId:'"+sourceInstanceId+"'"+","+"sourceViewTypeId:'"+sourceViewTypeId+"'"+","+"sourceViewFormatId:'"+sourceViewFormatId+"'"+","+"sourceViewName:'"+sourceViewName+"'"+","+"sourceViewDefinition:'"+sourceViewDefinition+"'"+","+"isExisting:'"+isExisting+"'"+","+"isCustom:'"+isCustom+"'"+","+"algorithmScheduleView_count:'"+algorithmScheduleView_count+"'"+","+"algorithmScheduleColumn_count:'"+algorithmScheduleColumn_count+"'"+","+"sourceViewColumn_count:'"+sourceViewColumn_count+"'"+","+"sourceSchedule_count:'"+sourceSchedule_count+"'"+","+"sourceDownload_count:'"+sourceDownload_count+"'"+","+"executorStorageView_count:'"+executorStorageView_count+"'"   } 
   def getFieldValue(name : String) : Any = { 
    val ret = name match { 
    case "sourceViewId" => sourceViewId  
     case "guid" => guid  
     case "insertedRowDate" => insertedRowDate  
     case "lastUpdatedDate" => lastUpdatedDate  
     case "sourceInstanceId" => sourceInstanceId  
     case "sourceViewTypeId" => sourceViewTypeId  
     case "sourceViewFormatId" => sourceViewFormatId  
     case "sourceViewName" => sourceViewName  
     case "sourceViewDefinition" => sourceViewDefinition  
     case "isExisting" => isExisting  
     case "isCustom" => isCustom  
     case "algorithmScheduleView_count" => algorithmScheduleView_count  
     case "algorithmScheduleColumn_count" => algorithmScheduleColumn_count  
     case "sourceViewColumn_count" => sourceViewColumn_count  
     case "sourceSchedule_count" => sourceSchedule_count  
     case "sourceDownload_count" => sourceDownload_count  
     case "executorStorageView_count" => executorStorageView_count   
    case _ => null 
    } 
    ret 
  } 
   def getFieldTypeName(name : String) : String = { 
    val ret = name match { 
    case "sourceViewId" => "Long"  
     case "guid" => "Long"  
     case "insertedRowDate" => "java.util.Date"  
     case "lastUpdatedDate" => "java.util.Date"  
     case "sourceInstanceId" => "Long"  
     case "sourceViewTypeId" => "Long"  
     case "sourceViewFormatId" => "Long"  
     case "sourceViewName" => "String"  
     case "sourceViewDefinition" => "String"  
     case "isExisting" => "Int"  
     case "isCustom" => "Int"  
     case "algorithmScheduleView_count" => "Int"  
     case "algorithmScheduleColumn_count" => "Int"  
     case "sourceViewColumn_count" => "Int"  
     case "sourceSchedule_count" => "Int"  
     case "sourceDownload_count" => "Int"  
     case "executorStorageView_count" => "Int"   
    case _ => "Object" 
    } 
    ret 
  } 
 } 
object VSourceViewSummaryDto { 
  val TABLE_NAME = "vSourceViewSummary"; 
   val FIELD_sourceViewId = "sourceViewId";
   val FIELD_guid = "guid";
   val FIELD_insertedRowDate = "insertedRowDate";
   val FIELD_lastUpdatedDate = "lastUpdatedDate";
   val FIELD_sourceInstanceId = "sourceInstanceId";
   val FIELD_sourceViewTypeId = "sourceViewTypeId";
   val FIELD_sourceViewFormatId = "sourceViewFormatId";
   val FIELD_sourceViewName = "sourceViewName";
   val FIELD_sourceViewDefinition = "sourceViewDefinition";
   val FIELD_isExisting = "isExisting";
   val FIELD_isCustom = "isCustom";
   val FIELD_algorithmScheduleView_count = "algorithmScheduleView_count";
   val FIELD_algorithmScheduleColumn_count = "algorithmScheduleColumn_count";
   val FIELD_sourceViewColumn_count = "sourceViewColumn_count";
   val FIELD_sourceSchedule_count = "sourceSchedule_count";
   val FIELD_sourceDownload_count = "sourceDownload_count";
   val FIELD_executorStorageView_count = "executorStorageView_count";

}

 
