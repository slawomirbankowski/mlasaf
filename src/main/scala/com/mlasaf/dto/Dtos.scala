package com.mlasaf.dto

import com.lucidchart.relate._

case class AlgorithmColumnTypeDto ( val algorithmColumnTypeId : Long, val algorithmColumnTypeName : String, val algorithmColumnTypeDescription : String, val insertedRowDate : java.util.Date, val lastUpdatedDate : java.util.Date, val guid : Long ) extends BaseDto {
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
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
    val stat = connection.prepareStatement("insert into algorithmColumnType(algorithmColumnTypeId,algorithmColumnTypeName,algorithmColumnTypeDescription,insertedRowDate,lastUpdatedDate,guid) values (?,?,?,?,?,?)");
    stat.setObject(1, algorithmColumnTypeId);
    stat.setObject(2, algorithmColumnTypeName);
    stat.setObject(3, algorithmColumnTypeDescription);
    stat.setObject(4, insertedRowDate);
    stat.setObject(5, lastUpdatedDate);
    stat.setObject(6, guid);
    return stat;
  }
}
case class AlgorithmImplementationDto ( val algorithmImplementationId : Long, val guid : Long, val insertedRowDate : java.util.Date, val lastUpdatedDate : java.util.Date, val algorithmTypeVersionId : Long, val executorTypeId : Long, val algorithmImplementationName : String, val algorithmImplementationClass : String ) extends BaseDto {
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
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
    val stat = connection.prepareStatement("insert into algorithmImplementation(algorithmImplementationId,guid,insertedRowDate,lastUpdatedDate,algorithmTypeVersionId,executorTypeId,algorithmImplementationName,algorithmImplementationClass) values (?,?,?,?,?,?,?,?)");
    stat.setObject(1, algorithmImplementationId);
    stat.setObject(2, guid);
    stat.setObject(3, insertedRowDate);
    stat.setObject(4, lastUpdatedDate);
    stat.setObject(5, algorithmTypeVersionId);
    stat.setObject(6, executorTypeId);
    stat.setObject(7, algorithmImplementationName);
    stat.setObject(8, algorithmImplementationClass);
    return stat;
  }
}
case class AlgorithmOutputDto ( val algorithmOutputId : Long, val guid : Long, val insertedRowDate : java.util.Date, val lastUpdatedDate : java.util.Date, val algorithmRunId : Long, val algorithmOutputTypeId : Long, val executorStorageViewId : Long, val outputPath : String ) extends BaseDto {
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
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
    val stat = connection.prepareStatement("insert into algorithmOutput(algorithmOutputId,guid,insertedRowDate,lastUpdatedDate,algorithmRunId,algorithmOutputTypeId,executorStorageViewId,outputPath) values (?,?,?,?,?,?,?,?)");
    stat.setObject(1, algorithmOutputId);
    stat.setObject(2, guid);
    stat.setObject(3, insertedRowDate);
    stat.setObject(4, lastUpdatedDate);
    stat.setObject(5, algorithmRunId);
    stat.setObject(6, algorithmOutputTypeId);
    stat.setObject(7, executorStorageViewId);
    stat.setObject(8, outputPath);
    return stat;
  }
}
case class AlgorithmOutputTypeDto ( val algorithmOutputTypeId : Long, val guid : Long, val algorithmOutputTypeName : String, val insertedRowDate : java.util.Date, val lastUpdatedDate : java.util.Date ) extends BaseDto {
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
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
    val stat = connection.prepareStatement("insert into algorithmOutputType(algorithmOutputTypeId,guid,algorithmOutputTypeName,insertedRowDate,lastUpdatedDate) values (?,?,?,?,?)");
    stat.setObject(1, algorithmOutputTypeId);
    stat.setObject(2, guid);
    stat.setObject(3, algorithmOutputTypeName);
    stat.setObject(4, insertedRowDate);
    stat.setObject(5, lastUpdatedDate);
    return stat;
  }
}
case class AlgorithmParamDto ( val algorithmParamId : Long, val guid : Long, val insertedRowDate : java.util.Date, val lastUpdatedDate : java.util.Date, val algorithmParamName : String, val algorithmParamDescription : String, val algorithmParamType : String ) extends BaseDto {
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
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
    val stat = connection.prepareStatement("insert into algorithmParam(algorithmParamId,guid,insertedRowDate,lastUpdatedDate,algorithmParamName,algorithmParamDescription,algorithmParamType) values (?,?,?,?,?,?,?)");
    stat.setObject(1, algorithmParamId);
    stat.setObject(2, guid);
    stat.setObject(3, insertedRowDate);
    stat.setObject(4, lastUpdatedDate);
    stat.setObject(5, algorithmParamName);
    stat.setObject(6, algorithmParamDescription);
    stat.setObject(7, algorithmParamType);
    return stat;
  }
}
case class AlgorithmParamTypeDto ( val algorithmParamTypeId : Long, val algorithmParamId : Long, val algorithmTypeId : Long, val algorithmTypeVersionId : Long, val insertedRowDate : java.util.Date, val lastUpdatedDate : java.util.Date, val guid : Long ) extends BaseDto {
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
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
    val stat = connection.prepareStatement("insert into algorithmParamType(algorithmParamTypeId,algorithmParamId,algorithmTypeId,algorithmTypeVersionId,insertedRowDate,lastUpdatedDate,guid) values (?,?,?,?,?,?,?)");
    stat.setObject(1, algorithmParamTypeId);
    stat.setObject(2, algorithmParamId);
    stat.setObject(3, algorithmTypeId);
    stat.setObject(4, algorithmTypeVersionId);
    stat.setObject(5, insertedRowDate);
    stat.setObject(6, lastUpdatedDate);
    stat.setObject(7, guid);
    return stat;
  }
}
case class AlgorithmRunDto ( val algorithmRunId : Long, val guid : Long, val algorithmScheduleId : Long, val executorInstanceId : Long, val executorStorageId : Long, val algorithmRunName : String, val insertedRowDate : java.util.Date, val lastUpdatedDate : java.util.Date, val runDate : java.util.Date, val isRunning : Int, val isFinished : Int ) extends BaseDto {
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
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
    val stat = connection.prepareStatement("insert into algorithmRun(algorithmRunId,guid,algorithmScheduleId,executorInstanceId,executorStorageId,algorithmRunName,insertedRowDate,lastUpdatedDate,runDate,isRunning,isFinished) values (?,?,?,?,?,?,?,?,?,?,?)");
    stat.setObject(1, algorithmRunId);
    stat.setObject(2, guid);
    stat.setObject(3, algorithmScheduleId);
    stat.setObject(4, executorInstanceId);
    stat.setObject(5, executorStorageId);
    stat.setObject(6, algorithmRunName);
    stat.setObject(7, insertedRowDate);
    stat.setObject(8, lastUpdatedDate);
    stat.setObject(9, runDate);
    stat.setObject(10, isRunning);
    stat.setObject(11, isFinished);
    return stat;
  }
}
case class AlgorithmRunTypeDto ( val algorithmRunTypeId : Long, val guid : Long, val algorithmRunTypeName : String, val insertedRowDate : java.util.Date, val lastUpdatedDate : java.util.Date ) extends BaseDto {
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
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
    val stat = connection.prepareStatement("insert into algorithmRunType(algorithmRunTypeId,guid,algorithmRunTypeName,insertedRowDate,lastUpdatedDate) values (?,?,?,?,?)");
    stat.setObject(1, algorithmRunTypeId);
    stat.setObject(2, guid);
    stat.setObject(3, algorithmRunTypeName);
    stat.setObject(4, insertedRowDate);
    stat.setObject(5, lastUpdatedDate);
    return stat;
  }
}
case class AlgorithmRunViewDto ( val algorithmRunViewId : Long, val guid : Long, val algorithmRunId : Long, val executorStorageViewId : Long, val insertedRowDate : java.util.Date, val lastUpdatedDate : java.util.Date, val isDownloaded : Int ) extends BaseDto {
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
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
    val stat = connection.prepareStatement("insert into algorithmRunView(algorithmRunViewId,guid,algorithmRunId,executorStorageViewId,insertedRowDate,lastUpdatedDate,isDownloaded) values (?,?,?,?,?,?,?)");
    stat.setObject(1, algorithmRunViewId);
    stat.setObject(2, guid);
    stat.setObject(3, algorithmRunId);
    stat.setObject(4, executorStorageViewId);
    stat.setObject(5, insertedRowDate);
    stat.setObject(6, lastUpdatedDate);
    stat.setObject(7, isDownloaded);
    return stat;
  }
}
case class AlgorithmScheduleDto ( val algorithmScheduleId : Long, val guid : Long, val algorithmImplementationId : Long, val algorithmScheduleTypeId : Long, val algorithmScheduleName : String, val isScheduled : Int, val insertedRowDate : java.util.Date, val lastUpdatedDate : java.util.Date ) extends BaseDto {
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
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
    val stat = connection.prepareStatement("insert into algorithmSchedule(algorithmScheduleId,guid,algorithmImplementationId,algorithmScheduleTypeId,algorithmScheduleName,isScheduled,insertedRowDate,lastUpdatedDate) values (?,?,?,?,?,?,?,?)");
    stat.setObject(1, algorithmScheduleId);
    stat.setObject(2, guid);
    stat.setObject(3, algorithmImplementationId);
    stat.setObject(4, algorithmScheduleTypeId);
    stat.setObject(5, algorithmScheduleName);
    stat.setObject(6, isScheduled);
    stat.setObject(7, insertedRowDate);
    stat.setObject(8, lastUpdatedDate);
    return stat;
  }
}
case class AlgorithmScheduleColumnDto ( val algorithmScheduleColumnId : Long, val guid : Long, val algorithmScheduleId : Long, val algorithmColumnTypeId : Long, val algorithmScheduleViewId : Long, val sourceViewId : Long, val sourceViewColumnId : Long, val extendedProperties : String, val insertedRowDate : java.util.Date, val lastUpdatedDate : java.util.Date ) extends BaseDto {
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
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
    val stat = connection.prepareStatement("insert into algorithmScheduleColumn(algorithmScheduleColumnId,guid,algorithmScheduleId,algorithmColumnTypeId,algorithmScheduleViewId,sourceViewId,sourceViewColumnId,extendedProperties,insertedRowDate,lastUpdatedDate) values (?,?,?,?,?,?,?,?,?,?)");
    stat.setObject(1, algorithmScheduleColumnId);
    stat.setObject(2, guid);
    stat.setObject(3, algorithmScheduleId);
    stat.setObject(4, algorithmColumnTypeId);
    stat.setObject(5, algorithmScheduleViewId);
    stat.setObject(6, sourceViewId);
    stat.setObject(7, sourceViewColumnId);
    stat.setObject(8, extendedProperties);
    stat.setObject(9, insertedRowDate);
    stat.setObject(10, lastUpdatedDate);
    return stat;
  }
}
case class AlgorithmScheduleParamDto ( val algorithmScheduleParamId : Long, val guid : Long, val algorithmScheduleId : Long, val algorithmParamId : Long, val algorithmParamValue : String, val insertedRowDate : java.util.Date, val lastUpdatedDate : java.util.Date ) extends BaseDto {
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
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
    val stat = connection.prepareStatement("insert into algorithmScheduleParam(algorithmScheduleParamId,guid,algorithmScheduleId,algorithmParamId,algorithmParamValue,insertedRowDate,lastUpdatedDate) values (?,?,?,?,?,?,?)");
    stat.setObject(1, algorithmScheduleParamId);
    stat.setObject(2, guid);
    stat.setObject(3, algorithmScheduleId);
    stat.setObject(4, algorithmParamId);
    stat.setObject(5, algorithmParamValue);
    stat.setObject(6, insertedRowDate);
    stat.setObject(7, lastUpdatedDate);
    return stat;
  }
}
case class AlgorithmScheduleTypeDto ( val algorithmScheduleTypeId : Long, val guid : Long, val algorithmScheduleTypeName : String, val insertedRowDate : java.util.Date, val lastUpdatedDate : java.util.Date ) extends BaseDto {
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
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
    val stat = connection.prepareStatement("insert into algorithmScheduleType(algorithmScheduleTypeId,guid,algorithmScheduleTypeName,insertedRowDate,lastUpdatedDate) values (?,?,?,?,?)");
    stat.setObject(1, algorithmScheduleTypeId);
    stat.setObject(2, guid);
    stat.setObject(3, algorithmScheduleTypeName);
    stat.setObject(4, insertedRowDate);
    stat.setObject(5, lastUpdatedDate);
    return stat;
  }
}
case class AlgorithmScheduleViewDto ( val algorithmScheduleViewId : Long, val guid : Long, val algorithmScheduleViewTypeId : Long, val algorithmScheduleId : Long, val sourceViewId : Long, val insertedRowDate : java.util.Date, val lastUpdatedDate : java.util.Date, val joinOnDefinition : String ) extends BaseDto {
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
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
    val stat = connection.prepareStatement("insert into algorithmScheduleView(algorithmScheduleViewId,guid,algorithmScheduleViewTypeId,algorithmScheduleId,sourceViewId,insertedRowDate,lastUpdatedDate,joinOnDefinition) values (?,?,?,?,?,?,?,?)");
    stat.setObject(1, algorithmScheduleViewId);
    stat.setObject(2, guid);
    stat.setObject(3, algorithmScheduleViewTypeId);
    stat.setObject(4, algorithmScheduleId);
    stat.setObject(5, sourceViewId);
    stat.setObject(6, insertedRowDate);
    stat.setObject(7, lastUpdatedDate);
    stat.setObject(8, joinOnDefinition);
    return stat;
  }
}
case class AlgorithmScheduleViewTypeDto ( val algorithmScheduleViewTypeId : Long, val guid : Long, val algorithmScheduleViewTypeName : String, val insertedRowDate : java.util.Date, val lastUpdatedDate : java.util.Date ) extends BaseDto {
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
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
    val stat = connection.prepareStatement("insert into algorithmScheduleViewType(algorithmScheduleViewTypeId,guid,algorithmScheduleViewTypeName,insertedRowDate,lastUpdatedDate) values (?,?,?,?,?)");
    stat.setObject(1, algorithmScheduleViewTypeId);
    stat.setObject(2, guid);
    stat.setObject(3, algorithmScheduleViewTypeName);
    stat.setObject(4, insertedRowDate);
    stat.setObject(5, lastUpdatedDate);
    return stat;
  }
}
case class AlgorithmTypeDto ( val algorithmTypeId : Long, val guid : Long, val algorithmTypeName : String, val algorithmTypeDescription : String, val insertedRowDate : java.util.Date, val lastUpdatedDate : java.util.Date ) extends BaseDto {
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
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
    val stat = connection.prepareStatement("insert into algorithmType(algorithmTypeId,guid,algorithmTypeName,algorithmTypeDescription,insertedRowDate,lastUpdatedDate) values (?,?,?,?,?,?)");
    stat.setObject(1, algorithmTypeId);
    stat.setObject(2, guid);
    stat.setObject(3, algorithmTypeName);
    stat.setObject(4, algorithmTypeDescription);
    stat.setObject(5, insertedRowDate);
    stat.setObject(6, lastUpdatedDate);
    return stat;
  }
}
case class AlgorithmTypeColumnTypeDto ( val algorithmTypeColumnTypeId : Long, val algorithmTypeVersionId : Long, val algorithmColumnTypeId : Long, val allowMultiple : Int, val allowEmpty : Int, val insertedRowDate : java.util.Date, val lastUpdatedDate : java.util.Date, val guid : Long ) extends BaseDto {
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
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
    val stat = connection.prepareStatement("insert into algorithmTypeColumnType(algorithmTypeColumnTypeId,algorithmTypeVersionId,algorithmColumnTypeId,allowMultiple,allowEmpty,insertedRowDate,lastUpdatedDate,guid) values (?,?,?,?,?,?,?,?)");
    stat.setObject(1, algorithmTypeColumnTypeId);
    stat.setObject(2, algorithmTypeVersionId);
    stat.setObject(3, algorithmColumnTypeId);
    stat.setObject(4, allowMultiple);
    stat.setObject(5, allowEmpty);
    stat.setObject(6, insertedRowDate);
    stat.setObject(7, lastUpdatedDate);
    stat.setObject(8, guid);
    return stat;
  }
}
case class AlgorithmTypeOutputTypeDto ( val algorithmTypeOutputTypeId : Long, val guid : Long, val algorithmTypeVersionId : Long, val algorithmOutputTypeId : Long, val isMandatory : Int, val insertedRowDate : java.util.Date, val lastUpdatedDate : java.util.Date ) extends BaseDto {
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
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
    val stat = connection.prepareStatement("insert into algorithmTypeOutputType(algorithmTypeOutputTypeId,guid,algorithmTypeVersionId,algorithmOutputTypeId,isMandatory,insertedRowDate,lastUpdatedDate) values (?,?,?,?,?,?,?)");
    stat.setObject(1, algorithmTypeOutputTypeId);
    stat.setObject(2, guid);
    stat.setObject(3, algorithmTypeVersionId);
    stat.setObject(4, algorithmOutputTypeId);
    stat.setObject(5, isMandatory);
    stat.setObject(6, insertedRowDate);
    stat.setObject(7, lastUpdatedDate);
    return stat;
  }
}
case class AlgorithmTypeVersionDto ( val algorithmTypeVersionId : Long, val guid : Long, val algorithmTypeId : Long, val algorithmTypeVersionName : String, val insertedRowDate : java.util.Date, val lastUpdatedDate : java.util.Date ) extends BaseDto {
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
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
    val stat = connection.prepareStatement("insert into algorithmTypeVersion(algorithmTypeVersionId,guid,algorithmTypeId,algorithmTypeVersionName,insertedRowDate,lastUpdatedDate) values (?,?,?,?,?,?)");
    stat.setObject(1, algorithmTypeVersionId);
    stat.setObject(2, guid);
    stat.setObject(3, algorithmTypeId);
    stat.setObject(4, algorithmTypeVersionName);
    stat.setObject(5, insertedRowDate);
    stat.setObject(6, lastUpdatedDate);
    return stat;
  }
}
case class ExecutorHostDto ( val executorHostId : Long, val guid : Long, val insertedRowDate : java.util.Date, val lastUpdatedDate : java.util.Date, val hostName : String, val hostIp : String, val hostDomain : String, val hostOsType : String, val hostOsVersion : String, val isWorking : Int ) extends BaseDto {
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
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
    val stat = connection.prepareStatement("insert into executorHost(executorHostId,guid,insertedRowDate,lastUpdatedDate,hostName,hostIp,hostDomain,hostOsType,hostOsVersion,isWorking) values (?,?,?,?,?,?,?,?,?,?)");
    stat.setObject(1, executorHostId);
    stat.setObject(2, guid);
    stat.setObject(3, insertedRowDate);
    stat.setObject(4, lastUpdatedDate);
    stat.setObject(5, hostName);
    stat.setObject(6, hostIp);
    stat.setObject(7, hostDomain);
    stat.setObject(8, hostOsType);
    stat.setObject(9, hostOsVersion);
    stat.setObject(10, isWorking);
    return stat;
  }
}
case class ExecutorInstanceDto ( val executorInstanceId : Long, val guid : Long, val executorTypeId : Long, val executorHostId : Long, val executorInstanceName : String, val isRunning : Int, val isFinished : Int, val portNumber : Int, val insertedRowDate : java.util.Date, val lastUpdatedDate : java.util.Date, val endDate : java.util.Date ) extends BaseDto {
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
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
    val stat = connection.prepareStatement("insert into executorInstance(executorInstanceId,guid,executorTypeId,executorHostId,executorInstanceName,isRunning,isFinished,portNumber,insertedRowDate,lastUpdatedDate,endDate) values (?,?,?,?,?,?,?,?,?,?,?)");
    stat.setObject(1, executorInstanceId);
    stat.setObject(2, guid);
    stat.setObject(3, executorTypeId);
    stat.setObject(4, executorHostId);
    stat.setObject(5, executorInstanceName);
    stat.setObject(6, isRunning);
    stat.setObject(7, isFinished);
    stat.setObject(8, portNumber);
    stat.setObject(9, insertedRowDate);
    stat.setObject(10, lastUpdatedDate);
    stat.setObject(11, endDate);
    return stat;
  }
}
case class ExecutorRestDto ( val executorRestId : Long, val guid : Long, val executorHostId : Long, val insertedRowDate : java.util.Date, val lastUpdatedDate : java.util.Date, val restPort : Int, val restVersion : String, val restStatus : String ) extends BaseDto {
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
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
    val stat = connection.prepareStatement("insert into executorRest(executorRestId,guid,executorHostId,insertedRowDate,lastUpdatedDate,restPort,restVersion,restStatus) values (?,?,?,?,?,?,?,?)");
    stat.setObject(1, executorRestId);
    stat.setObject(2, guid);
    stat.setObject(3, executorHostId);
    stat.setObject(4, insertedRowDate);
    stat.setObject(5, lastUpdatedDate);
    stat.setObject(6, restPort);
    stat.setObject(7, restVersion);
    stat.setObject(8, restStatus);
    return stat;
  }
}
case class ExecutorRestCallDto ( val executorRestCallId : Long, val guid : Long, val insertedRowDate : java.util.Date, val lastUpdatedDate : java.util.Date, val executorHostId : Long, val executorRestId : Long, val requestMethod : String, val requestHeader : String, val requestBody : String, val responseBody : String ) extends BaseDto {
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
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
    val stat = connection.prepareStatement("insert into executorRestCall(executorRestCallId,guid,insertedRowDate,lastUpdatedDate,executorHostId,executorRestId,requestMethod,requestHeader,requestBody,responseBody) values (?,?,?,?,?,?,?,?,?,?)");
    stat.setObject(1, executorRestCallId);
    stat.setObject(2, guid);
    stat.setObject(3, insertedRowDate);
    stat.setObject(4, lastUpdatedDate);
    stat.setObject(5, executorHostId);
    stat.setObject(6, executorRestId);
    stat.setObject(7, requestMethod);
    stat.setObject(8, requestHeader);
    stat.setObject(9, requestBody);
    stat.setObject(10, responseBody);
    return stat;
  }
}
case class ExecutorStorageDto ( val executorStorageId : Long, val guid : Long, val executorHostId : Long, val executorStorageTypeId : Long, val storageDefinition : String, val storageBasePath : String, val storageFulllPath : String, val isRunning : Int, val portNumber : Int, val insertedRowDate : java.util.Date, val lastUpdatedDate : java.util.Date ) extends BaseDto {
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
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
    val stat = connection.prepareStatement("insert into executorStorage(executorStorageId,guid,executorHostId,executorStorageTypeId,storageDefinition,storageBasePath,storageFulllPath,isRunning,portNumber,insertedRowDate,lastUpdatedDate) values (?,?,?,?,?,?,?,?,?,?,?)");
    stat.setObject(1, executorStorageId);
    stat.setObject(2, guid);
    stat.setObject(3, executorHostId);
    stat.setObject(4, executorStorageTypeId);
    stat.setObject(5, storageDefinition);
    stat.setObject(6, storageBasePath);
    stat.setObject(7, storageFulllPath);
    stat.setObject(8, isRunning);
    stat.setObject(9, portNumber);
    stat.setObject(10, insertedRowDate);
    stat.setObject(11, lastUpdatedDate);
    return stat;
  }
}
case class ExecutorStorageSnapshotDto ( val executorStorageSnapshotId : Long, val executorInstanceId : Long, val insertedRowDate : java.util.Date ) extends BaseDto {
  def tableName : String = {
    "executorStorageSnapshot";
  }
  def fields : String = {
    "executorStorageSnapshotId,executorInstanceId,insertedRowDate";
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
  }
  def toAnyArray() : Array[Any] = {
    Array(executorStorageSnapshotId,executorInstanceId,insertedRowDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+executorStorageSnapshotId,""+executorInstanceId,""+insertedRowDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "executorStorageSnapshotId" => executorStorageSnapshotId
      case "executorInstanceId" => executorInstanceId
      case "insertedRowDate" => insertedRowDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "executorStorageSnapshotId" => "Long"
      case "executorInstanceId" => "Long"
      case "insertedRowDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into executorStorageSnapshot(executorStorageSnapshotId,executorInstanceId,insertedRowDate) values (?,?,?)");
    stat.setObject(1, executorStorageSnapshotId);
    stat.setObject(2, executorInstanceId);
    stat.setObject(3, insertedRowDate);
    return stat;
  }
}
case class ExecutorStorageTypeDto ( val executorStorageTypeId : Long, val guid : Long, val insertedRowDate : java.util.Date, val lastUpdatedDate : java.util.Date, val executorStorageTypeName : String, val executorStorageTypeClass : String ) extends BaseDto {
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
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
    val stat = connection.prepareStatement("insert into executorStorageType(executorStorageTypeId,guid,insertedRowDate,lastUpdatedDate,executorStorageTypeName,executorStorageTypeClass) values (?,?,?,?,?,?)");
    stat.setObject(1, executorStorageTypeId);
    stat.setObject(2, guid);
    stat.setObject(3, insertedRowDate);
    stat.setObject(4, lastUpdatedDate);
    stat.setObject(5, executorStorageTypeName);
    stat.setObject(6, executorStorageTypeClass);
    return stat;
  }
}
case class ExecutorStorageViewDto ( val executorStorageViewId : Long, val guid : Long, val insertedRowDate : java.util.Date, val lastUpdatedDate : java.util.Date, val executorStorageSnapshotId : Long, val executorStorageId : Long, val sourceDownloadId : Long, val storagePath : String, val viewSize : Long, val viewRowsCount : Long ) extends BaseDto {
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
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
    val stat = connection.prepareStatement("insert into executorStorageView(executorStorageViewId,guid,insertedRowDate,lastUpdatedDate,executorStorageSnapshotId,executorStorageId,sourceDownloadId,storagePath,viewSize,viewRowsCount) values (?,?,?,?,?,?,?,?,?,?)");
    stat.setObject(1, executorStorageViewId);
    stat.setObject(2, guid);
    stat.setObject(3, insertedRowDate);
    stat.setObject(4, lastUpdatedDate);
    stat.setObject(5, executorStorageSnapshotId);
    stat.setObject(6, executorStorageId);
    stat.setObject(7, sourceDownloadId);
    stat.setObject(8, storagePath);
    stat.setObject(9, viewSize);
    stat.setObject(10, viewRowsCount);
    return stat;
  }
}
case class ExecutorTypeDto ( val executorTypeId : Long, val guid : Long, val insertedRowDate : java.util.Date, val lastUpdatedDate : java.util.Date, val executorTypeName : String, val executorTypeClass : String ) extends BaseDto {
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
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
    val stat = connection.prepareStatement("insert into executorType(executorTypeId,guid,insertedRowDate,lastUpdatedDate,executorTypeName,executorTypeClass) values (?,?,?,?,?,?)");
    stat.setObject(1, executorTypeId);
    stat.setObject(2, guid);
    stat.setObject(3, insertedRowDate);
    stat.setObject(4, lastUpdatedDate);
    stat.setObject(5, executorTypeName);
    stat.setObject(6, executorTypeClass);
    return stat;
  }
}
case class ResourceManagerDto ( val resourceManagerId : Long, val guid : Long, val resourceManagerTypeId : Long, val executorHostId : Long, val resourceManagerStatus : String, val insertedRowDate : java.util.Date, val lastUpdatedDate : java.util.Date ) extends BaseDto {
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
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
    val stat = connection.prepareStatement("insert into resourceManager(resourceManagerId,guid,resourceManagerTypeId,executorHostId,resourceManagerStatus,insertedRowDate,lastUpdatedDate) values (?,?,?,?,?,?,?)");
    stat.setObject(1, resourceManagerId);
    stat.setObject(2, guid);
    stat.setObject(3, resourceManagerTypeId);
    stat.setObject(4, executorHostId);
    stat.setObject(5, resourceManagerStatus);
    stat.setObject(6, insertedRowDate);
    stat.setObject(7, lastUpdatedDate);
    return stat;
  }
}
case class ResourceManagerAllocationDto ( val resourceManagerAllocationId : Long, val guid : Long, val insertedRowDate : java.util.Date, val lastUpdatedDate : java.util.Date, val resourceManagerTypeId : Long, val resourceManagerId : Long, val executorHostId : Long, val executorInstanceId : Long, val resourceMeasureId : Long, val allocationValue : Double, val allocationValueMin : Double, val allocationValueMax : Double ) extends BaseDto {
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
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
    val stat = connection.prepareStatement("insert into resourceManagerAllocation(resourceManagerAllocationId,guid,insertedRowDate,lastUpdatedDate,resourceManagerTypeId,resourceManagerId,executorHostId,executorInstanceId,resourceMeasureId,allocationValue,allocationValueMin,allocationValueMax) values (?,?,?,?,?,?,?,?,?,?,?,?)");
    stat.setObject(1, resourceManagerAllocationId);
    stat.setObject(2, guid);
    stat.setObject(3, insertedRowDate);
    stat.setObject(4, lastUpdatedDate);
    stat.setObject(5, resourceManagerTypeId);
    stat.setObject(6, resourceManagerId);
    stat.setObject(7, executorHostId);
    stat.setObject(8, executorInstanceId);
    stat.setObject(9, resourceMeasureId);
    stat.setObject(10, allocationValue);
    stat.setObject(11, allocationValueMin);
    stat.setObject(12, allocationValueMax);
    return stat;
  }
}
case class ResourceManagerCheckDto ( val resourceManagerCheckId : Long, val guid : Long, val resourceManagerId : Long, val executorHostId : Long, val resourceManagerStatus : String, val insertedRowDate : java.util.Date, val lastUpdatedDate : java.util.Date ) extends BaseDto {
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
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
    val stat = connection.prepareStatement("insert into resourceManagerCheck(resourceManagerCheckId,guid,resourceManagerId,executorHostId,resourceManagerStatus,insertedRowDate,lastUpdatedDate) values (?,?,?,?,?,?,?)");
    stat.setObject(1, resourceManagerCheckId);
    stat.setObject(2, guid);
    stat.setObject(3, resourceManagerId);
    stat.setObject(4, executorHostId);
    stat.setObject(5, resourceManagerStatus);
    stat.setObject(6, insertedRowDate);
    stat.setObject(7, lastUpdatedDate);
    return stat;
  }
}
case class ResourceManagerMeasureDto ( val resourceManagerMeasureId : Long, val guid : Long, val resourceManagerId : Long, val resourceMeasureId : Long, val measureString : String, val measureValue : Double, val insertedRowDate : java.util.Date, val lastUpdatedDate : java.util.Date ) extends BaseDto {
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
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
    val stat = connection.prepareStatement("insert into resourceManagerMeasure(resourceManagerMeasureId,guid,resourceManagerId,resourceMeasureId,measureString,measureValue,insertedRowDate,lastUpdatedDate) values (?,?,?,?,?,?,?,?)");
    stat.setObject(1, resourceManagerMeasureId);
    stat.setObject(2, guid);
    stat.setObject(3, resourceManagerId);
    stat.setObject(4, resourceMeasureId);
    stat.setObject(5, measureString);
    stat.setObject(6, measureValue);
    stat.setObject(7, insertedRowDate);
    stat.setObject(8, lastUpdatedDate);
    return stat;
  }
}
case class ResourceManagerTypeDto ( val resourceManagerTypeId : Long, val guid : Long, val resourceManagerTypeName : String, val resourceManagerTypeClass : String, val insertedRowDate : java.util.Date, val lastUpdatedDate : java.util.Date ) extends BaseDto {
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
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
    val stat = connection.prepareStatement("insert into resourceManagerType(resourceManagerTypeId,guid,resourceManagerTypeName,resourceManagerTypeClass,insertedRowDate,lastUpdatedDate) values (?,?,?,?,?,?)");
    stat.setObject(1, resourceManagerTypeId);
    stat.setObject(2, guid);
    stat.setObject(3, resourceManagerTypeName);
    stat.setObject(4, resourceManagerTypeClass);
    stat.setObject(5, insertedRowDate);
    stat.setObject(6, lastUpdatedDate);
    return stat;
  }
}
case class ResourceMeasureDto ( val resourceMeasureId : Long, val guid : Long, val resourceMeasureName : String, val insertedRowDate : java.util.Date, val lastUpdatedDate : java.util.Date ) extends BaseDto {
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
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
    val stat = connection.prepareStatement("insert into resourceMeasure(resourceMeasureId,guid,resourceMeasureName,insertedRowDate,lastUpdatedDate) values (?,?,?,?,?)");
    stat.setObject(1, resourceMeasureId);
    stat.setObject(2, guid);
    stat.setObject(3, resourceMeasureName);
    stat.setObject(4, insertedRowDate);
    stat.setObject(5, lastUpdatedDate);
    return stat;
  }
}
case class SourceDownloadDto ( val sourceDownloadId : Long, val sourceScheduleId : Long, val insertedRowDate : java.util.Date, val lastUpdatedDate : java.util.Date, val retryNumber : Int, val isRunning : Int, val isFinished : Int, val isExcecption : Int, val excecptionDescription : String ) extends BaseDto {
  def tableName : String = {
    "sourceDownload";
  }
  def fields : String = {
    "sourceDownloadId,sourceScheduleId,insertedRowDate,lastUpdatedDate,retryNumber,isRunning,isFinished,isExcecption,excecptionDescription";
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
  }
  def toAnyArray() : Array[Any] = {
    Array(sourceDownloadId,sourceScheduleId,insertedRowDate,lastUpdatedDate,retryNumber,isRunning,isFinished,isExcecption,excecptionDescription)
  }
  def toStringArray() : Array[String] = {
    Array(""+sourceDownloadId,""+sourceScheduleId,""+insertedRowDate,""+lastUpdatedDate,""+retryNumber,""+isRunning,""+isFinished,""+isExcecption,""+excecptionDescription)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "sourceDownloadId" => sourceDownloadId
      case "sourceScheduleId" => sourceScheduleId
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
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
    val stat = connection.prepareStatement("insert into sourceDownload(sourceDownloadId,sourceScheduleId,insertedRowDate,lastUpdatedDate,retryNumber,isRunning,isFinished,isExcecption,excecptionDescription) values (?,?,?,?,?,?,?,?,?)");
    stat.setObject(1, sourceDownloadId);
    stat.setObject(2, sourceScheduleId);
    stat.setObject(3, insertedRowDate);
    stat.setObject(4, lastUpdatedDate);
    stat.setObject(5, retryNumber);
    stat.setObject(6, isRunning);
    stat.setObject(7, isFinished);
    stat.setObject(8, isExcecption);
    stat.setObject(9, excecptionDescription);
    return stat;
  }
}
case class SourceDownloadStatDto ( val sourceDownloadStatId : Long, val guid : Long, val sourceDownloadId : Long, val insertedRowDate : java.util.Date, val lastUpdatedDate : java.util.Date, val rowsCount : Long, val errorRowsCount : Long, val totalBytesCount : Long, val empryRowsCount : Long ) extends BaseDto {
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
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
    val stat = connection.prepareStatement("insert into sourceDownloadStat(sourceDownloadStatId,guid,sourceDownloadId,insertedRowDate,lastUpdatedDate,rowsCount,errorRowsCount,totalBytesCount,empryRowsCount) values (?,?,?,?,?,?,?,?,?)");
    stat.setObject(1, sourceDownloadStatId);
    stat.setObject(2, guid);
    stat.setObject(3, sourceDownloadId);
    stat.setObject(4, insertedRowDate);
    stat.setObject(5, lastUpdatedDate);
    stat.setObject(6, rowsCount);
    stat.setObject(7, errorRowsCount);
    stat.setObject(8, totalBytesCount);
    stat.setObject(9, empryRowsCount);
    return stat;
  }
}
case class SourceDownloadStatColumnDto ( val sourceDownloadStatColumnId : Long, val guid : Long, val sourceDownloadId : Long, val sourceViewColumnId : Long, val insertedRowDate : java.util.Date, val lastUpdatedDate : java.util.Date, val columnMinNumber : Double, val columnMaxNumber : Double, val columnMinStr : String, val columnMaxStr : String, val columnNonemptyCount : Long ) extends BaseDto {
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
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
    val stat = connection.prepareStatement("insert into sourceDownloadStatColumn(sourceDownloadStatColumnId,guid,sourceDownloadId,sourceViewColumnId,insertedRowDate,lastUpdatedDate,columnMinNumber,columnMaxNumber,columnMinStr,columnMaxStr,columnNonemptyCount) values (?,?,?,?,?,?,?,?,?,?,?)");
    stat.setObject(1, sourceDownloadStatColumnId);
    stat.setObject(2, guid);
    stat.setObject(3, sourceDownloadId);
    stat.setObject(4, sourceViewColumnId);
    stat.setObject(5, insertedRowDate);
    stat.setObject(6, lastUpdatedDate);
    stat.setObject(7, columnMinNumber);
    stat.setObject(8, columnMaxNumber);
    stat.setObject(9, columnMinStr);
    stat.setObject(10, columnMaxStr);
    stat.setObject(11, columnNonemptyCount);
    return stat;
  }
}
case class SourceInstanceDto ( val sourceInstanceId : Long, val guid : Long, val sourceTypeId : Long, val sourceInstanceName : String, val errorCount : Long, val correctCount : Long, val lastStatus : String, val lastConnectionDate : java.util.Date, val insertedRowDate : java.util.Date, val lastUpdatedDate : java.util.Date ) extends BaseDto {
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
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
    val stat = connection.prepareStatement("insert into sourceInstance(sourceInstanceId,guid,sourceTypeId,sourceInstanceName,errorCount,correctCount,lastStatus,lastConnectionDate,insertedRowDate,lastUpdatedDate) values (?,?,?,?,?,?,?,?,?,?)");
    stat.setObject(1, sourceInstanceId);
    stat.setObject(2, guid);
    stat.setObject(3, sourceTypeId);
    stat.setObject(4, sourceInstanceName);
    stat.setObject(5, errorCount);
    stat.setObject(6, correctCount);
    stat.setObject(7, lastStatus);
    stat.setObject(8, lastConnectionDate);
    stat.setObject(9, insertedRowDate);
    stat.setObject(10, lastUpdatedDate);
    return stat;
  }
}
case class SourceParamDto ( val sourceParamId : Long, val guid : Long, val sourceParamName : String, val sourceParamType : String, val possibleValues : String, val insertedRowDate : java.util.Date, val lastUpdatedDate : java.util.Date ) extends BaseDto {
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
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
    val stat = connection.prepareStatement("insert into sourceParam(sourceParamId,guid,sourceParamName,sourceParamType,possibleValues,insertedRowDate,lastUpdatedDate) values (?,?,?,?,?,?,?)");
    stat.setObject(1, sourceParamId);
    stat.setObject(2, guid);
    stat.setObject(3, sourceParamName);
    stat.setObject(4, sourceParamType);
    stat.setObject(5, possibleValues);
    stat.setObject(6, insertedRowDate);
    stat.setObject(7, lastUpdatedDate);
    return stat;
  }
}
case class SourceParamValueDto ( val sourceParamValueId : Long, val sourceInstanceId : Long, val sourceParamId : Long, val sourceParamValueVersion : String, val guid : Long, val insertedRowDate : java.util.Date, val lastUpdatedDate : java.util.Date, val paramValue : String ) extends BaseDto {
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
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
    val stat = connection.prepareStatement("insert into sourceParamValue(sourceParamValueId,sourceInstanceId,sourceParamId,sourceParamValueVersion,guid,insertedRowDate,lastUpdatedDate,paramValue) values (?,?,?,?,?,?,?,?)");
    stat.setObject(1, sourceParamValueId);
    stat.setObject(2, sourceInstanceId);
    stat.setObject(3, sourceParamId);
    stat.setObject(4, sourceParamValueVersion);
    stat.setObject(5, guid);
    stat.setObject(6, insertedRowDate);
    stat.setObject(7, lastUpdatedDate);
    stat.setObject(8, paramValue);
    return stat;
  }
}
case class SourceScheduleDto ( val sourceScheduleId : Long, val sourceViewId : Long, val executorStorageId : Long, val insertedRowDate : java.util.Date, val lastUpdatedDate : java.util.Date, val guid : Long, val onDemand : Int, val startTime : java.util.Date, val intervalValue : Long ) extends BaseDto {
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
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
    val stat = connection.prepareStatement("insert into sourceSchedule(sourceScheduleId,sourceViewId,executorStorageId,insertedRowDate,lastUpdatedDate,guid,onDemand,startTime,intervalValue) values (?,?,?,?,?,?,?,?,?)");
    stat.setObject(1, sourceScheduleId);
    stat.setObject(2, sourceViewId);
    stat.setObject(3, executorStorageId);
    stat.setObject(4, insertedRowDate);
    stat.setObject(5, lastUpdatedDate);
    stat.setObject(6, guid);
    stat.setObject(7, onDemand);
    stat.setObject(8, startTime);
    stat.setObject(9, intervalValue);
    return stat;
  }
}
case class SourceTypeDto ( val sourceTypeId : Long, val guid : Long, val sourceTypeName : String, val sourceTypeClass : String, val insertedRowDate : java.util.Date, val lastUpdatedDate : java.util.Date ) extends BaseDto {
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
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
    val stat = connection.prepareStatement("insert into sourceType(sourceTypeId,guid,sourceTypeName,sourceTypeClass,insertedRowDate,lastUpdatedDate) values (?,?,?,?,?,?)");
    stat.setObject(1, sourceTypeId);
    stat.setObject(2, guid);
    stat.setObject(3, sourceTypeName);
    stat.setObject(4, sourceTypeClass);
    stat.setObject(5, insertedRowDate);
    stat.setObject(6, lastUpdatedDate);
    return stat;
  }
}
case class SourceTypeParamDto ( val sourceTypeParamId : Long, val sourceTypeId : Long, val sourceParamId : Long, val isRequired : Int, val guid : Long, val insertedRowDate : java.util.Date, val lastUpdatedDate : java.util.Date ) extends BaseDto {
  def tableName : String = {
    "sourceTypeParam";
  }
  def fields : String = {
    "sourceTypeParamId,sourceTypeId,sourceParamId,isRequired,guid,insertedRowDate,lastUpdatedDate";
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
  }
  def toAnyArray() : Array[Any] = {
    Array(sourceTypeParamId,sourceTypeId,sourceParamId,isRequired,guid,insertedRowDate,lastUpdatedDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+sourceTypeParamId,""+sourceTypeId,""+sourceParamId,""+isRequired,""+guid,""+insertedRowDate,""+lastUpdatedDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "sourceTypeParamId" => sourceTypeParamId
      case "sourceTypeId" => sourceTypeId
      case "sourceParamId" => sourceParamId
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
      case "isRequired" => "Int"
      case "guid" => "Long"
      case "insertedRowDate" => "java.util.Date"
      case "lastUpdatedDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into sourceTypeParam(sourceTypeParamId,sourceTypeId,sourceParamId,isRequired,guid,insertedRowDate,lastUpdatedDate) values (?,?,?,?,?,?,?)");
    stat.setObject(1, sourceTypeParamId);
    stat.setObject(2, sourceTypeId);
    stat.setObject(3, sourceParamId);
    stat.setObject(4, isRequired);
    stat.setObject(5, guid);
    stat.setObject(6, insertedRowDate);
    stat.setObject(7, lastUpdatedDate);
    return stat;
  }
}
case class SourceViewDto ( val sourceViewId : Long, val guid : Long, val sourceInstanceId : Long, val sourceViewTypeId : Long, val sourceViewName : String, val sourceViewDefinition : String, val insertedRowDate : java.util.Date, val lastUpdatedDate : java.util.Date ) extends BaseDto {
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
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
    val stat = connection.prepareStatement("insert into sourceView(sourceViewId,guid,sourceInstanceId,sourceViewTypeId,sourceViewName,sourceViewDefinition,insertedRowDate,lastUpdatedDate) values (?,?,?,?,?,?,?,?)");
    stat.setObject(1, sourceViewId);
    stat.setObject(2, guid);
    stat.setObject(3, sourceInstanceId);
    stat.setObject(4, sourceViewTypeId);
    stat.setObject(5, sourceViewName);
    stat.setObject(6, sourceViewDefinition);
    stat.setObject(7, insertedRowDate);
    stat.setObject(8, lastUpdatedDate);
    return stat;
  }
}
case class SourceViewColumnDto ( val sourceViewColumnId : Long, val sourceViewId : Long, val insertedRowDate : java.util.Date, val lastUpdatedDate : java.util.Date, val guid : Long, val columnName : String, val columnType : String ) extends BaseDto {
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
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
    val stat = connection.prepareStatement("insert into sourceViewColumn(sourceViewColumnId,sourceViewId,insertedRowDate,lastUpdatedDate,guid,columnName,columnType) values (?,?,?,?,?,?,?)");
    stat.setObject(1, sourceViewColumnId);
    stat.setObject(2, sourceViewId);
    stat.setObject(3, insertedRowDate);
    stat.setObject(4, lastUpdatedDate);
    stat.setObject(5, guid);
    stat.setObject(6, columnName);
    stat.setObject(7, columnType);
    return stat;
  }
}
case class SourceViewTypeDto ( val sourceViewTypeId : Long, val guid : Long, val sourceViewTypeName : String, val sourceViewTypeClass : String, val insertedRowDate : java.util.Date, val lastUpdatedDate : java.util.Date ) extends BaseDto {
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
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
    val stat = connection.prepareStatement("insert into sourceViewType(sourceViewTypeId,guid,sourceViewTypeName,sourceViewTypeClass,insertedRowDate,lastUpdatedDate) values (?,?,?,?,?,?)");
    stat.setObject(1, sourceViewTypeId);
    stat.setObject(2, guid);
    stat.setObject(3, sourceViewTypeName);
    stat.setObject(4, sourceViewTypeClass);
    stat.setObject(5, insertedRowDate);
    stat.setObject(6, lastUpdatedDate);
    return stat;
  }
}
case class VAlgorithmImplementationDto ( val algorithmImplementationId : Long, val insertedRowDate : java.util.Date, val algorithmTypeVersionId : Long, val executorTypeId : Long, val algorithmImplementationName : String, val algorithmImplementationClass : String, val algorithmTypeVersion_algorithmTypeVersionId : Long, val algorithmTypeVersion_algorithmTypeId : Long, val algorithmTypeVersion_algorithmTypeVersionName : String, val algorithmTypeVersion_insertedRowDate : java.util.Date, val executorType_executorTypeId : Long, val executorType_insertedRowDate : java.util.Date, val executorType_executorTypeName : String, val executorType_executorTypeClass : String ) extends BaseReadOnlyDto {
  def tableName : String = {
    "vAlgorithmImplementation";
  }
  def fields : String = {
    "algorithmImplementationId,insertedRowDate,algorithmTypeVersionId,executorTypeId,algorithmImplementationName,algorithmImplementationClass,algorithmTypeVersion_algorithmTypeVersionId,algorithmTypeVersion_algorithmTypeId,algorithmTypeVersion_algorithmTypeVersionName,algorithmTypeVersion_insertedRowDate,executorType_executorTypeId,executorType_insertedRowDate,executorType_executorTypeName,executorType_executorTypeClass";
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
  }
  def toAnyArray() : Array[Any] = {
    Array(algorithmImplementationId,insertedRowDate,algorithmTypeVersionId,executorTypeId,algorithmImplementationName,algorithmImplementationClass,algorithmTypeVersion_algorithmTypeVersionId,algorithmTypeVersion_algorithmTypeId,algorithmTypeVersion_algorithmTypeVersionName,algorithmTypeVersion_insertedRowDate,executorType_executorTypeId,executorType_insertedRowDate,executorType_executorTypeName,executorType_executorTypeClass)
  }
  def toStringArray() : Array[String] = {
    Array(""+algorithmImplementationId,""+insertedRowDate,""+algorithmTypeVersionId,""+executorTypeId,""+algorithmImplementationName,""+algorithmImplementationClass,""+algorithmTypeVersion_algorithmTypeVersionId,""+algorithmTypeVersion_algorithmTypeId,""+algorithmTypeVersion_algorithmTypeVersionName,""+algorithmTypeVersion_insertedRowDate,""+executorType_executorTypeId,""+executorType_insertedRowDate,""+executorType_executorTypeName,""+executorType_executorTypeClass)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "algorithmImplementationId" => algorithmImplementationId
      case "insertedRowDate" => insertedRowDate
      case "algorithmTypeVersionId" => algorithmTypeVersionId
      case "executorTypeId" => executorTypeId
      case "algorithmImplementationName" => algorithmImplementationName
      case "algorithmImplementationClass" => algorithmImplementationClass
      case "algorithmTypeVersion_algorithmTypeVersionId" => algorithmTypeVersion_algorithmTypeVersionId
      case "algorithmTypeVersion_algorithmTypeId" => algorithmTypeVersion_algorithmTypeId
      case "algorithmTypeVersion_algorithmTypeVersionName" => algorithmTypeVersion_algorithmTypeVersionName
      case "algorithmTypeVersion_insertedRowDate" => algorithmTypeVersion_insertedRowDate
      case "executorType_executorTypeId" => executorType_executorTypeId
      case "executorType_insertedRowDate" => executorType_insertedRowDate
      case "executorType_executorTypeName" => executorType_executorTypeName
      case "executorType_executorTypeClass" => executorType_executorTypeClass
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "algorithmImplementationId" => "Long"
      case "insertedRowDate" => "java.util.Date"
      case "algorithmTypeVersionId" => "Long"
      case "executorTypeId" => "Long"
      case "algorithmImplementationName" => "String"
      case "algorithmImplementationClass" => "String"
      case "algorithmTypeVersion_algorithmTypeVersionId" => "Long"
      case "algorithmTypeVersion_algorithmTypeId" => "Long"
      case "algorithmTypeVersion_algorithmTypeVersionName" => "String"
      case "algorithmTypeVersion_insertedRowDate" => "java.util.Date"
      case "executorType_executorTypeId" => "Long"
      case "executorType_insertedRowDate" => "java.util.Date"
      case "executorType_executorTypeName" => "String"
      case "executorType_executorTypeClass" => "String"
      case _ => "Object"
    }
    ret
  }
}
case class VAlgorithmParamTypeDto ( val algorithmParamId : Long, val algorithmTypeId : Long, val algorithmTypeVersionId : Long, val insertedRowDate : java.util.Date, val algorithmParam_algorithmParamId : Long, val algorithmParam_insertedRowDate : java.util.Date, val algorithmParam_algorithmParamName : String, val algorithmParam_algorithmParamDescription : String, val algorithmParam_algorithmParamType : String, val algorithmType_algorithmTypeId : Long, val algorithmType_algorithmTypeName : String, val algorithmType_algorithmTypeDescription : String, val algorithmType_insertedRowDate : java.util.Date, val algorithmTypeVersion_algorithmTypeVersionId : Long, val algorithmTypeVersion_algorithmTypeId : Long, val algorithmTypeVersion_algorithmTypeVersionName : String, val algorithmTypeVersion_insertedRowDate : java.util.Date ) extends BaseReadOnlyDto {
  def tableName : String = {
    "vAlgorithmParamType";
  }
  def fields : String = {
    "algorithmParamId,algorithmTypeId,algorithmTypeVersionId,insertedRowDate,algorithmParam_algorithmParamId,algorithmParam_insertedRowDate,algorithmParam_algorithmParamName,algorithmParam_algorithmParamDescription,algorithmParam_algorithmParamType,algorithmType_algorithmTypeId,algorithmType_algorithmTypeName,algorithmType_algorithmTypeDescription,algorithmType_insertedRowDate,algorithmTypeVersion_algorithmTypeVersionId,algorithmTypeVersion_algorithmTypeId,algorithmTypeVersion_algorithmTypeVersionName,algorithmTypeVersion_insertedRowDate";
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
  }
  def toAnyArray() : Array[Any] = {
    Array(algorithmParamId,algorithmTypeId,algorithmTypeVersionId,insertedRowDate,algorithmParam_algorithmParamId,algorithmParam_insertedRowDate,algorithmParam_algorithmParamName,algorithmParam_algorithmParamDescription,algorithmParam_algorithmParamType,algorithmType_algorithmTypeId,algorithmType_algorithmTypeName,algorithmType_algorithmTypeDescription,algorithmType_insertedRowDate,algorithmTypeVersion_algorithmTypeVersionId,algorithmTypeVersion_algorithmTypeId,algorithmTypeVersion_algorithmTypeVersionName,algorithmTypeVersion_insertedRowDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+algorithmParamId,""+algorithmTypeId,""+algorithmTypeVersionId,""+insertedRowDate,""+algorithmParam_algorithmParamId,""+algorithmParam_insertedRowDate,""+algorithmParam_algorithmParamName,""+algorithmParam_algorithmParamDescription,""+algorithmParam_algorithmParamType,""+algorithmType_algorithmTypeId,""+algorithmType_algorithmTypeName,""+algorithmType_algorithmTypeDescription,""+algorithmType_insertedRowDate,""+algorithmTypeVersion_algorithmTypeVersionId,""+algorithmTypeVersion_algorithmTypeId,""+algorithmTypeVersion_algorithmTypeVersionName,""+algorithmTypeVersion_insertedRowDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "algorithmParamId" => algorithmParamId
      case "algorithmTypeId" => algorithmTypeId
      case "algorithmTypeVersionId" => algorithmTypeVersionId
      case "insertedRowDate" => insertedRowDate
      case "algorithmParam_algorithmParamId" => algorithmParam_algorithmParamId
      case "algorithmParam_insertedRowDate" => algorithmParam_insertedRowDate
      case "algorithmParam_algorithmParamName" => algorithmParam_algorithmParamName
      case "algorithmParam_algorithmParamDescription" => algorithmParam_algorithmParamDescription
      case "algorithmParam_algorithmParamType" => algorithmParam_algorithmParamType
      case "algorithmType_algorithmTypeId" => algorithmType_algorithmTypeId
      case "algorithmType_algorithmTypeName" => algorithmType_algorithmTypeName
      case "algorithmType_algorithmTypeDescription" => algorithmType_algorithmTypeDescription
      case "algorithmType_insertedRowDate" => algorithmType_insertedRowDate
      case "algorithmTypeVersion_algorithmTypeVersionId" => algorithmTypeVersion_algorithmTypeVersionId
      case "algorithmTypeVersion_algorithmTypeId" => algorithmTypeVersion_algorithmTypeId
      case "algorithmTypeVersion_algorithmTypeVersionName" => algorithmTypeVersion_algorithmTypeVersionName
      case "algorithmTypeVersion_insertedRowDate" => algorithmTypeVersion_insertedRowDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "algorithmParamId" => "Long"
      case "algorithmTypeId" => "Long"
      case "algorithmTypeVersionId" => "Long"
      case "insertedRowDate" => "java.util.Date"
      case "algorithmParam_algorithmParamId" => "Long"
      case "algorithmParam_insertedRowDate" => "java.util.Date"
      case "algorithmParam_algorithmParamName" => "String"
      case "algorithmParam_algorithmParamDescription" => "String"
      case "algorithmParam_algorithmParamType" => "String"
      case "algorithmType_algorithmTypeId" => "Long"
      case "algorithmType_algorithmTypeName" => "String"
      case "algorithmType_algorithmTypeDescription" => "String"
      case "algorithmType_insertedRowDate" => "java.util.Date"
      case "algorithmTypeVersion_algorithmTypeVersionId" => "Long"
      case "algorithmTypeVersion_algorithmTypeId" => "Long"
      case "algorithmTypeVersion_algorithmTypeVersionName" => "String"
      case "algorithmTypeVersion_insertedRowDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
}
case class VAlgorithmRunDto ( val algorithmRunId : Long, val algorithmScheduleId : Long, val executorInstanceId : Long, val executorStorageId : Long, val algorithmRunName : String, val insertedRowDate : java.util.Date, val runDate : java.util.Date, val isRunning : Int, val isFinished : Int, val algorithmSchedule_algorithmScheduleId : Long, val algorithmSchedule_algorithmImplementationId : Long, val algorithmSchedule_algorithmScheduleTypeId : Long, val algorithmSchedule_algorithmScheduleName : String, val algorithmSchedule_isScheduled : Int, val algorithmSchedule_insertedRowDate : java.util.Date, val executorInstance_executorInstanceId : Long, val executorInstance_executorTypeId : Long, val executorInstance_executorHostId : Long, val executorInstance_executorInstanceName : String, val executorInstance_isRunning : Int, val executorInstance_isFinished : Int, val executorInstance_portNumber : Int, val executorInstance_insertedRowDate : java.util.Date, val executorInstance_guid : Long, val executorInstance_endDate : java.util.Date, val executorStorage_executorStorageId : Long, val executorStorage_executorHostId : Long, val executorStorage_executorStorageTypeId : Long, val executorStorage_storageDefinition : String, val executorStorage_storageBasePath : String, val executorStorage_storageFulllPath : String, val executorStorage_isRunning : Int, val executorStorage_portNumber : Int, val executorStorage_insertedRowDate : java.util.Date, val executorStorage_guid : Long ) extends BaseReadOnlyDto {
  def tableName : String = {
    "vAlgorithmRun";
  }
  def fields : String = {
    "algorithmRunId,algorithmScheduleId,executorInstanceId,executorStorageId,algorithmRunName,insertedRowDate,runDate,isRunning,isFinished,algorithmSchedule_algorithmScheduleId,algorithmSchedule_algorithmImplementationId,algorithmSchedule_algorithmScheduleTypeId,algorithmSchedule_algorithmScheduleName,algorithmSchedule_isScheduled,algorithmSchedule_insertedRowDate,executorInstance_executorInstanceId,executorInstance_executorTypeId,executorInstance_executorHostId,executorInstance_executorInstanceName,executorInstance_isRunning,executorInstance_isFinished,executorInstance_portNumber,executorInstance_insertedRowDate,executorInstance_guid,executorInstance_endDate,executorStorage_executorStorageId,executorStorage_executorHostId,executorStorage_executorStorageTypeId,executorStorage_storageDefinition,executorStorage_storageBasePath,executorStorage_storageFulllPath,executorStorage_isRunning,executorStorage_portNumber,executorStorage_insertedRowDate,executorStorage_guid";
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
  }
  def toAnyArray() : Array[Any] = {
    Array(algorithmRunId,algorithmScheduleId,executorInstanceId,executorStorageId,algorithmRunName,insertedRowDate,runDate,isRunning,isFinished,algorithmSchedule_algorithmScheduleId,algorithmSchedule_algorithmImplementationId,algorithmSchedule_algorithmScheduleTypeId,algorithmSchedule_algorithmScheduleName,algorithmSchedule_isScheduled,algorithmSchedule_insertedRowDate,executorInstance_executorInstanceId,executorInstance_executorTypeId,executorInstance_executorHostId,executorInstance_executorInstanceName,executorInstance_isRunning,executorInstance_isFinished,executorInstance_portNumber,executorInstance_insertedRowDate,executorInstance_guid,executorInstance_endDate,executorStorage_executorStorageId,executorStorage_executorHostId,executorStorage_executorStorageTypeId,executorStorage_storageDefinition,executorStorage_storageBasePath,executorStorage_storageFulllPath,executorStorage_isRunning,executorStorage_portNumber,executorStorage_insertedRowDate,executorStorage_guid)
  }
  def toStringArray() : Array[String] = {
    Array(""+algorithmRunId,""+algorithmScheduleId,""+executorInstanceId,""+executorStorageId,""+algorithmRunName,""+insertedRowDate,""+runDate,""+isRunning,""+isFinished,""+algorithmSchedule_algorithmScheduleId,""+algorithmSchedule_algorithmImplementationId,""+algorithmSchedule_algorithmScheduleTypeId,""+algorithmSchedule_algorithmScheduleName,""+algorithmSchedule_isScheduled,""+algorithmSchedule_insertedRowDate,""+executorInstance_executorInstanceId,""+executorInstance_executorTypeId,""+executorInstance_executorHostId,""+executorInstance_executorInstanceName,""+executorInstance_isRunning,""+executorInstance_isFinished,""+executorInstance_portNumber,""+executorInstance_insertedRowDate,""+executorInstance_guid,""+executorInstance_endDate,""+executorStorage_executorStorageId,""+executorStorage_executorHostId,""+executorStorage_executorStorageTypeId,""+executorStorage_storageDefinition,""+executorStorage_storageBasePath,""+executorStorage_storageFulllPath,""+executorStorage_isRunning,""+executorStorage_portNumber,""+executorStorage_insertedRowDate,""+executorStorage_guid)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "algorithmRunId" => algorithmRunId
      case "algorithmScheduleId" => algorithmScheduleId
      case "executorInstanceId" => executorInstanceId
      case "executorStorageId" => executorStorageId
      case "algorithmRunName" => algorithmRunName
      case "insertedRowDate" => insertedRowDate
      case "runDate" => runDate
      case "isRunning" => isRunning
      case "isFinished" => isFinished
      case "algorithmSchedule_algorithmScheduleId" => algorithmSchedule_algorithmScheduleId
      case "algorithmSchedule_algorithmImplementationId" => algorithmSchedule_algorithmImplementationId
      case "algorithmSchedule_algorithmScheduleTypeId" => algorithmSchedule_algorithmScheduleTypeId
      case "algorithmSchedule_algorithmScheduleName" => algorithmSchedule_algorithmScheduleName
      case "algorithmSchedule_isScheduled" => algorithmSchedule_isScheduled
      case "algorithmSchedule_insertedRowDate" => algorithmSchedule_insertedRowDate
      case "executorInstance_executorInstanceId" => executorInstance_executorInstanceId
      case "executorInstance_executorTypeId" => executorInstance_executorTypeId
      case "executorInstance_executorHostId" => executorInstance_executorHostId
      case "executorInstance_executorInstanceName" => executorInstance_executorInstanceName
      case "executorInstance_isRunning" => executorInstance_isRunning
      case "executorInstance_isFinished" => executorInstance_isFinished
      case "executorInstance_portNumber" => executorInstance_portNumber
      case "executorInstance_insertedRowDate" => executorInstance_insertedRowDate
      case "executorInstance_guid" => executorInstance_guid
      case "executorInstance_endDate" => executorInstance_endDate
      case "executorStorage_executorStorageId" => executorStorage_executorStorageId
      case "executorStorage_executorHostId" => executorStorage_executorHostId
      case "executorStorage_executorStorageTypeId" => executorStorage_executorStorageTypeId
      case "executorStorage_storageDefinition" => executorStorage_storageDefinition
      case "executorStorage_storageBasePath" => executorStorage_storageBasePath
      case "executorStorage_storageFulllPath" => executorStorage_storageFulllPath
      case "executorStorage_isRunning" => executorStorage_isRunning
      case "executorStorage_portNumber" => executorStorage_portNumber
      case "executorStorage_insertedRowDate" => executorStorage_insertedRowDate
      case "executorStorage_guid" => executorStorage_guid
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "algorithmRunId" => "Long"
      case "algorithmScheduleId" => "Long"
      case "executorInstanceId" => "Long"
      case "executorStorageId" => "Long"
      case "algorithmRunName" => "String"
      case "insertedRowDate" => "java.util.Date"
      case "runDate" => "java.util.Date"
      case "isRunning" => "Int"
      case "isFinished" => "Int"
      case "algorithmSchedule_algorithmScheduleId" => "Long"
      case "algorithmSchedule_algorithmImplementationId" => "Long"
      case "algorithmSchedule_algorithmScheduleTypeId" => "Long"
      case "algorithmSchedule_algorithmScheduleName" => "String"
      case "algorithmSchedule_isScheduled" => "Int"
      case "algorithmSchedule_insertedRowDate" => "java.util.Date"
      case "executorInstance_executorInstanceId" => "Long"
      case "executorInstance_executorTypeId" => "Long"
      case "executorInstance_executorHostId" => "Long"
      case "executorInstance_executorInstanceName" => "String"
      case "executorInstance_isRunning" => "Int"
      case "executorInstance_isFinished" => "Int"
      case "executorInstance_portNumber" => "Int"
      case "executorInstance_insertedRowDate" => "java.util.Date"
      case "executorInstance_guid" => "Long"
      case "executorInstance_endDate" => "java.util.Date"
      case "executorStorage_executorStorageId" => "Long"
      case "executorStorage_executorHostId" => "Long"
      case "executorStorage_executorStorageTypeId" => "Long"
      case "executorStorage_storageDefinition" => "String"
      case "executorStorage_storageBasePath" => "String"
      case "executorStorage_storageFulllPath" => "String"
      case "executorStorage_isRunning" => "Int"
      case "executorStorage_portNumber" => "Int"
      case "executorStorage_insertedRowDate" => "java.util.Date"
      case "executorStorage_guid" => "Long"
      case _ => "Object"
    }
    ret
  }
}
case class VAlgorithmRunViewDto ( val algorithmRunViewId : Long, val algorithmRunId : Long, val executorStorageViewId : Long, val insertedRowDate : java.util.Date, val isDownloaded : Int, val algorithmRun_algorithmRunId : Long, val algorithmRun_algorithmScheduleId : Long, val algorithmRun_executorInstanceId : Long, val algorithmRun_executorStorageId : Long, val algorithmRun_algorithmRunName : String, val algorithmRun_insertedRowDate : java.util.Date, val algorithmRun_runDate : java.util.Date, val algorithmRun_isRunning : Int, val algorithmRun_isFinished : Int, val executorStorageView_executorStorageViewId : Long, val executorStorageView_insertedRowDate : java.util.Date, val executorStorageView_executorStorageSnapshotId : Long, val executorStorageView_executorStorageId : Long, val executorStorageView_sourceDownloadId : Long, val executorStorageView_storagePath : String, val executorStorageView_viewSize : Long, val executorStorageView_viewRowsCount : Long ) extends BaseReadOnlyDto {
  def tableName : String = {
    "vAlgorithmRunView";
  }
  def fields : String = {
    "algorithmRunViewId,algorithmRunId,executorStorageViewId,insertedRowDate,isDownloaded,algorithmRun_algorithmRunId,algorithmRun_algorithmScheduleId,algorithmRun_executorInstanceId,algorithmRun_executorStorageId,algorithmRun_algorithmRunName,algorithmRun_insertedRowDate,algorithmRun_runDate,algorithmRun_isRunning,algorithmRun_isFinished,executorStorageView_executorStorageViewId,executorStorageView_insertedRowDate,executorStorageView_executorStorageSnapshotId,executorStorageView_executorStorageId,executorStorageView_sourceDownloadId,executorStorageView_storagePath,executorStorageView_viewSize,executorStorageView_viewRowsCount";
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
  }
  def toAnyArray() : Array[Any] = {
    Array(algorithmRunViewId,algorithmRunId,executorStorageViewId,insertedRowDate,isDownloaded,algorithmRun_algorithmRunId,algorithmRun_algorithmScheduleId,algorithmRun_executorInstanceId,algorithmRun_executorStorageId,algorithmRun_algorithmRunName,algorithmRun_insertedRowDate,algorithmRun_runDate,algorithmRun_isRunning,algorithmRun_isFinished,executorStorageView_executorStorageViewId,executorStorageView_insertedRowDate,executorStorageView_executorStorageSnapshotId,executorStorageView_executorStorageId,executorStorageView_sourceDownloadId,executorStorageView_storagePath,executorStorageView_viewSize,executorStorageView_viewRowsCount)
  }
  def toStringArray() : Array[String] = {
    Array(""+algorithmRunViewId,""+algorithmRunId,""+executorStorageViewId,""+insertedRowDate,""+isDownloaded,""+algorithmRun_algorithmRunId,""+algorithmRun_algorithmScheduleId,""+algorithmRun_executorInstanceId,""+algorithmRun_executorStorageId,""+algorithmRun_algorithmRunName,""+algorithmRun_insertedRowDate,""+algorithmRun_runDate,""+algorithmRun_isRunning,""+algorithmRun_isFinished,""+executorStorageView_executorStorageViewId,""+executorStorageView_insertedRowDate,""+executorStorageView_executorStorageSnapshotId,""+executorStorageView_executorStorageId,""+executorStorageView_sourceDownloadId,""+executorStorageView_storagePath,""+executorStorageView_viewSize,""+executorStorageView_viewRowsCount)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "algorithmRunViewId" => algorithmRunViewId
      case "algorithmRunId" => algorithmRunId
      case "executorStorageViewId" => executorStorageViewId
      case "insertedRowDate" => insertedRowDate
      case "isDownloaded" => isDownloaded
      case "algorithmRun_algorithmRunId" => algorithmRun_algorithmRunId
      case "algorithmRun_algorithmScheduleId" => algorithmRun_algorithmScheduleId
      case "algorithmRun_executorInstanceId" => algorithmRun_executorInstanceId
      case "algorithmRun_executorStorageId" => algorithmRun_executorStorageId
      case "algorithmRun_algorithmRunName" => algorithmRun_algorithmRunName
      case "algorithmRun_insertedRowDate" => algorithmRun_insertedRowDate
      case "algorithmRun_runDate" => algorithmRun_runDate
      case "algorithmRun_isRunning" => algorithmRun_isRunning
      case "algorithmRun_isFinished" => algorithmRun_isFinished
      case "executorStorageView_executorStorageViewId" => executorStorageView_executorStorageViewId
      case "executorStorageView_insertedRowDate" => executorStorageView_insertedRowDate
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
      case "algorithmRunId" => "Long"
      case "executorStorageViewId" => "Long"
      case "insertedRowDate" => "java.util.Date"
      case "isDownloaded" => "Int"
      case "algorithmRun_algorithmRunId" => "Long"
      case "algorithmRun_algorithmScheduleId" => "Long"
      case "algorithmRun_executorInstanceId" => "Long"
      case "algorithmRun_executorStorageId" => "Long"
      case "algorithmRun_algorithmRunName" => "String"
      case "algorithmRun_insertedRowDate" => "java.util.Date"
      case "algorithmRun_runDate" => "java.util.Date"
      case "algorithmRun_isRunning" => "Int"
      case "algorithmRun_isFinished" => "Int"
      case "executorStorageView_executorStorageViewId" => "Long"
      case "executorStorageView_insertedRowDate" => "java.util.Date"
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
case class VAlgorithmScheduleDto ( val algorithmScheduleId : Long, val algorithmImplementationId : Long, val algorithmScheduleTypeId : Long, val algorithmScheduleName : String, val isScheduled : Int, val insertedRowDate : java.util.Date, val algorithmImplementation_algorithmImplementationId : Long, val algorithmImplementation_insertedRowDate : java.util.Date, val algorithmImplementation_algorithmTypeVersionId : Long, val algorithmImplementation_executorTypeId : Long, val algorithmImplementation_algorithmImplementationName : String, val algorithmImplementation_algorithmImplementationClass : String, val algorithmScheduleType_algorithmScheduleTypeId : Long, val algorithmScheduleType_algorithmScheduleTypeName : String, val algorithmScheduleType_insertedRowDate : java.util.Date ) extends BaseReadOnlyDto {
  def tableName : String = {
    "vAlgorithmSchedule";
  }
  def fields : String = {
    "algorithmScheduleId,algorithmImplementationId,algorithmScheduleTypeId,algorithmScheduleName,isScheduled,insertedRowDate,algorithmImplementation_algorithmImplementationId,algorithmImplementation_insertedRowDate,algorithmImplementation_algorithmTypeVersionId,algorithmImplementation_executorTypeId,algorithmImplementation_algorithmImplementationName,algorithmImplementation_algorithmImplementationClass,algorithmScheduleType_algorithmScheduleTypeId,algorithmScheduleType_algorithmScheduleTypeName,algorithmScheduleType_insertedRowDate";
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
  }
  def toAnyArray() : Array[Any] = {
    Array(algorithmScheduleId,algorithmImplementationId,algorithmScheduleTypeId,algorithmScheduleName,isScheduled,insertedRowDate,algorithmImplementation_algorithmImplementationId,algorithmImplementation_insertedRowDate,algorithmImplementation_algorithmTypeVersionId,algorithmImplementation_executorTypeId,algorithmImplementation_algorithmImplementationName,algorithmImplementation_algorithmImplementationClass,algorithmScheduleType_algorithmScheduleTypeId,algorithmScheduleType_algorithmScheduleTypeName,algorithmScheduleType_insertedRowDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+algorithmScheduleId,""+algorithmImplementationId,""+algorithmScheduleTypeId,""+algorithmScheduleName,""+isScheduled,""+insertedRowDate,""+algorithmImplementation_algorithmImplementationId,""+algorithmImplementation_insertedRowDate,""+algorithmImplementation_algorithmTypeVersionId,""+algorithmImplementation_executorTypeId,""+algorithmImplementation_algorithmImplementationName,""+algorithmImplementation_algorithmImplementationClass,""+algorithmScheduleType_algorithmScheduleTypeId,""+algorithmScheduleType_algorithmScheduleTypeName,""+algorithmScheduleType_insertedRowDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "algorithmScheduleId" => algorithmScheduleId
      case "algorithmImplementationId" => algorithmImplementationId
      case "algorithmScheduleTypeId" => algorithmScheduleTypeId
      case "algorithmScheduleName" => algorithmScheduleName
      case "isScheduled" => isScheduled
      case "insertedRowDate" => insertedRowDate
      case "algorithmImplementation_algorithmImplementationId" => algorithmImplementation_algorithmImplementationId
      case "algorithmImplementation_insertedRowDate" => algorithmImplementation_insertedRowDate
      case "algorithmImplementation_algorithmTypeVersionId" => algorithmImplementation_algorithmTypeVersionId
      case "algorithmImplementation_executorTypeId" => algorithmImplementation_executorTypeId
      case "algorithmImplementation_algorithmImplementationName" => algorithmImplementation_algorithmImplementationName
      case "algorithmImplementation_algorithmImplementationClass" => algorithmImplementation_algorithmImplementationClass
      case "algorithmScheduleType_algorithmScheduleTypeId" => algorithmScheduleType_algorithmScheduleTypeId
      case "algorithmScheduleType_algorithmScheduleTypeName" => algorithmScheduleType_algorithmScheduleTypeName
      case "algorithmScheduleType_insertedRowDate" => algorithmScheduleType_insertedRowDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "algorithmScheduleId" => "Long"
      case "algorithmImplementationId" => "Long"
      case "algorithmScheduleTypeId" => "Long"
      case "algorithmScheduleName" => "String"
      case "isScheduled" => "Int"
      case "insertedRowDate" => "java.util.Date"
      case "algorithmImplementation_algorithmImplementationId" => "Long"
      case "algorithmImplementation_insertedRowDate" => "java.util.Date"
      case "algorithmImplementation_algorithmTypeVersionId" => "Long"
      case "algorithmImplementation_executorTypeId" => "Long"
      case "algorithmImplementation_algorithmImplementationName" => "String"
      case "algorithmImplementation_algorithmImplementationClass" => "String"
      case "algorithmScheduleType_algorithmScheduleTypeId" => "Long"
      case "algorithmScheduleType_algorithmScheduleTypeName" => "String"
      case "algorithmScheduleType_insertedRowDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
}
case class VAlgorithmScheduleColumnDto ( val algorithmScheduleColumnId : Long, val algorithmScheduleId : Long, val algorithmColumnTypeId : Long, val algorithmScheduleViewId : Long, val sourceViewId : Long, val sourceViewColumnId : Long, val extendedProperties : String, val insertedRowDate : java.util.Date, val algorithmColumnType_algorithmColumnTypeId : Long, val algorithmColumnType_algorithmColumnTypeName : String, val algorithmColumnType_algorithmColumnTypeDescription : String, val algorithmColumnType_insertedRowDate : java.util.Date, val algorithmSchedule_algorithmScheduleId : Long, val algorithmSchedule_algorithmImplementationId : Long, val algorithmSchedule_algorithmScheduleTypeId : Long, val algorithmSchedule_algorithmScheduleName : String, val algorithmSchedule_isScheduled : Int, val algorithmSchedule_insertedRowDate : java.util.Date, val algorithmScheduleView_algorithmScheduleViewId : Long, val algorithmScheduleView_algorithmScheduleViewTypeId : Long, val algorithmScheduleView_algorithmScheduleId : Long, val algorithmScheduleView_sourceViewId : Long, val algorithmScheduleView_insertedRowDate : java.util.Date, val algorithmScheduleView_joinOnDefinition : String, val sourceView_sourceViewId : Long, val sourceView_sourceInstanceId : Long, val sourceView_sourceViewTypeId : Long, val sourceView_sourceViewName : String, val sourceView_sourceViewDefinition : String, val sourceView_insertedRowDate : java.util.Date, val sourceViewColumn_sourceViewColumnId : Long, val sourceViewColumn_sourceViewId : Long, val sourceViewColumn_insertedRowDate : java.util.Date, val sourceViewColumn_guid : Long, val sourceViewColumn_columnName : String, val sourceViewColumn_columnType : String ) extends BaseReadOnlyDto {
  def tableName : String = {
    "vAlgorithmScheduleColumn";
  }
  def fields : String = {
    "algorithmScheduleColumnId,algorithmScheduleId,algorithmColumnTypeId,algorithmScheduleViewId,sourceViewId,sourceViewColumnId,extendedProperties,insertedRowDate,algorithmColumnType_algorithmColumnTypeId,algorithmColumnType_algorithmColumnTypeName,algorithmColumnType_algorithmColumnTypeDescription,algorithmColumnType_insertedRowDate,algorithmSchedule_algorithmScheduleId,algorithmSchedule_algorithmImplementationId,algorithmSchedule_algorithmScheduleTypeId,algorithmSchedule_algorithmScheduleName,algorithmSchedule_isScheduled,algorithmSchedule_insertedRowDate,algorithmScheduleView_algorithmScheduleViewId,algorithmScheduleView_algorithmScheduleViewTypeId,algorithmScheduleView_algorithmScheduleId,algorithmScheduleView_sourceViewId,algorithmScheduleView_insertedRowDate,algorithmScheduleView_joinOnDefinition,sourceView_sourceViewId,sourceView_sourceInstanceId,sourceView_sourceViewTypeId,sourceView_sourceViewName,sourceView_sourceViewDefinition,sourceView_insertedRowDate,sourceViewColumn_sourceViewColumnId,sourceViewColumn_sourceViewId,sourceViewColumn_insertedRowDate,sourceViewColumn_guid,sourceViewColumn_columnName,sourceViewColumn_columnType";
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
  }
  def toAnyArray() : Array[Any] = {
    Array(algorithmScheduleColumnId,algorithmScheduleId,algorithmColumnTypeId,algorithmScheduleViewId,sourceViewId,sourceViewColumnId,extendedProperties,insertedRowDate,algorithmColumnType_algorithmColumnTypeId,algorithmColumnType_algorithmColumnTypeName,algorithmColumnType_algorithmColumnTypeDescription,algorithmColumnType_insertedRowDate,algorithmSchedule_algorithmScheduleId,algorithmSchedule_algorithmImplementationId,algorithmSchedule_algorithmScheduleTypeId,algorithmSchedule_algorithmScheduleName,algorithmSchedule_isScheduled,algorithmSchedule_insertedRowDate,algorithmScheduleView_algorithmScheduleViewId,algorithmScheduleView_algorithmScheduleViewTypeId,algorithmScheduleView_algorithmScheduleId,algorithmScheduleView_sourceViewId,algorithmScheduleView_insertedRowDate,algorithmScheduleView_joinOnDefinition,sourceView_sourceViewId,sourceView_sourceInstanceId,sourceView_sourceViewTypeId,sourceView_sourceViewName,sourceView_sourceViewDefinition,sourceView_insertedRowDate,sourceViewColumn_sourceViewColumnId,sourceViewColumn_sourceViewId,sourceViewColumn_insertedRowDate,sourceViewColumn_guid,sourceViewColumn_columnName,sourceViewColumn_columnType)
  }
  def toStringArray() : Array[String] = {
    Array(""+algorithmScheduleColumnId,""+algorithmScheduleId,""+algorithmColumnTypeId,""+algorithmScheduleViewId,""+sourceViewId,""+sourceViewColumnId,""+extendedProperties,""+insertedRowDate,""+algorithmColumnType_algorithmColumnTypeId,""+algorithmColumnType_algorithmColumnTypeName,""+algorithmColumnType_algorithmColumnTypeDescription,""+algorithmColumnType_insertedRowDate,""+algorithmSchedule_algorithmScheduleId,""+algorithmSchedule_algorithmImplementationId,""+algorithmSchedule_algorithmScheduleTypeId,""+algorithmSchedule_algorithmScheduleName,""+algorithmSchedule_isScheduled,""+algorithmSchedule_insertedRowDate,""+algorithmScheduleView_algorithmScheduleViewId,""+algorithmScheduleView_algorithmScheduleViewTypeId,""+algorithmScheduleView_algorithmScheduleId,""+algorithmScheduleView_sourceViewId,""+algorithmScheduleView_insertedRowDate,""+algorithmScheduleView_joinOnDefinition,""+sourceView_sourceViewId,""+sourceView_sourceInstanceId,""+sourceView_sourceViewTypeId,""+sourceView_sourceViewName,""+sourceView_sourceViewDefinition,""+sourceView_insertedRowDate,""+sourceViewColumn_sourceViewColumnId,""+sourceViewColumn_sourceViewId,""+sourceViewColumn_insertedRowDate,""+sourceViewColumn_guid,""+sourceViewColumn_columnName,""+sourceViewColumn_columnType)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "algorithmScheduleColumnId" => algorithmScheduleColumnId
      case "algorithmScheduleId" => algorithmScheduleId
      case "algorithmColumnTypeId" => algorithmColumnTypeId
      case "algorithmScheduleViewId" => algorithmScheduleViewId
      case "sourceViewId" => sourceViewId
      case "sourceViewColumnId" => sourceViewColumnId
      case "extendedProperties" => extendedProperties
      case "insertedRowDate" => insertedRowDate
      case "algorithmColumnType_algorithmColumnTypeId" => algorithmColumnType_algorithmColumnTypeId
      case "algorithmColumnType_algorithmColumnTypeName" => algorithmColumnType_algorithmColumnTypeName
      case "algorithmColumnType_algorithmColumnTypeDescription" => algorithmColumnType_algorithmColumnTypeDescription
      case "algorithmColumnType_insertedRowDate" => algorithmColumnType_insertedRowDate
      case "algorithmSchedule_algorithmScheduleId" => algorithmSchedule_algorithmScheduleId
      case "algorithmSchedule_algorithmImplementationId" => algorithmSchedule_algorithmImplementationId
      case "algorithmSchedule_algorithmScheduleTypeId" => algorithmSchedule_algorithmScheduleTypeId
      case "algorithmSchedule_algorithmScheduleName" => algorithmSchedule_algorithmScheduleName
      case "algorithmSchedule_isScheduled" => algorithmSchedule_isScheduled
      case "algorithmSchedule_insertedRowDate" => algorithmSchedule_insertedRowDate
      case "algorithmScheduleView_algorithmScheduleViewId" => algorithmScheduleView_algorithmScheduleViewId
      case "algorithmScheduleView_algorithmScheduleViewTypeId" => algorithmScheduleView_algorithmScheduleViewTypeId
      case "algorithmScheduleView_algorithmScheduleId" => algorithmScheduleView_algorithmScheduleId
      case "algorithmScheduleView_sourceViewId" => algorithmScheduleView_sourceViewId
      case "algorithmScheduleView_insertedRowDate" => algorithmScheduleView_insertedRowDate
      case "algorithmScheduleView_joinOnDefinition" => algorithmScheduleView_joinOnDefinition
      case "sourceView_sourceViewId" => sourceView_sourceViewId
      case "sourceView_sourceInstanceId" => sourceView_sourceInstanceId
      case "sourceView_sourceViewTypeId" => sourceView_sourceViewTypeId
      case "sourceView_sourceViewName" => sourceView_sourceViewName
      case "sourceView_sourceViewDefinition" => sourceView_sourceViewDefinition
      case "sourceView_insertedRowDate" => sourceView_insertedRowDate
      case "sourceViewColumn_sourceViewColumnId" => sourceViewColumn_sourceViewColumnId
      case "sourceViewColumn_sourceViewId" => sourceViewColumn_sourceViewId
      case "sourceViewColumn_insertedRowDate" => sourceViewColumn_insertedRowDate
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
      case "algorithmScheduleId" => "Long"
      case "algorithmColumnTypeId" => "Long"
      case "algorithmScheduleViewId" => "Long"
      case "sourceViewId" => "Long"
      case "sourceViewColumnId" => "Long"
      case "extendedProperties" => "String"
      case "insertedRowDate" => "java.util.Date"
      case "algorithmColumnType_algorithmColumnTypeId" => "Long"
      case "algorithmColumnType_algorithmColumnTypeName" => "String"
      case "algorithmColumnType_algorithmColumnTypeDescription" => "String"
      case "algorithmColumnType_insertedRowDate" => "java.util.Date"
      case "algorithmSchedule_algorithmScheduleId" => "Long"
      case "algorithmSchedule_algorithmImplementationId" => "Long"
      case "algorithmSchedule_algorithmScheduleTypeId" => "Long"
      case "algorithmSchedule_algorithmScheduleName" => "String"
      case "algorithmSchedule_isScheduled" => "Int"
      case "algorithmSchedule_insertedRowDate" => "java.util.Date"
      case "algorithmScheduleView_algorithmScheduleViewId" => "Long"
      case "algorithmScheduleView_algorithmScheduleViewTypeId" => "Long"
      case "algorithmScheduleView_algorithmScheduleId" => "Long"
      case "algorithmScheduleView_sourceViewId" => "Long"
      case "algorithmScheduleView_insertedRowDate" => "java.util.Date"
      case "algorithmScheduleView_joinOnDefinition" => "String"
      case "sourceView_sourceViewId" => "Long"
      case "sourceView_sourceInstanceId" => "Long"
      case "sourceView_sourceViewTypeId" => "Long"
      case "sourceView_sourceViewName" => "String"
      case "sourceView_sourceViewDefinition" => "String"
      case "sourceView_insertedRowDate" => "java.util.Date"
      case "sourceViewColumn_sourceViewColumnId" => "Long"
      case "sourceViewColumn_sourceViewId" => "Long"
      case "sourceViewColumn_insertedRowDate" => "java.util.Date"
      case "sourceViewColumn_guid" => "Long"
      case "sourceViewColumn_columnName" => "String"
      case "sourceViewColumn_columnType" => "String"
      case _ => "Object"
    }
    ret
  }
}
case class VAlgorithmScheduleParamDto ( val algorithmScheduleParamId : Long, val algorithmScheduleId : Long, val algorithmParamId : Long, val algorithmParamValue : String, val insertedRowDate : java.util.Date, val algorithmParam_algorithmParamId : Long, val algorithmParam_insertedRowDate : java.util.Date, val algorithmParam_algorithmParamName : String, val algorithmParam_algorithmParamDescription : String, val algorithmParam_algorithmParamType : String, val algorithmSchedule_algorithmScheduleId : Long, val algorithmSchedule_algorithmImplementationId : Long, val algorithmSchedule_algorithmScheduleTypeId : Long, val algorithmSchedule_algorithmScheduleName : String, val algorithmSchedule_isScheduled : Int, val algorithmSchedule_insertedRowDate : java.util.Date ) extends BaseReadOnlyDto {
  def tableName : String = {
    "vAlgorithmScheduleParam";
  }
  def fields : String = {
    "algorithmScheduleParamId,algorithmScheduleId,algorithmParamId,algorithmParamValue,insertedRowDate,algorithmParam_algorithmParamId,algorithmParam_insertedRowDate,algorithmParam_algorithmParamName,algorithmParam_algorithmParamDescription,algorithmParam_algorithmParamType,algorithmSchedule_algorithmScheduleId,algorithmSchedule_algorithmImplementationId,algorithmSchedule_algorithmScheduleTypeId,algorithmSchedule_algorithmScheduleName,algorithmSchedule_isScheduled,algorithmSchedule_insertedRowDate";
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
  }
  def toAnyArray() : Array[Any] = {
    Array(algorithmScheduleParamId,algorithmScheduleId,algorithmParamId,algorithmParamValue,insertedRowDate,algorithmParam_algorithmParamId,algorithmParam_insertedRowDate,algorithmParam_algorithmParamName,algorithmParam_algorithmParamDescription,algorithmParam_algorithmParamType,algorithmSchedule_algorithmScheduleId,algorithmSchedule_algorithmImplementationId,algorithmSchedule_algorithmScheduleTypeId,algorithmSchedule_algorithmScheduleName,algorithmSchedule_isScheduled,algorithmSchedule_insertedRowDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+algorithmScheduleParamId,""+algorithmScheduleId,""+algorithmParamId,""+algorithmParamValue,""+insertedRowDate,""+algorithmParam_algorithmParamId,""+algorithmParam_insertedRowDate,""+algorithmParam_algorithmParamName,""+algorithmParam_algorithmParamDescription,""+algorithmParam_algorithmParamType,""+algorithmSchedule_algorithmScheduleId,""+algorithmSchedule_algorithmImplementationId,""+algorithmSchedule_algorithmScheduleTypeId,""+algorithmSchedule_algorithmScheduleName,""+algorithmSchedule_isScheduled,""+algorithmSchedule_insertedRowDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "algorithmScheduleParamId" => algorithmScheduleParamId
      case "algorithmScheduleId" => algorithmScheduleId
      case "algorithmParamId" => algorithmParamId
      case "algorithmParamValue" => algorithmParamValue
      case "insertedRowDate" => insertedRowDate
      case "algorithmParam_algorithmParamId" => algorithmParam_algorithmParamId
      case "algorithmParam_insertedRowDate" => algorithmParam_insertedRowDate
      case "algorithmParam_algorithmParamName" => algorithmParam_algorithmParamName
      case "algorithmParam_algorithmParamDescription" => algorithmParam_algorithmParamDescription
      case "algorithmParam_algorithmParamType" => algorithmParam_algorithmParamType
      case "algorithmSchedule_algorithmScheduleId" => algorithmSchedule_algorithmScheduleId
      case "algorithmSchedule_algorithmImplementationId" => algorithmSchedule_algorithmImplementationId
      case "algorithmSchedule_algorithmScheduleTypeId" => algorithmSchedule_algorithmScheduleTypeId
      case "algorithmSchedule_algorithmScheduleName" => algorithmSchedule_algorithmScheduleName
      case "algorithmSchedule_isScheduled" => algorithmSchedule_isScheduled
      case "algorithmSchedule_insertedRowDate" => algorithmSchedule_insertedRowDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "algorithmScheduleParamId" => "Long"
      case "algorithmScheduleId" => "Long"
      case "algorithmParamId" => "Long"
      case "algorithmParamValue" => "String"
      case "insertedRowDate" => "java.util.Date"
      case "algorithmParam_algorithmParamId" => "Long"
      case "algorithmParam_insertedRowDate" => "java.util.Date"
      case "algorithmParam_algorithmParamName" => "String"
      case "algorithmParam_algorithmParamDescription" => "String"
      case "algorithmParam_algorithmParamType" => "String"
      case "algorithmSchedule_algorithmScheduleId" => "Long"
      case "algorithmSchedule_algorithmImplementationId" => "Long"
      case "algorithmSchedule_algorithmScheduleTypeId" => "Long"
      case "algorithmSchedule_algorithmScheduleName" => "String"
      case "algorithmSchedule_isScheduled" => "Int"
      case "algorithmSchedule_insertedRowDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
}
case class VAlgorithmScheduleViewDto ( val algorithmScheduleViewId : Long, val algorithmScheduleViewTypeId : Long, val algorithmScheduleId : Long, val sourceViewId : Long, val insertedRowDate : java.util.Date, val joinOnDefinition : String, val algorithmSchedule_algorithmScheduleId : Long, val algorithmSchedule_algorithmImplementationId : Long, val algorithmSchedule_algorithmScheduleTypeId : Long, val algorithmSchedule_algorithmScheduleName : String, val algorithmSchedule_isScheduled : Int, val algorithmSchedule_insertedRowDate : java.util.Date, val algorithmScheduleViewType_algorithmScheduleViewTypeId : Long, val algorithmScheduleViewType_algorithmScheduleViewTypeName : String, val algorithmScheduleViewType_insertedRowDate : java.util.Date, val sourceView_sourceViewId : Long, val sourceView_sourceInstanceId : Long, val sourceView_sourceViewTypeId : Long, val sourceView_sourceViewName : String, val sourceView_sourceViewDefinition : String, val sourceView_insertedRowDate : java.util.Date ) extends BaseReadOnlyDto {
  def tableName : String = {
    "vAlgorithmScheduleView";
  }
  def fields : String = {
    "algorithmScheduleViewId,algorithmScheduleViewTypeId,algorithmScheduleId,sourceViewId,insertedRowDate,joinOnDefinition,algorithmSchedule_algorithmScheduleId,algorithmSchedule_algorithmImplementationId,algorithmSchedule_algorithmScheduleTypeId,algorithmSchedule_algorithmScheduleName,algorithmSchedule_isScheduled,algorithmSchedule_insertedRowDate,algorithmScheduleViewType_algorithmScheduleViewTypeId,algorithmScheduleViewType_algorithmScheduleViewTypeName,algorithmScheduleViewType_insertedRowDate,sourceView_sourceViewId,sourceView_sourceInstanceId,sourceView_sourceViewTypeId,sourceView_sourceViewName,sourceView_sourceViewDefinition,sourceView_insertedRowDate";
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
  }
  def toAnyArray() : Array[Any] = {
    Array(algorithmScheduleViewId,algorithmScheduleViewTypeId,algorithmScheduleId,sourceViewId,insertedRowDate,joinOnDefinition,algorithmSchedule_algorithmScheduleId,algorithmSchedule_algorithmImplementationId,algorithmSchedule_algorithmScheduleTypeId,algorithmSchedule_algorithmScheduleName,algorithmSchedule_isScheduled,algorithmSchedule_insertedRowDate,algorithmScheduleViewType_algorithmScheduleViewTypeId,algorithmScheduleViewType_algorithmScheduleViewTypeName,algorithmScheduleViewType_insertedRowDate,sourceView_sourceViewId,sourceView_sourceInstanceId,sourceView_sourceViewTypeId,sourceView_sourceViewName,sourceView_sourceViewDefinition,sourceView_insertedRowDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+algorithmScheduleViewId,""+algorithmScheduleViewTypeId,""+algorithmScheduleId,""+sourceViewId,""+insertedRowDate,""+joinOnDefinition,""+algorithmSchedule_algorithmScheduleId,""+algorithmSchedule_algorithmImplementationId,""+algorithmSchedule_algorithmScheduleTypeId,""+algorithmSchedule_algorithmScheduleName,""+algorithmSchedule_isScheduled,""+algorithmSchedule_insertedRowDate,""+algorithmScheduleViewType_algorithmScheduleViewTypeId,""+algorithmScheduleViewType_algorithmScheduleViewTypeName,""+algorithmScheduleViewType_insertedRowDate,""+sourceView_sourceViewId,""+sourceView_sourceInstanceId,""+sourceView_sourceViewTypeId,""+sourceView_sourceViewName,""+sourceView_sourceViewDefinition,""+sourceView_insertedRowDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "algorithmScheduleViewId" => algorithmScheduleViewId
      case "algorithmScheduleViewTypeId" => algorithmScheduleViewTypeId
      case "algorithmScheduleId" => algorithmScheduleId
      case "sourceViewId" => sourceViewId
      case "insertedRowDate" => insertedRowDate
      case "joinOnDefinition" => joinOnDefinition
      case "algorithmSchedule_algorithmScheduleId" => algorithmSchedule_algorithmScheduleId
      case "algorithmSchedule_algorithmImplementationId" => algorithmSchedule_algorithmImplementationId
      case "algorithmSchedule_algorithmScheduleTypeId" => algorithmSchedule_algorithmScheduleTypeId
      case "algorithmSchedule_algorithmScheduleName" => algorithmSchedule_algorithmScheduleName
      case "algorithmSchedule_isScheduled" => algorithmSchedule_isScheduled
      case "algorithmSchedule_insertedRowDate" => algorithmSchedule_insertedRowDate
      case "algorithmScheduleViewType_algorithmScheduleViewTypeId" => algorithmScheduleViewType_algorithmScheduleViewTypeId
      case "algorithmScheduleViewType_algorithmScheduleViewTypeName" => algorithmScheduleViewType_algorithmScheduleViewTypeName
      case "algorithmScheduleViewType_insertedRowDate" => algorithmScheduleViewType_insertedRowDate
      case "sourceView_sourceViewId" => sourceView_sourceViewId
      case "sourceView_sourceInstanceId" => sourceView_sourceInstanceId
      case "sourceView_sourceViewTypeId" => sourceView_sourceViewTypeId
      case "sourceView_sourceViewName" => sourceView_sourceViewName
      case "sourceView_sourceViewDefinition" => sourceView_sourceViewDefinition
      case "sourceView_insertedRowDate" => sourceView_insertedRowDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "algorithmScheduleViewId" => "Long"
      case "algorithmScheduleViewTypeId" => "Long"
      case "algorithmScheduleId" => "Long"
      case "sourceViewId" => "Long"
      case "insertedRowDate" => "java.util.Date"
      case "joinOnDefinition" => "String"
      case "algorithmSchedule_algorithmScheduleId" => "Long"
      case "algorithmSchedule_algorithmImplementationId" => "Long"
      case "algorithmSchedule_algorithmScheduleTypeId" => "Long"
      case "algorithmSchedule_algorithmScheduleName" => "String"
      case "algorithmSchedule_isScheduled" => "Int"
      case "algorithmSchedule_insertedRowDate" => "java.util.Date"
      case "algorithmScheduleViewType_algorithmScheduleViewTypeId" => "Long"
      case "algorithmScheduleViewType_algorithmScheduleViewTypeName" => "String"
      case "algorithmScheduleViewType_insertedRowDate" => "java.util.Date"
      case "sourceView_sourceViewId" => "Long"
      case "sourceView_sourceInstanceId" => "Long"
      case "sourceView_sourceViewTypeId" => "Long"
      case "sourceView_sourceViewName" => "String"
      case "sourceView_sourceViewDefinition" => "String"
      case "sourceView_insertedRowDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
}
case class VAlgorithmTypeColumnTypeDto ( val algorithmTypeVersionId : Long, val algorithmColumnTypeId : Long, val allowMultiple : Int, val allowEmpty : Int, val insertedRowDate : java.util.Date, val algorithmColumnType_algorithmColumnTypeId : Long, val algorithmColumnType_algorithmColumnTypeName : String, val algorithmColumnType_algorithmColumnTypeDescription : String, val algorithmColumnType_insertedRowDate : java.util.Date, val algorithmTypeVersion_algorithmTypeVersionId : Long, val algorithmTypeVersion_algorithmTypeId : Long, val algorithmTypeVersion_algorithmTypeVersionName : String, val algorithmTypeVersion_insertedRowDate : java.util.Date ) extends BaseReadOnlyDto {
  def tableName : String = {
    "vAlgorithmTypeColumnType";
  }
  def fields : String = {
    "algorithmTypeVersionId,algorithmColumnTypeId,allowMultiple,allowEmpty,insertedRowDate,algorithmColumnType_algorithmColumnTypeId,algorithmColumnType_algorithmColumnTypeName,algorithmColumnType_algorithmColumnTypeDescription,algorithmColumnType_insertedRowDate,algorithmTypeVersion_algorithmTypeVersionId,algorithmTypeVersion_algorithmTypeId,algorithmTypeVersion_algorithmTypeVersionName,algorithmTypeVersion_insertedRowDate";
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
  }
  def toAnyArray() : Array[Any] = {
    Array(algorithmTypeVersionId,algorithmColumnTypeId,allowMultiple,allowEmpty,insertedRowDate,algorithmColumnType_algorithmColumnTypeId,algorithmColumnType_algorithmColumnTypeName,algorithmColumnType_algorithmColumnTypeDescription,algorithmColumnType_insertedRowDate,algorithmTypeVersion_algorithmTypeVersionId,algorithmTypeVersion_algorithmTypeId,algorithmTypeVersion_algorithmTypeVersionName,algorithmTypeVersion_insertedRowDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+algorithmTypeVersionId,""+algorithmColumnTypeId,""+allowMultiple,""+allowEmpty,""+insertedRowDate,""+algorithmColumnType_algorithmColumnTypeId,""+algorithmColumnType_algorithmColumnTypeName,""+algorithmColumnType_algorithmColumnTypeDescription,""+algorithmColumnType_insertedRowDate,""+algorithmTypeVersion_algorithmTypeVersionId,""+algorithmTypeVersion_algorithmTypeId,""+algorithmTypeVersion_algorithmTypeVersionName,""+algorithmTypeVersion_insertedRowDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "algorithmTypeVersionId" => algorithmTypeVersionId
      case "algorithmColumnTypeId" => algorithmColumnTypeId
      case "allowMultiple" => allowMultiple
      case "allowEmpty" => allowEmpty
      case "insertedRowDate" => insertedRowDate
      case "algorithmColumnType_algorithmColumnTypeId" => algorithmColumnType_algorithmColumnTypeId
      case "algorithmColumnType_algorithmColumnTypeName" => algorithmColumnType_algorithmColumnTypeName
      case "algorithmColumnType_algorithmColumnTypeDescription" => algorithmColumnType_algorithmColumnTypeDescription
      case "algorithmColumnType_insertedRowDate" => algorithmColumnType_insertedRowDate
      case "algorithmTypeVersion_algorithmTypeVersionId" => algorithmTypeVersion_algorithmTypeVersionId
      case "algorithmTypeVersion_algorithmTypeId" => algorithmTypeVersion_algorithmTypeId
      case "algorithmTypeVersion_algorithmTypeVersionName" => algorithmTypeVersion_algorithmTypeVersionName
      case "algorithmTypeVersion_insertedRowDate" => algorithmTypeVersion_insertedRowDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "algorithmTypeVersionId" => "Long"
      case "algorithmColumnTypeId" => "Long"
      case "allowMultiple" => "Int"
      case "allowEmpty" => "Int"
      case "insertedRowDate" => "java.util.Date"
      case "algorithmColumnType_algorithmColumnTypeId" => "Long"
      case "algorithmColumnType_algorithmColumnTypeName" => "String"
      case "algorithmColumnType_algorithmColumnTypeDescription" => "String"
      case "algorithmColumnType_insertedRowDate" => "java.util.Date"
      case "algorithmTypeVersion_algorithmTypeVersionId" => "Long"
      case "algorithmTypeVersion_algorithmTypeId" => "Long"
      case "algorithmTypeVersion_algorithmTypeVersionName" => "String"
      case "algorithmTypeVersion_insertedRowDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
}
case class VAlgorithmTypeVersionDto ( val algorithmTypeVersionId : Long, val algorithmTypeId : Long, val algorithmTypeVersionName : String, val insertedRowDate : java.util.Date, val algorithmType_algorithmTypeId : Long, val algorithmType_algorithmTypeName : String, val algorithmType_algorithmTypeDescription : String, val algorithmType_insertedRowDate : java.util.Date ) extends BaseReadOnlyDto {
  def tableName : String = {
    "vAlgorithmTypeVersion";
  }
  def fields : String = {
    "algorithmTypeVersionId,algorithmTypeId,algorithmTypeVersionName,insertedRowDate,algorithmType_algorithmTypeId,algorithmType_algorithmTypeName,algorithmType_algorithmTypeDescription,algorithmType_insertedRowDate";
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
  }
  def toAnyArray() : Array[Any] = {
    Array(algorithmTypeVersionId,algorithmTypeId,algorithmTypeVersionName,insertedRowDate,algorithmType_algorithmTypeId,algorithmType_algorithmTypeName,algorithmType_algorithmTypeDescription,algorithmType_insertedRowDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+algorithmTypeVersionId,""+algorithmTypeId,""+algorithmTypeVersionName,""+insertedRowDate,""+algorithmType_algorithmTypeId,""+algorithmType_algorithmTypeName,""+algorithmType_algorithmTypeDescription,""+algorithmType_insertedRowDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "algorithmTypeVersionId" => algorithmTypeVersionId
      case "algorithmTypeId" => algorithmTypeId
      case "algorithmTypeVersionName" => algorithmTypeVersionName
      case "insertedRowDate" => insertedRowDate
      case "algorithmType_algorithmTypeId" => algorithmType_algorithmTypeId
      case "algorithmType_algorithmTypeName" => algorithmType_algorithmTypeName
      case "algorithmType_algorithmTypeDescription" => algorithmType_algorithmTypeDescription
      case "algorithmType_insertedRowDate" => algorithmType_insertedRowDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "algorithmTypeVersionId" => "Long"
      case "algorithmTypeId" => "Long"
      case "algorithmTypeVersionName" => "String"
      case "insertedRowDate" => "java.util.Date"
      case "algorithmType_algorithmTypeId" => "Long"
      case "algorithmType_algorithmTypeName" => "String"
      case "algorithmType_algorithmTypeDescription" => "String"
      case "algorithmType_insertedRowDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
}
case class VExecutorInstanceDto ( val executorInstanceId : Long, val executorTypeId : Long, val executorHostId : Long, val executorInstanceName : String, val isRunning : Int, val isFinished : Int, val portNumber : Int, val insertedRowDate : java.util.Date, val guid : Long, val endDate : java.util.Date, val executorHost_executorHostId : Long, val executorHost_insertedRowDate : java.util.Date, val executorHost_hostName : String, val executorHost_hostIp : String, val executorHost_hostDomain : String, val executorHost_hostOsType : String, val executorHost_hostOsVersion : String, val executorHost_isWorking : Int, val executorType_executorTypeId : Long, val executorType_insertedRowDate : java.util.Date, val executorType_executorTypeName : String, val executorType_executorTypeClass : String ) extends BaseReadOnlyDto {
  def tableName : String = {
    "vExecutorInstance";
  }
  def fields : String = {
    "executorInstanceId,executorTypeId,executorHostId,executorInstanceName,isRunning,isFinished,portNumber,insertedRowDate,guid,endDate,executorHost_executorHostId,executorHost_insertedRowDate,executorHost_hostName,executorHost_hostIp,executorHost_hostDomain,executorHost_hostOsType,executorHost_hostOsVersion,executorHost_isWorking,executorType_executorTypeId,executorType_insertedRowDate,executorType_executorTypeName,executorType_executorTypeClass";
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
  }
  def toAnyArray() : Array[Any] = {
    Array(executorInstanceId,executorTypeId,executorHostId,executorInstanceName,isRunning,isFinished,portNumber,insertedRowDate,guid,endDate,executorHost_executorHostId,executorHost_insertedRowDate,executorHost_hostName,executorHost_hostIp,executorHost_hostDomain,executorHost_hostOsType,executorHost_hostOsVersion,executorHost_isWorking,executorType_executorTypeId,executorType_insertedRowDate,executorType_executorTypeName,executorType_executorTypeClass)
  }
  def toStringArray() : Array[String] = {
    Array(""+executorInstanceId,""+executorTypeId,""+executorHostId,""+executorInstanceName,""+isRunning,""+isFinished,""+portNumber,""+insertedRowDate,""+guid,""+endDate,""+executorHost_executorHostId,""+executorHost_insertedRowDate,""+executorHost_hostName,""+executorHost_hostIp,""+executorHost_hostDomain,""+executorHost_hostOsType,""+executorHost_hostOsVersion,""+executorHost_isWorking,""+executorType_executorTypeId,""+executorType_insertedRowDate,""+executorType_executorTypeName,""+executorType_executorTypeClass)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "executorInstanceId" => executorInstanceId
      case "executorTypeId" => executorTypeId
      case "executorHostId" => executorHostId
      case "executorInstanceName" => executorInstanceName
      case "isRunning" => isRunning
      case "isFinished" => isFinished
      case "portNumber" => portNumber
      case "insertedRowDate" => insertedRowDate
      case "guid" => guid
      case "endDate" => endDate
      case "executorHost_executorHostId" => executorHost_executorHostId
      case "executorHost_insertedRowDate" => executorHost_insertedRowDate
      case "executorHost_hostName" => executorHost_hostName
      case "executorHost_hostIp" => executorHost_hostIp
      case "executorHost_hostDomain" => executorHost_hostDomain
      case "executorHost_hostOsType" => executorHost_hostOsType
      case "executorHost_hostOsVersion" => executorHost_hostOsVersion
      case "executorHost_isWorking" => executorHost_isWorking
      case "executorType_executorTypeId" => executorType_executorTypeId
      case "executorType_insertedRowDate" => executorType_insertedRowDate
      case "executorType_executorTypeName" => executorType_executorTypeName
      case "executorType_executorTypeClass" => executorType_executorTypeClass
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "executorInstanceId" => "Long"
      case "executorTypeId" => "Long"
      case "executorHostId" => "Long"
      case "executorInstanceName" => "String"
      case "isRunning" => "Int"
      case "isFinished" => "Int"
      case "portNumber" => "Int"
      case "insertedRowDate" => "java.util.Date"
      case "guid" => "Long"
      case "endDate" => "java.util.Date"
      case "executorHost_executorHostId" => "Long"
      case "executorHost_insertedRowDate" => "java.util.Date"
      case "executorHost_hostName" => "String"
      case "executorHost_hostIp" => "String"
      case "executorHost_hostDomain" => "String"
      case "executorHost_hostOsType" => "String"
      case "executorHost_hostOsVersion" => "String"
      case "executorHost_isWorking" => "Int"
      case "executorType_executorTypeId" => "Long"
      case "executorType_insertedRowDate" => "java.util.Date"
      case "executorType_executorTypeName" => "String"
      case "executorType_executorTypeClass" => "String"
      case _ => "Object"
    }
    ret
  }
}
case class VExecutorRestDto ( val executorRestId : Long, val executorHostId : Long, val insertedRowDate : java.util.Date, val restPort : Int, val restVersion : String, val restStatus : String, val executorHost_executorHostId : Long, val executorHost_insertedRowDate : java.util.Date, val executorHost_hostName : String, val executorHost_hostIp : String, val executorHost_hostDomain : String, val executorHost_hostOsType : String, val executorHost_hostOsVersion : String, val executorHost_isWorking : Int ) extends BaseReadOnlyDto {
  def tableName : String = {
    "vExecutorRest";
  }
  def fields : String = {
    "executorRestId,executorHostId,insertedRowDate,restPort,restVersion,restStatus,executorHost_executorHostId,executorHost_insertedRowDate,executorHost_hostName,executorHost_hostIp,executorHost_hostDomain,executorHost_hostOsType,executorHost_hostOsVersion,executorHost_isWorking";
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
  }
  def toAnyArray() : Array[Any] = {
    Array(executorRestId,executorHostId,insertedRowDate,restPort,restVersion,restStatus,executorHost_executorHostId,executorHost_insertedRowDate,executorHost_hostName,executorHost_hostIp,executorHost_hostDomain,executorHost_hostOsType,executorHost_hostOsVersion,executorHost_isWorking)
  }
  def toStringArray() : Array[String] = {
    Array(""+executorRestId,""+executorHostId,""+insertedRowDate,""+restPort,""+restVersion,""+restStatus,""+executorHost_executorHostId,""+executorHost_insertedRowDate,""+executorHost_hostName,""+executorHost_hostIp,""+executorHost_hostDomain,""+executorHost_hostOsType,""+executorHost_hostOsVersion,""+executorHost_isWorking)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "executorRestId" => executorRestId
      case "executorHostId" => executorHostId
      case "insertedRowDate" => insertedRowDate
      case "restPort" => restPort
      case "restVersion" => restVersion
      case "restStatus" => restStatus
      case "executorHost_executorHostId" => executorHost_executorHostId
      case "executorHost_insertedRowDate" => executorHost_insertedRowDate
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
      case "executorHostId" => "Long"
      case "insertedRowDate" => "java.util.Date"
      case "restPort" => "Int"
      case "restVersion" => "String"
      case "restStatus" => "String"
      case "executorHost_executorHostId" => "Long"
      case "executorHost_insertedRowDate" => "java.util.Date"
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
case class VExecutorRestCallDto ( val executorRestCallId : Long, val insertedRowDate : java.util.Date, val executorHostId : Long, val executorRestId : Long, val requestMethod : String, val requestHeader : String, val requestBody : String, val responseBody : String, val executorHost_executorHostId : Long, val executorHost_insertedRowDate : java.util.Date, val executorHost_hostName : String, val executorHost_hostIp : String, val executorHost_hostDomain : String, val executorHost_hostOsType : String, val executorHost_hostOsVersion : String, val executorHost_isWorking : Int, val executorRest_executorRestId : Long, val executorRest_executorHostId : Long, val executorRest_insertedRowDate : java.util.Date, val executorRest_restPort : Int, val executorRest_restVersion : String, val executorRest_restStatus : String ) extends BaseReadOnlyDto {
  def tableName : String = {
    "vExecutorRestCall";
  }
  def fields : String = {
    "executorRestCallId,insertedRowDate,executorHostId,executorRestId,requestMethod,requestHeader,requestBody,responseBody,executorHost_executorHostId,executorHost_insertedRowDate,executorHost_hostName,executorHost_hostIp,executorHost_hostDomain,executorHost_hostOsType,executorHost_hostOsVersion,executorHost_isWorking,executorRest_executorRestId,executorRest_executorHostId,executorRest_insertedRowDate,executorRest_restPort,executorRest_restVersion,executorRest_restStatus";
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
  }
  def toAnyArray() : Array[Any] = {
    Array(executorRestCallId,insertedRowDate,executorHostId,executorRestId,requestMethod,requestHeader,requestBody,responseBody,executorHost_executorHostId,executorHost_insertedRowDate,executorHost_hostName,executorHost_hostIp,executorHost_hostDomain,executorHost_hostOsType,executorHost_hostOsVersion,executorHost_isWorking,executorRest_executorRestId,executorRest_executorHostId,executorRest_insertedRowDate,executorRest_restPort,executorRest_restVersion,executorRest_restStatus)
  }
  def toStringArray() : Array[String] = {
    Array(""+executorRestCallId,""+insertedRowDate,""+executorHostId,""+executorRestId,""+requestMethod,""+requestHeader,""+requestBody,""+responseBody,""+executorHost_executorHostId,""+executorHost_insertedRowDate,""+executorHost_hostName,""+executorHost_hostIp,""+executorHost_hostDomain,""+executorHost_hostOsType,""+executorHost_hostOsVersion,""+executorHost_isWorking,""+executorRest_executorRestId,""+executorRest_executorHostId,""+executorRest_insertedRowDate,""+executorRest_restPort,""+executorRest_restVersion,""+executorRest_restStatus)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "executorRestCallId" => executorRestCallId
      case "insertedRowDate" => insertedRowDate
      case "executorHostId" => executorHostId
      case "executorRestId" => executorRestId
      case "requestMethod" => requestMethod
      case "requestHeader" => requestHeader
      case "requestBody" => requestBody
      case "responseBody" => responseBody
      case "executorHost_executorHostId" => executorHost_executorHostId
      case "executorHost_insertedRowDate" => executorHost_insertedRowDate
      case "executorHost_hostName" => executorHost_hostName
      case "executorHost_hostIp" => executorHost_hostIp
      case "executorHost_hostDomain" => executorHost_hostDomain
      case "executorHost_hostOsType" => executorHost_hostOsType
      case "executorHost_hostOsVersion" => executorHost_hostOsVersion
      case "executorHost_isWorking" => executorHost_isWorking
      case "executorRest_executorRestId" => executorRest_executorRestId
      case "executorRest_executorHostId" => executorRest_executorHostId
      case "executorRest_insertedRowDate" => executorRest_insertedRowDate
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
      case "insertedRowDate" => "java.util.Date"
      case "executorHostId" => "Long"
      case "executorRestId" => "Long"
      case "requestMethod" => "String"
      case "requestHeader" => "String"
      case "requestBody" => "String"
      case "responseBody" => "String"
      case "executorHost_executorHostId" => "Long"
      case "executorHost_insertedRowDate" => "java.util.Date"
      case "executorHost_hostName" => "String"
      case "executorHost_hostIp" => "String"
      case "executorHost_hostDomain" => "String"
      case "executorHost_hostOsType" => "String"
      case "executorHost_hostOsVersion" => "String"
      case "executorHost_isWorking" => "Int"
      case "executorRest_executorRestId" => "Long"
      case "executorRest_executorHostId" => "Long"
      case "executorRest_insertedRowDate" => "java.util.Date"
      case "executorRest_restPort" => "Int"
      case "executorRest_restVersion" => "String"
      case "executorRest_restStatus" => "String"
      case _ => "Object"
    }
    ret
  }
}
case class VExecutorStorageDto ( val executorStorageId : Long, val executorHostId : Long, val executorStorageTypeId : Long, val storageDefinition : String, val storageBasePath : String, val storageFulllPath : String, val isRunning : Int, val portNumber : Int, val insertedRowDate : java.util.Date, val guid : Long, val executorStorageType_executorStorageTypeId : Long, val executorStorageType_insertedRowDate : java.util.Date, val executorStorageType_executorStorageTypeName : String, val executorStorageType_executorStorageTypeClass : String, val executorHost_executorHostId : Long, val executorHost_insertedRowDate : java.util.Date, val executorHost_hostName : String, val executorHost_hostIp : String, val executorHost_hostDomain : String, val executorHost_hostOsType : String, val executorHost_hostOsVersion : String, val executorHost_isWorking : Int ) extends BaseReadOnlyDto {
  def tableName : String = {
    "vExecutorStorage";
  }
  def fields : String = {
    "executorStorageId,executorHostId,executorStorageTypeId,storageDefinition,storageBasePath,storageFulllPath,isRunning,portNumber,insertedRowDate,guid,executorStorageType_executorStorageTypeId,executorStorageType_insertedRowDate,executorStorageType_executorStorageTypeName,executorStorageType_executorStorageTypeClass,executorHost_executorHostId,executorHost_insertedRowDate,executorHost_hostName,executorHost_hostIp,executorHost_hostDomain,executorHost_hostOsType,executorHost_hostOsVersion,executorHost_isWorking";
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
  }
  def toAnyArray() : Array[Any] = {
    Array(executorStorageId,executorHostId,executorStorageTypeId,storageDefinition,storageBasePath,storageFulllPath,isRunning,portNumber,insertedRowDate,guid,executorStorageType_executorStorageTypeId,executorStorageType_insertedRowDate,executorStorageType_executorStorageTypeName,executorStorageType_executorStorageTypeClass,executorHost_executorHostId,executorHost_insertedRowDate,executorHost_hostName,executorHost_hostIp,executorHost_hostDomain,executorHost_hostOsType,executorHost_hostOsVersion,executorHost_isWorking)
  }
  def toStringArray() : Array[String] = {
    Array(""+executorStorageId,""+executorHostId,""+executorStorageTypeId,""+storageDefinition,""+storageBasePath,""+storageFulllPath,""+isRunning,""+portNumber,""+insertedRowDate,""+guid,""+executorStorageType_executorStorageTypeId,""+executorStorageType_insertedRowDate,""+executorStorageType_executorStorageTypeName,""+executorStorageType_executorStorageTypeClass,""+executorHost_executorHostId,""+executorHost_insertedRowDate,""+executorHost_hostName,""+executorHost_hostIp,""+executorHost_hostDomain,""+executorHost_hostOsType,""+executorHost_hostOsVersion,""+executorHost_isWorking)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "executorStorageId" => executorStorageId
      case "executorHostId" => executorHostId
      case "executorStorageTypeId" => executorStorageTypeId
      case "storageDefinition" => storageDefinition
      case "storageBasePath" => storageBasePath
      case "storageFulllPath" => storageFulllPath
      case "isRunning" => isRunning
      case "portNumber" => portNumber
      case "insertedRowDate" => insertedRowDate
      case "guid" => guid
      case "executorStorageType_executorStorageTypeId" => executorStorageType_executorStorageTypeId
      case "executorStorageType_insertedRowDate" => executorStorageType_insertedRowDate
      case "executorStorageType_executorStorageTypeName" => executorStorageType_executorStorageTypeName
      case "executorStorageType_executorStorageTypeClass" => executorStorageType_executorStorageTypeClass
      case "executorHost_executorHostId" => executorHost_executorHostId
      case "executorHost_insertedRowDate" => executorHost_insertedRowDate
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
      case "executorHostId" => "Long"
      case "executorStorageTypeId" => "Long"
      case "storageDefinition" => "String"
      case "storageBasePath" => "String"
      case "storageFulllPath" => "String"
      case "isRunning" => "Int"
      case "portNumber" => "Int"
      case "insertedRowDate" => "java.util.Date"
      case "guid" => "Long"
      case "executorStorageType_executorStorageTypeId" => "Long"
      case "executorStorageType_insertedRowDate" => "java.util.Date"
      case "executorStorageType_executorStorageTypeName" => "String"
      case "executorStorageType_executorStorageTypeClass" => "String"
      case "executorHost_executorHostId" => "Long"
      case "executorHost_insertedRowDate" => "java.util.Date"
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
case class VExecutorStorageSnapshotDto ( val executorStorageSnapshotId : Long, val executorInstanceId : Long, val insertedRowDate : java.util.Date, val executorInstance_executorInstanceId : Long, val executorInstance_executorTypeId : Long, val executorInstance_executorHostId : Long, val executorInstance_executorInstanceName : String, val executorInstance_isRunning : Int, val executorInstance_isFinished : Int, val executorInstance_portNumber : Int, val executorInstance_insertedRowDate : java.util.Date, val executorInstance_guid : Long, val executorInstance_endDate : java.util.Date ) extends BaseReadOnlyDto {
  def tableName : String = {
    "vExecutorStorageSnapshot";
  }
  def fields : String = {
    "executorStorageSnapshotId,executorInstanceId,insertedRowDate,executorInstance_executorInstanceId,executorInstance_executorTypeId,executorInstance_executorHostId,executorInstance_executorInstanceName,executorInstance_isRunning,executorInstance_isFinished,executorInstance_portNumber,executorInstance_insertedRowDate,executorInstance_guid,executorInstance_endDate";
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
  }
  def toAnyArray() : Array[Any] = {
    Array(executorStorageSnapshotId,executorInstanceId,insertedRowDate,executorInstance_executorInstanceId,executorInstance_executorTypeId,executorInstance_executorHostId,executorInstance_executorInstanceName,executorInstance_isRunning,executorInstance_isFinished,executorInstance_portNumber,executorInstance_insertedRowDate,executorInstance_guid,executorInstance_endDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+executorStorageSnapshotId,""+executorInstanceId,""+insertedRowDate,""+executorInstance_executorInstanceId,""+executorInstance_executorTypeId,""+executorInstance_executorHostId,""+executorInstance_executorInstanceName,""+executorInstance_isRunning,""+executorInstance_isFinished,""+executorInstance_portNumber,""+executorInstance_insertedRowDate,""+executorInstance_guid,""+executorInstance_endDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "executorStorageSnapshotId" => executorStorageSnapshotId
      case "executorInstanceId" => executorInstanceId
      case "insertedRowDate" => insertedRowDate
      case "executorInstance_executorInstanceId" => executorInstance_executorInstanceId
      case "executorInstance_executorTypeId" => executorInstance_executorTypeId
      case "executorInstance_executorHostId" => executorInstance_executorHostId
      case "executorInstance_executorInstanceName" => executorInstance_executorInstanceName
      case "executorInstance_isRunning" => executorInstance_isRunning
      case "executorInstance_isFinished" => executorInstance_isFinished
      case "executorInstance_portNumber" => executorInstance_portNumber
      case "executorInstance_insertedRowDate" => executorInstance_insertedRowDate
      case "executorInstance_guid" => executorInstance_guid
      case "executorInstance_endDate" => executorInstance_endDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "executorStorageSnapshotId" => "Long"
      case "executorInstanceId" => "Long"
      case "insertedRowDate" => "java.util.Date"
      case "executorInstance_executorInstanceId" => "Long"
      case "executorInstance_executorTypeId" => "Long"
      case "executorInstance_executorHostId" => "Long"
      case "executorInstance_executorInstanceName" => "String"
      case "executorInstance_isRunning" => "Int"
      case "executorInstance_isFinished" => "Int"
      case "executorInstance_portNumber" => "Int"
      case "executorInstance_insertedRowDate" => "java.util.Date"
      case "executorInstance_guid" => "Long"
      case "executorInstance_endDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
}
case class VExecutorStorageViewDto ( val executorStorageViewId : Long, val insertedRowDate : java.util.Date, val executorStorageSnapshotId : Long, val executorStorageId : Long, val sourceDownloadId : Long, val storagePath : String, val viewSize : Long, val viewRowsCount : Long, val executorStorage_executorStorageId : Long, val executorStorage_executorHostId : Long, val executorStorage_executorStorageTypeId : Long, val executorStorage_storageDefinition : String, val executorStorage_storageBasePath : String, val executorStorage_storageFulllPath : String, val executorStorage_isRunning : Int, val executorStorage_portNumber : Int, val executorStorage_insertedRowDate : java.util.Date, val executorStorage_guid : Long ) extends BaseReadOnlyDto {
  def tableName : String = {
    "vExecutorStorageView";
  }
  def fields : String = {
    "executorStorageViewId,insertedRowDate,executorStorageSnapshotId,executorStorageId,sourceDownloadId,storagePath,viewSize,viewRowsCount,executorStorage_executorStorageId,executorStorage_executorHostId,executorStorage_executorStorageTypeId,executorStorage_storageDefinition,executorStorage_storageBasePath,executorStorage_storageFulllPath,executorStorage_isRunning,executorStorage_portNumber,executorStorage_insertedRowDate,executorStorage_guid";
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
  }
  def toAnyArray() : Array[Any] = {
    Array(executorStorageViewId,insertedRowDate,executorStorageSnapshotId,executorStorageId,sourceDownloadId,storagePath,viewSize,viewRowsCount,executorStorage_executorStorageId,executorStorage_executorHostId,executorStorage_executorStorageTypeId,executorStorage_storageDefinition,executorStorage_storageBasePath,executorStorage_storageFulllPath,executorStorage_isRunning,executorStorage_portNumber,executorStorage_insertedRowDate,executorStorage_guid)
  }
  def toStringArray() : Array[String] = {
    Array(""+executorStorageViewId,""+insertedRowDate,""+executorStorageSnapshotId,""+executorStorageId,""+sourceDownloadId,""+storagePath,""+viewSize,""+viewRowsCount,""+executorStorage_executorStorageId,""+executorStorage_executorHostId,""+executorStorage_executorStorageTypeId,""+executorStorage_storageDefinition,""+executorStorage_storageBasePath,""+executorStorage_storageFulllPath,""+executorStorage_isRunning,""+executorStorage_portNumber,""+executorStorage_insertedRowDate,""+executorStorage_guid)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "executorStorageViewId" => executorStorageViewId
      case "insertedRowDate" => insertedRowDate
      case "executorStorageSnapshotId" => executorStorageSnapshotId
      case "executorStorageId" => executorStorageId
      case "sourceDownloadId" => sourceDownloadId
      case "storagePath" => storagePath
      case "viewSize" => viewSize
      case "viewRowsCount" => viewRowsCount
      case "executorStorage_executorStorageId" => executorStorage_executorStorageId
      case "executorStorage_executorHostId" => executorStorage_executorHostId
      case "executorStorage_executorStorageTypeId" => executorStorage_executorStorageTypeId
      case "executorStorage_storageDefinition" => executorStorage_storageDefinition
      case "executorStorage_storageBasePath" => executorStorage_storageBasePath
      case "executorStorage_storageFulllPath" => executorStorage_storageFulllPath
      case "executorStorage_isRunning" => executorStorage_isRunning
      case "executorStorage_portNumber" => executorStorage_portNumber
      case "executorStorage_insertedRowDate" => executorStorage_insertedRowDate
      case "executorStorage_guid" => executorStorage_guid
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "executorStorageViewId" => "Long"
      case "insertedRowDate" => "java.util.Date"
      case "executorStorageSnapshotId" => "Long"
      case "executorStorageId" => "Long"
      case "sourceDownloadId" => "Long"
      case "storagePath" => "String"
      case "viewSize" => "Long"
      case "viewRowsCount" => "Long"
      case "executorStorage_executorStorageId" => "Long"
      case "executorStorage_executorHostId" => "Long"
      case "executorStorage_executorStorageTypeId" => "Long"
      case "executorStorage_storageDefinition" => "String"
      case "executorStorage_storageBasePath" => "String"
      case "executorStorage_storageFulllPath" => "String"
      case "executorStorage_isRunning" => "Int"
      case "executorStorage_portNumber" => "Int"
      case "executorStorage_insertedRowDate" => "java.util.Date"
      case "executorStorage_guid" => "Long"
      case _ => "Object"
    }
    ret
  }
}
case class VResourceManagerDto ( val resourceManagerId : Long, val resourceManagerTypeId : Long, val executorHostId : Long, val resourceManagerStatus : String, val insertedRowDate : java.util.Date, val executorHost_executorHostId : Long, val executorHost_insertedRowDate : java.util.Date, val executorHost_hostName : String, val executorHost_hostIp : String, val executorHost_hostDomain : String, val executorHost_hostOsType : String, val executorHost_hostOsVersion : String, val executorHost_isWorking : Int, val resourceManagerType_resourceManagerTypeId : Long, val resourceManagerType_resourceManagerTypeName : String, val resourceManagerType_resourceManagerTypeClass : String, val resourceManagerType_insertedRowDate : java.util.Date ) extends BaseReadOnlyDto {
  def tableName : String = {
    "vResourceManager";
  }
  def fields : String = {
    "resourceManagerId,resourceManagerTypeId,executorHostId,resourceManagerStatus,insertedRowDate,executorHost_executorHostId,executorHost_insertedRowDate,executorHost_hostName,executorHost_hostIp,executorHost_hostDomain,executorHost_hostOsType,executorHost_hostOsVersion,executorHost_isWorking,resourceManagerType_resourceManagerTypeId,resourceManagerType_resourceManagerTypeName,resourceManagerType_resourceManagerTypeClass,resourceManagerType_insertedRowDate";
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
  }
  def toAnyArray() : Array[Any] = {
    Array(resourceManagerId,resourceManagerTypeId,executorHostId,resourceManagerStatus,insertedRowDate,executorHost_executorHostId,executorHost_insertedRowDate,executorHost_hostName,executorHost_hostIp,executorHost_hostDomain,executorHost_hostOsType,executorHost_hostOsVersion,executorHost_isWorking,resourceManagerType_resourceManagerTypeId,resourceManagerType_resourceManagerTypeName,resourceManagerType_resourceManagerTypeClass,resourceManagerType_insertedRowDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+resourceManagerId,""+resourceManagerTypeId,""+executorHostId,""+resourceManagerStatus,""+insertedRowDate,""+executorHost_executorHostId,""+executorHost_insertedRowDate,""+executorHost_hostName,""+executorHost_hostIp,""+executorHost_hostDomain,""+executorHost_hostOsType,""+executorHost_hostOsVersion,""+executorHost_isWorking,""+resourceManagerType_resourceManagerTypeId,""+resourceManagerType_resourceManagerTypeName,""+resourceManagerType_resourceManagerTypeClass,""+resourceManagerType_insertedRowDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "resourceManagerId" => resourceManagerId
      case "resourceManagerTypeId" => resourceManagerTypeId
      case "executorHostId" => executorHostId
      case "resourceManagerStatus" => resourceManagerStatus
      case "insertedRowDate" => insertedRowDate
      case "executorHost_executorHostId" => executorHost_executorHostId
      case "executorHost_insertedRowDate" => executorHost_insertedRowDate
      case "executorHost_hostName" => executorHost_hostName
      case "executorHost_hostIp" => executorHost_hostIp
      case "executorHost_hostDomain" => executorHost_hostDomain
      case "executorHost_hostOsType" => executorHost_hostOsType
      case "executorHost_hostOsVersion" => executorHost_hostOsVersion
      case "executorHost_isWorking" => executorHost_isWorking
      case "resourceManagerType_resourceManagerTypeId" => resourceManagerType_resourceManagerTypeId
      case "resourceManagerType_resourceManagerTypeName" => resourceManagerType_resourceManagerTypeName
      case "resourceManagerType_resourceManagerTypeClass" => resourceManagerType_resourceManagerTypeClass
      case "resourceManagerType_insertedRowDate" => resourceManagerType_insertedRowDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "resourceManagerId" => "Long"
      case "resourceManagerTypeId" => "Long"
      case "executorHostId" => "Long"
      case "resourceManagerStatus" => "String"
      case "insertedRowDate" => "java.util.Date"
      case "executorHost_executorHostId" => "Long"
      case "executorHost_insertedRowDate" => "java.util.Date"
      case "executorHost_hostName" => "String"
      case "executorHost_hostIp" => "String"
      case "executorHost_hostDomain" => "String"
      case "executorHost_hostOsType" => "String"
      case "executorHost_hostOsVersion" => "String"
      case "executorHost_isWorking" => "Int"
      case "resourceManagerType_resourceManagerTypeId" => "Long"
      case "resourceManagerType_resourceManagerTypeName" => "String"
      case "resourceManagerType_resourceManagerTypeClass" => "String"
      case "resourceManagerType_insertedRowDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
}
case class VResourceManagerMeasureDto ( val resourceManagerMeasureId : Long, val resourceManagerId : Long, val resourceMeasureId : Long, val measureString : String, val measureValue : Double, val insertedRowDate : java.util.Date, val resourceManager_resourceManagerId : Long, val resourceManager_resourceManagerTypeId : Long, val resourceManager_executorHostId : Long, val resourceManager_resourceManagerStatus : String, val resourceManager_insertedRowDate : java.util.Date, val resourceMeasure_resourceMeasureId : Long, val resourceMeasure_resourceMeasureName : String, val resourceMeasure_insertedRowDate : java.util.Date ) extends BaseReadOnlyDto {
  def tableName : String = {
    "vResourceManagerMeasure";
  }
  def fields : String = {
    "resourceManagerMeasureId,resourceManagerId,resourceMeasureId,measureString,measureValue,insertedRowDate,resourceManager_resourceManagerId,resourceManager_resourceManagerTypeId,resourceManager_executorHostId,resourceManager_resourceManagerStatus,resourceManager_insertedRowDate,resourceMeasure_resourceMeasureId,resourceMeasure_resourceMeasureName,resourceMeasure_insertedRowDate";
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
  }
  def toAnyArray() : Array[Any] = {
    Array(resourceManagerMeasureId,resourceManagerId,resourceMeasureId,measureString,measureValue,insertedRowDate,resourceManager_resourceManagerId,resourceManager_resourceManagerTypeId,resourceManager_executorHostId,resourceManager_resourceManagerStatus,resourceManager_insertedRowDate,resourceMeasure_resourceMeasureId,resourceMeasure_resourceMeasureName,resourceMeasure_insertedRowDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+resourceManagerMeasureId,""+resourceManagerId,""+resourceMeasureId,""+measureString,""+measureValue,""+insertedRowDate,""+resourceManager_resourceManagerId,""+resourceManager_resourceManagerTypeId,""+resourceManager_executorHostId,""+resourceManager_resourceManagerStatus,""+resourceManager_insertedRowDate,""+resourceMeasure_resourceMeasureId,""+resourceMeasure_resourceMeasureName,""+resourceMeasure_insertedRowDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "resourceManagerMeasureId" => resourceManagerMeasureId
      case "resourceManagerId" => resourceManagerId
      case "resourceMeasureId" => resourceMeasureId
      case "measureString" => measureString
      case "measureValue" => measureValue
      case "insertedRowDate" => insertedRowDate
      case "resourceManager_resourceManagerId" => resourceManager_resourceManagerId
      case "resourceManager_resourceManagerTypeId" => resourceManager_resourceManagerTypeId
      case "resourceManager_executorHostId" => resourceManager_executorHostId
      case "resourceManager_resourceManagerStatus" => resourceManager_resourceManagerStatus
      case "resourceManager_insertedRowDate" => resourceManager_insertedRowDate
      case "resourceMeasure_resourceMeasureId" => resourceMeasure_resourceMeasureId
      case "resourceMeasure_resourceMeasureName" => resourceMeasure_resourceMeasureName
      case "resourceMeasure_insertedRowDate" => resourceMeasure_insertedRowDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "resourceManagerMeasureId" => "Long"
      case "resourceManagerId" => "Long"
      case "resourceMeasureId" => "Long"
      case "measureString" => "String"
      case "measureValue" => "Double"
      case "insertedRowDate" => "java.util.Date"
      case "resourceManager_resourceManagerId" => "Long"
      case "resourceManager_resourceManagerTypeId" => "Long"
      case "resourceManager_executorHostId" => "Long"
      case "resourceManager_resourceManagerStatus" => "String"
      case "resourceManager_insertedRowDate" => "java.util.Date"
      case "resourceMeasure_resourceMeasureId" => "Long"
      case "resourceMeasure_resourceMeasureName" => "String"
      case "resourceMeasure_insertedRowDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
}
case class VSourceDownloadDto ( val sourceDownloadId : Long, val sourceScheduleId : Long, val insertedRowDate : java.util.Date, val lastUpdatedDate : java.util.Date, val retryNumber : Int, val isRunning : Int, val isFinished : Int, val isExcecption : Int, val excecptionDescription : String, val sourceSchedule_sourceScheduleId : Long, val sourceSchedule_sourceViewId : Long, val sourceSchedule_executorStorageId : Long, val sourceSchedule_insertedRowDate : java.util.Date, val sourceSchedule_guid : Long, val sourceSchedule_onDemand : Int, val sourceSchedule_startTime : java.util.Date, val sourceSchedule_intervalValue : Long ) extends BaseReadOnlyDto {
  def tableName : String = {
    "vSourceDownload";
  }
  def fields : String = {
    "sourceDownloadId,sourceScheduleId,insertedRowDate,lastUpdatedDate,retryNumber,isRunning,isFinished,isExcecption,excecptionDescription,sourceSchedule_sourceScheduleId,sourceSchedule_sourceViewId,sourceSchedule_executorStorageId,sourceSchedule_insertedRowDate,sourceSchedule_guid,sourceSchedule_onDemand,sourceSchedule_startTime,sourceSchedule_intervalValue";
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
  }
  def toAnyArray() : Array[Any] = {
    Array(sourceDownloadId,sourceScheduleId,insertedRowDate,lastUpdatedDate,retryNumber,isRunning,isFinished,isExcecption,excecptionDescription,sourceSchedule_sourceScheduleId,sourceSchedule_sourceViewId,sourceSchedule_executorStorageId,sourceSchedule_insertedRowDate,sourceSchedule_guid,sourceSchedule_onDemand,sourceSchedule_startTime,sourceSchedule_intervalValue)
  }
  def toStringArray() : Array[String] = {
    Array(""+sourceDownloadId,""+sourceScheduleId,""+insertedRowDate,""+lastUpdatedDate,""+retryNumber,""+isRunning,""+isFinished,""+isExcecption,""+excecptionDescription,""+sourceSchedule_sourceScheduleId,""+sourceSchedule_sourceViewId,""+sourceSchedule_executorStorageId,""+sourceSchedule_insertedRowDate,""+sourceSchedule_guid,""+sourceSchedule_onDemand,""+sourceSchedule_startTime,""+sourceSchedule_intervalValue)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "sourceDownloadId" => sourceDownloadId
      case "sourceScheduleId" => sourceScheduleId
      case "insertedRowDate" => insertedRowDate
      case "lastUpdatedDate" => lastUpdatedDate
      case "retryNumber" => retryNumber
      case "isRunning" => isRunning
      case "isFinished" => isFinished
      case "isExcecption" => isExcecption
      case "excecptionDescription" => excecptionDescription
      case "sourceSchedule_sourceScheduleId" => sourceSchedule_sourceScheduleId
      case "sourceSchedule_sourceViewId" => sourceSchedule_sourceViewId
      case "sourceSchedule_executorStorageId" => sourceSchedule_executorStorageId
      case "sourceSchedule_insertedRowDate" => sourceSchedule_insertedRowDate
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
      case "retryNumber" => "Int"
      case "isRunning" => "Int"
      case "isFinished" => "Int"
      case "isExcecption" => "Int"
      case "excecptionDescription" => "String"
      case "sourceSchedule_sourceScheduleId" => "Long"
      case "sourceSchedule_sourceViewId" => "Long"
      case "sourceSchedule_executorStorageId" => "Long"
      case "sourceSchedule_insertedRowDate" => "java.util.Date"
      case "sourceSchedule_guid" => "Long"
      case "sourceSchedule_onDemand" => "Int"
      case "sourceSchedule_startTime" => "java.util.Date"
      case "sourceSchedule_intervalValue" => "Long"
      case _ => "Object"
    }
    ret
  }
}
case class VSourceDownloadStatDto ( val sourceDownloadStatId : Long, val sourceDownloadId : Long, val insertedRowDate : java.util.Date, val rowsCount : Long, val errorRowsCount : Long, val totalBytesCount : Long, val empryRowsCount : Long, val sourceDownload_sourceDownloadId : Long, val sourceDownload_sourceScheduleId : Long, val sourceDownload_insertedRowDate : java.util.Date, val sourceDownload_lastUpdatedDate : java.util.Date, val sourceDownload_retryNumber : Int, val sourceDownload_isRunning : Int, val sourceDownload_isFinished : Int, val sourceDownload_isExcecption : Int, val sourceDownload_excecptionDescription : String ) extends BaseReadOnlyDto {
  def tableName : String = {
    "vSourceDownloadStat";
  }
  def fields : String = {
    "sourceDownloadStatId,sourceDownloadId,insertedRowDate,rowsCount,errorRowsCount,totalBytesCount,empryRowsCount,sourceDownload_sourceDownloadId,sourceDownload_sourceScheduleId,sourceDownload_insertedRowDate,sourceDownload_lastUpdatedDate,sourceDownload_retryNumber,sourceDownload_isRunning,sourceDownload_isFinished,sourceDownload_isExcecption,sourceDownload_excecptionDescription";
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
  }
  def toAnyArray() : Array[Any] = {
    Array(sourceDownloadStatId,sourceDownloadId,insertedRowDate,rowsCount,errorRowsCount,totalBytesCount,empryRowsCount,sourceDownload_sourceDownloadId,sourceDownload_sourceScheduleId,sourceDownload_insertedRowDate,sourceDownload_lastUpdatedDate,sourceDownload_retryNumber,sourceDownload_isRunning,sourceDownload_isFinished,sourceDownload_isExcecption,sourceDownload_excecptionDescription)
  }
  def toStringArray() : Array[String] = {
    Array(""+sourceDownloadStatId,""+sourceDownloadId,""+insertedRowDate,""+rowsCount,""+errorRowsCount,""+totalBytesCount,""+empryRowsCount,""+sourceDownload_sourceDownloadId,""+sourceDownload_sourceScheduleId,""+sourceDownload_insertedRowDate,""+sourceDownload_lastUpdatedDate,""+sourceDownload_retryNumber,""+sourceDownload_isRunning,""+sourceDownload_isFinished,""+sourceDownload_isExcecption,""+sourceDownload_excecptionDescription)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "sourceDownloadStatId" => sourceDownloadStatId
      case "sourceDownloadId" => sourceDownloadId
      case "insertedRowDate" => insertedRowDate
      case "rowsCount" => rowsCount
      case "errorRowsCount" => errorRowsCount
      case "totalBytesCount" => totalBytesCount
      case "empryRowsCount" => empryRowsCount
      case "sourceDownload_sourceDownloadId" => sourceDownload_sourceDownloadId
      case "sourceDownload_sourceScheduleId" => sourceDownload_sourceScheduleId
      case "sourceDownload_insertedRowDate" => sourceDownload_insertedRowDate
      case "sourceDownload_lastUpdatedDate" => sourceDownload_lastUpdatedDate
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
      case "sourceDownloadId" => "Long"
      case "insertedRowDate" => "java.util.Date"
      case "rowsCount" => "Long"
      case "errorRowsCount" => "Long"
      case "totalBytesCount" => "Long"
      case "empryRowsCount" => "Long"
      case "sourceDownload_sourceDownloadId" => "Long"
      case "sourceDownload_sourceScheduleId" => "Long"
      case "sourceDownload_insertedRowDate" => "java.util.Date"
      case "sourceDownload_lastUpdatedDate" => "java.util.Date"
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
case class VSourceDownloadStatColumnDto ( val sourceDownloadStatColumnId : Long, val sourceDownloadId : Long, val sourceViewColumnId : Long, val insertedRowDate : java.util.Date, val columnMinNumber : Double, val columnMaxNumber : Double, val columnMinStr : String, val columnMaxStr : String, val columnNonemptyCount : Long, val sourceDownload_sourceDownloadId : Long, val sourceDownload_sourceScheduleId : Long, val sourceDownload_insertedRowDate : java.util.Date, val sourceDownload_lastUpdatedDate : java.util.Date, val sourceDownload_retryNumber : Int, val sourceDownload_isRunning : Int, val sourceDownload_isFinished : Int, val sourceDownload_isExcecption : Int, val sourceDownload_excecptionDescription : String, val sourceViewColumn_sourceViewColumnId : Long, val sourceViewColumn_sourceViewId : Long, val sourceViewColumn_insertedRowDate : java.util.Date, val sourceViewColumn_guid : Long, val sourceViewColumn_columnName : String, val sourceViewColumn_columnType : String ) extends BaseReadOnlyDto {
  def tableName : String = {
    "vSourceDownloadStatColumn";
  }
  def fields : String = {
    "sourceDownloadStatColumnId,sourceDownloadId,sourceViewColumnId,insertedRowDate,columnMinNumber,columnMaxNumber,columnMinStr,columnMaxStr,columnNonemptyCount,sourceDownload_sourceDownloadId,sourceDownload_sourceScheduleId,sourceDownload_insertedRowDate,sourceDownload_lastUpdatedDate,sourceDownload_retryNumber,sourceDownload_isRunning,sourceDownload_isFinished,sourceDownload_isExcecption,sourceDownload_excecptionDescription,sourceViewColumn_sourceViewColumnId,sourceViewColumn_sourceViewId,sourceViewColumn_insertedRowDate,sourceViewColumn_guid,sourceViewColumn_columnName,sourceViewColumn_columnType";
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
  }
  def toAnyArray() : Array[Any] = {
    Array(sourceDownloadStatColumnId,sourceDownloadId,sourceViewColumnId,insertedRowDate,columnMinNumber,columnMaxNumber,columnMinStr,columnMaxStr,columnNonemptyCount,sourceDownload_sourceDownloadId,sourceDownload_sourceScheduleId,sourceDownload_insertedRowDate,sourceDownload_lastUpdatedDate,sourceDownload_retryNumber,sourceDownload_isRunning,sourceDownload_isFinished,sourceDownload_isExcecption,sourceDownload_excecptionDescription,sourceViewColumn_sourceViewColumnId,sourceViewColumn_sourceViewId,sourceViewColumn_insertedRowDate,sourceViewColumn_guid,sourceViewColumn_columnName,sourceViewColumn_columnType)
  }
  def toStringArray() : Array[String] = {
    Array(""+sourceDownloadStatColumnId,""+sourceDownloadId,""+sourceViewColumnId,""+insertedRowDate,""+columnMinNumber,""+columnMaxNumber,""+columnMinStr,""+columnMaxStr,""+columnNonemptyCount,""+sourceDownload_sourceDownloadId,""+sourceDownload_sourceScheduleId,""+sourceDownload_insertedRowDate,""+sourceDownload_lastUpdatedDate,""+sourceDownload_retryNumber,""+sourceDownload_isRunning,""+sourceDownload_isFinished,""+sourceDownload_isExcecption,""+sourceDownload_excecptionDescription,""+sourceViewColumn_sourceViewColumnId,""+sourceViewColumn_sourceViewId,""+sourceViewColumn_insertedRowDate,""+sourceViewColumn_guid,""+sourceViewColumn_columnName,""+sourceViewColumn_columnType)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "sourceDownloadStatColumnId" => sourceDownloadStatColumnId
      case "sourceDownloadId" => sourceDownloadId
      case "sourceViewColumnId" => sourceViewColumnId
      case "insertedRowDate" => insertedRowDate
      case "columnMinNumber" => columnMinNumber
      case "columnMaxNumber" => columnMaxNumber
      case "columnMinStr" => columnMinStr
      case "columnMaxStr" => columnMaxStr
      case "columnNonemptyCount" => columnNonemptyCount
      case "sourceDownload_sourceDownloadId" => sourceDownload_sourceDownloadId
      case "sourceDownload_sourceScheduleId" => sourceDownload_sourceScheduleId
      case "sourceDownload_insertedRowDate" => sourceDownload_insertedRowDate
      case "sourceDownload_lastUpdatedDate" => sourceDownload_lastUpdatedDate
      case "sourceDownload_retryNumber" => sourceDownload_retryNumber
      case "sourceDownload_isRunning" => sourceDownload_isRunning
      case "sourceDownload_isFinished" => sourceDownload_isFinished
      case "sourceDownload_isExcecption" => sourceDownload_isExcecption
      case "sourceDownload_excecptionDescription" => sourceDownload_excecptionDescription
      case "sourceViewColumn_sourceViewColumnId" => sourceViewColumn_sourceViewColumnId
      case "sourceViewColumn_sourceViewId" => sourceViewColumn_sourceViewId
      case "sourceViewColumn_insertedRowDate" => sourceViewColumn_insertedRowDate
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
      case "sourceDownloadId" => "Long"
      case "sourceViewColumnId" => "Long"
      case "insertedRowDate" => "java.util.Date"
      case "columnMinNumber" => "Double"
      case "columnMaxNumber" => "Double"
      case "columnMinStr" => "String"
      case "columnMaxStr" => "String"
      case "columnNonemptyCount" => "Long"
      case "sourceDownload_sourceDownloadId" => "Long"
      case "sourceDownload_sourceScheduleId" => "Long"
      case "sourceDownload_insertedRowDate" => "java.util.Date"
      case "sourceDownload_lastUpdatedDate" => "java.util.Date"
      case "sourceDownload_retryNumber" => "Int"
      case "sourceDownload_isRunning" => "Int"
      case "sourceDownload_isFinished" => "Int"
      case "sourceDownload_isExcecption" => "Int"
      case "sourceDownload_excecptionDescription" => "String"
      case "sourceViewColumn_sourceViewColumnId" => "Long"
      case "sourceViewColumn_sourceViewId" => "Long"
      case "sourceViewColumn_insertedRowDate" => "java.util.Date"
      case "sourceViewColumn_guid" => "Long"
      case "sourceViewColumn_columnName" => "String"
      case "sourceViewColumn_columnType" => "String"
      case _ => "Object"
    }
    ret
  }
}
case class VSourceInstanceDto ( val sourceInstanceId : Long, val sourceTypeId : Long, val sourceInstanceName : String, val errorCount : Long, val correctCount : Long, val lastStatus : String, val lastConnectionDate : java.util.Date, val insertedRowDate : java.util.Date, val sourceType_sourceTypeId : Long, val sourceType_sourceTypeName : String, val sourceType_sourceTypeClass : String, val sourceType_insertedRowDate : java.util.Date ) extends BaseReadOnlyDto {
  def tableName : String = {
    "vSourceInstance";
  }
  def fields : String = {
    "sourceInstanceId,sourceTypeId,sourceInstanceName,errorCount,correctCount,lastStatus,lastConnectionDate,insertedRowDate,sourceType_sourceTypeId,sourceType_sourceTypeName,sourceType_sourceTypeClass,sourceType_insertedRowDate";
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
  }
  def toAnyArray() : Array[Any] = {
    Array(sourceInstanceId,sourceTypeId,sourceInstanceName,errorCount,correctCount,lastStatus,lastConnectionDate,insertedRowDate,sourceType_sourceTypeId,sourceType_sourceTypeName,sourceType_sourceTypeClass,sourceType_insertedRowDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+sourceInstanceId,""+sourceTypeId,""+sourceInstanceName,""+errorCount,""+correctCount,""+lastStatus,""+lastConnectionDate,""+insertedRowDate,""+sourceType_sourceTypeId,""+sourceType_sourceTypeName,""+sourceType_sourceTypeClass,""+sourceType_insertedRowDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "sourceInstanceId" => sourceInstanceId
      case "sourceTypeId" => sourceTypeId
      case "sourceInstanceName" => sourceInstanceName
      case "errorCount" => errorCount
      case "correctCount" => correctCount
      case "lastStatus" => lastStatus
      case "lastConnectionDate" => lastConnectionDate
      case "insertedRowDate" => insertedRowDate
      case "sourceType_sourceTypeId" => sourceType_sourceTypeId
      case "sourceType_sourceTypeName" => sourceType_sourceTypeName
      case "sourceType_sourceTypeClass" => sourceType_sourceTypeClass
      case "sourceType_insertedRowDate" => sourceType_insertedRowDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "sourceInstanceId" => "Long"
      case "sourceTypeId" => "Long"
      case "sourceInstanceName" => "String"
      case "errorCount" => "Long"
      case "correctCount" => "Long"
      case "lastStatus" => "String"
      case "lastConnectionDate" => "java.util.Date"
      case "insertedRowDate" => "java.util.Date"
      case "sourceType_sourceTypeId" => "Long"
      case "sourceType_sourceTypeName" => "String"
      case "sourceType_sourceTypeClass" => "String"
      case "sourceType_insertedRowDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
}
case class VSourceParamValueDto ( val sourceInstanceId : Long, val sourceParamId : Long, val sourceParamValueId : Long, val sourceParamValueVersion : String, val insertedRowDate : java.util.Date, val paramValue : String, val sourceInstance_sourceInstanceId : Long, val sourceInstance_sourceTypeId : Long, val sourceInstance_sourceInstanceName : String, val sourceInstance_errorCount : Long, val sourceInstance_correctCount : Long, val sourceInstance_lastStatus : String, val sourceInstance_lastConnectionDate : java.util.Date, val sourceInstance_insertedRowDate : java.util.Date, val sourceParam_sourceParamId : Long, val sourceParam_sourceParamName : String, val sourceParam_sourceParamType : String, val sourceParam_possibleValues : String, val sourceParam_insertedRowDate : java.util.Date ) extends BaseReadOnlyDto {
  def tableName : String = {
    "vSourceParamValue";
  }
  def fields : String = {
    "sourceInstanceId,sourceParamId,sourceParamValueId,sourceParamValueVersion,insertedRowDate,paramValue,sourceInstance_sourceInstanceId,sourceInstance_sourceTypeId,sourceInstance_sourceInstanceName,sourceInstance_errorCount,sourceInstance_correctCount,sourceInstance_lastStatus,sourceInstance_lastConnectionDate,sourceInstance_insertedRowDate,sourceParam_sourceParamId,sourceParam_sourceParamName,sourceParam_sourceParamType,sourceParam_possibleValues,sourceParam_insertedRowDate";
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
  }
  def toAnyArray() : Array[Any] = {
    Array(sourceInstanceId,sourceParamId,sourceParamValueId,sourceParamValueVersion,insertedRowDate,paramValue,sourceInstance_sourceInstanceId,sourceInstance_sourceTypeId,sourceInstance_sourceInstanceName,sourceInstance_errorCount,sourceInstance_correctCount,sourceInstance_lastStatus,sourceInstance_lastConnectionDate,sourceInstance_insertedRowDate,sourceParam_sourceParamId,sourceParam_sourceParamName,sourceParam_sourceParamType,sourceParam_possibleValues,sourceParam_insertedRowDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+sourceInstanceId,""+sourceParamId,""+sourceParamValueId,""+sourceParamValueVersion,""+insertedRowDate,""+paramValue,""+sourceInstance_sourceInstanceId,""+sourceInstance_sourceTypeId,""+sourceInstance_sourceInstanceName,""+sourceInstance_errorCount,""+sourceInstance_correctCount,""+sourceInstance_lastStatus,""+sourceInstance_lastConnectionDate,""+sourceInstance_insertedRowDate,""+sourceParam_sourceParamId,""+sourceParam_sourceParamName,""+sourceParam_sourceParamType,""+sourceParam_possibleValues,""+sourceParam_insertedRowDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "sourceInstanceId" => sourceInstanceId
      case "sourceParamId" => sourceParamId
      case "sourceParamValueId" => sourceParamValueId
      case "sourceParamValueVersion" => sourceParamValueVersion
      case "insertedRowDate" => insertedRowDate
      case "paramValue" => paramValue
      case "sourceInstance_sourceInstanceId" => sourceInstance_sourceInstanceId
      case "sourceInstance_sourceTypeId" => sourceInstance_sourceTypeId
      case "sourceInstance_sourceInstanceName" => sourceInstance_sourceInstanceName
      case "sourceInstance_errorCount" => sourceInstance_errorCount
      case "sourceInstance_correctCount" => sourceInstance_correctCount
      case "sourceInstance_lastStatus" => sourceInstance_lastStatus
      case "sourceInstance_lastConnectionDate" => sourceInstance_lastConnectionDate
      case "sourceInstance_insertedRowDate" => sourceInstance_insertedRowDate
      case "sourceParam_sourceParamId" => sourceParam_sourceParamId
      case "sourceParam_sourceParamName" => sourceParam_sourceParamName
      case "sourceParam_sourceParamType" => sourceParam_sourceParamType
      case "sourceParam_possibleValues" => sourceParam_possibleValues
      case "sourceParam_insertedRowDate" => sourceParam_insertedRowDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "sourceInstanceId" => "Long"
      case "sourceParamId" => "Long"
      case "sourceParamValueId" => "Long"
      case "sourceParamValueVersion" => "String"
      case "insertedRowDate" => "java.util.Date"
      case "paramValue" => "String"
      case "sourceInstance_sourceInstanceId" => "Long"
      case "sourceInstance_sourceTypeId" => "Long"
      case "sourceInstance_sourceInstanceName" => "String"
      case "sourceInstance_errorCount" => "Long"
      case "sourceInstance_correctCount" => "Long"
      case "sourceInstance_lastStatus" => "String"
      case "sourceInstance_lastConnectionDate" => "java.util.Date"
      case "sourceInstance_insertedRowDate" => "java.util.Date"
      case "sourceParam_sourceParamId" => "Long"
      case "sourceParam_sourceParamName" => "String"
      case "sourceParam_sourceParamType" => "String"
      case "sourceParam_possibleValues" => "String"
      case "sourceParam_insertedRowDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
}
case class VSourceScheduleDto ( val sourceScheduleId : Long, val sourceViewId : Long, val executorStorageId : Long, val insertedRowDate : java.util.Date, val guid : Long, val onDemand : Int, val startTime : java.util.Date, val intervalValue : Long, val executorStorage_executorStorageId : Long, val executorStorage_executorHostId : Long, val executorStorage_executorStorageTypeId : Long, val executorStorage_storageDefinition : String, val executorStorage_storageBasePath : String, val executorStorage_storageFulllPath : String, val executorStorage_isRunning : Int, val executorStorage_portNumber : Int, val executorStorage_insertedRowDate : java.util.Date, val executorStorage_guid : Long, val sourceView_sourceViewId : Long, val sourceView_sourceInstanceId : Long, val sourceView_sourceViewTypeId : Long, val sourceView_sourceViewName : String, val sourceView_sourceViewDefinition : String, val sourceView_insertedRowDate : java.util.Date ) extends BaseReadOnlyDto {
  def tableName : String = {
    "vSourceSchedule";
  }
  def fields : String = {
    "sourceScheduleId,sourceViewId,executorStorageId,insertedRowDate,guid,onDemand,startTime,intervalValue,executorStorage_executorStorageId,executorStorage_executorHostId,executorStorage_executorStorageTypeId,executorStorage_storageDefinition,executorStorage_storageBasePath,executorStorage_storageFulllPath,executorStorage_isRunning,executorStorage_portNumber,executorStorage_insertedRowDate,executorStorage_guid,sourceView_sourceViewId,sourceView_sourceInstanceId,sourceView_sourceViewTypeId,sourceView_sourceViewName,sourceView_sourceViewDefinition,sourceView_insertedRowDate";
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
  }
  def toAnyArray() : Array[Any] = {
    Array(sourceScheduleId,sourceViewId,executorStorageId,insertedRowDate,guid,onDemand,startTime,intervalValue,executorStorage_executorStorageId,executorStorage_executorHostId,executorStorage_executorStorageTypeId,executorStorage_storageDefinition,executorStorage_storageBasePath,executorStorage_storageFulllPath,executorStorage_isRunning,executorStorage_portNumber,executorStorage_insertedRowDate,executorStorage_guid,sourceView_sourceViewId,sourceView_sourceInstanceId,sourceView_sourceViewTypeId,sourceView_sourceViewName,sourceView_sourceViewDefinition,sourceView_insertedRowDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+sourceScheduleId,""+sourceViewId,""+executorStorageId,""+insertedRowDate,""+guid,""+onDemand,""+startTime,""+intervalValue,""+executorStorage_executorStorageId,""+executorStorage_executorHostId,""+executorStorage_executorStorageTypeId,""+executorStorage_storageDefinition,""+executorStorage_storageBasePath,""+executorStorage_storageFulllPath,""+executorStorage_isRunning,""+executorStorage_portNumber,""+executorStorage_insertedRowDate,""+executorStorage_guid,""+sourceView_sourceViewId,""+sourceView_sourceInstanceId,""+sourceView_sourceViewTypeId,""+sourceView_sourceViewName,""+sourceView_sourceViewDefinition,""+sourceView_insertedRowDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "sourceScheduleId" => sourceScheduleId
      case "sourceViewId" => sourceViewId
      case "executorStorageId" => executorStorageId
      case "insertedRowDate" => insertedRowDate
      case "guid" => guid
      case "onDemand" => onDemand
      case "startTime" => startTime
      case "intervalValue" => intervalValue
      case "executorStorage_executorStorageId" => executorStorage_executorStorageId
      case "executorStorage_executorHostId" => executorStorage_executorHostId
      case "executorStorage_executorStorageTypeId" => executorStorage_executorStorageTypeId
      case "executorStorage_storageDefinition" => executorStorage_storageDefinition
      case "executorStorage_storageBasePath" => executorStorage_storageBasePath
      case "executorStorage_storageFulllPath" => executorStorage_storageFulllPath
      case "executorStorage_isRunning" => executorStorage_isRunning
      case "executorStorage_portNumber" => executorStorage_portNumber
      case "executorStorage_insertedRowDate" => executorStorage_insertedRowDate
      case "executorStorage_guid" => executorStorage_guid
      case "sourceView_sourceViewId" => sourceView_sourceViewId
      case "sourceView_sourceInstanceId" => sourceView_sourceInstanceId
      case "sourceView_sourceViewTypeId" => sourceView_sourceViewTypeId
      case "sourceView_sourceViewName" => sourceView_sourceViewName
      case "sourceView_sourceViewDefinition" => sourceView_sourceViewDefinition
      case "sourceView_insertedRowDate" => sourceView_insertedRowDate
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
      case "guid" => "Long"
      case "onDemand" => "Int"
      case "startTime" => "java.util.Date"
      case "intervalValue" => "Long"
      case "executorStorage_executorStorageId" => "Long"
      case "executorStorage_executorHostId" => "Long"
      case "executorStorage_executorStorageTypeId" => "Long"
      case "executorStorage_storageDefinition" => "String"
      case "executorStorage_storageBasePath" => "String"
      case "executorStorage_storageFulllPath" => "String"
      case "executorStorage_isRunning" => "Int"
      case "executorStorage_portNumber" => "Int"
      case "executorStorage_insertedRowDate" => "java.util.Date"
      case "executorStorage_guid" => "Long"
      case "sourceView_sourceViewId" => "Long"
      case "sourceView_sourceInstanceId" => "Long"
      case "sourceView_sourceViewTypeId" => "Long"
      case "sourceView_sourceViewName" => "String"
      case "sourceView_sourceViewDefinition" => "String"
      case "sourceView_insertedRowDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
}
case class VSourceTypeParamDto ( val sourceTypeId : Long, val sourceParamId : Long, val isRequired : Int, val insertedRowDate : java.util.Date, val sourceParam_sourceParamId : Long, val sourceParam_sourceParamName : String, val sourceParam_sourceParamType : String, val sourceParam_possibleValues : String, val sourceParam_insertedRowDate : java.util.Date, val sourceType_sourceTypeId : Long, val sourceType_sourceTypeName : String, val sourceType_sourceTypeClass : String, val sourceType_insertedRowDate : java.util.Date ) extends BaseReadOnlyDto {
  def tableName : String = {
    "vSourceTypeParam";
  }
  def fields : String = {
    "sourceTypeId,sourceParamId,isRequired,insertedRowDate,sourceParam_sourceParamId,sourceParam_sourceParamName,sourceParam_sourceParamType,sourceParam_possibleValues,sourceParam_insertedRowDate,sourceType_sourceTypeId,sourceType_sourceTypeName,sourceType_sourceTypeClass,sourceType_insertedRowDate";
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
  }
  def toAnyArray() : Array[Any] = {
    Array(sourceTypeId,sourceParamId,isRequired,insertedRowDate,sourceParam_sourceParamId,sourceParam_sourceParamName,sourceParam_sourceParamType,sourceParam_possibleValues,sourceParam_insertedRowDate,sourceType_sourceTypeId,sourceType_sourceTypeName,sourceType_sourceTypeClass,sourceType_insertedRowDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+sourceTypeId,""+sourceParamId,""+isRequired,""+insertedRowDate,""+sourceParam_sourceParamId,""+sourceParam_sourceParamName,""+sourceParam_sourceParamType,""+sourceParam_possibleValues,""+sourceParam_insertedRowDate,""+sourceType_sourceTypeId,""+sourceType_sourceTypeName,""+sourceType_sourceTypeClass,""+sourceType_insertedRowDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "sourceTypeId" => sourceTypeId
      case "sourceParamId" => sourceParamId
      case "isRequired" => isRequired
      case "insertedRowDate" => insertedRowDate
      case "sourceParam_sourceParamId" => sourceParam_sourceParamId
      case "sourceParam_sourceParamName" => sourceParam_sourceParamName
      case "sourceParam_sourceParamType" => sourceParam_sourceParamType
      case "sourceParam_possibleValues" => sourceParam_possibleValues
      case "sourceParam_insertedRowDate" => sourceParam_insertedRowDate
      case "sourceType_sourceTypeId" => sourceType_sourceTypeId
      case "sourceType_sourceTypeName" => sourceType_sourceTypeName
      case "sourceType_sourceTypeClass" => sourceType_sourceTypeClass
      case "sourceType_insertedRowDate" => sourceType_insertedRowDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "sourceTypeId" => "Long"
      case "sourceParamId" => "Long"
      case "isRequired" => "Int"
      case "insertedRowDate" => "java.util.Date"
      case "sourceParam_sourceParamId" => "Long"
      case "sourceParam_sourceParamName" => "String"
      case "sourceParam_sourceParamType" => "String"
      case "sourceParam_possibleValues" => "String"
      case "sourceParam_insertedRowDate" => "java.util.Date"
      case "sourceType_sourceTypeId" => "Long"
      case "sourceType_sourceTypeName" => "String"
      case "sourceType_sourceTypeClass" => "String"
      case "sourceType_insertedRowDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
}
case class VSourceViewDto ( val sourceViewId : Long, val sourceInstanceId : Long, val sourceViewTypeId : Long, val sourceViewName : String, val sourceViewDefinition : String, val insertedRowDate : java.util.Date, val sourceInstance_sourceInstanceId : Long, val sourceInstance_sourceTypeId : Long, val sourceInstance_sourceInstanceName : String, val sourceInstance_errorCount : Long, val sourceInstance_correctCount : Long, val sourceInstance_lastStatus : String, val sourceInstance_lastConnectionDate : java.util.Date, val sourceInstance_insertedRowDate : java.util.Date, val sourceViewType_sourceViewTypeId : Long, val sourceViewType_sourceViewTypeName : String, val sourceViewType_sourceViewTypeClass : String, val sourceViewType_insertedRowDate : java.util.Date ) extends BaseReadOnlyDto {
  def tableName : String = {
    "vSourceView";
  }
  def fields : String = {
    "sourceViewId,sourceInstanceId,sourceViewTypeId,sourceViewName,sourceViewDefinition,insertedRowDate,sourceInstance_sourceInstanceId,sourceInstance_sourceTypeId,sourceInstance_sourceInstanceName,sourceInstance_errorCount,sourceInstance_correctCount,sourceInstance_lastStatus,sourceInstance_lastConnectionDate,sourceInstance_insertedRowDate,sourceViewType_sourceViewTypeId,sourceViewType_sourceViewTypeName,sourceViewType_sourceViewTypeClass,sourceViewType_insertedRowDate";
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
  }
  def toAnyArray() : Array[Any] = {
    Array(sourceViewId,sourceInstanceId,sourceViewTypeId,sourceViewName,sourceViewDefinition,insertedRowDate,sourceInstance_sourceInstanceId,sourceInstance_sourceTypeId,sourceInstance_sourceInstanceName,sourceInstance_errorCount,sourceInstance_correctCount,sourceInstance_lastStatus,sourceInstance_lastConnectionDate,sourceInstance_insertedRowDate,sourceViewType_sourceViewTypeId,sourceViewType_sourceViewTypeName,sourceViewType_sourceViewTypeClass,sourceViewType_insertedRowDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+sourceViewId,""+sourceInstanceId,""+sourceViewTypeId,""+sourceViewName,""+sourceViewDefinition,""+insertedRowDate,""+sourceInstance_sourceInstanceId,""+sourceInstance_sourceTypeId,""+sourceInstance_sourceInstanceName,""+sourceInstance_errorCount,""+sourceInstance_correctCount,""+sourceInstance_lastStatus,""+sourceInstance_lastConnectionDate,""+sourceInstance_insertedRowDate,""+sourceViewType_sourceViewTypeId,""+sourceViewType_sourceViewTypeName,""+sourceViewType_sourceViewTypeClass,""+sourceViewType_insertedRowDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "sourceViewId" => sourceViewId
      case "sourceInstanceId" => sourceInstanceId
      case "sourceViewTypeId" => sourceViewTypeId
      case "sourceViewName" => sourceViewName
      case "sourceViewDefinition" => sourceViewDefinition
      case "insertedRowDate" => insertedRowDate
      case "sourceInstance_sourceInstanceId" => sourceInstance_sourceInstanceId
      case "sourceInstance_sourceTypeId" => sourceInstance_sourceTypeId
      case "sourceInstance_sourceInstanceName" => sourceInstance_sourceInstanceName
      case "sourceInstance_errorCount" => sourceInstance_errorCount
      case "sourceInstance_correctCount" => sourceInstance_correctCount
      case "sourceInstance_lastStatus" => sourceInstance_lastStatus
      case "sourceInstance_lastConnectionDate" => sourceInstance_lastConnectionDate
      case "sourceInstance_insertedRowDate" => sourceInstance_insertedRowDate
      case "sourceViewType_sourceViewTypeId" => sourceViewType_sourceViewTypeId
      case "sourceViewType_sourceViewTypeName" => sourceViewType_sourceViewTypeName
      case "sourceViewType_sourceViewTypeClass" => sourceViewType_sourceViewTypeClass
      case "sourceViewType_insertedRowDate" => sourceViewType_insertedRowDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "sourceViewId" => "Long"
      case "sourceInstanceId" => "Long"
      case "sourceViewTypeId" => "Long"
      case "sourceViewName" => "String"
      case "sourceViewDefinition" => "String"
      case "insertedRowDate" => "java.util.Date"
      case "sourceInstance_sourceInstanceId" => "Long"
      case "sourceInstance_sourceTypeId" => "Long"
      case "sourceInstance_sourceInstanceName" => "String"
      case "sourceInstance_errorCount" => "Long"
      case "sourceInstance_correctCount" => "Long"
      case "sourceInstance_lastStatus" => "String"
      case "sourceInstance_lastConnectionDate" => "java.util.Date"
      case "sourceInstance_insertedRowDate" => "java.util.Date"
      case "sourceViewType_sourceViewTypeId" => "Long"
      case "sourceViewType_sourceViewTypeName" => "String"
      case "sourceViewType_sourceViewTypeClass" => "String"
      case "sourceViewType_insertedRowDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
}
case class VSourceViewColumnDto ( val sourceViewColumnId : Long, val sourceViewId : Long, val insertedRowDate : java.util.Date, val guid : Long, val columnName : String, val columnType : String, val sourceView_sourceViewId : Long, val sourceView_sourceInstanceId : Long, val sourceView_sourceViewTypeId : Long, val sourceView_sourceViewName : String, val sourceView_sourceViewDefinition : String, val sourceView_insertedRowDate : java.util.Date ) extends BaseReadOnlyDto {
  def tableName : String = {
    "vSourceViewColumn";
  }
  def fields : String = {
    "sourceViewColumnId,sourceViewId,insertedRowDate,guid,columnName,columnType,sourceView_sourceViewId,sourceView_sourceInstanceId,sourceView_sourceViewTypeId,sourceView_sourceViewName,sourceView_sourceViewDefinition,sourceView_insertedRowDate";
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
  def getInsertedRowDate() : java.util.Date = {
    insertedRowDate
  }
  def toAnyArray() : Array[Any] = {
    Array(sourceViewColumnId,sourceViewId,insertedRowDate,guid,columnName,columnType,sourceView_sourceViewId,sourceView_sourceInstanceId,sourceView_sourceViewTypeId,sourceView_sourceViewName,sourceView_sourceViewDefinition,sourceView_insertedRowDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+sourceViewColumnId,""+sourceViewId,""+insertedRowDate,""+guid,""+columnName,""+columnType,""+sourceView_sourceViewId,""+sourceView_sourceInstanceId,""+sourceView_sourceViewTypeId,""+sourceView_sourceViewName,""+sourceView_sourceViewDefinition,""+sourceView_insertedRowDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "sourceViewColumnId" => sourceViewColumnId
      case "sourceViewId" => sourceViewId
      case "insertedRowDate" => insertedRowDate
      case "guid" => guid
      case "columnName" => columnName
      case "columnType" => columnType
      case "sourceView_sourceViewId" => sourceView_sourceViewId
      case "sourceView_sourceInstanceId" => sourceView_sourceInstanceId
      case "sourceView_sourceViewTypeId" => sourceView_sourceViewTypeId
      case "sourceView_sourceViewName" => sourceView_sourceViewName
      case "sourceView_sourceViewDefinition" => sourceView_sourceViewDefinition
      case "sourceView_insertedRowDate" => sourceView_insertedRowDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : String = {
    val ret = name match {
      case "sourceViewColumnId" => "Long"
      case "sourceViewId" => "Long"
      case "insertedRowDate" => "java.util.Date"
      case "guid" => "Long"
      case "columnName" => "String"
      case "columnType" => "String"
      case "sourceView_sourceViewId" => "Long"
      case "sourceView_sourceInstanceId" => "Long"
      case "sourceView_sourceViewTypeId" => "Long"
      case "sourceView_sourceViewName" => "String"
      case "sourceView_sourceViewDefinition" => "String"
      case "sourceView_insertedRowDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
}





















