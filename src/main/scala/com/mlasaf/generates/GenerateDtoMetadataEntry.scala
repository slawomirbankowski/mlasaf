/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.generates

import anorm.SQL
import com.mlasaf.dto.ColumnDetailDto


object GenerateDtoMetadataEntry {

  def main(args : Array[String]) = {
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    implicit val connmssql = java.sql.DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS2014;DatabaseName=mlasaf16", "sa", "sapass");
    val cols : List[ColumnDetailDto]=  SQL("select TABLE_NAME, COLUMN_NAME, ORDINAL_POSITION, case DATA_TYPE when 'bigint' then 'Long' when 'int' then 'Int' when 'nvarchar' then 'String' when 'datetime' then 'java.util.Date' when 'float' then 'Double'  else '' end as SCALA_TYPE from INFORMATION_SCHEMA.COLUMNS where  TABLE_NAME not like 'DATABASE%'")
      .as(anorm.Macro.namedParser[ColumnDetailDto].*);
    val pkCols : List[ColumnDetailDto] =  SQL(" select TABLE_NAME, COLUMN_NAME, ORDINAL_POSITION, '' as SCALA_TYPE from INFORMATION_SCHEMA.KEY_COLUMN_USAGE where CONSTRAINT_NAME like 'PK%' and TABLE_NAME not like 'DATABASE%'")
      .as(anorm.Macro.namedParser[ColumnDetailDto].*);
    val fkCols : List[ColumnDetailDto] =  SQL(" select TABLE_NAME, COLUMN_NAME, ORDINAL_POSITION, '' as SCALA_TYPE from INFORMATION_SCHEMA.KEY_COLUMN_USAGE where CONSTRAINT_NAME like 'FK%' and TABLE_NAME not like 'DATABASE%' ")
      .as(anorm.Macro.namedParser[ColumnDetailDto].*);
    val dtosClassDef = new StringBuilder();
    dtosClassDef.append("\nobject DtoMetadata { \n");
    dtosClassDef.append("  def getDtoClasses() : Array[String] = {  columns.map(c => c.TABLE_NAME).distinct.map(t => t + \"Dto\"); } \n");
    dtosClassDef.append("  def getTableNames() : Array[String] = {  columns.map(c => c.TABLE_NAME).distinct; } \n");
    dtosClassDef.append("  def getPkNameForTable(tableName : String) : String = { tableName + \"Id\"; } \n");
    dtosClassDef.append("  def getColumns() : Array[ColumnDetailDto] = { columns; } \n");
    dtosClassDef.append("  def getColumnsForTable(tableName : String) : Array[ColumnDetailDto] = { columns.filter(c => c.TABLE_NAME.equals(tableName)); } \n");
    dtosClassDef.append("  val columns = Array( \n");
    dtosClassDef.append(cols.map(c => " ColumnDetailDto(\"" + c.TABLE_NAME + "\", \"" + c.COLUMN_NAME + "\", " + c.ORDINAL_POSITION + ", \"" + c.SCALA_TYPE + "\") \n").mkString("      , "))
    dtosClassDef.append("  ) \n");
    dtosClassDef.append("} \n");
    println(dtosClassDef.toString())
    connmssql.close();
  }

}
