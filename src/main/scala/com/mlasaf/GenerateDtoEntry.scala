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
    implicit val connmssql = java.sql.DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS2014;DatabaseName=mlasaf13", "sa", "sapass");
    val cols : List[ColumnDetailDto]=  SQL("select TABLE_NAME, COLUMN_NAME, ORDINAL_POSITION, case DATA_TYPE when 'bigint' then 'Long' when 'int' then 'Int' when 'nvarchar' then 'String' when 'datetime' then 'java.util.Date' when 'float' then 'Double'  else '' end as SCALA_TYPE from INFORMATION_SCHEMA.COLUMNS where  TABLE_NAME not like 'DATABASE%'")
      .as(anorm.Macro.namedParser[ColumnDetailDto].*);
    val pkCols : List[ColumnDetailDto] =  SQL(" select TABLE_NAME, COLUMN_NAME, ORDINAL_POSITION, '' as SCALA_TYPE from INFORMATION_SCHEMA.KEY_COLUMN_USAGE where CONSTRAINT_NAME like 'PK%' and TABLE_NAME not like 'DATABASE%'")
      .as(anorm.Macro.namedParser[ColumnDetailDto].*);
    val fkCols : List[ColumnDetailDto] =  SQL(" select TABLE_NAME, COLUMN_NAME, ORDINAL_POSITION, '' as SCALA_TYPE from INFORMATION_SCHEMA.KEY_COLUMN_USAGE where CONSTRAINT_NAME like 'FK%' and TABLE_NAME not like 'DATABASE%' ")
      .as(anorm.Macro.namedParser[ColumnDetailDto].*);
    cols.map(x => x.TABLE_NAME).distinct.sorted.foreach( tableName => {
      val dtoClassName = tableName.charAt(0).toUpper + tableName.substring(1) + "Dto";
      val isTable = !tableName.startsWith("v");
      val baseDtoClassName = (if (isTable) "BaseDto" else "BaseReadOnlyDto")
      val fieldList = cols.filter(c => c.TABLE_NAME.equals(tableName)).map(col => col.COLUMN_NAME).mkString(",");
      val fieldQuestionList = cols.filter(c => c.TABLE_NAME.equals(tableName)).map(col => "?").mkString(",");
      val pkFieldList = pkCols.filter(c => c.TABLE_NAME.equals(tableName)).map(col => col.COLUMN_NAME).mkString(",");
      val fkFieldList = fkCols.filter(c => c.TABLE_NAME.equals(tableName)).map(col => col.COLUMN_NAME).mkString(",");
      val nameCol = cols.filter(c => c.TABLE_NAME.equals(tableName)).filter(c => c.COLUMN_NAME.equals(c.TABLE_NAME + "Name")).map(c => c.COLUMN_NAME);
      val caseValueList = fieldList.split(",").map(f => "    case \"" + f + "\" => " + f + " ").mkString(" \n ");
      val caseTypeNameList = cols.filter(c => c.TABLE_NAME.equals(tableName)).map(f => "    case \"" + f.COLUMN_NAME + "\" => \"" + f.SCALA_TYPE + "\" ").mkString(" \n ");
      val prepareInsertStat = "    val stat = connection.prepareStatement(\"insert into " + tableName + "(" + fieldList + ") values (" + fieldQuestionList + ")\");\n";
      var setSeq = 1;
      val prepareInsertSet = cols.filter(c => c.TABLE_NAME.equals(tableName)).map(col => col.COLUMN_NAME).zipWithIndex.map( f => "    stat.setObject(" + (f._2+1) + ", " + f._1 + ");").mkString("\n");
      val tableNameDef = " \n   def tableName : String = { \n   \"" + tableName + "\"; \n   } ";
      val fieldsDef = " \n   def fields : String = { \n   \"" + fieldList + "\"; \n   } ";
      val pkFields = " \n   def pkFields : String = { \n   \"" + pkFieldList + "\"; \n   } ";
      val fkFields = " \n   def fkFields : String = { \n   \"" + fkFieldList + "\"; \n   } ";
      var nameField = " \n   def nameField : String = { \n   \"" + nameCol.mkString(",") + "\"; \n   } ";
      var getIdMethod = " ";
      var getInsertedRowDateMethod  = " \n def getInsertedRowDate() : java.util.Date = {\n    insertedRowDate\n  } ";
      var toAnyArray = " \n def toAnyArray() : Array[Any] = {\n    Array(" + fieldList + ")\n  } ";
      var toStringArray = " \n def toStringArray() : Array[String] = {\n    Array(" + fieldList.split(",").map(f => "\"\"+" + f).mkString(",") + ") \n  } ";
      val getFieldValueMethodBody =  "\n   def getFieldValue(name : String) : Any = { \n    val ret = name match { \n" + caseValueList + "  \n    case _ => null \n    } \n    ret \n  } ";
      val getFieldNameeMethodBody =  "\n   def getFieldTypeName(name : String) : String = { \n    val ret = name match { \n" + caseTypeNameList + "  \n    case _ => \"Object\" \n    } \n    ret \n  } ";
      val prepareInsertMethod =(if (isTable) "\n   def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {\n " + prepareInsertStat + "" + prepareInsertSet + "\n    return stat; \n   } " else "");
      val allDefsList = tableNameDef + fieldsDef + pkFields + fkFields + nameField + getInsertedRowDateMethod + toAnyArray + toStringArray + getFieldValueMethodBody + getFieldNameeMethodBody + prepareInsertMethod + "\n";
      val caseClassDef = "case class " + dtoClassName + " ( " + cols.filter(c => c.TABLE_NAME.equals(tableName)).map(col => "val " + col.COLUMN_NAME + " : " + col.SCALA_TYPE).mkString(", ") + " ) extends " + baseDtoClassName + " { " + allDefsList + " } ";
      println(caseClassDef)
    });
    connmssql.close();
  }

}

