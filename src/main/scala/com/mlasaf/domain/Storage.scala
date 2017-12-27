/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.domain

import com.mlasaf.base.ThreadBase
import com.mlasaf.dto._

/** storage base class */
trait Storage extends ThreadBase {

  var storageDto : ExecutorStorageDto = null;

  def initialize(ctx : Context, dto : ExecutorStorageDto): Unit = {
    println("Initialization of Storage: " + dto);
    parentContext = ctx;
    storageDto = dto;
  }
  def onRunBegin() = {
    println("Start THREAD for Storage: " + storageDto.executorStorageId);
    downloadSourceSchedules();
  }
  def onRunEnd() = {
    println("End THREAD for Storage: " + storageDto.executorStorageId);
  }
  def onStop(): Unit = {
    isStopped = true;
  }
  def downloadSourceSchedules() : Unit = {
    val allSourceSchedules = parentContext.daoFactory.daos.vSourceScheduleDao.getDtosByExecutorStorage_executorStorageId(this.storageDto.executorStorageId);
    println("Got views to be downloaded to storage: (" + this.storageDto + "), views count: " + allSourceSchedules.size);
    allSourceSchedules.foreach(srcSch => {
      println("Starting downloading schedule: " + srcSch);
      val vSourceViewsDto = parentContext.daoFactory.daos.vSourceViewDao.getDtosBySourceViewId(srcSch.sourceView_sourceViewId);
      if (vSourceViewsDto.size > 0) {
        vSourceViewsDto.foreach(sv => {
          val sourceInstances = parentContext.sources.filter(x => (x.vSourceDto.sourceInstanceId == sv.sourceInstance_sourceInstanceId));
          if (sourceInstances.size > 0) {
            println("Got view to be downloaded: " + sv);
            val sourceDownloadDto = parentContext.daoFactory.daos.sourceDownloadDao.createAndInsertSourceDownloadDto(srcSch.sourceScheduleId, 0, 1, 0, 0, "");
            val downloader = sourceInstances.head.downloadView(sv);
            downloader.initialize();
            downloadView(sv, srcSch, sourceDownloadDto, sourceInstances.head, downloader);
            downloader.close();
          } else {
            println("There is no defined source to download view: " + sv);
          }
        });
      }
    });
  }
  def downloadView(sourceView : VSourceViewDto, sourceSchedule : VSourceScheduleDto, sourceDownloadDto : SourceDownloadDto, source : Source, downloader : SouceViewDownloader) : ExecutorStorageViewDto;


}

