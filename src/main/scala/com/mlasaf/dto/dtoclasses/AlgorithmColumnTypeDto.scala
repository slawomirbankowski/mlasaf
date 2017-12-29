/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dto 
 
 
case class AlgorithmColumnTypeDto ( 
     val algorithmColumnTypeId : Long
     , val guid : Long
     , val insertedRowDate : java.util.Date
     , val lastUpdatedDate : java.util.Date
     , val algorithmColumnTypeName : String
     , val algorithmColumnTypeDescription : String 
     ) extends BaseDto {  
   def tableName : String = {    "algorithmColumnType";    }  
   def fields : String = {    "algorithmColumnTypeId,guid,insertedRowDate,lastUpdatedDate,algorithmColumnTypeName,algorithmColumnTypeDescription";    }  
   def pkFields : String = {    "algorithmColumnTypeId";    }  
   def fkFields : String = {    "";    }  
   def nameField : String = {    "algorithmColumnTypeName";    }  
 def getPk() : Long = {    algorithmColumnTypeId  }  
 def getInsertedRowDate() : java.util.Date = {    insertedRowDate  }  
 def getLastUpdatedDate() : java.util.Date = {    lastUpdatedDate  }  
 def getGuid() : Long = {    guid  }  
 def toAnyArray() : Array[Any] = {    Array(algorithmColumnTypeId,guid,insertedRowDate,lastUpdatedDate,algorithmColumnTypeName,algorithmColumnTypeDescription)  }  
 def toStringArray() : Array[String] = {    Array(""+algorithmColumnTypeId,""+guid,""+insertedRowDate,""+lastUpdatedDate,""+algorithmColumnTypeName,""+algorithmColumnTypeDescription)   }  
 def toFullString() : String = {    "algorithmColumnTypeId:'"+algorithmColumnTypeId+"'"+","+"guid:'"+guid+"'"+","+"insertedRowDate:'"+insertedRowDate+"'"+","+"lastUpdatedDate:'"+lastUpdatedDate+"'"+","+"algorithmColumnTypeName:'"+algorithmColumnTypeName+"'"+","+"algorithmColumnTypeDescription:'"+algorithmColumnTypeDescription+"'"   } 
   def getFieldValue(name : String) : Any = { 
    val ret = name match { 
    case "algorithmColumnTypeId" => algorithmColumnTypeId  
     case "guid" => guid  
     case "insertedRowDate" => insertedRowDate  
     case "lastUpdatedDate" => lastUpdatedDate  
     case "algorithmColumnTypeName" => algorithmColumnTypeName  
     case "algorithmColumnTypeDescription" => algorithmColumnTypeDescription   
    case _ => null 
    } 
    ret 
  } 
   def getFieldTypeName(name : String) : String = { 
    val ret = name match { 
    case "algorithmColumnTypeId" => "Long"  
     case "guid" => "Long"  
     case "insertedRowDate" => "java.util.Date"  
     case "lastUpdatedDate" => "java.util.Date"  
     case "algorithmColumnTypeName" => "String"  
     case "algorithmColumnTypeDescription" => "String"   
    case _ => "Object" 
    } 
    ret 
  } 
   def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
     val stat = connection.prepareStatement("insert into algorithmColumnType(guid,algorithmColumnTypeName,algorithmColumnTypeDescription) values (?,?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
    stat.setObject(1, guid);
    stat.setObject(2, algorithmColumnTypeName);
    stat.setObject(3, algorithmColumnTypeDescription);
    return stat; 
   } 
   def modify(algorithmColumnTypeName : String, algorithmColumnTypeDescription : String) : AlgorithmColumnTypeDto = {
    val dtoModified = new AlgorithmColumnTypeDto(this.algorithmColumnTypeId,this.guid,this.insertedRowDate,new java.util.Date(),algorithmColumnTypeName,algorithmColumnTypeDescription);
    dtoModified
  }
 } 
object AlgorithmColumnTypeDto { 
  val TABLE_NAME = "algorithmColumnType"; 
   val FIELD_algorithmColumnTypeId = "algorithmColumnTypeId";
   val FIELD_guid = "guid";
   val FIELD_insertedRowDate = "insertedRowDate";
   val FIELD_lastUpdatedDate = "lastUpdatedDate";
   val FIELD_algorithmColumnTypeName = "algorithmColumnTypeName";
   val FIELD_algorithmColumnTypeDescription = "algorithmColumnTypeDescription";

  def createNewAlgorithmColumnTypeDto(algorithmColumnTypeName : String, algorithmColumnTypeDescription : String) : AlgorithmColumnTypeDto = {  
     val dto = new AlgorithmColumnTypeDto(0,0,new java.util.Date(),new java.util.Date(),algorithmColumnTypeName,algorithmColumnTypeDescription)   
    dto 
  } 

}

 
