/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.dao

import java.sql._
import anorm._
import com.mlasaf.dto._
import com.mlasaf.utils._
import org.apache.commons.dbcp._
//import com.lucidchart.relate._
import java.sql.Connection


class AlgorithmColumnTypeDao extends DaoBase {

  def getAlgorithmColumnTypesList() : List[AlgorithmColumnTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmColumnTypeDto]= SQL("select * from algorithmColumnType").as(anorm.Macro.namedParser[AlgorithmColumnTypeDto].*);
    dtos
  }
  def getAlgorithmColumnTypesCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from algorithmColumnType").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getAlgorithmColumnTypesLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from algorithmColumnType").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getAlgorithmColumnTypesLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from algorithmColumnType").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getAlgorithmColumnTypeFirst() : AlgorithmColumnTypeDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmColumnTypeDto= SQL("select * from algorithmColumnType order by insertedRowDate asc ").as(anorm.Macro.namedParser[AlgorithmColumnTypeDto].single);
    dtos
  }
  def getAlgorithmColumnTypeLast() : AlgorithmColumnTypeDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmColumnTypeDto= SQL("select * from algorithmColumnType order by insertedRowDate desc ").as(anorm.Macro.namedParser[AlgorithmColumnTypeDto].single);
    dtos
  }
  def getAlgorithmColumnTypeByGuid(guid : Long) : AlgorithmColumnTypeDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmColumnTypeDto= SQL("select * from algorithmColumnType where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[AlgorithmColumnTypeDto].single);
    dtos
  }
  def getAlgorithmColumnTypeByPk(pkColValue : Long) : List[AlgorithmColumnTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmColumnTypeDto] = SQL("select * from algorithmColumnType where algorithmColumnTypeId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[AlgorithmColumnTypeDto].*);
    dtos
  }
  def getAlgorithmColumnTypeMaxId() : Long = {
    implicit val connection = getConnection();
    val maxid : Long = SQL("select max(algorithmColumnTypeId) as maxId from algorithmColumnType ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;
    maxid
  }
  def getAlgorithmColumnTypeByName(nameColValue : String) : List[AlgorithmColumnTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmColumnTypeDto] = SQL("select * from algorithmColumnType where algorithmColumnTypeName = {nameColValue} ").on("nameColValue" -> nameColValue).as(anorm.Macro.namedParser[AlgorithmColumnTypeDto].*);
    dtos
  }
  def getAlgorithmColumnTypeFirstByName(nameColValue : String) : Option[AlgorithmColumnTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmColumnTypeDto] = SQL("select * from algorithmColumnType where algorithmColumnTypeName = {nameColValue} ").on("nameColValue" -> nameColValue).as(anorm.Macro.namedParser[AlgorithmColumnTypeDto].*);
    if (dtos.size > 0) Some(dtos.head) else None
  }

}


class AlgorithmImplementationDao extends DaoBase {

  def getAlgorithmImplementationsList() : List[AlgorithmImplementationDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmImplementationDto]= SQL("select * from algorithmImplementation").as(anorm.Macro.namedParser[AlgorithmImplementationDto].*);
    dtos
  }
  def getAlgorithmImplementationsCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from algorithmImplementation").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getAlgorithmImplementationsLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from algorithmImplementation").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getAlgorithmImplementationsLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from algorithmImplementation").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getAlgorithmImplementationFirst() : AlgorithmImplementationDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmImplementationDto= SQL("select * from algorithmImplementation order by insertedRowDate asc ").as(anorm.Macro.namedParser[AlgorithmImplementationDto].single);
    dtos
  }
  def getAlgorithmImplementationLast() : AlgorithmImplementationDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmImplementationDto= SQL("select * from algorithmImplementation order by insertedRowDate desc ").as(anorm.Macro.namedParser[AlgorithmImplementationDto].single);
    dtos
  }
  def getAlgorithmImplementationByGuid(guid : Long) : AlgorithmImplementationDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmImplementationDto= SQL("select * from algorithmImplementation where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[AlgorithmImplementationDto].single);
    dtos
  }
  def getAlgorithmImplementationByPk(pkColValue : Long) : List[AlgorithmImplementationDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmImplementationDto] = SQL("select * from algorithmImplementation where algorithmImplementationId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[AlgorithmImplementationDto].*);
    dtos
  }
  def getAlgorithmImplementationMaxId() : Long = {
    implicit val connection = getConnection();
    val maxid : Long = SQL("select max(algorithmImplementationId) as maxId from algorithmImplementation ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;
    maxid
  }
  def getAlgorithmImplementationByFkAlgorithmTypeVersionId(fkColValue : Long) : List[AlgorithmImplementationDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmImplementationDto] = SQL("select * from algorithmImplementation where algorithmTypeVersionId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[AlgorithmImplementationDto].*);
    dtos
  }
  def getAlgorithmImplementationByFkExecutorTypeId(fkColValue : Long) : List[AlgorithmImplementationDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmImplementationDto] = SQL("select * from algorithmImplementation where executorTypeId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[AlgorithmImplementationDto].*);
    dtos
  }
  def getAlgorithmImplementationByName(nameColValue : String) : List[AlgorithmImplementationDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmImplementationDto] = SQL("select * from algorithmImplementation where algorithmImplementationName = {nameColValue} ").on("nameColValue" -> nameColValue).as(anorm.Macro.namedParser[AlgorithmImplementationDto].*);
    dtos
  }
  def getAlgorithmImplementationFirstByName(nameColValue : String) : Option[AlgorithmImplementationDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmImplementationDto] = SQL("select * from algorithmImplementation where algorithmImplementationName = {nameColValue} ").on("nameColValue" -> nameColValue).as(anorm.Macro.namedParser[AlgorithmImplementationDto].*);
    if (dtos.size > 0) Some(dtos.head) else None
  }

}


class AlgorithmOutputDao extends DaoBase {

  def getAlgorithmOutputsList() : List[AlgorithmOutputDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmOutputDto]= SQL("select * from algorithmOutput").as(anorm.Macro.namedParser[AlgorithmOutputDto].*);
    dtos
  }
  def getAlgorithmOutputsCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from algorithmOutput").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getAlgorithmOutputsLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from algorithmOutput").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getAlgorithmOutputsLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from algorithmOutput").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getAlgorithmOutputFirst() : AlgorithmOutputDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmOutputDto= SQL("select * from algorithmOutput order by insertedRowDate asc ").as(anorm.Macro.namedParser[AlgorithmOutputDto].single);
    dtos
  }
  def getAlgorithmOutputLast() : AlgorithmOutputDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmOutputDto= SQL("select * from algorithmOutput order by insertedRowDate desc ").as(anorm.Macro.namedParser[AlgorithmOutputDto].single);
    dtos
  }
  def getAlgorithmOutputByGuid(guid : Long) : AlgorithmOutputDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmOutputDto= SQL("select * from algorithmOutput where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[AlgorithmOutputDto].single);
    dtos
  }
  def getAlgorithmOutputByPk(pkColValue : Long) : List[AlgorithmOutputDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmOutputDto] = SQL("select * from algorithmOutput where algorithmOutputId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[AlgorithmOutputDto].*);
    dtos
  }
  def getAlgorithmOutputMaxId() : Long = {
    implicit val connection = getConnection();
    val maxid : Long = SQL("select max(algorithmOutputId) as maxId from algorithmOutput ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;
    maxid
  }

}


class AlgorithmOutputTypeDao extends DaoBase {

  def getAlgorithmOutputTypesList() : List[AlgorithmOutputTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmOutputTypeDto]= SQL("select * from algorithmOutputType").as(anorm.Macro.namedParser[AlgorithmOutputTypeDto].*);
    dtos
  }
  def getAlgorithmOutputTypesCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from algorithmOutputType").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getAlgorithmOutputTypesLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from algorithmOutputType").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getAlgorithmOutputTypesLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from algorithmOutputType").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getAlgorithmOutputTypeFirst() : AlgorithmOutputTypeDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmOutputTypeDto= SQL("select * from algorithmOutputType order by insertedRowDate asc ").as(anorm.Macro.namedParser[AlgorithmOutputTypeDto].single);
    dtos
  }
  def getAlgorithmOutputTypeLast() : AlgorithmOutputTypeDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmOutputTypeDto= SQL("select * from algorithmOutputType order by insertedRowDate desc ").as(anorm.Macro.namedParser[AlgorithmOutputTypeDto].single);
    dtos
  }
  def getAlgorithmOutputTypeByGuid(guid : Long) : AlgorithmOutputTypeDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmOutputTypeDto= SQL("select * from algorithmOutputType where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[AlgorithmOutputTypeDto].single);
    dtos
  }
  def getAlgorithmOutputTypeByPk(pkColValue : Long) : List[AlgorithmOutputTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmOutputTypeDto] = SQL("select * from algorithmOutputType where algorithmOutputTypeId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[AlgorithmOutputTypeDto].*);
    dtos
  }
  def getAlgorithmOutputTypeMaxId() : Long = {
    implicit val connection = getConnection();
    val maxid : Long = SQL("select max(algorithmOutputTypeId) as maxId from algorithmOutputType ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;
    maxid
  }
  def getAlgorithmOutputTypeByName(nameColValue : String) : List[AlgorithmOutputTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmOutputTypeDto] = SQL("select * from algorithmOutputType where algorithmOutputTypeName = {nameColValue} ").on("nameColValue" -> nameColValue).as(anorm.Macro.namedParser[AlgorithmOutputTypeDto].*);
    dtos
  }
  def getAlgorithmOutputTypeFirstByName(nameColValue : String) : Option[AlgorithmOutputTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmOutputTypeDto] = SQL("select * from algorithmOutputType where algorithmOutputTypeName = {nameColValue} ").on("nameColValue" -> nameColValue).as(anorm.Macro.namedParser[AlgorithmOutputTypeDto].*);
    if (dtos.size > 0) Some(dtos.head) else None
  }

}


class AlgorithmParamDao extends DaoBase {

  def getAlgorithmParamsList() : List[AlgorithmParamDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmParamDto]= SQL("select * from algorithmParam").as(anorm.Macro.namedParser[AlgorithmParamDto].*);
    dtos
  }
  def getAlgorithmParamsCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from algorithmParam").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getAlgorithmParamsLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from algorithmParam").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getAlgorithmParamsLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from algorithmParam").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getAlgorithmParamFirst() : AlgorithmParamDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmParamDto= SQL("select * from algorithmParam order by insertedRowDate asc ").as(anorm.Macro.namedParser[AlgorithmParamDto].single);
    dtos
  }
  def getAlgorithmParamLast() : AlgorithmParamDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmParamDto= SQL("select * from algorithmParam order by insertedRowDate desc ").as(anorm.Macro.namedParser[AlgorithmParamDto].single);
    dtos
  }
  def getAlgorithmParamByGuid(guid : Long) : AlgorithmParamDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmParamDto= SQL("select * from algorithmParam where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[AlgorithmParamDto].single);
    dtos
  }
  def getAlgorithmParamByPk(pkColValue : Long) : List[AlgorithmParamDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmParamDto] = SQL("select * from algorithmParam where algorithmParamId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[AlgorithmParamDto].*);
    dtos
  }
  def getAlgorithmParamMaxId() : Long = {
    implicit val connection = getConnection();
    val maxid : Long = SQL("select max(algorithmParamId) as maxId from algorithmParam ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;
    maxid
  }
  def getAlgorithmParamByName(nameColValue : String) : List[AlgorithmParamDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmParamDto] = SQL("select * from algorithmParam where algorithmParamName = {nameColValue} ").on("nameColValue" -> nameColValue).as(anorm.Macro.namedParser[AlgorithmParamDto].*);
    dtos
  }
  def getAlgorithmParamFirstByName(nameColValue : String) : Option[AlgorithmParamDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmParamDto] = SQL("select * from algorithmParam where algorithmParamName = {nameColValue} ").on("nameColValue" -> nameColValue).as(anorm.Macro.namedParser[AlgorithmParamDto].*);
    if (dtos.size > 0) Some(dtos.head) else None
  }

}


class AlgorithmParamTypeDao extends DaoBase {

  def getAlgorithmParamTypesList() : List[AlgorithmParamTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmParamTypeDto]= SQL("select * from algorithmParamType").as(anorm.Macro.namedParser[AlgorithmParamTypeDto].*);
    dtos
  }
  def getAlgorithmParamTypesCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from algorithmParamType").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getAlgorithmParamTypesLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from algorithmParamType").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getAlgorithmParamTypesLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from algorithmParamType").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getAlgorithmParamTypeFirst() : AlgorithmParamTypeDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmParamTypeDto= SQL("select * from algorithmParamType order by insertedRowDate asc ").as(anorm.Macro.namedParser[AlgorithmParamTypeDto].single);
    dtos
  }
  def getAlgorithmParamTypeLast() : AlgorithmParamTypeDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmParamTypeDto= SQL("select * from algorithmParamType order by insertedRowDate desc ").as(anorm.Macro.namedParser[AlgorithmParamTypeDto].single);
    dtos
  }
  def getAlgorithmParamTypeByGuid(guid : Long) : AlgorithmParamTypeDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmParamTypeDto= SQL("select * from algorithmParamType where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[AlgorithmParamTypeDto].single);
    dtos
  }
  def getAlgorithmParamTypeByPk(pkColValue : Long) : List[AlgorithmParamTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmParamTypeDto] = SQL("select * from algorithmParamType where algorithmParamTypeId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[AlgorithmParamTypeDto].*);
    dtos
  }
  def getAlgorithmParamTypeMaxId() : Long = {
    implicit val connection = getConnection();
    val maxid : Long = SQL("select max(algorithmParamTypeId) as maxId from algorithmParamType ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;
    maxid
  }
  def getAlgorithmParamTypeByFkAlgorithmParamId(fkColValue : Long) : List[AlgorithmParamTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmParamTypeDto] = SQL("select * from algorithmParamType where algorithmParamId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[AlgorithmParamTypeDto].*);
    dtos
  }
  def getAlgorithmParamTypeByFkAlgorithmTypeId(fkColValue : Long) : List[AlgorithmParamTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmParamTypeDto] = SQL("select * from algorithmParamType where algorithmTypeId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[AlgorithmParamTypeDto].*);
    dtos
  }
  def getAlgorithmParamTypeByFkAlgorithmTypeVersionId(fkColValue : Long) : List[AlgorithmParamTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmParamTypeDto] = SQL("select * from algorithmParamType where algorithmTypeVersionId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[AlgorithmParamTypeDto].*);
    dtos
  }

}


class AlgorithmRunDao extends DaoBase {

  def getAlgorithmRunsList() : List[AlgorithmRunDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmRunDto]= SQL("select * from algorithmRun").as(anorm.Macro.namedParser[AlgorithmRunDto].*);
    dtos
  }
  def getAlgorithmRunsCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from algorithmRun").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getAlgorithmRunsLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from algorithmRun").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getAlgorithmRunsLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from algorithmRun").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getAlgorithmRunFirst() : AlgorithmRunDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmRunDto= SQL("select * from algorithmRun order by insertedRowDate asc ").as(anorm.Macro.namedParser[AlgorithmRunDto].single);
    dtos
  }
  def getAlgorithmRunLast() : AlgorithmRunDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmRunDto= SQL("select * from algorithmRun order by insertedRowDate desc ").as(anorm.Macro.namedParser[AlgorithmRunDto].single);
    dtos
  }
  def getAlgorithmRunByGuid(guid : Long) : AlgorithmRunDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmRunDto= SQL("select * from algorithmRun where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[AlgorithmRunDto].single);
    dtos
  }
  def getAlgorithmRunByPk(pkColValue : Long) : List[AlgorithmRunDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmRunDto] = SQL("select * from algorithmRun where algorithmRunId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[AlgorithmRunDto].*);
    dtos
  }
  def getAlgorithmRunMaxId() : Long = {
    implicit val connection = getConnection();
    val maxid : Long = SQL("select max(algorithmRunId) as maxId from algorithmRun ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;
    maxid
  }
  def getAlgorithmRunByFkAlgorithmScheduleId(fkColValue : Long) : List[AlgorithmRunDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmRunDto] = SQL("select * from algorithmRun where algorithmScheduleId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[AlgorithmRunDto].*);
    dtos
  }
  def getAlgorithmRunByFkExecutorInstanceId(fkColValue : Long) : List[AlgorithmRunDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmRunDto] = SQL("select * from algorithmRun where executorInstanceId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[AlgorithmRunDto].*);
    dtos
  }
  def getAlgorithmRunByFkExecutorStorageId(fkColValue : Long) : List[AlgorithmRunDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmRunDto] = SQL("select * from algorithmRun where executorStorageId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[AlgorithmRunDto].*);
    dtos
  }
  def getAlgorithmRunByName(nameColValue : String) : List[AlgorithmRunDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmRunDto] = SQL("select * from algorithmRun where algorithmRunName = {nameColValue} ").on("nameColValue" -> nameColValue).as(anorm.Macro.namedParser[AlgorithmRunDto].*);
    dtos
  }
  def getAlgorithmRunFirstByName(nameColValue : String) : Option[AlgorithmRunDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmRunDto] = SQL("select * from algorithmRun where algorithmRunName = {nameColValue} ").on("nameColValue" -> nameColValue).as(anorm.Macro.namedParser[AlgorithmRunDto].*);
    if (dtos.size > 0) Some(dtos.head) else None
  }

}


class AlgorithmRunTypeDao extends DaoBase {

  def getAlgorithmRunTypesList() : List[AlgorithmRunTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmRunTypeDto]= SQL("select * from algorithmRunType").as(anorm.Macro.namedParser[AlgorithmRunTypeDto].*);
    dtos
  }
  def getAlgorithmRunTypesCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from algorithmRunType").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getAlgorithmRunTypesLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from algorithmRunType").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getAlgorithmRunTypesLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from algorithmRunType").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getAlgorithmRunTypeFirst() : AlgorithmRunTypeDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmRunTypeDto= SQL("select * from algorithmRunType order by insertedRowDate asc ").as(anorm.Macro.namedParser[AlgorithmRunTypeDto].single);
    dtos
  }
  def getAlgorithmRunTypeLast() : AlgorithmRunTypeDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmRunTypeDto= SQL("select * from algorithmRunType order by insertedRowDate desc ").as(anorm.Macro.namedParser[AlgorithmRunTypeDto].single);
    dtos
  }
  def getAlgorithmRunTypeByGuid(guid : Long) : AlgorithmRunTypeDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmRunTypeDto= SQL("select * from algorithmRunType where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[AlgorithmRunTypeDto].single);
    dtos
  }
  def getAlgorithmRunTypeByPk(pkColValue : Long) : List[AlgorithmRunTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmRunTypeDto] = SQL("select * from algorithmRunType where algorithmRunTypeId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[AlgorithmRunTypeDto].*);
    dtos
  }
  def getAlgorithmRunTypeMaxId() : Long = {
    implicit val connection = getConnection();
    val maxid : Long = SQL("select max(algorithmRunTypeId) as maxId from algorithmRunType ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;
    maxid
  }
  def getAlgorithmRunTypeByName(nameColValue : String) : List[AlgorithmRunTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmRunTypeDto] = SQL("select * from algorithmRunType where algorithmRunTypeName = {nameColValue} ").on("nameColValue" -> nameColValue).as(anorm.Macro.namedParser[AlgorithmRunTypeDto].*);
    dtos
  }
  def getAlgorithmRunTypeFirstByName(nameColValue : String) : Option[AlgorithmRunTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmRunTypeDto] = SQL("select * from algorithmRunType where algorithmRunTypeName = {nameColValue} ").on("nameColValue" -> nameColValue).as(anorm.Macro.namedParser[AlgorithmRunTypeDto].*);
    if (dtos.size > 0) Some(dtos.head) else None
  }

}


class AlgorithmRunViewDao extends DaoBase {

