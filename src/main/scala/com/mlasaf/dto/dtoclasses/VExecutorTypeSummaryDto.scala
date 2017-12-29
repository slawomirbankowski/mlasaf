/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dto 
 
 
case class VExecutorTypeSummaryDto ( 
     val executorTypeId : Long
     , val guid : Long
     , val insertedRowDate : java.util.Date
     , val lastUpdatedDate : java.util.Date
     , val executorTypeName : String
     , val executorTypeClass : String
     , val executorInstance_count : Int
     , val algorithmImplementation_count : Int 
     ) extends BaseReadOnlyDto {  
   def tableName : String = { 
   "vExecutorTypeSummary"; 
   }  
   def fields : String = { 
   "executorTypeId,guid,insertedRowDate,lastUpdatedDate,executorTypeName,executorTypeClass,executorInstance_count,algorithmImplementation_count"; 
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
    executorTypeId
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
    Array(executorTypeId,guid,insertedRowDate,lastUpdatedDate,executorTypeName,executorTypeClass,executorInstance_count,algorithmImplementation_count)
  }  
 def toStringArray() : Array[String] = {
    Array(""+executorTypeId,""+guid,""+insertedRowDate,""+lastUpdatedDate,""+executorTypeName,""+executorTypeClass,""+executorInstance_count,""+algorithmImplementation_count) 
  } 
   def getFieldValue(name : String) : Any = { 
    val ret = name match { 
    case "executorTypeId" => executorTypeId  
     case "guid" => guid  
     case "insertedRowDate" => insertedRowDate  
     case "lastUpdatedDate" => lastUpdatedDate  
     case "executorTypeName" => executorTypeName  
     case "executorTypeClass" => executorTypeClass  
     case "executorInstance_count" => executorInstance_count  
     case "algorithmImplementation_count" => algorithmImplementation_count   
    case _ => null 
    } 
    ret 
  } 
   def getFieldTypeName(name : String) : String = { 
    val ret = name match { 
    case "executorTypeId" => "Long"  
     case "guid" => "Long"  
     case "insertedRowDate" => "java.util.Date"  
     case "lastUpdatedDate" => "java.util.Date"  
     case "executorTypeName" => "String"  
     case "executorTypeClass" => "String"  
     case "executorInstance_count" => "Int"  
     case "algorithmImplementation_count" => "Int"   
    case _ => "Object" 
    } 
    ret 
  } 
 } 
object VExecutorTypeSummaryDto { 
  val TABLE_NAME = "vExecutorTypeSummary"; 
   val FIELD_executorTypeId = "executorTypeId";
   val FIELD_guid = "guid";
   val FIELD_insertedRowDate = "insertedRowDate";
   val FIELD_lastUpdatedDate = "lastUpdatedDate";
   val FIELD_executorTypeName = "executorTypeName";
   val FIELD_executorTypeClass = "executorTypeClass";
   val FIELD_executorInstance_count = "executorInstance_count";
   val FIELD_algorithmImplementation_count = "algorithmImplementation_count";

}

 
