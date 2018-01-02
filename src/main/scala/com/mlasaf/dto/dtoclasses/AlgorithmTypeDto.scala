/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dto 
 
 
case class AlgorithmTypeDto ( 
     val algorithmTypeId : Long
     , val guid : Long
     , val insertedRowDate : java.util.Date
     , val lastUpdatedDate : java.util.Date
     , val algorithmTypeName : String
     , val algorithmTypeDescription : String 
     ) extends BaseDto {  
   def tableName : String = {    "algorithmType";    }  
   def fields : String = {    "algorithmTypeId,guid,insertedRowDate,lastUpdatedDate,algorithmTypeName,algorithmTypeDescription";    }  
   def pkFields : String = {    "algorithmTypeId";    }  
   def fkFields : String = {    "";    }  
   def nameField : String = {    "algorithmTypeName";    }  
 def getPk() : Long = {    algorithmTypeId  }  
 def getInsertedRowDate() : java.util.Date = {    insertedRowDate  }  
 def getLastUpdatedDate() : java.util.Date = {    lastUpdatedDate  }  
 def getGuid() : Long = {    guid  }  
 def toAnyArray() : Array[Any] = {    Array(algorithmTypeId,guid,insertedRowDate,lastUpdatedDate,algorithmTypeName,algorithmTypeDescription)  }  
 def toStringArray() : Array[String] = {    Array(""+algorithmTypeId,""+guid,""+insertedRowDate,""+lastUpdatedDate,""+algorithmTypeName,""+algorithmTypeDescription)   }  
 def toJson() : String = {   "{" + "\"algorithmTypeId\":\""+algorithmTypeId+"\""+","+"\"guid\":\""+guid+"\""+","+"\"insertedRowDate\":\""+insertedRowDate+"\""+","+"\"lastUpdatedDate\":\""+lastUpdatedDate+"\""+","+"\"algorithmTypeName\":\""+algorithmTypeName+"\""+","+"\"algorithmTypeDescription\":\""+algorithmTypeDescription+"\"" + "}"   }  
 def toFullString() : String = {    "algorithmTypeId:'"+algorithmTypeId+"'"+","+"guid:'"+guid+"'"+","+"insertedRowDate:'"+insertedRowDate+"'"+","+"lastUpdatedDate:'"+lastUpdatedDate+"'"+","+"algorithmTypeName:'"+algorithmTypeName+"'"+","+"algorithmTypeDescription:'"+algorithmTypeDescription+"'"   } 
   def getFieldValue(name : String) : Any = { 
    val ret = name match { 
    case "algorithmTypeId" => algorithmTypeId  
     case "guid" => guid  
     case "insertedRowDate" => insertedRowDate  
     case "lastUpdatedDate" => lastUpdatedDate  
     case "algorithmTypeName" => algorithmTypeName  
     case "algorithmTypeDescription" => algorithmTypeDescription   
    case _ => null 
    } 
    ret 
  } 
   def getFieldTypeName(name : String) : String = { 
    val ret = name match { 
    case "algorithmTypeId" => "Long"  
     case "guid" => "Long"  
     case "insertedRowDate" => "java.util.Date"  
     case "lastUpdatedDate" => "java.util.Date"  
     case "algorithmTypeName" => "String"  
     case "algorithmTypeDescription" => "String"   
    case _ => "Object" 
    } 
    ret 
  } 
   def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
     val stat = connection.prepareStatement("insert into algorithmType(guid,algorithmTypeName,algorithmTypeDescription) values (?,?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
    stat.setObject(1, guid);
    stat.setObject(2, algorithmTypeName);
    stat.setObject(3, algorithmTypeDescription);
    return stat; 
   } 
   def modify(algorithmTypeName : String, algorithmTypeDescription : String) : AlgorithmTypeDto = {
    val dtoModified = new AlgorithmTypeDto(this.algorithmTypeId,this.guid,this.insertedRowDate,new java.util.Date(),algorithmTypeName,algorithmTypeDescription);
    dtoModified
  }
 } 
object AlgorithmTypeDto { 
  val TABLE_NAME = "algorithmType"; 
   val FIELD_algorithmTypeId = "algorithmTypeId";
   val FIELD_guid = "guid";
   val FIELD_insertedRowDate = "insertedRowDate";
   val FIELD_lastUpdatedDate = "lastUpdatedDate";
   val FIELD_algorithmTypeName = "algorithmTypeName";
   val FIELD_algorithmTypeDescription = "algorithmTypeDescription";

  def createNewAlgorithmTypeDto(algorithmTypeName : String, algorithmTypeDescription : String) : AlgorithmTypeDto = {  
     val dto = new AlgorithmTypeDto(0,0,new java.util.Date(),new java.util.Date(),algorithmTypeName,algorithmTypeDescription)   
    dto 
  } 

}

 
