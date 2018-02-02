/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dto 
 
 
case class ExecutorTypeParamDto ( 
     val executorTypeParamId : Long
     , val guid : Long
     , val insertedRowDate : java.util.Date
     , val lastUpdatedDate : java.util.Date
     , val executorTypeId : Long
     , val executorParamId : Long
     , val IsMandatory : Int 
     ) extends BaseDto {  
   def tableName : String = {    "executorTypeParam";    }  
   def fields : String = {    "executorTypeParamId,guid,insertedRowDate,lastUpdatedDate,executorTypeId,executorParamId,IsMandatory";    }  
   def pkFields : String = {    "executorTypeParamId";    }  
   def fkFields : String = {    "executorParamId,executorTypeId";    }  
   def nameField : String = {    "";    }  
 def getPk() : Long = {    executorTypeParamId  }  
 def getInsertedRowDate() : java.util.Date = {    insertedRowDate  }  
 def getLastUpdatedDate() : java.util.Date = {    lastUpdatedDate  }  
 def getGuid() : Long = {    guid  }  
 def toAnyArray() : Array[Any] = {    Array(executorTypeParamId,guid,insertedRowDate,lastUpdatedDate,executorTypeId,executorParamId,IsMandatory)  }  
 def toStringArray() : Array[String] = {    Array(""+executorTypeParamId,""+guid,""+insertedRowDate,""+lastUpdatedDate,""+executorTypeId,""+executorParamId,""+IsMandatory)   }  
 def toJson() : String = {   "{" + "\"executorTypeParamId\":\""+executorTypeParamId+"\""+","+"\"guid\":\""+guid+"\""+","+"\"insertedRowDate\":\""+insertedRowDate+"\""+","+"\"lastUpdatedDate\":\""+lastUpdatedDate+"\""+","+"\"executorTypeId\":\""+executorTypeId+"\""+","+"\"executorParamId\":\""+executorParamId+"\""+","+"\"IsMandatory\":\""+IsMandatory+"\"" + "}"   }  
 def toFullString() : String = {    "executorTypeParamId:'"+executorTypeParamId+"'"+","+"guid:'"+guid+"'"+","+"insertedRowDate:'"+insertedRowDate+"'"+","+"lastUpdatedDate:'"+lastUpdatedDate+"'"+","+"executorTypeId:'"+executorTypeId+"'"+","+"executorParamId:'"+executorParamId+"'"+","+"IsMandatory:'"+IsMandatory+"'"   } 
   def getFieldValue(name : String) : Any = { 
    val ret = name match { 
    case "executorTypeParamId" => executorTypeParamId  
     case "guid" => guid  
     case "insertedRowDate" => insertedRowDate  
     case "lastUpdatedDate" => lastUpdatedDate  
     case "executorTypeId" => executorTypeId  
     case "executorParamId" => executorParamId  
     case "IsMandatory" => IsMandatory   
    case _ => null 
    } 
    ret 
  } 
   def getFieldTypeName(name : String) : String = { 
    val ret = name match { 
    case "executorTypeParamId" => "Long"  
     case "guid" => "Long"  
     case "insertedRowDate" => "java.util.Date"  
     case "lastUpdatedDate" => "java.util.Date"  
     case "executorTypeId" => "Long"  
     case "executorParamId" => "Long"  
     case "IsMandatory" => "Int"   
    case _ => "Object" 
    } 
    ret 
  } 
   def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
     val stat = connection.prepareStatement("insert into executorTypeParam(guid,executorTypeId,executorParamId,IsMandatory) values (?,?,?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
    stat.setObject(1, guid);
    stat.setObject(2, executorTypeId);
    stat.setObject(3, executorParamId);
    stat.setObject(4, IsMandatory);
    return stat; 
   } 
   def modify(executorTypeId : Long, executorParamId : Long, IsMandatory : Int) : ExecutorTypeParamDto = {
    val dtoModified = new ExecutorTypeParamDto(this.executorTypeParamId,this.guid,this.insertedRowDate,new java.util.Date(),executorTypeId,executorParamId,IsMandatory);
    dtoModified
  }
 } 
object ExecutorTypeParamDto { 
  val TABLE_NAME = "executorTypeParam"; 
   val FIELD_executorTypeParamId = "executorTypeParamId";
   val FIELD_guid = "guid";
   val FIELD_insertedRowDate = "insertedRowDate";
   val FIELD_lastUpdatedDate = "lastUpdatedDate";
   val FIELD_executorTypeId = "executorTypeId";
   val FIELD_executorParamId = "executorParamId";
   val FIELD_IsMandatory = "IsMandatory";

  def createNewExecutorTypeParamDto(executorTypeId : Long, executorParamId : Long, IsMandatory : Int) : ExecutorTypeParamDto = {  
     val dto = new ExecutorTypeParamDto(0,0,new java.util.Date(),new java.util.Date(),executorTypeId,executorParamId,IsMandatory)   
    dto 
  } 

}

 