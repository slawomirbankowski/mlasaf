package com.mlasaf.tests

import com.mlasaf.generates._

object GenerateAllTest {



  /** main entry point to run all services for MLASAF, initialization from command line arguments or from xml file */
  def main(args : Array[String]) : Unit = {

    val jdbcString = "jdbc:sqlserver://localhost\\SQLEXPRESS2014;DatabaseName=mlasaf26";

    val generateOutputFolder = "../generated_code/";
    GenerateDaoClassesEntry.main(Array(
      "--jdbcString", jdbcString
      , "--jdbcUser", System.getenv("MLASAF_USER")
      , "--jdbcPass", System.getenv("MLASAF_PASS")
      , "--jdbcDriver", System.getenv("MLASAF_DRIVER")
      , "--baseFolder", generateOutputFolder + "daoclasses/"
    ));
    GenerateDaoEntry.main(Array(
      "--jdbcString", jdbcString
      , "--jdbcUser", System.getenv("MLASAF_USER")
      , "--jdbcPass", System.getenv("MLASAF_PASS")
      , "--jdbcDriver", System.getenv("MLASAF_DRIVER")
      , "--baseFolder", generateOutputFolder
    ));
    GenerateDtoClassesEntry.main(Array(
      "--jdbcString", jdbcString
      , "--jdbcUser", System.getenv("MLASAF_USER")
      , "--jdbcPass", System.getenv("MLASAF_PASS")
      , "--jdbcDriver", System.getenv("MLASAF_DRIVER")
      , "--baseFolder", generateOutputFolder + "dtoclasses/"
    ));
    GenerateDtoMetadataEntry.main(Array(
      "--jdbcString", jdbcString
      , "--jdbcUser", System.getenv("MLASAF_USER")
      , "--jdbcPass", System.getenv("MLASAF_PASS")
      , "--jdbcDriver", System.getenv("MLASAF_DRIVER")
      , "--baseFolder", generateOutputFolder
    ));
    GenerateViewsEntry.main(Array(
      "--jdbcString", jdbcString
      , "--jdbcUser", System.getenv("MLASAF_USER")
      , "--jdbcPass", System.getenv("MLASAF_PASS")
      , "--jdbcDriver", System.getenv("MLASAF_DRIVER")
      , "--baseFolder", generateOutputFolder
    ));
    GenerateViewsSummaryEntry.main(Array(
      "--jdbcString", jdbcString
      , "--jdbcUser", System.getenv("MLASAF_USER")
      , "--jdbcPass", System.getenv("MLASAF_PASS")
      , "--jdbcDriver", System.getenv("MLASAF_DRIVER")
      , "--baseFolder", generateOutputFolder
    ));


  }

}
