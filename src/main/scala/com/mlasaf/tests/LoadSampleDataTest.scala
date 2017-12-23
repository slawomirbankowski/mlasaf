/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.tests

import com.mlasaf.dao.DaoFactory
import com.mlasaf.dto.ExecutorHostDto

object LoadSampleDataTest {

  /** main entry point to run all services for MLASAF, initialization from command line arguments or from xml file */
  def main(args : Array[String]) : Unit = {
    val jdbcString = "jdbc:mysql://localhost:3307/mlasaf22"
    val jdbcUser = "root"
    val jdbcPass = "rootpass"
    val jdbcDriver = "com.mysql.jdbc.Driver";

    val daoFactory = new DaoFactory();
    daoFactory.initialize(jdbcString, jdbcUser, jdbcPass, jdbcDriver);

    val srcTypeId = daoFactory.daos.sourceTypeDao.getSourceTypeFirstByName("JDBC").get.sourceTypeId;
    println("Got ID of JDBC source: " + srcTypeId)
    val srcInstanceDto = daoFactory.daos.sourceInstanceDao.createAndInsertSourceInstanceDto(srcTypeId, "SampleSecondTestSourceJdbc", 0, 0, "OK", new java.util.Date());
    println("Created SourceInstance: " + srcInstanceDto)
    daoFactory.daos.sourceParamValueDao.createAndInsertSourceParamValueDto(srcInstanceDto.sourceInstanceId,  daoFactory.daos.sourceParamDao.getSourceParamFirstByName("Connection String").get.sourceParamId, "1", "jdbc:sqlserver://localhost\\SQLEXPRESS2014;DatabaseName=client_test");
    daoFactory.daos.sourceParamValueDao.createAndInsertSourceParamValueDto(srcInstanceDto.sourceInstanceId,  daoFactory.daos.sourceParamDao.getSourceParamFirstByName("User").get.sourceParamId, "1", "sa");
    daoFactory.daos.sourceParamValueDao.createAndInsertSourceParamValueDto(srcInstanceDto.sourceInstanceId,  daoFactory.daos.sourceParamDao.getSourceParamFirstByName("Password").get.sourceParamId, "1", "sapass");
    daoFactory.daos.sourceParamValueDao.createAndInsertSourceParamValueDto(srcInstanceDto.sourceInstanceId,  daoFactory.daos.sourceParamDao.getSourceParamFirstByName("Driver Class").get.sourceParamId, "1", "com.microsoft.sqlserver.jdbc.SQLServerDriver");

    //daoFactory.daos.sourceParamValueDao.getSourceParamValueByFkSourceInstanceId(srcInstanceDto.sourceInstanceId);
    val allSourceInstanceParams = daoFactory.daos.vSourceParamValueDao.getDtosBySourceInstance_sourceInstanceId(srcInstanceDto.sourceInstanceId);
    println("Created SourceParamValue(s): " + allSourceInstanceParams.map(x => x.toString).mkString(" | "));

    val srcViewId = daoFactory.daos.sourceViewDao.getSourceViewByName("dbo.algorithmType").head.sourceViewId;
    val execStorageId = daoFactory.daos.executorStorageDao.getExecutorStorageFirst().executorStorageId;
    println("Creating SourceSchedule for view: " + srcViewId + ", storage: " + execStorageId)
    daoFactory.daos.sourceScheduleDao.createAndInsertSourceScheduleDto(1, 1, 0, new java.util.Date(), 0);

  }

}
