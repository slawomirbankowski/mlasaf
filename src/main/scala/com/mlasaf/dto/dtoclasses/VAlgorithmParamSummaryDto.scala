/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dto 
 
 
case class VAlgorithmParamSummaryDto ( 
     val algorithmParamId : Long
     , val guid : Long
     , val insertedRowDate : java.util.Date
     , val lastUpdatedDate : java.util.Date
     , val algorithmParamName : String
     , val algorithmParamDescription : String
     , val algorithmParamType : String
     , val algorithmVersionParamType_count : Int
     , val algorithmScheduleParam_count : Int 
     ) extends BaseReadOnlyDto {  
   def tableName : String = {    "vAlgorithmParamSummary";    }  
   def fields : String = {    "algorithmParamId,guid,insertedRowDate,lastUpdatedDate,algorithmParamName,algorithmParamDescription,algorithmParamType,algorithmVersionParamType_count,algorithmScheduleParam_count";    }  
   def pkFields : String = {    "";    }  
   def fkFields : String = {    "";    }  
   def nameField : String = {    "";    }  
 def getPk() : Long = {    algorithmParamId  }  
 def getInsertedRowDate() : java.util.Date = {    insertedRowDate  }  
 def getLastUpdatedDate() : java.util.Date = {    lastUpdatedDate  }  
 def getGuid() : Long = {    guid  }  
 def toAnyArray() : Array[Any] = {    Array(algorithmParamId,guid,insertedRowDate,lastUpdatedDate,algorithmParamName,algorithmParamDescription,algorithmParamType,algorithmVersionParamType_count,algorithmScheduleParam_count)  }  
 def toStringArray() : Array[String] = {    Array(""+algorithmParamId,""+guid,""+insertedRowDate,""+lastUpdatedDate,""+algorithmParamName,""+algorithmParamDescription,""+algorithmParamType,""+algorithmVersionParamType_count,""+algorithmScheduleParam_count)   }  
 def toJson() : String = {   "{" + "\"algorithmParamId\":\""+algorithmParamId+"\""+","+"\"guid\":\""+guid+"\""+","+"\"insertedRowDate\":\""+insertedRowDate+"\""+","+"\"lastUpdatedDate\":\""+lastUpdatedDate+"\""+","+"\"algorithmParamName\":\""+algorithmParamName+"\""+","+"\"algorithmParamDescription\":\""+algorithmParamDescription+"\""+","+"\"algorithmParamType\":\""+algorithmParamType+"\""+","+"\"algorithmVersionParamType_count\":\""+algorithmVersionParamType_count+"\""+","+"\"algorithmScheduleParam_count\":\""+algorithmScheduleParam_count+"\"" + "}"   }  
 def toFullString() : String = {    "algorithmParamId:'"+algorithmParamId+"'"+","+"guid:'"+guid+"'"+","+"insertedRowDate:'"+insertedRowDate+"'"+","+"lastUpdatedDate:'"+lastUpdatedDate+"'"+","+"algorithmParamName:'"+algorithmParamName+"'"+","+"algorithmParamDescription:'"+algorithmParamDescription+"'"+","+"algorithmParamType:'"+algorithmParamType+"'"+","+"algorithmVersionParamType_count:'"+algorithmVersionParamType_count+"'"+","+"algorithmScheduleParam_count:'"+algorithmScheduleParam_count+"'"   } 
   def getFieldValue(name : String) : Any = { 
    val ret = name match { 
    case "algorithmParamId" => algorithmParamId  
     case "guid" => guid  
     case "insertedRowDate" => insertedRowDate  
     case "lastUpdatedDate" => lastUpdatedDate  
     case "algorithmParamName" => algorithmParamName  
     case "algorithmParamDescription" => algorithmParamDescription  
     case "algorithmParamType" => algorithmParamType  
     case "algorithmVersionParamType_count" => algorithmVersionParamType_count  
     case "algorithmScheduleParam_count" => algorithmScheduleParam_count   
    case _ => null 
    } 
    ret 
  } 
   def getFieldTypeName(name : String) : String = { 
    val ret = name match { 
    case "algorithmParamId" => "Long"  
     case "guid" => "Long"  
     case "insertedRowDate" => "java.util.Date"  
     case "lastUpdatedDate" => "java.util.Date"  
     case "algorithmParamName" => "String"  
     case "algorithmParamDescription" => "String"  
     case "algorithmParamType" => "String"  
     case "algorithmVersionParamType_count" => "Int"  
     case "algorithmScheduleParam_count" => "Int"   
    case _ => "Object" 
    } 
    ret 
  } 
 } 
object VAlgorithmParamSummaryDto { 
  val TABLE_NAME = "vAlgorithmParamSummary"; 
   val FIELD_algorithmParamId = "algorithmParamId";
   val FIELD_guid = "guid";
   val FIELD_insertedRowDate = "insertedRowDate";
   val FIELD_lastUpdatedDate = "lastUpdatedDate";
   val FIELD_algorithmParamName = "algorithmParamName";
   val FIELD_algorithmParamDescription = "algorithmParamDescription";
   val FIELD_algorithmParamType = "algorithmParamType";
   val FIELD_algorithmVersionParamType_count = "algorithmVersionParamType_count";
   val FIELD_algorithmScheduleParam_count = "algorithmScheduleParam_count";

}

 
