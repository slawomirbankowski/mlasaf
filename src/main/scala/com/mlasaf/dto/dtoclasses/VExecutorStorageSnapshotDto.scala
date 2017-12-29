/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dto 
 
 
case class VExecutorStorageSnapshotDto ( 
     val executorStorageSnapshotId : Long
     , val guid : Long
     , val insertedRowDate : java.util.Date
     , val lastUpdatedDate : java.util.Date
     , val executorInstanceId : Long
     , val executorInstance_executorInstanceId : Long
     , val executorInstance_guid : Long
     , val executorInstance_insertedRowDate : java.util.Date
     , val executorInstance_lastUpdatedDate : java.util.Date
     , val executorInstance_executorTypeId : Long
     , val executorInstance_executorHostId : Long
     , val executorInstance_executorContextId : Long
     , val executorInstance_executorInstanceName : String
     , val executorInstance_isRunning : Int
     , val executorInstance_isFinished : Int
     , val executorInstance_portNumber : Int
     , val executorInstance_endDate : java.util.Date 
     ) extends BaseReadOnlyDto {  
   def tableName : String = {    "vExecutorStorageSnapshot";    }  
   def fields : String = {    "executorStorageSnapshotId,guid,insertedRowDate,lastUpdatedDate,executorInstanceId,executorInstance_executorInstanceId,executorInstance_guid,executorInstance_insertedRowDate,executorInstance_lastUpdatedDate,executorInstance_executorTypeId,executorInstance_executorHostId,executorInstance_executorContextId,executorInstance_executorInstanceName,executorInstance_isRunning,executorInstance_isFinished,executorInstance_portNumber,executorInstance_endDate";    }  
   def pkFields : String = {    "";    }  
   def fkFields : String = {    "";    }  
   def nameField : String = {    "";    }  
 def getPk() : Long = {    executorStorageSnapshotId  }  
 def getInsertedRowDate() : java.util.Date = {    insertedRowDate  }  
 def getLastUpdatedDate() : java.util.Date = {    lastUpdatedDate  }  
 def getGuid() : Long = {    guid  }  
 def toAnyArray() : Array[Any] = {    Array(executorStorageSnapshotId,guid,insertedRowDate,lastUpdatedDate,executorInstanceId,executorInstance_executorInstanceId,executorInstance_guid,executorInstance_insertedRowDate,executorInstance_lastUpdatedDate,executorInstance_executorTypeId,executorInstance_executorHostId,executorInstance_executorContextId,executorInstance_executorInstanceName,executorInstance_isRunning,executorInstance_isFinished,executorInstance_portNumber,executorInstance_endDate)  }  
 def toStringArray() : Array[String] = {    Array(""+executorStorageSnapshotId,""+guid,""+insertedRowDate,""+lastUpdatedDate,""+executorInstanceId,""+executorInstance_executorInstanceId,""+executorInstance_guid,""+executorInstance_insertedRowDate,""+executorInstance_lastUpdatedDate,""+executorInstance_executorTypeId,""+executorInstance_executorHostId,""+executorInstance_executorContextId,""+executorInstance_executorInstanceName,""+executorInstance_isRunning,""+executorInstance_isFinished,""+executorInstance_portNumber,""+executorInstance_endDate)   }  
 def toFullString() : String = {    "executorStorageSnapshotId:'"+executorStorageSnapshotId+"'"+","+"guid:'"+guid+"'"+","+"insertedRowDate:'"+insertedRowDate+"'"+","+"lastUpdatedDate:'"+lastUpdatedDate+"'"+","+"executorInstanceId:'"+executorInstanceId+"'"+","+"executorInstance_executorInstanceId:'"+executorInstance_executorInstanceId+"'"+","+"executorInstance_guid:'"+executorInstance_guid+"'"+","+"executorInstance_insertedRowDate:'"+executorInstance_insertedRowDate+"'"+","+"executorInstance_lastUpdatedDate:'"+executorInstance_lastUpdatedDate+"'"+","+"executorInstance_executorTypeId:'"+executorInstance_executorTypeId+"'"+","+"executorInstance_executorHostId:'"+executorInstance_executorHostId+"'"+","+"executorInstance_executorContextId:'"+executorInstance_executorContextId+"'"+","+"executorInstance_executorInstanceName:'"+executorInstance_executorInstanceName+"'"+","+"executorInstance_isRunning:'"+executorInstance_isRunning+"'"+","+"executorInstance_isFinished:'"+executorInstance_isFinished+"'"+","+"executorInstance_portNumber:'"+executorInstance_portNumber+"'"+","+"executorInstance_endDate:'"+executorInstance_endDate+"'"   } 
   def getFieldValue(name : String) : Any = { 
    val ret = name match { 
    case "executorStorageSnapshotId" => executorStorageSnapshotId  
     case "guid" => guid  
     case "insertedRowDate" => insertedRowDate  
     case "lastUpdatedDate" => lastUpdatedDate  
     case "executorInstanceId" => executorInstanceId  
     case "executorInstance_executorInstanceId" => executorInstance_executorInstanceId  
     case "executorInstance_guid" => executorInstance_guid  
     case "executorInstance_insertedRowDate" => executorInstance_insertedRowDate  
     case "executorInstance_lastUpdatedDate" => executorInstance_lastUpdatedDate  
     case "executorInstance_executorTypeId" => executorInstance_executorTypeId  
     case "executorInstance_executorHostId" => executorInstance_executorHostId  
     case "executorInstance_executorContextId" => executorInstance_executorContextId  
     case "executorInstance_executorInstanceName" => executorInstance_executorInstanceName  
     case "executorInstance_isRunning" => executorInstance_isRunning  
     case "executorInstance_isFinished" => executorInstance_isFinished  
     case "executorInstance_portNumber" => executorInstance_portNumber  
     case "executorInstance_endDate" => executorInstance_endDate   
    case _ => null 
    } 
    ret 
  } 
   def getFieldTypeName(name : String) : String = { 
    val ret = name match { 
    case "executorStorageSnapshotId" => "Long"  
     case "guid" => "Long"  
     case "insertedRowDate" => "java.util.Date"  
     case "lastUpdatedDate" => "java.util.Date"  
     case "executorInstanceId" => "Long"  
     case "executorInstance_executorInstanceId" => "Long"  
     case "executorInstance_guid" => "Long"  
     case "executorInstance_insertedRowDate" => "java.util.Date"  
     case "executorInstance_lastUpdatedDate" => "java.util.Date"  
     case "executorInstance_executorTypeId" => "Long"  
     case "executorInstance_executorHostId" => "Long"  
     case "executorInstance_executorContextId" => "Long"  
     case "executorInstance_executorInstanceName" => "String"  
     case "executorInstance_isRunning" => "Int"  
     case "executorInstance_isFinished" => "Int"  
     case "executorInstance_portNumber" => "Int"  
     case "executorInstance_endDate" => "java.util.Date"   
    case _ => "Object" 
    } 
    ret 
  } 
 } 
