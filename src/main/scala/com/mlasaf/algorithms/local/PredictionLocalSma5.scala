/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.algorithms.local

import com.mlasaf.domain._

/** */
class PredictionLocalSma5 extends AlgorithmInstance {

  /** */
  def run(run : AlgorithmRun) : String = {
    println(" ===================== RUNNING LOCAL PREDICTION ALGORITHM FOR RUN: " + run.algorithmRunDto.algorithmRunId + ", input files: " + run.executorStorageViewDtos.map(sv => sv.storagePath).mkString(","));
    println("======================     Parent ExecutorType: " + run.parentExecutor.getTypeName())
    println("======================     algorithmScheduleDto: " + run.algorithmScheduleDto);
    val timeColsCount : Int = run.algorithmScheduleColumnDtos.filter(c => c.algorithmColumnType_algorithmColumnTypeName.equals("Time")).size;
    val groupColsCount : Int = run.algorithmScheduleColumnDtos.filter(c => c.algorithmColumnType_algorithmColumnTypeName.equals("SingleGroup")).size;
    val valueColsCount : Int = run.algorithmScheduleColumnDtos.filter(c => c.algorithmColumnType_algorithmColumnTypeName.equals("NumericValue")).size;

    if (run.executorStorageViewDtos.size == 0 && timeColsCount > 0 && groupColsCount > 0 && valueColsCount > 0) {
      println("No downloaded VIEWS for algorithm");


      AlgorithmInstance.STATUS_ERROR

    } else {
      val timeColName = run.algorithmScheduleColumnDtos.filter(c => c.algorithmColumnType_algorithmColumnTypeName.equals("Time")).head.sourceViewColumn_columnName;
      val groupColName = run.algorithmScheduleColumnDtos.filter(c => c.algorithmColumnType_algorithmColumnTypeName.equals("SingleGroup")).head.sourceViewColumn_columnName;
      val valueColName = run.algorithmScheduleColumnDtos.filter(c => c.algorithmColumnType_algorithmColumnTypeName.equals("NumericValue")).head.sourceViewColumn_columnName;
      val fileFullPath = run.executorStorageViewDtos.head.storagePath;
      println("======================     timeColName: " + timeColName);
      println("======================     groupColName: " + groupColName);
      println("======================     valueColName: " + valueColName);
      println("======================     fileFullPath: " + fileFullPath);
      AlgorithmInstance.STATUS_OK
    }
  }
}
