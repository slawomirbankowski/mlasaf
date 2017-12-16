/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf

import anorm.SQL
import com.mlasaf.dto.ColumnDetailDto

object GenerateDaoEntry {

  def main(args : Array[String]) = {
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    implicit val connmssql = java.sql.DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS2014;DatabaseName=mlasaf05", "sa", "sapass");
    val cols : List[ColumnDetailDto]=  SQL("select TABLE_NAME, COLUMN_NAME, ORDINAL_POSITION, case DATA_TYPE when 'bigint' then 'Long' when 'int' then 'Int' when 'nvarchar' then 'String' when 'datetime' then 'java.util.Date' when 'float' then 'Double'  else '' end as SCALA_TYPE from INFORMATION_SCHEMA.COLUMNS")
      .as(anorm.Macro.namedParser[ColumnDetailDto].*);
    val pkCols : List[ColumnDetailDto] =  SQL(" select TABLE_NAME, COLUMN_NAME, ORDINAL_POSITION, '' as SCALA_TYPE from INFORMATION_SCHEMA.KEY_COLUMN_USAGE where CONSTRAINT_NAME like 'PK%'")
      .as(anorm.Macro.namedParser[ColumnDetailDto].*);
    val fkCols : List[ColumnDetailDto] =  SQL(" select TABLE_NAME, COLUMN_NAME, ORDINAL_POSITION, '' as SCALA_TYPE from INFORMATION_SCHEMA.KEY_COLUMN_USAGE where CONSTRAINT_NAME like 'FK%'")
      .as(anorm.Macro.namedParser[ColumnDetailDto].*);


    cols.map(x => x.TABLE_NAME).distinct.sorted.foreach( tableName => {
      val objName = tableName.charAt(0).toUpper + tableName.substring(1);
      val dtoName = objName + "Dto";
      val daoClassName = objName + "Dao";
      println("");
      println("");
      println(" class " + daoClassName + " extends DaoBase { ");
      val fieldList = cols.filter(c => c.TABLE_NAME.equals(tableName)).map(col => col.COLUMN_NAME).mkString(",");
      val pkFieldList = pkCols.filter(c => c.TABLE_NAME.equals(tableName)).map(col => col.COLUMN_NAME).mkString(",");
      val fkFieldList = fkCols.filter(c => c.TABLE_NAME.equals(tableName)).map(col => col.COLUMN_NAME).mkString(",");
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
           |  def get${objName}First() : ${dtoName} = {
           |   implicit val connection = getConnection();
           |   val dtos : ${dtoName}= SQL("select * from ${tableName} order by insertedRowDate asc ").as(anorm.Macro.namedParser[${dtoName}].single);
           |   dtos
           |  }
           |  def get${objName}Last() : ${dtoName} = {
           |   implicit val connection = getConnection();
           |   val dtos : ${dtoName}= SQL("select * from ${tableName} order by insertedRowDate desc ").as(anorm.Macro.namedParser[${dtoName}].single);
           |   dtos
           |  }   """.stripMargin
      println(daoMethodsBasic);
      val daoMethods : java.lang.StringBuilder = new java.lang.StringBuilder();
      if (pkCols.filter(c => c.TABLE_NAME.equals(tableName)).size == 1) {
        val pkColName= pkCols.filter(c => c.TABLE_NAME.equals(tableName)).head.COLUMN_NAME;
        val pkColNameUppper = pkColName.charAt(0).toUpper + pkColName.substring(1);
        daoMethods.append(" def get" + objName + "ByPk(pkColValue : Long) : List[" + dtoName + "] = { \n")
        daoMethods.append("   implicit val connection = getConnection();  \n");
        daoMethods.append("   val dtos : List[" + dtoName + "] = SQL(\"select * from " + tableName + " where " + pkColName + " = {pkColValue} \").as(anorm.Macro.namedParser[" + dtoName + "].*);  \n");
        daoMethods.append("   dtos  \n");
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
          daoMethods.append("   val dtos : List[" + dtoName + "] = SQL(\"select * from " + tableName + " where " + pkColName + " = {pkColValue} \").as(anorm.Macro.namedParser[" + dtoName + "].*);  \n");
          daoMethods.append("   dtos  \n");
          daoMethods.append(" }  \n");
        });
      }
      fkCols.filter(c => c.TABLE_NAME.equals(tableName)).map(col => col.COLUMN_NAME).foreach(fkColName => {
        val fkColNameUppper = fkColName.charAt(0).toUpper + fkColName.substring(1);
        daoMethods.append(" def get" + objName + "ByFk" + fkColNameUppper + "(fkColValue : Long) : List[" + dtoName + "] = { \n")
        daoMethods.append("   implicit val connection = getConnection();  \n");
        daoMethods.append("   val dtos : List[" + dtoName + "] = SQL(\"select * from " + tableName + " where " + fkColName + " = {fkColValue} \").as(anorm.Macro.namedParser[" + dtoName + "].*);  \n");
        daoMethods.append("   dtos  \n");
        daoMethods.append(" }  \n");
      });
      println(daoMethods.toString);
      println("} ");



    });

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


    //val exeTypes : List[ExecutorTypeDto]= SQL("select * from executorType").as(anorm.Macro.namedParser[ExecutorTypeDto].*);
    //println("Got exeTypes: " + exeTypes.size + ", List: " + exeTypes.mkString(", "))
    //connmssql.createStatement().executeQuery("select * from INFORMATION_SCHEMA.TABLES");
    connmssql.close();
    println(" MSSQLSERVER - DISCONNECTED ")
  }
}
