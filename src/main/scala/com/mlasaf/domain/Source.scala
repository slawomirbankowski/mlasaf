/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.domain

trait Source {

  var sourceDefinition : String = ""
  var parentContext : Context = null;
  var sourceId : Int = 0;
  var views : Seq[SourceView] = null

  def Source() {
  }

  def initialize(ctx : Context, srcId : Int) = {
    parentContext = ctx;

  }
  def getSourceDefinition() = {
    sourceDefinition
  }
  def isValid() : Boolean = {
    true
  }
  def getSourceViews() : Seq[SourceView] = {
    views
  }

  def downloadView(viewName : String) = {

  }


}
