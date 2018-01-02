/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dto 
 
 
case class VDownloadTransformExecutorStorageDto ( 
     val downloadTransformExecutorStorageId : Long
     , val guid : Long
     , val insertedRowDate : java.util.Date
     , val lastUpdatedDate : java.util.Date
     , val downloadTransformGroupId : Long
     , val executorStorageViewId : Long
     , val downloadTransformGroup_downloadTransformGroupId : Long
     , val downloadTransformGroup_guid : Long
     , val downloadTransformGroup_insertedRowDate : java.util.Date
     , val downloadTransformGroup_lastUpdatedDate : java.util.Date
     , val downloadTransformGroup_downloadTransformGroupName : String
     , val executorStorageView_executorStorageViewId : Long
     , val executorStorageView_guid : Long
     , val executorStorageView_insertedRowDate : java.util.Date
     , val executorStorageView_lastUpdatedDate : java.util.Date
     , val executorStorageView_executorStorageSnapshotId : Long
     , val executorStorageView_executorStorageId : Long
     , val executorStorageView_sourceDownloadId : Long
     , val executorStorageView_sourceViewId : Long
     , val executorStorageView_executorStorageResourceId : Long 
     ) extends BaseReadOnlyDto {  
   def tableName : String = {    "vDownloadTransformExecutorStorage";    }  
   def fields : String = {    "downloadTransformExecutorStorageId,guid,insertedRowDate,lastUpdatedDate,downloadTransformGroupId,executorStorageViewId,downloadTransformGroup_downloadTransformGroupId,downloadTransformGroup_guid,downloadTransformGroup_insertedRowDate,downloadTransformGroup_lastUpdatedDate,downloadTransformGroup_downloadTransformGroupName,executorStorageView_executorStorageViewId,executorStorageView_guid,executorStorageView_insertedRowDate,executorStorageView_lastUpdatedDate,executorStorageView_executorStorageSnapshotId,executorStorageView_executorStorageId,executorStorageView_sourceDownloadId,executorStorageView_sourceViewId,executorStorageView_executorStorageResourceId";    }  
   def pkFields : String = {    "";    }  
   def fkFields : String = {    "";    }  
   def nameField : String = {    "";    }  
 def getPk() : Long = {    downloadTransformExecutorStorageId  }  
 def getInsertedRowDate() : java.util.Date = {    insertedRowDate  }  
 def getLastUpdatedDate() : java.util.Date = {    lastUpdatedDate  }  
 def getGuid() : Long = {    guid  }  
 def toAnyArray() : Array[Any] = {    Array(downloadTransformExecutorStorageId,guid,insertedRowDate,lastUpdatedDate,downloadTransformGroupId,executorStorageViewId,downloadTransformGroup_downloadTransformGroupId,downloadTransformGroup_guid,downloadTransformGroup_insertedRowDate,downloadTransformGroup_lastUpdatedDate,downloadTransformGroup_downloadTransformGroupName,executorStorageView_executorStorageViewId,executorStorageView_guid,executorStorageView_insertedRowDate,executorStorageView_lastUpdatedDate,executorStorageView_executorStorageSnapshotId,executorStorageView_executorStorageId,executorStorageView_sourceDownloadId,executorStorageView_sourceViewId,executorStorageView_executorStorageResourceId)  }  
 def toStringArray() : Array[String] = {    Array(""+downloadTransformExecutorStorageId,""+guid,""+insertedRowDate,""+lastUpdatedDate,""+downloadTransformGroupId,""+executorStorageViewId,""+downloadTransformGroup_downloadTransformGroupId,""+downloadTransformGroup_guid,""+downloadTransformGroup_insertedRowDate,""+downloadTransformGroup_lastUpdatedDate,""+downloadTransformGroup_downloadTransformGroupName,""+executorStorageView_executorStorageViewId,""+executorStorageView_guid,""+executorStorageView_insertedRowDate,""+executorStorageView_lastUpdatedDate,""+executorStorageView_executorStorageSnapshotId,""+executorStorageView_executorStorageId,""+executorStorageView_sourceDownloadId,""+executorStorageView_sourceViewId,""+executorStorageView_executorStorageResourceId)   }  
 def toJson() : String = {   "{" + "\"downloadTransformExecutorStorageId\":\""+downloadTransformExecutorStorageId+"\""+","+"\"guid\":\""+guid+"\""+","+"\"insertedRowDate\":\""+insertedRowDate+"\""+","+"\"lastUpdatedDate\":\""+lastUpdatedDate+"\""+","+"\"downloadTransformGroupId\":\""+downloadTransformGroupId+"\""+","+"\"executorStorageViewId\":\""+executorStorageViewId+"\""+","+"\"downloadTransformGroup_downloadTransformGroupId\":\""+downloadTransformGroup_downloadTransformGroupId+"\""+","+"\"downloadTransformGroup_guid\":\""+downloadTransformGroup_guid+"\""+","+"\"downloadTransformGroup_insertedRowDate\":\""+downloadTransformGroup_insertedRowDate+"\""+","+"\"downloadTransformGroup_lastUpdatedDate\":\""+downloadTransformGroup_lastUpdatedDate+"\""+","+"\"downloadTransformGroup_downloadTransformGroupName\":\""+downloadTransformGroup_downloadTransformGroupName+"\""+","+"\"executorStorageView_executorStorageViewId\":\""+executorStorageView_executorStorageViewId+"\""+","+"\"executorStorageView_guid\":\""+executorStorageView_guid+"\""+","+"\"executorStorageView_insertedRowDate\":\""+executorStorageView_insertedRowDate+"\""+","+"\"executorStorageView_lastUpdatedDate\":\""+executorStorageView_lastUpdatedDate+"\""+","+"\"executorStorageView_executorStorageSnapshotId\":\""+executorStorageView_executorStorageSnapshotId+"\""+","+"\"executorStorageView_executorStorageId\":\""+executorStorageView_executorStorageId+"\""+","+"\"executorStorageView_sourceDownloadId\":\""+executorStorageView_sourceDownloadId+"\""+","+"\"executorStorageView_sourceViewId\":\""+executorStorageView_sourceViewId+"\""+","+"\"executorStorageView_executorStorageResourceId\":\""+executorStorageView_executorStorageResourceId+"\"" + "}"   }  
 def toFullString() : String = {    "downloadTransformExecutorStorageId:'"+downloadTransformExecutorStorageId+"'"+","+"guid:'"+guid+"'"+","+"insertedRowDate:'"+insertedRowDate+"'"+","+"lastUpdatedDate:'"+lastUpdatedDate+"'"+","+"downloadTransformGroupId:'"+downloadTransformGroupId+"'"+","+"executorStorageViewId:'"+executorStorageViewId+"'"+","+"downloadTransformGroup_downloadTransformGroupId:'"+downloadTransformGroup_downloadTransformGroupId+"'"+","+"downloadTransformGroup_guid:'"+downloadTransformGroup_guid+"'"+","+"downloadTransformGroup_insertedRowDate:'"+downloadTransformGroup_insertedRowDate+"'"+","+"downloadTransformGroup_lastUpdatedDate:'"+downloadTransformGroup_lastUpdatedDate+"'"+","+"downloadTransformGroup_downloadTransformGroupName:'"+downloadTransformGroup_downloadTransformGroupName+"'"+","+"executorStorageView_executorStorageViewId:'"+executorStorageView_executorStorageViewId+"'"+","+"executorStorageView_guid:'"+executorStorageView_guid+"'"+","+"executorStorageView_insertedRowDate:'"+executorStorageView_insertedRowDate+"'"+","+"executorStorageView_lastUpdatedDate:'"+executorStorageView_lastUpdatedDate+"'"+","+"executorStorageView_executorStorageSnapshotId:'"+executorStorageView_executorStorageSnapshotId+"'"+","+"executorStorageView_executorStorageId:'"+executorStorageView_executorStorageId+"'"+","+"executorStorageView_sourceDownloadId:'"+executorStorageView_sourceDownloadId+"'"+","+"executorStorageView_sourceViewId:'"+executorStorageView_sourceViewId+"'"+","+"executorStorageView_executorStorageResourceId:'"+executorStorageView_executorStorageResourceId+"'"   } 
   def getFieldValue(name : String) : Any = { 
    val ret = name match { 
    case "downloadTransformExecutorStorageId" => downloadTransformExecutorStorageId  
     case "guid" => guid  
     case "insertedRowDate" => insertedRowDate  
     case "lastUpdatedDate" => lastUpdatedDate  
     case "downloadTransformGroupId" => downloadTransformGroupId  
     case "executorStorageViewId" => executorStorageViewId  
     case "downloadTransformGroup_downloadTransformGroupId" => downloadTransformGroup_downloadTransformGroupId  
     case "downloadTransformGroup_guid" => downloadTransformGroup_guid  
     case "downloadTransformGroup_insertedRowDate" => downloadTransformGroup_insertedRowDate  
     case "downloadTransformGroup_lastUpdatedDate" => downloadTransformGroup_lastUpdatedDate  
     case "downloadTransformGroup_downloadTransformGroupName" => downloadTransformGroup_downloadTransformGroupName  
     case "executorStorageView_executorStorageViewId" => executorStorageView_executorStorageViewId  
     case "executorStorageView_guid" => executorStorageView_guid  
     case "executorStorageView_insertedRowDate" => executorStorageView_insertedRowDate  
     case "executorStorageView_lastUpdatedDate" => executorStorageView_lastUpdatedDate  
     case "executorStorageView_executorStorageSnapshotId" => executorStorageView_executorStorageSnapshotId  
     case "executorStorageView_executorStorageId" => executorStorageView_executorStorageId  
     case "executorStorageView_sourceDownloadId" => executorStorageView_sourceDownloadId  
     case "executorStorageView_sourceViewId" => executorStorageView_sourceViewId  
     case "executorStorageView_executorStorageResourceId" => executorStorageView_executorStorageResourceId   
    case _ => null 
    } 
    ret 
  } 
   def getFieldTypeName(name : String) : String = { 
    val ret = name match { 
    case "downloadTransformExecutorStorageId" => "Long"  
     case "guid" => "Long"  
     case "insertedRowDate" => "java.util.Date"  
     case "lastUpdatedDate" => "java.util.Date"  
     case "downloadTransformGroupId" => "Long"  
     case "executorStorageViewId" => "Long"  
     case "downloadTransformGroup_downloadTransformGroupId" => "Long"  
     case "downloadTransformGroup_guid" => "Long"  
     case "downloadTransformGroup_insertedRowDate" => "java.util.Date"  
     case "downloadTransformGroup_lastUpdatedDate" => "java.util.Date"  
     case "downloadTransformGroup_downloadTransformGroupName" => "String"  
     case "executorStorageView_executorStorageViewId" => "Long"  
     case "executorStorageView_guid" => "Long"  
     case "executorStorageView_insertedRowDate" => "java.util.Date"  
     case "executorStorageView_lastUpdatedDate" => "java.util.Date"  
     case "executorStorageView_executorStorageSnapshotId" => "Long"  
     case "executorStorageView_executorStorageId" => "Long"  
     case "executorStorageView_sourceDownloadId" => "Long"  
     case "executorStorageView_sourceViewId" => "Long"  
     case "executorStorageView_executorStorageResourceId" => "Long"   
    case _ => "Object" 
    } 
    ret 
  } 
 } 
