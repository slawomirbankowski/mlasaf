/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.domain

trait Storage {


  def downloadViews() : Seq[SourceView];


}

