/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.dao

import java.sql._

class DaoFactory {

  var isInitialized = false;

  var conn : java.sql.Connection = null;

  def DaoFactory() = {

}
  def initialize(jdbc : String, user: String, pass : String) = {
  println("Creating connection to configurational DB: " + jdbc + " with user: " + user);
  conn = DriverManager.getConnection(jdbc, user, pass);
  println("Got connection: " + conn)

  println("Test queries: " + conn)
  isInitialized = true;

}
  def executeQuery(sql : String, params : Seq[Object]) = {

}
  def getSources() : String = {
  ""
}
  def getStorages() : String = {
  ""
}
  def getExecutors() : String = {
  ""
}

}
