/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.tests

import com.mlasaf.dao.DaoFactory
import com.mlasaf.dto.ExecutorHostDto

object CreateSampleAlgoScheduleTest {

  /** main entry point to run all services for MLASAF, initialization from command line arguments or from xml file */
  def main(args : Array[String]) : Unit = {
    val jdbcString = "jdbc:mysql://localhost:3307/mlasaf25"
    val jdbcUser = System.getenv("MLASAF_USER")
    val jdbcPass = System.getenv("MLASAF_PASS")
    val jdbcDriver = System.getenv("MLASAF_DRIVER")

    val daoFactory = new DaoFactory();
    daoFactory.initialize(jdbcString, jdbcUser, jdbcPass, jdbcDriver);

    var schTypeId = daoFactory.daos.algorithmScheduleTypeDao.getAlgorithmScheduleTypeByName("SINGLE").head.algorithmScheduleTypeId;
    println("schTypeId: " + schTypeId);
    var algImplId = daoFactory.daos.algorithmImplementationDao.getAlgorithmImplementationFirstByName("PredictionLocalSma5").get.algorithmImplementationId;
    println("algImplId: " + algImplId);
    var algScheduleDto = daoFactory.daos.algorithmScheduleDao.createAndInsertAlgorithmScheduleDto(algImplId, schTypeId, "run prediction for sales", 1, 20000, 0);
    println("algScheduleDto: " + algScheduleDto);
    val algSchViewTypeId = daoFactory.daos.algorithmScheduleViewTypeDao.getAlgorithmScheduleViewTypeFirstByName("PRIMARY").get.algorithmScheduleViewTypeId;
    println("algSchViewTypeId: " + algSchViewTypeId);
    val allViews = daoFactory.daos.vSourceViewDao.getDtosBySourceInstance_sourceInstanceName("SampleTestSourceJdbc");
    println("allViews.size: " + allViews.size + ", views: " + allViews.map(x => x.sourceViewName).mkString(","));
    val viewId = allViews.filter(v => v.sourceViewName.equals("dbo.sales")).head.sourceViewId;
    println("viewId: " + viewId);
    val algSchViewDto = daoFactory.daos.algorithmScheduleViewDao.createAndInsertAlgorithmScheduleViewDto(algSchViewTypeId, algScheduleDto.algorithmScheduleId, viewId, "");
    println("algSchViewDto: " + algSchViewDto);

    val timeColTypeId = daoFactory.daos.algorithmColumnTypeDao.getAlgorithmColumnTypeFirstByName("Time").get.algorithmColumnTypeId;
    println("timeColTypeId: " + timeColTypeId);
    val groupColTypeId = daoFactory.daos.algorithmColumnTypeDao.getAlgorithmColumnTypeFirstByName("SingleGroup").get.algorithmColumnTypeId;
    println("groupColTypeId: " + groupColTypeId);
    val valueColTypeId = daoFactory.daos.algorithmColumnTypeDao.getAlgorithmColumnTypeFirstByName("NumericValue").get.algorithmColumnTypeId;
    println("valueColTypeId: " + valueColTypeId);
    val salesViewColumns = daoFactory.daos.sourceViewColumnDao.getSourceViewColumnByFkSourceViewId(algSchViewDto.sourceViewId);
    val timeViewColumnId = salesViewColumns.filter(c => c.columnName.equals("yearmonth")).head.sourceViewColumnId;
    println("timeViewColumnId: " + timeViewColumnId);
    val groupViewColumnId = salesViewColumns.filter(c => c.columnName.equals("product")).head.sourceViewColumnId;
    println("groupViewColumnId: " + groupViewColumnId);
    val valueViewColumnId = salesViewColumns.filter(c => c.columnName.equals("sale_value")).head.sourceViewColumnId;
    println("valueViewColumnId: " + valueViewColumnId);
    val asc1 = daoFactory.daos.algorithmScheduleColumnDao.createAndInsertAlgorithmScheduleColumnDto(algScheduleDto.algorithmScheduleId, timeColTypeId, algSchViewDto.algorithmScheduleViewId, algSchViewDto.sourceViewId, timeViewColumnId, "")
    println("asc1: " + asc1);
    val asc2 = daoFactory.daos.algorithmScheduleColumnDao.createAndInsertAlgorithmScheduleColumnDto(algScheduleDto.algorithmScheduleId, groupColTypeId, algSchViewDto.algorithmScheduleViewId, algSchViewDto.sourceViewId, groupViewColumnId, "")
    println("asc2: " + asc2);
    val asc3 = daoFactory.daos.algorithmScheduleColumnDao.createAndInsertAlgorithmScheduleColumnDto(algScheduleDto.algorithmScheduleId, valueColTypeId, algSchViewDto.algorithmScheduleViewId, algSchViewDto.sourceViewId, valueViewColumnId, "")
    println("asc3: " + asc3);
  }

}
