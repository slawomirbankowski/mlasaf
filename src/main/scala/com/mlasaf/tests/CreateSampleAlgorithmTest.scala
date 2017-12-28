/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.tests

import com.mlasaf.dao.DaoFactory
import com.mlasaf.dto.ExecutorHostDto

object CreateSampleAlgorithmTest {

  /** main entry point to run all services for MLASAF, initialization from command line arguments or from xml file */
  def main(args : Array[String]) : Unit = {
    val jdbcString = "jdbc:mysql://localhost:3307/mlasaf25"
    val jdbcUser = System.getenv("MLASAF_USER");
    val jdbcPass = System.getenv("MLASAF_PASS");
    val jdbcDriver = System.getenv("MLASAF_DRIVER");

    val daoFactory = new DaoFactory();
    daoFactory.initialize(jdbcString, jdbcUser, jdbcPass, jdbcDriver);

    val execTypeId = daoFactory.daos.executorTypeDao.getExecutorTypeByName("LOCAL").head.executorTypeId;
    println("execTypeId: " + execTypeId);
    val algTypeId = daoFactory.daos.algorithmTypeDao.getAlgorithmTypeByName("Prediction").head.algorithmTypeId;
    println("algTypeId: " + algTypeId);
    val algTypeVerId = daoFactory.daos.algorithmTypeVersionDao.getAlgorithmTypeVersionsList().filter(a => (a.algorithmTypeVersionName.equals("1.0") && a.algorithmTypeId == algTypeId)).head.algorithmTypeVersionId;
    println("algTypeVerId: " + algTypeVerId);
    val algImplDto = daoFactory.daos.algorithmImplementationDao.createAndInsertAlgorithmImplementationDto(algTypeVerId, execTypeId, "PredictionLocalSma5", "com.mlasaf.algorithms.local.PredictionLocalSma5");
    println("algImplDto: " + algImplDto);

    // columns
    daoFactory.daos.algorithmTypeColumnTypeDao.createAndInsertAlgorithmTypeColumnTypeDto(algTypeVerId, daoFactory.daos.algorithmColumnTypeDao.getAlgorithmColumnTypeFirstByName("Time").get.algorithmColumnTypeId, 0, 0);
    daoFactory.daos.algorithmTypeColumnTypeDao.createAndInsertAlgorithmTypeColumnTypeDto(algTypeVerId, daoFactory.daos.algorithmColumnTypeDao.getAlgorithmColumnTypeFirstByName("SingleGroup").get.algorithmColumnTypeId, 0, 0);
    daoFactory.daos.algorithmTypeColumnTypeDao.createAndInsertAlgorithmTypeColumnTypeDto(algTypeVerId, daoFactory.daos.algorithmColumnTypeDao.getAlgorithmColumnTypeFirstByName("NumericValue").get.algorithmColumnTypeId, 0, 0);
    // parameters
    daoFactory.daos.algorithmParamTypeDao.createAndInsertAlgorithmParamTypeDto(daoFactory.daos.algorithmParamDao.getAlgorithmParamFirstByName("Prediction Times").get.algorithmParamId, algTypeId, algTypeVerId);


  }

}
