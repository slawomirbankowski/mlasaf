/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.base

import com.mlasaf.domain.Context

/** base class for all object with Thread assigned */
trait ThreadBase extends Runnable {

  val logger = org.slf4j.LoggerFactory.getLogger("Context");
  var isWorking : Boolean = true;
  var isStopped : Boolean = false;
  var runInterval : Long = 10000L;
  var parentContext : Context = null;
  var thread : Thread = null;

  /**  */
  def setParentContext(pc : Context): Unit = {
    parentContext = pc;
  }
  def start() : Unit = {
    val th : Thread = new Thread(this);
    thread = th;
    th.setDaemon(true);
    th.start();
  }
  def run() : Unit = {
    println("Start running inThread: " + thread.getId);
    onRunBegin();
    while (!isStopped) {
      println("Run in thread: " + thread.getId);
      try {
        onRun();
      } catch {
        case ex : Exception => { onRunError(ex); }
      }
      Thread.sleep(runInterval);
    }
    println("Stopping thread: " + thread.getId);
    onRunEnd();
    println("Run stopped: " + thread.getId);
  }
  def getName() : String;
  def onRunBegin() : Unit;
  def onRun() : Unit;
  def onRunEnd() : Unit;
  def onRunError(ex : Exception) : Unit = {
  }
  def onStop() : Unit;
  def stop() = {
    println("Stop thread: " + this);
    onStop();
    isStopped = true;
  }

}
