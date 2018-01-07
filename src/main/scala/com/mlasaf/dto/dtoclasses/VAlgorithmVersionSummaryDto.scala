/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dto 
 
 
case class VAlgorithmVersionSummaryDto ( 
     val algorithmVersionId : Long
     , val insertedRowDate : java.util.Date
     , val lastUpdatedDate : java.util.Date
     , val guid : Long
     , val algorithmTypeId : Long
     , val algorithmVersionName : String
     , val algorithmVersionOutputType_count : Int
     , val algorithmImplementation_count : Int
     , val algorithmVersionParamType_count : Int
     , val algorithmVersionColumnType_count : Int 
     ) extends BaseReadOnlyDto {  
   def tableName : String = {    "vAlgorithmVersionSummary";    }  
   def fields : String = {    "algorithmVersionId,insertedRowDate,lastUpdatedDate,guid,algorithmTypeId,algorithmVersionName,algorithmVersionOutputType_count,algorithmImplementation_count,algorithmVersionParamType_count,algorithmVersionColumnType_count";    }  
   def pkFields : String = {    "";    }  
   def fkFields : String = {    "";    }  
   def nameField : String = {    "";    }  
 def getPk() : Long = {    algorithmVersionId  }  
 def getInsertedRowDate() : java.util.Date = {    insertedRowDate  }  
 def getLastUpdatedDate() : java.util.Date = {    lastUpdatedDate  }  
 def getGuid() : Long = {    guid  }  
 def toAnyArray() : Array[Any] = {    Array(algorithmVersionId,insertedRowDate,lastUpdatedDate,guid,algorithmTypeId,algorithmVersionName,algorithmVersionOutputType_count,algorithmImplementation_count,algorithmVersionParamType_count,algorithmVersionColumnType_count)  }  
 def toStringArray() : Array[String] = {    Array(""+algorithmVersionId,""+insertedRowDate,""+lastUpdatedDate,""+guid,""+algorithmTypeId,""+algorithmVersionName,""+algorithmVersionOutputType_count,""+algorithmImplementation_count,""+algorithmVersionParamType_count,""+algorithmVersionColumnType_count)   }  
 def toJson() : String = {   "{" + "\"algorithmVersionId\":\""+algorithmVersionId+"\""+","+"\"insertedRowDate\":\""+insertedRowDate+"\""+","+"\"lastUpdatedDate\":\""+lastUpdatedDate+"\""+","+"\"guid\":\""+guid+"\""+","+"\"algorithmTypeId\":\""+algorithmTypeId+"\""+","+"\"algorithmVersionName\":\""+algorithmVersionName+"\""+","+"\"algorithmVersionOutputType_count\":\""+algorithmVersionOutputType_count+"\""+","+"\"algorithmImplementation_count\":\""+algorithmImplementation_count+"\""+","+"\"algorithmVersionParamType_count\":\""+algorithmVersionParamType_count+"\""+","+"\"algorithmVersionColumnType_count\":\""+algorithmVersionColumnType_count+"\"" + "}"   }  
 def toFullString() : String = {    "algorithmVersionId:'"+algorithmVersionId+"'"+","+"insertedRowDate:'"+insertedRowDate+"'"+","+"lastUpdatedDate:'"+lastUpdatedDate+"'"+","+"guid:'"+guid+"'"+","+"algorithmTypeId:'"+algorithmTypeId+"'"+","+"algorithmVersionName:'"+algorithmVersionName+"'"+","+"algorithmVersionOutputType_count:'"+algorithmVersionOutputType_count+"'"+","+"algorithmImplementation_count:'"+algorithmImplementation_count+"'"+","+"algorithmVersionParamType_count:'"+algorithmVersionParamType_count+"'"+","+"algorithmVersionColumnType_count:'"+algorithmVersionColumnType_count+"'"   } 
   def getFieldValue(name : String) : Any = { 
    val ret = name match { 
    case "algorithmVersionId" => algorithmVersionId  
     case "insertedRowDate" => insertedRowDate  
     case "lastUpdatedDate" => lastUpdatedDate  
     case "guid" => guid  
     case "algorithmTypeId" => algorithmTypeId  
     case "algorithmVersionName" => algorithmVersionName  
     case "algorithmVersionOutputType_count" => algorithmVersionOutputType_count  
     case "algorithmImplementation_count" => algorithmImplementation_count  
     case "algorithmVersionParamType_count" => algorithmVersionParamType_count  
     case "algorithmVersionColumnType_count" => algorithmVersionColumnType_count   
    case _ => null 
    } 
    ret 
  } 
   def getFieldTypeName(name : String) : String = { 
    val ret = name match { 
    case "algorithmVersionId" => "Long"  
     case "insertedRowDate" => "java.util.Date"  
     case "lastUpdatedDate" => "java.util.Date"  
     case "guid" => "Long"  
     case "algorithmTypeId" => "Long"  
     case "algorithmVersionName" => "String"  
     case "algorithmVersionOutputType_count" => "Int"  
     case "algorithmImplementation_count" => "Int"  
     case "algorithmVersionParamType_count" => "Int"  
     case "algorithmVersionColumnType_count" => "Int"   
    case _ => "Object" 
    } 
    ret 
  } 
 } 
object VAlgorithmVersionSummaryDto { 
  val TABLE_NAME = "vAlgorithmVersionSummary"; 
   val FIELD_algorithmVersionId = "algorithmVersionId";
   val FIELD_insertedRowDate = "insertedRowDate";
   val FIELD_lastUpdatedDate = "lastUpdatedDate";
   val FIELD_guid = "guid";
   val FIELD_algorithmTypeId = "algorithmTypeId";
   val FIELD_algorithmVersionName = "algorithmVersionName";
   val FIELD_algorithmVersionOutputType_count = "algorithmVersionOutputType_count";
   val FIELD_algorithmImplementation_count = "algorithmImplementation_count";
   val FIELD_algorithmVersionParamType_count = "algorithmVersionParamType_count";
   val FIELD_algorithmVersionColumnType_count = "algorithmVersionColumnType_count";

}

 
