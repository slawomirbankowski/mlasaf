/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.tests

object DbNewTest {

  val logger = org.slf4j.LoggerFactory.getLogger("MlasafEntry");

  def main(args : Array[String]) = {
    logger.info("START NEW DB");
    val masterDbName = "master";
    val newDbName = "mlasaf27";
    val jdbcStringTemplate = "jdbc:mysql://localhost:3307/DBTEMPLATENAME"
    val jdbcUser = System.getenv("MLASAF_USER")
    val jdbcPass = System.getenv("MLASAF_PASS")
    val jdbcDriver = System.getenv("MLASAF_DRIVER")
    val dbId = "" + com.mlasaf.common.CustomUtils.randomLong();
    val dbType = "MYSQL";
    val jdbcStringMaster = jdbcStringTemplate.replaceAll("DBTEMPLATENAME", masterDbName);
    val jdbcStringNew = jdbcStringTemplate.replaceAll("DBTEMPLATENAME", newDbName);
    println("Connecting to master database (" + jdbcStringMaster + ") to create new DB");
    // connect to database
    val connMaster = java.sql.DriverManager.getConnection(jdbcStringMaster, jdbcUser, jdbcPass);
    // create new database
    println("Creating new DB: " + newDbName);
    connMaster.createStatement().execute("create database " + newDbName);
    println("Database created, disconnecting");
    connMaster.close();
    //conn.createStatement().execute("create user xxx identified by yyy ");
    // create user and grant access
    // only for Oracle this is needed to have: create user mlasafxxx identified by mlasafxxxpass; grant DBA to mlasafxxx;
    // update db with new schema
    println("Conecting to new DB");
    val connNew = java.sql.DriverManager.getConnection(jdbcStringNew, jdbcUser, jdbcPass);
    println("Running Liquibase process to create all DB objects");
    val db = liquibase.database.DatabaseFactory.getInstance().findCorrectDatabaseImplementation(new liquibase.database.jvm.JdbcConnection(connNew));
    val liq = new liquibase.Liquibase("./src/main/resources/db/db_1.0.xml", new liquibase.resource.ClassLoaderResourceAccessor(), db);
    val contx : String = "";
    liq.update(contx);

    //liq.
    println("Created new DB with the newest schema");
    val rs = connNew.createStatement().executeQuery("select count(*) as cnt from INFORMATION_SCHEMA.TABLES");
  }


}
