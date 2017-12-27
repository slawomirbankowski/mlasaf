/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.tests

import com.mlasaf.dao.DaoFactory
import com.mlasaf.dto.ExecutorHostDto

object LoadSampleAlgoTest {

  /** main entry point to run all services for MLASAF, initialization from command line arguments or from xml file */
  def main(args : Array[String]) : Unit = {
    val jdbcString = "jdbc:mysql://localhost:3307/mlasaf22"
    val jdbcUser = "root"
    val jdbcPass = "rootpass"
    val jdbcDriver = "com.mysql.jdbc.Driver";

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
  }

}
