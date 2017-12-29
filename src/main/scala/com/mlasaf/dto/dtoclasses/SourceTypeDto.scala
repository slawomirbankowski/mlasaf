/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dto 
 
 
case class SourceTypeDto ( 
     val sourceTypeId : Long
     , val guid : Long
     , val insertedRowDate : java.util.Date
     , val lastUpdatedDate : java.util.Date
     , val sourceTypeName : String
     , val sourceTypeClass : String 
     ) extends BaseDto {  
   def tableName : String = {    "sourceType";    }  
   def fields : String = {    "sourceTypeId,guid,insertedRowDate,lastUpdatedDate,sourceTypeName,sourceTypeClass";    }  
   def pkFields : String = {    "sourceTypeId";    }  
   def fkFields : String = {    "";    }  
   def nameField : String = {    "sourceTypeName";    }  
 def getPk() : Long = {    sourceTypeId  }  
 def getInsertedRowDate() : java.util.Date = {    insertedRowDate  }  
 def getLastUpdatedDate() : java.util.Date = {    lastUpdatedDate  }  
 def getGuid() : Long = {    guid  }  
 def toAnyArray() : Array[Any] = {    Array(sourceTypeId,guid,insertedRowDate,lastUpdatedDate,sourceTypeName,sourceTypeClass)  }  
 def toStringArray() : Array[String] = {    Array(""+sourceTypeId,""+guid,""+insertedRowDate,""+lastUpdatedDate,""+sourceTypeName,""+sourceTypeClass)   }  
 def toFullString() : String = {    "sourceTypeId:'"+sourceTypeId+"'"+","+"guid:'"+guid+"'"+","+"insertedRowDate:'"+insertedRowDate+"'"+","+"lastUpdatedDate:'"+lastUpdatedDate+"'"+","+"sourceTypeName:'"+sourceTypeName+"'"+","+"sourceTypeClass:'"+sourceTypeClass+"'"   } 
   def getFieldValue(name : String) : Any = { 
    val ret = name match { 
    case "sourceTypeId" => sourceTypeId  
     case "guid" => guid  
     case "insertedRowDate" => insertedRowDate  
     case "lastUpdatedDate" => lastUpdatedDate  
     case "sourceTypeName" => sourceTypeName  
     case "sourceTypeClass" => sourceTypeClass   
    case _ => null 
    } 
    ret 
  } 
   def getFieldTypeName(name : String) : String = { 
    val ret = name match { 
    case "sourceTypeId" => "Long"  
     case "guid" => "Long"  
     case "insertedRowDate" => "java.util.Date"  
     case "lastUpdatedDate" => "java.util.Date"  
     case "sourceTypeName" => "String"  
     case "sourceTypeClass" => "String"   
    case _ => "Object" 
    } 
    ret 
  } 
   def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
     val stat = connection.prepareStatement("insert into sourceType(guid,sourceTypeName,sourceTypeClass) values (?,?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
    stat.setObject(1, guid);
    stat.setObject(2, sourceTypeName);
    stat.setObject(3, sourceTypeClass);
    return stat; 
   } 
   def modify(sourceTypeName : String, sourceTypeClass : String) : SourceTypeDto = {
    val dtoModified = new SourceTypeDto(this.sourceTypeId,this.guid,this.insertedRowDate,new java.util.Date(),sourceTypeName,sourceTypeClass);
    dtoModified
  }
 } 
object SourceTypeDto { 
  val TABLE_NAME = "sourceType"; 
   val FIELD_sourceTypeId = "sourceTypeId";
   val FIELD_guid = "guid";
   val FIELD_insertedRowDate = "insertedRowDate";
   val FIELD_lastUpdatedDate = "lastUpdatedDate";
   val FIELD_sourceTypeName = "sourceTypeName";
   val FIELD_sourceTypeClass = "sourceTypeClass";

  def createNewSourceTypeDto(sourceTypeName : String, sourceTypeClass : String) : SourceTypeDto = {  
     val dto = new SourceTypeDto(0,0,new java.util.Date(),new java.util.Date(),sourceTypeName,sourceTypeClass)   
    dto 
  } 

}

 
