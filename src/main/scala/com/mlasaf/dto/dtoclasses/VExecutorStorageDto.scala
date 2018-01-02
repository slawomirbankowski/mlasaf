/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dto 
 
 
case class VExecutorStorageDto ( 
     val executorStorageId : Long
     , val guid : Long
     , val insertedRowDate : java.util.Date
     , val lastUpdatedDate : java.util.Date
     , val executorHostId : Long
     , val executorStorageTypeId : Long
     , val storageDefinition : String
     , val storageBasePath : String
     , val storageFulllPath : String
     , val isRunning : Int
     , val portNumber : Int
     , val executorHost_executorHostId : Long
     , val executorHost_guid : Long
     , val executorHost_insertedRowDate : java.util.Date
     , val executorHost_lastUpdatedDate : java.util.Date
     , val executorHost_hostName : String
     , val executorHost_hostIp : String
     , val executorHost_hostDomain : String
     , val executorHost_hostOsType : String
     , val executorHost_hostOsVersion : String
     , val executorHost_isWorking : Int
     , val executorStorageType_executorStorageTypeId : Long
     , val executorStorageType_guid : Long
     , val executorStorageType_insertedRowDate : java.util.Date
     , val executorStorageType_lastUpdatedDate : java.util.Date
     , val executorStorageType_executorStorageTypeName : String
     , val executorStorageType_executorStorageTypeClass : String 
     ) extends BaseReadOnlyDto {  
   def tableName : String = {    "vExecutorStorage";    }  
   def fields : String = {    "executorStorageId,guid,insertedRowDate,lastUpdatedDate,executorHostId,executorStorageTypeId,storageDefinition,storageBasePath,storageFulllPath,isRunning,portNumber,executorHost_executorHostId,executorHost_guid,executorHost_insertedRowDate,executorHost_lastUpdatedDate,executorHost_hostName,executorHost_hostIp,executorHost_hostDomain,executorHost_hostOsType,executorHost_hostOsVersion,executorHost_isWorking,executorStorageType_executorStorageTypeId,executorStorageType_guid,executorStorageType_insertedRowDate,executorStorageType_lastUpdatedDate,executorStorageType_executorStorageTypeName,executorStorageType_executorStorageTypeClass";    }  
   def pkFields : String = {    "";    }  
   def fkFields : String = {    "";    }  
   def nameField : String = {    "";    }  
 def getPk() : Long = {    executorStorageId  }  
 def getInsertedRowDate() : java.util.Date = {    insertedRowDate  }  
 def getLastUpdatedDate() : java.util.Date = {    lastUpdatedDate  }  
 def getGuid() : Long = {    guid  }  
 def toAnyArray() : Array[Any] = {    Array(executorStorageId,guid,insertedRowDate,lastUpdatedDate,executorHostId,executorStorageTypeId,storageDefinition,storageBasePath,storageFulllPath,isRunning,portNumber,executorHost_executorHostId,executorHost_guid,executorHost_insertedRowDate,executorHost_lastUpdatedDate,executorHost_hostName,executorHost_hostIp,executorHost_hostDomain,executorHost_hostOsType,executorHost_hostOsVersion,executorHost_isWorking,executorStorageType_executorStorageTypeId,executorStorageType_guid,executorStorageType_insertedRowDate,executorStorageType_lastUpdatedDate,executorStorageType_executorStorageTypeName,executorStorageType_executorStorageTypeClass)  }  
 def toStringArray() : Array[String] = {    Array(""+executorStorageId,""+guid,""+insertedRowDate,""+lastUpdatedDate,""+executorHostId,""+executorStorageTypeId,""+storageDefinition,""+storageBasePath,""+storageFulllPath,""+isRunning,""+portNumber,""+executorHost_executorHostId,""+executorHost_guid,""+executorHost_insertedRowDate,""+executorHost_lastUpdatedDate,""+executorHost_hostName,""+executorHost_hostIp,""+executorHost_hostDomain,""+executorHost_hostOsType,""+executorHost_hostOsVersion,""+executorHost_isWorking,""+executorStorageType_executorStorageTypeId,""+executorStorageType_guid,""+executorStorageType_insertedRowDate,""+executorStorageType_lastUpdatedDate,""+executorStorageType_executorStorageTypeName,""+executorStorageType_executorStorageTypeClass)   }  
 def toJson() : String = {   "{" + "\"executorStorageId\":\""+executorStorageId+"\""+","+"\"guid\":\""+guid+"\""+","+"\"insertedRowDate\":\""+insertedRowDate+"\""+","+"\"lastUpdatedDate\":\""+lastUpdatedDate+"\""+","+"\"executorHostId\":\""+executorHostId+"\""+","+"\"executorStorageTypeId\":\""+executorStorageTypeId+"\""+","+"\"storageDefinition\":\""+storageDefinition+"\""+","+"\"storageBasePath\":\""+storageBasePath+"\""+","+"\"storageFulllPath\":\""+storageFulllPath+"\""+","+"\"isRunning\":\""+isRunning+"\""+","+"\"portNumber\":\""+portNumber+"\""+","+"\"executorHost_executorHostId\":\""+executorHost_executorHostId+"\""+","+"\"executorHost_guid\":\""+executorHost_guid+"\""+","+"\"executorHost_insertedRowDate\":\""+executorHost_insertedRowDate+"\""+","+"\"executorHost_lastUpdatedDate\":\""+executorHost_lastUpdatedDate+"\""+","+"\"executorHost_hostName\":\""+executorHost_hostName+"\""+","+"\"executorHost_hostIp\":\""+executorHost_hostIp+"\""+","+"\"executorHost_hostDomain\":\""+executorHost_hostDomain+"\""+","+"\"executorHost_hostOsType\":\""+executorHost_hostOsType+"\""+","+"\"executorHost_hostOsVersion\":\""+executorHost_hostOsVersion+"\""+","+"\"executorHost_isWorking\":\""+executorHost_isWorking+"\""+","+"\"executorStorageType_executorStorageTypeId\":\""+executorStorageType_executorStorageTypeId+"\""+","+"\"executorStorageType_guid\":\""+executorStorageType_guid+"\""+","+"\"executorStorageType_insertedRowDate\":\""+executorStorageType_insertedRowDate+"\""+","+"\"executorStorageType_lastUpdatedDate\":\""+executorStorageType_lastUpdatedDate+"\""+","+"\"executorStorageType_executorStorageTypeName\":\""+executorStorageType_executorStorageTypeName+"\""+","+"\"executorStorageType_executorStorageTypeClass\":\""+executorStorageType_executorStorageTypeClass+"\"" + "}"   }  
 def toFullString() : String = {    "executorStorageId:'"+executorStorageId+"'"+","+"guid:'"+guid+"'"+","+"insertedRowDate:'"+insertedRowDate+"'"+","+"lastUpdatedDate:'"+lastUpdatedDate+"'"+","+"executorHostId:'"+executorHostId+"'"+","+"executorStorageTypeId:'"+executorStorageTypeId+"'"+","+"storageDefinition:'"+storageDefinition+"'"+","+"storageBasePath:'"+storageBasePath+"'"+","+"storageFulllPath:'"+storageFulllPath+"'"+","+"isRunning:'"+isRunning+"'"+","+"portNumber:'"+portNumber+"'"+","+"executorHost_executorHostId:'"+executorHost_executorHostId+"'"+","+"executorHost_guid:'"+executorHost_guid+"'"+","+"executorHost_insertedRowDate:'"+executorHost_insertedRowDate+"'"+","+"executorHost_lastUpdatedDate:'"+executorHost_lastUpdatedDate+"'"+","+"executorHost_hostName:'"+executorHost_hostName+"'"+","+"executorHost_hostIp:'"+executorHost_hostIp+"'"+","+"executorHost_hostDomain:'"+executorHost_hostDomain+"'"+","+"executorHost_hostOsType:'"+executorHost_hostOsType+"'"+","+"executorHost_hostOsVersion:'"+executorHost_hostOsVersion+"'"+","+"executorHost_isWorking:'"+executorHost_isWorking+"'"+","+"executorStorageType_executorStorageTypeId:'"+executorStorageType_executorStorageTypeId+"'"+","+"executorStorageType_guid:'"+executorStorageType_guid+"'"+","+"executorStorageType_insertedRowDate:'"+executorStorageType_insertedRowDate+"'"+","+"executorStorageType_lastUpdatedDate:'"+executorStorageType_lastUpdatedDate+"'"+","+"executorStorageType_executorStorageTypeName:'"+executorStorageType_executorStorageTypeName+"'"+","+"executorStorageType_executorStorageTypeClass:'"+executorStorageType_executorStorageTypeClass+"'"   } 
   def getFieldValue(name : String) : Any = { 
    val ret = name match { 
    case "executorStorageId" => executorStorageId  
     case "guid" => guid  
     case "insertedRowDate" => insertedRowDate  
     case "lastUpdatedDate" => lastUpdatedDate  
     case "executorHostId" => executorHostId  
     case "executorStorageTypeId" => executorStorageTypeId  
     case "storageDefinition" => storageDefinition  
     case "storageBasePath" => storageBasePath  
     case "storageFulllPath" => storageFulllPath  
     case "isRunning" => isRunning  
     case "portNumber" => portNumber  
     case "executorHost_executorHostId" => executorHost_executorHostId  
     case "executorHost_guid" => executorHost_guid  
     case "executorHost_insertedRowDate" => executorHost_insertedRowDate  
     case "executorHost_lastUpdatedDate" => executorHost_lastUpdatedDate  
     case "executorHost_hostName" => executorHost_hostName  
     case "executorHost_hostIp" => executorHost_hostIp  
     case "executorHost_hostDomain" => executorHost_hostDomain  
     case "executorHost_hostOsType" => executorHost_hostOsType  
     case "executorHost_hostOsVersion" => executorHost_hostOsVersion  
     case "executorHost_isWorking" => executorHost_isWorking  
     case "executorStorageType_executorStorageTypeId" => executorStorageType_executorStorageTypeId  
     case "executorStorageType_guid" => executorStorageType_guid  
     case "executorStorageType_insertedRowDate" => executorStorageType_insertedRowDate  
     case "executorStorageType_lastUpdatedDate" => executorStorageType_lastUpdatedDate  
     case "executorStorageType_executorStorageTypeName" => executorStorageType_executorStorageTypeName  
     case "executorStorageType_executorStorageTypeClass" => executorStorageType_executorStorageTypeClass   
    case _ => null 
    } 
    ret 
  } 
   def getFieldTypeName(name : String) : String = { 
    val ret = name match { 
    case "executorStorageId" => "Long"  
     case "guid" => "Long"  
     case "insertedRowDate" => "java.util.Date"  
     case "lastUpdatedDate" => "java.util.Date"  
     case "executorHostId" => "Long"  
     case "executorStorageTypeId" => "Long"  
     case "storageDefinition" => "String"  
     case "storageBasePath" => "String"  
     case "storageFulllPath" => "String"  
     case "isRunning" => "Int"  
     case "portNumber" => "Int"  
     case "executorHost_executorHostId" => "Long"  
     case "executorHost_guid" => "Long"  
     case "executorHost_insertedRowDate" => "java.util.Date"  
     case "executorHost_lastUpdatedDate" => "java.util.Date"  
     case "executorHost_hostName" => "String"  
     case "executorHost_hostIp" => "String"  
     case "executorHost_hostDomain" => "String"  
     case "executorHost_hostOsType" => "String"  
     case "executorHost_hostOsVersion" => "String"  
     case "executorHost_isWorking" => "Int"  
     case "executorStorageType_executorStorageTypeId" => "Long"  
     case "executorStorageType_guid" => "Long"  
     case "executorStorageType_insertedRowDate" => "java.util.Date"  
     case "executorStorageType_lastUpdatedDate" => "java.util.Date"  
     case "executorStorageType_executorStorageTypeName" => "String"  
     case "executorStorageType_executorStorageTypeClass" => "String"   
    case _ => "Object" 
    } 
    ret 
  } 
 } 
