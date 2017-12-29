/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.domain

import com.mlasaf.base._
import sun.java2d.loops.ProcessPath.ProcessHandler

class Checker extends ThreadBase {

  def getName() : String = "EXECUTOR";
  /** run for executor */
  def onRunBegin() = {
    this.runInterval = 10000L;
  }
  def onRun() = {
    val allThreadsCount = Thread.activeCount();
    val thCnt = this.parentContext.threads.size;
    val thNnCnt = this.parentContext.threads.filter(x => x.thread != null).size;
    val thAliveCnt = this.parentContext.threads.filter(x => x.thread != null).filter(x => x.thread.isAlive).size;
    val threadIds = this.parentContext.threads.filter(x => x.thread != null).map(t => t.thread.getId).mkString(",");
    val currentDiskFreeSpace : Float = 0;
    val diskSpaceInfo = com.mlasaf.common.CustomUtils.diskSpaces;

    this.parentContext.latestContextRuntimeDto = parentContext.daoFactory.daos.executorContextRuntimeDao.createAndInsertExecutorContextRuntimeDto(parentContext.hostDto.executorHostId, parentContext.contextDto.executorContextId, java.lang.Runtime.getRuntime.availableProcessors(), java.lang.Runtime.getRuntime.freeMemory(), java.lang.Runtime.getRuntime.maxMemory(), java.lang.Runtime.getRuntime.totalMemory())
    println(">>>>>>>>>>>>>>>>>> Checker run in thread, threads: " + thCnt + ", non empty threads: " + thNnCnt + ", alive: " + thAliveCnt + ", threadIds: " + threadIds + ", latestRuntime: " + this.parentContext.latestContextRuntimeDto);
  }
  def onRunEnd() = {
    println(">>>>>>>>>>>>>>>>>> End of working for Checker")
 }
  def onStop() : Unit = {
    println(">>>>>>>>>>>>>>>>>> Stopping Checker...");
  }

}
