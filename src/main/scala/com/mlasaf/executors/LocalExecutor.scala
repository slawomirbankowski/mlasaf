/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.executors

import com.mlasaf.domain._

/** local executor that is using current disk space in specified path */
class LocalExecutor extends Executor {

  /** */
  def onRunExecutor(): Unit = {
    logger.info("Local Executor run  ");
    // check algorithms for LOCAL to be run
  }
  /** */
  def getTypeName() : String = {
    "LOCAL"
  }
  /** run given instance of algorithm */
  def runAlgorithmInstance(run : AlgorithmRun) : Unit = {
  }


}
