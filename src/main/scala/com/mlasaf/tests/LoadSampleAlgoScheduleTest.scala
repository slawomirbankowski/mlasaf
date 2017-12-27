/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.tests

import com.mlasaf.dao.DaoFactory
import com.mlasaf.dto.ExecutorHostDto

object LoadSampleAlgoScheduleTest {

  /** main entry point to run all services for MLASAF, initialization from command line arguments or from xml file */
  def main(args : Array[String]) : Unit = {
    val jdbcString = "jdbc:mysql://localhost:3307/mlasaf22"
    val jdbcUser = "root"
    val jdbcPass = "rootpass"
    val jdbcDriver = "com.mysql.jdbc.Driver";

    val daoFactory = new DaoFactory();
    daoFactory.initialize(jdbcString, jdbcUser, jdbcPass, jdbcDriver);

    var schTypeId = daoFactory.daos.algorithmScheduleTypeDao.getAlgorithmScheduleTypeByName("SINGLE").head.algorithmScheduleTypeId;
    println("schTypeId: " + schTypeId);
    var algImplId = daoFactory.daos.algorithmImplementationDao.getAlgorithmImplementationFirstByName("PredictionLocalSma5").get.algorithmImplementationId;
    println("algImplId: " + algImplId);
    var algScheduleDto = daoFactory.daos.algorithmScheduleDao.createAndInsertAlgorithmScheduleDto(algImplId, schTypeId, "any name for schedule", 1);
    println("algScheduleDto: " + algScheduleDto);
    val algSchViewTypeId = daoFactory.daos.algorithmScheduleViewTypeDao.getAlgorithmScheduleViewTypeFirstByName("PRIMARY").get.algorithmScheduleViewTypeId;
    println("algSchViewTypeId: " + algSchViewTypeId);
    val allViews = daoFactory.daos.vSourceViewDao.getDtosBySourceInstance_sourceInstanceName("SampleTestSourceJdbc");
    println("allViews.size: " + allViews.size + ", views: " + allViews.map(x => x.sourceViewName).mkString(","));
    val viewId = allViews.filter(v => v.sourceViewName.equals("dbo.algorithmtype")).head.sourceViewId;
    println("viewId: " + viewId);
    val algSchViewDto = daoFactory.daos.algorithmScheduleViewDao.createAndInsertAlgorithmScheduleViewDto(algSchViewTypeId, algScheduleDto.algorithmScheduleId, viewId, "");
    println("algSchViewDto: " + algSchViewDto);



  }

}