object VExecutorStorageDto { 
  val TABLE_NAME = "vExecutorStorage"; 
   val FIELD_executorStorageId = "executorStorageId";
   val FIELD_guid = "guid";
   val FIELD_insertedRowDate = "insertedRowDate";
   val FIELD_lastUpdatedDate = "lastUpdatedDate";
   val FIELD_executorHostId = "executorHostId";
   val FIELD_executorStorageTypeId = "executorStorageTypeId";
   val FIELD_storageDefinition = "storageDefinition";
   val FIELD_storageBasePath = "storageBasePath";
   val FIELD_storageFulllPath = "storageFulllPath";
   val FIELD_isRunning = "isRunning";
   val FIELD_portNumber = "portNumber";
   val FIELD_executorHost_executorHostId = "executorHost_executorHostId";
   val FIELD_executorHost_guid = "executorHost_guid";
   val FIELD_executorHost_insertedRowDate = "executorHost_insertedRowDate";
   val FIELD_executorHost_lastUpdatedDate = "executorHost_lastUpdatedDate";
   val FIELD_executorHost_hostName = "executorHost_hostName";
   val FIELD_executorHost_hostIp = "executorHost_hostIp";
   val FIELD_executorHost_hostDomain = "executorHost_hostDomain";
   val FIELD_executorHost_hostOsType = "executorHost_hostOsType";
   val FIELD_executorHost_hostOsVersion = "executorHost_hostOsVersion";
   val FIELD_executorHost_isWorking = "executorHost_isWorking";
   val FIELD_executorStorageType_executorStorageTypeId = "executorStorageType_executorStorageTypeId";
   val FIELD_executorStorageType_guid = "executorStorageType_guid";
   val FIELD_executorStorageType_insertedRowDate = "executorStorageType_insertedRowDate";
   val FIELD_executorStorageType_lastUpdatedDate = "executorStorageType_lastUpdatedDate";
   val FIELD_executorStorageType_executorStorageTypeName = "executorStorageType_executorStorageTypeName";
   val FIELD_executorStorageType_executorStorageTypeClass = "executorStorageType_executorStorageTypeClass";

}

 
