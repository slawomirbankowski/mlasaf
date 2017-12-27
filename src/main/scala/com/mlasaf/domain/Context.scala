/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.domain

import java.util

import com.mlasaf.dto._
import com.mlasaf.dao._
import com.mlasaf.structures.MlasafEntryOptions
import com.mlasaf.storages._
import scala.collection.mutable._

/** main context class - entry point for all other services, rest servers, http servers, listeners and executors */
class Context {

  val logger = org.slf4j.LoggerFactory.getLogger("Context");
  val guid : Long = Math.abs((new java.util.Random()).nextLong());
  var hostDto : ExecutorHostDto = null;
  var executors : util.List[Executor] = new util.LinkedList[Executor]()
  var storages :  scala.collection.mutable.ListBuffer[Storage] = new scala.collection.mutable.ListBuffer();
  var sources : scala.collection.mutable.ListBuffer[Source] = new scala.collection.mutable.ListBuffer();
  var daoFactory : DaoFactory = null

  def run(opts : MlasafEntryOptions) = {
    logger.info("Start context for guid: " + guid)
    // initialize DAO to read data from DB
    // creates new factory with all DAOs
    daoFactory = new DaoFactory();
     //context.daoFactory.registerExecutorInstance();
    daoFactory.initialize(opts.jdbcString.toOption.getOrElse(""), opts.jdbcUser.toOption.getOrElse(""), opts.jdbcPass.toOption.getOrElse(""), opts.jdbcDriver.toOption.getOrElse(""));
    hostDto = daoFactory.daoCustom.registerHost();
    println("Registered host: " + hostDto);

    // initialization of sources
    val allSourcesInDb = daoFactory.daos.vSourceInstanceDao.getVSourceInstancesList();
    println("Number of all sources: " + allSourcesInDb.size + ", types: " + allSourcesInDb.map(x => x.sourceType_sourceTypeName).mkString(", "));
    allSourcesInDb.foreach(siDto => {
      println("Creating SourceInstance for DTO: " + siDto);
      val srcObj = Class.forName(siDto.sourceType_sourceTypeClass).newInstance().asInstanceOf[Source];
      val sourceParams = daoFactory.daos.vSourceParamValueDao.getDtosBySourceInstance_sourceInstanceId(siDto.sourceInstanceId);
      srcObj.initialize(this, siDto, sourceParams);
      val th : Thread = new Thread(srcObj);
      srcObj.thread = th;
      th.setDaemon(true);
      th.start();
      sources += srcObj;
    });
    println("All initialized sources: " + sources.size);

    // initialize storages
    val storagesInHost = daoFactory.daos.executorStorageDao.getExecutorStorageByFkExecutorHostId(hostDto.executorHostId);
    println("Number of storages in host: " + storagesInHost.size + ", paths: " + storagesInHost.map(s => s.storageFulllPath).mkString(", ") );
    if (opts.simpleStorage.isDefined ) {
      val storTypeId = daoFactory.daos.executorStorageTypeDao.getExecutorStorageTypeFirstByName("LOCAL_DISK").get.executorStorageTypeId
      val simpleStoragePath = opts.simpleStorage.getOrElse("../data/");
      val storageFullPath = new java.io.File(simpleStoragePath).getCanonicalPath
      val existingSimpleStorages = storagesInHost.filter(s => s.storageFulllPath.equals(storageFullPath));
      println("Create OR GET new simple storage for path: " + simpleStoragePath + ", fullPath: " + storageFullPath);
      val simpleStorageDto = if (existingSimpleStorages.size > 0) existingSimpleStorages.head else daoFactory.daos.executorStorageDao.createAndInsertExecutorStorageDto(hostDto.executorHostId, storTypeId, "definition of storage ... ", simpleStoragePath, storageFullPath, 1, 8888);
      println("Created storage DTO: " + simpleStorageDto);
      val localStorage = new LocalStorage()
      localStorage.initialize( this, simpleStorageDto);
      val th : Thread = new Thread(localStorage);
      localStorage.thread = th;
      th.setDaemon(true);
      th.start();
      storages += localStorage;
    }
    val executrs = opts.executorClasses.getOrElse("").split(",")
      .map(cn => Class.forName(cn).newInstance().asInstanceOf[Executor])
      .toArray;
    println("Starting initialization for executors: " + executrs.map(e => e.getClass.getName).mkString(", "));
    executrs.foreach(exec => {
      println("Created new executor for class: " + exec.getClass.getName);
      exec.setParentContext(this);
      executors.add(exec)
      val th : Thread = new Thread(exec);
      exec.thread = th;
      th.setDaemon(true);
      th.start();
      println("Thread started for executor: " + exec.getClass.getName);
    });
    println("Total executors running: " + executors.size());

    // initialize REST for UI

    // end of all Executors
    Thread.sleep(20000L);
    executrs.foreach(x => x.stopExecutor());
    sources.foreach(x => { x.stop(); });
    storages.foreach(x => { x.stop() });
    println("END context for guid: " + guid);
  }

}