  def getAlgorithmRunViewsList() : List[AlgorithmRunViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmRunViewDto]= SQL("select * from algorithmRunView").as(anorm.Macro.namedParser[AlgorithmRunViewDto].*);
    dtos
  }
  def getAlgorithmRunViewsCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from algorithmRunView").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getAlgorithmRunViewsLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from algorithmRunView").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getAlgorithmRunViewsLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from algorithmRunView").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getAlgorithmRunViewFirst() : AlgorithmRunViewDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmRunViewDto= SQL("select * from algorithmRunView order by insertedRowDate asc ").as(anorm.Macro.namedParser[AlgorithmRunViewDto].single);
    dtos
  }
  def getAlgorithmRunViewLast() : AlgorithmRunViewDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmRunViewDto= SQL("select * from algorithmRunView order by insertedRowDate desc ").as(anorm.Macro.namedParser[AlgorithmRunViewDto].single);
    dtos
  }
  def getAlgorithmRunViewByGuid(guid : Long) : AlgorithmRunViewDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmRunViewDto= SQL("select * from algorithmRunView where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[AlgorithmRunViewDto].single);
    dtos
  }
  def getAlgorithmRunViewByPk(pkColValue : Long) : List[AlgorithmRunViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmRunViewDto] = SQL("select * from algorithmRunView where algorithmRunViewId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[AlgorithmRunViewDto].*);
    dtos
  }
  def getAlgorithmRunViewMaxId() : Long = {
    implicit val connection = getConnection();
    val maxid : Long = SQL("select max(algorithmRunViewId) as maxId from algorithmRunView ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;
    maxid
  }
  def getAlgorithmRunViewByFkAlgorithmRunId(fkColValue : Long) : List[AlgorithmRunViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmRunViewDto] = SQL("select * from algorithmRunView where algorithmRunId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[AlgorithmRunViewDto].*);
    dtos
  }
  def getAlgorithmRunViewByFkExecutorStorageViewId(fkColValue : Long) : List[AlgorithmRunViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmRunViewDto] = SQL("select * from algorithmRunView where executorStorageViewId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[AlgorithmRunViewDto].*);
    dtos
  }

}


class AlgorithmScheduleDao extends DaoBase {

  def getAlgorithmSchedulesList() : List[AlgorithmScheduleDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmScheduleDto]= SQL("select * from algorithmSchedule").as(anorm.Macro.namedParser[AlgorithmScheduleDto].*);
    dtos
  }
  def getAlgorithmSchedulesCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from algorithmSchedule").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getAlgorithmSchedulesLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from algorithmSchedule").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getAlgorithmSchedulesLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from algorithmSchedule").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getAlgorithmScheduleFirst() : AlgorithmScheduleDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmScheduleDto= SQL("select * from algorithmSchedule order by insertedRowDate asc ").as(anorm.Macro.namedParser[AlgorithmScheduleDto].single);
    dtos
  }
  def getAlgorithmScheduleLast() : AlgorithmScheduleDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmScheduleDto= SQL("select * from algorithmSchedule order by insertedRowDate desc ").as(anorm.Macro.namedParser[AlgorithmScheduleDto].single);
    dtos
  }
  def getAlgorithmScheduleByGuid(guid : Long) : AlgorithmScheduleDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmScheduleDto= SQL("select * from algorithmSchedule where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[AlgorithmScheduleDto].single);
    dtos
  }
  def getAlgorithmScheduleByPk(pkColValue : Long) : List[AlgorithmScheduleDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmScheduleDto] = SQL("select * from algorithmSchedule where algorithmScheduleId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[AlgorithmScheduleDto].*);
    dtos
  }
  def getAlgorithmScheduleMaxId() : Long = {
    implicit val connection = getConnection();
    val maxid : Long = SQL("select max(algorithmScheduleId) as maxId from algorithmSchedule ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;
    maxid
  }
  def getAlgorithmScheduleByFkAlgorithmImplementationId(fkColValue : Long) : List[AlgorithmScheduleDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmScheduleDto] = SQL("select * from algorithmSchedule where algorithmImplementationId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[AlgorithmScheduleDto].*);
    dtos
  }
  def getAlgorithmScheduleByFkAlgorithmScheduleTypeId(fkColValue : Long) : List[AlgorithmScheduleDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmScheduleDto] = SQL("select * from algorithmSchedule where algorithmScheduleTypeId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[AlgorithmScheduleDto].*);
    dtos
  }
  def getAlgorithmScheduleByName(nameColValue : String) : List[AlgorithmScheduleDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmScheduleDto] = SQL("select * from algorithmSchedule where algorithmScheduleName = {nameColValue} ").on("nameColValue" -> nameColValue).as(anorm.Macro.namedParser[AlgorithmScheduleDto].*);
    dtos
  }
  def getAlgorithmScheduleFirstByName(nameColValue : String) : Option[AlgorithmScheduleDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmScheduleDto] = SQL("select * from algorithmSchedule where algorithmScheduleName = {nameColValue} ").on("nameColValue" -> nameColValue).as(anorm.Macro.namedParser[AlgorithmScheduleDto].*);
    if (dtos.size > 0) Some(dtos.head) else None
  }

}


class AlgorithmScheduleColumnDao extends DaoBase {

  def getAlgorithmScheduleColumnsList() : List[AlgorithmScheduleColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmScheduleColumnDto]= SQL("select * from algorithmScheduleColumn").as(anorm.Macro.namedParser[AlgorithmScheduleColumnDto].*);
    dtos
  }
  def getAlgorithmScheduleColumnsCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from algorithmScheduleColumn").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getAlgorithmScheduleColumnsLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from algorithmScheduleColumn").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getAlgorithmScheduleColumnsLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from algorithmScheduleColumn").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getAlgorithmScheduleColumnFirst() : AlgorithmScheduleColumnDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmScheduleColumnDto= SQL("select * from algorithmScheduleColumn order by insertedRowDate asc ").as(anorm.Macro.namedParser[AlgorithmScheduleColumnDto].single);
    dtos
  }
  def getAlgorithmScheduleColumnLast() : AlgorithmScheduleColumnDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmScheduleColumnDto= SQL("select * from algorithmScheduleColumn order by insertedRowDate desc ").as(anorm.Macro.namedParser[AlgorithmScheduleColumnDto].single);
    dtos
  }
  def getAlgorithmScheduleColumnByGuid(guid : Long) : AlgorithmScheduleColumnDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmScheduleColumnDto= SQL("select * from algorithmScheduleColumn where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[AlgorithmScheduleColumnDto].single);
    dtos
  }
  def getAlgorithmScheduleColumnByPk(pkColValue : Long) : List[AlgorithmScheduleColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmScheduleColumnDto] = SQL("select * from algorithmScheduleColumn where algorithmScheduleColumnId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[AlgorithmScheduleColumnDto].*);
    dtos
  }
  def getAlgorithmScheduleColumnMaxId() : Long = {
    implicit val connection = getConnection();
    val maxid : Long = SQL("select max(algorithmScheduleColumnId) as maxId from algorithmScheduleColumn ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;
    maxid
  }
  def getAlgorithmScheduleColumnByFkAlgorithmColumnTypeId(fkColValue : Long) : List[AlgorithmScheduleColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmScheduleColumnDto] = SQL("select * from algorithmScheduleColumn where algorithmColumnTypeId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[AlgorithmScheduleColumnDto].*);
    dtos
  }
  def getAlgorithmScheduleColumnByFkAlgorithmScheduleId(fkColValue : Long) : List[AlgorithmScheduleColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmScheduleColumnDto] = SQL("select * from algorithmScheduleColumn where algorithmScheduleId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[AlgorithmScheduleColumnDto].*);
    dtos
  }
  def getAlgorithmScheduleColumnByFkAlgorithmScheduleViewId(fkColValue : Long) : List[AlgorithmScheduleColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmScheduleColumnDto] = SQL("select * from algorithmScheduleColumn where algorithmScheduleViewId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[AlgorithmScheduleColumnDto].*);
    dtos
  }
  def getAlgorithmScheduleColumnByFkSourceViewId(fkColValue : Long) : List[AlgorithmScheduleColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmScheduleColumnDto] = SQL("select * from algorithmScheduleColumn where sourceViewId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[AlgorithmScheduleColumnDto].*);
    dtos
  }
  def getAlgorithmScheduleColumnByFkSourceViewColumnId(fkColValue : Long) : List[AlgorithmScheduleColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmScheduleColumnDto] = SQL("select * from algorithmScheduleColumn where sourceViewColumnId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[AlgorithmScheduleColumnDto].*);
    dtos
  }

}


class AlgorithmScheduleParamDao extends DaoBase {

  def getAlgorithmScheduleParamsList() : List[AlgorithmScheduleParamDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmScheduleParamDto]= SQL("select * from algorithmScheduleParam").as(anorm.Macro.namedParser[AlgorithmScheduleParamDto].*);
    dtos
  }
  def getAlgorithmScheduleParamsCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from algorithmScheduleParam").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getAlgorithmScheduleParamsLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from algorithmScheduleParam").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getAlgorithmScheduleParamsLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from algorithmScheduleParam").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getAlgorithmScheduleParamFirst() : AlgorithmScheduleParamDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmScheduleParamDto= SQL("select * from algorithmScheduleParam order by insertedRowDate asc ").as(anorm.Macro.namedParser[AlgorithmScheduleParamDto].single);
    dtos
  }
  def getAlgorithmScheduleParamLast() : AlgorithmScheduleParamDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmScheduleParamDto= SQL("select * from algorithmScheduleParam order by insertedRowDate desc ").as(anorm.Macro.namedParser[AlgorithmScheduleParamDto].single);
    dtos
  }
  def getAlgorithmScheduleParamByGuid(guid : Long) : AlgorithmScheduleParamDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmScheduleParamDto= SQL("select * from algorithmScheduleParam where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[AlgorithmScheduleParamDto].single);
    dtos
  }
  def getAlgorithmScheduleParamByPk(pkColValue : Long) : List[AlgorithmScheduleParamDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmScheduleParamDto] = SQL("select * from algorithmScheduleParam where algorithmScheduleParamId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[AlgorithmScheduleParamDto].*);
    dtos
  }
  def getAlgorithmScheduleParamMaxId() : Long = {
    implicit val connection = getConnection();
    val maxid : Long = SQL("select max(algorithmScheduleParamId) as maxId from algorithmScheduleParam ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;
    maxid
  }
  def getAlgorithmScheduleParamByFkAlgorithmParamId(fkColValue : Long) : List[AlgorithmScheduleParamDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmScheduleParamDto] = SQL("select * from algorithmScheduleParam where algorithmParamId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[AlgorithmScheduleParamDto].*);
    dtos
  }
  def getAlgorithmScheduleParamByFkAlgorithmScheduleId(fkColValue : Long) : List[AlgorithmScheduleParamDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmScheduleParamDto] = SQL("select * from algorithmScheduleParam where algorithmScheduleId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[AlgorithmScheduleParamDto].*);
    dtos
  }

}


class AlgorithmScheduleTypeDao extends DaoBase {

  def getAlgorithmScheduleTypesList() : List[AlgorithmScheduleTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmScheduleTypeDto]= SQL("select * from algorithmScheduleType").as(anorm.Macro.namedParser[AlgorithmScheduleTypeDto].*);
    dtos
  }
  def getAlgorithmScheduleTypesCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from algorithmScheduleType").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getAlgorithmScheduleTypesLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from algorithmScheduleType").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getAlgorithmScheduleTypesLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from algorithmScheduleType").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getAlgorithmScheduleTypeFirst() : AlgorithmScheduleTypeDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmScheduleTypeDto= SQL("select * from algorithmScheduleType order by insertedRowDate asc ").as(anorm.Macro.namedParser[AlgorithmScheduleTypeDto].single);
    dtos
  }
  def getAlgorithmScheduleTypeLast() : AlgorithmScheduleTypeDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmScheduleTypeDto= SQL("select * from algorithmScheduleType order by insertedRowDate desc ").as(anorm.Macro.namedParser[AlgorithmScheduleTypeDto].single);
    dtos
  }
  def getAlgorithmScheduleTypeByGuid(guid : Long) : AlgorithmScheduleTypeDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmScheduleTypeDto= SQL("select * from algorithmScheduleType where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[AlgorithmScheduleTypeDto].single);
    dtos
  }
  def getAlgorithmScheduleTypeByPk(pkColValue : Long) : List[AlgorithmScheduleTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmScheduleTypeDto] = SQL("select * from algorithmScheduleType where algorithmScheduleTypeId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[AlgorithmScheduleTypeDto].*);
    dtos
  }
  def getAlgorithmScheduleTypeMaxId() : Long = {
    implicit val connection = getConnection();
    val maxid : Long = SQL("select max(algorithmScheduleTypeId) as maxId from algorithmScheduleType ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;
    maxid
  }
  def getAlgorithmScheduleTypeByName(nameColValue : String) : List[AlgorithmScheduleTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmScheduleTypeDto] = SQL("select * from algorithmScheduleType where algorithmScheduleTypeName = {nameColValue} ").on("nameColValue" -> nameColValue).as(anorm.Macro.namedParser[AlgorithmScheduleTypeDto].*);
    dtos
  }
  def getAlgorithmScheduleTypeFirstByName(nameColValue : String) : Option[AlgorithmScheduleTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmScheduleTypeDto] = SQL("select * from algorithmScheduleType where algorithmScheduleTypeName = {nameColValue} ").on("nameColValue" -> nameColValue).as(anorm.Macro.namedParser[AlgorithmScheduleTypeDto].*);
    if (dtos.size > 0) Some(dtos.head) else None
  }

}


class AlgorithmScheduleViewDao extends DaoBase {

  def getAlgorithmScheduleViewsList() : List[AlgorithmScheduleViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmScheduleViewDto]= SQL("select * from algorithmScheduleView").as(anorm.Macro.namedParser[AlgorithmScheduleViewDto].*);
    dtos
  }
  def getAlgorithmScheduleViewsCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from algorithmScheduleView").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getAlgorithmScheduleViewsLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from algorithmScheduleView").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getAlgorithmScheduleViewsLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from algorithmScheduleView").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getAlgorithmScheduleViewFirst() : AlgorithmScheduleViewDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmScheduleViewDto= SQL("select * from algorithmScheduleView order by insertedRowDate asc ").as(anorm.Macro.namedParser[AlgorithmScheduleViewDto].single);
    dtos
  }
  def getAlgorithmScheduleViewLast() : AlgorithmScheduleViewDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmScheduleViewDto= SQL("select * from algorithmScheduleView order by insertedRowDate desc ").as(anorm.Macro.namedParser[AlgorithmScheduleViewDto].single);
    dtos
  }
  def getAlgorithmScheduleViewByGuid(guid : Long) : AlgorithmScheduleViewDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmScheduleViewDto= SQL("select * from algorithmScheduleView where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[AlgorithmScheduleViewDto].single);
    dtos
  }
  def getAlgorithmScheduleViewByPk(pkColValue : Long) : List[AlgorithmScheduleViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmScheduleViewDto] = SQL("select * from algorithmScheduleView where algorithmScheduleViewId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[AlgorithmScheduleViewDto].*);
    dtos
  }
  def getAlgorithmScheduleViewMaxId() : Long = {
    implicit val connection = getConnection();
    val maxid : Long = SQL("select max(algorithmScheduleViewId) as maxId from algorithmScheduleView ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;
    maxid
  }
  def getAlgorithmScheduleViewByFkAlgorithmScheduleId(fkColValue : Long) : List[AlgorithmScheduleViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmScheduleViewDto] = SQL("select * from algorithmScheduleView where algorithmScheduleId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[AlgorithmScheduleViewDto].*);
    dtos
  }
  def getAlgorithmScheduleViewByFkAlgorithmScheduleViewTypeId(fkColValue : Long) : List[AlgorithmScheduleViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmScheduleViewDto] = SQL("select * from algorithmScheduleView where algorithmScheduleViewTypeId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[AlgorithmScheduleViewDto].*);
    dtos
  }
  def getAlgorithmScheduleViewByFkSourceViewId(fkColValue : Long) : List[AlgorithmScheduleViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmScheduleViewDto] = SQL("select * from algorithmScheduleView where sourceViewId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[AlgorithmScheduleViewDto].*);
    dtos
  }

}


class AlgorithmScheduleViewTypeDao extends DaoBase {

  def getAlgorithmScheduleViewTypesList() : List[AlgorithmScheduleViewTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmScheduleViewTypeDto]= SQL("select * from algorithmScheduleViewType").as(anorm.Macro.namedParser[AlgorithmScheduleViewTypeDto].*);
    dtos
  }
  def getAlgorithmScheduleViewTypesCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from algorithmScheduleViewType").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getAlgorithmScheduleViewTypesLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from algorithmScheduleViewType").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getAlgorithmScheduleViewTypesLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from algorithmScheduleViewType").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getAlgorithmScheduleViewTypeFirst() : AlgorithmScheduleViewTypeDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmScheduleViewTypeDto= SQL("select * from algorithmScheduleViewType order by insertedRowDate asc ").as(anorm.Macro.namedParser[AlgorithmScheduleViewTypeDto].single);
    dtos
  }
  def getAlgorithmScheduleViewTypeLast() : AlgorithmScheduleViewTypeDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmScheduleViewTypeDto= SQL("select * from algorithmScheduleViewType order by insertedRowDate desc ").as(anorm.Macro.namedParser[AlgorithmScheduleViewTypeDto].single);
    dtos
  }
  def getAlgorithmScheduleViewTypeByGuid(guid : Long) : AlgorithmScheduleViewTypeDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmScheduleViewTypeDto= SQL("select * from algorithmScheduleViewType where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[AlgorithmScheduleViewTypeDto].single);
    dtos
  }
  def getAlgorithmScheduleViewTypeByPk(pkColValue : Long) : List[AlgorithmScheduleViewTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmScheduleViewTypeDto] = SQL("select * from algorithmScheduleViewType where algorithmScheduleViewTypeId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[AlgorithmScheduleViewTypeDto].*);
    dtos
  }
  def getAlgorithmScheduleViewTypeMaxId() : Long = {
    implicit val connection = getConnection();
    val maxid : Long = SQL("select max(algorithmScheduleViewTypeId) as maxId from algorithmScheduleViewType ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;
    maxid
  }
  def getAlgorithmScheduleViewTypeByName(nameColValue : String) : List[AlgorithmScheduleViewTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmScheduleViewTypeDto] = SQL("select * from algorithmScheduleViewType where algorithmScheduleViewTypeName = {nameColValue} ").on("nameColValue" -> nameColValue).as(anorm.Macro.namedParser[AlgorithmScheduleViewTypeDto].*);
    dtos
  }
  def getAlgorithmScheduleViewTypeFirstByName(nameColValue : String) : Option[AlgorithmScheduleViewTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmScheduleViewTypeDto] = SQL("select * from algorithmScheduleViewType where algorithmScheduleViewTypeName = {nameColValue} ").on("nameColValue" -> nameColValue).as(anorm.Macro.namedParser[AlgorithmScheduleViewTypeDto].*);
    if (dtos.size > 0) Some(dtos.head) else None
  }

}


class AlgorithmTypeDao extends DaoBase {

  def getAlgorithmTypesList() : List[AlgorithmTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmTypeDto]= SQL("select * from algorithmType").as(anorm.Macro.namedParser[AlgorithmTypeDto].*);
    dtos
  }
  def getAlgorithmTypesCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from algorithmType").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getAlgorithmTypesLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from algorithmType").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getAlgorithmTypesLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from algorithmType").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getAlgorithmTypeFirst() : AlgorithmTypeDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmTypeDto= SQL("select * from algorithmType order by insertedRowDate asc ").as(anorm.Macro.namedParser[AlgorithmTypeDto].single);
    dtos
  }
  def getAlgorithmTypeLast() : AlgorithmTypeDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmTypeDto= SQL("select * from algorithmType order by insertedRowDate desc ").as(anorm.Macro.namedParser[AlgorithmTypeDto].single);
    dtos
  }
  def getAlgorithmTypeByGuid(guid : Long) : AlgorithmTypeDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmTypeDto= SQL("select * from algorithmType where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[AlgorithmTypeDto].single);
    dtos
  }
  def getAlgorithmTypeByPk(pkColValue : Long) : List[AlgorithmTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmTypeDto] = SQL("select * from algorithmType where algorithmTypeId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[AlgorithmTypeDto].*);
    dtos
  }
  def getAlgorithmTypeMaxId() : Long = {
    implicit val connection = getConnection();
    val maxid : Long = SQL("select max(algorithmTypeId) as maxId from algorithmType ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;
    maxid
  }
  def getAlgorithmTypeByName(nameColValue : String) : List[AlgorithmTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmTypeDto] = SQL("select * from algorithmType where algorithmTypeName = {nameColValue} ").on("nameColValue" -> nameColValue).as(anorm.Macro.namedParser[AlgorithmTypeDto].*);
    dtos
  }
  def getAlgorithmTypeFirstByName(nameColValue : String) : Option[AlgorithmTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmTypeDto] = SQL("select * from algorithmType where algorithmTypeName = {nameColValue} ").on("nameColValue" -> nameColValue).as(anorm.Macro.namedParser[AlgorithmTypeDto].*);
    if (dtos.size > 0) Some(dtos.head) else None
  }

}


