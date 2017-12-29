/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.domain

import com.mlasaf.base.ThreadBase
import com.mlasaf.dto._

/** Executor to run any external or internal ML algorithm */
trait Executor extends ThreadBase {

  var executorInstanceDto : ExecutorInstanceDto = null
  var executorRest : ExecutorRest = null
  val algoRunObjs : scala.collection.mutable.ListBuffer[AlgorithmRun] = new scala.collection.mutable.ListBuffer();

  def Executor() = {
  }
  def onRunExecutor() : Unit;
  def getName() : String = "EXECUTOR";
  /**  */
  def getTypeName() : String;
  /** run for executor */
  def onRunBegin() = {
    val exeTypeId = parentContext.daoFactory.daos.executorTypeDao.getExecutorTypeFirstByName(getTypeName()).get.executorTypeId
    executorInstanceDto = parentContext.daoFactory.daoCustom.registerExecutorInstance(exeTypeId , parentContext.contextDto.executorContextId);
    println("Start executor: " + executorInstanceDto)
  }
  def onRun() = {
    println("Executor run in thread: " + executorInstanceDto + ", searching for schedules");
    searchForSchedules();
    algorithmRuns();
    onRunExecutor();
  }
  def onRunEnd() = {
    isWorking = false;
    println("End of working, try to unregister Executor: " + executorInstanceDto)
    parentContext.daoFactory.daos.executorInstanceDao.updateField(executorInstanceDto, ExecutorInstanceDto.FIELD_isRunning, 0);
    parentContext.daoFactory.daos.executorInstanceDao.updateField(executorInstanceDto, ExecutorInstanceDto.FIELD_isFinished, 1);
    parentContext.daoFactory.daos.executorInstanceDao.changeUpdatedDate(executorInstanceDto);
    println("End executor " + executorInstanceDto)
  }
  def onStop() : Unit = {
    println("Stopping EXECUTOR...");
  }
  /** search for schedules to create algorithm runs */
  def searchForSchedules() {
    val schedulesForExecutorDto = parentContext.daoFactory.daos.vAlgorithmScheduleDao
      .getDtosByAlgorithmImplementation_executorTypeId(executorInstanceDto.executorTypeId)
      .filter(s => s.isScheduled == 1);
    println("Schedules: " + schedulesForExecutorDto.size + ", current algorithm runs: " + algoRunObjs.size);
    schedulesForExecutorDto.foreach(sch => {
      val runsForSchedule = parentContext.daoFactory.daos.algorithmRunDao
        .getAlgorithmRunByFkAlgorithmScheduleId(sch.algorithmScheduleId); // TODO: need to add search by date of last run
      // check - no actual runs - create new one
      if (runsForSchedule.size == 0) {
        println("Create new Run for schedule: " + sch);
        // select storage for run
        var runTypeId = parentContext.daoFactory.daos.algorithmRunTypeDao.getAlgorithmRunTypeFirstByName("NORMAL").get.algorithmRunTypeId;
        val storageObj = parentContext.storages.head;
        val storageId = storageObj.storageDto.executorStorageId; // TODO: change this to better assignment storage to download views into
        val runDto = parentContext.daoFactory.daos.algorithmRunDao.createAndInsertAlgorithmRunDto(sch.algorithmScheduleId, executorInstanceDto.executorInstanceId, storageId, runTypeId, "any custom name for RUN", new java.util.Date(), "CREATED", 0, "", 1, 0);
        println("Created AlgorithmRun object to run algorithm in LOCAL Executor: " + executorInstanceDto);
        // get all views needed for this run
        val algSchView = parentContext.daoFactory.daos.algorithmScheduleViewDao.getAlgorithmScheduleViewByFkAlgorithmScheduleId(runDto.algorithmScheduleId);
        var algoRun : AlgorithmRun = new AlgorithmRun();
        algoRunObjs += algoRun;
        algoRun.parentExecutor = this;
        algoRun.storage = storageObj;
        algoRun.algorithmRunDto = runDto;
        algoRun.algorithmScheduleDto = sch;
        algoRun.algorithmInstance = Class.forName(sch.algorithmImplementation_algorithmImplementationClass).newInstance().asInstanceOf[AlgorithmInstance];
        //algoRun.algorithmScheduleViewDto
        // create runViews for existing views in storage
        algSchView.foreach(schView => {
          //val srcView = parentContext.daoFactory.daos.sourceViewDao.getSourceViewByPk(schView.sourceViewId);
          val srcDownloads = parentContext.daoFactory.daos.vSourceDownloadDao.getDtosBySourceSchedule_sourceViewId(schView.sourceViewId);
          val execStorageViews : scala.collection.mutable.ListBuffer[VExecutorStorageViewDto] = new scala.collection.mutable.ListBuffer();
          algoRun.algorithmScheduleViewDtos += schView;
          srcDownloads.foreach(sd => {
            val storageViews = parentContext.daoFactory.daos.vExecutorStorageViewDao.getDtosBySourceDownloadId(sd.sourceDownloadId);
            //storageViews.sortBy(x => -x.insertedRowDate.getTime);
            execStorageViews ++= storageViews;
          });
          if (execStorageViews.size > 0) {
            println("For algorithmSchedule: " + schView.algorithmScheduleId + " got storage views: " + execStorageViews.size);
            val storageViewLatestDto = execStorageViews.sortBy(x => -x.insertedRowDate.getTime).head;
            algoRun.executorStorageViewDtos += storageViewLatestDto;
            val algSchCols = parentContext.daoFactory.daos.vAlgorithmScheduleColumnDao.getDtosByAlgorithmScheduleView_algorithmScheduleViewId(schView.algorithmScheduleViewId);
            algoRun.algorithmScheduleColumnDtos ++= algSchCols;
          } else {
            // create souceSchedule to download view from source to storage
            var srcSchedule = parentContext.daoFactory.daos.sourceScheduleDao.createAndInsertSourceScheduleDto(schView.sourceViewId, storageId, 1, new java.util.Date(), 0, 1, 0);
            algoRun.sourceScheduleDtos += srcSchedule;
          }
          println("-------------> Algorithm RUN object ready to run: " + algoRun.toString);
          algoRun.runAlgorithm();
        });
      } else {
        println("There are runs for algorithmSchedule: " + sch);
      }
    });
  }
  /** check of all algorithm runs */
  def algorithmRuns() : Unit = {
    algoRunObjs.filter(ar => ar.status.equals(""));
    algoRunObjs.foreach(ar => {
      ar.runAlgorithm();
    });
  }
  /** run given instance of algorithm */
  def runAlgorithmInstance(run : AlgorithmRun) : Unit;

}
