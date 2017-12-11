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
    def getConnection() : Connection = {
      DriverManager.getConnection(jdbcString, jdbcUser, jdbcPass);
    }
  def getExecutorDao() : ExecutorDao = {
    implicit val connection : Connection = createConnection();
    //sql"""select * from algorithmType""".asSingle[Int](row => row.int("algorithmTypeId"))
    null
  }

    def insertHostType(dto : ExecutorHostDto) = {
      SQL("insert into executorHost( executorHostId, hostName, hostIp, hostDomain, hostOsType, hostOsVersion) values( {executorHostId}, {hostName}, {hostIp}, {hostDomain}, {hostOsType}, {hostOsVersion}) ")
        .on("executorHostId" -> dto.executorHostId, "hostName" -> dto.hostName, "hostIp" -> dto.hostIp, "hostDomain" -> dto.hostDomain, "hostOsType" -> dto.hostOsType, "hostOsVersion" -> dto.hostOsVersion)
        .executeInsert()(connection)
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
      //val et : ExecutorTypeDto = new ExecutorTypeDto(1, "aaa", "bbb");

      val currentHost : ExecutorHostDto = SQL("select * from executorHost where hostName = {hostName} and hostIp = {hostIp}")
        .on("hostName" -> hostName, "hostIp" -> hostIp)
        .as[ExecutorHostDto](anorm.Macro.namedParser[ExecutorHostDto].single)(connection)
        logger.info("Current host in DB: " +  currentHost)
        currentHost
    }

    def insert(d : BaseDto): Unit = {
      implicit val conn = DriverManager.getConnection(jdbcString, jdbcUser, jdbcPass);
      val sql = "insert into " + d.getClass.getName + "(" + d.fields + ") values () ";
      SQL(sql).onParams().executeInsert()(conn);
    }
    def selectCount(d : BaseDto) : Long = {
      implicit val conn = DriverManager.getConnection(jdbcString, jdbcUser, jdbcPass);
      val sql = "select count(*) as cnt from " + d.getClass.getName;
      val queryRes = SQL(sql)
        .executeQuery()(conn).as[Int](SqlParser.int("cnt").single)(conn);;
      queryRes
    }
    def selectCount(d : java.lang.Class[BaseDto]) : Long = {
      implicit val conn = DriverManager.getConnection(jdbcString, jdbcUser, jdbcPass);
      val sql = "select count(*) as cnt from " + d.getName;
      val queryRes = SQL(sql)
        .executeQuery()(conn).as[Int](SqlParser.int("cnt").single)(conn);;
      queryRes
    }

  def registerExecutorInstance(executorTypeId : Int, guid : Long) : ExecutorInstanceDto = {
    implicit val conn = DriverManager.getConnection(jdbcString, jdbcUser, jdbcPass);
    val hostDto : ExecutorHostDto = registerHost()
   // implicit val connection = DriverManager.getConnection(jdbcString, jdbcUser, jdbcPass);
    //val maxInstanceIdRes = SQL("").executeQuery();
    val maxInstanceId =  SQL("select max(executorInstanceId) as id from executorInstance")
      .executeQuery()(conn).as[Int](SqlParser.int("id").single)(conn);
    println("MAX instanceId: " + maxInstanceId);

    val hosts : List[ExecutorHostDto]= SQL("select * from executorHost").as(anorm.Macro.namedParser[ExecutorHostDto].*);

    println("All hosts count: " + hosts.size + ", list: " + hosts.mkString(", "))

    val aiDao : AlgorithmImplementationDao = new AlgorithmImplementationDao();

    // val cnts = selectCount(Class[ExecutorInstanceDto].getClass);

    //SQL("select * from algorithmColumnType").as[List[Long]]()
    //val execInstId = executorInstanceId;
    //executorInstanceId = executorInstanceId + 1;
    //val execInstanceParams = Seq((executorTypeId, hostDto.executorHostId, "execname", guid))
    //val insertedRowsCount = sql""" insert into executorInstance(executorTypeId, executorHostId, executorInstanceName, guid) values $execInstanceParams """.executeInsertInt();
    ///println("Registering Executor Instance for GUID: " +  hostDto + ", count: " + insertedRowsCount);
    //SQL("insert into executorInstance(executorInstanceId, executorTypeId, executorHostId, executorInstanceName, guid) values (?, ?, ?)").on("executorTypeId" -> instaneHostName, "" -> "")
    val execInst : ExecutorInstanceDto = null;
    execInst;
  }


    def getExecutorTypes() : List[ExecutorTypeDto] = {
      implicit val connection = DriverManager.getConnection(jdbcString, jdbcUser, jdbcPass);
      val exeTypes : List[ExecutorTypeDto]= SQL("select * from executorType").as(anorm.Macro.namedParser[ExecutorTypeDto].*);
      exeTypes
    }

  def unregisterExecutorInstance(guid : Long) : Unit = {
    implicit val connection = DriverManager.getConnection(jdbcString, jdbcUser, jdbcPass);
    //sql""" update executorInstance set isRunning = 0, isFinished = 1 where guid = $guid  """.executeUpdate()
  }
  def addStorage(storageDefinition : String) = {
    val connection = DriverManager.getConnection(jdbcString, jdbcUser, jdbcPass);
    //SQL("INSERT INTO public.executorStorage(executorStorageId, executorHostId, executorStorageTypeId, storageDefinition, storageBasePath, storageFulllPath, isRunning, portNumber, insertedRowDate, guid) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)")
    //  .on("" -> "", "" -> "").execute()(connection);
  }
  def executeQuery(sql : String, params : Seq[Object]) = {

  }

}


class DaoBase {

  val logger = org.slf4j.LoggerFactory.getLogger("Context");
  var isInitialized = false;
  var connection : java.sql.Connection = null;
  var jdbcString = ""
  var jdbcUser = ""
  var jdbcPass = "";

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

  def createConnection() : Connection = {
    DriverManager.getConnection(jdbcString, jdbcUser, jdbcPass);
  }
  def getConnection() : Connection = {
    DriverManager.getConnection(jdbcString, jdbcUser, jdbcPass);
  }

}
