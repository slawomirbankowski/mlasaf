/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.base

import com.mlasaf.domain.Context

/** base class for all object with Thread assigned */
trait ThreadBase extends Runnable {

  val logger = org.slf4j.LoggerFactory.getLogger("Context");
  /** if object is still working - set internally by methods */
  var isWorking : Boolean = true;
  /** is object is stopped by external run of stop() method */
  var isStopped : Boolean = false;
  /** interval between run onRun() method */
  var runInterval : Long = 10000L;
  /** parent context for thread object */
  var parentContext : Context = null;
  /** thread for this object */
  var thread : Thread = null;

  /** set parent context object */
  def setParentContext(pc : Context): Unit = {
    parentContext = pc;
  }
  /** */
  def start() : Unit = {
    val th : Thread = new Thread(this);
    thread = th;
    th.setDaemon(true);
    th.start();
  }
  /** run method for thread */
  def run() : Unit = {
    logger.info("Start running inThread: " + thread.getId);
    onRunBegin();
    while (!isStopped) {
      logger.info("Run in thread: " + thread.getId);
      try {
        onRun();
      } catch {
        case ex : Exception => { onRunError(ex); }
      }
      Thread.sleep(runInterval);
    }
    logger.info("Stopping thread: " + thread.getId);
    onRunEnd();
    logger.info("Run stopped: " + thread.getId);
  }
  /** get name for threadable object */
  def getName() : String;
  /** run at the begin of working in thread */
  def onRunBegin() : Unit;
  /** */
  def onRun() : Unit;
  def onRunEnd() : Unit;
  def onRunError(ex : Exception) : Unit = {
  }
  /** run in case of invoke stop() method */
  def onStop() : Unit;
  /** stop method to be invoked by external classes */
  def stop() = {
    logger.info("Stop thread: " + this);
    onStop();
    isStopped = true;
  }

}
