/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.common

/** all static util classes */
object CustomUtils {

  val simpleDateFormat = new java.text.SimpleDateFormat("YYYY-MM-dd");
  val fullDateFormat = new java.text.SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
  val identifierDateFormat = new java.text.SimpleDateFormat("YYYYMMddHHmmss");
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
  def sequenceId() : String = {
    System.currentTimeMillis() + "" + Math.abs(random.nextInt(10000));
  }
  def dateTimeSequenceId() : String = {
    yyyyMMDDHHmmss + "" + Math.abs(random.nextInt(10000));
  }
  def yearMonthDay : String = {
    simpleDateFormat.format(new java.util.Date());
  }
  def yyyyMMDDHHmmss : String = {
    identifierDateFormat.format(new java.util.Date());
  }
  def diskSpaces : String = {
    "[" + java.io.File.listRoots().map(rd =>  "{'path':'" + rd.getPath + "','name':'" + rd.getName + "','total':'" + rd.getTotalSpace + "','usable':'" +  rd.getUsableSpace + "','free':'" + rd.getFreeSpace + "'}").mkString(",") + "]"
  }
  /** get total free space on main disk */
  def getRootFreeSpace() : Float = {
    val currentFolder = new java.io.File(".");
    currentFolder.getTotalSpace
  }
  /** returns true is  d1 + hours > d2 */
  def dateAfterWithHours(d1 : java.util.Date, hours : Int, d2 : java.util.Date) : Boolean = {
    val c = java.util.Calendar.getInstance();
    c.setTime(d1);
    c.add(java.util.Calendar.HOUR, hours);
    c.getTime.after(d2)
  }
  def cutString(s : String, maxPartLen : Int, minParts : Int) : Array[String] = {
    val partsNum = Math.max(minParts, s.length / maxPartLen);
    val resParts = new Array[String](partsNum)
    (0 to partsNum-1).foreach(partNum => {
      resParts(partNum) = ""
    });
    resParts
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
