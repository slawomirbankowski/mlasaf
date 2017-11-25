/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.domain

import com.mlasaf.dao._

/** main context class - entry point for all other services, rest servers, http servers, listeners and executors */
class Context {

  val logger = org.slf4j.LoggerFactory.getLogger("Context");
  val guid : Long = Math.abs((new java.util.Random()).nextLong());
  var executors : Seq[Executor] = null; // new Seq(Executor);
  var sources : Array[Source] = null
  var daoFactory : DaoFactory = null

  def run(args : Array[String]) = {
    logger.info("Start context for guid: " + guid)

    // initialize DAO to read data from DB
    val jdbcString = "jdbc:postgresql://localhost:5432/mlasaf8"
    val jdbcUser = "postgres"
    val jdbcPass = "postgrespass"
    val restPort = 8300;
    val restAlternativePort = 8301;
    val executorDefinition = " { storage='./', type='local' } "
    val sourceDefinitions = "";
    daoFactory = new DaoFactory();
    //context.daoFactory.registerExecutorInstance();
    daoFactory.initialize(jdbcString, jdbcUser, jdbcPass);
    val execInstance = daoFactory.registerExecutorInstance(1, 1L);

    val exec : Executor = new Executor();
    val th : Thread = new Thread(exec);
    th.setDaemon(true);
    th.start();

    Thread.sleep(2000L);
    // initialize storages
    daoFactory.addStorage("./data");
    //daoFactory.getSources()
    // initialize REST for UI

    // get sources from DB

    // initialize sources

    // get executors from DB

    // initialize Executors

    // initialize

    logger.info("END context for guid: " + guid)
  }
  def defineExecutor() = {

  }
  def defineStorage() = {

  }

}
