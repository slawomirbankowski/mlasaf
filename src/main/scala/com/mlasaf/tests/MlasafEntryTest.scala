/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.tests

import com.mlasaf.MlasafEntry

object MlasafEntryTest {

  /** main entry point to run all services for MLASAF, initialization from command line arguments or from xml file */
  def main(args : Array[String]) = {
    val newargs = Array("--executors", "com.mlasaf.executors.RExecutor,com.mlasaf.executors.LocalExecutor"
      , "--jdbcString", "jdbc:mysql://localhost:3307/mlasaf22"
      ,"--jdbcUser" , "root"
      ,"--jdbcPass" , "rootpass"
      ,"--restPort" , "8300"
      ,"--restAlternativePort" , "8301"
    );
    MlasafEntry.main(newargs);
  }

}
