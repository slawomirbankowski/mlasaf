/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.executors

import com.mlasaf.domain.{AlgorithmRun, Executor}

class WekaExecutor extends Executor {

  /** */
  def onRunExecutor(): Unit = {
    logger.info("Weka Executor run  ");
    // check algorithms for LOCAL to be run
  }
  /** */
  def getTypeName() : String = {
    "WEKA"
  }
  /** run given instance of algorithm */
  def runAlgorithmInstance(run : AlgorithmRun) : Unit = {
  }

}
