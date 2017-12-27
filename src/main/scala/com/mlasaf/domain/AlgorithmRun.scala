/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.domain

import com.mlasaf.dto._

/** representation of algorithm run to run algorithm */
class AlgorithmRun {

  var status : String = "CREATED";
  var parentExecutor : Executor = null;
  var algorithmInstance : AlgorithmInstance = null;
  var algorithmScheduleDto : VAlgorithmScheduleDto = null;
  var algorithmRunDto : AlgorithmRunDto = null;
  var algorithmScheduleViewDtos : scala.collection.mutable.ListBuffer[AlgorithmScheduleViewDto] = new scala.collection.mutable.ListBuffer(); // java.util.LinkedList[AlgorithmScheduleViewDto] = new java.util.LinkedList[AlgorithmScheduleViewDto]();
  var sourceScheduleDtos : scala.collection.mutable.ListBuffer[SourceScheduleDto] = new scala.collection.mutable.ListBuffer(); // java.util.LinkedList[SourceScheduleDto] = new java.util.LinkedList[SourceScheduleDto]();
  var executorStorageViewDtos : scala.collection.mutable.ListBuffer[VExecutorStorageViewDto] = new scala.collection.mutable.ListBuffer();

  def runAlgorithm() = {
    //algorithmInstance.
    status match {
      case "CREATED" => {
        val allDownloadedViewIds : scala.collection.mutable.ListBuffer[Long] = new scala.collection.mutable.ListBuffer();
        executorStorageViewDtos.map(x => x.sourceDownloadId).foreach(sdid => {
          allDownloadedViewIds ++= parentExecutor.parentContext.daoFactory.daos.vSourceDownloadDao.getDtosBySourceDownloadId(sdid).map(x => x.sourceSchedule_sourceViewId);


        });
        //algorithmScheduleViewDtos.map(s => s.sourceViewId).distinct.filterNot(x => allDownloadedViewIds);
        status = "RUNNING"
        println("Check ")
      }
      case "RUNNING" => {
        algorithmInstance.run(this);
        println(" ");
      }
      case "DONE" => {
        println("End of run algorithm RUN: " + algorithmRunDto.algorithmRunId);
      }
      case "_" => {
        println("")
      }
    }
  }
  override def toString: String = {
    "AlgorithmRun(status=" + status + ",algorithmScheduleId=" + algorithmScheduleDto.algorithmScheduleId + ",algorithmRunId=" + algorithmRunDto.algorithmRunId + ",scheduleViews.cnt=" + algorithmScheduleViewDtos.size + ",storages.cnt=" + executorStorageViewDtos.size + ")"
  }
}