class AlgorithmTypeColumnTypeDao extends DaoBase {

  def getAlgorithmTypeColumnTypesList() : List[AlgorithmTypeColumnTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmTypeColumnTypeDto]= SQL("select * from algorithmTypeColumnType").as(anorm.Macro.namedParser[AlgorithmTypeColumnTypeDto].*);
    dtos
  }
  def getAlgorithmTypeColumnTypesCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from algorithmTypeColumnType").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getAlgorithmTypeColumnTypesLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from algorithmTypeColumnType").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getAlgorithmTypeColumnTypesLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from algorithmTypeColumnType").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getAlgorithmTypeColumnTypeFirst() : AlgorithmTypeColumnTypeDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmTypeColumnTypeDto= SQL("select * from algorithmTypeColumnType order by insertedRowDate asc ").as(anorm.Macro.namedParser[AlgorithmTypeColumnTypeDto].single);
    dtos
  }
  def getAlgorithmTypeColumnTypeLast() : AlgorithmTypeColumnTypeDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmTypeColumnTypeDto= SQL("select * from algorithmTypeColumnType order by insertedRowDate desc ").as(anorm.Macro.namedParser[AlgorithmTypeColumnTypeDto].single);
    dtos
  }
  def getAlgorithmTypeColumnTypeByGuid(guid : Long) : AlgorithmTypeColumnTypeDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmTypeColumnTypeDto= SQL("select * from algorithmTypeColumnType where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[AlgorithmTypeColumnTypeDto].single);
    dtos
  }
  def getAlgorithmTypeColumnTypeByPk(pkColValue : Long) : List[AlgorithmTypeColumnTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmTypeColumnTypeDto] = SQL("select * from algorithmTypeColumnType where algorithmTypeColumnTypeId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[AlgorithmTypeColumnTypeDto].*);
    dtos
  }
  def getAlgorithmTypeColumnTypeMaxId() : Long = {
    implicit val connection = getConnection();
    val maxid : Long = SQL("select max(algorithmTypeColumnTypeId) as maxId from algorithmTypeColumnType ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;
    maxid
  }
  def getAlgorithmTypeColumnTypeByFkAlgorithmColumnTypeId(fkColValue : Long) : List[AlgorithmTypeColumnTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmTypeColumnTypeDto] = SQL("select * from algorithmTypeColumnType where algorithmColumnTypeId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[AlgorithmTypeColumnTypeDto].*);
    dtos
  }
  def getAlgorithmTypeColumnTypeByFkAlgorithmTypeVersionId(fkColValue : Long) : List[AlgorithmTypeColumnTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmTypeColumnTypeDto] = SQL("select * from algorithmTypeColumnType where algorithmTypeVersionId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[AlgorithmTypeColumnTypeDto].*);
    dtos
  }

}


class AlgorithmTypeOutputTypeDao extends DaoBase {

  def getAlgorithmTypeOutputTypesList() : List[AlgorithmTypeOutputTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmTypeOutputTypeDto]= SQL("select * from algorithmTypeOutputType").as(anorm.Macro.namedParser[AlgorithmTypeOutputTypeDto].*);
    dtos
  }
  def getAlgorithmTypeOutputTypesCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from algorithmTypeOutputType").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getAlgorithmTypeOutputTypesLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from algorithmTypeOutputType").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getAlgorithmTypeOutputTypesLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from algorithmTypeOutputType").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getAlgorithmTypeOutputTypeFirst() : AlgorithmTypeOutputTypeDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmTypeOutputTypeDto= SQL("select * from algorithmTypeOutputType order by insertedRowDate asc ").as(anorm.Macro.namedParser[AlgorithmTypeOutputTypeDto].single);
    dtos
  }
  def getAlgorithmTypeOutputTypeLast() : AlgorithmTypeOutputTypeDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmTypeOutputTypeDto= SQL("select * from algorithmTypeOutputType order by insertedRowDate desc ").as(anorm.Macro.namedParser[AlgorithmTypeOutputTypeDto].single);
    dtos
  }
  def getAlgorithmTypeOutputTypeByGuid(guid : Long) : AlgorithmTypeOutputTypeDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmTypeOutputTypeDto= SQL("select * from algorithmTypeOutputType where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[AlgorithmTypeOutputTypeDto].single);
    dtos
  }
  def getAlgorithmTypeOutputTypeByPk(pkColValue : Long) : List[AlgorithmTypeOutputTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmTypeOutputTypeDto] = SQL("select * from algorithmTypeOutputType where algorithmTypeOutputTypeId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[AlgorithmTypeOutputTypeDto].*);
    dtos
  }
  def getAlgorithmTypeOutputTypeMaxId() : Long = {
    implicit val connection = getConnection();
    val maxid : Long = SQL("select max(algorithmTypeOutputTypeId) as maxId from algorithmTypeOutputType ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;
    maxid
  }

}


class AlgorithmTypeVersionDao extends DaoBase {

  def getAlgorithmTypeVersionsList() : List[AlgorithmTypeVersionDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmTypeVersionDto]= SQL("select * from algorithmTypeVersion").as(anorm.Macro.namedParser[AlgorithmTypeVersionDto].*);
    dtos
  }
  def getAlgorithmTypeVersionsCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from algorithmTypeVersion").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getAlgorithmTypeVersionsLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from algorithmTypeVersion").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getAlgorithmTypeVersionsLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from algorithmTypeVersion").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getAlgorithmTypeVersionFirst() : AlgorithmTypeVersionDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmTypeVersionDto= SQL("select * from algorithmTypeVersion order by insertedRowDate asc ").as(anorm.Macro.namedParser[AlgorithmTypeVersionDto].single);
    dtos
  }
  def getAlgorithmTypeVersionLast() : AlgorithmTypeVersionDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmTypeVersionDto= SQL("select * from algorithmTypeVersion order by insertedRowDate desc ").as(anorm.Macro.namedParser[AlgorithmTypeVersionDto].single);
    dtos
  }
  def getAlgorithmTypeVersionByGuid(guid : Long) : AlgorithmTypeVersionDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmTypeVersionDto= SQL("select * from algorithmTypeVersion where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[AlgorithmTypeVersionDto].single);
    dtos
  }
  def getAlgorithmTypeVersionByPk(pkColValue : Long) : List[AlgorithmTypeVersionDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmTypeVersionDto] = SQL("select * from algorithmTypeVersion where algorithmTypeVersionId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[AlgorithmTypeVersionDto].*);
    dtos
  }
  def getAlgorithmTypeVersionMaxId() : Long = {
    implicit val connection = getConnection();
    val maxid : Long = SQL("select max(algorithmTypeVersionId) as maxId from algorithmTypeVersion ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;
    maxid
  }
  def getAlgorithmTypeVersionByFkAlgorithmTypeId(fkColValue : Long) : List[AlgorithmTypeVersionDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmTypeVersionDto] = SQL("select * from algorithmTypeVersion where algorithmTypeId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[AlgorithmTypeVersionDto].*);
    dtos
  }
  def getAlgorithmTypeVersionByName(nameColValue : String) : List[AlgorithmTypeVersionDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmTypeVersionDto] = SQL("select * from algorithmTypeVersion where algorithmTypeVersionName = {nameColValue} ").on("nameColValue" -> nameColValue).as(anorm.Macro.namedParser[AlgorithmTypeVersionDto].*);
    dtos
  }
  def getAlgorithmTypeVersionFirstByName(nameColValue : String) : Option[AlgorithmTypeVersionDto] = {
    implicit val connection = getConnection();
    val dtos : List[AlgorithmTypeVersionDto] = SQL("select * from algorithmTypeVersion where algorithmTypeVersionName = {nameColValue} ").on("nameColValue" -> nameColValue).as(anorm.Macro.namedParser[AlgorithmTypeVersionDto].*);
    if (dtos.size > 0) Some(dtos.head) else None
  }

}


class ExecutorHostDao extends DaoBase {

