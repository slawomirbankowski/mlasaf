/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.domain

/** should be abstract */
class Executor {

  var executorInstanceId : Int = 0
  var storages : Seq[Storage] = null
  var executorRest : ExecutorRest = null

  def Executor(parentContext : Context) = {

  }

}
