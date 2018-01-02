/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.domain

import com.mlasaf.base.AlgorithmInstance
import com.mlasaf.dto._

/** representation of algorithm run to run algorithm */
class AlgorithmRun {

  /** logger */
  val logger = org.slf4j.LoggerFactory.getLogger("DaoCustom");
  /** current status of RUN */
  var status : String = "CREATED";
  /** parent EXECUTOR */
  var parentExecutor : Executor = null;
  var isFinished : Boolean = false;
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
  //var sourceScheduleDtos : scala.collection.mutable.ListBuffer[SourceScheduleDto] = new scala.collection.mutable.ListBuffer();
  var executorStorageViewDtos : scala.collection.mutable.ListBuffer[VExecutorStorageViewDto] = new scala.collection.mutable.ListBuffer();
  /** all outputs to be created for this run of algorithm */
  var outputs : scala.collection.mutable.ListBuffer[VAlgorithmOutputDto] = new scala.collection.mutable.ListBuffer();

  /** RUN algorithm */
  def runAlgorithm() = {
    logger.info(" +++++++++++++++++++++++ AlgorithmRun status: " + status + ", algorithmRunId: " + algorithmRunDto.algorithmRunId + ", algorithmRunViews: " + algorithmRunViewDtos.size + ", algorithmScheduleViews: " + algorithmScheduleViewDtos.size + ", executorStorageVies: " + executorStorageViewDtos.size)
    // TODO: finish proper flow for AlgorithmRun
    status match {
      case "CREATED" => {
        val neededViewIds = algorithmScheduleViewDtos.map(sv => sv.sourceViewId).distinct;
        val allDownloadedViewIds = executorStorageViewDtos.map(s => s.sourceViewId).distinct;
        val viewsToBeDownloaded = neededViewIds.filter(svid => !allDownloadedViewIds.contains(svid));
        logger.info("AlgorithmRun - All needed viewIds: " + neededViewIds.mkString(",") + "; downloaded views: " + allDownloadedViewIds.distinct.mkString(",") + "; left views: " + viewsToBeDownloaded.mkString(","));
        if (viewsToBeDownloaded.size > 0) {
          status = "DOWNLOADING"
        } else {
          status = "RUNNING"
        }
      }
      case "DOWNLOADING" => {
        val allDownloadedViewIds = executorStorageViewDtos.map(s => s.sourceViewId).distinct;
        val viewsToBeDownloaded = algorithmScheduleViewDtos.filter(svid => !allDownloadedViewIds.contains(svid.sourceViewId));
        viewsToBeDownloaded.foreach(asvDto => {
          val downloadedViews = parentExecutor.parentContext.daoFactory.daos.vExecutorStorageViewDao.getDtosBySourceView_sourceViewId(asvDto.sourceViewId);
          if (downloadedViews.size > 0) {
            val downloadedView = downloadedViews.head;
            logger.info("AlgorithmRun - Got new downloaded viewId: " + downloadedView.sourceViewId + ", path: " + downloadedView.executorStorageResource_resourcePath);
            val algoRunViewDto = parentExecutor.parentContext.daoFactory.daos.algorithmRunViewDao.createAndInsertAlgorithmRunViewDto(algorithmRunDto.algorithmRunId, downloadedView.executorStorageViewId, asvDto.algorithmScheduleViewId, 1);
            algorithmRunViewDtos += algoRunViewDto;
          } else {
            logger.info("AlgorithmRun - Still waiting for viewId: " + asvDto.sourceViewId)
          }
        });
        if (algorithmRunViewDtos.size >= algorithmScheduleViewDtos.size) {
          status = "RUNNING"
        } else {
          status = "DOWNLOADING"
        }
      }
      case "RUNNING" => {
        // create algorithmRunViews
        val allDownloadedViews : scala.collection.mutable.ListBuffer[VSourceDownloadDto] = new scala.collection.mutable.ListBuffer();
        executorStorageViewDtos.foreach(sd => {
          allDownloadedViews ++= parentExecutor.parentContext.daoFactory.daos.vSourceDownloadDao.getDtosBySourceDownloadId(sd.sourceDownloadId);
        });
        logger.info("AlgorithmRun - Collected all views: " + executorStorageViewDtos.map(e => "{executorStorageViewId:" + e.executorStorageViewId + ",sourceViewId:" + e.sourceViewId + ",path:" + e.executorStorageResource_resourcePath + ",rows:" + e.executorStorageResource_resourceRowsCount + "}").mkString(", "))
        try {
          algorithmInstance.run(this);
          status = "DONE"
        } catch {
          case ex : Exception => {
            status = "EXCEPTION";
            logger.error("Exception while run algorithm instance, algorithmRunId: " + algorithmRunDto.algorithmRunId, ex);
            parentExecutor.parentContext.daoFactory.daos.algorithmRunDao.updateField(algorithmRunDto, AlgorithmRunDto.FIELD_errorDescription, ex.getMessage);
            parentExecutor.parentContext.daoFactory.daos.algorithmRunDao.updateField(algorithmRunDto, AlgorithmRunDto.FIELD_isRunning, 0);
            isFinished = true;
          }
        }
      }
      case "DONE" => {
        logger.info("End of run algorithm RUN: " + algorithmRunDto.algorithmRunId);
        parentExecutor.parentContext.daoFactory.daos.algorithmRunDao.updateField(algorithmRunDto, AlgorithmRunDto.FIELD_isFinished, 1);
        parentExecutor.parentContext.daoFactory.daos.algorithmRunDao.updateField(algorithmRunDto, AlgorithmRunDto.FIELD_isRunning, 0);
        isFinished = true;
      }
      case "_" => {
        logger.info("")
      }
    }
    parentExecutor.parentContext.daoFactory.daos.algorithmRunDao.updateField(algorithmRunDto, AlgorithmRunDto.FIELD_runStatus, status);
  }
  override def toString: String = {
    "AlgorithmRun(status=" + status + ",algorithmScheduleId=" + algorithmScheduleDto.algorithmScheduleId + ",algorithmRunId=" + algorithmRunDto.algorithmRunId + ",scheduleViews.cnt=" + algorithmScheduleViewDtos.size + ",storages.cnt=" + executorStorageViewDtos.size + ")"
  }
}
