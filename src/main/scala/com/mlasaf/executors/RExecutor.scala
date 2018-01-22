/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.executors

import java.util

import com.mlasaf.domain._
import com.mlasaf.structures._

/** executor using R scripts */
class RExecutor extends Executor {

  def onRunExecutor(): Unit = {
    logger.info("R Executor run  ")
  }
  def getTypeName() : String = {
    "R"
  }
  /** run given instance of algorithm */
  def runAlgorithmInstance(run : AlgorithmRun) : Unit = {
  }
  /** execute external script */
  def onExecuteExternal(args : Array[String]) : ExternalExitParams = {
    logger.info("Run EXTERNAL R command with parameters: " + args.mkString(","));
    //paramsForHostExecutorType.filter(p => p.executorParam_executorParamName.equals("ShellScriptPath"));
    //paramsForHostExecutorType.filter(p => p.executorParam_executorParamName.equals("ShellScriptName"));
    val rScriptPathName = "C:\\Program Files\\R\\R-3.4.3\\bin\\Rscript.exe"
    logger.info("R Executor path: " + rScriptPathName);
    val params : java.util.List[String] = new util.LinkedList[String]();
    params.add(rScriptPathName);
    params.add("--vanilla");
    args.foreach(a => params.add(a));
    try {
        logger.info("Run ProcessBuilder with parameters: " + params.toArray.mkString(" | "));
        val rProcessBuilder = new java.lang.ProcessBuilder().command(params);
        val rProcess = rProcessBuilder.start();
        logger.info("Process ran, waiting for END...");
        rProcess.waitFor();
        val exitValue = rProcess.exitValue();
        logger.info("Process ended, exitCode: " + exitValue);
        new ExternalExitParams(exitValue, "");
    } catch {
      case ex : Exception => {
        logger.error("Exception while running R script", ex);
        new ExternalExitParams(-1, "" + ex.getMessage);
      }
    }
  }

}