  def getExecutorHostsList() : List[ExecutorHostDto] = {
    implicit val connection = getConnection();
    val dtos : List[ExecutorHostDto]= SQL("select * from executorHost").as(anorm.Macro.namedParser[ExecutorHostDto].*);
    dtos
  }
  def getExecutorHostsCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from executorHost").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getExecutorHostsLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from executorHost").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getExecutorHostsLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from executorHost").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getExecutorHostFirst() : ExecutorHostDto = {
    implicit val connection = getConnection();
    val dtos : ExecutorHostDto= SQL("select * from executorHost order by insertedRowDate asc ").as(anorm.Macro.namedParser[ExecutorHostDto].single);
    dtos
  }
  def getExecutorHostLast() : ExecutorHostDto = {
    implicit val connection = getConnection();
    val dtos : ExecutorHostDto= SQL("select * from executorHost order by insertedRowDate desc ").as(anorm.Macro.namedParser[ExecutorHostDto].single);
    dtos
  }
  def getExecutorHostByGuid(guid : Long) : ExecutorHostDto = {
    implicit val connection = getConnection();
    val dtos : ExecutorHostDto= SQL("select * from executorHost where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[ExecutorHostDto].single);
    dtos
  }
  def getExecutorHostByPk(pkColValue : Long) : List[ExecutorHostDto] = {
    implicit val connection = getConnection();
    val dtos : List[ExecutorHostDto] = SQL("select * from executorHost where executorHostId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[ExecutorHostDto].*);
    dtos
  }
  def getExecutorHostMaxId() : Long = {
    implicit val connection = getConnection();
    val maxid : Long = SQL("select max(executorHostId) as maxId from executorHost ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;
    maxid
  }

}


class ExecutorInstanceDao extends DaoBase {

  def getExecutorInstancesList() : List[ExecutorInstanceDto] = {
    implicit val connection = getConnection();
    val dtos : List[ExecutorInstanceDto]= SQL("select * from executorInstance").as(anorm.Macro.namedParser[ExecutorInstanceDto].*);
    dtos
  }
  def getExecutorInstancesCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from executorInstance").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getExecutorInstancesLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from executorInstance").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getExecutorInstancesLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from executorInstance").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getExecutorInstanceFirst() : ExecutorInstanceDto = {
    implicit val connection = getConnection();
    val dtos : ExecutorInstanceDto= SQL("select * from executorInstance order by insertedRowDate asc ").as(anorm.Macro.namedParser[ExecutorInstanceDto].single);
    dtos
  }
  def getExecutorInstanceLast() : ExecutorInstanceDto = {
    implicit val connection = getConnection();
    val dtos : ExecutorInstanceDto= SQL("select * from executorInstance order by insertedRowDate desc ").as(anorm.Macro.namedParser[ExecutorInstanceDto].single);
    dtos
  }
  def getExecutorInstanceByGuid(guid : Long) : ExecutorInstanceDto = {
    implicit val connection = getConnection();
    val dtos : ExecutorInstanceDto= SQL("select * from executorInstance where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[ExecutorInstanceDto].single);
    dtos
  }
  def getExecutorInstanceByPk(pkColValue : Long) : List[ExecutorInstanceDto] = {
    implicit val connection = getConnection();
    val dtos : List[ExecutorInstanceDto] = SQL("select * from executorInstance where executorInstanceId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[ExecutorInstanceDto].*);
    dtos
  }
  def getExecutorInstanceMaxId() : Long = {
    implicit val connection = getConnection();
    val maxid : Long = SQL("select max(executorInstanceId) as maxId from executorInstance ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;
    maxid
  }
  def getExecutorInstanceByFkExecutorHostId(fkColValue : Long) : List[ExecutorInstanceDto] = {
    implicit val connection = getConnection();
    val dtos : List[ExecutorInstanceDto] = SQL("select * from executorInstance where executorHostId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[ExecutorInstanceDto].*);
    dtos
  }
  def getExecutorInstanceByFkExecutorTypeId(fkColValue : Long) : List[ExecutorInstanceDto] = {
    implicit val connection = getConnection();
    val dtos : List[ExecutorInstanceDto] = SQL("select * from executorInstance where executorTypeId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[ExecutorInstanceDto].*);
    dtos
  }
  def getExecutorInstanceByName(nameColValue : String) : List[ExecutorInstanceDto] = {
    implicit val connection = getConnection();
    val dtos : List[ExecutorInstanceDto] = SQL("select * from executorInstance where executorInstanceName = {nameColValue} ").on("nameColValue" -> nameColValue).as(anorm.Macro.namedParser[ExecutorInstanceDto].*);
    dtos
  }
  def getExecutorInstanceFirstByName(nameColValue : String) : Option[ExecutorInstanceDto] = {
    implicit val connection = getConnection();
    val dtos : List[ExecutorInstanceDto] = SQL("select * from executorInstance where executorInstanceName = {nameColValue} ").on("nameColValue" -> nameColValue).as(anorm.Macro.namedParser[ExecutorInstanceDto].*);
    if (dtos.size > 0) Some(dtos.head) else None
  }

}


class ExecutorRestDao extends DaoBase {

  def getExecutorRestsList() : List[ExecutorRestDto] = {
    implicit val connection = getConnection();
    val dtos : List[ExecutorRestDto]= SQL("select * from executorRest").as(anorm.Macro.namedParser[ExecutorRestDto].*);
    dtos
  }
  def getExecutorRestsCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from executorRest").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getExecutorRestsLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from executorRest").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getExecutorRestsLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from executorRest").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getExecutorRestFirst() : ExecutorRestDto = {
    implicit val connection = getConnection();
    val dtos : ExecutorRestDto= SQL("select * from executorRest order by insertedRowDate asc ").as(anorm.Macro.namedParser[ExecutorRestDto].single);
    dtos
  }
  def getExecutorRestLast() : ExecutorRestDto = {
    implicit val connection = getConnection();
    val dtos : ExecutorRestDto= SQL("select * from executorRest order by insertedRowDate desc ").as(anorm.Macro.namedParser[ExecutorRestDto].single);
    dtos
  }
  def getExecutorRestByGuid(guid : Long) : ExecutorRestDto = {
    implicit val connection = getConnection();
    val dtos : ExecutorRestDto= SQL("select * from executorRest where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[ExecutorRestDto].single);
    dtos
  }
  def getExecutorRestByPk(pkColValue : Long) : List[ExecutorRestDto] = {
    implicit val connection = getConnection();
    val dtos : List[ExecutorRestDto] = SQL("select * from executorRest where executorRestId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[ExecutorRestDto].*);
    dtos
  }
  def getExecutorRestMaxId() : Long = {
    implicit val connection = getConnection();
    val maxid : Long = SQL("select max(executorRestId) as maxId from executorRest ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;
    maxid
  }
  def getExecutorRestByFkExecutorHostId(fkColValue : Long) : List[ExecutorRestDto] = {
    implicit val connection = getConnection();
    val dtos : List[ExecutorRestDto] = SQL("select * from executorRest where executorHostId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[ExecutorRestDto].*);
    dtos
  }

}


class ExecutorRestCallDao extends DaoBase {

  def getExecutorRestCallsList() : List[ExecutorRestCallDto] = {
    implicit val connection = getConnection();
    val dtos : List[ExecutorRestCallDto]= SQL("select * from executorRestCall").as(anorm.Macro.namedParser[ExecutorRestCallDto].*);
    dtos
  }
  def getExecutorRestCallsCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from executorRestCall").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getExecutorRestCallsLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from executorRestCall").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getExecutorRestCallsLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from executorRestCall").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getExecutorRestCallFirst() : ExecutorRestCallDto = {
    implicit val connection = getConnection();
    val dtos : ExecutorRestCallDto= SQL("select * from executorRestCall order by insertedRowDate asc ").as(anorm.Macro.namedParser[ExecutorRestCallDto].single);
    dtos
  }
  def getExecutorRestCallLast() : ExecutorRestCallDto = {
    implicit val connection = getConnection();
    val dtos : ExecutorRestCallDto= SQL("select * from executorRestCall order by insertedRowDate desc ").as(anorm.Macro.namedParser[ExecutorRestCallDto].single);
    dtos
  }
  def getExecutorRestCallByGuid(guid : Long) : ExecutorRestCallDto = {
    implicit val connection = getConnection();
    val dtos : ExecutorRestCallDto= SQL("select * from executorRestCall where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[ExecutorRestCallDto].single);
    dtos
  }
  def getExecutorRestCallByPk(pkColValue : Long) : List[ExecutorRestCallDto] = {
    implicit val connection = getConnection();
    val dtos : List[ExecutorRestCallDto] = SQL("select * from executorRestCall where executorRestCallId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[ExecutorRestCallDto].*);
    dtos
  }
  def getExecutorRestCallMaxId() : Long = {
    implicit val connection = getConnection();
    val maxid : Long = SQL("select max(executorRestCallId) as maxId from executorRestCall ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;
    maxid
  }
  def getExecutorRestCallByFkExecutorHostId(fkColValue : Long) : List[ExecutorRestCallDto] = {
    implicit val connection = getConnection();
    val dtos : List[ExecutorRestCallDto] = SQL("select * from executorRestCall where executorHostId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[ExecutorRestCallDto].*);
    dtos
  }
  def getExecutorRestCallByFkExecutorRestId(fkColValue : Long) : List[ExecutorRestCallDto] = {
    implicit val connection = getConnection();
    val dtos : List[ExecutorRestCallDto] = SQL("select * from executorRestCall where executorRestId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[ExecutorRestCallDto].*);
    dtos
  }

}


class ExecutorStorageDao extends DaoBase {

  def getExecutorStoragesList() : List[ExecutorStorageDto] = {
    implicit val connection = getConnection();
    val dtos : List[ExecutorStorageDto]= SQL("select * from executorStorage").as(anorm.Macro.namedParser[ExecutorStorageDto].*);
    dtos
  }
  def getExecutorStoragesCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from executorStorage").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getExecutorStoragesLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from executorStorage").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getExecutorStoragesLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from executorStorage").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getExecutorStorageFirst() : ExecutorStorageDto = {
    implicit val connection = getConnection();
    val dtos : ExecutorStorageDto= SQL("select * from executorStorage order by insertedRowDate asc ").as(anorm.Macro.namedParser[ExecutorStorageDto].single);
    dtos
  }
  def getExecutorStorageLast() : ExecutorStorageDto = {
    implicit val connection = getConnection();
    val dtos : ExecutorStorageDto= SQL("select * from executorStorage order by insertedRowDate desc ").as(anorm.Macro.namedParser[ExecutorStorageDto].single);
    dtos
  }
  def getExecutorStorageByGuid(guid : Long) : ExecutorStorageDto = {
    implicit val connection = getConnection();
    val dtos : ExecutorStorageDto= SQL("select * from executorStorage where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[ExecutorStorageDto].single);
    dtos
  }
  def getExecutorStorageByPk(pkColValue : Long) : List[ExecutorStorageDto] = {
    implicit val connection = getConnection();
    val dtos : List[ExecutorStorageDto] = SQL("select * from executorStorage where executorStorageId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[ExecutorStorageDto].*);
    dtos
  }
  def getExecutorStorageMaxId() : Long = {
    implicit val connection = getConnection();
    val maxid : Long = SQL("select max(executorStorageId) as maxId from executorStorage ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;
    maxid
  }
  def getExecutorStorageByFkExecutorStorageTypeId(fkColValue : Long) : List[ExecutorStorageDto] = {
    implicit val connection = getConnection();
    val dtos : List[ExecutorStorageDto] = SQL("select * from executorStorage where executorStorageTypeId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[ExecutorStorageDto].*);
    dtos
  }
  def getExecutorStorageByFkExecutorHostId(fkColValue : Long) : List[ExecutorStorageDto] = {
    implicit val connection = getConnection();
    val dtos : List[ExecutorStorageDto] = SQL("select * from executorStorage where executorHostId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[ExecutorStorageDto].*);
    dtos
  }

}


class ExecutorStorageSnapshotDao extends DaoBase {

  def getExecutorStorageSnapshotsList() : List[ExecutorStorageSnapshotDto] = {
    implicit val connection = getConnection();
    val dtos : List[ExecutorStorageSnapshotDto]= SQL("select * from executorStorageSnapshot").as(anorm.Macro.namedParser[ExecutorStorageSnapshotDto].*);
    dtos
  }
  def getExecutorStorageSnapshotsCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from executorStorageSnapshot").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getExecutorStorageSnapshotsLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from executorStorageSnapshot").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getExecutorStorageSnapshotsLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from executorStorageSnapshot").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getExecutorStorageSnapshotFirst() : ExecutorStorageSnapshotDto = {
    implicit val connection = getConnection();
    val dtos : ExecutorStorageSnapshotDto= SQL("select * from executorStorageSnapshot order by insertedRowDate asc ").as(anorm.Macro.namedParser[ExecutorStorageSnapshotDto].single);
    dtos
  }
  def getExecutorStorageSnapshotLast() : ExecutorStorageSnapshotDto = {
    implicit val connection = getConnection();
    val dtos : ExecutorStorageSnapshotDto= SQL("select * from executorStorageSnapshot order by insertedRowDate desc ").as(anorm.Macro.namedParser[ExecutorStorageSnapshotDto].single);
    dtos
  }
  def getExecutorStorageSnapshotByGuid(guid : Long) : ExecutorStorageSnapshotDto = {
    implicit val connection = getConnection();
    val dtos : ExecutorStorageSnapshotDto= SQL("select * from executorStorageSnapshot where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[ExecutorStorageSnapshotDto].single);
    dtos
  }
  def getExecutorStorageSnapshotByPk(pkColValue : Long) : List[ExecutorStorageSnapshotDto] = {
    implicit val connection = getConnection();
    val dtos : List[ExecutorStorageSnapshotDto] = SQL("select * from executorStorageSnapshot where executorStorageSnapshotId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[ExecutorStorageSnapshotDto].*);
    dtos
  }
  def getExecutorStorageSnapshotMaxId() : Long = {
    implicit val connection = getConnection();
    val maxid : Long = SQL("select max(executorStorageSnapshotId) as maxId from executorStorageSnapshot ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;
    maxid
  }
  def getExecutorStorageSnapshotByFkExecutorInstanceId(fkColValue : Long) : List[ExecutorStorageSnapshotDto] = {
    implicit val connection = getConnection();
    val dtos : List[ExecutorStorageSnapshotDto] = SQL("select * from executorStorageSnapshot where executorInstanceId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[ExecutorStorageSnapshotDto].*);
    dtos
  }

}


class ExecutorStorageTypeDao extends DaoBase {

  def getExecutorStorageTypesList() : List[ExecutorStorageTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[ExecutorStorageTypeDto]= SQL("select * from executorStorageType").as(anorm.Macro.namedParser[ExecutorStorageTypeDto].*);
    dtos
  }
  def getExecutorStorageTypesCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from executorStorageType").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getExecutorStorageTypesLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from executorStorageType").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getExecutorStorageTypesLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from executorStorageType").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getExecutorStorageTypeFirst() : ExecutorStorageTypeDto = {
    implicit val connection = getConnection();
    val dtos : ExecutorStorageTypeDto= SQL("select * from executorStorageType order by insertedRowDate asc ").as(anorm.Macro.namedParser[ExecutorStorageTypeDto].single);
    dtos
  }
  def getExecutorStorageTypeLast() : ExecutorStorageTypeDto = {
    implicit val connection = getConnection();
    val dtos : ExecutorStorageTypeDto= SQL("select * from executorStorageType order by insertedRowDate desc ").as(anorm.Macro.namedParser[ExecutorStorageTypeDto].single);
    dtos
  }
  def getExecutorStorageTypeByGuid(guid : Long) : ExecutorStorageTypeDto = {
    implicit val connection = getConnection();
    val dtos : ExecutorStorageTypeDto= SQL("select * from executorStorageType where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[ExecutorStorageTypeDto].single);
    dtos
  }
  def getExecutorStorageTypeByPk(pkColValue : Long) : List[ExecutorStorageTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[ExecutorStorageTypeDto] = SQL("select * from executorStorageType where executorStorageTypeId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[ExecutorStorageTypeDto].*);
    dtos
  }
  def getExecutorStorageTypeMaxId() : Long = {
    implicit val connection = getConnection();
    val maxid : Long = SQL("select max(executorStorageTypeId) as maxId from executorStorageType ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;
    maxid
  }
  def getExecutorStorageTypeByName(nameColValue : String) : List[ExecutorStorageTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[ExecutorStorageTypeDto] = SQL("select * from executorStorageType where executorStorageTypeName = {nameColValue} ").on("nameColValue" -> nameColValue).as(anorm.Macro.namedParser[ExecutorStorageTypeDto].*);
    dtos
  }
  def getExecutorStorageTypeFirstByName(nameColValue : String) : Option[ExecutorStorageTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[ExecutorStorageTypeDto] = SQL("select * from executorStorageType where executorStorageTypeName = {nameColValue} ").on("nameColValue" -> nameColValue).as(anorm.Macro.namedParser[ExecutorStorageTypeDto].*);
    if (dtos.size > 0) Some(dtos.head) else None
  }

}


class ExecutorStorageViewDao extends DaoBase {

  def getExecutorStorageViewsList() : List[ExecutorStorageViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[ExecutorStorageViewDto]= SQL("select * from executorStorageView").as(anorm.Macro.namedParser[ExecutorStorageViewDto].*);
    dtos
  }
  def getExecutorStorageViewsCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from executorStorageView").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getExecutorStorageViewsLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from executorStorageView").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getExecutorStorageViewsLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from executorStorageView").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getExecutorStorageViewFirst() : ExecutorStorageViewDto = {
    implicit val connection = getConnection();
    val dtos : ExecutorStorageViewDto= SQL("select * from executorStorageView order by insertedRowDate asc ").as(anorm.Macro.namedParser[ExecutorStorageViewDto].single);
    dtos
  }
  def getExecutorStorageViewLast() : ExecutorStorageViewDto = {
    implicit val connection = getConnection();
    val dtos : ExecutorStorageViewDto= SQL("select * from executorStorageView order by insertedRowDate desc ").as(anorm.Macro.namedParser[ExecutorStorageViewDto].single);
    dtos
  }
  def getExecutorStorageViewByGuid(guid : Long) : ExecutorStorageViewDto = {
    implicit val connection = getConnection();
    val dtos : ExecutorStorageViewDto= SQL("select * from executorStorageView where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[ExecutorStorageViewDto].single);
    dtos
  }
  def getExecutorStorageViewByPk(pkColValue : Long) : List[ExecutorStorageViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[ExecutorStorageViewDto] = SQL("select * from executorStorageView where executorStorageViewId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[ExecutorStorageViewDto].*);
    dtos
  }
  def getExecutorStorageViewMaxId() : Long = {
    implicit val connection = getConnection();
    val maxid : Long = SQL("select max(executorStorageViewId) as maxId from executorStorageView ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;
    maxid
  }
  def getExecutorStorageViewByFkExecutorStorageId(fkColValue : Long) : List[ExecutorStorageViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[ExecutorStorageViewDto] = SQL("select * from executorStorageView where executorStorageId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[ExecutorStorageViewDto].*);
    dtos
  }

}


class ExecutorTypeDao extends DaoBase {

  def getExecutorTypesList() : List[ExecutorTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[ExecutorTypeDto]= SQL("select * from executorType").as(anorm.Macro.namedParser[ExecutorTypeDto].*);
    dtos
  }
  def getExecutorTypesCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from executorType").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getExecutorTypesLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from executorType").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getExecutorTypesLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from executorType").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getExecutorTypeFirst() : ExecutorTypeDto = {
    implicit val connection = getConnection();
    val dtos : ExecutorTypeDto= SQL("select * from executorType order by insertedRowDate asc ").as(anorm.Macro.namedParser[ExecutorTypeDto].single);
    dtos
  }
  def getExecutorTypeLast() : ExecutorTypeDto = {
    implicit val connection = getConnection();
    val dtos : ExecutorTypeDto= SQL("select * from executorType order by insertedRowDate desc ").as(anorm.Macro.namedParser[ExecutorTypeDto].single);
    dtos
  }
  def getExecutorTypeByGuid(guid : Long) : ExecutorTypeDto = {
    implicit val connection = getConnection();
    val dtos : ExecutorTypeDto= SQL("select * from executorType where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[ExecutorTypeDto].single);
    dtos
  }
  def getExecutorTypeByPk(pkColValue : Long) : List[ExecutorTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[ExecutorTypeDto] = SQL("select * from executorType where executorTypeId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[ExecutorTypeDto].*);
    dtos
  }
  def getExecutorTypeMaxId() : Long = {
    implicit val connection = getConnection();
    val maxid : Long = SQL("select max(executorTypeId) as maxId from executorType ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;
    maxid
  }
  def getExecutorTypeByName(nameColValue : String) : List[ExecutorTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[ExecutorTypeDto] = SQL("select * from executorType where executorTypeName = {nameColValue} ").on("nameColValue" -> nameColValue).as(anorm.Macro.namedParser[ExecutorTypeDto].*);
    dtos
  }
  def getExecutorTypeFirstByName(nameColValue : String) : Option[ExecutorTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[ExecutorTypeDto] = SQL("select * from executorType where executorTypeName = {nameColValue} ").on("nameColValue" -> nameColValue).as(anorm.Macro.namedParser[ExecutorTypeDto].*);
    if (dtos.size > 0) Some(dtos.head) else None
  }

}


class ResourceManagerDao extends DaoBase {

  def getResourceManagersList() : List[ResourceManagerDto] = {
    implicit val connection = getConnection();
    val dtos : List[ResourceManagerDto]= SQL("select * from resourceManager").as(anorm.Macro.namedParser[ResourceManagerDto].*);
    dtos
  }
  def getResourceManagersCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from resourceManager").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getResourceManagersLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from resourceManager").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getResourceManagersLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from resourceManager").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getResourceManagerFirst() : ResourceManagerDto = {
    implicit val connection = getConnection();
    val dtos : ResourceManagerDto= SQL("select * from resourceManager order by insertedRowDate asc ").as(anorm.Macro.namedParser[ResourceManagerDto].single);
    dtos
  }
  def getResourceManagerLast() : ResourceManagerDto = {
    implicit val connection = getConnection();
    val dtos : ResourceManagerDto= SQL("select * from resourceManager order by insertedRowDate desc ").as(anorm.Macro.namedParser[ResourceManagerDto].single);
    dtos
  }
  def getResourceManagerByGuid(guid : Long) : ResourceManagerDto = {
    implicit val connection = getConnection();
    val dtos : ResourceManagerDto= SQL("select * from resourceManager where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[ResourceManagerDto].single);
    dtos
  }
  def getResourceManagerByPk(pkColValue : Long) : List[ResourceManagerDto] = {
    implicit val connection = getConnection();
    val dtos : List[ResourceManagerDto] = SQL("select * from resourceManager where resourceManagerId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[ResourceManagerDto].*);
    dtos
  }
  def getResourceManagerMaxId() : Long = {
    implicit val connection = getConnection();
    val maxid : Long = SQL("select max(resourceManagerId) as maxId from resourceManager ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;
    maxid
  }
  def getResourceManagerByFkExecutorHostId(fkColValue : Long) : List[ResourceManagerDto] = {
    implicit val connection = getConnection();
    val dtos : List[ResourceManagerDto] = SQL("select * from resourceManager where executorHostId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[ResourceManagerDto].*);
    dtos
  }
  def getResourceManagerByFkResourceManagerTypeId(fkColValue : Long) : List[ResourceManagerDto] = {
    implicit val connection = getConnection();
    val dtos : List[ResourceManagerDto] = SQL("select * from resourceManager where resourceManagerTypeId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[ResourceManagerDto].*);
    dtos
  }

}


class ResourceManagerAllocationDao extends DaoBase {

  def getResourceManagerAllocationsList() : List[ResourceManagerAllocationDto] = {
    implicit val connection = getConnection();
    val dtos : List[ResourceManagerAllocationDto]= SQL("select * from resourceManagerAllocation").as(anorm.Macro.namedParser[ResourceManagerAllocationDto].*);
    dtos
  }
  def getResourceManagerAllocationsCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from resourceManagerAllocation").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getResourceManagerAllocationsLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from resourceManagerAllocation").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getResourceManagerAllocationsLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from resourceManagerAllocation").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getResourceManagerAllocationFirst() : ResourceManagerAllocationDto = {
    implicit val connection = getConnection();
    val dtos : ResourceManagerAllocationDto= SQL("select * from resourceManagerAllocation order by insertedRowDate asc ").as(anorm.Macro.namedParser[ResourceManagerAllocationDto].single);
    dtos
  }
  def getResourceManagerAllocationLast() : ResourceManagerAllocationDto = {
    implicit val connection = getConnection();
    val dtos : ResourceManagerAllocationDto= SQL("select * from resourceManagerAllocation order by insertedRowDate desc ").as(anorm.Macro.namedParser[ResourceManagerAllocationDto].single);
    dtos
  }
  def getResourceManagerAllocationByGuid(guid : Long) : ResourceManagerAllocationDto = {
    implicit val connection = getConnection();
    val dtos : ResourceManagerAllocationDto= SQL("select * from resourceManagerAllocation where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[ResourceManagerAllocationDto].single);
    dtos
  }
  def getResourceManagerAllocationByPk(pkColValue : Long) : List[ResourceManagerAllocationDto] = {
    implicit val connection = getConnection();
    val dtos : List[ResourceManagerAllocationDto] = SQL("select * from resourceManagerAllocation where resourceManagerAllocationId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[ResourceManagerAllocationDto].*);
    dtos
  }
  def getResourceManagerAllocationMaxId() : Long = {
    implicit val connection = getConnection();
    val maxid : Long = SQL("select max(resourceManagerAllocationId) as maxId from resourceManagerAllocation ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;
    maxid
  }

}


class ResourceManagerCheckDao extends DaoBase {

  def getResourceManagerChecksList() : List[ResourceManagerCheckDto] = {
    implicit val connection = getConnection();
    val dtos : List[ResourceManagerCheckDto]= SQL("select * from resourceManagerCheck").as(anorm.Macro.namedParser[ResourceManagerCheckDto].*);
    dtos
  }
  def getResourceManagerChecksCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from resourceManagerCheck").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getResourceManagerChecksLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from resourceManagerCheck").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getResourceManagerChecksLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from resourceManagerCheck").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getResourceManagerCheckFirst() : ResourceManagerCheckDto = {
    implicit val connection = getConnection();
    val dtos : ResourceManagerCheckDto= SQL("select * from resourceManagerCheck order by insertedRowDate asc ").as(anorm.Macro.namedParser[ResourceManagerCheckDto].single);
    dtos
  }
  def getResourceManagerCheckLast() : ResourceManagerCheckDto = {
    implicit val connection = getConnection();
    val dtos : ResourceManagerCheckDto= SQL("select * from resourceManagerCheck order by insertedRowDate desc ").as(anorm.Macro.namedParser[ResourceManagerCheckDto].single);
    dtos
  }
  def getResourceManagerCheckByGuid(guid : Long) : ResourceManagerCheckDto = {
    implicit val connection = getConnection();
    val dtos : ResourceManagerCheckDto= SQL("select * from resourceManagerCheck where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[ResourceManagerCheckDto].single);
    dtos
  }
  def getResourceManagerCheckByPk(pkColValue : Long) : List[ResourceManagerCheckDto] = {
    implicit val connection = getConnection();
    val dtos : List[ResourceManagerCheckDto] = SQL("select * from resourceManagerCheck where resourceManagerCheckId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[ResourceManagerCheckDto].*);
    dtos
  }
  def getResourceManagerCheckMaxId() : Long = {
    implicit val connection = getConnection();
    val maxid : Long = SQL("select max(resourceManagerCheckId) as maxId from resourceManagerCheck ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;
    maxid
  }

}


class ResourceManagerMeasureDao extends DaoBase {

  def getResourceManagerMeasuresList() : List[ResourceManagerMeasureDto] = {
    implicit val connection = getConnection();
    val dtos : List[ResourceManagerMeasureDto]= SQL("select * from resourceManagerMeasure").as(anorm.Macro.namedParser[ResourceManagerMeasureDto].*);
    dtos
  }
  def getResourceManagerMeasuresCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from resourceManagerMeasure").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getResourceManagerMeasuresLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from resourceManagerMeasure").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getResourceManagerMeasuresLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from resourceManagerMeasure").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getResourceManagerMeasureFirst() : ResourceManagerMeasureDto = {
    implicit val connection = getConnection();
    val dtos : ResourceManagerMeasureDto= SQL("select * from resourceManagerMeasure order by insertedRowDate asc ").as(anorm.Macro.namedParser[ResourceManagerMeasureDto].single);
    dtos
  }
  def getResourceManagerMeasureLast() : ResourceManagerMeasureDto = {
    implicit val connection = getConnection();
    val dtos : ResourceManagerMeasureDto= SQL("select * from resourceManagerMeasure order by insertedRowDate desc ").as(anorm.Macro.namedParser[ResourceManagerMeasureDto].single);
    dtos
  }
  def getResourceManagerMeasureByGuid(guid : Long) : ResourceManagerMeasureDto = {
    implicit val connection = getConnection();
    val dtos : ResourceManagerMeasureDto= SQL("select * from resourceManagerMeasure where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[ResourceManagerMeasureDto].single);
    dtos
  }
  def getResourceManagerMeasureByPk(pkColValue : Long) : List[ResourceManagerMeasureDto] = {
    implicit val connection = getConnection();
    val dtos : List[ResourceManagerMeasureDto] = SQL("select * from resourceManagerMeasure where resourceManagerMeasureId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[ResourceManagerMeasureDto].*);
    dtos
  }
  def getResourceManagerMeasureMaxId() : Long = {
    implicit val connection = getConnection();
    val maxid : Long = SQL("select max(resourceManagerMeasureId) as maxId from resourceManagerMeasure ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;
    maxid
  }
  def getResourceManagerMeasureByFkResourceManagerId(fkColValue : Long) : List[ResourceManagerMeasureDto] = {
    implicit val connection = getConnection();
    val dtos : List[ResourceManagerMeasureDto] = SQL("select * from resourceManagerMeasure where resourceManagerId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[ResourceManagerMeasureDto].*);
    dtos
  }
  def getResourceManagerMeasureByFkResourceMeasureId(fkColValue : Long) : List[ResourceManagerMeasureDto] = {
    implicit val connection = getConnection();
    val dtos : List[ResourceManagerMeasureDto] = SQL("select * from resourceManagerMeasure where resourceMeasureId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[ResourceManagerMeasureDto].*);
    dtos
  }

}


class ResourceManagerTypeDao extends DaoBase {

  def getResourceManagerTypesList() : List[ResourceManagerTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[ResourceManagerTypeDto]= SQL("select * from resourceManagerType").as(anorm.Macro.namedParser[ResourceManagerTypeDto].*);
    dtos
  }
  def getResourceManagerTypesCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from resourceManagerType").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getResourceManagerTypesLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from resourceManagerType").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getResourceManagerTypesLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from resourceManagerType").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getResourceManagerTypeFirst() : ResourceManagerTypeDto = {
    implicit val connection = getConnection();
    val dtos : ResourceManagerTypeDto= SQL("select * from resourceManagerType order by insertedRowDate asc ").as(anorm.Macro.namedParser[ResourceManagerTypeDto].single);
    dtos
  }
  def getResourceManagerTypeLast() : ResourceManagerTypeDto = {
    implicit val connection = getConnection();
    val dtos : ResourceManagerTypeDto= SQL("select * from resourceManagerType order by insertedRowDate desc ").as(anorm.Macro.namedParser[ResourceManagerTypeDto].single);
    dtos
  }
  def getResourceManagerTypeByGuid(guid : Long) : ResourceManagerTypeDto = {
    implicit val connection = getConnection();
    val dtos : ResourceManagerTypeDto= SQL("select * from resourceManagerType where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[ResourceManagerTypeDto].single);
    dtos
  }
  def getResourceManagerTypeByPk(pkColValue : Long) : List[ResourceManagerTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[ResourceManagerTypeDto] = SQL("select * from resourceManagerType where resourceManagerTypeId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[ResourceManagerTypeDto].*);
    dtos
  }
  def getResourceManagerTypeMaxId() : Long = {
    implicit val connection = getConnection();
    val maxid : Long = SQL("select max(resourceManagerTypeId) as maxId from resourceManagerType ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;
    maxid
  }
  def getResourceManagerTypeByName(nameColValue : String) : List[ResourceManagerTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[ResourceManagerTypeDto] = SQL("select * from resourceManagerType where resourceManagerTypeName = {nameColValue} ").on("nameColValue" -> nameColValue).as(anorm.Macro.namedParser[ResourceManagerTypeDto].*);
    dtos
  }
  def getResourceManagerTypeFirstByName(nameColValue : String) : Option[ResourceManagerTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[ResourceManagerTypeDto] = SQL("select * from resourceManagerType where resourceManagerTypeName = {nameColValue} ").on("nameColValue" -> nameColValue).as(anorm.Macro.namedParser[ResourceManagerTypeDto].*);
    if (dtos.size > 0) Some(dtos.head) else None
  }

}


class ResourceMeasureDao extends DaoBase {

  def getResourceMeasuresList() : List[ResourceMeasureDto] = {
    implicit val connection = getConnection();
    val dtos : List[ResourceMeasureDto]= SQL("select * from resourceMeasure").as(anorm.Macro.namedParser[ResourceMeasureDto].*);
    dtos
  }
  def getResourceMeasuresCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from resourceMeasure").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getResourceMeasuresLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from resourceMeasure").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getResourceMeasuresLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from resourceMeasure").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getResourceMeasureFirst() : ResourceMeasureDto = {
    implicit val connection = getConnection();
    val dtos : ResourceMeasureDto= SQL("select * from resourceMeasure order by insertedRowDate asc ").as(anorm.Macro.namedParser[ResourceMeasureDto].single);
    dtos
  }
  def getResourceMeasureLast() : ResourceMeasureDto = {
    implicit val connection = getConnection();
    val dtos : ResourceMeasureDto= SQL("select * from resourceMeasure order by insertedRowDate desc ").as(anorm.Macro.namedParser[ResourceMeasureDto].single);
    dtos
  }
  def getResourceMeasureByGuid(guid : Long) : ResourceMeasureDto = {
    implicit val connection = getConnection();
    val dtos : ResourceMeasureDto= SQL("select * from resourceMeasure where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[ResourceMeasureDto].single);
    dtos
  }
  def getResourceMeasureByPk(pkColValue : Long) : List[ResourceMeasureDto] = {
    implicit val connection = getConnection();
    val dtos : List[ResourceMeasureDto] = SQL("select * from resourceMeasure where resourceMeasureId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[ResourceMeasureDto].*);
    dtos
  }
  def getResourceMeasureMaxId() : Long = {
    implicit val connection = getConnection();
    val maxid : Long = SQL("select max(resourceMeasureId) as maxId from resourceMeasure ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;
    maxid
  }
  def getResourceMeasureByName(nameColValue : String) : List[ResourceMeasureDto] = {
    implicit val connection = getConnection();
    val dtos : List[ResourceMeasureDto] = SQL("select * from resourceMeasure where resourceMeasureName = {nameColValue} ").on("nameColValue" -> nameColValue).as(anorm.Macro.namedParser[ResourceMeasureDto].*);
    dtos
  }
  def getResourceMeasureFirstByName(nameColValue : String) : Option[ResourceMeasureDto] = {
    implicit val connection = getConnection();
    val dtos : List[ResourceMeasureDto] = SQL("select * from resourceMeasure where resourceMeasureName = {nameColValue} ").on("nameColValue" -> nameColValue).as(anorm.Macro.namedParser[ResourceMeasureDto].*);
    if (dtos.size > 0) Some(dtos.head) else None
  }

}


class SourceDownloadDao extends DaoBase {

  def getSourceDownloadsList() : List[SourceDownloadDto] = {
    implicit val connection = getConnection();
    val dtos : List[SourceDownloadDto]= SQL("select * from sourceDownload").as(anorm.Macro.namedParser[SourceDownloadDto].*);
    dtos
  }
  def getSourceDownloadsCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from sourceDownload").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getSourceDownloadsLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from sourceDownload").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getSourceDownloadsLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from sourceDownload").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getSourceDownloadFirst() : SourceDownloadDto = {
    implicit val connection = getConnection();
    val dtos : SourceDownloadDto= SQL("select * from sourceDownload order by insertedRowDate asc ").as(anorm.Macro.namedParser[SourceDownloadDto].single);
    dtos
  }
  def getSourceDownloadLast() : SourceDownloadDto = {
    implicit val connection = getConnection();
    val dtos : SourceDownloadDto= SQL("select * from sourceDownload order by insertedRowDate desc ").as(anorm.Macro.namedParser[SourceDownloadDto].single);
    dtos
  }
  def getSourceDownloadByGuid(guid : Long) : SourceDownloadDto = {
    implicit val connection = getConnection();
    val dtos : SourceDownloadDto= SQL("select * from sourceDownload where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[SourceDownloadDto].single);
    dtos
  }
  def getSourceDownloadByPk(pkColValue : Long) : List[SourceDownloadDto] = {
    implicit val connection = getConnection();
    val dtos : List[SourceDownloadDto] = SQL("select * from sourceDownload where sourceDownloadId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[SourceDownloadDto].*);
    dtos
  }
  def getSourceDownloadMaxId() : Long = {
    implicit val connection = getConnection();
    val maxid : Long = SQL("select max(sourceDownloadId) as maxId from sourceDownload ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;
    maxid
  }
  def getSourceDownloadByFkSourceScheduleId(fkColValue : Long) : List[SourceDownloadDto] = {
    implicit val connection = getConnection();
    val dtos : List[SourceDownloadDto] = SQL("select * from sourceDownload where sourceScheduleId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[SourceDownloadDto].*);
    dtos
  }

}


class SourceDownloadStatDao extends DaoBase {

  def getSourceDownloadStatsList() : List[SourceDownloadStatDto] = {
    implicit val connection = getConnection();
    val dtos : List[SourceDownloadStatDto]= SQL("select * from sourceDownloadStat").as(anorm.Macro.namedParser[SourceDownloadStatDto].*);
    dtos
  }
  def getSourceDownloadStatsCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from sourceDownloadStat").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getSourceDownloadStatsLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from sourceDownloadStat").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getSourceDownloadStatsLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from sourceDownloadStat").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getSourceDownloadStatFirst() : SourceDownloadStatDto = {
    implicit val connection = getConnection();
    val dtos : SourceDownloadStatDto= SQL("select * from sourceDownloadStat order by insertedRowDate asc ").as(anorm.Macro.namedParser[SourceDownloadStatDto].single);
    dtos
  }
  def getSourceDownloadStatLast() : SourceDownloadStatDto = {
    implicit val connection = getConnection();
    val dtos : SourceDownloadStatDto= SQL("select * from sourceDownloadStat order by insertedRowDate desc ").as(anorm.Macro.namedParser[SourceDownloadStatDto].single);
    dtos
  }
  def getSourceDownloadStatByGuid(guid : Long) : SourceDownloadStatDto = {
    implicit val connection = getConnection();
    val dtos : SourceDownloadStatDto= SQL("select * from sourceDownloadStat where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[SourceDownloadStatDto].single);
    dtos
  }
  def getSourceDownloadStatByPk(pkColValue : Long) : List[SourceDownloadStatDto] = {
    implicit val connection = getConnection();
    val dtos : List[SourceDownloadStatDto] = SQL("select * from sourceDownloadStat where sourceDownloadStatId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[SourceDownloadStatDto].*);
    dtos
  }
  def getSourceDownloadStatMaxId() : Long = {
    implicit val connection = getConnection();
    val maxid : Long = SQL("select max(sourceDownloadStatId) as maxId from sourceDownloadStat ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;
    maxid
  }
  def getSourceDownloadStatByFkSourceDownloadId(fkColValue : Long) : List[SourceDownloadStatDto] = {
    implicit val connection = getConnection();
    val dtos : List[SourceDownloadStatDto] = SQL("select * from sourceDownloadStat where sourceDownloadId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[SourceDownloadStatDto].*);
    dtos
  }

}


class SourceDownloadStatColumnDao extends DaoBase {

  def getSourceDownloadStatColumnsList() : List[SourceDownloadStatColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[SourceDownloadStatColumnDto]= SQL("select * from sourceDownloadStatColumn").as(anorm.Macro.namedParser[SourceDownloadStatColumnDto].*);
    dtos
  }
  def getSourceDownloadStatColumnsCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from sourceDownloadStatColumn").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getSourceDownloadStatColumnsLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from sourceDownloadStatColumn").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getSourceDownloadStatColumnsLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from sourceDownloadStatColumn").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getSourceDownloadStatColumnFirst() : SourceDownloadStatColumnDto = {
    implicit val connection = getConnection();
    val dtos : SourceDownloadStatColumnDto= SQL("select * from sourceDownloadStatColumn order by insertedRowDate asc ").as(anorm.Macro.namedParser[SourceDownloadStatColumnDto].single);
    dtos
  }
  def getSourceDownloadStatColumnLast() : SourceDownloadStatColumnDto = {
    implicit val connection = getConnection();
    val dtos : SourceDownloadStatColumnDto= SQL("select * from sourceDownloadStatColumn order by insertedRowDate desc ").as(anorm.Macro.namedParser[SourceDownloadStatColumnDto].single);
    dtos
  }
  def getSourceDownloadStatColumnByGuid(guid : Long) : SourceDownloadStatColumnDto = {
    implicit val connection = getConnection();
    val dtos : SourceDownloadStatColumnDto= SQL("select * from sourceDownloadStatColumn where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[SourceDownloadStatColumnDto].single);
    dtos
  }
  def getSourceDownloadStatColumnByPk(pkColValue : Long) : List[SourceDownloadStatColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[SourceDownloadStatColumnDto] = SQL("select * from sourceDownloadStatColumn where sourceDownloadStatColumnId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[SourceDownloadStatColumnDto].*);
    dtos
  }
  def getSourceDownloadStatColumnMaxId() : Long = {
    implicit val connection = getConnection();
    val maxid : Long = SQL("select max(sourceDownloadStatColumnId) as maxId from sourceDownloadStatColumn ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;
    maxid
  }
  def getSourceDownloadStatColumnByFkSourceDownloadId(fkColValue : Long) : List[SourceDownloadStatColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[SourceDownloadStatColumnDto] = SQL("select * from sourceDownloadStatColumn where sourceDownloadId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[SourceDownloadStatColumnDto].*);
    dtos
  }
  def getSourceDownloadStatColumnByFkSourceViewColumnId(fkColValue : Long) : List[SourceDownloadStatColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[SourceDownloadStatColumnDto] = SQL("select * from sourceDownloadStatColumn where sourceViewColumnId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[SourceDownloadStatColumnDto].*);
    dtos
  }

}


class SourceInstanceDao extends DaoBase {

  def getSourceInstancesList() : List[SourceInstanceDto] = {
    implicit val connection = getConnection();
    val dtos : List[SourceInstanceDto]= SQL("select * from sourceInstance").as(anorm.Macro.namedParser[SourceInstanceDto].*);
    dtos
  }
  def getSourceInstancesCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from sourceInstance").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getSourceInstancesLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from sourceInstance").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getSourceInstancesLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from sourceInstance").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getSourceInstanceFirst() : SourceInstanceDto = {
    implicit val connection = getConnection();
    val dtos : SourceInstanceDto= SQL("select * from sourceInstance order by insertedRowDate asc ").as(anorm.Macro.namedParser[SourceInstanceDto].single);
    dtos
  }
  def getSourceInstanceLast() : SourceInstanceDto = {
    implicit val connection = getConnection();
    val dtos : SourceInstanceDto= SQL("select * from sourceInstance order by insertedRowDate desc ").as(anorm.Macro.namedParser[SourceInstanceDto].single);
    dtos
  }
  def getSourceInstanceByGuid(guid : Long) : SourceInstanceDto = {
    implicit val connection = getConnection();
    val dtos : SourceInstanceDto= SQL("select * from sourceInstance where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[SourceInstanceDto].single);
    dtos
  }
  def getSourceInstanceByPk(pkColValue : Long) : List[SourceInstanceDto] = {
    implicit val connection = getConnection();
    val dtos : List[SourceInstanceDto] = SQL("select * from sourceInstance where sourceInstanceId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[SourceInstanceDto].*);
    dtos
  }
  def getSourceInstanceMaxId() : Long = {
    implicit val connection = getConnection();
    val maxid : Long = SQL("select max(sourceInstanceId) as maxId from sourceInstance ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;
    maxid
  }
  def getSourceInstanceByFkSourceTypeId(fkColValue : Long) : List[SourceInstanceDto] = {
    implicit val connection = getConnection();
    val dtos : List[SourceInstanceDto] = SQL("select * from sourceInstance where sourceTypeId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[SourceInstanceDto].*);
    dtos
  }
  def getSourceInstanceByName(nameColValue : String) : List[SourceInstanceDto] = {
    implicit val connection = getConnection();
    val dtos : List[SourceInstanceDto] = SQL("select * from sourceInstance where sourceInstanceName = {nameColValue} ").on("nameColValue" -> nameColValue).as(anorm.Macro.namedParser[SourceInstanceDto].*);
    dtos
  }
  def getSourceInstanceFirstByName(nameColValue : String) : Option[SourceInstanceDto] = {
    implicit val connection = getConnection();
    val dtos : List[SourceInstanceDto] = SQL("select * from sourceInstance where sourceInstanceName = {nameColValue} ").on("nameColValue" -> nameColValue).as(anorm.Macro.namedParser[SourceInstanceDto].*);
    if (dtos.size > 0) Some(dtos.head) else None
  }

}


class SourceParamDao extends DaoBase {

  def getSourceParamsList() : List[SourceParamDto] = {
    implicit val connection = getConnection();
    val dtos : List[SourceParamDto]= SQL("select * from sourceParam").as(anorm.Macro.namedParser[SourceParamDto].*);
    dtos
  }
  def getSourceParamsCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from sourceParam").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getSourceParamsLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from sourceParam").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getSourceParamsLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from sourceParam").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getSourceParamFirst() : SourceParamDto = {
    implicit val connection = getConnection();
    val dtos : SourceParamDto= SQL("select * from sourceParam order by insertedRowDate asc ").as(anorm.Macro.namedParser[SourceParamDto].single);
    dtos
  }
  def getSourceParamLast() : SourceParamDto = {
    implicit val connection = getConnection();
    val dtos : SourceParamDto= SQL("select * from sourceParam order by insertedRowDate desc ").as(anorm.Macro.namedParser[SourceParamDto].single);
    dtos
  }
  def getSourceParamByGuid(guid : Long) : SourceParamDto = {
    implicit val connection = getConnection();
    val dtos : SourceParamDto= SQL("select * from sourceParam where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[SourceParamDto].single);
    dtos
  }
  def getSourceParamByPk(pkColValue : Long) : List[SourceParamDto] = {
    implicit val connection = getConnection();
    val dtos : List[SourceParamDto] = SQL("select * from sourceParam where sourceParamId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[SourceParamDto].*);
    dtos
  }
  def getSourceParamMaxId() : Long = {
    implicit val connection = getConnection();
    val maxid : Long = SQL("select max(sourceParamId) as maxId from sourceParam ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;
    maxid
  }
  def getSourceParamByName(nameColValue : String) : List[SourceParamDto] = {
    implicit val connection = getConnection();
    val dtos : List[SourceParamDto] = SQL("select * from sourceParam where sourceParamName = {nameColValue} ").on("nameColValue" -> nameColValue).as(anorm.Macro.namedParser[SourceParamDto].*);
    dtos
  }
  def getSourceParamFirstByName(nameColValue : String) : Option[SourceParamDto] = {
    implicit val connection = getConnection();
    val dtos : List[SourceParamDto] = SQL("select * from sourceParam where sourceParamName = {nameColValue} ").on("nameColValue" -> nameColValue).as(anorm.Macro.namedParser[SourceParamDto].*);
    if (dtos.size > 0) Some(dtos.head) else None
  }

}


class SourceParamValueDao extends DaoBase {

  def getSourceParamValuesList() : List[SourceParamValueDto] = {
    implicit val connection = getConnection();
    val dtos : List[SourceParamValueDto]= SQL("select * from sourceParamValue").as(anorm.Macro.namedParser[SourceParamValueDto].*);
    dtos
  }
  def getSourceParamValuesCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from sourceParamValue").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getSourceParamValuesLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from sourceParamValue").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getSourceParamValuesLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from sourceParamValue").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getSourceParamValueFirst() : SourceParamValueDto = {
    implicit val connection = getConnection();
    val dtos : SourceParamValueDto= SQL("select * from sourceParamValue order by insertedRowDate asc ").as(anorm.Macro.namedParser[SourceParamValueDto].single);
    dtos
  }
  def getSourceParamValueLast() : SourceParamValueDto = {
    implicit val connection = getConnection();
    val dtos : SourceParamValueDto= SQL("select * from sourceParamValue order by insertedRowDate desc ").as(anorm.Macro.namedParser[SourceParamValueDto].single);
    dtos
  }
  def getSourceParamValueByGuid(guid : Long) : SourceParamValueDto = {
    implicit val connection = getConnection();
    val dtos : SourceParamValueDto= SQL("select * from sourceParamValue where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[SourceParamValueDto].single);
    dtos
  }
  def getSourceParamValueByPk(pkColValue : Long) : List[SourceParamValueDto] = {
    implicit val connection = getConnection();
    val dtos : List[SourceParamValueDto] = SQL("select * from sourceParamValue where sourceParamValueId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[SourceParamValueDto].*);
    dtos
  }
  def getSourceParamValueMaxId() : Long = {
    implicit val connection = getConnection();
    val maxid : Long = SQL("select max(sourceParamValueId) as maxId from sourceParamValue ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;
    maxid
  }
  def getSourceParamValueByFkSourceInstanceId(fkColValue : Long) : List[SourceParamValueDto] = {
    implicit val connection = getConnection();
    val dtos : List[SourceParamValueDto] = SQL("select * from sourceParamValue where sourceInstanceId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[SourceParamValueDto].*);
    dtos
  }
  def getSourceParamValueByFkSourceParamId(fkColValue : Long) : List[SourceParamValueDto] = {
    implicit val connection = getConnection();
    val dtos : List[SourceParamValueDto] = SQL("select * from sourceParamValue where sourceParamId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[SourceParamValueDto].*);
    dtos
  }

}


class SourceScheduleDao extends DaoBase {

  def getSourceSchedulesList() : List[SourceScheduleDto] = {
    implicit val connection = getConnection();
    val dtos : List[SourceScheduleDto]= SQL("select * from sourceSchedule").as(anorm.Macro.namedParser[SourceScheduleDto].*);
    dtos
  }
  def getSourceSchedulesCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from sourceSchedule").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getSourceSchedulesLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from sourceSchedule").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getSourceSchedulesLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from sourceSchedule").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getSourceScheduleFirst() : SourceScheduleDto = {
    implicit val connection = getConnection();
    val dtos : SourceScheduleDto= SQL("select * from sourceSchedule order by insertedRowDate asc ").as(anorm.Macro.namedParser[SourceScheduleDto].single);
    dtos
  }
  def getSourceScheduleLast() : SourceScheduleDto = {
    implicit val connection = getConnection();
    val dtos : SourceScheduleDto= SQL("select * from sourceSchedule order by insertedRowDate desc ").as(anorm.Macro.namedParser[SourceScheduleDto].single);
    dtos
  }
  def getSourceScheduleByGuid(guid : Long) : SourceScheduleDto = {
    implicit val connection = getConnection();
    val dtos : SourceScheduleDto= SQL("select * from sourceSchedule where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[SourceScheduleDto].single);
    dtos
  }
  def getSourceScheduleByPk(pkColValue : Long) : List[SourceScheduleDto] = {
    implicit val connection = getConnection();
    val dtos : List[SourceScheduleDto] = SQL("select * from sourceSchedule where sourceScheduleId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[SourceScheduleDto].*);
    dtos
  }
  def getSourceScheduleMaxId() : Long = {
    implicit val connection = getConnection();
    val maxid : Long = SQL("select max(sourceScheduleId) as maxId from sourceSchedule ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;
    maxid
  }
  def getSourceScheduleByFkExecutorStorageId(fkColValue : Long) : List[SourceScheduleDto] = {
    implicit val connection = getConnection();
    val dtos : List[SourceScheduleDto] = SQL("select * from sourceSchedule where executorStorageId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[SourceScheduleDto].*);
    dtos
  }
  def getSourceScheduleByFkSourceViewId(fkColValue : Long) : List[SourceScheduleDto] = {
    implicit val connection = getConnection();
    val dtos : List[SourceScheduleDto] = SQL("select * from sourceSchedule where sourceViewId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[SourceScheduleDto].*);
    dtos
  }

}


class SourceTypeDao extends DaoBase {

  def getSourceTypesList() : List[SourceTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[SourceTypeDto]= SQL("select * from sourceType").as(anorm.Macro.namedParser[SourceTypeDto].*);
    dtos
  }
  def getSourceTypesCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from sourceType").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getSourceTypesLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from sourceType").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getSourceTypesLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from sourceType").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getSourceTypeFirst() : SourceTypeDto = {
    implicit val connection = getConnection();
    val dtos : SourceTypeDto= SQL("select * from sourceType order by insertedRowDate asc ").as(anorm.Macro.namedParser[SourceTypeDto].*).head;
    dtos
  }
  def getSourceTypeLast() : SourceTypeDto = {
    implicit val connection = getConnection();
    val dtos : SourceTypeDto= SQL("select * from sourceType order by insertedRowDate desc ").as(anorm.Macro.namedParser[SourceTypeDto].*).head;
    dtos
  }
  def getSourceTypeByGuid(guid : Long) : SourceTypeDto = {
    implicit val connection = getConnection();
    val dtos : SourceTypeDto= SQL("select * from sourceType where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[SourceTypeDto].single);
    dtos
  }
  def getSourceTypeByPk(pkColValue : Long) : List[SourceTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[SourceTypeDto] = SQL("select * from sourceType where sourceTypeId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[SourceTypeDto].*);
    dtos
  }
  def getSourceTypeMaxId() : Long = {
    implicit val connection = getConnection();
    val maxid : Long = SQL("select max(sourceTypeId) as maxId from sourceType ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;
    maxid
  }
  def getSourceTypeByName(nameColValue : String) : List[SourceTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[SourceTypeDto] = SQL("select * from sourceType where sourceTypeName = {nameColValue} ").on("nameColValue" -> nameColValue).as(anorm.Macro.namedParser[SourceTypeDto].*);
    dtos
  }
  def getSourceTypeFirstByName(nameColValue : String) : Option[SourceTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[SourceTypeDto] = SQL("select * from sourceType where sourceTypeName = {nameColValue} ").on("nameColValue" -> nameColValue).as(anorm.Macro.namedParser[SourceTypeDto].*);
    if (dtos.size > 0) Some(dtos.head) else None
  }

}


class SourceTypeParamDao extends DaoBase {

  def getSourceTypeParamsList() : List[SourceTypeParamDto] = {
    implicit val connection = getConnection();
    val dtos : List[SourceTypeParamDto]= SQL("select * from sourceTypeParam").as(anorm.Macro.namedParser[SourceTypeParamDto].*);
    dtos
  }
  def getSourceTypeParamsCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from sourceTypeParam").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getSourceTypeParamsLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from sourceTypeParam").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getSourceTypeParamsLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from sourceTypeParam").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getSourceTypeParamFirst() : SourceTypeParamDto = {
    implicit val connection = getConnection();
    val dtos : SourceTypeParamDto= SQL("select * from sourceTypeParam order by insertedRowDate asc ").as(anorm.Macro.namedParser[SourceTypeParamDto].single);
    dtos
  }
  def getSourceTypeParamLast() : SourceTypeParamDto = {
    implicit val connection = getConnection();
    val dtos : SourceTypeParamDto= SQL("select * from sourceTypeParam order by insertedRowDate desc ").as(anorm.Macro.namedParser[SourceTypeParamDto].single);
    dtos
  }
  def getSourceTypeParamByGuid(guid : Long) : SourceTypeParamDto = {
    implicit val connection = getConnection();
    val dtos : SourceTypeParamDto= SQL("select * from sourceTypeParam where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[SourceTypeParamDto].single);
    dtos
  }
  def getSourceTypeParamByPk(pkColValue : Long) : List[SourceTypeParamDto] = {
    implicit val connection = getConnection();
    val dtos : List[SourceTypeParamDto] = SQL("select * from sourceTypeParam where sourceTypeParamId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[SourceTypeParamDto].*);
    dtos
  }
  def getSourceTypeParamMaxId() : Long = {
    implicit val connection = getConnection();
    val maxid : Long = SQL("select max(sourceTypeParamId) as maxId from sourceTypeParam ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;
    maxid
  }
  def getSourceTypeParamByFkSourceParamId(fkColValue : Long) : List[SourceTypeParamDto] = {
    implicit val connection = getConnection();
    val dtos : List[SourceTypeParamDto] = SQL("select * from sourceTypeParam where sourceParamId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[SourceTypeParamDto].*);
    dtos
  }
  def getSourceTypeParamByFkSourceTypeId(fkColValue : Long) : List[SourceTypeParamDto] = {
    implicit val connection = getConnection();
    val dtos : List[SourceTypeParamDto] = SQL("select * from sourceTypeParam where sourceTypeId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[SourceTypeParamDto].*);
    dtos
  }

}


class SourceViewDao extends DaoBase {

  def getSourceViewsList() : List[SourceViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[SourceViewDto]= SQL("select * from sourceView").as(anorm.Macro.namedParser[SourceViewDto].*);
    dtos
  }
  def getSourceViewsCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from sourceView").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getSourceViewsLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from sourceView").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getSourceViewsLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from sourceView").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getSourceViewFirst() : SourceViewDto = {
    implicit val connection = getConnection();
    val dtos : SourceViewDto= SQL("select * from sourceView order by insertedRowDate asc ").as(anorm.Macro.namedParser[SourceViewDto].single);
    dtos
  }
  def getSourceViewLast() : SourceViewDto = {
    implicit val connection = getConnection();
    val dtos : SourceViewDto= SQL("select * from sourceView order by insertedRowDate desc ").as(anorm.Macro.namedParser[SourceViewDto].single);
    dtos
  }
  def getSourceViewByGuid(guid : Long) : SourceViewDto = {
    implicit val connection = getConnection();
    val dtos : SourceViewDto= SQL("select * from sourceView where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[SourceViewDto].single);
    dtos
  }
  def getSourceViewByPk(pkColValue : Long) : List[SourceViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[SourceViewDto] = SQL("select * from sourceView where sourceViewId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[SourceViewDto].*);
    dtos
  }
  def getSourceViewMaxId() : Long = {
    implicit val connection = getConnection();
    val maxid : Long = SQL("select max(sourceViewId) as maxId from sourceView ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;
    maxid
  }
  def getSourceViewByFkSourceInstanceId(fkColValue : Long) : List[SourceViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[SourceViewDto] = SQL("select * from sourceView where sourceInstanceId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[SourceViewDto].*);
    dtos
  }
  def getSourceViewByFkSourceViewTypeId(fkColValue : Long) : List[SourceViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[SourceViewDto] = SQL("select * from sourceView where sourceViewTypeId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[SourceViewDto].*);
    dtos
  }
  def getSourceViewByName(nameColValue : String) : List[SourceViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[SourceViewDto] = SQL("select * from sourceView where sourceViewName = {nameColValue} ").on("nameColValue" -> nameColValue).as(anorm.Macro.namedParser[SourceViewDto].*);
    dtos
  }
  def getSourceViewFirstByName(nameColValue : String) : Option[SourceViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[SourceViewDto] = SQL("select * from sourceView where sourceViewName = {nameColValue} ").on("nameColValue" -> nameColValue).as(anorm.Macro.namedParser[SourceViewDto].*);
    if (dtos.size > 0) Some(dtos.head) else None
  }

}


class SourceViewColumnDao extends DaoBase {

  def getSourceViewColumnsList() : List[SourceViewColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[SourceViewColumnDto]= SQL("select * from sourceViewColumn").as(anorm.Macro.namedParser[SourceViewColumnDto].*);
    dtos
  }
  def getSourceViewColumnsCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from sourceViewColumn").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getSourceViewColumnsLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from sourceViewColumn").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getSourceViewColumnsLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from sourceViewColumn").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getSourceViewColumnFirst() : SourceViewColumnDto = {
    implicit val connection = getConnection();
    val dtos : SourceViewColumnDto= SQL("select * from sourceViewColumn order by insertedRowDate asc ").as(anorm.Macro.namedParser[SourceViewColumnDto].single);
    dtos
  }
  def getSourceViewColumnLast() : SourceViewColumnDto = {
    implicit val connection = getConnection();
    val dtos : SourceViewColumnDto= SQL("select * from sourceViewColumn order by insertedRowDate desc ").as(anorm.Macro.namedParser[SourceViewColumnDto].single);
    dtos
  }
  def getSourceViewColumnByGuid(guid : Long) : SourceViewColumnDto = {
    implicit val connection = getConnection();
    val dtos : SourceViewColumnDto= SQL("select * from sourceViewColumn where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[SourceViewColumnDto].single);
    dtos
  }
  def getSourceViewColumnByPk(pkColValue : Long) : List[SourceViewColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[SourceViewColumnDto] = SQL("select * from sourceViewColumn where sourceViewColumnId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[SourceViewColumnDto].*);
    dtos
  }
  def getSourceViewColumnMaxId() : Long = {
    implicit val connection = getConnection();
    val maxid : Long = SQL("select max(sourceViewColumnId) as maxId from sourceViewColumn ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;
    maxid
  }
  def getSourceViewColumnByFkSourceViewId(fkColValue : Long) : List[SourceViewColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[SourceViewColumnDto] = SQL("select * from sourceViewColumn where sourceViewId = {fkColValue} ").on("fkColValue" -> fkColValue).as(anorm.Macro.namedParser[SourceViewColumnDto].*);
    dtos
  }

}


class SourceViewTypeDao extends DaoBase {

  def getSourceViewTypesList() : List[SourceViewTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[SourceViewTypeDto]= SQL("select * from sourceViewType").as(anorm.Macro.namedParser[SourceViewTypeDto].*);
    dtos
  }
  def getSourceViewTypesCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from sourceViewType").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getSourceViewTypesLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from sourceViewType").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getSourceViewTypesLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from sourceViewType").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getSourceViewTypeFirst() : SourceViewTypeDto = {
    implicit val connection = getConnection();
    val dtos : SourceViewTypeDto= SQL("select * from sourceViewType order by insertedRowDate asc ").as(anorm.Macro.namedParser[SourceViewTypeDto].single);
    dtos
  }
  def getSourceViewTypeLast() : SourceViewTypeDto = {
    implicit val connection = getConnection();
    val dtos : SourceViewTypeDto= SQL("select * from sourceViewType order by insertedRowDate desc ").as(anorm.Macro.namedParser[SourceViewTypeDto].single);
    dtos
  }
  def getSourceViewTypeByGuid(guid : Long) : SourceViewTypeDto = {
    implicit val connection = getConnection();
    val dtos : SourceViewTypeDto= SQL("select * from sourceViewType where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[SourceViewTypeDto].single);
    dtos
  }
  def getSourceViewTypeByPk(pkColValue : Long) : List[SourceViewTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[SourceViewTypeDto] = SQL("select * from sourceViewType where sourceViewTypeId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[SourceViewTypeDto].*);
    dtos
  }
  def getSourceViewTypeMaxId() : Long = {
    implicit val connection = getConnection();
    val maxid : Long = SQL("select max(sourceViewTypeId) as maxId from sourceViewType ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;
    maxid
  }
  def getSourceViewTypeByName(nameColValue : String) : List[SourceViewTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[SourceViewTypeDto] = SQL("select * from sourceViewType where sourceViewTypeName = {nameColValue} ").on("nameColValue" -> nameColValue).as(anorm.Macro.namedParser[SourceViewTypeDto].*);
    dtos
  }
  def getSourceViewTypeFirstByName(nameColValue : String) : Option[SourceViewTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[SourceViewTypeDto] = SQL("select * from sourceViewType where sourceViewTypeName = {nameColValue} ").on("nameColValue" -> nameColValue).as(anorm.Macro.namedParser[SourceViewTypeDto].*);
    if (dtos.size > 0) Some(dtos.head) else None
  }

}


class VAlgorithmImplementationDao extends DaoBase {

  def getVAlgorithmImplementationsList() : List[VAlgorithmImplementationDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmImplementationDto]= SQL("select * from vAlgorithmImplementation").as(anorm.Macro.namedParser[VAlgorithmImplementationDto].*);
    dtos
  }
  def getVAlgorithmImplementationsCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from vAlgorithmImplementation").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getVAlgorithmImplementationsLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from vAlgorithmImplementation").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getVAlgorithmImplementationsLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from vAlgorithmImplementation").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getVAlgorithmImplementationFirst() : VAlgorithmImplementationDto = {
    implicit val connection = getConnection();
    val dtos : VAlgorithmImplementationDto= SQL("select * from vAlgorithmImplementation order by insertedRowDate asc ").as(anorm.Macro.namedParser[VAlgorithmImplementationDto].single);
    dtos
  }
  def getVAlgorithmImplementationLast() : VAlgorithmImplementationDto = {
    implicit val connection = getConnection();
    val dtos : VAlgorithmImplementationDto= SQL("select * from vAlgorithmImplementation order by insertedRowDate desc ").as(anorm.Macro.namedParser[VAlgorithmImplementationDto].single);
    dtos
  }
  def getVAlgorithmImplementationByGuid(guid : Long) : VAlgorithmImplementationDto = {
    implicit val connection = getConnection();
    val dtos : VAlgorithmImplementationDto= SQL("select * from vAlgorithmImplementation where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VAlgorithmImplementationDto].single);
    dtos
  }

}


class VAlgorithmParamTypeDao extends DaoBase {

  def getVAlgorithmParamTypesList() : List[VAlgorithmParamTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmParamTypeDto]= SQL("select * from vAlgorithmParamType").as(anorm.Macro.namedParser[VAlgorithmParamTypeDto].*);
    dtos
  }
  def getVAlgorithmParamTypesCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from vAlgorithmParamType").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getVAlgorithmParamTypesLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from vAlgorithmParamType").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getVAlgorithmParamTypesLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from vAlgorithmParamType").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getVAlgorithmParamTypeFirst() : VAlgorithmParamTypeDto = {
    implicit val connection = getConnection();
    val dtos : VAlgorithmParamTypeDto= SQL("select * from vAlgorithmParamType order by insertedRowDate asc ").as(anorm.Macro.namedParser[VAlgorithmParamTypeDto].single);
    dtos
  }
  def getVAlgorithmParamTypeLast() : VAlgorithmParamTypeDto = {
    implicit val connection = getConnection();
    val dtos : VAlgorithmParamTypeDto= SQL("select * from vAlgorithmParamType order by insertedRowDate desc ").as(anorm.Macro.namedParser[VAlgorithmParamTypeDto].single);
    dtos
  }
  def getVAlgorithmParamTypeByGuid(guid : Long) : VAlgorithmParamTypeDto = {
    implicit val connection = getConnection();
    val dtos : VAlgorithmParamTypeDto= SQL("select * from vAlgorithmParamType where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VAlgorithmParamTypeDto].single);
    dtos
  }

}


class VAlgorithmRunDao extends DaoBase {

  def getVAlgorithmRunsList() : List[VAlgorithmRunDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunDto]= SQL("select * from vAlgorithmRun").as(anorm.Macro.namedParser[VAlgorithmRunDto].*);
    dtos
  }
  def getVAlgorithmRunsCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from vAlgorithmRun").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getVAlgorithmRunsLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from vAlgorithmRun").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getVAlgorithmRunsLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from vAlgorithmRun").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getVAlgorithmRunFirst() : VAlgorithmRunDto = {
    implicit val connection = getConnection();
    val dtos : VAlgorithmRunDto= SQL("select * from vAlgorithmRun order by insertedRowDate asc ").as(anorm.Macro.namedParser[VAlgorithmRunDto].single);
    dtos
  }
  def getVAlgorithmRunLast() : VAlgorithmRunDto = {
    implicit val connection = getConnection();
    val dtos : VAlgorithmRunDto= SQL("select * from vAlgorithmRun order by insertedRowDate desc ").as(anorm.Macro.namedParser[VAlgorithmRunDto].single);
    dtos
  }
  def getVAlgorithmRunByGuid(guid : Long) : VAlgorithmRunDto = {
    implicit val connection = getConnection();
    val dtos : VAlgorithmRunDto= SQL("select * from vAlgorithmRun where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VAlgorithmRunDto].single);
    dtos
  }

}


class VAlgorithmRunViewDao extends DaoBase {

  def getVAlgorithmRunViewsList() : List[VAlgorithmRunViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunViewDto]= SQL("select * from vAlgorithmRunView").as(anorm.Macro.namedParser[VAlgorithmRunViewDto].*);
    dtos
  }
  def getVAlgorithmRunViewsCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from vAlgorithmRunView").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getVAlgorithmRunViewsLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from vAlgorithmRunView").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getVAlgorithmRunViewsLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from vAlgorithmRunView").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getVAlgorithmRunViewFirst() : VAlgorithmRunViewDto = {
    implicit val connection = getConnection();
    val dtos : VAlgorithmRunViewDto= SQL("select * from vAlgorithmRunView order by insertedRowDate asc ").as(anorm.Macro.namedParser[VAlgorithmRunViewDto].single);
    dtos
  }
  def getVAlgorithmRunViewLast() : VAlgorithmRunViewDto = {
    implicit val connection = getConnection();
    val dtos : VAlgorithmRunViewDto= SQL("select * from vAlgorithmRunView order by insertedRowDate desc ").as(anorm.Macro.namedParser[VAlgorithmRunViewDto].single);
    dtos
  }
  def getVAlgorithmRunViewByGuid(guid : Long) : VAlgorithmRunViewDto = {
    implicit val connection = getConnection();
    val dtos : VAlgorithmRunViewDto= SQL("select * from vAlgorithmRunView where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VAlgorithmRunViewDto].single);
    dtos
  }

}


class VAlgorithmScheduleDao extends DaoBase {

  def getVAlgorithmSchedulesList() : List[VAlgorithmScheduleDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleDto]= SQL("select * from vAlgorithmSchedule").as(anorm.Macro.namedParser[VAlgorithmScheduleDto].*);
    dtos
  }
  def getVAlgorithmSchedulesCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from vAlgorithmSchedule").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getVAlgorithmSchedulesLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from vAlgorithmSchedule").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getVAlgorithmSchedulesLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from vAlgorithmSchedule").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getVAlgorithmScheduleFirst() : VAlgorithmScheduleDto = {
    implicit val connection = getConnection();
    val dtos : VAlgorithmScheduleDto= SQL("select * from vAlgorithmSchedule order by insertedRowDate asc ").as(anorm.Macro.namedParser[VAlgorithmScheduleDto].single);
    dtos
  }
  def getVAlgorithmScheduleLast() : VAlgorithmScheduleDto = {
    implicit val connection = getConnection();
    val dtos : VAlgorithmScheduleDto= SQL("select * from vAlgorithmSchedule order by insertedRowDate desc ").as(anorm.Macro.namedParser[VAlgorithmScheduleDto].single);
    dtos
  }
  def getVAlgorithmScheduleByGuid(guid : Long) : VAlgorithmScheduleDto = {
    implicit val connection = getConnection();
    val dtos : VAlgorithmScheduleDto= SQL("select * from vAlgorithmSchedule where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VAlgorithmScheduleDto].single);
    dtos
  }

}


class VAlgorithmScheduleColumnDao extends DaoBase {

  def getVAlgorithmScheduleColumnsList() : List[VAlgorithmScheduleColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleColumnDto]= SQL("select * from vAlgorithmScheduleColumn").as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);
    dtos
  }
  def getVAlgorithmScheduleColumnsCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from vAlgorithmScheduleColumn").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getVAlgorithmScheduleColumnsLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from vAlgorithmScheduleColumn").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getVAlgorithmScheduleColumnsLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from vAlgorithmScheduleColumn").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getVAlgorithmScheduleColumnFirst() : VAlgorithmScheduleColumnDto = {
    implicit val connection = getConnection();
    val dtos : VAlgorithmScheduleColumnDto= SQL("select * from vAlgorithmScheduleColumn order by insertedRowDate asc ").as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].single);
    dtos
  }
  def getVAlgorithmScheduleColumnLast() : VAlgorithmScheduleColumnDto = {
    implicit val connection = getConnection();
    val dtos : VAlgorithmScheduleColumnDto= SQL("select * from vAlgorithmScheduleColumn order by insertedRowDate desc ").as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].single);
    dtos
  }
  def getVAlgorithmScheduleColumnByGuid(guid : Long) : VAlgorithmScheduleColumnDto = {
    implicit val connection = getConnection();
    val dtos : VAlgorithmScheduleColumnDto= SQL("select * from vAlgorithmScheduleColumn where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].single);
    dtos
  }

}


class VAlgorithmScheduleParamDao extends DaoBase {

  def getVAlgorithmScheduleParamsList() : List[VAlgorithmScheduleParamDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleParamDto]= SQL("select * from vAlgorithmScheduleParam").as(anorm.Macro.namedParser[VAlgorithmScheduleParamDto].*);
    dtos
  }
  def getVAlgorithmScheduleParamsCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from vAlgorithmScheduleParam").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getVAlgorithmScheduleParamsLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from vAlgorithmScheduleParam").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getVAlgorithmScheduleParamsLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from vAlgorithmScheduleParam").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getVAlgorithmScheduleParamFirst() : VAlgorithmScheduleParamDto = {
    implicit val connection = getConnection();
    val dtos : VAlgorithmScheduleParamDto= SQL("select * from vAlgorithmScheduleParam order by insertedRowDate asc ").as(anorm.Macro.namedParser[VAlgorithmScheduleParamDto].single);
    dtos
  }
  def getVAlgorithmScheduleParamLast() : VAlgorithmScheduleParamDto = {
    implicit val connection = getConnection();
    val dtos : VAlgorithmScheduleParamDto= SQL("select * from vAlgorithmScheduleParam order by insertedRowDate desc ").as(anorm.Macro.namedParser[VAlgorithmScheduleParamDto].single);
    dtos
  }
  def getVAlgorithmScheduleParamByGuid(guid : Long) : VAlgorithmScheduleParamDto = {
    implicit val connection = getConnection();
    val dtos : VAlgorithmScheduleParamDto= SQL("select * from vAlgorithmScheduleParam where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VAlgorithmScheduleParamDto].single);
    dtos
  }

}


class VAlgorithmScheduleViewDao extends DaoBase {

  def getVAlgorithmScheduleViewsList() : List[VAlgorithmScheduleViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleViewDto]= SQL("select * from vAlgorithmScheduleView").as(anorm.Macro.namedParser[VAlgorithmScheduleViewDto].*);
    dtos
  }
  def getVAlgorithmScheduleViewsCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from vAlgorithmScheduleView").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getVAlgorithmScheduleViewsLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from vAlgorithmScheduleView").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getVAlgorithmScheduleViewsLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from vAlgorithmScheduleView").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getVAlgorithmScheduleViewFirst() : VAlgorithmScheduleViewDto = {
    implicit val connection = getConnection();
    val dtos : VAlgorithmScheduleViewDto= SQL("select * from vAlgorithmScheduleView order by insertedRowDate asc ").as(anorm.Macro.namedParser[VAlgorithmScheduleViewDto].single);
    dtos
  }
  def getVAlgorithmScheduleViewLast() : VAlgorithmScheduleViewDto = {
    implicit val connection = getConnection();
    val dtos : VAlgorithmScheduleViewDto= SQL("select * from vAlgorithmScheduleView order by insertedRowDate desc ").as(anorm.Macro.namedParser[VAlgorithmScheduleViewDto].single);
    dtos
  }
  def getVAlgorithmScheduleViewByGuid(guid : Long) : VAlgorithmScheduleViewDto = {
    implicit val connection = getConnection();
    val dtos : VAlgorithmScheduleViewDto= SQL("select * from vAlgorithmScheduleView where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VAlgorithmScheduleViewDto].single);
    dtos
  }

}


class VAlgorithmTypeColumnTypeDao extends DaoBase {

  def getVAlgorithmTypeColumnTypesList() : List[VAlgorithmTypeColumnTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmTypeColumnTypeDto]= SQL("select * from vAlgorithmTypeColumnType").as(anorm.Macro.namedParser[VAlgorithmTypeColumnTypeDto].*);
    dtos
  }
  def getVAlgorithmTypeColumnTypesCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from vAlgorithmTypeColumnType").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getVAlgorithmTypeColumnTypesLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from vAlgorithmTypeColumnType").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getVAlgorithmTypeColumnTypesLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from vAlgorithmTypeColumnType").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getVAlgorithmTypeColumnTypeFirst() : VAlgorithmTypeColumnTypeDto = {
    implicit val connection = getConnection();
    val dtos : VAlgorithmTypeColumnTypeDto= SQL("select * from vAlgorithmTypeColumnType order by insertedRowDate asc ").as(anorm.Macro.namedParser[VAlgorithmTypeColumnTypeDto].single);
    dtos
  }
  def getVAlgorithmTypeColumnTypeLast() : VAlgorithmTypeColumnTypeDto = {
    implicit val connection = getConnection();
    val dtos : VAlgorithmTypeColumnTypeDto= SQL("select * from vAlgorithmTypeColumnType order by insertedRowDate desc ").as(anorm.Macro.namedParser[VAlgorithmTypeColumnTypeDto].single);
    dtos
  }
  def getVAlgorithmTypeColumnTypeByGuid(guid : Long) : VAlgorithmTypeColumnTypeDto = {
    implicit val connection = getConnection();
    val dtos : VAlgorithmTypeColumnTypeDto= SQL("select * from vAlgorithmTypeColumnType where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VAlgorithmTypeColumnTypeDto].single);
    dtos
  }

}


class VAlgorithmTypeVersionDao extends DaoBase {

  def getVAlgorithmTypeVersionsList() : List[VAlgorithmTypeVersionDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmTypeVersionDto]= SQL("select * from vAlgorithmTypeVersion").as(anorm.Macro.namedParser[VAlgorithmTypeVersionDto].*);
    dtos
  }
  def getVAlgorithmTypeVersionsCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from vAlgorithmTypeVersion").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getVAlgorithmTypeVersionsLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from vAlgorithmTypeVersion").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getVAlgorithmTypeVersionsLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from vAlgorithmTypeVersion").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getVAlgorithmTypeVersionFirst() : VAlgorithmTypeVersionDto = {
    implicit val connection = getConnection();
    val dtos : VAlgorithmTypeVersionDto= SQL("select * from vAlgorithmTypeVersion order by insertedRowDate asc ").as(anorm.Macro.namedParser[VAlgorithmTypeVersionDto].single);
    dtos
  }
  def getVAlgorithmTypeVersionLast() : VAlgorithmTypeVersionDto = {
    implicit val connection = getConnection();
    val dtos : VAlgorithmTypeVersionDto= SQL("select * from vAlgorithmTypeVersion order by insertedRowDate desc ").as(anorm.Macro.namedParser[VAlgorithmTypeVersionDto].single);
    dtos
  }
  def getVAlgorithmTypeVersionByGuid(guid : Long) : VAlgorithmTypeVersionDto = {
    implicit val connection = getConnection();
    val dtos : VAlgorithmTypeVersionDto= SQL("select * from vAlgorithmTypeVersion where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VAlgorithmTypeVersionDto].single);
    dtos
  }

}


class VExecutorInstanceDao extends DaoBase {

  def getVExecutorInstancesList() : List[VExecutorInstanceDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorInstanceDto]= SQL("select * from vExecutorInstance").as(anorm.Macro.namedParser[VExecutorInstanceDto].*);
    dtos
  }
  def getVExecutorInstancesCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from vExecutorInstance").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getVExecutorInstancesLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from vExecutorInstance").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getVExecutorInstancesLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from vExecutorInstance").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getVExecutorInstanceFirst() : VExecutorInstanceDto = {
    implicit val connection = getConnection();
    val dtos : VExecutorInstanceDto= SQL("select * from vExecutorInstance order by insertedRowDate asc ").as(anorm.Macro.namedParser[VExecutorInstanceDto].single);
    dtos
  }
  def getVExecutorInstanceLast() : VExecutorInstanceDto = {
    implicit val connection = getConnection();
    val dtos : VExecutorInstanceDto= SQL("select * from vExecutorInstance order by insertedRowDate desc ").as(anorm.Macro.namedParser[VExecutorInstanceDto].single);
    dtos
  }
  def getVExecutorInstanceByGuid(guid : Long) : VExecutorInstanceDto = {
    implicit val connection = getConnection();
    val dtos : VExecutorInstanceDto= SQL("select * from vExecutorInstance where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VExecutorInstanceDto].single);
    dtos
  }

}


class VExecutorRestDao extends DaoBase {

  def getVExecutorRestsList() : List[VExecutorRestDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorRestDto]= SQL("select * from vExecutorRest").as(anorm.Macro.namedParser[VExecutorRestDto].*);
    dtos
  }
  def getVExecutorRestsCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from vExecutorRest").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getVExecutorRestsLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from vExecutorRest").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getVExecutorRestsLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from vExecutorRest").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getVExecutorRestFirst() : VExecutorRestDto = {
    implicit val connection = getConnection();
    val dtos : VExecutorRestDto= SQL("select * from vExecutorRest order by insertedRowDate asc ").as(anorm.Macro.namedParser[VExecutorRestDto].single);
    dtos
  }
  def getVExecutorRestLast() : VExecutorRestDto = {
    implicit val connection = getConnection();
    val dtos : VExecutorRestDto= SQL("select * from vExecutorRest order by insertedRowDate desc ").as(anorm.Macro.namedParser[VExecutorRestDto].single);
    dtos
  }
  def getVExecutorRestByGuid(guid : Long) : VExecutorRestDto = {
    implicit val connection = getConnection();
    val dtos : VExecutorRestDto= SQL("select * from vExecutorRest where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VExecutorRestDto].single);
    dtos
  }

}


class VExecutorRestCallDao extends DaoBase {

  def getVExecutorRestCallsList() : List[VExecutorRestCallDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorRestCallDto]= SQL("select * from vExecutorRestCall").as(anorm.Macro.namedParser[VExecutorRestCallDto].*);
    dtos
  }
  def getVExecutorRestCallsCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from vExecutorRestCall").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getVExecutorRestCallsLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from vExecutorRestCall").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getVExecutorRestCallsLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from vExecutorRestCall").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getVExecutorRestCallFirst() : VExecutorRestCallDto = {
    implicit val connection = getConnection();
    val dtos : VExecutorRestCallDto= SQL("select * from vExecutorRestCall order by insertedRowDate asc ").as(anorm.Macro.namedParser[VExecutorRestCallDto].single);
    dtos
  }
  def getVExecutorRestCallLast() : VExecutorRestCallDto = {
    implicit val connection = getConnection();
    val dtos : VExecutorRestCallDto= SQL("select * from vExecutorRestCall order by insertedRowDate desc ").as(anorm.Macro.namedParser[VExecutorRestCallDto].single);
    dtos
  }
  def getVExecutorRestCallByGuid(guid : Long) : VExecutorRestCallDto = {
    implicit val connection = getConnection();
    val dtos : VExecutorRestCallDto= SQL("select * from vExecutorRestCall where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VExecutorRestCallDto].single);
    dtos
  }

}


class VExecutorStorageDao extends DaoBase {

  def getVExecutorStoragesList() : List[VExecutorStorageDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageDto]= SQL("select * from vExecutorStorage").as(anorm.Macro.namedParser[VExecutorStorageDto].*);
    dtos
  }
  def getVExecutorStoragesCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from vExecutorStorage").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getVExecutorStoragesLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from vExecutorStorage").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getVExecutorStoragesLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from vExecutorStorage").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getVExecutorStorageFirst() : VExecutorStorageDto = {
    implicit val connection = getConnection();
    val dtos : VExecutorStorageDto= SQL("select * from vExecutorStorage order by insertedRowDate asc ").as(anorm.Macro.namedParser[VExecutorStorageDto].single);
    dtos
  }
  def getVExecutorStorageLast() : VExecutorStorageDto = {
    implicit val connection = getConnection();
    val dtos : VExecutorStorageDto= SQL("select * from vExecutorStorage order by insertedRowDate desc ").as(anorm.Macro.namedParser[VExecutorStorageDto].single);
    dtos
  }
  def getVExecutorStorageByGuid(guid : Long) : VExecutorStorageDto = {
    implicit val connection = getConnection();
    val dtos : VExecutorStorageDto= SQL("select * from vExecutorStorage where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VExecutorStorageDto].single);
    dtos
  }

}


class VExecutorStorageSnapshotDao extends DaoBase {

  def getVExecutorStorageSnapshotsList() : List[VExecutorStorageSnapshotDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageSnapshotDto]= SQL("select * from vExecutorStorageSnapshot").as(anorm.Macro.namedParser[VExecutorStorageSnapshotDto].*);
    dtos
  }
  def getVExecutorStorageSnapshotsCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from vExecutorStorageSnapshot").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getVExecutorStorageSnapshotsLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from vExecutorStorageSnapshot").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getVExecutorStorageSnapshotsLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from vExecutorStorageSnapshot").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getVExecutorStorageSnapshotFirst() : VExecutorStorageSnapshotDto = {
    implicit val connection = getConnection();
    val dtos : VExecutorStorageSnapshotDto= SQL("select * from vExecutorStorageSnapshot order by insertedRowDate asc ").as(anorm.Macro.namedParser[VExecutorStorageSnapshotDto].single);
    dtos
  }
  def getVExecutorStorageSnapshotLast() : VExecutorStorageSnapshotDto = {
    implicit val connection = getConnection();
    val dtos : VExecutorStorageSnapshotDto= SQL("select * from vExecutorStorageSnapshot order by insertedRowDate desc ").as(anorm.Macro.namedParser[VExecutorStorageSnapshotDto].single);
    dtos
  }
  def getVExecutorStorageSnapshotByGuid(guid : Long) : VExecutorStorageSnapshotDto = {
    implicit val connection = getConnection();
    val dtos : VExecutorStorageSnapshotDto= SQL("select * from vExecutorStorageSnapshot where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VExecutorStorageSnapshotDto].single);
    dtos
  }

}


class VExecutorStorageViewDao extends DaoBase {

  def getVExecutorStorageViewsList() : List[VExecutorStorageViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageViewDto]= SQL("select * from vExecutorStorageView").as(anorm.Macro.namedParser[VExecutorStorageViewDto].*);
    dtos
  }
  def getVExecutorStorageViewsCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from vExecutorStorageView").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getVExecutorStorageViewsLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from vExecutorStorageView").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getVExecutorStorageViewsLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from vExecutorStorageView").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getVExecutorStorageViewFirst() : VExecutorStorageViewDto = {
    implicit val connection = getConnection();
    val dtos : VExecutorStorageViewDto= SQL("select * from vExecutorStorageView order by insertedRowDate asc ").as(anorm.Macro.namedParser[VExecutorStorageViewDto].single);
    dtos
  }
  def getVExecutorStorageViewLast() : VExecutorStorageViewDto = {
    implicit val connection = getConnection();
    val dtos : VExecutorStorageViewDto= SQL("select * from vExecutorStorageView order by insertedRowDate desc ").as(anorm.Macro.namedParser[VExecutorStorageViewDto].single);
    dtos
  }
  def getVExecutorStorageViewByGuid(guid : Long) : VExecutorStorageViewDto = {
    implicit val connection = getConnection();
    val dtos : VExecutorStorageViewDto= SQL("select * from vExecutorStorageView where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VExecutorStorageViewDto].single);
    dtos
  }

}


class VResourceManagerDao extends DaoBase {

  def getVResourceManagersList() : List[VResourceManagerDto] = {
    implicit val connection = getConnection();
    val dtos : List[VResourceManagerDto]= SQL("select * from vResourceManager").as(anorm.Macro.namedParser[VResourceManagerDto].*);
    dtos
  }
  def getVResourceManagersCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from vResourceManager").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getVResourceManagersLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from vResourceManager").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getVResourceManagersLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from vResourceManager").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getVResourceManagerFirst() : VResourceManagerDto = {
    implicit val connection = getConnection();
    val dtos : VResourceManagerDto= SQL("select * from vResourceManager order by insertedRowDate asc ").as(anorm.Macro.namedParser[VResourceManagerDto].single);
    dtos
  }
  def getVResourceManagerLast() : VResourceManagerDto = {
    implicit val connection = getConnection();
    val dtos : VResourceManagerDto= SQL("select * from vResourceManager order by insertedRowDate desc ").as(anorm.Macro.namedParser[VResourceManagerDto].single);
    dtos
  }
  def getVResourceManagerByGuid(guid : Long) : VResourceManagerDto = {
    implicit val connection = getConnection();
    val dtos : VResourceManagerDto= SQL("select * from vResourceManager where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VResourceManagerDto].single);
    dtos
  }

}


class VResourceManagerMeasureDao extends DaoBase {

  def getVResourceManagerMeasuresList() : List[VResourceManagerMeasureDto] = {
    implicit val connection = getConnection();
    val dtos : List[VResourceManagerMeasureDto]= SQL("select * from vResourceManagerMeasure").as(anorm.Macro.namedParser[VResourceManagerMeasureDto].*);
    dtos
  }
  def getVResourceManagerMeasuresCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from vResourceManagerMeasure").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getVResourceManagerMeasuresLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from vResourceManagerMeasure").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getVResourceManagerMeasuresLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from vResourceManagerMeasure").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getVResourceManagerMeasureFirst() : VResourceManagerMeasureDto = {
    implicit val connection = getConnection();
    val dtos : VResourceManagerMeasureDto= SQL("select * from vResourceManagerMeasure order by insertedRowDate asc ").as(anorm.Macro.namedParser[VResourceManagerMeasureDto].single);
    dtos
  }
  def getVResourceManagerMeasureLast() : VResourceManagerMeasureDto = {
    implicit val connection = getConnection();
    val dtos : VResourceManagerMeasureDto= SQL("select * from vResourceManagerMeasure order by insertedRowDate desc ").as(anorm.Macro.namedParser[VResourceManagerMeasureDto].single);
    dtos
  }
  def getVResourceManagerMeasureByGuid(guid : Long) : VResourceManagerMeasureDto = {
    implicit val connection = getConnection();
    val dtos : VResourceManagerMeasureDto= SQL("select * from vResourceManagerMeasure where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VResourceManagerMeasureDto].single);
    dtos
  }

}


class VSourceDownloadDao extends DaoBase {

  def getVSourceDownloadsList() : List[VSourceDownloadDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadDto]= SQL("select * from vSourceDownload").as(anorm.Macro.namedParser[VSourceDownloadDto].*);
    dtos
  }
  def getVSourceDownloadsCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from vSourceDownload").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getVSourceDownloadsLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from vSourceDownload").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getVSourceDownloadsLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from vSourceDownload").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getVSourceDownloadFirst() : VSourceDownloadDto = {
    implicit val connection = getConnection();
    val dtos : VSourceDownloadDto= SQL("select * from vSourceDownload order by insertedRowDate asc ").as(anorm.Macro.namedParser[VSourceDownloadDto].single);
    dtos
  }
  def getVSourceDownloadLast() : VSourceDownloadDto = {
    implicit val connection = getConnection();
    val dtos : VSourceDownloadDto= SQL("select * from vSourceDownload order by insertedRowDate desc ").as(anorm.Macro.namedParser[VSourceDownloadDto].single);
    dtos
  }
  def getVSourceDownloadByGuid(guid : Long) : VSourceDownloadDto = {
    implicit val connection = getConnection();
    val dtos : VSourceDownloadDto= SQL("select * from vSourceDownload where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VSourceDownloadDto].single);
    dtos
  }

}


class VSourceDownloadStatDao extends DaoBase {

  def getVSourceDownloadStatsList() : List[VSourceDownloadStatDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadStatDto]= SQL("select * from vSourceDownloadStat").as(anorm.Macro.namedParser[VSourceDownloadStatDto].*);
    dtos
  }
  def getVSourceDownloadStatsCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from vSourceDownloadStat").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getVSourceDownloadStatsLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from vSourceDownloadStat").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getVSourceDownloadStatsLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from vSourceDownloadStat").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getVSourceDownloadStatFirst() : VSourceDownloadStatDto = {
    implicit val connection = getConnection();
    val dtos : VSourceDownloadStatDto= SQL("select * from vSourceDownloadStat order by insertedRowDate asc ").as(anorm.Macro.namedParser[VSourceDownloadStatDto].single);
    dtos
  }
  def getVSourceDownloadStatLast() : VSourceDownloadStatDto = {
    implicit val connection = getConnection();
    val dtos : VSourceDownloadStatDto= SQL("select * from vSourceDownloadStat order by insertedRowDate desc ").as(anorm.Macro.namedParser[VSourceDownloadStatDto].single);
    dtos
  }
  def getVSourceDownloadStatByGuid(guid : Long) : VSourceDownloadStatDto = {
    implicit val connection = getConnection();
    val dtos : VSourceDownloadStatDto= SQL("select * from vSourceDownloadStat where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VSourceDownloadStatDto].single);
    dtos
  }

}


class VSourceDownloadStatColumnDao extends DaoBase {

  def getVSourceDownloadStatColumnsList() : List[VSourceDownloadStatColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadStatColumnDto]= SQL("select * from vSourceDownloadStatColumn").as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*);
    dtos
  }
  def getVSourceDownloadStatColumnsCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from vSourceDownloadStatColumn").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getVSourceDownloadStatColumnsLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from vSourceDownloadStatColumn").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getVSourceDownloadStatColumnsLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from vSourceDownloadStatColumn").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getVSourceDownloadStatColumnFirst() : VSourceDownloadStatColumnDto = {
    implicit val connection = getConnection();
    val dtos : VSourceDownloadStatColumnDto= SQL("select * from vSourceDownloadStatColumn order by insertedRowDate asc ").as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].single);
    dtos
  }
  def getVSourceDownloadStatColumnLast() : VSourceDownloadStatColumnDto = {
    implicit val connection = getConnection();
    val dtos : VSourceDownloadStatColumnDto= SQL("select * from vSourceDownloadStatColumn order by insertedRowDate desc ").as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].single);
    dtos
  }
  def getVSourceDownloadStatColumnByGuid(guid : Long) : VSourceDownloadStatColumnDto = {
    implicit val connection = getConnection();
    val dtos : VSourceDownloadStatColumnDto= SQL("select * from vSourceDownloadStatColumn where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].single);
    dtos
  }

}


class VSourceInstanceDao extends DaoBase {

  def getVSourceInstancesList() : List[VSourceInstanceDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceInstanceDto]= SQL("select * from vSourceInstance").as(anorm.Macro.namedParser[VSourceInstanceDto].*);
    dtos
  }
  def getVSourceInstancesCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from vSourceInstance").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getVSourceInstancesLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from vSourceInstance").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getVSourceInstancesLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from vSourceInstance").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getVSourceInstanceFirst() : VSourceInstanceDto = {
    implicit val connection = getConnection();
    val dtos : VSourceInstanceDto= SQL("select * from vSourceInstance order by insertedRowDate asc ").as(anorm.Macro.namedParser[VSourceInstanceDto].single);
    dtos
  }
  def getVSourceInstanceLast() : VSourceInstanceDto = {
    implicit val connection = getConnection();
    val dtos : VSourceInstanceDto= SQL("select * from vSourceInstance order by insertedRowDate desc ").as(anorm.Macro.namedParser[VSourceInstanceDto].single);
    dtos
  }
  def getVSourceInstanceByGuid(guid : Long) : VSourceInstanceDto = {
    implicit val connection = getConnection();
    val dtos : VSourceInstanceDto= SQL("select * from vSourceInstance where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VSourceInstanceDto].single);
    dtos
  }

}


class VSourceParamValueDao extends DaoBase {

  def getVSourceParamValuesList() : List[VSourceParamValueDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceParamValueDto]= SQL("select * from vSourceParamValue").as(anorm.Macro.namedParser[VSourceParamValueDto].*);
    dtos
  }
  def getVSourceParamValuesCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from vSourceParamValue").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getVSourceParamValuesLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from vSourceParamValue").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getVSourceParamValuesLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from vSourceParamValue").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getVSourceParamValueFirst() : VSourceParamValueDto = {
    implicit val connection = getConnection();
    val dtos : VSourceParamValueDto= SQL("select * from vSourceParamValue order by insertedRowDate asc ").as(anorm.Macro.namedParser[VSourceParamValueDto].single);
    dtos
  }
  def getVSourceParamValueLast() : VSourceParamValueDto = {
    implicit val connection = getConnection();
    val dtos : VSourceParamValueDto= SQL("select * from vSourceParamValue order by insertedRowDate desc ").as(anorm.Macro.namedParser[VSourceParamValueDto].single);
    dtos
  }
  def getVSourceParamValueByGuid(guid : Long) : VSourceParamValueDto = {
    implicit val connection = getConnection();
    val dtos : VSourceParamValueDto= SQL("select * from vSourceParamValue where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VSourceParamValueDto].single);
    dtos
  }

}


