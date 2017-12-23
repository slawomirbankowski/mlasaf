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
  /**  */
  def setParentContext(pc : Context): Unit = {
    parentContext = pc;
  }
  /**  */
  def onRun();
  /**  */
  def getTypeName() : String;
  /**  */
  def run() = {
    val exeTypeId = parentContext.daoFactory.daos.executorTypeDao.getExecutorTypeFirstByName(getTypeName()).get.executorTypeId
    executorInstanceDto = parentContext.daoFactory.daoCustom.registerExecutorInstance(exeTypeId);
    println("Start executor: " + executorInstanceDto)
    while (!isStopped) {
      println("Executor run in thread: " + executorInstanceDto + ", searching for schedules");
      searchForSchedules();
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
  def searchForSchedules() {
    val schedulesForExecutorDto = parentContext.daoFactory.daos.vAlgorithmScheduleDao.getDtosByAlgorithmImplementation_executorTypeId(executorInstanceDto.executorTypeId);
    println("Schedules: " + schedulesForExecutorDto.size);
    schedulesForExecutorDto.foreach(sch => {
      val runsForSchedule = parentContext.daoFactory.daos.algorithmRunDao
        .getAlgorithmRunByFkAlgorithmScheduleId(sch.algorithmScheduleId); // TODO: need to add search by date of last run
      // check - no actual runs - create new one
      if (runsForSchedule.size == 0) {
        println("Create new Run for schedule: " + sch);
        // select storage for run
        val storageId = parentContext.storages.head.storageDto.executorStorageId; // TODO: change this to better assignment storage to download views into
        val runDto = parentContext.daoFactory.daos.algorithmRunDao.createAndInsertAlgorithmRunDto(sch.algorithmScheduleId, executorInstanceDto.executorInstanceId, storageId, "any custom name for RUN", new java.util.Date(), 1, 0);
        // create runViews for existing views in storage

        // create souceSchedule to download view from source to storage

        // wait till all views will be downloaded to storage

        // run algorithm instance


      }
    });
  }
  def stopExecutor() = {
    println("Stop executor: " + executorInstanceDto);
    isStopped = true;
  }
}
