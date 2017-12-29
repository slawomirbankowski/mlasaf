/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dto 
 
 
case class ResourceManagerTypeDto ( 
     val resourceManagerTypeId : Long
     , val guid : Long
     , val insertedRowDate : java.util.Date
     , val lastUpdatedDate : java.util.Date
     , val resourceManagerTypeName : String
     , val resourceManagerTypeClass : String 
     ) extends BaseDto {  
   def tableName : String = { 
   "resourceManagerType"; 
   }  
   def fields : String = { 
   "resourceManagerTypeId,guid,insertedRowDate,lastUpdatedDate,resourceManagerTypeName,resourceManagerTypeClass"; 
   }  
   def pkFields : String = { 
   "resourceManagerTypeId"; 
   }  
   def fkFields : String = { 
   ""; 
   }  
   def nameField : String = { 
   "resourceManagerTypeName"; 
   }  
 def getPk() : Long = {
    resourceManagerTypeId
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
    Array(resourceManagerTypeId,guid,insertedRowDate,lastUpdatedDate,resourceManagerTypeName,resourceManagerTypeClass)
  }  
 def toStringArray() : Array[String] = {
    Array(""+resourceManagerTypeId,""+guid,""+insertedRowDate,""+lastUpdatedDate,""+resourceManagerTypeName,""+resourceManagerTypeClass) 
  } 
   def getFieldValue(name : String) : Any = { 
    val ret = name match { 
    case "resourceManagerTypeId" => resourceManagerTypeId  
     case "guid" => guid  
     case "insertedRowDate" => insertedRowDate  
     case "lastUpdatedDate" => lastUpdatedDate  
     case "resourceManagerTypeName" => resourceManagerTypeName  
     case "resourceManagerTypeClass" => resourceManagerTypeClass   
    case _ => null 
    } 
    ret 
  } 
   def getFieldTypeName(name : String) : String = { 
    val ret = name match { 
    case "resourceManagerTypeId" => "Long"  
     case "guid" => "Long"  
     case "insertedRowDate" => "java.util.Date"  
     case "lastUpdatedDate" => "java.util.Date"  
     case "resourceManagerTypeName" => "String"  
     case "resourceManagerTypeClass" => "String"   
    case _ => "Object" 
    } 
    ret 
  } 
   def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
     val stat = connection.prepareStatement("insert into resourceManagerType(guid,resourceManagerTypeName,resourceManagerTypeClass) values (?,?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
    stat.setObject(1, guid);
    stat.setObject(2, resourceManagerTypeName);
    stat.setObject(3, resourceManagerTypeClass);
    return stat; 
   } 
   def modify(resourceManagerTypeName : String, resourceManagerTypeClass : String) : ResourceManagerTypeDto = {
    val dtoModified = new ResourceManagerTypeDto(this.resourceManagerTypeId,this.guid,this.insertedRowDate,new java.util.Date(),resourceManagerTypeName,resourceManagerTypeClass);
    dtoModified
  }
 } 
object ResourceManagerTypeDto { 
  val TABLE_NAME = "resourceManagerType"; 
   val FIELD_resourceManagerTypeId = "resourceManagerTypeId";
   val FIELD_guid = "guid";
   val FIELD_insertedRowDate = "insertedRowDate";
   val FIELD_lastUpdatedDate = "lastUpdatedDate";
   val FIELD_resourceManagerTypeName = "resourceManagerTypeName";
   val FIELD_resourceManagerTypeClass = "resourceManagerTypeClass";

  def createNewResourceManagerTypeDto(resourceManagerTypeName : String, resourceManagerTypeClass : String) : ResourceManagerTypeDto = {  
     val dto = new ResourceManagerTypeDto(0,0,new java.util.Date(),new java.util.Date(),resourceManagerTypeName,resourceManagerTypeClass)   
    dto 
  } 

}

 
