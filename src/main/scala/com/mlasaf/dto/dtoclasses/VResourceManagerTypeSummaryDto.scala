/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dto 
 
 
case class VResourceManagerTypeSummaryDto ( 
     val resourceManagerTypeId : Long
     , val guid : Long
     , val insertedRowDate : java.util.Date
     , val lastUpdatedDate : java.util.Date
     , val resourceManagerTypeName : String
     , val resourceManagerTypeClass : String
     , val resourceManager_count : Int
     , val resourceManagerAllocation_count : Int 
     ) extends BaseReadOnlyDto {  
   def tableName : String = {    "vResourceManagerTypeSummary";    }  
   def fields : String = {    "resourceManagerTypeId,guid,insertedRowDate,lastUpdatedDate,resourceManagerTypeName,resourceManagerTypeClass,resourceManager_count,resourceManagerAllocation_count";    }  
   def pkFields : String = {    "";    }  
   def fkFields : String = {    "";    }  
   def nameField : String = {    "";    }  
 def getPk() : Long = {    resourceManagerTypeId  }  
 def getInsertedRowDate() : java.util.Date = {    insertedRowDate  }  
 def getLastUpdatedDate() : java.util.Date = {    lastUpdatedDate  }  
 def getGuid() : Long = {    guid  }  
 def toAnyArray() : Array[Any] = {    Array(resourceManagerTypeId,guid,insertedRowDate,lastUpdatedDate,resourceManagerTypeName,resourceManagerTypeClass,resourceManager_count,resourceManagerAllocation_count)  }  
 def toStringArray() : Array[String] = {    Array(""+resourceManagerTypeId,""+guid,""+insertedRowDate,""+lastUpdatedDate,""+resourceManagerTypeName,""+resourceManagerTypeClass,""+resourceManager_count,""+resourceManagerAllocation_count)   }  
 def toJson() : String = {   "{" + "\"resourceManagerTypeId\":\""+resourceManagerTypeId+"\""+","+"\"guid\":\""+guid+"\""+","+"\"insertedRowDate\":\""+insertedRowDate+"\""+","+"\"lastUpdatedDate\":\""+lastUpdatedDate+"\""+","+"\"resourceManagerTypeName\":\""+resourceManagerTypeName+"\""+","+"\"resourceManagerTypeClass\":\""+resourceManagerTypeClass+"\""+","+"\"resourceManager_count\":\""+resourceManager_count+"\""+","+"\"resourceManagerAllocation_count\":\""+resourceManagerAllocation_count+"\"" + "}"   }  
 def toFullString() : String = {    "resourceManagerTypeId:'"+resourceManagerTypeId+"'"+","+"guid:'"+guid+"'"+","+"insertedRowDate:'"+insertedRowDate+"'"+","+"lastUpdatedDate:'"+lastUpdatedDate+"'"+","+"resourceManagerTypeName:'"+resourceManagerTypeName+"'"+","+"resourceManagerTypeClass:'"+resourceManagerTypeClass+"'"+","+"resourceManager_count:'"+resourceManager_count+"'"+","+"resourceManagerAllocation_count:'"+resourceManagerAllocation_count+"'"   } 
   def getFieldValue(name : String) : Any = { 
    val ret = name match { 
    case "resourceManagerTypeId" => resourceManagerTypeId  
     case "guid" => guid  
     case "insertedRowDate" => insertedRowDate  
     case "lastUpdatedDate" => lastUpdatedDate  
     case "resourceManagerTypeName" => resourceManagerTypeName  
     case "resourceManagerTypeClass" => resourceManagerTypeClass  
     case "resourceManager_count" => resourceManager_count  
     case "resourceManagerAllocation_count" => resourceManagerAllocation_count   
    case _ => null 
    } 
    ret 
  } 
   def getFieldTypeName(name : String) : String = { 
    val ret = name match { 
    case "resourceManagerTypeId" => "Long"  
     case "guid" => "Long"  
     case "insertedRowDate" => "java.util.Date"  
     case "lastUpdatedDate" => "java.util.Date"  
     case "resourceManagerTypeName" => "String"  
     case "resourceManagerTypeClass" => "String"  
     case "resourceManager_count" => "Int"  
     case "resourceManagerAllocation_count" => "Int"   
    case _ => "Object" 
    } 
    ret 
  } 
 } 
object VResourceManagerTypeSummaryDto { 
  val TABLE_NAME = "vResourceManagerTypeSummary"; 
   val FIELD_resourceManagerTypeId = "resourceManagerTypeId";
   val FIELD_guid = "guid";
   val FIELD_insertedRowDate = "insertedRowDate";
   val FIELD_lastUpdatedDate = "lastUpdatedDate";
   val FIELD_resourceManagerTypeName = "resourceManagerTypeName";
   val FIELD_resourceManagerTypeClass = "resourceManagerTypeClass";
   val FIELD_resourceManager_count = "resourceManager_count";
   val FIELD_resourceManagerAllocation_count = "resourceManagerAllocation_count";

}

 