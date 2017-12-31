/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dto 
 
 
case class DownloadTransformGroupDto ( 
     val downloadTransformGroupId : Long
     , val guid : Long
     , val insertedRowDate : java.util.Date
     , val lastUpdatedDate : java.util.Date
     , val downloadTransformGroupName : String 
     ) extends BaseDto {  
   def tableName : String = {    "downloadTransformGroup";    }  
   def fields : String = {    "downloadTransformGroupId,guid,insertedRowDate,lastUpdatedDate,downloadTransformGroupName";    }  
   def pkFields : String = {    "downloadTransformGroupId";    }  
   def fkFields : String = {    "";    }  
   def nameField : String = {    "downloadTransformGroupName";    }  
 def getPk() : Long = {    downloadTransformGroupId  }  
 def getInsertedRowDate() : java.util.Date = {    insertedRowDate  }  
 def getLastUpdatedDate() : java.util.Date = {    lastUpdatedDate  }  
 def getGuid() : Long = {    guid  }  
 def toAnyArray() : Array[Any] = {    Array(downloadTransformGroupId,guid,insertedRowDate,lastUpdatedDate,downloadTransformGroupName)  }  
 def toStringArray() : Array[String] = {    Array(""+downloadTransformGroupId,""+guid,""+insertedRowDate,""+lastUpdatedDate,""+downloadTransformGroupName)   }  
 def toFullString() : String = {    "downloadTransformGroupId:'"+downloadTransformGroupId+"'"+","+"guid:'"+guid+"'"+","+"insertedRowDate:'"+insertedRowDate+"'"+","+"lastUpdatedDate:'"+lastUpdatedDate+"'"+","+"downloadTransformGroupName:'"+downloadTransformGroupName+"'"   } 
   def getFieldValue(name : String) : Any = { 
    val ret = name match { 
    case "downloadTransformGroupId" => downloadTransformGroupId  
     case "guid" => guid  
     case "insertedRowDate" => insertedRowDate  
     case "lastUpdatedDate" => lastUpdatedDate  
     case "downloadTransformGroupName" => downloadTransformGroupName   
    case _ => null 
    } 
    ret 
  } 
   def getFieldTypeName(name : String) : String = { 
    val ret = name match { 
    case "downloadTransformGroupId" => "Long"  
     case "guid" => "Long"  
     case "insertedRowDate" => "java.util.Date"  
     case "lastUpdatedDate" => "java.util.Date"  
     case "downloadTransformGroupName" => "String"   
    case _ => "Object" 
    } 
    ret 
  } 
   def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
     val stat = connection.prepareStatement("insert into downloadTransformGroup(guid,downloadTransformGroupName) values (?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
    stat.setObject(1, guid);
    stat.setObject(2, downloadTransformGroupName);
    return stat; 
   } 
   def modify(downloadTransformGroupName : String) : DownloadTransformGroupDto = {
    val dtoModified = new DownloadTransformGroupDto(this.downloadTransformGroupId,this.guid,this.insertedRowDate,new java.util.Date(),downloadTransformGroupName);
    dtoModified
  }
 } 
object DownloadTransformGroupDto { 
  val TABLE_NAME = "downloadTransformGroup"; 
   val FIELD_downloadTransformGroupId = "downloadTransformGroupId";
   val FIELD_guid = "guid";
   val FIELD_insertedRowDate = "insertedRowDate";
   val FIELD_lastUpdatedDate = "lastUpdatedDate";
   val FIELD_downloadTransformGroupName = "downloadTransformGroupName";

  def createNewDownloadTransformGroupDto(downloadTransformGroupName : String) : DownloadTransformGroupDto = {  
     val dto = new DownloadTransformGroupDto(0,0,new java.util.Date(),new java.util.Date(),downloadTransformGroupName)   
    dto 
  } 

}

 
