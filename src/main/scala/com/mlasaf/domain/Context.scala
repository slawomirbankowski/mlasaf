/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.domain

import java.util

import com.mlasaf.dto._
import com.mlasaf.dao._
import com.mlasaf.base._
import com.mlasaf.rest.ContextRest
import com.mlasaf.structures.MlasafEntryOptions
import com.mlasaf.storages._

import scala.collection.mutable._

/** main context class - entry point for all other services, rest servers, http servers, listeners and executors */
class Context {

  /** logger */
  val logger = org.slf4j.LoggerFactory.getLogger("Context");
  /** GUID */
  val guid : Long = Math.abs((new java.util.Random()).nextLong());
  /** current host that context is run on */
  var hostDto : ExecutorHostDto = null;
  /** current Context created in JVM */
  var contextDto : ExecutorContextDto = null;
  var latestContextRuntimeDto : ExecutorContextRuntimeDto = null;
  /** all threads created/run by context */
  var threads : scala.collection.mutable.ListBuffer[ThreadBase] = new scala.collection.mutable.ListBuffer();
  /** all executor run in current context: Local, R, Spark, ... */
  var executors : scala.collection.mutable.ListBuffer[Executor] = new scala.collection.mutable.ListBuffer(); // util.List[Executor] = new util.LinkedList[Executor]()
  /** all storages to keep local copy of data for algorithms */
  var storages :  scala.collection.mutable.ListBuffer[Storage] = new scala.collection.mutable.ListBuffer();
  /** all sources to download data to be processed */
  var sources : scala.collection.mutable.ListBuffer[Source] = new scala.collection.mutable.ListBuffer();
  /** REST for configurational database and Context */
  var contextRest : ContextRest = new ContextRest();
  /** internal checker for controlling context */
  var checker : Checker = new Checker();
  /** Factory for all DAO objects to read/write data from/to configurational database */
  var daoFactory : DaoFactory = null;
  /** if context is stopped */
  var isStopped : Boolean = false;
  /** start time of context */
  val startTime : java.util.Date = new java.util.Date();
  /** default max working time in seconds */
  val DEFAULT_MAX_WORKING_TIME = 60000L;

