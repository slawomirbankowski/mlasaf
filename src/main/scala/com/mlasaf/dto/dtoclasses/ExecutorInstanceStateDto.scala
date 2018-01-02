/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dto 
 
 
case class ExecutorInstanceStateDto ( 
     val executorInstanceStateId : Long
     , val guid : Long
     , val insertedRowDate : java.util.Date
     , val lastUpdatedDate : java.util.Date
     , val executorInstanceId : Long
     , val stateName : String 
     ) extends BaseDto {  
   def tableName : String = {    "executorInstanceState";    }  
   def fields : String = {    "executorInstanceStateId,guid,insertedRowDate,lastUpdatedDate,executorInstanceId,stateName";    }  
   def pkFields : String = {    "executorInstanceStateId";    }  
   def fkFields : String = {    "executorInstanceId";    }  
   def nameField : String = {    "";    }  
 def getPk() : Long = {    executorInstanceStateId  }  
 def getInsertedRowDate() : java.util.Date = {    insertedRowDate  }  
 def getLastUpdatedDate() : java.util.Date = {    lastUpdatedDate  }  
 def getGuid() : Long = {    guid  }  
 def toAnyArray() : Array[Any] = {    Array(executorInstanceStateId,guid,insertedRowDate,lastUpdatedDate,executorInstanceId,stateName)  }  
 def toStringArray() : Array[String] = {    Array(""+executorInstanceStateId,""+guid,""+insertedRowDate,""+lastUpdatedDate,""+executorInstanceId,""+stateName)   }  
 def toJson() : String = {   "{" + "\"executorInstanceStateId\":\""+executorInstanceStateId+"\""+","+"\"guid\":\""+guid+"\""+","+"\"insertedRowDate\":\""+insertedRowDate+"\""+","+"\"lastUpdatedDate\":\""+lastUpdatedDate+"\""+","+"\"executorInstanceId\":\""+executorInstanceId+"\""+","+"\"stateName\":\""+stateName+"\"" + "}"   }  
 def toFullString() : String = {    "executorInstanceStateId:'"+executorInstanceStateId+"'"+","+"guid:'"+guid+"'"+","+"insertedRowDate:'"+insertedRowDate+"'"+","+"lastUpdatedDate:'"+lastUpdatedDate+"'"+","+"executorInstanceId:'"+executorInstanceId+"'"+","+"stateName:'"+stateName+"'"   } 
   def getFieldValue(name : String) : Any = { 
    val ret = name match { 
    case "executorInstanceStateId" => executorInstanceStateId  
     case "guid" => guid  
     case "insertedRowDate" => insertedRowDate  
     case "lastUpdatedDate" => lastUpdatedDate  
     case "executorInstanceId" => executorInstanceId  
     case "stateName" => stateName   
    case _ => null 
    } 
    ret 
  } 
   def getFieldTypeName(name : String) : String = { 
    val ret = name match { 
    case "executorInstanceStateId" => "Long"  
     case "guid" => "Long"  
     case "insertedRowDate" => "java.util.Date"  
     case "lastUpdatedDate" => "java.util.Date"  
     case "executorInstanceId" => "Long"  
     case "stateName" => "String"   
    case _ => "Object" 
    } 
    ret 
  } 
   def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
     val stat = connection.prepareStatement("insert into executorInstanceState(guid,executorInstanceId,stateName) values (?,?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
    stat.setObject(1, guid);
    stat.setObject(2, executorInstanceId);
    stat.setObject(3, stateName);
    return stat; 
   } 
   def modify(executorInstanceId : Long, stateName : String) : ExecutorInstanceStateDto = {
    val dtoModified = new ExecutorInstanceStateDto(this.executorInstanceStateId,this.guid,this.insertedRowDate,new java.util.Date(),executorInstanceId,stateName);
    dtoModified
  }
 } 
object ExecutorInstanceStateDto { 
  val TABLE_NAME = "executorInstanceState"; 
   val FIELD_executorInstanceStateId = "executorInstanceStateId";
   val FIELD_guid = "guid";
   val FIELD_insertedRowDate = "insertedRowDate";
   val FIELD_lastUpdatedDate = "lastUpdatedDate";
   val FIELD_executorInstanceId = "executorInstanceId";
   val FIELD_stateName = "stateName";

  def createNewExecutorInstanceStateDto(executorInstanceId : Long, stateName : String) : ExecutorInstanceStateDto = {  
     val dto = new ExecutorInstanceStateDto(0,0,new java.util.Date(),new java.util.Date(),executorInstanceId,stateName)   
    dto 
  } 

}

 