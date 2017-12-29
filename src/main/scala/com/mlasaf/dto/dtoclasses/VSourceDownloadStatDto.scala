/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dto 
 
 
case class VSourceDownloadStatDto ( 
     val sourceDownloadStatId : Long
     , val guid : Long
     , val sourceDownloadId : Long
     , val insertedRowDate : java.util.Date
     , val lastUpdatedDate : java.util.Date
     , val rowsCount : Long
     , val errorRowsCount : Long
     , val totalBytesCount : Long
     , val empryRowsCount : Long
     , val sourceDownload_sourceDownloadId : Long
     , val sourceDownload_guid : Long
     , val sourceDownload_insertedRowDate : java.util.Date
     , val sourceDownload_lastUpdatedDate : java.util.Date
     , val sourceDownload_sourceScheduleId : Long
     , val sourceDownload_executorHostId : Long
     , val sourceDownload_executorContextId : Long
     , val sourceDownload_sourceViewId : Long
     , val sourceDownload_retryNumber : Int
     , val sourceDownload_isRunning : Int
     , val sourceDownload_isFinished : Int
     , val sourceDownload_isExcecption : Int
     , val sourceDownload_excecptionDescription : String 
     ) extends BaseReadOnlyDto {  
   def tableName : String = { 
   "vSourceDownloadStat"; 
   }  
   def fields : String = { 
   "sourceDownloadStatId,guid,sourceDownloadId,insertedRowDate,lastUpdatedDate,rowsCount,errorRowsCount,totalBytesCount,empryRowsCount,sourceDownload_sourceDownloadId,sourceDownload_guid,sourceDownload_insertedRowDate,sourceDownload_lastUpdatedDate,sourceDownload_sourceScheduleId,sourceDownload_executorHostId,sourceDownload_executorContextId,sourceDownload_sourceViewId,sourceDownload_retryNumber,sourceDownload_isRunning,sourceDownload_isFinished,sourceDownload_isExcecption,sourceDownload_excecptionDescription"; 
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
    sourceDownloadStatId
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
    Array(sourceDownloadStatId,guid,sourceDownloadId,insertedRowDate,lastUpdatedDate,rowsCount,errorRowsCount,totalBytesCount,empryRowsCount,sourceDownload_sourceDownloadId,sourceDownload_guid,sourceDownload_insertedRowDate,sourceDownload_lastUpdatedDate,sourceDownload_sourceScheduleId,sourceDownload_executorHostId,sourceDownload_executorContextId,sourceDownload_sourceViewId,sourceDownload_retryNumber,sourceDownload_isRunning,sourceDownload_isFinished,sourceDownload_isExcecption,sourceDownload_excecptionDescription)
  }  
 def toStringArray() : Array[String] = {
    Array(""+sourceDownloadStatId,""+guid,""+sourceDownloadId,""+insertedRowDate,""+lastUpdatedDate,""+rowsCount,""+errorRowsCount,""+totalBytesCount,""+empryRowsCount,""+sourceDownload_sourceDownloadId,""+sourceDownload_guid,""+sourceDownload_insertedRowDate,""+sourceDownload_lastUpdatedDate,""+sourceDownload_sourceScheduleId,""+sourceDownload_executorHostId,""+sourceDownload_executorContextId,""+sourceDownload_sourceViewId,""+sourceDownload_retryNumber,""+sourceDownload_isRunning,""+sourceDownload_isFinished,""+sourceDownload_isExcecption,""+sourceDownload_excecptionDescription) 
  } 
   def getFieldValue(name : String) : Any = { 
    val ret = name match { 
    case "sourceDownloadStatId" => sourceDownloadStatId  
     case "guid" => guid  
     case "sourceDownloadId" => sourceDownloadId  
     case "insertedRowDate" => insertedRowDate  
     case "lastUpdatedDate" => lastUpdatedDate  
     case "rowsCount" => rowsCount  
     case "errorRowsCount" => errorRowsCount  
     case "totalBytesCount" => totalBytesCount  
     case "empryRowsCount" => empryRowsCount  
     case "sourceDownload_sourceDownloadId" => sourceDownload_sourceDownloadId  
     case "sourceDownload_guid" => sourceDownload_guid  
     case "sourceDownload_insertedRowDate" => sourceDownload_insertedRowDate  
     case "sourceDownload_lastUpdatedDate" => sourceDownload_lastUpdatedDate  
     case "sourceDownload_sourceScheduleId" => sourceDownload_sourceScheduleId  
     case "sourceDownload_executorHostId" => sourceDownload_executorHostId  
     case "sourceDownload_executorContextId" => sourceDownload_executorContextId  
     case "sourceDownload_sourceViewId" => sourceDownload_sourceViewId  
     case "sourceDownload_retryNumber" => sourceDownload_retryNumber  
     case "sourceDownload_isRunning" => sourceDownload_isRunning  
     case "sourceDownload_isFinished" => sourceDownload_isFinished  
     case "sourceDownload_isExcecption" => sourceDownload_isExcecption  
     case "sourceDownload_excecptionDescription" => sourceDownload_excecptionDescription   
    case _ => null 
    } 
    ret 
  } 
   def getFieldTypeName(name : String) : String = { 
    val ret = name match { 
    case "sourceDownloadStatId" => "Long"  
     case "guid" => "Long"  
     case "sourceDownloadId" => "Long"  
     case "insertedRowDate" => "java.util.Date"  
     case "lastUpdatedDate" => "java.util.Date"  
     case "rowsCount" => "Long"  
     case "errorRowsCount" => "Long"  
     case "totalBytesCount" => "Long"  
     case "empryRowsCount" => "Long"  
     case "sourceDownload_sourceDownloadId" => "Long"  
     case "sourceDownload_guid" => "Long"  
     case "sourceDownload_insertedRowDate" => "java.util.Date"  
     case "sourceDownload_lastUpdatedDate" => "java.util.Date"  
     case "sourceDownload_sourceScheduleId" => "Long"  
     case "sourceDownload_executorHostId" => "Long"  
     case "sourceDownload_executorContextId" => "Long"  
     case "sourceDownload_sourceViewId" => "Long"  
     case "sourceDownload_retryNumber" => "Int"  
     case "sourceDownload_isRunning" => "Int"  
     case "sourceDownload_isFinished" => "Int"  
     case "sourceDownload_isExcecption" => "Int"  
     case "sourceDownload_excecptionDescription" => "String"   
    case _ => "Object" 
    } 
    ret 
  } 
 } 
