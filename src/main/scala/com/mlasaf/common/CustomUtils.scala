/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.common

object CustomUtils {


  def getHostName = {
    java.net.InetAddress.getLocalHost.getHostName
  }
  def getHostAddress = {
    java.net.InetAddress.getLocalHost.getHostAddress
  }


}
