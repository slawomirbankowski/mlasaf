package com.mlasaf.dto

import com.lucidchart.relate._

trait BaseDto {
  var fields : String = "";
}

case class AlgorithmColumnTypeDto ( val algorithmColumnTypeId : Long, val algorithmColumnTypeName : String, val algorithmColumnTypeDescription : String ) { }
case class AlgorithmImplementationDto ( val algorithmImplementationId : Long, val algorithmTypeVersionId : Long, val executorTypeId : Long, val algorithmImplementationName : String, val algorithmImplementationClass : String ) { }
case class AlgorithmOutputDto ( val algorithmOutputId : Long, val algorithmRunId : Long, val algorithmOutputTypeId : Long, val executorStorageViewId : Long, val outputPath : String ) { }
case class AlgorithmOutputTypeDto ( val algorithmOutputTypeId : Long, val algorithmOutputTypeName : String ) { }
case class AlgorithmParamDto ( val algorithmParamId : Long, val algorithmParamName : String, val algorithmParamDescription : String, val algorithmParamType : String ) { }
case class AlgorithmParamTypeDto ( val algorithmParamId : Long, val algorithmTypeId : Long, val algorithmTypeVersionId : Long ) { }
case class AlgorithmRunDto ( val algorithmRunId : Long, val algorithmScheduleId : Long, val executorInstanceId : Long, val executorStorageId : Long, val algorithmRunName : String, val insertedRowDate : java.util.Date, val runDate : java.util.Date, val isRunning : Int, val isFinished : Int ) { }
case class AlgorithmRunTypeDto ( val algorithmRunTypeId : Long, val algorithmRunTypeName : String, val insertedRowDate : java.util.Date ) { }
case class AlgorithmRunViewDto ( val algorithmRunViewId : Long, val algorithmRunId : Long, val executorStorageViewId : Long, val insertedRowDate : java.util.Date, val isDownloaded : Int ) { }
case class AlgorithmScheduleDto ( val algorithmScheduleId : Long, val algorithmImplementationId : Long, val algorithmScheduleTypeId : Long, val algorithmScheduleName : String, val isScheduled : Int, val insertedRowDate : java.util.Date ) { }
case class AlgorithmScheduleColumnDto ( val algorithmScheduleColumnId : Long, val algorithmScheduleId : Long, val algorithmColumnTypeId : Long, val algorithmScheduleViewId : Long, val sourceViewId : Long, val sourceViewColumnId : Long, val extendedProperties : String, val insertedRowDate : java.util.Date ) { }
case class AlgorithmScheduleParamDto ( val algorithmScheduleParamId : Long, val algorithmScheduleId : Long, val algorithmParamId : Long, val algorithmParamValue : String, val insertedRowDate : java.util.Date ) { }
case class AlgorithmScheduleTypeDto ( val algorithmScheduleTypeId : Long, val algorithmScheduleTypeName : String, val insertedRowDate : java.util.Date ) { }
case class AlgorithmScheduleViewDto ( val algorithmScheduleViewId : Long, val algorithmScheduleViewTypeId : Long, val algorithmScheduleId : Long, val sourceViewId : Long, val insertedRowDate : java.util.Date, val joinOnDefinition : String ) { }
case class AlgorithmScheduleViewTypeDto ( val algorithmScheduleViewTypeId : Long, val algorithmScheduleViewTypeName : String ) { }
case class AlgorithmTypeDto ( val algorithmTypeId : Long, val algorithmTypeName : String, val algorithmTypeDescription : String, val insertedRowDate : java.util.Date ) { }
case class AlgorithmTypeColumnTypeDto ( val algorithmTypeVersionId : Long, val algorithmColumnTypeId : Long, val allowMultiple : Int, val allowEmpty : Int ) { }
case class AlgorithmTypeOutputTypeDto ( val algorithmTypeOutputTypeId : Long, val algorithmTypeVersionId : Long, val algorithmOutputTypeId : Long, val isMandatory : Int, val insertedRowDate : java.util.Date ) { }
case class AlgorithmTypeVersionDto ( val algorithmTypeVersionId : Long, val algorithmTypeId : Long, val algorithmTypeVersionName : String, val insertedRowDate : java.util.Date ) { }
case class ExecutorHostDto ( val executorHostId : Long, val insertedRowDate : java.util.Date, val hostName : String, val hostIp : String, val hostDomain : String, val hostOsType : String, val hostOsVersion : String, val isWorking : Int ) extends BaseDto { fields = "" }
case class ExecutorInstanceDto ( val executorInstanceId : Long, val executorTypeId : Long, val executorHostId : Long, val executorInstanceName : String, val isRunning : Int, val isFinished : Int, val portNumber : Int, val insertedRowDate : java.util.Date, val guid : Long, val endDate : java.util.Date ) { }
case class ExecutorRestDto ( val executorRestId : Long, val executorHostId : Long, val restPort : Int, val restVersion : String, val restStatus : String ) { }
case class ExecutorRestCallDto ( val executorRestCallId : Long, val executorHostId : Long, val executorRestId : Long, val requestMethod : String, val requestHeader : String, val requestBody : String, val responseBody : String ) { }
case class ExecutorStorageDto ( val executorStorageId : Long, val executorHostId : Long, val executorStorageTypeId : Long, val storageDefinition : String, val storageBasePath : String, val storageFulllPath : String, val isRunning : Int, val portNumber : Int, val insertedRowDate : java.util.Date, val guid : Long ) { }
case class ExecutorStorageSnapshotDto ( val executorStorageSnapshotId : Long, val executorInstanceId : Long, val insertedRowDate : java.util.Date ) { }
case class ExecutorStorageTypeDto ( val executorStorageTypeId : Long, val executorStorageTypeName : String, val executorStorageTypeClass : String ) { }
case class ExecutorStorageViewDto ( val executorStorageViewId : Long, val executorStorageSnapshotId : Long, val executorStorageId : Long, val sourceDownloadId : Long, val storagePath : String, val viewSize : Long, val viewRowsCount : Long ) { }
case class ExecutorTypeDto ( val executorTypeId : Long, val executorTypeName : String, val executorTypeClass : String ) { }
case class ResourceManagerDto ( val resourceManagerId : Long, val resourceManagerTypeId : Long, val executorHostId : Long, val resourceManagerStatus : String ) { }
case class ResourceManagerAllocationDto ( val resourceManagerAllocationId : Long, val resourceManagerTypeId : Long, val resourceManagerId : Long, val executorHostId : Long, val executorInstanceId : Long, val resourceMeasureId : Long, val allocationValue : Double, val allocationValueMin : Double, val allocationValueMax : Double ) { }
case class ResourceManagerCheckDto ( val resourceManagerCheckId : Long, val resourceManagerId : Long, val executorHostId : Long, val resourceManagerStatus : String ) { }
case class ResourceManagerMeasureDto ( val resourceManagerMeasureId : Long, val resourceManagerId : Long, val resourceMeasureId : Long, val measureString : String, val measureValue : Double ) { }
case class ResourceManagerTypeDto ( val resourceManagerTypeId : Long, val resourceManagerTypeName : String, val resourceManagerTypeClass : String ) { }
case class ResourceMeasureDto ( val resourceMeasureId : Long, val resourceMeasureName : String ) { }
case class SourceDownloadDto ( val sourceDownloadId : Long, val sourceScheduleId : Long, val insertedRowDate : java.util.Date, val lastUpdatedDate : java.util.Date, val retryNumber : Int, val isRunning : Int, val isFinished : Int, val isExcecption : Int, val excecptionDescription : String ) { }
case class SourceDownloadStatDto ( val sourceDownloadStatId : Long, val sourceDownloadId : Long, val insertedRowDate : java.util.Date, val rowsCount : Long, val errorRowsCount : Long, val totalBytesCount : Long, val empryRowsCount : Long ) { }
case class SourceDownloadStatColumnDto ( val sourceDownloadStatColumnId : Long, val sourceDownloadId : Long, val sourceViewColumnId : Long, val insertedRowDate : java.util.Date, val columnMinNumber : Double, val columnMaxNumber : Double, val columnMinStr : String, val columnMaxStr : String, val columnNonemptyCount : Long ) { }
case class SourceInstanceDto ( val sourceInstanceId : Long, val sourceTypeId : Long, val sourceInstanceName : String, val errorCount : Long, val correctCount : Long, val lastStatus : String, val lastConnectionDate : java.util.Date ) { }
case class SourceParamDto ( val sourceParamId : Long, val sourceParamName : String, val sourceParamType : String, val possibleValues : String ) { }
case class SourceParamValueDto ( val sourceInstanceId : Long, val sourceParamId : Long, val sourceParamValueId : Long, val sourceParamValueVersion : String, val insertedRowDate : java.util.Date, val paramValue : String ) { }
case class SourceScheduleDto ( val sourceScheduleId : Long, val sourceViewId : Long, val executorStorageId : Long, val insertedRowDate : java.util.Date, val guid : Long, val onDemand : Int, val startTime : java.util.Date, val intervalValue : Long ) { }
case class SourceTypeDto ( val sourceTypeId : Long, val sourceTypeName : String, val sourceTypeClass : String ) { }
case class SourceTypeParamDto ( val sourceTypeId : Long, val sourceParamId : Long, val isRequired : Int ) { }
case class SourceViewDto ( val sourceViewId : Long, val sourceInstanceId : Long, val sourceViewTypeId : Long, val sourceViewName : String, val sourceViewDefinition : String ) { }
case class SourceViewColumnDto ( val sourceViewColumnId : Long, val sourceViewId : Long, val insertedRowDate : java.util.Date, val guid : String, val columnName : String, val columnType : String ) { }
case class SourceViewTypeDto ( val sourceViewTypeId : Long, val sourceViewTypeName : String, val sourceViewTypeClass : String ) { }


























