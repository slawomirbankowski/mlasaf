package com.mlasaf.generates

import anorm.SQL
import com.mlasaf.dto.ColumnDetailDto

object GenerateViewsSummaryEntry {

  def main(args : Array[String]) = {
    val jdbcString = "jdbc:sqlserver://localhost\\SQLEXPRESS2014;DatabaseName=mlasaf23";
    val jdbcUser = System.getenv("MLASAF_DDL_USER");
    val jdbcPass = System.getenv("MLASAF_DDL_PASS");
    val jdbcDriver = System.getenv("MLASAF_DDL_DRIVER");
    Class.forName(jdbcDriver);
    implicit val connmssql = java.sql.DriverManager.getConnection(jdbcString, jdbcUser, jdbcPass);
    val cols : List[ColumnDetailDto]=  SQL("select TABLE_NAME, COLUMN_NAME, ORDINAL_POSITION, case DATA_TYPE when 'bigint' then 'Long' when 'int' then 'Int' when 'nvarchar' then 'String' when 'varchar' then 'String' when 'datetime' then 'java.util.Date' when 'float' then 'Double'  else '' end as SCALA_TYPE from INFORMATION_SCHEMA.COLUMNS where  TABLE_NAME not like 'DATABASE%'")
      .as(anorm.Macro.namedParser[ColumnDetailDto].*);
    val pkCols : List[ColumnDetailDto] =  SQL(" select TABLE_NAME, COLUMN_NAME, ORDINAL_POSITION, '' as SCALA_TYPE from INFORMATION_SCHEMA.KEY_COLUMN_USAGE where CONSTRAINT_NAME like 'PK%' and TABLE_NAME not like 'DATABASE%'")
      .as(anorm.Macro.namedParser[ColumnDetailDto].*);
    val fkCols : List[ColumnDetailDto] =  SQL(" select TABLE_NAME, COLUMN_NAME, ORDINAL_POSITION, '' as SCALA_TYPE from INFORMATION_SCHEMA.KEY_COLUMN_USAGE where CONSTRAINT_NAME like 'FK%' and TABLE_NAME not like 'DATABASE%' ")
      .as(anorm.Macro.namedParser[ColumnDetailDto].*);
    val tableList = cols.map(t => t.TABLE_NAME).distinct;
    cols.map(x => x.TABLE_NAME).distinct.sorted.foreach( tableName => {
      val dtoClassName = tableName.charAt(0).toUpper + tableName.substring(1) + "Summary" + "Dto";
      val viewName = "v" + tableName.charAt(0).toUpper + tableName.substring(1) + "Summary";
      val tableAliasName = tableName + "1";
      val tablePrimaryKeyName = tableName + "Id";
      val fieldList = cols.filter(c => c.TABLE_NAME.equals(tableName)).map(col => col.COLUMN_NAME).mkString(",");
      val fieldWithAliasList = cols.filter(c => c.TABLE_NAME.equals(tableName)).map(col => tableAliasName + "." + col.COLUMN_NAME).mkString(", ")

      val summaryTablesList = cols.filter(c => c.COLUMN_NAME.equals(tablePrimaryKeyName)).filter(x => !x.TABLE_NAME.equals(tableName)).filter(x => !x.TABLE_NAME.startsWith("v"));
      val fromDefinition = "\n  from " + tableName + " " + tableAliasName;

      val summaryTablesFieldList = summaryTablesList.map(st => " " + st.TABLE_NAME + "1." + st.TABLE_NAME + "_count").mkString(", ");
      val colListDefinition = fieldWithAliasList + "\n   , " + summaryTablesFieldList;
      val joinDefinition =  summaryTablesList.map(st => "join (select " + st.COLUMN_NAME + ", count(*) as " + st.TABLE_NAME + "_count from " + st.TABLE_NAME + " group by " + st.COLUMN_NAME + ") " + st.TABLE_NAME + "1 on " + st.TABLE_NAME + "1." + st.COLUMN_NAME + " = " + tableAliasName + "." + st.COLUMN_NAME + " ").mkString("\n    ");

      val selectDefinition = "select " + colListDefinition + fromDefinition + " \n    " + joinDefinition ;
      val viewFullDefinition = "\n\n <createView  viewName=\"" + viewName + "\"> \n " + selectDefinition + "; \n </createView> ";
       if  (summaryTablesList.size > 0) {
         println(viewFullDefinition);
       }
    });
    connmssql.close();
  }
}
