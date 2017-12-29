/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dto 
 
 
case class AlgorithmTypeOutputTypeDto ( 
     val algorithmTypeOutputTypeId : Long
     , val guid : Long
     , val insertedRowDate : java.util.Date
     , val lastUpdatedDate : java.util.Date
     , val algorithmTypeVersionId : Long
     , val algorithmOutputTypeId : Long
     , val isMandatory : Int 
     ) extends BaseDto {  
   def tableName : String = { 
   "algorithmTypeOutputType"; 
   }  
   def fields : String = { 
   "algorithmTypeOutputTypeId,guid,insertedRowDate,lastUpdatedDate,algorithmTypeVersionId,algorithmOutputTypeId,isMandatory"; 
   }  
   def pkFields : String = { 
   "algorithmTypeOutputTypeId"; 
   }  
   def fkFields : String = { 
   "algorithmOutputTypeId,algorithmTypeVersionId"; 
   }  
   def nameField : String = { 
   ""; 
   }  
 def getPk() : Long = {
    algorithmTypeOutputTypeId
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
    Array(algorithmTypeOutputTypeId,guid,insertedRowDate,lastUpdatedDate,algorithmTypeVersionId,algorithmOutputTypeId,isMandatory)
  }  
 def toStringArray() : Array[String] = {
    Array(""+algorithmTypeOutputTypeId,""+guid,""+insertedRowDate,""+lastUpdatedDate,""+algorithmTypeVersionId,""+algorithmOutputTypeId,""+isMandatory) 
  } 
   def getFieldValue(name : String) : Any = { 
    val ret = name match { 
    case "algorithmTypeOutputTypeId" => algorithmTypeOutputTypeId  
     case "guid" => guid  
     case "insertedRowDate" => insertedRowDate  
     case "lastUpdatedDate" => lastUpdatedDate  
     case "algorithmTypeVersionId" => algorithmTypeVersionId  
     case "algorithmOutputTypeId" => algorithmOutputTypeId  
     case "isMandatory" => isMandatory   
    case _ => null 
    } 
    ret 
  } 
   def getFieldTypeName(name : String) : String = { 
    val ret = name match { 
    case "algorithmTypeOutputTypeId" => "Long"  
     case "guid" => "Long"  
     case "insertedRowDate" => "java.util.Date"  
     case "lastUpdatedDate" => "java.util.Date"  
     case "algorithmTypeVersionId" => "Long"  
     case "algorithmOutputTypeId" => "Long"  
     case "isMandatory" => "Int"   
    case _ => "Object" 
    } 
    ret 
  } 
   def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
     val stat = connection.prepareStatement("insert into algorithmTypeOutputType(guid,algorithmTypeVersionId,algorithmOutputTypeId,isMandatory) values (?,?,?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
    stat.setObject(1, guid);
    stat.setObject(2, algorithmTypeVersionId);
    stat.setObject(3, algorithmOutputTypeId);
    stat.setObject(4, isMandatory);
    return stat; 
   } 
   def modify(algorithmTypeVersionId : Long, algorithmOutputTypeId : Long, isMandatory : Int) : AlgorithmTypeOutputTypeDto = {
    val dtoModified = new AlgorithmTypeOutputTypeDto(this.algorithmTypeOutputTypeId,this.guid,this.insertedRowDate,new java.util.Date(),algorithmTypeVersionId,algorithmOutputTypeId,isMandatory);
    dtoModified
  }
 } 
object AlgorithmTypeOutputTypeDto { 
  val TABLE_NAME = "algorithmTypeOutputType"; 
   val FIELD_algorithmTypeOutputTypeId = "algorithmTypeOutputTypeId";
   val FIELD_guid = "guid";
   val FIELD_insertedRowDate = "insertedRowDate";
   val FIELD_lastUpdatedDate = "lastUpdatedDate";
   val FIELD_algorithmTypeVersionId = "algorithmTypeVersionId";
   val FIELD_algorithmOutputTypeId = "algorithmOutputTypeId";
   val FIELD_isMandatory = "isMandatory";

  def createNewAlgorithmTypeOutputTypeDto(algorithmTypeVersionId : Long, algorithmOutputTypeId : Long, isMandatory : Int) : AlgorithmTypeOutputTypeDto = {  
     val dto = new AlgorithmTypeOutputTypeDto(0,0,new java.util.Date(),new java.util.Date(),algorithmTypeVersionId,algorithmOutputTypeId,isMandatory)   
    dto 
  } 

}

 
