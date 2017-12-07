/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.executors

import com.mlasaf.domain._

class LocalExecutor extends Executor {


  def onRun(): Unit = {
    println("Local Executor run  ")
  }



}