class VSourceScheduleDao extends DaoBase {

  def getVSourceSchedulesList() : List[VSourceScheduleDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceScheduleDto]= SQL("select * from vSourceSchedule").as(anorm.Macro.namedParser[VSourceScheduleDto].*);
    dtos
  }
  def getVSourceSchedulesCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from vSourceSchedule").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getVSourceSchedulesLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from vSourceSchedule").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getVSourceSchedulesLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from vSourceSchedule").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getVSourceScheduleFirst() : VSourceScheduleDto = {
    implicit val connection = getConnection();
    val dtos : VSourceScheduleDto= SQL("select * from vSourceSchedule order by insertedRowDate asc ").as(anorm.Macro.namedParser[VSourceScheduleDto].single);
    dtos
  }
  def getVSourceScheduleLast() : VSourceScheduleDto = {
    implicit val connection = getConnection();
    val dtos : VSourceScheduleDto= SQL("select * from vSourceSchedule order by insertedRowDate desc ").as(anorm.Macro.namedParser[VSourceScheduleDto].single);
    dtos
  }
  def getVSourceScheduleByGuid(guid : Long) : VSourceScheduleDto = {
    implicit val connection = getConnection();
    val dtos : VSourceScheduleDto= SQL("select * from vSourceSchedule where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VSourceScheduleDto].single);
    dtos
  }

}


