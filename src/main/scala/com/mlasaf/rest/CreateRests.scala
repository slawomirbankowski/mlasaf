/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.rest

import com.mlasaf.base.RestBase
import com.mlasaf.dao.DaoFactory
import com.mlasaf.loaders.CreateAlgorithmImplementation.logger
import com.mlasaf.loaders.CreateAlgorithmType.logger
import com.mlasaf.loaders.CreateAlgorithmVersionType.logger
import com.mlasaf.loaders.CreateSourceInstance.logger
import com.mlasaf.loaders.CreateSourceSchedule.logger
import com.mlasaf.structures.ExecutorDefinition
import org.json4s.native.JsonMethods._
import org.json4s.Formats._
import com.mlasaf.structures._

/** class with RESTs */
class CreateRests extends RestBase  {

  def initialize() : Unit = {
    spark.Spark.post("/algorithm-schedule", (req: spark.Request, resp: spark.Response) => {
      resp.`type`("application/json");
      logger.info("Executing algorithm-schedule CREATE (POST) with body: " + req.body());
      implicit val formats = org.json4s.DefaultFormats
      val algoScheduleParams = parse(req.body()).extract[CreateAlgorithmScheduleParams];
      var schTypeId = parentRest.parentContext.daoFactory.daos.algorithmScheduleTypeDao.getAlgorithmScheduleTypeByName(algoScheduleParams.algScheduleType).head.algorithmScheduleTypeId;
      logger.info("schTypeId: " + schTypeId);
      var algImplId = parentRest.parentContext.daoFactory.daos.algorithmImplementationDao.getAlgorithmImplementationFirstByName(algoScheduleParams.implementationName).get.algorithmImplementationId;
      logger.info("algImplId: " + algImplId);
      var algScheduleDto = parentRest.parentContext.daoFactory.daos.algorithmScheduleDao.createAndInsertAlgorithmScheduleDto(algImplId, schTypeId, algoScheduleParams.scheduleName, 1, 20000, 0);
      logger.info("algScheduleDto: " + algScheduleDto);
      val algSchViewTypeId = parentRest.parentContext.daoFactory.daos.algorithmScheduleViewTypeDao.getAlgorithmScheduleViewTypeFirstByName(algoScheduleParams.scheduleViewType).get.algorithmScheduleViewTypeId;
      logger.info("algSchViewTypeId: " + algSchViewTypeId);
      val allViews = parentRest.parentContext.daoFactory.daos.vSourceViewDao.getDtosBySourceInstance_sourceInstanceName(algoScheduleParams.sourceInstanceName);
      logger.info("allViews.size: " + allViews.size + ", views: " + allViews.map(x => x.sourceViewName).mkString(","));
      val viewId = allViews.filter(v => v.sourceViewName.equals(algoScheduleParams.sourceViewName)).head.sourceViewId;
      logger.info("viewId: " + viewId);
      val algSchViewDto = parentRest.parentContext.daoFactory.daos.algorithmScheduleViewDao.createAndInsertAlgorithmScheduleViewDto(algSchViewTypeId, algScheduleDto.algorithmScheduleId, viewId, "");
      logger.info("algSchViewDto: " + algSchViewDto);
      val salesViewColumns = parentRest.parentContext.daoFactory.daos.sourceViewColumnDao.getSourceViewColumnByFkSourceViewId(algSchViewDto.sourceViewId);
      algoScheduleParams.algoColumns.split(",").zip(algoScheduleParams.inputColumns.split(",")).foreach(algoInputCol=> {
        val colTypeId = parentRest.parentContext.daoFactory.daos.algorithmColumnTypeDao.getAlgorithmColumnTypeFirstByName(algoInputCol._1).get.algorithmColumnTypeId;
        logger.info("colTypeId: " + colTypeId);
        val viewColumnId = salesViewColumns.filter(c => c.columnName.equals(algoInputCol._2)).head.sourceViewColumnId;
        logger.info("timeViewColumnId: " + viewColumnId);
        val asc = parentRest.parentContext.daoFactory.daos.algorithmScheduleColumnDao.createAndInsertAlgorithmScheduleColumnDto(algScheduleDto.algorithmScheduleId, colTypeId, algSchViewDto.algorithmScheduleViewId, algSchViewDto.sourceViewId, viewColumnId, "")
        logger.info("asc: " + asc);
      });
      algScheduleDto.toJson();
    } );
    spark.Spark.post("/algorithm-implementation", (req: spark.Request, resp: spark.Response) => {
      resp.`type`("application/json");
      logger.info("Executing algorithm-schedule CREATE (POST) with body: " + req.body());
      implicit val formats = org.json4s.DefaultFormats
      val algoImplParams = parse(req.body()).extract[CreateAlgorithmImplementationParams];
      val execTypeId = parentRest.parentContext.daoFactory.daos.executorTypeDao.getExecutorTypeByName(algoImplParams.executorType).head.executorTypeId;
      logger.info("execTypeId: " + execTypeId);
      val algTypeId = parentRest.parentContext.daoFactory.daos.algorithmTypeDao.getAlgorithmTypeByName(algoImplParams.algorithmType).head.algorithmTypeId;
      logger.info("algTypeId: " + algTypeId);
      val algTypeVerId = parentRest.parentContext.daoFactory.daos.algorithmTypeVersionDao.getAlgorithmTypeVersionsList().filter(a => (a.algorithmTypeVersionName.equals(algoImplParams.algorithmVersion) && a.algorithmTypeId == algTypeId)).head.algorithmTypeVersionId;
      logger.info("algTypeVerId: " + algTypeVerId);
      val algImplDto = parentRest.parentContext.daoFactory.daos.algorithmImplementationDao.createAndInsertAlgorithmImplementationDto(algTypeVerId, execTypeId, algoImplParams.algorithmImplementationName, algoImplParams.algorithmImplementationClass);
      logger.info("algImplDto: " + algImplDto);
      // supported storages
      algoImplParams.supportedStorages.split(",").foreach(supsto => {
        val storageTypeId = parentRest.parentContext.daoFactory.daos.executorStorageTypeDao.getExecutorStorageTypeFirstByName(supsto).get.executorStorageTypeId;
        parentRest.parentContext.daoFactory.daos.algorithmStorageSupportDao.createAndInsertAlgorithmStorageSupportDto(algImplDto.algorithmImplementationId, storageTypeId, 3);
      });
      algImplDto.toJson();
    });
    spark.Spark.post("/algorithm-type", (req: spark.Request, resp: spark.Response) => {
      resp.`type`("application/json");
      logger.info("Executing algorithm-schedule CREATE (POST) with body: " + req.body());
      implicit val formats = org.json4s.DefaultFormats
      val algTypeParams = parse(req.body()).extract[CreateAlgorithmTypeParams];
      val currentAlgoTypes = parentRest.parentContext.daoFactory.daos.algorithmTypeDao.getAlgorithmTypeByName(algTypeParams.algorithmType);
      if (currentAlgoTypes.size == 0 ) {
        val algType = parentRest.parentContext.daoFactory.daos.algorithmTypeDao.createAndInsertAlgorithmTypeDto(algTypeParams.algorithmType, "");
        logger.info("NEW algType: " + algType);
        algType.toJson();
      } else {
        logger.info("EXISTING algType: " );
        currentAlgoTypes.head.toJson();
      }
    });
    spark.Spark.post("/algorithm-type-version", (req: spark.Request, resp: spark.Response) => {
      resp.`type`("application/json");
      logger.info("Executing algorithm-schedule CREATE (POST) with body: " + req.body());
      implicit val formats = org.json4s.DefaultFormats
      val algTypeVersionParams = parse(req.body()).extract[CreateAlgorithmTypeVersionParams];
      val algType = parentRest.parentContext.daoFactory.daos.algorithmTypeDao.getAlgorithmTypeByName(algTypeVersionParams.algorithmType).head;
      logger.info("algTypeId: " + algType);
      val algTypeVer = parentRest.parentContext.daoFactory.daos.algorithmTypeVersionDao.createAndInsertAlgorithmTypeVersionDto(algType.algorithmTypeId, algTypeVersionParams.algorithmVersion);
      logger.info("algTypeVer: " + algTypeVer);
      // columns
      algTypeVersionParams.columns.split(",").foreach(algColName => {
        val algTypeColType = parentRest.parentContext.daoFactory.daos.algorithmTypeColumnTypeDao.createAndInsertAlgorithmTypeColumnTypeDto(algTypeVer.algorithmTypeVersionId, parentRest.parentContext.daoFactory.daos.algorithmColumnTypeDao.getAlgorithmColumnTypeFirstByName(algColName).get.algorithmColumnTypeId, 0, 0);
        logger.info("algTypeColType: " + algTypeColType);
      });
      // parameters
      algTypeVersionParams.parameters.split(",").foreach(algColName => {
        val algParType = parentRest.parentContext.daoFactory.daos.algorithmParamTypeDao.createAndInsertAlgorithmParamTypeDto(parentRest.parentContext.daoFactory.daos.algorithmParamDao.getAlgorithmParamFirstByName(algColName).get.algorithmParamId, algType.algorithmTypeId, algTypeVer.algorithmTypeVersionId);
        logger.info("algParType: " + algParType);
      });
      algTypeVersionParams.outputTypes.split(",").foreach(outputTypeName => {
        val algOutypeId = parentRest.parentContext.daoFactory.daos.algorithmOutputTypeDao.getAlgorithmOutputTypeFirstByName(outputTypeName).get.algorithmOutputTypeId;
        val algTypeOutType = parentRest.parentContext.daoFactory.daos.algorithmTypeOutputTypeDao.createAndInsertAlgorithmTypeOutputTypeDto(algTypeVer.algorithmTypeVersionId, algOutypeId, 1);
        logger.info("algTypeOutType: " + algTypeOutType);
      });
      algTypeVer.toJson();
    });
    spark.Spark.post("/source-instance", (req: spark.Request, resp: spark.Response) => {
      resp.`type`("application/json");
      logger.info("Executing algorithm-schedule CREATE (POST) with body: " + req.body());
      implicit val formats = org.json4s.DefaultFormats
      val siParams = parse(req.body()).extract[CreateSourceInstanceParams];
      //siParams.getClass.
      val srcTypeId = parentRest.parentContext.daoFactory.daos.sourceTypeDao.getSourceTypeFirstByName(siParams.sourceType).get.sourceTypeId;
      logger.info("Got ID of JDBC source: " + srcTypeId)
      val srcInstanceDto = parentRest.parentContext.daoFactory.daos.sourceInstanceDao.createAndInsertSourceInstanceDto(srcTypeId, siParams.sourceInstanceName, 0, 0, "OK", new java.util.Date());
      logger.info("Created SourceInstance: " + srcInstanceDto);
      siParams.sourceParamNames.split(",").zip(siParams.sourceParamValues.split(",")).foreach(pv => {
        parentRest.parentContext.daoFactory.daos.sourceParamValueDao.createAndInsertSourceParamValueDto(srcInstanceDto.sourceInstanceId,  parentRest.parentContext.daoFactory.daos.sourceParamDao.getSourceParamFirstByName(pv._1).get.sourceParamId, "1", pv._2);
      });
      srcInstanceDto.toJson();
    });
    spark.Spark.post("/source-schedule", (req: spark.Request, resp: spark.Response) => {
      resp.`type`("application/json");
      logger.info("Executing source-schedule CREATE (POST) with body: " + req.body());
      implicit val formats = org.json4s.DefaultFormats
      val srcScheduleParams = parse(req.body()).extract[CreateSourceScheduleParams];
      val srcViewId = parentRest.parentContext.daoFactory.daos.sourceViewDao.getSourceViewByName(srcScheduleParams.viewName).head.sourceViewId;
      logger.info("srcViewId: " + srcViewId);
      val storageTypeId = parentRest.parentContext.daoFactory.daos.executorStorageTypeDao.getExecutorStorageTypeFirstByName(srcScheduleParams.storageTypeName).get.executorStorageTypeId;
      logger.info("storageTypeId: " + storageTypeId);
      val hostId = parentRest.parentContext.daoFactory.daos.executorHostDao.getExecutorHostsList().filter(h => h.hostIp.equals(srcScheduleParams.storageHostIp)).head.executorHostId;
      logger.info("hostId: " + hostId);
      val execStorageId = parentRest.parentContext.daoFactory.daos.executorStorageDao.getExecutorStorageByFkExecutorHostId(hostId).filter(s => s.executorStorageTypeId == storageTypeId).head.executorStorageId;
      logger.info("execStorageId: " + execStorageId);
      logger.info("Creating SourceSchedule for view: " + srcViewId + ", storage: " + execStorageId)
      val sourceScheduleDto = parentRest.parentContext.daoFactory.daos.sourceScheduleDao.createAndInsertSourceScheduleDto(srcViewId, execStorageId, 0, new java.util.Date(), 0, 1, 0);
      sourceScheduleDto.toJson();
    });
  }

}
