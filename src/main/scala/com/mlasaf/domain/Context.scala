/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.domain

import java.util

import com.mlasaf.dao._
import com.mlasaf.dto.ExecutorHostDto

/** main context class - entry point for all other services, rest servers, http servers, listeners and executors */
class Context {

  val logger = org.slf4j.LoggerFactory.getLogger("Context");
  val guid : Long = Math.abs((new java.util.Random()).nextLong());
  var hostDto : ExecutorHostDto = null;
  var executors : util.List[Executor] = new util.LinkedList[Executor]()
  var storages : List[Storage] = null
  var sources : Array[Source] = null
  var daoFactory : DaoFactory = null

  def run(args : Array[String]) = {
    logger.info("Start context for guid: " + guid)
    // initialize DAO to read data from DB
    /* TODO : Parse parameters instead of hardcoded values */
    val jdbcString = "jdbc:mysql://localhost:3307/mlasaf18"
    val jdbcUser = "root"
    val jdbcPass = "rootpass"
    val executorClasses = "com.mlasaf.executors.RExecutor,com.mlasaf.executors.LocalExecutor"
    val restPort = 8300;
    val restAlternativePort = 8301;
    val executorDefinition = " [ {executor='RExecutor', port='8806'}, {executor='LocalExecutor', port='8808'} ] "
    val storageDefinitions = " [ {storage='./', type='local'}, {storage='./', type='local'} ] "
    daoFactory = new DaoFactory();
    //context.daoFactory.registerExecutorInstance();
    daoFactory.initialize(jdbcString, jdbcUser, jdbcPass);
    val algTypesList = daoFactory.daos.algorithmTypeDao.getAlgorithmTypesList().map(x => x.toStringArray().mkString(",")).mkString(" | ");
    println("Defined algorithm types: " + algTypesList)
    val execTypeList = daoFactory.daos.executorTypeDao.getExecutorTypesList().map(x => x.toStringArray().mkString(",")).mkString(" | ");
    println("Defined executor types: " + execTypeList)
    println("Source type 1: " + daoFactory.daos.sourceTypeDao.getSourceTypeByPk(1).map(x => x.toStringArray()).mkString(" | "));
    println("Source type 2: " + daoFactory.daos.sourceTypeDao.getSourceTypeByPk(2).map(x => x.toStringArray()).mkString(" | "));
    println("Source type JDBC: " + daoFactory.daos.sourceTypeDao.getSourceTypeFirstByName("JDBC").get.toStringArray());
    println("Source type first: " + daoFactory.daos.sourceTypeDao.getSourceTypeFirst().toStringArray());
    println("Source type last : " + daoFactory.daos.sourceTypeDao.getSourceTypeLast().toStringArray());
    println("Source type maxId: " + daoFactory.daos.sourceTypeDao.getSourceTypeMaxId());
    println("Source type LastInsertDate: " + daoFactory.daos.sourceTypeDao.getSourceTypesLastInsertDate());
    println("Source type LastUpdatedDate: " + daoFactory.daos.sourceTypeDao.getSourceTypesLastUpdatedDate());

    hostDto = daoFactory.daoCustom.registerHost();
    println("Registered host: " + hostDto);
    // find storages previously created
    //val execInstance = daoFactory.registerExecutorInstance(1, 1L);
    val executrs = executorClasses.split(",").map(cn => Class.forName(cn).newInstance().asInstanceOf[Executor]).toArray;
    //val exec : Executor = Class.forName(executorClass).newInstance().asInstanceOf[Executor]
    executrs.foreach(exec => {
      println("Created new executor for class: " + exec.getClass.getName)
      exec.setParentContext(this);
      executors.add(exec)
      val th : Thread = new Thread(exec);
      th.setDaemon(true);
      th.start();
      println("Thread started for executor: " + exec.getClass.getName)
    });


    // initialize storages
    //daoFactory.addStorage("./data");
    //daoFactory.getSources()
    // initialize REST for UI

    // get sources from DB

    // initialize sources

    // get executors from DB

    // initialize Executors

    // initialize
    //executors
    //executors.forEach(exect => exect.stopExecutor());
    Thread.sleep(20000L);
    executrs.foreach(x => x.stopExecutor());
    println("END context for guid: " + guid)
  }
  def defineExecutor() = {

  }
  def defineStorage() = {

  }

}