object VSourceDownloadStatDto { 
  val TABLE_NAME = "vSourceDownloadStat"; 
   val FIELD_sourceDownloadStatId = "sourceDownloadStatId";
   val FIELD_guid = "guid";
   val FIELD_sourceDownloadId = "sourceDownloadId";
   val FIELD_insertedRowDate = "insertedRowDate";
   val FIELD_lastUpdatedDate = "lastUpdatedDate";
   val FIELD_rowsCount = "rowsCount";
   val FIELD_errorRowsCount = "errorRowsCount";
   val FIELD_totalBytesCount = "totalBytesCount";
   val FIELD_empryRowsCount = "empryRowsCount";
   val FIELD_sourceDownload_sourceDownloadId = "sourceDownload_sourceDownloadId";
   val FIELD_sourceDownload_guid = "sourceDownload_guid";
   val FIELD_sourceDownload_insertedRowDate = "sourceDownload_insertedRowDate";
   val FIELD_sourceDownload_lastUpdatedDate = "sourceDownload_lastUpdatedDate";
   val FIELD_sourceDownload_sourceScheduleId = "sourceDownload_sourceScheduleId";
   val FIELD_sourceDownload_executorHostId = "sourceDownload_executorHostId";
   val FIELD_sourceDownload_executorContextId = "sourceDownload_executorContextId";
   val FIELD_sourceDownload_sourceViewId = "sourceDownload_sourceViewId";
   val FIELD_sourceDownload_retryNumber = "sourceDownload_retryNumber";
   val FIELD_sourceDownload_isRunning = "sourceDownload_isRunning";
   val FIELD_sourceDownload_isFinished = "sourceDownload_isFinished";
   val FIELD_sourceDownload_isExcecption = "sourceDownload_isExcecption";
   val FIELD_sourceDownload_excecptionDescription = "sourceDownload_excecptionDescription";

}

 
