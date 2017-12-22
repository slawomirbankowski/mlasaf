/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.domain

import com.mlasaf.dto._

trait Source extends Runnable {

  var parentContext : Context = null;
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
  def run() = {
    println("Start THREAD for Source: " + vSourceDto.sourceInstanceId);
    getSourceViews();
    println("End THREAD for Source: " + vSourceDto.sourceInstanceId);
  }
  def stopSource(): Unit = {
  }
  def isValid() : Boolean = {
    true
  }
  def getSourceViews() : Array[SourceViewDto] = {
    views
  }
  def downloadView(viewName : VSourceViewDto) : SouceViewDownloader;

}
