/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.domain

import com.mlasaf.dao._

/** main context class - entry point for all other services, rest servers, http servers, listeners and executors */
class Context {

  val guid : Long = Math.abs((new java.util.Random()).nextLong());
  var executors : Array[Executor] = null
  var sources : Array[Source] = null
  var daoFactory : DaoFactory = null

  def run(args : Array[String]) = {
    println("Start context for guid: " + guid)
    // initialize DAO to read data from DB
    val jdbcString = "jdbc:postgresql://localhost:5432/mlasaf"
    val jdbcUser = "postgres"
    val jdbcPass = "postgrespass"
    val restPort = 8300
    val restAlternativePort = 8301
    val executorDefinition = " { storage='./', type='local' } "
    val sourceDefinitions = "";
    daoFactory = new DaoFactory();
    daoFactory.initialize(jdbcString, jdbcUser, jdbcPass);
    daoFactory.getSources()
    // initialize REST for UI

    // get sources from DB

    // initialize sources

    // get executors from DB

    // initialize Executors

    // initialize

    println("END context for guid: " + guid)
  }

}
