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
    implicit val connmssql = java.sql.DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS2014;DatabaseName=mlasaf07", "sa", "sapass");
    val cols : List[ColumnDetailDto]=  SQL("select TABLE_NAME, COLUMN_NAME, ORDINAL_POSITION, case DATA_TYPE when 'bigint' then 'Long' when 'int' then 'Int' when 'nvarchar' then 'String' when 'datetime' then 'java.util.Date' when 'float' then 'Double'  else '' end as SCALA_TYPE from INFORMATION_SCHEMA.COLUMNS where  TABLE_NAME not like 'DATABASE%'")
      .as(anorm.Macro.namedParser[ColumnDetailDto].*);
    val pkCols : List[ColumnDetailDto] =  SQL(" select TABLE_NAME, COLUMN_NAME, ORDINAL_POSITION, '' as SCALA_TYPE from INFORMATION_SCHEMA.KEY_COLUMN_USAGE where CONSTRAINT_NAME like 'PK%' and TABLE_NAME not like 'DATABASE%'")
      .as(anorm.Macro.namedParser[ColumnDetailDto].*);
    val fkCols : List[ColumnDetailDto] =  SQL(" select TABLE_NAME, COLUMN_NAME, ORDINAL_POSITION, '' as SCALA_TYPE from INFORMATION_SCHEMA.KEY_COLUMN_USAGE where CONSTRAINT_NAME like 'FK%' and TABLE_NAME not like 'DATABASE%' ")
      .as(anorm.Macro.namedParser[ColumnDetailDto].*);
    cols.map(x => x.TABLE_NAME).distinct.sorted.foreach( t => {
      val dtoClassName = t.charAt(0).toUpper + t.substring(1) + "Dto";
      val fieldList = cols.filter(c => c.TABLE_NAME.equals(t)).map(col => col.COLUMN_NAME).mkString(",");
      val fieldQuestionList = cols.filter(c => c.TABLE_NAME.equals(t)).map(col => "?").mkString(",");
      val pkFieldList = pkCols.filter(c => c.TABLE_NAME.equals(t)).map(col => col.COLUMN_NAME).mkString(",");
      val fkFieldList = fkCols.filter(c => c.TABLE_NAME.equals(t)).map(col => col.COLUMN_NAME).mkString(",");
      val nameCol = cols.filter(c => c.TABLE_NAME.equals(t)).filter(c => c.COLUMN_NAME.equals(c.TABLE_NAME + "Name")).map(c => c.COLUMN_NAME);
      val caseValueList = fieldList.split(",").map(f => "    case \"" + f + "\" => " + f + " ").mkString(" \n ");
      val caseTypeNameList = cols.filter(c => c.TABLE_NAME.equals(t)).map(f => "    case \"" + f.COLUMN_NAME + "\" => \"" + f.SCALA_TYPE + "\" ").mkString(" \n ");
      val prepareInsertStat = "    val stat = connection.prepareStatement(\"insert into " + t + "(" + fieldList + ") values (" + fieldQuestionList + ")\");\n";
      var setSeq = 1;
      val prepareInsertSet = cols.filter(c => c.TABLE_NAME.equals(t)).map(col => col.COLUMN_NAME).zipWithIndex.map( f => "    stat.setObject(" + (f._2+1) + ", " + f._1 + ");").mkString("\n");
      val tableNameDef = " \n   def tableName : String = { \n   \"" + t + "\"; \n   } ";
      val fieldsDef = " \n   def fields : String = { \n   \"" + fieldList + "\"; \n   } ";
      val pkFields = " \n   def pkFields : String = { \n   \"" + pkFieldList + "\"; \n   } ";
      val fkFields = " \n   def fkFields : String = { \n   \"" + fkFieldList + "\"; \n   } ";
      var nameField = " \n   def nameField : String = { \n   \"" + nameCol.mkString(",") + "\"; \n   } ";
      var getIdMethod = " ";
      var getInsertedRowDateMethod  = " \n def getInsertedRowDate() : java.util.Date = {\n    insertedRowDate\n  } ";
      var toAnyArray = " \n def toAnyArray() : Array[Any] = {\n    Array(" + fieldList + ")\n  } ";
      var toStringArray = " \n def toStringArray() : Array[String] = {\n    Array(" + fieldList.split(",").map(f => "\"\"+" + f).mkString(",") + ") \n  } ";
      val getFieldValueMethodBody =  "\n   def getFieldValue(name : String) : Any = { \n    val ret = name match { \n" + caseValueList + "  \n    case _ => null \n    } \n    ret \n  } ";
      val getFieldNameeMethodBody =  "\n   def getFieldTypeName(name : String) : Any = { \n    val ret = name match { \n" + caseTypeNameList + "  \n    case _ => \"Object\" \n    } \n    ret \n  } ";
      val prepareInsertMethod = "\n   def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {\n " + prepareInsertStat + "" + prepareInsertSet + "\n    return stat; \n   } ";
      val allDefsList = tableNameDef + fieldsDef + pkFields + fkFields + nameField + getInsertedRowDateMethod + toAnyArray + toStringArray + getFieldValueMethodBody + getFieldNameeMethodBody + prepareInsertMethod + "\n";
      val caseClassDef = "case class " + dtoClassName + " ( " + cols.filter(c => c.TABLE_NAME.equals(t)).map(col => "val " + col.COLUMN_NAME + " : " + col.SCALA_TYPE).mkString(", ") + " ) extends BaseDto { " + allDefsList + " } ";
      println(caseClassDef)
    });
    connmssql.close();
  }

}

