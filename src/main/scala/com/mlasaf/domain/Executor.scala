/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.domain

import com.mlasaf.dto._

/** should be abstract - executor to run any external or internal ML algorithm */
trait Executor extends Runnable {

  var parentContext : Context = null;
  var executorInstanceDto : ExecutorInstanceDto = null
  var executorRest : ExecutorRest = null

  def Executor() = {
  }
  def setParentContext(pc : Context): Unit = {
    parentContext = pc;
  }
  def onRun();

  def run() = {
    executorInstanceDto = parentContext.daoFactory.daoCustom.registerExecutorInstance(2);
    println("Start executor: " + executorInstanceDto)
    while (true) {
      println("Executor run in thread !!! ")
      onRun();
      Thread.sleep(3000L);
    }
    println("End of working, try to unregister Executor: " + executorInstanceDto)
    //parentContext.daoFactory.daoCustom.unregisterExecutorInstance(executorGuid)
    println("End executor " + executorInstanceDto)
  }

  def stopExecutor() = {
    println("Stop executor: " + executorInstanceDto);
  }
}
