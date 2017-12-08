package com.mlasaf

object TotalTest {

  def main(args : Array[String]) : Unit = {
    println(" START ")


    println(" ORACLE - DRIVER ")
    Class.forName("oracle.jdbc.OracleDriver");
    val connoracle = java.sql.DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "*");
    println(" ORACLE - CONNECTED ")
    connoracle.createStatement().executeQuery("select * from all_tables");
    println(" ORACLE - EXECUTED SQL ")
    connoracle.close();
    println(" ORACLE - DISCONNECTED ")

    println(" POSTGRESQL - DRIVER ")
    Class.forName("org.postgresql.Driver");
    val connpostgre = java.sql.DriverManager.getConnection("jdbc:postgresql://localhost:5432/mlasaf10", "postgres", "*");
    println(" POSTGRESQL - CONNECTED ")
    connpostgre.createStatement().executeQuery("select * from INFORMATION_SCHEMA.TABLES");
    println(" POSTGRESQL - EXECUTED SQL ")
    connpostgre.close();
    println(" POSTGRESQL - DISCONNECTED ")

    println(" MSSQLSERVER - DRIVER ")
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    val connmssql = java.sql.DriverManager.getConnection("jdbc:microsoft:sqlserver://localhost:1433;DatabaseName=master", "sa", "*");
    println(" MSSQLSERVER - CONNECTED ")
    connmssql.createStatement().executeQuery("select * from INFORMATION_SCHEMA.TABLES");
    println(" MSSQLSERVER - EXECUTED SQL ")
    connmssql.close();
    println(" MSSQLSERVER - DISCONNECTED ")

    println(" MYSQL - DRIVER ")
    Class.forName("com.mysql.jdbc.Driver");
    val connmysql = java.sql.DriverManager.getConnection("jdbc:mysql://localhost/mlasaf01", "mlasafuser", "*");
    println(" MYSQL - CONNECTED  ")
    connmysql.createStatement().executeQuery("select * from INFORMATION_SCHEMA.TABLES");
    println(" MYSQL - EXECUTED SQL ")
    connmysql.close();
    print(" MYSQL - DISCONNECTED ");



    println(" DB2 - DRIVER ")
    Class.forName("com.ibm.db2.jcc.DB2Driver");
    val conndb2 = java.sql.DriverManager.getConnection("jdbc:db2://localhost:50000/DBTEST", "db2admin", "*");
    println(" DB2 - CONNECTED ")
    conndb2.createStatement().executeQuery("select * from INFORMATION_SCHEMA.TABLES");
    println(" DB2 - EXECUTED SQL ")
    conndb2.close();
    println(" DB2 - DISCONNECTED ")



    //Class.forName("");
    //val mssql = "jdbc:microsoft:sqlserver://localhost:1433;DatabaseName=master"

    //val conn = java.sql.DriverManager.getConnection(mysql, "system", "systempass");

    //val db2cs = ""

    //Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");


    //Class.forName("org.postgresql.Driver");



    println(" END ")
  }
}
