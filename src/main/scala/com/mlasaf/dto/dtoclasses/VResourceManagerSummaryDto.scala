/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dto 
 
 
case class VResourceManagerSummaryDto ( 
     val resourceManagerId : Long
     , val guid : Long
     , val insertedRowDate : java.util.Date
     , val lastUpdatedDate : java.util.Date
     , val resourceManagerTypeId : Long
     , val executorHostId : Long
     , val resourceManagerStatus : String
     , val resourceManagerMeasure_count : Int
     , val resourceManagerCheck_count : Int
     , val resourceManagerAllocation_count : Int 
     ) extends BaseReadOnlyDto {  
   def tableName : String = {    "vResourceManagerSummary";    }  
   def fields : String = {    "resourceManagerId,guid,insertedRowDate,lastUpdatedDate,resourceManagerTypeId,executorHostId,resourceManagerStatus,resourceManagerMeasure_count,resourceManagerCheck_count,resourceManagerAllocation_count";    }  
   def pkFields : String = {    "";    }  
   def fkFields : String = {    "";    }  
   def nameField : String = {    "";    }  
 def getPk() : Long = {    resourceManagerId  }  
 def getInsertedRowDate() : java.util.Date = {    insertedRowDate  }  
 def getLastUpdatedDate() : java.util.Date = {    lastUpdatedDate  }  
 def getGuid() : Long = {    guid  }  
 def toAnyArray() : Array[Any] = {    Array(resourceManagerId,guid,insertedRowDate,lastUpdatedDate,resourceManagerTypeId,executorHostId,resourceManagerStatus,resourceManagerMeasure_count,resourceManagerCheck_count,resourceManagerAllocation_count)  }  
 def toStringArray() : Array[String] = {    Array(""+resourceManagerId,""+guid,""+insertedRowDate,""+lastUpdatedDate,""+resourceManagerTypeId,""+executorHostId,""+resourceManagerStatus,""+resourceManagerMeasure_count,""+resourceManagerCheck_count,""+resourceManagerAllocation_count)   }  
 def toFullString() : String = {    "resourceManagerId:'"+resourceManagerId+"'"+","+"guid:'"+guid+"'"+","+"insertedRowDate:'"+insertedRowDate+"'"+","+"lastUpdatedDate:'"+lastUpdatedDate+"'"+","+"resourceManagerTypeId:'"+resourceManagerTypeId+"'"+","+"executorHostId:'"+executorHostId+"'"+","+"resourceManagerStatus:'"+resourceManagerStatus+"'"+","+"resourceManagerMeasure_count:'"+resourceManagerMeasure_count+"'"+","+"resourceManagerCheck_count:'"+resourceManagerCheck_count+"'"+","+"resourceManagerAllocation_count:'"+resourceManagerAllocation_count+"'"   } 
   def getFieldValue(name : String) : Any = { 
    val ret = name match { 
    case "resourceManagerId" => resourceManagerId  
     case "guid" => guid  
     case "insertedRowDate" => insertedRowDate  
     case "lastUpdatedDate" => lastUpdatedDate  
     case "resourceManagerTypeId" => resourceManagerTypeId  
     case "executorHostId" => executorHostId  
     case "resourceManagerStatus" => resourceManagerStatus  
     case "resourceManagerMeasure_count" => resourceManagerMeasure_count  
     case "resourceManagerCheck_count" => resourceManagerCheck_count  
     case "resourceManagerAllocation_count" => resourceManagerAllocation_count   
    case _ => null 
    } 
    ret 
  } 
   def getFieldTypeName(name : String) : String = { 
    val ret = name match { 
    case "resourceManagerId" => "Long"  
     case "guid" => "Long"  
     case "insertedRowDate" => "java.util.Date"  
     case "lastUpdatedDate" => "java.util.Date"  
     case "resourceManagerTypeId" => "Long"  
     case "executorHostId" => "Long"  
     case "resourceManagerStatus" => "String"  
     case "resourceManagerMeasure_count" => "Int"  
     case "resourceManagerCheck_count" => "Int"  
     case "resourceManagerAllocation_count" => "Int"   
    case _ => "Object" 
    } 
    ret 
  } 
 } 
object VResourceManagerSummaryDto { 
  val TABLE_NAME = "vResourceManagerSummary"; 
   val FIELD_resourceManagerId = "resourceManagerId";
   val FIELD_guid = "guid";
   val FIELD_insertedRowDate = "insertedRowDate";
   val FIELD_lastUpdatedDate = "lastUpdatedDate";
   val FIELD_resourceManagerTypeId = "resourceManagerTypeId";
   val FIELD_executorHostId = "executorHostId";
   val FIELD_resourceManagerStatus = "resourceManagerStatus";
   val FIELD_resourceManagerMeasure_count = "resourceManagerMeasure_count";
   val FIELD_resourceManagerCheck_count = "resourceManagerCheck_count";
   val FIELD_resourceManagerAllocation_count = "resourceManagerAllocation_count";

}

 
