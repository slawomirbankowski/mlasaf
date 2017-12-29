/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dto 
 
 
case class VExecutorInstanceDto ( 
     val executorInstanceId : Long
     , val guid : Long
     , val insertedRowDate : java.util.Date
     , val lastUpdatedDate : java.util.Date
     , val executorTypeId : Long
     , val executorHostId : Long
     , val executorContextId : Long
     , val executorInstanceName : String
     , val isRunning : Int
     , val isFinished : Int
     , val portNumber : Int
     , val endDate : java.util.Date
     , val executorContext_executorContextId : Long
     , val executorContext_guid : Long
     , val executorContext_insertedRowDate : java.util.Date
     , val executorContext_lastUpdatedDate : java.util.Date
     , val executorContext_executorHostId : Long
     , val executorContext_isWorking : Int
     , val executorContext_properties : String
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
     , val executorType_executorTypeId : Long
     , val executorType_guid : Long
     , val executorType_insertedRowDate : java.util.Date
     , val executorType_lastUpdatedDate : java.util.Date
     , val executorType_executorTypeName : String
     , val executorType_executorTypeClass : String 
     ) extends BaseReadOnlyDto {  
   def tableName : String = {    "vExecutorInstance";    }  
   def fields : String = {    "executorInstanceId,guid,insertedRowDate,lastUpdatedDate,executorTypeId,executorHostId,executorContextId,executorInstanceName,isRunning,isFinished,portNumber,endDate,executorContext_executorContextId,executorContext_guid,executorContext_insertedRowDate,executorContext_lastUpdatedDate,executorContext_executorHostId,executorContext_isWorking,executorContext_properties,executorHost_executorHostId,executorHost_guid,executorHost_insertedRowDate,executorHost_lastUpdatedDate,executorHost_hostName,executorHost_hostIp,executorHost_hostDomain,executorHost_hostOsType,executorHost_hostOsVersion,executorHost_isWorking,executorType_executorTypeId,executorType_guid,executorType_insertedRowDate,executorType_lastUpdatedDate,executorType_executorTypeName,executorType_executorTypeClass";    }  
   def pkFields : String = {    "";    }  
   def fkFields : String = {    "";    }  
   def nameField : String = {    "";    }  
 def getPk() : Long = {    executorInstanceId  }  
 def getInsertedRowDate() : java.util.Date = {    insertedRowDate  }  
 def getLastUpdatedDate() : java.util.Date = {    lastUpdatedDate  }  
 def getGuid() : Long = {    guid  }  
 def toAnyArray() : Array[Any] = {    Array(executorInstanceId,guid,insertedRowDate,lastUpdatedDate,executorTypeId,executorHostId,executorContextId,executorInstanceName,isRunning,isFinished,portNumber,endDate,executorContext_executorContextId,executorContext_guid,executorContext_insertedRowDate,executorContext_lastUpdatedDate,executorContext_executorHostId,executorContext_isWorking,executorContext_properties,executorHost_executorHostId,executorHost_guid,executorHost_insertedRowDate,executorHost_lastUpdatedDate,executorHost_hostName,executorHost_hostIp,executorHost_hostDomain,executorHost_hostOsType,executorHost_hostOsVersion,executorHost_isWorking,executorType_executorTypeId,executorType_guid,executorType_insertedRowDate,executorType_lastUpdatedDate,executorType_executorTypeName,executorType_executorTypeClass)  }  
 def toStringArray() : Array[String] = {    Array(""+executorInstanceId,""+guid,""+insertedRowDate,""+lastUpdatedDate,""+executorTypeId,""+executorHostId,""+executorContextId,""+executorInstanceName,""+isRunning,""+isFinished,""+portNumber,""+endDate,""+executorContext_executorContextId,""+executorContext_guid,""+executorContext_insertedRowDate,""+executorContext_lastUpdatedDate,""+executorContext_executorHostId,""+executorContext_isWorking,""+executorContext_properties,""+executorHost_executorHostId,""+executorHost_guid,""+executorHost_insertedRowDate,""+executorHost_lastUpdatedDate,""+executorHost_hostName,""+executorHost_hostIp,""+executorHost_hostDomain,""+executorHost_hostOsType,""+executorHost_hostOsVersion,""+executorHost_isWorking,""+executorType_executorTypeId,""+executorType_guid,""+executorType_insertedRowDate,""+executorType_lastUpdatedDate,""+executorType_executorTypeName,""+executorType_executorTypeClass)   }  
 def toFullString() : String = {    "executorInstanceId:'"+executorInstanceId+"'"+","+"guid:'"+guid+"'"+","+"insertedRowDate:'"+insertedRowDate+"'"+","+"lastUpdatedDate:'"+lastUpdatedDate+"'"+","+"executorTypeId:'"+executorTypeId+"'"+","+"executorHostId:'"+executorHostId+"'"+","+"executorContextId:'"+executorContextId+"'"+","+"executorInstanceName:'"+executorInstanceName+"'"+","+"isRunning:'"+isRunning+"'"+","+"isFinished:'"+isFinished+"'"+","+"portNumber:'"+portNumber+"'"+","+"endDate:'"+endDate+"'"+","+"executorContext_executorContextId:'"+executorContext_executorContextId+"'"+","+"executorContext_guid:'"+executorContext_guid+"'"+","+"executorContext_insertedRowDate:'"+executorContext_insertedRowDate+"'"+","+"executorContext_lastUpdatedDate:'"+executorContext_lastUpdatedDate+"'"+","+"executorContext_executorHostId:'"+executorContext_executorHostId+"'"+","+"executorContext_isWorking:'"+executorContext_isWorking+"'"+","+"executorContext_properties:'"+executorContext_properties+"'"+","+"executorHost_executorHostId:'"+executorHost_executorHostId+"'"+","+"executorHost_guid:'"+executorHost_guid+"'"+","+"executorHost_insertedRowDate:'"+executorHost_insertedRowDate+"'"+","+"executorHost_lastUpdatedDate:'"+executorHost_lastUpdatedDate+"'"+","+"executorHost_hostName:'"+executorHost_hostName+"'"+","+"executorHost_hostIp:'"+executorHost_hostIp+"'"+","+"executorHost_hostDomain:'"+executorHost_hostDomain+"'"+","+"executorHost_hostOsType:'"+executorHost_hostOsType+"'"+","+"executorHost_hostOsVersion:'"+executorHost_hostOsVersion+"'"+","+"executorHost_isWorking:'"+executorHost_isWorking+"'"+","+"executorType_executorTypeId:'"+executorType_executorTypeId+"'"+","+"executorType_guid:'"+executorType_guid+"'"+","+"executorType_insertedRowDate:'"+executorType_insertedRowDate+"'"+","+"executorType_lastUpdatedDate:'"+executorType_lastUpdatedDate+"'"+","+"executorType_executorTypeName:'"+executorType_executorTypeName+"'"+","+"executorType_executorTypeClass:'"+executorType_executorTypeClass+"'"   } 
   def getFieldValue(name : String) : Any = { 
    val ret = name match { 
    case "executorInstanceId" => executorInstanceId  
     case "guid" => guid  
     case "insertedRowDate" => insertedRowDate  
     case "lastUpdatedDate" => lastUpdatedDate  
     case "executorTypeId" => executorTypeId  
     case "executorHostId" => executorHostId  
     case "executorContextId" => executorContextId  
     case "executorInstanceName" => executorInstanceName  
     case "isRunning" => isRunning  
     case "isFinished" => isFinished  
     case "portNumber" => portNumber  
     case "endDate" => endDate  
     case "executorContext_executorContextId" => executorContext_executorContextId  
     case "executorContext_guid" => executorContext_guid  
     case "executorContext_insertedRowDate" => executorContext_insertedRowDate  
     case "executorContext_lastUpdatedDate" => executorContext_lastUpdatedDate  
     case "executorContext_executorHostId" => executorContext_executorHostId  
     case "executorContext_isWorking" => executorContext_isWorking  
     case "executorContext_properties" => executorContext_properties  
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
     case "executorType_executorTypeId" => executorType_executorTypeId  
     case "executorType_guid" => executorType_guid  
     case "executorType_insertedRowDate" => executorType_insertedRowDate  
     case "executorType_lastUpdatedDate" => executorType_lastUpdatedDate  
     case "executorType_executorTypeName" => executorType_executorTypeName  
     case "executorType_executorTypeClass" => executorType_executorTypeClass   
    case _ => null 
    } 
    ret 
  } 
   def getFieldTypeName(name : String) : String = { 
    val ret = name match { 
    case "executorInstanceId" => "Long"  
     case "guid" => "Long"  
     case "insertedRowDate" => "java.util.Date"  
     case "lastUpdatedDate" => "java.util.Date"  
     case "executorTypeId" => "Long"  
     case "executorHostId" => "Long"  
     case "executorContextId" => "Long"  
     case "executorInstanceName" => "String"  
     case "isRunning" => "Int"  
     case "isFinished" => "Int"  
     case "portNumber" => "Int"  
     case "endDate" => "java.util.Date"  
     case "executorContext_executorContextId" => "Long"  
     case "executorContext_guid" => "Long"  
     case "executorContext_insertedRowDate" => "java.util.Date"  
     case "executorContext_lastUpdatedDate" => "java.util.Date"  
     case "executorContext_executorHostId" => "Long"  
     case "executorContext_isWorking" => "Int"  
     case "executorContext_properties" => "String"  
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
     case "executorType_executorTypeId" => "Long"  
     case "executorType_guid" => "Long"  
     case "executorType_insertedRowDate" => "java.util.Date"  
     case "executorType_lastUpdatedDate" => "java.util.Date"  
     case "executorType_executorTypeName" => "String"  
     case "executorType_executorTypeClass" => "String"   
    case _ => "Object" 
    } 
    ret 
  } 
 } 
