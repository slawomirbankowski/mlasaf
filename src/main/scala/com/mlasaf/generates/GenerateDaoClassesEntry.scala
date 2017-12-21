package com.mlasaf.generates

import anorm.SQL
import com.mlasaf.dto.ColumnDetailDto

object GenerateDaoClassesEntry {

  def main(args : Array[String]) = {
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    implicit val connmssql = java.sql.DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS2014;DatabaseName=mlasaf16", "sa", "sapass");
    val cols : List[ColumnDetailDto]=  SQL("select TABLE_NAME, COLUMN_NAME, ORDINAL_POSITION, case DATA_TYPE when 'bigint' then 'Long' when 'int' then 'Int' when 'nvarchar' then 'String' when 'datetime' then 'java.util.Date' when 'float' then 'Double'  else '' end as SCALA_TYPE from INFORMATION_SCHEMA.COLUMNS where TABLE_NAME not like 'DATABASE%'")
      .as(anorm.Macro.namedParser[ColumnDetailDto].*);
    val pkCols : List[ColumnDetailDto] =  SQL(" select TABLE_NAME, COLUMN_NAME, ORDINAL_POSITION, '' as SCALA_TYPE from INFORMATION_SCHEMA.KEY_COLUMN_USAGE where CONSTRAINT_NAME like 'PK%' and TABLE_NAME not like 'DATABASE%'")
      .as(anorm.Macro.namedParser[ColumnDetailDto].*);
    val fkCols : List[ColumnDetailDto] =  SQL(" select TABLE_NAME, COLUMN_NAME, ORDINAL_POSITION, '' as SCALA_TYPE from INFORMATION_SCHEMA.KEY_COLUMN_USAGE where CONSTRAINT_NAME like 'FK%' and TABLE_NAME not like 'DATABASE%'")
      .as(anorm.Macro.namedParser[ColumnDetailDto].*);
    cols.map(x => x.TABLE_NAME).distinct.sorted.foreach( tableName => {
      val isTable = !tableName.startsWith("v");
      val objName = tableName.charAt(0).toUpper + tableName.substring(1);
      val dtoName = objName + "Dto";
      val daoClassName = objName + "Dao";
      println("");
      println("");
      println(" class " + daoClassName + " extends DaoBase { ");
      val allFieldsForDao = cols.filter(c => c.TABLE_NAME.equals(tableName));
      val fieldList = allFieldsForDao.map(col => col.COLUMN_NAME).mkString(",");
      val pkFieldList = pkCols.filter(c => c.TABLE_NAME.equals(tableName)).map(col => col.COLUMN_NAME).mkString(",");
      val fkFieldList = fkCols.filter(c => c.TABLE_NAME.equals(tableName)).map(col => col.COLUMN_NAME).mkString(",");
      val nameCol = allFieldsForDao.filter(c => c.COLUMN_NAME.equals(c.TABLE_NAME + "Name")).map(c => c.COLUMN_NAME);
      val allTableFields = allFieldsForDao.map(col => col.COLUMN_NAME);
      val primaryKeyFields = pkCols.filter(c => c.TABLE_NAME.equals(tableName)).map(col => col.COLUMN_NAME);
      val allTableCols = cols.filter(c => c.TABLE_NAME.equals(tableName));
      val daoMethodsBasic =
        s"""
           |  def get${objName}sList() : List[${dtoName}] = {
           |   implicit val connection = getConnection();
           |   val dtos : List[${dtoName}]= SQL("select * from ${tableName}").as(anorm.Macro.namedParser[${dtoName}].*);
           |   dtos
           |  }
           |  def get${objName}sCount() : Long = {
           |   implicit val connection = getConnection();
           |   val cnt : Long = SQL("select count(*) as cnt from ${tableName}").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
           |   cnt
           |  }
           |  def get${objName}sLastInsertDate() : java.util.Date = {
           |   implicit val connection = getConnection();
           |   val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from ${tableName}").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
           |   ld
           |  }
           |  def get${objName}sLastUpdatedDate() : java.util.Date = {
           |   implicit val connection = getConnection();
           |   val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from ${tableName}").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
           |   ld
           |  }
           |  def get${objName}First() : ${dtoName} = {
           |   implicit val connection = getConnection();
           |   val dtos : ${dtoName}= SQL("select * from ${tableName} order by insertedRowDate asc ").as(anorm.Macro.namedParser[${dtoName}].*).head;
           |   dtos
           |  }
           |  def get${objName}Last() : ${dtoName} = {
           |   implicit val connection = getConnection();
           |   val dtos : ${dtoName}= SQL("select * from ${tableName} order by insertedRowDate desc ").as(anorm.Macro.namedParser[${dtoName}].*).head;
           |   dtos
           |  }
           |  def get${objName}ByGuid(guid : Long) : ${dtoName} = {
           |   implicit val connection = getConnection();
           |   val dtos : ${dtoName}= SQL("select * from ${tableName} where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[${dtoName}].single);
           |   dtos
           |  }  """.stripMargin
      println(daoMethodsBasic);
      val daoMethods : java.lang.StringBuilder = new java.lang.StringBuilder();
      if (pkCols.filter(c => c.TABLE_NAME.equals(tableName)).size == 0) {

      } else if (pkCols.filter(c => c.TABLE_NAME.equals(tableName)).size == 1) {
        val pkColName= pkCols.filter(c => c.TABLE_NAME.equals(tableName)).head.COLUMN_NAME;
        val pkColNameUppper = pkColName.charAt(0).toUpper + pkColName.substring(1);


        daoMethods.append(" def get" + objName + "ByPk(pkColValue : Long) : " + dtoName + " = { \n")
        daoMethods.append("   implicit val connection = getConnection();  \n");
        daoMethods.append("   val dto : " + dtoName + " = SQL(\"select * from " + tableName + " where " + pkColName + " = {pkColValue} \").on(\"pkColValue\" -> pkColValue).as(anorm.Macro.namedParser[" + dtoName + "].single);  \n");
        daoMethods.append("   dto  \n");
        daoMethods.append(" }  \n");

        daoMethods.append(" def get" + objName + "MaxId() : Long = { \n")
        daoMethods.append("   implicit val connection = getConnection();  \n");
        daoMethods.append("   val maxid : Long = SQL(\"select max(" + pkColName + ") as maxId from " + tableName + " \").executeQuery()(connection).as[Long](SqlParser.long(\"maxId\").single)(connection);;  \n");
        daoMethods.append("   maxid  \n");
        daoMethods.append(" }  \n");
      } else {
        pkCols.filter(c => c.TABLE_NAME.equals(tableName)).map(col => col.COLUMN_NAME).foreach(pkColName => {
          val pkColNameUppper = pkColName.charAt(0).toUpper + pkColName.substring(1);
          daoMethods.append(" def get" + objName + "ByPk" + pkColNameUppper + "(pkColValue : Long) : List[" + dtoName + "] = { \n")
          daoMethods.append("   implicit val connection = getConnection();  \n");
          daoMethods.append("   val dtos : List[" + dtoName + "] = SQL(\"select * from " + tableName + " where " + pkColName + " = {pkColValue} \").on(\"pkColValue\" -> pkColValue).as(anorm.Macro.namedParser[" + dtoName + "].*);  \n");
          daoMethods.append("   dtos  \n");
          daoMethods.append(" }  \n");
        });
      }

      fkCols.filter(c => c.TABLE_NAME.equals(tableName)).map(col => col.COLUMN_NAME).foreach(fkColName => {
        val fkColNameUppper = fkColName.charAt(0).toUpper + fkColName.substring(1);
        daoMethods.append(" def get" + objName + "ByFk" + fkColNameUppper + "(fkColValue : Long) : List[" + dtoName + "] = { \n")
        daoMethods.append("   implicit val connection = getConnection();  \n");
        daoMethods.append("   val dtos : List[" + dtoName + "] = SQL(\"select * from " + tableName + " where " + fkColName + " = {fkColValue} \").on(\"fkColValue\" -> fkColValue).as(anorm.Macro.namedParser[" + dtoName + "].*);  \n");
        daoMethods.append("   dtos  \n");
        daoMethods.append(" }  \n");
      });
      if (nameCol.size == 1) {
        daoMethods.append(" def get" + objName + "ByName(nameColValue : String) : List[" + dtoName + "] = { \n")
        daoMethods.append("   implicit val connection = getConnection();  \n");
        daoMethods.append("   val dtos : List[" + dtoName + "] = SQL(\"select * from " + tableName + " where " + nameCol.head + " = {nameColValue} \").on(\"nameColValue\" -> nameColValue).as(anorm.Macro.namedParser[" + dtoName + "].*);  \n");
        daoMethods.append("   dtos  \n");
        daoMethods.append(" }  \n");
        daoMethods.append(" def get" + objName + "FirstByName(nameColValue : String) : Option[" + dtoName + "] = { \n")
        daoMethods.append("   implicit val connection = getConnection();  \n");
        daoMethods.append("   val dtos : List[" + dtoName + "] = SQL(\"select * from " + tableName + " where " + nameCol.head + " = {nameColValue} \").on(\"nameColValue\" -> nameColValue).as(anorm.Macro.namedParser[" + dtoName + "].*);  \n");
        daoMethods.append("   if (dtos.size > 0) Some(dtos.head) else None  \n");
        daoMethods.append(" }  \n");
      }
      if (!isTable) {
        allTableCols.foreach(colBy => {
          val colByUpper = colBy.COLUMN_NAME.charAt(0).toUpper + colBy.COLUMN_NAME.substring(1);
          daoMethods.append(" def getDtosBy" + colByUpper + "(colValue : " + colBy.SCALA_TYPE + ") : List[" + dtoName + "] = { \n")
          daoMethods.append("   implicit val connection = getConnection();  \n");
          daoMethods.append("   val dtos : List[" + dtoName + "] = SQL(\"select * from " + tableName + " where " + colBy.COLUMN_NAME + " = {colValue} \").on(\"colValue\" -> colValue).as(anorm.Macro.namedParser[" + dtoName + "].*);  \n");
          daoMethods.append("   dtos  \n");
          daoMethods.append(" }  \n");
        })
      }
      if (isTable) {
        val createNewParams = allFieldsForDao
          .filter(c => !c.COLUMN_NAME.equals("guid") && !c.COLUMN_NAME.equals("insertedRowDate") && !c.COLUMN_NAME.equals("lastUpdatedDate") && !c.COLUMN_NAME.equals(pkFieldList))
          .map(c => "" + c.COLUMN_NAME + " : " + c.SCALA_TYPE).mkString(", ");
        val insertParamsList = allFieldsForDao.map(c => c.COLUMN_NAME match {
          case "guid" => "0"
          case "insertedRowDate" => "new Date()"
          case "lastUpdatedDate" => "new Date()"
          case _ => c.COLUMN_NAME
        } ).map(c => if (c.equals(pkFieldList)) "0" else c).mkString(",");

        daoMethods.append(" def insert" + dtoName + "(dto : " + dtoName + "): " + dtoName + " = { \n");
        daoMethods.append("    implicit val connection = getConnection(); \n");
        daoMethods.append("    val stat = dto.prepareInsert(getConnection()); \n");
        daoMethods.append("    val resCnt = stat.executeUpdate(); \n");
        daoMethods.append("    val rs = stat.getGeneratedKeys(); \n");
        daoMethods.append("    if (rs.next()) { \n");
        daoMethods.append("      val pkValue = rs.getLong(1); \n");
        daoMethods.append("      SQL(\"select * from " + tableName + " where " + pkFieldList + " = {pkValue} \").on(\"pkValue\" -> pkValue).as(anorm.Macro.namedParser[" + dtoName + "].single); \n");
        daoMethods.append("    } else { \n");
        daoMethods.append("      null; \n");
        daoMethods.append("    } \n");
        daoMethods.append(" } \n");

        daoMethods.append("  def createAndInsert" + dtoName + "(" + createNewParams + ") : " + dtoName + " = {\n");
        daoMethods.append("    val dto = new " + dtoName + "(" + insertParamsList + ")\n");
        daoMethods.append("    insert" + dtoName + "(dto);   \n");
        daoMethods.append("  }   \n");

        var updateFieldList = allTableFields.filter(c => !primaryKeyFields.contains(c) && !c.equals("insertedRowDate") && !c.equals("guid"));
        var updateSetDefinition = updateFieldList.map(c => " " + c + " = {" + c + "} ").mkString(", ");
        var updateWhereDefinition = " " + pkFieldList + " = {" + pkFieldList + "}";
        var updateOnDefinition = updateFieldList.map(c => "\"" + c + "\" -> dto." + c).mkString(" , ") + ", \"" + pkFieldList + "\" -> dto." + pkFieldList + " ";

        daoMethods.append("  def update" + dtoName + "(dto : " + dtoName + "): " + dtoName + " = {  \n");
        daoMethods.append("    implicit val connection = getConnection();  \n");
        daoMethods.append("      val resCnt = SQL(\"update " + tableName + " set " + updateSetDefinition + " where " + updateWhereDefinition + "  \")\n");
        daoMethods.append("      .on(" + updateOnDefinition + ").executeInsert() \n");
        daoMethods.append("     get" + objName + "ByPk(dto." + pkFieldList + ") \n");
        daoMethods.append("    } \n");
      }

      println(daoMethods.toString);
      println("} ");
    });
    connmssql.close();
  }
}