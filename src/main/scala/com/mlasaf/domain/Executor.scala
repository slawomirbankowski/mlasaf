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
  var isWorking = true;
  var isStopped = false;
  def Executor() = {
  }
  def setParentContext(pc : Context): Unit = {
    parentContext = pc;
  }

  def onRun();
  def getTypeName() : String;

  def run() = {
    val exeTypeId = parentContext.daoFactory.daos.executorTypeDao.getExecutorTypeFirstByName(getTypeName()).get.executorTypeId
    executorInstanceDto = parentContext.daoFactory.daoCustom.registerExecutorInstance(exeTypeId);
    println("Start executor: " + executorInstanceDto)
    while (!isStopped) {
      println("Executor run in thread: " + executorInstanceDto);
      onRun();
      Thread.sleep(3000L);
    }
    isWorking = false;
    println("End of working, try to unregister Executor: " + executorInstanceDto)
    parentContext.daoFactory.daos.executorInstanceDao.updateField(executorInstanceDto, ExecutorInstanceDto.FIELD_isRunning, 0);
    parentContext.daoFactory.daos.executorInstanceDao.updateField(executorInstanceDto, ExecutorInstanceDto.FIELD_isFinished, 1);
    parentContext.daoFactory.daos.executorInstanceDao.changeUpdatedDate(executorInstanceDto);
    println("End executor " + executorInstanceDto)
  }
  def stopExecutor() = {
    println("Stop executor: " + executorInstanceDto);
    isStopped = true;

  }
}