object VExecutorInstanceDto { 
  val TABLE_NAME = "vExecutorInstance"; 
   val FIELD_executorInstanceId = "executorInstanceId";
   val FIELD_guid = "guid";
   val FIELD_insertedRowDate = "insertedRowDate";
   val FIELD_lastUpdatedDate = "lastUpdatedDate";
   val FIELD_executorTypeId = "executorTypeId";
   val FIELD_executorHostId = "executorHostId";
   val FIELD_executorContextId = "executorContextId";
   val FIELD_executorInstanceName = "executorInstanceName";
   val FIELD_isRunning = "isRunning";
   val FIELD_isFinished = "isFinished";
   val FIELD_portNumber = "portNumber";
   val FIELD_endDate = "endDate";
   val FIELD_executorContext_executorContextId = "executorContext_executorContextId";
   val FIELD_executorContext_guid = "executorContext_guid";
   val FIELD_executorContext_insertedRowDate = "executorContext_insertedRowDate";
   val FIELD_executorContext_lastUpdatedDate = "executorContext_lastUpdatedDate";
   val FIELD_executorContext_executorHostId = "executorContext_executorHostId";
   val FIELD_executorContext_isWorking = "executorContext_isWorking";
   val FIELD_executorContext_properties = "executorContext_properties";
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
   val FIELD_executorType_executorTypeId = "executorType_executorTypeId";
   val FIELD_executorType_guid = "executorType_guid";
   val FIELD_executorType_insertedRowDate = "executorType_insertedRowDate";
   val FIELD_executorType_lastUpdatedDate = "executorType_lastUpdatedDate";
   val FIELD_executorType_executorTypeName = "executorType_executorTypeName";
   val FIELD_executorType_executorTypeClass = "executorType_executorTypeClass";

}

 
