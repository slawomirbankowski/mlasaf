/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.algorithms.local

import com.mlasaf.base.AlgorithmInstance
import com.mlasaf.domain._

/** */
class PredictionLocalSma5 extends AlgorithmInstance {

  /** logger */
  val logger = org.slf4j.LoggerFactory.getLogger("DaoCustom");
  /**  */
  def onAlgorithmRun(run : AlgorithmRun) : String = {
    logger.info("")
    logger.info(" ===================== RUNNING LOCAL PREDICTION ALGORITHM FOR RUN: " + run.algorithmRunDto.algorithmRunId + ", input files: " + run.executorStorageViewDtos.map(sv => sv.executorStorageResource_resourcePath).mkString(","));
    logger.info("======================     Parent ExecutorType: " + run.parentExecutor.getTypeName())
    logger.info("======================     algorithmScheduleDto: " + run.algorithmScheduleDto);
    logger.info("======================     algorithmScheduleColumnDtos: " + run.algorithmScheduleColumnDtos.map(c => "{asvcId:" + c.algorithmScheduleViewId + ",columnName:" + c.sourceViewColumn_columnName + ",sourceViewId:" + c.algorithmScheduleView_sourceViewId + ",type:" +  c.algorithmColumnType_algorithmColumnTypeName + "}").mkString(","));
    val timeColsCount : Int = run.algorithmScheduleColumnDtos.filter(c => c.algorithmColumnType_algorithmColumnTypeName.equals("Time")).size;
    val groupColsCount : Int = run.algorithmScheduleColumnDtos.filter(c => c.algorithmColumnType_algorithmColumnTypeName.equals("SingleGroup")).size;
    val valueColsCount : Int = run.algorithmScheduleColumnDtos.filter(c => c.algorithmColumnType_algorithmColumnTypeName.equals("NumericValue")).size;
    if (run.executorStorageViewDtos.size == 0 && timeColsCount > 0 && groupColsCount > 0 && valueColsCount > 0) {
      logger.info("No downloaded VIEWS for algorithm");
      AlgorithmInstance.STATUS_ERROR
    } else {
      val timeColName = run.algorithmScheduleColumnDtos.filter(c => c.algorithmColumnType_algorithmColumnTypeName.equals("Time")).head.sourceViewColumn_columnName;
      val groupColName = run.algorithmScheduleColumnDtos.filter(c => c.algorithmColumnType_algorithmColumnTypeName.equals("SingleGroup")).head.sourceViewColumn_columnName;
      val valueColName = run.algorithmScheduleColumnDtos.filter(c => c.algorithmColumnType_algorithmColumnTypeName.equals("NumericValue")).head.sourceViewColumn_columnName;
      val inputFileFullPath = run.executorStorageViewDtos.head.executorStorageResource_resourcePath;
      val outputPath = run.outputs.head.executorStorageResource_resourcePath;
      logger.info("======================     timeColName: " + timeColName);
      logger.info("======================     groupColName: " + groupColName);
      logger.info("======================     valueColName: " + valueColName);
      logger.info("======================     inputFileFullPath: " + inputFileFullPath);
      logger.info("======================     OUTPUT files: " + run.outputs.map(o => "{outputId:" + o.algorithmOutputId + ",type:" + o.algorithmOutputType_algorithmOutputTypeName + ",path:" + o.executorStorageResource_resourcePath + ",storageId:" + o.executorStorage_executorStorageId +"}").mkString(","));
      logger.info("======================     outputPath: " + outputPath);
      AlgorithmInstance.STATUS_OK
    }
  }
}
