/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dto 
 
 
case class VAlgorithmScheduleSummaryDto ( 
     val algorithmScheduleId : Long
     , val guid : Long
     , val insertedRowDate : java.util.Date
     , val lastUpdatedDate : java.util.Date
     , val algorithmImplementationId : Long
     , val algorithmScheduleTypeId : Long
     , val algorithmScheduleName : String
     , val isScheduled : Int
     , val intervalValue : Long
     , val isRunning : Int
     , val algorithmScheduleView_count : Int
     , val algorithmScheduleParam_count : Int
     , val algorithmScheduleColumn_count : Int
     , val algorithmRun_count : Int
     , val algorithmRunInfo_count : Int 
     ) extends BaseReadOnlyDto {  
   def tableName : String = {    "vAlgorithmScheduleSummary";    }  
   def fields : String = {    "algorithmScheduleId,guid,insertedRowDate,lastUpdatedDate,algorithmImplementationId,algorithmScheduleTypeId,algorithmScheduleName,isScheduled,intervalValue,isRunning,algorithmScheduleView_count,algorithmScheduleParam_count,algorithmScheduleColumn_count,algorithmRun_count,algorithmRunInfo_count";    }  
   def pkFields : String = {    "";    }  
   def fkFields : String = {    "";    }  
   def nameField : String = {    "";    }  
 def getPk() : Long = {    algorithmScheduleId  }  
 def getInsertedRowDate() : java.util.Date = {    insertedRowDate  }  
 def getLastUpdatedDate() : java.util.Date = {    lastUpdatedDate  }  
 def getGuid() : Long = {    guid  }  
 def toAnyArray() : Array[Any] = {    Array(algorithmScheduleId,guid,insertedRowDate,lastUpdatedDate,algorithmImplementationId,algorithmScheduleTypeId,algorithmScheduleName,isScheduled,intervalValue,isRunning,algorithmScheduleView_count,algorithmScheduleParam_count,algorithmScheduleColumn_count,algorithmRun_count,algorithmRunInfo_count)  }  
 def toStringArray() : Array[String] = {    Array(""+algorithmScheduleId,""+guid,""+insertedRowDate,""+lastUpdatedDate,""+algorithmImplementationId,""+algorithmScheduleTypeId,""+algorithmScheduleName,""+isScheduled,""+intervalValue,""+isRunning,""+algorithmScheduleView_count,""+algorithmScheduleParam_count,""+algorithmScheduleColumn_count,""+algorithmRun_count,""+algorithmRunInfo_count)   }  
 def toJson() : String = {   "{" + "\"algorithmScheduleId\":\""+algorithmScheduleId+"\""+","+"\"guid\":\""+guid+"\""+","+"\"insertedRowDate\":\""+insertedRowDate+"\""+","+"\"lastUpdatedDate\":\""+lastUpdatedDate+"\""+","+"\"algorithmImplementationId\":\""+algorithmImplementationId+"\""+","+"\"algorithmScheduleTypeId\":\""+algorithmScheduleTypeId+"\""+","+"\"algorithmScheduleName\":\""+algorithmScheduleName+"\""+","+"\"isScheduled\":\""+isScheduled+"\""+","+"\"intervalValue\":\""+intervalValue+"\""+","+"\"isRunning\":\""+isRunning+"\""+","+"\"algorithmScheduleView_count\":\""+algorithmScheduleView_count+"\""+","+"\"algorithmScheduleParam_count\":\""+algorithmScheduleParam_count+"\""+","+"\"algorithmScheduleColumn_count\":\""+algorithmScheduleColumn_count+"\""+","+"\"algorithmRun_count\":\""+algorithmRun_count+"\""+","+"\"algorithmRunInfo_count\":\""+algorithmRunInfo_count+"\"" + "}"   }  
 def toFullString() : String = {    "algorithmScheduleId:'"+algorithmScheduleId+"'"+","+"guid:'"+guid+"'"+","+"insertedRowDate:'"+insertedRowDate+"'"+","+"lastUpdatedDate:'"+lastUpdatedDate+"'"+","+"algorithmImplementationId:'"+algorithmImplementationId+"'"+","+"algorithmScheduleTypeId:'"+algorithmScheduleTypeId+"'"+","+"algorithmScheduleName:'"+algorithmScheduleName+"'"+","+"isScheduled:'"+isScheduled+"'"+","+"intervalValue:'"+intervalValue+"'"+","+"isRunning:'"+isRunning+"'"+","+"algorithmScheduleView_count:'"+algorithmScheduleView_count+"'"+","+"algorithmScheduleParam_count:'"+algorithmScheduleParam_count+"'"+","+"algorithmScheduleColumn_count:'"+algorithmScheduleColumn_count+"'"+","+"algorithmRun_count:'"+algorithmRun_count+"'"+","+"algorithmRunInfo_count:'"+algorithmRunInfo_count+"'"   } 
   def getFieldValue(name : String) : Any = { 
    val ret = name match { 
    case "algorithmScheduleId" => algorithmScheduleId  
     case "guid" => guid  
     case "insertedRowDate" => insertedRowDate  
     case "lastUpdatedDate" => lastUpdatedDate  
     case "algorithmImplementationId" => algorithmImplementationId  
     case "algorithmScheduleTypeId" => algorithmScheduleTypeId  
     case "algorithmScheduleName" => algorithmScheduleName  
     case "isScheduled" => isScheduled  
     case "intervalValue" => intervalValue  
     case "isRunning" => isRunning  
     case "algorithmScheduleView_count" => algorithmScheduleView_count  
     case "algorithmScheduleParam_count" => algorithmScheduleParam_count  
     case "algorithmScheduleColumn_count" => algorithmScheduleColumn_count  
     case "algorithmRun_count" => algorithmRun_count  
     case "algorithmRunInfo_count" => algorithmRunInfo_count   
    case _ => null 
    } 
    ret 
  } 
   def getFieldTypeName(name : String) : String = { 
    val ret = name match { 
    case "algorithmScheduleId" => "Long"  
     case "guid" => "Long"  
     case "insertedRowDate" => "java.util.Date"  
     case "lastUpdatedDate" => "java.util.Date"  
     case "algorithmImplementationId" => "Long"  
     case "algorithmScheduleTypeId" => "Long"  
     case "algorithmScheduleName" => "String"  
     case "isScheduled" => "Int"  
     case "intervalValue" => "Long"  
     case "isRunning" => "Int"  
     case "algorithmScheduleView_count" => "Int"  
     case "algorithmScheduleParam_count" => "Int"  
     case "algorithmScheduleColumn_count" => "Int"  
     case "algorithmRun_count" => "Int"  
     case "algorithmRunInfo_count" => "Int"   
    case _ => "Object" 
    } 
    ret 
  } 
 } 
object VAlgorithmScheduleSummaryDto { 
  val TABLE_NAME = "vAlgorithmScheduleSummary"; 
   val FIELD_algorithmScheduleId = "algorithmScheduleId";
   val FIELD_guid = "guid";
   val FIELD_insertedRowDate = "insertedRowDate";
   val FIELD_lastUpdatedDate = "lastUpdatedDate";
   val FIELD_algorithmImplementationId = "algorithmImplementationId";
   val FIELD_algorithmScheduleTypeId = "algorithmScheduleTypeId";
   val FIELD_algorithmScheduleName = "algorithmScheduleName";
   val FIELD_isScheduled = "isScheduled";
   val FIELD_intervalValue = "intervalValue";
   val FIELD_isRunning = "isRunning";
   val FIELD_algorithmScheduleView_count = "algorithmScheduleView_count";
   val FIELD_algorithmScheduleParam_count = "algorithmScheduleParam_count";
   val FIELD_algorithmScheduleColumn_count = "algorithmScheduleColumn_count";
   val FIELD_algorithmRun_count = "algorithmRun_count";
   val FIELD_algorithmRunInfo_count = "algorithmRunInfo_count";

}

 
