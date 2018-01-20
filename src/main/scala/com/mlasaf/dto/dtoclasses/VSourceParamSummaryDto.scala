/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dto 
 
 
case class VSourceParamSummaryDto ( 
     val sourceParamId : Long
     , val guid : Long
     , val insertedRowDate : java.util.Date
     , val lastUpdatedDate : java.util.Date
     , val sourceParamName : String
     , val sourceParamType : String
     , val possibleValues : String
     , val sourceTypeParam_count : Int
     , val sourceParamValue_count : Int 
     ) extends BaseReadOnlyDto {  
   def tableName : String = {    "vSourceParamSummary";    }  
   def fields : String = {    "sourceParamId,guid,insertedRowDate,lastUpdatedDate,sourceParamName,sourceParamType,possibleValues,sourceTypeParam_count,sourceParamValue_count";    }  
   def pkFields : String = {    "";    }  
   def fkFields : String = {    "";    }  
   def nameField : String = {    "";    }  
 def getPk() : Long = {    sourceParamId  }  
 def getInsertedRowDate() : java.util.Date = {    insertedRowDate  }  
 def getLastUpdatedDate() : java.util.Date = {    lastUpdatedDate  }  
 def getGuid() : Long = {    guid  }  
 def toAnyArray() : Array[Any] = {    Array(sourceParamId,guid,insertedRowDate,lastUpdatedDate,sourceParamName,sourceParamType,possibleValues,sourceTypeParam_count,sourceParamValue_count)  }  
 def toStringArray() : Array[String] = {    Array(""+sourceParamId,""+guid,""+insertedRowDate,""+lastUpdatedDate,""+sourceParamName,""+sourceParamType,""+possibleValues,""+sourceTypeParam_count,""+sourceParamValue_count)   }  
 def toJson() : String = {   "{" + "\"sourceParamId\":\""+sourceParamId+"\""+","+"\"guid\":\""+guid+"\""+","+"\"insertedRowDate\":\""+insertedRowDate+"\""+","+"\"lastUpdatedDate\":\""+lastUpdatedDate+"\""+","+"\"sourceParamName\":\""+sourceParamName+"\""+","+"\"sourceParamType\":\""+sourceParamType+"\""+","+"\"possibleValues\":\""+possibleValues+"\""+","+"\"sourceTypeParam_count\":\""+sourceTypeParam_count+"\""+","+"\"sourceParamValue_count\":\""+sourceParamValue_count+"\"" + "}"   }  
 def toFullString() : String = {    "sourceParamId:'"+sourceParamId+"'"+","+"guid:'"+guid+"'"+","+"insertedRowDate:'"+insertedRowDate+"'"+","+"lastUpdatedDate:'"+lastUpdatedDate+"'"+","+"sourceParamName:'"+sourceParamName+"'"+","+"sourceParamType:'"+sourceParamType+"'"+","+"possibleValues:'"+possibleValues+"'"+","+"sourceTypeParam_count:'"+sourceTypeParam_count+"'"+","+"sourceParamValue_count:'"+sourceParamValue_count+"'"   } 
   def getFieldValue(name : String) : Any = { 
    val ret = name match { 
    case "sourceParamId" => sourceParamId  
     case "guid" => guid  
     case "insertedRowDate" => insertedRowDate  
     case "lastUpdatedDate" => lastUpdatedDate  
     case "sourceParamName" => sourceParamName  
     case "sourceParamType" => sourceParamType  
     case "possibleValues" => possibleValues  
     case "sourceTypeParam_count" => sourceTypeParam_count  
     case "sourceParamValue_count" => sourceParamValue_count   
    case _ => null 
    } 
    ret 
  } 
   def getFieldTypeName(name : String) : String = { 
    val ret = name match { 
    case "sourceParamId" => "Long"  
     case "guid" => "Long"  
     case "insertedRowDate" => "java.util.Date"  
     case "lastUpdatedDate" => "java.util.Date"  
     case "sourceParamName" => "String"  
     case "sourceParamType" => "String"  
     case "possibleValues" => "String"  
     case "sourceTypeParam_count" => "Int"  
     case "sourceParamValue_count" => "Int"   
    case _ => "Object" 
    } 
    ret 
  } 
 } 
object VSourceParamSummaryDto { 
  val TABLE_NAME = "vSourceParamSummary"; 
   val FIELD_sourceParamId = "sourceParamId";
   val FIELD_guid = "guid";
   val FIELD_insertedRowDate = "insertedRowDate";
   val FIELD_lastUpdatedDate = "lastUpdatedDate";
   val FIELD_sourceParamName = "sourceParamName";
   val FIELD_sourceParamType = "sourceParamType";
   val FIELD_possibleValues = "possibleValues";
   val FIELD_sourceTypeParam_count = "sourceTypeParam_count";
   val FIELD_sourceParamValue_count = "sourceParamValue_count";

}

 
