/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.domain

import com.mlasaf.dao._

class Context {

  val guid : Long = Math.abs((new java.util.Random()).nextLong());
  var executors : Array[Executor] = null
  var sources : Array[Source] = null
  var daoFactory : DaoFactory = null

  def run(args : Array[String]) = {
    println("Start context for guid: " + guid)
    // initialize DAO to read data from DB
    val jdbcString = ""
    val jdbcUser = ""
    val jdbcPass = ""
    val restPort = 8300
    val restAlternativePort = 8301
    val executorDefinition = " { storage='./', type='local' } "
    daoFactory = new DaoFactory();
    daoFactory.initialize(jdbcString, jdbcUser, jdbcPass);

    // initialize REST for UI

    // get sources from DB

    // initialize sources

    // get executors from DB

    // initialize Executors

    // initialize

    println("END context for guid: " + guid)
  }

}
