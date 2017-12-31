/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dto 
 
 
case class DownloadTransformTypeDto ( 
     val downloadTransformTypeId : Long
     , val guid : Long
     , val insertedRowDate : java.util.Date
     , val lastUpdatedDate : java.util.Date
     , val downloadTransformTypeName : String 
     ) extends BaseDto {  
   def tableName : String = {    "downloadTransformType";    }  
   def fields : String = {    "downloadTransformTypeId,guid,insertedRowDate,lastUpdatedDate,downloadTransformTypeName";    }  
   def pkFields : String = {    "downloadTransformTypeId";    }  
   def fkFields : String = {    "";    }  
   def nameField : String = {    "downloadTransformTypeName";    }  
 def getPk() : Long = {    downloadTransformTypeId  }  
 def getInsertedRowDate() : java.util.Date = {    insertedRowDate  }  
 def getLastUpdatedDate() : java.util.Date = {    lastUpdatedDate  }  
 def getGuid() : Long = {    guid  }  
 def toAnyArray() : Array[Any] = {    Array(downloadTransformTypeId,guid,insertedRowDate,lastUpdatedDate,downloadTransformTypeName)  }  
 def toStringArray() : Array[String] = {    Array(""+downloadTransformTypeId,""+guid,""+insertedRowDate,""+lastUpdatedDate,""+downloadTransformTypeName)   }  
 def toFullString() : String = {    "downloadTransformTypeId:'"+downloadTransformTypeId+"'"+","+"guid:'"+guid+"'"+","+"insertedRowDate:'"+insertedRowDate+"'"+","+"lastUpdatedDate:'"+lastUpdatedDate+"'"+","+"downloadTransformTypeName:'"+downloadTransformTypeName+"'"   } 
   def getFieldValue(name : String) : Any = { 
    val ret = name match { 
    case "downloadTransformTypeId" => downloadTransformTypeId  
     case "guid" => guid  
     case "insertedRowDate" => insertedRowDate  
     case "lastUpdatedDate" => lastUpdatedDate  
     case "downloadTransformTypeName" => downloadTransformTypeName   
    case _ => null 
    } 
    ret 
  } 
   def getFieldTypeName(name : String) : String = { 
    val ret = name match { 
    case "downloadTransformTypeId" => "Long"  
     case "guid" => "Long"  
     case "insertedRowDate" => "java.util.Date"  
     case "lastUpdatedDate" => "java.util.Date"  
     case "downloadTransformTypeName" => "String"   
    case _ => "Object" 
    } 
    ret 
  } 
   def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
     val stat = connection.prepareStatement("insert into downloadTransformType(guid,downloadTransformTypeName) values (?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
    stat.setObject(1, guid);
    stat.setObject(2, downloadTransformTypeName);
    return stat; 
   } 
   def modify(downloadTransformTypeName : String) : DownloadTransformTypeDto = {
    val dtoModified = new DownloadTransformTypeDto(this.downloadTransformTypeId,this.guid,this.insertedRowDate,new java.util.Date(),downloadTransformTypeName);
    dtoModified
  }
 } 
object DownloadTransformTypeDto { 
  val TABLE_NAME = "downloadTransformType"; 
   val FIELD_downloadTransformTypeId = "downloadTransformTypeId";
   val FIELD_guid = "guid";
   val FIELD_insertedRowDate = "insertedRowDate";
   val FIELD_lastUpdatedDate = "lastUpdatedDate";
   val FIELD_downloadTransformTypeName = "downloadTransformTypeName";

  def createNewDownloadTransformTypeDto(downloadTransformTypeName : String) : DownloadTransformTypeDto = {  
     val dto = new DownloadTransformTypeDto(0,0,new java.util.Date(),new java.util.Date(),downloadTransformTypeName)   
    dto 
  } 

}

 
