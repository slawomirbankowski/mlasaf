/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dto 
 
 
case class VAlgorithmRunSummaryDto ( 
     val algorithmRunId : Long
     , val guid : Long
     , val insertedRowDate : java.util.Date
     , val lastUpdatedDate : java.util.Date
     , val algorithmScheduleId : Long
     , val executorInstanceId : Long
     , val executorStorageId : Long
     , val algorithmRunTypeId : Long
     , val algorithmRunName : String
     , val runDate : java.util.Date
     , val runStatus : String
     , val isError : Int
     , val errorDescription : String
     , val isRunning : Int
     , val isFinished : Int
     , val algorithmOutput_count : Int
     , val algorithmRunInfo_count : Int
     , val algorithmRunView_count : Int 
     ) extends BaseReadOnlyDto {  
   def tableName : String = {    "vAlgorithmRunSummary";    }  
   def fields : String = {    "algorithmRunId,guid,insertedRowDate,lastUpdatedDate,algorithmScheduleId,executorInstanceId,executorStorageId,algorithmRunTypeId,algorithmRunName,runDate,runStatus,isError,errorDescription,isRunning,isFinished,algorithmOutput_count,algorithmRunInfo_count,algorithmRunView_count";    }  
   def pkFields : String = {    "";    }  
   def fkFields : String = {    "";    }  
   def nameField : String = {    "";    }  
 def getPk() : Long = {    algorithmRunId  }  
 def getInsertedRowDate() : java.util.Date = {    insertedRowDate  }  
 def getLastUpdatedDate() : java.util.Date = {    lastUpdatedDate  }  
 def getGuid() : Long = {    guid  }  
 def toAnyArray() : Array[Any] = {    Array(algorithmRunId,guid,insertedRowDate,lastUpdatedDate,algorithmScheduleId,executorInstanceId,executorStorageId,algorithmRunTypeId,algorithmRunName,runDate,runStatus,isError,errorDescription,isRunning,isFinished,algorithmOutput_count,algorithmRunInfo_count,algorithmRunView_count)  }  
 def toStringArray() : Array[String] = {    Array(""+algorithmRunId,""+guid,""+insertedRowDate,""+lastUpdatedDate,""+algorithmScheduleId,""+executorInstanceId,""+executorStorageId,""+algorithmRunTypeId,""+algorithmRunName,""+runDate,""+runStatus,""+isError,""+errorDescription,""+isRunning,""+isFinished,""+algorithmOutput_count,""+algorithmRunInfo_count,""+algorithmRunView_count)   }  
 def toJson() : String = {   "{" + "\"algorithmRunId\":\""+algorithmRunId+"\""+","+"\"guid\":\""+guid+"\""+","+"\"insertedRowDate\":\""+insertedRowDate+"\""+","+"\"lastUpdatedDate\":\""+lastUpdatedDate+"\""+","+"\"algorithmScheduleId\":\""+algorithmScheduleId+"\""+","+"\"executorInstanceId\":\""+executorInstanceId+"\""+","+"\"executorStorageId\":\""+executorStorageId+"\""+","+"\"algorithmRunTypeId\":\""+algorithmRunTypeId+"\""+","+"\"algorithmRunName\":\""+algorithmRunName+"\""+","+"\"runDate\":\""+runDate+"\""+","+"\"runStatus\":\""+runStatus+"\""+","+"\"isError\":\""+isError+"\""+","+"\"errorDescription\":\""+errorDescription+"\""+","+"\"isRunning\":\""+isRunning+"\""+","+"\"isFinished\":\""+isFinished+"\""+","+"\"algorithmOutput_count\":\""+algorithmOutput_count+"\""+","+"\"algorithmRunInfo_count\":\""+algorithmRunInfo_count+"\""+","+"\"algorithmRunView_count\":\""+algorithmRunView_count+"\"" + "}"   }  
 def toFullString() : String = {    "algorithmRunId:'"+algorithmRunId+"'"+","+"guid:'"+guid+"'"+","+"insertedRowDate:'"+insertedRowDate+"'"+","+"lastUpdatedDate:'"+lastUpdatedDate+"'"+","+"algorithmScheduleId:'"+algorithmScheduleId+"'"+","+"executorInstanceId:'"+executorInstanceId+"'"+","+"executorStorageId:'"+executorStorageId+"'"+","+"algorithmRunTypeId:'"+algorithmRunTypeId+"'"+","+"algorithmRunName:'"+algorithmRunName+"'"+","+"runDate:'"+runDate+"'"+","+"runStatus:'"+runStatus+"'"+","+"isError:'"+isError+"'"+","+"errorDescription:'"+errorDescription+"'"+","+"isRunning:'"+isRunning+"'"+","+"isFinished:'"+isFinished+"'"+","+"algorithmOutput_count:'"+algorithmOutput_count+"'"+","+"algorithmRunInfo_count:'"+algorithmRunInfo_count+"'"+","+"algorithmRunView_count:'"+algorithmRunView_count+"'"   } 
   def getFieldValue(name : String) : Any = { 
    val ret = name match { 
    case "algorithmRunId" => algorithmRunId  
     case "guid" => guid  
     case "insertedRowDate" => insertedRowDate  
     case "lastUpdatedDate" => lastUpdatedDate  
     case "algorithmScheduleId" => algorithmScheduleId  
     case "executorInstanceId" => executorInstanceId  
     case "executorStorageId" => executorStorageId  
     case "algorithmRunTypeId" => algorithmRunTypeId  
     case "algorithmRunName" => algorithmRunName  
     case "runDate" => runDate  
     case "runStatus" => runStatus  
     case "isError" => isError  
     case "errorDescription" => errorDescription  
     case "isRunning" => isRunning  
     case "isFinished" => isFinished  
     case "algorithmOutput_count" => algorithmOutput_count  
     case "algorithmRunInfo_count" => algorithmRunInfo_count  
     case "algorithmRunView_count" => algorithmRunView_count   
    case _ => null 
    } 
    ret 
  } 
   def getFieldTypeName(name : String) : String = { 
    val ret = name match { 
    case "algorithmRunId" => "Long"  
     case "guid" => "Long"  
     case "insertedRowDate" => "java.util.Date"  
     case "lastUpdatedDate" => "java.util.Date"  
     case "algorithmScheduleId" => "Long"  
     case "executorInstanceId" => "Long"  
     case "executorStorageId" => "Long"  
     case "algorithmRunTypeId" => "Long"  
     case "algorithmRunName" => "String"  
     case "runDate" => "java.util.Date"  
     case "runStatus" => "String"  
     case "isError" => "Int"  
     case "errorDescription" => "String"  
     case "isRunning" => "Int"  
     case "isFinished" => "Int"  
     case "algorithmOutput_count" => "Int"  
     case "algorithmRunInfo_count" => "Int"  
     case "algorithmRunView_count" => "Int"   
    case _ => "Object" 
    } 
    ret 
  } 
 } 
object VAlgorithmRunSummaryDto { 
  val TABLE_NAME = "vAlgorithmRunSummary"; 
   val FIELD_algorithmRunId = "algorithmRunId";
   val FIELD_guid = "guid";
   val FIELD_insertedRowDate = "insertedRowDate";
   val FIELD_lastUpdatedDate = "lastUpdatedDate";
   val FIELD_algorithmScheduleId = "algorithmScheduleId";
   val FIELD_executorInstanceId = "executorInstanceId";
   val FIELD_executorStorageId = "executorStorageId";
   val FIELD_algorithmRunTypeId = "algorithmRunTypeId";
   val FIELD_algorithmRunName = "algorithmRunName";
   val FIELD_runDate = "runDate";
   val FIELD_runStatus = "runStatus";
   val FIELD_isError = "isError";
   val FIELD_errorDescription = "errorDescription";
   val FIELD_isRunning = "isRunning";
   val FIELD_isFinished = "isFinished";
   val FIELD_algorithmOutput_count = "algorithmOutput_count";
   val FIELD_algorithmRunInfo_count = "algorithmRunInfo_count";
   val FIELD_algorithmRunView_count = "algorithmRunView_count";

}

 
