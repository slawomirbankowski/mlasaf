/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.dao

import java.sql._
import anorm._

class DaoFactory {

  var isInitialized = false;

  var connection : java.sql.Connection = null;

  def DaoFactory() = {

}
  def initialize(jdbc : String, user: String, pass : String) = {
  println("Creating connection to configurational DB: " + jdbc + " with user: " + user);
    connection = DriverManager.getConnection(jdbc, user, pass);
  println("Got connection: " + connection)

  println("Test queries: " + connection);
    SQL("select * from algorithmType");


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
