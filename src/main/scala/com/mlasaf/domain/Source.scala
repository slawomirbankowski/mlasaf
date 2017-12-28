/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.domain

import com.mlasaf.dto._
import com.mlasaf.base._

/** basic class for source to download views from for algorithms */
trait Source extends ThreadBase {

  var vSourceDto : VSourceInstanceDto = null;
  var vSourceParamsDtos : List[VSourceParamValueDto] = null
  var views : Array[SourceViewDto] = null

  def Source() {
  }
  def onInitialize() : Unit;

  def initialize(ctx : Context, vSrcDto : VSourceInstanceDto, params : List[VSourceParamValueDto]) = {
    parentContext = ctx;
    vSourceDto = vSrcDto;
    vSourceParamsDtos = params;
    println("Initializing SourceInstance " + vSourceDto.sourceInstanceName + ", parameters: " + params.map(p => p.sourceParam_sourceParamName + "=" + p.paramValue).mkString(", "))
    onInitialize();
  }
  def getName() : String = "SOURCE";
  def onRunBegin() = {
    println("Start THREAD for Source: " + vSourceDto.sourceInstanceId);
    getSourceViews();
  }
  def onRunEnd(): Unit = {
  }
  def onRun() = {
  }
  def onStop(): Unit = {
    isStopped = true;
  }
  def isValid() : Boolean = {
    true
  }
  def getSourceViews() : Array[SourceViewDto] = {
    views
  }
  def downloadView(viewName : VSourceViewDto) : SouceViewDownloader;

}
