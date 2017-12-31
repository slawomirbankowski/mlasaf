/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.domain

import com.mlasaf.dto._

/** representation of algorithm run to run algorithm */
class AlgorithmRun {

  /** logger */
  val logger = org.slf4j.LoggerFactory.getLogger("DaoCustom");
  /** current status of RUN */
  var status : String = "CREATED";
  /** parent EXECUTOR */
  var parentExecutor : Executor = null;
  /** storage for all materialized views */
  var storage : Storage = null;
  /** instance of algorithm */
  var algorithmInstance : AlgorithmInstance = null;
  /** schedule of algorithm to be run - DTO object */
  var algorithmScheduleDto : VAlgorithmScheduleDto = null;
  /** run of algorithm to be run - DTO object */
  var algorithmRunDto : AlgorithmRunDto = null;
  var algorithmRunViewDtos : scala.collection.mutable.ListBuffer[AlgorithmRunViewDto] = new scala.collection.mutable.ListBuffer();
  var algorithmScheduleViewDtos : scala.collection.mutable.ListBuffer[AlgorithmScheduleViewDto] = new scala.collection.mutable.ListBuffer();
  var algorithmScheduleColumnDtos : scala.collection.mutable.ListBuffer[VAlgorithmScheduleColumnDto] = new scala.collection.mutable.ListBuffer();
  var sourceScheduleDtos : scala.collection.mutable.ListBuffer[SourceScheduleDto] = new scala.collection.mutable.ListBuffer();
  var executorStorageViewDtos : scala.collection.mutable.ListBuffer[VExecutorStorageViewDto] = new scala.collection.mutable.ListBuffer();
  /** all outputs to be created for this run of algorithm */
  var outputs : scala.collection.mutable.ListBuffer[VAlgorithmOutputDto] = new scala.collection.mutable.ListBuffer();

  /** RUN algorithm */
  def runAlgorithm() = {
    logger.info(" +++++++++++++++++++++++ AlgorithmRun status: " + status + ", algorithmRunId: " + algorithmRunDto.algorithmRunId + ", algorithmScheduleViewDtos: " + algorithmScheduleViewDtos.size + ", executorStorageViewDtos: " + executorStorageViewDtos.size)
    // TODO: finish proper flow for AlgorithmRun
    status match {
      case "CREATED" => {
        val neededViewIds = algorithmScheduleViewDtos.map(sv => sv.sourceViewId).distinct;
        val allDownloadedViewIds : scala.collection.mutable.ListBuffer[Long] = new scala.collection.mutable.ListBuffer();
        executorStorageViewDtos.map(x => x.sourceDownloadId).foreach(sdid => {
          allDownloadedViewIds ++= parentExecutor.parentContext.daoFactory.daos.vSourceDownloadDao.getDtosBySourceDownloadId(sdid).map(x => x.sourceSchedule_sourceViewId);
        });
        val viewsToBeDownloaded = neededViewIds.filter(svid => !allDownloadedViewIds.contains(svid));
        logger.info("AlgorithmRun - All needed viewIds: " + neededViewIds.mkString(",") + "; downloaded views: " + allDownloadedViewIds.distinct.mkString(",") + "; left views: " + viewsToBeDownloaded.mkString(","));
        if (viewsToBeDownloaded.size > 0) {
          status = "DOWNLOADING"
        } else {
          status = "RUNNING"
        }
      }
      case "DOWNLOADING" => {
        // TODO: create schedules for all views
        //executorStorageViewDtos.foreach(sd => {
        //  parentExecutor.parentContext.daoFactory.daos.vSourceDownloadDao.getDtosBySourceDownloadId(sd.sourceDownloadId).map(x => x.sourceSchedule_sourceViewId);
        //});
        //if (true) {
          status = "RUNNING"
        //}
      }
      case "RUNNING" => {
        // create algorithmRunViews
        val allDownloadedViews : scala.collection.mutable.ListBuffer[VSourceDownloadDto] = new scala.collection.mutable.ListBuffer();
        executorStorageViewDtos.foreach(sd => {
          allDownloadedViews ++= parentExecutor.parentContext.daoFactory.daos.vSourceDownloadDao.getDtosBySourceDownloadId(sd.sourceDownloadId);
          //sd.
        });
        //println("Creating AlgorithmRunViews for views: " + allDownloadedViews.map(x => x.sourceView_sourceViewId).mkString(","));
        //allDownloadedViews.foreach(execStorageView => {

          //algorithmRunViewDtos += parentExecutor.parentContext.daoFactory.daos.algorithmRunViewDao.createAndInsertAlgorithmRunViewDto(algorithmRunDto.algorithmRunId, execStorageView.sourceSchedule_executorStorageId, 1)
        //});
        try {
          algorithmInstance.run(this);
          status = "DONE"
        } catch {
          case ex : Exception => {
            status = "EXCEPTION";
            parentExecutor.parentContext.daoFactory.daos.algorithmRunDao.updateField(algorithmRunDto, AlgorithmRunDto.FIELD_errorDescription, ex.getMessage);
            parentExecutor.parentContext.daoFactory.daos.algorithmRunDao.updateField(algorithmRunDto, AlgorithmRunDto.FIELD_isRunning, 0);
          }
        }
      }
      case "DONE" => {
        println("End of run algorithm RUN: " + algorithmRunDto.algorithmRunId);
        parentExecutor.parentContext.daoFactory.daos.algorithmRunDao.updateField(algorithmRunDto, AlgorithmRunDto.FIELD_isFinished, 1);
        parentExecutor.parentContext.daoFactory.daos.algorithmRunDao.updateField(algorithmRunDto, AlgorithmRunDto.FIELD_isRunning, 0);
      }
      case "_" => {
        println("")
      }
    }
    parentExecutor.parentContext.daoFactory.daos.algorithmRunDao.updateField(algorithmRunDto, AlgorithmRunDto.FIELD_runStatus, status);
  }
  override def toString: String = {
    "AlgorithmRun(status=" + status + ",algorithmScheduleId=" + algorithmScheduleDto.algorithmScheduleId + ",algorithmRunId=" + algorithmRunDto.algorithmRunId + ",scheduleViews.cnt=" + algorithmScheduleViewDtos.size + ",storages.cnt=" + executorStorageViewDtos.size + ")"
  }
}
