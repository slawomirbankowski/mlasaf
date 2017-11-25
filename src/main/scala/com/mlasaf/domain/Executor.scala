/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.domain

/** should be abstract - executor to run any external or internal ML algorithm */
class Executor extends Runnable {

  var executorInstanceId : Int = 0
  var storages : Seq[Storage] = null
  var executorRest : ExecutorRest = null

  def Executor(parentContext : Context) = {
  }

  def run() = {
    println("Executor run in thread !!! ")
  }

}
