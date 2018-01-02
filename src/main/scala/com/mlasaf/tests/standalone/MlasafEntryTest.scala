/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.tests.standalone

import com.mlasaf.MlasafEntry

/** entry test */
object MlasafEntryTest {

  /** main entry point to run all services for MLASAF, initialization from command line arguments or from xml file */
  def main(args : Array[String]) = {
    val newargs = Array(
      "--jdbcString", "jdbc:mysql://localhost:3307/mlasaf32"
      , "--jdbcUser" , System.getenv("MLASAF_USER")
      , "--jdbcPass" , System.getenv("MLASAF_PASS")
      , "--jdbcDriver", System.getenv("MLASAF_DRIVER")
      , "--restPort" , System.getenv("MLASAF_PORT")
      , "--restAlternativePort", System.getenv("MLASAF_PORT_ALTERNATIVE")
      , "--executorDefinition", """[ {"executorType":"R", "portNumber":"8806"}, {"executorType":"LOCAL", "portNumber":"8808" }, {"executorType":"WEKA", "portNumber":"8810" } ] """
      , "--storageDefinition", """ [ {"storageType":"LOCAL_DISK", "storageSimplePath":"../data2/", "storageFullPath":"", "storagePort":8815 }, {"storageType":"LOCAL_DISK", "storageSimplePath":"../data3/", "storageFullPath":"", "storagePort":8817 } ] """
      , "--executorClasses", System.getenv("MLASAF_EXECUTOR_CLASSES")
      , "--simpleStorage", System.getenv("MLASAF_SIMPLE_STORAGE")
      , "--maxWorkingTimeSeconds", "1000" // only 60 seconds of run
    );
    MlasafEntry.main(newargs);
  }
}
