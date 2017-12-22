/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.structures

import org.rogach.scallop.ScallopConf

class MlasafEntryOptions(args : Array[String]) extends ScallopConf(args) {
  var restPort = opt[Int](descr="Port number for storages and extenrnal API", name = "restPort", short = 'p', required = true)
  var restAlternativePort =  opt[Int](descr="Alternative port number for storages and extenrnal API", name = "restAlternativePort", short='a')
  var jdbcString =  opt[String](descr="JDBC connection string", name = "jdbcString", short='c', required = true)
  var jdbcUser =  opt[String](descr="Port number for storages and extenrnal API", name = "jdbcUser", short='u', required = true)
  var jdbcPass =  opt[String](descr="Password for configurational DB", name = "jdbcPass", short='s', required = true)
  var jdbcDriver =  opt[String](descr="JDBC driver class", name = "jdbcDriver", short='d', required = true)
  var storageDefinition = opt[String](descr="Definition of storages", name = "storageDefinition", short='t')
  var executorDefinition = opt[String](descr="Definition for executor", name = "executorDefinition", short='e')
  var executorClasses = opt[String](descr="List of classes for executors", name = "executorClasses", short='x')
  var simpleStorage = opt[String](descr="Simple definition for local storages", name = "simpleStorage")
  verify()
  def getExecutorDefinitions() : ExecutorsDefinition = {
    val mapper = new com.fasterxml.jackson.databind.ObjectMapper();
    val eDef : String = "" + executorDefinition.getOrElse("");
    println("Parsing executors: " + eDef);
    val execDef = mapper.readValue[ExecutorsDefinition](eDef, classOf[ExecutorsDefinition])
    execDef
  }

}

case class ExecutorDefinition(executorType : String, portNumber : Int) { }
case class ExecutorsDefinition(executors : Seq[ExecutorDefinition]) { }
class StorageDefinition(val storage : String, val storageType : String) { }
class StorageDefinitions(val storaged :  Array[StorageDefinition]) { }

