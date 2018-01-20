/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dto 
 
 
case class AlgorithmInfoTypeDto ( 
     val algorithmInfoTypeId : Long
     , val guid : Long
     , val insertedRowDate : java.util.Date
     , val lastUpdatedDate : java.util.Date
     , val algorithmInfoTypeName : String
     , val algorithmInfoTypeDescription : String
     , val algorithmInfoTypeFormat : String 
     ) extends BaseDto {  
   def tableName : String = {    "algorithmInfoType";    }  
   def fields : String = {    "algorithmInfoTypeId,guid,insertedRowDate,lastUpdatedDate,algorithmInfoTypeName,algorithmInfoTypeDescription,algorithmInfoTypeFormat";    }  
   def pkFields : String = {    "algorithmInfoTypeId";    }  
   def fkFields : String = {    "";    }  
   def nameField : String = {    "algorithmInfoTypeName";    }  
 def getPk() : Long = {    algorithmInfoTypeId  }  
 def getInsertedRowDate() : java.util.Date = {    insertedRowDate  }  
 def getLastUpdatedDate() : java.util.Date = {    lastUpdatedDate  }  
 def getGuid() : Long = {    guid  }  
 def toAnyArray() : Array[Any] = {    Array(algorithmInfoTypeId,guid,insertedRowDate,lastUpdatedDate,algorithmInfoTypeName,algorithmInfoTypeDescription,algorithmInfoTypeFormat)  }  
 def toStringArray() : Array[String] = {    Array(""+algorithmInfoTypeId,""+guid,""+insertedRowDate,""+lastUpdatedDate,""+algorithmInfoTypeName,""+algorithmInfoTypeDescription,""+algorithmInfoTypeFormat)   }  
 def toJson() : String = {   "{" + "\"algorithmInfoTypeId\":\""+algorithmInfoTypeId+"\""+","+"\"guid\":\""+guid+"\""+","+"\"insertedRowDate\":\""+insertedRowDate+"\""+","+"\"lastUpdatedDate\":\""+lastUpdatedDate+"\""+","+"\"algorithmInfoTypeName\":\""+algorithmInfoTypeName+"\""+","+"\"algorithmInfoTypeDescription\":\""+algorithmInfoTypeDescription+"\""+","+"\"algorithmInfoTypeFormat\":\""+algorithmInfoTypeFormat+"\"" + "}"   }  
 def toFullString() : String = {    "algorithmInfoTypeId:'"+algorithmInfoTypeId+"'"+","+"guid:'"+guid+"'"+","+"insertedRowDate:'"+insertedRowDate+"'"+","+"lastUpdatedDate:'"+lastUpdatedDate+"'"+","+"algorithmInfoTypeName:'"+algorithmInfoTypeName+"'"+","+"algorithmInfoTypeDescription:'"+algorithmInfoTypeDescription+"'"+","+"algorithmInfoTypeFormat:'"+algorithmInfoTypeFormat+"'"   } 
   def getFieldValue(name : String) : Any = { 
    val ret = name match { 
    case "algorithmInfoTypeId" => algorithmInfoTypeId  
     case "guid" => guid  
     case "insertedRowDate" => insertedRowDate  
     case "lastUpdatedDate" => lastUpdatedDate  
     case "algorithmInfoTypeName" => algorithmInfoTypeName  
     case "algorithmInfoTypeDescription" => algorithmInfoTypeDescription  
     case "algorithmInfoTypeFormat" => algorithmInfoTypeFormat   
    case _ => null 
    } 
    ret 
  } 
   def getFieldTypeName(name : String) : String = { 
    val ret = name match { 
    case "algorithmInfoTypeId" => "Long"  
     case "guid" => "Long"  
     case "insertedRowDate" => "java.util.Date"  
     case "lastUpdatedDate" => "java.util.Date"  
     case "algorithmInfoTypeName" => "String"  
     case "algorithmInfoTypeDescription" => "String"  
     case "algorithmInfoTypeFormat" => "String"   
    case _ => "Object" 
    } 
    ret 
  } 
   def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
     val stat = connection.prepareStatement("insert into algorithmInfoType(guid,algorithmInfoTypeName,algorithmInfoTypeDescription,algorithmInfoTypeFormat) values (?,?,?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
    stat.setObject(1, guid);
    stat.setObject(2, algorithmInfoTypeName);
    stat.setObject(3, algorithmInfoTypeDescription);
    stat.setObject(4, algorithmInfoTypeFormat);
    return stat; 
   } 
   def modify(algorithmInfoTypeName : String, algorithmInfoTypeDescription : String, algorithmInfoTypeFormat : String) : AlgorithmInfoTypeDto = {
    val dtoModified = new AlgorithmInfoTypeDto(this.algorithmInfoTypeId,this.guid,this.insertedRowDate,new java.util.Date(),algorithmInfoTypeName,algorithmInfoTypeDescription,algorithmInfoTypeFormat);
    dtoModified
  }
 } 
object AlgorithmInfoTypeDto { 
  val TABLE_NAME = "algorithmInfoType"; 
   val FIELD_algorithmInfoTypeId = "algorithmInfoTypeId";
   val FIELD_guid = "guid";
   val FIELD_insertedRowDate = "insertedRowDate";
   val FIELD_lastUpdatedDate = "lastUpdatedDate";
   val FIELD_algorithmInfoTypeName = "algorithmInfoTypeName";
   val FIELD_algorithmInfoTypeDescription = "algorithmInfoTypeDescription";
   val FIELD_algorithmInfoTypeFormat = "algorithmInfoTypeFormat";

  def createNewAlgorithmInfoTypeDto(algorithmInfoTypeName : String, algorithmInfoTypeDescription : String, algorithmInfoTypeFormat : String) : AlgorithmInfoTypeDto = {  
     val dto = new AlgorithmInfoTypeDto(0,0,new java.util.Date(),new java.util.Date(),algorithmInfoTypeName,algorithmInfoTypeDescription,algorithmInfoTypeFormat)   
    dto 
  } 

}

 
