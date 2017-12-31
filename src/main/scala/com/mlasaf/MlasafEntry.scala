/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf

import com.mlasaf.domain._
import org.rogach.scallop.ScallopConf
import com.mlasaf.structures._

/** Entry point for all Mlasaf applications - executors, RESTs, storages, source managers */
object MlasafEntry {

  val MLASAF_VERSION = "0.5.0";
  val logger = org.slf4j.LoggerFactory.getLogger("MlasafEntry");

  // TODO: prepare output initialization and storage support for output
  // TODO: prepare full testing scenario: create DB - refresh schema - execute all tests - save testing results - drop database
  // TODO: add thread checker and memory consumption checker
  // TODO: DaoFactory STOP method - implement
  // TODO: prepare full testing environment - Docker + scripts
  // TODO: prepare building script with deployment
  // TODO: prepare shell scripts for running different actions
  // TODO: implement REST methods to access DB to be used by GUI
  // TODO: implement basic UI page to create
  /** main entry point to run all services for MLASAF, initialization from command line arguments or from xml file */
  def main(args : Array[String]) = {
    logger.info("START MLASAF " + MLASAF_VERSION);
    System.getProperties.list(System.out);
    logger.info("MLASAF Parameters: " + args.mkString(" "));
    logger.info("DISK spaces: " + com.mlasaf.common.CustomUtils.diskSpaces);
    val context = new Context();
    val entryOptions = new MlasafEntryOptions(args);
    logger.info("restPort: " + entryOptions.restPort)
    logger.info("restAlternativePort: " + entryOptions.restAlternativePort)
    logger.info("jdbcString: " + entryOptions.jdbcString.toString())
    logger.info("jdbcUser: " + entryOptions.jdbcUser.toString())
    logger.info("jdbcDriver: " + entryOptions.jdbcDriver.toString())
    logger.info("storageDefinition: " + entryOptions.storageDefinition.toString())
    logger.info("executorDefinitionStr: " + entryOptions.executorDefinition.toString())
    //println("executorDefinitionObj: " + entryOptions.getExecutorDefinitions().executors.map(x => x.executorType + "," + x.portNumber).mkString(" | "))
    context.run(entryOptions);
    Thread.sleep(20000L);
    logger.info("End MLASAF");
  }
}
