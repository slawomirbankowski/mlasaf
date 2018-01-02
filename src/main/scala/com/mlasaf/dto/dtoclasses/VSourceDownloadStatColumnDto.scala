/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dto 
 
 
case class VSourceDownloadStatColumnDto ( 
     val sourceDownloadStatColumnId : Long
     , val guid : Long
     , val insertedRowDate : java.util.Date
     , val lastUpdatedDate : java.util.Date
     , val sourceDownloadId : Long
     , val sourceViewColumnId : Long
     , val columnMinNumber : Double
     , val columnMaxNumber : Double
     , val columnMinStr : String
     , val columnMaxStr : String
     , val columnNonemptyCount : Long
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
     , val sourceViewColumn_sourceViewColumnId : Long
     , val sourceViewColumn_guid : Long
     , val sourceViewColumn_insertedRowDate : java.util.Date
     , val sourceViewColumn_lastUpdatedDate : java.util.Date
     , val sourceViewColumn_sourceViewId : Long
     , val sourceViewColumn_columnName : String
     , val sourceViewColumn_columnType : String 
     ) extends BaseReadOnlyDto {  
   def tableName : String = {    "vSourceDownloadStatColumn";    }  
   def fields : String = {    "sourceDownloadStatColumnId,guid,insertedRowDate,lastUpdatedDate,sourceDownloadId,sourceViewColumnId,columnMinNumber,columnMaxNumber,columnMinStr,columnMaxStr,columnNonemptyCount,sourceDownload_sourceDownloadId,sourceDownload_guid,sourceDownload_insertedRowDate,sourceDownload_lastUpdatedDate,sourceDownload_sourceScheduleId,sourceDownload_executorHostId,sourceDownload_executorContextId,sourceDownload_sourceViewId,sourceDownload_retryNumber,sourceDownload_isRunning,sourceDownload_isFinished,sourceDownload_isExcecption,sourceDownload_excecptionDescription,sourceViewColumn_sourceViewColumnId,sourceViewColumn_guid,sourceViewColumn_insertedRowDate,sourceViewColumn_lastUpdatedDate,sourceViewColumn_sourceViewId,sourceViewColumn_columnName,sourceViewColumn_columnType";    }  
   def pkFields : String = {    "";    }  
   def fkFields : String = {    "";    }  
   def nameField : String = {    "";    }  
 def getPk() : Long = {    sourceDownloadStatColumnId  }  
 def getInsertedRowDate() : java.util.Date = {    insertedRowDate  }  
 def getLastUpdatedDate() : java.util.Date = {    lastUpdatedDate  }  
 def getGuid() : Long = {    guid  }  
 def toAnyArray() : Array[Any] = {    Array(sourceDownloadStatColumnId,guid,insertedRowDate,lastUpdatedDate,sourceDownloadId,sourceViewColumnId,columnMinNumber,columnMaxNumber,columnMinStr,columnMaxStr,columnNonemptyCount,sourceDownload_sourceDownloadId,sourceDownload_guid,sourceDownload_insertedRowDate,sourceDownload_lastUpdatedDate,sourceDownload_sourceScheduleId,sourceDownload_executorHostId,sourceDownload_executorContextId,sourceDownload_sourceViewId,sourceDownload_retryNumber,sourceDownload_isRunning,sourceDownload_isFinished,sourceDownload_isExcecption,sourceDownload_excecptionDescription,sourceViewColumn_sourceViewColumnId,sourceViewColumn_guid,sourceViewColumn_insertedRowDate,sourceViewColumn_lastUpdatedDate,sourceViewColumn_sourceViewId,sourceViewColumn_columnName,sourceViewColumn_columnType)  }  
 def toStringArray() : Array[String] = {    Array(""+sourceDownloadStatColumnId,""+guid,""+insertedRowDate,""+lastUpdatedDate,""+sourceDownloadId,""+sourceViewColumnId,""+columnMinNumber,""+columnMaxNumber,""+columnMinStr,""+columnMaxStr,""+columnNonemptyCount,""+sourceDownload_sourceDownloadId,""+sourceDownload_guid,""+sourceDownload_insertedRowDate,""+sourceDownload_lastUpdatedDate,""+sourceDownload_sourceScheduleId,""+sourceDownload_executorHostId,""+sourceDownload_executorContextId,""+sourceDownload_sourceViewId,""+sourceDownload_retryNumber,""+sourceDownload_isRunning,""+sourceDownload_isFinished,""+sourceDownload_isExcecption,""+sourceDownload_excecptionDescription,""+sourceViewColumn_sourceViewColumnId,""+sourceViewColumn_guid,""+sourceViewColumn_insertedRowDate,""+sourceViewColumn_lastUpdatedDate,""+sourceViewColumn_sourceViewId,""+sourceViewColumn_columnName,""+sourceViewColumn_columnType)   }  
 def toJson() : String = {   "{" + "\"sourceDownloadStatColumnId\":\""+sourceDownloadStatColumnId+"\""+","+"\"guid\":\""+guid+"\""+","+"\"insertedRowDate\":\""+insertedRowDate+"\""+","+"\"lastUpdatedDate\":\""+lastUpdatedDate+"\""+","+"\"sourceDownloadId\":\""+sourceDownloadId+"\""+","+"\"sourceViewColumnId\":\""+sourceViewColumnId+"\""+","+"\"columnMinNumber\":\""+columnMinNumber+"\""+","+"\"columnMaxNumber\":\""+columnMaxNumber+"\""+","+"\"columnMinStr\":\""+columnMinStr+"\""+","+"\"columnMaxStr\":\""+columnMaxStr+"\""+","+"\"columnNonemptyCount\":\""+columnNonemptyCount+"\""+","+"\"sourceDownload_sourceDownloadId\":\""+sourceDownload_sourceDownloadId+"\""+","+"\"sourceDownload_guid\":\""+sourceDownload_guid+"\""+","+"\"sourceDownload_insertedRowDate\":\""+sourceDownload_insertedRowDate+"\""+","+"\"sourceDownload_lastUpdatedDate\":\""+sourceDownload_lastUpdatedDate+"\""+","+"\"sourceDownload_sourceScheduleId\":\""+sourceDownload_sourceScheduleId+"\""+","+"\"sourceDownload_executorHostId\":\""+sourceDownload_executorHostId+"\""+","+"\"sourceDownload_executorContextId\":\""+sourceDownload_executorContextId+"\""+","+"\"sourceDownload_sourceViewId\":\""+sourceDownload_sourceViewId+"\""+","+"\"sourceDownload_retryNumber\":\""+sourceDownload_retryNumber+"\""+","+"\"sourceDownload_isRunning\":\""+sourceDownload_isRunning+"\""+","+"\"sourceDownload_isFinished\":\""+sourceDownload_isFinished+"\""+","+"\"sourceDownload_isExcecption\":\""+sourceDownload_isExcecption+"\""+","+"\"sourceDownload_excecptionDescription\":\""+sourceDownload_excecptionDescription+"\""+","+"\"sourceViewColumn_sourceViewColumnId\":\""+sourceViewColumn_sourceViewColumnId+"\""+","+"\"sourceViewColumn_guid\":\""+sourceViewColumn_guid+"\""+","+"\"sourceViewColumn_insertedRowDate\":\""+sourceViewColumn_insertedRowDate+"\""+","+"\"sourceViewColumn_lastUpdatedDate\":\""+sourceViewColumn_lastUpdatedDate+"\""+","+"\"sourceViewColumn_sourceViewId\":\""+sourceViewColumn_sourceViewId+"\""+","+"\"sourceViewColumn_columnName\":\""+sourceViewColumn_columnName+"\""+","+"\"sourceViewColumn_columnType\":\""+sourceViewColumn_columnType+"\"" + "}"   }  
 def toFullString() : String = {    "sourceDownloadStatColumnId:'"+sourceDownloadStatColumnId+"'"+","+"guid:'"+guid+"'"+","+"insertedRowDate:'"+insertedRowDate+"'"+","+"lastUpdatedDate:'"+lastUpdatedDate+"'"+","+"sourceDownloadId:'"+sourceDownloadId+"'"+","+"sourceViewColumnId:'"+sourceViewColumnId+"'"+","+"columnMinNumber:'"+columnMinNumber+"'"+","+"columnMaxNumber:'"+columnMaxNumber+"'"+","+"columnMinStr:'"+columnMinStr+"'"+","+"columnMaxStr:'"+columnMaxStr+"'"+","+"columnNonemptyCount:'"+columnNonemptyCount+"'"+","+"sourceDownload_sourceDownloadId:'"+sourceDownload_sourceDownloadId+"'"+","+"sourceDownload_guid:'"+sourceDownload_guid+"'"+","+"sourceDownload_insertedRowDate:'"+sourceDownload_insertedRowDate+"'"+","+"sourceDownload_lastUpdatedDate:'"+sourceDownload_lastUpdatedDate+"'"+","+"sourceDownload_sourceScheduleId:'"+sourceDownload_sourceScheduleId+"'"+","+"sourceDownload_executorHostId:'"+sourceDownload_executorHostId+"'"+","+"sourceDownload_executorContextId:'"+sourceDownload_executorContextId+"'"+","+"sourceDownload_sourceViewId:'"+sourceDownload_sourceViewId+"'"+","+"sourceDownload_retryNumber:'"+sourceDownload_retryNumber+"'"+","+"sourceDownload_isRunning:'"+sourceDownload_isRunning+"'"+","+"sourceDownload_isFinished:'"+sourceDownload_isFinished+"'"+","+"sourceDownload_isExcecption:'"+sourceDownload_isExcecption+"'"+","+"sourceDownload_excecptionDescription:'"+sourceDownload_excecptionDescription+"'"+","+"sourceViewColumn_sourceViewColumnId:'"+sourceViewColumn_sourceViewColumnId+"'"+","+"sourceViewColumn_guid:'"+sourceViewColumn_guid+"'"+","+"sourceViewColumn_insertedRowDate:'"+sourceViewColumn_insertedRowDate+"'"+","+"sourceViewColumn_lastUpdatedDate:'"+sourceViewColumn_lastUpdatedDate+"'"+","+"sourceViewColumn_sourceViewId:'"+sourceViewColumn_sourceViewId+"'"+","+"sourceViewColumn_columnName:'"+sourceViewColumn_columnName+"'"+","+"sourceViewColumn_columnType:'"+sourceViewColumn_columnType+"'"   } 
   def getFieldValue(name : String) : Any = { 
    val ret = name match { 
    case "sourceDownloadStatColumnId" => sourceDownloadStatColumnId  
     case "guid" => guid  
     case "insertedRowDate" => insertedRowDate  
     case "lastUpdatedDate" => lastUpdatedDate  
     case "sourceDownloadId" => sourceDownloadId  
     case "sourceViewColumnId" => sourceViewColumnId  
     case "columnMinNumber" => columnMinNumber  
     case "columnMaxNumber" => columnMaxNumber  
     case "columnMinStr" => columnMinStr  
     case "columnMaxStr" => columnMaxStr  
     case "columnNonemptyCount" => columnNonemptyCount  
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
     case "sourceViewColumn_sourceViewColumnId" => sourceViewColumn_sourceViewColumnId  
     case "sourceViewColumn_guid" => sourceViewColumn_guid  
     case "sourceViewColumn_insertedRowDate" => sourceViewColumn_insertedRowDate  
     case "sourceViewColumn_lastUpdatedDate" => sourceViewColumn_lastUpdatedDate  
     case "sourceViewColumn_sourceViewId" => sourceViewColumn_sourceViewId  
     case "sourceViewColumn_columnName" => sourceViewColumn_columnName  
     case "sourceViewColumn_columnType" => sourceViewColumn_columnType   
    case _ => null 
    } 
    ret 
  } 
   def getFieldTypeName(name : String) : String = { 
    val ret = name match { 
    case "sourceDownloadStatColumnId" => "Long"  
     case "guid" => "Long"  
     case "insertedRowDate" => "java.util.Date"  
     case "lastUpdatedDate" => "java.util.Date"  
     case "sourceDownloadId" => "Long"  
     case "sourceViewColumnId" => "Long"  
     case "columnMinNumber" => "Double"  
     case "columnMaxNumber" => "Double"  
     case "columnMinStr" => "String"  
     case "columnMaxStr" => "String"  
     case "columnNonemptyCount" => "Long"  
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
     case "sourceViewColumn_sourceViewColumnId" => "Long"  
     case "sourceViewColumn_guid" => "Long"  
     case "sourceViewColumn_insertedRowDate" => "java.util.Date"  
     case "sourceViewColumn_lastUpdatedDate" => "java.util.Date"  
     case "sourceViewColumn_sourceViewId" => "Long"  
     case "sourceViewColumn_columnName" => "String"  
     case "sourceViewColumn_columnType" => "String"   
    case _ => "Object" 
    } 
    ret 
  } 
 } 
