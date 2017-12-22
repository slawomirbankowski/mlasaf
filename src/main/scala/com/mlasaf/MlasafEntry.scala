/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf

import com.mlasaf.domain._
import org.rogach.scallop.ScallopConf
import com.mlasaf.structures._

object MlasafEntry {

  val MLASAF_VERSION = "0.3.0";
  val logger = org.slf4j.LoggerFactory.getLogger("MlasafEntry");

  /** main entry point to run all services for MLASAF, initialization from command line arguments or from xml file */
  def main(args : Array[String]) = {
    println("START MLASAF " + MLASAF_VERSION);
    val context = new Context();
    val entryOptions = new MlasafEntryOptions(args);
    println("portNumber: " + entryOptions.restPort)
    println("portNumber: " + entryOptions.restAlternativePort)
    println("jdbcString: " + entryOptions.jdbcString.toString())
    println("jdbcUser: " + entryOptions.jdbcUser.toString())
    println("jdbcDriver: " + entryOptions.jdbcDriver.toString())
    println("storageDefinition: " + entryOptions.storageDefinition.toString())
    println("executorDefinitionStr: " + entryOptions.executorDefinition.toString())
    //println("executorDefinitionObj: " + entryOptions.getExecutorDefinitions().executors.map(x => x.executorType + "," + x.portNumber).mkString(" | "))
    context.run(entryOptions);
    Thread.sleep(20000L);
    logger.info("End MLASAF");
  }
}
