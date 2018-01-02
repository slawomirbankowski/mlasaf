/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.domain

import com.mlasaf.base.{AlgorithmInstance, ThreadBase}
import com.mlasaf.dto._
import com.mlasaf.rest.ExecutorRests

/** Executor to run any external or internal ML algorithm */
trait Executor extends ThreadBase {

  var executorInstanceDto : ExecutorInstanceDto = null
  var executorRest : ExecutorRests = null
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
    logger.info("Start executor: " + executorInstanceDto)
  }
  def onRun() = {
    logger.info("Executor run in thread: " + executorInstanceDto + ", searching for schedules");
    searchForSchedules();
    algorithmRuns();
    onRunExecutor();
  }
  def onRunEnd() = {
    isWorking = false;
    logger.info("End of working, try to unregister Executor: " + executorInstanceDto)
    parentContext.daoFactory.daos.executorInstanceDao.updateField(executorInstanceDto, ExecutorInstanceDto.FIELD_isRunning, 0);
    parentContext.daoFactory.daos.executorInstanceDao.updateField(executorInstanceDto, ExecutorInstanceDto.FIELD_isFinished, 1);
    parentContext.daoFactory.daos.executorInstanceDao.changeUpdatedDate(executorInstanceDto);
    logger.info("End executor " + executorInstanceDto)
  }
  def onStop() : Unit = {
    logger.info("Stopping EXECUTOR...");
  }
  /** search for schedules to create algorithm runs */
  def searchForSchedules() {
    val schedulesForExecutorDto = parentContext.daoFactory.daos.vAlgorithmScheduleDao
      .getDtosByAlgorithmImplementation_executorTypeId(executorInstanceDto.executorTypeId)
      .filter(s => s.isScheduled == 1);
    logger.info("Schedules: " + schedulesForExecutorDto.size + ", current algorithm runs: " + algoRunObjs.size);
    schedulesForExecutorDto.foreach(sch => {
      val allRunsForSchedule = parentContext.daoFactory.daos.algorithmRunDao
        .getAlgorithmRunByFkAlgorithmScheduleId(sch.algorithmScheduleId);
      val runsForSchedule =  allRunsForSchedule.filter(p => com.mlasaf.common.CustomUtils.dateAfterWithHours(p.lastUpdatedDate, (sch.intervalValue/3600).asInstanceOf[Int], new java.util.Date())); // TODO: need to add search by date of last run
      // check - no actual runs - create new one
      if (runsForSchedule.size == 0) {
        logger.info("==> Create new Run for schedule: " + sch + ", all runs count: " + allRunsForSchedule.size);
        // select storage for run
        val supportedStorageTypes = parentContext.daoFactory.daos.algorithmStorageSupportDao.getAlgorithmStorageSupportByFkAlgorithmImplementationId(sch.algorithmImplementationId);
        logger.info("==>All supported storages: " + supportedStorageTypes.map(s => s.executorStorageTypeId).mkString(","));
        var runTypeId = parentContext.daoFactory.daos.algorithmRunTypeDao.getAlgorithmRunTypeFirstByName("NORMAL").get.algorithmRunTypeId;
        val supportedStorageObjects = parentContext.storages.filter(st => supportedStorageTypes.map(s => s.executorStorageTypeId).contains(st.storageDto.executorStorageTypeId));
        val storageObj = supportedStorageObjects.head; // TODO: sort by supportedStorageTypes.supportPriority
        logger.info("==>Support storage object: " + storageObj);
        val storageId = storageObj.storageDto.executorStorageId; // TODO: change this to better assignment storage to download views
        val runDto = parentContext.daoFactory.daos.algorithmRunDao.createAndInsertAlgorithmRunDto(sch.algorithmScheduleId, executorInstanceDto.executorInstanceId, storageId, runTypeId, "any custom name for RUN", new java.util.Date(), "CREATED", 0, "", 1, 0);
        logger.info("Created AlgorithmRun object to run algorithm in LOCAL Executor: " + executorInstanceDto);
        // get all views needed for this run
        val algSchView = parentContext.daoFactory.daos.algorithmScheduleViewDao.getAlgorithmScheduleViewByFkAlgorithmScheduleId(runDto.algorithmScheduleId);
        logger.info("==>For AlgorithmRun all viewIds: " +algSchView.map(a => a.sourceViewId).mkString(","))
        var algoRun : AlgorithmRun = new AlgorithmRun();
        algoRunObjs += algoRun;
        algoRun.parentExecutor = this;
        algoRun.storage = storageObj;
        algoRun.algorithmRunDto = runDto;
        algoRun.algorithmScheduleDto = sch;
        val outputTypeDtos = parentContext.daoFactory.daos.vAlgorithmTypeOutputTypeDao.getDtosByAlgorithmTypeVersion_algorithmTypeVersionId(sch.algorithmImplementation_algorithmTypeVersionId);
        outputTypeDtos.foreach(ot => {
          val outputPath = storageObj.generateOutputPath();
          logger.info("For AlgorthmRun created path on storage: " + storageObj.storageDto.executorStorageId + ", path: " + outputPath);
          val storageResourceDto = parentContext.daoFactory.daos.executorStorageResourceDao.createAndInsertExecutorStorageResourceDto(storageObj.storageDto.executorStorageId, outputPath, 0, 0, 0);
          val outputDto = parentContext.daoFactory.daos.algorithmOutputDao.createAndInsertAlgorithmOutputDto(runDto.algorithmRunId, ot.algorithmOutputTypeId, storageId, storageResourceDto.executorStorageResourceId);
          val vOutputDto : VAlgorithmOutputDto = parentContext.daoFactory.daos.vAlgorithmOutputDao.getDtosByAlgorithmOutputId(outputDto.algorithmOutputId).head;
          algoRun.outputs += vOutputDto;
        });
        logger.info("==>For AlgorithmRun all outputs: " + algoRun.outputs.map(o => "{id:" + o.algorithmOutputId + ",typeId:" + o.algorithmOutputTypeId + ",executorStorageResourceId:" + o.executorStorageResourceId + "}").mkString(","));
        algoRun.algorithmInstance = Class.forName(sch.algorithmImplementation_algorithmImplementationClass).newInstance().asInstanceOf[AlgorithmInstance];
        // create runViews for existing views in storage
        algSchView.foreach(schView => {
          val allStorageViews = parentContext.daoFactory.daos.vExecutorStorageViewDao.getDtosBySourceView_sourceViewId(schView.sourceViewId);
          if (allStorageViews.size > 0) {
            // view already downloaded
            val storageViewDto = allStorageViews.sortBy(-_.lastUpdatedDate.getTime).head
            logger.info("View already downloaded: " + storageViewDto.executorStorageViewId + ", path: " + storageViewDto.executorStorageResource_resourcePath + ", rows: " + storageViewDto.executorStorageResource_resourceRowsCount);
            //val srcDownloads = parentContext.daoFactory.daos.vSourceDownloadDao.get.getDtosBySourceSchedule_sourceViewId(schView.sourceViewId);
            algoRun.executorStorageViewDtos += storageViewDto;
            val algSchCols = parentContext.daoFactory.daos.vAlgorithmScheduleColumnDao.getDtosByAlgorithmScheduleView_algorithmScheduleViewId(schView.algorithmScheduleViewId);
            algoRun.algorithmScheduleColumnDtos ++= algSchCols;
            val algoRunViewDto = parentContext.daoFactory.daos.algorithmRunViewDao.createAndInsertAlgorithmRunViewDto(runDto.algorithmRunId, storageViewDto.executorStorageViewId, schView.algorithmScheduleViewId, 1);
            algoRun.algorithmRunViewDtos += algoRunViewDto;
          } else {
            // view not downloaded - need to schedule
            var srcSchedule = parentContext.daoFactory.daos.sourceScheduleDao.createAndInsertSourceScheduleDto(schView.sourceViewId, storageId, 1, new java.util.Date(), 0, 1, 0);
            logger.info("==>For algorithmRun: " + runDto.algorithmRunId + ", viewId: " + schView.sourceViewId  + " create schedule to download view for viewId: " + schView.sourceViewId + ", NEW schedule: " + srcSchedule.sourceScheduleId);
            algoRun.algorithmScheduleViewDtos += schView;
          }
          val execStorageViews : scala.collection.mutable.ListBuffer[VExecutorStorageViewDto] = new scala.collection.mutable.ListBuffer();
        });
        logger.info("==> Algorithm RUN object ready to run: " + algoRun.toString);
        algoRun.runAlgorithm();
      } else {
        logger.info("==>There are runs for algorithmSchedule: " + sch + ", all runs count: " + allRunsForSchedule.size + ", runIds: " + runsForSchedule.map(x => x.algorithmRunId) + ", lastRun: " + runsForSchedule.map(x => x.lastUpdatedDate).max);
      }
    });
  }
  /** check of all algorithm runs */
  def algorithmRuns() : Unit = {
    algoRunObjs.filter(ar => !ar.isFinished).foreach(ar => {
      ar.runAlgorithm();
    });
  }
  /** run given instance of algorithm */
  def runAlgorithmInstance(run : AlgorithmRun) : Unit;

}
