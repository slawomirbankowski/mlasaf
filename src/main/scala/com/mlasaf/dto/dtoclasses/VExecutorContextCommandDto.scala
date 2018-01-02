/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dto 
 
 
case class VExecutorContextCommandDto ( 
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
     , val executorContext_executorContextId : Long
     , val executorContext_guid : Long
     , val executorContext_insertedRowDate : java.util.Date
     , val executorContext_lastUpdatedDate : java.util.Date
     , val executorContext_executorHostId : Long
     , val executorContext_isWorking : Int
     , val executorContext_properties : String
     , val executorContext_properties2 : String
     , val executorContext_properties3 : String
     , val executorContext_entryParams : String
     , val executorCommand_executorCommandId : Long
     , val executorCommand_guid : Long
     , val executorCommand_insertedRowDate : java.util.Date
     , val executorCommand_lastUpdatedDate : java.util.Date
     , val executorCommand_executorCommandName : String
     , val executorCommand_executorCommandClass : String 
     ) extends BaseReadOnlyDto {  
   def tableName : String = {    "vExecutorContextCommand";    }  
   def fields : String = {    "executorContextCommandId,guid,insertedRowDate,lastUpdatedDate,executorContextId,executorCommandId,isRunning,isExecuted,commandParam1,commandParam2,commandParam3,commandParam4,commandParam5,executorContext_executorContextId,executorContext_guid,executorContext_insertedRowDate,executorContext_lastUpdatedDate,executorContext_executorHostId,executorContext_isWorking,executorContext_properties,executorContext_properties2,executorContext_properties3,executorContext_entryParams,executorCommand_executorCommandId,executorCommand_guid,executorCommand_insertedRowDate,executorCommand_lastUpdatedDate,executorCommand_executorCommandName,executorCommand_executorCommandClass";    }  
   def pkFields : String = {    "";    }  
   def fkFields : String = {    "";    }  
   def nameField : String = {    "";    }  
 def getPk() : Long = {    executorContextCommandId  }  
 def getInsertedRowDate() : java.util.Date = {    insertedRowDate  }  
 def getLastUpdatedDate() : java.util.Date = {    lastUpdatedDate  }  
 def getGuid() : Long = {    guid  }  
 def toAnyArray() : Array[Any] = {    Array(executorContextCommandId,guid,insertedRowDate,lastUpdatedDate,executorContextId,executorCommandId,isRunning,isExecuted,commandParam1,commandParam2,commandParam3,commandParam4,commandParam5,executorContext_executorContextId,executorContext_guid,executorContext_insertedRowDate,executorContext_lastUpdatedDate,executorContext_executorHostId,executorContext_isWorking,executorContext_properties,executorContext_properties2,executorContext_properties3,executorContext_entryParams,executorCommand_executorCommandId,executorCommand_guid,executorCommand_insertedRowDate,executorCommand_lastUpdatedDate,executorCommand_executorCommandName,executorCommand_executorCommandClass)  }  
 def toStringArray() : Array[String] = {    Array(""+executorContextCommandId,""+guid,""+insertedRowDate,""+lastUpdatedDate,""+executorContextId,""+executorCommandId,""+isRunning,""+isExecuted,""+commandParam1,""+commandParam2,""+commandParam3,""+commandParam4,""+commandParam5,""+executorContext_executorContextId,""+executorContext_guid,""+executorContext_insertedRowDate,""+executorContext_lastUpdatedDate,""+executorContext_executorHostId,""+executorContext_isWorking,""+executorContext_properties,""+executorContext_properties2,""+executorContext_properties3,""+executorContext_entryParams,""+executorCommand_executorCommandId,""+executorCommand_guid,""+executorCommand_insertedRowDate,""+executorCommand_lastUpdatedDate,""+executorCommand_executorCommandName,""+executorCommand_executorCommandClass)   }  
 def toJson() : String = {   "{" + "\"executorContextCommandId\":\""+executorContextCommandId+"\""+","+"\"guid\":\""+guid+"\""+","+"\"insertedRowDate\":\""+insertedRowDate+"\""+","+"\"lastUpdatedDate\":\""+lastUpdatedDate+"\""+","+"\"executorContextId\":\""+executorContextId+"\""+","+"\"executorCommandId\":\""+executorCommandId+"\""+","+"\"isRunning\":\""+isRunning+"\""+","+"\"isExecuted\":\""+isExecuted+"\""+","+"\"commandParam1\":\""+commandParam1+"\""+","+"\"commandParam2\":\""+commandParam2+"\""+","+"\"commandParam3\":\""+commandParam3+"\""+","+"\"commandParam4\":\""+commandParam4+"\""+","+"\"commandParam5\":\""+commandParam5+"\""+","+"\"executorContext_executorContextId\":\""+executorContext_executorContextId+"\""+","+"\"executorContext_guid\":\""+executorContext_guid+"\""+","+"\"executorContext_insertedRowDate\":\""+executorContext_insertedRowDate+"\""+","+"\"executorContext_lastUpdatedDate\":\""+executorContext_lastUpdatedDate+"\""+","+"\"executorContext_executorHostId\":\""+executorContext_executorHostId+"\""+","+"\"executorContext_isWorking\":\""+executorContext_isWorking+"\""+","+"\"executorContext_properties\":\""+executorContext_properties+"\""+","+"\"executorContext_properties2\":\""+executorContext_properties2+"\""+","+"\"executorContext_properties3\":\""+executorContext_properties3+"\""+","+"\"executorContext_entryParams\":\""+executorContext_entryParams+"\""+","+"\"executorCommand_executorCommandId\":\""+executorCommand_executorCommandId+"\""+","+"\"executorCommand_guid\":\""+executorCommand_guid+"\""+","+"\"executorCommand_insertedRowDate\":\""+executorCommand_insertedRowDate+"\""+","+"\"executorCommand_lastUpdatedDate\":\""+executorCommand_lastUpdatedDate+"\""+","+"\"executorCommand_executorCommandName\":\""+executorCommand_executorCommandName+"\""+","+"\"executorCommand_executorCommandClass\":\""+executorCommand_executorCommandClass+"\"" + "}"   }  
 def toFullString() : String = {    "executorContextCommandId:'"+executorContextCommandId+"'"+","+"guid:'"+guid+"'"+","+"insertedRowDate:'"+insertedRowDate+"'"+","+"lastUpdatedDate:'"+lastUpdatedDate+"'"+","+"executorContextId:'"+executorContextId+"'"+","+"executorCommandId:'"+executorCommandId+"'"+","+"isRunning:'"+isRunning+"'"+","+"isExecuted:'"+isExecuted+"'"+","+"commandParam1:'"+commandParam1+"'"+","+"commandParam2:'"+commandParam2+"'"+","+"commandParam3:'"+commandParam3+"'"+","+"commandParam4:'"+commandParam4+"'"+","+"commandParam5:'"+commandParam5+"'"+","+"executorContext_executorContextId:'"+executorContext_executorContextId+"'"+","+"executorContext_guid:'"+executorContext_guid+"'"+","+"executorContext_insertedRowDate:'"+executorContext_insertedRowDate+"'"+","+"executorContext_lastUpdatedDate:'"+executorContext_lastUpdatedDate+"'"+","+"executorContext_executorHostId:'"+executorContext_executorHostId+"'"+","+"executorContext_isWorking:'"+executorContext_isWorking+"'"+","+"executorContext_properties:'"+executorContext_properties+"'"+","+"executorContext_properties2:'"+executorContext_properties2+"'"+","+"executorContext_properties3:'"+executorContext_properties3+"'"+","+"executorContext_entryParams:'"+executorContext_entryParams+"'"+","+"executorCommand_executorCommandId:'"+executorCommand_executorCommandId+"'"+","+"executorCommand_guid:'"+executorCommand_guid+"'"+","+"executorCommand_insertedRowDate:'"+executorCommand_insertedRowDate+"'"+","+"executorCommand_lastUpdatedDate:'"+executorCommand_lastUpdatedDate+"'"+","+"executorCommand_executorCommandName:'"+executorCommand_executorCommandName+"'"+","+"executorCommand_executorCommandClass:'"+executorCommand_executorCommandClass+"'"   } 
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
     case "executorContext_executorContextId" => executorContext_executorContextId  
     case "executorContext_guid" => executorContext_guid  
     case "executorContext_insertedRowDate" => executorContext_insertedRowDate  
     case "executorContext_lastUpdatedDate" => executorContext_lastUpdatedDate  
     case "executorContext_executorHostId" => executorContext_executorHostId  
     case "executorContext_isWorking" => executorContext_isWorking  
     case "executorContext_properties" => executorContext_properties  
     case "executorContext_properties2" => executorContext_properties2  
     case "executorContext_properties3" => executorContext_properties3  
     case "executorContext_entryParams" => executorContext_entryParams  
     case "executorCommand_executorCommandId" => executorCommand_executorCommandId  
     case "executorCommand_guid" => executorCommand_guid  
     case "executorCommand_insertedRowDate" => executorCommand_insertedRowDate  
     case "executorCommand_lastUpdatedDate" => executorCommand_lastUpdatedDate  
     case "executorCommand_executorCommandName" => executorCommand_executorCommandName  
     case "executorCommand_executorCommandClass" => executorCommand_executorCommandClass   
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
     case "executorContext_executorContextId" => "Long"  
     case "executorContext_guid" => "Long"  
     case "executorContext_insertedRowDate" => "java.util.Date"  
     case "executorContext_lastUpdatedDate" => "java.util.Date"  
     case "executorContext_executorHostId" => "Long"  
     case "executorContext_isWorking" => "Int"  
     case "executorContext_properties" => "String"  
     case "executorContext_properties2" => "String"  
     case "executorContext_properties3" => "String"  
     case "executorContext_entryParams" => "String"  
     case "executorCommand_executorCommandId" => "Long"  
     case "executorCommand_guid" => "Long"  
     case "executorCommand_insertedRowDate" => "java.util.Date"  
     case "executorCommand_lastUpdatedDate" => "java.util.Date"  
     case "executorCommand_executorCommandName" => "String"  
     case "executorCommand_executorCommandClass" => "String"   
    case _ => "Object" 
    } 
    ret 
  } 
 } 
