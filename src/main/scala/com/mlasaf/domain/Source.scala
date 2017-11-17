/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.domain

class Source {

  var sourceDefinition : String = ""
  var parentContext : Context = null;
  var sourceId : Int = 0;
  var views : Seq[SourceView] = null

  def Source() {
  }

  def initialize(ctx : Context, srcId : Int) = {

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

}