class VSourceTypeParamDao extends DaoBase {

  def getVSourceTypeParamsList() : List[VSourceTypeParamDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceTypeParamDto]= SQL("select * from vSourceTypeParam").as(anorm.Macro.namedParser[VSourceTypeParamDto].*);
    dtos
  }
  def getVSourceTypeParamsCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from vSourceTypeParam").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getVSourceTypeParamsLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from vSourceTypeParam").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getVSourceTypeParamsLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from vSourceTypeParam").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getVSourceTypeParamFirst() : VSourceTypeParamDto = {
    implicit val connection = getConnection();
    val dtos : VSourceTypeParamDto= SQL("select * from vSourceTypeParam order by insertedRowDate asc ").as(anorm.Macro.namedParser[VSourceTypeParamDto].single);
    dtos
  }
  def getVSourceTypeParamLast() : VSourceTypeParamDto = {
    implicit val connection = getConnection();
    val dtos : VSourceTypeParamDto= SQL("select * from vSourceTypeParam order by insertedRowDate desc ").as(anorm.Macro.namedParser[VSourceTypeParamDto].single);
    dtos
  }
  def getVSourceTypeParamByGuid(guid : Long) : VSourceTypeParamDto = {
    implicit val connection = getConnection();
    val dtos : VSourceTypeParamDto= SQL("select * from vSourceTypeParam where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VSourceTypeParamDto].single);
    dtos
  }

}