object VExecutorContextCommandDto { 
  val TABLE_NAME = "vExecutorContextCommand"; 
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
   val FIELD_executorContext_executorContextId = "executorContext_executorContextId";
   val FIELD_executorContext_guid = "executorContext_guid";
   val FIELD_executorContext_insertedRowDate = "executorContext_insertedRowDate";
   val FIELD_executorContext_lastUpdatedDate = "executorContext_lastUpdatedDate";
   val FIELD_executorContext_executorHostId = "executorContext_executorHostId";
   val FIELD_executorContext_isWorking = "executorContext_isWorking";
   val FIELD_executorContext_properties = "executorContext_properties";
   val FIELD_executorContext_properties2 = "executorContext_properties2";
   val FIELD_executorContext_properties3 = "executorContext_properties3";
   val FIELD_executorContext_entryParams = "executorContext_entryParams";
   val FIELD_executorCommand_executorCommandId = "executorCommand_executorCommandId";
   val FIELD_executorCommand_guid = "executorCommand_guid";
   val FIELD_executorCommand_insertedRowDate = "executorCommand_insertedRowDate";
   val FIELD_executorCommand_lastUpdatedDate = "executorCommand_lastUpdatedDate";
   val FIELD_executorCommand_executorCommandName = "executorCommand_executorCommandName";
   val FIELD_executorCommand_executorCommandClass = "executorCommand_executorCommandClass";

}

 