object VDownloadTransformExecutorStorageDto { 
  val TABLE_NAME = "vDownloadTransformExecutorStorage"; 
   val FIELD_downloadTransformExecutorStorageId = "downloadTransformExecutorStorageId";
   val FIELD_guid = "guid";
   val FIELD_insertedRowDate = "insertedRowDate";
   val FIELD_lastUpdatedDate = "lastUpdatedDate";
   val FIELD_downloadTransformGroupId = "downloadTransformGroupId";
   val FIELD_executorStorageViewId = "executorStorageViewId";
   val FIELD_downloadTransformGroup_downloadTransformGroupId = "downloadTransformGroup_downloadTransformGroupId";
   val FIELD_downloadTransformGroup_guid = "downloadTransformGroup_guid";
   val FIELD_downloadTransformGroup_insertedRowDate = "downloadTransformGroup_insertedRowDate";
   val FIELD_downloadTransformGroup_lastUpdatedDate = "downloadTransformGroup_lastUpdatedDate";
   val FIELD_downloadTransformGroup_downloadTransformGroupName = "downloadTransformGroup_downloadTransformGroupName";
   val FIELD_executorStorageView_executorStorageViewId = "executorStorageView_executorStorageViewId";
   val FIELD_executorStorageView_guid = "executorStorageView_guid";
   val FIELD_executorStorageView_insertedRowDate = "executorStorageView_insertedRowDate";
   val FIELD_executorStorageView_lastUpdatedDate = "executorStorageView_lastUpdatedDate";
   val FIELD_executorStorageView_executorStorageSnapshotId = "executorStorageView_executorStorageSnapshotId";
   val FIELD_executorStorageView_executorStorageId = "executorStorageView_executorStorageId";
   val FIELD_executorStorageView_sourceDownloadId = "executorStorageView_sourceDownloadId";
   val FIELD_executorStorageView_sourceViewId = "executorStorageView_sourceViewId";
   val FIELD_executorStorageView_executorStorageResourceId = "executorStorageView_executorStorageResourceId";

}

 