class VSourceViewDao extends DaoBase {

  def getVSourceViewsList() : List[VSourceViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceViewDto]= SQL("select * from vSourceView").as(anorm.Macro.namedParser[VSourceViewDto].*);
    dtos
  }
  def getVSourceViewsCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from vSourceView").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getVSourceViewsLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from vSourceView").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getVSourceViewsLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from vSourceView").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getVSourceViewFirst() : VSourceViewDto = {
    implicit val connection = getConnection();
    val dtos : VSourceViewDto= SQL("select * from vSourceView order by insertedRowDate asc ").as(anorm.Macro.namedParser[VSourceViewDto].single);
    dtos
  }
  def getVSourceViewLast() : VSourceViewDto = {
    implicit val connection = getConnection();
    val dtos : VSourceViewDto= SQL("select * from vSourceView order by insertedRowDate desc ").as(anorm.Macro.namedParser[VSourceViewDto].single);
    dtos
  }
  def getVSourceViewByGuid(guid : Long) : VSourceViewDto = {
    implicit val connection = getConnection();
    val dtos : VSourceViewDto= SQL("select * from vSourceView where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VSourceViewDto].single);
    dtos
  }

}


class VSourceViewColumnDao extends DaoBase {

  def getVSourceViewColumnsList() : List[VSourceViewColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceViewColumnDto]= SQL("select * from vSourceViewColumn").as(anorm.Macro.namedParser[VSourceViewColumnDto].*);
    dtos
  }
  def getVSourceViewColumnsCount() : Long = {
    implicit val connection = getConnection();
    val cnt : Long = SQL("select count(*) as cnt from vSourceViewColumn").executeQuery()(connection).as[Long](SqlParser.long("cnt").single)(connection);;
    cnt
  }
  def getVSourceViewColumnsLastInsertDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(insertedRowDate) as lastDate from vSourceViewColumn").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastDate").single)(connection);;
    ld
  }
  def getVSourceViewColumnsLastUpdatedDate() : java.util.Date = {
    implicit val connection = getConnection();
    val ld : java.util.Date = SQL("select max(lastUpdatedDate) as lastUpdatedDate from vSourceViewColumn").executeQuery()(connection).as[java.util.Date](SqlParser.date("lastUpdatedDate").single)(connection);;
    ld
  }
  def getVSourceViewColumnFirst() : VSourceViewColumnDto = {
    implicit val connection = getConnection();
    val dtos : VSourceViewColumnDto= SQL("select * from vSourceViewColumn order by insertedRowDate asc ").as(anorm.Macro.namedParser[VSourceViewColumnDto].single);
    dtos
  }
  def getVSourceViewColumnLast() : VSourceViewColumnDto = {
    implicit val connection = getConnection();
    val dtos : VSourceViewColumnDto= SQL("select * from vSourceViewColumn order by insertedRowDate desc ").as(anorm.Macro.namedParser[VSourceViewColumnDto].single);
    dtos
  }
  def getVSourceViewColumnByGuid(guid : Long) : VSourceViewColumnDto = {
    implicit val connection = getConnection();
    val dtos : VSourceViewColumnDto= SQL("select * from vSourceViewColumn where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VSourceViewColumnDto].single);
    dtos
  }

}

