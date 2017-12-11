package com.mlasaf

object NewTest {

  def main(args : Array[String]) = {
    println("START test");
    val jdbcString = "jdbc:db2://localhost:50000/mlasaf01";
    val jdbcUser = "db2admin";
    val jdbcPass = "db2adminpass";
    val dbId = "" + com.mlasaf.common.CustomUtils.randomLong();
    val dbFullName = "mlasaf-" + dbId;
    val dbType = "DB2";

    // connect to database
    val conn = java.sql.DriverManager.getConnection(jdbcString, jdbcUser, jdbcPass);

    // create new database
    conn.createStatement().execute("create database " + dbFullName);

    // create user and grant access
    // only for Oracle this is needed to have: create user mlasafxxx identified by mlasafxxxpass; grant DBA to mlasafxxx;

    // run test for new DB

    // update db with new schema
    val connTempId = java.sql.DriverManager.getConnection(jdbcString, jdbcUser, jdbcPass);
    val db = liquibase.database.DatabaseFactory.getInstance().findCorrectDatabaseImplementation(new liquibase.database.jvm.JdbcConnection(connTempId));
    val liq = new liquibase.Liquibase("./", new liquibase.resource.ClassLoaderResourceAccessor(), db);

    // run test

    // drop temporary DB - only if needed



  }
}
