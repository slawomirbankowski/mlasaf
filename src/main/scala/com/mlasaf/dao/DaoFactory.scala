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

    /** add DAO objects for all DTOs */
    val daos : Daos = new Daos();
    val daoConn : DaoConnection = new DaoConnection();
    val logger = org.slf4j.LoggerFactory.getLogger("Context");
    var executorInstanceId = 1;

    def DaoFactory() = {
    }

    /** initialize connection - create template */
    def initialize(jdbc : String, user: String, pass : String) = {
      println("Creating connection to configurational DB: " + jdbc + " with user: " + user);
      daoConn.initialize(jdbc, user, pass)
      daos.initialize(daoConn);
    }

    def insertHostType(dto : ExecutorHostDto) = {
      implicit val connection = daoConn.getConnection();
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
      val connection = daoConn.getConnection();
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

    def insert(d : BaseDto): Unit = {
      implicit val conn = daoConn.getConnection();
      val insertParams = d.fields.split(",").map(f => "{" + f + "}").mkString(",")
      val sql = "insert into " + d.getClass.getName + "(" + d.fields + ") values (" + insertParams + ") ";
      val stat = conn.prepareStatement("");
      //d.fields.map(x => d.get(x)).toArray;
      //val ar = Array[AnyRef](1, "", 4.6, "");
      //stat.setObject(1, "");
      //val dtoAttribs = d.fields.split(",").map(x => d.get(x));
      //dtoAttribs.
      //d.get("")
      //val paramValues = d.fields.map(p => NamedParameter.string[String](p => p)).toArray;
      //new NamedParameter()
      //SQL(sql).on().onParams(paramValues).executeInsert()(conn);
    }

    def selectCount(d : BaseDto) : Long = {
      implicit val conn = daoConn.getConnection();
      val sql = "select count(*) as cnt from " + d.getClass.getName;
      val queryRes = SQL(sql)
        .executeQuery()(conn).as[Int](SqlParser.int("cnt").single)(conn);;
      queryRes
    }
    def selectCount(d : java.lang.Class[BaseDto]) : Long = {
      implicit val conn = daoConn.getConnection();
      val sql = "select count(*) as cnt from " + d.getName;
      val queryRes = SQL(sql)
        .executeQuery()(conn).as[Int](SqlParser.int("cnt").single)(conn);;
      queryRes
    }
    def registerExecutorInstance(executorTypeId : Int, guid : Long) : ExecutorInstanceDto = {
      implicit val conn = daoConn.getConnection();
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
      implicit val connection = daoConn.getConnection();
      //sql""" update executorInstance set isRunning = 0, isFinished = 1 where guid = $guid  """.executeUpdate()
    }

    def executeQuery(sql : String, params : Seq[Object]) = {

    }

}

