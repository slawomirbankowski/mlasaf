package com.mlasaf

import anorm.SQL
import com.mlasaf.dto.ExecutorTypeDto

object DaoTest {

  def main(args : Array[String]) = {
    println(" Connect to DB ")


    println(" MSSQLSERVER - DRIVER ")
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    implicit val connmssql = java.sql.DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS2014;DatabaseName=mlasaf05", "sa", "sapass");
    println(" MSSQLSERVER - CONNECTED ")
    val cols : List[ColumnDetailDto]=  SQL("select TABLE_NAME, COLUMN_NAME, ORDINAL_POSITION, case DATA_TYPE when 'bigint' then 'Long' when 'int' then 'Int' when 'nvarchar' then 'String' when 'datetime' then 'java.util.Date' when 'float' then 'Double'  else '' end as SCALA_TYPE from INFORMATION_SCHEMA.COLUMNS")
      .as(anorm.Macro.namedParser[ColumnDetailDto].*);
    println("All columns: " + cols.size + ", tables: " + cols.map(x => x.TABLE_NAME).distinct.size);
    println("All columns: " + cols.size + ", tables: " + cols.map(x => x.TABLE_NAME).distinct.size);

    cols.map(x => x.TABLE_NAME).distinct.sorted.foreach( t => {
      val caseClassDef = "case class "+ t.charAt(0).toUpper + t.substring(1) + "Dto ( " + cols.filter(c => c.TABLE_NAME.equals(t)).map(col => "val " + col.COLUMN_NAME + " : " + col.SCALA_TYPE).mkString(", ") + " ) extends BaseDto { fields = \"\" } ";
       println(caseClassDef)
    });
    //val exeTypes : List[ExecutorTypeDto]= SQL("select * from executorType").as(anorm.Macro.namedParser[ExecutorTypeDto].*);
    //println("Got exeTypes: " + exeTypes.size + ", List: " + exeTypes.mkString(", "))
    //connmssql.createStatement().executeQuery("select * from INFORMATION_SCHEMA.TABLES");
    connmssql.close();
    println(" MSSQLSERVER - DISCONNECTED ")
  }
}

case class ColumnDetailDto(val TABLE_NAME : String, val COLUMN_NAME : String, val ORDINAL_POSITION : Int, val SCALA_TYPE : String) {
}
