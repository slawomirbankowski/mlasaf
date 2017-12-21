/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.domain

import java.util

import com.mlasaf.dto._
import com.mlasaf.dao._

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
    val jdbcString = "jdbc:mysql://localhost:3307/mlasaf22"
    val jdbcUser = "root"
    val jdbcPass = "rootpass"
    val executorClasses = "com.mlasaf.executors.RExecutor,com.mlasaf.executors.LocalExecutor"
    val restPort = 8300;
    val restAlternativePort = 8301;
    val executorDefinition = " [ {executor='RExecutor', port='8806'}, {executor='LocalExecutor', port='8808'} ] "
    val storageDefinitions = " [ {storage='./', type='local'}, {storage='./', type='local'} ] "
    // creates new factory with all DAOs
    daoFactory = new DaoFactory();
    //context.daoFactory.registerExecutorInstance();
    daoFactory.initialize(jdbcString, jdbcUser, jdbcPass);
    hostDto = daoFactory.daoCustom.registerHost();
    println("Registered host: " + hostDto);

    // register current executor instance
    //val execInstance = daoFactory.registerExecutorInstance(1, 1L);
    // find storages previously created

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
    //executrs.foreach(x => x.stopExecutor());
    println("END context for guid: " + guid)
  }
  def defineExecutor() = {

  }
  def defineStorage() = {

  }

}