object VSourceDownloadStatColumnDto { 
  val TABLE_NAME = "vSourceDownloadStatColumn"; 
   val FIELD_sourceDownloadStatColumnId = "sourceDownloadStatColumnId";
   val FIELD_guid = "guid";
   val FIELD_insertedRowDate = "insertedRowDate";
   val FIELD_lastUpdatedDate = "lastUpdatedDate";
   val FIELD_sourceDownloadId = "sourceDownloadId";
   val FIELD_sourceViewColumnId = "sourceViewColumnId";
   val FIELD_columnMinNumber = "columnMinNumber";
   val FIELD_columnMaxNumber = "columnMaxNumber";
   val FIELD_columnMinStr = "columnMinStr";
   val FIELD_columnMaxStr = "columnMaxStr";
   val FIELD_columnNonemptyCount = "columnNonemptyCount";
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
   val FIELD_sourceViewColumn_sourceViewColumnId = "sourceViewColumn_sourceViewColumnId";
   val FIELD_sourceViewColumn_guid = "sourceViewColumn_guid";
   val FIELD_sourceViewColumn_insertedRowDate = "sourceViewColumn_insertedRowDate";
   val FIELD_sourceViewColumn_lastUpdatedDate = "sourceViewColumn_lastUpdatedDate";
   val FIELD_sourceViewColumn_sourceViewId = "sourceViewColumn_sourceViewId";
   val FIELD_sourceViewColumn_columnName = "sourceViewColumn_columnName";
   val FIELD_sourceViewColumn_columnType = "sourceViewColumn_columnType";

}

 