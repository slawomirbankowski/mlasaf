/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dto 
 
 
case class SourceViewTypeDto ( 
     val sourceViewTypeId : Long
     , val guid : Long
     , val insertedRowDate : java.util.Date
     , val lastUpdatedDate : java.util.Date
     , val sourceViewTypeName : String
     , val sourceViewTypeClass : String 
     ) extends BaseDto {  
   def tableName : String = {    "sourceViewType";    }  
   def fields : String = {    "sourceViewTypeId,guid,insertedRowDate,lastUpdatedDate,sourceViewTypeName,sourceViewTypeClass";    }  
   def pkFields : String = {    "sourceViewTypeId";    }  
   def fkFields : String = {    "";    }  
   def nameField : String = {    "sourceViewTypeName";    }  
 def getPk() : Long = {    sourceViewTypeId  }  
 def getInsertedRowDate() : java.util.Date = {    insertedRowDate  }  
 def getLastUpdatedDate() : java.util.Date = {    lastUpdatedDate  }  
 def getGuid() : Long = {    guid  }  
 def toAnyArray() : Array[Any] = {    Array(sourceViewTypeId,guid,insertedRowDate,lastUpdatedDate,sourceViewTypeName,sourceViewTypeClass)  }  
 def toStringArray() : Array[String] = {    Array(""+sourceViewTypeId,""+guid,""+insertedRowDate,""+lastUpdatedDate,""+sourceViewTypeName,""+sourceViewTypeClass)   }  
 def toFullString() : String = {    "sourceViewTypeId:'"+sourceViewTypeId+"'"+","+"guid:'"+guid+"'"+","+"insertedRowDate:'"+insertedRowDate+"'"+","+"lastUpdatedDate:'"+lastUpdatedDate+"'"+","+"sourceViewTypeName:'"+sourceViewTypeName+"'"+","+"sourceViewTypeClass:'"+sourceViewTypeClass+"'"   } 
   def getFieldValue(name : String) : Any = { 
    val ret = name match { 
    case "sourceViewTypeId" => sourceViewTypeId  
     case "guid" => guid  
     case "insertedRowDate" => insertedRowDate  
     case "lastUpdatedDate" => lastUpdatedDate  
     case "sourceViewTypeName" => sourceViewTypeName  
     case "sourceViewTypeClass" => sourceViewTypeClass   
    case _ => null 
    } 
    ret 
  } 
   def getFieldTypeName(name : String) : String = { 
    val ret = name match { 
    case "sourceViewTypeId" => "Long"  
     case "guid" => "Long"  
     case "insertedRowDate" => "java.util.Date"  
     case "lastUpdatedDate" => "java.util.Date"  
     case "sourceViewTypeName" => "String"  
     case "sourceViewTypeClass" => "String"   
    case _ => "Object" 
    } 
    ret 
  } 
   def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
     val stat = connection.prepareStatement("insert into sourceViewType(guid,sourceViewTypeName,sourceViewTypeClass) values (?,?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
    stat.setObject(1, guid);
    stat.setObject(2, sourceViewTypeName);
    stat.setObject(3, sourceViewTypeClass);
    return stat; 
   } 
   def modify(sourceViewTypeName : String, sourceViewTypeClass : String) : SourceViewTypeDto = {
    val dtoModified = new SourceViewTypeDto(this.sourceViewTypeId,this.guid,this.insertedRowDate,new java.util.Date(),sourceViewTypeName,sourceViewTypeClass);
    dtoModified
  }
 } 
object SourceViewTypeDto { 
  val TABLE_NAME = "sourceViewType"; 
   val FIELD_sourceViewTypeId = "sourceViewTypeId";
   val FIELD_guid = "guid";
   val FIELD_insertedRowDate = "insertedRowDate";
   val FIELD_lastUpdatedDate = "lastUpdatedDate";
   val FIELD_sourceViewTypeName = "sourceViewTypeName";
   val FIELD_sourceViewTypeClass = "sourceViewTypeClass";

  def createNewSourceViewTypeDto(sourceViewTypeName : String, sourceViewTypeClass : String) : SourceViewTypeDto = {  
     val dto = new SourceViewTypeDto(0,0,new java.util.Date(),new java.util.Date(),sourceViewTypeName,sourceViewTypeClass)   
    dto 
  } 

}

 
