package com.mlasaf.domain

trait SouceViewDownloader {

  def initialize();
  def getHeaderRow() : IndexedSeq[String];
  def getNextRow() : Option[IndexedSeq[AnyRef]];
  def close();

}
