/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.generates

import anorm.SQL
import com.mlasaf.dto.ColumnDetailDto

object GenerateDaoEntry {

  def main(args : Array[String]) = {
    val jdbcString = "jdbc:sqlserver://localhost\\SQLEXPRESS2014;DatabaseName=mlasaf24";
    val jdbcUser = System.getenv("MLASAF_DDL_USER");
    val jdbcPass = System.getenv("MLASAF_DDL_PASS");
    val jdbcDriver = System.getenv("MLASAF_DDL_DRIVER");
    Class.forName(jdbcDriver);
    implicit val connmssql = java.sql.DriverManager.getConnection(jdbcString, jdbcUser, jdbcPass);
    val cols : List[ColumnDetailDto]=  SQL("select TABLE_NAME, COLUMN_NAME, ORDINAL_POSITION, case DATA_TYPE when 'bigint' then 'Long' when 'int' then 'Int' when 'nvarchar' then 'String' when 'varchar' then 'String' when 'datetime' then 'java.util.Date' when 'float' then 'Double'  else '' end as SCALA_TYPE from INFORMATION_SCHEMA.COLUMNS where TABLE_NAME not like 'DATABASE%'")
      .as(anorm.Macro.namedParser[ColumnDetailDto].*);
    val pkCols : List[ColumnDetailDto] =  SQL(" select TABLE_NAME, COLUMN_NAME, ORDINAL_POSITION, '' as SCALA_TYPE from INFORMATION_SCHEMA.KEY_COLUMN_USAGE where CONSTRAINT_NAME like 'PK%' and TABLE_NAME not like 'DATABASE%'")
      .as(anorm.Macro.namedParser[ColumnDetailDto].*);
    val fkCols : List[ColumnDetailDto] =  SQL(" select TABLE_NAME, COLUMN_NAME, ORDINAL_POSITION, '' as SCALA_TYPE from INFORMATION_SCHEMA.KEY_COLUMN_USAGE where CONSTRAINT_NAME like 'FK%' and TABLE_NAME not like 'DATABASE%'")
      .as(anorm.Macro.namedParser[ColumnDetailDto].*);
    val daosDefinition = new StringBuilder();
    daosDefinition.append("class Daos { \n" )
    cols.map(x => x.TABLE_NAME).distinct.sorted.foreach( tableName => {
      val objName = tableName.charAt(0).toUpper + tableName.substring(1);
      val daoObjectName = tableName + "Dao";
      val daoClassName = objName + "Dao";
      daosDefinition.append("  val " + daoObjectName + " : " + daoClassName + " = new " + daoClassName + "(); \n" );
    });
    daosDefinition.append("  def initialize(daoConn : DaoConnection ): Unit = { \n" );
    cols.map(x => x.TABLE_NAME).distinct.sorted.foreach( tableName => {
      val objName = tableName.charAt(0).toUpper + tableName.substring(1);
      val daoObjectName = tableName + "Dao";
      daosDefinition.append("    " + daoObjectName +  ".initialize(daoConn) \n" );
    });
    daosDefinition.append("  } \n" );
    daosDefinition.append("} \n" );
    println("");
    println(daosDefinition.toString);
    connmssql.close();
  }
}
