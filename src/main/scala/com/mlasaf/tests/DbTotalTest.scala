/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.tests

object DbTotalTest {

  def main(args : Array[String]) : Unit = {
    println(" START ")

    println(" ORACLE - DRIVER ")
    Class.forName("oracle.jdbc.OracleDriver");
    val connoracle = java.sql.DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "systempass");
    println(" ORACLE - CONNECTED ")
    connoracle.createStatement().executeQuery("select * from all_tables");
    println(" ORACLE - EXECUTED SQL ")
    connoracle.close();
    println(" ORACLE - DISCONNECTED ")

    println(" POSTGRESQL - DRIVER ")
    Class.forName("org.postgresql.Driver");
    val connpostgre = java.sql.DriverManager.getConnection("jdbc:postgresql://localhost:5432/mlasaf10", "postgres", "postgrespass");
    println(" POSTGRESQL - CONNECTED ")
    connpostgre.createStatement().executeQuery("select * from INFORMATION_SCHEMA.TABLES");
    println(" POSTGRESQL - EXECUTED SQL ")
    connpostgre.close();
    println(" POSTGRESQL - DISCONNECTED ")

    println(" MYSQL - DRIVER ")
    Class.forName("com.mysql.jdbc.Driver");
    val connmysql = java.sql.DriverManager.getConnection("jdbc:mysql://localhost/mlasaf01", "root", "rootpass");
    println(" MYSQL - CONNECTED  ")
    connmysql.createStatement().executeQuery("select * from INFORMATION_SCHEMA.TABLES");
    println(" MYSQL - EXECUTED SQL ")
    connmysql.close();
    println(" MYSQL - DISCONNECTED ");

    println(" DB2 - DRIVER ")
    Class.forName("com.ibm.db2.jcc.DB2Driver");
    val conndb2 = java.sql.DriverManager.getConnection("jdbc:db2://localhost:50000/mlasaf01", "db2admin", "db2adminpass");
    println(" DB2 - CONNECTED ")
    conndb2.createStatement().executeQuery("select * from t");
    println(" DB2 - EXECUTED SQL ")
    conndb2.close();
    println(" DB2 - DISCONNECTED ")

    println(" MSSQLSERVER - DRIVER ")
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    val connmssql = java.sql.DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS2014;DatabaseName=mlasaf01", "sa", "sapass");
    println(" MSSQLSERVER - CONNECTED ")
    connmssql.createStatement().executeQuery("select * from INFORMATION_SCHEMA.TABLES");
    println(" MSSQLSERVER - EXECUTED SQL ")
    connmssql.close();
    println(" MSSQLSERVER - DISCONNECTED ")

    println(" END ")
  }
}
