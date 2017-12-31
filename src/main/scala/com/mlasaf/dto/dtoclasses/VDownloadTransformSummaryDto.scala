/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dto 
 
 
case class VDownloadTransformSummaryDto ( 
     val downloadTransformId : Long
     , val guid : Long
     , val insertedRowDate : java.util.Date
     , val lastUpdatedDate : java.util.Date
     , val downloadTransformTypeId : Long
     , val downloadTransformGroupId : Long
     , val downloadTransformDefinition : String
     , val downloadTransformColumn_count : Int 
     ) extends BaseReadOnlyDto {  
   def tableName : String = {    "vDownloadTransformSummary";    }  
   def fields : String = {    "downloadTransformId,guid,insertedRowDate,lastUpdatedDate,downloadTransformTypeId,downloadTransformGroupId,downloadTransformDefinition,downloadTransformColumn_count";    }  
   def pkFields : String = {    "";    }  
   def fkFields : String = {    "";    }  
   def nameField : String = {    "";    }  
 def getPk() : Long = {    downloadTransformId  }  
 def getInsertedRowDate() : java.util.Date = {    insertedRowDate  }  
 def getLastUpdatedDate() : java.util.Date = {    lastUpdatedDate  }  
 def getGuid() : Long = {    guid  }  
 def toAnyArray() : Array[Any] = {    Array(downloadTransformId,guid,insertedRowDate,lastUpdatedDate,downloadTransformTypeId,downloadTransformGroupId,downloadTransformDefinition,downloadTransformColumn_count)  }  
 def toStringArray() : Array[String] = {    Array(""+downloadTransformId,""+guid,""+insertedRowDate,""+lastUpdatedDate,""+downloadTransformTypeId,""+downloadTransformGroupId,""+downloadTransformDefinition,""+downloadTransformColumn_count)   }  
 def toFullString() : String = {    "downloadTransformId:'"+downloadTransformId+"'"+","+"guid:'"+guid+"'"+","+"insertedRowDate:'"+insertedRowDate+"'"+","+"lastUpdatedDate:'"+lastUpdatedDate+"'"+","+"downloadTransformTypeId:'"+downloadTransformTypeId+"'"+","+"downloadTransformGroupId:'"+downloadTransformGroupId+"'"+","+"downloadTransformDefinition:'"+downloadTransformDefinition+"'"+","+"downloadTransformColumn_count:'"+downloadTransformColumn_count+"'"   } 
   def getFieldValue(name : String) : Any = { 
    val ret = name match { 
    case "downloadTransformId" => downloadTransformId  
     case "guid" => guid  
     case "insertedRowDate" => insertedRowDate  
     case "lastUpdatedDate" => lastUpdatedDate  
     case "downloadTransformTypeId" => downloadTransformTypeId  
     case "downloadTransformGroupId" => downloadTransformGroupId  
     case "downloadTransformDefinition" => downloadTransformDefinition  
     case "downloadTransformColumn_count" => downloadTransformColumn_count   
    case _ => null 
    } 
    ret 
  } 
   def getFieldTypeName(name : String) : String = { 
    val ret = name match { 
    case "downloadTransformId" => "Long"  
     case "guid" => "Long"  
     case "insertedRowDate" => "java.util.Date"  
     case "lastUpdatedDate" => "java.util.Date"  
     case "downloadTransformTypeId" => "Long"  
     case "downloadTransformGroupId" => "Long"  
     case "downloadTransformDefinition" => "String"  
     case "downloadTransformColumn_count" => "Int"   
    case _ => "Object" 
    } 
    ret 
  } 
 } 
object VDownloadTransformSummaryDto { 
  val TABLE_NAME = "vDownloadTransformSummary"; 
   val FIELD_downloadTransformId = "downloadTransformId";
   val FIELD_guid = "guid";
   val FIELD_insertedRowDate = "insertedRowDate";
   val FIELD_lastUpdatedDate = "lastUpdatedDate";
   val FIELD_downloadTransformTypeId = "downloadTransformTypeId";
   val FIELD_downloadTransformGroupId = "downloadTransformGroupId";
   val FIELD_downloadTransformDefinition = "downloadTransformDefinition";
   val FIELD_downloadTransformColumn_count = "downloadTransformColumn_count";

}

 
