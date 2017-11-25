/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.dao

import java.sql._
import anorm._

import com.mlasaf.dto._
import com.mlasaf.utils._
import org.apache.commons.dbcp._

class DaoFactory {

  val logger = org.slf4j.LoggerFactory.getLogger("Context");
  var isInitialized = false;
  var connection : java.sql.Connection = null;
  var jdbcString = ""
  var jdbcUser = ""
  var jdbcPass = "";

  def DaoFactory() = {
  }

  def createConnection() : Connection = {
    DriverManager.getConnection(jdbcString, jdbcUser, jdbcPass);
  }
  def initialize(jdbc : String, user: String, pass : String) = {
    logger.info("Creating connection to configurational DB: " + jdbc + " with user: " + user);
    connection = DriverManager.getConnection(jdbc, user, pass);
    val dataSource : javax.sql.DataSource = null;
    //dataSource.getConnection();
    logger.info("Got connection: " + connection);
    logger.info("Got connection catalog: " + connection.getCatalog);
    logger.info("Got connection AutoCommit: " + connection.getAutoCommit);
    logger.info("Got connection NetworkTimeout: " + connection.getNetworkTimeout);
    jdbcString = jdbc;
    jdbcUser = user;
    jdbcPass = pass;
    isInitialized = true;
  }
  def createDataSource() : javax.sql.DataSource = {

    //DriverManagerConnectionFactory
    //PoolingDataSource<PoolableConnection> dataSource = new PoolingDataSource<>(connectionPool);
    //val org.apache.commons.dbcp.PoolingDataSource


    null
  }
  def getExecutorDao() : ExecutorDao = {
    null
  }
  def getSourceDao() : SourceDao = {
    null
  }
  def getAlgorithmDao() : AlgorithmDao = {
    null
  }

  def registerHost() : ExecutorHostDto = {
    val hostName = MlUtils.getHostName
    val hostAddress = java.net.InetAddress.getLocalHost.getHostAddress
    val hostIp = java.net.InetAddress.getLocalHost.getAddress.map(b => b.toInt).map(b => if (b<0) b+256 else b).mkString(".")
    val canonicalHost = java.net.InetAddress.getLocalHost.getCanonicalHostName
    val connection = DriverManager.getConnection(jdbcString, jdbcUser, jdbcPass);
    val queryRes = SQL("select count(*) as cnt from executorHost where hostName = {hostName} and hostIp = {hostIp}")
      .on("hostName" -> hostName, "hostIp" -> hostIp)
      .executeQuery()(connection);
    logger.info("queryRes: " + queryRes)
    val cnt = queryRes.as[Int](SqlParser.int("cnt").single)(connection);
    println("cnt: " + cnt)
    if (cnt == 0) {
      logger.info("Registering Executor Host for host: " +  hostName + ", hostAddress: " + hostAddress + ", IP: " + hostIp + ", canonicalHost: " + canonicalHost)
      var simpleS = SQL("insert into executorHost( executorHostId, hostName, hostIp, hostDomain, hostOsType, hostOsVersion) values( {executorHostId}, {hostName}, {hostIp}, {hostDomain}, {hostOsType}, {hostOsVersion}) ")
        .on("executorHostId" -> 2, "hostName" -> hostName, "hostIp" -> hostIp, "hostDomain" -> "", "hostOsType" -> "", "hostOsVersion" -> "")
        .executeInsert()(connection);
    }
    val currentHost : ExecutorHostDto = SQL("select * from executorHost where hostName = {hostName} and hostIp = {hostIp}")
      .on("hostName" -> hostName, "hostIp" -> hostIp)
      .as[ExecutorHostDto](anorm.Macro.namedParser[ExecutorHostDto].single)(connection)
    logger.info("Current host in DB: " +  currentHost)
    //SQL("update storageInstance set executorHostId = {executorHostId} where storageInstanceId = {storageInstanceId} ")
    //  .on("executorHostId" -> 1, "storageInstanceId" -> 2)
    //  .executeUpdate()(connection);
    //val hostDto : ExecutorHostDto = SQL("select * from executorHost where hostName = {hostName}").on("hostName" -> hostName).as[ExecutorHostDto]()(_);
    //println("Got hostDto: " + hostDto)
    //return hostDto;
    currentHost
  }
  def registerExecutorInstance(executorTypeId : Int, guid : Long) : ExecutorInstanceDto = {
    //connection = DriverManager.getConnection(jdbc, user, pass);
    val hostDto : ExecutorHostDto = registerHost()
    println("Registering Executor Instance for GUID: " +  hostDto);
    //SQL("insert into executorInstance(executorTypeId, executorHostId, executorInstanceName, guid) values (?, ?, ?)").on("executorTypeId" -> instaneHostName, "" -> "")
    val execInst : ExecutorInstanceDto = null;
    execInst;
  }

  def addStorage(storageDefinition : String) = {
    val connection = DriverManager.getConnection(jdbcString, jdbcUser, jdbcPass);
    SQL("INSERT INTO public.executorStorage(executorStorageId, executorHostId, executorStorageTypeId, storageDefinition, storageBasePath, storageFulllPath, isRunning, portNumber, insertedRowDate, guid) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)")
      .on("" -> "", "" -> "").execute()(connection);
    null;
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
