package com.mlasaf.tests

object LoggerTest {
  val logger = org.slf4j.LoggerFactory.getLogger("LoggerTest");

  def main(args : Array[String]) : Unit = {
    logger.info(" START ")
    val jdbcString = System.getenv("MLASAF_JDBC");
    val jdbcUser = System.getenv("MLASAF_USER");
    val jdbcPass = System.getenv("MLASAF_PASS");
    val jdbcDriver = System.getenv("MLASAF_DRIVER");

    logger.warn("This is warning !!! ")

    logger.warn("Logger object: " + logger.toString)
    logger.info(" END ")
  }

}
