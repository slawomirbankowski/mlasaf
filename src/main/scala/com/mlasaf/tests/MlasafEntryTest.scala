/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.tests

import com.mlasaf.MlasafEntry

object MlasafEntryTest {

  /** main entry point to run all services for MLASAF, initialization from command line arguments or from xml file */
  def main(args : Array[String]) = {
    val newargs = Array(
      "--jdbcString", "jdbc:mysql://localhost:3307/mlasaf22"
      ,"--jdbcUser" , "root"
      ,"--jdbcPass" , "rootpass"
      ,"--restPort" , "8300"
      , "--restAlternativePort", "8301"
      , "--jdbcDriver", "com.mysql.jdbc.Driver"
      , "--executorDefinition", " { \"executors\" : [ {\"executorType\"=\"RExecutor\", \"portNumber\"=\"8806\"}, {\"executorType\"=\"LocalExecutor\", \"portNumber\"=\"8808\" } ] } "
      , "--storageDefinition", " { \"storages\" : [ {\"storage\"=\"./\", \"type\"=\"local\"}, {\"storage\"=\"./\", \"storageType\"=\"local\"} ] } "
      , "--executorClasses", "com.mlasaf.executors.RExecutor,com.mlasaf.executors.LocalExecutor"
      , "--simpleStorage", "../data/"
    );
    MlasafEntry.main(newargs);
  }

}
