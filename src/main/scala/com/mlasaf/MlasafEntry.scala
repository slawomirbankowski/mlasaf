/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf

import com.mlasaf.domain._

object MlasafEntry {

  val MLASAF_VERSION = "0.1.0";
  val logger = org.slf4j.LoggerFactory.getLogger("MlasafEntry");

  /** main entry point to run all services for MLASAF, initialization from command line arguments or from xml file */
  def main(args : Array[String]) = {
    logger.info("START MLASAF " + MLASAF_VERSION);
    val context = new Context();
    context.run(args);
    Thread.sleep(20000L);
    logger.info("End MLASAF");
  }

}
