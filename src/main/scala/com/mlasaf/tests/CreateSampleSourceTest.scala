package com.mlasaf.tests

import com.mlasaf.dao.DaoFactory
import com.mlasaf.dto.ExecutorHostDto

object CreateSampleSourceTest {

  /** main entry point to run all services for MLASAF, initialization from command line arguments or from xml file */
  def main(args : Array[String]) : Unit = {
    val jdbcString = "jdbc:mysql://localhost:3307/mlasaf25"
    val jdbcUser = System.getenv("MLASAF_USER")
    val jdbcPass = System.getenv("MLASAF_PASS")
    val jdbcDriver = System.getenv("MLASAF_DRIVER")

    val daoFactory = new DaoFactory();
    daoFactory.initialize(jdbcString, jdbcUser, jdbcPass, jdbcDriver);

    val srcTypeId = daoFactory.daos.sourceTypeDao.getSourceTypeFirstByName("JDBC").get.sourceTypeId;
    println("Got ID of JDBC source: " + srcTypeId)
    val srcInstanceDto = daoFactory.daos.sourceInstanceDao.createAndInsertSourceInstanceDto(srcTypeId, "SampleTestSourceJdbc", 0, 0, "OK", new java.util.Date());
    println("Created SourceInstance: " + srcInstanceDto)
    daoFactory.daos.sourceParamValueDao.createAndInsertSourceParamValueDto(srcInstanceDto.sourceInstanceId,  daoFactory.daos.sourceParamDao.getSourceParamFirstByName("Connection String").get.sourceParamId, "1", "jdbc:sqlserver://localhost\\SQLEXPRESS2014;DatabaseName=client_test");
    daoFactory.daos.sourceParamValueDao.createAndInsertSourceParamValueDto(srcInstanceDto.sourceInstanceId,  daoFactory.daos.sourceParamDao.getSourceParamFirstByName("User").get.sourceParamId, "1", "sa");
    daoFactory.daos.sourceParamValueDao.createAndInsertSourceParamValueDto(srcInstanceDto.sourceInstanceId,  daoFactory.daos.sourceParamDao.getSourceParamFirstByName("Password").get.sourceParamId, "1", "sapass");
    daoFactory.daos.sourceParamValueDao.createAndInsertSourceParamValueDto(srcInstanceDto.sourceInstanceId,  daoFactory.daos.sourceParamDao.getSourceParamFirstByName("Driver Class").get.sourceParamId, "1", "com.microsoft.sqlserver.jdbc.SQLServerDriver");

    //daoFactory.daos.sourceParamValueDao.getSourceParamValueByFkSourceInstanceId(srcInstanceDto.sourceInstanceId);
    val allSourceInstanceParams = daoFactory.daos.vSourceParamValueDao.getDtosBySourceInstance_sourceInstanceId(srcInstanceDto.sourceInstanceId);
    println("Created SourceParamValue(s): " + allSourceInstanceParams.map(x => x.toString).mkString(" | "));

  }
}
