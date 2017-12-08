package com.mlasaf.dto

import com.lucidchart.relate._

case class ExecutorHostDto(val executorHostId : Long, val hostName : String, val hostIp : String) {
}

case class ExecutorInstanceDto(val executorInstanceId : Long, val executorTypeId : Long, val executorHostId : Long, val executorInstanceName : String, val isRunning : Int, val isFinished : Int) {
}

case class ExecutorStorageDto(val executorStorageId : Long, val executorHostId : Long, val executorStorageTypeId : Long, val storageDefinition : String, val storageBasePath : String, val portNumber : Int, val guid : Long) {


}
object ExecutorStorageDto {
  /*implicit val parser: RowParser[ExecutorStorageDto] = new RowParser[ExecutorStorageDto] {
    def dtoParser(row: SqlRow): ExecutorStorageDto = {
      ExecutorStorageDto(
        row.long("executorStorageId"),
        row.long("executorHostId"),
        row.long("executorStorageTypeId"),
        row.string("storageDefinition"),
        row.string("storageBasePath"),
        row.int("portNumber"),
        row.long("guid")
      )
    }
  }*/
}

case class ExecutorRestDto(val executionRestId : Long, val executorHostId : Long, val restPort : Int, val restVersion : String) {
}

case class ExecutorStorageViewDto(val executorHostId : Long, val hostName : String, val hostIp : String) {
}























