/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dto 
 
 
case class ResourceMeasureDto ( 
     val resourceMeasureId : Long
     , val guid : Long
     , val insertedRowDate : java.util.Date
     , val lastUpdatedDate : java.util.Date
     , val resourceMeasureName : String 
     ) extends BaseDto {  
   def tableName : String = {    "resourceMeasure";    }  
   def fields : String = {    "resourceMeasureId,guid,insertedRowDate,lastUpdatedDate,resourceMeasureName";    }  
   def pkFields : String = {    "resourceMeasureId";    }  
   def fkFields : String = {    "";    }  
   def nameField : String = {    "resourceMeasureName";    }  
 def getPk() : Long = {    resourceMeasureId  }  
 def getInsertedRowDate() : java.util.Date = {    insertedRowDate  }  
 def getLastUpdatedDate() : java.util.Date = {    lastUpdatedDate  }  
 def getGuid() : Long = {    guid  }  
 def toAnyArray() : Array[Any] = {    Array(resourceMeasureId,guid,insertedRowDate,lastUpdatedDate,resourceMeasureName)  }  
 def toStringArray() : Array[String] = {    Array(""+resourceMeasureId,""+guid,""+insertedRowDate,""+lastUpdatedDate,""+resourceMeasureName)   }  
 def toFullString() : String = {    "resourceMeasureId:'"+resourceMeasureId+"'"+","+"guid:'"+guid+"'"+","+"insertedRowDate:'"+insertedRowDate+"'"+","+"lastUpdatedDate:'"+lastUpdatedDate+"'"+","+"resourceMeasureName:'"+resourceMeasureName+"'"   } 
   def getFieldValue(name : String) : Any = { 
    val ret = name match { 
    case "resourceMeasureId" => resourceMeasureId  
     case "guid" => guid  
     case "insertedRowDate" => insertedRowDate  
     case "lastUpdatedDate" => lastUpdatedDate  
     case "resourceMeasureName" => resourceMeasureName   
    case _ => null 
    } 
    ret 
  } 
   def getFieldTypeName(name : String) : String = { 
    val ret = name match { 
    case "resourceMeasureId" => "Long"  
     case "guid" => "Long"  
     case "insertedRowDate" => "java.util.Date"  
     case "lastUpdatedDate" => "java.util.Date"  
     case "resourceMeasureName" => "String"   
    case _ => "Object" 
    } 
    ret 
  } 
   def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
     val stat = connection.prepareStatement("insert into resourceMeasure(guid,resourceMeasureName) values (?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
    stat.setObject(1, guid);
    stat.setObject(2, resourceMeasureName);
    return stat; 
   } 
   def modify(resourceMeasureName : String) : ResourceMeasureDto = {
    val dtoModified = new ResourceMeasureDto(this.resourceMeasureId,this.guid,this.insertedRowDate,new java.util.Date(),resourceMeasureName);
    dtoModified
  }
 } 
object ResourceMeasureDto { 
  val TABLE_NAME = "resourceMeasure"; 
   val FIELD_resourceMeasureId = "resourceMeasureId";
   val FIELD_guid = "guid";
   val FIELD_insertedRowDate = "insertedRowDate";
   val FIELD_lastUpdatedDate = "lastUpdatedDate";
   val FIELD_resourceMeasureName = "resourceMeasureName";

  def createNewResourceMeasureDto(resourceMeasureName : String) : ResourceMeasureDto = {  
     val dto = new ResourceMeasureDto(0,0,new java.util.Date(),new java.util.Date(),resourceMeasureName)   
    dto 
  } 

}

 
