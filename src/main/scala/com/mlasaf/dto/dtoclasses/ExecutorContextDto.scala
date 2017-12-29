/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dto 
 
 
case class ExecutorContextDto ( 
     val executorContextId : Long
     , val guid : Long
     , val insertedRowDate : java.util.Date
     , val lastUpdatedDate : java.util.Date
     , val executorHostId : Long
     , val isWorking : Int
     , val properties : String
     , val properties2 : String
     , val properties3 : String
     , val entryParams : String 
     ) extends BaseDto {  
   def tableName : String = {    "executorContext";    }  
   def fields : String = {    "executorContextId,guid,insertedRowDate,lastUpdatedDate,executorHostId,isWorking,properties,properties2,properties3,entryParams";    }  
   def pkFields : String = {    "executorContextId";    }  
   def fkFields : String = {    "executorHostId";    }  
   def nameField : String = {    "";    }  
 def getPk() : Long = {    executorContextId  }  
 def getInsertedRowDate() : java.util.Date = {    insertedRowDate  }  
 def getLastUpdatedDate() : java.util.Date = {    lastUpdatedDate  }  
 def getGuid() : Long = {    guid  }  
 def toAnyArray() : Array[Any] = {    Array(executorContextId,guid,insertedRowDate,lastUpdatedDate,executorHostId,isWorking,properties,properties2,properties3,entryParams)  }  
 def toStringArray() : Array[String] = {    Array(""+executorContextId,""+guid,""+insertedRowDate,""+lastUpdatedDate,""+executorHostId,""+isWorking,""+properties,""+properties2,""+properties3,""+entryParams)   }  
 def toFullString() : String = {    "executorContextId:'"+executorContextId+"'"+","+"guid:'"+guid+"'"+","+"insertedRowDate:'"+insertedRowDate+"'"+","+"lastUpdatedDate:'"+lastUpdatedDate+"'"+","+"executorHostId:'"+executorHostId+"'"+","+"isWorking:'"+isWorking+"'"+","+"properties:'"+properties+"'"+","+"properties2:'"+properties2+"'"+","+"properties3:'"+properties3+"'"+","+"entryParams:'"+entryParams+"'"   } 
   def getFieldValue(name : String) : Any = { 
    val ret = name match { 
    case "executorContextId" => executorContextId  
     case "guid" => guid  
     case "insertedRowDate" => insertedRowDate  
     case "lastUpdatedDate" => lastUpdatedDate  
     case "executorHostId" => executorHostId  
     case "isWorking" => isWorking  
     case "properties" => properties  
     case "properties2" => properties2  
     case "properties3" => properties3  
     case "entryParams" => entryParams   
    case _ => null 
    } 
    ret 
  } 
   def getFieldTypeName(name : String) : String = { 
    val ret = name match { 
    case "executorContextId" => "Long"  
     case "guid" => "Long"  
     case "insertedRowDate" => "java.util.Date"  
     case "lastUpdatedDate" => "java.util.Date"  
     case "executorHostId" => "Long"  
     case "isWorking" => "Int"  
     case "properties" => "String"  
     case "properties2" => "String"  
     case "properties3" => "String"  
     case "entryParams" => "String"   
    case _ => "Object" 
    } 
    ret 
  } 
   def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
     val stat = connection.prepareStatement("insert into executorContext(guid,executorHostId,isWorking,properties,properties2,properties3,entryParams) values (?,?,?,?,?,?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
    stat.setObject(1, guid);
    stat.setObject(2, executorHostId);
    stat.setObject(3, isWorking);
    stat.setObject(4, properties);
    stat.setObject(5, properties2);
    stat.setObject(6, properties3);
    stat.setObject(7, entryParams);
    return stat; 
   } 
   def modify(executorHostId : Long, isWorking : Int, properties : String, properties2 : String, properties3 : String, entryParams : String) : ExecutorContextDto = {
    val dtoModified = new ExecutorContextDto(this.executorContextId,this.guid,this.insertedRowDate,new java.util.Date(),executorHostId,isWorking,properties,properties2,properties3,entryParams);
    dtoModified
  }
 } 
object ExecutorContextDto { 
  val TABLE_NAME = "executorContext"; 
   val FIELD_executorContextId = "executorContextId";
   val FIELD_guid = "guid";
   val FIELD_insertedRowDate = "insertedRowDate";
   val FIELD_lastUpdatedDate = "lastUpdatedDate";
   val FIELD_executorHostId = "executorHostId";
   val FIELD_isWorking = "isWorking";
   val FIELD_properties = "properties";
   val FIELD_properties2 = "properties2";
   val FIELD_properties3 = "properties3";
   val FIELD_entryParams = "entryParams";

  def createNewExecutorContextDto(executorHostId : Long, isWorking : Int, properties : String, properties2 : String, properties3 : String, entryParams : String) : ExecutorContextDto = {  
     val dto = new ExecutorContextDto(0,0,new java.util.Date(),new java.util.Date(),executorHostId,isWorking,properties,properties2,properties3,entryParams)   
    dto 
  } 

}

 
