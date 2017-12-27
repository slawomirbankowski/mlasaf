/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.algorithms.local

import com.mlasaf.domain.{AlgorithmInstance, AlgorithmRun}

class PredictionR extends AlgorithmInstance  {

  /** */
  def run(run : AlgorithmRun) : Unit = {
    println(" ===================== RUNNING R PREDICTION ALGORITHM FOR RUN: " + run.algorithmRunDto.algorithmRunId);

  }
}