object VExecutorStorageSnapshotDto { 
  val TABLE_NAME = "vExecutorStorageSnapshot"; 
   val FIELD_executorStorageSnapshotId = "executorStorageSnapshotId";
   val FIELD_guid = "guid";
   val FIELD_insertedRowDate = "insertedRowDate";
   val FIELD_lastUpdatedDate = "lastUpdatedDate";
   val FIELD_executorInstanceId = "executorInstanceId";
   val FIELD_executorInstance_executorInstanceId = "executorInstance_executorInstanceId";
   val FIELD_executorInstance_guid = "executorInstance_guid";
   val FIELD_executorInstance_insertedRowDate = "executorInstance_insertedRowDate";
   val FIELD_executorInstance_lastUpdatedDate = "executorInstance_lastUpdatedDate";
   val FIELD_executorInstance_executorTypeId = "executorInstance_executorTypeId";
   val FIELD_executorInstance_executorHostId = "executorInstance_executorHostId";
   val FIELD_executorInstance_executorContextId = "executorInstance_executorContextId";
   val FIELD_executorInstance_executorInstanceName = "executorInstance_executorInstanceName";
   val FIELD_executorInstance_isRunning = "executorInstance_isRunning";
   val FIELD_executorInstance_isFinished = "executorInstance_isFinished";
   val FIELD_executorInstance_portNumber = "executorInstance_portNumber";
   val FIELD_executorInstance_endDate = "executorInstance_endDate";

}

 
