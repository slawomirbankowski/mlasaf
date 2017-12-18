package com.mlasaf.dao

import anorm.{SQL, SqlParser}
import com.mlasaf.dto.{ExecutorHostDto, ExecutorInstanceDto}
import com.mlasaf.utils.MlUtils

/** cutsom DAO for custom not generated methods */
class DaoCustom {

  /** logger */
  val logger = org.slf4j.LoggerFactory.getLogger("Context");
  /** factory of DAOs */
  var daoFactory : DaoFactory = null;
  /** create new custom DAO */
  def DaoCustom() = {
  }
  def initialize(factory : DaoFactory) = {
    println("Creating DaoCustom ");
    daoFactory = factory;
  }
  /** insert new executor HOST */
  def insertExecutorHost(dto : ExecutorHostDto) = {
    implicit val connection = daoFactory.daoConn.getConnection();
    SQL("insert into executorHost( executorHostId, hostName, hostIp, hostDomain, hostOsType, hostOsVersion) values( {executorHostId}, {hostName}, {hostIp}, {hostDomain}, {hostOsType}, {hostOsVersion}) ")
      .on("executorHostId" -> dto.executorHostId, "hostName" -> dto.hostName, "hostIp" -> dto.hostIp, "hostDomain" -> dto.hostDomain, "hostOsType" -> dto.hostOsType, "hostOsVersion" -> dto.hostOsVersion)
      .executeInsert()(connection)
  }

  /**  */
  def registerHost() : ExecutorHostDto = {
    val hostName = MlUtils.getHostName
    println("Try to register CURRENT host for name: " + hostName)
    val hostAddress = java.net.InetAddress.getLocalHost.getHostAddress
    val hostIp = java.net.InetAddress.getLocalHost.getAddress.map(b => b.toInt).map(b => if (b<0) b+256 else b).mkString(".")
    val canonicalHost = java.net.InetAddress.getLocalHost.getCanonicalHostName
    val connection = daoFactory.daoConn.getConnection();
    val queryRes = SQL("select count(*) as cnt from executorHost where hostName = {hostName} and hostIp = {hostIp}")
      .on("hostName" -> hostName, "hostIp" -> hostIp)
      .executeQuery()(connection);
    logger.info("queryRes: " + queryRes)
    val cnt = queryRes.as[Int](SqlParser.int("cnt").single)(connection);
    println("Hosts count for CURRENT name: " + cnt);
    if (cnt == 0) {
      logger.info("Registering Executor Host for host: " +  hostName + ", hostAddress: " + hostAddress + ", IP: " + hostIp + ", canonicalHost: " + canonicalHost)
      var simpleS = SQL("insert into executorHost( executorHostId, hostName, hostIp, hostDomain, hostOsType, hostOsVersion) values( {executorHostId}, {hostName}, {hostIp}, {hostDomain}, {hostOsType}, {hostOsVersion}) ")
        .on("executorHostId" -> 2, "hostName" -> hostName, "hostIp" -> hostIp, "hostDomain" -> "", "hostOsType" -> "", "hostOsVersion" -> "")
        .executeInsert()(connection);
    }
    //val et : ExecutorTypeDto = new ExecutorTypeDto(1, "aaa", "bbb");
    println("Try to search for current host in DB: " +  hostName)
    val currentHost : ExecutorHostDto = SQL("select * from executorHost where hostName = {hostName} and hostIp = {hostIp}")
      .on("hostName" -> hostName, "hostIp" -> hostIp)
      .as[ExecutorHostDto](anorm.Macro.namedParser[ExecutorHostDto].single)(connection)
    println("Current host in DB: " +  currentHost)
    currentHost
  }

  def registerExecutorInstance(executorTypeId : Int, guid : Long) : ExecutorInstanceDto = {
    implicit val conn = daoFactory.daoConn.getConnection();
    val hostDto : ExecutorHostDto = registerHost()
    // implicit val connection = DriverManager.getConnection(jdbcString, jdbcUser, jdbcPass);
    //val maxInstanceIdRes = SQL("").executeQuery();
    val maxInstanceId =  SQL("select coalesce(max(executorInstanceId), 0) as id from executorInstance")
      .executeQuery()(conn).as[Int](SqlParser.int("id").single)(conn);
    println("Got ExecutorInstance MAX instanceId: " + maxInstanceId);
    val hosts : List[ExecutorHostDto]= SQL("select * from executorHost").as(anorm.Macro.namedParser[ExecutorHostDto].*);
    println("All hosts count: " + hosts.size + ", list: " + hosts.mkString(", "))
    //daos.executorInstanceDao.
    //val aiDao : AlgorithmImplementationDao = new AlgorithmImplementationDao();
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


  def unregisterExecutorInstance(guid : Long) : Unit = {
    implicit val connection = daoFactory.daoConn.getConnection();
    //sql""" update executorInstance set isRunning = 0, isFinished = 1 where guid = $guid  """.executeUpdate()
  }



}
