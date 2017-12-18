package com.mlasaf.dto

import com.lucidchart.relate._

case class AlgorithmColumnTypeDto ( val algorithmColumnTypeId : Long, val algorithmColumnTypeName : String, val algorithmColumnTypeDescription : String, val insertedRowDate : java.util.Date ) extends BaseDto {
  def tableName : String = {
    "algorithmColumnType";
  }
  def fields : String = {
    "algorithmColumnTypeId,algorithmColumnTypeName,algorithmColumnTypeDescription,insertedRowDate";
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
    Array(algorithmColumnTypeId,algorithmColumnTypeName,algorithmColumnTypeDescription,insertedRowDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+algorithmColumnTypeId,""+algorithmColumnTypeName,""+algorithmColumnTypeDescription,""+insertedRowDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "algorithmColumnTypeId" => algorithmColumnTypeId
      case "algorithmColumnTypeName" => algorithmColumnTypeName
      case "algorithmColumnTypeDescription" => algorithmColumnTypeDescription
      case "insertedRowDate" => insertedRowDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : Any = {
    val ret = name match {
      case "algorithmColumnTypeId" => "Long"
      case "algorithmColumnTypeName" => "String"
      case "algorithmColumnTypeDescription" => "String"
      case "insertedRowDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into algorithmColumnType(algorithmColumnTypeId,algorithmColumnTypeName,algorithmColumnTypeDescription,insertedRowDate) values (?,?,?,?)");
    stat.setObject(1, algorithmColumnTypeId);
    stat.setObject(2, algorithmColumnTypeName);
    stat.setObject(3, algorithmColumnTypeDescription);
    stat.setObject(4, insertedRowDate);
    return stat;
  }
}
case class AlgorithmImplementationDto ( val algorithmImplementationId : Long, val insertedRowDate : java.util.Date, val algorithmTypeVersionId : Long, val executorTypeId : Long, val algorithmImplementationName : String, val algorithmImplementationClass : String ) extends BaseDto {
  def tableName : String = {
    "algorithmImplementation";
  }
  def fields : String = {
    "algorithmImplementationId,insertedRowDate,algorithmTypeVersionId,executorTypeId,algorithmImplementationName,algorithmImplementationClass";
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
    Array(algorithmImplementationId,insertedRowDate,algorithmTypeVersionId,executorTypeId,algorithmImplementationName,algorithmImplementationClass)
  }
  def toStringArray() : Array[String] = {
    Array(""+algorithmImplementationId,""+insertedRowDate,""+algorithmTypeVersionId,""+executorTypeId,""+algorithmImplementationName,""+algorithmImplementationClass)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "algorithmImplementationId" => algorithmImplementationId
      case "insertedRowDate" => insertedRowDate
      case "algorithmTypeVersionId" => algorithmTypeVersionId
      case "executorTypeId" => executorTypeId
      case "algorithmImplementationName" => algorithmImplementationName
      case "algorithmImplementationClass" => algorithmImplementationClass
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : Any = {
    val ret = name match {
      case "algorithmImplementationId" => "Long"
      case "insertedRowDate" => "java.util.Date"
      case "algorithmTypeVersionId" => "Long"
      case "executorTypeId" => "Long"
      case "algorithmImplementationName" => "String"
      case "algorithmImplementationClass" => "String"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into algorithmImplementation(algorithmImplementationId,insertedRowDate,algorithmTypeVersionId,executorTypeId,algorithmImplementationName,algorithmImplementationClass) values (?,?,?,?,?,?)");
    stat.setObject(1, algorithmImplementationId);
    stat.setObject(2, insertedRowDate);
    stat.setObject(3, algorithmTypeVersionId);
    stat.setObject(4, executorTypeId);
    stat.setObject(5, algorithmImplementationName);
    stat.setObject(6, algorithmImplementationClass);
    return stat;
  }
}
case class AlgorithmOutputDto ( val algorithmOutputId : Long, val insertedRowDate : java.util.Date, val algorithmRunId : Long, val algorithmOutputTypeId : Long, val executorStorageViewId : Long, val outputPath : String ) extends BaseDto {
  def tableName : String = {
    "algorithmOutput";
  }
  def fields : String = {
    "algorithmOutputId,insertedRowDate,algorithmRunId,algorithmOutputTypeId,executorStorageViewId,outputPath";
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
    Array(algorithmOutputId,insertedRowDate,algorithmRunId,algorithmOutputTypeId,executorStorageViewId,outputPath)
  }
  def toStringArray() : Array[String] = {
    Array(""+algorithmOutputId,""+insertedRowDate,""+algorithmRunId,""+algorithmOutputTypeId,""+executorStorageViewId,""+outputPath)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "algorithmOutputId" => algorithmOutputId
      case "insertedRowDate" => insertedRowDate
      case "algorithmRunId" => algorithmRunId
      case "algorithmOutputTypeId" => algorithmOutputTypeId
      case "executorStorageViewId" => executorStorageViewId
      case "outputPath" => outputPath
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : Any = {
    val ret = name match {
      case "algorithmOutputId" => "Long"
      case "insertedRowDate" => "java.util.Date"
      case "algorithmRunId" => "Long"
      case "algorithmOutputTypeId" => "Long"
      case "executorStorageViewId" => "Long"
      case "outputPath" => "String"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into algorithmOutput(algorithmOutputId,insertedRowDate,algorithmRunId,algorithmOutputTypeId,executorStorageViewId,outputPath) values (?,?,?,?,?,?)");
    stat.setObject(1, algorithmOutputId);
    stat.setObject(2, insertedRowDate);
    stat.setObject(3, algorithmRunId);
    stat.setObject(4, algorithmOutputTypeId);
    stat.setObject(5, executorStorageViewId);
    stat.setObject(6, outputPath);
    return stat;
  }
}
case class AlgorithmOutputTypeDto ( val algorithmOutputTypeId : Long, val algorithmOutputTypeName : String, val insertedRowDate : java.util.Date ) extends BaseDto {
  def tableName : String = {
    "algorithmOutputType";
  }
  def fields : String = {
    "algorithmOutputTypeId,algorithmOutputTypeName,insertedRowDate";
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
    Array(algorithmOutputTypeId,algorithmOutputTypeName,insertedRowDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+algorithmOutputTypeId,""+algorithmOutputTypeName,""+insertedRowDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "algorithmOutputTypeId" => algorithmOutputTypeId
      case "algorithmOutputTypeName" => algorithmOutputTypeName
      case "insertedRowDate" => insertedRowDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : Any = {
    val ret = name match {
      case "algorithmOutputTypeId" => "Long"
      case "algorithmOutputTypeName" => "String"
      case "insertedRowDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into algorithmOutputType(algorithmOutputTypeId,algorithmOutputTypeName,insertedRowDate) values (?,?,?)");
    stat.setObject(1, algorithmOutputTypeId);
    stat.setObject(2, algorithmOutputTypeName);
    stat.setObject(3, insertedRowDate);
    return stat;
  }
}
case class AlgorithmParamDto ( val algorithmParamId : Long, val insertedRowDate : java.util.Date, val algorithmParamName : String, val algorithmParamDescription : String, val algorithmParamType : String ) extends BaseDto {
  def tableName : String = {
    "algorithmParam";
  }
  def fields : String = {
    "algorithmParamId,insertedRowDate,algorithmParamName,algorithmParamDescription,algorithmParamType";
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
    Array(algorithmParamId,insertedRowDate,algorithmParamName,algorithmParamDescription,algorithmParamType)
  }
  def toStringArray() : Array[String] = {
    Array(""+algorithmParamId,""+insertedRowDate,""+algorithmParamName,""+algorithmParamDescription,""+algorithmParamType)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "algorithmParamId" => algorithmParamId
      case "insertedRowDate" => insertedRowDate
      case "algorithmParamName" => algorithmParamName
      case "algorithmParamDescription" => algorithmParamDescription
      case "algorithmParamType" => algorithmParamType
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : Any = {
    val ret = name match {
      case "algorithmParamId" => "Long"
      case "insertedRowDate" => "java.util.Date"
      case "algorithmParamName" => "String"
      case "algorithmParamDescription" => "String"
      case "algorithmParamType" => "String"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into algorithmParam(algorithmParamId,insertedRowDate,algorithmParamName,algorithmParamDescription,algorithmParamType) values (?,?,?,?,?)");
    stat.setObject(1, algorithmParamId);
    stat.setObject(2, insertedRowDate);
    stat.setObject(3, algorithmParamName);
    stat.setObject(4, algorithmParamDescription);
    stat.setObject(5, algorithmParamType);
    return stat;
  }
}
case class AlgorithmParamTypeDto ( val algorithmParamId : Long, val algorithmTypeId : Long, val algorithmTypeVersionId : Long, val insertedRowDate : java.util.Date ) extends BaseDto {
  def tableName : String = {
    "algorithmParamType";
  }
  def fields : String = {
    "algorithmParamId,algorithmTypeId,algorithmTypeVersionId,insertedRowDate";
  }
  def pkFields : String = {
    "";
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
    Array(algorithmParamId,algorithmTypeId,algorithmTypeVersionId,insertedRowDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+algorithmParamId,""+algorithmTypeId,""+algorithmTypeVersionId,""+insertedRowDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "algorithmParamId" => algorithmParamId
      case "algorithmTypeId" => algorithmTypeId
      case "algorithmTypeVersionId" => algorithmTypeVersionId
      case "insertedRowDate" => insertedRowDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : Any = {
    val ret = name match {
      case "algorithmParamId" => "Long"
      case "algorithmTypeId" => "Long"
      case "algorithmTypeVersionId" => "Long"
      case "insertedRowDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into algorithmParamType(algorithmParamId,algorithmTypeId,algorithmTypeVersionId,insertedRowDate) values (?,?,?,?)");
    stat.setObject(1, algorithmParamId);
    stat.setObject(2, algorithmTypeId);
    stat.setObject(3, algorithmTypeVersionId);
    stat.setObject(4, insertedRowDate);
    return stat;
  }
}
case class AlgorithmRunDto ( val algorithmRunId : Long, val algorithmScheduleId : Long, val executorInstanceId : Long, val executorStorageId : Long, val algorithmRunName : String, val insertedRowDate : java.util.Date, val runDate : java.util.Date, val isRunning : Int, val isFinished : Int ) extends BaseDto {
  def tableName : String = {
    "algorithmRun";
  }
  def fields : String = {
    "algorithmRunId,algorithmScheduleId,executorInstanceId,executorStorageId,algorithmRunName,insertedRowDate,runDate,isRunning,isFinished";
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
    Array(algorithmRunId,algorithmScheduleId,executorInstanceId,executorStorageId,algorithmRunName,insertedRowDate,runDate,isRunning,isFinished)
  }
  def toStringArray() : Array[String] = {
    Array(""+algorithmRunId,""+algorithmScheduleId,""+executorInstanceId,""+executorStorageId,""+algorithmRunName,""+insertedRowDate,""+runDate,""+isRunning,""+isFinished)
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
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : Any = {
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
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into algorithmRun(algorithmRunId,algorithmScheduleId,executorInstanceId,executorStorageId,algorithmRunName,insertedRowDate,runDate,isRunning,isFinished) values (?,?,?,?,?,?,?,?,?)");
    stat.setObject(1, algorithmRunId);
    stat.setObject(2, algorithmScheduleId);
    stat.setObject(3, executorInstanceId);
    stat.setObject(4, executorStorageId);
    stat.setObject(5, algorithmRunName);
    stat.setObject(6, insertedRowDate);
    stat.setObject(7, runDate);
    stat.setObject(8, isRunning);
    stat.setObject(9, isFinished);
    return stat;
  }
}
case class AlgorithmRunTypeDto ( val algorithmRunTypeId : Long, val algorithmRunTypeName : String, val insertedRowDate : java.util.Date ) extends BaseDto {
  def tableName : String = {
    "algorithmRunType";
  }
  def fields : String = {
    "algorithmRunTypeId,algorithmRunTypeName,insertedRowDate";
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
    Array(algorithmRunTypeId,algorithmRunTypeName,insertedRowDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+algorithmRunTypeId,""+algorithmRunTypeName,""+insertedRowDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "algorithmRunTypeId" => algorithmRunTypeId
      case "algorithmRunTypeName" => algorithmRunTypeName
      case "insertedRowDate" => insertedRowDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : Any = {
    val ret = name match {
      case "algorithmRunTypeId" => "Long"
      case "algorithmRunTypeName" => "String"
      case "insertedRowDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into algorithmRunType(algorithmRunTypeId,algorithmRunTypeName,insertedRowDate) values (?,?,?)");
    stat.setObject(1, algorithmRunTypeId);
    stat.setObject(2, algorithmRunTypeName);
    stat.setObject(3, insertedRowDate);
    return stat;
  }
}
case class AlgorithmRunViewDto ( val algorithmRunViewId : Long, val algorithmRunId : Long, val executorStorageViewId : Long, val insertedRowDate : java.util.Date, val isDownloaded : Int ) extends BaseDto {
  def tableName : String = {
    "algorithmRunView";
  }
  def fields : String = {
    "algorithmRunViewId,algorithmRunId,executorStorageViewId,insertedRowDate,isDownloaded";
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
    Array(algorithmRunViewId,algorithmRunId,executorStorageViewId,insertedRowDate,isDownloaded)
  }
  def toStringArray() : Array[String] = {
    Array(""+algorithmRunViewId,""+algorithmRunId,""+executorStorageViewId,""+insertedRowDate,""+isDownloaded)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "algorithmRunViewId" => algorithmRunViewId
      case "algorithmRunId" => algorithmRunId
      case "executorStorageViewId" => executorStorageViewId
      case "insertedRowDate" => insertedRowDate
      case "isDownloaded" => isDownloaded
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : Any = {
    val ret = name match {
      case "algorithmRunViewId" => "Long"
      case "algorithmRunId" => "Long"
      case "executorStorageViewId" => "Long"
      case "insertedRowDate" => "java.util.Date"
      case "isDownloaded" => "Int"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into algorithmRunView(algorithmRunViewId,algorithmRunId,executorStorageViewId,insertedRowDate,isDownloaded) values (?,?,?,?,?)");
    stat.setObject(1, algorithmRunViewId);
    stat.setObject(2, algorithmRunId);
    stat.setObject(3, executorStorageViewId);
    stat.setObject(4, insertedRowDate);
    stat.setObject(5, isDownloaded);
    return stat;
  }
}
case class AlgorithmScheduleDto ( val algorithmScheduleId : Long, val algorithmImplementationId : Long, val algorithmScheduleTypeId : Long, val algorithmScheduleName : String, val isScheduled : Int, val insertedRowDate : java.util.Date ) extends BaseDto {
  def tableName : String = {
    "algorithmSchedule";
  }
  def fields : String = {
    "algorithmScheduleId,algorithmImplementationId,algorithmScheduleTypeId,algorithmScheduleName,isScheduled,insertedRowDate";
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
    Array(algorithmScheduleId,algorithmImplementationId,algorithmScheduleTypeId,algorithmScheduleName,isScheduled,insertedRowDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+algorithmScheduleId,""+algorithmImplementationId,""+algorithmScheduleTypeId,""+algorithmScheduleName,""+isScheduled,""+insertedRowDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "algorithmScheduleId" => algorithmScheduleId
      case "algorithmImplementationId" => algorithmImplementationId
      case "algorithmScheduleTypeId" => algorithmScheduleTypeId
      case "algorithmScheduleName" => algorithmScheduleName
      case "isScheduled" => isScheduled
      case "insertedRowDate" => insertedRowDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : Any = {
    val ret = name match {
      case "algorithmScheduleId" => "Long"
      case "algorithmImplementationId" => "Long"
      case "algorithmScheduleTypeId" => "Long"
      case "algorithmScheduleName" => "String"
      case "isScheduled" => "Int"
      case "insertedRowDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into algorithmSchedule(algorithmScheduleId,algorithmImplementationId,algorithmScheduleTypeId,algorithmScheduleName,isScheduled,insertedRowDate) values (?,?,?,?,?,?)");
    stat.setObject(1, algorithmScheduleId);
    stat.setObject(2, algorithmImplementationId);
    stat.setObject(3, algorithmScheduleTypeId);
    stat.setObject(4, algorithmScheduleName);
    stat.setObject(5, isScheduled);
    stat.setObject(6, insertedRowDate);
    return stat;
  }
}
case class AlgorithmScheduleColumnDto ( val algorithmScheduleColumnId : Long, val algorithmScheduleId : Long, val algorithmColumnTypeId : Long, val algorithmScheduleViewId : Long, val sourceViewId : Long, val sourceViewColumnId : Long, val extendedProperties : String, val insertedRowDate : java.util.Date ) extends BaseDto {
  def tableName : String = {
    "algorithmScheduleColumn";
  }
  def fields : String = {
    "algorithmScheduleColumnId,algorithmScheduleId,algorithmColumnTypeId,algorithmScheduleViewId,sourceViewId,sourceViewColumnId,extendedProperties,insertedRowDate";
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
    Array(algorithmScheduleColumnId,algorithmScheduleId,algorithmColumnTypeId,algorithmScheduleViewId,sourceViewId,sourceViewColumnId,extendedProperties,insertedRowDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+algorithmScheduleColumnId,""+algorithmScheduleId,""+algorithmColumnTypeId,""+algorithmScheduleViewId,""+sourceViewId,""+sourceViewColumnId,""+extendedProperties,""+insertedRowDate)
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
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : Any = {
    val ret = name match {
      case "algorithmScheduleColumnId" => "Long"
      case "algorithmScheduleId" => "Long"
      case "algorithmColumnTypeId" => "Long"
      case "algorithmScheduleViewId" => "Long"
      case "sourceViewId" => "Long"
      case "sourceViewColumnId" => "Long"
      case "extendedProperties" => "String"
      case "insertedRowDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into algorithmScheduleColumn(algorithmScheduleColumnId,algorithmScheduleId,algorithmColumnTypeId,algorithmScheduleViewId,sourceViewId,sourceViewColumnId,extendedProperties,insertedRowDate) values (?,?,?,?,?,?,?,?)");
    stat.setObject(1, algorithmScheduleColumnId);
    stat.setObject(2, algorithmScheduleId);
    stat.setObject(3, algorithmColumnTypeId);
    stat.setObject(4, algorithmScheduleViewId);
    stat.setObject(5, sourceViewId);
    stat.setObject(6, sourceViewColumnId);
    stat.setObject(7, extendedProperties);
    stat.setObject(8, insertedRowDate);
    return stat;
  }
}
case class AlgorithmScheduleParamDto ( val algorithmScheduleParamId : Long, val algorithmScheduleId : Long, val algorithmParamId : Long, val algorithmParamValue : String, val insertedRowDate : java.util.Date ) extends BaseDto {
  def tableName : String = {
    "algorithmScheduleParam";
  }
  def fields : String = {
    "algorithmScheduleParamId,algorithmScheduleId,algorithmParamId,algorithmParamValue,insertedRowDate";
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
    Array(algorithmScheduleParamId,algorithmScheduleId,algorithmParamId,algorithmParamValue,insertedRowDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+algorithmScheduleParamId,""+algorithmScheduleId,""+algorithmParamId,""+algorithmParamValue,""+insertedRowDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "algorithmScheduleParamId" => algorithmScheduleParamId
      case "algorithmScheduleId" => algorithmScheduleId
      case "algorithmParamId" => algorithmParamId
      case "algorithmParamValue" => algorithmParamValue
      case "insertedRowDate" => insertedRowDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : Any = {
    val ret = name match {
      case "algorithmScheduleParamId" => "Long"
      case "algorithmScheduleId" => "Long"
      case "algorithmParamId" => "Long"
      case "algorithmParamValue" => "String"
      case "insertedRowDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into algorithmScheduleParam(algorithmScheduleParamId,algorithmScheduleId,algorithmParamId,algorithmParamValue,insertedRowDate) values (?,?,?,?,?)");
    stat.setObject(1, algorithmScheduleParamId);
    stat.setObject(2, algorithmScheduleId);
    stat.setObject(3, algorithmParamId);
    stat.setObject(4, algorithmParamValue);
    stat.setObject(5, insertedRowDate);
    return stat;
  }
}
case class AlgorithmScheduleTypeDto ( val algorithmScheduleTypeId : Long, val algorithmScheduleTypeName : String, val insertedRowDate : java.util.Date ) extends BaseDto {
  def tableName : String = {
    "algorithmScheduleType";
  }
  def fields : String = {
    "algorithmScheduleTypeId,algorithmScheduleTypeName,insertedRowDate";
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
    Array(algorithmScheduleTypeId,algorithmScheduleTypeName,insertedRowDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+algorithmScheduleTypeId,""+algorithmScheduleTypeName,""+insertedRowDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "algorithmScheduleTypeId" => algorithmScheduleTypeId
      case "algorithmScheduleTypeName" => algorithmScheduleTypeName
      case "insertedRowDate" => insertedRowDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : Any = {
    val ret = name match {
      case "algorithmScheduleTypeId" => "Long"
      case "algorithmScheduleTypeName" => "String"
      case "insertedRowDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into algorithmScheduleType(algorithmScheduleTypeId,algorithmScheduleTypeName,insertedRowDate) values (?,?,?)");
    stat.setObject(1, algorithmScheduleTypeId);
    stat.setObject(2, algorithmScheduleTypeName);
    stat.setObject(3, insertedRowDate);
    return stat;
  }
}
case class AlgorithmScheduleViewDto ( val algorithmScheduleViewId : Long, val algorithmScheduleViewTypeId : Long, val algorithmScheduleId : Long, val sourceViewId : Long, val insertedRowDate : java.util.Date, val joinOnDefinition : String ) extends BaseDto {
  def tableName : String = {
    "algorithmScheduleView";
  }
  def fields : String = {
    "algorithmScheduleViewId,algorithmScheduleViewTypeId,algorithmScheduleId,sourceViewId,insertedRowDate,joinOnDefinition";
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
    Array(algorithmScheduleViewId,algorithmScheduleViewTypeId,algorithmScheduleId,sourceViewId,insertedRowDate,joinOnDefinition)
  }
  def toStringArray() : Array[String] = {
    Array(""+algorithmScheduleViewId,""+algorithmScheduleViewTypeId,""+algorithmScheduleId,""+sourceViewId,""+insertedRowDate,""+joinOnDefinition)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "algorithmScheduleViewId" => algorithmScheduleViewId
      case "algorithmScheduleViewTypeId" => algorithmScheduleViewTypeId
      case "algorithmScheduleId" => algorithmScheduleId
      case "sourceViewId" => sourceViewId
      case "insertedRowDate" => insertedRowDate
      case "joinOnDefinition" => joinOnDefinition
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : Any = {
    val ret = name match {
      case "algorithmScheduleViewId" => "Long"
      case "algorithmScheduleViewTypeId" => "Long"
      case "algorithmScheduleId" => "Long"
      case "sourceViewId" => "Long"
      case "insertedRowDate" => "java.util.Date"
      case "joinOnDefinition" => "String"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into algorithmScheduleView(algorithmScheduleViewId,algorithmScheduleViewTypeId,algorithmScheduleId,sourceViewId,insertedRowDate,joinOnDefinition) values (?,?,?,?,?,?)");
    stat.setObject(1, algorithmScheduleViewId);
    stat.setObject(2, algorithmScheduleViewTypeId);
    stat.setObject(3, algorithmScheduleId);
    stat.setObject(4, sourceViewId);
    stat.setObject(5, insertedRowDate);
    stat.setObject(6, joinOnDefinition);
    return stat;
  }
}
case class AlgorithmScheduleViewTypeDto ( val algorithmScheduleViewTypeId : Long, val algorithmScheduleViewTypeName : String, val insertedRowDate : java.util.Date ) extends BaseDto {
  def tableName : String = {
    "algorithmScheduleViewType";
  }
  def fields : String = {
    "algorithmScheduleViewTypeId,algorithmScheduleViewTypeName,insertedRowDate";
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
    Array(algorithmScheduleViewTypeId,algorithmScheduleViewTypeName,insertedRowDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+algorithmScheduleViewTypeId,""+algorithmScheduleViewTypeName,""+insertedRowDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "algorithmScheduleViewTypeId" => algorithmScheduleViewTypeId
      case "algorithmScheduleViewTypeName" => algorithmScheduleViewTypeName
      case "insertedRowDate" => insertedRowDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : Any = {
    val ret = name match {
      case "algorithmScheduleViewTypeId" => "Long"
      case "algorithmScheduleViewTypeName" => "String"
      case "insertedRowDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into algorithmScheduleViewType(algorithmScheduleViewTypeId,algorithmScheduleViewTypeName,insertedRowDate) values (?,?,?)");
    stat.setObject(1, algorithmScheduleViewTypeId);
    stat.setObject(2, algorithmScheduleViewTypeName);
    stat.setObject(3, insertedRowDate);
    return stat;
  }
}
case class AlgorithmTypeDto ( val algorithmTypeId : Long, val algorithmTypeName : String, val algorithmTypeDescription : String, val insertedRowDate : java.util.Date ) extends BaseDto {
  def tableName : String = {
    "algorithmType";
  }
  def fields : String = {
    "algorithmTypeId,algorithmTypeName,algorithmTypeDescription,insertedRowDate";
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
    Array(algorithmTypeId,algorithmTypeName,algorithmTypeDescription,insertedRowDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+algorithmTypeId,""+algorithmTypeName,""+algorithmTypeDescription,""+insertedRowDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "algorithmTypeId" => algorithmTypeId
      case "algorithmTypeName" => algorithmTypeName
      case "algorithmTypeDescription" => algorithmTypeDescription
      case "insertedRowDate" => insertedRowDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : Any = {
    val ret = name match {
      case "algorithmTypeId" => "Long"
      case "algorithmTypeName" => "String"
      case "algorithmTypeDescription" => "String"
      case "insertedRowDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into algorithmType(algorithmTypeId,algorithmTypeName,algorithmTypeDescription,insertedRowDate) values (?,?,?,?)");
    stat.setObject(1, algorithmTypeId);
    stat.setObject(2, algorithmTypeName);
    stat.setObject(3, algorithmTypeDescription);
    stat.setObject(4, insertedRowDate);
    return stat;
  }
}
case class AlgorithmTypeColumnTypeDto ( val algorithmTypeVersionId : Long, val algorithmColumnTypeId : Long, val allowMultiple : Int, val allowEmpty : Int, val insertedRowDate : java.util.Date ) extends BaseDto {
  def tableName : String = {
    "algorithmTypeColumnType";
  }
  def fields : String = {
    "algorithmTypeVersionId,algorithmColumnTypeId,allowMultiple,allowEmpty,insertedRowDate";
  }
  def pkFields : String = {
    "";
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
    Array(algorithmTypeVersionId,algorithmColumnTypeId,allowMultiple,allowEmpty,insertedRowDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+algorithmTypeVersionId,""+algorithmColumnTypeId,""+allowMultiple,""+allowEmpty,""+insertedRowDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "algorithmTypeVersionId" => algorithmTypeVersionId
      case "algorithmColumnTypeId" => algorithmColumnTypeId
      case "allowMultiple" => allowMultiple
      case "allowEmpty" => allowEmpty
      case "insertedRowDate" => insertedRowDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : Any = {
    val ret = name match {
      case "algorithmTypeVersionId" => "Long"
      case "algorithmColumnTypeId" => "Long"
      case "allowMultiple" => "Int"
      case "allowEmpty" => "Int"
      case "insertedRowDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into algorithmTypeColumnType(algorithmTypeVersionId,algorithmColumnTypeId,allowMultiple,allowEmpty,insertedRowDate) values (?,?,?,?,?)");
    stat.setObject(1, algorithmTypeVersionId);
    stat.setObject(2, algorithmColumnTypeId);
    stat.setObject(3, allowMultiple);
    stat.setObject(4, allowEmpty);
    stat.setObject(5, insertedRowDate);
    return stat;
  }
}
case class AlgorithmTypeOutputTypeDto ( val algorithmTypeOutputTypeId : Long, val algorithmTypeVersionId : Long, val algorithmOutputTypeId : Long, val isMandatory : Int, val insertedRowDate : java.util.Date ) extends BaseDto {
  def tableName : String = {
    "algorithmTypeOutputType";
  }
  def fields : String = {
    "algorithmTypeOutputTypeId,algorithmTypeVersionId,algorithmOutputTypeId,isMandatory,insertedRowDate";
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
    Array(algorithmTypeOutputTypeId,algorithmTypeVersionId,algorithmOutputTypeId,isMandatory,insertedRowDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+algorithmTypeOutputTypeId,""+algorithmTypeVersionId,""+algorithmOutputTypeId,""+isMandatory,""+insertedRowDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "algorithmTypeOutputTypeId" => algorithmTypeOutputTypeId
      case "algorithmTypeVersionId" => algorithmTypeVersionId
      case "algorithmOutputTypeId" => algorithmOutputTypeId
      case "isMandatory" => isMandatory
      case "insertedRowDate" => insertedRowDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : Any = {
    val ret = name match {
      case "algorithmTypeOutputTypeId" => "Long"
      case "algorithmTypeVersionId" => "Long"
      case "algorithmOutputTypeId" => "Long"
      case "isMandatory" => "Int"
      case "insertedRowDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into algorithmTypeOutputType(algorithmTypeOutputTypeId,algorithmTypeVersionId,algorithmOutputTypeId,isMandatory,insertedRowDate) values (?,?,?,?,?)");
    stat.setObject(1, algorithmTypeOutputTypeId);
    stat.setObject(2, algorithmTypeVersionId);
    stat.setObject(3, algorithmOutputTypeId);
    stat.setObject(4, isMandatory);
    stat.setObject(5, insertedRowDate);
    return stat;
  }
}
case class AlgorithmTypeVersionDto ( val algorithmTypeVersionId : Long, val algorithmTypeId : Long, val algorithmTypeVersionName : String, val insertedRowDate : java.util.Date ) extends BaseDto {
  def tableName : String = {
    "algorithmTypeVersion";
  }
  def fields : String = {
    "algorithmTypeVersionId,algorithmTypeId,algorithmTypeVersionName,insertedRowDate";
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
    Array(algorithmTypeVersionId,algorithmTypeId,algorithmTypeVersionName,insertedRowDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+algorithmTypeVersionId,""+algorithmTypeId,""+algorithmTypeVersionName,""+insertedRowDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "algorithmTypeVersionId" => algorithmTypeVersionId
      case "algorithmTypeId" => algorithmTypeId
      case "algorithmTypeVersionName" => algorithmTypeVersionName
      case "insertedRowDate" => insertedRowDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : Any = {
    val ret = name match {
      case "algorithmTypeVersionId" => "Long"
      case "algorithmTypeId" => "Long"
      case "algorithmTypeVersionName" => "String"
      case "insertedRowDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into algorithmTypeVersion(algorithmTypeVersionId,algorithmTypeId,algorithmTypeVersionName,insertedRowDate) values (?,?,?,?)");
    stat.setObject(1, algorithmTypeVersionId);
    stat.setObject(2, algorithmTypeId);
    stat.setObject(3, algorithmTypeVersionName);
    stat.setObject(4, insertedRowDate);
    return stat;
  }
}
case class ExecutorHostDto ( val executorHostId : Long, val insertedRowDate : java.util.Date, val hostName : String, val hostIp : String, val hostDomain : String, val hostOsType : String, val hostOsVersion : String, val isWorking : Int ) extends BaseDto {
  def tableName : String = {
    "executorHost";
  }
  def fields : String = {
    "executorHostId,insertedRowDate,hostName,hostIp,hostDomain,hostOsType,hostOsVersion,isWorking";
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
    Array(executorHostId,insertedRowDate,hostName,hostIp,hostDomain,hostOsType,hostOsVersion,isWorking)
  }
  def toStringArray() : Array[String] = {
    Array(""+executorHostId,""+insertedRowDate,""+hostName,""+hostIp,""+hostDomain,""+hostOsType,""+hostOsVersion,""+isWorking)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "executorHostId" => executorHostId
      case "insertedRowDate" => insertedRowDate
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
  def getFieldTypeName(name : String) : Any = {
    val ret = name match {
      case "executorHostId" => "Long"
      case "insertedRowDate" => "java.util.Date"
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
    val stat = connection.prepareStatement("insert into executorHost(executorHostId,insertedRowDate,hostName,hostIp,hostDomain,hostOsType,hostOsVersion,isWorking) values (?,?,?,?,?,?,?,?)");
    stat.setObject(1, executorHostId);
    stat.setObject(2, insertedRowDate);
    stat.setObject(3, hostName);
    stat.setObject(4, hostIp);
    stat.setObject(5, hostDomain);
    stat.setObject(6, hostOsType);
    stat.setObject(7, hostOsVersion);
    stat.setObject(8, isWorking);
    return stat;
  }
}
case class ExecutorInstanceDto ( val executorInstanceId : Long, val executorTypeId : Long, val executorHostId : Long, val executorInstanceName : String, val isRunning : Int, val isFinished : Int, val portNumber : Int, val insertedRowDate : java.util.Date, val guid : Long, val endDate : java.util.Date ) extends BaseDto {
  def tableName : String = {
    "executorInstance";
  }
  def fields : String = {
    "executorInstanceId,executorTypeId,executorHostId,executorInstanceName,isRunning,isFinished,portNumber,insertedRowDate,guid,endDate";
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
    Array(executorInstanceId,executorTypeId,executorHostId,executorInstanceName,isRunning,isFinished,portNumber,insertedRowDate,guid,endDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+executorInstanceId,""+executorTypeId,""+executorHostId,""+executorInstanceName,""+isRunning,""+isFinished,""+portNumber,""+insertedRowDate,""+guid,""+endDate)
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
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : Any = {
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
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into executorInstance(executorInstanceId,executorTypeId,executorHostId,executorInstanceName,isRunning,isFinished,portNumber,insertedRowDate,guid,endDate) values (?,?,?,?,?,?,?,?,?,?)");
    stat.setObject(1, executorInstanceId);
    stat.setObject(2, executorTypeId);
    stat.setObject(3, executorHostId);
    stat.setObject(4, executorInstanceName);
    stat.setObject(5, isRunning);
    stat.setObject(6, isFinished);
    stat.setObject(7, portNumber);
    stat.setObject(8, insertedRowDate);
    stat.setObject(9, guid);
    stat.setObject(10, endDate);
    return stat;
  }
}
case class ExecutorRestDto ( val executorRestId : Long, val executorHostId : Long, val insertedRowDate : java.util.Date, val restPort : Int, val restVersion : String, val restStatus : String ) extends BaseDto {
  def tableName : String = {
    "executorRest";
  }
  def fields : String = {
    "executorRestId,executorHostId,insertedRowDate,restPort,restVersion,restStatus";
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
    Array(executorRestId,executorHostId,insertedRowDate,restPort,restVersion,restStatus)
  }
  def toStringArray() : Array[String] = {
    Array(""+executorRestId,""+executorHostId,""+insertedRowDate,""+restPort,""+restVersion,""+restStatus)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "executorRestId" => executorRestId
      case "executorHostId" => executorHostId
      case "insertedRowDate" => insertedRowDate
      case "restPort" => restPort
      case "restVersion" => restVersion
      case "restStatus" => restStatus
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : Any = {
    val ret = name match {
      case "executorRestId" => "Long"
      case "executorHostId" => "Long"
      case "insertedRowDate" => "java.util.Date"
      case "restPort" => "Int"
      case "restVersion" => "String"
      case "restStatus" => "String"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into executorRest(executorRestId,executorHostId,insertedRowDate,restPort,restVersion,restStatus) values (?,?,?,?,?,?)");
    stat.setObject(1, executorRestId);
    stat.setObject(2, executorHostId);
    stat.setObject(3, insertedRowDate);
    stat.setObject(4, restPort);
    stat.setObject(5, restVersion);
    stat.setObject(6, restStatus);
    return stat;
  }
}
case class ExecutorRestCallDto ( val executorRestCallId : Long, val insertedRowDate : java.util.Date, val executorHostId : Long, val executorRestId : Long, val requestMethod : String, val requestHeader : String, val requestBody : String, val responseBody : String ) extends BaseDto {
  def tableName : String = {
    "executorRestCall";
  }
  def fields : String = {
    "executorRestCallId,insertedRowDate,executorHostId,executorRestId,requestMethod,requestHeader,requestBody,responseBody";
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
    Array(executorRestCallId,insertedRowDate,executorHostId,executorRestId,requestMethod,requestHeader,requestBody,responseBody)
  }
  def toStringArray() : Array[String] = {
    Array(""+executorRestCallId,""+insertedRowDate,""+executorHostId,""+executorRestId,""+requestMethod,""+requestHeader,""+requestBody,""+responseBody)
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
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : Any = {
    val ret = name match {
      case "executorRestCallId" => "Long"
      case "insertedRowDate" => "java.util.Date"
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
    val stat = connection.prepareStatement("insert into executorRestCall(executorRestCallId,insertedRowDate,executorHostId,executorRestId,requestMethod,requestHeader,requestBody,responseBody) values (?,?,?,?,?,?,?,?)");
    stat.setObject(1, executorRestCallId);
    stat.setObject(2, insertedRowDate);
    stat.setObject(3, executorHostId);
    stat.setObject(4, executorRestId);
    stat.setObject(5, requestMethod);
    stat.setObject(6, requestHeader);
    stat.setObject(7, requestBody);
    stat.setObject(8, responseBody);
    return stat;
  }
}
case class ExecutorStorageDto ( val executorStorageId : Long, val executorHostId : Long, val executorStorageTypeId : Long, val storageDefinition : String, val storageBasePath : String, val storageFulllPath : String, val isRunning : Int, val portNumber : Int, val insertedRowDate : java.util.Date, val guid : Long ) extends BaseDto {
  def tableName : String = {
    "executorStorage";
  }
  def fields : String = {
    "executorStorageId,executorHostId,executorStorageTypeId,storageDefinition,storageBasePath,storageFulllPath,isRunning,portNumber,insertedRowDate,guid";
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
    Array(executorStorageId,executorHostId,executorStorageTypeId,storageDefinition,storageBasePath,storageFulllPath,isRunning,portNumber,insertedRowDate,guid)
  }
  def toStringArray() : Array[String] = {
    Array(""+executorStorageId,""+executorHostId,""+executorStorageTypeId,""+storageDefinition,""+storageBasePath,""+storageFulllPath,""+isRunning,""+portNumber,""+insertedRowDate,""+guid)
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
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : Any = {
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
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into executorStorage(executorStorageId,executorHostId,executorStorageTypeId,storageDefinition,storageBasePath,storageFulllPath,isRunning,portNumber,insertedRowDate,guid) values (?,?,?,?,?,?,?,?,?,?)");
    stat.setObject(1, executorStorageId);
    stat.setObject(2, executorHostId);
    stat.setObject(3, executorStorageTypeId);
    stat.setObject(4, storageDefinition);
    stat.setObject(5, storageBasePath);
    stat.setObject(6, storageFulllPath);
    stat.setObject(7, isRunning);
    stat.setObject(8, portNumber);
    stat.setObject(9, insertedRowDate);
    stat.setObject(10, guid);
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
  def getFieldTypeName(name : String) : Any = {
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
case class ExecutorStorageTypeDto ( val executorStorageTypeId : Long, val insertedRowDate : java.util.Date, val executorStorageTypeName : String, val executorStorageTypeClass : String ) extends BaseDto {
  def tableName : String = {
    "executorStorageType";
  }
  def fields : String = {
    "executorStorageTypeId,insertedRowDate,executorStorageTypeName,executorStorageTypeClass";
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
    Array(executorStorageTypeId,insertedRowDate,executorStorageTypeName,executorStorageTypeClass)
  }
  def toStringArray() : Array[String] = {
    Array(""+executorStorageTypeId,""+insertedRowDate,""+executorStorageTypeName,""+executorStorageTypeClass)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "executorStorageTypeId" => executorStorageTypeId
      case "insertedRowDate" => insertedRowDate
      case "executorStorageTypeName" => executorStorageTypeName
      case "executorStorageTypeClass" => executorStorageTypeClass
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : Any = {
    val ret = name match {
      case "executorStorageTypeId" => "Long"
      case "insertedRowDate" => "java.util.Date"
      case "executorStorageTypeName" => "String"
      case "executorStorageTypeClass" => "String"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into executorStorageType(executorStorageTypeId,insertedRowDate,executorStorageTypeName,executorStorageTypeClass) values (?,?,?,?)");
    stat.setObject(1, executorStorageTypeId);
    stat.setObject(2, insertedRowDate);
    stat.setObject(3, executorStorageTypeName);
    stat.setObject(4, executorStorageTypeClass);
    return stat;
  }
}
case class ExecutorStorageViewDto ( val executorStorageViewId : Long, val insertedRowDate : java.util.Date, val executorStorageSnapshotId : Long, val executorStorageId : Long, val sourceDownloadId : Long, val storagePath : String, val viewSize : Long, val viewRowsCount : Long ) extends BaseDto {
  def tableName : String = {
    "executorStorageView";
  }
  def fields : String = {
    "executorStorageViewId,insertedRowDate,executorStorageSnapshotId,executorStorageId,sourceDownloadId,storagePath,viewSize,viewRowsCount";
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
    Array(executorStorageViewId,insertedRowDate,executorStorageSnapshotId,executorStorageId,sourceDownloadId,storagePath,viewSize,viewRowsCount)
  }
  def toStringArray() : Array[String] = {
    Array(""+executorStorageViewId,""+insertedRowDate,""+executorStorageSnapshotId,""+executorStorageId,""+sourceDownloadId,""+storagePath,""+viewSize,""+viewRowsCount)
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
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : Any = {
    val ret = name match {
      case "executorStorageViewId" => "Long"
      case "insertedRowDate" => "java.util.Date"
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
    val stat = connection.prepareStatement("insert into executorStorageView(executorStorageViewId,insertedRowDate,executorStorageSnapshotId,executorStorageId,sourceDownloadId,storagePath,viewSize,viewRowsCount) values (?,?,?,?,?,?,?,?)");
    stat.setObject(1, executorStorageViewId);
    stat.setObject(2, insertedRowDate);
    stat.setObject(3, executorStorageSnapshotId);
    stat.setObject(4, executorStorageId);
    stat.setObject(5, sourceDownloadId);
    stat.setObject(6, storagePath);
    stat.setObject(7, viewSize);
    stat.setObject(8, viewRowsCount);
    return stat;
  }
}
case class ExecutorTypeDto ( val executorTypeId : Long, val insertedRowDate : java.util.Date, val executorTypeName : String, val executorTypeClass : String ) extends BaseDto {
  def tableName : String = {
    "executorType";
  }
  def fields : String = {
    "executorTypeId,insertedRowDate,executorTypeName,executorTypeClass";
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
    Array(executorTypeId,insertedRowDate,executorTypeName,executorTypeClass)
  }
  def toStringArray() : Array[String] = {
    Array(""+executorTypeId,""+insertedRowDate,""+executorTypeName,""+executorTypeClass)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "executorTypeId" => executorTypeId
      case "insertedRowDate" => insertedRowDate
      case "executorTypeName" => executorTypeName
      case "executorTypeClass" => executorTypeClass
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : Any = {
    val ret = name match {
      case "executorTypeId" => "Long"
      case "insertedRowDate" => "java.util.Date"
      case "executorTypeName" => "String"
      case "executorTypeClass" => "String"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into executorType(executorTypeId,insertedRowDate,executorTypeName,executorTypeClass) values (?,?,?,?)");
    stat.setObject(1, executorTypeId);
    stat.setObject(2, insertedRowDate);
    stat.setObject(3, executorTypeName);
    stat.setObject(4, executorTypeClass);
    return stat;
  }
}
case class ResourceManagerDto ( val resourceManagerId : Long, val resourceManagerTypeId : Long, val executorHostId : Long, val resourceManagerStatus : String, val insertedRowDate : java.util.Date ) extends BaseDto {
  def tableName : String = {
    "resourceManager";
  }
  def fields : String = {
    "resourceManagerId,resourceManagerTypeId,executorHostId,resourceManagerStatus,insertedRowDate";
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
    Array(resourceManagerId,resourceManagerTypeId,executorHostId,resourceManagerStatus,insertedRowDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+resourceManagerId,""+resourceManagerTypeId,""+executorHostId,""+resourceManagerStatus,""+insertedRowDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "resourceManagerId" => resourceManagerId
      case "resourceManagerTypeId" => resourceManagerTypeId
      case "executorHostId" => executorHostId
      case "resourceManagerStatus" => resourceManagerStatus
      case "insertedRowDate" => insertedRowDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : Any = {
    val ret = name match {
      case "resourceManagerId" => "Long"
      case "resourceManagerTypeId" => "Long"
      case "executorHostId" => "Long"
      case "resourceManagerStatus" => "String"
      case "insertedRowDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into resourceManager(resourceManagerId,resourceManagerTypeId,executorHostId,resourceManagerStatus,insertedRowDate) values (?,?,?,?,?)");
    stat.setObject(1, resourceManagerId);
    stat.setObject(2, resourceManagerTypeId);
    stat.setObject(3, executorHostId);
    stat.setObject(4, resourceManagerStatus);
    stat.setObject(5, insertedRowDate);
    return stat;
  }
}
case class ResourceManagerAllocationDto ( val resourceManagerAllocationId : Long, val insertedRowDate : java.util.Date, val resourceManagerTypeId : Long, val resourceManagerId : Long, val executorHostId : Long, val executorInstanceId : Long, val resourceMeasureId : Long, val allocationValue : Double, val allocationValueMin : Double, val allocationValueMax : Double ) extends BaseDto {
  def tableName : String = {
    "resourceManagerAllocation";
  }
  def fields : String = {
    "resourceManagerAllocationId,insertedRowDate,resourceManagerTypeId,resourceManagerId,executorHostId,executorInstanceId,resourceMeasureId,allocationValue,allocationValueMin,allocationValueMax";
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
    Array(resourceManagerAllocationId,insertedRowDate,resourceManagerTypeId,resourceManagerId,executorHostId,executorInstanceId,resourceMeasureId,allocationValue,allocationValueMin,allocationValueMax)
  }
  def toStringArray() : Array[String] = {
    Array(""+resourceManagerAllocationId,""+insertedRowDate,""+resourceManagerTypeId,""+resourceManagerId,""+executorHostId,""+executorInstanceId,""+resourceMeasureId,""+allocationValue,""+allocationValueMin,""+allocationValueMax)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "resourceManagerAllocationId" => resourceManagerAllocationId
      case "insertedRowDate" => insertedRowDate
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
  def getFieldTypeName(name : String) : Any = {
    val ret = name match {
      case "resourceManagerAllocationId" => "Long"
      case "insertedRowDate" => "java.util.Date"
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
    val stat = connection.prepareStatement("insert into resourceManagerAllocation(resourceManagerAllocationId,insertedRowDate,resourceManagerTypeId,resourceManagerId,executorHostId,executorInstanceId,resourceMeasureId,allocationValue,allocationValueMin,allocationValueMax) values (?,?,?,?,?,?,?,?,?,?)");
    stat.setObject(1, resourceManagerAllocationId);
    stat.setObject(2, insertedRowDate);
    stat.setObject(3, resourceManagerTypeId);
    stat.setObject(4, resourceManagerId);
    stat.setObject(5, executorHostId);
    stat.setObject(6, executorInstanceId);
    stat.setObject(7, resourceMeasureId);
    stat.setObject(8, allocationValue);
    stat.setObject(9, allocationValueMin);
    stat.setObject(10, allocationValueMax);
    return stat;
  }
}
case class ResourceManagerCheckDto ( val resourceManagerCheckId : Long, val resourceManagerId : Long, val executorHostId : Long, val resourceManagerStatus : String, val insertedRowDate : java.util.Date ) extends BaseDto {
  def tableName : String = {
    "resourceManagerCheck";
  }
  def fields : String = {
    "resourceManagerCheckId,resourceManagerId,executorHostId,resourceManagerStatus,insertedRowDate";
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
    Array(resourceManagerCheckId,resourceManagerId,executorHostId,resourceManagerStatus,insertedRowDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+resourceManagerCheckId,""+resourceManagerId,""+executorHostId,""+resourceManagerStatus,""+insertedRowDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "resourceManagerCheckId" => resourceManagerCheckId
      case "resourceManagerId" => resourceManagerId
      case "executorHostId" => executorHostId
      case "resourceManagerStatus" => resourceManagerStatus
      case "insertedRowDate" => insertedRowDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : Any = {
    val ret = name match {
      case "resourceManagerCheckId" => "Long"
      case "resourceManagerId" => "Long"
      case "executorHostId" => "Long"
      case "resourceManagerStatus" => "String"
      case "insertedRowDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into resourceManagerCheck(resourceManagerCheckId,resourceManagerId,executorHostId,resourceManagerStatus,insertedRowDate) values (?,?,?,?,?)");
    stat.setObject(1, resourceManagerCheckId);
    stat.setObject(2, resourceManagerId);
    stat.setObject(3, executorHostId);
    stat.setObject(4, resourceManagerStatus);
    stat.setObject(5, insertedRowDate);
    return stat;
  }
}
case class ResourceManagerMeasureDto ( val resourceManagerMeasureId : Long, val resourceManagerId : Long, val resourceMeasureId : Long, val measureString : String, val measureValue : Double, val insertedRowDate : java.util.Date ) extends BaseDto {
  def tableName : String = {
    "resourceManagerMeasure";
  }
  def fields : String = {
    "resourceManagerMeasureId,resourceManagerId,resourceMeasureId,measureString,measureValue,insertedRowDate";
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
    Array(resourceManagerMeasureId,resourceManagerId,resourceMeasureId,measureString,measureValue,insertedRowDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+resourceManagerMeasureId,""+resourceManagerId,""+resourceMeasureId,""+measureString,""+measureValue,""+insertedRowDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "resourceManagerMeasureId" => resourceManagerMeasureId
      case "resourceManagerId" => resourceManagerId
      case "resourceMeasureId" => resourceMeasureId
      case "measureString" => measureString
      case "measureValue" => measureValue
      case "insertedRowDate" => insertedRowDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : Any = {
    val ret = name match {
      case "resourceManagerMeasureId" => "Long"
      case "resourceManagerId" => "Long"
      case "resourceMeasureId" => "Long"
      case "measureString" => "String"
      case "measureValue" => "Double"
      case "insertedRowDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into resourceManagerMeasure(resourceManagerMeasureId,resourceManagerId,resourceMeasureId,measureString,measureValue,insertedRowDate) values (?,?,?,?,?,?)");
    stat.setObject(1, resourceManagerMeasureId);
    stat.setObject(2, resourceManagerId);
    stat.setObject(3, resourceMeasureId);
    stat.setObject(4, measureString);
    stat.setObject(5, measureValue);
    stat.setObject(6, insertedRowDate);
    return stat;
  }
}
case class ResourceManagerTypeDto ( val resourceManagerTypeId : Long, val resourceManagerTypeName : String, val resourceManagerTypeClass : String, val insertedRowDate : java.util.Date ) extends BaseDto {
  def tableName : String = {
    "resourceManagerType";
  }
  def fields : String = {
    "resourceManagerTypeId,resourceManagerTypeName,resourceManagerTypeClass,insertedRowDate";
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
    Array(resourceManagerTypeId,resourceManagerTypeName,resourceManagerTypeClass,insertedRowDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+resourceManagerTypeId,""+resourceManagerTypeName,""+resourceManagerTypeClass,""+insertedRowDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "resourceManagerTypeId" => resourceManagerTypeId
      case "resourceManagerTypeName" => resourceManagerTypeName
      case "resourceManagerTypeClass" => resourceManagerTypeClass
      case "insertedRowDate" => insertedRowDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : Any = {
    val ret = name match {
      case "resourceManagerTypeId" => "Long"
      case "resourceManagerTypeName" => "String"
      case "resourceManagerTypeClass" => "String"
      case "insertedRowDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into resourceManagerType(resourceManagerTypeId,resourceManagerTypeName,resourceManagerTypeClass,insertedRowDate) values (?,?,?,?)");
    stat.setObject(1, resourceManagerTypeId);
    stat.setObject(2, resourceManagerTypeName);
    stat.setObject(3, resourceManagerTypeClass);
    stat.setObject(4, insertedRowDate);
    return stat;
  }
}
case class ResourceMeasureDto ( val resourceMeasureId : Long, val resourceMeasureName : String, val insertedRowDate : java.util.Date ) extends BaseDto {
  def tableName : String = {
    "resourceMeasure";
  }
  def fields : String = {
    "resourceMeasureId,resourceMeasureName,insertedRowDate";
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
    Array(resourceMeasureId,resourceMeasureName,insertedRowDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+resourceMeasureId,""+resourceMeasureName,""+insertedRowDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "resourceMeasureId" => resourceMeasureId
      case "resourceMeasureName" => resourceMeasureName
      case "insertedRowDate" => insertedRowDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : Any = {
    val ret = name match {
      case "resourceMeasureId" => "Long"
      case "resourceMeasureName" => "String"
      case "insertedRowDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into resourceMeasure(resourceMeasureId,resourceMeasureName,insertedRowDate) values (?,?,?)");
    stat.setObject(1, resourceMeasureId);
    stat.setObject(2, resourceMeasureName);
    stat.setObject(3, insertedRowDate);
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
  def getFieldTypeName(name : String) : Any = {
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
case class SourceDownloadStatDto ( val sourceDownloadStatId : Long, val sourceDownloadId : Long, val insertedRowDate : java.util.Date, val rowsCount : Long, val errorRowsCount : Long, val totalBytesCount : Long, val empryRowsCount : Long ) extends BaseDto {
  def tableName : String = {
    "sourceDownloadStat";
  }
  def fields : String = {
    "sourceDownloadStatId,sourceDownloadId,insertedRowDate,rowsCount,errorRowsCount,totalBytesCount,empryRowsCount";
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
    Array(sourceDownloadStatId,sourceDownloadId,insertedRowDate,rowsCount,errorRowsCount,totalBytesCount,empryRowsCount)
  }
  def toStringArray() : Array[String] = {
    Array(""+sourceDownloadStatId,""+sourceDownloadId,""+insertedRowDate,""+rowsCount,""+errorRowsCount,""+totalBytesCount,""+empryRowsCount)
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
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : Any = {
    val ret = name match {
      case "sourceDownloadStatId" => "Long"
      case "sourceDownloadId" => "Long"
      case "insertedRowDate" => "java.util.Date"
      case "rowsCount" => "Long"
      case "errorRowsCount" => "Long"
      case "totalBytesCount" => "Long"
      case "empryRowsCount" => "Long"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into sourceDownloadStat(sourceDownloadStatId,sourceDownloadId,insertedRowDate,rowsCount,errorRowsCount,totalBytesCount,empryRowsCount) values (?,?,?,?,?,?,?)");
    stat.setObject(1, sourceDownloadStatId);
    stat.setObject(2, sourceDownloadId);
    stat.setObject(3, insertedRowDate);
    stat.setObject(4, rowsCount);
    stat.setObject(5, errorRowsCount);
    stat.setObject(6, totalBytesCount);
    stat.setObject(7, empryRowsCount);
    return stat;
  }
}
case class SourceDownloadStatColumnDto ( val sourceDownloadStatColumnId : Long, val sourceDownloadId : Long, val sourceViewColumnId : Long, val insertedRowDate : java.util.Date, val columnMinNumber : Double, val columnMaxNumber : Double, val columnMinStr : String, val columnMaxStr : String, val columnNonemptyCount : Long ) extends BaseDto {
  def tableName : String = {
    "sourceDownloadStatColumn";
  }
  def fields : String = {
    "sourceDownloadStatColumnId,sourceDownloadId,sourceViewColumnId,insertedRowDate,columnMinNumber,columnMaxNumber,columnMinStr,columnMaxStr,columnNonemptyCount";
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
    Array(sourceDownloadStatColumnId,sourceDownloadId,sourceViewColumnId,insertedRowDate,columnMinNumber,columnMaxNumber,columnMinStr,columnMaxStr,columnNonemptyCount)
  }
  def toStringArray() : Array[String] = {
    Array(""+sourceDownloadStatColumnId,""+sourceDownloadId,""+sourceViewColumnId,""+insertedRowDate,""+columnMinNumber,""+columnMaxNumber,""+columnMinStr,""+columnMaxStr,""+columnNonemptyCount)
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
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : Any = {
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
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into sourceDownloadStatColumn(sourceDownloadStatColumnId,sourceDownloadId,sourceViewColumnId,insertedRowDate,columnMinNumber,columnMaxNumber,columnMinStr,columnMaxStr,columnNonemptyCount) values (?,?,?,?,?,?,?,?,?)");
    stat.setObject(1, sourceDownloadStatColumnId);
    stat.setObject(2, sourceDownloadId);
    stat.setObject(3, sourceViewColumnId);
    stat.setObject(4, insertedRowDate);
    stat.setObject(5, columnMinNumber);
    stat.setObject(6, columnMaxNumber);
    stat.setObject(7, columnMinStr);
    stat.setObject(8, columnMaxStr);
    stat.setObject(9, columnNonemptyCount);
    return stat;
  }
}
case class SourceInstanceDto ( val sourceInstanceId : Long, val sourceTypeId : Long, val sourceInstanceName : String, val errorCount : Long, val correctCount : Long, val lastStatus : String, val lastConnectionDate : java.util.Date, val insertedRowDate : java.util.Date ) extends BaseDto {
  def tableName : String = {
    "sourceInstance";
  }
  def fields : String = {
    "sourceInstanceId,sourceTypeId,sourceInstanceName,errorCount,correctCount,lastStatus,lastConnectionDate,insertedRowDate";
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
    Array(sourceInstanceId,sourceTypeId,sourceInstanceName,errorCount,correctCount,lastStatus,lastConnectionDate,insertedRowDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+sourceInstanceId,""+sourceTypeId,""+sourceInstanceName,""+errorCount,""+correctCount,""+lastStatus,""+lastConnectionDate,""+insertedRowDate)
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
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : Any = {
    val ret = name match {
      case "sourceInstanceId" => "Long"
      case "sourceTypeId" => "Long"
      case "sourceInstanceName" => "String"
      case "errorCount" => "Long"
      case "correctCount" => "Long"
      case "lastStatus" => "String"
      case "lastConnectionDate" => "java.util.Date"
      case "insertedRowDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into sourceInstance(sourceInstanceId,sourceTypeId,sourceInstanceName,errorCount,correctCount,lastStatus,lastConnectionDate,insertedRowDate) values (?,?,?,?,?,?,?,?)");
    stat.setObject(1, sourceInstanceId);
    stat.setObject(2, sourceTypeId);
    stat.setObject(3, sourceInstanceName);
    stat.setObject(4, errorCount);
    stat.setObject(5, correctCount);
    stat.setObject(6, lastStatus);
    stat.setObject(7, lastConnectionDate);
    stat.setObject(8, insertedRowDate);
    return stat;
  }
}
case class SourceParamDto ( val sourceParamId : Long, val sourceParamName : String, val sourceParamType : String, val possibleValues : String, val insertedRowDate : java.util.Date ) extends BaseDto {
  def tableName : String = {
    "sourceParam";
  }
  def fields : String = {
    "sourceParamId,sourceParamName,sourceParamType,possibleValues,insertedRowDate";
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
    Array(sourceParamId,sourceParamName,sourceParamType,possibleValues,insertedRowDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+sourceParamId,""+sourceParamName,""+sourceParamType,""+possibleValues,""+insertedRowDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "sourceParamId" => sourceParamId
      case "sourceParamName" => sourceParamName
      case "sourceParamType" => sourceParamType
      case "possibleValues" => possibleValues
      case "insertedRowDate" => insertedRowDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : Any = {
    val ret = name match {
      case "sourceParamId" => "Long"
      case "sourceParamName" => "String"
      case "sourceParamType" => "String"
      case "possibleValues" => "String"
      case "insertedRowDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into sourceParam(sourceParamId,sourceParamName,sourceParamType,possibleValues,insertedRowDate) values (?,?,?,?,?)");
    stat.setObject(1, sourceParamId);
    stat.setObject(2, sourceParamName);
    stat.setObject(3, sourceParamType);
    stat.setObject(4, possibleValues);
    stat.setObject(5, insertedRowDate);
    return stat;
  }
}
case class SourceParamValueDto ( val sourceInstanceId : Long, val sourceParamId : Long, val sourceParamValueId : Long, val sourceParamValueVersion : String, val insertedRowDate : java.util.Date, val paramValue : String ) extends BaseDto {
  def tableName : String = {
    "sourceParamValue";
  }
  def fields : String = {
    "sourceInstanceId,sourceParamId,sourceParamValueId,sourceParamValueVersion,insertedRowDate,paramValue";
  }
  def pkFields : String = {
    "";
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
    Array(sourceInstanceId,sourceParamId,sourceParamValueId,sourceParamValueVersion,insertedRowDate,paramValue)
  }
  def toStringArray() : Array[String] = {
    Array(""+sourceInstanceId,""+sourceParamId,""+sourceParamValueId,""+sourceParamValueVersion,""+insertedRowDate,""+paramValue)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "sourceInstanceId" => sourceInstanceId
      case "sourceParamId" => sourceParamId
      case "sourceParamValueId" => sourceParamValueId
      case "sourceParamValueVersion" => sourceParamValueVersion
      case "insertedRowDate" => insertedRowDate
      case "paramValue" => paramValue
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : Any = {
    val ret = name match {
      case "sourceInstanceId" => "Long"
      case "sourceParamId" => "Long"
      case "sourceParamValueId" => "Long"
      case "sourceParamValueVersion" => "String"
      case "insertedRowDate" => "java.util.Date"
      case "paramValue" => "String"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into sourceParamValue(sourceInstanceId,sourceParamId,sourceParamValueId,sourceParamValueVersion,insertedRowDate,paramValue) values (?,?,?,?,?,?)");
    stat.setObject(1, sourceInstanceId);
    stat.setObject(2, sourceParamId);
    stat.setObject(3, sourceParamValueId);
    stat.setObject(4, sourceParamValueVersion);
    stat.setObject(5, insertedRowDate);
    stat.setObject(6, paramValue);
    return stat;
  }
}
case class SourceScheduleDto ( val sourceScheduleId : Long, val sourceViewId : Long, val executorStorageId : Long, val insertedRowDate : java.util.Date, val guid : Long, val onDemand : Int, val startTime : java.util.Date, val intervalValue : Long ) extends BaseDto {
  def tableName : String = {
    "sourceSchedule";
  }
  def fields : String = {
    "sourceScheduleId,sourceViewId,executorStorageId,insertedRowDate,guid,onDemand,startTime,intervalValue";
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
    Array(sourceScheduleId,sourceViewId,executorStorageId,insertedRowDate,guid,onDemand,startTime,intervalValue)
  }
  def toStringArray() : Array[String] = {
    Array(""+sourceScheduleId,""+sourceViewId,""+executorStorageId,""+insertedRowDate,""+guid,""+onDemand,""+startTime,""+intervalValue)
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
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : Any = {
    val ret = name match {
      case "sourceScheduleId" => "Long"
      case "sourceViewId" => "Long"
      case "executorStorageId" => "Long"
      case "insertedRowDate" => "java.util.Date"
      case "guid" => "Long"
      case "onDemand" => "Int"
      case "startTime" => "java.util.Date"
      case "intervalValue" => "Long"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into sourceSchedule(sourceScheduleId,sourceViewId,executorStorageId,insertedRowDate,guid,onDemand,startTime,intervalValue) values (?,?,?,?,?,?,?,?)");
    stat.setObject(1, sourceScheduleId);
    stat.setObject(2, sourceViewId);
    stat.setObject(3, executorStorageId);
    stat.setObject(4, insertedRowDate);
    stat.setObject(5, guid);
    stat.setObject(6, onDemand);
    stat.setObject(7, startTime);
    stat.setObject(8, intervalValue);
    return stat;
  }
}
case class SourceTypeDto ( val sourceTypeId : Long, val sourceTypeName : String, val sourceTypeClass : String, val insertedRowDate : java.util.Date ) extends BaseDto {
  def tableName : String = {
    "sourceType";
  }
  def fields : String = {
    "sourceTypeId,sourceTypeName,sourceTypeClass,insertedRowDate";
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
    Array(sourceTypeId,sourceTypeName,sourceTypeClass,insertedRowDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+sourceTypeId,""+sourceTypeName,""+sourceTypeClass,""+insertedRowDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "sourceTypeId" => sourceTypeId
      case "sourceTypeName" => sourceTypeName
      case "sourceTypeClass" => sourceTypeClass
      case "insertedRowDate" => insertedRowDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : Any = {
    val ret = name match {
      case "sourceTypeId" => "Long"
      case "sourceTypeName" => "String"
      case "sourceTypeClass" => "String"
      case "insertedRowDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into sourceType(sourceTypeId,sourceTypeName,sourceTypeClass,insertedRowDate) values (?,?,?,?)");
    stat.setObject(1, sourceTypeId);
    stat.setObject(2, sourceTypeName);
    stat.setObject(3, sourceTypeClass);
    stat.setObject(4, insertedRowDate);
    return stat;
  }
}
case class SourceTypeParamDto ( val sourceTypeId : Long, val sourceParamId : Long, val isRequired : Int, val insertedRowDate : java.util.Date ) extends BaseDto {
  def tableName : String = {
    "sourceTypeParam";
  }
  def fields : String = {
    "sourceTypeId,sourceParamId,isRequired,insertedRowDate";
  }
  def pkFields : String = {
    "";
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
    Array(sourceTypeId,sourceParamId,isRequired,insertedRowDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+sourceTypeId,""+sourceParamId,""+isRequired,""+insertedRowDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "sourceTypeId" => sourceTypeId
      case "sourceParamId" => sourceParamId
      case "isRequired" => isRequired
      case "insertedRowDate" => insertedRowDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : Any = {
    val ret = name match {
      case "sourceTypeId" => "Long"
      case "sourceParamId" => "Long"
      case "isRequired" => "Int"
      case "insertedRowDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into sourceTypeParam(sourceTypeId,sourceParamId,isRequired,insertedRowDate) values (?,?,?,?)");
    stat.setObject(1, sourceTypeId);
    stat.setObject(2, sourceParamId);
    stat.setObject(3, isRequired);
    stat.setObject(4, insertedRowDate);
    return stat;
  }
}
case class SourceViewDto ( val sourceViewId : Long, val sourceInstanceId : Long, val sourceViewTypeId : Long, val sourceViewName : String, val sourceViewDefinition : String, val insertedRowDate : java.util.Date ) extends BaseDto {
  def tableName : String = {
    "sourceView";
  }
  def fields : String = {
    "sourceViewId,sourceInstanceId,sourceViewTypeId,sourceViewName,sourceViewDefinition,insertedRowDate";
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
    Array(sourceViewId,sourceInstanceId,sourceViewTypeId,sourceViewName,sourceViewDefinition,insertedRowDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+sourceViewId,""+sourceInstanceId,""+sourceViewTypeId,""+sourceViewName,""+sourceViewDefinition,""+insertedRowDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "sourceViewId" => sourceViewId
      case "sourceInstanceId" => sourceInstanceId
      case "sourceViewTypeId" => sourceViewTypeId
      case "sourceViewName" => sourceViewName
      case "sourceViewDefinition" => sourceViewDefinition
      case "insertedRowDate" => insertedRowDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : Any = {
    val ret = name match {
      case "sourceViewId" => "Long"
      case "sourceInstanceId" => "Long"
      case "sourceViewTypeId" => "Long"
      case "sourceViewName" => "String"
      case "sourceViewDefinition" => "String"
      case "insertedRowDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into sourceView(sourceViewId,sourceInstanceId,sourceViewTypeId,sourceViewName,sourceViewDefinition,insertedRowDate) values (?,?,?,?,?,?)");
    stat.setObject(1, sourceViewId);
    stat.setObject(2, sourceInstanceId);
    stat.setObject(3, sourceViewTypeId);
    stat.setObject(4, sourceViewName);
    stat.setObject(5, sourceViewDefinition);
    stat.setObject(6, insertedRowDate);
    return stat;
  }
}
case class SourceViewColumnDto ( val sourceViewColumnId : Long, val sourceViewId : Long, val insertedRowDate : java.util.Date, val guid : String, val columnName : String, val columnType : String ) extends BaseDto {
  def tableName : String = {
    "sourceViewColumn";
  }
  def fields : String = {
    "sourceViewColumnId,sourceViewId,insertedRowDate,guid,columnName,columnType";
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
    Array(sourceViewColumnId,sourceViewId,insertedRowDate,guid,columnName,columnType)
  }
  def toStringArray() : Array[String] = {
    Array(""+sourceViewColumnId,""+sourceViewId,""+insertedRowDate,""+guid,""+columnName,""+columnType)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "sourceViewColumnId" => sourceViewColumnId
      case "sourceViewId" => sourceViewId
      case "insertedRowDate" => insertedRowDate
      case "guid" => guid
      case "columnName" => columnName
      case "columnType" => columnType
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : Any = {
    val ret = name match {
      case "sourceViewColumnId" => "Long"
      case "sourceViewId" => "Long"
      case "insertedRowDate" => "java.util.Date"
      case "guid" => "String"
      case "columnName" => "String"
      case "columnType" => "String"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into sourceViewColumn(sourceViewColumnId,sourceViewId,insertedRowDate,guid,columnName,columnType) values (?,?,?,?,?,?)");
    stat.setObject(1, sourceViewColumnId);
    stat.setObject(2, sourceViewId);
    stat.setObject(3, insertedRowDate);
    stat.setObject(4, guid);
    stat.setObject(5, columnName);
    stat.setObject(6, columnType);
    return stat;
  }
}
case class SourceViewTypeDto ( val sourceViewTypeId : Long, val sourceViewTypeName : String, val sourceViewTypeClass : String, val insertedRowDate : java.util.Date ) extends BaseDto {
  def tableName : String = {
    "sourceViewType";
  }
  def fields : String = {
    "sourceViewTypeId,sourceViewTypeName,sourceViewTypeClass,insertedRowDate";
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
    Array(sourceViewTypeId,sourceViewTypeName,sourceViewTypeClass,insertedRowDate)
  }
  def toStringArray() : Array[String] = {
    Array(""+sourceViewTypeId,""+sourceViewTypeName,""+sourceViewTypeClass,""+insertedRowDate)
  }
  def getFieldValue(name : String) : Any = {
    val ret = name match {
      case "sourceViewTypeId" => sourceViewTypeId
      case "sourceViewTypeName" => sourceViewTypeName
      case "sourceViewTypeClass" => sourceViewTypeClass
      case "insertedRowDate" => insertedRowDate
      case _ => null
    }
    ret
  }
  def getFieldTypeName(name : String) : Any = {
    val ret = name match {
      case "sourceViewTypeId" => "Long"
      case "sourceViewTypeName" => "String"
      case "sourceViewTypeClass" => "String"
      case "insertedRowDate" => "java.util.Date"
      case _ => "Object"
    }
    ret
  }
  def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {
    val stat = connection.prepareStatement("insert into sourceViewType(sourceViewTypeId,sourceViewTypeName,sourceViewTypeClass,insertedRowDate) values (?,?,?,?)");
    stat.setObject(1, sourceViewTypeId);
    stat.setObject(2, sourceViewTypeName);
    stat.setObject(3, sourceViewTypeClass);
    stat.setObject(4, insertedRowDate);
    return stat;
  }
}





















