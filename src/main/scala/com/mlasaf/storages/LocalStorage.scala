/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.storages

import java.io.FileWriter

import com.mlasaf.domain._
import com.mlasaf.dto.{ExecutorStorageViewDto, SourceDownloadDto, VSourceScheduleDto, VSourceViewDto}
import com.mlasaf.common._

class LocalStorage extends Storage {

  def downloadView(sourceView : VSourceViewDto, sourceSchedule : VSourceScheduleDto, sourceDownloadDto : SourceDownloadDto, source : Source, downloader : SouceViewDownloader) : ExecutorStorageViewDto = {
    val storageViewFolderPath = this.storageDto.storageFulllPath + java.io.File.separator + CustomUtils.randomLong();
    println("Download view to LOCAL storage to path: " + storageViewFolderPath)
    new java.io.File(storageViewFolderPath).mkdirs();
    val storageViewFilePath = storageViewFolderPath + java.io.File.separator + "data.csv";
    val bos = new java.io.BufferedWriter(new FileWriter(storageViewFilePath));
    bos.write(downloader.getHeaderRow().mkString("\t"));
    var viewRowsCount : Long = 0;
    var viewSize : Long = 0;
    var nextRow = downloader.getNextRow();
    while (!nextRow.isEmpty) {
      val rowStr = nextRow.get.mkString("\t");
      viewSize = viewSize + rowStr.length;
      bos.write("\n");
      bos.write(rowStr);
      viewRowsCount = viewRowsCount + 1;
      nextRow = downloader.getNextRow();
    }
    bos.close();
    println("File downloaded from view to path: " + storageViewFilePath + ", rows: " + viewRowsCount + ", size: " + viewSize);
    val storageSnapshotDto = parentContext.daoFactory.daos.executorStorageSnapshotDao.createAndInsertExecutorStorageSnapshotDto(1);
    val storageViewDto = parentContext.daoFactory.daos.executorStorageViewDao.createAndInsertExecutorStorageViewDto(storageSnapshotDto.executorStorageSnapshotId, this.storageDto.executorStorageId, sourceDownloadDto.sourceDownloadId, storageViewFilePath, viewSize, viewRowsCount)
    storageViewDto
  }

}
