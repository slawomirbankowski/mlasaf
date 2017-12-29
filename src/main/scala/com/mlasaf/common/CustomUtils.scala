/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.common

/** all static util classes */
object CustomUtils {

  val random = new java.util.Random()
  def getHostName = {
    java.net.InetAddress.getLocalHost.getHostName
  }
  def getHostAddress = {
    java.net.InetAddress.getLocalHost.getHostAddress
  }
  def getCanonicalHostName = {
    java.net.InetAddress.getLocalHost.getCanonicalHostName
  }
  def getIp = {
    java.net.InetAddress.getLocalHost.getAddress.mkString(".")
  }
  def randomLong() : Long = {
    Math.abs(random.nextLong())
  }
  def diskSpaces : String = {
    "[" + java.io.File.listRoots().map(rd =>  "{'path':'" + rd.getPath + "','name':'" + rd.getName + "','total':'" + rd.getTotalSpace + "','usable':'" +  rd.getUsableSpace + "','free':'" + rd.getFreeSpace + "'}").mkString(",") + "]"
  }

  def executeQuery(conn : java.sql.Connection, sql : String) = {

  }
  def executeQuery(conn : java.sql.Connection, sql : String, pars : Array[AnyRef]) = {
    val stat = conn.prepareStatement(sql)
    pars.zipWithIndex.foreach(par => {
      stat.setObject(par._2+1, par._1);
    });
    val rs = stat.executeQuery(sql);
    while (rs.next()) {


    }
    stat.close();
  }

}
