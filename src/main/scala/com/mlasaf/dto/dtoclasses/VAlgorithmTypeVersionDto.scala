/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dto 
 
 
case class VAlgorithmTypeVersionDto ( 
     val algorithmTypeVersionId : Long
     , val insertedRowDate : java.util.Date
     , val lastUpdatedDate : java.util.Date
     , val guid : Long
     , val algorithmTypeId : Long
     , val algorithmTypeVersionName : String
     , val algorithmType_algorithmTypeId : Long
     , val algorithmType_guid : Long
     , val algorithmType_insertedRowDate : java.util.Date
     , val algorithmType_lastUpdatedDate : java.util.Date
     , val algorithmType_algorithmTypeName : String
     , val algorithmType_algorithmTypeDescription : String 
     ) extends BaseReadOnlyDto {  
   def tableName : String = { 
   "vAlgorithmTypeVersion"; 
   }  
   def fields : String = { 
   "algorithmTypeVersionId,insertedRowDate,lastUpdatedDate,guid,algorithmTypeId,algorithmTypeVersionName,algorithmType_algorithmTypeId,algorithmType_guid,algorithmType_insertedRowDate,algorithmType_lastUpdatedDate,algorithmType_algorithmTypeName,algorithmType_algorithmTypeDescription"; 
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
    algorithmTypeVersionId
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
    Array(algorithmTypeVersionId,insertedRowDate,lastUpdatedDate,guid,algorithmTypeId,algorithmTypeVersionName,algorithmType_algorithmTypeId,algorithmType_guid,algorithmType_insertedRowDate,algorithmType_lastUpdatedDate,algorithmType_algorithmTypeName,algorithmType_algorithmTypeDescription)
  }  
 def toStringArray() : Array[String] = {
    Array(""+algorithmTypeVersionId,""+insertedRowDate,""+lastUpdatedDate,""+guid,""+algorithmTypeId,""+algorithmTypeVersionName,""+algorithmType_algorithmTypeId,""+algorithmType_guid,""+algorithmType_insertedRowDate,""+algorithmType_lastUpdatedDate,""+algorithmType_algorithmTypeName,""+algorithmType_algorithmTypeDescription) 
  } 
   def getFieldValue(name : String) : Any = { 
    val ret = name match { 
    case "algorithmTypeVersionId" => algorithmTypeVersionId  
     case "insertedRowDate" => insertedRowDate  
     case "lastUpdatedDate" => lastUpdatedDate  
     case "guid" => guid  
     case "algorithmTypeId" => algorithmTypeId  
     case "algorithmTypeVersionName" => algorithmTypeVersionName  
     case "algorithmType_algorithmTypeId" => algorithmType_algorithmTypeId  
     case "algorithmType_guid" => algorithmType_guid  
     case "algorithmType_insertedRowDate" => algorithmType_insertedRowDate  
     case "algorithmType_lastUpdatedDate" => algorithmType_lastUpdatedDate  
     case "algorithmType_algorithmTypeName" => algorithmType_algorithmTypeName  
     case "algorithmType_algorithmTypeDescription" => algorithmType_algorithmTypeDescription   
    case _ => null 
    } 
    ret 
  } 
   def getFieldTypeName(name : String) : String = { 
    val ret = name match { 
    case "algorithmTypeVersionId" => "Long"  
     case "insertedRowDate" => "java.util.Date"  
     case "lastUpdatedDate" => "java.util.Date"  
     case "guid" => "Long"  
     case "algorithmTypeId" => "Long"  
     case "algorithmTypeVersionName" => "String"  
     case "algorithmType_algorithmTypeId" => "Long"  
     case "algorithmType_guid" => "Long"  
     case "algorithmType_insertedRowDate" => "java.util.Date"  
     case "algorithmType_lastUpdatedDate" => "java.util.Date"  
     case "algorithmType_algorithmTypeName" => "String"  
     case "algorithmType_algorithmTypeDescription" => "String"   
    case _ => "Object" 
    } 
    ret 
  } 
 } 
object VAlgorithmTypeVersionDto { 
  val TABLE_NAME = "vAlgorithmTypeVersion"; 
   val FIELD_algorithmTypeVersionId = "algorithmTypeVersionId";
   val FIELD_insertedRowDate = "insertedRowDate";
   val FIELD_lastUpdatedDate = "lastUpdatedDate";
   val FIELD_guid = "guid";
   val FIELD_algorithmTypeId = "algorithmTypeId";
   val FIELD_algorithmTypeVersionName = "algorithmTypeVersionName";
   val FIELD_algorithmType_algorithmTypeId = "algorithmType_algorithmTypeId";
   val FIELD_algorithmType_guid = "algorithmType_guid";
   val FIELD_algorithmType_insertedRowDate = "algorithmType_insertedRowDate";
   val FIELD_algorithmType_lastUpdatedDate = "algorithmType_lastUpdatedDate";
   val FIELD_algorithmType_algorithmTypeName = "algorithmType_algorithmTypeName";
   val FIELD_algorithmType_algorithmTypeDescription = "algorithmType_algorithmTypeDescription";

}

 
