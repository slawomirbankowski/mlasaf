/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dto 
 
 
case class VSourceInstanceDto ( 
     val sourceInstanceId : Long
     , val guid : Long
     , val insertedRowDate : java.util.Date
     , val lastUpdatedDate : java.util.Date
     , val sourceTypeId : Long
     , val sourceInstanceName : String
     , val errorCount : Long
     , val correctCount : Long
     , val lastStatus : String
     , val lastConnectionDate : java.util.Date
     , val sourceType_sourceTypeId : Long
     , val sourceType_guid : Long
     , val sourceType_insertedRowDate : java.util.Date
     , val sourceType_lastUpdatedDate : java.util.Date
     , val sourceType_sourceTypeName : String
     , val sourceType_sourceTypeClass : String 
     ) extends BaseReadOnlyDto {  
   def tableName : String = {    "vSourceInstance";    }  
   def fields : String = {    "sourceInstanceId,guid,insertedRowDate,lastUpdatedDate,sourceTypeId,sourceInstanceName,errorCount,correctCount,lastStatus,lastConnectionDate,sourceType_sourceTypeId,sourceType_guid,sourceType_insertedRowDate,sourceType_lastUpdatedDate,sourceType_sourceTypeName,sourceType_sourceTypeClass";    }  
   def pkFields : String = {    "";    }  
   def fkFields : String = {    "";    }  
   def nameField : String = {    "";    }  
 def getPk() : Long = {    sourceInstanceId  }  
 def getInsertedRowDate() : java.util.Date = {    insertedRowDate  }  
 def getLastUpdatedDate() : java.util.Date = {    lastUpdatedDate  }  
 def getGuid() : Long = {    guid  }  
 def toAnyArray() : Array[Any] = {    Array(sourceInstanceId,guid,insertedRowDate,lastUpdatedDate,sourceTypeId,sourceInstanceName,errorCount,correctCount,lastStatus,lastConnectionDate,sourceType_sourceTypeId,sourceType_guid,sourceType_insertedRowDate,sourceType_lastUpdatedDate,sourceType_sourceTypeName,sourceType_sourceTypeClass)  }  
 def toStringArray() : Array[String] = {    Array(""+sourceInstanceId,""+guid,""+insertedRowDate,""+lastUpdatedDate,""+sourceTypeId,""+sourceInstanceName,""+errorCount,""+correctCount,""+lastStatus,""+lastConnectionDate,""+sourceType_sourceTypeId,""+sourceType_guid,""+sourceType_insertedRowDate,""+sourceType_lastUpdatedDate,""+sourceType_sourceTypeName,""+sourceType_sourceTypeClass)   }  
 def toJson() : String = {   "{" + "\"sourceInstanceId\":\""+sourceInstanceId+"\""+","+"\"guid\":\""+guid+"\""+","+"\"insertedRowDate\":\""+insertedRowDate+"\""+","+"\"lastUpdatedDate\":\""+lastUpdatedDate+"\""+","+"\"sourceTypeId\":\""+sourceTypeId+"\""+","+"\"sourceInstanceName\":\""+sourceInstanceName+"\""+","+"\"errorCount\":\""+errorCount+"\""+","+"\"correctCount\":\""+correctCount+"\""+","+"\"lastStatus\":\""+lastStatus+"\""+","+"\"lastConnectionDate\":\""+lastConnectionDate+"\""+","+"\"sourceType_sourceTypeId\":\""+sourceType_sourceTypeId+"\""+","+"\"sourceType_guid\":\""+sourceType_guid+"\""+","+"\"sourceType_insertedRowDate\":\""+sourceType_insertedRowDate+"\""+","+"\"sourceType_lastUpdatedDate\":\""+sourceType_lastUpdatedDate+"\""+","+"\"sourceType_sourceTypeName\":\""+sourceType_sourceTypeName+"\""+","+"\"sourceType_sourceTypeClass\":\""+sourceType_sourceTypeClass+"\"" + "}"   }  
 def toFullString() : String = {    "sourceInstanceId:'"+sourceInstanceId+"'"+","+"guid:'"+guid+"'"+","+"insertedRowDate:'"+insertedRowDate+"'"+","+"lastUpdatedDate:'"+lastUpdatedDate+"'"+","+"sourceTypeId:'"+sourceTypeId+"'"+","+"sourceInstanceName:'"+sourceInstanceName+"'"+","+"errorCount:'"+errorCount+"'"+","+"correctCount:'"+correctCount+"'"+","+"lastStatus:'"+lastStatus+"'"+","+"lastConnectionDate:'"+lastConnectionDate+"'"+","+"sourceType_sourceTypeId:'"+sourceType_sourceTypeId+"'"+","+"sourceType_guid:'"+sourceType_guid+"'"+","+"sourceType_insertedRowDate:'"+sourceType_insertedRowDate+"'"+","+"sourceType_lastUpdatedDate:'"+sourceType_lastUpdatedDate+"'"+","+"sourceType_sourceTypeName:'"+sourceType_sourceTypeName+"'"+","+"sourceType_sourceTypeClass:'"+sourceType_sourceTypeClass+"'"   } 
   def getFieldValue(name : String) : Any = { 
    val ret = name match { 
    case "sourceInstanceId" => sourceInstanceId  
     case "guid" => guid  
     case "insertedRowDate" => insertedRowDate  
     case "lastUpdatedDate" => lastUpdatedDate  
     case "sourceTypeId" => sourceTypeId  
     case "sourceInstanceName" => sourceInstanceName  
     case "errorCount" => errorCount  
     case "correctCount" => correctCount  
     case "lastStatus" => lastStatus  
     case "lastConnectionDate" => lastConnectionDate  
     case "sourceType_sourceTypeId" => sourceType_sourceTypeId  
     case "sourceType_guid" => sourceType_guid  
     case "sourceType_insertedRowDate" => sourceType_insertedRowDate  
     case "sourceType_lastUpdatedDate" => sourceType_lastUpdatedDate  
     case "sourceType_sourceTypeName" => sourceType_sourceTypeName  
     case "sourceType_sourceTypeClass" => sourceType_sourceTypeClass   
    case _ => null 
    } 
    ret 
  } 
   def getFieldTypeName(name : String) : String = { 
    val ret = name match { 
    case "sourceInstanceId" => "Long"  
     case "guid" => "Long"  
     case "insertedRowDate" => "java.util.Date"  
     case "lastUpdatedDate" => "java.util.Date"  
     case "sourceTypeId" => "Long"  
     case "sourceInstanceName" => "String"  
     case "errorCount" => "Long"  
     case "correctCount" => "Long"  
     case "lastStatus" => "String"  
     case "lastConnectionDate" => "java.util.Date"  
     case "sourceType_sourceTypeId" => "Long"  
     case "sourceType_guid" => "Long"  
     case "sourceType_insertedRowDate" => "java.util.Date"  
     case "sourceType_lastUpdatedDate" => "java.util.Date"  
     case "sourceType_sourceTypeName" => "String"  
     case "sourceType_sourceTypeClass" => "String"   
    case _ => "Object" 
    } 
    ret 
  } 
 } 
object VSourceInstanceDto { 
  val TABLE_NAME = "vSourceInstance"; 
   val FIELD_sourceInstanceId = "sourceInstanceId";
   val FIELD_guid = "guid";
   val FIELD_insertedRowDate = "insertedRowDate";
   val FIELD_lastUpdatedDate = "lastUpdatedDate";
   val FIELD_sourceTypeId = "sourceTypeId";
   val FIELD_sourceInstanceName = "sourceInstanceName";
   val FIELD_errorCount = "errorCount";
   val FIELD_correctCount = "correctCount";
   val FIELD_lastStatus = "lastStatus";
   val FIELD_lastConnectionDate = "lastConnectionDate";
   val FIELD_sourceType_sourceTypeId = "sourceType_sourceTypeId";
   val FIELD_sourceType_guid = "sourceType_guid";
   val FIELD_sourceType_insertedRowDate = "sourceType_insertedRowDate";
   val FIELD_sourceType_lastUpdatedDate = "sourceType_lastUpdatedDate";
   val FIELD_sourceType_sourceTypeName = "sourceType_sourceTypeName";
   val FIELD_sourceType_sourceTypeClass = "sourceType_sourceTypeClass";

}

 
