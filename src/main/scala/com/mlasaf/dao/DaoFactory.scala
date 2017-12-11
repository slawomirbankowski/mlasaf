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
//import com.lucidchart.relate._
import java.sql.Connection

  class DaoFactory {

    val logger = org.slf4j.LoggerFactory.getLogger("Context");
    var isInitialized = false;
    var connection : java.sql.Connection = null;
    var jdbcString = ""
    var jdbcUser = ""
    var jdbcPass = "";

    var executorInstanceId = 1;
    def DaoFactory() = {
    }

    /** initialize connection - create template */
    def initialize(jdbc : String, user: String, pass : String) = {
      logger.info("Creating connection to configurational DB: " + jdbc + " with user: " + user);
      connection = DriverManager.getConnection(jdbc, user, pass);
      val dataSource : javax.sql.DataSource = null;
      //dataSource.getConnection();
      logger.info("Got connection: " + connection);
      logger.info("Got connection catalog: " + connection.getCatalog);
      logger.info("Got connection AutoCommit: " + connection.getAutoCommit);
      //logger.info("Got connection NetworkTimeout: " + connection.getNetworkTimeout);
      jdbcString = jdbc;
      jdbcUser = user;
      jdbcPass = pass;
      isInitialized = true;
    }
    def createDataSource() : javax.sql.DataSource = {
      //DriverManagerConnectionFactory
      //PoolingDataSource<PoolableConnection> dataSource = new PoolingDataSource<>(connectionPool);
      //val org.apache.commons.dbcp.PoolingDataSource
      val bds : org.apache.commons.dbcp.BasicDataSource = new org.apache.commons.dbcp.BasicDataSource();
      bds.isClosed();

      null
    }
  def createConnection() : Connection = {
    DriverManager.getConnection(jdbcString, jdbcUser, jdbcPass);
  }
  def getExecutorDao() : ExecutorDao = {
    implicit val connection : Connection = createConnection();
    //sql"""select * from algorithmType""".asSingle[Int](row => row.int("algorithmTypeId"))
    null
  }
  def getSourceDao() : SourceDao = {
    null
  }
  def getAlgorithmDao() : AlgorithmDao = {
    null
  }

  /**  */
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
    println("cnt: " + cnt);
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
    currentHost
  }

  def registerExecutorInstance(executorTypeId : Int, guid : Long) : ExecutorInstanceDto = {
    implicit val conn = DriverManager.getConnection(jdbcString, jdbcUser, jdbcPass);
    val hostDto : ExecutorHostDto = registerHost()
    implicit val connection = DriverManager.getConnection(jdbcString, jdbcUser, jdbcPass);
    //val maxInstanceIdRes = SQL("").executeQuery();
    val maxInstanceId =  SQL("select max(executorInstanceId) as id from executorInstance")
      .executeQuery()(connection).as[Int](SqlParser.int("id").single)(connection);
    println("MAX instanceId: " + maxInstanceId);

    val hosts : List[ExecutorHostDto]= SQL("select * from executorHost").as(anorm.Macro.namedParser[ExecutorHostDto].*);

    println("All hosts count: " + hosts.size + ", list: " + hosts.mkString(", "))



    //val execInstId = executorInstanceId;
    //executorInstanceId = executorInstanceId + 1;
    //val execInstanceParams = Seq((executorTypeId, hostDto.executorHostId, "execname", guid))
    //val insertedRowsCount = sql""" insert into executorInstance(executorTypeId, executorHostId, executorInstanceName, guid) values $execInstanceParams """.executeInsertInt();
    ///println("Registering Executor Instance for GUID: " +  hostDto + ", count: " + insertedRowsCount);
    //SQL("insert into executorInstance(executorInstanceId, executorTypeId, executorHostId, executorInstanceName, guid) values (?, ?, ?)").on("executorTypeId" -> instaneHostName, "" -> "")
    val execInst : ExecutorInstanceDto = null;
    execInst;
  }

  def unregisterExecutorInstance(guid : Long) : Unit = {
    implicit val connection = DriverManager.getConnection(jdbcString, jdbcUser, jdbcPass);
    //sql""" update executorInstance set isRunning = 0, isFinished = 1 where guid = $guid  """.executeUpdate()
  }
  def addStorage(storageDefinition : String) = {
    val connection = DriverManager.getConnection(jdbcString, jdbcUser, jdbcPass);
    //SQL("INSERT INTO public.executorStorage(executorStorageId, executorHostId, executorStorageTypeId, storageDefinition, storageBasePath, storageFulllPath, isRunning, portNumber, insertedRowDate, guid) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)")
    //  .on("" -> "", "" -> "").execute()(connection);
    null;
  }
  def executeQuery(sql : String, params : Seq[Object]) = {

  }

  def getSources() : String = {
    ""
  }

  def getStorages(hostId : Long) : List[ExecutorStorageDto] = {
    implicit val connection = DriverManager.getConnection(jdbcString, jdbcUser, jdbcPass);
    println("Getting storages from DB for host: " + hostId);
    //val dbStorages : List[ExecutorStorageDto] = sql""" select * from executorstorage where executorHostId = $hostId """.asList[ExecutorStorageDto](new RowParser[ExecutorStorageDto] {
    //  def dtoParser(row: SqlRow): ExecutorStorageDto = {
    //    ExecutorStorageDto(
    //      row.long("executorStorageId"),
    /*      row.long("executorHostId"),
          row.long("executorStorageTypeId"),
          row.string("storageDefinition"),
          row.string("storageBasePath"),
          row.int("portNumber"),
          row.long("guid")
        )
      }
    });*/
    //dbStorages
    null
  }

  def getHosts() : Seq[ExecutorHostDto] = {
    implicit val connection = DriverManager.getConnection(jdbcString, jdbcUser, jdbcPass);
    val hostList =  SQL("select * from executorHost ").executeQuery()(connection);
    hostList.
    null
  }
  def getExecutors() : String = {
    ""
  }

}
