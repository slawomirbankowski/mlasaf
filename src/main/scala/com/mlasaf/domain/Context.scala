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
  var executors : util.List[Executor] = new util.LinkedList[Executor]()
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
  /** */
  var isStopped : Boolean = false;
  /** */
  val startTime : java.util.Date = new java.util.Date();

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
    logger.info("All initialized sources: " + sources.size);
    // initialize SIMPLE storage - each storage has own thread to download data
    val storagesInHost = daoFactory.daos.executorStorageDao.getExecutorStorageByFkExecutorHostId(hostDto.executorHostId);
    logger.info("Number of storages in host: " + storagesInHost.size + ", paths: " + storagesInHost.map(s => s.storageFulllPath).mkString(", ") );
    if (opts.simpleStorage.isDefined ) {
      val storTypeId = daoFactory.daos.executorStorageTypeDao.getExecutorStorageTypeFirstByName(LocalStorage.NAME).get.executorStorageTypeId
      val simpleStoragePath = opts.simpleStorage.getOrElse(LocalStorage.DEFAULT_PATH);
      val storageFullPath = new java.io.File(simpleStoragePath).getCanonicalPath
      val existingSimpleStorages = storagesInHost.filter(s => s.storageFulllPath.equals(storageFullPath));
      println("Create OR GET new simple storage for path: " + simpleStoragePath + ", fullPath: " + storageFullPath);
      val simpleStorageDto = if (existingSimpleStorages.size > 0) existingSimpleStorages.head else daoFactory.daos.executorStorageDao.createAndInsertExecutorStorageDto(hostDto.executorHostId, storTypeId, "definition of storage ... ", simpleStoragePath, storageFullPath, 1, 8888);
      println("Created storage DTO: " + simpleStorageDto);
      val localStorage = new LocalStorage()
      localStorage.initialize( this, simpleStorageDto);
      localStorage.start();
      threads += localStorage;
      storages += localStorage;
    }
    // initialize ALL storages - each storage has own thread to download data

    // initialize ALL executors - each executor has own thread to run and control algorithm
    val executrs = opts.executorClasses.getOrElse("").split(",")
      .map(cn => Class.forName(cn).newInstance().asInstanceOf[Executor])
      .toArray;
    logger.info("Starting initialization for executors: " + executrs.map(e => e.getClass.getName).mkString(", "));
    executrs.foreach(exec => {
      println("Created new executor for class: " + exec.getClass.getName);
      exec.setParentContext(this);
      executors.add(exec);
      exec.start();
      threads += exec;
      logger.info("Thread started for executor: " + exec.getClass.getName);
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
    //
    logger.info("Total executors running: " + executors.size() + ", total threads: " + threads.size + ", total storages: " + storages.size + ", total sources: " + sources.size);
    // end of all Executors
    // MAIN WORKING LOOP - checking STOP condition, refresh context, receive commands
    while (!isStopped) {
      Thread.sleep(10000L);
      if (actualWorkingTime() > opts.maxWorkingTimeSeconds.getOrElse(DEFAULT_MAX_WORKING_TIME)) {
        isStopped = true;
        logger.info("Time is UP - stopping context, actualWorkingTime: " + actualWorkingTime() + ", maxWorkingTime: " + opts.maxWorkingTimeSeconds.getOrElse(DEFAULT_MAX_WORKING_TIME));
      }
      // change updated date for context
      daoFactory.daos.executorContextDao.changeUpdatedDate(contextDto);
      // TODO: check all threads
      // check commands for context
    }
    logger.info("STOPPING context: " + contextDto);
    daoFactory.daos.executorContextDao.updateField(contextDto, ExecutorContextDto.FIELD_isWorking, 0);
    daoFactory.daos.executorContextDao.changeUpdatedDate(contextDto);
    contextRest.stop();
    executrs.foreach(x => x.stop());
    sources.foreach(x => { x.stop(); });
    storages.foreach(x => { x.stop() });
    checker.stop();
    logger.info("END context for guid: " + guid);
  }

  def actualWorkingTime() : Long = (new java.util.Date().getTime) - startTime.getTime;
  def actualWorkingTimeSeconds() : Long = actualWorkingTime / 1000;
}
