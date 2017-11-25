package com.mlasaf.dto


case class ExecutorHostDto(val executorHostId : Long, val hostName : String, val hostIp : String) {
}

case class ExecutorInstanceDto(val executorInstanceId : Long, val executorTypeId : Long, val executorHostId : Long, val executorInstanceName : String, val isRunning : Int, val isFinished : Int) {
}

case class ExecutorStorageDto(val executorStorageId : Long, val executorHostId : Long, val executorStorageTypeId : Long, val storageDefinition : String, val storageBasePath : String, val portNumber : Int, val guid : Long) {
}

case class ExecutorRestDto(val executionRestId : Long, val executorHostId : Long, val restPort : Int, val restVersion : String) {
}

case class ExecutorStorageViewDto(val executorHostId : Long, val hostName : String, val hostIp : String) {
}























