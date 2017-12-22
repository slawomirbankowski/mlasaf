/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.storages

import com.mlasaf.domain._
import com.mlasaf.dto.{ExecutorStorageViewDto, SourceDownloadDto, VSourceScheduleDto, VSourceViewDto}

class HdfsStorage extends Storage {

  def downloadView(sourceView : VSourceViewDto, sourceSchedule : VSourceScheduleDto, sourceDownloadDto : SourceDownloadDto, source : Source, downloader : SouceViewDownloader) : ExecutorStorageViewDto = {
    null
  }

}
