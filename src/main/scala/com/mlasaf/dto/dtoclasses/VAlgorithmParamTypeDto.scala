/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dto 
 
 
case class VAlgorithmParamTypeDto ( 
     val algorithmParamTypeId : Long
     , val guid : Long
     , val insertedRowDate : java.util.Date
     , val lastUpdatedDate : java.util.Date
     , val algorithmParamId : Long
     , val algorithmTypeId : Long
     , val algorithmTypeVersionId : Long
     , val algorithmParam_algorithmParamId : Long
     , val algorithmParam_guid : Long
     , val algorithmParam_insertedRowDate : java.util.Date
     , val algorithmParam_lastUpdatedDate : java.util.Date
     , val algorithmParam_algorithmParamName : String
     , val algorithmParam_algorithmParamDescription : String
     , val algorithmParam_algorithmParamType : String
     , val algorithmType_algorithmTypeId : Long
     , val algorithmType_guid : Long
     , val algorithmType_insertedRowDate : java.util.Date
     , val algorithmType_lastUpdatedDate : java.util.Date
     , val algorithmType_algorithmTypeName : String
     , val algorithmType_algorithmTypeDescription : String
     , val algorithmTypeVersion_algorithmTypeVersionId : Long
     , val algorithmTypeVersion_insertedRowDate : java.util.Date
     , val algorithmTypeVersion_lastUpdatedDate : java.util.Date
     , val algorithmTypeVersion_guid : Long
     , val algorithmTypeVersion_algorithmTypeId : Long
     , val algorithmTypeVersion_algorithmTypeVersionName : String 
     ) extends BaseReadOnlyDto {  
   def tableName : String = {    "vAlgorithmParamType";    }  
   def fields : String = {    "algorithmParamTypeId,guid,insertedRowDate,lastUpdatedDate,algorithmParamId,algorithmTypeId,algorithmTypeVersionId,algorithmParam_algorithmParamId,algorithmParam_guid,algorithmParam_insertedRowDate,algorithmParam_lastUpdatedDate,algorithmParam_algorithmParamName,algorithmParam_algorithmParamDescription,algorithmParam_algorithmParamType,algorithmType_algorithmTypeId,algorithmType_guid,algorithmType_insertedRowDate,algorithmType_lastUpdatedDate,algorithmType_algorithmTypeName,algorithmType_algorithmTypeDescription,algorithmTypeVersion_algorithmTypeVersionId,algorithmTypeVersion_insertedRowDate,algorithmTypeVersion_lastUpdatedDate,algorithmTypeVersion_guid,algorithmTypeVersion_algorithmTypeId,algorithmTypeVersion_algorithmTypeVersionName";    }  
   def pkFields : String = {    "";    }  
   def fkFields : String = {    "";    }  
   def nameField : String = {    "";    }  
 def getPk() : Long = {    algorithmParamTypeId  }  
 def getInsertedRowDate() : java.util.Date = {    insertedRowDate  }  
 def getLastUpdatedDate() : java.util.Date = {    lastUpdatedDate  }  
 def getGuid() : Long = {    guid  }  
 def toAnyArray() : Array[Any] = {    Array(algorithmParamTypeId,guid,insertedRowDate,lastUpdatedDate,algorithmParamId,algorithmTypeId,algorithmTypeVersionId,algorithmParam_algorithmParamId,algorithmParam_guid,algorithmParam_insertedRowDate,algorithmParam_lastUpdatedDate,algorithmParam_algorithmParamName,algorithmParam_algorithmParamDescription,algorithmParam_algorithmParamType,algorithmType_algorithmTypeId,algorithmType_guid,algorithmType_insertedRowDate,algorithmType_lastUpdatedDate,algorithmType_algorithmTypeName,algorithmType_algorithmTypeDescription,algorithmTypeVersion_algorithmTypeVersionId,algorithmTypeVersion_insertedRowDate,algorithmTypeVersion_lastUpdatedDate,algorithmTypeVersion_guid,algorithmTypeVersion_algorithmTypeId,algorithmTypeVersion_algorithmTypeVersionName)  }  
 def toStringArray() : Array[String] = {    Array(""+algorithmParamTypeId,""+guid,""+insertedRowDate,""+lastUpdatedDate,""+algorithmParamId,""+algorithmTypeId,""+algorithmTypeVersionId,""+algorithmParam_algorithmParamId,""+algorithmParam_guid,""+algorithmParam_insertedRowDate,""+algorithmParam_lastUpdatedDate,""+algorithmParam_algorithmParamName,""+algorithmParam_algorithmParamDescription,""+algorithmParam_algorithmParamType,""+algorithmType_algorithmTypeId,""+algorithmType_guid,""+algorithmType_insertedRowDate,""+algorithmType_lastUpdatedDate,""+algorithmType_algorithmTypeName,""+algorithmType_algorithmTypeDescription,""+algorithmTypeVersion_algorithmTypeVersionId,""+algorithmTypeVersion_insertedRowDate,""+algorithmTypeVersion_lastUpdatedDate,""+algorithmTypeVersion_guid,""+algorithmTypeVersion_algorithmTypeId,""+algorithmTypeVersion_algorithmTypeVersionName)   }  
 def toFullString() : String = {    "algorithmParamTypeId:'"+algorithmParamTypeId+"'"+","+"guid:'"+guid+"'"+","+"insertedRowDate:'"+insertedRowDate+"'"+","+"lastUpdatedDate:'"+lastUpdatedDate+"'"+","+"algorithmParamId:'"+algorithmParamId+"'"+","+"algorithmTypeId:'"+algorithmTypeId+"'"+","+"algorithmTypeVersionId:'"+algorithmTypeVersionId+"'"+","+"algorithmParam_algorithmParamId:'"+algorithmParam_algorithmParamId+"'"+","+"algorithmParam_guid:'"+algorithmParam_guid+"'"+","+"algorithmParam_insertedRowDate:'"+algorithmParam_insertedRowDate+"'"+","+"algorithmParam_lastUpdatedDate:'"+algorithmParam_lastUpdatedDate+"'"+","+"algorithmParam_algorithmParamName:'"+algorithmParam_algorithmParamName+"'"+","+"algorithmParam_algorithmParamDescription:'"+algorithmParam_algorithmParamDescription+"'"+","+"algorithmParam_algorithmParamType:'"+algorithmParam_algorithmParamType+"'"+","+"algorithmType_algorithmTypeId:'"+algorithmType_algorithmTypeId+"'"+","+"algorithmType_guid:'"+algorithmType_guid+"'"+","+"algorithmType_insertedRowDate:'"+algorithmType_insertedRowDate+"'"+","+"algorithmType_lastUpdatedDate:'"+algorithmType_lastUpdatedDate+"'"+","+"algorithmType_algorithmTypeName:'"+algorithmType_algorithmTypeName+"'"+","+"algorithmType_algorithmTypeDescription:'"+algorithmType_algorithmTypeDescription+"'"+","+"algorithmTypeVersion_algorithmTypeVersionId:'"+algorithmTypeVersion_algorithmTypeVersionId+"'"+","+"algorithmTypeVersion_insertedRowDate:'"+algorithmTypeVersion_insertedRowDate+"'"+","+"algorithmTypeVersion_lastUpdatedDate:'"+algorithmTypeVersion_lastUpdatedDate+"'"+","+"algorithmTypeVersion_guid:'"+algorithmTypeVersion_guid+"'"+","+"algorithmTypeVersion_algorithmTypeId:'"+algorithmTypeVersion_algorithmTypeId+"'"+","+"algorithmTypeVersion_algorithmTypeVersionName:'"+algorithmTypeVersion_algorithmTypeVersionName+"'"   } 
   def getFieldValue(name : String) : Any = { 
    val ret = name match { 
    case "algorithmParamTypeId" => algorithmParamTypeId  
     case "guid" => guid  
     case "insertedRowDate" => insertedRowDate  
     case "lastUpdatedDate" => lastUpdatedDate  
     case "algorithmParamId" => algorithmParamId  
     case "algorithmTypeId" => algorithmTypeId  
     case "algorithmTypeVersionId" => algorithmTypeVersionId  
     case "algorithmParam_algorithmParamId" => algorithmParam_algorithmParamId  
     case "algorithmParam_guid" => algorithmParam_guid  
     case "algorithmParam_insertedRowDate" => algorithmParam_insertedRowDate  
     case "algorithmParam_lastUpdatedDate" => algorithmParam_lastUpdatedDate  
     case "algorithmParam_algorithmParamName" => algorithmParam_algorithmParamName  
     case "algorithmParam_algorithmParamDescription" => algorithmParam_algorithmParamDescription  
     case "algorithmParam_algorithmParamType" => algorithmParam_algorithmParamType  
     case "algorithmType_algorithmTypeId" => algorithmType_algorithmTypeId  
     case "algorithmType_guid" => algorithmType_guid  
     case "algorithmType_insertedRowDate" => algorithmType_insertedRowDate  
     case "algorithmType_lastUpdatedDate" => algorithmType_lastUpdatedDate  
     case "algorithmType_algorithmTypeName" => algorithmType_algorithmTypeName  
     case "algorithmType_algorithmTypeDescription" => algorithmType_algorithmTypeDescription  
     case "algorithmTypeVersion_algorithmTypeVersionId" => algorithmTypeVersion_algorithmTypeVersionId  
     case "algorithmTypeVersion_insertedRowDate" => algorithmTypeVersion_insertedRowDate  
     case "algorithmTypeVersion_lastUpdatedDate" => algorithmTypeVersion_lastUpdatedDate  
     case "algorithmTypeVersion_guid" => algorithmTypeVersion_guid  
     case "algorithmTypeVersion_algorithmTypeId" => algorithmTypeVersion_algorithmTypeId  
     case "algorithmTypeVersion_algorithmTypeVersionName" => algorithmTypeVersion_algorithmTypeVersionName   
    case _ => null 
    } 
    ret 
  } 
   def getFieldTypeName(name : String) : String = { 
    val ret = name match { 
    case "algorithmParamTypeId" => "Long"  
     case "guid" => "Long"  
     case "insertedRowDate" => "java.util.Date"  
     case "lastUpdatedDate" => "java.util.Date"  
     case "algorithmParamId" => "Long"  
     case "algorithmTypeId" => "Long"  
     case "algorithmTypeVersionId" => "Long"  
     case "algorithmParam_algorithmParamId" => "Long"  
     case "algorithmParam_guid" => "Long"  
     case "algorithmParam_insertedRowDate" => "java.util.Date"  
     case "algorithmParam_lastUpdatedDate" => "java.util.Date"  
     case "algorithmParam_algorithmParamName" => "String"  
     case "algorithmParam_algorithmParamDescription" => "String"  
     case "algorithmParam_algorithmParamType" => "String"  
     case "algorithmType_algorithmTypeId" => "Long"  
     case "algorithmType_guid" => "Long"  
     case "algorithmType_insertedRowDate" => "java.util.Date"  
     case "algorithmType_lastUpdatedDate" => "java.util.Date"  
     case "algorithmType_algorithmTypeName" => "String"  
     case "algorithmType_algorithmTypeDescription" => "String"  
     case "algorithmTypeVersion_algorithmTypeVersionId" => "Long"  
     case "algorithmTypeVersion_insertedRowDate" => "java.util.Date"  
     case "algorithmTypeVersion_lastUpdatedDate" => "java.util.Date"  
     case "algorithmTypeVersion_guid" => "Long"  
     case "algorithmTypeVersion_algorithmTypeId" => "Long"  
     case "algorithmTypeVersion_algorithmTypeVersionName" => "String"   
    case _ => "Object" 
    } 
    ret 
  } 
 } 
