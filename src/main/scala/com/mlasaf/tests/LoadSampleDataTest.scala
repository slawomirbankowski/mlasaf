/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.tests

import com.mlasaf.dao.DaoFactory
import com.mlasaf.loaders._
import com.mlasaf.dto.ExecutorHostDto

/** */
object LoadSampleDataTest {

  /** main entry point to run all services for MLASAF, initialization from command line arguments or from xml file */
  def main(args : Array[String]) : Unit = {
    val jdbcString = "jdbc:mysql://localhost:3307/mlasaf29"
    val jdbcUser = System.getenv("MLASAF_USER")
    val jdbcPass = System.getenv("MLASAF_PASS")
    val jdbcDriver = System.getenv("MLASAF_DRIVER")

    CreateAlgorithmType.main(Array(
      "--jdbcString", jdbcString
      , "--jdbcUser", jdbcUser
      , "--jdbcPass", jdbcPass
      , "--jdbcDriver", jdbcDriver
      , "--algorithmType", "SequenceClustering"
    ));

    CreateAlgorithmVersionType.main(Array(
      "--jdbcString", jdbcString
      , "--jdbcUser", jdbcUser
      , "--jdbcPass", jdbcPass
      , "--jdbcDriver", jdbcDriver
      , "--algorithmType", "SequenceClustering"
      , "--algorithmVersion", "1.0"
      , "--columns", "Time,SingleGroup,NumericValue"
      , "--parameters", "Prediction Times"
      , "--outputTypes", "PRIMARY_PREDICTED"
    ));

    CreateAlgorithmImplementation.main(Array(
      "--jdbcString", jdbcString
      , "--jdbcUser", jdbcUser
      , "--jdbcPass", jdbcPass
      , "--jdbcDriver", jdbcDriver
      , "--executorType", "LOCAL"
      , "--algorithmType", "Prediction"
      , "--algorithmVersion", "1.0"
      , "--algorithmImplementationName", "PredictionLocalSma5"
      , "--algorithmImplementationClass", "com.mlasaf.algorithms.local.PredictionLocalSma5"
      , "--outputType", "PRIMARY_PREDICTED"
    ));

    CreateSourceInstance.main(Array(
      "--jdbcString", jdbcString
      , "--jdbcUser", jdbcUser
      , "--jdbcPass", jdbcPass
      , "--jdbcDriver", jdbcDriver
      , "--sourceType", "JDBC"
      , "--sourceInstanceName", "ClientSampleJdbc"
      , "--sourceParamNames", "Connection String,User,Password,Driver Class"
      , "--sourceParamValues", "jdbc:sqlserver://localhost\\SQLEXPRESS2014;DatabaseName=client_test,sa,sapass,com.microsoft.sqlserver.jdbc.SQLServerDriver"
    ));

    CreateAlgorithmSchedule.main(Array(
      "--jdbcString", jdbcString
      , "--jdbcUser", jdbcUser
      , "--jdbcPass", jdbcPass
      , "--jdbcDriver", jdbcDriver
      , "--algScheduleType", "SINGLE"
      , "--implementationName", "PredictionLocalSma5"
      , "--scheduleName", "run prediction for sales"
      , "--scheduleViewType", "PRIMARY"
      , "--sourceInstanceName", "ClientSampleJdbc"
      , "--sourceViewName", "dbo.sales"
      , "--algoColumns", "Time,SingleGroup,NumericValue"
      , "--inputColumns", "yearmonth,product,sale_value"
    ));

    CreateSourceSchedule.main(Array(
      "--jdbcString", jdbcString
      , "--jdbcUser", jdbcUser
      , "--jdbcPass", jdbcPass
      , "--jdbcDriver", jdbcDriver
      , "--viewName", "dbo.sales"
      , "--storageHostIp", com.mlasaf.common.CustomUtils.getIp
      , "--storageTypeName", "LOCAL_DISK"
    ));

  }

}
