/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.executors

import com.mlasaf.domain._

/** executor using R scripts */
class RExecutor extends Executor {

  def onRunExecutor(): Unit = {
    logger.info("R Executor run  ")
  }
  def getTypeName() : String = {
    "R"
  }
  /** run given instance of algorithm */
  def runAlgorithmInstance(run : AlgorithmRun) : Unit = {
  }

}