class Daos {
  val algorithmColumnTypeDao : AlgorithmColumnTypeDao = new AlgorithmColumnTypeDao();
  val algorithmImplementationDao : AlgorithmImplementationDao = new AlgorithmImplementationDao();
  val algorithmOutputDao : AlgorithmOutputDao = new AlgorithmOutputDao();
  val algorithmOutputTypeDao : AlgorithmOutputTypeDao = new AlgorithmOutputTypeDao();
  val algorithmParamDao : AlgorithmParamDao = new AlgorithmParamDao();
  val algorithmParamTypeDao : AlgorithmParamTypeDao = new AlgorithmParamTypeDao();
  val algorithmRunDao : AlgorithmRunDao = new AlgorithmRunDao();
  val algorithmRunTypeDao : AlgorithmRunTypeDao = new AlgorithmRunTypeDao();
  val algorithmRunViewDao : AlgorithmRunViewDao = new AlgorithmRunViewDao();
  val algorithmScheduleDao : AlgorithmScheduleDao = new AlgorithmScheduleDao();
  val algorithmScheduleColumnDao : AlgorithmScheduleColumnDao = new AlgorithmScheduleColumnDao();
  val algorithmScheduleParamDao : AlgorithmScheduleParamDao = new AlgorithmScheduleParamDao();
  val algorithmScheduleTypeDao : AlgorithmScheduleTypeDao = new AlgorithmScheduleTypeDao();
  val algorithmScheduleViewDao : AlgorithmScheduleViewDao = new AlgorithmScheduleViewDao();
  val algorithmScheduleViewTypeDao : AlgorithmScheduleViewTypeDao = new AlgorithmScheduleViewTypeDao();
  val algorithmTypeDao : AlgorithmTypeDao = new AlgorithmTypeDao();
  val algorithmTypeColumnTypeDao : AlgorithmTypeColumnTypeDao = new AlgorithmTypeColumnTypeDao();
  val algorithmTypeOutputTypeDao : AlgorithmTypeOutputTypeDao = new AlgorithmTypeOutputTypeDao();
  val algorithmTypeVersionDao : AlgorithmTypeVersionDao = new AlgorithmTypeVersionDao();
  val executorHostDao : ExecutorHostDao = new ExecutorHostDao();
  val executorInstanceDao : ExecutorInstanceDao = new ExecutorInstanceDao();
  val executorRestDao : ExecutorRestDao = new ExecutorRestDao();
  val executorRestCallDao : ExecutorRestCallDao = new ExecutorRestCallDao();
  val executorStorageDao : ExecutorStorageDao = new ExecutorStorageDao();
  val executorStorageSnapshotDao : ExecutorStorageSnapshotDao = new ExecutorStorageSnapshotDao();
  val executorStorageTypeDao : ExecutorStorageTypeDao = new ExecutorStorageTypeDao();
  val executorStorageViewDao : ExecutorStorageViewDao = new ExecutorStorageViewDao();
  val executorTypeDao : ExecutorTypeDao = new ExecutorTypeDao();
  val resourceManagerDao : ResourceManagerDao = new ResourceManagerDao();
  val resourceManagerAllocationDao : ResourceManagerAllocationDao = new ResourceManagerAllocationDao();
  val resourceManagerCheckDao : ResourceManagerCheckDao = new ResourceManagerCheckDao();
  val resourceManagerMeasureDao : ResourceManagerMeasureDao = new ResourceManagerMeasureDao();
  val resourceManagerTypeDao : ResourceManagerTypeDao = new ResourceManagerTypeDao();
  val resourceMeasureDao : ResourceMeasureDao = new ResourceMeasureDao();
  val sourceDownloadDao : SourceDownloadDao = new SourceDownloadDao();
  val sourceDownloadStatDao : SourceDownloadStatDao = new SourceDownloadStatDao();
  val sourceDownloadStatColumnDao : SourceDownloadStatColumnDao = new SourceDownloadStatColumnDao();
  val sourceInstanceDao : SourceInstanceDao = new SourceInstanceDao();
  val sourceParamDao : SourceParamDao = new SourceParamDao();
  val sourceParamValueDao : SourceParamValueDao = new SourceParamValueDao();
  val sourceScheduleDao : SourceScheduleDao = new SourceScheduleDao();
  val sourceTypeDao : SourceTypeDao = new SourceTypeDao();
  val sourceTypeParamDao : SourceTypeParamDao = new SourceTypeParamDao();
  val sourceViewDao : SourceViewDao = new SourceViewDao();
  val sourceViewColumnDao : SourceViewColumnDao = new SourceViewColumnDao();
  val sourceViewTypeDao : SourceViewTypeDao = new SourceViewTypeDao();
  val vAlgorithmImplementationDao : VAlgorithmImplementationDao = new VAlgorithmImplementationDao();
  val vAlgorithmParamTypeDao : VAlgorithmParamTypeDao = new VAlgorithmParamTypeDao();
  val vAlgorithmRunDao : VAlgorithmRunDao = new VAlgorithmRunDao();
  val vAlgorithmRunViewDao : VAlgorithmRunViewDao = new VAlgorithmRunViewDao();
  val vAlgorithmScheduleDao : VAlgorithmScheduleDao = new VAlgorithmScheduleDao();
  val vAlgorithmScheduleColumnDao : VAlgorithmScheduleColumnDao = new VAlgorithmScheduleColumnDao();
  val vAlgorithmScheduleParamDao : VAlgorithmScheduleParamDao = new VAlgorithmScheduleParamDao();
  val vAlgorithmScheduleViewDao : VAlgorithmScheduleViewDao = new VAlgorithmScheduleViewDao();
  val vAlgorithmTypeColumnTypeDao : VAlgorithmTypeColumnTypeDao = new VAlgorithmTypeColumnTypeDao();
  val vAlgorithmTypeVersionDao : VAlgorithmTypeVersionDao = new VAlgorithmTypeVersionDao();
  val vExecutorInstanceDao : VExecutorInstanceDao = new VExecutorInstanceDao();
  val vExecutorRestDao : VExecutorRestDao = new VExecutorRestDao();
  val vExecutorRestCallDao : VExecutorRestCallDao = new VExecutorRestCallDao();
  val vExecutorStorageDao : VExecutorStorageDao = new VExecutorStorageDao();
  val vExecutorStorageSnapshotDao : VExecutorStorageSnapshotDao = new VExecutorStorageSnapshotDao();
  val vExecutorStorageViewDao : VExecutorStorageViewDao = new VExecutorStorageViewDao();
  val vResourceManagerDao : VResourceManagerDao = new VResourceManagerDao();
  val vResourceManagerMeasureDao : VResourceManagerMeasureDao = new VResourceManagerMeasureDao();
  val vSourceDownloadDao : VSourceDownloadDao = new VSourceDownloadDao();
  val vSourceDownloadStatDao : VSourceDownloadStatDao = new VSourceDownloadStatDao();
  val vSourceDownloadStatColumnDao : VSourceDownloadStatColumnDao = new VSourceDownloadStatColumnDao();
  val vSourceInstanceDao : VSourceInstanceDao = new VSourceInstanceDao();
  val vSourceParamValueDao : VSourceParamValueDao = new VSourceParamValueDao();
  val vSourceScheduleDao : VSourceScheduleDao = new VSourceScheduleDao();
  val vSourceTypeParamDao : VSourceTypeParamDao = new VSourceTypeParamDao();
  val vSourceViewDao : VSourceViewDao = new VSourceViewDao();
  val vSourceViewColumnDao : VSourceViewColumnDao = new VSourceViewColumnDao();
  def initialize(daoConn : DaoConnection ): Unit = {
    algorithmColumnTypeDao.initialize(daoConn)
    algorithmImplementationDao.initialize(daoConn)
    algorithmOutputDao.initialize(daoConn)
    algorithmOutputTypeDao.initialize(daoConn)
    algorithmParamDao.initialize(daoConn)
    algorithmParamTypeDao.initialize(daoConn)
    algorithmRunDao.initialize(daoConn)
    algorithmRunTypeDao.initialize(daoConn)
    algorithmRunViewDao.initialize(daoConn)
    algorithmScheduleDao.initialize(daoConn)
    algorithmScheduleColumnDao.initialize(daoConn)
    algorithmScheduleParamDao.initialize(daoConn)
    algorithmScheduleTypeDao.initialize(daoConn)
    algorithmScheduleViewDao.initialize(daoConn)
    algorithmScheduleViewTypeDao.initialize(daoConn)
    algorithmTypeDao.initialize(daoConn)
    algorithmTypeColumnTypeDao.initialize(daoConn)
    algorithmTypeOutputTypeDao.initialize(daoConn)
    algorithmTypeVersionDao.initialize(daoConn)
    executorHostDao.initialize(daoConn)
    executorInstanceDao.initialize(daoConn)
    executorRestDao.initialize(daoConn)
    executorRestCallDao.initialize(daoConn)
    executorStorageDao.initialize(daoConn)
    executorStorageSnapshotDao.initialize(daoConn)
    executorStorageTypeDao.initialize(daoConn)
    executorStorageViewDao.initialize(daoConn)
    executorTypeDao.initialize(daoConn)
    resourceManagerDao.initialize(daoConn)
    resourceManagerAllocationDao.initialize(daoConn)
    resourceManagerCheckDao.initialize(daoConn)
    resourceManagerMeasureDao.initialize(daoConn)
    resourceManagerTypeDao.initialize(daoConn)
    resourceMeasureDao.initialize(daoConn)
    sourceDownloadDao.initialize(daoConn)
    sourceDownloadStatDao.initialize(daoConn)
    sourceDownloadStatColumnDao.initialize(daoConn)
    sourceInstanceDao.initialize(daoConn)
    sourceParamDao.initialize(daoConn)
    sourceParamValueDao.initialize(daoConn)
    sourceScheduleDao.initialize(daoConn)
    sourceTypeDao.initialize(daoConn)
    sourceTypeParamDao.initialize(daoConn)
    sourceViewDao.initialize(daoConn)
    sourceViewColumnDao.initialize(daoConn)
    sourceViewTypeDao.initialize(daoConn)
    vAlgorithmImplementationDao.initialize(daoConn)
    vAlgorithmParamTypeDao.initialize(daoConn)
    vAlgorithmRunDao.initialize(daoConn)
    vAlgorithmRunViewDao.initialize(daoConn)
    vAlgorithmScheduleDao.initialize(daoConn)
    vAlgorithmScheduleColumnDao.initialize(daoConn)
    vAlgorithmScheduleParamDao.initialize(daoConn)
    vAlgorithmScheduleViewDao.initialize(daoConn)
    vAlgorithmTypeColumnTypeDao.initialize(daoConn)
    vAlgorithmTypeVersionDao.initialize(daoConn)
    vExecutorInstanceDao.initialize(daoConn)
    vExecutorRestDao.initialize(daoConn)
    vExecutorRestCallDao.initialize(daoConn)
    vExecutorStorageDao.initialize(daoConn)
    vExecutorStorageSnapshotDao.initialize(daoConn)
    vExecutorStorageViewDao.initialize(daoConn)
    vResourceManagerDao.initialize(daoConn)
    vResourceManagerMeasureDao.initialize(daoConn)
    vSourceDownloadDao.initialize(daoConn)
    vSourceDownloadStatDao.initialize(daoConn)
    vSourceDownloadStatColumnDao.initialize(daoConn)
    vSourceInstanceDao.initialize(daoConn)
    vSourceParamValueDao.initialize(daoConn)
    vSourceScheduleDao.initialize(daoConn)
    vSourceTypeParamDao.initialize(daoConn)
    vSourceViewDao.initialize(daoConn)
    vSourceViewColumnDao.initialize(daoConn)
  }
}



