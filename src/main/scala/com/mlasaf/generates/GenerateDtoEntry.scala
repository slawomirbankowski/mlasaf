/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.generates

/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
import anorm.SQL
import com.mlasaf.dto._

object GenerateDtoEntry {


  def main(args : Array[String]) = {
    val jdbcString = "jdbc:sqlserver://localhost\\SQLEXPRESS2014;DatabaseName=mlasaf24";
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
    cols.map(x => x.TABLE_NAME).distinct.sorted.foreach( tableName => {
      val dtoClassName = tableName.charAt(0).toUpper + tableName.substring(1) + "Dto";
      val isTable = !tableName.startsWith("v");
      val baseDtoClassName = (if (isTable) "BaseDto" else "BaseReadOnlyDto")
      val allFieldsForDto = cols.filter(c => c.TABLE_NAME.equals(tableName));
      val fieldList = allFieldsForDto.map(col => col.COLUMN_NAME).mkString(",");
      val pkFieldList = pkCols.filter(c => c.TABLE_NAME.equals(tableName)).map(col => col.COLUMN_NAME).mkString(",");
      val primaryKeyFields = pkCols.filter(c => c.TABLE_NAME.equals(tableName)).map(col => col.COLUMN_NAME);
      val fkFieldList = fkCols.filter(c => c.TABLE_NAME.equals(tableName)).map(col => col.COLUMN_NAME).mkString(",");
      val nameCol = allFieldsForDto.filter(c => c.COLUMN_NAME.equals(c.TABLE_NAME + "Name")).map(c => c.COLUMN_NAME);
      val caseValueList = fieldList.split(",").map(f => "    case \"" + f + "\" => " + f + " ").mkString(" \n ");
      val insertColumns = allFieldsForDto.map(col => col.COLUMN_NAME).filter(c => !primaryKeyFields.contains(c) && !c.equals("insertedRowDate") && !c.equals("lastUpdatedDate"));
      val fieldQuestionList = insertColumns.map(col => "?").mkString(",");
      val caseTypeNameList = allFieldsForDto.map(f => "    case \"" + f.COLUMN_NAME + "\" => \"" + f.SCALA_TYPE + "\" ").mkString(" \n ");
      val prepareInsertStat = "    val stat = connection.prepareStatement(\"insert into " + tableName + "(" + insertColumns.mkString(",") + ") values (" + fieldQuestionList + ")\", java.sql.Statement.RETURN_GENERATED_KEYS);\n";
      var setSeq = 1;
      val pkNameNormalized = if (primaryKeyFields.size > 0) (primaryKeyFields.head) else (tableName.charAt(1).toLower + tableName.substring(2) + "Id");
      val prepareInsertSet = insertColumns.zipWithIndex.map( f => "    stat.setObject(" + (f._2+1) + ", " + f._1 + ");").mkString("\n");
      val tableNameDef = " \n   def tableName : String = { \n   \"" + tableName + "\"; \n   } ";
      val fieldsDef = " \n   def fields : String = { \n   \"" + fieldList + "\"; \n   } ";
      val pkFields = " \n   def pkFields : String = { \n   \"" + pkFieldList + "\"; \n   } ";
      val fkFields = " \n   def fkFields : String = { \n   \"" + fkFieldList + "\"; \n   } ";
      var nameField = " \n   def nameField : String = { \n   \"" + nameCol.mkString(",") + "\"; \n   } ";
      var getIdMethod = " ";
      var getPkMethod  = " \n def getPk() : Long = {\n    " + pkNameNormalized + "\n  } ";
      var getInsertedRowDateMethod  = " \n def getInsertedRowDate() : java.util.Date = {\n    insertedRowDate\n  } ";
      var getLastUpdatedDateMethod  = " \n def getLastUpdatedDate() : java.util.Date = {\n    lastUpdatedDate\n  } ";
      var getGuidMethod  = " \n def getGuid() : Long = {\n    guid\n  } ";
      var toAnyArray = " \n def toAnyArray() : Array[Any] = {\n    Array(" + fieldList + ")\n  } ";
      var toStringArray = " \n def toStringArray() : Array[String] = {\n    Array(" + fieldList.split(",").map(f => "\"\"+" + f).mkString(",") + ") \n  } ";
      val getFieldValueMethodBody =  "\n   def getFieldValue(name : String) : Any = { \n    val ret = name match { \n" + caseValueList + "  \n    case _ => null \n    } \n    ret \n  } ";
      val getFieldNameeMethodBody =  "\n   def getFieldTypeName(name : String) : String = { \n    val ret = name match { \n" + caseTypeNameList + "  \n    case _ => \"Object\" \n    } \n    ret \n  } ";
      val prepareInsertMethod =(if (isTable) "\n   def prepareInsert(connection : java.sql.Connection) : java.sql.PreparedStatement = {\n " + prepareInsertStat + "" + prepareInsertSet + "\n    return stat; \n   } " else "");


      val createNewParams = allFieldsForDto
        .filter(c => !c.COLUMN_NAME.equals("guid") && !c.COLUMN_NAME.equals("insertedRowDate") && !c.COLUMN_NAME.equals("lastUpdatedDate") && !c.COLUMN_NAME.equals(pkFieldList))
        .map(c => "" + c.COLUMN_NAME + " : " + c.SCALA_TYPE).mkString(", ");
      val insertParamsList = allFieldsForDto.map(c => c.COLUMN_NAME match {
        case "guid" => "0"
        case "insertedRowDate" => "new java.util.Date()"
        case "lastUpdatedDate" => "new java.util.Date()"
        case _ => c.COLUMN_NAME
      } ).map(c => if (c.equals(pkFieldList)) "0" else c).mkString(",");
      val modifyParamsList = allFieldsForDto.map(c => c.COLUMN_NAME match {
        case "guid" => "this.guid"
        case "insertedRowDate" => "this.insertedRowDate"
        case "lastUpdatedDate" => "new java.util.Date()"
        case _ => c.COLUMN_NAME
      } ).map(c => if (c.equals(pkFieldList)) "this." + pkFieldList else c).mkString(",");
      val modifyHeaderDef = "\n   def modify(" + createNewParams + ") : " + dtoClassName + " = {";
      val modifyCreateNewDef = "    val dtoModified = new " + dtoClassName + "(" + modifyParamsList + ");";
      val modifyDef =  if (isTable) modifyHeaderDef + "\n" + modifyCreateNewDef +  "\n    dtoModified\n  }" else "";
      val allDefsList = tableNameDef + fieldsDef + pkFields + fkFields + nameField + getPkMethod + getInsertedRowDateMethod +getLastUpdatedDateMethod + getGuidMethod + toAnyArray + toStringArray + getFieldValueMethodBody + getFieldNameeMethodBody + prepareInsertMethod + modifyDef + "\n";
      val fieldsCaseClassDefinitions = cols.filter(c => c.TABLE_NAME.equals(tableName)).map(col => "val " + col.COLUMN_NAME + " : " + col.SCALA_TYPE).mkString("\n     , ");
      val caseClassDef = "case class " + dtoClassName + " ( \n     " + fieldsCaseClassDefinitions + " \n     ) extends " + baseDtoClassName + " { " + allDefsList + " } ";
      val objectFieldsDef =allFieldsForDto.map(c => "   val FIELD_" + c.COLUMN_NAME + " = \"" + c.COLUMN_NAME + "\";").mkString("\n");

      val objectCreateNewDef = if (isTable) "\n  def createNew" + dtoClassName + "(" + createNewParams + ") : " + dtoClassName + " = {  \n     val dto = new " + dtoClassName + "(" + insertParamsList + ")   \n    dto \n  } \n" else "";
      val objectClassDef = "\nobject "+ dtoClassName + " { \n  val TABLE_NAME = \"" + tableName + "\"; \n" + objectFieldsDef + "\n" + objectCreateNewDef + "\n}\n\n";
      val totalDtoDef = caseClassDef + objectClassDef;
      println(totalDtoDef)
    });
    connmssql.close();
  }

}

