/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf

import com.mlasaf.domain._

object MlasafEntry {

  val MLASAF_VERSION = "0.1.0";

  /** main entry point to run all services for MLASAF, initialization from command line arguments or from xml file */
  def main(args : Array[String]) = {
    val logger = org.slf4j.LoggerFactory.getLogger("MlasafEntry");
    logger.info("START MLASAF " + MLASAF_VERSION);

    val context = new Context();
    context.run(args);

    context.daoFactory.getExecutors();

    println("End MLASAF");
  }

}
