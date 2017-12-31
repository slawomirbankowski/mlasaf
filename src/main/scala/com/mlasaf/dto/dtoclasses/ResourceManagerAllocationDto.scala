/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
  AUTOGENERATED CODE
*/
package com.mlasaf.dto 
 
 
case class ResourceManagerAllocationDto ( 
     val resourceManagerAllocationId : Long
     , val guid : Long
     , val insertedRowDate : java.util.Date
     , val lastUpdatedDate : java.util.Date
     , val resourceManagerTypeId : Long
     , val resourceManagerId : Long
     , val executorHostId : Long
     , val executorInstanceId : Long
     , val resourceMeasureId : Long
     , val allocationValue : Double
     , val allocationValueMin : Double
     , val allocationValueMax : Double 
     ) extends BaseDto {  
   def tableName : String = {    "resourceManagerAllocation";    }  
   def fields : String = {    "resourceManagerAllocationId,guid,insertedRowDate,lastUpdatedDate,resourceManagerTypeId,resourceManagerId,executorHostId,executorInstanceId,resourceMeasureId,allocationValue,allocationValueMin,allocationValueMax";    }  
   def pkFields : String = {    "resourceManagerAllocationId";    }  
   def fkFields : String = {    "executorHostId,executorInstanceId,resourceManagerId,resourceMeasureId,resourceManagerTypeId";    }  
   def nameField : String = {    "";    }  
 def getPk() : Long = {    resourceManagerAllocationId  }  
 def getInsertedRowDate() : java.util.Date = {    insertedRowDate  }  
 def getLastUpdatedDate() : java.util.Date = {    lastUpdatedDate  }  
 def getGuid() : Long = {    guid  }  
 def toAnyArray() : Array[Any] = {    Array(resourceManagerAllocationId,guid,insertedRowDate,lastUpdatedDate,resourceManagerTypeId,resourceManagerId,executorHostId,executorInstanceId,resourceMeasureId,allocationValue,allocationValueMin,allocationValueMax)  }  
 def toStringArray() : Array[String] = {    Array(""+resourceManagerAllocationId,""+guid,""+insertedRowDate,""+lastUpdatedDate,""+resourceManagerTypeId,""+resourceManagerId,""+executorHostId,""+executorInstanceId,""+resourceMeasureId,""+allocationValue,""+allocationValueMin,""+allocationValueMax)   }  
 def toFullString() : String = {    "resourceManagerAllocationId:'"+resourceManagerAllocationId+"'"+","+"guid:'"+guid+"'"+","+"insertedRowDate:'"+insertedRowDate+"'"+","+"lastUpdatedDate:'"+lastUpdatedDate+"'"+","+"resourceManagerTypeId:'"+resourceManagerTypeId+"'"+","+"resourceManagerId:'"+resourceManagerId+"'"+","+"executorHostId:'"+executorHostId+"'"+","+"executorInstanceId:'"+executorInstanceId+"'"+","+"resourceMeasureId:'"+resourceMeasureId+"'"+","+"allocationValue:'"+allocationValue+"'"+","+"allocationValueMin:'"+allocationValueMin+"'"+","+"allocationValueMax:'"+allocationValueMax+"'"   } 
   def getFieldValue(name : String) : Any = { 
    val ret = name match { 
    case "resourceManagerAllocationId" => resourceManagerAllocationId  
     case "guid" => guid  
     case "insertedRowDate" => insertedRowDate  
     case "lastUpdatedDate" => lastUpdatedDate  
     case "resourceManagerTypeId" => resourceManagerTypeId  
     case "resourceManagerId" => resourceManagerId  
     case "executorHostId" => executorHostId  
     case "executorInstanceId" => executorInstanceId  
     case "resourceMeasureId" => resourceMeasureId  
     case "allocationValue" => allocationValue  
     case "allocationValueMin" => allocationValueMin  
     case "allocationValueMax" => allocationValueMax   
    case _ => null 
    } 
    ret 
  } 
   def getFieldTypeName(name : String) : String = { 
    val ret = name match { 
    case "resourceManagerAllocationId" => "Long"  
     case "guid" => "Long"  
     case "insertedRowDate" => "java.util.Date"  
     case "lastUpdatedDate" => "java.util.Date"  
     case "resourceManagerTypeId" => "Long"  
     case "resourceManagerId" => "Long"  
     case "executorHostId" => "Long"  
     case "executorInstanceId" => "Long"  
     case "resourceMeasureId" => "Long"  
     case "allocationValue" => "Double"  
     case "allocationValueMin" => "Double"  
     case "allocationValueMax" => "Double"   
    case _ => "Object" 
    } 
    ret 
  } 
   def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
     val stat = connection.prepareStatement("insert into resourceManagerAllocation(guid,resourceManagerTypeId,resourceManagerId,executorHostId,executorInstanceId,resourceMeasureId,allocationValue,allocationValueMin,allocationValueMax) values (?,?,?,?,?,?,?,?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
    stat.setObject(1, guid);
    stat.setObject(2, resourceManagerTypeId);
    stat.setObject(3, resourceManagerId);
    stat.setObject(4, executorHostId);
    stat.setObject(5, executorInstanceId);
    stat.setObject(6, resourceMeasureId);
    stat.setObject(7, allocationValue);
    stat.setObject(8, allocationValueMin);
    stat.setObject(9, allocationValueMax);
    return stat; 
   } 
   def modify(resourceManagerTypeId : Long, resourceManagerId : Long, executorHostId : Long, executorInstanceId : Long, resourceMeasureId : Long, allocationValue : Double, allocationValueMin : Double, allocationValueMax : Double) : ResourceManagerAllocationDto = {
    val dtoModified = new ResourceManagerAllocationDto(this.resourceManagerAllocationId,this.guid,this.insertedRowDate,new java.util.Date(),resourceManagerTypeId,resourceManagerId,executorHostId,executorInstanceId,resourceMeasureId,allocationValue,allocationValueMin,allocationValueMax);
    dtoModified
  }
 } 
object ResourceManagerAllocationDto { 
  val TABLE_NAME = "resourceManagerAllocation"; 
   val FIELD_resourceManagerAllocationId = "resourceManagerAllocationId";
   val FIELD_guid = "guid";
   val FIELD_insertedRowDate = "insertedRowDate";
   val FIELD_lastUpdatedDate = "lastUpdatedDate";
   val FIELD_resourceManagerTypeId = "resourceManagerTypeId";
   val FIELD_resourceManagerId = "resourceManagerId";
   val FIELD_executorHostId = "executorHostId";
   val FIELD_executorInstanceId = "executorInstanceId";
   val FIELD_resourceMeasureId = "resourceMeasureId";
   val FIELD_allocationValue = "allocationValue";
   val FIELD_allocationValueMin = "allocationValueMin";
   val FIELD_allocationValueMax = "allocationValueMax";

  def createNewResourceManagerAllocationDto(resourceManagerTypeId : Long, resourceManagerId : Long, executorHostId : Long, executorInstanceId : Long, resourceMeasureId : Long, allocationValue : Double, allocationValueMin : Double, allocationValueMax : Double) : ResourceManagerAllocationDto = {  
     val dto = new ResourceManagerAllocationDto(0,0,new java.util.Date(),new java.util.Date(),resourceManagerTypeId,resourceManagerId,executorHostId,executorInstanceId,resourceMeasureId,allocationValue,allocationValueMin,allocationValueMax)   
    dto 
  } 

}

 
