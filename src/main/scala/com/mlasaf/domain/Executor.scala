/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.domain

/** should be abstract - executor to run any external or internal ML algorithm */
trait Executor extends Runnable {

  var parentContext : Context = null;
  var executorGuid = com.mlasaf.common.CustomUtils.randomLong()
  var executorInstanceId : Int = 0
  var executorRest : ExecutorRest = null

  def Executor() = {
  }

  def setParentContext(pc : Context): Unit = {
    parentContext = pc;
  }
  def onRun();

  def run() = {
    println("Start executor, register for guid: " + executorGuid)
    parentContext.daoFactory.registerExecutorInstance(2, executorGuid)
    while (true) {
      println("Executor run in thread !!! ")
      onRun();
      Thread.sleep(3000L);

    }
    parentContext.daoFactory.unregisterExecutorInstance(executorGuid)
    println("End executor " + executorGuid)
  }

  def stopExecutor() = {

  }
}