object VAlgorithmParamTypeDto { 
  val TABLE_NAME = "vAlgorithmParamType"; 
   val FIELD_algorithmParamTypeId = "algorithmParamTypeId";
   val FIELD_guid = "guid";
   val FIELD_insertedRowDate = "insertedRowDate";
   val FIELD_lastUpdatedDate = "lastUpdatedDate";
   val FIELD_algorithmParamId = "algorithmParamId";
   val FIELD_algorithmTypeId = "algorithmTypeId";
   val FIELD_algorithmTypeVersionId = "algorithmTypeVersionId";
   val FIELD_algorithmParam_algorithmParamId = "algorithmParam_algorithmParamId";
   val FIELD_algorithmParam_guid = "algorithmParam_guid";
   val FIELD_algorithmParam_insertedRowDate = "algorithmParam_insertedRowDate";
   val FIELD_algorithmParam_lastUpdatedDate = "algorithmParam_lastUpdatedDate";
   val FIELD_algorithmParam_algorithmParamName = "algorithmParam_algorithmParamName";
   val FIELD_algorithmParam_algorithmParamDescription = "algorithmParam_algorithmParamDescription";
   val FIELD_algorithmParam_algorithmParamType = "algorithmParam_algorithmParamType";
   val FIELD_algorithmType_algorithmTypeId = "algorithmType_algorithmTypeId";
   val FIELD_algorithmType_guid = "algorithmType_guid";
   val FIELD_algorithmType_insertedRowDate = "algorithmType_insertedRowDate";
   val FIELD_algorithmType_lastUpdatedDate = "algorithmType_lastUpdatedDate";
   val FIELD_algorithmType_algorithmTypeName = "algorithmType_algorithmTypeName";
   val FIELD_algorithmType_algorithmTypeDescription = "algorithmType_algorithmTypeDescription";
   val FIELD_algorithmTypeVersion_algorithmTypeVersionId = "algorithmTypeVersion_algorithmTypeVersionId";
   val FIELD_algorithmTypeVersion_insertedRowDate = "algorithmTypeVersion_insertedRowDate";
   val FIELD_algorithmTypeVersion_lastUpdatedDate = "algorithmTypeVersion_lastUpdatedDate";
   val FIELD_algorithmTypeVersion_guid = "algorithmTypeVersion_guid";
   val FIELD_algorithmTypeVersion_algorithmTypeId = "algorithmTypeVersion_algorithmTypeId";
   val FIELD_algorithmTypeVersion_algorithmTypeVersionName = "algorithmTypeVersion_algorithmTypeVersionName";

}

 
