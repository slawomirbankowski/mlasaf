/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.tests

import com.mlasaf.MlasafEntry

/** entry test */
object MlasafEntryTest {

  /** main entry point to run all services for MLASAF, initialization from command line arguments or from xml file */
  def main(args : Array[String]) = {
    val newargs = Array(
      "--jdbcString", "jdbc:mysql://localhost:3307/mlasaf25"
      , "--jdbcUser" , System.getenv("MLASAF_USER")
      , "--jdbcPass" , System.getenv("MLASAF_PASS")
      , "--jdbcDriver", System.getenv("MLASAF_DRIVER")
      , "--restPort" , System.getenv("MLASAF_PORT")
      , "--restAlternativePort", System.getenv("MLASAF_PORT_ALTERNATIVE")
      , "--executorDefinition", " { \"executors\" : [ {\"executorType\"=\"RExecutor\", \"portNumber\"=\"8806\"}, {\"executorType\"=\"LocalExecutor\", \"portNumber\"=\"8808\" } ] } "
      //, "--storageDefinition", " { \"storages\" : [ {\"storage\"=\"./\", \"type\"=\"local\"}, {\"storage\"=\"./\", \"storageType\"=\"local\"} ] } "
      , "--executorClasses", System.getenv("MLASAF_EXECUTOR_CLASSES")
      , "--simpleStorage", System.getenv("MLASAF_SIMPLE_STORAGE")
    );
    MlasafEntry.main(newargs);
  }

}
