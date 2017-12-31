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
    println(" ===================== RUNNING LOCAL PREDICTION ALGORITHM FOR RUN: " + run.algorithmRunDto.algorithmRunId + ", input files: " + run.executorStorageViewDtos.map(sv => sv.executorStorageResource_resourcePath).mkString(","));
    println("======================     Parent ExecutorType: " + run.parentExecutor.getTypeName())
    println("======================     algorithmScheduleDto: " + run.algorithmScheduleDto);
    println("======================     algorithmScheduleColumnDtos: " + run.algorithmScheduleColumnDtos.map(c => "{asvcId:" + c.algorithmScheduleViewId + ",columnName:" + c.sourceViewColumn_columnName + ",sourceViewId:" + c.algorithmScheduleView_sourceViewId + ",type:" +  c.algorithmColumnType_algorithmColumnTypeName + "}").mkString(","));
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
      val inputFileFullPath = run.executorStorageViewDtos.head.executorStorageResource_resourcePath;
      println("======================     timeColName: " + timeColName);
      println("======================     groupColName: " + groupColName);
      println("======================     valueColName: " + valueColName);
      println("======================     inputFileFullPath: " + inputFileFullPath);
      println("======================     OUTPUT files: " + run.outputs.map(o => "{outputId:" + o.algorithmOutputId + ",type:" + o.algorithmOutputType_algorithmOutputTypeName + ",path:" + o.executorStorageResource_resourcePath + ",storageId:" + o.executorStorage_executorStorageId +"}").mkString(","));
      AlgorithmInstance.STATUS_OK
    }
  }

}
