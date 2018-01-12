/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.algorithms.local

import com.mlasaf.base.AlgorithmInstance
import com.mlasaf.domain.AlgorithmRun

class PredictionR extends AlgorithmInstance  {

  /** */
  def onAlgorithmRun(run : AlgorithmRun) : String = {
    println(" ===================== RUNNING R PREDICTION ALGORITHM FOR RUN: " + run.algorithmRunDto.algorithmRunId);
    val outputPath = run.outputs.head.executorStorageResource_resourcePath;
    val inputPath = run.executorStorageViewDtos.head.executorStorageResource_resourcePath;
    val viewId = run.executorStorageViewDtos.head.sourceDownload_sourceViewId;
    val columns = run.algorithmScheduleColumnDtos.filter(c => c.sourceView_sourceViewId == viewId);
    AlgorithmInstance.STATUS_OK
  }
}
