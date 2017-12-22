/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.domain

import com.mlasaf.dto._

trait Storage extends Runnable {

  var parentContext : Context = null;
  var storageDto : ExecutorStorageDto = null;

  def initialize(ctx : Context, dto : ExecutorStorageDto): Unit = {
    println("Initialization of Storage: " + dto);
    parentContext = ctx;
    storageDto = dto;
  }
  def run() = {
    println("Start THREAD for Source: " + storageDto.executorStorageId);
    downloadSourceSchedules();
    println("End THREAD for Source: " + storageDto.executorStorageId);
  }
  def stopStorage(): Unit = {

  }
  def downloadSourceSchedules() : Unit = {
    val allSourceSchedules = parentContext.daoFactory.daos.vSourceScheduleDao.getDtosByExecutorStorage_executorStorageId(this.storageDto.executorStorageId);
    println("Got views to be downloaded to storage: (" + this.storageDto + "), views count: " + allSourceSchedules.size);
    allSourceSchedules.foreach(srcSch => {
      println("Starting downloading schedule: " + srcSch);
      val vSourceViewsDto = parentContext.daoFactory.daos.vSourceViewDao.getDtosBySourceViewId(srcSch.sourceView_sourceViewId);
      if (vSourceViewsDto.size > 0) {
        vSourceViewsDto.foreach(sv => {
          val sourceInstances = parentContext.sources.toArray(new Array[Source](0)).filter(x => (x.vSourceDto.sourceInstanceId == sv.sourceInstance_sourceInstanceId));
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

