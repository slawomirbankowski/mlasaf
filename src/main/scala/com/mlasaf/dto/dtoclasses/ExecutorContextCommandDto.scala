/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dto 
 
 
case class ExecutorContextCommandDto ( 
     val executorContextCommandId : Long
     , val guid : Long
     , val insertedRowDate : java.util.Date
     , val lastUpdatedDate : java.util.Date
     , val executorContextId : Long
     , val executorCommandId : Long
     , val isRunning : Int
     , val isExecuted : Int
     , val commandParam1 : String
     , val commandParam2 : String
     , val commandParam3 : String
     , val commandParam4 : String
     , val commandParam5 : String 
     ) extends BaseDto {  
   def tableName : String = {    "executorContextCommand";    }  
   def fields : String = {    "executorContextCommandId,guid,insertedRowDate,lastUpdatedDate,executorContextId,executorCommandId,isRunning,isExecuted,commandParam1,commandParam2,commandParam3,commandParam4,commandParam5";    }  
   def pkFields : String = {    "executorContextCommandId";    }  
   def fkFields : String = {    "executorContextId,executorCommandId";    }  
   def nameField : String = {    "";    }  
 def getPk() : Long = {    executorContextCommandId  }  
 def getInsertedRowDate() : java.util.Date = {    insertedRowDate  }  
 def getLastUpdatedDate() : java.util.Date = {    lastUpdatedDate  }  
 def getGuid() : Long = {    guid  }  
 def toAnyArray() : Array[Any] = {    Array(executorContextCommandId,guid,insertedRowDate,lastUpdatedDate,executorContextId,executorCommandId,isRunning,isExecuted,commandParam1,commandParam2,commandParam3,commandParam4,commandParam5)  }  
 def toStringArray() : Array[String] = {    Array(""+executorContextCommandId,""+guid,""+insertedRowDate,""+lastUpdatedDate,""+executorContextId,""+executorCommandId,""+isRunning,""+isExecuted,""+commandParam1,""+commandParam2,""+commandParam3,""+commandParam4,""+commandParam5)   }  
 def toFullString() : String = {    "executorContextCommandId:'"+executorContextCommandId+"'"+","+"guid:'"+guid+"'"+","+"insertedRowDate:'"+insertedRowDate+"'"+","+"lastUpdatedDate:'"+lastUpdatedDate+"'"+","+"executorContextId:'"+executorContextId+"'"+","+"executorCommandId:'"+executorCommandId+"'"+","+"isRunning:'"+isRunning+"'"+","+"isExecuted:'"+isExecuted+"'"+","+"commandParam1:'"+commandParam1+"'"+","+"commandParam2:'"+commandParam2+"'"+","+"commandParam3:'"+commandParam3+"'"+","+"commandParam4:'"+commandParam4+"'"+","+"commandParam5:'"+commandParam5+"'"   } 
   def getFieldValue(name : String) : Any = { 
    val ret = name match { 
    case "executorContextCommandId" => executorContextCommandId  
     case "guid" => guid  
     case "insertedRowDate" => insertedRowDate  
     case "lastUpdatedDate" => lastUpdatedDate  
     case "executorContextId" => executorContextId  
     case "executorCommandId" => executorCommandId  
     case "isRunning" => isRunning  
     case "isExecuted" => isExecuted  
     case "commandParam1" => commandParam1  
     case "commandParam2" => commandParam2  
     case "commandParam3" => commandParam3  
     case "commandParam4" => commandParam4  
     case "commandParam5" => commandParam5   
    case _ => null 
    } 
    ret 
  } 
   def getFieldTypeName(name : String) : String = { 
    val ret = name match { 
    case "executorContextCommandId" => "Long"  
     case "guid" => "Long"  
     case "insertedRowDate" => "java.util.Date"  
     case "lastUpdatedDate" => "java.util.Date"  
     case "executorContextId" => "Long"  
     case "executorCommandId" => "Long"  
     case "isRunning" => "Int"  
     case "isExecuted" => "Int"  
     case "commandParam1" => "String"  
     case "commandParam2" => "String"  
     case "commandParam3" => "String"  
     case "commandParam4" => "String"  
     case "commandParam5" => "String"   
    case _ => "Object" 
    } 
    ret 
  } 
   def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
     val stat = connection.prepareStatement("insert into executorContextCommand(guid,executorContextId,executorCommandId,isRunning,isExecuted,commandParam1,commandParam2,commandParam3,commandParam4,commandParam5) values (?,?,?,?,?,?,?,?,?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
    stat.setObject(1, guid);
    stat.setObject(2, executorContextId);
    stat.setObject(3, executorCommandId);
    stat.setObject(4, isRunning);
    stat.setObject(5, isExecuted);
    stat.setObject(6, commandParam1);
    stat.setObject(7, commandParam2);
    stat.setObject(8, commandParam3);
    stat.setObject(9, commandParam4);
    stat.setObject(10, commandParam5);
    return stat; 
   } 
   def modify(executorContextId : Long, executorCommandId : Long, isRunning : Int, isExecuted : Int, commandParam1 : String, commandParam2 : String, commandParam3 : String, commandParam4 : String, commandParam5 : String) : ExecutorContextCommandDto = {
    val dtoModified = new ExecutorContextCommandDto(this.executorContextCommandId,this.guid,this.insertedRowDate,new java.util.Date(),executorContextId,executorCommandId,isRunning,isExecuted,commandParam1,commandParam2,commandParam3,commandParam4,commandParam5);
    dtoModified
  }
 } 
object ExecutorContextCommandDto { 
  val TABLE_NAME = "executorContextCommand"; 
   val FIELD_executorContextCommandId = "executorContextCommandId";
   val FIELD_guid = "guid";
   val FIELD_insertedRowDate = "insertedRowDate";
   val FIELD_lastUpdatedDate = "lastUpdatedDate";
   val FIELD_executorContextId = "executorContextId";
   val FIELD_executorCommandId = "executorCommandId";
   val FIELD_isRunning = "isRunning";
   val FIELD_isExecuted = "isExecuted";
   val FIELD_commandParam1 = "commandParam1";
   val FIELD_commandParam2 = "commandParam2";
   val FIELD_commandParam3 = "commandParam3";
   val FIELD_commandParam4 = "commandParam4";
   val FIELD_commandParam5 = "commandParam5";

  def createNewExecutorContextCommandDto(executorContextId : Long, executorCommandId : Long, isRunning : Int, isExecuted : Int, commandParam1 : String, commandParam2 : String, commandParam3 : String, commandParam4 : String, commandParam5 : String) : ExecutorContextCommandDto = {  
     val dto = new ExecutorContextCommandDto(0,0,new java.util.Date(),new java.util.Date(),executorContextId,executorCommandId,isRunning,isExecuted,commandParam1,commandParam2,commandParam3,commandParam4,commandParam5)   
    dto 
  } 

}

 
