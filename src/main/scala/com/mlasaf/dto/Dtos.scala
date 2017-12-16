package com.mlasaf.dto

import com.lucidchart.relate._

trait BaseDto {
  val dtoGuid : String = "" + com.mlasaf.common.CustomUtils.randomLong();
  val dtoInsertedDate = new java.util.Date();
  def fields : String;
  def pkFields : String;
  def fkFields : String;
  def get(name : String) : Any;
}


case class AlgorithmColumnTypeDto ( val algorithmColumnTypeId : Long, val algorithmColumnTypeName : String, val algorithmColumnTypeDescription : String ) extends BaseDto {
  def fields : String = {
    "algorithmColumnTypeId,algorithmColumnTypeName,algorithmColumnTypeDescription";
  }
  def pkFields : String = {
    "algorithmColumnTypeId";
  }
  def fkFields : String = {
    "";
  }
  def get(name : String) : Any = {
    val ret = name match {
      case "algorithmColumnTypeId" => algorithmColumnTypeId
      case "algorithmColumnTypeName" => algorithmColumnTypeName
      case "algorithmColumnTypeDescription" => algorithmColumnTypeDescription
      case _ => null
    }
    ret
  }
}
case class AlgorithmImplementationDto ( val algorithmImplementationId : Long, val algorithmTypeVersionId : Long, val executorTypeId : Long, val algorithmImplementationName : String, val algorithmImplementationClass : String ) extends BaseDto {
  def fields : String = {
    "algorithmImplementationId,algorithmTypeVersionId,executorTypeId,algorithmImplementationName,algorithmImplementationClass";
  }
  def pkFields : String = {
    "algorithmImplementationId";
  }
  def fkFields : String = {
    "algorithmTypeVersionId,executorTypeId";
  }
  def get(name : String) : Any = {
    val ret = name match {
      case "algorithmImplementationId" => algorithmImplementationId
      case "algorithmTypeVersionId" => algorithmTypeVersionId
      case "executorTypeId" => executorTypeId
      case "algorithmImplementationName" => algorithmImplementationName
      case "algorithmImplementationClass" => algorithmImplementationClass
      case _ => null
    }
    ret
  }
}
case class AlgorithmOutputDto ( val algorithmOutputId : Long, val algorithmRunId : Long, val algorithmOutputTypeId : Long, val executorStorageViewId : Long, val outputPath : String ) extends BaseDto {
  def fields : String = {
    "algorithmOutputId,algorithmRunId,algorithmOutputTypeId,executorStorageViewId,outputPath";
  }
  def pkFields : String = {
    "algorithmOutputId";
  }
  def fkFields : String = {
    "";
  }
  def get(name : String) : Any = {
    val ret = name match {
      case "algorithmOutputId" => algorithmOutputId
      case "algorithmRunId" => algorithmRunId
      case "algorithmOutputTypeId" => algorithmOutputTypeId
      case "executorStorageViewId" => executorStorageViewId
      case "outputPath" => outputPath
      case _ => null
    }
    ret
  }
}
case class AlgorithmOutputTypeDto ( val algorithmOutputTypeId : Long, val algorithmOutputTypeName : String ) extends BaseDto {
  def fields : String = {
    "algorithmOutputTypeId,algorithmOutputTypeName";
  }
  def pkFields : String = {
    "algorithmOutputTypeId";
  }
  def fkFields : String = {
    "";
  }
  def get(name : String) : Any = {
    val ret = name match {
      case "algorithmOutputTypeId" => algorithmOutputTypeId
      case "algorithmOutputTypeName" => algorithmOutputTypeName
      case _ => null
    }
    ret
  }
}
case class AlgorithmParamDto ( val algorithmParamId : Long, val algorithmParamName : String, val algorithmParamDescription : String, val algorithmParamType : String ) extends BaseDto {
  def fields : String = {
    "algorithmParamId,algorithmParamName,algorithmParamDescription,algorithmParamType";
  }
  def pkFields : String = {
    "algorithmParamId";
  }
  def fkFields : String = {
    "";
  }
  def get(name : String) : Any = {
    val ret = name match {
      case "algorithmParamId" => algorithmParamId
      case "algorithmParamName" => algorithmParamName
      case "algorithmParamDescription" => algorithmParamDescription
      case "algorithmParamType" => algorithmParamType
      case _ => null
    }
    ret
  }
}
case class AlgorithmParamTypeDto ( val algorithmParamId : Long, val algorithmTypeId : Long, val algorithmTypeVersionId : Long ) extends BaseDto {
  def fields : String = {
    "algorithmParamId,algorithmTypeId,algorithmTypeVersionId";
  }
  def pkFields : String = {
    "";
  }
  def fkFields : String = {
    "algorithmParamId,algorithmTypeId,algorithmTypeVersionId";
  }
  def get(name : String) : Any = {
    val ret = name match {
      case "algorithmParamId" => algorithmParamId
      case "algorithmTypeId" => algorithmTypeId
      case "algorithmTypeVersionId" => algorithmTypeVersionId
      case _ => null
    }
    ret
  }
}
case class AlgorithmRunDto ( val algorithmRunId : Long, val algorithmScheduleId : Long, val executorInstanceId : Long, val executorStorageId : Long, val algorithmRunName : String, val insertedRowDate : java.util.Date, val runDate : java.util.Date, val isRunning : Int, val isFinished : Int ) extends BaseDto {
  def fields : String = {
    "algorithmRunId,algorithmScheduleId,executorInstanceId,executorStorageId,algorithmRunName,insertedRowDate,runDate,isRunning,isFinished";
  }
  def pkFields : String = {
    "algorithmRunId";
  }
  def fkFields : String = {
    "algorithmScheduleId,executorInstanceId,executorStorageId";
  }
  def get(name : String) : Any = {
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
}
case class AlgorithmRunTypeDto ( val algorithmRunTypeId : Long, val algorithmRunTypeName : String, val insertedRowDate : java.util.Date ) extends BaseDto {
  def fields : String = {
    "algorithmRunTypeId,algorithmRunTypeName,insertedRowDate";
  }
  def pkFields : String = {
    "algorithmRunTypeId";
  }
  def fkFields : String = {
    "";
  }
  def get(name : String) : Any = {
    val ret = name match {
      case "algorithmRunTypeId" => algorithmRunTypeId
      case "algorithmRunTypeName" => algorithmRunTypeName
      case "insertedRowDate" => insertedRowDate
      case _ => null
    }
    ret
  }
}
case class AlgorithmRunViewDto ( val algorithmRunViewId : Long, val algorithmRunId : Long, val executorStorageViewId : Long, val insertedRowDate : java.util.Date, val isDownloaded : Int ) extends BaseDto {
  def fields : String = {
    "algorithmRunViewId,algorithmRunId,executorStorageViewId,insertedRowDate,isDownloaded";
  }
  def pkFields : String = {
    "algorithmRunViewId";
  }
  def fkFields : String = {
    "algorithmRunId,executorStorageViewId";
  }
  def get(name : String) : Any = {
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
}
case class AlgorithmScheduleDto ( val algorithmScheduleId : Long, val algorithmImplementationId : Long, val algorithmScheduleTypeId : Long, val algorithmScheduleName : String, val isScheduled : Int, val insertedRowDate : java.util.Date ) extends BaseDto {
  def fields : String = {
    "algorithmScheduleId,algorithmImplementationId,algorithmScheduleTypeId,algorithmScheduleName,isScheduled,insertedRowDate";
  }
  def pkFields : String = {
    "algorithmScheduleId";
  }
  def fkFields : String = {
    "algorithmImplementationId,algorithmScheduleTypeId";
  }
  def get(name : String) : Any = {
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
}
case class AlgorithmScheduleColumnDto ( val algorithmScheduleColumnId : Long, val algorithmScheduleId : Long, val algorithmColumnTypeId : Long, val algorithmScheduleViewId : Long, val sourceViewId : Long, val sourceViewColumnId : Long, val extendedProperties : String, val insertedRowDate : java.util.Date ) extends BaseDto {
  def fields : String = {
    "algorithmScheduleColumnId,algorithmScheduleId,algorithmColumnTypeId,algorithmScheduleViewId,sourceViewId,sourceViewColumnId,extendedProperties,insertedRowDate";
  }
  def pkFields : String = {
    "algorithmScheduleColumnId";
  }
  def fkFields : String = {
    "algorithmColumnTypeId,algorithmScheduleId,algorithmScheduleViewId,sourceViewId,sourceViewColumnId";
  }
  def get(name : String) : Any = {
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
}
case class AlgorithmScheduleParamDto ( val algorithmScheduleParamId : Long, val algorithmScheduleId : Long, val algorithmParamId : Long, val algorithmParamValue : String, val insertedRowDate : java.util.Date ) extends BaseDto {
  def fields : String = {
    "algorithmScheduleParamId,algorithmScheduleId,algorithmParamId,algorithmParamValue,insertedRowDate";
  }
  def pkFields : String = {
    "algorithmScheduleParamId";
  }
  def fkFields : String = {
    "algorithmParamId,algorithmScheduleId";
  }
  def get(name : String) : Any = {
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
}
case class AlgorithmScheduleTypeDto ( val algorithmScheduleTypeId : Long, val algorithmScheduleTypeName : String, val insertedRowDate : java.util.Date ) extends BaseDto {
  def fields : String = {
    "algorithmScheduleTypeId,algorithmScheduleTypeName,insertedRowDate";
  }
  def pkFields : String = {
    "algorithmScheduleTypeId";
  }
  def fkFields : String = {
    "";
  }
  def get(name : String) : Any = {
    val ret = name match {
      case "algorithmScheduleTypeId" => algorithmScheduleTypeId
      case "algorithmScheduleTypeName" => algorithmScheduleTypeName
      case "insertedRowDate" => insertedRowDate
      case _ => null
    }
    ret
  }
}
case class AlgorithmScheduleViewDto ( val algorithmScheduleViewId : Long, val algorithmScheduleViewTypeId : Long, val algorithmScheduleId : Long, val sourceViewId : Long, val insertedRowDate : java.util.Date, val joinOnDefinition : String ) extends BaseDto {
  def fields : String = {
    "algorithmScheduleViewId,algorithmScheduleViewTypeId,algorithmScheduleId,sourceViewId,insertedRowDate,joinOnDefinition";
  }
  def pkFields : String = {
    "algorithmScheduleViewId";
  }
  def fkFields : String = {
    "algorithmScheduleId,algorithmScheduleViewTypeId,sourceViewId";
  }
  def get(name : String) : Any = {
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
}
case class AlgorithmScheduleViewTypeDto ( val algorithmScheduleViewTypeId : Long, val algorithmScheduleViewTypeName : String ) extends BaseDto {
  def fields : String = {
    "algorithmScheduleViewTypeId,algorithmScheduleViewTypeName";
  }
  def pkFields : String = {
    "algorithmScheduleViewTypeId";
  }
  def fkFields : String = {
    "";
  }
  def get(name : String) : Any = {
    val ret = name match {
      case "algorithmScheduleViewTypeId" => algorithmScheduleViewTypeId
      case "algorithmScheduleViewTypeName" => algorithmScheduleViewTypeName
      case _ => null
    }
    ret
  }
}
case class AlgorithmTypeDto ( val algorithmTypeId : Long, val algorithmTypeName : String, val algorithmTypeDescription : String, val insertedRowDate : java.util.Date ) extends BaseDto {
  def fields : String = {
    "algorithmTypeId,algorithmTypeName,algorithmTypeDescription,insertedRowDate";
  }
  def pkFields : String = {
    "algorithmTypeId";
  }
  def fkFields : String = {
    "";
  }
  def get(name : String) : Any = {
    val ret = name match {
      case "algorithmTypeId" => algorithmTypeId
      case "algorithmTypeName" => algorithmTypeName
      case "algorithmTypeDescription" => algorithmTypeDescription
      case "insertedRowDate" => insertedRowDate
      case _ => null
    }
    ret
  }
}
case class AlgorithmTypeColumnTypeDto ( val algorithmTypeVersionId : Long, val algorithmColumnTypeId : Long, val allowMultiple : Int, val allowEmpty : Int ) extends BaseDto {
  def fields : String = {
    "algorithmTypeVersionId,algorithmColumnTypeId,allowMultiple,allowEmpty";
  }
  def pkFields : String = {
    "";
  }
  def fkFields : String = {
    "algorithmColumnTypeId,algorithmTypeVersionId";
  }
  def get(name : String) : Any = {
    val ret = name match {
      case "algorithmTypeVersionId" => algorithmTypeVersionId
      case "algorithmColumnTypeId" => algorithmColumnTypeId
      case "allowMultiple" => allowMultiple
      case "allowEmpty" => allowEmpty
      case _ => null
    }
    ret
  }
}
case class AlgorithmTypeOutputTypeDto ( val algorithmTypeOutputTypeId : Long, val algorithmTypeVersionId : Long, val algorithmOutputTypeId : Long, val isMandatory : Int, val insertedRowDate : java.util.Date ) extends BaseDto {
  def fields : String = {
    "algorithmTypeOutputTypeId,algorithmTypeVersionId,algorithmOutputTypeId,isMandatory,insertedRowDate";
  }
  def pkFields : String = {
    "algorithmTypeOutputTypeId";
  }
  def fkFields : String = {
    "";
  }
  def get(name : String) : Any = {
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
}
case class AlgorithmTypeVersionDto ( val algorithmTypeVersionId : Long, val algorithmTypeId : Long, val algorithmTypeVersionName : String, val insertedRowDate : java.util.Date ) extends BaseDto {
  def fields : String = {
    "algorithmTypeVersionId,algorithmTypeId,algorithmTypeVersionName,insertedRowDate";
  }
  def pkFields : String = {
    "algorithmTypeVersionId";
  }
  def fkFields : String = {
    "algorithmTypeId";
  }
  def get(name : String) : Any = {
    val ret = name match {
      case "algorithmTypeVersionId" => algorithmTypeVersionId
      case "algorithmTypeId" => algorithmTypeId
      case "algorithmTypeVersionName" => algorithmTypeVersionName
      case "insertedRowDate" => insertedRowDate
      case _ => null
    }
    ret
  }
}
case class ExecutorHostDto ( val executorHostId : Long, val insertedRowDate : java.util.Date, val hostName : String, val hostIp : String, val hostDomain : String, val hostOsType : String, val hostOsVersion : String, val isWorking : Int ) extends BaseDto {
  def fields : String = {
    "executorHostId,insertedRowDate,hostName,hostIp,hostDomain,hostOsType,hostOsVersion,isWorking";
  }
  def pkFields : String = {
    "executorHostId";
  }
  def fkFields : String = {
    "";
  }
  def get(name : String) : Any = {
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
}
case class ExecutorInstanceDto ( val executorInstanceId : Long, val executorTypeId : Long, val executorHostId : Long, val executorInstanceName : String, val isRunning : Int, val isFinished : Int, val portNumber : Int, val insertedRowDate : java.util.Date, val guid : Long, val endDate : java.util.Date ) extends BaseDto {
  def fields : String = {
    "executorInstanceId,executorTypeId,executorHostId,executorInstanceName,isRunning,isFinished,portNumber,insertedRowDate,guid,endDate";
  }
  def pkFields : String = {
    "executorInstanceId";
  }
  def fkFields : String = {
    "executorHostId,executorTypeId";
  }
  def get(name : String) : Any = {
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
}
case class ExecutorRestDto ( val executorRestId : Long, val executorHostId : Long, val restPort : Int, val restVersion : String, val restStatus : String ) extends BaseDto {
  def fields : String = {
    "executorRestId,executorHostId,restPort,restVersion,restStatus";
  }
  def pkFields : String = {
    "executorRestId";
  }
  def fkFields : String = {
    "executorHostId";
  }
  def get(name : String) : Any = {
    val ret = name match {
      case "executorRestId" => executorRestId
      case "executorHostId" => executorHostId
      case "restPort" => restPort
      case "restVersion" => restVersion
      case "restStatus" => restStatus
      case _ => null
    }
    ret
  }
}
case class ExecutorRestCallDto ( val executorRestCallId : Long, val executorHostId : Long, val executorRestId : Long, val requestMethod : String, val requestHeader : String, val requestBody : String, val responseBody : String ) extends BaseDto {
  def fields : String = {
    "executorRestCallId,executorHostId,executorRestId,requestMethod,requestHeader,requestBody,responseBody";
  }
  def pkFields : String = {
    "executorRestCallId";
  }
  def fkFields : String = {
    "executorHostId,executorRestId";
  }
  def get(name : String) : Any = {
    val ret = name match {
      case "executorRestCallId" => executorRestCallId
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
}
case class ExecutorStorageDto ( val executorStorageId : Long, val executorHostId : Long, val executorStorageTypeId : Long, val storageDefinition : String, val storageBasePath : String, val storageFulllPath : String, val isRunning : Int, val portNumber : Int, val insertedRowDate : java.util.Date, val guid : Long ) extends BaseDto {
  def fields : String = {
    "executorStorageId,executorHostId,executorStorageTypeId,storageDefinition,storageBasePath,storageFulllPath,isRunning,portNumber,insertedRowDate,guid";
  }
  def pkFields : String = {
    "executorStorageId";
  }
  def fkFields : String = {
    "executorStorageTypeId,executorHostId";
  }
  def get(name : String) : Any = {
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
}
case class ExecutorStorageSnapshotDto ( val executorStorageSnapshotId : Long, val executorInstanceId : Long, val insertedRowDate : java.util.Date ) extends BaseDto {
  def fields : String = {
    "executorStorageSnapshotId,executorInstanceId,insertedRowDate";
  }
  def pkFields : String = {
    "executorStorageSnapshotId";
  }
  def fkFields : String = {
    "executorInstanceId";
  }
  def get(name : String) : Any = {
    val ret = name match {
      case "executorStorageSnapshotId" => executorStorageSnapshotId
      case "executorInstanceId" => executorInstanceId
      case "insertedRowDate" => insertedRowDate
      case _ => null
    }
    ret
  }
}
case class ExecutorStorageTypeDto ( val executorStorageTypeId : Long, val executorStorageTypeName : String, val executorStorageTypeClass : String ) extends BaseDto {
  def fields : String = {
    "executorStorageTypeId,executorStorageTypeName,executorStorageTypeClass";
  }
  def pkFields : String = {
    "executorStorageTypeId";
  }
  def fkFields : String = {
    "";
  }
  def get(name : String) : Any = {
    val ret = name match {
      case "executorStorageTypeId" => executorStorageTypeId
      case "executorStorageTypeName" => executorStorageTypeName
      case "executorStorageTypeClass" => executorStorageTypeClass
      case _ => null
    }
    ret
  }
}
case class ExecutorStorageViewDto ( val executorStorageViewId : Long, val executorStorageSnapshotId : Long, val executorStorageId : Long, val sourceDownloadId : Long, val storagePath : String, val viewSize : Long, val viewRowsCount : Long ) extends BaseDto {
  def fields : String = {
    "executorStorageViewId,executorStorageSnapshotId,executorStorageId,sourceDownloadId,storagePath,viewSize,viewRowsCount";
  }
  def pkFields : String = {
    "executorStorageViewId";
  }
  def fkFields : String = {
    "executorStorageId";
  }
  def get(name : String) : Any = {
    val ret = name match {
      case "executorStorageViewId" => executorStorageViewId
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
}
case class ExecutorTypeDto ( val executorTypeId : Long, val executorTypeName : String, val executorTypeClass : String ) extends BaseDto {
  def fields : String = {
    "executorTypeId,executorTypeName,executorTypeClass";
  }
  def pkFields : String = {
    "executorTypeId";
  }
  def fkFields : String = {
    "";
  }
  def get(name : String) : Any = {
    val ret = name match {
      case "executorTypeId" => executorTypeId
      case "executorTypeName" => executorTypeName
      case "executorTypeClass" => executorTypeClass
      case _ => null
    }
    ret
  }
}
case class ResourceManagerDto ( val resourceManagerId : Long, val resourceManagerTypeId : Long, val executorHostId : Long, val resourceManagerStatus : String ) extends BaseDto {
  def fields : String = {
    "resourceManagerId,resourceManagerTypeId,executorHostId,resourceManagerStatus";
  }
  def pkFields : String = {
    "resourceManagerId";
  }
  def fkFields : String = {
    "executorHostId,resourceManagerTypeId";
  }
  def get(name : String) : Any = {
    val ret = name match {
      case "resourceManagerId" => resourceManagerId
      case "resourceManagerTypeId" => resourceManagerTypeId
      case "executorHostId" => executorHostId
      case "resourceManagerStatus" => resourceManagerStatus
      case _ => null
    }
    ret
  }
}
case class ResourceManagerAllocationDto ( val resourceManagerAllocationId : Long, val resourceManagerTypeId : Long, val resourceManagerId : Long, val executorHostId : Long, val executorInstanceId : Long, val resourceMeasureId : Long, val allocationValue : Double, val allocationValueMin : Double, val allocationValueMax : Double ) extends BaseDto {
  def fields : String = {
    "resourceManagerAllocationId,resourceManagerTypeId,resourceManagerId,executorHostId,executorInstanceId,resourceMeasureId,allocationValue,allocationValueMin,allocationValueMax";
  }
  def pkFields : String = {
    "resourceManagerAllocationId";
  }
  def fkFields : String = {
    "";
  }
  def get(name : String) : Any = {
    val ret = name match {
      case "resourceManagerAllocationId" => resourceManagerAllocationId
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
}
case class ResourceManagerCheckDto ( val resourceManagerCheckId : Long, val resourceManagerId : Long, val executorHostId : Long, val resourceManagerStatus : String ) extends BaseDto {
  def fields : String = {
    "resourceManagerCheckId,resourceManagerId,executorHostId,resourceManagerStatus";
  }
  def pkFields : String = {
    "resourceManagerCheckId";
  }
  def fkFields : String = {
    "";
  }
  def get(name : String) : Any = {
    val ret = name match {
      case "resourceManagerCheckId" => resourceManagerCheckId
      case "resourceManagerId" => resourceManagerId
      case "executorHostId" => executorHostId
      case "resourceManagerStatus" => resourceManagerStatus
      case _ => null
    }
    ret
  }
}
case class ResourceManagerMeasureDto ( val resourceManagerMeasureId : Long, val resourceManagerId : Long, val resourceMeasureId : Long, val measureString : String, val measureValue : Double ) extends BaseDto {
  def fields : String = {
    "resourceManagerMeasureId,resourceManagerId,resourceMeasureId,measureString,measureValue";
  }
  def pkFields : String = {
    "resourceManagerMeasureId";
  }
  def fkFields : String = {
    "resourceManagerId,resourceMeasureId";
  }
  def get(name : String) : Any = {
    val ret = name match {
      case "resourceManagerMeasureId" => resourceManagerMeasureId
      case "resourceManagerId" => resourceManagerId
      case "resourceMeasureId" => resourceMeasureId
      case "measureString" => measureString
      case "measureValue" => measureValue
      case _ => null
    }
    ret
  }
}
case class ResourceManagerTypeDto ( val resourceManagerTypeId : Long, val resourceManagerTypeName : String, val resourceManagerTypeClass : String ) extends BaseDto {
  def fields : String = {
    "resourceManagerTypeId,resourceManagerTypeName,resourceManagerTypeClass";
  }
  def pkFields : String = {
    "resourceManagerTypeId";
  }
  def fkFields : String = {
    "";
  }
  def get(name : String) : Any = {
    val ret = name match {
      case "resourceManagerTypeId" => resourceManagerTypeId
      case "resourceManagerTypeName" => resourceManagerTypeName
      case "resourceManagerTypeClass" => resourceManagerTypeClass
      case _ => null
    }
    ret
  }
}
case class ResourceMeasureDto ( val resourceMeasureId : Long, val resourceMeasureName : String ) extends BaseDto {
  def fields : String = {
    "resourceMeasureId,resourceMeasureName";
  }
  def pkFields : String = {
    "resourceMeasureId";
  }
  def fkFields : String = {
    "";
  }
  def get(name : String) : Any = {
    val ret = name match {
      case "resourceMeasureId" => resourceMeasureId
      case "resourceMeasureName" => resourceMeasureName
      case _ => null
    }
    ret
  }
}
case class SourceDownloadDto ( val sourceDownloadId : Long, val sourceScheduleId : Long, val insertedRowDate : java.util.Date, val lastUpdatedDate : java.util.Date, val retryNumber : Int, val isRunning : Int, val isFinished : Int, val isExcecption : Int, val excecptionDescription : String ) extends BaseDto {
  def fields : String = {
    "sourceDownloadId,sourceScheduleId,insertedRowDate,lastUpdatedDate,retryNumber,isRunning,isFinished,isExcecption,excecptionDescription";
  }
  def pkFields : String = {
    "sourceDownloadId";
  }
  def fkFields : String = {
    "sourceScheduleId";
  }
  def get(name : String) : Any = {
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
}
case class SourceDownloadStatDto ( val sourceDownloadStatId : Long, val sourceDownloadId : Long, val insertedRowDate : java.util.Date, val rowsCount : Long, val errorRowsCount : Long, val totalBytesCount : Long, val empryRowsCount : Long ) extends BaseDto {
  def fields : String = {
    "sourceDownloadStatId,sourceDownloadId,insertedRowDate,rowsCount,errorRowsCount,totalBytesCount,empryRowsCount";
  }
  def pkFields : String = {
    "sourceDownloadStatId";
  }
  def fkFields : String = {
    "sourceDownloadId";
  }
  def get(name : String) : Any = {
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
}
case class SourceDownloadStatColumnDto ( val sourceDownloadStatColumnId : Long, val sourceDownloadId : Long, val sourceViewColumnId : Long, val insertedRowDate : java.util.Date, val columnMinNumber : Double, val columnMaxNumber : Double, val columnMinStr : String, val columnMaxStr : String, val columnNonemptyCount : Long ) extends BaseDto {
  def fields : String = {
    "sourceDownloadStatColumnId,sourceDownloadId,sourceViewColumnId,insertedRowDate,columnMinNumber,columnMaxNumber,columnMinStr,columnMaxStr,columnNonemptyCount";
  }
  def pkFields : String = {
    "sourceDownloadStatColumnId";
  }
  def fkFields : String = {
    "sourceDownloadId,sourceViewColumnId";
  }
  def get(name : String) : Any = {
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
}
case class SourceInstanceDto ( val sourceInstanceId : Long, val sourceTypeId : Long, val sourceInstanceName : String, val errorCount : Long, val correctCount : Long, val lastStatus : String, val lastConnectionDate : java.util.Date ) extends BaseDto {
  def fields : String = {
    "sourceInstanceId,sourceTypeId,sourceInstanceName,errorCount,correctCount,lastStatus,lastConnectionDate";
  }
  def pkFields : String = {
    "sourceInstanceId";
  }
  def fkFields : String = {
    "sourceTypeId";
  }
  def get(name : String) : Any = {
    val ret = name match {
      case "sourceInstanceId" => sourceInstanceId
      case "sourceTypeId" => sourceTypeId
      case "sourceInstanceName" => sourceInstanceName
      case "errorCount" => errorCount
      case "correctCount" => correctCount
      case "lastStatus" => lastStatus
      case "lastConnectionDate" => lastConnectionDate
      case _ => null
    }
    ret
  }
}
case class SourceParamDto ( val sourceParamId : Long, val sourceParamName : String, val sourceParamType : String, val possibleValues : String ) extends BaseDto {
  def fields : String = {
    "sourceParamId,sourceParamName,sourceParamType,possibleValues";
  }
  def pkFields : String = {
    "sourceParamId";
  }
  def fkFields : String = {
    "";
  }
  def get(name : String) : Any = {
    val ret = name match {
      case "sourceParamId" => sourceParamId
      case "sourceParamName" => sourceParamName
      case "sourceParamType" => sourceParamType
      case "possibleValues" => possibleValues
      case _ => null
    }
    ret
  }
}
case class SourceParamValueDto ( val sourceInstanceId : Long, val sourceParamId : Long, val sourceParamValueId : Long, val sourceParamValueVersion : String, val insertedRowDate : java.util.Date, val paramValue : String ) extends BaseDto {
  def fields : String = {
    "sourceInstanceId,sourceParamId,sourceParamValueId,sourceParamValueVersion,insertedRowDate,paramValue";
  }
  def pkFields : String = {
    "";
  }
  def fkFields : String = {
    "sourceInstanceId,sourceParamId";
  }
  def get(name : String) : Any = {
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
}
case class SourceScheduleDto ( val sourceScheduleId : Long, val sourceViewId : Long, val executorStorageId : Long, val insertedRowDate : java.util.Date, val guid : Long, val onDemand : Int, val startTime : java.util.Date, val intervalValue : Long ) extends BaseDto {
  def fields : String = {
    "sourceScheduleId,sourceViewId,executorStorageId,insertedRowDate,guid,onDemand,startTime,intervalValue";
  }
  def pkFields : String = {
    "sourceScheduleId";
  }
  def fkFields : String = {
    "executorStorageId,sourceViewId";
  }
  def get(name : String) : Any = {
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
}
case class SourceTypeDto ( val sourceTypeId : Long, val sourceTypeName : String, val sourceTypeClass : String ) extends BaseDto {
  def fields : String = {
    "sourceTypeId,sourceTypeName,sourceTypeClass";
  }
  def pkFields : String = {
    "sourceTypeId";
  }
  def fkFields : String = {
    "";
  }
  def get(name : String) : Any = {
    val ret = name match {
      case "sourceTypeId" => sourceTypeId
      case "sourceTypeName" => sourceTypeName
      case "sourceTypeClass" => sourceTypeClass
      case _ => null
    }
    ret
  }
}
case class SourceTypeParamDto ( val sourceTypeId : Long, val sourceParamId : Long, val isRequired : Int ) extends BaseDto {
  def fields : String = {
    "sourceTypeId,sourceParamId,isRequired";
  }
  def pkFields : String = {
    "";
  }
  def fkFields : String = {
    "sourceParamId,sourceTypeId";
  }
  def get(name : String) : Any = {
    val ret = name match {
      case "sourceTypeId" => sourceTypeId
      case "sourceParamId" => sourceParamId
      case "isRequired" => isRequired
      case _ => null
    }
    ret
  }
}
case class SourceViewDto ( val sourceViewId : Long, val sourceInstanceId : Long, val sourceViewTypeId : Long, val sourceViewName : String, val sourceViewDefinition : String ) extends BaseDto {
  def fields : String = {
    "sourceViewId,sourceInstanceId,sourceViewTypeId,sourceViewName,sourceViewDefinition";
  }
  def pkFields : String = {
    "sourceViewId";
  }
  def fkFields : String = {
    "sourceInstanceId,sourceViewTypeId";
  }
  def get(name : String) : Any = {
    val ret = name match {
      case "sourceViewId" => sourceViewId
      case "sourceInstanceId" => sourceInstanceId
      case "sourceViewTypeId" => sourceViewTypeId
      case "sourceViewName" => sourceViewName
      case "sourceViewDefinition" => sourceViewDefinition
      case _ => null
    }
    ret
  }
}
case class SourceViewColumnDto ( val sourceViewColumnId : Long, val sourceViewId : Long, val insertedRowDate : java.util.Date, val guid : String, val columnName : String, val columnType : String ) extends BaseDto {
  def fields : String = {
    "sourceViewColumnId,sourceViewId,insertedRowDate,guid,columnName,columnType";
  }
  def pkFields : String = {
    "sourceViewColumnId";
  }
  def fkFields : String = {
    "sourceViewId";
  }
  def get(name : String) : Any = {
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
}
case class SourceViewTypeDto ( val sourceViewTypeId : Long, val sourceViewTypeName : String, val sourceViewTypeClass : String ) extends BaseDto {
  def fields : String = {
    "sourceViewTypeId,sourceViewTypeName,sourceViewTypeClass";
  }
  def pkFields : String = {
    "sourceViewTypeId";
  }
  def fkFields : String = {
    "";
  }
  def get(name : String) : Any = {
    val ret = name match {
      case "sourceViewTypeId" => sourceViewTypeId
      case "sourceViewTypeName" => sourceViewTypeName
      case "sourceViewTypeClass" => sourceViewTypeClass
      case _ => null
    }
    ret
  }
}





















