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





    AlgorithmInstance.STATUS_OK
  }
}
