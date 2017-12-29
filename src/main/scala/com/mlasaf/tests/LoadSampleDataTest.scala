/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.tests

import com.mlasaf.dao.DaoFactory
import com.mlasaf.loaders._
import com.mlasaf.dto.ExecutorHostDto

object LoadSampleDataTest {

  /** main entry point to run all services for MLASAF, initialization from command line arguments or from xml file */
  def main(args : Array[String]) : Unit = {
    val jdbcString = "jdbc:mysql://localhost:3307/mlasaf26"
    val jdbcUser = System.getenv("MLASAF_USER")
    val jdbcPass = System.getenv("MLASAF_PASS")
    val jdbcDriver = System.getenv("MLASAF_DRIVER")

    val daoFactory = new DaoFactory();
    daoFactory.initialize(jdbcString, jdbcUser, jdbcPass, jdbcDriver);


    CreateAlgorithmImplementation.main(Array(
      "--jdbcString", "jdbc:mysql://localhost:3307/mlasaf25"
      , "--jdbcUser", System.getenv("MLASAF_USER")
      , "--jdbcPass", System.getenv("MLASAF_PASS")
      , "--jdbcDriver", System.getenv("MLASAF_DRIVER")
      , "--executorType", "LOCAL"
      , "--algorithmType", "Prediction"
      , "--algorithmVersion", "1.0"
      , "--algorithmImplementationName", "PredictionLocalSma5"
      , "--algorithmImplementationClass", "com.mlasaf.algorithms.local.PredictionLocalSma5"
      , "--outputType", "PRIMARY_PREDICTED"
    ));

    CreateAlgorithmSchedule.main(Array(
      "--jdbcString", "jdbc:mysql://localhost:3307/mlasaf25"
      , "--jdbcUser", System.getenv("MLASAF_USER")
      , "--jdbcPass", System.getenv("MLASAF_PASS")
      , "--jdbcDriver", System.getenv("MLASAF_DRIVER")
      , "--algScheduleType", "SINGLE"
      , "--implementationName", "PredictionLocalSma5"
      , "--scheduleName", "run prediction for sales"
      , "--scheduleViewType", "PRIMARY"
      , "--sourceInstanceName", "SampleTestSourceJdbc"
      , "--sourceViewName", "dbo.sales"
      , "--algoColumns", "Time,SingleGroup,NumericValue"
      , "--inputColumns", "yearmonth,product,sale_value"
    ));

    CreateAlgorithmType.main(Array(
      "--jdbcString", "jdbc:mysql://localhost:3307/mlasaf25"
      , "--jdbcUser", System.getenv("MLASAF_USER")
      , "--jdbcPass", System.getenv("MLASAF_PASS")
      , "--jdbcDriver", System.getenv("MLASAF_DRIVER")
      , "--algorithmType", "Prediction"
    ));
    CreateAlgorithmVersionType.main(Array(
      "--jdbcString", "jdbc:mysql://localhost:3307/mlasaf25"
      , "--jdbcUser", System.getenv("MLASAF_USER")
      , "--jdbcPass", System.getenv("MLASAF_PASS")
      , "--jdbcDriver", System.getenv("MLASAF_DRIVER")
      , "--algorithmType", "Prediction"
      , "--algorithmVersion", "1.1"
      , "--columns", "Time,SingleGroup,NumericValue"
      , "--parameters", "Prediction Times"
      , "--outputTypes", "PRIMARY_PREDICTED"
    ));

    CreateSourceInstance.main(Array(
      "--jdbcString", "jdbc:mysql://localhost:3307/mlasaf25"
      , "--jdbcUser", System.getenv("MLASAF_USER")
      , "--jdbcPass", System.getenv("MLASAF_PASS")
      , "--jdbcDriver", System.getenv("MLASAF_DRIVER")
      , "--sourceType", "JDBC"
      , "--sourceInstanceName", "SampleTestSourceJdbc"
      , "--sourceParamNames", "Connection String,User,Password,Driver Class"
      , "--sourceParamValues", "jdbc:sqlserver://localhost\\SQLEXPRESS2014;DatabaseName=client_test,sa,sapass,com.microsoft.sqlserver.jdbc.SQLServerDriver"
    ));

    CreateSourceSchedule.main(Array(
      "--jdbcString", "jdbc:mysql://localhost:3307/mlasaf25"
      , "--jdbcUser", System.getenv("MLASAF_USER")
      , "--jdbcPass", System.getenv("MLASAF_PASS")
      , "--jdbcDriver", System.getenv("MLASAF_DRIVER")
      , "--viewName", "dbo.sales"
      , "--storageHostIp", com.mlasaf.common.CustomUtils.getIp
      , "--storageTypeName", "LOCAL_DISK"
    ));

  }

}
