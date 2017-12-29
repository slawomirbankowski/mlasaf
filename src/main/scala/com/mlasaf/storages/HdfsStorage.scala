/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.storages

import com.mlasaf.domain._
import com.mlasaf.dto.{ExecutorStorageViewDto, SourceDownloadDto, VSourceScheduleDto, VSourceViewDto}

/** storage on HDFS */
class HdfsStorage extends Storage {

  def downloadView(sourceView : VSourceViewDto, sourceSchedule : VSourceScheduleDto, sourceDownloadDto : SourceDownloadDto, source : Source, downloader : SouceViewDownloader) : ExecutorStorageViewDto = {
    null
  }
  def onRun() = {

  };

}

object HdfsStorage {
  val NAME: String = "HDFS";
  val DEFAULT_PATH = "/mlasaf/data";
}
