package com.mlasaf

/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
import anorm.SQL
import com.mlasaf.dto._
import com.mlasaf.dto.ExecutorTypeDto

object GenerateDtoEntry {

  def main(args : Array[String]) = {
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    implicit val connmssql = java.sql.DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS2014;DatabaseName=mlasaf05", "sa", "sapass");
    val cols : List[ColumnDetailDto]=  SQL("select TABLE_NAME, COLUMN_NAME, ORDINAL_POSITION, case DATA_TYPE when 'bigint' then 'Long' when 'int' then 'Int' when 'nvarchar' then 'String' when 'datetime' then 'java.util.Date' when 'float' then 'Double'  else '' end as SCALA_TYPE from INFORMATION_SCHEMA.COLUMNS")
      .as(anorm.Macro.namedParser[ColumnDetailDto].*);
    val pkCols : List[ColumnDetailDto] =  SQL(" select TABLE_NAME, COLUMN_NAME, ORDINAL_POSITION, '' as SCALA_TYPE from INFORMATION_SCHEMA.KEY_COLUMN_USAGE where CONSTRAINT_NAME like 'PK%'")
      .as(anorm.Macro.namedParser[ColumnDetailDto].*);
    val fkCols : List[ColumnDetailDto] =  SQL(" select TABLE_NAME, COLUMN_NAME, ORDINAL_POSITION, '' as SCALA_TYPE from INFORMATION_SCHEMA.KEY_COLUMN_USAGE where CONSTRAINT_NAME like 'FK%'")
      .as(anorm.Macro.namedParser[ColumnDetailDto].*);
    cols.map(x => x.TABLE_NAME).distinct.sorted.foreach( t => {
      val fieldList = cols.filter(c => c.TABLE_NAME.equals(t)).map(col => col.COLUMN_NAME).mkString(",");
      val pkFieldList = pkCols.filter(c => c.TABLE_NAME.equals(t)).map(col => col.COLUMN_NAME).mkString(",");
      val fkFieldList = fkCols.filter(c => c.TABLE_NAME.equals(t)).map(col => col.COLUMN_NAME).mkString(",");
      val caseList = fieldList.split(",").map(f => "    case \"" + f + "\" => " + f + " ").mkString(" \n ");
      val fieldsDef = " \n   def fields : String = { \n   \"" + fieldList + "\"; \n   } ";
      val pkFields = " \n   def pkFields : String = { \n   \"" + pkFieldList + "\"; \n   } ";
      val fkFields = " \n   def fkFields : String = { \n   \"" + fkFieldList + "\"; \n   } ";
      val allDefsList = fieldsDef + pkFields + fkFields;
      val getMethodBody =  "\n   def get(name : String) : Any = { \n    val ret = name match { \n" + caseList + "  \n    case _ => null \n    } \n    ret \n  } \n"
      val caseClassDef = "case class "+ t.charAt(0).toUpper + t.substring(1) + "Dto ( " + cols.filter(c => c.TABLE_NAME.equals(t)).map(col => "val " + col.COLUMN_NAME + " : " + col.SCALA_TYPE).mkString(", ") + " ) extends BaseDto { " + allDefsList + "    " + getMethodBody + "} ";
      println(caseClassDef)
    });
    connmssql.close();
  }

}

