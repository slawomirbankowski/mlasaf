package com.mlasaf.dto


case class AlgorithmColumnTypeDto (
                                    val algorithmColumnTypeId : Long
                                    , val algorithmColumnTypeName : String
                                    , val algorithmColumnTypeDescription : String
                                    , val insertedRowDate : java.util.Date
                                    , val lastUpdatedDate : java.util.Date
                                    , val guid : Long
                                  ) extends BaseDto {
  def tableName : String = {
    "algorithmColumnType";
  }
  def fields : String = {
    "algorithmColumnTypeId,algorithmColumnTypeName,algorithmColumnTypeDescription,insertedRowDate,lastUpdatedDate,guid";
  }
  def pkFields : String = {
    "algorithmColumnTypeId";
  }
  def fkFields : String = {
    "";
  }
  def nameField : String = {
    "algorithmColumnTypeName";
  }
  def getPk() : Long = {
    algorithmColumnTypeId
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
    Array(algorithmColumnTypeId,algorithmColumnTypeName,algorithmColumnTypeDescription,insertedRowDate,lastUpdatedDate,guid)
  }
  def toStringArray() : Array[String] = {
    Array(""+algorithmColumnTypeId,""+algorithmColumnTypeName,""+algorithmColumnTypeDescription,""+insertedRowDate,""+lastUpdatedDate,""+guid)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "algorithmColumnTypeId" => algorithmColumnTypeId
      case "algorithmColumnTypeName" => algorithmColumnTypeName
      case "algorithmColumnTypeDescription" => algorithmColumnTypeDescription
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case "guid" => guid
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "algorithmColumnTypeId" => "Long"
      case "algorithmColumnTypeName" => "String"
      case "algorithmColumnTypeDescription" => "String"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case "guid" => "Long"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into algorithmColumnType(algorithmColumnTypeName,algorithmColumnTypeDescription,guid) values (?,?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
    stat.setObject(1, algorithmColumnTypeName);
    stat.setObject(2, algorithmColumnTypeDescription);
    stat.setObject(3, guid);
    return stat;
  }
  def modify(algorithmColumnTypeName : String, algorithmColumnTypeDescription : String) : AlgorithmColumnTypeDto = {
    val dtoModified = new AlgorithmColumnTypeDto(this.algorithmColumnTypeId,algorithmColumnTypeName,algorithmColumnTypeDescription,this.insertedRowDate,new java.util.Date(),this.guid);
    dtoModified
  }
}
object AlgorithmColumnTypeDto {
  val TABLE_NAME = "algorithmColumnType";
  val FIELD_algorithmColumnTypeId = "algorithmColumnTypeId";
  val FIELD_algorithmColumnTypeName = "algorithmColumnTypeName";
  val FIELD_algorithmColumnTypeDescription = "algorithmColumnTypeDescription";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";
  val FIELD_guid = "guid";

  def createNewAlgorithmColumnTypeDto(algorithmColumnTypeName : String, algorithmColumnTypeDescription : String) : AlgorithmColumnTypeDto = {
    val dto = new AlgorithmColumnTypeDto(0,algorithmColumnTypeName,algorithmColumnTypeDescription,new java.util.Date(),new java.util.Date(),0)
    dto
  }

}


case class AlgorithmImplementationDto (
                                        val algorithmImplementationId : Long
                                        , val guid : Long
                                        , val insertedRowDate : java.util.Date
                                        , val lastUpdatedDate : java.util.Date
                                        , val algorithmTypeVersionId : Long
                                        , val executorTypeId : Long
                                        , val algorithmImplementationName : String
                                        , val algorithmImplementationClass : String
                                      ) extends BaseDto {
  def tableName : String = {
    "algorithmImplementation";
  }
  def fields : String = {
    "algorithmImplementationId,guid,insertedRowDate,lastUpdatedDate,algorithmTypeVersionId,executorTypeId,algorithmImplementationName,algorithmImplementationClass";
  }
  def pkFields : String = {
    "algorithmImplementationId";
  }
  def fkFields : String = {
    "algorithmTypeVersionId,executorTypeId";
  }
  def nameField : String = {
    "algorithmImplementationName";
  }
  def getPk() : Long = {
    algorithmImplementationId
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
    Array(algorithmImplementationId,guid,insertedRowDate,lastUpdatedDate,algorithmTypeVersionId,executorTypeId,algorithmImplementationName,algorithmImplementationClass)
  }
  def toStringArray() : Array[String] = {
    Array(""+algorithmImplementationId,""+guid,""+insertedRowDate,""+lastUpdatedDate,""+algorithmTypeVersionId,""+executorTypeId,""+algorithmImplementationName,""+algorithmImplementationClass)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "algorithmImplementationId" => algorithmImplementationId
      case "guid" => guid
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case "algorithmTypeVersionId" => algorithmTypeVersionId
      case "executorTypeId" => executorTypeId
      case "algorithmImplementationName" => algorithmImplementationName
      case "algorithmImplementationClass" => algorithmImplementationClass
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "algorithmImplementationId" => "Long"
      case "guid" => "Long"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case "algorithmTypeVersionId" => "Long"
      case "executorTypeId" => "Long"
      case "algorithmImplementationName" => "String"
      case "algorithmImplementationClass" => "String"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into algorithmImplementation(guid,algorithmTypeVersionId,executorTypeId,algorithmImplementationName,algorithmImplementationClass) values (?,?,?,?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
    stat.setObject(1, guid);
    stat.setObject(2, algorithmTypeVersionId);
    stat.setObject(3, executorTypeId);
    stat.setObject(4, algorithmImplementationName);
    stat.setObject(5, algorithmImplementationClass);
    return stat;
  }
  def modify(algorithmTypeVersionId : Long, executorTypeId : Long, algorithmImplementationName : String, algorithmImplementationClass : String) : AlgorithmImplementationDto = {
    val dtoModified = new AlgorithmImplementationDto(this.algorithmImplementationId,this.guid,this.insertedRowDate,new java.util.Date(),algorithmTypeVersionId,executorTypeId,algorithmImplementationName,algorithmImplementationClass);
    dtoModified
  }
}
object AlgorithmImplementationDto {
  val TABLE_NAME = "algorithmImplementation";
  val FIELD_algorithmImplementationId = "algorithmImplementationId";
  val FIELD_guid = "guid";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";
  val FIELD_algorithmTypeVersionId = "algorithmTypeVersionId";
  val FIELD_executorTypeId = "executorTypeId";
  val FIELD_algorithmImplementationName = "algorithmImplementationName";
  val FIELD_algorithmImplementationClass = "algorithmImplementationClass";

  def createNewAlgorithmImplementationDto(algorithmTypeVersionId : Long, executorTypeId : Long, algorithmImplementationName : String, algorithmImplementationClass : String) : AlgorithmImplementationDto = {
    val dto = new AlgorithmImplementationDto(0,0,new java.util.Date(),new java.util.Date(),algorithmTypeVersionId,executorTypeId,algorithmImplementationName,algorithmImplementationClass)
    dto
  }

}


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
    "";
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


case class AlgorithmOutputTypeDto (
                                    val algorithmOutputTypeId : Long
                                    , val guid : Long
                                    , val algorithmOutputTypeName : String
                                    , val insertedRowDate : java.util.Date
                                    , val lastUpdatedDate : java.util.Date
                                  ) extends BaseDto {
  def tableName : String = {
    "algorithmOutputType";
  }
  def fields : String = {
    "algorithmOutputTypeId,guid,algorithmOutputTypeName,insertedRowDate,lastUpdatedDate";
  }
  def pkFields : String = {
    "algorithmOutputTypeId";
  }
  def fkFields : String = {
    "";
  }
  def nameField : String = {
    "algorithmOutputTypeName";
  }
  def getPk() : Long = {
    algorithmOutputTypeId
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
    Array(algorithmOutputTypeId,guid,algorithmOutputTypeName,insertedRowDate,lastUpdatedDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+algorithmOutputTypeId,""+guid,""+algorithmOutputTypeName,""+insertedRowDate,""+lastUpdatedDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "algorithmOutputTypeId" => algorithmOutputTypeId
      case "guid" => guid
      case "algorithmOutputTypeName" => algorithmOutputTypeName
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "algorithmOutputTypeId" => "Long"
      case "guid" => "Long"
      case "algorithmOutputTypeName" => "String"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into algorithmOutputType(guid,algorithmOutputTypeName) values (?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
    stat.setObject(1, guid);
    stat.setObject(2, algorithmOutputTypeName);
    return stat;
  }
  def modify(algorithmOutputTypeName : String) : AlgorithmOutputTypeDto = {
    val dtoModified = new AlgorithmOutputTypeDto(this.algorithmOutputTypeId,this.guid,algorithmOutputTypeName,this.insertedRowDate,new java.util.Date());
    dtoModified
  }
}
object AlgorithmOutputTypeDto {
  val TABLE_NAME = "algorithmOutputType";
  val FIELD_algorithmOutputTypeId = "algorithmOutputTypeId";
  val FIELD_guid = "guid";
  val FIELD_algorithmOutputTypeName = "algorithmOutputTypeName";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";

  def createNewAlgorithmOutputTypeDto(algorithmOutputTypeName : String) : AlgorithmOutputTypeDto = {
    val dto = new AlgorithmOutputTypeDto(0,0,algorithmOutputTypeName,new java.util.Date(),new java.util.Date())
    dto
  }

}


case class AlgorithmParamDto (
                               val algorithmParamId : Long
                               , val guid : Long
                               , val insertedRowDate : java.util.Date
                               , val lastUpdatedDate : java.util.Date
                               , val algorithmParamName : String
                               , val algorithmParamDescription : String
                               , val algorithmParamType : String
                             ) extends BaseDto {
  def tableName : String = {
    "algorithmParam";
  }
  def fields : String = {
    "algorithmParamId,guid,insertedRowDate,lastUpdatedDate,algorithmParamName,algorithmParamDescription,algorithmParamType";
  }
  def pkFields : String = {
    "algorithmParamId";
  }
  def fkFields : String = {
    "";
  }
  def nameField : String = {
    "algorithmParamName";
  }
  def getPk() : Long = {
    algorithmParamId
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
    Array(algorithmParamId,guid,insertedRowDate,lastUpdatedDate,algorithmParamName,algorithmParamDescription,algorithmParamType)
  }
  def toStringArray() : Array[String] = {
    Array(""+algorithmParamId,""+guid,""+insertedRowDate,""+lastUpdatedDate,""+algorithmParamName,""+algorithmParamDescription,""+algorithmParamType)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "algorithmParamId" => algorithmParamId
      case "guid" => guid
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case "algorithmParamName" => algorithmParamName
      case "algorithmParamDescription" => algorithmParamDescription
      case "algorithmParamType" => algorithmParamType
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "algorithmParamId" => "Long"
      case "guid" => "Long"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case "algorithmParamName" => "String"
      case "algorithmParamDescription" => "String"
      case "algorithmParamType" => "String"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into algorithmParam(guid,algorithmParamName,algorithmParamDescription,algorithmParamType) values (?,?,?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
    stat.setObject(1, guid);
    stat.setObject(2, algorithmParamName);
    stat.setObject(3, algorithmParamDescription);
    stat.setObject(4, algorithmParamType);
    return stat;
  }
  def modify(algorithmParamName : String, algorithmParamDescription : String, algorithmParamType : String) : AlgorithmParamDto = {
    val dtoModified = new AlgorithmParamDto(this.algorithmParamId,this.guid,this.insertedRowDate,new java.util.Date(),algorithmParamName,algorithmParamDescription,algorithmParamType);
    dtoModified
  }
}
object AlgorithmParamDto {
  val TABLE_NAME = "algorithmParam";
  val FIELD_algorithmParamId = "algorithmParamId";
  val FIELD_guid = "guid";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";
  val FIELD_algorithmParamName = "algorithmParamName";
  val FIELD_algorithmParamDescription = "algorithmParamDescription";
  val FIELD_algorithmParamType = "algorithmParamType";

  def createNewAlgorithmParamDto(algorithmParamName : String, algorithmParamDescription : String, algorithmParamType : String) : AlgorithmParamDto = {
    val dto = new AlgorithmParamDto(0,0,new java.util.Date(),new java.util.Date(),algorithmParamName,algorithmParamDescription,algorithmParamType)
    dto
  }

}


case class AlgorithmParamTypeDto (
                                   val algorithmParamTypeId : Long
                                   , val algorithmParamId : Long
                                   , val algorithmTypeId : Long
                                   , val algorithmTypeVersionId : Long
                                   , val insertedRowDate : java.util.Date
                                   , val lastUpdatedDate : java.util.Date
                                   , val guid : Long
                                 ) extends BaseDto {
  def tableName : String = {
    "algorithmParamType";
  }
  def fields : String = {
    "algorithmParamTypeId,algorithmParamId,algorithmTypeId,algorithmTypeVersionId,insertedRowDate,lastUpdatedDate,guid";
  }
  def pkFields : String = {
    "algorithmParamTypeId";
  }
  def fkFields : String = {
    "algorithmParamId,algorithmTypeId,algorithmTypeVersionId";
  }
  def nameField : String = {
    "";
  }
  def getPk() : Long = {
    algorithmParamTypeId
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
    Array(algorithmParamTypeId,algorithmParamId,algorithmTypeId,algorithmTypeVersionId,insertedRowDate,lastUpdatedDate,guid)
  }
  def toStringArray() : Array[String] = {
    Array(""+algorithmParamTypeId,""+algorithmParamId,""+algorithmTypeId,""+algorithmTypeVersionId,""+insertedRowDate,""+lastUpdatedDate,""+guid)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "algorithmParamTypeId" => algorithmParamTypeId
      case "algorithmParamId" => algorithmParamId
      case "algorithmTypeId" => algorithmTypeId
      case "algorithmTypeVersionId" => algorithmTypeVersionId
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case "guid" => guid
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "algorithmParamTypeId" => "Long"
      case "algorithmParamId" => "Long"
      case "algorithmTypeId" => "Long"
      case "algorithmTypeVersionId" => "Long"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case "guid" => "Long"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into algorithmParamType(algorithmParamId,algorithmTypeId,algorithmTypeVersionId,guid) values (?,?,?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
    stat.setObject(1, algorithmParamId);
    stat.setObject(2, algorithmTypeId);
    stat.setObject(3, algorithmTypeVersionId);
    stat.setObject(4, guid);
    return stat;
  }
  def modify(algorithmParamId : Long, algorithmTypeId : Long, algorithmTypeVersionId : Long) : AlgorithmParamTypeDto = {
    val dtoModified = new AlgorithmParamTypeDto(this.algorithmParamTypeId,algorithmParamId,algorithmTypeId,algorithmTypeVersionId,this.insertedRowDate,new java.util.Date(),this.guid);
    dtoModified
  }
}
object AlgorithmParamTypeDto {
  val TABLE_NAME = "algorithmParamType";
  val FIELD_algorithmParamTypeId = "algorithmParamTypeId";
  val FIELD_algorithmParamId = "algorithmParamId";
  val FIELD_algorithmTypeId = "algorithmTypeId";
  val FIELD_algorithmTypeVersionId = "algorithmTypeVersionId";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";
  val FIELD_guid = "guid";

  def createNewAlgorithmParamTypeDto(algorithmParamId : Long, algorithmTypeId : Long, algorithmTypeVersionId : Long) : AlgorithmParamTypeDto = {
    val dto = new AlgorithmParamTypeDto(0,algorithmParamId,algorithmTypeId,algorithmTypeVersionId,new java.util.Date(),new java.util.Date(),0)
    dto
  }

}


case class AlgorithmRunDto (
                             val algorithmRunId : Long
                             , val guid : Long
                             , val algorithmScheduleId : Long
                             , val executorInstanceId : Long
                             , val executorStorageId : Long
                             , val algorithmRunName : String
                             , val insertedRowDate : java.util.Date
                             , val lastUpdatedDate : java.util.Date
                             , val runDate : java.util.Date
                             , val isRunning : Int
                             , val isFinished : Int
                           ) extends BaseDto {
  def tableName : String = {
    "algorithmRun";
  }
  def fields : String = {
    "algorithmRunId,guid,algorithmScheduleId,executorInstanceId,executorStorageId,algorithmRunName,insertedRowDate,lastUpdatedDate,runDate,isRunning,isFinished";
  }
  def pkFields : String = {
    "algorithmRunId";
  }
  def fkFields : String = {
    "algorithmScheduleId,executorInstanceId,executorStorageId";
  }
  def nameField : String = {
    "algorithmRunName";
  }
  def getPk() : Long = {
    algorithmRunId
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
    Array(algorithmRunId,guid,algorithmScheduleId,executorInstanceId,executorStorageId,algorithmRunName,insertedRowDate,lastUpdatedDate,runDate,isRunning,isFinished)
  }
  def toStringArray() : Array[String] = {
    Array(""+algorithmRunId,""+guid,""+algorithmScheduleId,""+executorInstanceId,""+executorStorageId,""+algorithmRunName,""+insertedRowDate,""+lastUpdatedDate,""+runDate,""+isRunning,""+isFinished)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "algorithmRunId" => algorithmRunId
      case "guid" => guid
      case "algorithmScheduleId" => algorithmScheduleId
      case "executorInstanceId" => executorInstanceId
      case "executorStorageId" => executorStorageId
      case "algorithmRunName" => algorithmRunName
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case "runDate" => runDate
      case "isRunning" => isRunning
      case "isFinished" => isFinished
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "algorithmRunId" => "Long"
      case "guid" => "Long"
      case "algorithmScheduleId" => "Long"
      case "executorInstanceId" => "Long"
      case "executorStorageId" => "Long"
      case "algorithmRunName" => "String"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case "runDate" => "java.util.Date"
      case "isRunning" => "Int"
      case "isFinished" => "Int"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into algorithmRun(guid,algorithmScheduleId,executorInstanceId,executorStorageId,algorithmRunName,runDate,isRunning,isFinished) values (?,?,?,?,?,?,?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
    stat.setObject(1, guid);
    stat.setObject(2, algorithmScheduleId);
    stat.setObject(3, executorInstanceId);
    stat.setObject(4, executorStorageId);
    stat.setObject(5, algorithmRunName);
    stat.setObject(6, runDate);
    stat.setObject(7, isRunning);
    stat.setObject(8, isFinished);
    return stat;
  }
  def modify(algorithmScheduleId : Long, executorInstanceId : Long, executorStorageId : Long, algorithmRunName : String, runDate : java.util.Date, isRunning : Int, isFinished : Int) : AlgorithmRunDto = {
    val dtoModified = new AlgorithmRunDto(this.algorithmRunId,this.guid,algorithmScheduleId,executorInstanceId,executorStorageId,algorithmRunName,this.insertedRowDate,new java.util.Date(),runDate,isRunning,isFinished);
    dtoModified
  }
}
object AlgorithmRunDto {
  val TABLE_NAME = "algorithmRun";
  val FIELD_algorithmRunId = "algorithmRunId";
  val FIELD_guid = "guid";
  val FIELD_algorithmScheduleId = "algorithmScheduleId";
  val FIELD_executorInstanceId = "executorInstanceId";
  val FIELD_executorStorageId = "executorStorageId";
  val FIELD_algorithmRunName = "algorithmRunName";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";
  val FIELD_runDate = "runDate";
  val FIELD_isRunning = "isRunning";
  val FIELD_isFinished = "isFinished";

  def createNewAlgorithmRunDto(algorithmScheduleId : Long, executorInstanceId : Long, executorStorageId : Long, algorithmRunName : String, runDate : java.util.Date, isRunning : Int, isFinished : Int) : AlgorithmRunDto = {
    val dto = new AlgorithmRunDto(0,0,algorithmScheduleId,executorInstanceId,executorStorageId,algorithmRunName,new java.util.Date(),new java.util.Date(),runDate,isRunning,isFinished)
    dto
  }

}


case class AlgorithmRunTypeDto (
                                 val algorithmRunTypeId : Long
                                 , val guid : Long
                                 , val algorithmRunTypeName : String
                                 , val insertedRowDate : java.util.Date
                                 , val lastUpdatedDate : java.util.Date
                               ) extends BaseDto {
  def tableName : String = {
    "algorithmRunType";
  }
  def fields : String = {
    "algorithmRunTypeId,guid,algorithmRunTypeName,insertedRowDate,lastUpdatedDate";
  }
  def pkFields : String = {
    "algorithmRunTypeId";
  }
  def fkFields : String = {
    "";
  }
  def nameField : String = {
    "algorithmRunTypeName";
  }
  def getPk() : Long = {
    algorithmRunTypeId
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
    Array(algorithmRunTypeId,guid,algorithmRunTypeName,insertedRowDate,lastUpdatedDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+algorithmRunTypeId,""+guid,""+algorithmRunTypeName,""+insertedRowDate,""+lastUpdatedDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "algorithmRunTypeId" => algorithmRunTypeId
      case "guid" => guid
      case "algorithmRunTypeName" => algorithmRunTypeName
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "algorithmRunTypeId" => "Long"
      case "guid" => "Long"
      case "algorithmRunTypeName" => "String"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into algorithmRunType(guid,algorithmRunTypeName) values (?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
    stat.setObject(1, guid);
    stat.setObject(2, algorithmRunTypeName);
    return stat;
  }
  def modify(algorithmRunTypeName : String) : AlgorithmRunTypeDto = {
    val dtoModified = new AlgorithmRunTypeDto(this.algorithmRunTypeId,this.guid,algorithmRunTypeName,this.insertedRowDate,new java.util.Date());
    dtoModified
  }
}
object AlgorithmRunTypeDto {
  val TABLE_NAME = "algorithmRunType";
  val FIELD_algorithmRunTypeId = "algorithmRunTypeId";
  val FIELD_guid = "guid";
  val FIELD_algorithmRunTypeName = "algorithmRunTypeName";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";

  def createNewAlgorithmRunTypeDto(algorithmRunTypeName : String) : AlgorithmRunTypeDto = {
    val dto = new AlgorithmRunTypeDto(0,0,algorithmRunTypeName,new java.util.Date(),new java.util.Date())
    dto
  }

}


case class AlgorithmRunViewDto (
                                 val algorithmRunViewId : Long
                                 , val guid : Long
                                 , val algorithmRunId : Long
                                 , val executorStorageViewId : Long
                                 , val insertedRowDate : java.util.Date
                                 , val lastUpdatedDate : java.util.Date
                                 , val isDownloaded : Int
                               ) extends BaseDto {
  def tableName : String = {
    "algorithmRunView";
  }
  def fields : String = {
    "algorithmRunViewId,guid,algorithmRunId,executorStorageViewId,insertedRowDate,lastUpdatedDate,isDownloaded";
  }
  def pkFields : String = {
    "algorithmRunViewId";
  }
  def fkFields : String = {
    "algorithmRunId,executorStorageViewId";
  }
  def nameField : String = {
    "";
  }
  def getPk() : Long = {
    algorithmRunViewId
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
    Array(algorithmRunViewId,guid,algorithmRunId,executorStorageViewId,insertedRowDate,lastUpdatedDate,isDownloaded)
  }
  def toStringArray() : Array[String] = {
    Array(""+algorithmRunViewId,""+guid,""+algorithmRunId,""+executorStorageViewId,""+insertedRowDate,""+lastUpdatedDate,""+isDownloaded)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "algorithmRunViewId" => algorithmRunViewId
      case "guid" => guid
      case "algorithmRunId" => algorithmRunId
      case "executorStorageViewId" => executorStorageViewId
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case "isDownloaded" => isDownloaded
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "algorithmRunViewId" => "Long"
      case "guid" => "Long"
      case "algorithmRunId" => "Long"
      case "executorStorageViewId" => "Long"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case "isDownloaded" => "Int"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into algorithmRunView(guid,algorithmRunId,executorStorageViewId,isDownloaded) values (?,?,?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
    stat.setObject(1, guid);
    stat.setObject(2, algorithmRunId);
    stat.setObject(3, executorStorageViewId);
    stat.setObject(4, isDownloaded);
    return stat;
  }
  def modify(algorithmRunId : Long, executorStorageViewId : Long, isDownloaded : Int) : AlgorithmRunViewDto = {
    val dtoModified = new AlgorithmRunViewDto(this.algorithmRunViewId,this.guid,algorithmRunId,executorStorageViewId,this.insertedRowDate,new java.util.Date(),isDownloaded);
    dtoModified
  }
}
object AlgorithmRunViewDto {
  val TABLE_NAME = "algorithmRunView";
  val FIELD_algorithmRunViewId = "algorithmRunViewId";
  val FIELD_guid = "guid";
  val FIELD_algorithmRunId = "algorithmRunId";
  val FIELD_executorStorageViewId = "executorStorageViewId";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";
  val FIELD_isDownloaded = "isDownloaded";

  def createNewAlgorithmRunViewDto(algorithmRunId : Long, executorStorageViewId : Long, isDownloaded : Int) : AlgorithmRunViewDto = {
    val dto = new AlgorithmRunViewDto(0,0,algorithmRunId,executorStorageViewId,new java.util.Date(),new java.util.Date(),isDownloaded)
    dto
  }

}


case class AlgorithmScheduleDto (
                                  val algorithmScheduleId : Long
                                  , val guid : Long
                                  , val algorithmImplementationId : Long
                                  , val algorithmScheduleTypeId : Long
                                  , val algorithmScheduleName : String
                                  , val isScheduled : Int
                                  , val insertedRowDate : java.util.Date
                                  , val lastUpdatedDate : java.util.Date
                                ) extends BaseDto {
  def tableName : String = {
    "algorithmSchedule";
  }
  def fields : String = {
    "algorithmScheduleId,guid,algorithmImplementationId,algorithmScheduleTypeId,algorithmScheduleName,isScheduled,insertedRowDate,lastUpdatedDate";
  }
  def pkFields : String = {
    "algorithmScheduleId";
  }
  def fkFields : String = {
    "algorithmImplementationId,algorithmScheduleTypeId";
  }
  def nameField : String = {
    "algorithmScheduleName";
  }
  def getPk() : Long = {
    algorithmScheduleId
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
    Array(algorithmScheduleId,guid,algorithmImplementationId,algorithmScheduleTypeId,algorithmScheduleName,isScheduled,insertedRowDate,lastUpdatedDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+algorithmScheduleId,""+guid,""+algorithmImplementationId,""+algorithmScheduleTypeId,""+algorithmScheduleName,""+isScheduled,""+insertedRowDate,""+lastUpdatedDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "algorithmScheduleId" => algorithmScheduleId
      case "guid" => guid
      case "algorithmImplementationId" => algorithmImplementationId
      case "algorithmScheduleTypeId" => algorithmScheduleTypeId
      case "algorithmScheduleName" => algorithmScheduleName
      case "isScheduled" => isScheduled
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "algorithmScheduleId" => "Long"
      case "guid" => "Long"
      case "algorithmImplementationId" => "Long"
      case "algorithmScheduleTypeId" => "Long"
      case "algorithmScheduleName" => "String"
      case "isScheduled" => "Int"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into algorithmSchedule(guid,algorithmImplementationId,algorithmScheduleTypeId,algorithmScheduleName,isScheduled) values (?,?,?,?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
    stat.setObject(1, guid);
    stat.setObject(2, algorithmImplementationId);
    stat.setObject(3, algorithmScheduleTypeId);
    stat.setObject(4, algorithmScheduleName);
    stat.setObject(5, isScheduled);
    return stat;
  }
  def modify(algorithmImplementationId : Long, algorithmScheduleTypeId : Long, algorithmScheduleName : String, isScheduled : Int) : AlgorithmScheduleDto = {
    val dtoModified = new AlgorithmScheduleDto(this.algorithmScheduleId,this.guid,algorithmImplementationId,algorithmScheduleTypeId,algorithmScheduleName,isScheduled,this.insertedRowDate,new java.util.Date());
    dtoModified
  }
}
object AlgorithmScheduleDto {
  val TABLE_NAME = "algorithmSchedule";
  val FIELD_algorithmScheduleId = "algorithmScheduleId";
  val FIELD_guid = "guid";
  val FIELD_algorithmImplementationId = "algorithmImplementationId";
  val FIELD_algorithmScheduleTypeId = "algorithmScheduleTypeId";
  val FIELD_algorithmScheduleName = "algorithmScheduleName";
  val FIELD_isScheduled = "isScheduled";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";

  def createNewAlgorithmScheduleDto(algorithmImplementationId : Long, algorithmScheduleTypeId : Long, algorithmScheduleName : String, isScheduled : Int) : AlgorithmScheduleDto = {
    val dto = new AlgorithmScheduleDto(0,0,algorithmImplementationId,algorithmScheduleTypeId,algorithmScheduleName,isScheduled,new java.util.Date(),new java.util.Date())
    dto
  }

}


case class AlgorithmScheduleColumnDto (
                                        val algorithmScheduleColumnId : Long
                                        , val guid : Long
                                        , val algorithmScheduleId : Long
                                        , val algorithmColumnTypeId : Long
                                        , val algorithmScheduleViewId : Long
                                        , val sourceViewId : Long
                                        , val sourceViewColumnId : Long
                                        , val extendedProperties : String
                                        , val insertedRowDate : java.util.Date
                                        , val lastUpdatedDate : java.util.Date
                                      ) extends BaseDto {
  def tableName : String = {
    "algorithmScheduleColumn";
  }
  def fields : String = {
    "algorithmScheduleColumnId,guid,algorithmScheduleId,algorithmColumnTypeId,algorithmScheduleViewId,sourceViewId,sourceViewColumnId,extendedProperties,insertedRowDate,lastUpdatedDate";
  }
  def pkFields : String = {
    "algorithmScheduleColumnId";
  }
  def fkFields : String = {
    "algorithmColumnTypeId,algorithmScheduleId,algorithmScheduleViewId,sourceViewId,sourceViewColumnId";
  }
  def nameField : String = {
    "";
  }
  def getPk() : Long = {
    algorithmScheduleColumnId
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
    Array(algorithmScheduleColumnId,guid,algorithmScheduleId,algorithmColumnTypeId,algorithmScheduleViewId,sourceViewId,sourceViewColumnId,extendedProperties,insertedRowDate,lastUpdatedDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+algorithmScheduleColumnId,""+guid,""+algorithmScheduleId,""+algorithmColumnTypeId,""+algorithmScheduleViewId,""+sourceViewId,""+sourceViewColumnId,""+extendedProperties,""+insertedRowDate,""+lastUpdatedDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "algorithmScheduleColumnId" => algorithmScheduleColumnId
      case "guid" => guid
      case "algorithmScheduleId" => algorithmScheduleId
      case "algorithmColumnTypeId" => algorithmColumnTypeId
      case "algorithmScheduleViewId" => algorithmScheduleViewId
      case "sourceViewId" => sourceViewId
      case "sourceViewColumnId" => sourceViewColumnId
      case "extendedProperties" => extendedProperties
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "algorithmScheduleColumnId" => "Long"
      case "guid" => "Long"
      case "algorithmScheduleId" => "Long"
      case "algorithmColumnTypeId" => "Long"
      case "algorithmScheduleViewId" => "Long"
      case "sourceViewId" => "Long"
      case "sourceViewColumnId" => "Long"
      case "extendedProperties" => "String"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into algorithmScheduleColumn(guid,algorithmScheduleId,algorithmColumnTypeId,algorithmScheduleViewId,sourceViewId,sourceViewColumnId,extendedProperties) values (?,?,?,?,?,?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
    stat.setObject(1, guid);
    stat.setObject(2, algorithmScheduleId);
    stat.setObject(3, algorithmColumnTypeId);
    stat.setObject(4, algorithmScheduleViewId);
    stat.setObject(5, sourceViewId);
    stat.setObject(6, sourceViewColumnId);
    stat.setObject(7, extendedProperties);
    return stat;
  }
  def modify(algorithmScheduleId : Long, algorithmColumnTypeId : Long, algorithmScheduleViewId : Long, sourceViewId : Long, sourceViewColumnId : Long, extendedProperties : String) : AlgorithmScheduleColumnDto = {
    val dtoModified = new AlgorithmScheduleColumnDto(this.algorithmScheduleColumnId,this.guid,algorithmScheduleId,algorithmColumnTypeId,algorithmScheduleViewId,sourceViewId,sourceViewColumnId,extendedProperties,this.insertedRowDate,new java.util.Date());
    dtoModified
  }
}
object AlgorithmScheduleColumnDto {
  val TABLE_NAME = "algorithmScheduleColumn";
  val FIELD_algorithmScheduleColumnId = "algorithmScheduleColumnId";
  val FIELD_guid = "guid";
  val FIELD_algorithmScheduleId = "algorithmScheduleId";
  val FIELD_algorithmColumnTypeId = "algorithmColumnTypeId";
  val FIELD_algorithmScheduleViewId = "algorithmScheduleViewId";
  val FIELD_sourceViewId = "sourceViewId";
  val FIELD_sourceViewColumnId = "sourceViewColumnId";
  val FIELD_extendedProperties = "extendedProperties";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";

  def createNewAlgorithmScheduleColumnDto(algorithmScheduleId : Long, algorithmColumnTypeId : Long, algorithmScheduleViewId : Long, sourceViewId : Long, sourceViewColumnId : Long, extendedProperties : String) : AlgorithmScheduleColumnDto = {
    val dto = new AlgorithmScheduleColumnDto(0,0,algorithmScheduleId,algorithmColumnTypeId,algorithmScheduleViewId,sourceViewId,sourceViewColumnId,extendedProperties,new java.util.Date(),new java.util.Date())
    dto
  }

}


case class AlgorithmScheduleParamDto (
                                       val algorithmScheduleParamId : Long
                                       , val guid : Long
                                       , val algorithmScheduleId : Long
                                       , val algorithmParamId : Long
                                       , val algorithmParamValue : String
                                       , val insertedRowDate : java.util.Date
                                       , val lastUpdatedDate : java.util.Date
                                     ) extends BaseDto {
  def tableName : String = {
    "algorithmScheduleParam";
  }
  def fields : String = {
    "algorithmScheduleParamId,guid,algorithmScheduleId,algorithmParamId,algorithmParamValue,insertedRowDate,lastUpdatedDate";
  }
  def pkFields : String = {
    "algorithmScheduleParamId";
  }
  def fkFields : String = {
    "algorithmParamId,algorithmScheduleId";
  }
  def nameField : String = {
    "";
  }
  def getPk() : Long = {
    algorithmScheduleParamId
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
    Array(algorithmScheduleParamId,guid,algorithmScheduleId,algorithmParamId,algorithmParamValue,insertedRowDate,lastUpdatedDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+algorithmScheduleParamId,""+guid,""+algorithmScheduleId,""+algorithmParamId,""+algorithmParamValue,""+insertedRowDate,""+lastUpdatedDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "algorithmScheduleParamId" => algorithmScheduleParamId
      case "guid" => guid
      case "algorithmScheduleId" => algorithmScheduleId
      case "algorithmParamId" => algorithmParamId
      case "algorithmParamValue" => algorithmParamValue
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "algorithmScheduleParamId" => "Long"
      case "guid" => "Long"
      case "algorithmScheduleId" => "Long"
      case "algorithmParamId" => "Long"
      case "algorithmParamValue" => "String"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
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
    val dtoModified = new AlgorithmScheduleParamDto(this.algorithmScheduleParamId,this.guid,algorithmScheduleId,algorithmParamId,algorithmParamValue,this.insertedRowDate,new java.util.Date());
    dtoModified
  }
}
object AlgorithmScheduleParamDto {
  val TABLE_NAME = "algorithmScheduleParam";
  val FIELD_algorithmScheduleParamId = "algorithmScheduleParamId";
  val FIELD_guid = "guid";
  val FIELD_algorithmScheduleId = "algorithmScheduleId";
  val FIELD_algorithmParamId = "algorithmParamId";
  val FIELD_algorithmParamValue = "algorithmParamValue";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";

  def createNewAlgorithmScheduleParamDto(algorithmScheduleId : Long, algorithmParamId : Long, algorithmParamValue : String) : AlgorithmScheduleParamDto = {
    val dto = new AlgorithmScheduleParamDto(0,0,algorithmScheduleId,algorithmParamId,algorithmParamValue,new java.util.Date(),new java.util.Date())
    dto
  }

}


case class AlgorithmScheduleTypeDto (
                                      val algorithmScheduleTypeId : Long
                                      , val guid : Long
                                      , val algorithmScheduleTypeName : String
                                      , val insertedRowDate : java.util.Date
                                      , val lastUpdatedDate : java.util.Date
                                    ) extends BaseDto {
  def tableName : String = {
    "algorithmScheduleType";
  }
  def fields : String = {
    "algorithmScheduleTypeId,guid,algorithmScheduleTypeName,insertedRowDate,lastUpdatedDate";
  }
  def pkFields : String = {
    "algorithmScheduleTypeId";
  }
  def fkFields : String = {
    "";
  }
  def nameField : String = {
    "algorithmScheduleTypeName";
  }
  def getPk() : Long = {
    algorithmScheduleTypeId
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
    Array(algorithmScheduleTypeId,guid,algorithmScheduleTypeName,insertedRowDate,lastUpdatedDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+algorithmScheduleTypeId,""+guid,""+algorithmScheduleTypeName,""+insertedRowDate,""+lastUpdatedDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "algorithmScheduleTypeId" => algorithmScheduleTypeId
      case "guid" => guid
      case "algorithmScheduleTypeName" => algorithmScheduleTypeName
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "algorithmScheduleTypeId" => "Long"
      case "guid" => "Long"
      case "algorithmScheduleTypeName" => "String"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into algorithmScheduleType(guid,algorithmScheduleTypeName) values (?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
    stat.setObject(1, guid);
    stat.setObject(2, algorithmScheduleTypeName);
    return stat;
  }
  def modify(algorithmScheduleTypeName : String) : AlgorithmScheduleTypeDto = {
    val dtoModified = new AlgorithmScheduleTypeDto(this.algorithmScheduleTypeId,this.guid,algorithmScheduleTypeName,this.insertedRowDate,new java.util.Date());
    dtoModified
  }
}
object AlgorithmScheduleTypeDto {
  val TABLE_NAME = "algorithmScheduleType";
  val FIELD_algorithmScheduleTypeId = "algorithmScheduleTypeId";
  val FIELD_guid = "guid";
  val FIELD_algorithmScheduleTypeName = "algorithmScheduleTypeName";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";

  def createNewAlgorithmScheduleTypeDto(algorithmScheduleTypeName : String) : AlgorithmScheduleTypeDto = {
    val dto = new AlgorithmScheduleTypeDto(0,0,algorithmScheduleTypeName,new java.util.Date(),new java.util.Date())
    dto
  }

}


case class AlgorithmScheduleViewDto (
                                      val algorithmScheduleViewId : Long
                                      , val guid : Long
                                      , val algorithmScheduleViewTypeId : Long
                                      , val algorithmScheduleId : Long
                                      , val sourceViewId : Long
                                      , val insertedRowDate : java.util.Date
                                      , val lastUpdatedDate : java.util.Date
                                      , val joinOnDefinition : String
                                    ) extends BaseDto {
  def tableName : String = {
    "algorithmScheduleView";
  }
  def fields : String = {
    "algorithmScheduleViewId,guid,algorithmScheduleViewTypeId,algorithmScheduleId,sourceViewId,insertedRowDate,lastUpdatedDate,joinOnDefinition";
  }
  def pkFields : String = {
    "algorithmScheduleViewId";
  }
  def fkFields : String = {
    "algorithmScheduleId,algorithmScheduleViewTypeId,sourceViewId";
  }
  def nameField : String = {
    "";
  }
  def getPk() : Long = {
    algorithmScheduleViewId
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
    Array(algorithmScheduleViewId,guid,algorithmScheduleViewTypeId,algorithmScheduleId,sourceViewId,insertedRowDate,lastUpdatedDate,joinOnDefinition)
  }
  def toStringArray() : Array[String] = {
    Array(""+algorithmScheduleViewId,""+guid,""+algorithmScheduleViewTypeId,""+algorithmScheduleId,""+sourceViewId,""+insertedRowDate,""+lastUpdatedDate,""+joinOnDefinition)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "algorithmScheduleViewId" => algorithmScheduleViewId
      case "guid" => guid
      case "algorithmScheduleViewTypeId" => algorithmScheduleViewTypeId
      case "algorithmScheduleId" => algorithmScheduleId
      case "sourceViewId" => sourceViewId
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case "joinOnDefinition" => joinOnDefinition
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "algorithmScheduleViewId" => "Long"
      case "guid" => "Long"
      case "algorithmScheduleViewTypeId" => "Long"
      case "algorithmScheduleId" => "Long"
      case "sourceViewId" => "Long"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case "joinOnDefinition" => "String"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into algorithmScheduleView(guid,algorithmScheduleViewTypeId,algorithmScheduleId,sourceViewId,joinOnDefinition) values (?,?,?,?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
    stat.setObject(1, guid);
    stat.setObject(2, algorithmScheduleViewTypeId);
    stat.setObject(3, algorithmScheduleId);
    stat.setObject(4, sourceViewId);
    stat.setObject(5, joinOnDefinition);
    return stat;
  }
  def modify(algorithmScheduleViewTypeId : Long, algorithmScheduleId : Long, sourceViewId : Long, joinOnDefinition : String) : AlgorithmScheduleViewDto = {
    val dtoModified = new AlgorithmScheduleViewDto(this.algorithmScheduleViewId,this.guid,algorithmScheduleViewTypeId,algorithmScheduleId,sourceViewId,this.insertedRowDate,new java.util.Date(),joinOnDefinition);
    dtoModified
  }
}
object AlgorithmScheduleViewDto {
  val TABLE_NAME = "algorithmScheduleView";
  val FIELD_algorithmScheduleViewId = "algorithmScheduleViewId";
  val FIELD_guid = "guid";
  val FIELD_algorithmScheduleViewTypeId = "algorithmScheduleViewTypeId";
  val FIELD_algorithmScheduleId = "algorithmScheduleId";
  val FIELD_sourceViewId = "sourceViewId";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";
  val FIELD_joinOnDefinition = "joinOnDefinition";

  def createNewAlgorithmScheduleViewDto(algorithmScheduleViewTypeId : Long, algorithmScheduleId : Long, sourceViewId : Long, joinOnDefinition : String) : AlgorithmScheduleViewDto = {
    val dto = new AlgorithmScheduleViewDto(0,0,algorithmScheduleViewTypeId,algorithmScheduleId,sourceViewId,new java.util.Date(),new java.util.Date(),joinOnDefinition)
    dto
  }

}


case class AlgorithmScheduleViewTypeDto (
                                          val algorithmScheduleViewTypeId : Long
                                          , val guid : Long
                                          , val algorithmScheduleViewTypeName : String
                                          , val insertedRowDate : java.util.Date
                                          , val lastUpdatedDate : java.util.Date
                                        ) extends BaseDto {
  def tableName : String = {
    "algorithmScheduleViewType";
  }
  def fields : String = {
    "algorithmScheduleViewTypeId,guid,algorithmScheduleViewTypeName,insertedRowDate,lastUpdatedDate";
  }
  def pkFields : String = {
    "algorithmScheduleViewTypeId";
  }
  def fkFields : String = {
    "";
  }
  def nameField : String = {
    "algorithmScheduleViewTypeName";
  }
  def getPk() : Long = {
    algorithmScheduleViewTypeId
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
    Array(algorithmScheduleViewTypeId,guid,algorithmScheduleViewTypeName,insertedRowDate,lastUpdatedDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+algorithmScheduleViewTypeId,""+guid,""+algorithmScheduleViewTypeName,""+insertedRowDate,""+lastUpdatedDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "algorithmScheduleViewTypeId" => algorithmScheduleViewTypeId
      case "guid" => guid
      case "algorithmScheduleViewTypeName" => algorithmScheduleViewTypeName
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "algorithmScheduleViewTypeId" => "Long"
      case "guid" => "Long"
      case "algorithmScheduleViewTypeName" => "String"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into algorithmScheduleViewType(guid,algorithmScheduleViewTypeName) values (?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
    stat.setObject(1, guid);
    stat.setObject(2, algorithmScheduleViewTypeName);
    return stat;
  }
  def modify(algorithmScheduleViewTypeName : String) : AlgorithmScheduleViewTypeDto = {
    val dtoModified = new AlgorithmScheduleViewTypeDto(this.algorithmScheduleViewTypeId,this.guid,algorithmScheduleViewTypeName,this.insertedRowDate,new java.util.Date());
    dtoModified
  }
}
object AlgorithmScheduleViewTypeDto {
  val TABLE_NAME = "algorithmScheduleViewType";
  val FIELD_algorithmScheduleViewTypeId = "algorithmScheduleViewTypeId";
  val FIELD_guid = "guid";
  val FIELD_algorithmScheduleViewTypeName = "algorithmScheduleViewTypeName";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";

  def createNewAlgorithmScheduleViewTypeDto(algorithmScheduleViewTypeName : String) : AlgorithmScheduleViewTypeDto = {
    val dto = new AlgorithmScheduleViewTypeDto(0,0,algorithmScheduleViewTypeName,new java.util.Date(),new java.util.Date())
    dto
  }

}


case class AlgorithmTypeDto (
                              val algorithmTypeId : Long
                              , val guid : Long
                              , val algorithmTypeName : String
                              , val algorithmTypeDescription : String
                              , val insertedRowDate : java.util.Date
                              , val lastUpdatedDate : java.util.Date
                            ) extends BaseDto {
  def tableName : String = {
    "algorithmType";
  }
  def fields : String = {
    "algorithmTypeId,guid,algorithmTypeName,algorithmTypeDescription,insertedRowDate,lastUpdatedDate";
  }
  def pkFields : String = {
    "algorithmTypeId";
  }
  def fkFields : String = {
    "";
  }
  def nameField : String = {
    "algorithmTypeName";
  }
  def getPk() : Long = {
    algorithmTypeId
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
    Array(algorithmTypeId,guid,algorithmTypeName,algorithmTypeDescription,insertedRowDate,lastUpdatedDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+algorithmTypeId,""+guid,""+algorithmTypeName,""+algorithmTypeDescription,""+insertedRowDate,""+lastUpdatedDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "algorithmTypeId" => algorithmTypeId
      case "guid" => guid
      case "algorithmTypeName" => algorithmTypeName
      case "algorithmTypeDescription" => algorithmTypeDescription
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "algorithmTypeId" => "Long"
      case "guid" => "Long"
      case "algorithmTypeName" => "String"
      case "algorithmTypeDescription" => "String"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into algorithmType(guid,algorithmTypeName,algorithmTypeDescription) values (?,?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
    stat.setObject(1, guid);
    stat.setObject(2, algorithmTypeName);
    stat.setObject(3, algorithmTypeDescription);
    return stat;
  }
  def modify(algorithmTypeName : String, algorithmTypeDescription : String) : AlgorithmTypeDto = {
    val dtoModified = new AlgorithmTypeDto(this.algorithmTypeId,this.guid,algorithmTypeName,algorithmTypeDescription,this.insertedRowDate,new java.util.Date());
    dtoModified
  }
}
object AlgorithmTypeDto {
  val TABLE_NAME = "algorithmType";
  val FIELD_algorithmTypeId = "algorithmTypeId";
  val FIELD_guid = "guid";
  val FIELD_algorithmTypeName = "algorithmTypeName";
  val FIELD_algorithmTypeDescription = "algorithmTypeDescription";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";

  def createNewAlgorithmTypeDto(algorithmTypeName : String, algorithmTypeDescription : String) : AlgorithmTypeDto = {
    val dto = new AlgorithmTypeDto(0,0,algorithmTypeName,algorithmTypeDescription,new java.util.Date(),new java.util.Date())
    dto
  }

}


case class AlgorithmTypeColumnTypeDto (
                                        val algorithmTypeColumnTypeId : Long
                                        , val algorithmTypeVersionId : Long
                                        , val algorithmColumnTypeId : Long
                                        , val allowMultiple : Int
                                        , val allowEmpty : Int
                                        , val insertedRowDate : java.util.Date
                                        , val lastUpdatedDate : java.util.Date
                                        , val guid : Long
                                      ) extends BaseDto {
  def tableName : String = {
    "algorithmTypeColumnType";
  }
  def fields : String = {
    "algorithmTypeColumnTypeId,algorithmTypeVersionId,algorithmColumnTypeId,allowMultiple,allowEmpty,insertedRowDate,lastUpdatedDate,guid";
  }
  def pkFields : String = {
    "algorithmTypeColumnTypeId";
  }
  def fkFields : String = {
    "algorithmColumnTypeId,algorithmTypeVersionId";
  }
  def nameField : String = {
    "";
  }
  def getPk() : Long = {
    algorithmTypeColumnTypeId
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
    Array(algorithmTypeColumnTypeId,algorithmTypeVersionId,algorithmColumnTypeId,allowMultiple,allowEmpty,insertedRowDate,lastUpdatedDate,guid)
  }
  def toStringArray() : Array[String] = {
    Array(""+algorithmTypeColumnTypeId,""+algorithmTypeVersionId,""+algorithmColumnTypeId,""+allowMultiple,""+allowEmpty,""+insertedRowDate,""+lastUpdatedDate,""+guid)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "algorithmTypeColumnTypeId" => algorithmTypeColumnTypeId
      case "algorithmTypeVersionId" => algorithmTypeVersionId
      case "algorithmColumnTypeId" => algorithmColumnTypeId
      case "allowMultiple" => allowMultiple
      case "allowEmpty" => allowEmpty
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case "guid" => guid
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "algorithmTypeColumnTypeId" => "Long"
      case "algorithmTypeVersionId" => "Long"
      case "algorithmColumnTypeId" => "Long"
      case "allowMultiple" => "Int"
      case "allowEmpty" => "Int"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case "guid" => "Long"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into algorithmTypeColumnType(algorithmTypeVersionId,algorithmColumnTypeId,allowMultiple,allowEmpty,guid) values (?,?,?,?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
    stat.setObject(1, algorithmTypeVersionId);
    stat.setObject(2, algorithmColumnTypeId);
    stat.setObject(3, allowMultiple);
    stat.setObject(4, allowEmpty);
    stat.setObject(5, guid);
    return stat;
  }
  def modify(algorithmTypeVersionId : Long, algorithmColumnTypeId : Long, allowMultiple : Int, allowEmpty : Int) : AlgorithmTypeColumnTypeDto = {
    val dtoModified = new AlgorithmTypeColumnTypeDto(this.algorithmTypeColumnTypeId,algorithmTypeVersionId,algorithmColumnTypeId,allowMultiple,allowEmpty,this.insertedRowDate,new java.util.Date(),this.guid);
    dtoModified
  }
}
object AlgorithmTypeColumnTypeDto {
  val TABLE_NAME = "algorithmTypeColumnType";
  val FIELD_algorithmTypeColumnTypeId = "algorithmTypeColumnTypeId";
  val FIELD_algorithmTypeVersionId = "algorithmTypeVersionId";
  val FIELD_algorithmColumnTypeId = "algorithmColumnTypeId";
  val FIELD_allowMultiple = "allowMultiple";
  val FIELD_allowEmpty = "allowEmpty";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";
  val FIELD_guid = "guid";

  def createNewAlgorithmTypeColumnTypeDto(algorithmTypeVersionId : Long, algorithmColumnTypeId : Long, allowMultiple : Int, allowEmpty : Int) : AlgorithmTypeColumnTypeDto = {
    val dto = new AlgorithmTypeColumnTypeDto(0,algorithmTypeVersionId,algorithmColumnTypeId,allowMultiple,allowEmpty,new java.util.Date(),new java.util.Date(),0)
    dto
  }

}


case class AlgorithmTypeOutputTypeDto (
                                        val algorithmTypeOutputTypeId : Long
                                        , val guid : Long
                                        , val algorithmTypeVersionId : Long
                                        , val algorithmOutputTypeId : Long
                                        , val isMandatory : Int
                                        , val insertedRowDate : java.util.Date
                                        , val lastUpdatedDate : java.util.Date
                                      ) extends BaseDto {
  def tableName : String = {
    "algorithmTypeOutputType";
  }
  def fields : String = {
    "algorithmTypeOutputTypeId,guid,algorithmTypeVersionId,algorithmOutputTypeId,isMandatory,insertedRowDate,lastUpdatedDate";
  }
  def pkFields : String = {
    "algorithmTypeOutputTypeId";
  }
  def fkFields : String = {
    "";
  }
  def nameField : String = {
    "";
  }
  def getPk() : Long = {
    algorithmTypeOutputTypeId
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
    Array(algorithmTypeOutputTypeId,guid,algorithmTypeVersionId,algorithmOutputTypeId,isMandatory,insertedRowDate,lastUpdatedDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+algorithmTypeOutputTypeId,""+guid,""+algorithmTypeVersionId,""+algorithmOutputTypeId,""+isMandatory,""+insertedRowDate,""+lastUpdatedDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "algorithmTypeOutputTypeId" => algorithmTypeOutputTypeId
      case "guid" => guid
      case "algorithmTypeVersionId" => algorithmTypeVersionId
      case "algorithmOutputTypeId" => algorithmOutputTypeId
      case "isMandatory" => isMandatory
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "algorithmTypeOutputTypeId" => "Long"
      case "guid" => "Long"
      case "algorithmTypeVersionId" => "Long"
      case "algorithmOutputTypeId" => "Long"
      case "isMandatory" => "Int"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into algorithmTypeOutputType(guid,algorithmTypeVersionId,algorithmOutputTypeId,isMandatory) values (?,?,?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
    stat.setObject(1, guid);
    stat.setObject(2, algorithmTypeVersionId);
    stat.setObject(3, algorithmOutputTypeId);
    stat.setObject(4, isMandatory);
    return stat;
  }
  def modify(algorithmTypeVersionId : Long, algorithmOutputTypeId : Long, isMandatory : Int) : AlgorithmTypeOutputTypeDto = {
    val dtoModified = new AlgorithmTypeOutputTypeDto(this.algorithmTypeOutputTypeId,this.guid,algorithmTypeVersionId,algorithmOutputTypeId,isMandatory,this.insertedRowDate,new java.util.Date());
    dtoModified
  }
}
object AlgorithmTypeOutputTypeDto {
  val TABLE_NAME = "algorithmTypeOutputType";
  val FIELD_algorithmTypeOutputTypeId = "algorithmTypeOutputTypeId";
  val FIELD_guid = "guid";
  val FIELD_algorithmTypeVersionId = "algorithmTypeVersionId";
  val FIELD_algorithmOutputTypeId = "algorithmOutputTypeId";
  val FIELD_isMandatory = "isMandatory";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";

  def createNewAlgorithmTypeOutputTypeDto(algorithmTypeVersionId : Long, algorithmOutputTypeId : Long, isMandatory : Int) : AlgorithmTypeOutputTypeDto = {
    val dto = new AlgorithmTypeOutputTypeDto(0,0,algorithmTypeVersionId,algorithmOutputTypeId,isMandatory,new java.util.Date(),new java.util.Date())
    dto
  }

}


case class AlgorithmTypeVersionDto (
                                     val algorithmTypeVersionId : Long
                                     , val guid : Long
                                     , val algorithmTypeId : Long
                                     , val algorithmTypeVersionName : String
                                     , val insertedRowDate : java.util.Date
                                     , val lastUpdatedDate : java.util.Date
                                   ) extends BaseDto {
  def tableName : String = {
    "algorithmTypeVersion";
  }
  def fields : String = {
    "algorithmTypeVersionId,guid,algorithmTypeId,algorithmTypeVersionName,insertedRowDate,lastUpdatedDate";
  }
  def pkFields : String = {
    "algorithmTypeVersionId";
  }
  def fkFields : String = {
    "algorithmTypeId";
  }
  def nameField : String = {
    "algorithmTypeVersionName";
  }
  def getPk() : Long = {
    algorithmTypeVersionId
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
    Array(algorithmTypeVersionId,guid,algorithmTypeId,algorithmTypeVersionName,insertedRowDate,lastUpdatedDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+algorithmTypeVersionId,""+guid,""+algorithmTypeId,""+algorithmTypeVersionName,""+insertedRowDate,""+lastUpdatedDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "algorithmTypeVersionId" => algorithmTypeVersionId
      case "guid" => guid
      case "algorithmTypeId" => algorithmTypeId
      case "algorithmTypeVersionName" => algorithmTypeVersionName
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "algorithmTypeVersionId" => "Long"
      case "guid" => "Long"
      case "algorithmTypeId" => "Long"
      case "algorithmTypeVersionName" => "String"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into algorithmTypeVersion(guid,algorithmTypeId,algorithmTypeVersionName) values (?,?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
    stat.setObject(1, guid);
    stat.setObject(2, algorithmTypeId);
    stat.setObject(3, algorithmTypeVersionName);
    return stat;
  }
  def modify(algorithmTypeId : Long, algorithmTypeVersionName : String) : AlgorithmTypeVersionDto = {
    val dtoModified = new AlgorithmTypeVersionDto(this.algorithmTypeVersionId,this.guid,algorithmTypeId,algorithmTypeVersionName,this.insertedRowDate,new java.util.Date());
    dtoModified
  }
}
object AlgorithmTypeVersionDto {
  val TABLE_NAME = "algorithmTypeVersion";
  val FIELD_algorithmTypeVersionId = "algorithmTypeVersionId";
  val FIELD_guid = "guid";
  val FIELD_algorithmTypeId = "algorithmTypeId";
  val FIELD_algorithmTypeVersionName = "algorithmTypeVersionName";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";

  def createNewAlgorithmTypeVersionDto(algorithmTypeId : Long, algorithmTypeVersionName : String) : AlgorithmTypeVersionDto = {
    val dto = new AlgorithmTypeVersionDto(0,0,algorithmTypeId,algorithmTypeVersionName,new java.util.Date(),new java.util.Date())
    dto
  }

}


case class ExecutorHostDto (
                             val executorHostId : Long
                             , val guid : Long
                             , val insertedRowDate : java.util.Date
                             , val lastUpdatedDate : java.util.Date
                             , val hostName : String
                             , val hostIp : String
                             , val hostDomain : String
                             , val hostOsType : String
                             , val hostOsVersion : String
                             , val isWorking : Int
                           ) extends BaseDto {
  def tableName : String = {
    "executorHost";
  }
  def fields : String = {
    "executorHostId,guid,insertedRowDate,lastUpdatedDate,hostName,hostIp,hostDomain,hostOsType,hostOsVersion,isWorking";
  }
  def pkFields : String = {
    "executorHostId";
  }
  def fkFields : String = {
    "";
  }
  def nameField : String = {
    "";
  }
  def getPk() : Long = {
    executorHostId
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
    Array(executorHostId,guid,insertedRowDate,lastUpdatedDate,hostName,hostIp,hostDomain,hostOsType,hostOsVersion,isWorking)
  }
  def toStringArray() : Array[String] = {
    Array(""+executorHostId,""+guid,""+insertedRowDate,""+lastUpdatedDate,""+hostName,""+hostIp,""+hostDomain,""+hostOsType,""+hostOsVersion,""+isWorking)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "executorHostId" => executorHostId
      case "guid" => guid
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case "hostName" => hostName
      case "hostIp" => hostIp
      case "hostDomain" => hostDomain
      case "hostOsType" => hostOsType
      case "hostOsVersion" => hostOsVersion
      case "isWorking" => isWorking
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "executorHostId" => "Long"
      case "guid" => "Long"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case "hostName" => "String"
      case "hostIp" => "String"
      case "hostDomain" => "String"
      case "hostOsType" => "String"
      case "hostOsVersion" => "String"
      case "isWorking" => "Int"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into executorHost(guid,hostName,hostIp,hostDomain,hostOsType,hostOsVersion,isWorking) values (?,?,?,?,?,?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
    stat.setObject(1, guid);
    stat.setObject(2, hostName);
    stat.setObject(3, hostIp);
    stat.setObject(4, hostDomain);
    stat.setObject(5, hostOsType);
    stat.setObject(6, hostOsVersion);
    stat.setObject(7, isWorking);
    return stat;
  }
  def modify(hostName : String, hostIp : String, hostDomain : String, hostOsType : String, hostOsVersion : String, isWorking : Int) : ExecutorHostDto = {
    val dtoModified = new ExecutorHostDto(this.executorHostId,this.guid,this.insertedRowDate,new java.util.Date(),hostName,hostIp,hostDomain,hostOsType,hostOsVersion,isWorking);
    dtoModified
  }
}
object ExecutorHostDto {
  val TABLE_NAME = "executorHost";
  val FIELD_executorHostId = "executorHostId";
  val FIELD_guid = "guid";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";
  val FIELD_hostName = "hostName";
  val FIELD_hostIp = "hostIp";
  val FIELD_hostDomain = "hostDomain";
  val FIELD_hostOsType = "hostOsType";
  val FIELD_hostOsVersion = "hostOsVersion";
  val FIELD_isWorking = "isWorking";

  def createNewExecutorHostDto(hostName : String, hostIp : String, hostDomain : String, hostOsType : String, hostOsVersion : String, isWorking : Int) : ExecutorHostDto = {
    val dto = new ExecutorHostDto(0,0,new java.util.Date(),new java.util.Date(),hostName,hostIp,hostDomain,hostOsType,hostOsVersion,isWorking)
    dto
  }

}


case class ExecutorInstanceDto (
                                 val executorInstanceId : Long
                                 , val guid : Long
                                 , val executorTypeId : Long
                                 , val executorHostId : Long
                                 , val executorInstanceName : String
                                 , val isRunning : Int
                                 , val isFinished : Int
                                 , val portNumber : Int
                                 , val insertedRowDate : java.util.Date
                                 , val lastUpdatedDate : java.util.Date
                                 , val endDate : java.util.Date
                               ) extends BaseDto {
  def tableName : String = {
    "executorInstance";
  }
  def fields : String = {
    "executorInstanceId,guid,executorTypeId,executorHostId,executorInstanceName,isRunning,isFinished,portNumber,insertedRowDate,lastUpdatedDate,endDate";
  }
  def pkFields : String = {
    "executorInstanceId";
  }
  def fkFields : String = {
    "executorHostId,executorTypeId";
  }
  def nameField : String = {
    "executorInstanceName";
  }
  def getPk() : Long = {
    executorInstanceId
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
    Array(executorInstanceId,guid,executorTypeId,executorHostId,executorInstanceName,isRunning,isFinished,portNumber,insertedRowDate,lastUpdatedDate,endDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+executorInstanceId,""+guid,""+executorTypeId,""+executorHostId,""+executorInstanceName,""+isRunning,""+isFinished,""+portNumber,""+insertedRowDate,""+lastUpdatedDate,""+endDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "executorInstanceId" => executorInstanceId
      case "guid" => guid
      case "executorTypeId" => executorTypeId
      case "executorHostId" => executorHostId
      case "executorInstanceName" => executorInstanceName
      case "isRunning" => isRunning
      case "isFinished" => isFinished
      case "portNumber" => portNumber
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case "endDate" => endDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "executorInstanceId" => "Long"
      case "guid" => "Long"
      case "executorTypeId" => "Long"
      case "executorHostId" => "Long"
      case "executorInstanceName" => "String"
      case "isRunning" => "Int"
      case "isFinished" => "Int"
      case "portNumber" => "Int"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case "endDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into executorInstance(guid,executorTypeId,executorHostId,executorInstanceName,isRunning,isFinished,portNumber,endDate) values (?,?,?,?,?,?,?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
    stat.setObject(1, guid);
    stat.setObject(2, executorTypeId);
    stat.setObject(3, executorHostId);
    stat.setObject(4, executorInstanceName);
    stat.setObject(5, isRunning);
    stat.setObject(6, isFinished);
    stat.setObject(7, portNumber);
    stat.setObject(8, endDate);
    return stat;
  }
  def modify(executorTypeId : Long, executorHostId : Long, executorInstanceName : String, isRunning : Int, isFinished : Int, portNumber : Int, endDate : java.util.Date) : ExecutorInstanceDto = {
    val dtoModified = new ExecutorInstanceDto(this.executorInstanceId,this.guid,executorTypeId,executorHostId,executorInstanceName,isRunning,isFinished,portNumber,this.insertedRowDate,new java.util.Date(),endDate);
    dtoModified
  }
}
object ExecutorInstanceDto {
  val TABLE_NAME = "executorInstance";
  val FIELD_executorInstanceId = "executorInstanceId";
  val FIELD_guid = "guid";
  val FIELD_executorTypeId = "executorTypeId";
  val FIELD_executorHostId = "executorHostId";
  val FIELD_executorInstanceName = "executorInstanceName";
  val FIELD_isRunning = "isRunning";
  val FIELD_isFinished = "isFinished";
  val FIELD_portNumber = "portNumber";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";
  val FIELD_endDate = "endDate";

  def createNewExecutorInstanceDto(executorTypeId : Long, executorHostId : Long, executorInstanceName : String, isRunning : Int, isFinished : Int, portNumber : Int, endDate : java.util.Date) : ExecutorInstanceDto = {
    val dto = new ExecutorInstanceDto(0,0,executorTypeId,executorHostId,executorInstanceName,isRunning,isFinished,portNumber,new java.util.Date(),new java.util.Date(),endDate)
    dto
  }

}


case class ExecutorRestDto (
                             val executorRestId : Long
                             , val guid : Long
                             , val executorHostId : Long
                             , val insertedRowDate : java.util.Date
                             , val lastUpdatedDate : java.util.Date
                             , val restPort : Int
                             , val restVersion : String
                             , val restStatus : String
                           ) extends BaseDto {
  def tableName : String = {
    "executorRest";
  }
  def fields : String = {
    "executorRestId,guid,executorHostId,insertedRowDate,lastUpdatedDate,restPort,restVersion,restStatus";
  }
  def pkFields : String = {
    "executorRestId";
  }
  def fkFields : String = {
    "executorHostId";
  }
  def nameField : String = {
    "";
  }
  def getPk() : Long = {
    executorRestId
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
    Array(executorRestId,guid,executorHostId,insertedRowDate,lastUpdatedDate,restPort,restVersion,restStatus)
  }
  def toStringArray() : Array[String] = {
    Array(""+executorRestId,""+guid,""+executorHostId,""+insertedRowDate,""+lastUpdatedDate,""+restPort,""+restVersion,""+restStatus)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "executorRestId" => executorRestId
      case "guid" => guid
      case "executorHostId" => executorHostId
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case "restPort" => restPort
      case "restVersion" => restVersion
      case "restStatus" => restStatus
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "executorRestId" => "Long"
      case "guid" => "Long"
      case "executorHostId" => "Long"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case "restPort" => "Int"
      case "restVersion" => "String"
      case "restStatus" => "String"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into executorRest(guid,executorHostId,restPort,restVersion,restStatus) values (?,?,?,?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
    stat.setObject(1, guid);
    stat.setObject(2, executorHostId);
    stat.setObject(3, restPort);
    stat.setObject(4, restVersion);
    stat.setObject(5, restStatus);
    return stat;
  }
  def modify(executorHostId : Long, restPort : Int, restVersion : String, restStatus : String) : ExecutorRestDto = {
    val dtoModified = new ExecutorRestDto(this.executorRestId,this.guid,executorHostId,this.insertedRowDate,new java.util.Date(),restPort,restVersion,restStatus);
    dtoModified
  }
}
object ExecutorRestDto {
  val TABLE_NAME = "executorRest";
  val FIELD_executorRestId = "executorRestId";
  val FIELD_guid = "guid";
  val FIELD_executorHostId = "executorHostId";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";
  val FIELD_restPort = "restPort";
  val FIELD_restVersion = "restVersion";
  val FIELD_restStatus = "restStatus";

  def createNewExecutorRestDto(executorHostId : Long, restPort : Int, restVersion : String, restStatus : String) : ExecutorRestDto = {
    val dto = new ExecutorRestDto(0,0,executorHostId,new java.util.Date(),new java.util.Date(),restPort,restVersion,restStatus)
    dto
  }

}


case class ExecutorRestCallDto (
                                 val executorRestCallId : Long
                                 , val guid : Long
                                 , val insertedRowDate : java.util.Date
                                 , val lastUpdatedDate : java.util.Date
                                 , val executorHostId : Long
                                 , val executorRestId : Long
                                 , val requestMethod : String
                                 , val requestHeader : String
                                 , val requestBody : String
                                 , val responseBody : String
                               ) extends BaseDto {
  def tableName : String = {
    "executorRestCall";
  }
  def fields : String = {
    "executorRestCallId,guid,insertedRowDate,lastUpdatedDate,executorHostId,executorRestId,requestMethod,requestHeader,requestBody,responseBody";
  }
  def pkFields : String = {
    "executorRestCallId";
  }
  def fkFields : String = {
    "executorHostId,executorRestId";
  }
  def nameField : String = {
    "";
  }
  def getPk() : Long = {
    executorRestCallId
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
    Array(executorRestCallId,guid,insertedRowDate,lastUpdatedDate,executorHostId,executorRestId,requestMethod,requestHeader,requestBody,responseBody)
  }
  def toStringArray() : Array[String] = {
    Array(""+executorRestCallId,""+guid,""+insertedRowDate,""+lastUpdatedDate,""+executorHostId,""+executorRestId,""+requestMethod,""+requestHeader,""+requestBody,""+responseBody)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "executorRestCallId" => executorRestCallId
      case "guid" => guid
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case "executorHostId" => executorHostId
      case "executorRestId" => executorRestId
      case "requestMethod" => requestMethod
      case "requestHeader" => requestHeader
      case "requestBody" => requestBody
      case "responseBody" => responseBody
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "executorRestCallId" => "Long"
      case "guid" => "Long"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case "executorHostId" => "Long"
      case "executorRestId" => "Long"
      case "requestMethod" => "String"
      case "requestHeader" => "String"
      case "requestBody" => "String"
      case "responseBody" => "String"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into executorRestCall(guid,executorHostId,executorRestId,requestMethod,requestHeader,requestBody,responseBody) values (?,?,?,?,?,?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
    stat.setObject(1, guid);
    stat.setObject(2, executorHostId);
    stat.setObject(3, executorRestId);
    stat.setObject(4, requestMethod);
    stat.setObject(5, requestHeader);
    stat.setObject(6, requestBody);
    stat.setObject(7, responseBody);
    return stat;
  }
  def modify(executorHostId : Long, executorRestId : Long, requestMethod : String, requestHeader : String, requestBody : String, responseBody : String) : ExecutorRestCallDto = {
    val dtoModified = new ExecutorRestCallDto(this.executorRestCallId,this.guid,this.insertedRowDate,new java.util.Date(),executorHostId,executorRestId,requestMethod,requestHeader,requestBody,responseBody);
    dtoModified
  }
}
object ExecutorRestCallDto {
  val TABLE_NAME = "executorRestCall";
  val FIELD_executorRestCallId = "executorRestCallId";
  val FIELD_guid = "guid";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";
  val FIELD_executorHostId = "executorHostId";
  val FIELD_executorRestId = "executorRestId";
  val FIELD_requestMethod = "requestMethod";
  val FIELD_requestHeader = "requestHeader";
  val FIELD_requestBody = "requestBody";
  val FIELD_responseBody = "responseBody";

  def createNewExecutorRestCallDto(executorHostId : Long, executorRestId : Long, requestMethod : String, requestHeader : String, requestBody : String, responseBody : String) : ExecutorRestCallDto = {
    val dto = new ExecutorRestCallDto(0,0,new java.util.Date(),new java.util.Date(),executorHostId,executorRestId,requestMethod,requestHeader,requestBody,responseBody)
    dto
  }

}


case class ExecutorStorageDto (
                                val executorStorageId : Long
                                , val guid : Long
                                , val executorHostId : Long
                                , val executorStorageTypeId : Long
                                , val storageDefinition : String
                                , val storageBasePath : String
                                , val storageFulllPath : String
                                , val isRunning : Int
                                , val portNumber : Int
                                , val insertedRowDate : java.util.Date
                                , val lastUpdatedDate : java.util.Date
                              ) extends BaseDto {
  def tableName : String = {
    "executorStorage";
  }
  def fields : String = {
    "executorStorageId,guid,executorHostId,executorStorageTypeId,storageDefinition,storageBasePath,storageFulllPath,isRunning,portNumber,insertedRowDate,lastUpdatedDate";
  }
  def pkFields : String = {
    "executorStorageId";
  }
  def fkFields : String = {
    "executorStorageTypeId,executorHostId";
  }
  def nameField : String = {
    "";
  }
  def getPk() : Long = {
    executorStorageId
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
    Array(executorStorageId,guid,executorHostId,executorStorageTypeId,storageDefinition,storageBasePath,storageFulllPath,isRunning,portNumber,insertedRowDate,lastUpdatedDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+executorStorageId,""+guid,""+executorHostId,""+executorStorageTypeId,""+storageDefinition,""+storageBasePath,""+storageFulllPath,""+isRunning,""+portNumber,""+insertedRowDate,""+lastUpdatedDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "executorStorageId" => executorStorageId
      case "guid" => guid
      case "executorHostId" => executorHostId
      case "executorStorageTypeId" => executorStorageTypeId
      case "storageDefinition" => storageDefinition
      case "storageBasePath" => storageBasePath
      case "storageFulllPath" => storageFulllPath
      case "isRunning" => isRunning
      case "portNumber" => portNumber
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "executorStorageId" => "Long"
      case "guid" => "Long"
      case "executorHostId" => "Long"
      case "executorStorageTypeId" => "Long"
      case "storageDefinition" => "String"
      case "storageBasePath" => "String"
      case "storageFulllPath" => "String"
      case "isRunning" => "Int"
      case "portNumber" => "Int"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into executorStorage(guid,executorHostId,executorStorageTypeId,storageDefinition,storageBasePath,storageFulllPath,isRunning,portNumber) values (?,?,?,?,?,?,?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
    stat.setObject(1, guid);
    stat.setObject(2, executorHostId);
    stat.setObject(3, executorStorageTypeId);
    stat.setObject(4, storageDefinition);
    stat.setObject(5, storageBasePath);
    stat.setObject(6, storageFulllPath);
    stat.setObject(7, isRunning);
    stat.setObject(8, portNumber);
    return stat;
  }
  def modify(executorHostId : Long, executorStorageTypeId : Long, storageDefinition : String, storageBasePath : String, storageFulllPath : String, isRunning : Int, portNumber : Int) : ExecutorStorageDto = {
    val dtoModified = new ExecutorStorageDto(this.executorStorageId,this.guid,executorHostId,executorStorageTypeId,storageDefinition,storageBasePath,storageFulllPath,isRunning,portNumber,this.insertedRowDate,new java.util.Date());
    dtoModified
  }
}
object ExecutorStorageDto {
  val TABLE_NAME = "executorStorage";
  val FIELD_executorStorageId = "executorStorageId";
  val FIELD_guid = "guid";
  val FIELD_executorHostId = "executorHostId";
  val FIELD_executorStorageTypeId = "executorStorageTypeId";
  val FIELD_storageDefinition = "storageDefinition";
  val FIELD_storageBasePath = "storageBasePath";
  val FIELD_storageFulllPath = "storageFulllPath";
  val FIELD_isRunning = "isRunning";
  val FIELD_portNumber = "portNumber";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";

  def createNewExecutorStorageDto(executorHostId : Long, executorStorageTypeId : Long, storageDefinition : String, storageBasePath : String, storageFulllPath : String, isRunning : Int, portNumber : Int) : ExecutorStorageDto = {
    val dto = new ExecutorStorageDto(0,0,executorHostId,executorStorageTypeId,storageDefinition,storageBasePath,storageFulllPath,isRunning,portNumber,new java.util.Date(),new java.util.Date())
    dto
  }

}


case class ExecutorStorageSnapshotDto (
                                        val executorStorageSnapshotId : Long
                                        , val executorInstanceId : Long
                                        , val guid : Long
                                        , val insertedRowDate : java.util.Date
                                        , val lastUpdatedDate : java.util.Date
                                      ) extends BaseDto {
  def tableName : String = {
    "executorStorageSnapshot";
  }
  def fields : String = {
    "executorStorageSnapshotId,executorInstanceId,guid,insertedRowDate,lastUpdatedDate";
  }
  def pkFields : String = {
    "executorStorageSnapshotId";
  }
  def fkFields : String = {
    "executorInstanceId";
  }
  def nameField : String = {
    "";
  }
  def getPk() : Long = {
    executorStorageSnapshotId
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
    Array(executorStorageSnapshotId,executorInstanceId,guid,insertedRowDate,lastUpdatedDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+executorStorageSnapshotId,""+executorInstanceId,""+guid,""+insertedRowDate,""+lastUpdatedDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "executorStorageSnapshotId" => executorStorageSnapshotId
      case "executorInstanceId" => executorInstanceId
      case "guid" => guid
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "executorStorageSnapshotId" => "Long"
      case "executorInstanceId" => "Long"
      case "guid" => "Long"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into executorStorageSnapshot(executorInstanceId,guid) values (?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
    stat.setObject(1, executorInstanceId);
    stat.setObject(2, guid);
    return stat;
  }
  def modify(executorInstanceId : Long) : ExecutorStorageSnapshotDto = {
    val dtoModified = new ExecutorStorageSnapshotDto(this.executorStorageSnapshotId,executorInstanceId,this.guid,this.insertedRowDate,new java.util.Date());
    dtoModified
  }
}
object ExecutorStorageSnapshotDto {
  val TABLE_NAME = "executorStorageSnapshot";
  val FIELD_executorStorageSnapshotId = "executorStorageSnapshotId";
  val FIELD_executorInstanceId = "executorInstanceId";
  val FIELD_guid = "guid";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";

  def createNewExecutorStorageSnapshotDto(executorInstanceId : Long) : ExecutorStorageSnapshotDto = {
    val dto = new ExecutorStorageSnapshotDto(0,executorInstanceId,0,new java.util.Date(),new java.util.Date())
    dto
  }

}


case class ExecutorStorageTypeDto (
                                    val executorStorageTypeId : Long
                                    , val guid : Long
                                    , val insertedRowDate : java.util.Date
                                    , val lastUpdatedDate : java.util.Date
                                    , val executorStorageTypeName : String
                                    , val executorStorageTypeClass : String
                                  ) extends BaseDto {
  def tableName : String = {
    "executorStorageType";
  }
  def fields : String = {
    "executorStorageTypeId,guid,insertedRowDate,lastUpdatedDate,executorStorageTypeName,executorStorageTypeClass";
  }
  def pkFields : String = {
    "executorStorageTypeId";
  }
  def fkFields : String = {
    "";
  }
  def nameField : String = {
    "executorStorageTypeName";
  }
  def getPk() : Long = {
    executorStorageTypeId
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
    Array(executorStorageTypeId,guid,insertedRowDate,lastUpdatedDate,executorStorageTypeName,executorStorageTypeClass)
  }
  def toStringArray() : Array[String] = {
    Array(""+executorStorageTypeId,""+guid,""+insertedRowDate,""+lastUpdatedDate,""+executorStorageTypeName,""+executorStorageTypeClass)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "executorStorageTypeId" => executorStorageTypeId
      case "guid" => guid
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case "executorStorageTypeName" => executorStorageTypeName
      case "executorStorageTypeClass" => executorStorageTypeClass
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "executorStorageTypeId" => "Long"
      case "guid" => "Long"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case "executorStorageTypeName" => "String"
      case "executorStorageTypeClass" => "String"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into executorStorageType(guid,executorStorageTypeName,executorStorageTypeClass) values (?,?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
    stat.setObject(1, guid);
    stat.setObject(2, executorStorageTypeName);
    stat.setObject(3, executorStorageTypeClass);
    return stat;
  }
  def modify(executorStorageTypeName : String, executorStorageTypeClass : String) : ExecutorStorageTypeDto = {
    val dtoModified = new ExecutorStorageTypeDto(this.executorStorageTypeId,this.guid,this.insertedRowDate,new java.util.Date(),executorStorageTypeName,executorStorageTypeClass);
    dtoModified
  }
}
object ExecutorStorageTypeDto {
  val TABLE_NAME = "executorStorageType";
  val FIELD_executorStorageTypeId = "executorStorageTypeId";
  val FIELD_guid = "guid";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";
  val FIELD_executorStorageTypeName = "executorStorageTypeName";
  val FIELD_executorStorageTypeClass = "executorStorageTypeClass";

  def createNewExecutorStorageTypeDto(executorStorageTypeName : String, executorStorageTypeClass : String) : ExecutorStorageTypeDto = {
    val dto = new ExecutorStorageTypeDto(0,0,new java.util.Date(),new java.util.Date(),executorStorageTypeName,executorStorageTypeClass)
    dto
  }

}


case class ExecutorStorageViewDto (
                                    val executorStorageViewId : Long
                                    , val guid : Long
                                    , val insertedRowDate : java.util.Date
                                    , val lastUpdatedDate : java.util.Date
                                    , val executorStorageSnapshotId : Long
                                    , val executorStorageId : Long
                                    , val sourceDownloadId : Long
                                    , val storagePath : String
                                    , val viewSize : Long
                                    , val viewRowsCount : Long
                                  ) extends BaseDto {
  def tableName : String = {
    "executorStorageView";
  }
  def fields : String = {
    "executorStorageViewId,guid,insertedRowDate,lastUpdatedDate,executorStorageSnapshotId,executorStorageId,sourceDownloadId,storagePath,viewSize,viewRowsCount";
  }
  def pkFields : String = {
    "executorStorageViewId";
  }
  def fkFields : String = {
    "executorStorageId";
  }
  def nameField : String = {
    "";
  }
  def getPk() : Long = {
    executorStorageViewId
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
    Array(executorStorageViewId,guid,insertedRowDate,lastUpdatedDate,executorStorageSnapshotId,executorStorageId,sourceDownloadId,storagePath,viewSize,viewRowsCount)
  }
  def toStringArray() : Array[String] = {
    Array(""+executorStorageViewId,""+guid,""+insertedRowDate,""+lastUpdatedDate,""+executorStorageSnapshotId,""+executorStorageId,""+sourceDownloadId,""+storagePath,""+viewSize,""+viewRowsCount)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "executorStorageViewId" => executorStorageViewId
      case "guid" => guid
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case "executorStorageSnapshotId" => executorStorageSnapshotId
      case "executorStorageId" => executorStorageId
      case "sourceDownloadId" => sourceDownloadId
      case "storagePath" => storagePath
      case "viewSize" => viewSize
      case "viewRowsCount" => viewRowsCount
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "executorStorageViewId" => "Long"
      case "guid" => "Long"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case "executorStorageSnapshotId" => "Long"
      case "executorStorageId" => "Long"
      case "sourceDownloadId" => "Long"
      case "storagePath" => "String"
      case "viewSize" => "Long"
      case "viewRowsCount" => "Long"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into executorStorageView(guid,executorStorageSnapshotId,executorStorageId,sourceDownloadId,storagePath,viewSize,viewRowsCount) values (?,?,?,?,?,?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
    stat.setObject(1, guid);
    stat.setObject(2, executorStorageSnapshotId);
    stat.setObject(3, executorStorageId);
    stat.setObject(4, sourceDownloadId);
    stat.setObject(5, storagePath);
    stat.setObject(6, viewSize);
    stat.setObject(7, viewRowsCount);
    return stat;
  }
  def modify(executorStorageSnapshotId : Long, executorStorageId : Long, sourceDownloadId : Long, storagePath : String, viewSize : Long, viewRowsCount : Long) : ExecutorStorageViewDto = {
    val dtoModified = new ExecutorStorageViewDto(this.executorStorageViewId,this.guid,this.insertedRowDate,new java.util.Date(),executorStorageSnapshotId,executorStorageId,sourceDownloadId,storagePath,viewSize,viewRowsCount);
    dtoModified
  }
}
object ExecutorStorageViewDto {
  val TABLE_NAME = "executorStorageView";
  val FIELD_executorStorageViewId = "executorStorageViewId";
  val FIELD_guid = "guid";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";
  val FIELD_executorStorageSnapshotId = "executorStorageSnapshotId";
  val FIELD_executorStorageId = "executorStorageId";
  val FIELD_sourceDownloadId = "sourceDownloadId";
  val FIELD_storagePath = "storagePath";
  val FIELD_viewSize = "viewSize";
  val FIELD_viewRowsCount = "viewRowsCount";

  def createNewExecutorStorageViewDto(executorStorageSnapshotId : Long, executorStorageId : Long, sourceDownloadId : Long, storagePath : String, viewSize : Long, viewRowsCount : Long) : ExecutorStorageViewDto = {
    val dto = new ExecutorStorageViewDto(0,0,new java.util.Date(),new java.util.Date(),executorStorageSnapshotId,executorStorageId,sourceDownloadId,storagePath,viewSize,viewRowsCount)
    dto
  }

}


case class ExecutorTypeDto (
                             val executorTypeId : Long
                             , val guid : Long
                             , val insertedRowDate : java.util.Date
                             , val lastUpdatedDate : java.util.Date
                             , val executorTypeName : String
                             , val executorTypeClass : String
                           ) extends BaseDto {
  def tableName : String = {
    "executorType";
  }
  def fields : String = {
    "executorTypeId,guid,insertedRowDate,lastUpdatedDate,executorTypeName,executorTypeClass";
  }
  def pkFields : String = {
    "executorTypeId";
  }
  def fkFields : String = {
    "";
  }
  def nameField : String = {
    "executorTypeName";
  }
  def getPk() : Long = {
    executorTypeId
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
    Array(executorTypeId,guid,insertedRowDate,lastUpdatedDate,executorTypeName,executorTypeClass)
  }
  def toStringArray() : Array[String] = {
    Array(""+executorTypeId,""+guid,""+insertedRowDate,""+lastUpdatedDate,""+executorTypeName,""+executorTypeClass)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "executorTypeId" => executorTypeId
      case "guid" => guid
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case "executorTypeName" => executorTypeName
      case "executorTypeClass" => executorTypeClass
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "executorTypeId" => "Long"
      case "guid" => "Long"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case "executorTypeName" => "String"
      case "executorTypeClass" => "String"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into executorType(guid,executorTypeName,executorTypeClass) values (?,?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
    stat.setObject(1, guid);
    stat.setObject(2, executorTypeName);
    stat.setObject(3, executorTypeClass);
    return stat;
  }
  def modify(executorTypeName : String, executorTypeClass : String) : ExecutorTypeDto = {
    val dtoModified = new ExecutorTypeDto(this.executorTypeId,this.guid,this.insertedRowDate,new java.util.Date(),executorTypeName,executorTypeClass);
    dtoModified
  }
}
object ExecutorTypeDto {
  val TABLE_NAME = "executorType";
  val FIELD_executorTypeId = "executorTypeId";
  val FIELD_guid = "guid";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";
  val FIELD_executorTypeName = "executorTypeName";
  val FIELD_executorTypeClass = "executorTypeClass";

  def createNewExecutorTypeDto(executorTypeName : String, executorTypeClass : String) : ExecutorTypeDto = {
    val dto = new ExecutorTypeDto(0,0,new java.util.Date(),new java.util.Date(),executorTypeName,executorTypeClass)
    dto
  }

}


case class ResourceManagerDto (
                                val resourceManagerId : Long
                                , val guid : Long
                                , val resourceManagerTypeId : Long
                                , val executorHostId : Long
                                , val resourceManagerStatus : String
                                , val insertedRowDate : java.util.Date
                                , val lastUpdatedDate : java.util.Date
                              ) extends BaseDto {
  def tableName : String = {
    "resourceManager";
  }
  def fields : String = {
    "resourceManagerId,guid,resourceManagerTypeId,executorHostId,resourceManagerStatus,insertedRowDate,lastUpdatedDate";
  }
  def pkFields : String = {
    "resourceManagerId";
  }
  def fkFields : String = {
    "executorHostId,resourceManagerTypeId";
  }
  def nameField : String = {
    "";
  }
  def getPk() : Long = {
    resourceManagerId
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
    Array(resourceManagerId,guid,resourceManagerTypeId,executorHostId,resourceManagerStatus,insertedRowDate,lastUpdatedDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+resourceManagerId,""+guid,""+resourceManagerTypeId,""+executorHostId,""+resourceManagerStatus,""+insertedRowDate,""+lastUpdatedDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "resourceManagerId" => resourceManagerId
      case "guid" => guid
      case "resourceManagerTypeId" => resourceManagerTypeId
      case "executorHostId" => executorHostId
      case "resourceManagerStatus" => resourceManagerStatus
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "resourceManagerId" => "Long"
      case "guid" => "Long"
      case "resourceManagerTypeId" => "Long"
      case "executorHostId" => "Long"
      case "resourceManagerStatus" => "String"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into resourceManager(guid,resourceManagerTypeId,executorHostId,resourceManagerStatus) values (?,?,?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
    stat.setObject(1, guid);
    stat.setObject(2, resourceManagerTypeId);
    stat.setObject(3, executorHostId);
    stat.setObject(4, resourceManagerStatus);
    return stat;
  }
  def modify(resourceManagerTypeId : Long, executorHostId : Long, resourceManagerStatus : String) : ResourceManagerDto = {
    val dtoModified = new ResourceManagerDto(this.resourceManagerId,this.guid,resourceManagerTypeId,executorHostId,resourceManagerStatus,this.insertedRowDate,new java.util.Date());
    dtoModified
  }
}
object ResourceManagerDto {
  val TABLE_NAME = "resourceManager";
  val FIELD_resourceManagerId = "resourceManagerId";
  val FIELD_guid = "guid";
  val FIELD_resourceManagerTypeId = "resourceManagerTypeId";
  val FIELD_executorHostId = "executorHostId";
  val FIELD_resourceManagerStatus = "resourceManagerStatus";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";

  def createNewResourceManagerDto(resourceManagerTypeId : Long, executorHostId : Long, resourceManagerStatus : String) : ResourceManagerDto = {
    val dto = new ResourceManagerDto(0,0,resourceManagerTypeId,executorHostId,resourceManagerStatus,new java.util.Date(),new java.util.Date())
    dto
  }

}


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
  def tableName : String = {
    "resourceManagerAllocation";
  }
  def fields : String = {
    "resourceManagerAllocationId,guid,insertedRowDate,lastUpdatedDate,resourceManagerTypeId,resourceManagerId,executorHostId,executorInstanceId,resourceMeasureId,allocationValue,allocationValueMin,allocationValueMax";
  }
  def pkFields : String = {
    "resourceManagerAllocationId";
  }
  def fkFields : String = {
    "";
  }
  def nameField : String = {
    "";
  }
  def getPk() : Long = {
    resourceManagerAllocationId
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
    Array(resourceManagerAllocationId,guid,insertedRowDate,lastUpdatedDate,resourceManagerTypeId,resourceManagerId,executorHostId,executorInstanceId,resourceMeasureId,allocationValue,allocationValueMin,allocationValueMax)
  }
  def toStringArray() : Array[String] = {
    Array(""+resourceManagerAllocationId,""+guid,""+insertedRowDate,""+lastUpdatedDate,""+resourceManagerTypeId,""+resourceManagerId,""+executorHostId,""+executorInstanceId,""+resourceMeasureId,""+allocationValue,""+allocationValueMin,""+allocationValueMax)
  }
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


case class ResourceManagerCheckDto (
                                     val resourceManagerCheckId : Long
                                     , val guid : Long
                                     , val resourceManagerId : Long
                                     , val executorHostId : Long
                                     , val resourceManagerStatus : String
                                     , val insertedRowDate : java.util.Date
                                     , val lastUpdatedDate : java.util.Date
                                   ) extends BaseDto {
  def tableName : String = {
    "resourceManagerCheck";
  }
  def fields : String = {
    "resourceManagerCheckId,guid,resourceManagerId,executorHostId,resourceManagerStatus,insertedRowDate,lastUpdatedDate";
  }
  def pkFields : String = {
    "resourceManagerCheckId";
  }
  def fkFields : String = {
    "";
  }
  def nameField : String = {
    "";
  }
  def getPk() : Long = {
    resourceManagerCheckId
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
    Array(resourceManagerCheckId,guid,resourceManagerId,executorHostId,resourceManagerStatus,insertedRowDate,lastUpdatedDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+resourceManagerCheckId,""+guid,""+resourceManagerId,""+executorHostId,""+resourceManagerStatus,""+insertedRowDate,""+lastUpdatedDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "resourceManagerCheckId" => resourceManagerCheckId
      case "guid" => guid
      case "resourceManagerId" => resourceManagerId
      case "executorHostId" => executorHostId
      case "resourceManagerStatus" => resourceManagerStatus
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "resourceManagerCheckId" => "Long"
      case "guid" => "Long"
      case "resourceManagerId" => "Long"
      case "executorHostId" => "Long"
      case "resourceManagerStatus" => "String"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into resourceManagerCheck(guid,resourceManagerId,executorHostId,resourceManagerStatus) values (?,?,?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
    stat.setObject(1, guid);
    stat.setObject(2, resourceManagerId);
    stat.setObject(3, executorHostId);
    stat.setObject(4, resourceManagerStatus);
    return stat;
  }
  def modify(resourceManagerId : Long, executorHostId : Long, resourceManagerStatus : String) : ResourceManagerCheckDto = {
    val dtoModified = new ResourceManagerCheckDto(this.resourceManagerCheckId,this.guid,resourceManagerId,executorHostId,resourceManagerStatus,this.insertedRowDate,new java.util.Date());
    dtoModified
  }
}
object ResourceManagerCheckDto {
  val TABLE_NAME = "resourceManagerCheck";
  val FIELD_resourceManagerCheckId = "resourceManagerCheckId";
  val FIELD_guid = "guid";
  val FIELD_resourceManagerId = "resourceManagerId";
  val FIELD_executorHostId = "executorHostId";
  val FIELD_resourceManagerStatus = "resourceManagerStatus";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";

  def createNewResourceManagerCheckDto(resourceManagerId : Long, executorHostId : Long, resourceManagerStatus : String) : ResourceManagerCheckDto = {
    val dto = new ResourceManagerCheckDto(0,0,resourceManagerId,executorHostId,resourceManagerStatus,new java.util.Date(),new java.util.Date())
    dto
  }

}


case class ResourceManagerMeasureDto (
                                       val resourceManagerMeasureId : Long
                                       , val guid : Long
                                       , val resourceManagerId : Long
                                       , val resourceMeasureId : Long
                                       , val measureString : String
                                       , val measureValue : Double
                                       , val insertedRowDate : java.util.Date
                                       , val lastUpdatedDate : java.util.Date
                                     ) extends BaseDto {
  def tableName : String = {
    "resourceManagerMeasure";
  }
  def fields : String = {
    "resourceManagerMeasureId,guid,resourceManagerId,resourceMeasureId,measureString,measureValue,insertedRowDate,lastUpdatedDate";
  }
  def pkFields : String = {
    "resourceManagerMeasureId";
  }
  def fkFields : String = {
    "resourceManagerId,resourceMeasureId";
  }
  def nameField : String = {
    "";
  }
  def getPk() : Long = {
    resourceManagerMeasureId
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
    Array(resourceManagerMeasureId,guid,resourceManagerId,resourceMeasureId,measureString,measureValue,insertedRowDate,lastUpdatedDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+resourceManagerMeasureId,""+guid,""+resourceManagerId,""+resourceMeasureId,""+measureString,""+measureValue,""+insertedRowDate,""+lastUpdatedDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "resourceManagerMeasureId" => resourceManagerMeasureId
      case "guid" => guid
      case "resourceManagerId" => resourceManagerId
      case "resourceMeasureId" => resourceMeasureId
      case "measureString" => measureString
      case "measureValue" => measureValue
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "resourceManagerMeasureId" => "Long"
      case "guid" => "Long"
      case "resourceManagerId" => "Long"
      case "resourceMeasureId" => "Long"
      case "measureString" => "String"
      case "measureValue" => "Double"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into resourceManagerMeasure(guid,resourceManagerId,resourceMeasureId,measureString,measureValue) values (?,?,?,?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
    stat.setObject(1, guid);
    stat.setObject(2, resourceManagerId);
    stat.setObject(3, resourceMeasureId);
    stat.setObject(4, measureString);
    stat.setObject(5, measureValue);
    return stat;
  }
  def modify(resourceManagerId : Long, resourceMeasureId : Long, measureString : String, measureValue : Double) : ResourceManagerMeasureDto = {
    val dtoModified = new ResourceManagerMeasureDto(this.resourceManagerMeasureId,this.guid,resourceManagerId,resourceMeasureId,measureString,measureValue,this.insertedRowDate,new java.util.Date());
    dtoModified
  }
}
object ResourceManagerMeasureDto {
  val TABLE_NAME = "resourceManagerMeasure";
  val FIELD_resourceManagerMeasureId = "resourceManagerMeasureId";
  val FIELD_guid = "guid";
  val FIELD_resourceManagerId = "resourceManagerId";
  val FIELD_resourceMeasureId = "resourceMeasureId";
  val FIELD_measureString = "measureString";
  val FIELD_measureValue = "measureValue";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";

  def createNewResourceManagerMeasureDto(resourceManagerId : Long, resourceMeasureId : Long, measureString : String, measureValue : Double) : ResourceManagerMeasureDto = {
    val dto = new ResourceManagerMeasureDto(0,0,resourceManagerId,resourceMeasureId,measureString,measureValue,new java.util.Date(),new java.util.Date())
    dto
  }

}


case class ResourceManagerTypeDto (
                                    val resourceManagerTypeId : Long
                                    , val guid : Long
                                    , val resourceManagerTypeName : String
                                    , val resourceManagerTypeClass : String
                                    , val insertedRowDate : java.util.Date
                                    , val lastUpdatedDate : java.util.Date
                                  ) extends BaseDto {
  def tableName : String = {
    "resourceManagerType";
  }
  def fields : String = {
    "resourceManagerTypeId,guid,resourceManagerTypeName,resourceManagerTypeClass,insertedRowDate,lastUpdatedDate";
  }
  def pkFields : String = {
    "resourceManagerTypeId";
  }
  def fkFields : String = {
    "";
  }
  def nameField : String = {
    "resourceManagerTypeName";
  }
  def getPk() : Long = {
    resourceManagerTypeId
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
    Array(resourceManagerTypeId,guid,resourceManagerTypeName,resourceManagerTypeClass,insertedRowDate,lastUpdatedDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+resourceManagerTypeId,""+guid,""+resourceManagerTypeName,""+resourceManagerTypeClass,""+insertedRowDate,""+lastUpdatedDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "resourceManagerTypeId" => resourceManagerTypeId
      case "guid" => guid
      case "resourceManagerTypeName" => resourceManagerTypeName
      case "resourceManagerTypeClass" => resourceManagerTypeClass
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "resourceManagerTypeId" => "Long"
      case "guid" => "Long"
      case "resourceManagerTypeName" => "String"
      case "resourceManagerTypeClass" => "String"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into resourceManagerType(guid,resourceManagerTypeName,resourceManagerTypeClass) values (?,?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
    stat.setObject(1, guid);
    stat.setObject(2, resourceManagerTypeName);
    stat.setObject(3, resourceManagerTypeClass);
    return stat;
  }
  def modify(resourceManagerTypeName : String, resourceManagerTypeClass : String) : ResourceManagerTypeDto = {
    val dtoModified = new ResourceManagerTypeDto(this.resourceManagerTypeId,this.guid,resourceManagerTypeName,resourceManagerTypeClass,this.insertedRowDate,new java.util.Date());
    dtoModified
  }
}
object ResourceManagerTypeDto {
  val TABLE_NAME = "resourceManagerType";
  val FIELD_resourceManagerTypeId = "resourceManagerTypeId";
  val FIELD_guid = "guid";
  val FIELD_resourceManagerTypeName = "resourceManagerTypeName";
  val FIELD_resourceManagerTypeClass = "resourceManagerTypeClass";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";

  def createNewResourceManagerTypeDto(resourceManagerTypeName : String, resourceManagerTypeClass : String) : ResourceManagerTypeDto = {
    val dto = new ResourceManagerTypeDto(0,0,resourceManagerTypeName,resourceManagerTypeClass,new java.util.Date(),new java.util.Date())
    dto
  }

}


case class ResourceMeasureDto (
                                val resourceMeasureId : Long
                                , val guid : Long
                                , val resourceMeasureName : String
                                , val insertedRowDate : java.util.Date
                                , val lastUpdatedDate : java.util.Date
                              ) extends BaseDto {
  def tableName : String = {
    "resourceMeasure";
  }
  def fields : String = {
    "resourceMeasureId,guid,resourceMeasureName,insertedRowDate,lastUpdatedDate";
  }
  def pkFields : String = {
    "resourceMeasureId";
  }
  def fkFields : String = {
    "";
  }
  def nameField : String = {
    "resourceMeasureName";
  }
  def getPk() : Long = {
    resourceMeasureId
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
    Array(resourceMeasureId,guid,resourceMeasureName,insertedRowDate,lastUpdatedDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+resourceMeasureId,""+guid,""+resourceMeasureName,""+insertedRowDate,""+lastUpdatedDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "resourceMeasureId" => resourceMeasureId
      case "guid" => guid
      case "resourceMeasureName" => resourceMeasureName
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "resourceMeasureId" => "Long"
      case "guid" => "Long"
      case "resourceMeasureName" => "String"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into resourceMeasure(guid,resourceMeasureName) values (?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
    stat.setObject(1, guid);
    stat.setObject(2, resourceMeasureName);
    return stat;
  }
  def modify(resourceMeasureName : String) : ResourceMeasureDto = {
    val dtoModified = new ResourceMeasureDto(this.resourceMeasureId,this.guid,resourceMeasureName,this.insertedRowDate,new java.util.Date());
    dtoModified
  }
}
object ResourceMeasureDto {
  val TABLE_NAME = "resourceMeasure";
  val FIELD_resourceMeasureId = "resourceMeasureId";
  val FIELD_guid = "guid";
  val FIELD_resourceMeasureName = "resourceMeasureName";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";

  def createNewResourceMeasureDto(resourceMeasureName : String) : ResourceMeasureDto = {
    val dto = new ResourceMeasureDto(0,0,resourceMeasureName,new java.util.Date(),new java.util.Date())
    dto
  }

}


case class SourceDownloadDto (
                               val sourceDownloadId : Long
                               , val sourceScheduleId : Long
                               , val insertedRowDate : java.util.Date
                               , val lastUpdatedDate : java.util.Date
                               , val guid : Long
                               , val retryNumber : Int
                               , val isRunning : Int
                               , val isFinished : Int
                               , val isExcecption : Int
                               , val excecptionDescription : String
                             ) extends BaseDto {
  def tableName : String = {
    "sourceDownload";
  }
  def fields : String = {
    "sourceDownloadId,sourceScheduleId,insertedRowDate,lastUpdatedDate,guid,retryNumber,isRunning,isFinished,isExcecption,excecptionDescription";
  }
  def pkFields : String = {
    "sourceDownloadId";
  }
  def fkFields : String = {
    "sourceScheduleId";
  }
  def nameField : String = {
    "";
  }
  def getPk() : Long = {
    sourceDownloadId
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
    Array(sourceDownloadId,sourceScheduleId,insertedRowDate,lastUpdatedDate,guid,retryNumber,isRunning,isFinished,isExcecption,excecptionDescription)
  }
  def toStringArray() : Array[String] = {
    Array(""+sourceDownloadId,""+sourceScheduleId,""+insertedRowDate,""+lastUpdatedDate,""+guid,""+retryNumber,""+isRunning,""+isFinished,""+isExcecption,""+excecptionDescription)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "sourceDownloadId" => sourceDownloadId
      case "sourceScheduleId" => sourceScheduleId
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case "guid" => guid
      case "retryNumber" => retryNumber
      case "isRunning" => isRunning
      case "isFinished" => isFinished
      case "isExcecption" => isExcecption
      case "excecptionDescription" => excecptionDescription
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "sourceDownloadId" => "Long"
      case "sourceScheduleId" => "Long"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case "guid" => "Long"
      case "retryNumber" => "Int"
      case "isRunning" => "Int"
      case "isFinished" => "Int"
      case "isExcecption" => "Int"
      case "excecptionDescription" => "String"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into sourceDownload(sourceScheduleId,guid,retryNumber,isRunning,isFinished,isExcecption,excecptionDescription) values (?,?,?,?,?,?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
    stat.setObject(1, sourceScheduleId);
    stat.setObject(2, guid);
    stat.setObject(3, retryNumber);
    stat.setObject(4, isRunning);
    stat.setObject(5, isFinished);
    stat.setObject(6, isExcecption);
    stat.setObject(7, excecptionDescription);
    return stat;
  }
  def modify(sourceScheduleId : Long, retryNumber : Int, isRunning : Int, isFinished : Int, isExcecption : Int, excecptionDescription : String) : SourceDownloadDto = {
    val dtoModified = new SourceDownloadDto(this.sourceDownloadId,sourceScheduleId,this.insertedRowDate,new java.util.Date(),this.guid,retryNumber,isRunning,isFinished,isExcecption,excecptionDescription);
    dtoModified
  }
}
object SourceDownloadDto {
  val TABLE_NAME = "sourceDownload";
  val FIELD_sourceDownloadId = "sourceDownloadId";
  val FIELD_sourceScheduleId = "sourceScheduleId";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";
  val FIELD_guid = "guid";
  val FIELD_retryNumber = "retryNumber";
  val FIELD_isRunning = "isRunning";
  val FIELD_isFinished = "isFinished";
  val FIELD_isExcecption = "isExcecption";
  val FIELD_excecptionDescription = "excecptionDescription";

  def createNewSourceDownloadDto(sourceScheduleId : Long, retryNumber : Int, isRunning : Int, isFinished : Int, isExcecption : Int, excecptionDescription : String) : SourceDownloadDto = {
    val dto = new SourceDownloadDto(0,sourceScheduleId,new java.util.Date(),new java.util.Date(),0,retryNumber,isRunning,isFinished,isExcecption,excecptionDescription)
    dto
  }

}


case class SourceDownloadStatDto (
                                   val sourceDownloadStatId : Long
                                   , val guid : Long
                                   , val sourceDownloadId : Long
                                   , val insertedRowDate : java.util.Date
                                   , val lastUpdatedDate : java.util.Date
                                   , val rowsCount : Long
                                   , val errorRowsCount : Long
                                   , val totalBytesCount : Long
                                   , val empryRowsCount : Long
                                 ) extends BaseDto {
  def tableName : String = {
    "sourceDownloadStat";
  }
  def fields : String = {
    "sourceDownloadStatId,guid,sourceDownloadId,insertedRowDate,lastUpdatedDate,rowsCount,errorRowsCount,totalBytesCount,empryRowsCount";
  }
  def pkFields : String = {
    "sourceDownloadStatId";
  }
  def fkFields : String = {
    "sourceDownloadId";
  }
  def nameField : String = {
    "";
  }
  def getPk() : Long = {
    sourceDownloadStatId
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
    Array(sourceDownloadStatId,guid,sourceDownloadId,insertedRowDate,lastUpdatedDate,rowsCount,errorRowsCount,totalBytesCount,empryRowsCount)
  }
  def toStringArray() : Array[String] = {
    Array(""+sourceDownloadStatId,""+guid,""+sourceDownloadId,""+insertedRowDate,""+lastUpdatedDate,""+rowsCount,""+errorRowsCount,""+totalBytesCount,""+empryRowsCount)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "sourceDownloadStatId" => sourceDownloadStatId
      case "guid" => guid
      case "sourceDownloadId" => sourceDownloadId
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case "rowsCount" => rowsCount
      case "errorRowsCount" => errorRowsCount
      case "totalBytesCount" => totalBytesCount
      case "empryRowsCount" => empryRowsCount
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "sourceDownloadStatId" => "Long"
      case "guid" => "Long"
      case "sourceDownloadId" => "Long"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case "rowsCount" => "Long"
      case "errorRowsCount" => "Long"
      case "totalBytesCount" => "Long"
      case "empryRowsCount" => "Long"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into sourceDownloadStat(guid,sourceDownloadId,rowsCount,errorRowsCount,totalBytesCount,empryRowsCount) values (?,?,?,?,?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
    stat.setObject(1, guid);
    stat.setObject(2, sourceDownloadId);
    stat.setObject(3, rowsCount);
    stat.setObject(4, errorRowsCount);
    stat.setObject(5, totalBytesCount);
    stat.setObject(6, empryRowsCount);
    return stat;
  }
  def modify(sourceDownloadId : Long, rowsCount : Long, errorRowsCount : Long, totalBytesCount : Long, empryRowsCount : Long) : SourceDownloadStatDto = {
    val dtoModified = new SourceDownloadStatDto(this.sourceDownloadStatId,this.guid,sourceDownloadId,this.insertedRowDate,new java.util.Date(),rowsCount,errorRowsCount,totalBytesCount,empryRowsCount);
    dtoModified
  }
}
object SourceDownloadStatDto {
  val TABLE_NAME = "sourceDownloadStat";
  val FIELD_sourceDownloadStatId = "sourceDownloadStatId";
  val FIELD_guid = "guid";
  val FIELD_sourceDownloadId = "sourceDownloadId";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";
  val FIELD_rowsCount = "rowsCount";
  val FIELD_errorRowsCount = "errorRowsCount";
  val FIELD_totalBytesCount = "totalBytesCount";
  val FIELD_empryRowsCount = "empryRowsCount";

  def createNewSourceDownloadStatDto(sourceDownloadId : Long, rowsCount : Long, errorRowsCount : Long, totalBytesCount : Long, empryRowsCount : Long) : SourceDownloadStatDto = {
    val dto = new SourceDownloadStatDto(0,0,sourceDownloadId,new java.util.Date(),new java.util.Date(),rowsCount,errorRowsCount,totalBytesCount,empryRowsCount)
    dto
  }

}


case class SourceDownloadStatColumnDto (
                                         val sourceDownloadStatColumnId : Long
                                         , val guid : Long
                                         , val sourceDownloadId : Long
                                         , val sourceViewColumnId : Long
                                         , val insertedRowDate : java.util.Date
                                         , val lastUpdatedDate : java.util.Date
                                         , val columnMinNumber : Double
                                         , val columnMaxNumber : Double
                                         , val columnMinStr : String
                                         , val columnMaxStr : String
                                         , val columnNonemptyCount : Long
                                       ) extends BaseDto {
  def tableName : String = {
    "sourceDownloadStatColumn";
  }
  def fields : String = {
    "sourceDownloadStatColumnId,guid,sourceDownloadId,sourceViewColumnId,insertedRowDate,lastUpdatedDate,columnMinNumber,columnMaxNumber,columnMinStr,columnMaxStr,columnNonemptyCount";
  }
  def pkFields : String = {
    "sourceDownloadStatColumnId";
  }
  def fkFields : String = {
    "sourceDownloadId,sourceViewColumnId";
  }
  def nameField : String = {
    "";
  }
  def getPk() : Long = {
    sourceDownloadStatColumnId
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
    Array(sourceDownloadStatColumnId,guid,sourceDownloadId,sourceViewColumnId,insertedRowDate,lastUpdatedDate,columnMinNumber,columnMaxNumber,columnMinStr,columnMaxStr,columnNonemptyCount)
  }
  def toStringArray() : Array[String] = {
    Array(""+sourceDownloadStatColumnId,""+guid,""+sourceDownloadId,""+sourceViewColumnId,""+insertedRowDate,""+lastUpdatedDate,""+columnMinNumber,""+columnMaxNumber,""+columnMinStr,""+columnMaxStr,""+columnNonemptyCount)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "sourceDownloadStatColumnId" => sourceDownloadStatColumnId
      case "guid" => guid
      case "sourceDownloadId" => sourceDownloadId
      case "sourceViewColumnId" => sourceViewColumnId
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case "columnMinNumber" => columnMinNumber
      case "columnMaxNumber" => columnMaxNumber
      case "columnMinStr" => columnMinStr
      case "columnMaxStr" => columnMaxStr
      case "columnNonemptyCount" => columnNonemptyCount
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "sourceDownloadStatColumnId" => "Long"
      case "guid" => "Long"
      case "sourceDownloadId" => "Long"
      case "sourceViewColumnId" => "Long"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case "columnMinNumber" => "Double"
      case "columnMaxNumber" => "Double"
      case "columnMinStr" => "String"
      case "columnMaxStr" => "String"
      case "columnNonemptyCount" => "Long"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into sourceDownloadStatColumn(guid,sourceDownloadId,sourceViewColumnId,columnMinNumber,columnMaxNumber,columnMinStr,columnMaxStr,columnNonemptyCount) values (?,?,?,?,?,?,?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
    stat.setObject(1, guid);
    stat.setObject(2, sourceDownloadId);
    stat.setObject(3, sourceViewColumnId);
    stat.setObject(4, columnMinNumber);
    stat.setObject(5, columnMaxNumber);
    stat.setObject(6, columnMinStr);
    stat.setObject(7, columnMaxStr);
    stat.setObject(8, columnNonemptyCount);
    return stat;
  }
  def modify(sourceDownloadId : Long, sourceViewColumnId : Long, columnMinNumber : Double, columnMaxNumber : Double, columnMinStr : String, columnMaxStr : String, columnNonemptyCount : Long) : SourceDownloadStatColumnDto = {
    val dtoModified = new SourceDownloadStatColumnDto(this.sourceDownloadStatColumnId,this.guid,sourceDownloadId,sourceViewColumnId,this.insertedRowDate,new java.util.Date(),columnMinNumber,columnMaxNumber,columnMinStr,columnMaxStr,columnNonemptyCount);
    dtoModified
  }
}
object SourceDownloadStatColumnDto {
  val TABLE_NAME = "sourceDownloadStatColumn";
  val FIELD_sourceDownloadStatColumnId = "sourceDownloadStatColumnId";
  val FIELD_guid = "guid";
  val FIELD_sourceDownloadId = "sourceDownloadId";
  val FIELD_sourceViewColumnId = "sourceViewColumnId";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";
  val FIELD_columnMinNumber = "columnMinNumber";
  val FIELD_columnMaxNumber = "columnMaxNumber";
  val FIELD_columnMinStr = "columnMinStr";
  val FIELD_columnMaxStr = "columnMaxStr";
  val FIELD_columnNonemptyCount = "columnNonemptyCount";

  def createNewSourceDownloadStatColumnDto(sourceDownloadId : Long, sourceViewColumnId : Long, columnMinNumber : Double, columnMaxNumber : Double, columnMinStr : String, columnMaxStr : String, columnNonemptyCount : Long) : SourceDownloadStatColumnDto = {
    val dto = new SourceDownloadStatColumnDto(0,0,sourceDownloadId,sourceViewColumnId,new java.util.Date(),new java.util.Date(),columnMinNumber,columnMaxNumber,columnMinStr,columnMaxStr,columnNonemptyCount)
    dto
  }

}


case class SourceInstanceDto (
                               val sourceInstanceId : Long
                               , val guid : Long
                               , val sourceTypeId : Long
                               , val sourceInstanceName : String
                               , val errorCount : Long
                               , val correctCount : Long
                               , val lastStatus : String
                               , val lastConnectionDate : java.util.Date
                               , val insertedRowDate : java.util.Date
                               , val lastUpdatedDate : java.util.Date
                             ) extends BaseDto {
  def tableName : String = {
    "sourceInstance";
  }
  def fields : String = {
    "sourceInstanceId,guid,sourceTypeId,sourceInstanceName,errorCount,correctCount,lastStatus,lastConnectionDate,insertedRowDate,lastUpdatedDate";
  }
  def pkFields : String = {
    "sourceInstanceId";
  }
  def fkFields : String = {
    "sourceTypeId";
  }
  def nameField : String = {
    "sourceInstanceName";
  }
  def getPk() : Long = {
    sourceInstanceId
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
    Array(sourceInstanceId,guid,sourceTypeId,sourceInstanceName,errorCount,correctCount,lastStatus,lastConnectionDate,insertedRowDate,lastUpdatedDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+sourceInstanceId,""+guid,""+sourceTypeId,""+sourceInstanceName,""+errorCount,""+correctCount,""+lastStatus,""+lastConnectionDate,""+insertedRowDate,""+lastUpdatedDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "sourceInstanceId" => sourceInstanceId
      case "guid" => guid
      case "sourceTypeId" => sourceTypeId
      case "sourceInstanceName" => sourceInstanceName
      case "errorCount" => errorCount
      case "correctCount" => correctCount
      case "lastStatus" => lastStatus
      case "lastConnectionDate" => lastConnectionDate
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "sourceInstanceId" => "Long"
      case "guid" => "Long"
      case "sourceTypeId" => "Long"
      case "sourceInstanceName" => "String"
      case "errorCount" => "Long"
      case "correctCount" => "Long"
      case "lastStatus" => "String"
      case "lastConnectionDate" => "java.util.Date"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into sourceInstance(guid,sourceTypeId,sourceInstanceName,errorCount,correctCount,lastStatus,lastConnectionDate) values (?,?,?,?,?,?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
    stat.setObject(1, guid);
    stat.setObject(2, sourceTypeId);
    stat.setObject(3, sourceInstanceName);
    stat.setObject(4, errorCount);
    stat.setObject(5, correctCount);
    stat.setObject(6, lastStatus);
    stat.setObject(7, lastConnectionDate);
    return stat;
  }
  def modify(sourceTypeId : Long, sourceInstanceName : String, errorCount : Long, correctCount : Long, lastStatus : String, lastConnectionDate : java.util.Date) : SourceInstanceDto = {
    val dtoModified = new SourceInstanceDto(this.sourceInstanceId,this.guid,sourceTypeId,sourceInstanceName,errorCount,correctCount,lastStatus,lastConnectionDate,this.insertedRowDate,new java.util.Date());
    dtoModified
  }
}
object SourceInstanceDto {
  val TABLE_NAME = "sourceInstance";
  val FIELD_sourceInstanceId = "sourceInstanceId";
  val FIELD_guid = "guid";
  val FIELD_sourceTypeId = "sourceTypeId";
  val FIELD_sourceInstanceName = "sourceInstanceName";
  val FIELD_errorCount = "errorCount";
  val FIELD_correctCount = "correctCount";
  val FIELD_lastStatus = "lastStatus";
  val FIELD_lastConnectionDate = "lastConnectionDate";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";

  def createNewSourceInstanceDto(sourceTypeId : Long, sourceInstanceName : String, errorCount : Long, correctCount : Long, lastStatus : String, lastConnectionDate : java.util.Date) : SourceInstanceDto = {
    val dto = new SourceInstanceDto(0,0,sourceTypeId,sourceInstanceName,errorCount,correctCount,lastStatus,lastConnectionDate,new java.util.Date(),new java.util.Date())
    dto
  }

}


case class SourceParamDto (
                            val sourceParamId : Long
                            , val guid : Long
                            , val sourceParamName : String
                            , val sourceParamType : String
                            , val possibleValues : String
                            , val insertedRowDate : java.util.Date
                            , val lastUpdatedDate : java.util.Date
                          ) extends BaseDto {
  def tableName : String = {
    "sourceParam";
  }
  def fields : String = {
    "sourceParamId,guid,sourceParamName,sourceParamType,possibleValues,insertedRowDate,lastUpdatedDate";
  }
  def pkFields : String = {
    "sourceParamId";
  }
  def fkFields : String = {
    "";
  }
  def nameField : String = {
    "sourceParamName";
  }
  def getPk() : Long = {
    sourceParamId
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
    Array(sourceParamId,guid,sourceParamName,sourceParamType,possibleValues,insertedRowDate,lastUpdatedDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+sourceParamId,""+guid,""+sourceParamName,""+sourceParamType,""+possibleValues,""+insertedRowDate,""+lastUpdatedDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "sourceParamId" => sourceParamId
      case "guid" => guid
      case "sourceParamName" => sourceParamName
      case "sourceParamType" => sourceParamType
      case "possibleValues" => possibleValues
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "sourceParamId" => "Long"
      case "guid" => "Long"
      case "sourceParamName" => "String"
      case "sourceParamType" => "String"
      case "possibleValues" => "String"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into sourceParam(guid,sourceParamName,sourceParamType,possibleValues) values (?,?,?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
    stat.setObject(1, guid);
    stat.setObject(2, sourceParamName);
    stat.setObject(3, sourceParamType);
    stat.setObject(4, possibleValues);
    return stat;
  }
  def modify(sourceParamName : String, sourceParamType : String, possibleValues : String) : SourceParamDto = {
    val dtoModified = new SourceParamDto(this.sourceParamId,this.guid,sourceParamName,sourceParamType,possibleValues,this.insertedRowDate,new java.util.Date());
    dtoModified
  }
}
object SourceParamDto {
  val TABLE_NAME = "sourceParam";
  val FIELD_sourceParamId = "sourceParamId";
  val FIELD_guid = "guid";
  val FIELD_sourceParamName = "sourceParamName";
  val FIELD_sourceParamType = "sourceParamType";
  val FIELD_possibleValues = "possibleValues";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";

  def createNewSourceParamDto(sourceParamName : String, sourceParamType : String, possibleValues : String) : SourceParamDto = {
    val dto = new SourceParamDto(0,0,sourceParamName,sourceParamType,possibleValues,new java.util.Date(),new java.util.Date())
    dto
  }

}


case class SourceParamValueDto (
                                 val sourceParamValueId : Long
                                 , val sourceInstanceId : Long
                                 , val sourceParamId : Long
                                 , val sourceParamValueVersion : String
                                 , val guid : Long
                                 , val insertedRowDate : java.util.Date
                                 , val lastUpdatedDate : java.util.Date
                                 , val paramValue : String
                               ) extends BaseDto {
  def tableName : String = {
    "sourceParamValue";
  }
  def fields : String = {
    "sourceParamValueId,sourceInstanceId,sourceParamId,sourceParamValueVersion,guid,insertedRowDate,lastUpdatedDate,paramValue";
  }
  def pkFields : String = {
    "sourceParamValueId";
  }
  def fkFields : String = {
    "sourceInstanceId,sourceParamId";
  }
  def nameField : String = {
    "";
  }
  def getPk() : Long = {
    sourceParamValueId
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
    Array(sourceParamValueId,sourceInstanceId,sourceParamId,sourceParamValueVersion,guid,insertedRowDate,lastUpdatedDate,paramValue)
  }
  def toStringArray() : Array[String] = {
    Array(""+sourceParamValueId,""+sourceInstanceId,""+sourceParamId,""+sourceParamValueVersion,""+guid,""+insertedRowDate,""+lastUpdatedDate,""+paramValue)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "sourceParamValueId" => sourceParamValueId
      case "sourceInstanceId" => sourceInstanceId
      case "sourceParamId" => sourceParamId
      case "sourceParamValueVersion" => sourceParamValueVersion
      case "guid" => guid
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case "paramValue" => paramValue
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "sourceParamValueId" => "Long"
      case "sourceInstanceId" => "Long"
      case "sourceParamId" => "Long"
      case "sourceParamValueVersion" => "String"
      case "guid" => "Long"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case "paramValue" => "String"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into sourceParamValue(sourceInstanceId,sourceParamId,sourceParamValueVersion,guid,paramValue) values (?,?,?,?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
    stat.setObject(1, sourceInstanceId);
    stat.setObject(2, sourceParamId);
    stat.setObject(3, sourceParamValueVersion);
    stat.setObject(4, guid);
    stat.setObject(5, paramValue);
    return stat;
  }
  def modify(sourceInstanceId : Long, sourceParamId : Long, sourceParamValueVersion : String, paramValue : String) : SourceParamValueDto = {
    val dtoModified = new SourceParamValueDto(this.sourceParamValueId,sourceInstanceId,sourceParamId,sourceParamValueVersion,this.guid,this.insertedRowDate,new java.util.Date(),paramValue);
    dtoModified
  }
}
object SourceParamValueDto {
  val TABLE_NAME = "sourceParamValue";
  val FIELD_sourceParamValueId = "sourceParamValueId";
  val FIELD_sourceInstanceId = "sourceInstanceId";
  val FIELD_sourceParamId = "sourceParamId";
  val FIELD_sourceParamValueVersion = "sourceParamValueVersion";
  val FIELD_guid = "guid";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";
  val FIELD_paramValue = "paramValue";

  def createNewSourceParamValueDto(sourceInstanceId : Long, sourceParamId : Long, sourceParamValueVersion : String, paramValue : String) : SourceParamValueDto = {
    val dto = new SourceParamValueDto(0,sourceInstanceId,sourceParamId,sourceParamValueVersion,0,new java.util.Date(),new java.util.Date(),paramValue)
    dto
  }

}


case class SourceScheduleDto (
                               val sourceScheduleId : Long
                               , val sourceViewId : Long
                               , val executorStorageId : Long
                               , val insertedRowDate : java.util.Date
                               , val lastUpdatedDate : java.util.Date
                               , val guid : Long
                               , val onDemand : Int
                               , val startTime : java.util.Date
                               , val intervalValue : Long
                             ) extends BaseDto {
  def tableName : String = {
    "sourceSchedule";
  }
  def fields : String = {
    "sourceScheduleId,sourceViewId,executorStorageId,insertedRowDate,lastUpdatedDate,guid,onDemand,startTime,intervalValue";
  }
  def pkFields : String = {
    "sourceScheduleId";
  }
  def fkFields : String = {
    "executorStorageId,sourceViewId";
  }
  def nameField : String = {
    "";
  }
  def getPk() : Long = {
    sourceScheduleId
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
    Array(sourceScheduleId,sourceViewId,executorStorageId,insertedRowDate,lastUpdatedDate,guid,onDemand,startTime,intervalValue)
  }
  def toStringArray() : Array[String] = {
    Array(""+sourceScheduleId,""+sourceViewId,""+executorStorageId,""+insertedRowDate,""+lastUpdatedDate,""+guid,""+onDemand,""+startTime,""+intervalValue)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "sourceScheduleId" => sourceScheduleId
      case "sourceViewId" => sourceViewId
      case "executorStorageId" => executorStorageId
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case "guid" => guid
      case "onDemand" => onDemand
      case "startTime" => startTime
      case "intervalValue" => intervalValue
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "sourceScheduleId" => "Long"
      case "sourceViewId" => "Long"
      case "executorStorageId" => "Long"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case "guid" => "Long"
      case "onDemand" => "Int"
      case "startTime" => "java.util.Date"
      case "intervalValue" => "Long"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into sourceSchedule(sourceViewId,executorStorageId,guid,onDemand,startTime,intervalValue) values (?,?,?,?,?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
    stat.setObject(1, sourceViewId);
    stat.setObject(2, executorStorageId);
    stat.setObject(3, guid);
    stat.setObject(4, onDemand);
    stat.setObject(5, startTime);
    stat.setObject(6, intervalValue);
    return stat;
  }
  def modify(sourceViewId : Long, executorStorageId : Long, onDemand : Int, startTime : java.util.Date, intervalValue : Long) : SourceScheduleDto = {
    val dtoModified = new SourceScheduleDto(this.sourceScheduleId,sourceViewId,executorStorageId,this.insertedRowDate,new java.util.Date(),this.guid,onDemand,startTime,intervalValue);
    dtoModified
  }
}
object SourceScheduleDto {
  val TABLE_NAME = "sourceSchedule";
  val FIELD_sourceScheduleId = "sourceScheduleId";
  val FIELD_sourceViewId = "sourceViewId";
  val FIELD_executorStorageId = "executorStorageId";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";
  val FIELD_guid = "guid";
  val FIELD_onDemand = "onDemand";
  val FIELD_startTime = "startTime";
  val FIELD_intervalValue = "intervalValue";

  def createNewSourceScheduleDto(sourceViewId : Long, executorStorageId : Long, onDemand : Int, startTime : java.util.Date, intervalValue : Long) : SourceScheduleDto = {
    val dto = new SourceScheduleDto(0,sourceViewId,executorStorageId,new java.util.Date(),new java.util.Date(),0,onDemand,startTime,intervalValue)
    dto
  }

}


case class SourceTypeDto (
                           val sourceTypeId : Long
                           , val guid : Long
                           , val sourceTypeName : String
                           , val sourceTypeClass : String
                           , val insertedRowDate : java.util.Date
                           , val lastUpdatedDate : java.util.Date
                         ) extends BaseDto {
  def tableName : String = {
    "sourceType";
  }
  def fields : String = {
    "sourceTypeId,guid,sourceTypeName,sourceTypeClass,insertedRowDate,lastUpdatedDate";
  }
  def pkFields : String = {
    "sourceTypeId";
  }
  def fkFields : String = {
    "";
  }
  def nameField : String = {
    "sourceTypeName";
  }
  def getPk() : Long = {
    sourceTypeId
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
    Array(sourceTypeId,guid,sourceTypeName,sourceTypeClass,insertedRowDate,lastUpdatedDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+sourceTypeId,""+guid,""+sourceTypeName,""+sourceTypeClass,""+insertedRowDate,""+lastUpdatedDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "sourceTypeId" => sourceTypeId
      case "guid" => guid
      case "sourceTypeName" => sourceTypeName
      case "sourceTypeClass" => sourceTypeClass
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "sourceTypeId" => "Long"
      case "guid" => "Long"
      case "sourceTypeName" => "String"
      case "sourceTypeClass" => "String"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into sourceType(guid,sourceTypeName,sourceTypeClass) values (?,?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
    stat.setObject(1, guid);
    stat.setObject(2, sourceTypeName);
    stat.setObject(3, sourceTypeClass);
    return stat;
  }
  def modify(sourceTypeName : String, sourceTypeClass : String) : SourceTypeDto = {
    val dtoModified = new SourceTypeDto(this.sourceTypeId,this.guid,sourceTypeName,sourceTypeClass,this.insertedRowDate,new java.util.Date());
    dtoModified
  }
}
object SourceTypeDto {
  val TABLE_NAME = "sourceType";
  val FIELD_sourceTypeId = "sourceTypeId";
  val FIELD_guid = "guid";
  val FIELD_sourceTypeName = "sourceTypeName";
  val FIELD_sourceTypeClass = "sourceTypeClass";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";

  def createNewSourceTypeDto(sourceTypeName : String, sourceTypeClass : String) : SourceTypeDto = {
    val dto = new SourceTypeDto(0,0,sourceTypeName,sourceTypeClass,new java.util.Date(),new java.util.Date())
    dto
  }

}


case class SourceTypeParamDto (
                                val sourceTypeParamId : Long
                                , val sourceTypeId : Long
                                , val sourceParamId : Long
                                , val sourceTypeName : String
                                , val sourceParamName : String
                                , val isRequired : Int
                                , val guid : Long
                                , val insertedRowDate : java.util.Date
                                , val lastUpdatedDate : java.util.Date
                              ) extends BaseDto {
  def tableName : String = {
    "sourceTypeParam";
  }
  def fields : String = {
    "sourceTypeParamId,sourceTypeId,sourceParamId,sourceTypeName,sourceParamName,isRequired,guid,insertedRowDate,lastUpdatedDate";
  }
  def pkFields : String = {
    "sourceTypeParamId";
  }
  def fkFields : String = {
    "sourceParamId,sourceTypeId";
  }
  def nameField : String = {
    "";
  }
  def getPk() : Long = {
    sourceTypeParamId
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
    Array(sourceTypeParamId,sourceTypeId,sourceParamId,sourceTypeName,sourceParamName,isRequired,guid,insertedRowDate,lastUpdatedDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+sourceTypeParamId,""+sourceTypeId,""+sourceParamId,""+sourceTypeName,""+sourceParamName,""+isRequired,""+guid,""+insertedRowDate,""+lastUpdatedDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "sourceTypeParamId" => sourceTypeParamId
      case "sourceTypeId" => sourceTypeId
      case "sourceParamId" => sourceParamId
      case "sourceTypeName" => sourceTypeName
      case "sourceParamName" => sourceParamName
      case "isRequired" => isRequired
      case "guid" => guid
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "sourceTypeParamId" => "Long"
      case "sourceTypeId" => "Long"
      case "sourceParamId" => "Long"
      case "sourceTypeName" => "String"
      case "sourceParamName" => "String"
      case "isRequired" => "Int"
      case "guid" => "Long"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into sourceTypeParam(sourceTypeId,sourceParamId,sourceTypeName,sourceParamName,isRequired,guid) values (?,?,?,?,?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
    stat.setObject(1, sourceTypeId);
    stat.setObject(2, sourceParamId);
    stat.setObject(3, sourceTypeName);
    stat.setObject(4, sourceParamName);
    stat.setObject(5, isRequired);
    stat.setObject(6, guid);
    return stat;
  }
  def modify(sourceTypeId : Long, sourceParamId : Long, sourceTypeName : String, sourceParamName : String, isRequired : Int) : SourceTypeParamDto = {
    val dtoModified = new SourceTypeParamDto(this.sourceTypeParamId,sourceTypeId,sourceParamId,sourceTypeName,sourceParamName,isRequired,this.guid,this.insertedRowDate,new java.util.Date());
    dtoModified
  }
}
object SourceTypeParamDto {
  val TABLE_NAME = "sourceTypeParam";
  val FIELD_sourceTypeParamId = "sourceTypeParamId";
  val FIELD_sourceTypeId = "sourceTypeId";
  val FIELD_sourceParamId = "sourceParamId";
  val FIELD_sourceTypeName = "sourceTypeName";
  val FIELD_sourceParamName = "sourceParamName";
  val FIELD_isRequired = "isRequired";
  val FIELD_guid = "guid";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";

  def createNewSourceTypeParamDto(sourceTypeId : Long, sourceParamId : Long, sourceTypeName : String, sourceParamName : String, isRequired : Int) : SourceTypeParamDto = {
    val dto = new SourceTypeParamDto(0,sourceTypeId,sourceParamId,sourceTypeName,sourceParamName,isRequired,0,new java.util.Date(),new java.util.Date())
    dto
  }

}


case class SourceViewDto (
                           val sourceViewId : Long
                           , val guid : Long
                           , val sourceInstanceId : Long
                           , val sourceViewTypeId : Long
                           , val sourceViewName : String
                           , val sourceViewDefinition : String
                           , val insertedRowDate : java.util.Date
                           , val lastUpdatedDate : java.util.Date
                         ) extends BaseDto {
  def tableName : String = {
    "sourceView";
  }
  def fields : String = {
    "sourceViewId,guid,sourceInstanceId,sourceViewTypeId,sourceViewName,sourceViewDefinition,insertedRowDate,lastUpdatedDate";
  }
  def pkFields : String = {
    "sourceViewId";
  }
  def fkFields : String = {
    "sourceInstanceId,sourceViewTypeId";
  }
  def nameField : String = {
    "sourceViewName";
  }
  def getPk() : Long = {
    sourceViewId
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
    Array(sourceViewId,guid,sourceInstanceId,sourceViewTypeId,sourceViewName,sourceViewDefinition,insertedRowDate,lastUpdatedDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+sourceViewId,""+guid,""+sourceInstanceId,""+sourceViewTypeId,""+sourceViewName,""+sourceViewDefinition,""+insertedRowDate,""+lastUpdatedDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "sourceViewId" => sourceViewId
      case "guid" => guid
      case "sourceInstanceId" => sourceInstanceId
      case "sourceViewTypeId" => sourceViewTypeId
      case "sourceViewName" => sourceViewName
      case "sourceViewDefinition" => sourceViewDefinition
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "sourceViewId" => "Long"
      case "guid" => "Long"
      case "sourceInstanceId" => "Long"
      case "sourceViewTypeId" => "Long"
      case "sourceViewName" => "String"
      case "sourceViewDefinition" => "String"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into sourceView(guid,sourceInstanceId,sourceViewTypeId,sourceViewName,sourceViewDefinition) values (?,?,?,?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
    stat.setObject(1, guid);
    stat.setObject(2, sourceInstanceId);
    stat.setObject(3, sourceViewTypeId);
    stat.setObject(4, sourceViewName);
    stat.setObject(5, sourceViewDefinition);
    return stat;
  }
  def modify(sourceInstanceId : Long, sourceViewTypeId : Long, sourceViewName : String, sourceViewDefinition : String) : SourceViewDto = {
    val dtoModified = new SourceViewDto(this.sourceViewId,this.guid,sourceInstanceId,sourceViewTypeId,sourceViewName,sourceViewDefinition,this.insertedRowDate,new java.util.Date());
    dtoModified
  }
}
object SourceViewDto {
  val TABLE_NAME = "sourceView";
  val FIELD_sourceViewId = "sourceViewId";
  val FIELD_guid = "guid";
  val FIELD_sourceInstanceId = "sourceInstanceId";
  val FIELD_sourceViewTypeId = "sourceViewTypeId";
  val FIELD_sourceViewName = "sourceViewName";
  val FIELD_sourceViewDefinition = "sourceViewDefinition";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";

  def createNewSourceViewDto(sourceInstanceId : Long, sourceViewTypeId : Long, sourceViewName : String, sourceViewDefinition : String) : SourceViewDto = {
    val dto = new SourceViewDto(0,0,sourceInstanceId,sourceViewTypeId,sourceViewName,sourceViewDefinition,new java.util.Date(),new java.util.Date())
    dto
  }

}


case class SourceViewColumnDto (
                                 val sourceViewColumnId : Long
                                 , val sourceViewId : Long
                                 , val insertedRowDate : java.util.Date
                                 , val lastUpdatedDate : java.util.Date
                                 , val guid : Long
                                 , val columnName : String
                                 , val columnType : String
                               ) extends BaseDto {
  def tableName : String = {
    "sourceViewColumn";
  }
  def fields : String = {
    "sourceViewColumnId,sourceViewId,insertedRowDate,lastUpdatedDate,guid,columnName,columnType";
  }
  def pkFields : String = {
    "sourceViewColumnId";
  }
  def fkFields : String = {
    "sourceViewId";
  }
  def nameField : String = {
    "";
  }
  def getPk() : Long = {
    sourceViewColumnId
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
    Array(sourceViewColumnId,sourceViewId,insertedRowDate,lastUpdatedDate,guid,columnName,columnType)
  }
  def toStringArray() : Array[String] = {
    Array(""+sourceViewColumnId,""+sourceViewId,""+insertedRowDate,""+lastUpdatedDate,""+guid,""+columnName,""+columnType)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "sourceViewColumnId" => sourceViewColumnId
      case "sourceViewId" => sourceViewId
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case "guid" => guid
      case "columnName" => columnName
      case "columnType" => columnType
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "sourceViewColumnId" => "Long"
      case "sourceViewId" => "Long"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case "guid" => "Long"
      case "columnName" => "String"
      case "columnType" => "String"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into sourceViewColumn(sourceViewId,guid,columnName,columnType) values (?,?,?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
    stat.setObject(1, sourceViewId);
    stat.setObject(2, guid);
    stat.setObject(3, columnName);
    stat.setObject(4, columnType);
    return stat;
  }
  def modify(sourceViewId : Long, columnName : String, columnType : String) : SourceViewColumnDto = {
    val dtoModified = new SourceViewColumnDto(this.sourceViewColumnId,sourceViewId,this.insertedRowDate,new java.util.Date(),this.guid,columnName,columnType);
    dtoModified
  }
}
object SourceViewColumnDto {
  val TABLE_NAME = "sourceViewColumn";
  val FIELD_sourceViewColumnId = "sourceViewColumnId";
  val FIELD_sourceViewId = "sourceViewId";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";
  val FIELD_guid = "guid";
  val FIELD_columnName = "columnName";
  val FIELD_columnType = "columnType";

  def createNewSourceViewColumnDto(sourceViewId : Long, columnName : String, columnType : String) : SourceViewColumnDto = {
    val dto = new SourceViewColumnDto(0,sourceViewId,new java.util.Date(),new java.util.Date(),0,columnName,columnType)
    dto
  }

}


case class SourceViewTypeDto (
                               val sourceViewTypeId : Long
                               , val guid : Long
                               , val sourceViewTypeName : String
                               , val sourceViewTypeClass : String
                               , val insertedRowDate : java.util.Date
                               , val lastUpdatedDate : java.util.Date
                             ) extends BaseDto {
  def tableName : String = {
    "sourceViewType";
  }
  def fields : String = {
    "sourceViewTypeId,guid,sourceViewTypeName,sourceViewTypeClass,insertedRowDate,lastUpdatedDate";
  }
  def pkFields : String = {
    "sourceViewTypeId";
  }
  def fkFields : String = {
    "";
  }
  def nameField : String = {
    "sourceViewTypeName";
  }
  def getPk() : Long = {
    sourceViewTypeId
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
    Array(sourceViewTypeId,guid,sourceViewTypeName,sourceViewTypeClass,insertedRowDate,lastUpdatedDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+sourceViewTypeId,""+guid,""+sourceViewTypeName,""+sourceViewTypeClass,""+insertedRowDate,""+lastUpdatedDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "sourceViewTypeId" => sourceViewTypeId
      case "guid" => guid
      case "sourceViewTypeName" => sourceViewTypeName
      case "sourceViewTypeClass" => sourceViewTypeClass
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "sourceViewTypeId" => "Long"
      case "guid" => "Long"
      case "sourceViewTypeName" => "String"
      case "sourceViewTypeClass" => "String"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into sourceViewType(guid,sourceViewTypeName,sourceViewTypeClass) values (?,?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
    stat.setObject(1, guid);
    stat.setObject(2, sourceViewTypeName);
    stat.setObject(3, sourceViewTypeClass);
    return stat;
  }
  def modify(sourceViewTypeName : String, sourceViewTypeClass : String) : SourceViewTypeDto = {
    val dtoModified = new SourceViewTypeDto(this.sourceViewTypeId,this.guid,sourceViewTypeName,sourceViewTypeClass,this.insertedRowDate,new java.util.Date());
    dtoModified
  }
}
object SourceViewTypeDto {
  val TABLE_NAME = "sourceViewType";
  val FIELD_sourceViewTypeId = "sourceViewTypeId";
  val FIELD_guid = "guid";
  val FIELD_sourceViewTypeName = "sourceViewTypeName";
  val FIELD_sourceViewTypeClass = "sourceViewTypeClass";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";

  def createNewSourceViewTypeDto(sourceViewTypeName : String, sourceViewTypeClass : String) : SourceViewTypeDto = {
    val dto = new SourceViewTypeDto(0,0,sourceViewTypeName,sourceViewTypeClass,new java.util.Date(),new java.util.Date())
    dto
  }

}


case class VAlgorithmImplementationDto (
                                         val algorithmImplementationId : Long
                                         , val guid : Long
                                         , val insertedRowDate : java.util.Date
                                         , val lastUpdatedDate : java.util.Date
                                         , val algorithmTypeVersionId : Long
                                         , val executorTypeId : Long
                                         , val algorithmImplementationName : String
                                         , val algorithmImplementationClass : String
                                         , val algorithmTypeVersion_algorithmTypeVersionId : Long
                                         , val algorithmTypeVersion_guid : Long
                                         , val algorithmTypeVersion_algorithmTypeId : Long
                                         , val algorithmTypeVersion_algorithmTypeVersionName : String
                                         , val algorithmTypeVersion_insertedRowDate : java.util.Date
                                         , val algorithmTypeVersion_lastUpdatedDate : java.util.Date
                                         , val executorType_executorTypeId : Long
                                         , val executorType_guid : Long
                                         , val executorType_insertedRowDate : java.util.Date
                                         , val executorType_lastUpdatedDate : java.util.Date
                                         , val executorType_executorTypeName : String
                                         , val executorType_executorTypeClass : String
                                       ) extends BaseReadOnlyDto {
  def tableName : String = {
    "vAlgorithmImplementation";
  }
  def fields : String = {
    "algorithmImplementationId,guid,insertedRowDate,lastUpdatedDate,algorithmTypeVersionId,executorTypeId,algorithmImplementationName,algorithmImplementationClass,algorithmTypeVersion_algorithmTypeVersionId,algorithmTypeVersion_guid,algorithmTypeVersion_algorithmTypeId,algorithmTypeVersion_algorithmTypeVersionName,algorithmTypeVersion_insertedRowDate,algorithmTypeVersion_lastUpdatedDate,executorType_executorTypeId,executorType_guid,executorType_insertedRowDate,executorType_lastUpdatedDate,executorType_executorTypeName,executorType_executorTypeClass";
  }
  def pkFields : String = {
    "";
  }
  def fkFields : String = {
    "";
  }
  def nameField : String = {
    "";
  }
  def getPk() : Long = {
    algorithmImplementationId
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
    Array(algorithmImplementationId,guid,insertedRowDate,lastUpdatedDate,algorithmTypeVersionId,executorTypeId,algorithmImplementationName,algorithmImplementationClass,algorithmTypeVersion_algorithmTypeVersionId,algorithmTypeVersion_guid,algorithmTypeVersion_algorithmTypeId,algorithmTypeVersion_algorithmTypeVersionName,algorithmTypeVersion_insertedRowDate,algorithmTypeVersion_lastUpdatedDate,executorType_executorTypeId,executorType_guid,executorType_insertedRowDate,executorType_lastUpdatedDate,executorType_executorTypeName,executorType_executorTypeClass)
  }
  def toStringArray() : Array[String] = {
    Array(""+algorithmImplementationId,""+guid,""+insertedRowDate,""+lastUpdatedDate,""+algorithmTypeVersionId,""+executorTypeId,""+algorithmImplementationName,""+algorithmImplementationClass,""+algorithmTypeVersion_algorithmTypeVersionId,""+algorithmTypeVersion_guid,""+algorithmTypeVersion_algorithmTypeId,""+algorithmTypeVersion_algorithmTypeVersionName,""+algorithmTypeVersion_insertedRowDate,""+algorithmTypeVersion_lastUpdatedDate,""+executorType_executorTypeId,""+executorType_guid,""+executorType_insertedRowDate,""+executorType_lastUpdatedDate,""+executorType_executorTypeName,""+executorType_executorTypeClass)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "algorithmImplementationId" => algorithmImplementationId
      case "guid" => guid
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case "algorithmTypeVersionId" => algorithmTypeVersionId
      case "executorTypeId" => executorTypeId
      case "algorithmImplementationName" => algorithmImplementationName
      case "algorithmImplementationClass" => algorithmImplementationClass
      case "algorithmTypeVersion_algorithmTypeVersionId" => algorithmTypeVersion_algorithmTypeVersionId
      case "algorithmTypeVersion_guid" => algorithmTypeVersion_guid
      case "algorithmTypeVersion_algorithmTypeId" => algorithmTypeVersion_algorithmTypeId
      case "algorithmTypeVersion_algorithmTypeVersionName" => algorithmTypeVersion_algorithmTypeVersionName
      case "algorithmTypeVersion_insertedRowDate" => algorithmTypeVersion_insertedRowDate
      case "algorithmTypeVersion_lastUpdatedDate" => algorithmTypeVersion_lastUpdatedDate
      case "executorType_executorTypeId" => executorType_executorTypeId
      case "executorType_guid" => executorType_guid
      case "executorType_insertedRowDate" => executorType_insertedRowDate
      case "executorType_lastUpdatedDate" => executorType_lastUpdatedDate
      case "executorType_executorTypeName" => executorType_executorTypeName
      case "executorType_executorTypeClass" => executorType_executorTypeClass
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "algorithmImplementationId" => "Long"
      case "guid" => "Long"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case "algorithmTypeVersionId" => "Long"
      case "executorTypeId" => "Long"
      case "algorithmImplementationName" => "String"
      case "algorithmImplementationClass" => "String"
      case "algorithmTypeVersion_algorithmTypeVersionId" => "Long"
      case "algorithmTypeVersion_guid" => "Long"
      case "algorithmTypeVersion_algorithmTypeId" => "Long"
      case "algorithmTypeVersion_algorithmTypeVersionName" => "String"
      case "algorithmTypeVersion_insertedRowDate" => "java.util.Date"
      case "algorithmTypeVersion_lastUpdatedDate" => "java.util.Date"
      case "executorType_executorTypeId" => "Long"
      case "executorType_guid" => "Long"
      case "executorType_insertedRowDate" => "java.util.Date"
      case "executorType_lastUpdatedDate" => "java.util.Date"
      case "executorType_executorTypeName" => "String"
      case "executorType_executorTypeClass" => "String"
      case _ => "Object"
    }
    ret
  }
}
object VAlgorithmImplementationDto {
  val TABLE_NAME = "vAlgorithmImplementation";
  val FIELD_algorithmImplementationId = "algorithmImplementationId";
  val FIELD_guid = "guid";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";
  val FIELD_algorithmTypeVersionId = "algorithmTypeVersionId";
  val FIELD_executorTypeId = "executorTypeId";
  val FIELD_algorithmImplementationName = "algorithmImplementationName";
  val FIELD_algorithmImplementationClass = "algorithmImplementationClass";
  val FIELD_algorithmTypeVersion_algorithmTypeVersionId = "algorithmTypeVersion_algorithmTypeVersionId";
  val FIELD_algorithmTypeVersion_guid = "algorithmTypeVersion_guid";
  val FIELD_algorithmTypeVersion_algorithmTypeId = "algorithmTypeVersion_algorithmTypeId";
  val FIELD_algorithmTypeVersion_algorithmTypeVersionName = "algorithmTypeVersion_algorithmTypeVersionName";
  val FIELD_algorithmTypeVersion_insertedRowDate = "algorithmTypeVersion_insertedRowDate";
  val FIELD_algorithmTypeVersion_lastUpdatedDate = "algorithmTypeVersion_lastUpdatedDate";
  val FIELD_executorType_executorTypeId = "executorType_executorTypeId";
  val FIELD_executorType_guid = "executorType_guid";
  val FIELD_executorType_insertedRowDate = "executorType_insertedRowDate";
  val FIELD_executorType_lastUpdatedDate = "executorType_lastUpdatedDate";
  val FIELD_executorType_executorTypeName = "executorType_executorTypeName";
  val FIELD_executorType_executorTypeClass = "executorType_executorTypeClass";

}


case class VAlgorithmParamTypeDto (
                                    val algorithmParamTypeId : Long
                                    , val algorithmParamId : Long
                                    , val algorithmTypeId : Long
                                    , val algorithmTypeVersionId : Long
                                    , val insertedRowDate : java.util.Date
                                    , val lastUpdatedDate : java.util.Date
                                    , val guid : Long
                                    , val algorithmParam_algorithmParamId : Long
                                    , val algorithmParam_guid : Long
                                    , val algorithmParam_insertedRowDate : java.util.Date
                                    , val algorithmParam_lastUpdatedDate : java.util.Date
                                    , val algorithmParam_algorithmParamName : String
                                    , val algorithmParam_algorithmParamDescription : String
                                    , val algorithmParam_algorithmParamType : String
                                    , val algorithmType_algorithmTypeId : Long
                                    , val algorithmType_guid : Long
                                    , val algorithmType_algorithmTypeName : String
                                    , val algorithmType_algorithmTypeDescription : String
                                    , val algorithmType_insertedRowDate : java.util.Date
                                    , val algorithmType_lastUpdatedDate : java.util.Date
                                    , val algorithmTypeVersion_algorithmTypeVersionId : Long
                                    , val algorithmTypeVersion_guid : Long
                                    , val algorithmTypeVersion_algorithmTypeId : Long
                                    , val algorithmTypeVersion_algorithmTypeVersionName : String
                                    , val algorithmTypeVersion_insertedRowDate : java.util.Date
                                    , val algorithmTypeVersion_lastUpdatedDate : java.util.Date
                                  ) extends BaseReadOnlyDto {
  def tableName : String = {
    "vAlgorithmParamType";
  }
  def fields : String = {
    "algorithmParamTypeId,algorithmParamId,algorithmTypeId,algorithmTypeVersionId,insertedRowDate,lastUpdatedDate,guid,algorithmParam_algorithmParamId,algorithmParam_guid,algorithmParam_insertedRowDate,algorithmParam_lastUpdatedDate,algorithmParam_algorithmParamName,algorithmParam_algorithmParamDescription,algorithmParam_algorithmParamType,algorithmType_algorithmTypeId,algorithmType_guid,algorithmType_algorithmTypeName,algorithmType_algorithmTypeDescription,algorithmType_insertedRowDate,algorithmType_lastUpdatedDate,algorithmTypeVersion_algorithmTypeVersionId,algorithmTypeVersion_guid,algorithmTypeVersion_algorithmTypeId,algorithmTypeVersion_algorithmTypeVersionName,algorithmTypeVersion_insertedRowDate,algorithmTypeVersion_lastUpdatedDate";
  }
  def pkFields : String = {
    "";
  }
  def fkFields : String = {
    "";
  }
  def nameField : String = {
    "";
  }
  def getPk() : Long = {
    algorithmParamTypeId
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
    Array(algorithmParamTypeId,algorithmParamId,algorithmTypeId,algorithmTypeVersionId,insertedRowDate,lastUpdatedDate,guid,algorithmParam_algorithmParamId,algorithmParam_guid,algorithmParam_insertedRowDate,algorithmParam_lastUpdatedDate,algorithmParam_algorithmParamName,algorithmParam_algorithmParamDescription,algorithmParam_algorithmParamType,algorithmType_algorithmTypeId,algorithmType_guid,algorithmType_algorithmTypeName,algorithmType_algorithmTypeDescription,algorithmType_insertedRowDate,algorithmType_lastUpdatedDate,algorithmTypeVersion_algorithmTypeVersionId,algorithmTypeVersion_guid,algorithmTypeVersion_algorithmTypeId,algorithmTypeVersion_algorithmTypeVersionName,algorithmTypeVersion_insertedRowDate,algorithmTypeVersion_lastUpdatedDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+algorithmParamTypeId,""+algorithmParamId,""+algorithmTypeId,""+algorithmTypeVersionId,""+insertedRowDate,""+lastUpdatedDate,""+guid,""+algorithmParam_algorithmParamId,""+algorithmParam_guid,""+algorithmParam_insertedRowDate,""+algorithmParam_lastUpdatedDate,""+algorithmParam_algorithmParamName,""+algorithmParam_algorithmParamDescription,""+algorithmParam_algorithmParamType,""+algorithmType_algorithmTypeId,""+algorithmType_guid,""+algorithmType_algorithmTypeName,""+algorithmType_algorithmTypeDescription,""+algorithmType_insertedRowDate,""+algorithmType_lastUpdatedDate,""+algorithmTypeVersion_algorithmTypeVersionId,""+algorithmTypeVersion_guid,""+algorithmTypeVersion_algorithmTypeId,""+algorithmTypeVersion_algorithmTypeVersionName,""+algorithmTypeVersion_insertedRowDate,""+algorithmTypeVersion_lastUpdatedDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "algorithmParamTypeId" => algorithmParamTypeId
      case "algorithmParamId" => algorithmParamId
      case "algorithmTypeId" => algorithmTypeId
      case "algorithmTypeVersionId" => algorithmTypeVersionId
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case "guid" => guid
      case "algorithmParam_algorithmParamId" => algorithmParam_algorithmParamId
      case "algorithmParam_guid" => algorithmParam_guid
      case "algorithmParam_insertedRowDate" => algorithmParam_insertedRowDate
      case "algorithmParam_lastUpdatedDate" => algorithmParam_lastUpdatedDate
      case "algorithmParam_algorithmParamName" => algorithmParam_algorithmParamName
      case "algorithmParam_algorithmParamDescription" => algorithmParam_algorithmParamDescription
      case "algorithmParam_algorithmParamType" => algorithmParam_algorithmParamType
      case "algorithmType_algorithmTypeId" => algorithmType_algorithmTypeId
      case "algorithmType_guid" => algorithmType_guid
      case "algorithmType_algorithmTypeName" => algorithmType_algorithmTypeName
      case "algorithmType_algorithmTypeDescription" => algorithmType_algorithmTypeDescription
      case "algorithmType_insertedRowDate" => algorithmType_insertedRowDate
      case "algorithmType_lastUpdatedDate" => algorithmType_lastUpdatedDate
      case "algorithmTypeVersion_algorithmTypeVersionId" => algorithmTypeVersion_algorithmTypeVersionId
      case "algorithmTypeVersion_guid" => algorithmTypeVersion_guid
      case "algorithmTypeVersion_algorithmTypeId" => algorithmTypeVersion_algorithmTypeId
      case "algorithmTypeVersion_algorithmTypeVersionName" => algorithmTypeVersion_algorithmTypeVersionName
      case "algorithmTypeVersion_insertedRowDate" => algorithmTypeVersion_insertedRowDate
      case "algorithmTypeVersion_lastUpdatedDate" => algorithmTypeVersion_lastUpdatedDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "algorithmParamTypeId" => "Long"
      case "algorithmParamId" => "Long"
      case "algorithmTypeId" => "Long"
      case "algorithmTypeVersionId" => "Long"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case "guid" => "Long"
      case "algorithmParam_algorithmParamId" => "Long"
      case "algorithmParam_guid" => "Long"
      case "algorithmParam_insertedRowDate" => "java.util.Date"
      case "algorithmParam_lastUpdatedDate" => "java.util.Date"
      case "algorithmParam_algorithmParamName" => "String"
      case "algorithmParam_algorithmParamDescription" => "String"
      case "algorithmParam_algorithmParamType" => "String"
      case "algorithmType_algorithmTypeId" => "Long"
      case "algorithmType_guid" => "Long"
      case "algorithmType_algorithmTypeName" => "String"
      case "algorithmType_algorithmTypeDescription" => "String"
      case "algorithmType_insertedRowDate" => "java.util.Date"
      case "algorithmType_lastUpdatedDate" => "java.util.Date"
      case "algorithmTypeVersion_algorithmTypeVersionId" => "Long"
      case "algorithmTypeVersion_guid" => "Long"
      case "algorithmTypeVersion_algorithmTypeId" => "Long"
      case "algorithmTypeVersion_algorithmTypeVersionName" => "String"
      case "algorithmTypeVersion_insertedRowDate" => "java.util.Date"
      case "algorithmTypeVersion_lastUpdatedDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
}
object VAlgorithmParamTypeDto {
  val TABLE_NAME = "vAlgorithmParamType";
  val FIELD_algorithmParamTypeId = "algorithmParamTypeId";
  val FIELD_algorithmParamId = "algorithmParamId";
  val FIELD_algorithmTypeId = "algorithmTypeId";
  val FIELD_algorithmTypeVersionId = "algorithmTypeVersionId";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";
  val FIELD_guid = "guid";
  val FIELD_algorithmParam_algorithmParamId = "algorithmParam_algorithmParamId";
  val FIELD_algorithmParam_guid = "algorithmParam_guid";
  val FIELD_algorithmParam_insertedRowDate = "algorithmParam_insertedRowDate";
  val FIELD_algorithmParam_lastUpdatedDate = "algorithmParam_lastUpdatedDate";
  val FIELD_algorithmParam_algorithmParamName = "algorithmParam_algorithmParamName";
  val FIELD_algorithmParam_algorithmParamDescription = "algorithmParam_algorithmParamDescription";
  val FIELD_algorithmParam_algorithmParamType = "algorithmParam_algorithmParamType";
  val FIELD_algorithmType_algorithmTypeId = "algorithmType_algorithmTypeId";
  val FIELD_algorithmType_guid = "algorithmType_guid";
  val FIELD_algorithmType_algorithmTypeName = "algorithmType_algorithmTypeName";
  val FIELD_algorithmType_algorithmTypeDescription = "algorithmType_algorithmTypeDescription";
  val FIELD_algorithmType_insertedRowDate = "algorithmType_insertedRowDate";
  val FIELD_algorithmType_lastUpdatedDate = "algorithmType_lastUpdatedDate";
  val FIELD_algorithmTypeVersion_algorithmTypeVersionId = "algorithmTypeVersion_algorithmTypeVersionId";
  val FIELD_algorithmTypeVersion_guid = "algorithmTypeVersion_guid";
  val FIELD_algorithmTypeVersion_algorithmTypeId = "algorithmTypeVersion_algorithmTypeId";
  val FIELD_algorithmTypeVersion_algorithmTypeVersionName = "algorithmTypeVersion_algorithmTypeVersionName";
  val FIELD_algorithmTypeVersion_insertedRowDate = "algorithmTypeVersion_insertedRowDate";
  val FIELD_algorithmTypeVersion_lastUpdatedDate = "algorithmTypeVersion_lastUpdatedDate";

}


case class VAlgorithmRunDto (
                              val algorithmRunId : Long
                              , val guid : Long
                              , val algorithmScheduleId : Long
                              , val executorInstanceId : Long
                              , val executorStorageId : Long
                              , val algorithmRunName : String
                              , val insertedRowDate : java.util.Date
                              , val lastUpdatedDate : java.util.Date
                              , val runDate : java.util.Date
                              , val isRunning : Int
                              , val isFinished : Int
                              , val algorithmSchedule_algorithmScheduleId : Long
                              , val algorithmSchedule_guid : Long
                              , val algorithmSchedule_algorithmImplementationId : Long
                              , val algorithmSchedule_algorithmScheduleTypeId : Long
                              , val algorithmSchedule_algorithmScheduleName : String
                              , val algorithmSchedule_isScheduled : Int
                              , val algorithmSchedule_insertedRowDate : java.util.Date
                              , val algorithmSchedule_lastUpdatedDate : java.util.Date
                              , val executorInstance_executorInstanceId : Long
                              , val executorInstance_guid : Long
                              , val executorInstance_executorTypeId : Long
                              , val executorInstance_executorHostId : Long
                              , val executorInstance_executorInstanceName : String
                              , val executorInstance_isRunning : Int
                              , val executorInstance_isFinished : Int
                              , val executorInstance_portNumber : Int
                              , val executorInstance_insertedRowDate : java.util.Date
                              , val executorInstance_lastUpdatedDate : java.util.Date
                              , val executorInstance_endDate : java.util.Date
                              , val executorStorage_executorStorageId : Long
                              , val executorStorage_guid : Long
                              , val executorStorage_executorHostId : Long
                              , val executorStorage_executorStorageTypeId : Long
                              , val executorStorage_storageDefinition : String
                              , val executorStorage_storageBasePath : String
                              , val executorStorage_storageFulllPath : String
                              , val executorStorage_isRunning : Int
                              , val executorStorage_portNumber : Int
                              , val executorStorage_insertedRowDate : java.util.Date
                              , val executorStorage_lastUpdatedDate : java.util.Date
                            ) extends BaseReadOnlyDto {
  def tableName : String = {
    "vAlgorithmRun";
  }
  def fields : String = {
    "algorithmRunId,guid,algorithmScheduleId,executorInstanceId,executorStorageId,algorithmRunName,insertedRowDate,lastUpdatedDate,runDate,isRunning,isFinished,algorithmSchedule_algorithmScheduleId,algorithmSchedule_guid,algorithmSchedule_algorithmImplementationId,algorithmSchedule_algorithmScheduleTypeId,algorithmSchedule_algorithmScheduleName,algorithmSchedule_isScheduled,algorithmSchedule_insertedRowDate,algorithmSchedule_lastUpdatedDate,executorInstance_executorInstanceId,executorInstance_guid,executorInstance_executorTypeId,executorInstance_executorHostId,executorInstance_executorInstanceName,executorInstance_isRunning,executorInstance_isFinished,executorInstance_portNumber,executorInstance_insertedRowDate,executorInstance_lastUpdatedDate,executorInstance_endDate,executorStorage_executorStorageId,executorStorage_guid,executorStorage_executorHostId,executorStorage_executorStorageTypeId,executorStorage_storageDefinition,executorStorage_storageBasePath,executorStorage_storageFulllPath,executorStorage_isRunning,executorStorage_portNumber,executorStorage_insertedRowDate,executorStorage_lastUpdatedDate";
  }
  def pkFields : String = {
    "";
  }
  def fkFields : String = {
    "";
  }
  def nameField : String = {
    "";
  }
  def getPk() : Long = {
    algorithmRunId
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
    Array(algorithmRunId,guid,algorithmScheduleId,executorInstanceId,executorStorageId,algorithmRunName,insertedRowDate,lastUpdatedDate,runDate,isRunning,isFinished,algorithmSchedule_algorithmScheduleId,algorithmSchedule_guid,algorithmSchedule_algorithmImplementationId,algorithmSchedule_algorithmScheduleTypeId,algorithmSchedule_algorithmScheduleName,algorithmSchedule_isScheduled,algorithmSchedule_insertedRowDate,algorithmSchedule_lastUpdatedDate,executorInstance_executorInstanceId,executorInstance_guid,executorInstance_executorTypeId,executorInstance_executorHostId,executorInstance_executorInstanceName,executorInstance_isRunning,executorInstance_isFinished,executorInstance_portNumber,executorInstance_insertedRowDate,executorInstance_lastUpdatedDate,executorInstance_endDate,executorStorage_executorStorageId,executorStorage_guid,executorStorage_executorHostId,executorStorage_executorStorageTypeId,executorStorage_storageDefinition,executorStorage_storageBasePath,executorStorage_storageFulllPath,executorStorage_isRunning,executorStorage_portNumber,executorStorage_insertedRowDate,executorStorage_lastUpdatedDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+algorithmRunId,""+guid,""+algorithmScheduleId,""+executorInstanceId,""+executorStorageId,""+algorithmRunName,""+insertedRowDate,""+lastUpdatedDate,""+runDate,""+isRunning,""+isFinished,""+algorithmSchedule_algorithmScheduleId,""+algorithmSchedule_guid,""+algorithmSchedule_algorithmImplementationId,""+algorithmSchedule_algorithmScheduleTypeId,""+algorithmSchedule_algorithmScheduleName,""+algorithmSchedule_isScheduled,""+algorithmSchedule_insertedRowDate,""+algorithmSchedule_lastUpdatedDate,""+executorInstance_executorInstanceId,""+executorInstance_guid,""+executorInstance_executorTypeId,""+executorInstance_executorHostId,""+executorInstance_executorInstanceName,""+executorInstance_isRunning,""+executorInstance_isFinished,""+executorInstance_portNumber,""+executorInstance_insertedRowDate,""+executorInstance_lastUpdatedDate,""+executorInstance_endDate,""+executorStorage_executorStorageId,""+executorStorage_guid,""+executorStorage_executorHostId,""+executorStorage_executorStorageTypeId,""+executorStorage_storageDefinition,""+executorStorage_storageBasePath,""+executorStorage_storageFulllPath,""+executorStorage_isRunning,""+executorStorage_portNumber,""+executorStorage_insertedRowDate,""+executorStorage_lastUpdatedDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "algorithmRunId" => algorithmRunId
      case "guid" => guid
      case "algorithmScheduleId" => algorithmScheduleId
      case "executorInstanceId" => executorInstanceId
      case "executorStorageId" => executorStorageId
      case "algorithmRunName" => algorithmRunName
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case "runDate" => runDate
      case "isRunning" => isRunning
      case "isFinished" => isFinished
      case "algorithmSchedule_algorithmScheduleId" => algorithmSchedule_algorithmScheduleId
      case "algorithmSchedule_guid" => algorithmSchedule_guid
      case "algorithmSchedule_algorithmImplementationId" => algorithmSchedule_algorithmImplementationId
      case "algorithmSchedule_algorithmScheduleTypeId" => algorithmSchedule_algorithmScheduleTypeId
      case "algorithmSchedule_algorithmScheduleName" => algorithmSchedule_algorithmScheduleName
      case "algorithmSchedule_isScheduled" => algorithmSchedule_isScheduled
      case "algorithmSchedule_insertedRowDate" => algorithmSchedule_insertedRowDate
      case "algorithmSchedule_lastUpdatedDate" => algorithmSchedule_lastUpdatedDate
      case "executorInstance_executorInstanceId" => executorInstance_executorInstanceId
      case "executorInstance_guid" => executorInstance_guid
      case "executorInstance_executorTypeId" => executorInstance_executorTypeId
      case "executorInstance_executorHostId" => executorInstance_executorHostId
      case "executorInstance_executorInstanceName" => executorInstance_executorInstanceName
      case "executorInstance_isRunning" => executorInstance_isRunning
      case "executorInstance_isFinished" => executorInstance_isFinished
      case "executorInstance_portNumber" => executorInstance_portNumber
      case "executorInstance_insertedRowDate" => executorInstance_insertedRowDate
      case "executorInstance_lastUpdatedDate" => executorInstance_lastUpdatedDate
      case "executorInstance_endDate" => executorInstance_endDate
      case "executorStorage_executorStorageId" => executorStorage_executorStorageId
      case "executorStorage_guid" => executorStorage_guid
      case "executorStorage_executorHostId" => executorStorage_executorHostId
      case "executorStorage_executorStorageTypeId" => executorStorage_executorStorageTypeId
      case "executorStorage_storageDefinition" => executorStorage_storageDefinition
      case "executorStorage_storageBasePath" => executorStorage_storageBasePath
      case "executorStorage_storageFulllPath" => executorStorage_storageFulllPath
      case "executorStorage_isRunning" => executorStorage_isRunning
      case "executorStorage_portNumber" => executorStorage_portNumber
      case "executorStorage_insertedRowDate" => executorStorage_insertedRowDate
      case "executorStorage_lastUpdatedDate" => executorStorage_lastUpdatedDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "algorithmRunId" => "Long"
      case "guid" => "Long"
      case "algorithmScheduleId" => "Long"
      case "executorInstanceId" => "Long"
      case "executorStorageId" => "Long"
      case "algorithmRunName" => "String"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case "runDate" => "java.util.Date"
      case "isRunning" => "Int"
      case "isFinished" => "Int"
      case "algorithmSchedule_algorithmScheduleId" => "Long"
      case "algorithmSchedule_guid" => "Long"
      case "algorithmSchedule_algorithmImplementationId" => "Long"
      case "algorithmSchedule_algorithmScheduleTypeId" => "Long"
      case "algorithmSchedule_algorithmScheduleName" => "String"
      case "algorithmSchedule_isScheduled" => "Int"
      case "algorithmSchedule_insertedRowDate" => "java.util.Date"
      case "algorithmSchedule_lastUpdatedDate" => "java.util.Date"
      case "executorInstance_executorInstanceId" => "Long"
      case "executorInstance_guid" => "Long"
      case "executorInstance_executorTypeId" => "Long"
      case "executorInstance_executorHostId" => "Long"
      case "executorInstance_executorInstanceName" => "String"
      case "executorInstance_isRunning" => "Int"
      case "executorInstance_isFinished" => "Int"
      case "executorInstance_portNumber" => "Int"
      case "executorInstance_insertedRowDate" => "java.util.Date"
      case "executorInstance_lastUpdatedDate" => "java.util.Date"
      case "executorInstance_endDate" => "java.util.Date"
      case "executorStorage_executorStorageId" => "Long"
      case "executorStorage_guid" => "Long"
      case "executorStorage_executorHostId" => "Long"
      case "executorStorage_executorStorageTypeId" => "Long"
      case "executorStorage_storageDefinition" => "String"
      case "executorStorage_storageBasePath" => "String"
      case "executorStorage_storageFulllPath" => "String"
      case "executorStorage_isRunning" => "Int"
      case "executorStorage_portNumber" => "Int"
      case "executorStorage_insertedRowDate" => "java.util.Date"
      case "executorStorage_lastUpdatedDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
}
object VAlgorithmRunDto {
  val TABLE_NAME = "vAlgorithmRun";
  val FIELD_algorithmRunId = "algorithmRunId";
  val FIELD_guid = "guid";
  val FIELD_algorithmScheduleId = "algorithmScheduleId";
  val FIELD_executorInstanceId = "executorInstanceId";
  val FIELD_executorStorageId = "executorStorageId";
  val FIELD_algorithmRunName = "algorithmRunName";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";
  val FIELD_runDate = "runDate";
  val FIELD_isRunning = "isRunning";
  val FIELD_isFinished = "isFinished";
  val FIELD_algorithmSchedule_algorithmScheduleId = "algorithmSchedule_algorithmScheduleId";
  val FIELD_algorithmSchedule_guid = "algorithmSchedule_guid";
  val FIELD_algorithmSchedule_algorithmImplementationId = "algorithmSchedule_algorithmImplementationId";
  val FIELD_algorithmSchedule_algorithmScheduleTypeId = "algorithmSchedule_algorithmScheduleTypeId";
  val FIELD_algorithmSchedule_algorithmScheduleName = "algorithmSchedule_algorithmScheduleName";
  val FIELD_algorithmSchedule_isScheduled = "algorithmSchedule_isScheduled";
  val FIELD_algorithmSchedule_insertedRowDate = "algorithmSchedule_insertedRowDate";
  val FIELD_algorithmSchedule_lastUpdatedDate = "algorithmSchedule_lastUpdatedDate";
  val FIELD_executorInstance_executorInstanceId = "executorInstance_executorInstanceId";
  val FIELD_executorInstance_guid = "executorInstance_guid";
  val FIELD_executorInstance_executorTypeId = "executorInstance_executorTypeId";
  val FIELD_executorInstance_executorHostId = "executorInstance_executorHostId";
  val FIELD_executorInstance_executorInstanceName = "executorInstance_executorInstanceName";
  val FIELD_executorInstance_isRunning = "executorInstance_isRunning";
  val FIELD_executorInstance_isFinished = "executorInstance_isFinished";
  val FIELD_executorInstance_portNumber = "executorInstance_portNumber";
  val FIELD_executorInstance_insertedRowDate = "executorInstance_insertedRowDate";
  val FIELD_executorInstance_lastUpdatedDate = "executorInstance_lastUpdatedDate";
  val FIELD_executorInstance_endDate = "executorInstance_endDate";
  val FIELD_executorStorage_executorStorageId = "executorStorage_executorStorageId";
  val FIELD_executorStorage_guid = "executorStorage_guid";
  val FIELD_executorStorage_executorHostId = "executorStorage_executorHostId";
  val FIELD_executorStorage_executorStorageTypeId = "executorStorage_executorStorageTypeId";
  val FIELD_executorStorage_storageDefinition = "executorStorage_storageDefinition";
  val FIELD_executorStorage_storageBasePath = "executorStorage_storageBasePath";
  val FIELD_executorStorage_storageFulllPath = "executorStorage_storageFulllPath";
  val FIELD_executorStorage_isRunning = "executorStorage_isRunning";
  val FIELD_executorStorage_portNumber = "executorStorage_portNumber";
  val FIELD_executorStorage_insertedRowDate = "executorStorage_insertedRowDate";
  val FIELD_executorStorage_lastUpdatedDate = "executorStorage_lastUpdatedDate";

}


case class VAlgorithmRunViewDto (
                                  val algorithmRunViewId : Long
                                  , val guid : Long
                                  , val algorithmRunId : Long
                                  , val executorStorageViewId : Long
                                  , val insertedRowDate : java.util.Date
                                  , val lastUpdatedDate : java.util.Date
                                  , val isDownloaded : Int
                                  , val algorithmRun_algorithmRunId : Long
                                  , val algorithmRun_guid : Long
                                  , val algorithmRun_algorithmScheduleId : Long
                                  , val algorithmRun_executorInstanceId : Long
                                  , val algorithmRun_executorStorageId : Long
                                  , val algorithmRun_algorithmRunName : String
                                  , val algorithmRun_insertedRowDate : java.util.Date
                                  , val algorithmRun_lastUpdatedDate : java.util.Date
                                  , val algorithmRun_runDate : java.util.Date
                                  , val algorithmRun_isRunning : Int
                                  , val algorithmRun_isFinished : Int
                                  , val executorStorageView_executorStorageViewId : Long
                                  , val executorStorageView_guid : Long
                                  , val executorStorageView_insertedRowDate : java.util.Date
                                  , val executorStorageView_lastUpdatedDate : java.util.Date
                                  , val executorStorageView_executorStorageSnapshotId : Long
                                  , val executorStorageView_executorStorageId : Long
                                  , val executorStorageView_sourceDownloadId : Long
                                  , val executorStorageView_storagePath : String
                                  , val executorStorageView_viewSize : Long
                                  , val executorStorageView_viewRowsCount : Long
                                ) extends BaseReadOnlyDto {
  def tableName : String = {
    "vAlgorithmRunView";
  }
  def fields : String = {
    "algorithmRunViewId,guid,algorithmRunId,executorStorageViewId,insertedRowDate,lastUpdatedDate,isDownloaded,algorithmRun_algorithmRunId,algorithmRun_guid,algorithmRun_algorithmScheduleId,algorithmRun_executorInstanceId,algorithmRun_executorStorageId,algorithmRun_algorithmRunName,algorithmRun_insertedRowDate,algorithmRun_lastUpdatedDate,algorithmRun_runDate,algorithmRun_isRunning,algorithmRun_isFinished,executorStorageView_executorStorageViewId,executorStorageView_guid,executorStorageView_insertedRowDate,executorStorageView_lastUpdatedDate,executorStorageView_executorStorageSnapshotId,executorStorageView_executorStorageId,executorStorageView_sourceDownloadId,executorStorageView_storagePath,executorStorageView_viewSize,executorStorageView_viewRowsCount";
  }
  def pkFields : String = {
    "";
  }
  def fkFields : String = {
    "";
  }
  def nameField : String = {
    "";
  }
  def getPk() : Long = {
    algorithmRunViewId
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
    Array(algorithmRunViewId,guid,algorithmRunId,executorStorageViewId,insertedRowDate,lastUpdatedDate,isDownloaded,algorithmRun_algorithmRunId,algorithmRun_guid,algorithmRun_algorithmScheduleId,algorithmRun_executorInstanceId,algorithmRun_executorStorageId,algorithmRun_algorithmRunName,algorithmRun_insertedRowDate,algorithmRun_lastUpdatedDate,algorithmRun_runDate,algorithmRun_isRunning,algorithmRun_isFinished,executorStorageView_executorStorageViewId,executorStorageView_guid,executorStorageView_insertedRowDate,executorStorageView_lastUpdatedDate,executorStorageView_executorStorageSnapshotId,executorStorageView_executorStorageId,executorStorageView_sourceDownloadId,executorStorageView_storagePath,executorStorageView_viewSize,executorStorageView_viewRowsCount)
  }
  def toStringArray() : Array[String] = {
    Array(""+algorithmRunViewId,""+guid,""+algorithmRunId,""+executorStorageViewId,""+insertedRowDate,""+lastUpdatedDate,""+isDownloaded,""+algorithmRun_algorithmRunId,""+algorithmRun_guid,""+algorithmRun_algorithmScheduleId,""+algorithmRun_executorInstanceId,""+algorithmRun_executorStorageId,""+algorithmRun_algorithmRunName,""+algorithmRun_insertedRowDate,""+algorithmRun_lastUpdatedDate,""+algorithmRun_runDate,""+algorithmRun_isRunning,""+algorithmRun_isFinished,""+executorStorageView_executorStorageViewId,""+executorStorageView_guid,""+executorStorageView_insertedRowDate,""+executorStorageView_lastUpdatedDate,""+executorStorageView_executorStorageSnapshotId,""+executorStorageView_executorStorageId,""+executorStorageView_sourceDownloadId,""+executorStorageView_storagePath,""+executorStorageView_viewSize,""+executorStorageView_viewRowsCount)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "algorithmRunViewId" => algorithmRunViewId
      case "guid" => guid
      case "algorithmRunId" => algorithmRunId
      case "executorStorageViewId" => executorStorageViewId
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case "isDownloaded" => isDownloaded
      case "algorithmRun_algorithmRunId" => algorithmRun_algorithmRunId
      case "algorithmRun_guid" => algorithmRun_guid
      case "algorithmRun_algorithmScheduleId" => algorithmRun_algorithmScheduleId
      case "algorithmRun_executorInstanceId" => algorithmRun_executorInstanceId
      case "algorithmRun_executorStorageId" => algorithmRun_executorStorageId
      case "algorithmRun_algorithmRunName" => algorithmRun_algorithmRunName
      case "algorithmRun_insertedRowDate" => algorithmRun_insertedRowDate
      case "algorithmRun_lastUpdatedDate" => algorithmRun_lastUpdatedDate
      case "algorithmRun_runDate" => algorithmRun_runDate
      case "algorithmRun_isRunning" => algorithmRun_isRunning
      case "algorithmRun_isFinished" => algorithmRun_isFinished
      case "executorStorageView_executorStorageViewId" => executorStorageView_executorStorageViewId
      case "executorStorageView_guid" => executorStorageView_guid
      case "executorStorageView_insertedRowDate" => executorStorageView_insertedRowDate
      case "executorStorageView_lastUpdatedDate" => executorStorageView_lastUpdatedDate
      case "executorStorageView_executorStorageSnapshotId" => executorStorageView_executorStorageSnapshotId
      case "executorStorageView_executorStorageId" => executorStorageView_executorStorageId
      case "executorStorageView_sourceDownloadId" => executorStorageView_sourceDownloadId
      case "executorStorageView_storagePath" => executorStorageView_storagePath
      case "executorStorageView_viewSize" => executorStorageView_viewSize
      case "executorStorageView_viewRowsCount" => executorStorageView_viewRowsCount
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "algorithmRunViewId" => "Long"
      case "guid" => "Long"
      case "algorithmRunId" => "Long"
      case "executorStorageViewId" => "Long"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case "isDownloaded" => "Int"
      case "algorithmRun_algorithmRunId" => "Long"
      case "algorithmRun_guid" => "Long"
      case "algorithmRun_algorithmScheduleId" => "Long"
      case "algorithmRun_executorInstanceId" => "Long"
      case "algorithmRun_executorStorageId" => "Long"
      case "algorithmRun_algorithmRunName" => "String"
      case "algorithmRun_insertedRowDate" => "java.util.Date"
      case "algorithmRun_lastUpdatedDate" => "java.util.Date"
      case "algorithmRun_runDate" => "java.util.Date"
      case "algorithmRun_isRunning" => "Int"
      case "algorithmRun_isFinished" => "Int"
      case "executorStorageView_executorStorageViewId" => "Long"
      case "executorStorageView_guid" => "Long"
      case "executorStorageView_insertedRowDate" => "java.util.Date"
      case "executorStorageView_lastUpdatedDate" => "java.util.Date"
      case "executorStorageView_executorStorageSnapshotId" => "Long"
      case "executorStorageView_executorStorageId" => "Long"
      case "executorStorageView_sourceDownloadId" => "Long"
      case "executorStorageView_storagePath" => "String"
      case "executorStorageView_viewSize" => "Long"
      case "executorStorageView_viewRowsCount" => "Long"
      case _ => "Object"
    }
    ret
  }
}
object VAlgorithmRunViewDto {
  val TABLE_NAME = "vAlgorithmRunView";
  val FIELD_algorithmRunViewId = "algorithmRunViewId";
  val FIELD_guid = "guid";
  val FIELD_algorithmRunId = "algorithmRunId";
  val FIELD_executorStorageViewId = "executorStorageViewId";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";
  val FIELD_isDownloaded = "isDownloaded";
  val FIELD_algorithmRun_algorithmRunId = "algorithmRun_algorithmRunId";
  val FIELD_algorithmRun_guid = "algorithmRun_guid";
  val FIELD_algorithmRun_algorithmScheduleId = "algorithmRun_algorithmScheduleId";
  val FIELD_algorithmRun_executorInstanceId = "algorithmRun_executorInstanceId";
  val FIELD_algorithmRun_executorStorageId = "algorithmRun_executorStorageId";
  val FIELD_algorithmRun_algorithmRunName = "algorithmRun_algorithmRunName";
  val FIELD_algorithmRun_insertedRowDate = "algorithmRun_insertedRowDate";
  val FIELD_algorithmRun_lastUpdatedDate = "algorithmRun_lastUpdatedDate";
  val FIELD_algorithmRun_runDate = "algorithmRun_runDate";
  val FIELD_algorithmRun_isRunning = "algorithmRun_isRunning";
  val FIELD_algorithmRun_isFinished = "algorithmRun_isFinished";
  val FIELD_executorStorageView_executorStorageViewId = "executorStorageView_executorStorageViewId";
  val FIELD_executorStorageView_guid = "executorStorageView_guid";
  val FIELD_executorStorageView_insertedRowDate = "executorStorageView_insertedRowDate";
  val FIELD_executorStorageView_lastUpdatedDate = "executorStorageView_lastUpdatedDate";
  val FIELD_executorStorageView_executorStorageSnapshotId = "executorStorageView_executorStorageSnapshotId";
  val FIELD_executorStorageView_executorStorageId = "executorStorageView_executorStorageId";
  val FIELD_executorStorageView_sourceDownloadId = "executorStorageView_sourceDownloadId";
  val FIELD_executorStorageView_storagePath = "executorStorageView_storagePath";
  val FIELD_executorStorageView_viewSize = "executorStorageView_viewSize";
  val FIELD_executorStorageView_viewRowsCount = "executorStorageView_viewRowsCount";

}


case class VAlgorithmScheduleDto (
                                   val algorithmScheduleId : Long
                                   , val guid : Long
                                   , val algorithmImplementationId : Long
                                   , val algorithmScheduleTypeId : Long
                                   , val algorithmScheduleName : String
                                   , val isScheduled : Int
                                   , val insertedRowDate : java.util.Date
                                   , val lastUpdatedDate : java.util.Date
                                   , val algorithmImplementation_algorithmImplementationId : Long
                                   , val algorithmImplementation_guid : Long
                                   , val algorithmImplementation_insertedRowDate : java.util.Date
                                   , val algorithmImplementation_lastUpdatedDate : java.util.Date
                                   , val algorithmImplementation_algorithmTypeVersionId : Long
                                   , val algorithmImplementation_executorTypeId : Long
                                   , val algorithmImplementation_algorithmImplementationName : String
                                   , val algorithmImplementation_algorithmImplementationClass : String
                                   , val algorithmScheduleType_algorithmScheduleTypeId : Long
                                   , val algorithmScheduleType_guid : Long
                                   , val algorithmScheduleType_algorithmScheduleTypeName : String
                                   , val algorithmScheduleType_insertedRowDate : java.util.Date
                                   , val algorithmScheduleType_lastUpdatedDate : java.util.Date
                                 ) extends BaseReadOnlyDto {
  def tableName : String = {
    "vAlgorithmSchedule";
  }
  def fields : String = {
    "algorithmScheduleId,guid,algorithmImplementationId,algorithmScheduleTypeId,algorithmScheduleName,isScheduled,insertedRowDate,lastUpdatedDate,algorithmImplementation_algorithmImplementationId,algorithmImplementation_guid,algorithmImplementation_insertedRowDate,algorithmImplementation_lastUpdatedDate,algorithmImplementation_algorithmTypeVersionId,algorithmImplementation_executorTypeId,algorithmImplementation_algorithmImplementationName,algorithmImplementation_algorithmImplementationClass,algorithmScheduleType_algorithmScheduleTypeId,algorithmScheduleType_guid,algorithmScheduleType_algorithmScheduleTypeName,algorithmScheduleType_insertedRowDate,algorithmScheduleType_lastUpdatedDate";
  }
  def pkFields : String = {
    "";
  }
  def fkFields : String = {
    "";
  }
  def nameField : String = {
    "";
  }
  def getPk() : Long = {
    algorithmScheduleId
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
    Array(algorithmScheduleId,guid,algorithmImplementationId,algorithmScheduleTypeId,algorithmScheduleName,isScheduled,insertedRowDate,lastUpdatedDate,algorithmImplementation_algorithmImplementationId,algorithmImplementation_guid,algorithmImplementation_insertedRowDate,algorithmImplementation_lastUpdatedDate,algorithmImplementation_algorithmTypeVersionId,algorithmImplementation_executorTypeId,algorithmImplementation_algorithmImplementationName,algorithmImplementation_algorithmImplementationClass,algorithmScheduleType_algorithmScheduleTypeId,algorithmScheduleType_guid,algorithmScheduleType_algorithmScheduleTypeName,algorithmScheduleType_insertedRowDate,algorithmScheduleType_lastUpdatedDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+algorithmScheduleId,""+guid,""+algorithmImplementationId,""+algorithmScheduleTypeId,""+algorithmScheduleName,""+isScheduled,""+insertedRowDate,""+lastUpdatedDate,""+algorithmImplementation_algorithmImplementationId,""+algorithmImplementation_guid,""+algorithmImplementation_insertedRowDate,""+algorithmImplementation_lastUpdatedDate,""+algorithmImplementation_algorithmTypeVersionId,""+algorithmImplementation_executorTypeId,""+algorithmImplementation_algorithmImplementationName,""+algorithmImplementation_algorithmImplementationClass,""+algorithmScheduleType_algorithmScheduleTypeId,""+algorithmScheduleType_guid,""+algorithmScheduleType_algorithmScheduleTypeName,""+algorithmScheduleType_insertedRowDate,""+algorithmScheduleType_lastUpdatedDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "algorithmScheduleId" => algorithmScheduleId
      case "guid" => guid
      case "algorithmImplementationId" => algorithmImplementationId
      case "algorithmScheduleTypeId" => algorithmScheduleTypeId
      case "algorithmScheduleName" => algorithmScheduleName
      case "isScheduled" => isScheduled
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case "algorithmImplementation_algorithmImplementationId" => algorithmImplementation_algorithmImplementationId
      case "algorithmImplementation_guid" => algorithmImplementation_guid
      case "algorithmImplementation_insertedRowDate" => algorithmImplementation_insertedRowDate
      case "algorithmImplementation_lastUpdatedDate" => algorithmImplementation_lastUpdatedDate
      case "algorithmImplementation_algorithmTypeVersionId" => algorithmImplementation_algorithmTypeVersionId
      case "algorithmImplementation_executorTypeId" => algorithmImplementation_executorTypeId
      case "algorithmImplementation_algorithmImplementationName" => algorithmImplementation_algorithmImplementationName
      case "algorithmImplementation_algorithmImplementationClass" => algorithmImplementation_algorithmImplementationClass
      case "algorithmScheduleType_algorithmScheduleTypeId" => algorithmScheduleType_algorithmScheduleTypeId
      case "algorithmScheduleType_guid" => algorithmScheduleType_guid
      case "algorithmScheduleType_algorithmScheduleTypeName" => algorithmScheduleType_algorithmScheduleTypeName
      case "algorithmScheduleType_insertedRowDate" => algorithmScheduleType_insertedRowDate
      case "algorithmScheduleType_lastUpdatedDate" => algorithmScheduleType_lastUpdatedDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "algorithmScheduleId" => "Long"
      case "guid" => "Long"
      case "algorithmImplementationId" => "Long"
      case "algorithmScheduleTypeId" => "Long"
      case "algorithmScheduleName" => "String"
      case "isScheduled" => "Int"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case "algorithmImplementation_algorithmImplementationId" => "Long"
      case "algorithmImplementation_guid" => "Long"
      case "algorithmImplementation_insertedRowDate" => "java.util.Date"
      case "algorithmImplementation_lastUpdatedDate" => "java.util.Date"
      case "algorithmImplementation_algorithmTypeVersionId" => "Long"
      case "algorithmImplementation_executorTypeId" => "Long"
      case "algorithmImplementation_algorithmImplementationName" => "String"
      case "algorithmImplementation_algorithmImplementationClass" => "String"
      case "algorithmScheduleType_algorithmScheduleTypeId" => "Long"
      case "algorithmScheduleType_guid" => "Long"
      case "algorithmScheduleType_algorithmScheduleTypeName" => "String"
      case "algorithmScheduleType_insertedRowDate" => "java.util.Date"
      case "algorithmScheduleType_lastUpdatedDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
}
object VAlgorithmScheduleDto {
  val TABLE_NAME = "vAlgorithmSchedule";
  val FIELD_algorithmScheduleId = "algorithmScheduleId";
  val FIELD_guid = "guid";
  val FIELD_algorithmImplementationId = "algorithmImplementationId";
  val FIELD_algorithmScheduleTypeId = "algorithmScheduleTypeId";
  val FIELD_algorithmScheduleName = "algorithmScheduleName";
  val FIELD_isScheduled = "isScheduled";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";
  val FIELD_algorithmImplementation_algorithmImplementationId = "algorithmImplementation_algorithmImplementationId";
  val FIELD_algorithmImplementation_guid = "algorithmImplementation_guid";
  val FIELD_algorithmImplementation_insertedRowDate = "algorithmImplementation_insertedRowDate";
  val FIELD_algorithmImplementation_lastUpdatedDate = "algorithmImplementation_lastUpdatedDate";
  val FIELD_algorithmImplementation_algorithmTypeVersionId = "algorithmImplementation_algorithmTypeVersionId";
  val FIELD_algorithmImplementation_executorTypeId = "algorithmImplementation_executorTypeId";
  val FIELD_algorithmImplementation_algorithmImplementationName = "algorithmImplementation_algorithmImplementationName";
  val FIELD_algorithmImplementation_algorithmImplementationClass = "algorithmImplementation_algorithmImplementationClass";
  val FIELD_algorithmScheduleType_algorithmScheduleTypeId = "algorithmScheduleType_algorithmScheduleTypeId";
  val FIELD_algorithmScheduleType_guid = "algorithmScheduleType_guid";
  val FIELD_algorithmScheduleType_algorithmScheduleTypeName = "algorithmScheduleType_algorithmScheduleTypeName";
  val FIELD_algorithmScheduleType_insertedRowDate = "algorithmScheduleType_insertedRowDate";
  val FIELD_algorithmScheduleType_lastUpdatedDate = "algorithmScheduleType_lastUpdatedDate";

}


case class VAlgorithmScheduleColumnDto (
                                         val algorithmScheduleColumnId : Long
                                         , val guid : Long
                                         , val algorithmScheduleId : Long
                                         , val algorithmColumnTypeId : Long
                                         , val algorithmScheduleViewId : Long
                                         , val sourceViewId : Long
                                         , val sourceViewColumnId : Long
                                         , val extendedProperties : String
                                         , val insertedRowDate : java.util.Date
                                         , val lastUpdatedDate : java.util.Date
                                         , val algorithmColumnType_algorithmColumnTypeId : Long
                                         , val algorithmColumnType_algorithmColumnTypeName : String
                                         , val algorithmColumnType_algorithmColumnTypeDescription : String
                                         , val algorithmColumnType_insertedRowDate : java.util.Date
                                         , val algorithmColumnType_lastUpdatedDate : java.util.Date
                                         , val algorithmColumnType_guid : Long
                                         , val algorithmSchedule_algorithmScheduleId : Long
                                         , val algorithmSchedule_guid : Long
                                         , val algorithmSchedule_algorithmImplementationId : Long
                                         , val algorithmSchedule_algorithmScheduleTypeId : Long
                                         , val algorithmSchedule_algorithmScheduleName : String
                                         , val algorithmSchedule_isScheduled : Int
                                         , val algorithmSchedule_insertedRowDate : java.util.Date
                                         , val algorithmSchedule_lastUpdatedDate : java.util.Date
                                         , val algorithmScheduleView_algorithmScheduleViewId : Long
                                         , val algorithmScheduleView_guid : Long
                                         , val algorithmScheduleView_algorithmScheduleViewTypeId : Long
                                         , val algorithmScheduleView_algorithmScheduleId : Long
                                         , val algorithmScheduleView_sourceViewId : Long
                                         , val algorithmScheduleView_insertedRowDate : java.util.Date
                                         , val algorithmScheduleView_lastUpdatedDate : java.util.Date
                                         , val algorithmScheduleView_joinOnDefinition : String
                                         , val sourceView_sourceViewId : Long
                                         , val sourceView_guid : Long
                                         , val sourceView_sourceInstanceId : Long
                                         , val sourceView_sourceViewTypeId : Long
                                         , val sourceView_sourceViewName : String
                                         , val sourceView_sourceViewDefinition : String
                                         , val sourceView_insertedRowDate : java.util.Date
                                         , val sourceView_lastUpdatedDate : java.util.Date
                                         , val sourceViewColumn_sourceViewColumnId : Long
                                         , val sourceViewColumn_sourceViewId : Long
                                         , val sourceViewColumn_insertedRowDate : java.util.Date
                                         , val sourceViewColumn_lastUpdatedDate : java.util.Date
                                         , val sourceViewColumn_guid : Long
                                         , val sourceViewColumn_columnName : String
                                         , val sourceViewColumn_columnType : String
                                       ) extends BaseReadOnlyDto {
  def tableName : String = {
    "vAlgorithmScheduleColumn";
  }
  def fields : String = {
    "algorithmScheduleColumnId,guid,algorithmScheduleId,algorithmColumnTypeId,algorithmScheduleViewId,sourceViewId,sourceViewColumnId,extendedProperties,insertedRowDate,lastUpdatedDate,algorithmColumnType_algorithmColumnTypeId,algorithmColumnType_algorithmColumnTypeName,algorithmColumnType_algorithmColumnTypeDescription,algorithmColumnType_insertedRowDate,algorithmColumnType_lastUpdatedDate,algorithmColumnType_guid,algorithmSchedule_algorithmScheduleId,algorithmSchedule_guid,algorithmSchedule_algorithmImplementationId,algorithmSchedule_algorithmScheduleTypeId,algorithmSchedule_algorithmScheduleName,algorithmSchedule_isScheduled,algorithmSchedule_insertedRowDate,algorithmSchedule_lastUpdatedDate,algorithmScheduleView_algorithmScheduleViewId,algorithmScheduleView_guid,algorithmScheduleView_algorithmScheduleViewTypeId,algorithmScheduleView_algorithmScheduleId,algorithmScheduleView_sourceViewId,algorithmScheduleView_insertedRowDate,algorithmScheduleView_lastUpdatedDate,algorithmScheduleView_joinOnDefinition,sourceView_sourceViewId,sourceView_guid,sourceView_sourceInstanceId,sourceView_sourceViewTypeId,sourceView_sourceViewName,sourceView_sourceViewDefinition,sourceView_insertedRowDate,sourceView_lastUpdatedDate,sourceViewColumn_sourceViewColumnId,sourceViewColumn_sourceViewId,sourceViewColumn_insertedRowDate,sourceViewColumn_lastUpdatedDate,sourceViewColumn_guid,sourceViewColumn_columnName,sourceViewColumn_columnType";
  }
  def pkFields : String = {
    "";
  }
  def fkFields : String = {
    "";
  }
  def nameField : String = {
    "";
  }
  def getPk() : Long = {
    algorithmScheduleColumnId
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
    Array(algorithmScheduleColumnId,guid,algorithmScheduleId,algorithmColumnTypeId,algorithmScheduleViewId,sourceViewId,sourceViewColumnId,extendedProperties,insertedRowDate,lastUpdatedDate,algorithmColumnType_algorithmColumnTypeId,algorithmColumnType_algorithmColumnTypeName,algorithmColumnType_algorithmColumnTypeDescription,algorithmColumnType_insertedRowDate,algorithmColumnType_lastUpdatedDate,algorithmColumnType_guid,algorithmSchedule_algorithmScheduleId,algorithmSchedule_guid,algorithmSchedule_algorithmImplementationId,algorithmSchedule_algorithmScheduleTypeId,algorithmSchedule_algorithmScheduleName,algorithmSchedule_isScheduled,algorithmSchedule_insertedRowDate,algorithmSchedule_lastUpdatedDate,algorithmScheduleView_algorithmScheduleViewId,algorithmScheduleView_guid,algorithmScheduleView_algorithmScheduleViewTypeId,algorithmScheduleView_algorithmScheduleId,algorithmScheduleView_sourceViewId,algorithmScheduleView_insertedRowDate,algorithmScheduleView_lastUpdatedDate,algorithmScheduleView_joinOnDefinition,sourceView_sourceViewId,sourceView_guid,sourceView_sourceInstanceId,sourceView_sourceViewTypeId,sourceView_sourceViewName,sourceView_sourceViewDefinition,sourceView_insertedRowDate,sourceView_lastUpdatedDate,sourceViewColumn_sourceViewColumnId,sourceViewColumn_sourceViewId,sourceViewColumn_insertedRowDate,sourceViewColumn_lastUpdatedDate,sourceViewColumn_guid,sourceViewColumn_columnName,sourceViewColumn_columnType)
  }
  def toStringArray() : Array[String] = {
    Array(""+algorithmScheduleColumnId,""+guid,""+algorithmScheduleId,""+algorithmColumnTypeId,""+algorithmScheduleViewId,""+sourceViewId,""+sourceViewColumnId,""+extendedProperties,""+insertedRowDate,""+lastUpdatedDate,""+algorithmColumnType_algorithmColumnTypeId,""+algorithmColumnType_algorithmColumnTypeName,""+algorithmColumnType_algorithmColumnTypeDescription,""+algorithmColumnType_insertedRowDate,""+algorithmColumnType_lastUpdatedDate,""+algorithmColumnType_guid,""+algorithmSchedule_algorithmScheduleId,""+algorithmSchedule_guid,""+algorithmSchedule_algorithmImplementationId,""+algorithmSchedule_algorithmScheduleTypeId,""+algorithmSchedule_algorithmScheduleName,""+algorithmSchedule_isScheduled,""+algorithmSchedule_insertedRowDate,""+algorithmSchedule_lastUpdatedDate,""+algorithmScheduleView_algorithmScheduleViewId,""+algorithmScheduleView_guid,""+algorithmScheduleView_algorithmScheduleViewTypeId,""+algorithmScheduleView_algorithmScheduleId,""+algorithmScheduleView_sourceViewId,""+algorithmScheduleView_insertedRowDate,""+algorithmScheduleView_lastUpdatedDate,""+algorithmScheduleView_joinOnDefinition,""+sourceView_sourceViewId,""+sourceView_guid,""+sourceView_sourceInstanceId,""+sourceView_sourceViewTypeId,""+sourceView_sourceViewName,""+sourceView_sourceViewDefinition,""+sourceView_insertedRowDate,""+sourceView_lastUpdatedDate,""+sourceViewColumn_sourceViewColumnId,""+sourceViewColumn_sourceViewId,""+sourceViewColumn_insertedRowDate,""+sourceViewColumn_lastUpdatedDate,""+sourceViewColumn_guid,""+sourceViewColumn_columnName,""+sourceViewColumn_columnType)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "algorithmScheduleColumnId" => algorithmScheduleColumnId
      case "guid" => guid
      case "algorithmScheduleId" => algorithmScheduleId
      case "algorithmColumnTypeId" => algorithmColumnTypeId
      case "algorithmScheduleViewId" => algorithmScheduleViewId
      case "sourceViewId" => sourceViewId
      case "sourceViewColumnId" => sourceViewColumnId
      case "extendedProperties" => extendedProperties
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case "algorithmColumnType_algorithmColumnTypeId" => algorithmColumnType_algorithmColumnTypeId
      case "algorithmColumnType_algorithmColumnTypeName" => algorithmColumnType_algorithmColumnTypeName
      case "algorithmColumnType_algorithmColumnTypeDescription" => algorithmColumnType_algorithmColumnTypeDescription
      case "algorithmColumnType_insertedRowDate" => algorithmColumnType_insertedRowDate
      case "algorithmColumnType_lastUpdatedDate" => algorithmColumnType_lastUpdatedDate
      case "algorithmColumnType_guid" => algorithmColumnType_guid
      case "algorithmSchedule_algorithmScheduleId" => algorithmSchedule_algorithmScheduleId
      case "algorithmSchedule_guid" => algorithmSchedule_guid
      case "algorithmSchedule_algorithmImplementationId" => algorithmSchedule_algorithmImplementationId
      case "algorithmSchedule_algorithmScheduleTypeId" => algorithmSchedule_algorithmScheduleTypeId
      case "algorithmSchedule_algorithmScheduleName" => algorithmSchedule_algorithmScheduleName
      case "algorithmSchedule_isScheduled" => algorithmSchedule_isScheduled
      case "algorithmSchedule_insertedRowDate" => algorithmSchedule_insertedRowDate
      case "algorithmSchedule_lastUpdatedDate" => algorithmSchedule_lastUpdatedDate
      case "algorithmScheduleView_algorithmScheduleViewId" => algorithmScheduleView_algorithmScheduleViewId
      case "algorithmScheduleView_guid" => algorithmScheduleView_guid
      case "algorithmScheduleView_algorithmScheduleViewTypeId" => algorithmScheduleView_algorithmScheduleViewTypeId
      case "algorithmScheduleView_algorithmScheduleId" => algorithmScheduleView_algorithmScheduleId
      case "algorithmScheduleView_sourceViewId" => algorithmScheduleView_sourceViewId
      case "algorithmScheduleView_insertedRowDate" => algorithmScheduleView_insertedRowDate
      case "algorithmScheduleView_lastUpdatedDate" => algorithmScheduleView_lastUpdatedDate
      case "algorithmScheduleView_joinOnDefinition" => algorithmScheduleView_joinOnDefinition
      case "sourceView_sourceViewId" => sourceView_sourceViewId
      case "sourceView_guid" => sourceView_guid
      case "sourceView_sourceInstanceId" => sourceView_sourceInstanceId
      case "sourceView_sourceViewTypeId" => sourceView_sourceViewTypeId
      case "sourceView_sourceViewName" => sourceView_sourceViewName
      case "sourceView_sourceViewDefinition" => sourceView_sourceViewDefinition
      case "sourceView_insertedRowDate" => sourceView_insertedRowDate
      case "sourceView_lastUpdatedDate" => sourceView_lastUpdatedDate
      case "sourceViewColumn_sourceViewColumnId" => sourceViewColumn_sourceViewColumnId
      case "sourceViewColumn_sourceViewId" => sourceViewColumn_sourceViewId
      case "sourceViewColumn_insertedRowDate" => sourceViewColumn_insertedRowDate
      case "sourceViewColumn_lastUpdatedDate" => sourceViewColumn_lastUpdatedDate
      case "sourceViewColumn_guid" => sourceViewColumn_guid
      case "sourceViewColumn_columnName" => sourceViewColumn_columnName
      case "sourceViewColumn_columnType" => sourceViewColumn_columnType
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "algorithmScheduleColumnId" => "Long"
      case "guid" => "Long"
      case "algorithmScheduleId" => "Long"
      case "algorithmColumnTypeId" => "Long"
      case "algorithmScheduleViewId" => "Long"
      case "sourceViewId" => "Long"
      case "sourceViewColumnId" => "Long"
      case "extendedProperties" => "String"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case "algorithmColumnType_algorithmColumnTypeId" => "Long"
      case "algorithmColumnType_algorithmColumnTypeName" => "String"
      case "algorithmColumnType_algorithmColumnTypeDescription" => "String"
      case "algorithmColumnType_insertedRowDate" => "java.util.Date"
      case "algorithmColumnType_lastUpdatedDate" => "java.util.Date"
      case "algorithmColumnType_guid" => "Long"
      case "algorithmSchedule_algorithmScheduleId" => "Long"
      case "algorithmSchedule_guid" => "Long"
      case "algorithmSchedule_algorithmImplementationId" => "Long"
      case "algorithmSchedule_algorithmScheduleTypeId" => "Long"
      case "algorithmSchedule_algorithmScheduleName" => "String"
      case "algorithmSchedule_isScheduled" => "Int"
      case "algorithmSchedule_insertedRowDate" => "java.util.Date"
      case "algorithmSchedule_lastUpdatedDate" => "java.util.Date"
      case "algorithmScheduleView_algorithmScheduleViewId" => "Long"
      case "algorithmScheduleView_guid" => "Long"
      case "algorithmScheduleView_algorithmScheduleViewTypeId" => "Long"
      case "algorithmScheduleView_algorithmScheduleId" => "Long"
      case "algorithmScheduleView_sourceViewId" => "Long"
      case "algorithmScheduleView_insertedRowDate" => "java.util.Date"
      case "algorithmScheduleView_lastUpdatedDate" => "java.util.Date"
      case "algorithmScheduleView_joinOnDefinition" => "String"
      case "sourceView_sourceViewId" => "Long"
      case "sourceView_guid" => "Long"
      case "sourceView_sourceInstanceId" => "Long"
      case "sourceView_sourceViewTypeId" => "Long"
      case "sourceView_sourceViewName" => "String"
      case "sourceView_sourceViewDefinition" => "String"
      case "sourceView_insertedRowDate" => "java.util.Date"
      case "sourceView_lastUpdatedDate" => "java.util.Date"
      case "sourceViewColumn_sourceViewColumnId" => "Long"
      case "sourceViewColumn_sourceViewId" => "Long"
      case "sourceViewColumn_insertedRowDate" => "java.util.Date"
      case "sourceViewColumn_lastUpdatedDate" => "java.util.Date"
      case "sourceViewColumn_guid" => "Long"
      case "sourceViewColumn_columnName" => "String"
      case "sourceViewColumn_columnType" => "String"
      case _ => "Object"
    }
    ret
  }
}
object VAlgorithmScheduleColumnDto {
  val TABLE_NAME = "vAlgorithmScheduleColumn";
  val FIELD_algorithmScheduleColumnId = "algorithmScheduleColumnId";
  val FIELD_guid = "guid";
  val FIELD_algorithmScheduleId = "algorithmScheduleId";
  val FIELD_algorithmColumnTypeId = "algorithmColumnTypeId";
  val FIELD_algorithmScheduleViewId = "algorithmScheduleViewId";
  val FIELD_sourceViewId = "sourceViewId";
  val FIELD_sourceViewColumnId = "sourceViewColumnId";
  val FIELD_extendedProperties = "extendedProperties";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";
  val FIELD_algorithmColumnType_algorithmColumnTypeId = "algorithmColumnType_algorithmColumnTypeId";
  val FIELD_algorithmColumnType_algorithmColumnTypeName = "algorithmColumnType_algorithmColumnTypeName";
  val FIELD_algorithmColumnType_algorithmColumnTypeDescription = "algorithmColumnType_algorithmColumnTypeDescription";
  val FIELD_algorithmColumnType_insertedRowDate = "algorithmColumnType_insertedRowDate";
  val FIELD_algorithmColumnType_lastUpdatedDate = "algorithmColumnType_lastUpdatedDate";
  val FIELD_algorithmColumnType_guid = "algorithmColumnType_guid";
  val FIELD_algorithmSchedule_algorithmScheduleId = "algorithmSchedule_algorithmScheduleId";
  val FIELD_algorithmSchedule_guid = "algorithmSchedule_guid";
  val FIELD_algorithmSchedule_algorithmImplementationId = "algorithmSchedule_algorithmImplementationId";
  val FIELD_algorithmSchedule_algorithmScheduleTypeId = "algorithmSchedule_algorithmScheduleTypeId";
  val FIELD_algorithmSchedule_algorithmScheduleName = "algorithmSchedule_algorithmScheduleName";
  val FIELD_algorithmSchedule_isScheduled = "algorithmSchedule_isScheduled";
  val FIELD_algorithmSchedule_insertedRowDate = "algorithmSchedule_insertedRowDate";
  val FIELD_algorithmSchedule_lastUpdatedDate = "algorithmSchedule_lastUpdatedDate";
  val FIELD_algorithmScheduleView_algorithmScheduleViewId = "algorithmScheduleView_algorithmScheduleViewId";
  val FIELD_algorithmScheduleView_guid = "algorithmScheduleView_guid";
  val FIELD_algorithmScheduleView_algorithmScheduleViewTypeId = "algorithmScheduleView_algorithmScheduleViewTypeId";
  val FIELD_algorithmScheduleView_algorithmScheduleId = "algorithmScheduleView_algorithmScheduleId";
  val FIELD_algorithmScheduleView_sourceViewId = "algorithmScheduleView_sourceViewId";
  val FIELD_algorithmScheduleView_insertedRowDate = "algorithmScheduleView_insertedRowDate";
  val FIELD_algorithmScheduleView_lastUpdatedDate = "algorithmScheduleView_lastUpdatedDate";
  val FIELD_algorithmScheduleView_joinOnDefinition = "algorithmScheduleView_joinOnDefinition";
  val FIELD_sourceView_sourceViewId = "sourceView_sourceViewId";
  val FIELD_sourceView_guid = "sourceView_guid";
  val FIELD_sourceView_sourceInstanceId = "sourceView_sourceInstanceId";
  val FIELD_sourceView_sourceViewTypeId = "sourceView_sourceViewTypeId";
  val FIELD_sourceView_sourceViewName = "sourceView_sourceViewName";
  val FIELD_sourceView_sourceViewDefinition = "sourceView_sourceViewDefinition";
  val FIELD_sourceView_insertedRowDate = "sourceView_insertedRowDate";
  val FIELD_sourceView_lastUpdatedDate = "sourceView_lastUpdatedDate";
  val FIELD_sourceViewColumn_sourceViewColumnId = "sourceViewColumn_sourceViewColumnId";
  val FIELD_sourceViewColumn_sourceViewId = "sourceViewColumn_sourceViewId";
  val FIELD_sourceViewColumn_insertedRowDate = "sourceViewColumn_insertedRowDate";
  val FIELD_sourceViewColumn_lastUpdatedDate = "sourceViewColumn_lastUpdatedDate";
  val FIELD_sourceViewColumn_guid = "sourceViewColumn_guid";
  val FIELD_sourceViewColumn_columnName = "sourceViewColumn_columnName";
  val FIELD_sourceViewColumn_columnType = "sourceViewColumn_columnType";

}


case class VAlgorithmScheduleParamDto (
                                        val algorithmScheduleParamId : Long
                                        , val guid : Long
                                        , val algorithmScheduleId : Long
                                        , val algorithmParamId : Long
                                        , val algorithmParamValue : String
                                        , val insertedRowDate : java.util.Date
                                        , val lastUpdatedDate : java.util.Date
                                        , val algorithmParam_algorithmParamId : Long
                                        , val algorithmParam_guid : Long
                                        , val algorithmParam_insertedRowDate : java.util.Date
                                        , val algorithmParam_lastUpdatedDate : java.util.Date
                                        , val algorithmParam_algorithmParamName : String
                                        , val algorithmParam_algorithmParamDescription : String
                                        , val algorithmParam_algorithmParamType : String
                                        , val algorithmSchedule_algorithmScheduleId : Long
                                        , val algorithmSchedule_guid : Long
                                        , val algorithmSchedule_algorithmImplementationId : Long
                                        , val algorithmSchedule_algorithmScheduleTypeId : Long
                                        , val algorithmSchedule_algorithmScheduleName : String
                                        , val algorithmSchedule_isScheduled : Int
                                        , val algorithmSchedule_insertedRowDate : java.util.Date
                                        , val algorithmSchedule_lastUpdatedDate : java.util.Date
                                      ) extends BaseReadOnlyDto {
  def tableName : String = {
    "vAlgorithmScheduleParam";
  }
  def fields : String = {
    "algorithmScheduleParamId,guid,algorithmScheduleId,algorithmParamId,algorithmParamValue,insertedRowDate,lastUpdatedDate,algorithmParam_algorithmParamId,algorithmParam_guid,algorithmParam_insertedRowDate,algorithmParam_lastUpdatedDate,algorithmParam_algorithmParamName,algorithmParam_algorithmParamDescription,algorithmParam_algorithmParamType,algorithmSchedule_algorithmScheduleId,algorithmSchedule_guid,algorithmSchedule_algorithmImplementationId,algorithmSchedule_algorithmScheduleTypeId,algorithmSchedule_algorithmScheduleName,algorithmSchedule_isScheduled,algorithmSchedule_insertedRowDate,algorithmSchedule_lastUpdatedDate";
  }
  def pkFields : String = {
    "";
  }
  def fkFields : String = {
    "";
  }
  def nameField : String = {
    "";
  }
  def getPk() : Long = {
    algorithmScheduleParamId
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
    Array(algorithmScheduleParamId,guid,algorithmScheduleId,algorithmParamId,algorithmParamValue,insertedRowDate,lastUpdatedDate,algorithmParam_algorithmParamId,algorithmParam_guid,algorithmParam_insertedRowDate,algorithmParam_lastUpdatedDate,algorithmParam_algorithmParamName,algorithmParam_algorithmParamDescription,algorithmParam_algorithmParamType,algorithmSchedule_algorithmScheduleId,algorithmSchedule_guid,algorithmSchedule_algorithmImplementationId,algorithmSchedule_algorithmScheduleTypeId,algorithmSchedule_algorithmScheduleName,algorithmSchedule_isScheduled,algorithmSchedule_insertedRowDate,algorithmSchedule_lastUpdatedDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+algorithmScheduleParamId,""+guid,""+algorithmScheduleId,""+algorithmParamId,""+algorithmParamValue,""+insertedRowDate,""+lastUpdatedDate,""+algorithmParam_algorithmParamId,""+algorithmParam_guid,""+algorithmParam_insertedRowDate,""+algorithmParam_lastUpdatedDate,""+algorithmParam_algorithmParamName,""+algorithmParam_algorithmParamDescription,""+algorithmParam_algorithmParamType,""+algorithmSchedule_algorithmScheduleId,""+algorithmSchedule_guid,""+algorithmSchedule_algorithmImplementationId,""+algorithmSchedule_algorithmScheduleTypeId,""+algorithmSchedule_algorithmScheduleName,""+algorithmSchedule_isScheduled,""+algorithmSchedule_insertedRowDate,""+algorithmSchedule_lastUpdatedDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "algorithmScheduleParamId" => algorithmScheduleParamId
      case "guid" => guid
      case "algorithmScheduleId" => algorithmScheduleId
      case "algorithmParamId" => algorithmParamId
      case "algorithmParamValue" => algorithmParamValue
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case "algorithmParam_algorithmParamId" => algorithmParam_algorithmParamId
      case "algorithmParam_guid" => algorithmParam_guid
      case "algorithmParam_insertedRowDate" => algorithmParam_insertedRowDate
      case "algorithmParam_lastUpdatedDate" => algorithmParam_lastUpdatedDate
      case "algorithmParam_algorithmParamName" => algorithmParam_algorithmParamName
      case "algorithmParam_algorithmParamDescription" => algorithmParam_algorithmParamDescription
      case "algorithmParam_algorithmParamType" => algorithmParam_algorithmParamType
      case "algorithmSchedule_algorithmScheduleId" => algorithmSchedule_algorithmScheduleId
      case "algorithmSchedule_guid" => algorithmSchedule_guid
      case "algorithmSchedule_algorithmImplementationId" => algorithmSchedule_algorithmImplementationId
      case "algorithmSchedule_algorithmScheduleTypeId" => algorithmSchedule_algorithmScheduleTypeId
      case "algorithmSchedule_algorithmScheduleName" => algorithmSchedule_algorithmScheduleName
      case "algorithmSchedule_isScheduled" => algorithmSchedule_isScheduled
      case "algorithmSchedule_insertedRowDate" => algorithmSchedule_insertedRowDate
      case "algorithmSchedule_lastUpdatedDate" => algorithmSchedule_lastUpdatedDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "algorithmScheduleParamId" => "Long"
      case "guid" => "Long"
      case "algorithmScheduleId" => "Long"
      case "algorithmParamId" => "Long"
      case "algorithmParamValue" => "String"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case "algorithmParam_algorithmParamId" => "Long"
      case "algorithmParam_guid" => "Long"
      case "algorithmParam_insertedRowDate" => "java.util.Date"
      case "algorithmParam_lastUpdatedDate" => "java.util.Date"
      case "algorithmParam_algorithmParamName" => "String"
      case "algorithmParam_algorithmParamDescription" => "String"
      case "algorithmParam_algorithmParamType" => "String"
      case "algorithmSchedule_algorithmScheduleId" => "Long"
      case "algorithmSchedule_guid" => "Long"
      case "algorithmSchedule_algorithmImplementationId" => "Long"
      case "algorithmSchedule_algorithmScheduleTypeId" => "Long"
      case "algorithmSchedule_algorithmScheduleName" => "String"
      case "algorithmSchedule_isScheduled" => "Int"
      case "algorithmSchedule_insertedRowDate" => "java.util.Date"
      case "algorithmSchedule_lastUpdatedDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
}
object VAlgorithmScheduleParamDto {
  val TABLE_NAME = "vAlgorithmScheduleParam";
  val FIELD_algorithmScheduleParamId = "algorithmScheduleParamId";
  val FIELD_guid = "guid";
  val FIELD_algorithmScheduleId = "algorithmScheduleId";
  val FIELD_algorithmParamId = "algorithmParamId";
  val FIELD_algorithmParamValue = "algorithmParamValue";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";
  val FIELD_algorithmParam_algorithmParamId = "algorithmParam_algorithmParamId";
  val FIELD_algorithmParam_guid = "algorithmParam_guid";
  val FIELD_algorithmParam_insertedRowDate = "algorithmParam_insertedRowDate";
  val FIELD_algorithmParam_lastUpdatedDate = "algorithmParam_lastUpdatedDate";
  val FIELD_algorithmParam_algorithmParamName = "algorithmParam_algorithmParamName";
  val FIELD_algorithmParam_algorithmParamDescription = "algorithmParam_algorithmParamDescription";
  val FIELD_algorithmParam_algorithmParamType = "algorithmParam_algorithmParamType";
  val FIELD_algorithmSchedule_algorithmScheduleId = "algorithmSchedule_algorithmScheduleId";
  val FIELD_algorithmSchedule_guid = "algorithmSchedule_guid";
  val FIELD_algorithmSchedule_algorithmImplementationId = "algorithmSchedule_algorithmImplementationId";
  val FIELD_algorithmSchedule_algorithmScheduleTypeId = "algorithmSchedule_algorithmScheduleTypeId";
  val FIELD_algorithmSchedule_algorithmScheduleName = "algorithmSchedule_algorithmScheduleName";
  val FIELD_algorithmSchedule_isScheduled = "algorithmSchedule_isScheduled";
  val FIELD_algorithmSchedule_insertedRowDate = "algorithmSchedule_insertedRowDate";
  val FIELD_algorithmSchedule_lastUpdatedDate = "algorithmSchedule_lastUpdatedDate";

}


case class VAlgorithmScheduleViewDto (
                                       val algorithmScheduleViewId : Long
                                       , val guid : Long
                                       , val algorithmScheduleViewTypeId : Long
                                       , val algorithmScheduleId : Long
                                       , val sourceViewId : Long
                                       , val insertedRowDate : java.util.Date
                                       , val lastUpdatedDate : java.util.Date
                                       , val joinOnDefinition : String
                                       , val algorithmSchedule_algorithmScheduleId : Long
                                       , val algorithmSchedule_guid : Long
                                       , val algorithmSchedule_algorithmImplementationId : Long
                                       , val algorithmSchedule_algorithmScheduleTypeId : Long
                                       , val algorithmSchedule_algorithmScheduleName : String
                                       , val algorithmSchedule_isScheduled : Int
                                       , val algorithmSchedule_insertedRowDate : java.util.Date
                                       , val algorithmSchedule_lastUpdatedDate : java.util.Date
                                       , val algorithmScheduleViewType_algorithmScheduleViewTypeId : Long
                                       , val algorithmScheduleViewType_guid : Long
                                       , val algorithmScheduleViewType_algorithmScheduleViewTypeName : String
                                       , val algorithmScheduleViewType_insertedRowDate : java.util.Date
                                       , val algorithmScheduleViewType_lastUpdatedDate : java.util.Date
                                       , val sourceView_sourceViewId : Long
                                       , val sourceView_guid : Long
                                       , val sourceView_sourceInstanceId : Long
                                       , val sourceView_sourceViewTypeId : Long
                                       , val sourceView_sourceViewName : String
                                       , val sourceView_sourceViewDefinition : String
                                       , val sourceView_insertedRowDate : java.util.Date
                                       , val sourceView_lastUpdatedDate : java.util.Date
                                     ) extends BaseReadOnlyDto {
  def tableName : String = {
    "vAlgorithmScheduleView";
  }
  def fields : String = {
    "algorithmScheduleViewId,guid,algorithmScheduleViewTypeId,algorithmScheduleId,sourceViewId,insertedRowDate,lastUpdatedDate,joinOnDefinition,algorithmSchedule_algorithmScheduleId,algorithmSchedule_guid,algorithmSchedule_algorithmImplementationId,algorithmSchedule_algorithmScheduleTypeId,algorithmSchedule_algorithmScheduleName,algorithmSchedule_isScheduled,algorithmSchedule_insertedRowDate,algorithmSchedule_lastUpdatedDate,algorithmScheduleViewType_algorithmScheduleViewTypeId,algorithmScheduleViewType_guid,algorithmScheduleViewType_algorithmScheduleViewTypeName,algorithmScheduleViewType_insertedRowDate,algorithmScheduleViewType_lastUpdatedDate,sourceView_sourceViewId,sourceView_guid,sourceView_sourceInstanceId,sourceView_sourceViewTypeId,sourceView_sourceViewName,sourceView_sourceViewDefinition,sourceView_insertedRowDate,sourceView_lastUpdatedDate";
  }
  def pkFields : String = {
    "";
  }
  def fkFields : String = {
    "";
  }
  def nameField : String = {
    "";
  }
  def getPk() : Long = {
    algorithmScheduleViewId
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
    Array(algorithmScheduleViewId,guid,algorithmScheduleViewTypeId,algorithmScheduleId,sourceViewId,insertedRowDate,lastUpdatedDate,joinOnDefinition,algorithmSchedule_algorithmScheduleId,algorithmSchedule_guid,algorithmSchedule_algorithmImplementationId,algorithmSchedule_algorithmScheduleTypeId,algorithmSchedule_algorithmScheduleName,algorithmSchedule_isScheduled,algorithmSchedule_insertedRowDate,algorithmSchedule_lastUpdatedDate,algorithmScheduleViewType_algorithmScheduleViewTypeId,algorithmScheduleViewType_guid,algorithmScheduleViewType_algorithmScheduleViewTypeName,algorithmScheduleViewType_insertedRowDate,algorithmScheduleViewType_lastUpdatedDate,sourceView_sourceViewId,sourceView_guid,sourceView_sourceInstanceId,sourceView_sourceViewTypeId,sourceView_sourceViewName,sourceView_sourceViewDefinition,sourceView_insertedRowDate,sourceView_lastUpdatedDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+algorithmScheduleViewId,""+guid,""+algorithmScheduleViewTypeId,""+algorithmScheduleId,""+sourceViewId,""+insertedRowDate,""+lastUpdatedDate,""+joinOnDefinition,""+algorithmSchedule_algorithmScheduleId,""+algorithmSchedule_guid,""+algorithmSchedule_algorithmImplementationId,""+algorithmSchedule_algorithmScheduleTypeId,""+algorithmSchedule_algorithmScheduleName,""+algorithmSchedule_isScheduled,""+algorithmSchedule_insertedRowDate,""+algorithmSchedule_lastUpdatedDate,""+algorithmScheduleViewType_algorithmScheduleViewTypeId,""+algorithmScheduleViewType_guid,""+algorithmScheduleViewType_algorithmScheduleViewTypeName,""+algorithmScheduleViewType_insertedRowDate,""+algorithmScheduleViewType_lastUpdatedDate,""+sourceView_sourceViewId,""+sourceView_guid,""+sourceView_sourceInstanceId,""+sourceView_sourceViewTypeId,""+sourceView_sourceViewName,""+sourceView_sourceViewDefinition,""+sourceView_insertedRowDate,""+sourceView_lastUpdatedDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "algorithmScheduleViewId" => algorithmScheduleViewId
      case "guid" => guid
      case "algorithmScheduleViewTypeId" => algorithmScheduleViewTypeId
      case "algorithmScheduleId" => algorithmScheduleId
      case "sourceViewId" => sourceViewId
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case "joinOnDefinition" => joinOnDefinition
      case "algorithmSchedule_algorithmScheduleId" => algorithmSchedule_algorithmScheduleId
      case "algorithmSchedule_guid" => algorithmSchedule_guid
      case "algorithmSchedule_algorithmImplementationId" => algorithmSchedule_algorithmImplementationId
      case "algorithmSchedule_algorithmScheduleTypeId" => algorithmSchedule_algorithmScheduleTypeId
      case "algorithmSchedule_algorithmScheduleName" => algorithmSchedule_algorithmScheduleName
      case "algorithmSchedule_isScheduled" => algorithmSchedule_isScheduled
      case "algorithmSchedule_insertedRowDate" => algorithmSchedule_insertedRowDate
      case "algorithmSchedule_lastUpdatedDate" => algorithmSchedule_lastUpdatedDate
      case "algorithmScheduleViewType_algorithmScheduleViewTypeId" => algorithmScheduleViewType_algorithmScheduleViewTypeId
      case "algorithmScheduleViewType_guid" => algorithmScheduleViewType_guid
      case "algorithmScheduleViewType_algorithmScheduleViewTypeName" => algorithmScheduleViewType_algorithmScheduleViewTypeName
      case "algorithmScheduleViewType_insertedRowDate" => algorithmScheduleViewType_insertedRowDate
      case "algorithmScheduleViewType_lastUpdatedDate" => algorithmScheduleViewType_lastUpdatedDate
      case "sourceView_sourceViewId" => sourceView_sourceViewId
      case "sourceView_guid" => sourceView_guid
      case "sourceView_sourceInstanceId" => sourceView_sourceInstanceId
      case "sourceView_sourceViewTypeId" => sourceView_sourceViewTypeId
      case "sourceView_sourceViewName" => sourceView_sourceViewName
      case "sourceView_sourceViewDefinition" => sourceView_sourceViewDefinition
      case "sourceView_insertedRowDate" => sourceView_insertedRowDate
      case "sourceView_lastUpdatedDate" => sourceView_lastUpdatedDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "algorithmScheduleViewId" => "Long"
      case "guid" => "Long"
      case "algorithmScheduleViewTypeId" => "Long"
      case "algorithmScheduleId" => "Long"
      case "sourceViewId" => "Long"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case "joinOnDefinition" => "String"
      case "algorithmSchedule_algorithmScheduleId" => "Long"
      case "algorithmSchedule_guid" => "Long"
      case "algorithmSchedule_algorithmImplementationId" => "Long"
      case "algorithmSchedule_algorithmScheduleTypeId" => "Long"
      case "algorithmSchedule_algorithmScheduleName" => "String"
      case "algorithmSchedule_isScheduled" => "Int"
      case "algorithmSchedule_insertedRowDate" => "java.util.Date"
      case "algorithmSchedule_lastUpdatedDate" => "java.util.Date"
      case "algorithmScheduleViewType_algorithmScheduleViewTypeId" => "Long"
      case "algorithmScheduleViewType_guid" => "Long"
      case "algorithmScheduleViewType_algorithmScheduleViewTypeName" => "String"
      case "algorithmScheduleViewType_insertedRowDate" => "java.util.Date"
      case "algorithmScheduleViewType_lastUpdatedDate" => "java.util.Date"
      case "sourceView_sourceViewId" => "Long"
      case "sourceView_guid" => "Long"
      case "sourceView_sourceInstanceId" => "Long"
      case "sourceView_sourceViewTypeId" => "Long"
      case "sourceView_sourceViewName" => "String"
      case "sourceView_sourceViewDefinition" => "String"
      case "sourceView_insertedRowDate" => "java.util.Date"
      case "sourceView_lastUpdatedDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
}
object VAlgorithmScheduleViewDto {
  val TABLE_NAME = "vAlgorithmScheduleView";
  val FIELD_algorithmScheduleViewId = "algorithmScheduleViewId";
  val FIELD_guid = "guid";
  val FIELD_algorithmScheduleViewTypeId = "algorithmScheduleViewTypeId";
  val FIELD_algorithmScheduleId = "algorithmScheduleId";
  val FIELD_sourceViewId = "sourceViewId";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";
  val FIELD_joinOnDefinition = "joinOnDefinition";
  val FIELD_algorithmSchedule_algorithmScheduleId = "algorithmSchedule_algorithmScheduleId";
  val FIELD_algorithmSchedule_guid = "algorithmSchedule_guid";
  val FIELD_algorithmSchedule_algorithmImplementationId = "algorithmSchedule_algorithmImplementationId";
  val FIELD_algorithmSchedule_algorithmScheduleTypeId = "algorithmSchedule_algorithmScheduleTypeId";
  val FIELD_algorithmSchedule_algorithmScheduleName = "algorithmSchedule_algorithmScheduleName";
  val FIELD_algorithmSchedule_isScheduled = "algorithmSchedule_isScheduled";
  val FIELD_algorithmSchedule_insertedRowDate = "algorithmSchedule_insertedRowDate";
  val FIELD_algorithmSchedule_lastUpdatedDate = "algorithmSchedule_lastUpdatedDate";
  val FIELD_algorithmScheduleViewType_algorithmScheduleViewTypeId = "algorithmScheduleViewType_algorithmScheduleViewTypeId";
  val FIELD_algorithmScheduleViewType_guid = "algorithmScheduleViewType_guid";
  val FIELD_algorithmScheduleViewType_algorithmScheduleViewTypeName = "algorithmScheduleViewType_algorithmScheduleViewTypeName";
  val FIELD_algorithmScheduleViewType_insertedRowDate = "algorithmScheduleViewType_insertedRowDate";
  val FIELD_algorithmScheduleViewType_lastUpdatedDate = "algorithmScheduleViewType_lastUpdatedDate";
  val FIELD_sourceView_sourceViewId = "sourceView_sourceViewId";
  val FIELD_sourceView_guid = "sourceView_guid";
  val FIELD_sourceView_sourceInstanceId = "sourceView_sourceInstanceId";
  val FIELD_sourceView_sourceViewTypeId = "sourceView_sourceViewTypeId";
  val FIELD_sourceView_sourceViewName = "sourceView_sourceViewName";
  val FIELD_sourceView_sourceViewDefinition = "sourceView_sourceViewDefinition";
  val FIELD_sourceView_insertedRowDate = "sourceView_insertedRowDate";
  val FIELD_sourceView_lastUpdatedDate = "sourceView_lastUpdatedDate";

}


case class VAlgorithmTypeColumnTypeDto (
                                         val algorithmTypeColumnTypeId : Long
                                         , val algorithmTypeVersionId : Long
                                         , val algorithmColumnTypeId : Long
                                         , val allowMultiple : Int
                                         , val allowEmpty : Int
                                         , val insertedRowDate : java.util.Date
                                         , val lastUpdatedDate : java.util.Date
                                         , val guid : Long
                                         , val algorithmColumnType_algorithmColumnTypeId : Long
                                         , val algorithmColumnType_algorithmColumnTypeName : String
                                         , val algorithmColumnType_algorithmColumnTypeDescription : String
                                         , val algorithmColumnType_insertedRowDate : java.util.Date
                                         , val algorithmColumnType_lastUpdatedDate : java.util.Date
                                         , val algorithmColumnType_guid : Long
                                         , val algorithmTypeVersion_algorithmTypeVersionId : Long
                                         , val algorithmTypeVersion_guid : Long
                                         , val algorithmTypeVersion_algorithmTypeId : Long
                                         , val algorithmTypeVersion_algorithmTypeVersionName : String
                                         , val algorithmTypeVersion_insertedRowDate : java.util.Date
                                         , val algorithmTypeVersion_lastUpdatedDate : java.util.Date
                                       ) extends BaseReadOnlyDto {
  def tableName : String = {
    "vAlgorithmTypeColumnType";
  }
  def fields : String = {
    "algorithmTypeColumnTypeId,algorithmTypeVersionId,algorithmColumnTypeId,allowMultiple,allowEmpty,insertedRowDate,lastUpdatedDate,guid,algorithmColumnType_algorithmColumnTypeId,algorithmColumnType_algorithmColumnTypeName,algorithmColumnType_algorithmColumnTypeDescription,algorithmColumnType_insertedRowDate,algorithmColumnType_lastUpdatedDate,algorithmColumnType_guid,algorithmTypeVersion_algorithmTypeVersionId,algorithmTypeVersion_guid,algorithmTypeVersion_algorithmTypeId,algorithmTypeVersion_algorithmTypeVersionName,algorithmTypeVersion_insertedRowDate,algorithmTypeVersion_lastUpdatedDate";
  }
  def pkFields : String = {
    "";
  }
  def fkFields : String = {
    "";
  }
  def nameField : String = {
    "";
  }
  def getPk() : Long = {
    algorithmTypeColumnTypeId
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
    Array(algorithmTypeColumnTypeId,algorithmTypeVersionId,algorithmColumnTypeId,allowMultiple,allowEmpty,insertedRowDate,lastUpdatedDate,guid,algorithmColumnType_algorithmColumnTypeId,algorithmColumnType_algorithmColumnTypeName,algorithmColumnType_algorithmColumnTypeDescription,algorithmColumnType_insertedRowDate,algorithmColumnType_lastUpdatedDate,algorithmColumnType_guid,algorithmTypeVersion_algorithmTypeVersionId,algorithmTypeVersion_guid,algorithmTypeVersion_algorithmTypeId,algorithmTypeVersion_algorithmTypeVersionName,algorithmTypeVersion_insertedRowDate,algorithmTypeVersion_lastUpdatedDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+algorithmTypeColumnTypeId,""+algorithmTypeVersionId,""+algorithmColumnTypeId,""+allowMultiple,""+allowEmpty,""+insertedRowDate,""+lastUpdatedDate,""+guid,""+algorithmColumnType_algorithmColumnTypeId,""+algorithmColumnType_algorithmColumnTypeName,""+algorithmColumnType_algorithmColumnTypeDescription,""+algorithmColumnType_insertedRowDate,""+algorithmColumnType_lastUpdatedDate,""+algorithmColumnType_guid,""+algorithmTypeVersion_algorithmTypeVersionId,""+algorithmTypeVersion_guid,""+algorithmTypeVersion_algorithmTypeId,""+algorithmTypeVersion_algorithmTypeVersionName,""+algorithmTypeVersion_insertedRowDate,""+algorithmTypeVersion_lastUpdatedDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "algorithmTypeColumnTypeId" => algorithmTypeColumnTypeId
      case "algorithmTypeVersionId" => algorithmTypeVersionId
      case "algorithmColumnTypeId" => algorithmColumnTypeId
      case "allowMultiple" => allowMultiple
      case "allowEmpty" => allowEmpty
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case "guid" => guid
      case "algorithmColumnType_algorithmColumnTypeId" => algorithmColumnType_algorithmColumnTypeId
      case "algorithmColumnType_algorithmColumnTypeName" => algorithmColumnType_algorithmColumnTypeName
      case "algorithmColumnType_algorithmColumnTypeDescription" => algorithmColumnType_algorithmColumnTypeDescription
      case "algorithmColumnType_insertedRowDate" => algorithmColumnType_insertedRowDate
      case "algorithmColumnType_lastUpdatedDate" => algorithmColumnType_lastUpdatedDate
      case "algorithmColumnType_guid" => algorithmColumnType_guid
      case "algorithmTypeVersion_algorithmTypeVersionId" => algorithmTypeVersion_algorithmTypeVersionId
      case "algorithmTypeVersion_guid" => algorithmTypeVersion_guid
      case "algorithmTypeVersion_algorithmTypeId" => algorithmTypeVersion_algorithmTypeId
      case "algorithmTypeVersion_algorithmTypeVersionName" => algorithmTypeVersion_algorithmTypeVersionName
      case "algorithmTypeVersion_insertedRowDate" => algorithmTypeVersion_insertedRowDate
      case "algorithmTypeVersion_lastUpdatedDate" => algorithmTypeVersion_lastUpdatedDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "algorithmTypeColumnTypeId" => "Long"
      case "algorithmTypeVersionId" => "Long"
      case "algorithmColumnTypeId" => "Long"
      case "allowMultiple" => "Int"
      case "allowEmpty" => "Int"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case "guid" => "Long"
      case "algorithmColumnType_algorithmColumnTypeId" => "Long"
      case "algorithmColumnType_algorithmColumnTypeName" => "String"
      case "algorithmColumnType_algorithmColumnTypeDescription" => "String"
      case "algorithmColumnType_insertedRowDate" => "java.util.Date"
      case "algorithmColumnType_lastUpdatedDate" => "java.util.Date"
      case "algorithmColumnType_guid" => "Long"
      case "algorithmTypeVersion_algorithmTypeVersionId" => "Long"
      case "algorithmTypeVersion_guid" => "Long"
      case "algorithmTypeVersion_algorithmTypeId" => "Long"
      case "algorithmTypeVersion_algorithmTypeVersionName" => "String"
      case "algorithmTypeVersion_insertedRowDate" => "java.util.Date"
      case "algorithmTypeVersion_lastUpdatedDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
}
object VAlgorithmTypeColumnTypeDto {
  val TABLE_NAME = "vAlgorithmTypeColumnType";
  val FIELD_algorithmTypeColumnTypeId = "algorithmTypeColumnTypeId";
  val FIELD_algorithmTypeVersionId = "algorithmTypeVersionId";
  val FIELD_algorithmColumnTypeId = "algorithmColumnTypeId";
  val FIELD_allowMultiple = "allowMultiple";
  val FIELD_allowEmpty = "allowEmpty";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";
  val FIELD_guid = "guid";
  val FIELD_algorithmColumnType_algorithmColumnTypeId = "algorithmColumnType_algorithmColumnTypeId";
  val FIELD_algorithmColumnType_algorithmColumnTypeName = "algorithmColumnType_algorithmColumnTypeName";
  val FIELD_algorithmColumnType_algorithmColumnTypeDescription = "algorithmColumnType_algorithmColumnTypeDescription";
  val FIELD_algorithmColumnType_insertedRowDate = "algorithmColumnType_insertedRowDate";
  val FIELD_algorithmColumnType_lastUpdatedDate = "algorithmColumnType_lastUpdatedDate";
  val FIELD_algorithmColumnType_guid = "algorithmColumnType_guid";
  val FIELD_algorithmTypeVersion_algorithmTypeVersionId = "algorithmTypeVersion_algorithmTypeVersionId";
  val FIELD_algorithmTypeVersion_guid = "algorithmTypeVersion_guid";
  val FIELD_algorithmTypeVersion_algorithmTypeId = "algorithmTypeVersion_algorithmTypeId";
  val FIELD_algorithmTypeVersion_algorithmTypeVersionName = "algorithmTypeVersion_algorithmTypeVersionName";
  val FIELD_algorithmTypeVersion_insertedRowDate = "algorithmTypeVersion_insertedRowDate";
  val FIELD_algorithmTypeVersion_lastUpdatedDate = "algorithmTypeVersion_lastUpdatedDate";

}


case class VAlgorithmTypeVersionDto (
                                      val algorithmTypeVersionId : Long
                                      , val guid : Long
                                      , val algorithmTypeId : Long
                                      , val algorithmTypeVersionName : String
                                      , val insertedRowDate : java.util.Date
                                      , val lastUpdatedDate : java.util.Date
                                      , val algorithmType_algorithmTypeId : Long
                                      , val algorithmType_guid : Long
                                      , val algorithmType_algorithmTypeName : String
                                      , val algorithmType_algorithmTypeDescription : String
                                      , val algorithmType_insertedRowDate : java.util.Date
                                      , val algorithmType_lastUpdatedDate : java.util.Date
                                    ) extends BaseReadOnlyDto {
  def tableName : String = {
    "vAlgorithmTypeVersion";
  }
  def fields : String = {
    "algorithmTypeVersionId,guid,algorithmTypeId,algorithmTypeVersionName,insertedRowDate,lastUpdatedDate,algorithmType_algorithmTypeId,algorithmType_guid,algorithmType_algorithmTypeName,algorithmType_algorithmTypeDescription,algorithmType_insertedRowDate,algorithmType_lastUpdatedDate";
  }
  def pkFields : String = {
    "";
  }
  def fkFields : String = {
    "";
  }
  def nameField : String = {
    "";
  }
  def getPk() : Long = {
    algorithmTypeVersionId
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
    Array(algorithmTypeVersionId,guid,algorithmTypeId,algorithmTypeVersionName,insertedRowDate,lastUpdatedDate,algorithmType_algorithmTypeId,algorithmType_guid,algorithmType_algorithmTypeName,algorithmType_algorithmTypeDescription,algorithmType_insertedRowDate,algorithmType_lastUpdatedDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+algorithmTypeVersionId,""+guid,""+algorithmTypeId,""+algorithmTypeVersionName,""+insertedRowDate,""+lastUpdatedDate,""+algorithmType_algorithmTypeId,""+algorithmType_guid,""+algorithmType_algorithmTypeName,""+algorithmType_algorithmTypeDescription,""+algorithmType_insertedRowDate,""+algorithmType_lastUpdatedDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "algorithmTypeVersionId" => algorithmTypeVersionId
      case "guid" => guid
      case "algorithmTypeId" => algorithmTypeId
      case "algorithmTypeVersionName" => algorithmTypeVersionName
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case "algorithmType_algorithmTypeId" => algorithmType_algorithmTypeId
      case "algorithmType_guid" => algorithmType_guid
      case "algorithmType_algorithmTypeName" => algorithmType_algorithmTypeName
      case "algorithmType_algorithmTypeDescription" => algorithmType_algorithmTypeDescription
      case "algorithmType_insertedRowDate" => algorithmType_insertedRowDate
      case "algorithmType_lastUpdatedDate" => algorithmType_lastUpdatedDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "algorithmTypeVersionId" => "Long"
      case "guid" => "Long"
      case "algorithmTypeId" => "Long"
      case "algorithmTypeVersionName" => "String"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case "algorithmType_algorithmTypeId" => "Long"
      case "algorithmType_guid" => "Long"
      case "algorithmType_algorithmTypeName" => "String"
      case "algorithmType_algorithmTypeDescription" => "String"
      case "algorithmType_insertedRowDate" => "java.util.Date"
      case "algorithmType_lastUpdatedDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
}
object VAlgorithmTypeVersionDto {
  val TABLE_NAME = "vAlgorithmTypeVersion";
  val FIELD_algorithmTypeVersionId = "algorithmTypeVersionId";
  val FIELD_guid = "guid";
  val FIELD_algorithmTypeId = "algorithmTypeId";
  val FIELD_algorithmTypeVersionName = "algorithmTypeVersionName";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";
  val FIELD_algorithmType_algorithmTypeId = "algorithmType_algorithmTypeId";
  val FIELD_algorithmType_guid = "algorithmType_guid";
  val FIELD_algorithmType_algorithmTypeName = "algorithmType_algorithmTypeName";
  val FIELD_algorithmType_algorithmTypeDescription = "algorithmType_algorithmTypeDescription";
  val FIELD_algorithmType_insertedRowDate = "algorithmType_insertedRowDate";
  val FIELD_algorithmType_lastUpdatedDate = "algorithmType_lastUpdatedDate";

}


case class VExecutorInstanceDto (
                                  val executorInstanceId : Long
                                  , val guid : Long
                                  , val executorTypeId : Long
                                  , val executorHostId : Long
                                  , val executorInstanceName : String
                                  , val isRunning : Int
                                  , val isFinished : Int
                                  , val portNumber : Int
                                  , val insertedRowDate : java.util.Date
                                  , val lastUpdatedDate : java.util.Date
                                  , val endDate : java.util.Date
                                  , val executorHost_executorHostId : Long
                                  , val executorHost_guid : Long
                                  , val executorHost_insertedRowDate : java.util.Date
                                  , val executorHost_lastUpdatedDate : java.util.Date
                                  , val executorHost_hostName : String
                                  , val executorHost_hostIp : String
                                  , val executorHost_hostDomain : String
                                  , val executorHost_hostOsType : String
                                  , val executorHost_hostOsVersion : String
                                  , val executorHost_isWorking : Int
                                  , val executorType_executorTypeId : Long
                                  , val executorType_guid : Long
                                  , val executorType_insertedRowDate : java.util.Date
                                  , val executorType_lastUpdatedDate : java.util.Date
                                  , val executorType_executorTypeName : String
                                  , val executorType_executorTypeClass : String
                                ) extends BaseReadOnlyDto {
  def tableName : String = {
    "vExecutorInstance";
  }
  def fields : String = {
    "executorInstanceId,guid,executorTypeId,executorHostId,executorInstanceName,isRunning,isFinished,portNumber,insertedRowDate,lastUpdatedDate,endDate,executorHost_executorHostId,executorHost_guid,executorHost_insertedRowDate,executorHost_lastUpdatedDate,executorHost_hostName,executorHost_hostIp,executorHost_hostDomain,executorHost_hostOsType,executorHost_hostOsVersion,executorHost_isWorking,executorType_executorTypeId,executorType_guid,executorType_insertedRowDate,executorType_lastUpdatedDate,executorType_executorTypeName,executorType_executorTypeClass";
  }
  def pkFields : String = {
    "";
  }
  def fkFields : String = {
    "";
  }
  def nameField : String = {
    "";
  }
  def getPk() : Long = {
    executorInstanceId
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
    Array(executorInstanceId,guid,executorTypeId,executorHostId,executorInstanceName,isRunning,isFinished,portNumber,insertedRowDate,lastUpdatedDate,endDate,executorHost_executorHostId,executorHost_guid,executorHost_insertedRowDate,executorHost_lastUpdatedDate,executorHost_hostName,executorHost_hostIp,executorHost_hostDomain,executorHost_hostOsType,executorHost_hostOsVersion,executorHost_isWorking,executorType_executorTypeId,executorType_guid,executorType_insertedRowDate,executorType_lastUpdatedDate,executorType_executorTypeName,executorType_executorTypeClass)
  }
  def toStringArray() : Array[String] = {
    Array(""+executorInstanceId,""+guid,""+executorTypeId,""+executorHostId,""+executorInstanceName,""+isRunning,""+isFinished,""+portNumber,""+insertedRowDate,""+lastUpdatedDate,""+endDate,""+executorHost_executorHostId,""+executorHost_guid,""+executorHost_insertedRowDate,""+executorHost_lastUpdatedDate,""+executorHost_hostName,""+executorHost_hostIp,""+executorHost_hostDomain,""+executorHost_hostOsType,""+executorHost_hostOsVersion,""+executorHost_isWorking,""+executorType_executorTypeId,""+executorType_guid,""+executorType_insertedRowDate,""+executorType_lastUpdatedDate,""+executorType_executorTypeName,""+executorType_executorTypeClass)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "executorInstanceId" => executorInstanceId
      case "guid" => guid
      case "executorTypeId" => executorTypeId
      case "executorHostId" => executorHostId
      case "executorInstanceName" => executorInstanceName
      case "isRunning" => isRunning
      case "isFinished" => isFinished
      case "portNumber" => portNumber
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case "endDate" => endDate
      case "executorHost_executorHostId" => executorHost_executorHostId
      case "executorHost_guid" => executorHost_guid
      case "executorHost_insertedRowDate" => executorHost_insertedRowDate
      case "executorHost_lastUpdatedDate" => executorHost_lastUpdatedDate
      case "executorHost_hostName" => executorHost_hostName
      case "executorHost_hostIp" => executorHost_hostIp
      case "executorHost_hostDomain" => executorHost_hostDomain
      case "executorHost_hostOsType" => executorHost_hostOsType
      case "executorHost_hostOsVersion" => executorHost_hostOsVersion
      case "executorHost_isWorking" => executorHost_isWorking
      case "executorType_executorTypeId" => executorType_executorTypeId
      case "executorType_guid" => executorType_guid
      case "executorType_insertedRowDate" => executorType_insertedRowDate
      case "executorType_lastUpdatedDate" => executorType_lastUpdatedDate
      case "executorType_executorTypeName" => executorType_executorTypeName
      case "executorType_executorTypeClass" => executorType_executorTypeClass
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "executorInstanceId" => "Long"
      case "guid" => "Long"
      case "executorTypeId" => "Long"
      case "executorHostId" => "Long"
      case "executorInstanceName" => "String"
      case "isRunning" => "Int"
      case "isFinished" => "Int"
      case "portNumber" => "Int"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case "endDate" => "java.util.Date"
      case "executorHost_executorHostId" => "Long"
      case "executorHost_guid" => "Long"
      case "executorHost_insertedRowDate" => "java.util.Date"
      case "executorHost_lastUpdatedDate" => "java.util.Date"
      case "executorHost_hostName" => "String"
      case "executorHost_hostIp" => "String"
      case "executorHost_hostDomain" => "String"
      case "executorHost_hostOsType" => "String"
      case "executorHost_hostOsVersion" => "String"
      case "executorHost_isWorking" => "Int"
      case "executorType_executorTypeId" => "Long"
      case "executorType_guid" => "Long"
      case "executorType_insertedRowDate" => "java.util.Date"
      case "executorType_lastUpdatedDate" => "java.util.Date"
      case "executorType_executorTypeName" => "String"
      case "executorType_executorTypeClass" => "String"
      case _ => "Object"
    }
    ret
  }
}
object VExecutorInstanceDto {
  val TABLE_NAME = "vExecutorInstance";
  val FIELD_executorInstanceId = "executorInstanceId";
  val FIELD_guid = "guid";
  val FIELD_executorTypeId = "executorTypeId";
  val FIELD_executorHostId = "executorHostId";
  val FIELD_executorInstanceName = "executorInstanceName";
  val FIELD_isRunning = "isRunning";
  val FIELD_isFinished = "isFinished";
  val FIELD_portNumber = "portNumber";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";
  val FIELD_endDate = "endDate";
  val FIELD_executorHost_executorHostId = "executorHost_executorHostId";
  val FIELD_executorHost_guid = "executorHost_guid";
  val FIELD_executorHost_insertedRowDate = "executorHost_insertedRowDate";
  val FIELD_executorHost_lastUpdatedDate = "executorHost_lastUpdatedDate";
  val FIELD_executorHost_hostName = "executorHost_hostName";
  val FIELD_executorHost_hostIp = "executorHost_hostIp";
  val FIELD_executorHost_hostDomain = "executorHost_hostDomain";
  val FIELD_executorHost_hostOsType = "executorHost_hostOsType";
  val FIELD_executorHost_hostOsVersion = "executorHost_hostOsVersion";
  val FIELD_executorHost_isWorking = "executorHost_isWorking";
  val FIELD_executorType_executorTypeId = "executorType_executorTypeId";
  val FIELD_executorType_guid = "executorType_guid";
  val FIELD_executorType_insertedRowDate = "executorType_insertedRowDate";
  val FIELD_executorType_lastUpdatedDate = "executorType_lastUpdatedDate";
  val FIELD_executorType_executorTypeName = "executorType_executorTypeName";
  val FIELD_executorType_executorTypeClass = "executorType_executorTypeClass";

}


case class VExecutorRestDto (
                              val executorRestId : Long
                              , val guid : Long
                              , val executorHostId : Long
                              , val insertedRowDate : java.util.Date
                              , val lastUpdatedDate : java.util.Date
                              , val restPort : Int
                              , val restVersion : String
                              , val restStatus : String
                              , val executorHost_executorHostId : Long
                              , val executorHost_guid : Long
                              , val executorHost_insertedRowDate : java.util.Date
                              , val executorHost_lastUpdatedDate : java.util.Date
                              , val executorHost_hostName : String
                              , val executorHost_hostIp : String
                              , val executorHost_hostDomain : String
                              , val executorHost_hostOsType : String
                              , val executorHost_hostOsVersion : String
                              , val executorHost_isWorking : Int
                            ) extends BaseReadOnlyDto {
  def tableName : String = {
    "vExecutorRest";
  }
  def fields : String = {
    "executorRestId,guid,executorHostId,insertedRowDate,lastUpdatedDate,restPort,restVersion,restStatus,executorHost_executorHostId,executorHost_guid,executorHost_insertedRowDate,executorHost_lastUpdatedDate,executorHost_hostName,executorHost_hostIp,executorHost_hostDomain,executorHost_hostOsType,executorHost_hostOsVersion,executorHost_isWorking";
  }
  def pkFields : String = {
    "";
  }
  def fkFields : String = {
    "";
  }
  def nameField : String = {
    "";
  }
  def getPk() : Long = {
    executorRestId
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
    Array(executorRestId,guid,executorHostId,insertedRowDate,lastUpdatedDate,restPort,restVersion,restStatus,executorHost_executorHostId,executorHost_guid,executorHost_insertedRowDate,executorHost_lastUpdatedDate,executorHost_hostName,executorHost_hostIp,executorHost_hostDomain,executorHost_hostOsType,executorHost_hostOsVersion,executorHost_isWorking)
  }
  def toStringArray() : Array[String] = {
    Array(""+executorRestId,""+guid,""+executorHostId,""+insertedRowDate,""+lastUpdatedDate,""+restPort,""+restVersion,""+restStatus,""+executorHost_executorHostId,""+executorHost_guid,""+executorHost_insertedRowDate,""+executorHost_lastUpdatedDate,""+executorHost_hostName,""+executorHost_hostIp,""+executorHost_hostDomain,""+executorHost_hostOsType,""+executorHost_hostOsVersion,""+executorHost_isWorking)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "executorRestId" => executorRestId
      case "guid" => guid
      case "executorHostId" => executorHostId
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case "restPort" => restPort
      case "restVersion" => restVersion
      case "restStatus" => restStatus
      case "executorHost_executorHostId" => executorHost_executorHostId
      case "executorHost_guid" => executorHost_guid
      case "executorHost_insertedRowDate" => executorHost_insertedRowDate
      case "executorHost_lastUpdatedDate" => executorHost_lastUpdatedDate
      case "executorHost_hostName" => executorHost_hostName
      case "executorHost_hostIp" => executorHost_hostIp
      case "executorHost_hostDomain" => executorHost_hostDomain
      case "executorHost_hostOsType" => executorHost_hostOsType
      case "executorHost_hostOsVersion" => executorHost_hostOsVersion
      case "executorHost_isWorking" => executorHost_isWorking
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "executorRestId" => "Long"
      case "guid" => "Long"
      case "executorHostId" => "Long"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case "restPort" => "Int"
      case "restVersion" => "String"
      case "restStatus" => "String"
      case "executorHost_executorHostId" => "Long"
      case "executorHost_guid" => "Long"
      case "executorHost_insertedRowDate" => "java.util.Date"
      case "executorHost_lastUpdatedDate" => "java.util.Date"
      case "executorHost_hostName" => "String"
      case "executorHost_hostIp" => "String"
      case "executorHost_hostDomain" => "String"
      case "executorHost_hostOsType" => "String"
      case "executorHost_hostOsVersion" => "String"
      case "executorHost_isWorking" => "Int"
      case _ => "Object"
    }
    ret
  }
}
object VExecutorRestDto {
  val TABLE_NAME = "vExecutorRest";
  val FIELD_executorRestId = "executorRestId";
  val FIELD_guid = "guid";
  val FIELD_executorHostId = "executorHostId";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";
  val FIELD_restPort = "restPort";
  val FIELD_restVersion = "restVersion";
  val FIELD_restStatus = "restStatus";
  val FIELD_executorHost_executorHostId = "executorHost_executorHostId";
  val FIELD_executorHost_guid = "executorHost_guid";
  val FIELD_executorHost_insertedRowDate = "executorHost_insertedRowDate";
  val FIELD_executorHost_lastUpdatedDate = "executorHost_lastUpdatedDate";
  val FIELD_executorHost_hostName = "executorHost_hostName";
  val FIELD_executorHost_hostIp = "executorHost_hostIp";
  val FIELD_executorHost_hostDomain = "executorHost_hostDomain";
  val FIELD_executorHost_hostOsType = "executorHost_hostOsType";
  val FIELD_executorHost_hostOsVersion = "executorHost_hostOsVersion";
  val FIELD_executorHost_isWorking = "executorHost_isWorking";

}


case class VExecutorRestCallDto (
                                  val executorRestCallId : Long
                                  , val guid : Long
                                  , val insertedRowDate : java.util.Date
                                  , val lastUpdatedDate : java.util.Date
                                  , val executorHostId : Long
                                  , val executorRestId : Long
                                  , val requestMethod : String
                                  , val requestHeader : String
                                  , val requestBody : String
                                  , val responseBody : String
                                  , val executorHost_executorHostId : Long
                                  , val executorHost_guid : Long
                                  , val executorHost_insertedRowDate : java.util.Date
                                  , val executorHost_lastUpdatedDate : java.util.Date
                                  , val executorHost_hostName : String
                                  , val executorHost_hostIp : String
                                  , val executorHost_hostDomain : String
                                  , val executorHost_hostOsType : String
                                  , val executorHost_hostOsVersion : String
                                  , val executorHost_isWorking : Int
                                  , val executorRest_executorRestId : Long
                                  , val executorRest_guid : Long
                                  , val executorRest_executorHostId : Long
                                  , val executorRest_insertedRowDate : java.util.Date
                                  , val executorRest_lastUpdatedDate : java.util.Date
                                  , val executorRest_restPort : Int
                                  , val executorRest_restVersion : String
                                  , val executorRest_restStatus : String
                                ) extends BaseReadOnlyDto {
  def tableName : String = {
    "vExecutorRestCall";
  }
  def fields : String = {
    "executorRestCallId,guid,insertedRowDate,lastUpdatedDate,executorHostId,executorRestId,requestMethod,requestHeader,requestBody,responseBody,executorHost_executorHostId,executorHost_guid,executorHost_insertedRowDate,executorHost_lastUpdatedDate,executorHost_hostName,executorHost_hostIp,executorHost_hostDomain,executorHost_hostOsType,executorHost_hostOsVersion,executorHost_isWorking,executorRest_executorRestId,executorRest_guid,executorRest_executorHostId,executorRest_insertedRowDate,executorRest_lastUpdatedDate,executorRest_restPort,executorRest_restVersion,executorRest_restStatus";
  }
  def pkFields : String = {
    "";
  }
  def fkFields : String = {
    "";
  }
  def nameField : String = {
    "";
  }
  def getPk() : Long = {
    executorRestCallId
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
    Array(executorRestCallId,guid,insertedRowDate,lastUpdatedDate,executorHostId,executorRestId,requestMethod,requestHeader,requestBody,responseBody,executorHost_executorHostId,executorHost_guid,executorHost_insertedRowDate,executorHost_lastUpdatedDate,executorHost_hostName,executorHost_hostIp,executorHost_hostDomain,executorHost_hostOsType,executorHost_hostOsVersion,executorHost_isWorking,executorRest_executorRestId,executorRest_guid,executorRest_executorHostId,executorRest_insertedRowDate,executorRest_lastUpdatedDate,executorRest_restPort,executorRest_restVersion,executorRest_restStatus)
  }
  def toStringArray() : Array[String] = {
    Array(""+executorRestCallId,""+guid,""+insertedRowDate,""+lastUpdatedDate,""+executorHostId,""+executorRestId,""+requestMethod,""+requestHeader,""+requestBody,""+responseBody,""+executorHost_executorHostId,""+executorHost_guid,""+executorHost_insertedRowDate,""+executorHost_lastUpdatedDate,""+executorHost_hostName,""+executorHost_hostIp,""+executorHost_hostDomain,""+executorHost_hostOsType,""+executorHost_hostOsVersion,""+executorHost_isWorking,""+executorRest_executorRestId,""+executorRest_guid,""+executorRest_executorHostId,""+executorRest_insertedRowDate,""+executorRest_lastUpdatedDate,""+executorRest_restPort,""+executorRest_restVersion,""+executorRest_restStatus)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "executorRestCallId" => executorRestCallId
      case "guid" => guid
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case "executorHostId" => executorHostId
      case "executorRestId" => executorRestId
      case "requestMethod" => requestMethod
      case "requestHeader" => requestHeader
      case "requestBody" => requestBody
      case "responseBody" => responseBody
      case "executorHost_executorHostId" => executorHost_executorHostId
      case "executorHost_guid" => executorHost_guid
      case "executorHost_insertedRowDate" => executorHost_insertedRowDate
      case "executorHost_lastUpdatedDate" => executorHost_lastUpdatedDate
      case "executorHost_hostName" => executorHost_hostName
      case "executorHost_hostIp" => executorHost_hostIp
      case "executorHost_hostDomain" => executorHost_hostDomain
      case "executorHost_hostOsType" => executorHost_hostOsType
      case "executorHost_hostOsVersion" => executorHost_hostOsVersion
      case "executorHost_isWorking" => executorHost_isWorking
      case "executorRest_executorRestId" => executorRest_executorRestId
      case "executorRest_guid" => executorRest_guid
      case "executorRest_executorHostId" => executorRest_executorHostId
      case "executorRest_insertedRowDate" => executorRest_insertedRowDate
      case "executorRest_lastUpdatedDate" => executorRest_lastUpdatedDate
      case "executorRest_restPort" => executorRest_restPort
      case "executorRest_restVersion" => executorRest_restVersion
      case "executorRest_restStatus" => executorRest_restStatus
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "executorRestCallId" => "Long"
      case "guid" => "Long"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case "executorHostId" => "Long"
      case "executorRestId" => "Long"
      case "requestMethod" => "String"
      case "requestHeader" => "String"
      case "requestBody" => "String"
      case "responseBody" => "String"
      case "executorHost_executorHostId" => "Long"
      case "executorHost_guid" => "Long"
      case "executorHost_insertedRowDate" => "java.util.Date"
      case "executorHost_lastUpdatedDate" => "java.util.Date"
      case "executorHost_hostName" => "String"
      case "executorHost_hostIp" => "String"
      case "executorHost_hostDomain" => "String"
      case "executorHost_hostOsType" => "String"
      case "executorHost_hostOsVersion" => "String"
      case "executorHost_isWorking" => "Int"
      case "executorRest_executorRestId" => "Long"
      case "executorRest_guid" => "Long"
      case "executorRest_executorHostId" => "Long"
      case "executorRest_insertedRowDate" => "java.util.Date"
      case "executorRest_lastUpdatedDate" => "java.util.Date"
      case "executorRest_restPort" => "Int"
      case "executorRest_restVersion" => "String"
      case "executorRest_restStatus" => "String"
      case _ => "Object"
    }
    ret
  }
}
object VExecutorRestCallDto {
  val TABLE_NAME = "vExecutorRestCall";
  val FIELD_executorRestCallId = "executorRestCallId";
  val FIELD_guid = "guid";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";
  val FIELD_executorHostId = "executorHostId";
  val FIELD_executorRestId = "executorRestId";
  val FIELD_requestMethod = "requestMethod";
  val FIELD_requestHeader = "requestHeader";
  val FIELD_requestBody = "requestBody";
  val FIELD_responseBody = "responseBody";
  val FIELD_executorHost_executorHostId = "executorHost_executorHostId";
  val FIELD_executorHost_guid = "executorHost_guid";
  val FIELD_executorHost_insertedRowDate = "executorHost_insertedRowDate";
  val FIELD_executorHost_lastUpdatedDate = "executorHost_lastUpdatedDate";
  val FIELD_executorHost_hostName = "executorHost_hostName";
  val FIELD_executorHost_hostIp = "executorHost_hostIp";
  val FIELD_executorHost_hostDomain = "executorHost_hostDomain";
  val FIELD_executorHost_hostOsType = "executorHost_hostOsType";
  val FIELD_executorHost_hostOsVersion = "executorHost_hostOsVersion";
  val FIELD_executorHost_isWorking = "executorHost_isWorking";
  val FIELD_executorRest_executorRestId = "executorRest_executorRestId";
  val FIELD_executorRest_guid = "executorRest_guid";
  val FIELD_executorRest_executorHostId = "executorRest_executorHostId";
  val FIELD_executorRest_insertedRowDate = "executorRest_insertedRowDate";
  val FIELD_executorRest_lastUpdatedDate = "executorRest_lastUpdatedDate";
  val FIELD_executorRest_restPort = "executorRest_restPort";
  val FIELD_executorRest_restVersion = "executorRest_restVersion";
  val FIELD_executorRest_restStatus = "executorRest_restStatus";

}


case class VExecutorStorageDto (
                                 val executorStorageId : Long
                                 , val guid : Long
                                 , val executorHostId : Long
                                 , val executorStorageTypeId : Long
                                 , val storageDefinition : String
                                 , val storageBasePath : String
                                 , val storageFulllPath : String
                                 , val isRunning : Int
                                 , val portNumber : Int
                                 , val insertedRowDate : java.util.Date
                                 , val lastUpdatedDate : java.util.Date
                                 , val executorStorageType_executorStorageTypeId : Long
                                 , val executorStorageType_guid : Long
                                 , val executorStorageType_insertedRowDate : java.util.Date
                                 , val executorStorageType_lastUpdatedDate : java.util.Date
                                 , val executorStorageType_executorStorageTypeName : String
                                 , val executorStorageType_executorStorageTypeClass : String
                                 , val executorHost_executorHostId : Long
                                 , val executorHost_guid : Long
                                 , val executorHost_insertedRowDate : java.util.Date
                                 , val executorHost_lastUpdatedDate : java.util.Date
                                 , val executorHost_hostName : String
                                 , val executorHost_hostIp : String
                                 , val executorHost_hostDomain : String
                                 , val executorHost_hostOsType : String
                                 , val executorHost_hostOsVersion : String
                                 , val executorHost_isWorking : Int
                               ) extends BaseReadOnlyDto {
  def tableName : String = {
    "vExecutorStorage";
  }
  def fields : String = {
    "executorStorageId,guid,executorHostId,executorStorageTypeId,storageDefinition,storageBasePath,storageFulllPath,isRunning,portNumber,insertedRowDate,lastUpdatedDate,executorStorageType_executorStorageTypeId,executorStorageType_guid,executorStorageType_insertedRowDate,executorStorageType_lastUpdatedDate,executorStorageType_executorStorageTypeName,executorStorageType_executorStorageTypeClass,executorHost_executorHostId,executorHost_guid,executorHost_insertedRowDate,executorHost_lastUpdatedDate,executorHost_hostName,executorHost_hostIp,executorHost_hostDomain,executorHost_hostOsType,executorHost_hostOsVersion,executorHost_isWorking";
  }
  def pkFields : String = {
    "";
  }
  def fkFields : String = {
    "";
  }
  def nameField : String = {
    "";
  }
  def getPk() : Long = {
    executorStorageId
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
    Array(executorStorageId,guid,executorHostId,executorStorageTypeId,storageDefinition,storageBasePath,storageFulllPath,isRunning,portNumber,insertedRowDate,lastUpdatedDate,executorStorageType_executorStorageTypeId,executorStorageType_guid,executorStorageType_insertedRowDate,executorStorageType_lastUpdatedDate,executorStorageType_executorStorageTypeName,executorStorageType_executorStorageTypeClass,executorHost_executorHostId,executorHost_guid,executorHost_insertedRowDate,executorHost_lastUpdatedDate,executorHost_hostName,executorHost_hostIp,executorHost_hostDomain,executorHost_hostOsType,executorHost_hostOsVersion,executorHost_isWorking)
  }
  def toStringArray() : Array[String] = {
    Array(""+executorStorageId,""+guid,""+executorHostId,""+executorStorageTypeId,""+storageDefinition,""+storageBasePath,""+storageFulllPath,""+isRunning,""+portNumber,""+insertedRowDate,""+lastUpdatedDate,""+executorStorageType_executorStorageTypeId,""+executorStorageType_guid,""+executorStorageType_insertedRowDate,""+executorStorageType_lastUpdatedDate,""+executorStorageType_executorStorageTypeName,""+executorStorageType_executorStorageTypeClass,""+executorHost_executorHostId,""+executorHost_guid,""+executorHost_insertedRowDate,""+executorHost_lastUpdatedDate,""+executorHost_hostName,""+executorHost_hostIp,""+executorHost_hostDomain,""+executorHost_hostOsType,""+executorHost_hostOsVersion,""+executorHost_isWorking)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "executorStorageId" => executorStorageId
      case "guid" => guid
      case "executorHostId" => executorHostId
      case "executorStorageTypeId" => executorStorageTypeId
      case "storageDefinition" => storageDefinition
      case "storageBasePath" => storageBasePath
      case "storageFulllPath" => storageFulllPath
      case "isRunning" => isRunning
      case "portNumber" => portNumber
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case "executorStorageType_executorStorageTypeId" => executorStorageType_executorStorageTypeId
      case "executorStorageType_guid" => executorStorageType_guid
      case "executorStorageType_insertedRowDate" => executorStorageType_insertedRowDate
      case "executorStorageType_lastUpdatedDate" => executorStorageType_lastUpdatedDate
      case "executorStorageType_executorStorageTypeName" => executorStorageType_executorStorageTypeName
      case "executorStorageType_executorStorageTypeClass" => executorStorageType_executorStorageTypeClass
      case "executorHost_executorHostId" => executorHost_executorHostId
      case "executorHost_guid" => executorHost_guid
      case "executorHost_insertedRowDate" => executorHost_insertedRowDate
      case "executorHost_lastUpdatedDate" => executorHost_lastUpdatedDate
      case "executorHost_hostName" => executorHost_hostName
      case "executorHost_hostIp" => executorHost_hostIp
      case "executorHost_hostDomain" => executorHost_hostDomain
      case "executorHost_hostOsType" => executorHost_hostOsType
      case "executorHost_hostOsVersion" => executorHost_hostOsVersion
      case "executorHost_isWorking" => executorHost_isWorking
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "executorStorageId" => "Long"
      case "guid" => "Long"
      case "executorHostId" => "Long"
      case "executorStorageTypeId" => "Long"
      case "storageDefinition" => "String"
      case "storageBasePath" => "String"
      case "storageFulllPath" => "String"
      case "isRunning" => "Int"
      case "portNumber" => "Int"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case "executorStorageType_executorStorageTypeId" => "Long"
      case "executorStorageType_guid" => "Long"
      case "executorStorageType_insertedRowDate" => "java.util.Date"
      case "executorStorageType_lastUpdatedDate" => "java.util.Date"
      case "executorStorageType_executorStorageTypeName" => "String"
      case "executorStorageType_executorStorageTypeClass" => "String"
      case "executorHost_executorHostId" => "Long"
      case "executorHost_guid" => "Long"
      case "executorHost_insertedRowDate" => "java.util.Date"
      case "executorHost_lastUpdatedDate" => "java.util.Date"
      case "executorHost_hostName" => "String"
      case "executorHost_hostIp" => "String"
      case "executorHost_hostDomain" => "String"
      case "executorHost_hostOsType" => "String"
      case "executorHost_hostOsVersion" => "String"
      case "executorHost_isWorking" => "Int"
      case _ => "Object"
    }
    ret
  }
}
object VExecutorStorageDto {
  val TABLE_NAME = "vExecutorStorage";
  val FIELD_executorStorageId = "executorStorageId";
  val FIELD_guid = "guid";
  val FIELD_executorHostId = "executorHostId";
  val FIELD_executorStorageTypeId = "executorStorageTypeId";
  val FIELD_storageDefinition = "storageDefinition";
  val FIELD_storageBasePath = "storageBasePath";
  val FIELD_storageFulllPath = "storageFulllPath";
  val FIELD_isRunning = "isRunning";
  val FIELD_portNumber = "portNumber";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";
  val FIELD_executorStorageType_executorStorageTypeId = "executorStorageType_executorStorageTypeId";
  val FIELD_executorStorageType_guid = "executorStorageType_guid";
  val FIELD_executorStorageType_insertedRowDate = "executorStorageType_insertedRowDate";
  val FIELD_executorStorageType_lastUpdatedDate = "executorStorageType_lastUpdatedDate";
  val FIELD_executorStorageType_executorStorageTypeName = "executorStorageType_executorStorageTypeName";
  val FIELD_executorStorageType_executorStorageTypeClass = "executorStorageType_executorStorageTypeClass";
  val FIELD_executorHost_executorHostId = "executorHost_executorHostId";
  val FIELD_executorHost_guid = "executorHost_guid";
  val FIELD_executorHost_insertedRowDate = "executorHost_insertedRowDate";
  val FIELD_executorHost_lastUpdatedDate = "executorHost_lastUpdatedDate";
  val FIELD_executorHost_hostName = "executorHost_hostName";
  val FIELD_executorHost_hostIp = "executorHost_hostIp";
  val FIELD_executorHost_hostDomain = "executorHost_hostDomain";
  val FIELD_executorHost_hostOsType = "executorHost_hostOsType";
  val FIELD_executorHost_hostOsVersion = "executorHost_hostOsVersion";
  val FIELD_executorHost_isWorking = "executorHost_isWorking";

}


case class VExecutorStorageSnapshotDto (
                                         val executorStorageSnapshotId : Long
                                         , val executorInstanceId : Long
                                         , val guid : Long
                                         , val insertedRowDate : java.util.Date
                                         , val lastUpdatedDate : java.util.Date
                                         , val executorInstance_executorInstanceId : Long
                                         , val executorInstance_guid : Long
                                         , val executorInstance_executorTypeId : Long
                                         , val executorInstance_executorHostId : Long
                                         , val executorInstance_executorInstanceName : String
                                         , val executorInstance_isRunning : Int
                                         , val executorInstance_isFinished : Int
                                         , val executorInstance_portNumber : Int
                                         , val executorInstance_insertedRowDate : java.util.Date
                                         , val executorInstance_lastUpdatedDate : java.util.Date
                                         , val executorInstance_endDate : java.util.Date
                                       ) extends BaseReadOnlyDto {
  def tableName : String = {
    "vExecutorStorageSnapshot";
  }
  def fields : String = {
    "executorStorageSnapshotId,executorInstanceId,guid,insertedRowDate,lastUpdatedDate,executorInstance_executorInstanceId,executorInstance_guid,executorInstance_executorTypeId,executorInstance_executorHostId,executorInstance_executorInstanceName,executorInstance_isRunning,executorInstance_isFinished,executorInstance_portNumber,executorInstance_insertedRowDate,executorInstance_lastUpdatedDate,executorInstance_endDate";
  }
  def pkFields : String = {
    "";
  }
  def fkFields : String = {
    "";
  }
  def nameField : String = {
    "";
  }
  def getPk() : Long = {
    executorStorageSnapshotId
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
    Array(executorStorageSnapshotId,executorInstanceId,guid,insertedRowDate,lastUpdatedDate,executorInstance_executorInstanceId,executorInstance_guid,executorInstance_executorTypeId,executorInstance_executorHostId,executorInstance_executorInstanceName,executorInstance_isRunning,executorInstance_isFinished,executorInstance_portNumber,executorInstance_insertedRowDate,executorInstance_lastUpdatedDate,executorInstance_endDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+executorStorageSnapshotId,""+executorInstanceId,""+guid,""+insertedRowDate,""+lastUpdatedDate,""+executorInstance_executorInstanceId,""+executorInstance_guid,""+executorInstance_executorTypeId,""+executorInstance_executorHostId,""+executorInstance_executorInstanceName,""+executorInstance_isRunning,""+executorInstance_isFinished,""+executorInstance_portNumber,""+executorInstance_insertedRowDate,""+executorInstance_lastUpdatedDate,""+executorInstance_endDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "executorStorageSnapshotId" => executorStorageSnapshotId
      case "executorInstanceId" => executorInstanceId
      case "guid" => guid
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case "executorInstance_executorInstanceId" => executorInstance_executorInstanceId
      case "executorInstance_guid" => executorInstance_guid
      case "executorInstance_executorTypeId" => executorInstance_executorTypeId
      case "executorInstance_executorHostId" => executorInstance_executorHostId
      case "executorInstance_executorInstanceName" => executorInstance_executorInstanceName
      case "executorInstance_isRunning" => executorInstance_isRunning
      case "executorInstance_isFinished" => executorInstance_isFinished
      case "executorInstance_portNumber" => executorInstance_portNumber
      case "executorInstance_insertedRowDate" => executorInstance_insertedRowDate
      case "executorInstance_lastUpdatedDate" => executorInstance_lastUpdatedDate
      case "executorInstance_endDate" => executorInstance_endDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "executorStorageSnapshotId" => "Long"
      case "executorInstanceId" => "Long"
      case "guid" => "Long"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case "executorInstance_executorInstanceId" => "Long"
      case "executorInstance_guid" => "Long"
      case "executorInstance_executorTypeId" => "Long"
      case "executorInstance_executorHostId" => "Long"
      case "executorInstance_executorInstanceName" => "String"
      case "executorInstance_isRunning" => "Int"
      case "executorInstance_isFinished" => "Int"
      case "executorInstance_portNumber" => "Int"
      case "executorInstance_insertedRowDate" => "java.util.Date"
      case "executorInstance_lastUpdatedDate" => "java.util.Date"
      case "executorInstance_endDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
}
object VExecutorStorageSnapshotDto {
  val TABLE_NAME = "vExecutorStorageSnapshot";
  val FIELD_executorStorageSnapshotId = "executorStorageSnapshotId";
  val FIELD_executorInstanceId = "executorInstanceId";
  val FIELD_guid = "guid";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";
  val FIELD_executorInstance_executorInstanceId = "executorInstance_executorInstanceId";
  val FIELD_executorInstance_guid = "executorInstance_guid";
  val FIELD_executorInstance_executorTypeId = "executorInstance_executorTypeId";
  val FIELD_executorInstance_executorHostId = "executorInstance_executorHostId";
  val FIELD_executorInstance_executorInstanceName = "executorInstance_executorInstanceName";
  val FIELD_executorInstance_isRunning = "executorInstance_isRunning";
  val FIELD_executorInstance_isFinished = "executorInstance_isFinished";
  val FIELD_executorInstance_portNumber = "executorInstance_portNumber";
  val FIELD_executorInstance_insertedRowDate = "executorInstance_insertedRowDate";
  val FIELD_executorInstance_lastUpdatedDate = "executorInstance_lastUpdatedDate";
  val FIELD_executorInstance_endDate = "executorInstance_endDate";

}


case class VExecutorStorageViewDto (
                                     val executorStorageViewId : Long
                                     , val guid : Long
                                     , val insertedRowDate : java.util.Date
                                     , val lastUpdatedDate : java.util.Date
                                     , val executorStorageSnapshotId : Long
                                     , val executorStorageId : Long
                                     , val sourceDownloadId : Long
                                     , val storagePath : String
                                     , val viewSize : Long
                                     , val viewRowsCount : Long
                                     , val executorStorage_executorStorageId : Long
                                     , val executorStorage_guid : Long
                                     , val executorStorage_executorHostId : Long
                                     , val executorStorage_executorStorageTypeId : Long
                                     , val executorStorage_storageDefinition : String
                                     , val executorStorage_storageBasePath : String
                                     , val executorStorage_storageFulllPath : String
                                     , val executorStorage_isRunning : Int
                                     , val executorStorage_portNumber : Int
                                     , val executorStorage_insertedRowDate : java.util.Date
                                     , val executorStorage_lastUpdatedDate : java.util.Date
                                   ) extends BaseReadOnlyDto {
  def tableName : String = {
    "vExecutorStorageView";
  }
  def fields : String = {
    "executorStorageViewId,guid,insertedRowDate,lastUpdatedDate,executorStorageSnapshotId,executorStorageId,sourceDownloadId,storagePath,viewSize,viewRowsCount,executorStorage_executorStorageId,executorStorage_guid,executorStorage_executorHostId,executorStorage_executorStorageTypeId,executorStorage_storageDefinition,executorStorage_storageBasePath,executorStorage_storageFulllPath,executorStorage_isRunning,executorStorage_portNumber,executorStorage_insertedRowDate,executorStorage_lastUpdatedDate";
  }
  def pkFields : String = {
    "";
  }
  def fkFields : String = {
    "";
  }
  def nameField : String = {
    "";
  }
  def getPk() : Long = {
    executorStorageViewId
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
    Array(executorStorageViewId,guid,insertedRowDate,lastUpdatedDate,executorStorageSnapshotId,executorStorageId,sourceDownloadId,storagePath,viewSize,viewRowsCount,executorStorage_executorStorageId,executorStorage_guid,executorStorage_executorHostId,executorStorage_executorStorageTypeId,executorStorage_storageDefinition,executorStorage_storageBasePath,executorStorage_storageFulllPath,executorStorage_isRunning,executorStorage_portNumber,executorStorage_insertedRowDate,executorStorage_lastUpdatedDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+executorStorageViewId,""+guid,""+insertedRowDate,""+lastUpdatedDate,""+executorStorageSnapshotId,""+executorStorageId,""+sourceDownloadId,""+storagePath,""+viewSize,""+viewRowsCount,""+executorStorage_executorStorageId,""+executorStorage_guid,""+executorStorage_executorHostId,""+executorStorage_executorStorageTypeId,""+executorStorage_storageDefinition,""+executorStorage_storageBasePath,""+executorStorage_storageFulllPath,""+executorStorage_isRunning,""+executorStorage_portNumber,""+executorStorage_insertedRowDate,""+executorStorage_lastUpdatedDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "executorStorageViewId" => executorStorageViewId
      case "guid" => guid
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case "executorStorageSnapshotId" => executorStorageSnapshotId
      case "executorStorageId" => executorStorageId
      case "sourceDownloadId" => sourceDownloadId
      case "storagePath" => storagePath
      case "viewSize" => viewSize
      case "viewRowsCount" => viewRowsCount
      case "executorStorage_executorStorageId" => executorStorage_executorStorageId
      case "executorStorage_guid" => executorStorage_guid
      case "executorStorage_executorHostId" => executorStorage_executorHostId
      case "executorStorage_executorStorageTypeId" => executorStorage_executorStorageTypeId
      case "executorStorage_storageDefinition" => executorStorage_storageDefinition
      case "executorStorage_storageBasePath" => executorStorage_storageBasePath
      case "executorStorage_storageFulllPath" => executorStorage_storageFulllPath
      case "executorStorage_isRunning" => executorStorage_isRunning
      case "executorStorage_portNumber" => executorStorage_portNumber
      case "executorStorage_insertedRowDate" => executorStorage_insertedRowDate
      case "executorStorage_lastUpdatedDate" => executorStorage_lastUpdatedDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "executorStorageViewId" => "Long"
      case "guid" => "Long"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case "executorStorageSnapshotId" => "Long"
      case "executorStorageId" => "Long"
      case "sourceDownloadId" => "Long"
      case "storagePath" => "String"
      case "viewSize" => "Long"
      case "viewRowsCount" => "Long"
      case "executorStorage_executorStorageId" => "Long"
      case "executorStorage_guid" => "Long"
      case "executorStorage_executorHostId" => "Long"
      case "executorStorage_executorStorageTypeId" => "Long"
      case "executorStorage_storageDefinition" => "String"
      case "executorStorage_storageBasePath" => "String"
      case "executorStorage_storageFulllPath" => "String"
      case "executorStorage_isRunning" => "Int"
      case "executorStorage_portNumber" => "Int"
      case "executorStorage_insertedRowDate" => "java.util.Date"
      case "executorStorage_lastUpdatedDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
}
object VExecutorStorageViewDto {
  val TABLE_NAME = "vExecutorStorageView";
  val FIELD_executorStorageViewId = "executorStorageViewId";
  val FIELD_guid = "guid";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";
  val FIELD_executorStorageSnapshotId = "executorStorageSnapshotId";
  val FIELD_executorStorageId = "executorStorageId";
  val FIELD_sourceDownloadId = "sourceDownloadId";
  val FIELD_storagePath = "storagePath";
  val FIELD_viewSize = "viewSize";
  val FIELD_viewRowsCount = "viewRowsCount";
  val FIELD_executorStorage_executorStorageId = "executorStorage_executorStorageId";
  val FIELD_executorStorage_guid = "executorStorage_guid";
  val FIELD_executorStorage_executorHostId = "executorStorage_executorHostId";
  val FIELD_executorStorage_executorStorageTypeId = "executorStorage_executorStorageTypeId";
  val FIELD_executorStorage_storageDefinition = "executorStorage_storageDefinition";
  val FIELD_executorStorage_storageBasePath = "executorStorage_storageBasePath";
  val FIELD_executorStorage_storageFulllPath = "executorStorage_storageFulllPath";
  val FIELD_executorStorage_isRunning = "executorStorage_isRunning";
  val FIELD_executorStorage_portNumber = "executorStorage_portNumber";
  val FIELD_executorStorage_insertedRowDate = "executorStorage_insertedRowDate";
  val FIELD_executorStorage_lastUpdatedDate = "executorStorage_lastUpdatedDate";

}


case class VResourceManagerDto (
                                 val resourceManagerId : Long
                                 , val guid : Long
                                 , val resourceManagerTypeId : Long
                                 , val executorHostId : Long
                                 , val resourceManagerStatus : String
                                 , val insertedRowDate : java.util.Date
                                 , val lastUpdatedDate : java.util.Date
                                 , val executorHost_executorHostId : Long
                                 , val executorHost_guid : Long
                                 , val executorHost_insertedRowDate : java.util.Date
                                 , val executorHost_lastUpdatedDate : java.util.Date
                                 , val executorHost_hostName : String
                                 , val executorHost_hostIp : String
                                 , val executorHost_hostDomain : String
                                 , val executorHost_hostOsType : String
                                 , val executorHost_hostOsVersion : String
                                 , val executorHost_isWorking : Int
                                 , val resourceManagerType_resourceManagerTypeId : Long
                                 , val resourceManagerType_guid : Long
                                 , val resourceManagerType_resourceManagerTypeName : String
                                 , val resourceManagerType_resourceManagerTypeClass : String
                                 , val resourceManagerType_insertedRowDate : java.util.Date
                                 , val resourceManagerType_lastUpdatedDate : java.util.Date
                               ) extends BaseReadOnlyDto {
  def tableName : String = {
    "vResourceManager";
  }
  def fields : String = {
    "resourceManagerId,guid,resourceManagerTypeId,executorHostId,resourceManagerStatus,insertedRowDate,lastUpdatedDate,executorHost_executorHostId,executorHost_guid,executorHost_insertedRowDate,executorHost_lastUpdatedDate,executorHost_hostName,executorHost_hostIp,executorHost_hostDomain,executorHost_hostOsType,executorHost_hostOsVersion,executorHost_isWorking,resourceManagerType_resourceManagerTypeId,resourceManagerType_guid,resourceManagerType_resourceManagerTypeName,resourceManagerType_resourceManagerTypeClass,resourceManagerType_insertedRowDate,resourceManagerType_lastUpdatedDate";
  }
  def pkFields : String = {
    "";
  }
  def fkFields : String = {
    "";
  }
  def nameField : String = {
    "";
  }
  def getPk() : Long = {
    resourceManagerId
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
    Array(resourceManagerId,guid,resourceManagerTypeId,executorHostId,resourceManagerStatus,insertedRowDate,lastUpdatedDate,executorHost_executorHostId,executorHost_guid,executorHost_insertedRowDate,executorHost_lastUpdatedDate,executorHost_hostName,executorHost_hostIp,executorHost_hostDomain,executorHost_hostOsType,executorHost_hostOsVersion,executorHost_isWorking,resourceManagerType_resourceManagerTypeId,resourceManagerType_guid,resourceManagerType_resourceManagerTypeName,resourceManagerType_resourceManagerTypeClass,resourceManagerType_insertedRowDate,resourceManagerType_lastUpdatedDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+resourceManagerId,""+guid,""+resourceManagerTypeId,""+executorHostId,""+resourceManagerStatus,""+insertedRowDate,""+lastUpdatedDate,""+executorHost_executorHostId,""+executorHost_guid,""+executorHost_insertedRowDate,""+executorHost_lastUpdatedDate,""+executorHost_hostName,""+executorHost_hostIp,""+executorHost_hostDomain,""+executorHost_hostOsType,""+executorHost_hostOsVersion,""+executorHost_isWorking,""+resourceManagerType_resourceManagerTypeId,""+resourceManagerType_guid,""+resourceManagerType_resourceManagerTypeName,""+resourceManagerType_resourceManagerTypeClass,""+resourceManagerType_insertedRowDate,""+resourceManagerType_lastUpdatedDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "resourceManagerId" => resourceManagerId
      case "guid" => guid
      case "resourceManagerTypeId" => resourceManagerTypeId
      case "executorHostId" => executorHostId
      case "resourceManagerStatus" => resourceManagerStatus
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case "executorHost_executorHostId" => executorHost_executorHostId
      case "executorHost_guid" => executorHost_guid
      case "executorHost_insertedRowDate" => executorHost_insertedRowDate
      case "executorHost_lastUpdatedDate" => executorHost_lastUpdatedDate
      case "executorHost_hostName" => executorHost_hostName
      case "executorHost_hostIp" => executorHost_hostIp
      case "executorHost_hostDomain" => executorHost_hostDomain
      case "executorHost_hostOsType" => executorHost_hostOsType
      case "executorHost_hostOsVersion" => executorHost_hostOsVersion
      case "executorHost_isWorking" => executorHost_isWorking
      case "resourceManagerType_resourceManagerTypeId" => resourceManagerType_resourceManagerTypeId
      case "resourceManagerType_guid" => resourceManagerType_guid
      case "resourceManagerType_resourceManagerTypeName" => resourceManagerType_resourceManagerTypeName
      case "resourceManagerType_resourceManagerTypeClass" => resourceManagerType_resourceManagerTypeClass
      case "resourceManagerType_insertedRowDate" => resourceManagerType_insertedRowDate
      case "resourceManagerType_lastUpdatedDate" => resourceManagerType_lastUpdatedDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "resourceManagerId" => "Long"
      case "guid" => "Long"
      case "resourceManagerTypeId" => "Long"
      case "executorHostId" => "Long"
      case "resourceManagerStatus" => "String"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case "executorHost_executorHostId" => "Long"
      case "executorHost_guid" => "Long"
      case "executorHost_insertedRowDate" => "java.util.Date"
      case "executorHost_lastUpdatedDate" => "java.util.Date"
      case "executorHost_hostName" => "String"
      case "executorHost_hostIp" => "String"
      case "executorHost_hostDomain" => "String"
      case "executorHost_hostOsType" => "String"
      case "executorHost_hostOsVersion" => "String"
      case "executorHost_isWorking" => "Int"
      case "resourceManagerType_resourceManagerTypeId" => "Long"
      case "resourceManagerType_guid" => "Long"
      case "resourceManagerType_resourceManagerTypeName" => "String"
      case "resourceManagerType_resourceManagerTypeClass" => "String"
      case "resourceManagerType_insertedRowDate" => "java.util.Date"
      case "resourceManagerType_lastUpdatedDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
}
object VResourceManagerDto {
  val TABLE_NAME = "vResourceManager";
  val FIELD_resourceManagerId = "resourceManagerId";
  val FIELD_guid = "guid";
  val FIELD_resourceManagerTypeId = "resourceManagerTypeId";
  val FIELD_executorHostId = "executorHostId";
  val FIELD_resourceManagerStatus = "resourceManagerStatus";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";
  val FIELD_executorHost_executorHostId = "executorHost_executorHostId";
  val FIELD_executorHost_guid = "executorHost_guid";
  val FIELD_executorHost_insertedRowDate = "executorHost_insertedRowDate";
  val FIELD_executorHost_lastUpdatedDate = "executorHost_lastUpdatedDate";
  val FIELD_executorHost_hostName = "executorHost_hostName";
  val FIELD_executorHost_hostIp = "executorHost_hostIp";
  val FIELD_executorHost_hostDomain = "executorHost_hostDomain";
  val FIELD_executorHost_hostOsType = "executorHost_hostOsType";
  val FIELD_executorHost_hostOsVersion = "executorHost_hostOsVersion";
  val FIELD_executorHost_isWorking = "executorHost_isWorking";
  val FIELD_resourceManagerType_resourceManagerTypeId = "resourceManagerType_resourceManagerTypeId";
  val FIELD_resourceManagerType_guid = "resourceManagerType_guid";
  val FIELD_resourceManagerType_resourceManagerTypeName = "resourceManagerType_resourceManagerTypeName";
  val FIELD_resourceManagerType_resourceManagerTypeClass = "resourceManagerType_resourceManagerTypeClass";
  val FIELD_resourceManagerType_insertedRowDate = "resourceManagerType_insertedRowDate";
  val FIELD_resourceManagerType_lastUpdatedDate = "resourceManagerType_lastUpdatedDate";

}


case class VResourceManagerMeasureDto (
                                        val resourceManagerMeasureId : Long
                                        , val guid : Long
                                        , val resourceManagerId : Long
                                        , val resourceMeasureId : Long
                                        , val measureString : String
                                        , val measureValue : Double
                                        , val insertedRowDate : java.util.Date
                                        , val lastUpdatedDate : java.util.Date
                                        , val resourceManager_resourceManagerId : Long
                                        , val resourceManager_guid : Long
                                        , val resourceManager_resourceManagerTypeId : Long
                                        , val resourceManager_executorHostId : Long
                                        , val resourceManager_resourceManagerStatus : String
                                        , val resourceManager_insertedRowDate : java.util.Date
                                        , val resourceManager_lastUpdatedDate : java.util.Date
                                        , val resourceMeasure_resourceMeasureId : Long
                                        , val resourceMeasure_guid : Long
                                        , val resourceMeasure_resourceMeasureName : String
                                        , val resourceMeasure_insertedRowDate : java.util.Date
                                        , val resourceMeasure_lastUpdatedDate : java.util.Date
                                      ) extends BaseReadOnlyDto {
  def tableName : String = {
    "vResourceManagerMeasure";
  }
  def fields : String = {
    "resourceManagerMeasureId,guid,resourceManagerId,resourceMeasureId,measureString,measureValue,insertedRowDate,lastUpdatedDate,resourceManager_resourceManagerId,resourceManager_guid,resourceManager_resourceManagerTypeId,resourceManager_executorHostId,resourceManager_resourceManagerStatus,resourceManager_insertedRowDate,resourceManager_lastUpdatedDate,resourceMeasure_resourceMeasureId,resourceMeasure_guid,resourceMeasure_resourceMeasureName,resourceMeasure_insertedRowDate,resourceMeasure_lastUpdatedDate";
  }
  def pkFields : String = {
    "";
  }
  def fkFields : String = {
    "";
  }
  def nameField : String = {
    "";
  }
  def getPk() : Long = {
    resourceManagerMeasureId
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
    Array(resourceManagerMeasureId,guid,resourceManagerId,resourceMeasureId,measureString,measureValue,insertedRowDate,lastUpdatedDate,resourceManager_resourceManagerId,resourceManager_guid,resourceManager_resourceManagerTypeId,resourceManager_executorHostId,resourceManager_resourceManagerStatus,resourceManager_insertedRowDate,resourceManager_lastUpdatedDate,resourceMeasure_resourceMeasureId,resourceMeasure_guid,resourceMeasure_resourceMeasureName,resourceMeasure_insertedRowDate,resourceMeasure_lastUpdatedDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+resourceManagerMeasureId,""+guid,""+resourceManagerId,""+resourceMeasureId,""+measureString,""+measureValue,""+insertedRowDate,""+lastUpdatedDate,""+resourceManager_resourceManagerId,""+resourceManager_guid,""+resourceManager_resourceManagerTypeId,""+resourceManager_executorHostId,""+resourceManager_resourceManagerStatus,""+resourceManager_insertedRowDate,""+resourceManager_lastUpdatedDate,""+resourceMeasure_resourceMeasureId,""+resourceMeasure_guid,""+resourceMeasure_resourceMeasureName,""+resourceMeasure_insertedRowDate,""+resourceMeasure_lastUpdatedDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "resourceManagerMeasureId" => resourceManagerMeasureId
      case "guid" => guid
      case "resourceManagerId" => resourceManagerId
      case "resourceMeasureId" => resourceMeasureId
      case "measureString" => measureString
      case "measureValue" => measureValue
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case "resourceManager_resourceManagerId" => resourceManager_resourceManagerId
      case "resourceManager_guid" => resourceManager_guid
      case "resourceManager_resourceManagerTypeId" => resourceManager_resourceManagerTypeId
      case "resourceManager_executorHostId" => resourceManager_executorHostId
      case "resourceManager_resourceManagerStatus" => resourceManager_resourceManagerStatus
      case "resourceManager_insertedRowDate" => resourceManager_insertedRowDate
      case "resourceManager_lastUpdatedDate" => resourceManager_lastUpdatedDate
      case "resourceMeasure_resourceMeasureId" => resourceMeasure_resourceMeasureId
      case "resourceMeasure_guid" => resourceMeasure_guid
      case "resourceMeasure_resourceMeasureName" => resourceMeasure_resourceMeasureName
      case "resourceMeasure_insertedRowDate" => resourceMeasure_insertedRowDate
      case "resourceMeasure_lastUpdatedDate" => resourceMeasure_lastUpdatedDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "resourceManagerMeasureId" => "Long"
      case "guid" => "Long"
      case "resourceManagerId" => "Long"
      case "resourceMeasureId" => "Long"
      case "measureString" => "String"
      case "measureValue" => "Double"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case "resourceManager_resourceManagerId" => "Long"
      case "resourceManager_guid" => "Long"
      case "resourceManager_resourceManagerTypeId" => "Long"
      case "resourceManager_executorHostId" => "Long"
      case "resourceManager_resourceManagerStatus" => "String"
      case "resourceManager_insertedRowDate" => "java.util.Date"
      case "resourceManager_lastUpdatedDate" => "java.util.Date"
      case "resourceMeasure_resourceMeasureId" => "Long"
      case "resourceMeasure_guid" => "Long"
      case "resourceMeasure_resourceMeasureName" => "String"
      case "resourceMeasure_insertedRowDate" => "java.util.Date"
      case "resourceMeasure_lastUpdatedDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
}
object VResourceManagerMeasureDto {
  val TABLE_NAME = "vResourceManagerMeasure";
  val FIELD_resourceManagerMeasureId = "resourceManagerMeasureId";
  val FIELD_guid = "guid";
  val FIELD_resourceManagerId = "resourceManagerId";
  val FIELD_resourceMeasureId = "resourceMeasureId";
  val FIELD_measureString = "measureString";
  val FIELD_measureValue = "measureValue";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";
  val FIELD_resourceManager_resourceManagerId = "resourceManager_resourceManagerId";
  val FIELD_resourceManager_guid = "resourceManager_guid";
  val FIELD_resourceManager_resourceManagerTypeId = "resourceManager_resourceManagerTypeId";
  val FIELD_resourceManager_executorHostId = "resourceManager_executorHostId";
  val FIELD_resourceManager_resourceManagerStatus = "resourceManager_resourceManagerStatus";
  val FIELD_resourceManager_insertedRowDate = "resourceManager_insertedRowDate";
  val FIELD_resourceManager_lastUpdatedDate = "resourceManager_lastUpdatedDate";
  val FIELD_resourceMeasure_resourceMeasureId = "resourceMeasure_resourceMeasureId";
  val FIELD_resourceMeasure_guid = "resourceMeasure_guid";
  val FIELD_resourceMeasure_resourceMeasureName = "resourceMeasure_resourceMeasureName";
  val FIELD_resourceMeasure_insertedRowDate = "resourceMeasure_insertedRowDate";
  val FIELD_resourceMeasure_lastUpdatedDate = "resourceMeasure_lastUpdatedDate";

}


case class VSourceDownloadDto (
                                val sourceDownloadId : Long
                                , val sourceScheduleId : Long
                                , val insertedRowDate : java.util.Date
                                , val lastUpdatedDate : java.util.Date
                                , val guid : Long
                                , val retryNumber : Int
                                , val isRunning : Int
                                , val isFinished : Int
                                , val isExcecption : Int
                                , val excecptionDescription : String
                                , val sourceSchedule_sourceScheduleId : Long
                                , val sourceSchedule_sourceViewId : Long
                                , val sourceSchedule_executorStorageId : Long
                                , val sourceSchedule_insertedRowDate : java.util.Date
                                , val sourceSchedule_lastUpdatedDate : java.util.Date
                                , val sourceSchedule_guid : Long
                                , val sourceSchedule_onDemand : Int
                                , val sourceSchedule_startTime : java.util.Date
                                , val sourceSchedule_intervalValue : Long
                              ) extends BaseReadOnlyDto {
  def tableName : String = {
    "vSourceDownload";
  }
  def fields : String = {
    "sourceDownloadId,sourceScheduleId,insertedRowDate,lastUpdatedDate,guid,retryNumber,isRunning,isFinished,isExcecption,excecptionDescription,sourceSchedule_sourceScheduleId,sourceSchedule_sourceViewId,sourceSchedule_executorStorageId,sourceSchedule_insertedRowDate,sourceSchedule_lastUpdatedDate,sourceSchedule_guid,sourceSchedule_onDemand,sourceSchedule_startTime,sourceSchedule_intervalValue";
  }
  def pkFields : String = {
    "";
  }
  def fkFields : String = {
    "";
  }
  def nameField : String = {
    "";
  }
  def getPk() : Long = {
    sourceDownloadId
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
    Array(sourceDownloadId,sourceScheduleId,insertedRowDate,lastUpdatedDate,guid,retryNumber,isRunning,isFinished,isExcecption,excecptionDescription,sourceSchedule_sourceScheduleId,sourceSchedule_sourceViewId,sourceSchedule_executorStorageId,sourceSchedule_insertedRowDate,sourceSchedule_lastUpdatedDate,sourceSchedule_guid,sourceSchedule_onDemand,sourceSchedule_startTime,sourceSchedule_intervalValue)
  }
  def toStringArray() : Array[String] = {
    Array(""+sourceDownloadId,""+sourceScheduleId,""+insertedRowDate,""+lastUpdatedDate,""+guid,""+retryNumber,""+isRunning,""+isFinished,""+isExcecption,""+excecptionDescription,""+sourceSchedule_sourceScheduleId,""+sourceSchedule_sourceViewId,""+sourceSchedule_executorStorageId,""+sourceSchedule_insertedRowDate,""+sourceSchedule_lastUpdatedDate,""+sourceSchedule_guid,""+sourceSchedule_onDemand,""+sourceSchedule_startTime,""+sourceSchedule_intervalValue)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "sourceDownloadId" => sourceDownloadId
      case "sourceScheduleId" => sourceScheduleId
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case "guid" => guid
      case "retryNumber" => retryNumber
      case "isRunning" => isRunning
      case "isFinished" => isFinished
      case "isExcecption" => isExcecption
      case "excecptionDescription" => excecptionDescription
      case "sourceSchedule_sourceScheduleId" => sourceSchedule_sourceScheduleId
      case "sourceSchedule_sourceViewId" => sourceSchedule_sourceViewId
      case "sourceSchedule_executorStorageId" => sourceSchedule_executorStorageId
      case "sourceSchedule_insertedRowDate" => sourceSchedule_insertedRowDate
      case "sourceSchedule_lastUpdatedDate" => sourceSchedule_lastUpdatedDate
      case "sourceSchedule_guid" => sourceSchedule_guid
      case "sourceSchedule_onDemand" => sourceSchedule_onDemand
      case "sourceSchedule_startTime" => sourceSchedule_startTime
      case "sourceSchedule_intervalValue" => sourceSchedule_intervalValue
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "sourceDownloadId" => "Long"
      case "sourceScheduleId" => "Long"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case "guid" => "Long"
      case "retryNumber" => "Int"
      case "isRunning" => "Int"
      case "isFinished" => "Int"
      case "isExcecption" => "Int"
      case "excecptionDescription" => "String"
      case "sourceSchedule_sourceScheduleId" => "Long"
      case "sourceSchedule_sourceViewId" => "Long"
      case "sourceSchedule_executorStorageId" => "Long"
      case "sourceSchedule_insertedRowDate" => "java.util.Date"
      case "sourceSchedule_lastUpdatedDate" => "java.util.Date"
      case "sourceSchedule_guid" => "Long"
      case "sourceSchedule_onDemand" => "Int"
      case "sourceSchedule_startTime" => "java.util.Date"
      case "sourceSchedule_intervalValue" => "Long"
      case _ => "Object"
    }
    ret
  }
}
object VSourceDownloadDto {
  val TABLE_NAME = "vSourceDownload";
  val FIELD_sourceDownloadId = "sourceDownloadId";
  val FIELD_sourceScheduleId = "sourceScheduleId";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";
  val FIELD_guid = "guid";
  val FIELD_retryNumber = "retryNumber";
  val FIELD_isRunning = "isRunning";
  val FIELD_isFinished = "isFinished";
  val FIELD_isExcecption = "isExcecption";
  val FIELD_excecptionDescription = "excecptionDescription";
  val FIELD_sourceSchedule_sourceScheduleId = "sourceSchedule_sourceScheduleId";
  val FIELD_sourceSchedule_sourceViewId = "sourceSchedule_sourceViewId";
  val FIELD_sourceSchedule_executorStorageId = "sourceSchedule_executorStorageId";
  val FIELD_sourceSchedule_insertedRowDate = "sourceSchedule_insertedRowDate";
  val FIELD_sourceSchedule_lastUpdatedDate = "sourceSchedule_lastUpdatedDate";
  val FIELD_sourceSchedule_guid = "sourceSchedule_guid";
  val FIELD_sourceSchedule_onDemand = "sourceSchedule_onDemand";
  val FIELD_sourceSchedule_startTime = "sourceSchedule_startTime";
  val FIELD_sourceSchedule_intervalValue = "sourceSchedule_intervalValue";

}


case class VSourceDownloadStatDto (
                                    val sourceDownloadStatId : Long
                                    , val guid : Long
                                    , val sourceDownloadId : Long
                                    , val insertedRowDate : java.util.Date
                                    , val lastUpdatedDate : java.util.Date
                                    , val rowsCount : Long
                                    , val errorRowsCount : Long
                                    , val totalBytesCount : Long
                                    , val empryRowsCount : Long
                                    , val sourceDownload_sourceDownloadId : Long
                                    , val sourceDownload_sourceScheduleId : Long
                                    , val sourceDownload_insertedRowDate : java.util.Date
                                    , val sourceDownload_lastUpdatedDate : java.util.Date
                                    , val sourceDownload_guid : Long
                                    , val sourceDownload_retryNumber : Int
                                    , val sourceDownload_isRunning : Int
                                    , val sourceDownload_isFinished : Int
                                    , val sourceDownload_isExcecption : Int
                                    , val sourceDownload_excecptionDescription : String
                                  ) extends BaseReadOnlyDto {
  def tableName : String = {
    "vSourceDownloadStat";
  }
  def fields : String = {
    "sourceDownloadStatId,guid,sourceDownloadId,insertedRowDate,lastUpdatedDate,rowsCount,errorRowsCount,totalBytesCount,empryRowsCount,sourceDownload_sourceDownloadId,sourceDownload_sourceScheduleId,sourceDownload_insertedRowDate,sourceDownload_lastUpdatedDate,sourceDownload_guid,sourceDownload_retryNumber,sourceDownload_isRunning,sourceDownload_isFinished,sourceDownload_isExcecption,sourceDownload_excecptionDescription";
  }
  def pkFields : String = {
    "";
  }
  def fkFields : String = {
    "";
  }
  def nameField : String = {
    "";
  }
  def getPk() : Long = {
    sourceDownloadStatId
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
    Array(sourceDownloadStatId,guid,sourceDownloadId,insertedRowDate,lastUpdatedDate,rowsCount,errorRowsCount,totalBytesCount,empryRowsCount,sourceDownload_sourceDownloadId,sourceDownload_sourceScheduleId,sourceDownload_insertedRowDate,sourceDownload_lastUpdatedDate,sourceDownload_guid,sourceDownload_retryNumber,sourceDownload_isRunning,sourceDownload_isFinished,sourceDownload_isExcecption,sourceDownload_excecptionDescription)
  }
  def toStringArray() : Array[String] = {
    Array(""+sourceDownloadStatId,""+guid,""+sourceDownloadId,""+insertedRowDate,""+lastUpdatedDate,""+rowsCount,""+errorRowsCount,""+totalBytesCount,""+empryRowsCount,""+sourceDownload_sourceDownloadId,""+sourceDownload_sourceScheduleId,""+sourceDownload_insertedRowDate,""+sourceDownload_lastUpdatedDate,""+sourceDownload_guid,""+sourceDownload_retryNumber,""+sourceDownload_isRunning,""+sourceDownload_isFinished,""+sourceDownload_isExcecption,""+sourceDownload_excecptionDescription)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "sourceDownloadStatId" => sourceDownloadStatId
      case "guid" => guid
      case "sourceDownloadId" => sourceDownloadId
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case "rowsCount" => rowsCount
      case "errorRowsCount" => errorRowsCount
      case "totalBytesCount" => totalBytesCount
      case "empryRowsCount" => empryRowsCount
      case "sourceDownload_sourceDownloadId" => sourceDownload_sourceDownloadId
      case "sourceDownload_sourceScheduleId" => sourceDownload_sourceScheduleId
      case "sourceDownload_insertedRowDate" => sourceDownload_insertedRowDate
      case "sourceDownload_lastUpdatedDate" => sourceDownload_lastUpdatedDate
      case "sourceDownload_guid" => sourceDownload_guid
      case "sourceDownload_retryNumber" => sourceDownload_retryNumber
      case "sourceDownload_isRunning" => sourceDownload_isRunning
      case "sourceDownload_isFinished" => sourceDownload_isFinished
      case "sourceDownload_isExcecption" => sourceDownload_isExcecption
      case "sourceDownload_excecptionDescription" => sourceDownload_excecptionDescription
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "sourceDownloadStatId" => "Long"
      case "guid" => "Long"
      case "sourceDownloadId" => "Long"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case "rowsCount" => "Long"
      case "errorRowsCount" => "Long"
      case "totalBytesCount" => "Long"
      case "empryRowsCount" => "Long"
      case "sourceDownload_sourceDownloadId" => "Long"
      case "sourceDownload_sourceScheduleId" => "Long"
      case "sourceDownload_insertedRowDate" => "java.util.Date"
      case "sourceDownload_lastUpdatedDate" => "java.util.Date"
      case "sourceDownload_guid" => "Long"
      case "sourceDownload_retryNumber" => "Int"
      case "sourceDownload_isRunning" => "Int"
      case "sourceDownload_isFinished" => "Int"
      case "sourceDownload_isExcecption" => "Int"
      case "sourceDownload_excecptionDescription" => "String"
      case _ => "Object"
    }
    ret
  }
}
object VSourceDownloadStatDto {
  val TABLE_NAME = "vSourceDownloadStat";
  val FIELD_sourceDownloadStatId = "sourceDownloadStatId";
  val FIELD_guid = "guid";
  val FIELD_sourceDownloadId = "sourceDownloadId";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";
  val FIELD_rowsCount = "rowsCount";
  val FIELD_errorRowsCount = "errorRowsCount";
  val FIELD_totalBytesCount = "totalBytesCount";
  val FIELD_empryRowsCount = "empryRowsCount";
  val FIELD_sourceDownload_sourceDownloadId = "sourceDownload_sourceDownloadId";
  val FIELD_sourceDownload_sourceScheduleId = "sourceDownload_sourceScheduleId";
  val FIELD_sourceDownload_insertedRowDate = "sourceDownload_insertedRowDate";
  val FIELD_sourceDownload_lastUpdatedDate = "sourceDownload_lastUpdatedDate";
  val FIELD_sourceDownload_guid = "sourceDownload_guid";
  val FIELD_sourceDownload_retryNumber = "sourceDownload_retryNumber";
  val FIELD_sourceDownload_isRunning = "sourceDownload_isRunning";
  val FIELD_sourceDownload_isFinished = "sourceDownload_isFinished";
  val FIELD_sourceDownload_isExcecption = "sourceDownload_isExcecption";
  val FIELD_sourceDownload_excecptionDescription = "sourceDownload_excecptionDescription";

}


case class VSourceDownloadStatColumnDto (
                                          val sourceDownloadStatColumnId : Long
                                          , val guid : Long
                                          , val sourceDownloadId : Long
                                          , val sourceViewColumnId : Long
                                          , val insertedRowDate : java.util.Date
                                          , val lastUpdatedDate : java.util.Date
                                          , val columnMinNumber : Double
                                          , val columnMaxNumber : Double
                                          , val columnMinStr : String
                                          , val columnMaxStr : String
                                          , val columnNonemptyCount : Long
                                          , val sourceDownload_sourceDownloadId : Long
                                          , val sourceDownload_sourceScheduleId : Long
                                          , val sourceDownload_insertedRowDate : java.util.Date
                                          , val sourceDownload_lastUpdatedDate : java.util.Date
                                          , val sourceDownload_guid : Long
                                          , val sourceDownload_retryNumber : Int
                                          , val sourceDownload_isRunning : Int
                                          , val sourceDownload_isFinished : Int
                                          , val sourceDownload_isExcecption : Int
                                          , val sourceDownload_excecptionDescription : String
                                          , val sourceViewColumn_sourceViewColumnId : Long
                                          , val sourceViewColumn_sourceViewId : Long
                                          , val sourceViewColumn_insertedRowDate : java.util.Date
                                          , val sourceViewColumn_lastUpdatedDate : java.util.Date
                                          , val sourceViewColumn_guid : Long
                                          , val sourceViewColumn_columnName : String
                                          , val sourceViewColumn_columnType : String
                                        ) extends BaseReadOnlyDto {
  def tableName : String = {
    "vSourceDownloadStatColumn";
  }
  def fields : String = {
    "sourceDownloadStatColumnId,guid,sourceDownloadId,sourceViewColumnId,insertedRowDate,lastUpdatedDate,columnMinNumber,columnMaxNumber,columnMinStr,columnMaxStr,columnNonemptyCount,sourceDownload_sourceDownloadId,sourceDownload_sourceScheduleId,sourceDownload_insertedRowDate,sourceDownload_lastUpdatedDate,sourceDownload_guid,sourceDownload_retryNumber,sourceDownload_isRunning,sourceDownload_isFinished,sourceDownload_isExcecption,sourceDownload_excecptionDescription,sourceViewColumn_sourceViewColumnId,sourceViewColumn_sourceViewId,sourceViewColumn_insertedRowDate,sourceViewColumn_lastUpdatedDate,sourceViewColumn_guid,sourceViewColumn_columnName,sourceViewColumn_columnType";
  }
  def pkFields : String = {
    "";
  }
  def fkFields : String = {
    "";
  }
  def nameField : String = {
    "";
  }
  def getPk() : Long = {
    sourceDownloadStatColumnId
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
    Array(sourceDownloadStatColumnId,guid,sourceDownloadId,sourceViewColumnId,insertedRowDate,lastUpdatedDate,columnMinNumber,columnMaxNumber,columnMinStr,columnMaxStr,columnNonemptyCount,sourceDownload_sourceDownloadId,sourceDownload_sourceScheduleId,sourceDownload_insertedRowDate,sourceDownload_lastUpdatedDate,sourceDownload_guid,sourceDownload_retryNumber,sourceDownload_isRunning,sourceDownload_isFinished,sourceDownload_isExcecption,sourceDownload_excecptionDescription,sourceViewColumn_sourceViewColumnId,sourceViewColumn_sourceViewId,sourceViewColumn_insertedRowDate,sourceViewColumn_lastUpdatedDate,sourceViewColumn_guid,sourceViewColumn_columnName,sourceViewColumn_columnType)
  }
  def toStringArray() : Array[String] = {
    Array(""+sourceDownloadStatColumnId,""+guid,""+sourceDownloadId,""+sourceViewColumnId,""+insertedRowDate,""+lastUpdatedDate,""+columnMinNumber,""+columnMaxNumber,""+columnMinStr,""+columnMaxStr,""+columnNonemptyCount,""+sourceDownload_sourceDownloadId,""+sourceDownload_sourceScheduleId,""+sourceDownload_insertedRowDate,""+sourceDownload_lastUpdatedDate,""+sourceDownload_guid,""+sourceDownload_retryNumber,""+sourceDownload_isRunning,""+sourceDownload_isFinished,""+sourceDownload_isExcecption,""+sourceDownload_excecptionDescription,""+sourceViewColumn_sourceViewColumnId,""+sourceViewColumn_sourceViewId,""+sourceViewColumn_insertedRowDate,""+sourceViewColumn_lastUpdatedDate,""+sourceViewColumn_guid,""+sourceViewColumn_columnName,""+sourceViewColumn_columnType)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "sourceDownloadStatColumnId" => sourceDownloadStatColumnId
      case "guid" => guid
      case "sourceDownloadId" => sourceDownloadId
      case "sourceViewColumnId" => sourceViewColumnId
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case "columnMinNumber" => columnMinNumber
      case "columnMaxNumber" => columnMaxNumber
      case "columnMinStr" => columnMinStr
      case "columnMaxStr" => columnMaxStr
      case "columnNonemptyCount" => columnNonemptyCount
      case "sourceDownload_sourceDownloadId" => sourceDownload_sourceDownloadId
      case "sourceDownload_sourceScheduleId" => sourceDownload_sourceScheduleId
      case "sourceDownload_insertedRowDate" => sourceDownload_insertedRowDate
      case "sourceDownload_lastUpdatedDate" => sourceDownload_lastUpdatedDate
      case "sourceDownload_guid" => sourceDownload_guid
      case "sourceDownload_retryNumber" => sourceDownload_retryNumber
      case "sourceDownload_isRunning" => sourceDownload_isRunning
      case "sourceDownload_isFinished" => sourceDownload_isFinished
      case "sourceDownload_isExcecption" => sourceDownload_isExcecption
      case "sourceDownload_excecptionDescription" => sourceDownload_excecptionDescription
      case "sourceViewColumn_sourceViewColumnId" => sourceViewColumn_sourceViewColumnId
      case "sourceViewColumn_sourceViewId" => sourceViewColumn_sourceViewId
      case "sourceViewColumn_insertedRowDate" => sourceViewColumn_insertedRowDate
      case "sourceViewColumn_lastUpdatedDate" => sourceViewColumn_lastUpdatedDate
      case "sourceViewColumn_guid" => sourceViewColumn_guid
      case "sourceViewColumn_columnName" => sourceViewColumn_columnName
      case "sourceViewColumn_columnType" => sourceViewColumn_columnType
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "sourceDownloadStatColumnId" => "Long"
      case "guid" => "Long"
      case "sourceDownloadId" => "Long"
      case "sourceViewColumnId" => "Long"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case "columnMinNumber" => "Double"
      case "columnMaxNumber" => "Double"
      case "columnMinStr" => "String"
      case "columnMaxStr" => "String"
      case "columnNonemptyCount" => "Long"
      case "sourceDownload_sourceDownloadId" => "Long"
      case "sourceDownload_sourceScheduleId" => "Long"
      case "sourceDownload_insertedRowDate" => "java.util.Date"
      case "sourceDownload_lastUpdatedDate" => "java.util.Date"
      case "sourceDownload_guid" => "Long"
      case "sourceDownload_retryNumber" => "Int"
      case "sourceDownload_isRunning" => "Int"
      case "sourceDownload_isFinished" => "Int"
      case "sourceDownload_isExcecption" => "Int"
      case "sourceDownload_excecptionDescription" => "String"
      case "sourceViewColumn_sourceViewColumnId" => "Long"
      case "sourceViewColumn_sourceViewId" => "Long"
      case "sourceViewColumn_insertedRowDate" => "java.util.Date"
      case "sourceViewColumn_lastUpdatedDate" => "java.util.Date"
      case "sourceViewColumn_guid" => "Long"
      case "sourceViewColumn_columnName" => "String"
      case "sourceViewColumn_columnType" => "String"
      case _ => "Object"
    }
    ret
  }
}
object VSourceDownloadStatColumnDto {
  val TABLE_NAME = "vSourceDownloadStatColumn";
  val FIELD_sourceDownloadStatColumnId = "sourceDownloadStatColumnId";
  val FIELD_guid = "guid";
  val FIELD_sourceDownloadId = "sourceDownloadId";
  val FIELD_sourceViewColumnId = "sourceViewColumnId";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";
  val FIELD_columnMinNumber = "columnMinNumber";
  val FIELD_columnMaxNumber = "columnMaxNumber";
  val FIELD_columnMinStr = "columnMinStr";
  val FIELD_columnMaxStr = "columnMaxStr";
  val FIELD_columnNonemptyCount = "columnNonemptyCount";
  val FIELD_sourceDownload_sourceDownloadId = "sourceDownload_sourceDownloadId";
  val FIELD_sourceDownload_sourceScheduleId = "sourceDownload_sourceScheduleId";
  val FIELD_sourceDownload_insertedRowDate = "sourceDownload_insertedRowDate";
  val FIELD_sourceDownload_lastUpdatedDate = "sourceDownload_lastUpdatedDate";
  val FIELD_sourceDownload_guid = "sourceDownload_guid";
  val FIELD_sourceDownload_retryNumber = "sourceDownload_retryNumber";
  val FIELD_sourceDownload_isRunning = "sourceDownload_isRunning";
  val FIELD_sourceDownload_isFinished = "sourceDownload_isFinished";
  val FIELD_sourceDownload_isExcecption = "sourceDownload_isExcecption";
  val FIELD_sourceDownload_excecptionDescription = "sourceDownload_excecptionDescription";
  val FIELD_sourceViewColumn_sourceViewColumnId = "sourceViewColumn_sourceViewColumnId";
  val FIELD_sourceViewColumn_sourceViewId = "sourceViewColumn_sourceViewId";
  val FIELD_sourceViewColumn_insertedRowDate = "sourceViewColumn_insertedRowDate";
  val FIELD_sourceViewColumn_lastUpdatedDate = "sourceViewColumn_lastUpdatedDate";
  val FIELD_sourceViewColumn_guid = "sourceViewColumn_guid";
  val FIELD_sourceViewColumn_columnName = "sourceViewColumn_columnName";
  val FIELD_sourceViewColumn_columnType = "sourceViewColumn_columnType";

}


case class VSourceInstanceDto (
                                val sourceInstanceId : Long
                                , val guid : Long
                                , val sourceTypeId : Long
                                , val sourceInstanceName : String
                                , val errorCount : Long
                                , val correctCount : Long
                                , val lastStatus : String
                                , val lastConnectionDate : java.util.Date
                                , val insertedRowDate : java.util.Date
                                , val lastUpdatedDate : java.util.Date
                                , val sourceType_sourceTypeId : Long
                                , val sourceType_guid : Long
                                , val sourceType_sourceTypeName : String
                                , val sourceType_sourceTypeClass : String
                                , val sourceType_insertedRowDate : java.util.Date
                                , val sourceType_lastUpdatedDate : java.util.Date
                              ) extends BaseReadOnlyDto {
  def tableName : String = {
    "vSourceInstance";
  }
  def fields : String = {
    "sourceInstanceId,guid,sourceTypeId,sourceInstanceName,errorCount,correctCount,lastStatus,lastConnectionDate,insertedRowDate,lastUpdatedDate,sourceType_sourceTypeId,sourceType_guid,sourceType_sourceTypeName,sourceType_sourceTypeClass,sourceType_insertedRowDate,sourceType_lastUpdatedDate";
  }
  def pkFields : String = {
    "";
  }
  def fkFields : String = {
    "";
  }
  def nameField : String = {
    "";
  }
  def getPk() : Long = {
    sourceInstanceId
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
    Array(sourceInstanceId,guid,sourceTypeId,sourceInstanceName,errorCount,correctCount,lastStatus,lastConnectionDate,insertedRowDate,lastUpdatedDate,sourceType_sourceTypeId,sourceType_guid,sourceType_sourceTypeName,sourceType_sourceTypeClass,sourceType_insertedRowDate,sourceType_lastUpdatedDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+sourceInstanceId,""+guid,""+sourceTypeId,""+sourceInstanceName,""+errorCount,""+correctCount,""+lastStatus,""+lastConnectionDate,""+insertedRowDate,""+lastUpdatedDate,""+sourceType_sourceTypeId,""+sourceType_guid,""+sourceType_sourceTypeName,""+sourceType_sourceTypeClass,""+sourceType_insertedRowDate,""+sourceType_lastUpdatedDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "sourceInstanceId" => sourceInstanceId
      case "guid" => guid
      case "sourceTypeId" => sourceTypeId
      case "sourceInstanceName" => sourceInstanceName
      case "errorCount" => errorCount
      case "correctCount" => correctCount
      case "lastStatus" => lastStatus
      case "lastConnectionDate" => lastConnectionDate
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case "sourceType_sourceTypeId" => sourceType_sourceTypeId
      case "sourceType_guid" => sourceType_guid
      case "sourceType_sourceTypeName" => sourceType_sourceTypeName
      case "sourceType_sourceTypeClass" => sourceType_sourceTypeClass
      case "sourceType_insertedRowDate" => sourceType_insertedRowDate
      case "sourceType_lastUpdatedDate" => sourceType_lastUpdatedDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "sourceInstanceId" => "Long"
      case "guid" => "Long"
      case "sourceTypeId" => "Long"
      case "sourceInstanceName" => "String"
      case "errorCount" => "Long"
      case "correctCount" => "Long"
      case "lastStatus" => "String"
      case "lastConnectionDate" => "java.util.Date"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case "sourceType_sourceTypeId" => "Long"
      case "sourceType_guid" => "Long"
      case "sourceType_sourceTypeName" => "String"
      case "sourceType_sourceTypeClass" => "String"
      case "sourceType_insertedRowDate" => "java.util.Date"
      case "sourceType_lastUpdatedDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
}
object VSourceInstanceDto {
  val TABLE_NAME = "vSourceInstance";
  val FIELD_sourceInstanceId = "sourceInstanceId";
  val FIELD_guid = "guid";
  val FIELD_sourceTypeId = "sourceTypeId";
  val FIELD_sourceInstanceName = "sourceInstanceName";
  val FIELD_errorCount = "errorCount";
  val FIELD_correctCount = "correctCount";
  val FIELD_lastStatus = "lastStatus";
  val FIELD_lastConnectionDate = "lastConnectionDate";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";
  val FIELD_sourceType_sourceTypeId = "sourceType_sourceTypeId";
  val FIELD_sourceType_guid = "sourceType_guid";
  val FIELD_sourceType_sourceTypeName = "sourceType_sourceTypeName";
  val FIELD_sourceType_sourceTypeClass = "sourceType_sourceTypeClass";
  val FIELD_sourceType_insertedRowDate = "sourceType_insertedRowDate";
  val FIELD_sourceType_lastUpdatedDate = "sourceType_lastUpdatedDate";

}


case class VSourceParamValueDto (
                                  val sourceParamValueId : Long
                                  , val sourceInstanceId : Long
                                  , val sourceParamId : Long
                                  , val sourceParamValueVersion : String
                                  , val guid : Long
                                  , val insertedRowDate : java.util.Date
                                  , val lastUpdatedDate : java.util.Date
                                  , val paramValue : String
                                  , val sourceInstance_sourceInstanceId : Long
                                  , val sourceInstance_guid : Long
                                  , val sourceInstance_sourceTypeId : Long
                                  , val sourceInstance_sourceInstanceName : String
                                  , val sourceInstance_errorCount : Long
                                  , val sourceInstance_correctCount : Long
                                  , val sourceInstance_lastStatus : String
                                  , val sourceInstance_lastConnectionDate : java.util.Date
                                  , val sourceInstance_insertedRowDate : java.util.Date
                                  , val sourceInstance_lastUpdatedDate : java.util.Date
                                  , val sourceParam_sourceParamId : Long
                                  , val sourceParam_guid : Long
                                  , val sourceParam_sourceParamName : String
                                  , val sourceParam_sourceParamType : String
                                  , val sourceParam_possibleValues : String
                                  , val sourceParam_insertedRowDate : java.util.Date
                                  , val sourceParam_lastUpdatedDate : java.util.Date
                                ) extends BaseReadOnlyDto {
  def tableName : String = {
    "vSourceParamValue";
  }
  def fields : String = {
    "sourceParamValueId,sourceInstanceId,sourceParamId,sourceParamValueVersion,guid,insertedRowDate,lastUpdatedDate,paramValue,sourceInstance_sourceInstanceId,sourceInstance_guid,sourceInstance_sourceTypeId,sourceInstance_sourceInstanceName,sourceInstance_errorCount,sourceInstance_correctCount,sourceInstance_lastStatus,sourceInstance_lastConnectionDate,sourceInstance_insertedRowDate,sourceInstance_lastUpdatedDate,sourceParam_sourceParamId,sourceParam_guid,sourceParam_sourceParamName,sourceParam_sourceParamType,sourceParam_possibleValues,sourceParam_insertedRowDate,sourceParam_lastUpdatedDate";
  }
  def pkFields : String = {
    "";
  }
  def fkFields : String = {
    "";
  }
  def nameField : String = {
    "";
  }
  def getPk() : Long = {
    sourceParamValueId
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
    Array(sourceParamValueId,sourceInstanceId,sourceParamId,sourceParamValueVersion,guid,insertedRowDate,lastUpdatedDate,paramValue,sourceInstance_sourceInstanceId,sourceInstance_guid,sourceInstance_sourceTypeId,sourceInstance_sourceInstanceName,sourceInstance_errorCount,sourceInstance_correctCount,sourceInstance_lastStatus,sourceInstance_lastConnectionDate,sourceInstance_insertedRowDate,sourceInstance_lastUpdatedDate,sourceParam_sourceParamId,sourceParam_guid,sourceParam_sourceParamName,sourceParam_sourceParamType,sourceParam_possibleValues,sourceParam_insertedRowDate,sourceParam_lastUpdatedDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+sourceParamValueId,""+sourceInstanceId,""+sourceParamId,""+sourceParamValueVersion,""+guid,""+insertedRowDate,""+lastUpdatedDate,""+paramValue,""+sourceInstance_sourceInstanceId,""+sourceInstance_guid,""+sourceInstance_sourceTypeId,""+sourceInstance_sourceInstanceName,""+sourceInstance_errorCount,""+sourceInstance_correctCount,""+sourceInstance_lastStatus,""+sourceInstance_lastConnectionDate,""+sourceInstance_insertedRowDate,""+sourceInstance_lastUpdatedDate,""+sourceParam_sourceParamId,""+sourceParam_guid,""+sourceParam_sourceParamName,""+sourceParam_sourceParamType,""+sourceParam_possibleValues,""+sourceParam_insertedRowDate,""+sourceParam_lastUpdatedDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "sourceParamValueId" => sourceParamValueId
      case "sourceInstanceId" => sourceInstanceId
      case "sourceParamId" => sourceParamId
      case "sourceParamValueVersion" => sourceParamValueVersion
      case "guid" => guid
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case "paramValue" => paramValue
      case "sourceInstance_sourceInstanceId" => sourceInstance_sourceInstanceId
      case "sourceInstance_guid" => sourceInstance_guid
      case "sourceInstance_sourceTypeId" => sourceInstance_sourceTypeId
      case "sourceInstance_sourceInstanceName" => sourceInstance_sourceInstanceName
      case "sourceInstance_errorCount" => sourceInstance_errorCount
      case "sourceInstance_correctCount" => sourceInstance_correctCount
      case "sourceInstance_lastStatus" => sourceInstance_lastStatus
      case "sourceInstance_lastConnectionDate" => sourceInstance_lastConnectionDate
      case "sourceInstance_insertedRowDate" => sourceInstance_insertedRowDate
      case "sourceInstance_lastUpdatedDate" => sourceInstance_lastUpdatedDate
      case "sourceParam_sourceParamId" => sourceParam_sourceParamId
      case "sourceParam_guid" => sourceParam_guid
      case "sourceParam_sourceParamName" => sourceParam_sourceParamName
      case "sourceParam_sourceParamType" => sourceParam_sourceParamType
      case "sourceParam_possibleValues" => sourceParam_possibleValues
      case "sourceParam_insertedRowDate" => sourceParam_insertedRowDate
      case "sourceParam_lastUpdatedDate" => sourceParam_lastUpdatedDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "sourceParamValueId" => "Long"
      case "sourceInstanceId" => "Long"
      case "sourceParamId" => "Long"
      case "sourceParamValueVersion" => "String"
      case "guid" => "Long"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case "paramValue" => "String"
      case "sourceInstance_sourceInstanceId" => "Long"
      case "sourceInstance_guid" => "Long"
      case "sourceInstance_sourceTypeId" => "Long"
      case "sourceInstance_sourceInstanceName" => "String"
      case "sourceInstance_errorCount" => "Long"
      case "sourceInstance_correctCount" => "Long"
      case "sourceInstance_lastStatus" => "String"
      case "sourceInstance_lastConnectionDate" => "java.util.Date"
      case "sourceInstance_insertedRowDate" => "java.util.Date"
      case "sourceInstance_lastUpdatedDate" => "java.util.Date"
      case "sourceParam_sourceParamId" => "Long"
      case "sourceParam_guid" => "Long"
      case "sourceParam_sourceParamName" => "String"
      case "sourceParam_sourceParamType" => "String"
      case "sourceParam_possibleValues" => "String"
      case "sourceParam_insertedRowDate" => "java.util.Date"
      case "sourceParam_lastUpdatedDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
}
object VSourceParamValueDto {
  val TABLE_NAME = "vSourceParamValue";
  val FIELD_sourceParamValueId = "sourceParamValueId";
  val FIELD_sourceInstanceId = "sourceInstanceId";
  val FIELD_sourceParamId = "sourceParamId";
  val FIELD_sourceParamValueVersion = "sourceParamValueVersion";
  val FIELD_guid = "guid";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";
  val FIELD_paramValue = "paramValue";
  val FIELD_sourceInstance_sourceInstanceId = "sourceInstance_sourceInstanceId";
  val FIELD_sourceInstance_guid = "sourceInstance_guid";
  val FIELD_sourceInstance_sourceTypeId = "sourceInstance_sourceTypeId";
  val FIELD_sourceInstance_sourceInstanceName = "sourceInstance_sourceInstanceName";
  val FIELD_sourceInstance_errorCount = "sourceInstance_errorCount";
  val FIELD_sourceInstance_correctCount = "sourceInstance_correctCount";
  val FIELD_sourceInstance_lastStatus = "sourceInstance_lastStatus";
  val FIELD_sourceInstance_lastConnectionDate = "sourceInstance_lastConnectionDate";
  val FIELD_sourceInstance_insertedRowDate = "sourceInstance_insertedRowDate";
  val FIELD_sourceInstance_lastUpdatedDate = "sourceInstance_lastUpdatedDate";
  val FIELD_sourceParam_sourceParamId = "sourceParam_sourceParamId";
  val FIELD_sourceParam_guid = "sourceParam_guid";
  val FIELD_sourceParam_sourceParamName = "sourceParam_sourceParamName";
  val FIELD_sourceParam_sourceParamType = "sourceParam_sourceParamType";
  val FIELD_sourceParam_possibleValues = "sourceParam_possibleValues";
  val FIELD_sourceParam_insertedRowDate = "sourceParam_insertedRowDate";
  val FIELD_sourceParam_lastUpdatedDate = "sourceParam_lastUpdatedDate";

}


case class VSourceScheduleDto (
                                val sourceScheduleId : Long
                                , val sourceViewId : Long
                                , val executorStorageId : Long
                                , val insertedRowDate : java.util.Date
                                , val lastUpdatedDate : java.util.Date
                                , val guid : Long
                                , val onDemand : Int
                                , val startTime : java.util.Date
                                , val intervalValue : Long
                                , val executorStorage_executorStorageId : Long
                                , val executorStorage_guid : Long
                                , val executorStorage_executorHostId : Long
                                , val executorStorage_executorStorageTypeId : Long
                                , val executorStorage_storageDefinition : String
                                , val executorStorage_storageBasePath : String
                                , val executorStorage_storageFulllPath : String
                                , val executorStorage_isRunning : Int
                                , val executorStorage_portNumber : Int
                                , val executorStorage_insertedRowDate : java.util.Date
                                , val executorStorage_lastUpdatedDate : java.util.Date
                                , val sourceView_sourceViewId : Long
                                , val sourceView_guid : Long
                                , val sourceView_sourceInstanceId : Long
                                , val sourceView_sourceViewTypeId : Long
                                , val sourceView_sourceViewName : String
                                , val sourceView_sourceViewDefinition : String
                                , val sourceView_insertedRowDate : java.util.Date
                                , val sourceView_lastUpdatedDate : java.util.Date
                              ) extends BaseReadOnlyDto {
  def tableName : String = {
    "vSourceSchedule";
  }
  def fields : String = {
    "sourceScheduleId,sourceViewId,executorStorageId,insertedRowDate,lastUpdatedDate,guid,onDemand,startTime,intervalValue,executorStorage_executorStorageId,executorStorage_guid,executorStorage_executorHostId,executorStorage_executorStorageTypeId,executorStorage_storageDefinition,executorStorage_storageBasePath,executorStorage_storageFulllPath,executorStorage_isRunning,executorStorage_portNumber,executorStorage_insertedRowDate,executorStorage_lastUpdatedDate,sourceView_sourceViewId,sourceView_guid,sourceView_sourceInstanceId,sourceView_sourceViewTypeId,sourceView_sourceViewName,sourceView_sourceViewDefinition,sourceView_insertedRowDate,sourceView_lastUpdatedDate";
  }
  def pkFields : String = {
    "";
  }
  def fkFields : String = {
    "";
  }
  def nameField : String = {
    "";
  }
  def getPk() : Long = {
    sourceScheduleId
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
    Array(sourceScheduleId,sourceViewId,executorStorageId,insertedRowDate,lastUpdatedDate,guid,onDemand,startTime,intervalValue,executorStorage_executorStorageId,executorStorage_guid,executorStorage_executorHostId,executorStorage_executorStorageTypeId,executorStorage_storageDefinition,executorStorage_storageBasePath,executorStorage_storageFulllPath,executorStorage_isRunning,executorStorage_portNumber,executorStorage_insertedRowDate,executorStorage_lastUpdatedDate,sourceView_sourceViewId,sourceView_guid,sourceView_sourceInstanceId,sourceView_sourceViewTypeId,sourceView_sourceViewName,sourceView_sourceViewDefinition,sourceView_insertedRowDate,sourceView_lastUpdatedDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+sourceScheduleId,""+sourceViewId,""+executorStorageId,""+insertedRowDate,""+lastUpdatedDate,""+guid,""+onDemand,""+startTime,""+intervalValue,""+executorStorage_executorStorageId,""+executorStorage_guid,""+executorStorage_executorHostId,""+executorStorage_executorStorageTypeId,""+executorStorage_storageDefinition,""+executorStorage_storageBasePath,""+executorStorage_storageFulllPath,""+executorStorage_isRunning,""+executorStorage_portNumber,""+executorStorage_insertedRowDate,""+executorStorage_lastUpdatedDate,""+sourceView_sourceViewId,""+sourceView_guid,""+sourceView_sourceInstanceId,""+sourceView_sourceViewTypeId,""+sourceView_sourceViewName,""+sourceView_sourceViewDefinition,""+sourceView_insertedRowDate,""+sourceView_lastUpdatedDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "sourceScheduleId" => sourceScheduleId
      case "sourceViewId" => sourceViewId
      case "executorStorageId" => executorStorageId
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case "guid" => guid
      case "onDemand" => onDemand
      case "startTime" => startTime
      case "intervalValue" => intervalValue
      case "executorStorage_executorStorageId" => executorStorage_executorStorageId
      case "executorStorage_guid" => executorStorage_guid
      case "executorStorage_executorHostId" => executorStorage_executorHostId
      case "executorStorage_executorStorageTypeId" => executorStorage_executorStorageTypeId
      case "executorStorage_storageDefinition" => executorStorage_storageDefinition
      case "executorStorage_storageBasePath" => executorStorage_storageBasePath
      case "executorStorage_storageFulllPath" => executorStorage_storageFulllPath
      case "executorStorage_isRunning" => executorStorage_isRunning
      case "executorStorage_portNumber" => executorStorage_portNumber
      case "executorStorage_insertedRowDate" => executorStorage_insertedRowDate
      case "executorStorage_lastUpdatedDate" => executorStorage_lastUpdatedDate
      case "sourceView_sourceViewId" => sourceView_sourceViewId
      case "sourceView_guid" => sourceView_guid
      case "sourceView_sourceInstanceId" => sourceView_sourceInstanceId
      case "sourceView_sourceViewTypeId" => sourceView_sourceViewTypeId
      case "sourceView_sourceViewName" => sourceView_sourceViewName
      case "sourceView_sourceViewDefinition" => sourceView_sourceViewDefinition
      case "sourceView_insertedRowDate" => sourceView_insertedRowDate
      case "sourceView_lastUpdatedDate" => sourceView_lastUpdatedDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "sourceScheduleId" => "Long"
      case "sourceViewId" => "Long"
      case "executorStorageId" => "Long"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case "guid" => "Long"
      case "onDemand" => "Int"
      case "startTime" => "java.util.Date"
      case "intervalValue" => "Long"
      case "executorStorage_executorStorageId" => "Long"
      case "executorStorage_guid" => "Long"
      case "executorStorage_executorHostId" => "Long"
      case "executorStorage_executorStorageTypeId" => "Long"
      case "executorStorage_storageDefinition" => "String"
      case "executorStorage_storageBasePath" => "String"
      case "executorStorage_storageFulllPath" => "String"
      case "executorStorage_isRunning" => "Int"
      case "executorStorage_portNumber" => "Int"
      case "executorStorage_insertedRowDate" => "java.util.Date"
      case "executorStorage_lastUpdatedDate" => "java.util.Date"
      case "sourceView_sourceViewId" => "Long"
      case "sourceView_guid" => "Long"
      case "sourceView_sourceInstanceId" => "Long"
      case "sourceView_sourceViewTypeId" => "Long"
      case "sourceView_sourceViewName" => "String"
      case "sourceView_sourceViewDefinition" => "String"
      case "sourceView_insertedRowDate" => "java.util.Date"
      case "sourceView_lastUpdatedDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
}
object VSourceScheduleDto {
  val TABLE_NAME = "vSourceSchedule";
  val FIELD_sourceScheduleId = "sourceScheduleId";
  val FIELD_sourceViewId = "sourceViewId";
  val FIELD_executorStorageId = "executorStorageId";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";
  val FIELD_guid = "guid";
  val FIELD_onDemand = "onDemand";
  val FIELD_startTime = "startTime";
  val FIELD_intervalValue = "intervalValue";
  val FIELD_executorStorage_executorStorageId = "executorStorage_executorStorageId";
  val FIELD_executorStorage_guid = "executorStorage_guid";
  val FIELD_executorStorage_executorHostId = "executorStorage_executorHostId";
  val FIELD_executorStorage_executorStorageTypeId = "executorStorage_executorStorageTypeId";
  val FIELD_executorStorage_storageDefinition = "executorStorage_storageDefinition";
  val FIELD_executorStorage_storageBasePath = "executorStorage_storageBasePath";
  val FIELD_executorStorage_storageFulllPath = "executorStorage_storageFulllPath";
  val FIELD_executorStorage_isRunning = "executorStorage_isRunning";
  val FIELD_executorStorage_portNumber = "executorStorage_portNumber";
  val FIELD_executorStorage_insertedRowDate = "executorStorage_insertedRowDate";
  val FIELD_executorStorage_lastUpdatedDate = "executorStorage_lastUpdatedDate";
  val FIELD_sourceView_sourceViewId = "sourceView_sourceViewId";
  val FIELD_sourceView_guid = "sourceView_guid";
  val FIELD_sourceView_sourceInstanceId = "sourceView_sourceInstanceId";
  val FIELD_sourceView_sourceViewTypeId = "sourceView_sourceViewTypeId";
  val FIELD_sourceView_sourceViewName = "sourceView_sourceViewName";
  val FIELD_sourceView_sourceViewDefinition = "sourceView_sourceViewDefinition";
  val FIELD_sourceView_insertedRowDate = "sourceView_insertedRowDate";
  val FIELD_sourceView_lastUpdatedDate = "sourceView_lastUpdatedDate";

}


case class VSourceTypeParamDto (
                                 val sourceTypeParamId : Long
                                 , val sourceTypeId : Long
                                 , val sourceParamId : Long
                                 , val sourceTypeName : String
                                 , val sourceParamName : String
                                 , val isRequired : Int
                                 , val guid : Long
                                 , val insertedRowDate : java.util.Date
                                 , val lastUpdatedDate : java.util.Date
                                 , val sourceParam_sourceParamId : Long
                                 , val sourceParam_guid : Long
                                 , val sourceParam_sourceParamName : String
                                 , val sourceParam_sourceParamType : String
                                 , val sourceParam_possibleValues : String
                                 , val sourceParam_insertedRowDate : java.util.Date
                                 , val sourceParam_lastUpdatedDate : java.util.Date
                                 , val sourceType_sourceTypeId : Long
                                 , val sourceType_guid : Long
                                 , val sourceType_sourceTypeName : String
                                 , val sourceType_sourceTypeClass : String
                                 , val sourceType_insertedRowDate : java.util.Date
                                 , val sourceType_lastUpdatedDate : java.util.Date
                               ) extends BaseReadOnlyDto {
  def tableName : String = {
    "vSourceTypeParam";
  }
  def fields : String = {
    "sourceTypeParamId,sourceTypeId,sourceParamId,sourceTypeName,sourceParamName,isRequired,guid,insertedRowDate,lastUpdatedDate,sourceParam_sourceParamId,sourceParam_guid,sourceParam_sourceParamName,sourceParam_sourceParamType,sourceParam_possibleValues,sourceParam_insertedRowDate,sourceParam_lastUpdatedDate,sourceType_sourceTypeId,sourceType_guid,sourceType_sourceTypeName,sourceType_sourceTypeClass,sourceType_insertedRowDate,sourceType_lastUpdatedDate";
  }
  def pkFields : String = {
    "";
  }
  def fkFields : String = {
    "";
  }
  def nameField : String = {
    "";
  }
  def getPk() : Long = {
    sourceTypeParamId
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
    Array(sourceTypeParamId,sourceTypeId,sourceParamId,sourceTypeName,sourceParamName,isRequired,guid,insertedRowDate,lastUpdatedDate,sourceParam_sourceParamId,sourceParam_guid,sourceParam_sourceParamName,sourceParam_sourceParamType,sourceParam_possibleValues,sourceParam_insertedRowDate,sourceParam_lastUpdatedDate,sourceType_sourceTypeId,sourceType_guid,sourceType_sourceTypeName,sourceType_sourceTypeClass,sourceType_insertedRowDate,sourceType_lastUpdatedDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+sourceTypeParamId,""+sourceTypeId,""+sourceParamId,""+sourceTypeName,""+sourceParamName,""+isRequired,""+guid,""+insertedRowDate,""+lastUpdatedDate,""+sourceParam_sourceParamId,""+sourceParam_guid,""+sourceParam_sourceParamName,""+sourceParam_sourceParamType,""+sourceParam_possibleValues,""+sourceParam_insertedRowDate,""+sourceParam_lastUpdatedDate,""+sourceType_sourceTypeId,""+sourceType_guid,""+sourceType_sourceTypeName,""+sourceType_sourceTypeClass,""+sourceType_insertedRowDate,""+sourceType_lastUpdatedDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "sourceTypeParamId" => sourceTypeParamId
      case "sourceTypeId" => sourceTypeId
      case "sourceParamId" => sourceParamId
      case "sourceTypeName" => sourceTypeName
      case "sourceParamName" => sourceParamName
      case "isRequired" => isRequired
      case "guid" => guid
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case "sourceParam_sourceParamId" => sourceParam_sourceParamId
      case "sourceParam_guid" => sourceParam_guid
      case "sourceParam_sourceParamName" => sourceParam_sourceParamName
      case "sourceParam_sourceParamType" => sourceParam_sourceParamType
      case "sourceParam_possibleValues" => sourceParam_possibleValues
      case "sourceParam_insertedRowDate" => sourceParam_insertedRowDate
      case "sourceParam_lastUpdatedDate" => sourceParam_lastUpdatedDate
      case "sourceType_sourceTypeId" => sourceType_sourceTypeId
      case "sourceType_guid" => sourceType_guid
      case "sourceType_sourceTypeName" => sourceType_sourceTypeName
      case "sourceType_sourceTypeClass" => sourceType_sourceTypeClass
      case "sourceType_insertedRowDate" => sourceType_insertedRowDate
      case "sourceType_lastUpdatedDate" => sourceType_lastUpdatedDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "sourceTypeParamId" => "Long"
      case "sourceTypeId" => "Long"
      case "sourceParamId" => "Long"
      case "sourceTypeName" => "String"
      case "sourceParamName" => "String"
      case "isRequired" => "Int"
      case "guid" => "Long"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case "sourceParam_sourceParamId" => "Long"
      case "sourceParam_guid" => "Long"
      case "sourceParam_sourceParamName" => "String"
      case "sourceParam_sourceParamType" => "String"
      case "sourceParam_possibleValues" => "String"
      case "sourceParam_insertedRowDate" => "java.util.Date"
      case "sourceParam_lastUpdatedDate" => "java.util.Date"
      case "sourceType_sourceTypeId" => "Long"
      case "sourceType_guid" => "Long"
      case "sourceType_sourceTypeName" => "String"
      case "sourceType_sourceTypeClass" => "String"
      case "sourceType_insertedRowDate" => "java.util.Date"
      case "sourceType_lastUpdatedDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
}
object VSourceTypeParamDto {
  val TABLE_NAME = "vSourceTypeParam";
  val FIELD_sourceTypeParamId = "sourceTypeParamId";
  val FIELD_sourceTypeId = "sourceTypeId";
  val FIELD_sourceParamId = "sourceParamId";
  val FIELD_sourceTypeName = "sourceTypeName";
  val FIELD_sourceParamName = "sourceParamName";
  val FIELD_isRequired = "isRequired";
  val FIELD_guid = "guid";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";
  val FIELD_sourceParam_sourceParamId = "sourceParam_sourceParamId";
  val FIELD_sourceParam_guid = "sourceParam_guid";
  val FIELD_sourceParam_sourceParamName = "sourceParam_sourceParamName";
  val FIELD_sourceParam_sourceParamType = "sourceParam_sourceParamType";
  val FIELD_sourceParam_possibleValues = "sourceParam_possibleValues";
  val FIELD_sourceParam_insertedRowDate = "sourceParam_insertedRowDate";
  val FIELD_sourceParam_lastUpdatedDate = "sourceParam_lastUpdatedDate";
  val FIELD_sourceType_sourceTypeId = "sourceType_sourceTypeId";
  val FIELD_sourceType_guid = "sourceType_guid";
  val FIELD_sourceType_sourceTypeName = "sourceType_sourceTypeName";
  val FIELD_sourceType_sourceTypeClass = "sourceType_sourceTypeClass";
  val FIELD_sourceType_insertedRowDate = "sourceType_insertedRowDate";
  val FIELD_sourceType_lastUpdatedDate = "sourceType_lastUpdatedDate";

}


case class VSourceViewDto (
                            val sourceViewId : Long
                            , val guid : Long
                            , val sourceInstanceId : Long
                            , val sourceViewTypeId : Long
                            , val sourceViewName : String
                            , val sourceViewDefinition : String
                            , val insertedRowDate : java.util.Date
                            , val lastUpdatedDate : java.util.Date
                            , val sourceInstance_sourceInstanceId : Long
                            , val sourceInstance_guid : Long
                            , val sourceInstance_sourceTypeId : Long
                            , val sourceInstance_sourceInstanceName : String
                            , val sourceInstance_errorCount : Long
                            , val sourceInstance_correctCount : Long
                            , val sourceInstance_lastStatus : String
                            , val sourceInstance_lastConnectionDate : java.util.Date
                            , val sourceInstance_insertedRowDate : java.util.Date
                            , val sourceInstance_lastUpdatedDate : java.util.Date
                            , val sourceViewType_sourceViewTypeId : Long
                            , val sourceViewType_guid : Long
                            , val sourceViewType_sourceViewTypeName : String
                            , val sourceViewType_sourceViewTypeClass : String
                            , val sourceViewType_insertedRowDate : java.util.Date
                            , val sourceViewType_lastUpdatedDate : java.util.Date
                          ) extends BaseReadOnlyDto {
  def tableName : String = {
    "vSourceView";
  }
  def fields : String = {
    "sourceViewId,guid,sourceInstanceId,sourceViewTypeId,sourceViewName,sourceViewDefinition,insertedRowDate,lastUpdatedDate,sourceInstance_sourceInstanceId,sourceInstance_guid,sourceInstance_sourceTypeId,sourceInstance_sourceInstanceName,sourceInstance_errorCount,sourceInstance_correctCount,sourceInstance_lastStatus,sourceInstance_lastConnectionDate,sourceInstance_insertedRowDate,sourceInstance_lastUpdatedDate,sourceViewType_sourceViewTypeId,sourceViewType_guid,sourceViewType_sourceViewTypeName,sourceViewType_sourceViewTypeClass,sourceViewType_insertedRowDate,sourceViewType_lastUpdatedDate";
  }
  def pkFields : String = {
    "";
  }
  def fkFields : String = {
    "";
  }
  def nameField : String = {
    "";
  }
  def getPk() : Long = {
    sourceViewId
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
    Array(sourceViewId,guid,sourceInstanceId,sourceViewTypeId,sourceViewName,sourceViewDefinition,insertedRowDate,lastUpdatedDate,sourceInstance_sourceInstanceId,sourceInstance_guid,sourceInstance_sourceTypeId,sourceInstance_sourceInstanceName,sourceInstance_errorCount,sourceInstance_correctCount,sourceInstance_lastStatus,sourceInstance_lastConnectionDate,sourceInstance_insertedRowDate,sourceInstance_lastUpdatedDate,sourceViewType_sourceViewTypeId,sourceViewType_guid,sourceViewType_sourceViewTypeName,sourceViewType_sourceViewTypeClass,sourceViewType_insertedRowDate,sourceViewType_lastUpdatedDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+sourceViewId,""+guid,""+sourceInstanceId,""+sourceViewTypeId,""+sourceViewName,""+sourceViewDefinition,""+insertedRowDate,""+lastUpdatedDate,""+sourceInstance_sourceInstanceId,""+sourceInstance_guid,""+sourceInstance_sourceTypeId,""+sourceInstance_sourceInstanceName,""+sourceInstance_errorCount,""+sourceInstance_correctCount,""+sourceInstance_lastStatus,""+sourceInstance_lastConnectionDate,""+sourceInstance_insertedRowDate,""+sourceInstance_lastUpdatedDate,""+sourceViewType_sourceViewTypeId,""+sourceViewType_guid,""+sourceViewType_sourceViewTypeName,""+sourceViewType_sourceViewTypeClass,""+sourceViewType_insertedRowDate,""+sourceViewType_lastUpdatedDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "sourceViewId" => sourceViewId
      case "guid" => guid
      case "sourceInstanceId" => sourceInstanceId
      case "sourceViewTypeId" => sourceViewTypeId
      case "sourceViewName" => sourceViewName
      case "sourceViewDefinition" => sourceViewDefinition
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case "sourceInstance_sourceInstanceId" => sourceInstance_sourceInstanceId
      case "sourceInstance_guid" => sourceInstance_guid
      case "sourceInstance_sourceTypeId" => sourceInstance_sourceTypeId
      case "sourceInstance_sourceInstanceName" => sourceInstance_sourceInstanceName
      case "sourceInstance_errorCount" => sourceInstance_errorCount
      case "sourceInstance_correctCount" => sourceInstance_correctCount
      case "sourceInstance_lastStatus" => sourceInstance_lastStatus
      case "sourceInstance_lastConnectionDate" => sourceInstance_lastConnectionDate
      case "sourceInstance_insertedRowDate" => sourceInstance_insertedRowDate
      case "sourceInstance_lastUpdatedDate" => sourceInstance_lastUpdatedDate
      case "sourceViewType_sourceViewTypeId" => sourceViewType_sourceViewTypeId
      case "sourceViewType_guid" => sourceViewType_guid
      case "sourceViewType_sourceViewTypeName" => sourceViewType_sourceViewTypeName
      case "sourceViewType_sourceViewTypeClass" => sourceViewType_sourceViewTypeClass
      case "sourceViewType_insertedRowDate" => sourceViewType_insertedRowDate
      case "sourceViewType_lastUpdatedDate" => sourceViewType_lastUpdatedDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "sourceViewId" => "Long"
      case "guid" => "Long"
      case "sourceInstanceId" => "Long"
      case "sourceViewTypeId" => "Long"
      case "sourceViewName" => "String"
      case "sourceViewDefinition" => "String"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case "sourceInstance_sourceInstanceId" => "Long"
      case "sourceInstance_guid" => "Long"
      case "sourceInstance_sourceTypeId" => "Long"
      case "sourceInstance_sourceInstanceName" => "String"
      case "sourceInstance_errorCount" => "Long"
      case "sourceInstance_correctCount" => "Long"
      case "sourceInstance_lastStatus" => "String"
      case "sourceInstance_lastConnectionDate" => "java.util.Date"
      case "sourceInstance_insertedRowDate" => "java.util.Date"
      case "sourceInstance_lastUpdatedDate" => "java.util.Date"
      case "sourceViewType_sourceViewTypeId" => "Long"
      case "sourceViewType_guid" => "Long"
      case "sourceViewType_sourceViewTypeName" => "String"
      case "sourceViewType_sourceViewTypeClass" => "String"
      case "sourceViewType_insertedRowDate" => "java.util.Date"
      case "sourceViewType_lastUpdatedDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
}
object VSourceViewDto {
  val TABLE_NAME = "vSourceView";
  val FIELD_sourceViewId = "sourceViewId";
  val FIELD_guid = "guid";
  val FIELD_sourceInstanceId = "sourceInstanceId";
  val FIELD_sourceViewTypeId = "sourceViewTypeId";
  val FIELD_sourceViewName = "sourceViewName";
  val FIELD_sourceViewDefinition = "sourceViewDefinition";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";
  val FIELD_sourceInstance_sourceInstanceId = "sourceInstance_sourceInstanceId";
  val FIELD_sourceInstance_guid = "sourceInstance_guid";
  val FIELD_sourceInstance_sourceTypeId = "sourceInstance_sourceTypeId";
  val FIELD_sourceInstance_sourceInstanceName = "sourceInstance_sourceInstanceName";
  val FIELD_sourceInstance_errorCount = "sourceInstance_errorCount";
  val FIELD_sourceInstance_correctCount = "sourceInstance_correctCount";
  val FIELD_sourceInstance_lastStatus = "sourceInstance_lastStatus";
  val FIELD_sourceInstance_lastConnectionDate = "sourceInstance_lastConnectionDate";
  val FIELD_sourceInstance_insertedRowDate = "sourceInstance_insertedRowDate";
  val FIELD_sourceInstance_lastUpdatedDate = "sourceInstance_lastUpdatedDate";
  val FIELD_sourceViewType_sourceViewTypeId = "sourceViewType_sourceViewTypeId";
  val FIELD_sourceViewType_guid = "sourceViewType_guid";
  val FIELD_sourceViewType_sourceViewTypeName = "sourceViewType_sourceViewTypeName";
  val FIELD_sourceViewType_sourceViewTypeClass = "sourceViewType_sourceViewTypeClass";
  val FIELD_sourceViewType_insertedRowDate = "sourceViewType_insertedRowDate";
  val FIELD_sourceViewType_lastUpdatedDate = "sourceViewType_lastUpdatedDate";

}


case class VSourceViewColumnDto (
                                  val sourceViewColumnId : Long
                                  , val sourceViewId : Long
                                  , val insertedRowDate : java.util.Date
                                  , val lastUpdatedDate : java.util.Date
                                  , val guid : Long
                                  , val columnName : String
                                  , val columnType : String
                                  , val sourceView_sourceViewId : Long
                                  , val sourceView_guid : Long
                                  , val sourceView_sourceInstanceId : Long
                                  , val sourceView_sourceViewTypeId : Long
                                  , val sourceView_sourceViewName : String
                                  , val sourceView_sourceViewDefinition : String
                                  , val sourceView_insertedRowDate : java.util.Date
                                  , val sourceView_lastUpdatedDate : java.util.Date
                                ) extends BaseReadOnlyDto {
  def tableName : String = {
    "vSourceViewColumn";
  }
  def fields : String = {
    "sourceViewColumnId,sourceViewId,insertedRowDate,lastUpdatedDate,guid,columnName,columnType,sourceView_sourceViewId,sourceView_guid,sourceView_sourceInstanceId,sourceView_sourceViewTypeId,sourceView_sourceViewName,sourceView_sourceViewDefinition,sourceView_insertedRowDate,sourceView_lastUpdatedDate";
  }
  def pkFields : String = {
    "";
  }
  def fkFields : String = {
    "";
  }
  def nameField : String = {
    "";
  }
  def getPk() : Long = {
    sourceViewColumnId
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
    Array(sourceViewColumnId,sourceViewId,insertedRowDate,lastUpdatedDate,guid,columnName,columnType,sourceView_sourceViewId,sourceView_guid,sourceView_sourceInstanceId,sourceView_sourceViewTypeId,sourceView_sourceViewName,sourceView_sourceViewDefinition,sourceView_insertedRowDate,sourceView_lastUpdatedDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+sourceViewColumnId,""+sourceViewId,""+insertedRowDate,""+lastUpdatedDate,""+guid,""+columnName,""+columnType,""+sourceView_sourceViewId,""+sourceView_guid,""+sourceView_sourceInstanceId,""+sourceView_sourceViewTypeId,""+sourceView_sourceViewName,""+sourceView_sourceViewDefinition,""+sourceView_insertedRowDate,""+sourceView_lastUpdatedDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "sourceViewColumnId" => sourceViewColumnId
      case "sourceViewId" => sourceViewId
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case "guid" => guid
      case "columnName" => columnName
      case "columnType" => columnType
      case "sourceView_sourceViewId" => sourceView_sourceViewId
      case "sourceView_guid" => sourceView_guid
      case "sourceView_sourceInstanceId" => sourceView_sourceInstanceId
      case "sourceView_sourceViewTypeId" => sourceView_sourceViewTypeId
      case "sourceView_sourceViewName" => sourceView_sourceViewName
      case "sourceView_sourceViewDefinition" => sourceView_sourceViewDefinition
      case "sourceView_insertedRowDate" => sourceView_insertedRowDate
      case "sourceView_lastUpdatedDate" => sourceView_lastUpdatedDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "sourceViewColumnId" => "Long"
      case "sourceViewId" => "Long"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case "guid" => "Long"
      case "columnName" => "String"
      case "columnType" => "String"
      case "sourceView_sourceViewId" => "Long"
      case "sourceView_guid" => "Long"
      case "sourceView_sourceInstanceId" => "Long"
      case "sourceView_sourceViewTypeId" => "Long"
      case "sourceView_sourceViewName" => "String"
      case "sourceView_sourceViewDefinition" => "String"
      case "sourceView_insertedRowDate" => "java.util.Date"
      case "sourceView_lastUpdatedDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
}
object VSourceViewColumnDto {
  val TABLE_NAME = "vSourceViewColumn";
  val FIELD_sourceViewColumnId = "sourceViewColumnId";
  val FIELD_sourceViewId = "sourceViewId";
  val FIELD_insertedRowDate = "insertedRowDate";
  val FIELD_lastUpdatedDate = "lastUpdatedDate";
  val FIELD_guid = "guid";
  val FIELD_columnName = "columnName";
  val FIELD_columnType = "columnType";
  val FIELD_sourceView_sourceViewId = "sourceView_sourceViewId";
  val FIELD_sourceView_guid = "sourceView_guid";
  val FIELD_sourceView_sourceInstanceId = "sourceView_sourceInstanceId";
  val FIELD_sourceView_sourceViewTypeId = "sourceView_sourceViewTypeId";
  val FIELD_sourceView_sourceViewName = "sourceView_sourceViewName";
  val FIELD_sourceView_sourceViewDefinition = "sourceView_sourceViewDefinition";
  val FIELD_sourceView_insertedRowDate = "sourceView_insertedRowDate";
  val FIELD_sourceView_lastUpdatedDate = "sourceView_lastUpdatedDate";

}