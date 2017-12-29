/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dto 
 
 
case class VSourceDownloadSummaryDto ( 
     val sourceDownloadId : Long
     , val guid : Long
     , val insertedRowDate : java.util.Date
     , val lastUpdatedDate : java.util.Date
     , val sourceScheduleId : Long
     , val executorHostId : Long
     , val executorContextId : Long
     , val sourceViewId : Long
     , val retryNumber : Int
     , val isRunning : Int
     , val isFinished : Int
     , val isExcecption : Int
     , val excecptionDescription : String
     , val sourceDownloadStat_count : Int
     , val sourceDownloadStatColumn_count : Int
     , val executorStorageView_count : Int 
     ) extends BaseReadOnlyDto {  
   def tableName : String = {    "vSourceDownloadSummary";    }  
   def fields : String = {    "sourceDownloadId,guid,insertedRowDate,lastUpdatedDate,sourceScheduleId,executorHostId,executorContextId,sourceViewId,retryNumber,isRunning,isFinished,isExcecption,excecptionDescription,sourceDownloadStat_count,sourceDownloadStatColumn_count,executorStorageView_count";    }  
   def pkFields : String = {    "";    }  
   def fkFields : String = {    "";    }  
   def nameField : String = {    "";    }  
 def getPk() : Long = {    sourceDownloadId  }  
 def getInsertedRowDate() : java.util.Date = {    insertedRowDate  }  
 def getLastUpdatedDate() : java.util.Date = {    lastUpdatedDate  }  
 def getGuid() : Long = {    guid  }  
 def toAnyArray() : Array[Any] = {    Array(sourceDownloadId,guid,insertedRowDate,lastUpdatedDate,sourceScheduleId,executorHostId,executorContextId,sourceViewId,retryNumber,isRunning,isFinished,isExcecption,excecptionDescription,sourceDownloadStat_count,sourceDownloadStatColumn_count,executorStorageView_count)  }  
 def toStringArray() : Array[String] = {    Array(""+sourceDownloadId,""+guid,""+insertedRowDate,""+lastUpdatedDate,""+sourceScheduleId,""+executorHostId,""+executorContextId,""+sourceViewId,""+retryNumber,""+isRunning,""+isFinished,""+isExcecption,""+excecptionDescription,""+sourceDownloadStat_count,""+sourceDownloadStatColumn_count,""+executorStorageView_count)   }  
 def toFullString() : String = {    "sourceDownloadId:'"+sourceDownloadId+"'"+","+"guid:'"+guid+"'"+","+"insertedRowDate:'"+insertedRowDate+"'"+","+"lastUpdatedDate:'"+lastUpdatedDate+"'"+","+"sourceScheduleId:'"+sourceScheduleId+"'"+","+"executorHostId:'"+executorHostId+"'"+","+"executorContextId:'"+executorContextId+"'"+","+"sourceViewId:'"+sourceViewId+"'"+","+"retryNumber:'"+retryNumber+"'"+","+"isRunning:'"+isRunning+"'"+","+"isFinished:'"+isFinished+"'"+","+"isExcecption:'"+isExcecption+"'"+","+"excecptionDescription:'"+excecptionDescription+"'"+","+"sourceDownloadStat_count:'"+sourceDownloadStat_count+"'"+","+"sourceDownloadStatColumn_count:'"+sourceDownloadStatColumn_count+"'"+","+"executorStorageView_count:'"+executorStorageView_count+"'"   } 
   def getFieldValue(name : String) : Any = { 
    val ret = name match { 
    case "sourceDownloadId" => sourceDownloadId  
     case "guid" => guid  
     case "insertedRowDate" => insertedRowDate  
     case "lastUpdatedDate" => lastUpdatedDate  
     case "sourceScheduleId" => sourceScheduleId  
     case "executorHostId" => executorHostId  
     case "executorContextId" => executorContextId  
     case "sourceViewId" => sourceViewId  
     case "retryNumber" => retryNumber  
     case "isRunning" => isRunning  
     case "isFinished" => isFinished  
     case "isExcecption" => isExcecption  
     case "excecptionDescription" => excecptionDescription  
     case "sourceDownloadStat_count" => sourceDownloadStat_count  
     case "sourceDownloadStatColumn_count" => sourceDownloadStatColumn_count  
     case "executorStorageView_count" => executorStorageView_count   
    case _ => null 
    } 
    ret 
  } 
   def getFieldTypeName(name : String) : String = { 
    val ret = name match { 
    case "sourceDownloadId" => "Long"  
     case "guid" => "Long"  
     case "insertedRowDate" => "java.util.Date"  
     case "lastUpdatedDate" => "java.util.Date"  
     case "sourceScheduleId" => "Long"  
     case "executorHostId" => "Long"  
     case "executorContextId" => "Long"  
     case "sourceViewId" => "Long"  
     case "retryNumber" => "Int"  
     case "isRunning" => "Int"  
     case "isFinished" => "Int"  
     case "isExcecption" => "Int"  
     case "excecptionDescription" => "String"  
     case "sourceDownloadStat_count" => "Int"  
     case "sourceDownloadStatColumn_count" => "Int"  
     case "executorStorageView_count" => "Int"   
    case _ => "Object" 
    } 
    ret 
  } 
 } 
object VSourceDownloadSummaryDto { 
  val TABLE_NAME = "vSourceDownloadSummary"; 
   val FIELD_sourceDownloadId = "sourceDownloadId";
   val FIELD_guid = "guid";
   val FIELD_insertedRowDate = "insertedRowDate";
   val FIELD_lastUpdatedDate = "lastUpdatedDate";
   val FIELD_sourceScheduleId = "sourceScheduleId";
   val FIELD_executorHostId = "executorHostId";
   val FIELD_executorContextId = "executorContextId";
   val FIELD_sourceViewId = "sourceViewId";
   val FIELD_retryNumber = "retryNumber";
   val FIELD_isRunning = "isRunning";
   val FIELD_isFinished = "isFinished";
   val FIELD_isExcecption = "isExcecption";
   val FIELD_excecptionDescription = "excecptionDescription";
   val FIELD_sourceDownloadStat_count = "sourceDownloadStat_count";
   val FIELD_sourceDownloadStatColumn_count = "sourceDownloadStatColumn_count";
   val FIELD_executorStorageView_count = "executorStorageView_count";

}

 
