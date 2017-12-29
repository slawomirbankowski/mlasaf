/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dto 
 
 
case class AlgorithmOutputDto ( 
     val algorithmOutputId : Long
     , val guid : Long
     , val insertedRowDate : java.util.Date
     , val lastUpdatedDate : java.util.Date
     , val algorithmRunId : Long
     , val algorithmOutputTypeId : Long
     , val executorStorageViewId : Long
     , val outputPath : String 
     ) extends BaseDto {  
   def tableName : String = { 
   "algorithmOutput"; 
   }  
   def fields : String = { 
   "algorithmOutputId,guid,insertedRowDate,lastUpdatedDate,algorithmRunId,algorithmOutputTypeId,executorStorageViewId,outputPath"; 
   }  
   def pkFields : String = { 
   "algorithmOutputId"; 
   }  
   def fkFields : String = { 
   "algorithmOutputTypeId,executorStorageViewId"; 
   }  
   def nameField : String = { 
   ""; 
   }  
 def getPk() : Long = {
    algorithmOutputId
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
    Array(algorithmOutputId,guid,insertedRowDate,lastUpdatedDate,algorithmRunId,algorithmOutputTypeId,executorStorageViewId,outputPath)
  }  
 def toStringArray() : Array[String] = {
    Array(""+algorithmOutputId,""+guid,""+insertedRowDate,""+lastUpdatedDate,""+algorithmRunId,""+algorithmOutputTypeId,""+executorStorageViewId,""+outputPath) 
  } 
   def getFieldValue(name : String) : Any = { 
    val ret = name match { 
    case "algorithmOutputId" => algorithmOutputId  
     case "guid" => guid  
     case "insertedRowDate" => insertedRowDate  
     case "lastUpdatedDate" => lastUpdatedDate  
     case "algorithmRunId" => algorithmRunId  
     case "algorithmOutputTypeId" => algorithmOutputTypeId  
     case "executorStorageViewId" => executorStorageViewId  
     case "outputPath" => outputPath   
    case _ => null 
    } 
    ret 
  } 
   def getFieldTypeName(name : String) : String = { 
    val ret = name match { 
    case "algorithmOutputId" => "Long"  
     case "guid" => "Long"  
     case "insertedRowDate" => "java.util.Date"  
     case "lastUpdatedDate" => "java.util.Date"  
     case "algorithmRunId" => "Long"  
     case "algorithmOutputTypeId" => "Long"  
     case "executorStorageViewId" => "Long"  
     case "outputPath" => "String"   
    case _ => "Object" 
    } 
    ret 
  } 
   def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
     val stat = connection.prepareStatement("insert into algorithmOutput(guid,algorithmRunId,algorithmOutputTypeId,executorStorageViewId,outputPath) values (?,?,?,?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
    stat.setObject(1, guid);
    stat.setObject(2, algorithmRunId);
    stat.setObject(3, algorithmOutputTypeId);
    stat.setObject(4, executorStorageViewId);
    stat.setObject(5, outputPath);
    return stat; 
   } 
   def modify(algorithmRunId : Long, algorithmOutputTypeId : Long, executorStorageViewId : Long, outputPath : String) : AlgorithmOutputDto = {
    val dtoModified = new AlgorithmOutputDto(this.algorithmOutputId,this.guid,this.insertedRowDate,new java.util.Date(),algorithmRunId,algorithmOutputTypeId,executorStorageViewId,outputPath);
    dtoModified
  }
 } 
object AlgorithmOutputDto { 
  val TABLE_NAME = "algorithmOutput"; 
   val FIELD_algorithmOutputId = "algorithmOutputId";
   val FIELD_guid = "guid";
   val FIELD_insertedRowDate = "insertedRowDate";
   val FIELD_lastUpdatedDate = "lastUpdatedDate";
   val FIELD_algorithmRunId = "algorithmRunId";
   val FIELD_algorithmOutputTypeId = "algorithmOutputTypeId";
   val FIELD_executorStorageViewId = "executorStorageViewId";
   val FIELD_outputPath = "outputPath";

  def createNewAlgorithmOutputDto(algorithmRunId : Long, algorithmOutputTypeId : Long, executorStorageViewId : Long, outputPath : String) : AlgorithmOutputDto = {  
     val dto = new AlgorithmOutputDto(0,0,new java.util.Date(),new java.util.Date(),algorithmRunId,algorithmOutputTypeId,executorStorageViewId,outputPath)   
    dto 
  } 

}

 
