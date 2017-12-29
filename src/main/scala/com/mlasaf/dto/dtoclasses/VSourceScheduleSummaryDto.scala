/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dto 
 
 
case class VSourceScheduleSummaryDto ( 
     val sourceScheduleId : Long
     , val guid : Long
     , val insertedRowDate : java.util.Date
     , val lastUpdatedDate : java.util.Date
     , val sourceViewId : Long
     , val executorStorageId : Long
     , val onDemand : Int
     , val startTime : java.util.Date
     , val intervalValue : Long
     , val isScheduled : Int
     , val deleteOldCopies : Int
     , val sourceDownload_count : Int 
     ) extends BaseReadOnlyDto {  
   def tableName : String = { 
   "vSourceScheduleSummary"; 
   }  
   def fields : String = { 
   "sourceScheduleId,guid,insertedRowDate,lastUpdatedDate,sourceViewId,executorStorageId,onDemand,startTime,intervalValue,isScheduled,deleteOldCopies,sourceDownload_count"; 
   }  
   def pkFields : String = { 
   ""; 
   }  
   def fkFields : String = { 
   ""; 
   }  
   def nameField : String = { 
   ""; 
   }  
 def getPk() : Long = {
    sourceScheduleId
  }  
 def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
  }  
 def getLastUpdatedDate() : java.util.Date = {
    lastUpdatedDate
  }  
 def getGuid() : Long = {
    guid
  }  
 def toAnyArray() : Array[Any] = {
    Array(sourceScheduleId,guid,insertedRowDate,lastUpdatedDate,sourceViewId,executorStorageId,onDemand,startTime,intervalValue,isScheduled,deleteOldCopies,sourceDownload_count)
  }  
 def toStringArray() : Array[String] = {
    Array(""+sourceScheduleId,""+guid,""+insertedRowDate,""+lastUpdatedDate,""+sourceViewId,""+executorStorageId,""+onDemand,""+startTime,""+intervalValue,""+isScheduled,""+deleteOldCopies,""+sourceDownload_count) 
  } 
   def getFieldValue(name : String) : Any = { 
    val ret = name match { 
    case "sourceScheduleId" => sourceScheduleId  
     case "guid" => guid  
     case "insertedRowDate" => insertedRowDate  
     case "lastUpdatedDate" => lastUpdatedDate  
     case "sourceViewId" => sourceViewId  
     case "executorStorageId" => executorStorageId  
     case "onDemand" => onDemand  
     case "startTime" => startTime  
     case "intervalValue" => intervalValue  
     case "isScheduled" => isScheduled  
     case "deleteOldCopies" => deleteOldCopies  
     case "sourceDownload_count" => sourceDownload_count   
    case _ => null 
    } 
    ret 
  } 
   def getFieldTypeName(name : String) : String = { 
    val ret = name match { 
    case "sourceScheduleId" => "Long"  
     case "guid" => "Long"  
     case "insertedRowDate" => "java.util.Date"  
     case "lastUpdatedDate" => "java.util.Date"  
     case "sourceViewId" => "Long"  
     case "executorStorageId" => "Long"  
     case "onDemand" => "Int"  
     case "startTime" => "java.util.Date"  
     case "intervalValue" => "Long"  
     case "isScheduled" => "Int"  
     case "deleteOldCopies" => "Int"  
     case "sourceDownload_count" => "Int"   
    case _ => "Object" 
    } 
    ret 
  } 
 } 
object VSourceScheduleSummaryDto { 
  val TABLE_NAME = "vSourceScheduleSummary"; 
   val FIELD_sourceScheduleId = "sourceScheduleId";
   val FIELD_guid = "guid";
   val FIELD_insertedRowDate = "insertedRowDate";
   val FIELD_lastUpdatedDate = "lastUpdatedDate";
   val FIELD_sourceViewId = "sourceViewId";
   val FIELD_executorStorageId = "executorStorageId";
   val FIELD_onDemand = "onDemand";
   val FIELD_startTime = "startTime";
   val FIELD_intervalValue = "intervalValue";
   val FIELD_isScheduled = "isScheduled";
   val FIELD_deleteOldCopies = "deleteOldCopies";
   val FIELD_sourceDownload_count = "sourceDownload_count";

}

 
