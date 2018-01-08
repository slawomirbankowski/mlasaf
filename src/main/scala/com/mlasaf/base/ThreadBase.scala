/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.base

import com.mlasaf.domain.Context

/** base class for all object with Thread assigned */
trait ThreadBase extends Runnable {

  val logger = org.slf4j.LoggerFactory.getLogger("ThreadBase");
  /** if object is still working - set internally by methods */
  var isWorking : Boolean = true;
  /** if object is still working - set internally by methods */
  var isRunning : Boolean = true;
  /** if object has been initialized - method onRunBegin has ended */
  var isInitialized : Boolean = false;
  /** is object is stopped by external run of stop() method */
  var isStopped : Boolean = false;
  /** interval between run onRun() method */
  var runInterval : Long = 5000L;
  /** parent context for thread object */
  var parentContext : Context = null;
  /** thread for this object */
  var thread : Thread = null;
  /** start time of context */
  val startTime : java.util.Date = new java.util.Date();
  /** start time of context */
  var stopTime : java.util.Date = null;
  /** start time of context */
  var endTime : java.util.Date = null;

  /** set parent context object */
  def setParentContext(pc : Context): Unit = {
    parentContext = pc;
  }
  /** */
  def start() : Unit = {
    val th : Thread = new Thread(this);
    thread = th;
    th.setDaemon(true);
    th.setName(this.getName());
    th.start();
    onStart();
    Thread.sleep(2500L);
  }
  /** stop method to be invoked by external classes */
  def stop() = {
    stopTime = new java.util.Date();
    logger.info("Stop thread: " + this);
    // pack with try ... catch to log all errors while onStop()
    onStop();
    isStopped = true;
    Thread.sleep(2500L);
  }
  /** run method for thread */
  def run() : Unit = {
    isRunning = true;
    logger.info("Start running in Thread: " + thread.getId + ", name: " + thread.getName + ", class: " + this.getClass.getName);
    if (!isInitialized) {
      logger.info("Run onRunBegin in Thread: " + thread.getId + ", name: " + thread.getName + ", class: " + this.getClass.getName);
      onRunBegin();
    } else {
      logger.warn("Thread is ALREADY INITIALIZED, id: " + thread.getId + ", name: " + thread.getName + ", class: " + this.getClass.getName);
    }
    var totalSleepCount = 0;
    var totalRunCount = 0;
    var lastRunDate = System.currentTimeMillis()
    isInitialized = true;
    while (!isStopped) {
      if (System.currentTimeMillis() - lastRunDate >= runInterval) {
        logger.info("Run in thread: " + thread.getId + ", class: " + this.getClass.getName + ", totalSleepCount: " + totalSleepCount + ", totalRunCount: " + totalRunCount + ", runInterval: " + this.runInterval + ", startTime: " + this.startTime + ", name: " + this.getName() + ", daemon: " + this.thread.isDaemon + ", thread.priority: " + this.thread.getPriority);
        try {
          totalRunCount = totalRunCount + 1;
          onRun();
        } catch {
          case ex : Exception => {
            logger.error("Exception while running THREAD:" + this.thread.getId + ", name: " + thread.getName + ", class: " + this.getClass.getName, ex);
            onRunError(ex);
          }
        }
        lastRunDate = new java.util.Date().getTime;
      }
      totalSleepCount = totalSleepCount + 1;
      Thread.sleep(500L);
    }
    logger.info("Stopping thread: " + thread.getId + ", name: " + thread.getName + ", class: " + this.getClass.getName);
    onRunEnd();
    logger.info("Run stopped: " + thread.getId + ", name: " + thread.getName + ", class: " + this.getClass.getName);
    isRunning = false;
    endTime = new java.util.Date();
  }
  /** wait in this thread till end of service execution */
  def waitTillEnd(maxWaitingTimeMilliseconds : Long) : Unit = {
    val startWaitingTime = new java.util.Date();
    Thread.sleep(5000L);
    while (!isInitialized || (isRunning && (maxWaitingTimeMilliseconds > 0L && maxWaitingTimeMilliseconds <= (new java.util.Date().getTime -  startWaitingTime.getTime) ))) {
      Thread.sleep(3000L);
    }
  }
  /** get name for threadable object */
  def getName() : String;
  /** run at the begin of working in thread */
  def onRunBegin() : Unit;
  /** to override - method to run in cycle */
  def onRun() : Unit;
  /** to override - method to run on end of working */
  def onRunEnd() : Unit;
  /** to override - method to run in case of error */
  def onRunError(ex : Exception) : Unit = {  }
  /** run in case of invoke stop() method */
  def onStop() : Unit;
  /** to override - run in case of invoke start() method */
  def onStart() : Unit = {
  };

}
