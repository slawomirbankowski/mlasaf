/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dto 
 
 
case class AlgorithmScheduleParamDto ( 
     val algorithmScheduleParamId : Long
     , val guid : Long
     , val insertedRowDate : java.util.Date
     , val lastUpdatedDate : java.util.Date
     , val algorithmScheduleId : Long
     , val algorithmParamId : Long
     , val algorithmParamValue : String 
     ) extends BaseDto {  
   def tableName : String = {    "algorithmScheduleParam";    }  
   def fields : String = {    "algorithmScheduleParamId,guid,insertedRowDate,lastUpdatedDate,algorithmScheduleId,algorithmParamId,algorithmParamValue";    }  
   def pkFields : String = {    "algorithmScheduleParamId";    }  
   def fkFields : String = {    "algorithmParamId,algorithmScheduleId";    }  
   def nameField : String = {    "";    }  
 def getPk() : Long = {    algorithmScheduleParamId  }  
 def getInsertedRowDate() : java.util.Date = {    insertedRowDate  }  
 def getLastUpdatedDate() : java.util.Date = {    lastUpdatedDate  }  
 def getGuid() : Long = {    guid  }  
 def toAnyArray() : Array[Any] = {    Array(algorithmScheduleParamId,guid,insertedRowDate,lastUpdatedDate,algorithmScheduleId,algorithmParamId,algorithmParamValue)  }  
 def toStringArray() : Array[String] = {    Array(""+algorithmScheduleParamId,""+guid,""+insertedRowDate,""+lastUpdatedDate,""+algorithmScheduleId,""+algorithmParamId,""+algorithmParamValue)   }  
 def toJson() : String = {   "{" + "\"algorithmScheduleParamId\":\""+algorithmScheduleParamId+"\""+","+"\"guid\":\""+guid+"\""+","+"\"insertedRowDate\":\""+insertedRowDate+"\""+","+"\"lastUpdatedDate\":\""+lastUpdatedDate+"\""+","+"\"algorithmScheduleId\":\""+algorithmScheduleId+"\""+","+"\"algorithmParamId\":\""+algorithmParamId+"\""+","+"\"algorithmParamValue\":\""+algorithmParamValue+"\"" + "}"   }  
 def toFullString() : String = {    "algorithmScheduleParamId:'"+algorithmScheduleParamId+"'"+","+"guid:'"+guid+"'"+","+"insertedRowDate:'"+insertedRowDate+"'"+","+"lastUpdatedDate:'"+lastUpdatedDate+"'"+","+"algorithmScheduleId:'"+algorithmScheduleId+"'"+","+"algorithmParamId:'"+algorithmParamId+"'"+","+"algorithmParamValue:'"+algorithmParamValue+"'"   } 
   def getFieldValue(name : String) : Any = { 
    val ret = name match { 
    case "algorithmScheduleParamId" => algorithmScheduleParamId  
     case "guid" => guid  
     case "insertedRowDate" => insertedRowDate  
     case "lastUpdatedDate" => lastUpdatedDate  
     case "algorithmScheduleId" => algorithmScheduleId  
     case "algorithmParamId" => algorithmParamId  
     case "algorithmParamValue" => algorithmParamValue   
    case _ => null 
    } 
    ret 
  } 
   def getFieldTypeName(name : String) : String = { 
    val ret = name match { 
    case "algorithmScheduleParamId" => "Long"  
     case "guid" => "Long"  
     case "insertedRowDate" => "java.util.Date"  
     case "lastUpdatedDate" => "java.util.Date"  
     case "algorithmScheduleId" => "Long"  
     case "algorithmParamId" => "Long"  
     case "algorithmParamValue" => "String"   
    case _ => "Object" 
    } 
    ret 
  } 
   def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
     val stat = connection.prepareStatement("insert into algorithmScheduleParam(guid,algorithmScheduleId,algorithmParamId,algorithmParamValue) values (?,?,?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
    stat.setObject(1, guid);
    stat.setObject(2, algorithmScheduleId);
    stat.setObject(3, algorithmParamId);
    stat.setObject(4, algorithmParamValue);
    return stat; 
   } 
   def modify(algorithmScheduleId : Long, algorithmParamId : Long, algorithmParamValue : String) : AlgorithmScheduleParamDto = {
    val dtoModified = new AlgorithmScheduleParamDto(this.algorithmScheduleParamId,this.guid,this.insertedRowDate,new java.util.Date(),algorithmScheduleId,algorithmParamId,algorithmParamValue);
    dtoModified
  }
 } 
object AlgorithmScheduleParamDto { 
  val TABLE_NAME = "algorithmScheduleParam"; 
   val FIELD_algorithmScheduleParamId = "algorithmScheduleParamId";
   val FIELD_guid = "guid";
   val FIELD_insertedRowDate = "insertedRowDate";
   val FIELD_lastUpdatedDate = "lastUpdatedDate";
   val FIELD_algorithmScheduleId = "algorithmScheduleId";
   val FIELD_algorithmParamId = "algorithmParamId";
   val FIELD_algorithmParamValue = "algorithmParamValue";

  def createNewAlgorithmScheduleParamDto(algorithmScheduleId : Long, algorithmParamId : Long, algorithmParamValue : String) : AlgorithmScheduleParamDto = {  
     val dto = new AlgorithmScheduleParamDto(0,0,new java.util.Date(),new java.util.Date(),algorithmScheduleId,algorithmParamId,algorithmParamValue)   
    dto 
  } 

}

 