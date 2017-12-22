/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.executors

import com.mlasaf.domain._

class RExecutor extends Executor {

  def onRun(): Unit = {
    println("R Executor run  ")
  }
  def getTypeName() : String = {
    "R"
  }
}
