/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dto 
 
 
case class VAlgorithmRunTypeSummaryDto ( 
     val algorithmRunTypeId : Long
     , val guid : Long
     , val insertedRowDate : java.util.Date
     , val lastUpdatedDate : java.util.Date
     , val algorithmRunTypeName : String
     , val algorithmRun_count : Int 
     ) extends BaseReadOnlyDto {  
   def tableName : String = {    "vAlgorithmRunTypeSummary";    }  
   def fields : String = {    "algorithmRunTypeId,guid,insertedRowDate,lastUpdatedDate,algorithmRunTypeName,algorithmRun_count";    }  
   def pkFields : String = {    "";    }  
   def fkFields : String = {    "";    }  
   def nameField : String = {    "";    }  
 def getPk() : Long = {    algorithmRunTypeId  }  
 def getInsertedRowDate() : java.util.Date = {    insertedRowDate  }  
 def getLastUpdatedDate() : java.util.Date = {    lastUpdatedDate  }  
 def getGuid() : Long = {    guid  }  
 def toAnyArray() : Array[Any] = {    Array(algorithmRunTypeId,guid,insertedRowDate,lastUpdatedDate,algorithmRunTypeName,algorithmRun_count)  }  
 def toStringArray() : Array[String] = {    Array(""+algorithmRunTypeId,""+guid,""+insertedRowDate,""+lastUpdatedDate,""+algorithmRunTypeName,""+algorithmRun_count)   }  
 def toJson() : String = {   "{" + "\"algorithmRunTypeId\":\""+algorithmRunTypeId+"\""+","+"\"guid\":\""+guid+"\""+","+"\"insertedRowDate\":\""+insertedRowDate+"\""+","+"\"lastUpdatedDate\":\""+lastUpdatedDate+"\""+","+"\"algorithmRunTypeName\":\""+algorithmRunTypeName+"\""+","+"\"algorithmRun_count\":\""+algorithmRun_count+"\"" + "}"   }  
 def toFullString() : String = {    "algorithmRunTypeId:'"+algorithmRunTypeId+"'"+","+"guid:'"+guid+"'"+","+"insertedRowDate:'"+insertedRowDate+"'"+","+"lastUpdatedDate:'"+lastUpdatedDate+"'"+","+"algorithmRunTypeName:'"+algorithmRunTypeName+"'"+","+"algorithmRun_count:'"+algorithmRun_count+"'"   } 
   def getFieldValue(name : String) : Any = { 
    val ret = name match { 
    case "algorithmRunTypeId" => algorithmRunTypeId  
     case "guid" => guid  
     case "insertedRowDate" => insertedRowDate  
     case "lastUpdatedDate" => lastUpdatedDate  
     case "algorithmRunTypeName" => algorithmRunTypeName  
     case "algorithmRun_count" => algorithmRun_count   
    case _ => null 
    } 
    ret 
  } 
   def getFieldTypeName(name : String) : String = { 
    val ret = name match { 
    case "algorithmRunTypeId" => "Long"  
     case "guid" => "Long"  
     case "insertedRowDate" => "java.util.Date"  
     case "lastUpdatedDate" => "java.util.Date"  
     case "algorithmRunTypeName" => "String"  
     case "algorithmRun_count" => "Int"   
    case _ => "Object" 
    } 
    ret 
  } 
 } 
object VAlgorithmRunTypeSummaryDto { 
  val TABLE_NAME = "vAlgorithmRunTypeSummary"; 
   val FIELD_algorithmRunTypeId = "algorithmRunTypeId";
   val FIELD_guid = "guid";
   val FIELD_insertedRowDate = "insertedRowDate";
   val FIELD_lastUpdatedDate = "lastUpdatedDate";
   val FIELD_algorithmRunTypeName = "algorithmRunTypeName";
   val FIELD_algorithmRun_count = "algorithmRun_count";

}

 
