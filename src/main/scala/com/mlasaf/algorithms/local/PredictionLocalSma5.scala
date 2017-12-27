/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.algorithms.local

import com.mlasaf.domain._

/** */
class PredictionLocalSma5 extends AlgorithmInstance {
  /** */
  def run(run : AlgorithmRun) : Unit = {
    println(" ===================== RUNNING LOCAL PREDICTION ALGORITHM FOR RUN: " + run.algorithmRunDto.algorithmRunId + ", input files: " + run.executorStorageViewDtos.map(sv => sv.storagePath).mkString(","));
    println("======================     Parent ExecutorType: " + run.parentExecutor.getTypeName())
    println("======================     algorithmScheduleDto: " + run.algorithmScheduleDto)
  }
}
