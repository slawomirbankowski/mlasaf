/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.domain

/** base class for downloader to download view to storage */
trait SouceViewDownloader {

  def initialize();
  def getHeaderRow() : IndexedSeq[String];
  def getNextRow() : Option[IndexedSeq[AnyRef]];
  def close();

}
