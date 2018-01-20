/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dto 
 
 
case class VAlgorithmOutputTypeSummaryDto ( 
     val algorithmOutputTypeId : Long
     , val guid : Long
     , val insertedRowDate : java.util.Date
     , val lastUpdatedDate : java.util.Date
     , val algorithmOutputTypeName : String
     , val algorithmOutput_count : Int
     , val algorithmVersionOutputType_count : Int 
     ) extends BaseReadOnlyDto {  
   def tableName : String = {    "vAlgorithmOutputTypeSummary";    }  
   def fields : String = {    "algorithmOutputTypeId,guid,insertedRowDate,lastUpdatedDate,algorithmOutputTypeName,algorithmOutput_count,algorithmVersionOutputType_count";    }  
   def pkFields : String = {    "";    }  
   def fkFields : String = {    "";    }  
   def nameField : String = {    "";    }  
 def getPk() : Long = {    algorithmOutputTypeId  }  
 def getInsertedRowDate() : java.util.Date = {    insertedRowDate  }  
 def getLastUpdatedDate() : java.util.Date = {    lastUpdatedDate  }  
 def getGuid() : Long = {    guid  }  
 def toAnyArray() : Array[Any] = {    Array(algorithmOutputTypeId,guid,insertedRowDate,lastUpdatedDate,algorithmOutputTypeName,algorithmOutput_count,algorithmVersionOutputType_count)  }  
 def toStringArray() : Array[String] = {    Array(""+algorithmOutputTypeId,""+guid,""+insertedRowDate,""+lastUpdatedDate,""+algorithmOutputTypeName,""+algorithmOutput_count,""+algorithmVersionOutputType_count)   }  
 def toJson() : String = {   "{" + "\"algorithmOutputTypeId\":\""+algorithmOutputTypeId+"\""+","+"\"guid\":\""+guid+"\""+","+"\"insertedRowDate\":\""+insertedRowDate+"\""+","+"\"lastUpdatedDate\":\""+lastUpdatedDate+"\""+","+"\"algorithmOutputTypeName\":\""+algorithmOutputTypeName+"\""+","+"\"algorithmOutput_count\":\""+algorithmOutput_count+"\""+","+"\"algorithmVersionOutputType_count\":\""+algorithmVersionOutputType_count+"\"" + "}"   }  
 def toFullString() : String = {    "algorithmOutputTypeId:'"+algorithmOutputTypeId+"'"+","+"guid:'"+guid+"'"+","+"insertedRowDate:'"+insertedRowDate+"'"+","+"lastUpdatedDate:'"+lastUpdatedDate+"'"+","+"algorithmOutputTypeName:'"+algorithmOutputTypeName+"'"+","+"algorithmOutput_count:'"+algorithmOutput_count+"'"+","+"algorithmVersionOutputType_count:'"+algorithmVersionOutputType_count+"'"   } 
   def getFieldValue(name : String) : Any = { 
    val ret = name match { 
    case "algorithmOutputTypeId" => algorithmOutputTypeId  
     case "guid" => guid  
     case "insertedRowDate" => insertedRowDate  
     case "lastUpdatedDate" => lastUpdatedDate  
     case "algorithmOutputTypeName" => algorithmOutputTypeName  
     case "algorithmOutput_count" => algorithmOutput_count  
     case "algorithmVersionOutputType_count" => algorithmVersionOutputType_count   
    case _ => null 
    } 
    ret 
  } 
   def getFieldTypeName(name : String) : String = { 
    val ret = name match { 
    case "algorithmOutputTypeId" => "Long"  
     case "guid" => "Long"  
     case "insertedRowDate" => "java.util.Date"  
     case "lastUpdatedDate" => "java.util.Date"  
     case "algorithmOutputTypeName" => "String"  
     case "algorithmOutput_count" => "Int"  
     case "algorithmVersionOutputType_count" => "Int"   
    case _ => "Object" 
    } 
    ret 
  } 
 } 
object VAlgorithmOutputTypeSummaryDto { 
  val TABLE_NAME = "vAlgorithmOutputTypeSummary"; 
   val FIELD_algorithmOutputTypeId = "algorithmOutputTypeId";
   val FIELD_guid = "guid";
   val FIELD_insertedRowDate = "insertedRowDate";
   val FIELD_lastUpdatedDate = "lastUpdatedDate";
   val FIELD_algorithmOutputTypeName = "algorithmOutputTypeName";
   val FIELD_algorithmOutput_count = "algorithmOutput_count";
   val FIELD_algorithmVersionOutputType_count = "algorithmVersionOutputType_count";

}

 
