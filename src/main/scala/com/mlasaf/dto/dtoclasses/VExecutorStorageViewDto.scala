/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dto 
 
 
case class VExecutorStorageViewDto ( 
     val executorStorageViewId : Long
     , val guid : Long
     , val insertedRowDate : java.util.Date
     , val lastUpdatedDate : java.util.Date
     , val executorStorageSnapshotId : Long
     , val executorStorageId : Long
     , val sourceDownloadId : Long
     , val sourceViewId : Long
     , val executorStorageResourceId : Long
     , val executorStorage_executorStorageId : Long
     , val executorStorage_guid : Long
     , val executorStorage_insertedRowDate : java.util.Date
     , val executorStorage_lastUpdatedDate : java.util.Date
     , val executorStorage_executorHostId : Long
     , val executorStorage_executorStorageTypeId : Long
     , val executorStorage_storageDefinition : String
     , val executorStorage_storageBasePath : String
     , val executorStorage_storageFulllPath : String
     , val executorStorage_isRunning : Int
     , val executorStorage_portNumber : Int
     , val executorStorageResource_executorStorageResourceId : Long
     , val executorStorageResource_guid : Long
     , val executorStorageResource_insertedRowDate : java.util.Date
     , val executorStorageResource_lastUpdatedDate : java.util.Date
     , val executorStorageResource_executorStorageId : Long
     , val executorStorageResource_resourcePath : String
     , val executorStorageResource_resourceSize : Long
     , val executorStorageResource_resourceRowsCount : Long
     , val executorStorageResource_isValid : Int
     , val executorStorageSnapshot_executorStorageSnapshotId : Long
     , val executorStorageSnapshot_guid : Long
     , val executorStorageSnapshot_insertedRowDate : java.util.Date
     , val executorStorageSnapshot_lastUpdatedDate : java.util.Date
     , val executorStorageSnapshot_executorInstanceId : Long
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
     , val sourceView_sourceViewId : Long
     , val sourceView_guid : Long
     , val sourceView_insertedRowDate : java.util.Date
     , val sourceView_lastUpdatedDate : java.util.Date
     , val sourceView_sourceInstanceId : Long
     , val sourceView_sourceViewTypeId : Long
     , val sourceView_sourceViewName : String
     , val sourceView_sourceViewDefinition : String
     , val sourceView_isExisting : Int 
     ) extends BaseReadOnlyDto {  
   def tableName : String = {    "vExecutorStorageView";    }  
   def fields : String = {    "executorStorageViewId,guid,insertedRowDate,lastUpdatedDate,executorStorageSnapshotId,executorStorageId,sourceDownloadId,sourceViewId,executorStorageResourceId,executorStorage_executorStorageId,executorStorage_guid,executorStorage_insertedRowDate,executorStorage_lastUpdatedDate,executorStorage_executorHostId,executorStorage_executorStorageTypeId,executorStorage_storageDefinition,executorStorage_storageBasePath,executorStorage_storageFulllPath,executorStorage_isRunning,executorStorage_portNumber,executorStorageResource_executorStorageResourceId,executorStorageResource_guid,executorStorageResource_insertedRowDate,executorStorageResource_lastUpdatedDate,executorStorageResource_executorStorageId,executorStorageResource_resourcePath,executorStorageResource_resourceSize,executorStorageResource_resourceRowsCount,executorStorageResource_isValid,executorStorageSnapshot_executorStorageSnapshotId,executorStorageSnapshot_guid,executorStorageSnapshot_insertedRowDate,executorStorageSnapshot_lastUpdatedDate,executorStorageSnapshot_executorInstanceId,sourceDownload_sourceDownloadId,sourceDownload_guid,sourceDownload_insertedRowDate,sourceDownload_lastUpdatedDate,sourceDownload_sourceScheduleId,sourceDownload_executorHostId,sourceDownload_executorContextId,sourceDownload_sourceViewId,sourceDownload_retryNumber,sourceDownload_isRunning,sourceDownload_isFinished,sourceDownload_isExcecption,sourceDownload_excecptionDescription,sourceView_sourceViewId,sourceView_guid,sourceView_insertedRowDate,sourceView_lastUpdatedDate,sourceView_sourceInstanceId,sourceView_sourceViewTypeId,sourceView_sourceViewName,sourceView_sourceViewDefinition,sourceView_isExisting";    }  
   def pkFields : String = {    "";    }  
   def fkFields : String = {    "";    }  
   def nameField : String = {    "";    }  
 def getPk() : Long = {    executorStorageViewId  }  
 def getInsertedRowDate() : java.util.Date = {    insertedRowDate  }  
 def getLastUpdatedDate() : java.util.Date = {    lastUpdatedDate  }  
 def getGuid() : Long = {    guid  }  
 def toAnyArray() : Array[Any] = {    Array(executorStorageViewId,guid,insertedRowDate,lastUpdatedDate,executorStorageSnapshotId,executorStorageId,sourceDownloadId,sourceViewId,executorStorageResourceId,executorStorage_executorStorageId,executorStorage_guid,executorStorage_insertedRowDate,executorStorage_lastUpdatedDate,executorStorage_executorHostId,executorStorage_executorStorageTypeId,executorStorage_storageDefinition,executorStorage_storageBasePath,executorStorage_storageFulllPath,executorStorage_isRunning,executorStorage_portNumber,executorStorageResource_executorStorageResourceId,executorStorageResource_guid,executorStorageResource_insertedRowDate,executorStorageResource_lastUpdatedDate,executorStorageResource_executorStorageId,executorStorageResource_resourcePath,executorStorageResource_resourceSize,executorStorageResource_resourceRowsCount,executorStorageResource_isValid,executorStorageSnapshot_executorStorageSnapshotId,executorStorageSnapshot_guid,executorStorageSnapshot_insertedRowDate,executorStorageSnapshot_lastUpdatedDate,executorStorageSnapshot_executorInstanceId,sourceDownload_sourceDownloadId,sourceDownload_guid,sourceDownload_insertedRowDate,sourceDownload_lastUpdatedDate,sourceDownload_sourceScheduleId,sourceDownload_executorHostId,sourceDownload_executorContextId,sourceDownload_sourceViewId,sourceDownload_retryNumber,sourceDownload_isRunning,sourceDownload_isFinished,sourceDownload_isExcecption,sourceDownload_excecptionDescription,sourceView_sourceViewId,sourceView_guid,sourceView_insertedRowDate,sourceView_lastUpdatedDate,sourceView_sourceInstanceId,sourceView_sourceViewTypeId,sourceView_sourceViewName,sourceView_sourceViewDefinition,sourceView_isExisting)  }  
 def toStringArray() : Array[String] = {    Array(""+executorStorageViewId,""+guid,""+insertedRowDate,""+lastUpdatedDate,""+executorStorageSnapshotId,""+executorStorageId,""+sourceDownloadId,""+sourceViewId,""+executorStorageResourceId,""+executorStorage_executorStorageId,""+executorStorage_guid,""+executorStorage_insertedRowDate,""+executorStorage_lastUpdatedDate,""+executorStorage_executorHostId,""+executorStorage_executorStorageTypeId,""+executorStorage_storageDefinition,""+executorStorage_storageBasePath,""+executorStorage_storageFulllPath,""+executorStorage_isRunning,""+executorStorage_portNumber,""+executorStorageResource_executorStorageResourceId,""+executorStorageResource_guid,""+executorStorageResource_insertedRowDate,""+executorStorageResource_lastUpdatedDate,""+executorStorageResource_executorStorageId,""+executorStorageResource_resourcePath,""+executorStorageResource_resourceSize,""+executorStorageResource_resourceRowsCount,""+executorStorageResource_isValid,""+executorStorageSnapshot_executorStorageSnapshotId,""+executorStorageSnapshot_guid,""+executorStorageSnapshot_insertedRowDate,""+executorStorageSnapshot_lastUpdatedDate,""+executorStorageSnapshot_executorInstanceId,""+sourceDownload_sourceDownloadId,""+sourceDownload_guid,""+sourceDownload_insertedRowDate,""+sourceDownload_lastUpdatedDate,""+sourceDownload_sourceScheduleId,""+sourceDownload_executorHostId,""+sourceDownload_executorContextId,""+sourceDownload_sourceViewId,""+sourceDownload_retryNumber,""+sourceDownload_isRunning,""+sourceDownload_isFinished,""+sourceDownload_isExcecption,""+sourceDownload_excecptionDescription,""+sourceView_sourceViewId,""+sourceView_guid,""+sourceView_insertedRowDate,""+sourceView_lastUpdatedDate,""+sourceView_sourceInstanceId,""+sourceView_sourceViewTypeId,""+sourceView_sourceViewName,""+sourceView_sourceViewDefinition,""+sourceView_isExisting)   }  
 def toFullString() : String = {    "executorStorageViewId:'"+executorStorageViewId+"'"+","+"guid:'"+guid+"'"+","+"insertedRowDate:'"+insertedRowDate+"'"+","+"lastUpdatedDate:'"+lastUpdatedDate+"'"+","+"executorStorageSnapshotId:'"+executorStorageSnapshotId+"'"+","+"executorStorageId:'"+executorStorageId+"'"+","+"sourceDownloadId:'"+sourceDownloadId+"'"+","+"sourceViewId:'"+sourceViewId+"'"+","+"executorStorageResourceId:'"+executorStorageResourceId+"'"+","+"executorStorage_executorStorageId:'"+executorStorage_executorStorageId+"'"+","+"executorStorage_guid:'"+executorStorage_guid+"'"+","+"executorStorage_insertedRowDate:'"+executorStorage_insertedRowDate+"'"+","+"executorStorage_lastUpdatedDate:'"+executorStorage_lastUpdatedDate+"'"+","+"executorStorage_executorHostId:'"+executorStorage_executorHostId+"'"+","+"executorStorage_executorStorageTypeId:'"+executorStorage_executorStorageTypeId+"'"+","+"executorStorage_storageDefinition:'"+executorStorage_storageDefinition+"'"+","+"executorStorage_storageBasePath:'"+executorStorage_storageBasePath+"'"+","+"executorStorage_storageFulllPath:'"+executorStorage_storageFulllPath+"'"+","+"executorStorage_isRunning:'"+executorStorage_isRunning+"'"+","+"executorStorage_portNumber:'"+executorStorage_portNumber+"'"+","+"executorStorageResource_executorStorageResourceId:'"+executorStorageResource_executorStorageResourceId+"'"+","+"executorStorageResource_guid:'"+executorStorageResource_guid+"'"+","+"executorStorageResource_insertedRowDate:'"+executorStorageResource_insertedRowDate+"'"+","+"executorStorageResource_lastUpdatedDate:'"+executorStorageResource_lastUpdatedDate+"'"+","+"executorStorageResource_executorStorageId:'"+executorStorageResource_executorStorageId+"'"+","+"executorStorageResource_resourcePath:'"+executorStorageResource_resourcePath+"'"+","+"executorStorageResource_resourceSize:'"+executorStorageResource_resourceSize+"'"+","+"executorStorageResource_resourceRowsCount:'"+executorStorageResource_resourceRowsCount+"'"+","+"executorStorageResource_isValid:'"+executorStorageResource_isValid+"'"+","+"executorStorageSnapshot_executorStorageSnapshotId:'"+executorStorageSnapshot_executorStorageSnapshotId+"'"+","+"executorStorageSnapshot_guid:'"+executorStorageSnapshot_guid+"'"+","+"executorStorageSnapshot_insertedRowDate:'"+executorStorageSnapshot_insertedRowDate+"'"+","+"executorStorageSnapshot_lastUpdatedDate:'"+executorStorageSnapshot_lastUpdatedDate+"'"+","+"executorStorageSnapshot_executorInstanceId:'"+executorStorageSnapshot_executorInstanceId+"'"+","+"sourceDownload_sourceDownloadId:'"+sourceDownload_sourceDownloadId+"'"+","+"sourceDownload_guid:'"+sourceDownload_guid+"'"+","+"sourceDownload_insertedRowDate:'"+sourceDownload_insertedRowDate+"'"+","+"sourceDownload_lastUpdatedDate:'"+sourceDownload_lastUpdatedDate+"'"+","+"sourceDownload_sourceScheduleId:'"+sourceDownload_sourceScheduleId+"'"+","+"sourceDownload_executorHostId:'"+sourceDownload_executorHostId+"'"+","+"sourceDownload_executorContextId:'"+sourceDownload_executorContextId+"'"+","+"sourceDownload_sourceViewId:'"+sourceDownload_sourceViewId+"'"+","+"sourceDownload_retryNumber:'"+sourceDownload_retryNumber+"'"+","+"sourceDownload_isRunning:'"+sourceDownload_isRunning+"'"+","+"sourceDownload_isFinished:'"+sourceDownload_isFinished+"'"+","+"sourceDownload_isExcecption:'"+sourceDownload_isExcecption+"'"+","+"sourceDownload_excecptionDescription:'"+sourceDownload_excecptionDescription+"'"+","+"sourceView_sourceViewId:'"+sourceView_sourceViewId+"'"+","+"sourceView_guid:'"+sourceView_guid+"'"+","+"sourceView_insertedRowDate:'"+sourceView_insertedRowDate+"'"+","+"sourceView_lastUpdatedDate:'"+sourceView_lastUpdatedDate+"'"+","+"sourceView_sourceInstanceId:'"+sourceView_sourceInstanceId+"'"+","+"sourceView_sourceViewTypeId:'"+sourceView_sourceViewTypeId+"'"+","+"sourceView_sourceViewName:'"+sourceView_sourceViewName+"'"+","+"sourceView_sourceViewDefinition:'"+sourceView_sourceViewDefinition+"'"+","+"sourceView_isExisting:'"+sourceView_isExisting+"'"   } 
   def getFieldValue(name : String) : Any = { 
    val ret = name match { 
    case "executorStorageViewId" => executorStorageViewId  
     case "guid" => guid  
     case "insertedRowDate" => insertedRowDate  
     case "lastUpdatedDate" => lastUpdatedDate  
     case "executorStorageSnapshotId" => executorStorageSnapshotId  
     case "executorStorageId" => executorStorageId  
     case "sourceDownloadId" => sourceDownloadId  
     case "sourceViewId" => sourceViewId  
     case "executorStorageResourceId" => executorStorageResourceId  
     case "executorStorage_executorStorageId" => executorStorage_executorStorageId  
     case "executorStorage_guid" => executorStorage_guid  
     case "executorStorage_insertedRowDate" => executorStorage_insertedRowDate  
     case "executorStorage_lastUpdatedDate" => executorStorage_lastUpdatedDate  
     case "executorStorage_executorHostId" => executorStorage_executorHostId  
     case "executorStorage_executorStorageTypeId" => executorStorage_executorStorageTypeId  
     case "executorStorage_storageDefinition" => executorStorage_storageDefinition  
     case "executorStorage_storageBasePath" => executorStorage_storageBasePath  
     case "executorStorage_storageFulllPath" => executorStorage_storageFulllPath  
     case "executorStorage_isRunning" => executorStorage_isRunning  
     case "executorStorage_portNumber" => executorStorage_portNumber  
     case "executorStorageResource_executorStorageResourceId" => executorStorageResource_executorStorageResourceId  
     case "executorStorageResource_guid" => executorStorageResource_guid  
     case "executorStorageResource_insertedRowDate" => executorStorageResource_insertedRowDate  
     case "executorStorageResource_lastUpdatedDate" => executorStorageResource_lastUpdatedDate  
     case "executorStorageResource_executorStorageId" => executorStorageResource_executorStorageId  
     case "executorStorageResource_resourcePath" => executorStorageResource_resourcePath  
     case "executorStorageResource_resourceSize" => executorStorageResource_resourceSize  
     case "executorStorageResource_resourceRowsCount" => executorStorageResource_resourceRowsCount  
     case "executorStorageResource_isValid" => executorStorageResource_isValid  
     case "executorStorageSnapshot_executorStorageSnapshotId" => executorStorageSnapshot_executorStorageSnapshotId  
     case "executorStorageSnapshot_guid" => executorStorageSnapshot_guid  
     case "executorStorageSnapshot_insertedRowDate" => executorStorageSnapshot_insertedRowDate  
     case "executorStorageSnapshot_lastUpdatedDate" => executorStorageSnapshot_lastUpdatedDate  
     case "executorStorageSnapshot_executorInstanceId" => executorStorageSnapshot_executorInstanceId  
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
     case "sourceView_sourceViewId" => sourceView_sourceViewId  
     case "sourceView_guid" => sourceView_guid  
     case "sourceView_insertedRowDate" => sourceView_insertedRowDate  
     case "sourceView_lastUpdatedDate" => sourceView_lastUpdatedDate  
     case "sourceView_sourceInstanceId" => sourceView_sourceInstanceId  
     case "sourceView_sourceViewTypeId" => sourceView_sourceViewTypeId  
     case "sourceView_sourceViewName" => sourceView_sourceViewName  
     case "sourceView_sourceViewDefinition" => sourceView_sourceViewDefinition  
     case "sourceView_isExisting" => sourceView_isExisting   
    case _ => null 
    } 
    ret 
  } 
   def getFieldTypeName(name : String) : String = { 
    val ret = name match { 
    case "executorStorageViewId" => "Long"  
     case "guid" => "Long"  
     case "insertedRowDate" => "java.util.Date"  
     case "lastUpdatedDate" => "java.util.Date"  
     case "executorStorageSnapshotId" => "Long"  
     case "executorStorageId" => "Long"  
     case "sourceDownloadId" => "Long"  
     case "sourceViewId" => "Long"  
     case "executorStorageResourceId" => "Long"  
     case "executorStorage_executorStorageId" => "Long"  
     case "executorStorage_guid" => "Long"  
     case "executorStorage_insertedRowDate" => "java.util.Date"  
     case "executorStorage_lastUpdatedDate" => "java.util.Date"  
     case "executorStorage_executorHostId" => "Long"  
     case "executorStorage_executorStorageTypeId" => "Long"  
     case "executorStorage_storageDefinition" => "String"  
     case "executorStorage_storageBasePath" => "String"  
     case "executorStorage_storageFulllPath" => "String"  
     case "executorStorage_isRunning" => "Int"  
     case "executorStorage_portNumber" => "Int"  
     case "executorStorageResource_executorStorageResourceId" => "Long"  
     case "executorStorageResource_guid" => "Long"  
     case "executorStorageResource_insertedRowDate" => "java.util.Date"  
     case "executorStorageResource_lastUpdatedDate" => "java.util.Date"  
     case "executorStorageResource_executorStorageId" => "Long"  
     case "executorStorageResource_resourcePath" => "String"  
     case "executorStorageResource_resourceSize" => "Long"  
     case "executorStorageResource_resourceRowsCount" => "Long"  
     case "executorStorageResource_isValid" => "Int"  
     case "executorStorageSnapshot_executorStorageSnapshotId" => "Long"  
     case "executorStorageSnapshot_guid" => "Long"  
     case "executorStorageSnapshot_insertedRowDate" => "java.util.Date"  
     case "executorStorageSnapshot_lastUpdatedDate" => "java.util.Date"  
     case "executorStorageSnapshot_executorInstanceId" => "Long"  
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
     case "sourceView_sourceViewId" => "Long"  
     case "sourceView_guid" => "Long"  
     case "sourceView_insertedRowDate" => "java.util.Date"  
     case "sourceView_lastUpdatedDate" => "java.util.Date"  
     case "sourceView_sourceInstanceId" => "Long"  
     case "sourceView_sourceViewTypeId" => "Long"  
     case "sourceView_sourceViewName" => "String"  
     case "sourceView_sourceViewDefinition" => "String"  
     case "sourceView_isExisting" => "Int"   
    case _ => "Object" 
    } 
    ret 
  } 
 } 
