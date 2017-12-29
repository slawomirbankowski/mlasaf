/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dto 
 
 
case class AlgorithmScheduleViewTypeDto ( 
     val algorithmScheduleViewTypeId : Long
     , val guid : Long
     , val insertedRowDate : java.util.Date
     , val lastUpdatedDate : java.util.Date
     , val algorithmScheduleViewTypeName : String 
     ) extends BaseDto {  
   def tableName : String = { 
   "algorithmScheduleViewType"; 
   }  
   def fields : String = { 
   "algorithmScheduleViewTypeId,guid,insertedRowDate,lastUpdatedDate,algorithmScheduleViewTypeName"; 
   }  
   def pkFields : String = { 
   "algorithmScheduleViewTypeId"; 
   }  
   def fkFields : String = { 
   ""; 
   }  
   def nameField : String = { 
   "algorithmScheduleViewTypeName"; 
   }  
 def getPk() : Long = {
    algorithmScheduleViewTypeId
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
    Array(algorithmScheduleViewTypeId,guid,insertedRowDate,lastUpdatedDate,algorithmScheduleViewTypeName)
  }  
 def toStringArray() : Array[String] = {
    Array(""+algorithmScheduleViewTypeId,""+guid,""+insertedRowDate,""+lastUpdatedDate,""+algorithmScheduleViewTypeName) 
  } 
   def getFieldValue(name : String) : Any = { 
    val ret = name match { 
    case "algorithmScheduleViewTypeId" => algorithmScheduleViewTypeId  
     case "guid" => guid  
     case "insertedRowDate" => insertedRowDate  
     case "lastUpdatedDate" => lastUpdatedDate  
     case "algorithmScheduleViewTypeName" => algorithmScheduleViewTypeName   
    case _ => null 
    } 
    ret 
  } 
   def getFieldTypeName(name : String) : String = { 
    val ret = name match { 
    case "algorithmScheduleViewTypeId" => "Long"  
     case "guid" => "Long"  
     case "insertedRowDate" => "java.util.Date"  
     case "lastUpdatedDate" => "java.util.Date"  
     case "algorithmScheduleViewTypeName" => "String"   
    case _ => "Object" 
    } 
    ret 
  } 
   def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
     val stat = connection.prepareStatement("insert into algorithmScheduleViewType(guid,algorithmScheduleViewTypeName) values (?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
    stat.setObject(1, guid);
    stat.setObject(2, algorithmScheduleViewTypeName);
    return stat; 
   } 
   def modify(algorithmScheduleViewTypeName : String) : AlgorithmScheduleViewTypeDto = {
    val dtoModified = new AlgorithmScheduleViewTypeDto(this.algorithmScheduleViewTypeId,this.guid,this.insertedRowDate,new java.util.Date(),algorithmScheduleViewTypeName);
    dtoModified
  }
 } 
object AlgorithmScheduleViewTypeDto { 
  val TABLE_NAME = "algorithmScheduleViewType"; 
   val FIELD_algorithmScheduleViewTypeId = "algorithmScheduleViewTypeId";
   val FIELD_guid = "guid";
   val FIELD_insertedRowDate = "insertedRowDate";
   val FIELD_lastUpdatedDate = "lastUpdatedDate";
   val FIELD_algorithmScheduleViewTypeName = "algorithmScheduleViewTypeName";

  def createNewAlgorithmScheduleViewTypeDto(algorithmScheduleViewTypeName : String) : AlgorithmScheduleViewTypeDto = {  
     val dto = new AlgorithmScheduleViewTypeDto(0,0,new java.util.Date(),new java.util.Date(),algorithmScheduleViewTypeName)   
    dto 
  } 

}

 
