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
    val jdbcString = "jdbc:postgresql://localhost:5432/mlasaf10"
    val jdbcUser = "postgres"
    val jdbcPass = "postgrespass"
    val executorClasses = "com.mlasaf.executors.RExecutor,com.mlasaf.executors.LocalExecutor"
    val restPort = 8300;
    val restAlternativePort = 8301;
    val executorDefinition = " [ {storage='./', type='local'}, {storage='./', type='local'} ] "
    val sourceDefinitions = "";
    daoFactory = new DaoFactory();
    //context.daoFactory.registerExecutorInstance();
    daoFactory.initialize(jdbcString, jdbcUser, jdbcPass);
    hostDto = daoFactory.registerHost();
    logger.info("Registered host: " + hostDto);
    // find storages previously created
    daoFactory.getStorages(hostDto.executorHostId);
    //

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
    })


    // initialize storages
    daoFactory.addStorage("./data");
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
    logger.info("END context for guid: " + guid)
  }
  def defineExecutor() = {

  }
  def defineStorage() = {

  }

}
