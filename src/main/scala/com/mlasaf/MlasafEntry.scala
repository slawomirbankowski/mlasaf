/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf

import com.mlasaf.domain._

object MlasafEntry {

  def main(args : Array[String]) = {
    val logger = org.slf4j.LoggerFactory.getLogger("MlasafEntry");
    logger.info("START MLASAF");

    val context = new Context();
    context.run(args);

    context.daoFactory.getExecutors();

    println("End MLASAF");
  }

}
