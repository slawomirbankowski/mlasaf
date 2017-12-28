package com.mlasaf.tests

import com.mlasaf.dao.DaoFactory
import com.mlasaf.dto.ExecutorHostDto

object CreateSampleSourceScheduleTest {

  /** main entry point to run all services for MLASAF, initialization from command line arguments or from xml file */
  def main(args : Array[String]) : Unit = {
    val jdbcString = "jdbc:mysql://localhost:3307/mlasaf25"
    val jdbcUser = System.getenv("MLASAF_USER")
    val jdbcPass = System.getenv("MLASAF_PASS")
    val jdbcDriver = System.getenv("MLASAF_DRIVER")

    val daoFactory = new DaoFactory();
    daoFactory.initialize(jdbcString, jdbcUser, jdbcPass, jdbcDriver);

    val srcViewId = daoFactory.daos.sourceViewDao.getSourceViewByName("dbo.sales").head.sourceViewId;
    val execStorageId = daoFactory.daos.executorStorageDao.getExecutorStorageFirst().executorStorageId;
    println("Creating SourceSchedule for view: " + srcViewId + ", storage: " + execStorageId)
    daoFactory.daos.sourceScheduleDao.createAndInsertSourceScheduleDto(srcViewId, execStorageId, 0, new java.util.Date(), 0, 1, 0);

  }
}