  /** entry point for MLASAF application */
  def run(opts : MlasafEntryOptions) = {
    logger.info("Start context for guid: " + guid);
    val javaProperties = System.getProperties.stringPropertyNames().toArray.map(prop => "" + prop + "='" + System.getProperties.getProperty("" + prop) + "'").mkString(";");
    logger.info("Java properties: " + javaProperties);
    // initialize DAO to read data from DB - creates new factory with all DAOs
    daoFactory = new DaoFactory();
     //context.daoFactory.registerExecutorInstance();
    daoFactory.initialize(opts.jdbcString.toOption.getOrElse(""), opts.jdbcUser.toOption.getOrElse(""), opts.jdbcPass.toOption.getOrElse(""), opts.jdbcDriver.toOption.getOrElse(""));
    // register current HOST
    hostDto = daoFactory.daoCustom.registerHost();
    logger.info("---> Registered host: " + hostDto);
    // register context
    contextDto = daoFactory.daos.executorContextDao.createAndInsertExecutorContextDto(hostDto.executorHostId, 1, javaProperties.substring(0, 3999), "", "", "");
    logger.info("---> Registered context: " + contextDto);
    // initialization of ALL sources - each source has own thread to run refresh methods
    val allSourcesInDb = daoFactory.daos.vSourceInstanceDao.getVSourceInstancesList();
    logger.info("Number of all sources: " + allSourcesInDb.size + ", types: " + allSourcesInDb.map(x => x.sourceType_sourceTypeName).mkString(", "));
    allSourcesInDb.foreach(siDto => {
      logger.info("Creating SourceInstance for DTO: " + siDto);
      val srcObj = Class.forName(siDto.sourceType_sourceTypeClass).newInstance().asInstanceOf[Source];
      val sourceParams = daoFactory.daos.vSourceParamValueDao.getDtosBySourceInstance_sourceInstanceId(siDto.sourceInstanceId);
      srcObj.initialize(this, siDto, sourceParams);
      srcObj.start();
      threads += srcObj;
      sources += srcObj;
    });
    logger.info("All initialized sources: " + sources.size + ", sources: " + sources.map(s => "{id:" + s.vSourceDto.sourceInstanceId + ",type:" + s.vSourceDto.sourceType_sourceTypeName + ",name:" + s.vSourceDto.sourceInstanceName).mkString(", "));
    // initialize SIMPLE storage - each storage has own thread to download data
    val storagesInHost = daoFactory.daos.executorStorageDao.getExecutorStorageByFkExecutorHostId(hostDto.executorHostId);
    logger.info("Number of storages in host: " + storagesInHost.size + ", paths: " + storagesInHost.map(s => "{id:" + s.executorStorageId + ",typeId:" + s.executorStorageTypeId + ",path:" + s.storageFulllPath + "}").mkString(", ") );
    if (opts.simpleStorage.isDefined ) {
      //daoFactory.daos.executorStorageTypeDao.getExecutorStorageTypeFirstByName(LocalStorage.NAME).get.executorStorageTypeClass
      val simpleStoragePath = opts.simpleStorage.getOrElse(LocalDiskStorage.DEFAULT_PATH);
      val storageFullPath = new java.io.File(simpleStoragePath).getCanonicalPath
      defineStorage(LocalDiskStorage.NAME, simpleStoragePath, storageFullPath, 8888);
    }
    // initialize ALL storages - each storage has own thread to download data
    opts.getStorageDefinitions().foreach(storageDef => {
      defineStorage(storageDef.storageType, storageDef.storageSimplePath, storageDef.storageFullPath, storageDef.storagePort );
    });
    // initialize ALL executors - each executor has own thread to run and control algorithm
    logger.info("Starting initialization for executors ");
    opts.executorClasses.getOrElse("").split(",").foreach(exeClass => {
      defineExecutor(exeClass, 0);
    });
    // initialize REST service for context
    contextRest.setParentContext(this);
    contextRest.restDefaultPort = opts.restPort.getOrElse(8301);
    contextRest.restAlternativePort = opts.restAlternativePort.getOrElse(8305);
    contextRest.start();
    threads += contextRest;
    // initailize internal checker
    checker.setParentContext(this);
    checker.start();
    threads += checker;
    // BEGIN info
    logger.info("BEGIN CONTEXT INFO => Total executors running: " + executors.size + ", total threads: " + threads.size + ", total storages: " + storages.size + ", total sources: " + sources.size);
    // end of all Executors
    // MAIN WORKING LOOP - checking STOP condition, refresh context, receive commands
    while (!isStopped) {
      Thread.sleep(10000L);
      // change updated date for context
      daoFactory.daos.executorContextDao.changeUpdatedDate(contextDto);
      // check if context should be stopped because of end of time
      if (actualWorkingTimeSeconds() > opts.maxWorkingTimeSeconds.getOrElse(DEFAULT_MAX_WORKING_TIME)) {
        isStopped = true;
        logger.info("Time is UP - stopping context, actualWorkingTime: " + actualWorkingTime() + ", maxWorkingTime: " + opts.maxWorkingTimeSeconds.getOrElse(DEFAULT_MAX_WORKING_TIME));
      }
      // TODO: check all threads

      // TODO: check commands for context

    }
    logger.info("STOPPING context: " + contextDto);
    daoFactory.daos.executorContextDao.updateField(contextDto, ExecutorContextDto.FIELD_isWorking, 0);
    daoFactory.daos.executorContextDao.changeUpdatedDate(contextDto);
    contextRest.stop();
    executors.foreach(x => x.stop());
    sources.foreach(x => { x.stop(); });
    storages.foreach(x => { x.stop() });
    checker.stop();
    logger.info("END context for guid: " + guid);
  }
  /** define new executor and add to executors and threads */
  def defineExecutor(executorTypeOrClass : String, portNumber : Int) : Executor = {
    try {
      logger.info("Create new executor for type or class: " + executorTypeOrClass + ", portNumber: " + portNumber);
      val executorsTypes = daoFactory.daos.executorTypeDao.getExecutorTypeByName(executorTypeOrClass);
      val executorClassName = if (executorsTypes.size == 0) { executorTypeOrClass } else { executorsTypes.head.executorTypeClass }
      logger.info("Got class name for new Executor: " + executorClassName);
      val executorObj = Class.forName(executorClassName).newInstance().asInstanceOf[Executor]
      executorObj.setParentContext(this);
      executors += executorObj;
      executorObj.start();
      threads += executorObj;
      logger.info("Thread started for executor: " + executorObj.getClass.getName);
      executorObj
    } catch {
      case ex : Exception => {
        logger.error("Cannot create new executor for type: " + executorTypeOrClass + ", portNumber: " + portNumber, ex);
        null
      }
    }
  }
  /** define new storage and add to storages and threads  */
  def defineStorage(storageType : String, storageSimplePath : String, storageFullPath : String, storageRestPort : Int) : Storage = {
    try {
      val storTypeDto = daoFactory.daos.executorStorageTypeDao.getExecutorStorageTypeFirstByName(storageType).get;
      val storTypeId = storTypeDto.executorStorageTypeId
      val storagesInHost = daoFactory.daos.executorStorageDao.getExecutorStorageByFkExecutorHostId(hostDto.executorHostId);
      val existingSimpleStorages = storagesInHost.filter(s => s.storageFulllPath.equals(storageFullPath));
      logger.info("Create OR GET new storage for path: " + storageSimplePath + ", fullPath: " + storageFullPath);
      val simpleStorageDto = if (existingSimpleStorages.size > 0) existingSimpleStorages.head else daoFactory.daos.executorStorageDao.createAndInsertExecutorStorageDto(hostDto.executorHostId, storTypeId, "definition of storage ... ", storageSimplePath, storageFullPath, 1, storageRestPort);
      logger.info("Created storage DTO: " + simpleStorageDto);
      val storageObj = Class.forName(storTypeDto.executorStorageTypeClass).newInstance().asInstanceOf[Storage];
      storageObj.initialize( this, simpleStorageDto);
      storageObj.start();
      threads += storageObj;
      storages += storageObj;
      storageObj
    } catch {
      case ex : Exception => {
        logger.error("Cannot create new storage for type: " + storageType + ", path: " + storageSimplePath, ex);
        null
      }
    }

  }
  def actualWorkingTime() : Long = (new java.util.Date().getTime) - startTime.getTime;
  def actualWorkingTimeSeconds() : Long = actualWorkingTime / 1000;
}