object VExecutorStorageViewDto { 
  val TABLE_NAME = "vExecutorStorageView"; 
   val FIELD_executorStorageViewId = "executorStorageViewId";
   val FIELD_guid = "guid";
   val FIELD_insertedRowDate = "insertedRowDate";
   val FIELD_lastUpdatedDate = "lastUpdatedDate";
   val FIELD_executorStorageSnapshotId = "executorStorageSnapshotId";
   val FIELD_executorStorageId = "executorStorageId";
   val FIELD_sourceDownloadId = "sourceDownloadId";
   val FIELD_sourceViewId = "sourceViewId";
   val FIELD_executorStorageResourceId = "executorStorageResourceId";
   val FIELD_executorStorage_executorStorageId = "executorStorage_executorStorageId";
   val FIELD_executorStorage_guid = "executorStorage_guid";
   val FIELD_executorStorage_insertedRowDate = "executorStorage_insertedRowDate";
   val FIELD_executorStorage_lastUpdatedDate = "executorStorage_lastUpdatedDate";
   val FIELD_executorStorage_executorHostId = "executorStorage_executorHostId";
   val FIELD_executorStorage_executorStorageTypeId = "executorStorage_executorStorageTypeId";
   val FIELD_executorStorage_storageDefinition = "executorStorage_storageDefinition";
   val FIELD_executorStorage_storageBasePath = "executorStorage_storageBasePath";
   val FIELD_executorStorage_storageFulllPath = "executorStorage_storageFulllPath";
   val FIELD_executorStorage_isRunning = "executorStorage_isRunning";
   val FIELD_executorStorage_portNumber = "executorStorage_portNumber";
   val FIELD_executorStorageResource_executorStorageResourceId = "executorStorageResource_executorStorageResourceId";
   val FIELD_executorStorageResource_guid = "executorStorageResource_guid";
   val FIELD_executorStorageResource_insertedRowDate = "executorStorageResource_insertedRowDate";
   val FIELD_executorStorageResource_lastUpdatedDate = "executorStorageResource_lastUpdatedDate";
   val FIELD_executorStorageResource_executorStorageId = "executorStorageResource_executorStorageId";
   val FIELD_executorStorageResource_resourcePath = "executorStorageResource_resourcePath";
   val FIELD_executorStorageResource_resourceSize = "executorStorageResource_resourceSize";
   val FIELD_executorStorageResource_resourceRowsCount = "executorStorageResource_resourceRowsCount";
   val FIELD_executorStorageResource_isValid = "executorStorageResource_isValid";
   val FIELD_executorStorageSnapshot_executorStorageSnapshotId = "executorStorageSnapshot_executorStorageSnapshotId";
   val FIELD_executorStorageSnapshot_guid = "executorStorageSnapshot_guid";
   val FIELD_executorStorageSnapshot_insertedRowDate = "executorStorageSnapshot_insertedRowDate";
   val FIELD_executorStorageSnapshot_lastUpdatedDate = "executorStorageSnapshot_lastUpdatedDate";
   val FIELD_executorStorageSnapshot_executorInstanceId = "executorStorageSnapshot_executorInstanceId";
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
   val FIELD_sourceView_sourceViewId = "sourceView_sourceViewId";
   val FIELD_sourceView_guid = "sourceView_guid";
   val FIELD_sourceView_insertedRowDate = "sourceView_insertedRowDate";
   val FIELD_sourceView_lastUpdatedDate = "sourceView_lastUpdatedDate";
   val FIELD_sourceView_sourceInstanceId = "sourceView_sourceInstanceId";
   val FIELD_sourceView_sourceViewTypeId = "sourceView_sourceViewTypeId";
   val FIELD_sourceView_sourceViewName = "sourceView_sourceViewName";
   val FIELD_sourceView_sourceViewDefinition = "sourceView_sourceViewDefinition";
   val FIELD_sourceView_isExisting = "sourceView_isExisting";

}

 
