package com.mlasaf.dao

import anorm.{SQL, SqlParser}
import com.mlasaf.dto._
import java.util.Date

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
    val dtos : AlgorithmColumnTypeDto= SQL("select * from algorithmColumnType order by insertedRowDate asc ").as(anorm.Macro.namedParser[AlgorithmColumnTypeDto].*).head;
    dtos
  }
  def getAlgorithmColumnTypeLast() : AlgorithmColumnTypeDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmColumnTypeDto= SQL("select * from algorithmColumnType order by insertedRowDate desc ").as(anorm.Macro.namedParser[AlgorithmColumnTypeDto].*).head;
    dtos
  }
  def getAlgorithmColumnTypeByGuid(guid : Long) : AlgorithmColumnTypeDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmColumnTypeDto= SQL("select * from algorithmColumnType where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[AlgorithmColumnTypeDto].single);
    dtos
  }
  def getAlgorithmColumnTypeByPk(pkColValue : Long) : AlgorithmColumnTypeDto = {
    implicit val connection = getConnection();
    val dto : AlgorithmColumnTypeDto = SQL("select * from algorithmColumnType where algorithmColumnTypeId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[AlgorithmColumnTypeDto].single);
    dto
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
  def insertAlgorithmColumnTypeDto(dto : AlgorithmColumnTypeDto): AlgorithmColumnTypeDto = {
    implicit val connection = getConnection();
    val stat = dto.prepareInsert(getConnection());
    val resCnt = stat.executeUpdate();
    val rs = stat.getGeneratedKeys();
    if (rs.next()) {
      val pkValue = rs.getLong(1);
      SQL("select * from algorithmColumnType where algorithmColumnTypeId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[AlgorithmColumnTypeDto].single);
    } else {
      null;
    }
  }
  def createAndInsertAlgorithmColumnTypeDto(algorithmColumnTypeName : String, algorithmColumnTypeDescription : String) : AlgorithmColumnTypeDto = {
    val dto = new AlgorithmColumnTypeDto(0,algorithmColumnTypeName,algorithmColumnTypeDescription,new Date(),new Date(),0)
    insertAlgorithmColumnTypeDto(dto);
  }
  def updateAlgorithmColumnTypeDto(dto : AlgorithmColumnTypeDto): AlgorithmColumnTypeDto = {
    implicit val connection = getConnection();
    val resCnt = SQL("update algorithmColumnType set  algorithmColumnTypeName = {algorithmColumnTypeName} ,  algorithmColumnTypeDescription = {algorithmColumnTypeDescription} ,  lastUpdatedDate = {lastUpdatedDate}  where  algorithmColumnTypeId = {algorithmColumnTypeId}  ")
      .on("algorithmColumnTypeName" -> dto.algorithmColumnTypeName , "algorithmColumnTypeDescription" -> dto.algorithmColumnTypeDescription , "lastUpdatedDate" -> dto.lastUpdatedDate, "algorithmColumnTypeId" -> dto.algorithmColumnTypeId ).executeInsert()
    getAlgorithmColumnTypeByPk(dto.algorithmColumnTypeId)
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
    val dtos : AlgorithmImplementationDto= SQL("select * from algorithmImplementation order by insertedRowDate asc ").as(anorm.Macro.namedParser[AlgorithmImplementationDto].*).head;
    dtos
  }
  def getAlgorithmImplementationLast() : AlgorithmImplementationDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmImplementationDto= SQL("select * from algorithmImplementation order by insertedRowDate desc ").as(anorm.Macro.namedParser[AlgorithmImplementationDto].*).head;
    dtos
  }
  def getAlgorithmImplementationByGuid(guid : Long) : AlgorithmImplementationDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmImplementationDto= SQL("select * from algorithmImplementation where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[AlgorithmImplementationDto].single);
    dtos
  }
  def getAlgorithmImplementationByPk(pkColValue : Long) : AlgorithmImplementationDto = {
    implicit val connection = getConnection();
    val dto : AlgorithmImplementationDto = SQL("select * from algorithmImplementation where algorithmImplementationId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[AlgorithmImplementationDto].single);
    dto
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
  def insertAlgorithmImplementationDto(dto : AlgorithmImplementationDto): AlgorithmImplementationDto = {
    implicit val connection = getConnection();
    val stat = dto.prepareInsert(getConnection());
    val resCnt = stat.executeUpdate();
    val rs = stat.getGeneratedKeys();
    if (rs.next()) {
      val pkValue = rs.getLong(1);
      SQL("select * from algorithmImplementation where algorithmImplementationId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[AlgorithmImplementationDto].single);
    } else {
      null;
    }
  }
  def createAndInsertAlgorithmImplementationDto(algorithmTypeVersionId : Long, executorTypeId : Long, algorithmImplementationName : String, algorithmImplementationClass : String) : AlgorithmImplementationDto = {
    val dto = new AlgorithmImplementationDto(0,0,new Date(),new Date(),algorithmTypeVersionId,executorTypeId,algorithmImplementationName,algorithmImplementationClass)
    insertAlgorithmImplementationDto(dto);
  }
  def updateAlgorithmImplementationDto(dto : AlgorithmImplementationDto): AlgorithmImplementationDto = {
    implicit val connection = getConnection();
    val resCnt = SQL("update algorithmImplementation set  lastUpdatedDate = {lastUpdatedDate} ,  algorithmTypeVersionId = {algorithmTypeVersionId} ,  executorTypeId = {executorTypeId} ,  algorithmImplementationName = {algorithmImplementationName} ,  algorithmImplementationClass = {algorithmImplementationClass}  where  algorithmImplementationId = {algorithmImplementationId}  ")
      .on("lastUpdatedDate" -> dto.lastUpdatedDate , "algorithmTypeVersionId" -> dto.algorithmTypeVersionId , "executorTypeId" -> dto.executorTypeId , "algorithmImplementationName" -> dto.algorithmImplementationName , "algorithmImplementationClass" -> dto.algorithmImplementationClass, "algorithmImplementationId" -> dto.algorithmImplementationId ).executeInsert()
    getAlgorithmImplementationByPk(dto.algorithmImplementationId)
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
    val dtos : AlgorithmOutputDto= SQL("select * from algorithmOutput order by insertedRowDate asc ").as(anorm.Macro.namedParser[AlgorithmOutputDto].*).head;
    dtos
  }
  def getAlgorithmOutputLast() : AlgorithmOutputDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmOutputDto= SQL("select * from algorithmOutput order by insertedRowDate desc ").as(anorm.Macro.namedParser[AlgorithmOutputDto].*).head;
    dtos
  }
  def getAlgorithmOutputByGuid(guid : Long) : AlgorithmOutputDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmOutputDto= SQL("select * from algorithmOutput where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[AlgorithmOutputDto].single);
    dtos
  }
  def getAlgorithmOutputByPk(pkColValue : Long) : AlgorithmOutputDto = {
    implicit val connection = getConnection();
    val dto : AlgorithmOutputDto = SQL("select * from algorithmOutput where algorithmOutputId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[AlgorithmOutputDto].single);
    dto
  }
  def getAlgorithmOutputMaxId() : Long = {
    implicit val connection = getConnection();
    val maxid : Long = SQL("select max(algorithmOutputId) as maxId from algorithmOutput ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;
    maxid
  }
  def insertAlgorithmOutputDto(dto : AlgorithmOutputDto): AlgorithmOutputDto = {
    implicit val connection = getConnection();
    val stat = dto.prepareInsert(getConnection());
    val resCnt = stat.executeUpdate();
    val rs = stat.getGeneratedKeys();
    if (rs.next()) {
      val pkValue = rs.getLong(1);
      SQL("select * from algorithmOutput where algorithmOutputId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[AlgorithmOutputDto].single);
    } else {
      null;
    }
  }
  def createAndInsertAlgorithmOutputDto(algorithmRunId : Long, algorithmOutputTypeId : Long, executorStorageViewId : Long, outputPath : String) : AlgorithmOutputDto = {
    val dto = new AlgorithmOutputDto(0,0,new Date(),new Date(),algorithmRunId,algorithmOutputTypeId,executorStorageViewId,outputPath)
    insertAlgorithmOutputDto(dto);
  }
  def updateAlgorithmOutputDto(dto : AlgorithmOutputDto): AlgorithmOutputDto = {
    implicit val connection = getConnection();
    val resCnt = SQL("update algorithmOutput set  lastUpdatedDate = {lastUpdatedDate} ,  algorithmRunId = {algorithmRunId} ,  algorithmOutputTypeId = {algorithmOutputTypeId} ,  executorStorageViewId = {executorStorageViewId} ,  outputPath = {outputPath}  where  algorithmOutputId = {algorithmOutputId}  ")
      .on("lastUpdatedDate" -> dto.lastUpdatedDate , "algorithmRunId" -> dto.algorithmRunId , "algorithmOutputTypeId" -> dto.algorithmOutputTypeId , "executorStorageViewId" -> dto.executorStorageViewId , "outputPath" -> dto.outputPath, "algorithmOutputId" -> dto.algorithmOutputId ).executeInsert()
    getAlgorithmOutputByPk(dto.algorithmOutputId)
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
    val dtos : AlgorithmOutputTypeDto= SQL("select * from algorithmOutputType order by insertedRowDate asc ").as(anorm.Macro.namedParser[AlgorithmOutputTypeDto].*).head;
    dtos
  }
  def getAlgorithmOutputTypeLast() : AlgorithmOutputTypeDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmOutputTypeDto= SQL("select * from algorithmOutputType order by insertedRowDate desc ").as(anorm.Macro.namedParser[AlgorithmOutputTypeDto].*).head;
    dtos
  }
  def getAlgorithmOutputTypeByGuid(guid : Long) : AlgorithmOutputTypeDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmOutputTypeDto= SQL("select * from algorithmOutputType where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[AlgorithmOutputTypeDto].single);
    dtos
  }
  def getAlgorithmOutputTypeByPk(pkColValue : Long) : AlgorithmOutputTypeDto = {
    implicit val connection = getConnection();
    val dto : AlgorithmOutputTypeDto = SQL("select * from algorithmOutputType where algorithmOutputTypeId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[AlgorithmOutputTypeDto].single);
    dto
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
  def insertAlgorithmOutputTypeDto(dto : AlgorithmOutputTypeDto): AlgorithmOutputTypeDto = {
    implicit val connection = getConnection();
    val stat = dto.prepareInsert(getConnection());
    val resCnt = stat.executeUpdate();
    val rs = stat.getGeneratedKeys();
    if (rs.next()) {
      val pkValue = rs.getLong(1);
      SQL("select * from algorithmOutputType where algorithmOutputTypeId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[AlgorithmOutputTypeDto].single);
    } else {
      null;
    }
  }
  def createAndInsertAlgorithmOutputTypeDto(algorithmOutputTypeName : String) : AlgorithmOutputTypeDto = {
    val dto = new AlgorithmOutputTypeDto(0,0,algorithmOutputTypeName,new Date(),new Date())
    insertAlgorithmOutputTypeDto(dto);
  }
  def updateAlgorithmOutputTypeDto(dto : AlgorithmOutputTypeDto): AlgorithmOutputTypeDto = {
    implicit val connection = getConnection();
    val resCnt = SQL("update algorithmOutputType set  algorithmOutputTypeName = {algorithmOutputTypeName} ,  lastUpdatedDate = {lastUpdatedDate}  where  algorithmOutputTypeId = {algorithmOutputTypeId}  ")
      .on("algorithmOutputTypeName" -> dto.algorithmOutputTypeName , "lastUpdatedDate" -> dto.lastUpdatedDate, "algorithmOutputTypeId" -> dto.algorithmOutputTypeId ).executeInsert()
    getAlgorithmOutputTypeByPk(dto.algorithmOutputTypeId)
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
    val dtos : AlgorithmParamDto= SQL("select * from algorithmParam order by insertedRowDate asc ").as(anorm.Macro.namedParser[AlgorithmParamDto].*).head;
    dtos
  }
  def getAlgorithmParamLast() : AlgorithmParamDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmParamDto= SQL("select * from algorithmParam order by insertedRowDate desc ").as(anorm.Macro.namedParser[AlgorithmParamDto].*).head;
    dtos
  }
  def getAlgorithmParamByGuid(guid : Long) : AlgorithmParamDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmParamDto= SQL("select * from algorithmParam where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[AlgorithmParamDto].single);
    dtos
  }
  def getAlgorithmParamByPk(pkColValue : Long) : AlgorithmParamDto = {
    implicit val connection = getConnection();
    val dto : AlgorithmParamDto = SQL("select * from algorithmParam where algorithmParamId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[AlgorithmParamDto].single);
    dto
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
  def insertAlgorithmParamDto(dto : AlgorithmParamDto): AlgorithmParamDto = {
    implicit val connection = getConnection();
    val stat = dto.prepareInsert(getConnection());
    val resCnt = stat.executeUpdate();
    val rs = stat.getGeneratedKeys();
    if (rs.next()) {
      val pkValue = rs.getLong(1);
      SQL("select * from algorithmParam where algorithmParamId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[AlgorithmParamDto].single);
    } else {
      null;
    }
  }
  def createAndInsertAlgorithmParamDto(algorithmParamName : String, algorithmParamDescription : String, algorithmParamType : String) : AlgorithmParamDto = {
    val dto = new AlgorithmParamDto(0,0,new Date(),new Date(),algorithmParamName,algorithmParamDescription,algorithmParamType)
    insertAlgorithmParamDto(dto);
  }
  def updateAlgorithmParamDto(dto : AlgorithmParamDto): AlgorithmParamDto = {
    implicit val connection = getConnection();
    val resCnt = SQL("update algorithmParam set  lastUpdatedDate = {lastUpdatedDate} ,  algorithmParamName = {algorithmParamName} ,  algorithmParamDescription = {algorithmParamDescription} ,  algorithmParamType = {algorithmParamType}  where  algorithmParamId = {algorithmParamId}  ")
      .on("lastUpdatedDate" -> dto.lastUpdatedDate , "algorithmParamName" -> dto.algorithmParamName , "algorithmParamDescription" -> dto.algorithmParamDescription , "algorithmParamType" -> dto.algorithmParamType, "algorithmParamId" -> dto.algorithmParamId ).executeInsert()
    getAlgorithmParamByPk(dto.algorithmParamId)
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
    val dtos : AlgorithmParamTypeDto= SQL("select * from algorithmParamType order by insertedRowDate asc ").as(anorm.Macro.namedParser[AlgorithmParamTypeDto].*).head;
    dtos
  }
  def getAlgorithmParamTypeLast() : AlgorithmParamTypeDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmParamTypeDto= SQL("select * from algorithmParamType order by insertedRowDate desc ").as(anorm.Macro.namedParser[AlgorithmParamTypeDto].*).head;
    dtos
  }
  def getAlgorithmParamTypeByGuid(guid : Long) : AlgorithmParamTypeDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmParamTypeDto= SQL("select * from algorithmParamType where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[AlgorithmParamTypeDto].single);
    dtos
  }
  def getAlgorithmParamTypeByPk(pkColValue : Long) : AlgorithmParamTypeDto = {
    implicit val connection = getConnection();
    val dto : AlgorithmParamTypeDto = SQL("select * from algorithmParamType where algorithmParamTypeId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[AlgorithmParamTypeDto].single);
    dto
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
  def insertAlgorithmParamTypeDto(dto : AlgorithmParamTypeDto): AlgorithmParamTypeDto = {
    implicit val connection = getConnection();
    val stat = dto.prepareInsert(getConnection());
    val resCnt = stat.executeUpdate();
    val rs = stat.getGeneratedKeys();
    if (rs.next()) {
      val pkValue = rs.getLong(1);
      SQL("select * from algorithmParamType where algorithmParamTypeId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[AlgorithmParamTypeDto].single);
    } else {
      null;
    }
  }
  def createAndInsertAlgorithmParamTypeDto(algorithmParamId : Long, algorithmTypeId : Long, algorithmTypeVersionId : Long) : AlgorithmParamTypeDto = {
    val dto = new AlgorithmParamTypeDto(0,algorithmParamId,algorithmTypeId,algorithmTypeVersionId,new Date(),new Date(),0)
    insertAlgorithmParamTypeDto(dto);
  }
  def updateAlgorithmParamTypeDto(dto : AlgorithmParamTypeDto): AlgorithmParamTypeDto = {
    implicit val connection = getConnection();
    val resCnt = SQL("update algorithmParamType set  algorithmParamId = {algorithmParamId} ,  algorithmTypeId = {algorithmTypeId} ,  algorithmTypeVersionId = {algorithmTypeVersionId} ,  lastUpdatedDate = {lastUpdatedDate}  where  algorithmParamTypeId = {algorithmParamTypeId}  ")
      .on("algorithmParamId" -> dto.algorithmParamId , "algorithmTypeId" -> dto.algorithmTypeId , "algorithmTypeVersionId" -> dto.algorithmTypeVersionId , "lastUpdatedDate" -> dto.lastUpdatedDate, "algorithmParamTypeId" -> dto.algorithmParamTypeId ).executeInsert()
    getAlgorithmParamTypeByPk(dto.algorithmParamTypeId)
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
    val dtos : AlgorithmRunDto= SQL("select * from algorithmRun order by insertedRowDate asc ").as(anorm.Macro.namedParser[AlgorithmRunDto].*).head;
    dtos
  }
  def getAlgorithmRunLast() : AlgorithmRunDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmRunDto= SQL("select * from algorithmRun order by insertedRowDate desc ").as(anorm.Macro.namedParser[AlgorithmRunDto].*).head;
    dtos
  }
  def getAlgorithmRunByGuid(guid : Long) : AlgorithmRunDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmRunDto= SQL("select * from algorithmRun where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[AlgorithmRunDto].single);
    dtos
  }
  def getAlgorithmRunByPk(pkColValue : Long) : AlgorithmRunDto = {
    implicit val connection = getConnection();
    val dto : AlgorithmRunDto = SQL("select * from algorithmRun where algorithmRunId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[AlgorithmRunDto].single);
    dto
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
  def insertAlgorithmRunDto(dto : AlgorithmRunDto): AlgorithmRunDto = {
    implicit val connection = getConnection();
    val stat = dto.prepareInsert(getConnection());
    val resCnt = stat.executeUpdate();
    val rs = stat.getGeneratedKeys();
    if (rs.next()) {
      val pkValue = rs.getLong(1);
      SQL("select * from algorithmRun where algorithmRunId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[AlgorithmRunDto].single);
    } else {
      null;
    }
  }
  def createAndInsertAlgorithmRunDto(algorithmScheduleId : Long, executorInstanceId : Long, executorStorageId : Long, algorithmRunName : String, runDate : java.util.Date, isRunning : Int, isFinished : Int) : AlgorithmRunDto = {
    val dto = new AlgorithmRunDto(0,0,algorithmScheduleId,executorInstanceId,executorStorageId,algorithmRunName,new Date(),new Date(),runDate,isRunning,isFinished)
    insertAlgorithmRunDto(dto);
  }
  def updateAlgorithmRunDto(dto : AlgorithmRunDto): AlgorithmRunDto = {
    implicit val connection = getConnection();
    val resCnt = SQL("update algorithmRun set  algorithmScheduleId = {algorithmScheduleId} ,  executorInstanceId = {executorInstanceId} ,  executorStorageId = {executorStorageId} ,  algorithmRunName = {algorithmRunName} ,  lastUpdatedDate = {lastUpdatedDate} ,  runDate = {runDate} ,  isRunning = {isRunning} ,  isFinished = {isFinished}  where  algorithmRunId = {algorithmRunId}  ")
      .on("algorithmScheduleId" -> dto.algorithmScheduleId , "executorInstanceId" -> dto.executorInstanceId , "executorStorageId" -> dto.executorStorageId , "algorithmRunName" -> dto.algorithmRunName , "lastUpdatedDate" -> dto.lastUpdatedDate , "runDate" -> dto.runDate , "isRunning" -> dto.isRunning , "isFinished" -> dto.isFinished, "algorithmRunId" -> dto.algorithmRunId ).executeInsert()
    getAlgorithmRunByPk(dto.algorithmRunId)
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
    val dtos : AlgorithmRunTypeDto= SQL("select * from algorithmRunType order by insertedRowDate asc ").as(anorm.Macro.namedParser[AlgorithmRunTypeDto].*).head;
    dtos
  }
  def getAlgorithmRunTypeLast() : AlgorithmRunTypeDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmRunTypeDto= SQL("select * from algorithmRunType order by insertedRowDate desc ").as(anorm.Macro.namedParser[AlgorithmRunTypeDto].*).head;
    dtos
  }
  def getAlgorithmRunTypeByGuid(guid : Long) : AlgorithmRunTypeDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmRunTypeDto= SQL("select * from algorithmRunType where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[AlgorithmRunTypeDto].single);
    dtos
  }
  def getAlgorithmRunTypeByPk(pkColValue : Long) : AlgorithmRunTypeDto = {
    implicit val connection = getConnection();
    val dto : AlgorithmRunTypeDto = SQL("select * from algorithmRunType where algorithmRunTypeId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[AlgorithmRunTypeDto].single);
    dto
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
  def insertAlgorithmRunTypeDto(dto : AlgorithmRunTypeDto): AlgorithmRunTypeDto = {
    implicit val connection = getConnection();
    val stat = dto.prepareInsert(getConnection());
    val resCnt = stat.executeUpdate();
    val rs = stat.getGeneratedKeys();
    if (rs.next()) {
      val pkValue = rs.getLong(1);
      SQL("select * from algorithmRunType where algorithmRunTypeId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[AlgorithmRunTypeDto].single);
    } else {
      null;
    }
  }
  def createAndInsertAlgorithmRunTypeDto(algorithmRunTypeName : String) : AlgorithmRunTypeDto = {
    val dto = new AlgorithmRunTypeDto(0,0,algorithmRunTypeName,new Date(),new Date())
    insertAlgorithmRunTypeDto(dto);
  }
  def updateAlgorithmRunTypeDto(dto : AlgorithmRunTypeDto): AlgorithmRunTypeDto = {
    implicit val connection = getConnection();
    val resCnt = SQL("update algorithmRunType set  algorithmRunTypeName = {algorithmRunTypeName} ,  lastUpdatedDate = {lastUpdatedDate}  where  algorithmRunTypeId = {algorithmRunTypeId}  ")
      .on("algorithmRunTypeName" -> dto.algorithmRunTypeName , "lastUpdatedDate" -> dto.lastUpdatedDate, "algorithmRunTypeId" -> dto.algorithmRunTypeId ).executeInsert()
    getAlgorithmRunTypeByPk(dto.algorithmRunTypeId)
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
    val dtos : AlgorithmRunViewDto= SQL("select * from algorithmRunView order by insertedRowDate asc ").as(anorm.Macro.namedParser[AlgorithmRunViewDto].*).head;
    dtos
  }
  def getAlgorithmRunViewLast() : AlgorithmRunViewDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmRunViewDto= SQL("select * from algorithmRunView order by insertedRowDate desc ").as(anorm.Macro.namedParser[AlgorithmRunViewDto].*).head;
    dtos
  }
  def getAlgorithmRunViewByGuid(guid : Long) : AlgorithmRunViewDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmRunViewDto= SQL("select * from algorithmRunView where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[AlgorithmRunViewDto].single);
    dtos
  }
  def getAlgorithmRunViewByPk(pkColValue : Long) : AlgorithmRunViewDto = {
    implicit val connection = getConnection();
    val dto : AlgorithmRunViewDto = SQL("select * from algorithmRunView where algorithmRunViewId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[AlgorithmRunViewDto].single);
    dto
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
  def insertAlgorithmRunViewDto(dto : AlgorithmRunViewDto): AlgorithmRunViewDto = {
    implicit val connection = getConnection();
    val stat = dto.prepareInsert(getConnection());
    val resCnt = stat.executeUpdate();
    val rs = stat.getGeneratedKeys();
    if (rs.next()) {
      val pkValue = rs.getLong(1);
      SQL("select * from algorithmRunView where algorithmRunViewId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[AlgorithmRunViewDto].single);
    } else {
      null;
    }
  }
  def createAndInsertAlgorithmRunViewDto(algorithmRunId : Long, executorStorageViewId : Long, isDownloaded : Int) : AlgorithmRunViewDto = {
    val dto = new AlgorithmRunViewDto(0,0,algorithmRunId,executorStorageViewId,new Date(),new Date(),isDownloaded)
    insertAlgorithmRunViewDto(dto);
  }
  def updateAlgorithmRunViewDto(dto : AlgorithmRunViewDto): AlgorithmRunViewDto = {
    implicit val connection = getConnection();
    val resCnt = SQL("update algorithmRunView set  algorithmRunId = {algorithmRunId} ,  executorStorageViewId = {executorStorageViewId} ,  lastUpdatedDate = {lastUpdatedDate} ,  isDownloaded = {isDownloaded}  where  algorithmRunViewId = {algorithmRunViewId}  ")
      .on("algorithmRunId" -> dto.algorithmRunId , "executorStorageViewId" -> dto.executorStorageViewId , "lastUpdatedDate" -> dto.lastUpdatedDate , "isDownloaded" -> dto.isDownloaded, "algorithmRunViewId" -> dto.algorithmRunViewId ).executeInsert()
    getAlgorithmRunViewByPk(dto.algorithmRunViewId)
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
    val dtos : AlgorithmScheduleDto= SQL("select * from algorithmSchedule order by insertedRowDate asc ").as(anorm.Macro.namedParser[AlgorithmScheduleDto].*).head;
    dtos
  }
  def getAlgorithmScheduleLast() : AlgorithmScheduleDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmScheduleDto= SQL("select * from algorithmSchedule order by insertedRowDate desc ").as(anorm.Macro.namedParser[AlgorithmScheduleDto].*).head;
    dtos
  }
  def getAlgorithmScheduleByGuid(guid : Long) : AlgorithmScheduleDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmScheduleDto= SQL("select * from algorithmSchedule where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[AlgorithmScheduleDto].single);
    dtos
  }
  def getAlgorithmScheduleByPk(pkColValue : Long) : AlgorithmScheduleDto = {
    implicit val connection = getConnection();
    val dto : AlgorithmScheduleDto = SQL("select * from algorithmSchedule where algorithmScheduleId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[AlgorithmScheduleDto].single);
    dto
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
  def insertAlgorithmScheduleDto(dto : AlgorithmScheduleDto): AlgorithmScheduleDto = {
    implicit val connection = getConnection();
    val stat = dto.prepareInsert(getConnection());
    val resCnt = stat.executeUpdate();
    val rs = stat.getGeneratedKeys();
    if (rs.next()) {
      val pkValue = rs.getLong(1);
      SQL("select * from algorithmSchedule where algorithmScheduleId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[AlgorithmScheduleDto].single);
    } else {
      null;
    }
  }
  def createAndInsertAlgorithmScheduleDto(algorithmImplementationId : Long, algorithmScheduleTypeId : Long, algorithmScheduleName : String, isScheduled : Int) : AlgorithmScheduleDto = {
    val dto = new AlgorithmScheduleDto(0,0,algorithmImplementationId,algorithmScheduleTypeId,algorithmScheduleName,isScheduled,new Date(),new Date())
    insertAlgorithmScheduleDto(dto);
  }
  def updateAlgorithmScheduleDto(dto : AlgorithmScheduleDto): AlgorithmScheduleDto = {
    implicit val connection = getConnection();
    val resCnt = SQL("update algorithmSchedule set  algorithmImplementationId = {algorithmImplementationId} ,  algorithmScheduleTypeId = {algorithmScheduleTypeId} ,  algorithmScheduleName = {algorithmScheduleName} ,  isScheduled = {isScheduled} ,  lastUpdatedDate = {lastUpdatedDate}  where  algorithmScheduleId = {algorithmScheduleId}  ")
      .on("algorithmImplementationId" -> dto.algorithmImplementationId , "algorithmScheduleTypeId" -> dto.algorithmScheduleTypeId , "algorithmScheduleName" -> dto.algorithmScheduleName , "isScheduled" -> dto.isScheduled , "lastUpdatedDate" -> dto.lastUpdatedDate, "algorithmScheduleId" -> dto.algorithmScheduleId ).executeInsert()
    getAlgorithmScheduleByPk(dto.algorithmScheduleId)
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
    val dtos : AlgorithmScheduleColumnDto= SQL("select * from algorithmScheduleColumn order by insertedRowDate asc ").as(anorm.Macro.namedParser[AlgorithmScheduleColumnDto].*).head;
    dtos
  }
  def getAlgorithmScheduleColumnLast() : AlgorithmScheduleColumnDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmScheduleColumnDto= SQL("select * from algorithmScheduleColumn order by insertedRowDate desc ").as(anorm.Macro.namedParser[AlgorithmScheduleColumnDto].*).head;
    dtos
  }
  def getAlgorithmScheduleColumnByGuid(guid : Long) : AlgorithmScheduleColumnDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmScheduleColumnDto= SQL("select * from algorithmScheduleColumn where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[AlgorithmScheduleColumnDto].single);
    dtos
  }
  def getAlgorithmScheduleColumnByPk(pkColValue : Long) : AlgorithmScheduleColumnDto = {
    implicit val connection = getConnection();
    val dto : AlgorithmScheduleColumnDto = SQL("select * from algorithmScheduleColumn where algorithmScheduleColumnId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[AlgorithmScheduleColumnDto].single);
    dto
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
  def insertAlgorithmScheduleColumnDto(dto : AlgorithmScheduleColumnDto): AlgorithmScheduleColumnDto = {
    implicit val connection = getConnection();
    val stat = dto.prepareInsert(getConnection());
    val resCnt = stat.executeUpdate();
    val rs = stat.getGeneratedKeys();
    if (rs.next()) {
      val pkValue = rs.getLong(1);
      SQL("select * from algorithmScheduleColumn where algorithmScheduleColumnId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[AlgorithmScheduleColumnDto].single);
    } else {
      null;
    }
  }
  def createAndInsertAlgorithmScheduleColumnDto(algorithmScheduleId : Long, algorithmColumnTypeId : Long, algorithmScheduleViewId : Long, sourceViewId : Long, sourceViewColumnId : Long, extendedProperties : String) : AlgorithmScheduleColumnDto = {
    val dto = new AlgorithmScheduleColumnDto(0,0,algorithmScheduleId,algorithmColumnTypeId,algorithmScheduleViewId,sourceViewId,sourceViewColumnId,extendedProperties,new Date(),new Date())
    insertAlgorithmScheduleColumnDto(dto);
  }
  def updateAlgorithmScheduleColumnDto(dto : AlgorithmScheduleColumnDto): AlgorithmScheduleColumnDto = {
    implicit val connection = getConnection();
    val resCnt = SQL("update algorithmScheduleColumn set  algorithmScheduleId = {algorithmScheduleId} ,  algorithmColumnTypeId = {algorithmColumnTypeId} ,  algorithmScheduleViewId = {algorithmScheduleViewId} ,  sourceViewId = {sourceViewId} ,  sourceViewColumnId = {sourceViewColumnId} ,  extendedProperties = {extendedProperties} ,  lastUpdatedDate = {lastUpdatedDate}  where  algorithmScheduleColumnId = {algorithmScheduleColumnId}  ")
      .on("algorithmScheduleId" -> dto.algorithmScheduleId , "algorithmColumnTypeId" -> dto.algorithmColumnTypeId , "algorithmScheduleViewId" -> dto.algorithmScheduleViewId , "sourceViewId" -> dto.sourceViewId , "sourceViewColumnId" -> dto.sourceViewColumnId , "extendedProperties" -> dto.extendedProperties , "lastUpdatedDate" -> dto.lastUpdatedDate, "algorithmScheduleColumnId" -> dto.algorithmScheduleColumnId ).executeInsert()
    getAlgorithmScheduleColumnByPk(dto.algorithmScheduleColumnId)
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
    val dtos : AlgorithmScheduleParamDto= SQL("select * from algorithmScheduleParam order by insertedRowDate asc ").as(anorm.Macro.namedParser[AlgorithmScheduleParamDto].*).head;
    dtos
  }
  def getAlgorithmScheduleParamLast() : AlgorithmScheduleParamDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmScheduleParamDto= SQL("select * from algorithmScheduleParam order by insertedRowDate desc ").as(anorm.Macro.namedParser[AlgorithmScheduleParamDto].*).head;
    dtos
  }
  def getAlgorithmScheduleParamByGuid(guid : Long) : AlgorithmScheduleParamDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmScheduleParamDto= SQL("select * from algorithmScheduleParam where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[AlgorithmScheduleParamDto].single);
    dtos
  }
  def getAlgorithmScheduleParamByPk(pkColValue : Long) : AlgorithmScheduleParamDto = {
    implicit val connection = getConnection();
    val dto : AlgorithmScheduleParamDto = SQL("select * from algorithmScheduleParam where algorithmScheduleParamId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[AlgorithmScheduleParamDto].single);
    dto
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
  def insertAlgorithmScheduleParamDto(dto : AlgorithmScheduleParamDto): AlgorithmScheduleParamDto = {
    implicit val connection = getConnection();
    val stat = dto.prepareInsert(getConnection());
    val resCnt = stat.executeUpdate();
    val rs = stat.getGeneratedKeys();
    if (rs.next()) {
      val pkValue = rs.getLong(1);
      SQL("select * from algorithmScheduleParam where algorithmScheduleParamId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[AlgorithmScheduleParamDto].single);
    } else {
      null;
    }
  }
  def createAndInsertAlgorithmScheduleParamDto(algorithmScheduleId : Long, algorithmParamId : Long, algorithmParamValue : String) : AlgorithmScheduleParamDto = {
    val dto = new AlgorithmScheduleParamDto(0,0,algorithmScheduleId,algorithmParamId,algorithmParamValue,new Date(),new Date())
    insertAlgorithmScheduleParamDto(dto);
  }
  def updateAlgorithmScheduleParamDto(dto : AlgorithmScheduleParamDto): AlgorithmScheduleParamDto = {
    implicit val connection = getConnection();
    val resCnt = SQL("update algorithmScheduleParam set  algorithmScheduleId = {algorithmScheduleId} ,  algorithmParamId = {algorithmParamId} ,  algorithmParamValue = {algorithmParamValue} ,  lastUpdatedDate = {lastUpdatedDate}  where  algorithmScheduleParamId = {algorithmScheduleParamId}  ")
      .on("algorithmScheduleId" -> dto.algorithmScheduleId , "algorithmParamId" -> dto.algorithmParamId , "algorithmParamValue" -> dto.algorithmParamValue , "lastUpdatedDate" -> dto.lastUpdatedDate, "algorithmScheduleParamId" -> dto.algorithmScheduleParamId ).executeInsert()
    getAlgorithmScheduleParamByPk(dto.algorithmScheduleParamId)
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
    val dtos : AlgorithmScheduleTypeDto= SQL("select * from algorithmScheduleType order by insertedRowDate asc ").as(anorm.Macro.namedParser[AlgorithmScheduleTypeDto].*).head;
    dtos
  }
  def getAlgorithmScheduleTypeLast() : AlgorithmScheduleTypeDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmScheduleTypeDto= SQL("select * from algorithmScheduleType order by insertedRowDate desc ").as(anorm.Macro.namedParser[AlgorithmScheduleTypeDto].*).head;
    dtos
  }
  def getAlgorithmScheduleTypeByGuid(guid : Long) : AlgorithmScheduleTypeDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmScheduleTypeDto= SQL("select * from algorithmScheduleType where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[AlgorithmScheduleTypeDto].single);
    dtos
  }
  def getAlgorithmScheduleTypeByPk(pkColValue : Long) : AlgorithmScheduleTypeDto = {
    implicit val connection = getConnection();
    val dto : AlgorithmScheduleTypeDto = SQL("select * from algorithmScheduleType where algorithmScheduleTypeId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[AlgorithmScheduleTypeDto].single);
    dto
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
  def insertAlgorithmScheduleTypeDto(dto : AlgorithmScheduleTypeDto): AlgorithmScheduleTypeDto = {
    implicit val connection = getConnection();
    val stat = dto.prepareInsert(getConnection());
    val resCnt = stat.executeUpdate();
    val rs = stat.getGeneratedKeys();
    if (rs.next()) {
      val pkValue = rs.getLong(1);
      SQL("select * from algorithmScheduleType where algorithmScheduleTypeId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[AlgorithmScheduleTypeDto].single);
    } else {
      null;
    }
  }
  def createAndInsertAlgorithmScheduleTypeDto(algorithmScheduleTypeName : String) : AlgorithmScheduleTypeDto = {
    val dto = new AlgorithmScheduleTypeDto(0,0,algorithmScheduleTypeName,new Date(),new Date())
    insertAlgorithmScheduleTypeDto(dto);
  }
  def updateAlgorithmScheduleTypeDto(dto : AlgorithmScheduleTypeDto): AlgorithmScheduleTypeDto = {
    implicit val connection = getConnection();
    val resCnt = SQL("update algorithmScheduleType set  algorithmScheduleTypeName = {algorithmScheduleTypeName} ,  lastUpdatedDate = {lastUpdatedDate}  where  algorithmScheduleTypeId = {algorithmScheduleTypeId}  ")
      .on("algorithmScheduleTypeName" -> dto.algorithmScheduleTypeName , "lastUpdatedDate" -> dto.lastUpdatedDate, "algorithmScheduleTypeId" -> dto.algorithmScheduleTypeId ).executeInsert()
    getAlgorithmScheduleTypeByPk(dto.algorithmScheduleTypeId)
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
    val dtos : AlgorithmScheduleViewDto= SQL("select * from algorithmScheduleView order by insertedRowDate asc ").as(anorm.Macro.namedParser[AlgorithmScheduleViewDto].*).head;
    dtos
  }
  def getAlgorithmScheduleViewLast() : AlgorithmScheduleViewDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmScheduleViewDto= SQL("select * from algorithmScheduleView order by insertedRowDate desc ").as(anorm.Macro.namedParser[AlgorithmScheduleViewDto].*).head;
    dtos
  }
  def getAlgorithmScheduleViewByGuid(guid : Long) : AlgorithmScheduleViewDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmScheduleViewDto= SQL("select * from algorithmScheduleView where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[AlgorithmScheduleViewDto].single);
    dtos
  }
  def getAlgorithmScheduleViewByPk(pkColValue : Long) : AlgorithmScheduleViewDto = {
    implicit val connection = getConnection();
    val dto : AlgorithmScheduleViewDto = SQL("select * from algorithmScheduleView where algorithmScheduleViewId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[AlgorithmScheduleViewDto].single);
    dto
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
  def insertAlgorithmScheduleViewDto(dto : AlgorithmScheduleViewDto): AlgorithmScheduleViewDto = {
    implicit val connection = getConnection();
    val stat = dto.prepareInsert(getConnection());
    val resCnt = stat.executeUpdate();
    val rs = stat.getGeneratedKeys();
    if (rs.next()) {
      val pkValue = rs.getLong(1);
      SQL("select * from algorithmScheduleView where algorithmScheduleViewId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[AlgorithmScheduleViewDto].single);
    } else {
      null;
    }
  }
  def createAndInsertAlgorithmScheduleViewDto(algorithmScheduleViewTypeId : Long, algorithmScheduleId : Long, sourceViewId : Long, joinOnDefinition : String) : AlgorithmScheduleViewDto = {
    val dto = new AlgorithmScheduleViewDto(0,0,algorithmScheduleViewTypeId,algorithmScheduleId,sourceViewId,new Date(),new Date(),joinOnDefinition)
    insertAlgorithmScheduleViewDto(dto);
  }
  def updateAlgorithmScheduleViewDto(dto : AlgorithmScheduleViewDto): AlgorithmScheduleViewDto = {
    implicit val connection = getConnection();
    val resCnt = SQL("update algorithmScheduleView set  algorithmScheduleViewTypeId = {algorithmScheduleViewTypeId} ,  algorithmScheduleId = {algorithmScheduleId} ,  sourceViewId = {sourceViewId} ,  lastUpdatedDate = {lastUpdatedDate} ,  joinOnDefinition = {joinOnDefinition}  where  algorithmScheduleViewId = {algorithmScheduleViewId}  ")
      .on("algorithmScheduleViewTypeId" -> dto.algorithmScheduleViewTypeId , "algorithmScheduleId" -> dto.algorithmScheduleId , "sourceViewId" -> dto.sourceViewId , "lastUpdatedDate" -> dto.lastUpdatedDate , "joinOnDefinition" -> dto.joinOnDefinition, "algorithmScheduleViewId" -> dto.algorithmScheduleViewId ).executeInsert()
    getAlgorithmScheduleViewByPk(dto.algorithmScheduleViewId)
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
    val dtos : AlgorithmScheduleViewTypeDto= SQL("select * from algorithmScheduleViewType order by insertedRowDate asc ").as(anorm.Macro.namedParser[AlgorithmScheduleViewTypeDto].*).head;
    dtos
  }
  def getAlgorithmScheduleViewTypeLast() : AlgorithmScheduleViewTypeDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmScheduleViewTypeDto= SQL("select * from algorithmScheduleViewType order by insertedRowDate desc ").as(anorm.Macro.namedParser[AlgorithmScheduleViewTypeDto].*).head;
    dtos
  }
  def getAlgorithmScheduleViewTypeByGuid(guid : Long) : AlgorithmScheduleViewTypeDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmScheduleViewTypeDto= SQL("select * from algorithmScheduleViewType where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[AlgorithmScheduleViewTypeDto].single);
    dtos
  }
  def getAlgorithmScheduleViewTypeByPk(pkColValue : Long) : AlgorithmScheduleViewTypeDto = {
    implicit val connection = getConnection();
    val dto : AlgorithmScheduleViewTypeDto = SQL("select * from algorithmScheduleViewType where algorithmScheduleViewTypeId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[AlgorithmScheduleViewTypeDto].single);
    dto
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
  def insertAlgorithmScheduleViewTypeDto(dto : AlgorithmScheduleViewTypeDto): AlgorithmScheduleViewTypeDto = {
    implicit val connection = getConnection();
    val stat = dto.prepareInsert(getConnection());
    val resCnt = stat.executeUpdate();
    val rs = stat.getGeneratedKeys();
    if (rs.next()) {
      val pkValue = rs.getLong(1);
      SQL("select * from algorithmScheduleViewType where algorithmScheduleViewTypeId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[AlgorithmScheduleViewTypeDto].single);
    } else {
      null;
    }
  }
  def createAndInsertAlgorithmScheduleViewTypeDto(algorithmScheduleViewTypeName : String) : AlgorithmScheduleViewTypeDto = {
    val dto = new AlgorithmScheduleViewTypeDto(0,0,algorithmScheduleViewTypeName,new Date(),new Date())
    insertAlgorithmScheduleViewTypeDto(dto);
  }
  def updateAlgorithmScheduleViewTypeDto(dto : AlgorithmScheduleViewTypeDto): AlgorithmScheduleViewTypeDto = {
    implicit val connection = getConnection();
    val resCnt = SQL("update algorithmScheduleViewType set  algorithmScheduleViewTypeName = {algorithmScheduleViewTypeName} ,  lastUpdatedDate = {lastUpdatedDate}  where  algorithmScheduleViewTypeId = {algorithmScheduleViewTypeId}  ")
      .on("algorithmScheduleViewTypeName" -> dto.algorithmScheduleViewTypeName , "lastUpdatedDate" -> dto.lastUpdatedDate, "algorithmScheduleViewTypeId" -> dto.algorithmScheduleViewTypeId ).executeInsert()
    getAlgorithmScheduleViewTypeByPk(dto.algorithmScheduleViewTypeId)
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
    val dtos : AlgorithmTypeDto= SQL("select * from algorithmType order by insertedRowDate asc ").as(anorm.Macro.namedParser[AlgorithmTypeDto].*).head;
    dtos
  }
  def getAlgorithmTypeLast() : AlgorithmTypeDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmTypeDto= SQL("select * from algorithmType order by insertedRowDate desc ").as(anorm.Macro.namedParser[AlgorithmTypeDto].*).head;
    dtos
  }
  def getAlgorithmTypeByGuid(guid : Long) : AlgorithmTypeDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmTypeDto= SQL("select * from algorithmType where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[AlgorithmTypeDto].single);
    dtos
  }
  def getAlgorithmTypeByPk(pkColValue : Long) : AlgorithmTypeDto = {
    implicit val connection = getConnection();
    val dto : AlgorithmTypeDto = SQL("select * from algorithmType where algorithmTypeId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[AlgorithmTypeDto].single);
    dto
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
  def insertAlgorithmTypeDto(dto : AlgorithmTypeDto): AlgorithmTypeDto = {
    implicit val connection = getConnection();
    val stat = dto.prepareInsert(getConnection());
    val resCnt = stat.executeUpdate();
    val rs = stat.getGeneratedKeys();
    if (rs.next()) {
      val pkValue = rs.getLong(1);
      SQL("select * from algorithmType where algorithmTypeId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[AlgorithmTypeDto].single);
    } else {
      null;
    }
  }
  def createAndInsertAlgorithmTypeDto(algorithmTypeName : String, algorithmTypeDescription : String) : AlgorithmTypeDto = {
    val dto = new AlgorithmTypeDto(0,0,algorithmTypeName,algorithmTypeDescription,new Date(),new Date())
    insertAlgorithmTypeDto(dto);
  }
  def updateAlgorithmTypeDto(dto : AlgorithmTypeDto): AlgorithmTypeDto = {
    implicit val connection = getConnection();
    val resCnt = SQL("update algorithmType set  algorithmTypeName = {algorithmTypeName} ,  algorithmTypeDescription = {algorithmTypeDescription} ,  lastUpdatedDate = {lastUpdatedDate}  where  algorithmTypeId = {algorithmTypeId}  ")
      .on("algorithmTypeName" -> dto.algorithmTypeName , "algorithmTypeDescription" -> dto.algorithmTypeDescription , "lastUpdatedDate" -> dto.lastUpdatedDate, "algorithmTypeId" -> dto.algorithmTypeId ).executeInsert()
    getAlgorithmTypeByPk(dto.algorithmTypeId)
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
    val dtos : AlgorithmTypeColumnTypeDto= SQL("select * from algorithmTypeColumnType order by insertedRowDate asc ").as(anorm.Macro.namedParser[AlgorithmTypeColumnTypeDto].*).head;
    dtos
  }
  def getAlgorithmTypeColumnTypeLast() : AlgorithmTypeColumnTypeDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmTypeColumnTypeDto= SQL("select * from algorithmTypeColumnType order by insertedRowDate desc ").as(anorm.Macro.namedParser[AlgorithmTypeColumnTypeDto].*).head;
    dtos
  }
  def getAlgorithmTypeColumnTypeByGuid(guid : Long) : AlgorithmTypeColumnTypeDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmTypeColumnTypeDto= SQL("select * from algorithmTypeColumnType where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[AlgorithmTypeColumnTypeDto].single);
    dtos
  }
  def getAlgorithmTypeColumnTypeByPk(pkColValue : Long) : AlgorithmTypeColumnTypeDto = {
    implicit val connection = getConnection();
    val dto : AlgorithmTypeColumnTypeDto = SQL("select * from algorithmTypeColumnType where algorithmTypeColumnTypeId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[AlgorithmTypeColumnTypeDto].single);
    dto
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
  def insertAlgorithmTypeColumnTypeDto(dto : AlgorithmTypeColumnTypeDto): AlgorithmTypeColumnTypeDto = {
    implicit val connection = getConnection();
    val stat = dto.prepareInsert(getConnection());
    val resCnt = stat.executeUpdate();
    val rs = stat.getGeneratedKeys();
    if (rs.next()) {
      val pkValue = rs.getLong(1);
      SQL("select * from algorithmTypeColumnType where algorithmTypeColumnTypeId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[AlgorithmTypeColumnTypeDto].single);
    } else {
      null;
    }
  }
  def createAndInsertAlgorithmTypeColumnTypeDto(algorithmTypeVersionId : Long, algorithmColumnTypeId : Long, allowMultiple : Int, allowEmpty : Int) : AlgorithmTypeColumnTypeDto = {
    val dto = new AlgorithmTypeColumnTypeDto(0,algorithmTypeVersionId,algorithmColumnTypeId,allowMultiple,allowEmpty,new Date(),new Date(),0)
    insertAlgorithmTypeColumnTypeDto(dto);
  }
  def updateAlgorithmTypeColumnTypeDto(dto : AlgorithmTypeColumnTypeDto): AlgorithmTypeColumnTypeDto = {
    implicit val connection = getConnection();
    val resCnt = SQL("update algorithmTypeColumnType set  algorithmTypeVersionId = {algorithmTypeVersionId} ,  algorithmColumnTypeId = {algorithmColumnTypeId} ,  allowMultiple = {allowMultiple} ,  allowEmpty = {allowEmpty} ,  lastUpdatedDate = {lastUpdatedDate}  where  algorithmTypeColumnTypeId = {algorithmTypeColumnTypeId}  ")
      .on("algorithmTypeVersionId" -> dto.algorithmTypeVersionId , "algorithmColumnTypeId" -> dto.algorithmColumnTypeId , "allowMultiple" -> dto.allowMultiple , "allowEmpty" -> dto.allowEmpty , "lastUpdatedDate" -> dto.lastUpdatedDate, "algorithmTypeColumnTypeId" -> dto.algorithmTypeColumnTypeId ).executeInsert()
    getAlgorithmTypeColumnTypeByPk(dto.algorithmTypeColumnTypeId)
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
    val dtos : AlgorithmTypeOutputTypeDto= SQL("select * from algorithmTypeOutputType order by insertedRowDate asc ").as(anorm.Macro.namedParser[AlgorithmTypeOutputTypeDto].*).head;
    dtos
  }
  def getAlgorithmTypeOutputTypeLast() : AlgorithmTypeOutputTypeDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmTypeOutputTypeDto= SQL("select * from algorithmTypeOutputType order by insertedRowDate desc ").as(anorm.Macro.namedParser[AlgorithmTypeOutputTypeDto].*).head;
    dtos
  }
  def getAlgorithmTypeOutputTypeByGuid(guid : Long) : AlgorithmTypeOutputTypeDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmTypeOutputTypeDto= SQL("select * from algorithmTypeOutputType where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[AlgorithmTypeOutputTypeDto].single);
    dtos
  }
  def getAlgorithmTypeOutputTypeByPk(pkColValue : Long) : AlgorithmTypeOutputTypeDto = {
    implicit val connection = getConnection();
    val dto : AlgorithmTypeOutputTypeDto = SQL("select * from algorithmTypeOutputType where algorithmTypeOutputTypeId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[AlgorithmTypeOutputTypeDto].single);
    dto
  }
  def getAlgorithmTypeOutputTypeMaxId() : Long = {
    implicit val connection = getConnection();
    val maxid : Long = SQL("select max(algorithmTypeOutputTypeId) as maxId from algorithmTypeOutputType ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;
    maxid
  }
  def insertAlgorithmTypeOutputTypeDto(dto : AlgorithmTypeOutputTypeDto): AlgorithmTypeOutputTypeDto = {
    implicit val connection = getConnection();
    val stat = dto.prepareInsert(getConnection());
    val resCnt = stat.executeUpdate();
    val rs = stat.getGeneratedKeys();
    if (rs.next()) {
      val pkValue = rs.getLong(1);
      SQL("select * from algorithmTypeOutputType where algorithmTypeOutputTypeId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[AlgorithmTypeOutputTypeDto].single);
    } else {
      null;
    }
  }
  def createAndInsertAlgorithmTypeOutputTypeDto(algorithmTypeVersionId : Long, algorithmOutputTypeId : Long, isMandatory : Int) : AlgorithmTypeOutputTypeDto = {
    val dto = new AlgorithmTypeOutputTypeDto(0,0,algorithmTypeVersionId,algorithmOutputTypeId,isMandatory,new Date(),new Date())
    insertAlgorithmTypeOutputTypeDto(dto);
  }
  def updateAlgorithmTypeOutputTypeDto(dto : AlgorithmTypeOutputTypeDto): AlgorithmTypeOutputTypeDto = {
    implicit val connection = getConnection();
    val resCnt = SQL("update algorithmTypeOutputType set  algorithmTypeVersionId = {algorithmTypeVersionId} ,  algorithmOutputTypeId = {algorithmOutputTypeId} ,  isMandatory = {isMandatory} ,  lastUpdatedDate = {lastUpdatedDate}  where  algorithmTypeOutputTypeId = {algorithmTypeOutputTypeId}  ")
      .on("algorithmTypeVersionId" -> dto.algorithmTypeVersionId , "algorithmOutputTypeId" -> dto.algorithmOutputTypeId , "isMandatory" -> dto.isMandatory , "lastUpdatedDate" -> dto.lastUpdatedDate, "algorithmTypeOutputTypeId" -> dto.algorithmTypeOutputTypeId ).executeInsert()
    getAlgorithmTypeOutputTypeByPk(dto.algorithmTypeOutputTypeId)
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
    val dtos : AlgorithmTypeVersionDto= SQL("select * from algorithmTypeVersion order by insertedRowDate asc ").as(anorm.Macro.namedParser[AlgorithmTypeVersionDto].*).head;
    dtos
  }
  def getAlgorithmTypeVersionLast() : AlgorithmTypeVersionDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmTypeVersionDto= SQL("select * from algorithmTypeVersion order by insertedRowDate desc ").as(anorm.Macro.namedParser[AlgorithmTypeVersionDto].*).head;
    dtos
  }
  def getAlgorithmTypeVersionByGuid(guid : Long) : AlgorithmTypeVersionDto = {
    implicit val connection = getConnection();
    val dtos : AlgorithmTypeVersionDto= SQL("select * from algorithmTypeVersion where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[AlgorithmTypeVersionDto].single);
    dtos
  }
  def getAlgorithmTypeVersionByPk(pkColValue : Long) : AlgorithmTypeVersionDto = {
    implicit val connection = getConnection();
    val dto : AlgorithmTypeVersionDto = SQL("select * from algorithmTypeVersion where algorithmTypeVersionId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[AlgorithmTypeVersionDto].single);
    dto
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
  def insertAlgorithmTypeVersionDto(dto : AlgorithmTypeVersionDto): AlgorithmTypeVersionDto = {
    implicit val connection = getConnection();
    val stat = dto.prepareInsert(getConnection());
    val resCnt = stat.executeUpdate();
    val rs = stat.getGeneratedKeys();
    if (rs.next()) {
      val pkValue = rs.getLong(1);
      SQL("select * from algorithmTypeVersion where algorithmTypeVersionId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[AlgorithmTypeVersionDto].single);
    } else {
      null;
    }
  }
  def createAndInsertAlgorithmTypeVersionDto(algorithmTypeId : Long, algorithmTypeVersionName : String) : AlgorithmTypeVersionDto = {
    val dto = new AlgorithmTypeVersionDto(0,0,algorithmTypeId,algorithmTypeVersionName,new Date(),new Date())
    insertAlgorithmTypeVersionDto(dto);
  }
  def updateAlgorithmTypeVersionDto(dto : AlgorithmTypeVersionDto): AlgorithmTypeVersionDto = {
    implicit val connection = getConnection();
    val resCnt = SQL("update algorithmTypeVersion set  algorithmTypeId = {algorithmTypeId} ,  algorithmTypeVersionName = {algorithmTypeVersionName} ,  lastUpdatedDate = {lastUpdatedDate}  where  algorithmTypeVersionId = {algorithmTypeVersionId}  ")
      .on("algorithmTypeId" -> dto.algorithmTypeId , "algorithmTypeVersionName" -> dto.algorithmTypeVersionName , "lastUpdatedDate" -> dto.lastUpdatedDate, "algorithmTypeVersionId" -> dto.algorithmTypeVersionId ).executeInsert()
    getAlgorithmTypeVersionByPk(dto.algorithmTypeVersionId)
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
    val dtos : ExecutorHostDto= SQL("select * from executorHost order by insertedRowDate asc ").as(anorm.Macro.namedParser[ExecutorHostDto].*).head;
    dtos
  }
  def getExecutorHostLast() : ExecutorHostDto = {
    implicit val connection = getConnection();
    val dtos : ExecutorHostDto= SQL("select * from executorHost order by insertedRowDate desc ").as(anorm.Macro.namedParser[ExecutorHostDto].*).head;
    dtos
  }
  def getExecutorHostByGuid(guid : Long) : ExecutorHostDto = {
    implicit val connection = getConnection();
    val dtos : ExecutorHostDto= SQL("select * from executorHost where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[ExecutorHostDto].single);
    dtos
  }
  def getExecutorHostByPk(pkColValue : Long) : ExecutorHostDto = {
    implicit val connection = getConnection();
    val dto : ExecutorHostDto = SQL("select * from executorHost where executorHostId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[ExecutorHostDto].single);
    dto
  }
  def getExecutorHostMaxId() : Long = {
    implicit val connection = getConnection();
    val maxid : Long = SQL("select max(executorHostId) as maxId from executorHost ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;
    maxid
  }
  def insertExecutorHostDto(dto : ExecutorHostDto): ExecutorHostDto = {
    implicit val connection = getConnection();
    val stat = dto.prepareInsert(getConnection());
    val resCnt = stat.executeUpdate();
    val rs = stat.getGeneratedKeys();
    if (rs.next()) {
      val pkValue = rs.getLong(1);
      SQL("select * from executorHost where executorHostId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[ExecutorHostDto].single);
    } else {
      null;
    }
  }
  def createAndInsertExecutorHostDto(hostName : String, hostIp : String, hostDomain : String, hostOsType : String, hostOsVersion : String, isWorking : Int) : ExecutorHostDto = {
    val dto = new ExecutorHostDto(0,0,new Date(),new Date(),hostName,hostIp,hostDomain,hostOsType,hostOsVersion,isWorking)
    insertExecutorHostDto(dto);
  }
  def updateExecutorHostDto(dto : ExecutorHostDto): ExecutorHostDto = {
    implicit val connection = getConnection();
    val resCnt = SQL("update executorHost set  lastUpdatedDate = {lastUpdatedDate} ,  hostName = {hostName} ,  hostIp = {hostIp} ,  hostDomain = {hostDomain} ,  hostOsType = {hostOsType} ,  hostOsVersion = {hostOsVersion} ,  isWorking = {isWorking}  where  executorHostId = {executorHostId}  ")
      .on("lastUpdatedDate" -> dto.lastUpdatedDate , "hostName" -> dto.hostName , "hostIp" -> dto.hostIp , "hostDomain" -> dto.hostDomain , "hostOsType" -> dto.hostOsType , "hostOsVersion" -> dto.hostOsVersion , "isWorking" -> dto.isWorking, "executorHostId" -> dto.executorHostId ).executeInsert()
    getExecutorHostByPk(dto.executorHostId)
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
    val dtos : ExecutorInstanceDto= SQL("select * from executorInstance order by insertedRowDate asc ").as(anorm.Macro.namedParser[ExecutorInstanceDto].*).head;
    dtos
  }
  def getExecutorInstanceLast() : ExecutorInstanceDto = {
    implicit val connection = getConnection();
    val dtos : ExecutorInstanceDto= SQL("select * from executorInstance order by insertedRowDate desc ").as(anorm.Macro.namedParser[ExecutorInstanceDto].*).head;
    dtos
  }
  def getExecutorInstanceByGuid(guid : Long) : ExecutorInstanceDto = {
    implicit val connection = getConnection();
    val dtos : ExecutorInstanceDto= SQL("select * from executorInstance where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[ExecutorInstanceDto].single);
    dtos
  }
  def getExecutorInstanceByPk(pkColValue : Long) : ExecutorInstanceDto = {
    implicit val connection = getConnection();
    val dto : ExecutorInstanceDto = SQL("select * from executorInstance where executorInstanceId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[ExecutorInstanceDto].single);
    dto
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
  def insertExecutorInstanceDto(dto : ExecutorInstanceDto): ExecutorInstanceDto = {
    implicit val connection = getConnection();
    val stat = dto.prepareInsert(getConnection());
    val resCnt = stat.executeUpdate();
    val rs = stat.getGeneratedKeys();
    if (rs.next()) {
      val pkValue = rs.getLong(1);
      SQL("select * from executorInstance where executorInstanceId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[ExecutorInstanceDto].single);
    } else {
      null;
    }
  }
  def createAndInsertExecutorInstanceDto(executorTypeId : Long, executorHostId : Long, executorInstanceName : String, isRunning : Int, isFinished : Int, portNumber : Int, endDate : java.util.Date) : ExecutorInstanceDto = {
    val dto = new ExecutorInstanceDto(0,0,executorTypeId,executorHostId,executorInstanceName,isRunning,isFinished,portNumber,new Date(),new Date(),endDate)
    insertExecutorInstanceDto(dto);
  }
  def updateExecutorInstanceDto(dto : ExecutorInstanceDto): ExecutorInstanceDto = {
    implicit val connection = getConnection();
    val resCnt = SQL("update executorInstance set  executorTypeId = {executorTypeId} ,  executorHostId = {executorHostId} ,  executorInstanceName = {executorInstanceName} ,  isRunning = {isRunning} ,  isFinished = {isFinished} ,  portNumber = {portNumber} ,  lastUpdatedDate = {lastUpdatedDate} ,  endDate = {endDate}  where  executorInstanceId = {executorInstanceId}  ")
      .on("executorTypeId" -> dto.executorTypeId , "executorHostId" -> dto.executorHostId , "executorInstanceName" -> dto.executorInstanceName , "isRunning" -> dto.isRunning , "isFinished" -> dto.isFinished , "portNumber" -> dto.portNumber , "lastUpdatedDate" -> dto.lastUpdatedDate , "endDate" -> dto.endDate, "executorInstanceId" -> dto.executorInstanceId ).executeInsert()
    getExecutorInstanceByPk(dto.executorInstanceId)
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
    val dtos : ExecutorRestDto= SQL("select * from executorRest order by insertedRowDate asc ").as(anorm.Macro.namedParser[ExecutorRestDto].*).head;
    dtos
  }
  def getExecutorRestLast() : ExecutorRestDto = {
    implicit val connection = getConnection();
    val dtos : ExecutorRestDto= SQL("select * from executorRest order by insertedRowDate desc ").as(anorm.Macro.namedParser[ExecutorRestDto].*).head;
    dtos
  }
  def getExecutorRestByGuid(guid : Long) : ExecutorRestDto = {
    implicit val connection = getConnection();
    val dtos : ExecutorRestDto= SQL("select * from executorRest where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[ExecutorRestDto].single);
    dtos
  }
  def getExecutorRestByPk(pkColValue : Long) : ExecutorRestDto = {
    implicit val connection = getConnection();
    val dto : ExecutorRestDto = SQL("select * from executorRest where executorRestId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[ExecutorRestDto].single);
    dto
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
  def insertExecutorRestDto(dto : ExecutorRestDto): ExecutorRestDto = {
    implicit val connection = getConnection();
    val stat = dto.prepareInsert(getConnection());
    val resCnt = stat.executeUpdate();
    val rs = stat.getGeneratedKeys();
    if (rs.next()) {
      val pkValue = rs.getLong(1);
      SQL("select * from executorRest where executorRestId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[ExecutorRestDto].single);
    } else {
      null;
    }
  }
  def createAndInsertExecutorRestDto(executorHostId : Long, restPort : Int, restVersion : String, restStatus : String) : ExecutorRestDto = {
    val dto = new ExecutorRestDto(0,0,executorHostId,new Date(),new Date(),restPort,restVersion,restStatus)
    insertExecutorRestDto(dto);
  }
  def updateExecutorRestDto(dto : ExecutorRestDto): ExecutorRestDto = {
    implicit val connection = getConnection();
    val resCnt = SQL("update executorRest set  executorHostId = {executorHostId} ,  lastUpdatedDate = {lastUpdatedDate} ,  restPort = {restPort} ,  restVersion = {restVersion} ,  restStatus = {restStatus}  where  executorRestId = {executorRestId}  ")
      .on("executorHostId" -> dto.executorHostId , "lastUpdatedDate" -> dto.lastUpdatedDate , "restPort" -> dto.restPort , "restVersion" -> dto.restVersion , "restStatus" -> dto.restStatus, "executorRestId" -> dto.executorRestId ).executeInsert()
    getExecutorRestByPk(dto.executorRestId)
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
    val dtos : ExecutorRestCallDto= SQL("select * from executorRestCall order by insertedRowDate asc ").as(anorm.Macro.namedParser[ExecutorRestCallDto].*).head;
    dtos
  }
  def getExecutorRestCallLast() : ExecutorRestCallDto = {
    implicit val connection = getConnection();
    val dtos : ExecutorRestCallDto= SQL("select * from executorRestCall order by insertedRowDate desc ").as(anorm.Macro.namedParser[ExecutorRestCallDto].*).head;
    dtos
  }
  def getExecutorRestCallByGuid(guid : Long) : ExecutorRestCallDto = {
    implicit val connection = getConnection();
    val dtos : ExecutorRestCallDto= SQL("select * from executorRestCall where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[ExecutorRestCallDto].single);
    dtos
  }
  def getExecutorRestCallByPk(pkColValue : Long) : ExecutorRestCallDto = {
    implicit val connection = getConnection();
    val dto : ExecutorRestCallDto = SQL("select * from executorRestCall where executorRestCallId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[ExecutorRestCallDto].single);
    dto
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
  def insertExecutorRestCallDto(dto : ExecutorRestCallDto): ExecutorRestCallDto = {
    implicit val connection = getConnection();
    val stat = dto.prepareInsert(getConnection());
    val resCnt = stat.executeUpdate();
    val rs = stat.getGeneratedKeys();
    if (rs.next()) {
      val pkValue = rs.getLong(1);
      SQL("select * from executorRestCall where executorRestCallId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[ExecutorRestCallDto].single);
    } else {
      null;
    }
  }
  def createAndInsertExecutorRestCallDto(executorHostId : Long, executorRestId : Long, requestMethod : String, requestHeader : String, requestBody : String, responseBody : String) : ExecutorRestCallDto = {
    val dto = new ExecutorRestCallDto(0,0,new Date(),new Date(),executorHostId,executorRestId,requestMethod,requestHeader,requestBody,responseBody)
    insertExecutorRestCallDto(dto);
  }
  def updateExecutorRestCallDto(dto : ExecutorRestCallDto): ExecutorRestCallDto = {
    implicit val connection = getConnection();
    val resCnt = SQL("update executorRestCall set  lastUpdatedDate = {lastUpdatedDate} ,  executorHostId = {executorHostId} ,  executorRestId = {executorRestId} ,  requestMethod = {requestMethod} ,  requestHeader = {requestHeader} ,  requestBody = {requestBody} ,  responseBody = {responseBody}  where  executorRestCallId = {executorRestCallId}  ")
      .on("lastUpdatedDate" -> dto.lastUpdatedDate , "executorHostId" -> dto.executorHostId , "executorRestId" -> dto.executorRestId , "requestMethod" -> dto.requestMethod , "requestHeader" -> dto.requestHeader , "requestBody" -> dto.requestBody , "responseBody" -> dto.responseBody, "executorRestCallId" -> dto.executorRestCallId ).executeInsert()
    getExecutorRestCallByPk(dto.executorRestCallId)
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
    val dtos : ExecutorStorageDto= SQL("select * from executorStorage order by insertedRowDate asc ").as(anorm.Macro.namedParser[ExecutorStorageDto].*).head;
    dtos
  }
  def getExecutorStorageLast() : ExecutorStorageDto = {
    implicit val connection = getConnection();
    val dtos : ExecutorStorageDto= SQL("select * from executorStorage order by insertedRowDate desc ").as(anorm.Macro.namedParser[ExecutorStorageDto].*).head;
    dtos
  }
  def getExecutorStorageByGuid(guid : Long) : ExecutorStorageDto = {
    implicit val connection = getConnection();
    val dtos : ExecutorStorageDto= SQL("select * from executorStorage where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[ExecutorStorageDto].single);
    dtos
  }
  def getExecutorStorageByPk(pkColValue : Long) : ExecutorStorageDto = {
    implicit val connection = getConnection();
    val dto : ExecutorStorageDto = SQL("select * from executorStorage where executorStorageId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[ExecutorStorageDto].single);
    dto
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
  def insertExecutorStorageDto(dto : ExecutorStorageDto): ExecutorStorageDto = {
    implicit val connection = getConnection();
    val stat = dto.prepareInsert(getConnection());
    val resCnt = stat.executeUpdate();
    val rs = stat.getGeneratedKeys();
    if (rs.next()) {
      val pkValue = rs.getLong(1);
      SQL("select * from executorStorage where executorStorageId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[ExecutorStorageDto].single);
    } else {
      null;
    }
  }
  def createAndInsertExecutorStorageDto(executorHostId : Long, executorStorageTypeId : Long, storageDefinition : String, storageBasePath : String, storageFulllPath : String, isRunning : Int, portNumber : Int) : ExecutorStorageDto = {
    val dto = new ExecutorStorageDto(0,0,executorHostId,executorStorageTypeId,storageDefinition,storageBasePath,storageFulllPath,isRunning,portNumber,new Date(),new Date())
    insertExecutorStorageDto(dto);
  }
  def updateExecutorStorageDto(dto : ExecutorStorageDto): ExecutorStorageDto = {
    implicit val connection = getConnection();
    val resCnt = SQL("update executorStorage set  executorHostId = {executorHostId} ,  executorStorageTypeId = {executorStorageTypeId} ,  storageDefinition = {storageDefinition} ,  storageBasePath = {storageBasePath} ,  storageFulllPath = {storageFulllPath} ,  isRunning = {isRunning} ,  portNumber = {portNumber} ,  lastUpdatedDate = {lastUpdatedDate}  where  executorStorageId = {executorStorageId}  ")
      .on("executorHostId" -> dto.executorHostId , "executorStorageTypeId" -> dto.executorStorageTypeId , "storageDefinition" -> dto.storageDefinition , "storageBasePath" -> dto.storageBasePath , "storageFulllPath" -> dto.storageFulllPath , "isRunning" -> dto.isRunning , "portNumber" -> dto.portNumber , "lastUpdatedDate" -> dto.lastUpdatedDate, "executorStorageId" -> dto.executorStorageId ).executeInsert()
    getExecutorStorageByPk(dto.executorStorageId)
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
    val dtos : ExecutorStorageSnapshotDto= SQL("select * from executorStorageSnapshot order by insertedRowDate asc ").as(anorm.Macro.namedParser[ExecutorStorageSnapshotDto].*).head;
    dtos
  }
  def getExecutorStorageSnapshotLast() : ExecutorStorageSnapshotDto = {
    implicit val connection = getConnection();
    val dtos : ExecutorStorageSnapshotDto= SQL("select * from executorStorageSnapshot order by insertedRowDate desc ").as(anorm.Macro.namedParser[ExecutorStorageSnapshotDto].*).head;
    dtos
  }
  def getExecutorStorageSnapshotByGuid(guid : Long) : ExecutorStorageSnapshotDto = {
    implicit val connection = getConnection();
    val dtos : ExecutorStorageSnapshotDto= SQL("select * from executorStorageSnapshot where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[ExecutorStorageSnapshotDto].single);
    dtos
  }
  def getExecutorStorageSnapshotByPk(pkColValue : Long) : ExecutorStorageSnapshotDto = {
    implicit val connection = getConnection();
    val dto : ExecutorStorageSnapshotDto = SQL("select * from executorStorageSnapshot where executorStorageSnapshotId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[ExecutorStorageSnapshotDto].single);
    dto
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
  def insertExecutorStorageSnapshotDto(dto : ExecutorStorageSnapshotDto): ExecutorStorageSnapshotDto = {
    implicit val connection = getConnection();
    val stat = dto.prepareInsert(getConnection());
    val resCnt = stat.executeUpdate();
    val rs = stat.getGeneratedKeys();
    if (rs.next()) {
      val pkValue = rs.getLong(1);
      SQL("select * from executorStorageSnapshot where executorStorageSnapshotId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[ExecutorStorageSnapshotDto].single);
    } else {
      null;
    }
  }
  def createAndInsertExecutorStorageSnapshotDto(executorInstanceId : Long) : ExecutorStorageSnapshotDto = {
    val dto = new ExecutorStorageSnapshotDto(0,executorInstanceId,0,new Date(),new Date())
    insertExecutorStorageSnapshotDto(dto);
  }
  def updateExecutorStorageSnapshotDto(dto : ExecutorStorageSnapshotDto): ExecutorStorageSnapshotDto = {
    implicit val connection = getConnection();
    val resCnt = SQL("update executorStorageSnapshot set  executorInstanceId = {executorInstanceId} ,  lastUpdatedDate = {lastUpdatedDate}  where  executorStorageSnapshotId = {executorStorageSnapshotId}  ")
      .on("executorInstanceId" -> dto.executorInstanceId , "lastUpdatedDate" -> dto.lastUpdatedDate, "executorStorageSnapshotId" -> dto.executorStorageSnapshotId ).executeInsert()
    getExecutorStorageSnapshotByPk(dto.executorStorageSnapshotId)
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
    val dtos : ExecutorStorageTypeDto= SQL("select * from executorStorageType order by insertedRowDate asc ").as(anorm.Macro.namedParser[ExecutorStorageTypeDto].*).head;
    dtos
  }
  def getExecutorStorageTypeLast() : ExecutorStorageTypeDto = {
    implicit val connection = getConnection();
    val dtos : ExecutorStorageTypeDto= SQL("select * from executorStorageType order by insertedRowDate desc ").as(anorm.Macro.namedParser[ExecutorStorageTypeDto].*).head;
    dtos
  }
  def getExecutorStorageTypeByGuid(guid : Long) : ExecutorStorageTypeDto = {
    implicit val connection = getConnection();
    val dtos : ExecutorStorageTypeDto= SQL("select * from executorStorageType where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[ExecutorStorageTypeDto].single);
    dtos
  }
  def getExecutorStorageTypeByPk(pkColValue : Long) : ExecutorStorageTypeDto = {
    implicit val connection = getConnection();
    val dto : ExecutorStorageTypeDto = SQL("select * from executorStorageType where executorStorageTypeId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[ExecutorStorageTypeDto].single);
    dto
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
  def insertExecutorStorageTypeDto(dto : ExecutorStorageTypeDto): ExecutorStorageTypeDto = {
    implicit val connection = getConnection();
    val stat = dto.prepareInsert(getConnection());
    val resCnt = stat.executeUpdate();
    val rs = stat.getGeneratedKeys();
    if (rs.next()) {
      val pkValue = rs.getLong(1);
      SQL("select * from executorStorageType where executorStorageTypeId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[ExecutorStorageTypeDto].single);
    } else {
      null;
    }
  }
  def createAndInsertExecutorStorageTypeDto(executorStorageTypeName : String, executorStorageTypeClass : String) : ExecutorStorageTypeDto = {
    val dto = new ExecutorStorageTypeDto(0,0,new Date(),new Date(),executorStorageTypeName,executorStorageTypeClass)
    insertExecutorStorageTypeDto(dto);
  }
  def updateExecutorStorageTypeDto(dto : ExecutorStorageTypeDto): ExecutorStorageTypeDto = {
    implicit val connection = getConnection();
    val resCnt = SQL("update executorStorageType set  lastUpdatedDate = {lastUpdatedDate} ,  executorStorageTypeName = {executorStorageTypeName} ,  executorStorageTypeClass = {executorStorageTypeClass}  where  executorStorageTypeId = {executorStorageTypeId}  ")
      .on("lastUpdatedDate" -> dto.lastUpdatedDate , "executorStorageTypeName" -> dto.executorStorageTypeName , "executorStorageTypeClass" -> dto.executorStorageTypeClass, "executorStorageTypeId" -> dto.executorStorageTypeId ).executeInsert()
    getExecutorStorageTypeByPk(dto.executorStorageTypeId)
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
    val dtos : ExecutorStorageViewDto= SQL("select * from executorStorageView order by insertedRowDate asc ").as(anorm.Macro.namedParser[ExecutorStorageViewDto].*).head;
    dtos
  }
  def getExecutorStorageViewLast() : ExecutorStorageViewDto = {
    implicit val connection = getConnection();
    val dtos : ExecutorStorageViewDto= SQL("select * from executorStorageView order by insertedRowDate desc ").as(anorm.Macro.namedParser[ExecutorStorageViewDto].*).head;
    dtos
  }
  def getExecutorStorageViewByGuid(guid : Long) : ExecutorStorageViewDto = {
    implicit val connection = getConnection();
    val dtos : ExecutorStorageViewDto= SQL("select * from executorStorageView where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[ExecutorStorageViewDto].single);
    dtos
  }
  def getExecutorStorageViewByPk(pkColValue : Long) : ExecutorStorageViewDto = {
    implicit val connection = getConnection();
    val dto : ExecutorStorageViewDto = SQL("select * from executorStorageView where executorStorageViewId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[ExecutorStorageViewDto].single);
    dto
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
  def insertExecutorStorageViewDto(dto : ExecutorStorageViewDto): ExecutorStorageViewDto = {
    implicit val connection = getConnection();
    val stat = dto.prepareInsert(getConnection());
    val resCnt = stat.executeUpdate();
    val rs = stat.getGeneratedKeys();
    if (rs.next()) {
      val pkValue = rs.getLong(1);
      SQL("select * from executorStorageView where executorStorageViewId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[ExecutorStorageViewDto].single);
    } else {
      null;
    }
  }
  def createAndInsertExecutorStorageViewDto(executorStorageSnapshotId : Long, executorStorageId : Long, sourceDownloadId : Long, storagePath : String, viewSize : Long, viewRowsCount : Long) : ExecutorStorageViewDto = {
    val dto = new ExecutorStorageViewDto(0,0,new Date(),new Date(),executorStorageSnapshotId,executorStorageId,sourceDownloadId,storagePath,viewSize,viewRowsCount)
    insertExecutorStorageViewDto(dto);
  }
  def updateExecutorStorageViewDto(dto : ExecutorStorageViewDto): ExecutorStorageViewDto = {
    implicit val connection = getConnection();
    val resCnt = SQL("update executorStorageView set  lastUpdatedDate = {lastUpdatedDate} ,  executorStorageSnapshotId = {executorStorageSnapshotId} ,  executorStorageId = {executorStorageId} ,  sourceDownloadId = {sourceDownloadId} ,  storagePath = {storagePath} ,  viewSize = {viewSize} ,  viewRowsCount = {viewRowsCount}  where  executorStorageViewId = {executorStorageViewId}  ")
      .on("lastUpdatedDate" -> dto.lastUpdatedDate , "executorStorageSnapshotId" -> dto.executorStorageSnapshotId , "executorStorageId" -> dto.executorStorageId , "sourceDownloadId" -> dto.sourceDownloadId , "storagePath" -> dto.storagePath , "viewSize" -> dto.viewSize , "viewRowsCount" -> dto.viewRowsCount, "executorStorageViewId" -> dto.executorStorageViewId ).executeInsert()
    getExecutorStorageViewByPk(dto.executorStorageViewId)
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
    val dtos : ExecutorTypeDto= SQL("select * from executorType order by insertedRowDate asc ").as(anorm.Macro.namedParser[ExecutorTypeDto].*).head;
    dtos
  }
  def getExecutorTypeLast() : ExecutorTypeDto = {
    implicit val connection = getConnection();
    val dtos : ExecutorTypeDto= SQL("select * from executorType order by insertedRowDate desc ").as(anorm.Macro.namedParser[ExecutorTypeDto].*).head;
    dtos
  }
  def getExecutorTypeByGuid(guid : Long) : ExecutorTypeDto = {
    implicit val connection = getConnection();
    val dtos : ExecutorTypeDto= SQL("select * from executorType where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[ExecutorTypeDto].single);
    dtos
  }
  def getExecutorTypeByPk(pkColValue : Long) : ExecutorTypeDto = {
    implicit val connection = getConnection();
    val dto : ExecutorTypeDto = SQL("select * from executorType where executorTypeId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[ExecutorTypeDto].single);
    dto
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
  def insertExecutorTypeDto(dto : ExecutorTypeDto): ExecutorTypeDto = {
    implicit val connection = getConnection();
    val stat = dto.prepareInsert(getConnection());
    val resCnt = stat.executeUpdate();
    val rs = stat.getGeneratedKeys();
    if (rs.next()) {
      val pkValue = rs.getLong(1);
      SQL("select * from executorType where executorTypeId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[ExecutorTypeDto].single);
    } else {
      null;
    }
  }
  def createAndInsertExecutorTypeDto(executorTypeName : String, executorTypeClass : String) : ExecutorTypeDto = {
    val dto = new ExecutorTypeDto(0,0,new Date(),new Date(),executorTypeName,executorTypeClass)
    insertExecutorTypeDto(dto);
  }
  def updateExecutorTypeDto(dto : ExecutorTypeDto): ExecutorTypeDto = {
    implicit val connection = getConnection();
    val resCnt = SQL("update executorType set  lastUpdatedDate = {lastUpdatedDate} ,  executorTypeName = {executorTypeName} ,  executorTypeClass = {executorTypeClass}  where  executorTypeId = {executorTypeId}  ")
      .on("lastUpdatedDate" -> dto.lastUpdatedDate , "executorTypeName" -> dto.executorTypeName , "executorTypeClass" -> dto.executorTypeClass, "executorTypeId" -> dto.executorTypeId ).executeInsert()
    getExecutorTypeByPk(dto.executorTypeId)
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
    val dtos : ResourceManagerDto= SQL("select * from resourceManager order by insertedRowDate asc ").as(anorm.Macro.namedParser[ResourceManagerDto].*).head;
    dtos
  }
  def getResourceManagerLast() : ResourceManagerDto = {
    implicit val connection = getConnection();
    val dtos : ResourceManagerDto= SQL("select * from resourceManager order by insertedRowDate desc ").as(anorm.Macro.namedParser[ResourceManagerDto].*).head;
    dtos
  }
  def getResourceManagerByGuid(guid : Long) : ResourceManagerDto = {
    implicit val connection = getConnection();
    val dtos : ResourceManagerDto= SQL("select * from resourceManager where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[ResourceManagerDto].single);
    dtos
  }
  def getResourceManagerByPk(pkColValue : Long) : ResourceManagerDto = {
    implicit val connection = getConnection();
    val dto : ResourceManagerDto = SQL("select * from resourceManager where resourceManagerId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[ResourceManagerDto].single);
    dto
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
  def insertResourceManagerDto(dto : ResourceManagerDto): ResourceManagerDto = {
    implicit val connection = getConnection();
    val stat = dto.prepareInsert(getConnection());
    val resCnt = stat.executeUpdate();
    val rs = stat.getGeneratedKeys();
    if (rs.next()) {
      val pkValue = rs.getLong(1);
      SQL("select * from resourceManager where resourceManagerId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[ResourceManagerDto].single);
    } else {
      null;
    }
  }
  def createAndInsertResourceManagerDto(resourceManagerTypeId : Long, executorHostId : Long, resourceManagerStatus : String) : ResourceManagerDto = {
    val dto = new ResourceManagerDto(0,0,resourceManagerTypeId,executorHostId,resourceManagerStatus,new Date(),new Date())
    insertResourceManagerDto(dto);
  }
  def updateResourceManagerDto(dto : ResourceManagerDto): ResourceManagerDto = {
    implicit val connection = getConnection();
    val resCnt = SQL("update resourceManager set  resourceManagerTypeId = {resourceManagerTypeId} ,  executorHostId = {executorHostId} ,  resourceManagerStatus = {resourceManagerStatus} ,  lastUpdatedDate = {lastUpdatedDate}  where  resourceManagerId = {resourceManagerId}  ")
      .on("resourceManagerTypeId" -> dto.resourceManagerTypeId , "executorHostId" -> dto.executorHostId , "resourceManagerStatus" -> dto.resourceManagerStatus , "lastUpdatedDate" -> dto.lastUpdatedDate, "resourceManagerId" -> dto.resourceManagerId ).executeInsert()
    getResourceManagerByPk(dto.resourceManagerId)
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
    val dtos : ResourceManagerAllocationDto= SQL("select * from resourceManagerAllocation order by insertedRowDate asc ").as(anorm.Macro.namedParser[ResourceManagerAllocationDto].*).head;
    dtos
  }
  def getResourceManagerAllocationLast() : ResourceManagerAllocationDto = {
    implicit val connection = getConnection();
    val dtos : ResourceManagerAllocationDto= SQL("select * from resourceManagerAllocation order by insertedRowDate desc ").as(anorm.Macro.namedParser[ResourceManagerAllocationDto].*).head;
    dtos
  }
  def getResourceManagerAllocationByGuid(guid : Long) : ResourceManagerAllocationDto = {
    implicit val connection = getConnection();
    val dtos : ResourceManagerAllocationDto= SQL("select * from resourceManagerAllocation where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[ResourceManagerAllocationDto].single);
    dtos
  }
  def getResourceManagerAllocationByPk(pkColValue : Long) : ResourceManagerAllocationDto = {
    implicit val connection = getConnection();
    val dto : ResourceManagerAllocationDto = SQL("select * from resourceManagerAllocation where resourceManagerAllocationId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[ResourceManagerAllocationDto].single);
    dto
  }
  def getResourceManagerAllocationMaxId() : Long = {
    implicit val connection = getConnection();
    val maxid : Long = SQL("select max(resourceManagerAllocationId) as maxId from resourceManagerAllocation ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;
    maxid
  }
  def insertResourceManagerAllocationDto(dto : ResourceManagerAllocationDto): ResourceManagerAllocationDto = {
    implicit val connection = getConnection();
    val stat = dto.prepareInsert(getConnection());
    val resCnt = stat.executeUpdate();
    val rs = stat.getGeneratedKeys();
    if (rs.next()) {
      val pkValue = rs.getLong(1);
      SQL("select * from resourceManagerAllocation where resourceManagerAllocationId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[ResourceManagerAllocationDto].single);
    } else {
      null;
    }
  }
  def createAndInsertResourceManagerAllocationDto(resourceManagerTypeId : Long, resourceManagerId : Long, executorHostId : Long, executorInstanceId : Long, resourceMeasureId : Long, allocationValue : Double, allocationValueMin : Double, allocationValueMax : Double) : ResourceManagerAllocationDto = {
    val dto = new ResourceManagerAllocationDto(0,0,new Date(),new Date(),resourceManagerTypeId,resourceManagerId,executorHostId,executorInstanceId,resourceMeasureId,allocationValue,allocationValueMin,allocationValueMax)
    insertResourceManagerAllocationDto(dto);
  }
  def updateResourceManagerAllocationDto(dto : ResourceManagerAllocationDto): ResourceManagerAllocationDto = {
    implicit val connection = getConnection();
    val resCnt = SQL("update resourceManagerAllocation set  lastUpdatedDate = {lastUpdatedDate} ,  resourceManagerTypeId = {resourceManagerTypeId} ,  resourceManagerId = {resourceManagerId} ,  executorHostId = {executorHostId} ,  executorInstanceId = {executorInstanceId} ,  resourceMeasureId = {resourceMeasureId} ,  allocationValue = {allocationValue} ,  allocationValueMin = {allocationValueMin} ,  allocationValueMax = {allocationValueMax}  where  resourceManagerAllocationId = {resourceManagerAllocationId}  ")
      .on("lastUpdatedDate" -> dto.lastUpdatedDate , "resourceManagerTypeId" -> dto.resourceManagerTypeId , "resourceManagerId" -> dto.resourceManagerId , "executorHostId" -> dto.executorHostId , "executorInstanceId" -> dto.executorInstanceId , "resourceMeasureId" -> dto.resourceMeasureId , "allocationValue" -> dto.allocationValue , "allocationValueMin" -> dto.allocationValueMin , "allocationValueMax" -> dto.allocationValueMax, "resourceManagerAllocationId" -> dto.resourceManagerAllocationId ).executeInsert()
    getResourceManagerAllocationByPk(dto.resourceManagerAllocationId)
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
    val dtos : ResourceManagerCheckDto= SQL("select * from resourceManagerCheck order by insertedRowDate asc ").as(anorm.Macro.namedParser[ResourceManagerCheckDto].*).head;
    dtos
  }
  def getResourceManagerCheckLast() : ResourceManagerCheckDto = {
    implicit val connection = getConnection();
    val dtos : ResourceManagerCheckDto= SQL("select * from resourceManagerCheck order by insertedRowDate desc ").as(anorm.Macro.namedParser[ResourceManagerCheckDto].*).head;
    dtos
  }
  def getResourceManagerCheckByGuid(guid : Long) : ResourceManagerCheckDto = {
    implicit val connection = getConnection();
    val dtos : ResourceManagerCheckDto= SQL("select * from resourceManagerCheck where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[ResourceManagerCheckDto].single);
    dtos
  }
  def getResourceManagerCheckByPk(pkColValue : Long) : ResourceManagerCheckDto = {
    implicit val connection = getConnection();
    val dto : ResourceManagerCheckDto = SQL("select * from resourceManagerCheck where resourceManagerCheckId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[ResourceManagerCheckDto].single);
    dto
  }
  def getResourceManagerCheckMaxId() : Long = {
    implicit val connection = getConnection();
    val maxid : Long = SQL("select max(resourceManagerCheckId) as maxId from resourceManagerCheck ").executeQuery()(connection).as[Long](SqlParser.long("maxId").single)(connection);;
    maxid
  }
  def insertResourceManagerCheckDto(dto : ResourceManagerCheckDto): ResourceManagerCheckDto = {
    implicit val connection = getConnection();
    val stat = dto.prepareInsert(getConnection());
    val resCnt = stat.executeUpdate();
    val rs = stat.getGeneratedKeys();
    if (rs.next()) {
      val pkValue = rs.getLong(1);
      SQL("select * from resourceManagerCheck where resourceManagerCheckId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[ResourceManagerCheckDto].single);
    } else {
      null;
    }
  }
  def createAndInsertResourceManagerCheckDto(resourceManagerId : Long, executorHostId : Long, resourceManagerStatus : String) : ResourceManagerCheckDto = {
    val dto = new ResourceManagerCheckDto(0,0,resourceManagerId,executorHostId,resourceManagerStatus,new Date(),new Date())
    insertResourceManagerCheckDto(dto);
  }
  def updateResourceManagerCheckDto(dto : ResourceManagerCheckDto): ResourceManagerCheckDto = {
    implicit val connection = getConnection();
    val resCnt = SQL("update resourceManagerCheck set  resourceManagerId = {resourceManagerId} ,  executorHostId = {executorHostId} ,  resourceManagerStatus = {resourceManagerStatus} ,  lastUpdatedDate = {lastUpdatedDate}  where  resourceManagerCheckId = {resourceManagerCheckId}  ")
      .on("resourceManagerId" -> dto.resourceManagerId , "executorHostId" -> dto.executorHostId , "resourceManagerStatus" -> dto.resourceManagerStatus , "lastUpdatedDate" -> dto.lastUpdatedDate, "resourceManagerCheckId" -> dto.resourceManagerCheckId ).executeInsert()
    getResourceManagerCheckByPk(dto.resourceManagerCheckId)
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
    val dtos : ResourceManagerMeasureDto= SQL("select * from resourceManagerMeasure order by insertedRowDate asc ").as(anorm.Macro.namedParser[ResourceManagerMeasureDto].*).head;
    dtos
  }
  def getResourceManagerMeasureLast() : ResourceManagerMeasureDto = {
    implicit val connection = getConnection();
    val dtos : ResourceManagerMeasureDto= SQL("select * from resourceManagerMeasure order by insertedRowDate desc ").as(anorm.Macro.namedParser[ResourceManagerMeasureDto].*).head;
    dtos
  }
  def getResourceManagerMeasureByGuid(guid : Long) : ResourceManagerMeasureDto = {
    implicit val connection = getConnection();
    val dtos : ResourceManagerMeasureDto= SQL("select * from resourceManagerMeasure where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[ResourceManagerMeasureDto].single);
    dtos
  }
  def getResourceManagerMeasureByPk(pkColValue : Long) : ResourceManagerMeasureDto = {
    implicit val connection = getConnection();
    val dto : ResourceManagerMeasureDto = SQL("select * from resourceManagerMeasure where resourceManagerMeasureId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[ResourceManagerMeasureDto].single);
    dto
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
  def insertResourceManagerMeasureDto(dto : ResourceManagerMeasureDto): ResourceManagerMeasureDto = {
    implicit val connection = getConnection();
    val stat = dto.prepareInsert(getConnection());
    val resCnt = stat.executeUpdate();
    val rs = stat.getGeneratedKeys();
    if (rs.next()) {
      val pkValue = rs.getLong(1);
      SQL("select * from resourceManagerMeasure where resourceManagerMeasureId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[ResourceManagerMeasureDto].single);
    } else {
      null;
    }
  }
  def createAndInsertResourceManagerMeasureDto(resourceManagerId : Long, resourceMeasureId : Long, measureString : String, measureValue : Double) : ResourceManagerMeasureDto = {
    val dto = new ResourceManagerMeasureDto(0,0,resourceManagerId,resourceMeasureId,measureString,measureValue,new Date(),new Date())
    insertResourceManagerMeasureDto(dto);
  }
  def updateResourceManagerMeasureDto(dto : ResourceManagerMeasureDto): ResourceManagerMeasureDto = {
    implicit val connection = getConnection();
    val resCnt = SQL("update resourceManagerMeasure set  resourceManagerId = {resourceManagerId} ,  resourceMeasureId = {resourceMeasureId} ,  measureString = {measureString} ,  measureValue = {measureValue} ,  lastUpdatedDate = {lastUpdatedDate}  where  resourceManagerMeasureId = {resourceManagerMeasureId}  ")
      .on("resourceManagerId" -> dto.resourceManagerId , "resourceMeasureId" -> dto.resourceMeasureId , "measureString" -> dto.measureString , "measureValue" -> dto.measureValue , "lastUpdatedDate" -> dto.lastUpdatedDate, "resourceManagerMeasureId" -> dto.resourceManagerMeasureId ).executeInsert()
    getResourceManagerMeasureByPk(dto.resourceManagerMeasureId)
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
    val dtos : ResourceManagerTypeDto= SQL("select * from resourceManagerType order by insertedRowDate asc ").as(anorm.Macro.namedParser[ResourceManagerTypeDto].*).head;
    dtos
  }
  def getResourceManagerTypeLast() : ResourceManagerTypeDto = {
    implicit val connection = getConnection();
    val dtos : ResourceManagerTypeDto= SQL("select * from resourceManagerType order by insertedRowDate desc ").as(anorm.Macro.namedParser[ResourceManagerTypeDto].*).head;
    dtos
  }
  def getResourceManagerTypeByGuid(guid : Long) : ResourceManagerTypeDto = {
    implicit val connection = getConnection();
    val dtos : ResourceManagerTypeDto= SQL("select * from resourceManagerType where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[ResourceManagerTypeDto].single);
    dtos
  }
  def getResourceManagerTypeByPk(pkColValue : Long) : ResourceManagerTypeDto = {
    implicit val connection = getConnection();
    val dto : ResourceManagerTypeDto = SQL("select * from resourceManagerType where resourceManagerTypeId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[ResourceManagerTypeDto].single);
    dto
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
  def insertResourceManagerTypeDto(dto : ResourceManagerTypeDto): ResourceManagerTypeDto = {
    implicit val connection = getConnection();
    val stat = dto.prepareInsert(getConnection());
    val resCnt = stat.executeUpdate();
    val rs = stat.getGeneratedKeys();
    if (rs.next()) {
      val pkValue = rs.getLong(1);
      SQL("select * from resourceManagerType where resourceManagerTypeId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[ResourceManagerTypeDto].single);
    } else {
      null;
    }
  }
  def createAndInsertResourceManagerTypeDto(resourceManagerTypeName : String, resourceManagerTypeClass : String) : ResourceManagerTypeDto = {
    val dto = new ResourceManagerTypeDto(0,0,resourceManagerTypeName,resourceManagerTypeClass,new Date(),new Date())
    insertResourceManagerTypeDto(dto);
  }
  def updateResourceManagerTypeDto(dto : ResourceManagerTypeDto): ResourceManagerTypeDto = {
    implicit val connection = getConnection();
    val resCnt = SQL("update resourceManagerType set  resourceManagerTypeName = {resourceManagerTypeName} ,  resourceManagerTypeClass = {resourceManagerTypeClass} ,  lastUpdatedDate = {lastUpdatedDate}  where  resourceManagerTypeId = {resourceManagerTypeId}  ")
      .on("resourceManagerTypeName" -> dto.resourceManagerTypeName , "resourceManagerTypeClass" -> dto.resourceManagerTypeClass , "lastUpdatedDate" -> dto.lastUpdatedDate, "resourceManagerTypeId" -> dto.resourceManagerTypeId ).executeInsert()
    getResourceManagerTypeByPk(dto.resourceManagerTypeId)
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
    val dtos : ResourceMeasureDto= SQL("select * from resourceMeasure order by insertedRowDate asc ").as(anorm.Macro.namedParser[ResourceMeasureDto].*).head;
    dtos
  }
  def getResourceMeasureLast() : ResourceMeasureDto = {
    implicit val connection = getConnection();
    val dtos : ResourceMeasureDto= SQL("select * from resourceMeasure order by insertedRowDate desc ").as(anorm.Macro.namedParser[ResourceMeasureDto].*).head;
    dtos
  }
  def getResourceMeasureByGuid(guid : Long) : ResourceMeasureDto = {
    implicit val connection = getConnection();
    val dtos : ResourceMeasureDto= SQL("select * from resourceMeasure where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[ResourceMeasureDto].single);
    dtos
  }
  def getResourceMeasureByPk(pkColValue : Long) : ResourceMeasureDto = {
    implicit val connection = getConnection();
    val dto : ResourceMeasureDto = SQL("select * from resourceMeasure where resourceMeasureId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[ResourceMeasureDto].single);
    dto
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
  def insertResourceMeasureDto(dto : ResourceMeasureDto): ResourceMeasureDto = {
    implicit val connection = getConnection();
    val stat = dto.prepareInsert(getConnection());
    val resCnt = stat.executeUpdate();
    val rs = stat.getGeneratedKeys();
    if (rs.next()) {
      val pkValue = rs.getLong(1);
      SQL("select * from resourceMeasure where resourceMeasureId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[ResourceMeasureDto].single);
    } else {
      null;
    }
  }
  def createAndInsertResourceMeasureDto(resourceMeasureName : String) : ResourceMeasureDto = {
    val dto = new ResourceMeasureDto(0,0,resourceMeasureName,new Date(),new Date())
    insertResourceMeasureDto(dto);
  }
  def updateResourceMeasureDto(dto : ResourceMeasureDto): ResourceMeasureDto = {
    implicit val connection = getConnection();
    val resCnt = SQL("update resourceMeasure set  resourceMeasureName = {resourceMeasureName} ,  lastUpdatedDate = {lastUpdatedDate}  where  resourceMeasureId = {resourceMeasureId}  ")
      .on("resourceMeasureName" -> dto.resourceMeasureName , "lastUpdatedDate" -> dto.lastUpdatedDate, "resourceMeasureId" -> dto.resourceMeasureId ).executeInsert()
    getResourceMeasureByPk(dto.resourceMeasureId)
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
    val dtos : SourceDownloadDto= SQL("select * from sourceDownload order by insertedRowDate asc ").as(anorm.Macro.namedParser[SourceDownloadDto].*).head;
    dtos
  }
  def getSourceDownloadLast() : SourceDownloadDto = {
    implicit val connection = getConnection();
    val dtos : SourceDownloadDto= SQL("select * from sourceDownload order by insertedRowDate desc ").as(anorm.Macro.namedParser[SourceDownloadDto].*).head;
    dtos
  }
  def getSourceDownloadByGuid(guid : Long) : SourceDownloadDto = {
    implicit val connection = getConnection();
    val dtos : SourceDownloadDto= SQL("select * from sourceDownload where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[SourceDownloadDto].single);
    dtos
  }
  def getSourceDownloadByPk(pkColValue : Long) : SourceDownloadDto = {
    implicit val connection = getConnection();
    val dto : SourceDownloadDto = SQL("select * from sourceDownload where sourceDownloadId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[SourceDownloadDto].single);
    dto
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
  def insertSourceDownloadDto(dto : SourceDownloadDto): SourceDownloadDto = {
    implicit val connection = getConnection();
    val stat = dto.prepareInsert(getConnection());
    val resCnt = stat.executeUpdate();
    val rs = stat.getGeneratedKeys();
    if (rs.next()) {
      val pkValue = rs.getLong(1);
      SQL("select * from sourceDownload where sourceDownloadId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[SourceDownloadDto].single);
    } else {
      null;
    }
  }
  def createAndInsertSourceDownloadDto(sourceScheduleId : Long, retryNumber : Int, isRunning : Int, isFinished : Int, isExcecption : Int, excecptionDescription : String) : SourceDownloadDto = {
    val dto = new SourceDownloadDto(0,sourceScheduleId,new Date(),new Date(),0,retryNumber,isRunning,isFinished,isExcecption,excecptionDescription)
    insertSourceDownloadDto(dto);
  }
  def updateSourceDownloadDto(dto : SourceDownloadDto): SourceDownloadDto = {
    implicit val connection = getConnection();
    val resCnt = SQL("update sourceDownload set  sourceScheduleId = {sourceScheduleId} ,  lastUpdatedDate = {lastUpdatedDate} ,  retryNumber = {retryNumber} ,  isRunning = {isRunning} ,  isFinished = {isFinished} ,  isExcecption = {isExcecption} ,  excecptionDescription = {excecptionDescription}  where  sourceDownloadId = {sourceDownloadId}  ")
      .on("sourceScheduleId" -> dto.sourceScheduleId , "lastUpdatedDate" -> dto.lastUpdatedDate , "retryNumber" -> dto.retryNumber , "isRunning" -> dto.isRunning , "isFinished" -> dto.isFinished , "isExcecption" -> dto.isExcecption , "excecptionDescription" -> dto.excecptionDescription, "sourceDownloadId" -> dto.sourceDownloadId ).executeInsert()
    getSourceDownloadByPk(dto.sourceDownloadId)
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
    val dtos : SourceDownloadStatDto= SQL("select * from sourceDownloadStat order by insertedRowDate asc ").as(anorm.Macro.namedParser[SourceDownloadStatDto].*).head;
    dtos
  }
  def getSourceDownloadStatLast() : SourceDownloadStatDto = {
    implicit val connection = getConnection();
    val dtos : SourceDownloadStatDto= SQL("select * from sourceDownloadStat order by insertedRowDate desc ").as(anorm.Macro.namedParser[SourceDownloadStatDto].*).head;
    dtos
  }
  def getSourceDownloadStatByGuid(guid : Long) : SourceDownloadStatDto = {
    implicit val connection = getConnection();
    val dtos : SourceDownloadStatDto= SQL("select * from sourceDownloadStat where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[SourceDownloadStatDto].single);
    dtos
  }
  def getSourceDownloadStatByPk(pkColValue : Long) : SourceDownloadStatDto = {
    implicit val connection = getConnection();
    val dto : SourceDownloadStatDto = SQL("select * from sourceDownloadStat where sourceDownloadStatId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[SourceDownloadStatDto].single);
    dto
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
  def insertSourceDownloadStatDto(dto : SourceDownloadStatDto): SourceDownloadStatDto = {
    implicit val connection = getConnection();
    val stat = dto.prepareInsert(getConnection());
    val resCnt = stat.executeUpdate();
    val rs = stat.getGeneratedKeys();
    if (rs.next()) {
      val pkValue = rs.getLong(1);
      SQL("select * from sourceDownloadStat where sourceDownloadStatId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[SourceDownloadStatDto].single);
    } else {
      null;
    }
  }
  def createAndInsertSourceDownloadStatDto(sourceDownloadId : Long, rowsCount : Long, errorRowsCount : Long, totalBytesCount : Long, empryRowsCount : Long) : SourceDownloadStatDto = {
    val dto = new SourceDownloadStatDto(0,0,sourceDownloadId,new Date(),new Date(),rowsCount,errorRowsCount,totalBytesCount,empryRowsCount)
    insertSourceDownloadStatDto(dto);
  }
  def updateSourceDownloadStatDto(dto : SourceDownloadStatDto): SourceDownloadStatDto = {
    implicit val connection = getConnection();
    val resCnt = SQL("update sourceDownloadStat set  sourceDownloadId = {sourceDownloadId} ,  lastUpdatedDate = {lastUpdatedDate} ,  rowsCount = {rowsCount} ,  errorRowsCount = {errorRowsCount} ,  totalBytesCount = {totalBytesCount} ,  empryRowsCount = {empryRowsCount}  where  sourceDownloadStatId = {sourceDownloadStatId}  ")
      .on("sourceDownloadId" -> dto.sourceDownloadId , "lastUpdatedDate" -> dto.lastUpdatedDate , "rowsCount" -> dto.rowsCount , "errorRowsCount" -> dto.errorRowsCount , "totalBytesCount" -> dto.totalBytesCount , "empryRowsCount" -> dto.empryRowsCount, "sourceDownloadStatId" -> dto.sourceDownloadStatId ).executeInsert()
    getSourceDownloadStatByPk(dto.sourceDownloadStatId)
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
    val dtos : SourceDownloadStatColumnDto= SQL("select * from sourceDownloadStatColumn order by insertedRowDate asc ").as(anorm.Macro.namedParser[SourceDownloadStatColumnDto].*).head;
    dtos
  }
  def getSourceDownloadStatColumnLast() : SourceDownloadStatColumnDto = {
    implicit val connection = getConnection();
    val dtos : SourceDownloadStatColumnDto= SQL("select * from sourceDownloadStatColumn order by insertedRowDate desc ").as(anorm.Macro.namedParser[SourceDownloadStatColumnDto].*).head;
    dtos
  }
  def getSourceDownloadStatColumnByGuid(guid : Long) : SourceDownloadStatColumnDto = {
    implicit val connection = getConnection();
    val dtos : SourceDownloadStatColumnDto= SQL("select * from sourceDownloadStatColumn where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[SourceDownloadStatColumnDto].single);
    dtos
  }
  def getSourceDownloadStatColumnByPk(pkColValue : Long) : SourceDownloadStatColumnDto = {
    implicit val connection = getConnection();
    val dto : SourceDownloadStatColumnDto = SQL("select * from sourceDownloadStatColumn where sourceDownloadStatColumnId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[SourceDownloadStatColumnDto].single);
    dto
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
  def insertSourceDownloadStatColumnDto(dto : SourceDownloadStatColumnDto): SourceDownloadStatColumnDto = {
    implicit val connection = getConnection();
    val stat = dto.prepareInsert(getConnection());
    val resCnt = stat.executeUpdate();
    val rs = stat.getGeneratedKeys();
    if (rs.next()) {
      val pkValue = rs.getLong(1);
      SQL("select * from sourceDownloadStatColumn where sourceDownloadStatColumnId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[SourceDownloadStatColumnDto].single);
    } else {
      null;
    }
  }
  def createAndInsertSourceDownloadStatColumnDto(sourceDownloadId : Long, sourceViewColumnId : Long, columnMinNumber : Double, columnMaxNumber : Double, columnMinStr : String, columnMaxStr : String, columnNonemptyCount : Long) : SourceDownloadStatColumnDto = {
    val dto = new SourceDownloadStatColumnDto(0,0,sourceDownloadId,sourceViewColumnId,new Date(),new Date(),columnMinNumber,columnMaxNumber,columnMinStr,columnMaxStr,columnNonemptyCount)
    insertSourceDownloadStatColumnDto(dto);
  }
  def updateSourceDownloadStatColumnDto(dto : SourceDownloadStatColumnDto): SourceDownloadStatColumnDto = {
    implicit val connection = getConnection();
    val resCnt = SQL("update sourceDownloadStatColumn set  sourceDownloadId = {sourceDownloadId} ,  sourceViewColumnId = {sourceViewColumnId} ,  lastUpdatedDate = {lastUpdatedDate} ,  columnMinNumber = {columnMinNumber} ,  columnMaxNumber = {columnMaxNumber} ,  columnMinStr = {columnMinStr} ,  columnMaxStr = {columnMaxStr} ,  columnNonemptyCount = {columnNonemptyCount}  where  sourceDownloadStatColumnId = {sourceDownloadStatColumnId}  ")
      .on("sourceDownloadId" -> dto.sourceDownloadId , "sourceViewColumnId" -> dto.sourceViewColumnId , "lastUpdatedDate" -> dto.lastUpdatedDate , "columnMinNumber" -> dto.columnMinNumber , "columnMaxNumber" -> dto.columnMaxNumber , "columnMinStr" -> dto.columnMinStr , "columnMaxStr" -> dto.columnMaxStr , "columnNonemptyCount" -> dto.columnNonemptyCount, "sourceDownloadStatColumnId" -> dto.sourceDownloadStatColumnId ).executeInsert()
    getSourceDownloadStatColumnByPk(dto.sourceDownloadStatColumnId)
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
    val dtos : SourceInstanceDto= SQL("select * from sourceInstance order by insertedRowDate asc ").as(anorm.Macro.namedParser[SourceInstanceDto].*).head;
    dtos
  }
  def getSourceInstanceLast() : SourceInstanceDto = {
    implicit val connection = getConnection();
    val dtos : SourceInstanceDto= SQL("select * from sourceInstance order by insertedRowDate desc ").as(anorm.Macro.namedParser[SourceInstanceDto].*).head;
    dtos
  }
  def getSourceInstanceByGuid(guid : Long) : SourceInstanceDto = {
    implicit val connection = getConnection();
    val dtos : SourceInstanceDto= SQL("select * from sourceInstance where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[SourceInstanceDto].single);
    dtos
  }
  def getSourceInstanceByPk(pkColValue : Long) : SourceInstanceDto = {
    implicit val connection = getConnection();
    val dto : SourceInstanceDto = SQL("select * from sourceInstance where sourceInstanceId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[SourceInstanceDto].single);
    dto
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
  def insertSourceInstanceDto(dto : SourceInstanceDto): SourceInstanceDto = {
    implicit val connection = getConnection();
    val stat = dto.prepareInsert(getConnection());
    val resCnt = stat.executeUpdate();
    val rs = stat.getGeneratedKeys();
    if (rs.next()) {
      val pkValue = rs.getLong(1);
      SQL("select * from sourceInstance where sourceInstanceId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[SourceInstanceDto].single);
    } else {
      null;
    }
  }
  def createAndInsertSourceInstanceDto(sourceTypeId : Long, sourceInstanceName : String, errorCount : Long, correctCount : Long, lastStatus : String, lastConnectionDate : java.util.Date) : SourceInstanceDto = {
    val dto = new SourceInstanceDto(0,0,sourceTypeId,sourceInstanceName,errorCount,correctCount,lastStatus,lastConnectionDate,new Date(),new Date())
    insertSourceInstanceDto(dto);
  }
  def updateSourceInstanceDto(dto : SourceInstanceDto): SourceInstanceDto = {
    implicit val connection = getConnection();
    val resCnt = SQL("update sourceInstance set  sourceTypeId = {sourceTypeId} ,  sourceInstanceName = {sourceInstanceName} ,  errorCount = {errorCount} ,  correctCount = {correctCount} ,  lastStatus = {lastStatus} ,  lastConnectionDate = {lastConnectionDate} ,  lastUpdatedDate = {lastUpdatedDate}  where  sourceInstanceId = {sourceInstanceId}  ")
      .on("sourceTypeId" -> dto.sourceTypeId , "sourceInstanceName" -> dto.sourceInstanceName , "errorCount" -> dto.errorCount , "correctCount" -> dto.correctCount , "lastStatus" -> dto.lastStatus , "lastConnectionDate" -> dto.lastConnectionDate , "lastUpdatedDate" -> dto.lastUpdatedDate, "sourceInstanceId" -> dto.sourceInstanceId ).executeInsert()
    getSourceInstanceByPk(dto.sourceInstanceId)
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
    val dtos : SourceParamDto= SQL("select * from sourceParam order by insertedRowDate asc ").as(anorm.Macro.namedParser[SourceParamDto].*).head;
    dtos
  }
  def getSourceParamLast() : SourceParamDto = {
    implicit val connection = getConnection();
    val dtos : SourceParamDto= SQL("select * from sourceParam order by insertedRowDate desc ").as(anorm.Macro.namedParser[SourceParamDto].*).head;
    dtos
  }
  def getSourceParamByGuid(guid : Long) : SourceParamDto = {
    implicit val connection = getConnection();
    val dtos : SourceParamDto= SQL("select * from sourceParam where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[SourceParamDto].single);
    dtos
  }
  def getSourceParamByPk(pkColValue : Long) : SourceParamDto = {
    implicit val connection = getConnection();
    val dto : SourceParamDto = SQL("select * from sourceParam where sourceParamId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[SourceParamDto].single);
    dto
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
  def insertSourceParamDto(dto : SourceParamDto): SourceParamDto = {
    implicit val connection = getConnection();
    val stat = dto.prepareInsert(getConnection());
    val resCnt = stat.executeUpdate();
    val rs = stat.getGeneratedKeys();
    if (rs.next()) {
      val pkValue = rs.getLong(1);
      SQL("select * from sourceParam where sourceParamId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[SourceParamDto].single);
    } else {
      null;
    }
  }
  def createAndInsertSourceParamDto(sourceParamName : String, sourceParamType : String, possibleValues : String) : SourceParamDto = {
    val dto = new SourceParamDto(0,0,sourceParamName,sourceParamType,possibleValues,new Date(),new Date())
    insertSourceParamDto(dto);
  }
  def updateSourceParamDto(dto : SourceParamDto): SourceParamDto = {
    implicit val connection = getConnection();
    val resCnt = SQL("update sourceParam set  sourceParamName = {sourceParamName} ,  sourceParamType = {sourceParamType} ,  possibleValues = {possibleValues} ,  lastUpdatedDate = {lastUpdatedDate}  where  sourceParamId = {sourceParamId}  ")
      .on("sourceParamName" -> dto.sourceParamName , "sourceParamType" -> dto.sourceParamType , "possibleValues" -> dto.possibleValues , "lastUpdatedDate" -> dto.lastUpdatedDate, "sourceParamId" -> dto.sourceParamId ).executeInsert()
    getSourceParamByPk(dto.sourceParamId)
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
    val dtos : SourceParamValueDto= SQL("select * from sourceParamValue order by insertedRowDate asc ").as(anorm.Macro.namedParser[SourceParamValueDto].*).head;
    dtos
  }
  def getSourceParamValueLast() : SourceParamValueDto = {
    implicit val connection = getConnection();
    val dtos : SourceParamValueDto= SQL("select * from sourceParamValue order by insertedRowDate desc ").as(anorm.Macro.namedParser[SourceParamValueDto].*).head;
    dtos
  }
  def getSourceParamValueByGuid(guid : Long) : SourceParamValueDto = {
    implicit val connection = getConnection();
    val dtos : SourceParamValueDto= SQL("select * from sourceParamValue where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[SourceParamValueDto].single);
    dtos
  }
  def getSourceParamValueByPk(pkColValue : Long) : SourceParamValueDto = {
    implicit val connection = getConnection();
    val dto : SourceParamValueDto = SQL("select * from sourceParamValue where sourceParamValueId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[SourceParamValueDto].single);
    dto
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
  def insertSourceParamValueDto(dto : SourceParamValueDto): SourceParamValueDto = {
    implicit val connection = getConnection();
    val stat = dto.prepareInsert(getConnection());
    val resCnt = stat.executeUpdate();
    val rs = stat.getGeneratedKeys();
    if (rs.next()) {
      val pkValue = rs.getLong(1);
      SQL("select * from sourceParamValue where sourceParamValueId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[SourceParamValueDto].single);
    } else {
      null;
    }
  }
  def createAndInsertSourceParamValueDto(sourceInstanceId : Long, sourceParamId : Long, sourceParamValueVersion : String, paramValue : String) : SourceParamValueDto = {
    val dto = new SourceParamValueDto(0,sourceInstanceId,sourceParamId,sourceParamValueVersion,0,new Date(),new Date(),paramValue)
    insertSourceParamValueDto(dto);
  }
  def updateSourceParamValueDto(dto : SourceParamValueDto): SourceParamValueDto = {
    implicit val connection = getConnection();
    val resCnt = SQL("update sourceParamValue set  sourceInstanceId = {sourceInstanceId} ,  sourceParamId = {sourceParamId} ,  sourceParamValueVersion = {sourceParamValueVersion} ,  lastUpdatedDate = {lastUpdatedDate} ,  paramValue = {paramValue}  where  sourceParamValueId = {sourceParamValueId}  ")
      .on("sourceInstanceId" -> dto.sourceInstanceId , "sourceParamId" -> dto.sourceParamId , "sourceParamValueVersion" -> dto.sourceParamValueVersion , "lastUpdatedDate" -> dto.lastUpdatedDate , "paramValue" -> dto.paramValue, "sourceParamValueId" -> dto.sourceParamValueId ).executeInsert()
    getSourceParamValueByPk(dto.sourceParamValueId)
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
    val dtos : SourceScheduleDto= SQL("select * from sourceSchedule order by insertedRowDate asc ").as(anorm.Macro.namedParser[SourceScheduleDto].*).head;
    dtos
  }
  def getSourceScheduleLast() : SourceScheduleDto = {
    implicit val connection = getConnection();
    val dtos : SourceScheduleDto= SQL("select * from sourceSchedule order by insertedRowDate desc ").as(anorm.Macro.namedParser[SourceScheduleDto].*).head;
    dtos
  }
  def getSourceScheduleByGuid(guid : Long) : SourceScheduleDto = {
    implicit val connection = getConnection();
    val dtos : SourceScheduleDto= SQL("select * from sourceSchedule where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[SourceScheduleDto].single);
    dtos
  }
  def getSourceScheduleByPk(pkColValue : Long) : SourceScheduleDto = {
    implicit val connection = getConnection();
    val dto : SourceScheduleDto = SQL("select * from sourceSchedule where sourceScheduleId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[SourceScheduleDto].single);
    dto
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
  def insertSourceScheduleDto(dto : SourceScheduleDto): SourceScheduleDto = {
    implicit val connection = getConnection();
    val stat = dto.prepareInsert(getConnection());
    val resCnt = stat.executeUpdate();
    val rs = stat.getGeneratedKeys();
    if (rs.next()) {
      val pkValue = rs.getLong(1);
      SQL("select * from sourceSchedule where sourceScheduleId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[SourceScheduleDto].single);
    } else {
      null;
    }
  }
  def createAndInsertSourceScheduleDto(sourceViewId : Long, executorStorageId : Long, onDemand : Int, startTime : java.util.Date, intervalValue : Long) : SourceScheduleDto = {
    val dto = new SourceScheduleDto(0,sourceViewId,executorStorageId,new Date(),new Date(),0,onDemand,startTime,intervalValue)
    insertSourceScheduleDto(dto);
  }
  def updateSourceScheduleDto(dto : SourceScheduleDto): SourceScheduleDto = {
    implicit val connection = getConnection();
    val resCnt = SQL("update sourceSchedule set  sourceViewId = {sourceViewId} ,  executorStorageId = {executorStorageId} ,  lastUpdatedDate = {lastUpdatedDate} ,  onDemand = {onDemand} ,  startTime = {startTime} ,  intervalValue = {intervalValue}  where  sourceScheduleId = {sourceScheduleId}  ")
      .on("sourceViewId" -> dto.sourceViewId , "executorStorageId" -> dto.executorStorageId , "lastUpdatedDate" -> dto.lastUpdatedDate , "onDemand" -> dto.onDemand , "startTime" -> dto.startTime , "intervalValue" -> dto.intervalValue, "sourceScheduleId" -> dto.sourceScheduleId ).executeInsert()
    getSourceScheduleByPk(dto.sourceScheduleId)
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
  def getSourceTypeByPk(pkColValue : Long) : SourceTypeDto = {
    implicit val connection = getConnection();
    val dto : SourceTypeDto = SQL("select * from sourceType where sourceTypeId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[SourceTypeDto].single);
    dto
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
  def insertSourceTypeDto(dto : SourceTypeDto): SourceTypeDto = {
    implicit val connection = getConnection();
    val stat = dto.prepareInsert(getConnection());
    val resCnt = stat.executeUpdate();
    val rs = stat.getGeneratedKeys();
    if (rs.next()) {
      val pkValue = rs.getLong(1);
      SQL("select * from sourceType where sourceTypeId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[SourceTypeDto].single);
    } else {
      null;
    }
  }
  def createAndInsertSourceTypeDto(sourceTypeName : String, sourceTypeClass : String) : SourceTypeDto = {
    val dto = new SourceTypeDto(0,0,sourceTypeName,sourceTypeClass,new Date(),new Date())
    insertSourceTypeDto(dto);
  }
  def updateSourceTypeDto(dto : SourceTypeDto): SourceTypeDto = {
    implicit val connection = getConnection();
    val resCnt = SQL("update sourceType set  sourceTypeName = {sourceTypeName} ,  sourceTypeClass = {sourceTypeClass} ,  lastUpdatedDate = {lastUpdatedDate}  where  sourceTypeId = {sourceTypeId}  ")
      .on("sourceTypeName" -> dto.sourceTypeName , "sourceTypeClass" -> dto.sourceTypeClass , "lastUpdatedDate" -> dto.lastUpdatedDate, "sourceTypeId" -> dto.sourceTypeId ).executeInsert()
    getSourceTypeByPk(dto.sourceTypeId)
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
    val dtos : SourceTypeParamDto= SQL("select * from sourceTypeParam order by insertedRowDate asc ").as(anorm.Macro.namedParser[SourceTypeParamDto].*).head;
    dtos
  }
  def getSourceTypeParamLast() : SourceTypeParamDto = {
    implicit val connection = getConnection();
    val dtos : SourceTypeParamDto= SQL("select * from sourceTypeParam order by insertedRowDate desc ").as(anorm.Macro.namedParser[SourceTypeParamDto].*).head;
    dtos
  }
  def getSourceTypeParamByGuid(guid : Long) : SourceTypeParamDto = {
    implicit val connection = getConnection();
    val dtos : SourceTypeParamDto= SQL("select * from sourceTypeParam where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[SourceTypeParamDto].single);
    dtos
  }
  def getSourceTypeParamByPk(pkColValue : Long) : SourceTypeParamDto = {
    implicit val connection = getConnection();
    val dto : SourceTypeParamDto = SQL("select * from sourceTypeParam where sourceTypeParamId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[SourceTypeParamDto].single);
    dto
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
  def insertSourceTypeParamDto(dto : SourceTypeParamDto): SourceTypeParamDto = {
    implicit val connection = getConnection();
    val stat = dto.prepareInsert(getConnection());
    val resCnt = stat.executeUpdate();
    val rs = stat.getGeneratedKeys();
    if (rs.next()) {
      val pkValue = rs.getLong(1);
      SQL("select * from sourceTypeParam where sourceTypeParamId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[SourceTypeParamDto].single);
    } else {
      null;
    }
  }
  def createAndInsertSourceTypeParamDto(sourceTypeId : Long, sourceParamId : Long, sourceTypeName : String, sourceParamName : String, isRequired : Int) : SourceTypeParamDto = {
    val dto = new SourceTypeParamDto(0,sourceTypeId,sourceParamId,sourceTypeName,sourceParamName,isRequired,0,new Date(),new Date())
    insertSourceTypeParamDto(dto);
  }
  def updateSourceTypeParamDto(dto : SourceTypeParamDto): SourceTypeParamDto = {
    implicit val connection = getConnection();
    val resCnt = SQL("update sourceTypeParam set  sourceTypeId = {sourceTypeId} ,  sourceParamId = {sourceParamId} ,  sourceTypeName = {sourceTypeName} ,  sourceParamName = {sourceParamName} ,  isRequired = {isRequired} ,  lastUpdatedDate = {lastUpdatedDate}  where  sourceTypeParamId = {sourceTypeParamId}  ")
      .on("sourceTypeId" -> dto.sourceTypeId , "sourceParamId" -> dto.sourceParamId , "sourceTypeName" -> dto.sourceTypeName , "sourceParamName" -> dto.sourceParamName , "isRequired" -> dto.isRequired , "lastUpdatedDate" -> dto.lastUpdatedDate, "sourceTypeParamId" -> dto.sourceTypeParamId ).executeInsert()
    getSourceTypeParamByPk(dto.sourceTypeParamId)
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
    val dtos : SourceViewDto= SQL("select * from sourceView order by insertedRowDate asc ").as(anorm.Macro.namedParser[SourceViewDto].*).head;
    dtos
  }
  def getSourceViewLast() : SourceViewDto = {
    implicit val connection = getConnection();
    val dtos : SourceViewDto= SQL("select * from sourceView order by insertedRowDate desc ").as(anorm.Macro.namedParser[SourceViewDto].*).head;
    dtos
  }
  def getSourceViewByGuid(guid : Long) : SourceViewDto = {
    implicit val connection = getConnection();
    val dtos : SourceViewDto= SQL("select * from sourceView where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[SourceViewDto].single);
    dtos
  }
  def getSourceViewByPk(pkColValue : Long) : SourceViewDto = {
    implicit val connection = getConnection();
    val dto : SourceViewDto = SQL("select * from sourceView where sourceViewId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[SourceViewDto].single);
    dto
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
  def insertSourceViewDto(dto : SourceViewDto): SourceViewDto = {
    implicit val connection = getConnection();
    val stat = dto.prepareInsert(getConnection());
    val resCnt = stat.executeUpdate();
    val rs = stat.getGeneratedKeys();
    if (rs.next()) {
      val pkValue = rs.getLong(1);
      SQL("select * from sourceView where sourceViewId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[SourceViewDto].single);
    } else {
      null;
    }
  }
  def createAndInsertSourceViewDto(sourceInstanceId : Long, sourceViewTypeId : Long, sourceViewName : String, sourceViewDefinition : String) : SourceViewDto = {
    val dto = new SourceViewDto(0,0,sourceInstanceId,sourceViewTypeId,sourceViewName,sourceViewDefinition,new Date(),new Date())
    insertSourceViewDto(dto);
  }
  def updateSourceViewDto(dto : SourceViewDto): SourceViewDto = {
    implicit val connection = getConnection();
    val resCnt = SQL("update sourceView set  sourceInstanceId = {sourceInstanceId} ,  sourceViewTypeId = {sourceViewTypeId} ,  sourceViewName = {sourceViewName} ,  sourceViewDefinition = {sourceViewDefinition} ,  lastUpdatedDate = {lastUpdatedDate}  where  sourceViewId = {sourceViewId}  ")
      .on("sourceInstanceId" -> dto.sourceInstanceId , "sourceViewTypeId" -> dto.sourceViewTypeId , "sourceViewName" -> dto.sourceViewName , "sourceViewDefinition" -> dto.sourceViewDefinition , "lastUpdatedDate" -> dto.lastUpdatedDate, "sourceViewId" -> dto.sourceViewId ).executeInsert()
    getSourceViewByPk(dto.sourceViewId)
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
    val dtos : SourceViewColumnDto= SQL("select * from sourceViewColumn order by insertedRowDate asc ").as(anorm.Macro.namedParser[SourceViewColumnDto].*).head;
    dtos
  }
  def getSourceViewColumnLast() : SourceViewColumnDto = {
    implicit val connection = getConnection();
    val dtos : SourceViewColumnDto= SQL("select * from sourceViewColumn order by insertedRowDate desc ").as(anorm.Macro.namedParser[SourceViewColumnDto].*).head;
    dtos
  }
  def getSourceViewColumnByGuid(guid : Long) : SourceViewColumnDto = {
    implicit val connection = getConnection();
    val dtos : SourceViewColumnDto= SQL("select * from sourceViewColumn where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[SourceViewColumnDto].single);
    dtos
  }
  def getSourceViewColumnByPk(pkColValue : Long) : SourceViewColumnDto = {
    implicit val connection = getConnection();
    val dto : SourceViewColumnDto = SQL("select * from sourceViewColumn where sourceViewColumnId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[SourceViewColumnDto].single);
    dto
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
  def insertSourceViewColumnDto(dto : SourceViewColumnDto): SourceViewColumnDto = {
    implicit val connection = getConnection();
    val stat = dto.prepareInsert(getConnection());
    val resCnt = stat.executeUpdate();
    val rs = stat.getGeneratedKeys();
    if (rs.next()) {
      val pkValue = rs.getLong(1);
      SQL("select * from sourceViewColumn where sourceViewColumnId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[SourceViewColumnDto].single);
    } else {
      null;
    }
  }
  def createAndInsertSourceViewColumnDto(sourceViewId : Long, columnName : String, columnType : String) : SourceViewColumnDto = {
    val dto = new SourceViewColumnDto(0,sourceViewId,new Date(),new Date(),0,columnName,columnType)
    insertSourceViewColumnDto(dto);
  }
  def updateSourceViewColumnDto(dto : SourceViewColumnDto): SourceViewColumnDto = {
    implicit val connection = getConnection();
    val resCnt = SQL("update sourceViewColumn set  sourceViewId = {sourceViewId} ,  lastUpdatedDate = {lastUpdatedDate} ,  columnName = {columnName} ,  columnType = {columnType}  where  sourceViewColumnId = {sourceViewColumnId}  ")
      .on("sourceViewId" -> dto.sourceViewId , "lastUpdatedDate" -> dto.lastUpdatedDate , "columnName" -> dto.columnName , "columnType" -> dto.columnType, "sourceViewColumnId" -> dto.sourceViewColumnId ).executeInsert()
    getSourceViewColumnByPk(dto.sourceViewColumnId)
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
    val dtos : SourceViewTypeDto= SQL("select * from sourceViewType order by insertedRowDate asc ").as(anorm.Macro.namedParser[SourceViewTypeDto].*).head;
    dtos
  }
  def getSourceViewTypeLast() : SourceViewTypeDto = {
    implicit val connection = getConnection();
    val dtos : SourceViewTypeDto= SQL("select * from sourceViewType order by insertedRowDate desc ").as(anorm.Macro.namedParser[SourceViewTypeDto].*).head;
    dtos
  }
  def getSourceViewTypeByGuid(guid : Long) : SourceViewTypeDto = {
    implicit val connection = getConnection();
    val dtos : SourceViewTypeDto= SQL("select * from sourceViewType where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[SourceViewTypeDto].single);
    dtos
  }
  def getSourceViewTypeByPk(pkColValue : Long) : SourceViewTypeDto = {
    implicit val connection = getConnection();
    val dto : SourceViewTypeDto = SQL("select * from sourceViewType where sourceViewTypeId = {pkColValue} ").on("pkColValue" -> pkColValue).as(anorm.Macro.namedParser[SourceViewTypeDto].single);
    dto
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
  def insertSourceViewTypeDto(dto : SourceViewTypeDto): SourceViewTypeDto = {
    implicit val connection = getConnection();
    val stat = dto.prepareInsert(getConnection());
    val resCnt = stat.executeUpdate();
    val rs = stat.getGeneratedKeys();
    if (rs.next()) {
      val pkValue = rs.getLong(1);
      SQL("select * from sourceViewType where sourceViewTypeId = {pkValue} ").on("pkValue" -> pkValue).as(anorm.Macro.namedParser[SourceViewTypeDto].single);
    } else {
      null;
    }
  }
  def createAndInsertSourceViewTypeDto(sourceViewTypeName : String, sourceViewTypeClass : String) : SourceViewTypeDto = {
    val dto = new SourceViewTypeDto(0,0,sourceViewTypeName,sourceViewTypeClass,new Date(),new Date())
    insertSourceViewTypeDto(dto);
  }
  def updateSourceViewTypeDto(dto : SourceViewTypeDto): SourceViewTypeDto = {
    implicit val connection = getConnection();
    val resCnt = SQL("update sourceViewType set  sourceViewTypeName = {sourceViewTypeName} ,  sourceViewTypeClass = {sourceViewTypeClass} ,  lastUpdatedDate = {lastUpdatedDate}  where  sourceViewTypeId = {sourceViewTypeId}  ")
      .on("sourceViewTypeName" -> dto.sourceViewTypeName , "sourceViewTypeClass" -> dto.sourceViewTypeClass , "lastUpdatedDate" -> dto.lastUpdatedDate, "sourceViewTypeId" -> dto.sourceViewTypeId ).executeInsert()
    getSourceViewTypeByPk(dto.sourceViewTypeId)
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
    val dtos : VAlgorithmImplementationDto= SQL("select * from vAlgorithmImplementation order by insertedRowDate asc ").as(anorm.Macro.namedParser[VAlgorithmImplementationDto].*).head;
    dtos
  }
  def getVAlgorithmImplementationLast() : VAlgorithmImplementationDto = {
    implicit val connection = getConnection();
    val dtos : VAlgorithmImplementationDto= SQL("select * from vAlgorithmImplementation order by insertedRowDate desc ").as(anorm.Macro.namedParser[VAlgorithmImplementationDto].*).head;
    dtos
  }
  def getVAlgorithmImplementationByGuid(guid : Long) : VAlgorithmImplementationDto = {
    implicit val connection = getConnection();
    val dtos : VAlgorithmImplementationDto= SQL("select * from vAlgorithmImplementation where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VAlgorithmImplementationDto].single);
    dtos
  }
  def getDtosByAlgorithmImplementationId(colValue : Long) : List[VAlgorithmImplementationDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmImplementationDto] = SQL("select * from vAlgorithmImplementation where algorithmImplementationId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmImplementationDto].*);
    dtos
  }
  def getDtosByGuid(colValue : Long) : List[VAlgorithmImplementationDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmImplementationDto] = SQL("select * from vAlgorithmImplementation where guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmImplementationDto].*);
    dtos
  }
  def getDtosByInsertedRowDate(colValue : java.util.Date) : List[VAlgorithmImplementationDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmImplementationDto] = SQL("select * from vAlgorithmImplementation where insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmImplementationDto].*);
    dtos
  }
  def getDtosByLastUpdatedDate(colValue : java.util.Date) : List[VAlgorithmImplementationDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmImplementationDto] = SQL("select * from vAlgorithmImplementation where lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmImplementationDto].*);
    dtos
  }
  def getDtosByAlgorithmTypeVersionId(colValue : Long) : List[VAlgorithmImplementationDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmImplementationDto] = SQL("select * from vAlgorithmImplementation where algorithmTypeVersionId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmImplementationDto].*);
    dtos
  }
  def getDtosByExecutorTypeId(colValue : Long) : List[VAlgorithmImplementationDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmImplementationDto] = SQL("select * from vAlgorithmImplementation where executorTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmImplementationDto].*);
    dtos
  }
  def getDtosByAlgorithmImplementationName(colValue : String) : List[VAlgorithmImplementationDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmImplementationDto] = SQL("select * from vAlgorithmImplementation where algorithmImplementationName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmImplementationDto].*);
    dtos
  }
  def getDtosByAlgorithmImplementationClass(colValue : String) : List[VAlgorithmImplementationDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmImplementationDto] = SQL("select * from vAlgorithmImplementation where algorithmImplementationClass = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmImplementationDto].*);
    dtos
  }
  def getDtosByAlgorithmTypeVersion_algorithmTypeVersionId(colValue : Long) : List[VAlgorithmImplementationDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmImplementationDto] = SQL("select * from vAlgorithmImplementation where algorithmTypeVersion_algorithmTypeVersionId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmImplementationDto].*);
    dtos
  }
  def getDtosByAlgorithmTypeVersion_guid(colValue : Long) : List[VAlgorithmImplementationDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmImplementationDto] = SQL("select * from vAlgorithmImplementation where algorithmTypeVersion_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmImplementationDto].*);
    dtos
  }
  def getDtosByAlgorithmTypeVersion_algorithmTypeId(colValue : Long) : List[VAlgorithmImplementationDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmImplementationDto] = SQL("select * from vAlgorithmImplementation where algorithmTypeVersion_algorithmTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmImplementationDto].*);
    dtos
  }
  def getDtosByAlgorithmTypeVersion_algorithmTypeVersionName(colValue : String) : List[VAlgorithmImplementationDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmImplementationDto] = SQL("select * from vAlgorithmImplementation where algorithmTypeVersion_algorithmTypeVersionName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmImplementationDto].*);
    dtos
  }
  def getDtosByAlgorithmTypeVersion_insertedRowDate(colValue : java.util.Date) : List[VAlgorithmImplementationDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmImplementationDto] = SQL("select * from vAlgorithmImplementation where algorithmTypeVersion_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmImplementationDto].*);
    dtos
  }
  def getDtosByAlgorithmTypeVersion_lastUpdatedDate(colValue : java.util.Date) : List[VAlgorithmImplementationDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmImplementationDto] = SQL("select * from vAlgorithmImplementation where algorithmTypeVersion_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmImplementationDto].*);
    dtos
  }
  def getDtosByExecutorType_executorTypeId(colValue : Long) : List[VAlgorithmImplementationDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmImplementationDto] = SQL("select * from vAlgorithmImplementation where executorType_executorTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmImplementationDto].*);
    dtos
  }
  def getDtosByExecutorType_guid(colValue : Long) : List[VAlgorithmImplementationDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmImplementationDto] = SQL("select * from vAlgorithmImplementation where executorType_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmImplementationDto].*);
    dtos
  }
  def getDtosByExecutorType_insertedRowDate(colValue : java.util.Date) : List[VAlgorithmImplementationDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmImplementationDto] = SQL("select * from vAlgorithmImplementation where executorType_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmImplementationDto].*);
    dtos
  }
  def getDtosByExecutorType_lastUpdatedDate(colValue : java.util.Date) : List[VAlgorithmImplementationDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmImplementationDto] = SQL("select * from vAlgorithmImplementation where executorType_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmImplementationDto].*);
    dtos
  }
  def getDtosByExecutorType_executorTypeName(colValue : String) : List[VAlgorithmImplementationDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmImplementationDto] = SQL("select * from vAlgorithmImplementation where executorType_executorTypeName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmImplementationDto].*);
    dtos
  }
  def getDtosByExecutorType_executorTypeClass(colValue : String) : List[VAlgorithmImplementationDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmImplementationDto] = SQL("select * from vAlgorithmImplementation where executorType_executorTypeClass = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmImplementationDto].*);
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
    val dtos : VAlgorithmParamTypeDto= SQL("select * from vAlgorithmParamType order by insertedRowDate asc ").as(anorm.Macro.namedParser[VAlgorithmParamTypeDto].*).head;
    dtos
  }
  def getVAlgorithmParamTypeLast() : VAlgorithmParamTypeDto = {
    implicit val connection = getConnection();
    val dtos : VAlgorithmParamTypeDto= SQL("select * from vAlgorithmParamType order by insertedRowDate desc ").as(anorm.Macro.namedParser[VAlgorithmParamTypeDto].*).head;
    dtos
  }
  def getVAlgorithmParamTypeByGuid(guid : Long) : VAlgorithmParamTypeDto = {
    implicit val connection = getConnection();
    val dtos : VAlgorithmParamTypeDto= SQL("select * from vAlgorithmParamType where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VAlgorithmParamTypeDto].single);
    dtos
  }
  def getDtosByAlgorithmParamTypeId(colValue : Long) : List[VAlgorithmParamTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmParamTypeDto] = SQL("select * from vAlgorithmParamType where algorithmParamTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmParamTypeDto].*);
    dtos
  }
  def getDtosByAlgorithmParamId(colValue : Long) : List[VAlgorithmParamTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmParamTypeDto] = SQL("select * from vAlgorithmParamType where algorithmParamId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmParamTypeDto].*);
    dtos
  }
  def getDtosByAlgorithmTypeId(colValue : Long) : List[VAlgorithmParamTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmParamTypeDto] = SQL("select * from vAlgorithmParamType where algorithmTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmParamTypeDto].*);
    dtos
  }
  def getDtosByAlgorithmTypeVersionId(colValue : Long) : List[VAlgorithmParamTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmParamTypeDto] = SQL("select * from vAlgorithmParamType where algorithmTypeVersionId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmParamTypeDto].*);
    dtos
  }
  def getDtosByInsertedRowDate(colValue : java.util.Date) : List[VAlgorithmParamTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmParamTypeDto] = SQL("select * from vAlgorithmParamType where insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmParamTypeDto].*);
    dtos
  }
  def getDtosByLastUpdatedDate(colValue : java.util.Date) : List[VAlgorithmParamTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmParamTypeDto] = SQL("select * from vAlgorithmParamType where lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmParamTypeDto].*);
    dtos
  }
  def getDtosByGuid(colValue : Long) : List[VAlgorithmParamTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmParamTypeDto] = SQL("select * from vAlgorithmParamType where guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmParamTypeDto].*);
    dtos
  }
  def getDtosByAlgorithmParam_algorithmParamId(colValue : Long) : List[VAlgorithmParamTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmParamTypeDto] = SQL("select * from vAlgorithmParamType where algorithmParam_algorithmParamId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmParamTypeDto].*);
    dtos
  }
  def getDtosByAlgorithmParam_guid(colValue : Long) : List[VAlgorithmParamTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmParamTypeDto] = SQL("select * from vAlgorithmParamType where algorithmParam_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmParamTypeDto].*);
    dtos
  }
  def getDtosByAlgorithmParam_insertedRowDate(colValue : java.util.Date) : List[VAlgorithmParamTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmParamTypeDto] = SQL("select * from vAlgorithmParamType where algorithmParam_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmParamTypeDto].*);
    dtos
  }
  def getDtosByAlgorithmParam_lastUpdatedDate(colValue : java.util.Date) : List[VAlgorithmParamTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmParamTypeDto] = SQL("select * from vAlgorithmParamType where algorithmParam_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmParamTypeDto].*);
    dtos
  }
  def getDtosByAlgorithmParam_algorithmParamName(colValue : String) : List[VAlgorithmParamTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmParamTypeDto] = SQL("select * from vAlgorithmParamType where algorithmParam_algorithmParamName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmParamTypeDto].*);
    dtos
  }
  def getDtosByAlgorithmParam_algorithmParamDescription(colValue : String) : List[VAlgorithmParamTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmParamTypeDto] = SQL("select * from vAlgorithmParamType where algorithmParam_algorithmParamDescription = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmParamTypeDto].*);
    dtos
  }
  def getDtosByAlgorithmParam_algorithmParamType(colValue : String) : List[VAlgorithmParamTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmParamTypeDto] = SQL("select * from vAlgorithmParamType where algorithmParam_algorithmParamType = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmParamTypeDto].*);
    dtos
  }
  def getDtosByAlgorithmType_algorithmTypeId(colValue : Long) : List[VAlgorithmParamTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmParamTypeDto] = SQL("select * from vAlgorithmParamType where algorithmType_algorithmTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmParamTypeDto].*);
    dtos
  }
  def getDtosByAlgorithmType_guid(colValue : Long) : List[VAlgorithmParamTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmParamTypeDto] = SQL("select * from vAlgorithmParamType where algorithmType_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmParamTypeDto].*);
    dtos
  }
  def getDtosByAlgorithmType_algorithmTypeName(colValue : String) : List[VAlgorithmParamTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmParamTypeDto] = SQL("select * from vAlgorithmParamType where algorithmType_algorithmTypeName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmParamTypeDto].*);
    dtos
  }
  def getDtosByAlgorithmType_algorithmTypeDescription(colValue : String) : List[VAlgorithmParamTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmParamTypeDto] = SQL("select * from vAlgorithmParamType where algorithmType_algorithmTypeDescription = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmParamTypeDto].*);
    dtos
  }
  def getDtosByAlgorithmType_insertedRowDate(colValue : java.util.Date) : List[VAlgorithmParamTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmParamTypeDto] = SQL("select * from vAlgorithmParamType where algorithmType_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmParamTypeDto].*);
    dtos
  }
  def getDtosByAlgorithmType_lastUpdatedDate(colValue : java.util.Date) : List[VAlgorithmParamTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmParamTypeDto] = SQL("select * from vAlgorithmParamType where algorithmType_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmParamTypeDto].*);
    dtos
  }
  def getDtosByAlgorithmTypeVersion_algorithmTypeVersionId(colValue : Long) : List[VAlgorithmParamTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmParamTypeDto] = SQL("select * from vAlgorithmParamType where algorithmTypeVersion_algorithmTypeVersionId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmParamTypeDto].*);
    dtos
  }
  def getDtosByAlgorithmTypeVersion_guid(colValue : Long) : List[VAlgorithmParamTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmParamTypeDto] = SQL("select * from vAlgorithmParamType where algorithmTypeVersion_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmParamTypeDto].*);
    dtos
  }
  def getDtosByAlgorithmTypeVersion_algorithmTypeId(colValue : Long) : List[VAlgorithmParamTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmParamTypeDto] = SQL("select * from vAlgorithmParamType where algorithmTypeVersion_algorithmTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmParamTypeDto].*);
    dtos
  }
  def getDtosByAlgorithmTypeVersion_algorithmTypeVersionName(colValue : String) : List[VAlgorithmParamTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmParamTypeDto] = SQL("select * from vAlgorithmParamType where algorithmTypeVersion_algorithmTypeVersionName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmParamTypeDto].*);
    dtos
  }
  def getDtosByAlgorithmTypeVersion_insertedRowDate(colValue : java.util.Date) : List[VAlgorithmParamTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmParamTypeDto] = SQL("select * from vAlgorithmParamType where algorithmTypeVersion_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmParamTypeDto].*);
    dtos
  }
  def getDtosByAlgorithmTypeVersion_lastUpdatedDate(colValue : java.util.Date) : List[VAlgorithmParamTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmParamTypeDto] = SQL("select * from vAlgorithmParamType where algorithmTypeVersion_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmParamTypeDto].*);
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
    val dtos : VAlgorithmRunDto= SQL("select * from vAlgorithmRun order by insertedRowDate asc ").as(anorm.Macro.namedParser[VAlgorithmRunDto].*).head;
    dtos
  }
  def getVAlgorithmRunLast() : VAlgorithmRunDto = {
    implicit val connection = getConnection();
    val dtos : VAlgorithmRunDto= SQL("select * from vAlgorithmRun order by insertedRowDate desc ").as(anorm.Macro.namedParser[VAlgorithmRunDto].*).head;
    dtos
  }
  def getVAlgorithmRunByGuid(guid : Long) : VAlgorithmRunDto = {
    implicit val connection = getConnection();
    val dtos : VAlgorithmRunDto= SQL("select * from vAlgorithmRun where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VAlgorithmRunDto].single);
    dtos
  }
  def getDtosByAlgorithmRunId(colValue : Long) : List[VAlgorithmRunDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunDto] = SQL("select * from vAlgorithmRun where algorithmRunId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunDto].*);
    dtos
  }
  def getDtosByGuid(colValue : Long) : List[VAlgorithmRunDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunDto] = SQL("select * from vAlgorithmRun where guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunDto].*);
    dtos
  }
  def getDtosByAlgorithmScheduleId(colValue : Long) : List[VAlgorithmRunDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunDto] = SQL("select * from vAlgorithmRun where algorithmScheduleId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunDto].*);
    dtos
  }
  def getDtosByExecutorInstanceId(colValue : Long) : List[VAlgorithmRunDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunDto] = SQL("select * from vAlgorithmRun where executorInstanceId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunDto].*);
    dtos
  }
  def getDtosByExecutorStorageId(colValue : Long) : List[VAlgorithmRunDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunDto] = SQL("select * from vAlgorithmRun where executorStorageId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunDto].*);
    dtos
  }
  def getDtosByAlgorithmRunName(colValue : String) : List[VAlgorithmRunDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunDto] = SQL("select * from vAlgorithmRun where algorithmRunName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunDto].*);
    dtos
  }
  def getDtosByInsertedRowDate(colValue : java.util.Date) : List[VAlgorithmRunDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunDto] = SQL("select * from vAlgorithmRun where insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunDto].*);
    dtos
  }
  def getDtosByLastUpdatedDate(colValue : java.util.Date) : List[VAlgorithmRunDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunDto] = SQL("select * from vAlgorithmRun where lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunDto].*);
    dtos
  }
  def getDtosByRunDate(colValue : java.util.Date) : List[VAlgorithmRunDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunDto] = SQL("select * from vAlgorithmRun where runDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunDto].*);
    dtos
  }
  def getDtosByIsRunning(colValue : Int) : List[VAlgorithmRunDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunDto] = SQL("select * from vAlgorithmRun where isRunning = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunDto].*);
    dtos
  }
  def getDtosByIsFinished(colValue : Int) : List[VAlgorithmRunDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunDto] = SQL("select * from vAlgorithmRun where isFinished = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunDto].*);
    dtos
  }
  def getDtosByAlgorithmSchedule_algorithmScheduleId(colValue : Long) : List[VAlgorithmRunDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunDto] = SQL("select * from vAlgorithmRun where algorithmSchedule_algorithmScheduleId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunDto].*);
    dtos
  }
  def getDtosByAlgorithmSchedule_guid(colValue : Long) : List[VAlgorithmRunDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunDto] = SQL("select * from vAlgorithmRun where algorithmSchedule_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunDto].*);
    dtos
  }
  def getDtosByAlgorithmSchedule_algorithmImplementationId(colValue : Long) : List[VAlgorithmRunDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunDto] = SQL("select * from vAlgorithmRun where algorithmSchedule_algorithmImplementationId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunDto].*);
    dtos
  }
  def getDtosByAlgorithmSchedule_algorithmScheduleTypeId(colValue : Long) : List[VAlgorithmRunDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunDto] = SQL("select * from vAlgorithmRun where algorithmSchedule_algorithmScheduleTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunDto].*);
    dtos
  }
  def getDtosByAlgorithmSchedule_algorithmScheduleName(colValue : String) : List[VAlgorithmRunDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunDto] = SQL("select * from vAlgorithmRun where algorithmSchedule_algorithmScheduleName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunDto].*);
    dtos
  }
  def getDtosByAlgorithmSchedule_isScheduled(colValue : Int) : List[VAlgorithmRunDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunDto] = SQL("select * from vAlgorithmRun where algorithmSchedule_isScheduled = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunDto].*);
    dtos
  }
  def getDtosByAlgorithmSchedule_insertedRowDate(colValue : java.util.Date) : List[VAlgorithmRunDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunDto] = SQL("select * from vAlgorithmRun where algorithmSchedule_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunDto].*);
    dtos
  }
  def getDtosByAlgorithmSchedule_lastUpdatedDate(colValue : java.util.Date) : List[VAlgorithmRunDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunDto] = SQL("select * from vAlgorithmRun where algorithmSchedule_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunDto].*);
    dtos
  }
  def getDtosByExecutorInstance_executorInstanceId(colValue : Long) : List[VAlgorithmRunDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunDto] = SQL("select * from vAlgorithmRun where executorInstance_executorInstanceId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunDto].*);
    dtos
  }
  def getDtosByExecutorInstance_guid(colValue : Long) : List[VAlgorithmRunDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunDto] = SQL("select * from vAlgorithmRun where executorInstance_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunDto].*);
    dtos
  }
  def getDtosByExecutorInstance_executorTypeId(colValue : Long) : List[VAlgorithmRunDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunDto] = SQL("select * from vAlgorithmRun where executorInstance_executorTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunDto].*);
    dtos
  }
  def getDtosByExecutorInstance_executorHostId(colValue : Long) : List[VAlgorithmRunDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunDto] = SQL("select * from vAlgorithmRun where executorInstance_executorHostId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunDto].*);
    dtos
  }
  def getDtosByExecutorInstance_executorInstanceName(colValue : String) : List[VAlgorithmRunDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunDto] = SQL("select * from vAlgorithmRun where executorInstance_executorInstanceName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunDto].*);
    dtos
  }
  def getDtosByExecutorInstance_isRunning(colValue : Int) : List[VAlgorithmRunDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunDto] = SQL("select * from vAlgorithmRun where executorInstance_isRunning = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunDto].*);
    dtos
  }
  def getDtosByExecutorInstance_isFinished(colValue : Int) : List[VAlgorithmRunDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunDto] = SQL("select * from vAlgorithmRun where executorInstance_isFinished = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunDto].*);
    dtos
  }
  def getDtosByExecutorInstance_portNumber(colValue : Int) : List[VAlgorithmRunDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunDto] = SQL("select * from vAlgorithmRun where executorInstance_portNumber = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunDto].*);
    dtos
  }
  def getDtosByExecutorInstance_insertedRowDate(colValue : java.util.Date) : List[VAlgorithmRunDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunDto] = SQL("select * from vAlgorithmRun where executorInstance_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunDto].*);
    dtos
  }
  def getDtosByExecutorInstance_lastUpdatedDate(colValue : java.util.Date) : List[VAlgorithmRunDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunDto] = SQL("select * from vAlgorithmRun where executorInstance_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunDto].*);
    dtos
  }
  def getDtosByExecutorInstance_endDate(colValue : java.util.Date) : List[VAlgorithmRunDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunDto] = SQL("select * from vAlgorithmRun where executorInstance_endDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunDto].*);
    dtos
  }
  def getDtosByExecutorStorage_executorStorageId(colValue : Long) : List[VAlgorithmRunDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunDto] = SQL("select * from vAlgorithmRun where executorStorage_executorStorageId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunDto].*);
    dtos
  }
  def getDtosByExecutorStorage_guid(colValue : Long) : List[VAlgorithmRunDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunDto] = SQL("select * from vAlgorithmRun where executorStorage_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunDto].*);
    dtos
  }
  def getDtosByExecutorStorage_executorHostId(colValue : Long) : List[VAlgorithmRunDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunDto] = SQL("select * from vAlgorithmRun where executorStorage_executorHostId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunDto].*);
    dtos
  }
  def getDtosByExecutorStorage_executorStorageTypeId(colValue : Long) : List[VAlgorithmRunDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunDto] = SQL("select * from vAlgorithmRun where executorStorage_executorStorageTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunDto].*);
    dtos
  }
  def getDtosByExecutorStorage_storageDefinition(colValue : String) : List[VAlgorithmRunDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunDto] = SQL("select * from vAlgorithmRun where executorStorage_storageDefinition = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunDto].*);
    dtos
  }
  def getDtosByExecutorStorage_storageBasePath(colValue : String) : List[VAlgorithmRunDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunDto] = SQL("select * from vAlgorithmRun where executorStorage_storageBasePath = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunDto].*);
    dtos
  }
  def getDtosByExecutorStorage_storageFulllPath(colValue : String) : List[VAlgorithmRunDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunDto] = SQL("select * from vAlgorithmRun where executorStorage_storageFulllPath = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunDto].*);
    dtos
  }
  def getDtosByExecutorStorage_isRunning(colValue : Int) : List[VAlgorithmRunDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunDto] = SQL("select * from vAlgorithmRun where executorStorage_isRunning = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunDto].*);
    dtos
  }
  def getDtosByExecutorStorage_portNumber(colValue : Int) : List[VAlgorithmRunDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunDto] = SQL("select * from vAlgorithmRun where executorStorage_portNumber = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunDto].*);
    dtos
  }
  def getDtosByExecutorStorage_insertedRowDate(colValue : java.util.Date) : List[VAlgorithmRunDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunDto] = SQL("select * from vAlgorithmRun where executorStorage_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunDto].*);
    dtos
  }
  def getDtosByExecutorStorage_lastUpdatedDate(colValue : java.util.Date) : List[VAlgorithmRunDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunDto] = SQL("select * from vAlgorithmRun where executorStorage_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunDto].*);
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
    val dtos : VAlgorithmRunViewDto= SQL("select * from vAlgorithmRunView order by insertedRowDate asc ").as(anorm.Macro.namedParser[VAlgorithmRunViewDto].*).head;
    dtos
  }
  def getVAlgorithmRunViewLast() : VAlgorithmRunViewDto = {
    implicit val connection = getConnection();
    val dtos : VAlgorithmRunViewDto= SQL("select * from vAlgorithmRunView order by insertedRowDate desc ").as(anorm.Macro.namedParser[VAlgorithmRunViewDto].*).head;
    dtos
  }
  def getVAlgorithmRunViewByGuid(guid : Long) : VAlgorithmRunViewDto = {
    implicit val connection = getConnection();
    val dtos : VAlgorithmRunViewDto= SQL("select * from vAlgorithmRunView where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VAlgorithmRunViewDto].single);
    dtos
  }
  def getDtosByAlgorithmRunViewId(colValue : Long) : List[VAlgorithmRunViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunViewDto] = SQL("select * from vAlgorithmRunView where algorithmRunViewId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunViewDto].*);
    dtos
  }
  def getDtosByGuid(colValue : Long) : List[VAlgorithmRunViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunViewDto] = SQL("select * from vAlgorithmRunView where guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunViewDto].*);
    dtos
  }
  def getDtosByAlgorithmRunId(colValue : Long) : List[VAlgorithmRunViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunViewDto] = SQL("select * from vAlgorithmRunView where algorithmRunId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunViewDto].*);
    dtos
  }
  def getDtosByExecutorStorageViewId(colValue : Long) : List[VAlgorithmRunViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunViewDto] = SQL("select * from vAlgorithmRunView where executorStorageViewId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunViewDto].*);
    dtos
  }
  def getDtosByInsertedRowDate(colValue : java.util.Date) : List[VAlgorithmRunViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunViewDto] = SQL("select * from vAlgorithmRunView where insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunViewDto].*);
    dtos
  }
  def getDtosByLastUpdatedDate(colValue : java.util.Date) : List[VAlgorithmRunViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunViewDto] = SQL("select * from vAlgorithmRunView where lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunViewDto].*);
    dtos
  }
  def getDtosByIsDownloaded(colValue : Int) : List[VAlgorithmRunViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunViewDto] = SQL("select * from vAlgorithmRunView where isDownloaded = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunViewDto].*);
    dtos
  }
  def getDtosByAlgorithmRun_algorithmRunId(colValue : Long) : List[VAlgorithmRunViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunViewDto] = SQL("select * from vAlgorithmRunView where algorithmRun_algorithmRunId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunViewDto].*);
    dtos
  }
  def getDtosByAlgorithmRun_guid(colValue : Long) : List[VAlgorithmRunViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunViewDto] = SQL("select * from vAlgorithmRunView where algorithmRun_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunViewDto].*);
    dtos
  }
  def getDtosByAlgorithmRun_algorithmScheduleId(colValue : Long) : List[VAlgorithmRunViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunViewDto] = SQL("select * from vAlgorithmRunView where algorithmRun_algorithmScheduleId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunViewDto].*);
    dtos
  }
  def getDtosByAlgorithmRun_executorInstanceId(colValue : Long) : List[VAlgorithmRunViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunViewDto] = SQL("select * from vAlgorithmRunView where algorithmRun_executorInstanceId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunViewDto].*);
    dtos
  }
  def getDtosByAlgorithmRun_executorStorageId(colValue : Long) : List[VAlgorithmRunViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunViewDto] = SQL("select * from vAlgorithmRunView where algorithmRun_executorStorageId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunViewDto].*);
    dtos
  }
  def getDtosByAlgorithmRun_algorithmRunName(colValue : String) : List[VAlgorithmRunViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunViewDto] = SQL("select * from vAlgorithmRunView where algorithmRun_algorithmRunName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunViewDto].*);
    dtos
  }
  def getDtosByAlgorithmRun_insertedRowDate(colValue : java.util.Date) : List[VAlgorithmRunViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunViewDto] = SQL("select * from vAlgorithmRunView where algorithmRun_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunViewDto].*);
    dtos
  }
  def getDtosByAlgorithmRun_lastUpdatedDate(colValue : java.util.Date) : List[VAlgorithmRunViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunViewDto] = SQL("select * from vAlgorithmRunView where algorithmRun_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunViewDto].*);
    dtos
  }
  def getDtosByAlgorithmRun_runDate(colValue : java.util.Date) : List[VAlgorithmRunViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunViewDto] = SQL("select * from vAlgorithmRunView where algorithmRun_runDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunViewDto].*);
    dtos
  }
  def getDtosByAlgorithmRun_isRunning(colValue : Int) : List[VAlgorithmRunViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunViewDto] = SQL("select * from vAlgorithmRunView where algorithmRun_isRunning = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunViewDto].*);
    dtos
  }
  def getDtosByAlgorithmRun_isFinished(colValue : Int) : List[VAlgorithmRunViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunViewDto] = SQL("select * from vAlgorithmRunView where algorithmRun_isFinished = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunViewDto].*);
    dtos
  }
  def getDtosByExecutorStorageView_executorStorageViewId(colValue : Long) : List[VAlgorithmRunViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunViewDto] = SQL("select * from vAlgorithmRunView where executorStorageView_executorStorageViewId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunViewDto].*);
    dtos
  }
  def getDtosByExecutorStorageView_guid(colValue : Long) : List[VAlgorithmRunViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunViewDto] = SQL("select * from vAlgorithmRunView where executorStorageView_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunViewDto].*);
    dtos
  }
  def getDtosByExecutorStorageView_insertedRowDate(colValue : java.util.Date) : List[VAlgorithmRunViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunViewDto] = SQL("select * from vAlgorithmRunView where executorStorageView_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunViewDto].*);
    dtos
  }
  def getDtosByExecutorStorageView_lastUpdatedDate(colValue : java.util.Date) : List[VAlgorithmRunViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunViewDto] = SQL("select * from vAlgorithmRunView where executorStorageView_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunViewDto].*);
    dtos
  }
  def getDtosByExecutorStorageView_executorStorageSnapshotId(colValue : Long) : List[VAlgorithmRunViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunViewDto] = SQL("select * from vAlgorithmRunView where executorStorageView_executorStorageSnapshotId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunViewDto].*);
    dtos
  }
  def getDtosByExecutorStorageView_executorStorageId(colValue : Long) : List[VAlgorithmRunViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunViewDto] = SQL("select * from vAlgorithmRunView where executorStorageView_executorStorageId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunViewDto].*);
    dtos
  }
  def getDtosByExecutorStorageView_sourceDownloadId(colValue : Long) : List[VAlgorithmRunViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunViewDto] = SQL("select * from vAlgorithmRunView where executorStorageView_sourceDownloadId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunViewDto].*);
    dtos
  }
  def getDtosByExecutorStorageView_storagePath(colValue : String) : List[VAlgorithmRunViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunViewDto] = SQL("select * from vAlgorithmRunView where executorStorageView_storagePath = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunViewDto].*);
    dtos
  }
  def getDtosByExecutorStorageView_viewSize(colValue : Long) : List[VAlgorithmRunViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunViewDto] = SQL("select * from vAlgorithmRunView where executorStorageView_viewSize = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunViewDto].*);
    dtos
  }
  def getDtosByExecutorStorageView_viewRowsCount(colValue : Long) : List[VAlgorithmRunViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmRunViewDto] = SQL("select * from vAlgorithmRunView where executorStorageView_viewRowsCount = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmRunViewDto].*);
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
    val dtos : VAlgorithmScheduleDto= SQL("select * from vAlgorithmSchedule order by insertedRowDate asc ").as(anorm.Macro.namedParser[VAlgorithmScheduleDto].*).head;
    dtos
  }
  def getVAlgorithmScheduleLast() : VAlgorithmScheduleDto = {
    implicit val connection = getConnection();
    val dtos : VAlgorithmScheduleDto= SQL("select * from vAlgorithmSchedule order by insertedRowDate desc ").as(anorm.Macro.namedParser[VAlgorithmScheduleDto].*).head;
    dtos
  }
  def getVAlgorithmScheduleByGuid(guid : Long) : VAlgorithmScheduleDto = {
    implicit val connection = getConnection();
    val dtos : VAlgorithmScheduleDto= SQL("select * from vAlgorithmSchedule where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VAlgorithmScheduleDto].single);
    dtos
  }
  def getDtosByAlgorithmScheduleId(colValue : Long) : List[VAlgorithmScheduleDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleDto] = SQL("select * from vAlgorithmSchedule where algorithmScheduleId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleDto].*);
    dtos
  }
  def getDtosByGuid(colValue : Long) : List[VAlgorithmScheduleDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleDto] = SQL("select * from vAlgorithmSchedule where guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleDto].*);
    dtos
  }
  def getDtosByAlgorithmImplementationId(colValue : Long) : List[VAlgorithmScheduleDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleDto] = SQL("select * from vAlgorithmSchedule where algorithmImplementationId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleDto].*);
    dtos
  }
  def getDtosByAlgorithmScheduleTypeId(colValue : Long) : List[VAlgorithmScheduleDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleDto] = SQL("select * from vAlgorithmSchedule where algorithmScheduleTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleDto].*);
    dtos
  }
  def getDtosByAlgorithmScheduleName(colValue : String) : List[VAlgorithmScheduleDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleDto] = SQL("select * from vAlgorithmSchedule where algorithmScheduleName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleDto].*);
    dtos
  }
  def getDtosByIsScheduled(colValue : Int) : List[VAlgorithmScheduleDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleDto] = SQL("select * from vAlgorithmSchedule where isScheduled = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleDto].*);
    dtos
  }
  def getDtosByInsertedRowDate(colValue : java.util.Date) : List[VAlgorithmScheduleDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleDto] = SQL("select * from vAlgorithmSchedule where insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleDto].*);
    dtos
  }
  def getDtosByLastUpdatedDate(colValue : java.util.Date) : List[VAlgorithmScheduleDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleDto] = SQL("select * from vAlgorithmSchedule where lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleDto].*);
    dtos
  }
  def getDtosByAlgorithmImplementation_algorithmImplementationId(colValue : Long) : List[VAlgorithmScheduleDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleDto] = SQL("select * from vAlgorithmSchedule where algorithmImplementation_algorithmImplementationId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleDto].*);
    dtos
  }
  def getDtosByAlgorithmImplementation_guid(colValue : Long) : List[VAlgorithmScheduleDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleDto] = SQL("select * from vAlgorithmSchedule where algorithmImplementation_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleDto].*);
    dtos
  }
  def getDtosByAlgorithmImplementation_insertedRowDate(colValue : java.util.Date) : List[VAlgorithmScheduleDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleDto] = SQL("select * from vAlgorithmSchedule where algorithmImplementation_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleDto].*);
    dtos
  }
  def getDtosByAlgorithmImplementation_lastUpdatedDate(colValue : java.util.Date) : List[VAlgorithmScheduleDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleDto] = SQL("select * from vAlgorithmSchedule where algorithmImplementation_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleDto].*);
    dtos
  }
  def getDtosByAlgorithmImplementation_algorithmTypeVersionId(colValue : Long) : List[VAlgorithmScheduleDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleDto] = SQL("select * from vAlgorithmSchedule where algorithmImplementation_algorithmTypeVersionId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleDto].*);
    dtos
  }
  def getDtosByAlgorithmImplementation_executorTypeId(colValue : Long) : List[VAlgorithmScheduleDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleDto] = SQL("select * from vAlgorithmSchedule where algorithmImplementation_executorTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleDto].*);
    dtos
  }
  def getDtosByAlgorithmImplementation_algorithmImplementationName(colValue : String) : List[VAlgorithmScheduleDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleDto] = SQL("select * from vAlgorithmSchedule where algorithmImplementation_algorithmImplementationName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleDto].*);
    dtos
  }
  def getDtosByAlgorithmImplementation_algorithmImplementationClass(colValue : String) : List[VAlgorithmScheduleDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleDto] = SQL("select * from vAlgorithmSchedule where algorithmImplementation_algorithmImplementationClass = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleDto].*);
    dtos
  }
  def getDtosByAlgorithmScheduleType_algorithmScheduleTypeId(colValue : Long) : List[VAlgorithmScheduleDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleDto] = SQL("select * from vAlgorithmSchedule where algorithmScheduleType_algorithmScheduleTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleDto].*);
    dtos
  }
  def getDtosByAlgorithmScheduleType_guid(colValue : Long) : List[VAlgorithmScheduleDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleDto] = SQL("select * from vAlgorithmSchedule where algorithmScheduleType_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleDto].*);
    dtos
  }
  def getDtosByAlgorithmScheduleType_algorithmScheduleTypeName(colValue : String) : List[VAlgorithmScheduleDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleDto] = SQL("select * from vAlgorithmSchedule where algorithmScheduleType_algorithmScheduleTypeName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleDto].*);
    dtos
  }
  def getDtosByAlgorithmScheduleType_insertedRowDate(colValue : java.util.Date) : List[VAlgorithmScheduleDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleDto] = SQL("select * from vAlgorithmSchedule where algorithmScheduleType_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleDto].*);
    dtos
  }
  def getDtosByAlgorithmScheduleType_lastUpdatedDate(colValue : java.util.Date) : List[VAlgorithmScheduleDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleDto] = SQL("select * from vAlgorithmSchedule where algorithmScheduleType_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleDto].*);
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
    val dtos : VAlgorithmScheduleColumnDto= SQL("select * from vAlgorithmScheduleColumn order by insertedRowDate asc ").as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*).head;
    dtos
  }
  def getVAlgorithmScheduleColumnLast() : VAlgorithmScheduleColumnDto = {
    implicit val connection = getConnection();
    val dtos : VAlgorithmScheduleColumnDto= SQL("select * from vAlgorithmScheduleColumn order by insertedRowDate desc ").as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*).head;
    dtos
  }
  def getVAlgorithmScheduleColumnByGuid(guid : Long) : VAlgorithmScheduleColumnDto = {
    implicit val connection = getConnection();
    val dtos : VAlgorithmScheduleColumnDto= SQL("select * from vAlgorithmScheduleColumn where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].single);
    dtos
  }
  def getDtosByAlgorithmScheduleColumnId(colValue : Long) : List[VAlgorithmScheduleColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where algorithmScheduleColumnId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);
    dtos
  }
  def getDtosByGuid(colValue : Long) : List[VAlgorithmScheduleColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);
    dtos
  }
  def getDtosByAlgorithmScheduleId(colValue : Long) : List[VAlgorithmScheduleColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where algorithmScheduleId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);
    dtos
  }
  def getDtosByAlgorithmColumnTypeId(colValue : Long) : List[VAlgorithmScheduleColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where algorithmColumnTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);
    dtos
  }
  def getDtosByAlgorithmScheduleViewId(colValue : Long) : List[VAlgorithmScheduleColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where algorithmScheduleViewId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);
    dtos
  }
  def getDtosBySourceViewId(colValue : Long) : List[VAlgorithmScheduleColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where sourceViewId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);
    dtos
  }
  def getDtosBySourceViewColumnId(colValue : Long) : List[VAlgorithmScheduleColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where sourceViewColumnId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);
    dtos
  }
  def getDtosByExtendedProperties(colValue : String) : List[VAlgorithmScheduleColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where extendedProperties = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);
    dtos
  }
  def getDtosByInsertedRowDate(colValue : java.util.Date) : List[VAlgorithmScheduleColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);
    dtos
  }
  def getDtosByLastUpdatedDate(colValue : java.util.Date) : List[VAlgorithmScheduleColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);
    dtos
  }
  def getDtosByAlgorithmColumnType_algorithmColumnTypeId(colValue : Long) : List[VAlgorithmScheduleColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where algorithmColumnType_algorithmColumnTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);
    dtos
  }
  def getDtosByAlgorithmColumnType_algorithmColumnTypeName(colValue : String) : List[VAlgorithmScheduleColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where algorithmColumnType_algorithmColumnTypeName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);
    dtos
  }
  def getDtosByAlgorithmColumnType_algorithmColumnTypeDescription(colValue : String) : List[VAlgorithmScheduleColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where algorithmColumnType_algorithmColumnTypeDescription = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);
    dtos
  }
  def getDtosByAlgorithmColumnType_insertedRowDate(colValue : java.util.Date) : List[VAlgorithmScheduleColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where algorithmColumnType_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);
    dtos
  }
  def getDtosByAlgorithmColumnType_lastUpdatedDate(colValue : java.util.Date) : List[VAlgorithmScheduleColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where algorithmColumnType_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);
    dtos
  }
  def getDtosByAlgorithmColumnType_guid(colValue : Long) : List[VAlgorithmScheduleColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where algorithmColumnType_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);
    dtos
  }
  def getDtosByAlgorithmSchedule_algorithmScheduleId(colValue : Long) : List[VAlgorithmScheduleColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where algorithmSchedule_algorithmScheduleId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);
    dtos
  }
  def getDtosByAlgorithmSchedule_guid(colValue : Long) : List[VAlgorithmScheduleColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where algorithmSchedule_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);
    dtos
  }
  def getDtosByAlgorithmSchedule_algorithmImplementationId(colValue : Long) : List[VAlgorithmScheduleColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where algorithmSchedule_algorithmImplementationId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);
    dtos
  }
  def getDtosByAlgorithmSchedule_algorithmScheduleTypeId(colValue : Long) : List[VAlgorithmScheduleColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where algorithmSchedule_algorithmScheduleTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);
    dtos
  }
  def getDtosByAlgorithmSchedule_algorithmScheduleName(colValue : String) : List[VAlgorithmScheduleColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where algorithmSchedule_algorithmScheduleName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);
    dtos
  }
  def getDtosByAlgorithmSchedule_isScheduled(colValue : Int) : List[VAlgorithmScheduleColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where algorithmSchedule_isScheduled = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);
    dtos
  }
  def getDtosByAlgorithmSchedule_insertedRowDate(colValue : java.util.Date) : List[VAlgorithmScheduleColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where algorithmSchedule_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);
    dtos
  }
  def getDtosByAlgorithmSchedule_lastUpdatedDate(colValue : java.util.Date) : List[VAlgorithmScheduleColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where algorithmSchedule_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);
    dtos
  }
  def getDtosByAlgorithmScheduleView_algorithmScheduleViewId(colValue : Long) : List[VAlgorithmScheduleColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where algorithmScheduleView_algorithmScheduleViewId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);
    dtos
  }
  def getDtosByAlgorithmScheduleView_guid(colValue : Long) : List[VAlgorithmScheduleColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where algorithmScheduleView_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);
    dtos
  }
  def getDtosByAlgorithmScheduleView_algorithmScheduleViewTypeId(colValue : Long) : List[VAlgorithmScheduleColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where algorithmScheduleView_algorithmScheduleViewTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);
    dtos
  }
  def getDtosByAlgorithmScheduleView_algorithmScheduleId(colValue : Long) : List[VAlgorithmScheduleColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where algorithmScheduleView_algorithmScheduleId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);
    dtos
  }
  def getDtosByAlgorithmScheduleView_sourceViewId(colValue : Long) : List[VAlgorithmScheduleColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where algorithmScheduleView_sourceViewId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);
    dtos
  }
  def getDtosByAlgorithmScheduleView_insertedRowDate(colValue : java.util.Date) : List[VAlgorithmScheduleColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where algorithmScheduleView_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);
    dtos
  }
  def getDtosByAlgorithmScheduleView_lastUpdatedDate(colValue : java.util.Date) : List[VAlgorithmScheduleColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where algorithmScheduleView_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);
    dtos
  }
  def getDtosByAlgorithmScheduleView_joinOnDefinition(colValue : String) : List[VAlgorithmScheduleColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where algorithmScheduleView_joinOnDefinition = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);
    dtos
  }
  def getDtosBySourceView_sourceViewId(colValue : Long) : List[VAlgorithmScheduleColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where sourceView_sourceViewId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);
    dtos
  }
  def getDtosBySourceView_guid(colValue : Long) : List[VAlgorithmScheduleColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where sourceView_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);
    dtos
  }
  def getDtosBySourceView_sourceInstanceId(colValue : Long) : List[VAlgorithmScheduleColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where sourceView_sourceInstanceId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);
    dtos
  }
  def getDtosBySourceView_sourceViewTypeId(colValue : Long) : List[VAlgorithmScheduleColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where sourceView_sourceViewTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);
    dtos
  }
  def getDtosBySourceView_sourceViewName(colValue : String) : List[VAlgorithmScheduleColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where sourceView_sourceViewName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);
    dtos
  }
  def getDtosBySourceView_sourceViewDefinition(colValue : String) : List[VAlgorithmScheduleColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where sourceView_sourceViewDefinition = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);
    dtos
  }
  def getDtosBySourceView_insertedRowDate(colValue : java.util.Date) : List[VAlgorithmScheduleColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where sourceView_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);
    dtos
  }
  def getDtosBySourceView_lastUpdatedDate(colValue : java.util.Date) : List[VAlgorithmScheduleColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where sourceView_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);
    dtos
  }
  def getDtosBySourceViewColumn_sourceViewColumnId(colValue : Long) : List[VAlgorithmScheduleColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where sourceViewColumn_sourceViewColumnId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);
    dtos
  }
  def getDtosBySourceViewColumn_sourceViewId(colValue : Long) : List[VAlgorithmScheduleColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where sourceViewColumn_sourceViewId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);
    dtos
  }
  def getDtosBySourceViewColumn_insertedRowDate(colValue : java.util.Date) : List[VAlgorithmScheduleColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where sourceViewColumn_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);
    dtos
  }
  def getDtosBySourceViewColumn_lastUpdatedDate(colValue : java.util.Date) : List[VAlgorithmScheduleColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where sourceViewColumn_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);
    dtos
  }
  def getDtosBySourceViewColumn_guid(colValue : Long) : List[VAlgorithmScheduleColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where sourceViewColumn_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);
    dtos
  }
  def getDtosBySourceViewColumn_columnName(colValue : String) : List[VAlgorithmScheduleColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where sourceViewColumn_columnName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);
    dtos
  }
  def getDtosBySourceViewColumn_columnType(colValue : String) : List[VAlgorithmScheduleColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleColumnDto] = SQL("select * from vAlgorithmScheduleColumn where sourceViewColumn_columnType = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleColumnDto].*);
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
    val dtos : VAlgorithmScheduleParamDto= SQL("select * from vAlgorithmScheduleParam order by insertedRowDate asc ").as(anorm.Macro.namedParser[VAlgorithmScheduleParamDto].*).head;
    dtos
  }
  def getVAlgorithmScheduleParamLast() : VAlgorithmScheduleParamDto = {
    implicit val connection = getConnection();
    val dtos : VAlgorithmScheduleParamDto= SQL("select * from vAlgorithmScheduleParam order by insertedRowDate desc ").as(anorm.Macro.namedParser[VAlgorithmScheduleParamDto].*).head;
    dtos
  }
  def getVAlgorithmScheduleParamByGuid(guid : Long) : VAlgorithmScheduleParamDto = {
    implicit val connection = getConnection();
    val dtos : VAlgorithmScheduleParamDto= SQL("select * from vAlgorithmScheduleParam where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VAlgorithmScheduleParamDto].single);
    dtos
  }
  def getDtosByAlgorithmScheduleParamId(colValue : Long) : List[VAlgorithmScheduleParamDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleParamDto] = SQL("select * from vAlgorithmScheduleParam where algorithmScheduleParamId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleParamDto].*);
    dtos
  }
  def getDtosByGuid(colValue : Long) : List[VAlgorithmScheduleParamDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleParamDto] = SQL("select * from vAlgorithmScheduleParam where guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleParamDto].*);
    dtos
  }
  def getDtosByAlgorithmScheduleId(colValue : Long) : List[VAlgorithmScheduleParamDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleParamDto] = SQL("select * from vAlgorithmScheduleParam where algorithmScheduleId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleParamDto].*);
    dtos
  }
  def getDtosByAlgorithmParamId(colValue : Long) : List[VAlgorithmScheduleParamDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleParamDto] = SQL("select * from vAlgorithmScheduleParam where algorithmParamId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleParamDto].*);
    dtos
  }
  def getDtosByAlgorithmParamValue(colValue : String) : List[VAlgorithmScheduleParamDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleParamDto] = SQL("select * from vAlgorithmScheduleParam where algorithmParamValue = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleParamDto].*);
    dtos
  }
  def getDtosByInsertedRowDate(colValue : java.util.Date) : List[VAlgorithmScheduleParamDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleParamDto] = SQL("select * from vAlgorithmScheduleParam where insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleParamDto].*);
    dtos
  }
  def getDtosByLastUpdatedDate(colValue : java.util.Date) : List[VAlgorithmScheduleParamDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleParamDto] = SQL("select * from vAlgorithmScheduleParam where lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleParamDto].*);
    dtos
  }
  def getDtosByAlgorithmParam_algorithmParamId(colValue : Long) : List[VAlgorithmScheduleParamDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleParamDto] = SQL("select * from vAlgorithmScheduleParam where algorithmParam_algorithmParamId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleParamDto].*);
    dtos
  }
  def getDtosByAlgorithmParam_guid(colValue : Long) : List[VAlgorithmScheduleParamDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleParamDto] = SQL("select * from vAlgorithmScheduleParam where algorithmParam_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleParamDto].*);
    dtos
  }
  def getDtosByAlgorithmParam_insertedRowDate(colValue : java.util.Date) : List[VAlgorithmScheduleParamDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleParamDto] = SQL("select * from vAlgorithmScheduleParam where algorithmParam_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleParamDto].*);
    dtos
  }
  def getDtosByAlgorithmParam_lastUpdatedDate(colValue : java.util.Date) : List[VAlgorithmScheduleParamDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleParamDto] = SQL("select * from vAlgorithmScheduleParam where algorithmParam_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleParamDto].*);
    dtos
  }
  def getDtosByAlgorithmParam_algorithmParamName(colValue : String) : List[VAlgorithmScheduleParamDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleParamDto] = SQL("select * from vAlgorithmScheduleParam where algorithmParam_algorithmParamName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleParamDto].*);
    dtos
  }
  def getDtosByAlgorithmParam_algorithmParamDescription(colValue : String) : List[VAlgorithmScheduleParamDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleParamDto] = SQL("select * from vAlgorithmScheduleParam where algorithmParam_algorithmParamDescription = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleParamDto].*);
    dtos
  }
  def getDtosByAlgorithmParam_algorithmParamType(colValue : String) : List[VAlgorithmScheduleParamDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleParamDto] = SQL("select * from vAlgorithmScheduleParam where algorithmParam_algorithmParamType = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleParamDto].*);
    dtos
  }
  def getDtosByAlgorithmSchedule_algorithmScheduleId(colValue : Long) : List[VAlgorithmScheduleParamDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleParamDto] = SQL("select * from vAlgorithmScheduleParam where algorithmSchedule_algorithmScheduleId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleParamDto].*);
    dtos
  }
  def getDtosByAlgorithmSchedule_guid(colValue : Long) : List[VAlgorithmScheduleParamDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleParamDto] = SQL("select * from vAlgorithmScheduleParam where algorithmSchedule_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleParamDto].*);
    dtos
  }
  def getDtosByAlgorithmSchedule_algorithmImplementationId(colValue : Long) : List[VAlgorithmScheduleParamDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleParamDto] = SQL("select * from vAlgorithmScheduleParam where algorithmSchedule_algorithmImplementationId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleParamDto].*);
    dtos
  }
  def getDtosByAlgorithmSchedule_algorithmScheduleTypeId(colValue : Long) : List[VAlgorithmScheduleParamDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleParamDto] = SQL("select * from vAlgorithmScheduleParam where algorithmSchedule_algorithmScheduleTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleParamDto].*);
    dtos
  }
  def getDtosByAlgorithmSchedule_algorithmScheduleName(colValue : String) : List[VAlgorithmScheduleParamDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleParamDto] = SQL("select * from vAlgorithmScheduleParam where algorithmSchedule_algorithmScheduleName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleParamDto].*);
    dtos
  }
  def getDtosByAlgorithmSchedule_isScheduled(colValue : Int) : List[VAlgorithmScheduleParamDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleParamDto] = SQL("select * from vAlgorithmScheduleParam where algorithmSchedule_isScheduled = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleParamDto].*);
    dtos
  }
  def getDtosByAlgorithmSchedule_insertedRowDate(colValue : java.util.Date) : List[VAlgorithmScheduleParamDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleParamDto] = SQL("select * from vAlgorithmScheduleParam where algorithmSchedule_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleParamDto].*);
    dtos
  }
  def getDtosByAlgorithmSchedule_lastUpdatedDate(colValue : java.util.Date) : List[VAlgorithmScheduleParamDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleParamDto] = SQL("select * from vAlgorithmScheduleParam where algorithmSchedule_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleParamDto].*);
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
    val dtos : VAlgorithmScheduleViewDto= SQL("select * from vAlgorithmScheduleView order by insertedRowDate asc ").as(anorm.Macro.namedParser[VAlgorithmScheduleViewDto].*).head;
    dtos
  }
  def getVAlgorithmScheduleViewLast() : VAlgorithmScheduleViewDto = {
    implicit val connection = getConnection();
    val dtos : VAlgorithmScheduleViewDto= SQL("select * from vAlgorithmScheduleView order by insertedRowDate desc ").as(anorm.Macro.namedParser[VAlgorithmScheduleViewDto].*).head;
    dtos
  }
  def getVAlgorithmScheduleViewByGuid(guid : Long) : VAlgorithmScheduleViewDto = {
    implicit val connection = getConnection();
    val dtos : VAlgorithmScheduleViewDto= SQL("select * from vAlgorithmScheduleView where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VAlgorithmScheduleViewDto].single);
    dtos
  }
  def getDtosByAlgorithmScheduleViewId(colValue : Long) : List[VAlgorithmScheduleViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleViewDto] = SQL("select * from vAlgorithmScheduleView where algorithmScheduleViewId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleViewDto].*);
    dtos
  }
  def getDtosByGuid(colValue : Long) : List[VAlgorithmScheduleViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleViewDto] = SQL("select * from vAlgorithmScheduleView where guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleViewDto].*);
    dtos
  }
  def getDtosByAlgorithmScheduleViewTypeId(colValue : Long) : List[VAlgorithmScheduleViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleViewDto] = SQL("select * from vAlgorithmScheduleView where algorithmScheduleViewTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleViewDto].*);
    dtos
  }
  def getDtosByAlgorithmScheduleId(colValue : Long) : List[VAlgorithmScheduleViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleViewDto] = SQL("select * from vAlgorithmScheduleView where algorithmScheduleId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleViewDto].*);
    dtos
  }
  def getDtosBySourceViewId(colValue : Long) : List[VAlgorithmScheduleViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleViewDto] = SQL("select * from vAlgorithmScheduleView where sourceViewId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleViewDto].*);
    dtos
  }
  def getDtosByInsertedRowDate(colValue : java.util.Date) : List[VAlgorithmScheduleViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleViewDto] = SQL("select * from vAlgorithmScheduleView where insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleViewDto].*);
    dtos
  }
  def getDtosByLastUpdatedDate(colValue : java.util.Date) : List[VAlgorithmScheduleViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleViewDto] = SQL("select * from vAlgorithmScheduleView where lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleViewDto].*);
    dtos
  }
  def getDtosByJoinOnDefinition(colValue : String) : List[VAlgorithmScheduleViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleViewDto] = SQL("select * from vAlgorithmScheduleView where joinOnDefinition = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleViewDto].*);
    dtos
  }
  def getDtosByAlgorithmSchedule_algorithmScheduleId(colValue : Long) : List[VAlgorithmScheduleViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleViewDto] = SQL("select * from vAlgorithmScheduleView where algorithmSchedule_algorithmScheduleId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleViewDto].*);
    dtos
  }
  def getDtosByAlgorithmSchedule_guid(colValue : Long) : List[VAlgorithmScheduleViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleViewDto] = SQL("select * from vAlgorithmScheduleView where algorithmSchedule_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleViewDto].*);
    dtos
  }
  def getDtosByAlgorithmSchedule_algorithmImplementationId(colValue : Long) : List[VAlgorithmScheduleViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleViewDto] = SQL("select * from vAlgorithmScheduleView where algorithmSchedule_algorithmImplementationId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleViewDto].*);
    dtos
  }
  def getDtosByAlgorithmSchedule_algorithmScheduleTypeId(colValue : Long) : List[VAlgorithmScheduleViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleViewDto] = SQL("select * from vAlgorithmScheduleView where algorithmSchedule_algorithmScheduleTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleViewDto].*);
    dtos
  }
  def getDtosByAlgorithmSchedule_algorithmScheduleName(colValue : String) : List[VAlgorithmScheduleViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleViewDto] = SQL("select * from vAlgorithmScheduleView where algorithmSchedule_algorithmScheduleName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleViewDto].*);
    dtos
  }
  def getDtosByAlgorithmSchedule_isScheduled(colValue : Int) : List[VAlgorithmScheduleViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleViewDto] = SQL("select * from vAlgorithmScheduleView where algorithmSchedule_isScheduled = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleViewDto].*);
    dtos
  }
  def getDtosByAlgorithmSchedule_insertedRowDate(colValue : java.util.Date) : List[VAlgorithmScheduleViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleViewDto] = SQL("select * from vAlgorithmScheduleView where algorithmSchedule_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleViewDto].*);
    dtos
  }
  def getDtosByAlgorithmSchedule_lastUpdatedDate(colValue : java.util.Date) : List[VAlgorithmScheduleViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleViewDto] = SQL("select * from vAlgorithmScheduleView where algorithmSchedule_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleViewDto].*);
    dtos
  }
  def getDtosByAlgorithmScheduleViewType_algorithmScheduleViewTypeId(colValue : Long) : List[VAlgorithmScheduleViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleViewDto] = SQL("select * from vAlgorithmScheduleView where algorithmScheduleViewType_algorithmScheduleViewTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleViewDto].*);
    dtos
  }
  def getDtosByAlgorithmScheduleViewType_guid(colValue : Long) : List[VAlgorithmScheduleViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleViewDto] = SQL("select * from vAlgorithmScheduleView where algorithmScheduleViewType_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleViewDto].*);
    dtos
  }
  def getDtosByAlgorithmScheduleViewType_algorithmScheduleViewTypeName(colValue : String) : List[VAlgorithmScheduleViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleViewDto] = SQL("select * from vAlgorithmScheduleView where algorithmScheduleViewType_algorithmScheduleViewTypeName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleViewDto].*);
    dtos
  }
  def getDtosByAlgorithmScheduleViewType_insertedRowDate(colValue : java.util.Date) : List[VAlgorithmScheduleViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleViewDto] = SQL("select * from vAlgorithmScheduleView where algorithmScheduleViewType_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleViewDto].*);
    dtos
  }
  def getDtosByAlgorithmScheduleViewType_lastUpdatedDate(colValue : java.util.Date) : List[VAlgorithmScheduleViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleViewDto] = SQL("select * from vAlgorithmScheduleView where algorithmScheduleViewType_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleViewDto].*);
    dtos
  }
  def getDtosBySourceView_sourceViewId(colValue : Long) : List[VAlgorithmScheduleViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleViewDto] = SQL("select * from vAlgorithmScheduleView where sourceView_sourceViewId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleViewDto].*);
    dtos
  }
  def getDtosBySourceView_guid(colValue : Long) : List[VAlgorithmScheduleViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleViewDto] = SQL("select * from vAlgorithmScheduleView where sourceView_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleViewDto].*);
    dtos
  }
  def getDtosBySourceView_sourceInstanceId(colValue : Long) : List[VAlgorithmScheduleViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleViewDto] = SQL("select * from vAlgorithmScheduleView where sourceView_sourceInstanceId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleViewDto].*);
    dtos
  }
  def getDtosBySourceView_sourceViewTypeId(colValue : Long) : List[VAlgorithmScheduleViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleViewDto] = SQL("select * from vAlgorithmScheduleView where sourceView_sourceViewTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleViewDto].*);
    dtos
  }
  def getDtosBySourceView_sourceViewName(colValue : String) : List[VAlgorithmScheduleViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleViewDto] = SQL("select * from vAlgorithmScheduleView where sourceView_sourceViewName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleViewDto].*);
    dtos
  }
  def getDtosBySourceView_sourceViewDefinition(colValue : String) : List[VAlgorithmScheduleViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleViewDto] = SQL("select * from vAlgorithmScheduleView where sourceView_sourceViewDefinition = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleViewDto].*);
    dtos
  }
  def getDtosBySourceView_insertedRowDate(colValue : java.util.Date) : List[VAlgorithmScheduleViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleViewDto] = SQL("select * from vAlgorithmScheduleView where sourceView_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleViewDto].*);
    dtos
  }
  def getDtosBySourceView_lastUpdatedDate(colValue : java.util.Date) : List[VAlgorithmScheduleViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmScheduleViewDto] = SQL("select * from vAlgorithmScheduleView where sourceView_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmScheduleViewDto].*);
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
    val dtos : VAlgorithmTypeColumnTypeDto= SQL("select * from vAlgorithmTypeColumnType order by insertedRowDate asc ").as(anorm.Macro.namedParser[VAlgorithmTypeColumnTypeDto].*).head;
    dtos
  }
  def getVAlgorithmTypeColumnTypeLast() : VAlgorithmTypeColumnTypeDto = {
    implicit val connection = getConnection();
    val dtos : VAlgorithmTypeColumnTypeDto= SQL("select * from vAlgorithmTypeColumnType order by insertedRowDate desc ").as(anorm.Macro.namedParser[VAlgorithmTypeColumnTypeDto].*).head;
    dtos
  }
  def getVAlgorithmTypeColumnTypeByGuid(guid : Long) : VAlgorithmTypeColumnTypeDto = {
    implicit val connection = getConnection();
    val dtos : VAlgorithmTypeColumnTypeDto= SQL("select * from vAlgorithmTypeColumnType where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VAlgorithmTypeColumnTypeDto].single);
    dtos
  }
  def getDtosByAlgorithmTypeColumnTypeId(colValue : Long) : List[VAlgorithmTypeColumnTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmTypeColumnTypeDto] = SQL("select * from vAlgorithmTypeColumnType where algorithmTypeColumnTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmTypeColumnTypeDto].*);
    dtos
  }
  def getDtosByAlgorithmTypeVersionId(colValue : Long) : List[VAlgorithmTypeColumnTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmTypeColumnTypeDto] = SQL("select * from vAlgorithmTypeColumnType where algorithmTypeVersionId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmTypeColumnTypeDto].*);
    dtos
  }
  def getDtosByAlgorithmColumnTypeId(colValue : Long) : List[VAlgorithmTypeColumnTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmTypeColumnTypeDto] = SQL("select * from vAlgorithmTypeColumnType where algorithmColumnTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmTypeColumnTypeDto].*);
    dtos
  }
  def getDtosByAllowMultiple(colValue : Int) : List[VAlgorithmTypeColumnTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmTypeColumnTypeDto] = SQL("select * from vAlgorithmTypeColumnType where allowMultiple = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmTypeColumnTypeDto].*);
    dtos
  }
  def getDtosByAllowEmpty(colValue : Int) : List[VAlgorithmTypeColumnTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmTypeColumnTypeDto] = SQL("select * from vAlgorithmTypeColumnType where allowEmpty = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmTypeColumnTypeDto].*);
    dtos
  }
  def getDtosByInsertedRowDate(colValue : java.util.Date) : List[VAlgorithmTypeColumnTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmTypeColumnTypeDto] = SQL("select * from vAlgorithmTypeColumnType where insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmTypeColumnTypeDto].*);
    dtos
  }
  def getDtosByLastUpdatedDate(colValue : java.util.Date) : List[VAlgorithmTypeColumnTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmTypeColumnTypeDto] = SQL("select * from vAlgorithmTypeColumnType where lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmTypeColumnTypeDto].*);
    dtos
  }
  def getDtosByGuid(colValue : Long) : List[VAlgorithmTypeColumnTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmTypeColumnTypeDto] = SQL("select * from vAlgorithmTypeColumnType where guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmTypeColumnTypeDto].*);
    dtos
  }
  def getDtosByAlgorithmColumnType_algorithmColumnTypeId(colValue : Long) : List[VAlgorithmTypeColumnTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmTypeColumnTypeDto] = SQL("select * from vAlgorithmTypeColumnType where algorithmColumnType_algorithmColumnTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmTypeColumnTypeDto].*);
    dtos
  }
  def getDtosByAlgorithmColumnType_algorithmColumnTypeName(colValue : String) : List[VAlgorithmTypeColumnTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmTypeColumnTypeDto] = SQL("select * from vAlgorithmTypeColumnType where algorithmColumnType_algorithmColumnTypeName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmTypeColumnTypeDto].*);
    dtos
  }
  def getDtosByAlgorithmColumnType_algorithmColumnTypeDescription(colValue : String) : List[VAlgorithmTypeColumnTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmTypeColumnTypeDto] = SQL("select * from vAlgorithmTypeColumnType where algorithmColumnType_algorithmColumnTypeDescription = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmTypeColumnTypeDto].*);
    dtos
  }
  def getDtosByAlgorithmColumnType_insertedRowDate(colValue : java.util.Date) : List[VAlgorithmTypeColumnTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmTypeColumnTypeDto] = SQL("select * from vAlgorithmTypeColumnType where algorithmColumnType_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmTypeColumnTypeDto].*);
    dtos
  }
  def getDtosByAlgorithmColumnType_lastUpdatedDate(colValue : java.util.Date) : List[VAlgorithmTypeColumnTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmTypeColumnTypeDto] = SQL("select * from vAlgorithmTypeColumnType where algorithmColumnType_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmTypeColumnTypeDto].*);
    dtos
  }
  def getDtosByAlgorithmColumnType_guid(colValue : Long) : List[VAlgorithmTypeColumnTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmTypeColumnTypeDto] = SQL("select * from vAlgorithmTypeColumnType where algorithmColumnType_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmTypeColumnTypeDto].*);
    dtos
  }
  def getDtosByAlgorithmTypeVersion_algorithmTypeVersionId(colValue : Long) : List[VAlgorithmTypeColumnTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmTypeColumnTypeDto] = SQL("select * from vAlgorithmTypeColumnType where algorithmTypeVersion_algorithmTypeVersionId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmTypeColumnTypeDto].*);
    dtos
  }
  def getDtosByAlgorithmTypeVersion_guid(colValue : Long) : List[VAlgorithmTypeColumnTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmTypeColumnTypeDto] = SQL("select * from vAlgorithmTypeColumnType where algorithmTypeVersion_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmTypeColumnTypeDto].*);
    dtos
  }
  def getDtosByAlgorithmTypeVersion_algorithmTypeId(colValue : Long) : List[VAlgorithmTypeColumnTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmTypeColumnTypeDto] = SQL("select * from vAlgorithmTypeColumnType where algorithmTypeVersion_algorithmTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmTypeColumnTypeDto].*);
    dtos
  }
  def getDtosByAlgorithmTypeVersion_algorithmTypeVersionName(colValue : String) : List[VAlgorithmTypeColumnTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmTypeColumnTypeDto] = SQL("select * from vAlgorithmTypeColumnType where algorithmTypeVersion_algorithmTypeVersionName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmTypeColumnTypeDto].*);
    dtos
  }
  def getDtosByAlgorithmTypeVersion_insertedRowDate(colValue : java.util.Date) : List[VAlgorithmTypeColumnTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmTypeColumnTypeDto] = SQL("select * from vAlgorithmTypeColumnType where algorithmTypeVersion_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmTypeColumnTypeDto].*);
    dtos
  }
  def getDtosByAlgorithmTypeVersion_lastUpdatedDate(colValue : java.util.Date) : List[VAlgorithmTypeColumnTypeDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmTypeColumnTypeDto] = SQL("select * from vAlgorithmTypeColumnType where algorithmTypeVersion_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmTypeColumnTypeDto].*);
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
    val dtos : VAlgorithmTypeVersionDto= SQL("select * from vAlgorithmTypeVersion order by insertedRowDate asc ").as(anorm.Macro.namedParser[VAlgorithmTypeVersionDto].*).head;
    dtos
  }
  def getVAlgorithmTypeVersionLast() : VAlgorithmTypeVersionDto = {
    implicit val connection = getConnection();
    val dtos : VAlgorithmTypeVersionDto= SQL("select * from vAlgorithmTypeVersion order by insertedRowDate desc ").as(anorm.Macro.namedParser[VAlgorithmTypeVersionDto].*).head;
    dtos
  }
  def getVAlgorithmTypeVersionByGuid(guid : Long) : VAlgorithmTypeVersionDto = {
    implicit val connection = getConnection();
    val dtos : VAlgorithmTypeVersionDto= SQL("select * from vAlgorithmTypeVersion where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VAlgorithmTypeVersionDto].single);
    dtos
  }
  def getDtosByAlgorithmTypeVersionId(colValue : Long) : List[VAlgorithmTypeVersionDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmTypeVersionDto] = SQL("select * from vAlgorithmTypeVersion where algorithmTypeVersionId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmTypeVersionDto].*);
    dtos
  }
  def getDtosByGuid(colValue : Long) : List[VAlgorithmTypeVersionDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmTypeVersionDto] = SQL("select * from vAlgorithmTypeVersion where guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmTypeVersionDto].*);
    dtos
  }
  def getDtosByAlgorithmTypeId(colValue : Long) : List[VAlgorithmTypeVersionDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmTypeVersionDto] = SQL("select * from vAlgorithmTypeVersion where algorithmTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmTypeVersionDto].*);
    dtos
  }
  def getDtosByAlgorithmTypeVersionName(colValue : String) : List[VAlgorithmTypeVersionDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmTypeVersionDto] = SQL("select * from vAlgorithmTypeVersion where algorithmTypeVersionName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmTypeVersionDto].*);
    dtos
  }
  def getDtosByInsertedRowDate(colValue : java.util.Date) : List[VAlgorithmTypeVersionDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmTypeVersionDto] = SQL("select * from vAlgorithmTypeVersion where insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmTypeVersionDto].*);
    dtos
  }
  def getDtosByLastUpdatedDate(colValue : java.util.Date) : List[VAlgorithmTypeVersionDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmTypeVersionDto] = SQL("select * from vAlgorithmTypeVersion where lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmTypeVersionDto].*);
    dtos
  }
  def getDtosByAlgorithmType_algorithmTypeId(colValue : Long) : List[VAlgorithmTypeVersionDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmTypeVersionDto] = SQL("select * from vAlgorithmTypeVersion where algorithmType_algorithmTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmTypeVersionDto].*);
    dtos
  }
  def getDtosByAlgorithmType_guid(colValue : Long) : List[VAlgorithmTypeVersionDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmTypeVersionDto] = SQL("select * from vAlgorithmTypeVersion where algorithmType_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmTypeVersionDto].*);
    dtos
  }
  def getDtosByAlgorithmType_algorithmTypeName(colValue : String) : List[VAlgorithmTypeVersionDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmTypeVersionDto] = SQL("select * from vAlgorithmTypeVersion where algorithmType_algorithmTypeName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmTypeVersionDto].*);
    dtos
  }
  def getDtosByAlgorithmType_algorithmTypeDescription(colValue : String) : List[VAlgorithmTypeVersionDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmTypeVersionDto] = SQL("select * from vAlgorithmTypeVersion where algorithmType_algorithmTypeDescription = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmTypeVersionDto].*);
    dtos
  }
  def getDtosByAlgorithmType_insertedRowDate(colValue : java.util.Date) : List[VAlgorithmTypeVersionDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmTypeVersionDto] = SQL("select * from vAlgorithmTypeVersion where algorithmType_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmTypeVersionDto].*);
    dtos
  }
  def getDtosByAlgorithmType_lastUpdatedDate(colValue : java.util.Date) : List[VAlgorithmTypeVersionDto] = {
    implicit val connection = getConnection();
    val dtos : List[VAlgorithmTypeVersionDto] = SQL("select * from vAlgorithmTypeVersion where algorithmType_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VAlgorithmTypeVersionDto].*);
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
    val dtos : VExecutorInstanceDto= SQL("select * from vExecutorInstance order by insertedRowDate asc ").as(anorm.Macro.namedParser[VExecutorInstanceDto].*).head;
    dtos
  }
  def getVExecutorInstanceLast() : VExecutorInstanceDto = {
    implicit val connection = getConnection();
    val dtos : VExecutorInstanceDto= SQL("select * from vExecutorInstance order by insertedRowDate desc ").as(anorm.Macro.namedParser[VExecutorInstanceDto].*).head;
    dtos
  }
  def getVExecutorInstanceByGuid(guid : Long) : VExecutorInstanceDto = {
    implicit val connection = getConnection();
    val dtos : VExecutorInstanceDto= SQL("select * from vExecutorInstance where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VExecutorInstanceDto].single);
    dtos
  }
  def getDtosByExecutorInstanceId(colValue : Long) : List[VExecutorInstanceDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorInstanceDto] = SQL("select * from vExecutorInstance where executorInstanceId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceDto].*);
    dtos
  }
  def getDtosByGuid(colValue : Long) : List[VExecutorInstanceDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorInstanceDto] = SQL("select * from vExecutorInstance where guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceDto].*);
    dtos
  }
  def getDtosByExecutorTypeId(colValue : Long) : List[VExecutorInstanceDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorInstanceDto] = SQL("select * from vExecutorInstance where executorTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceDto].*);
    dtos
  }
  def getDtosByExecutorHostId(colValue : Long) : List[VExecutorInstanceDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorInstanceDto] = SQL("select * from vExecutorInstance where executorHostId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceDto].*);
    dtos
  }
  def getDtosByExecutorInstanceName(colValue : String) : List[VExecutorInstanceDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorInstanceDto] = SQL("select * from vExecutorInstance where executorInstanceName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceDto].*);
    dtos
  }
  def getDtosByIsRunning(colValue : Int) : List[VExecutorInstanceDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorInstanceDto] = SQL("select * from vExecutorInstance where isRunning = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceDto].*);
    dtos
  }
  def getDtosByIsFinished(colValue : Int) : List[VExecutorInstanceDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorInstanceDto] = SQL("select * from vExecutorInstance where isFinished = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceDto].*);
    dtos
  }
  def getDtosByPortNumber(colValue : Int) : List[VExecutorInstanceDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorInstanceDto] = SQL("select * from vExecutorInstance where portNumber = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceDto].*);
    dtos
  }
  def getDtosByInsertedRowDate(colValue : java.util.Date) : List[VExecutorInstanceDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorInstanceDto] = SQL("select * from vExecutorInstance where insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceDto].*);
    dtos
  }
  def getDtosByLastUpdatedDate(colValue : java.util.Date) : List[VExecutorInstanceDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorInstanceDto] = SQL("select * from vExecutorInstance where lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceDto].*);
    dtos
  }
  def getDtosByEndDate(colValue : java.util.Date) : List[VExecutorInstanceDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorInstanceDto] = SQL("select * from vExecutorInstance where endDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceDto].*);
    dtos
  }
  def getDtosByExecutorHost_executorHostId(colValue : Long) : List[VExecutorInstanceDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorInstanceDto] = SQL("select * from vExecutorInstance where executorHost_executorHostId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceDto].*);
    dtos
  }
  def getDtosByExecutorHost_guid(colValue : Long) : List[VExecutorInstanceDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorInstanceDto] = SQL("select * from vExecutorInstance where executorHost_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceDto].*);
    dtos
  }
  def getDtosByExecutorHost_insertedRowDate(colValue : java.util.Date) : List[VExecutorInstanceDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorInstanceDto] = SQL("select * from vExecutorInstance where executorHost_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceDto].*);
    dtos
  }
  def getDtosByExecutorHost_lastUpdatedDate(colValue : java.util.Date) : List[VExecutorInstanceDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorInstanceDto] = SQL("select * from vExecutorInstance where executorHost_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceDto].*);
    dtos
  }
  def getDtosByExecutorHost_hostName(colValue : String) : List[VExecutorInstanceDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorInstanceDto] = SQL("select * from vExecutorInstance where executorHost_hostName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceDto].*);
    dtos
  }
  def getDtosByExecutorHost_hostIp(colValue : String) : List[VExecutorInstanceDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorInstanceDto] = SQL("select * from vExecutorInstance where executorHost_hostIp = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceDto].*);
    dtos
  }
  def getDtosByExecutorHost_hostDomain(colValue : String) : List[VExecutorInstanceDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorInstanceDto] = SQL("select * from vExecutorInstance where executorHost_hostDomain = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceDto].*);
    dtos
  }
  def getDtosByExecutorHost_hostOsType(colValue : String) : List[VExecutorInstanceDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorInstanceDto] = SQL("select * from vExecutorInstance where executorHost_hostOsType = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceDto].*);
    dtos
  }
  def getDtosByExecutorHost_hostOsVersion(colValue : String) : List[VExecutorInstanceDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorInstanceDto] = SQL("select * from vExecutorInstance where executorHost_hostOsVersion = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceDto].*);
    dtos
  }
  def getDtosByExecutorHost_isWorking(colValue : Int) : List[VExecutorInstanceDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorInstanceDto] = SQL("select * from vExecutorInstance where executorHost_isWorking = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceDto].*);
    dtos
  }
  def getDtosByExecutorType_executorTypeId(colValue : Long) : List[VExecutorInstanceDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorInstanceDto] = SQL("select * from vExecutorInstance where executorType_executorTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceDto].*);
    dtos
  }
  def getDtosByExecutorType_guid(colValue : Long) : List[VExecutorInstanceDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorInstanceDto] = SQL("select * from vExecutorInstance where executorType_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceDto].*);
    dtos
  }
  def getDtosByExecutorType_insertedRowDate(colValue : java.util.Date) : List[VExecutorInstanceDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorInstanceDto] = SQL("select * from vExecutorInstance where executorType_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceDto].*);
    dtos
  }
  def getDtosByExecutorType_lastUpdatedDate(colValue : java.util.Date) : List[VExecutorInstanceDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorInstanceDto] = SQL("select * from vExecutorInstance where executorType_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceDto].*);
    dtos
  }
  def getDtosByExecutorType_executorTypeName(colValue : String) : List[VExecutorInstanceDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorInstanceDto] = SQL("select * from vExecutorInstance where executorType_executorTypeName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceDto].*);
    dtos
  }
  def getDtosByExecutorType_executorTypeClass(colValue : String) : List[VExecutorInstanceDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorInstanceDto] = SQL("select * from vExecutorInstance where executorType_executorTypeClass = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorInstanceDto].*);
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
    val dtos : VExecutorRestDto= SQL("select * from vExecutorRest order by insertedRowDate asc ").as(anorm.Macro.namedParser[VExecutorRestDto].*).head;
    dtos
  }
  def getVExecutorRestLast() : VExecutorRestDto = {
    implicit val connection = getConnection();
    val dtos : VExecutorRestDto= SQL("select * from vExecutorRest order by insertedRowDate desc ").as(anorm.Macro.namedParser[VExecutorRestDto].*).head;
    dtos
  }
  def getVExecutorRestByGuid(guid : Long) : VExecutorRestDto = {
    implicit val connection = getConnection();
    val dtos : VExecutorRestDto= SQL("select * from vExecutorRest where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VExecutorRestDto].single);
    dtos
  }
  def getDtosByExecutorRestId(colValue : Long) : List[VExecutorRestDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorRestDto] = SQL("select * from vExecutorRest where executorRestId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorRestDto].*);
    dtos
  }
  def getDtosByGuid(colValue : Long) : List[VExecutorRestDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorRestDto] = SQL("select * from vExecutorRest where guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorRestDto].*);
    dtos
  }
  def getDtosByExecutorHostId(colValue : Long) : List[VExecutorRestDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorRestDto] = SQL("select * from vExecutorRest where executorHostId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorRestDto].*);
    dtos
  }
  def getDtosByInsertedRowDate(colValue : java.util.Date) : List[VExecutorRestDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorRestDto] = SQL("select * from vExecutorRest where insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorRestDto].*);
    dtos
  }
  def getDtosByLastUpdatedDate(colValue : java.util.Date) : List[VExecutorRestDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorRestDto] = SQL("select * from vExecutorRest where lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorRestDto].*);
    dtos
  }
  def getDtosByRestPort(colValue : Int) : List[VExecutorRestDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorRestDto] = SQL("select * from vExecutorRest where restPort = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorRestDto].*);
    dtos
  }
  def getDtosByRestVersion(colValue : String) : List[VExecutorRestDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorRestDto] = SQL("select * from vExecutorRest where restVersion = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorRestDto].*);
    dtos
  }
  def getDtosByRestStatus(colValue : String) : List[VExecutorRestDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorRestDto] = SQL("select * from vExecutorRest where restStatus = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorRestDto].*);
    dtos
  }
  def getDtosByExecutorHost_executorHostId(colValue : Long) : List[VExecutorRestDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorRestDto] = SQL("select * from vExecutorRest where executorHost_executorHostId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorRestDto].*);
    dtos
  }
  def getDtosByExecutorHost_guid(colValue : Long) : List[VExecutorRestDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorRestDto] = SQL("select * from vExecutorRest where executorHost_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorRestDto].*);
    dtos
  }
  def getDtosByExecutorHost_insertedRowDate(colValue : java.util.Date) : List[VExecutorRestDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorRestDto] = SQL("select * from vExecutorRest where executorHost_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorRestDto].*);
    dtos
  }
  def getDtosByExecutorHost_lastUpdatedDate(colValue : java.util.Date) : List[VExecutorRestDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorRestDto] = SQL("select * from vExecutorRest where executorHost_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorRestDto].*);
    dtos
  }
  def getDtosByExecutorHost_hostName(colValue : String) : List[VExecutorRestDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorRestDto] = SQL("select * from vExecutorRest where executorHost_hostName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorRestDto].*);
    dtos
  }
  def getDtosByExecutorHost_hostIp(colValue : String) : List[VExecutorRestDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorRestDto] = SQL("select * from vExecutorRest where executorHost_hostIp = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorRestDto].*);
    dtos
  }
  def getDtosByExecutorHost_hostDomain(colValue : String) : List[VExecutorRestDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorRestDto] = SQL("select * from vExecutorRest where executorHost_hostDomain = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorRestDto].*);
    dtos
  }
  def getDtosByExecutorHost_hostOsType(colValue : String) : List[VExecutorRestDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorRestDto] = SQL("select * from vExecutorRest where executorHost_hostOsType = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorRestDto].*);
    dtos
  }
  def getDtosByExecutorHost_hostOsVersion(colValue : String) : List[VExecutorRestDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorRestDto] = SQL("select * from vExecutorRest where executorHost_hostOsVersion = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorRestDto].*);
    dtos
  }
  def getDtosByExecutorHost_isWorking(colValue : Int) : List[VExecutorRestDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorRestDto] = SQL("select * from vExecutorRest where executorHost_isWorking = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorRestDto].*);
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
    val dtos : VExecutorRestCallDto= SQL("select * from vExecutorRestCall order by insertedRowDate asc ").as(anorm.Macro.namedParser[VExecutorRestCallDto].*).head;
    dtos
  }
  def getVExecutorRestCallLast() : VExecutorRestCallDto = {
    implicit val connection = getConnection();
    val dtos : VExecutorRestCallDto= SQL("select * from vExecutorRestCall order by insertedRowDate desc ").as(anorm.Macro.namedParser[VExecutorRestCallDto].*).head;
    dtos
  }
  def getVExecutorRestCallByGuid(guid : Long) : VExecutorRestCallDto = {
    implicit val connection = getConnection();
    val dtos : VExecutorRestCallDto= SQL("select * from vExecutorRestCall where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VExecutorRestCallDto].single);
    dtos
  }
  def getDtosByExecutorRestCallId(colValue : Long) : List[VExecutorRestCallDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorRestCallDto] = SQL("select * from vExecutorRestCall where executorRestCallId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorRestCallDto].*);
    dtos
  }
  def getDtosByGuid(colValue : Long) : List[VExecutorRestCallDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorRestCallDto] = SQL("select * from vExecutorRestCall where guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorRestCallDto].*);
    dtos
  }
  def getDtosByInsertedRowDate(colValue : java.util.Date) : List[VExecutorRestCallDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorRestCallDto] = SQL("select * from vExecutorRestCall where insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorRestCallDto].*);
    dtos
  }
  def getDtosByLastUpdatedDate(colValue : java.util.Date) : List[VExecutorRestCallDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorRestCallDto] = SQL("select * from vExecutorRestCall where lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorRestCallDto].*);
    dtos
  }
  def getDtosByExecutorHostId(colValue : Long) : List[VExecutorRestCallDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorRestCallDto] = SQL("select * from vExecutorRestCall where executorHostId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorRestCallDto].*);
    dtos
  }
  def getDtosByExecutorRestId(colValue : Long) : List[VExecutorRestCallDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorRestCallDto] = SQL("select * from vExecutorRestCall where executorRestId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorRestCallDto].*);
    dtos
  }
  def getDtosByRequestMethod(colValue : String) : List[VExecutorRestCallDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorRestCallDto] = SQL("select * from vExecutorRestCall where requestMethod = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorRestCallDto].*);
    dtos
  }
  def getDtosByRequestHeader(colValue : String) : List[VExecutorRestCallDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorRestCallDto] = SQL("select * from vExecutorRestCall where requestHeader = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorRestCallDto].*);
    dtos
  }
  def getDtosByRequestBody(colValue : String) : List[VExecutorRestCallDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorRestCallDto] = SQL("select * from vExecutorRestCall where requestBody = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorRestCallDto].*);
    dtos
  }
  def getDtosByResponseBody(colValue : String) : List[VExecutorRestCallDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorRestCallDto] = SQL("select * from vExecutorRestCall where responseBody = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorRestCallDto].*);
    dtos
  }
  def getDtosByExecutorHost_executorHostId(colValue : Long) : List[VExecutorRestCallDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorRestCallDto] = SQL("select * from vExecutorRestCall where executorHost_executorHostId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorRestCallDto].*);
    dtos
  }
  def getDtosByExecutorHost_guid(colValue : Long) : List[VExecutorRestCallDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorRestCallDto] = SQL("select * from vExecutorRestCall where executorHost_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorRestCallDto].*);
    dtos
  }
  def getDtosByExecutorHost_insertedRowDate(colValue : java.util.Date) : List[VExecutorRestCallDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorRestCallDto] = SQL("select * from vExecutorRestCall where executorHost_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorRestCallDto].*);
    dtos
  }
  def getDtosByExecutorHost_lastUpdatedDate(colValue : java.util.Date) : List[VExecutorRestCallDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorRestCallDto] = SQL("select * from vExecutorRestCall where executorHost_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorRestCallDto].*);
    dtos
  }
  def getDtosByExecutorHost_hostName(colValue : String) : List[VExecutorRestCallDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorRestCallDto] = SQL("select * from vExecutorRestCall where executorHost_hostName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorRestCallDto].*);
    dtos
  }
  def getDtosByExecutorHost_hostIp(colValue : String) : List[VExecutorRestCallDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorRestCallDto] = SQL("select * from vExecutorRestCall where executorHost_hostIp = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorRestCallDto].*);
    dtos
  }
  def getDtosByExecutorHost_hostDomain(colValue : String) : List[VExecutorRestCallDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorRestCallDto] = SQL("select * from vExecutorRestCall where executorHost_hostDomain = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorRestCallDto].*);
    dtos
  }
  def getDtosByExecutorHost_hostOsType(colValue : String) : List[VExecutorRestCallDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorRestCallDto] = SQL("select * from vExecutorRestCall where executorHost_hostOsType = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorRestCallDto].*);
    dtos
  }
  def getDtosByExecutorHost_hostOsVersion(colValue : String) : List[VExecutorRestCallDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorRestCallDto] = SQL("select * from vExecutorRestCall where executorHost_hostOsVersion = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorRestCallDto].*);
    dtos
  }
  def getDtosByExecutorHost_isWorking(colValue : Int) : List[VExecutorRestCallDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorRestCallDto] = SQL("select * from vExecutorRestCall where executorHost_isWorking = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorRestCallDto].*);
    dtos
  }
  def getDtosByExecutorRest_executorRestId(colValue : Long) : List[VExecutorRestCallDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorRestCallDto] = SQL("select * from vExecutorRestCall where executorRest_executorRestId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorRestCallDto].*);
    dtos
  }
  def getDtosByExecutorRest_guid(colValue : Long) : List[VExecutorRestCallDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorRestCallDto] = SQL("select * from vExecutorRestCall where executorRest_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorRestCallDto].*);
    dtos
  }
  def getDtosByExecutorRest_executorHostId(colValue : Long) : List[VExecutorRestCallDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorRestCallDto] = SQL("select * from vExecutorRestCall where executorRest_executorHostId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorRestCallDto].*);
    dtos
  }
  def getDtosByExecutorRest_insertedRowDate(colValue : java.util.Date) : List[VExecutorRestCallDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorRestCallDto] = SQL("select * from vExecutorRestCall where executorRest_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorRestCallDto].*);
    dtos
  }
  def getDtosByExecutorRest_lastUpdatedDate(colValue : java.util.Date) : List[VExecutorRestCallDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorRestCallDto] = SQL("select * from vExecutorRestCall where executorRest_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorRestCallDto].*);
    dtos
  }
  def getDtosByExecutorRest_restPort(colValue : Int) : List[VExecutorRestCallDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorRestCallDto] = SQL("select * from vExecutorRestCall where executorRest_restPort = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorRestCallDto].*);
    dtos
  }
  def getDtosByExecutorRest_restVersion(colValue : String) : List[VExecutorRestCallDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorRestCallDto] = SQL("select * from vExecutorRestCall where executorRest_restVersion = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorRestCallDto].*);
    dtos
  }
  def getDtosByExecutorRest_restStatus(colValue : String) : List[VExecutorRestCallDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorRestCallDto] = SQL("select * from vExecutorRestCall where executorRest_restStatus = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorRestCallDto].*);
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
    val dtos : VExecutorStorageDto= SQL("select * from vExecutorStorage order by insertedRowDate asc ").as(anorm.Macro.namedParser[VExecutorStorageDto].*).head;
    dtos
  }
  def getVExecutorStorageLast() : VExecutorStorageDto = {
    implicit val connection = getConnection();
    val dtos : VExecutorStorageDto= SQL("select * from vExecutorStorage order by insertedRowDate desc ").as(anorm.Macro.namedParser[VExecutorStorageDto].*).head;
    dtos
  }
  def getVExecutorStorageByGuid(guid : Long) : VExecutorStorageDto = {
    implicit val connection = getConnection();
    val dtos : VExecutorStorageDto= SQL("select * from vExecutorStorage where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VExecutorStorageDto].single);
    dtos
  }
  def getDtosByExecutorStorageId(colValue : Long) : List[VExecutorStorageDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageDto] = SQL("select * from vExecutorStorage where executorStorageId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageDto].*);
    dtos
  }
  def getDtosByGuid(colValue : Long) : List[VExecutorStorageDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageDto] = SQL("select * from vExecutorStorage where guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageDto].*);
    dtos
  }
  def getDtosByExecutorHostId(colValue : Long) : List[VExecutorStorageDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageDto] = SQL("select * from vExecutorStorage where executorHostId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageDto].*);
    dtos
  }
  def getDtosByExecutorStorageTypeId(colValue : Long) : List[VExecutorStorageDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageDto] = SQL("select * from vExecutorStorage where executorStorageTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageDto].*);
    dtos
  }
  def getDtosByStorageDefinition(colValue : String) : List[VExecutorStorageDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageDto] = SQL("select * from vExecutorStorage where storageDefinition = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageDto].*);
    dtos
  }
  def getDtosByStorageBasePath(colValue : String) : List[VExecutorStorageDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageDto] = SQL("select * from vExecutorStorage where storageBasePath = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageDto].*);
    dtos
  }
  def getDtosByStorageFulllPath(colValue : String) : List[VExecutorStorageDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageDto] = SQL("select * from vExecutorStorage where storageFulllPath = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageDto].*);
    dtos
  }
  def getDtosByIsRunning(colValue : Int) : List[VExecutorStorageDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageDto] = SQL("select * from vExecutorStorage where isRunning = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageDto].*);
    dtos
  }
  def getDtosByPortNumber(colValue : Int) : List[VExecutorStorageDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageDto] = SQL("select * from vExecutorStorage where portNumber = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageDto].*);
    dtos
  }
  def getDtosByInsertedRowDate(colValue : java.util.Date) : List[VExecutorStorageDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageDto] = SQL("select * from vExecutorStorage where insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageDto].*);
    dtos
  }
  def getDtosByLastUpdatedDate(colValue : java.util.Date) : List[VExecutorStorageDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageDto] = SQL("select * from vExecutorStorage where lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageDto].*);
    dtos
  }
  def getDtosByExecutorStorageType_executorStorageTypeId(colValue : Long) : List[VExecutorStorageDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageDto] = SQL("select * from vExecutorStorage where executorStorageType_executorStorageTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageDto].*);
    dtos
  }
  def getDtosByExecutorStorageType_guid(colValue : Long) : List[VExecutorStorageDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageDto] = SQL("select * from vExecutorStorage where executorStorageType_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageDto].*);
    dtos
  }
  def getDtosByExecutorStorageType_insertedRowDate(colValue : java.util.Date) : List[VExecutorStorageDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageDto] = SQL("select * from vExecutorStorage where executorStorageType_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageDto].*);
    dtos
  }
  def getDtosByExecutorStorageType_lastUpdatedDate(colValue : java.util.Date) : List[VExecutorStorageDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageDto] = SQL("select * from vExecutorStorage where executorStorageType_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageDto].*);
    dtos
  }
  def getDtosByExecutorStorageType_executorStorageTypeName(colValue : String) : List[VExecutorStorageDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageDto] = SQL("select * from vExecutorStorage where executorStorageType_executorStorageTypeName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageDto].*);
    dtos
  }
  def getDtosByExecutorStorageType_executorStorageTypeClass(colValue : String) : List[VExecutorStorageDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageDto] = SQL("select * from vExecutorStorage where executorStorageType_executorStorageTypeClass = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageDto].*);
    dtos
  }
  def getDtosByExecutorHost_executorHostId(colValue : Long) : List[VExecutorStorageDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageDto] = SQL("select * from vExecutorStorage where executorHost_executorHostId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageDto].*);
    dtos
  }
  def getDtosByExecutorHost_guid(colValue : Long) : List[VExecutorStorageDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageDto] = SQL("select * from vExecutorStorage where executorHost_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageDto].*);
    dtos
  }
  def getDtosByExecutorHost_insertedRowDate(colValue : java.util.Date) : List[VExecutorStorageDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageDto] = SQL("select * from vExecutorStorage where executorHost_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageDto].*);
    dtos
  }
  def getDtosByExecutorHost_lastUpdatedDate(colValue : java.util.Date) : List[VExecutorStorageDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageDto] = SQL("select * from vExecutorStorage where executorHost_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageDto].*);
    dtos
  }
  def getDtosByExecutorHost_hostName(colValue : String) : List[VExecutorStorageDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageDto] = SQL("select * from vExecutorStorage where executorHost_hostName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageDto].*);
    dtos
  }
  def getDtosByExecutorHost_hostIp(colValue : String) : List[VExecutorStorageDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageDto] = SQL("select * from vExecutorStorage where executorHost_hostIp = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageDto].*);
    dtos
  }
  def getDtosByExecutorHost_hostDomain(colValue : String) : List[VExecutorStorageDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageDto] = SQL("select * from vExecutorStorage where executorHost_hostDomain = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageDto].*);
    dtos
  }
  def getDtosByExecutorHost_hostOsType(colValue : String) : List[VExecutorStorageDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageDto] = SQL("select * from vExecutorStorage where executorHost_hostOsType = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageDto].*);
    dtos
  }
  def getDtosByExecutorHost_hostOsVersion(colValue : String) : List[VExecutorStorageDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageDto] = SQL("select * from vExecutorStorage where executorHost_hostOsVersion = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageDto].*);
    dtos
  }
  def getDtosByExecutorHost_isWorking(colValue : Int) : List[VExecutorStorageDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageDto] = SQL("select * from vExecutorStorage where executorHost_isWorking = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageDto].*);
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
    val dtos : VExecutorStorageSnapshotDto= SQL("select * from vExecutorStorageSnapshot order by insertedRowDate asc ").as(anorm.Macro.namedParser[VExecutorStorageSnapshotDto].*).head;
    dtos
  }
  def getVExecutorStorageSnapshotLast() : VExecutorStorageSnapshotDto = {
    implicit val connection = getConnection();
    val dtos : VExecutorStorageSnapshotDto= SQL("select * from vExecutorStorageSnapshot order by insertedRowDate desc ").as(anorm.Macro.namedParser[VExecutorStorageSnapshotDto].*).head;
    dtos
  }
  def getVExecutorStorageSnapshotByGuid(guid : Long) : VExecutorStorageSnapshotDto = {
    implicit val connection = getConnection();
    val dtos : VExecutorStorageSnapshotDto= SQL("select * from vExecutorStorageSnapshot where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VExecutorStorageSnapshotDto].single);
    dtos
  }
  def getDtosByExecutorStorageSnapshotId(colValue : Long) : List[VExecutorStorageSnapshotDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageSnapshotDto] = SQL("select * from vExecutorStorageSnapshot where executorStorageSnapshotId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageSnapshotDto].*);
    dtos
  }
  def getDtosByExecutorInstanceId(colValue : Long) : List[VExecutorStorageSnapshotDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageSnapshotDto] = SQL("select * from vExecutorStorageSnapshot where executorInstanceId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageSnapshotDto].*);
    dtos
  }
  def getDtosByGuid(colValue : Long) : List[VExecutorStorageSnapshotDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageSnapshotDto] = SQL("select * from vExecutorStorageSnapshot where guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageSnapshotDto].*);
    dtos
  }
  def getDtosByInsertedRowDate(colValue : java.util.Date) : List[VExecutorStorageSnapshotDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageSnapshotDto] = SQL("select * from vExecutorStorageSnapshot where insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageSnapshotDto].*);
    dtos
  }
  def getDtosByLastUpdatedDate(colValue : java.util.Date) : List[VExecutorStorageSnapshotDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageSnapshotDto] = SQL("select * from vExecutorStorageSnapshot where lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageSnapshotDto].*);
    dtos
  }
  def getDtosByExecutorInstance_executorInstanceId(colValue : Long) : List[VExecutorStorageSnapshotDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageSnapshotDto] = SQL("select * from vExecutorStorageSnapshot where executorInstance_executorInstanceId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageSnapshotDto].*);
    dtos
  }
  def getDtosByExecutorInstance_guid(colValue : Long) : List[VExecutorStorageSnapshotDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageSnapshotDto] = SQL("select * from vExecutorStorageSnapshot where executorInstance_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageSnapshotDto].*);
    dtos
  }
  def getDtosByExecutorInstance_executorTypeId(colValue : Long) : List[VExecutorStorageSnapshotDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageSnapshotDto] = SQL("select * from vExecutorStorageSnapshot where executorInstance_executorTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageSnapshotDto].*);
    dtos
  }
  def getDtosByExecutorInstance_executorHostId(colValue : Long) : List[VExecutorStorageSnapshotDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageSnapshotDto] = SQL("select * from vExecutorStorageSnapshot where executorInstance_executorHostId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageSnapshotDto].*);
    dtos
  }
  def getDtosByExecutorInstance_executorInstanceName(colValue : String) : List[VExecutorStorageSnapshotDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageSnapshotDto] = SQL("select * from vExecutorStorageSnapshot where executorInstance_executorInstanceName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageSnapshotDto].*);
    dtos
  }
  def getDtosByExecutorInstance_isRunning(colValue : Int) : List[VExecutorStorageSnapshotDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageSnapshotDto] = SQL("select * from vExecutorStorageSnapshot where executorInstance_isRunning = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageSnapshotDto].*);
    dtos
  }
  def getDtosByExecutorInstance_isFinished(colValue : Int) : List[VExecutorStorageSnapshotDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageSnapshotDto] = SQL("select * from vExecutorStorageSnapshot where executorInstance_isFinished = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageSnapshotDto].*);
    dtos
  }
  def getDtosByExecutorInstance_portNumber(colValue : Int) : List[VExecutorStorageSnapshotDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageSnapshotDto] = SQL("select * from vExecutorStorageSnapshot where executorInstance_portNumber = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageSnapshotDto].*);
    dtos
  }
  def getDtosByExecutorInstance_insertedRowDate(colValue : java.util.Date) : List[VExecutorStorageSnapshotDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageSnapshotDto] = SQL("select * from vExecutorStorageSnapshot where executorInstance_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageSnapshotDto].*);
    dtos
  }
  def getDtosByExecutorInstance_lastUpdatedDate(colValue : java.util.Date) : List[VExecutorStorageSnapshotDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageSnapshotDto] = SQL("select * from vExecutorStorageSnapshot where executorInstance_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageSnapshotDto].*);
    dtos
  }
  def getDtosByExecutorInstance_endDate(colValue : java.util.Date) : List[VExecutorStorageSnapshotDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageSnapshotDto] = SQL("select * from vExecutorStorageSnapshot where executorInstance_endDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageSnapshotDto].*);
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
    val dtos : VExecutorStorageViewDto= SQL("select * from vExecutorStorageView order by insertedRowDate asc ").as(anorm.Macro.namedParser[VExecutorStorageViewDto].*).head;
    dtos
  }
  def getVExecutorStorageViewLast() : VExecutorStorageViewDto = {
    implicit val connection = getConnection();
    val dtos : VExecutorStorageViewDto= SQL("select * from vExecutorStorageView order by insertedRowDate desc ").as(anorm.Macro.namedParser[VExecutorStorageViewDto].*).head;
    dtos
  }
  def getVExecutorStorageViewByGuid(guid : Long) : VExecutorStorageViewDto = {
    implicit val connection = getConnection();
    val dtos : VExecutorStorageViewDto= SQL("select * from vExecutorStorageView where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VExecutorStorageViewDto].single);
    dtos
  }
  def getDtosByExecutorStorageViewId(colValue : Long) : List[VExecutorStorageViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageViewDto] = SQL("select * from vExecutorStorageView where executorStorageViewId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageViewDto].*);
    dtos
  }
  def getDtosByGuid(colValue : Long) : List[VExecutorStorageViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageViewDto] = SQL("select * from vExecutorStorageView where guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageViewDto].*);
    dtos
  }
  def getDtosByInsertedRowDate(colValue : java.util.Date) : List[VExecutorStorageViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageViewDto] = SQL("select * from vExecutorStorageView where insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageViewDto].*);
    dtos
  }
  def getDtosByLastUpdatedDate(colValue : java.util.Date) : List[VExecutorStorageViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageViewDto] = SQL("select * from vExecutorStorageView where lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageViewDto].*);
    dtos
  }
  def getDtosByExecutorStorageSnapshotId(colValue : Long) : List[VExecutorStorageViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageViewDto] = SQL("select * from vExecutorStorageView where executorStorageSnapshotId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageViewDto].*);
    dtos
  }
  def getDtosByExecutorStorageId(colValue : Long) : List[VExecutorStorageViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageViewDto] = SQL("select * from vExecutorStorageView where executorStorageId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageViewDto].*);
    dtos
  }
  def getDtosBySourceDownloadId(colValue : Long) : List[VExecutorStorageViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageViewDto] = SQL("select * from vExecutorStorageView where sourceDownloadId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageViewDto].*);
    dtos
  }
  def getDtosByStoragePath(colValue : String) : List[VExecutorStorageViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageViewDto] = SQL("select * from vExecutorStorageView where storagePath = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageViewDto].*);
    dtos
  }
  def getDtosByViewSize(colValue : Long) : List[VExecutorStorageViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageViewDto] = SQL("select * from vExecutorStorageView where viewSize = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageViewDto].*);
    dtos
  }
  def getDtosByViewRowsCount(colValue : Long) : List[VExecutorStorageViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageViewDto] = SQL("select * from vExecutorStorageView where viewRowsCount = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageViewDto].*);
    dtos
  }
  def getDtosByExecutorStorage_executorStorageId(colValue : Long) : List[VExecutorStorageViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageViewDto] = SQL("select * from vExecutorStorageView where executorStorage_executorStorageId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageViewDto].*);
    dtos
  }
  def getDtosByExecutorStorage_guid(colValue : Long) : List[VExecutorStorageViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageViewDto] = SQL("select * from vExecutorStorageView where executorStorage_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageViewDto].*);
    dtos
  }
  def getDtosByExecutorStorage_executorHostId(colValue : Long) : List[VExecutorStorageViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageViewDto] = SQL("select * from vExecutorStorageView where executorStorage_executorHostId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageViewDto].*);
    dtos
  }
  def getDtosByExecutorStorage_executorStorageTypeId(colValue : Long) : List[VExecutorStorageViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageViewDto] = SQL("select * from vExecutorStorageView where executorStorage_executorStorageTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageViewDto].*);
    dtos
  }
  def getDtosByExecutorStorage_storageDefinition(colValue : String) : List[VExecutorStorageViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageViewDto] = SQL("select * from vExecutorStorageView where executorStorage_storageDefinition = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageViewDto].*);
    dtos
  }
  def getDtosByExecutorStorage_storageBasePath(colValue : String) : List[VExecutorStorageViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageViewDto] = SQL("select * from vExecutorStorageView where executorStorage_storageBasePath = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageViewDto].*);
    dtos
  }
  def getDtosByExecutorStorage_storageFulllPath(colValue : String) : List[VExecutorStorageViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageViewDto] = SQL("select * from vExecutorStorageView where executorStorage_storageFulllPath = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageViewDto].*);
    dtos
  }
  def getDtosByExecutorStorage_isRunning(colValue : Int) : List[VExecutorStorageViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageViewDto] = SQL("select * from vExecutorStorageView where executorStorage_isRunning = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageViewDto].*);
    dtos
  }
  def getDtosByExecutorStorage_portNumber(colValue : Int) : List[VExecutorStorageViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageViewDto] = SQL("select * from vExecutorStorageView where executorStorage_portNumber = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageViewDto].*);
    dtos
  }
  def getDtosByExecutorStorage_insertedRowDate(colValue : java.util.Date) : List[VExecutorStorageViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageViewDto] = SQL("select * from vExecutorStorageView where executorStorage_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageViewDto].*);
    dtos
  }
  def getDtosByExecutorStorage_lastUpdatedDate(colValue : java.util.Date) : List[VExecutorStorageViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VExecutorStorageViewDto] = SQL("select * from vExecutorStorageView where executorStorage_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VExecutorStorageViewDto].*);
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
    val dtos : VResourceManagerDto= SQL("select * from vResourceManager order by insertedRowDate asc ").as(anorm.Macro.namedParser[VResourceManagerDto].*).head;
    dtos
  }
  def getVResourceManagerLast() : VResourceManagerDto = {
    implicit val connection = getConnection();
    val dtos : VResourceManagerDto= SQL("select * from vResourceManager order by insertedRowDate desc ").as(anorm.Macro.namedParser[VResourceManagerDto].*).head;
    dtos
  }
  def getVResourceManagerByGuid(guid : Long) : VResourceManagerDto = {
    implicit val connection = getConnection();
    val dtos : VResourceManagerDto= SQL("select * from vResourceManager where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VResourceManagerDto].single);
    dtos
  }
  def getDtosByResourceManagerId(colValue : Long) : List[VResourceManagerDto] = {
    implicit val connection = getConnection();
    val dtos : List[VResourceManagerDto] = SQL("select * from vResourceManager where resourceManagerId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VResourceManagerDto].*);
    dtos
  }
  def getDtosByGuid(colValue : Long) : List[VResourceManagerDto] = {
    implicit val connection = getConnection();
    val dtos : List[VResourceManagerDto] = SQL("select * from vResourceManager where guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VResourceManagerDto].*);
    dtos
  }
  def getDtosByResourceManagerTypeId(colValue : Long) : List[VResourceManagerDto] = {
    implicit val connection = getConnection();
    val dtos : List[VResourceManagerDto] = SQL("select * from vResourceManager where resourceManagerTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VResourceManagerDto].*);
    dtos
  }
  def getDtosByExecutorHostId(colValue : Long) : List[VResourceManagerDto] = {
    implicit val connection = getConnection();
    val dtos : List[VResourceManagerDto] = SQL("select * from vResourceManager where executorHostId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VResourceManagerDto].*);
    dtos
  }
  def getDtosByResourceManagerStatus(colValue : String) : List[VResourceManagerDto] = {
    implicit val connection = getConnection();
    val dtos : List[VResourceManagerDto] = SQL("select * from vResourceManager where resourceManagerStatus = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VResourceManagerDto].*);
    dtos
  }
  def getDtosByInsertedRowDate(colValue : java.util.Date) : List[VResourceManagerDto] = {
    implicit val connection = getConnection();
    val dtos : List[VResourceManagerDto] = SQL("select * from vResourceManager where insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VResourceManagerDto].*);
    dtos
  }
  def getDtosByLastUpdatedDate(colValue : java.util.Date) : List[VResourceManagerDto] = {
    implicit val connection = getConnection();
    val dtos : List[VResourceManagerDto] = SQL("select * from vResourceManager where lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VResourceManagerDto].*);
    dtos
  }
  def getDtosByExecutorHost_executorHostId(colValue : Long) : List[VResourceManagerDto] = {
    implicit val connection = getConnection();
    val dtos : List[VResourceManagerDto] = SQL("select * from vResourceManager where executorHost_executorHostId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VResourceManagerDto].*);
    dtos
  }
  def getDtosByExecutorHost_guid(colValue : Long) : List[VResourceManagerDto] = {
    implicit val connection = getConnection();
    val dtos : List[VResourceManagerDto] = SQL("select * from vResourceManager where executorHost_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VResourceManagerDto].*);
    dtos
  }
  def getDtosByExecutorHost_insertedRowDate(colValue : java.util.Date) : List[VResourceManagerDto] = {
    implicit val connection = getConnection();
    val dtos : List[VResourceManagerDto] = SQL("select * from vResourceManager where executorHost_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VResourceManagerDto].*);
    dtos
  }
  def getDtosByExecutorHost_lastUpdatedDate(colValue : java.util.Date) : List[VResourceManagerDto] = {
    implicit val connection = getConnection();
    val dtos : List[VResourceManagerDto] = SQL("select * from vResourceManager where executorHost_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VResourceManagerDto].*);
    dtos
  }
  def getDtosByExecutorHost_hostName(colValue : String) : List[VResourceManagerDto] = {
    implicit val connection = getConnection();
    val dtos : List[VResourceManagerDto] = SQL("select * from vResourceManager where executorHost_hostName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VResourceManagerDto].*);
    dtos
  }
  def getDtosByExecutorHost_hostIp(colValue : String) : List[VResourceManagerDto] = {
    implicit val connection = getConnection();
    val dtos : List[VResourceManagerDto] = SQL("select * from vResourceManager where executorHost_hostIp = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VResourceManagerDto].*);
    dtos
  }
  def getDtosByExecutorHost_hostDomain(colValue : String) : List[VResourceManagerDto] = {
    implicit val connection = getConnection();
    val dtos : List[VResourceManagerDto] = SQL("select * from vResourceManager where executorHost_hostDomain = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VResourceManagerDto].*);
    dtos
  }
  def getDtosByExecutorHost_hostOsType(colValue : String) : List[VResourceManagerDto] = {
    implicit val connection = getConnection();
    val dtos : List[VResourceManagerDto] = SQL("select * from vResourceManager where executorHost_hostOsType = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VResourceManagerDto].*);
    dtos
  }
  def getDtosByExecutorHost_hostOsVersion(colValue : String) : List[VResourceManagerDto] = {
    implicit val connection = getConnection();
    val dtos : List[VResourceManagerDto] = SQL("select * from vResourceManager where executorHost_hostOsVersion = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VResourceManagerDto].*);
    dtos
  }
  def getDtosByExecutorHost_isWorking(colValue : Int) : List[VResourceManagerDto] = {
    implicit val connection = getConnection();
    val dtos : List[VResourceManagerDto] = SQL("select * from vResourceManager where executorHost_isWorking = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VResourceManagerDto].*);
    dtos
  }
  def getDtosByResourceManagerType_resourceManagerTypeId(colValue : Long) : List[VResourceManagerDto] = {
    implicit val connection = getConnection();
    val dtos : List[VResourceManagerDto] = SQL("select * from vResourceManager where resourceManagerType_resourceManagerTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VResourceManagerDto].*);
    dtos
  }
  def getDtosByResourceManagerType_guid(colValue : Long) : List[VResourceManagerDto] = {
    implicit val connection = getConnection();
    val dtos : List[VResourceManagerDto] = SQL("select * from vResourceManager where resourceManagerType_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VResourceManagerDto].*);
    dtos
  }
  def getDtosByResourceManagerType_resourceManagerTypeName(colValue : String) : List[VResourceManagerDto] = {
    implicit val connection = getConnection();
    val dtos : List[VResourceManagerDto] = SQL("select * from vResourceManager where resourceManagerType_resourceManagerTypeName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VResourceManagerDto].*);
    dtos
  }
  def getDtosByResourceManagerType_resourceManagerTypeClass(colValue : String) : List[VResourceManagerDto] = {
    implicit val connection = getConnection();
    val dtos : List[VResourceManagerDto] = SQL("select * from vResourceManager where resourceManagerType_resourceManagerTypeClass = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VResourceManagerDto].*);
    dtos
  }
  def getDtosByResourceManagerType_insertedRowDate(colValue : java.util.Date) : List[VResourceManagerDto] = {
    implicit val connection = getConnection();
    val dtos : List[VResourceManagerDto] = SQL("select * from vResourceManager where resourceManagerType_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VResourceManagerDto].*);
    dtos
  }
  def getDtosByResourceManagerType_lastUpdatedDate(colValue : java.util.Date) : List[VResourceManagerDto] = {
    implicit val connection = getConnection();
    val dtos : List[VResourceManagerDto] = SQL("select * from vResourceManager where resourceManagerType_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VResourceManagerDto].*);
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
    val dtos : VResourceManagerMeasureDto= SQL("select * from vResourceManagerMeasure order by insertedRowDate asc ").as(anorm.Macro.namedParser[VResourceManagerMeasureDto].*).head;
    dtos
  }
  def getVResourceManagerMeasureLast() : VResourceManagerMeasureDto = {
    implicit val connection = getConnection();
    val dtos : VResourceManagerMeasureDto= SQL("select * from vResourceManagerMeasure order by insertedRowDate desc ").as(anorm.Macro.namedParser[VResourceManagerMeasureDto].*).head;
    dtos
  }
  def getVResourceManagerMeasureByGuid(guid : Long) : VResourceManagerMeasureDto = {
    implicit val connection = getConnection();
    val dtos : VResourceManagerMeasureDto= SQL("select * from vResourceManagerMeasure where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VResourceManagerMeasureDto].single);
    dtos
  }
  def getDtosByResourceManagerMeasureId(colValue : Long) : List[VResourceManagerMeasureDto] = {
    implicit val connection = getConnection();
    val dtos : List[VResourceManagerMeasureDto] = SQL("select * from vResourceManagerMeasure where resourceManagerMeasureId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VResourceManagerMeasureDto].*);
    dtos
  }
  def getDtosByGuid(colValue : Long) : List[VResourceManagerMeasureDto] = {
    implicit val connection = getConnection();
    val dtos : List[VResourceManagerMeasureDto] = SQL("select * from vResourceManagerMeasure where guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VResourceManagerMeasureDto].*);
    dtos
  }
  def getDtosByResourceManagerId(colValue : Long) : List[VResourceManagerMeasureDto] = {
    implicit val connection = getConnection();
    val dtos : List[VResourceManagerMeasureDto] = SQL("select * from vResourceManagerMeasure where resourceManagerId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VResourceManagerMeasureDto].*);
    dtos
  }
  def getDtosByResourceMeasureId(colValue : Long) : List[VResourceManagerMeasureDto] = {
    implicit val connection = getConnection();
    val dtos : List[VResourceManagerMeasureDto] = SQL("select * from vResourceManagerMeasure where resourceMeasureId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VResourceManagerMeasureDto].*);
    dtos
  }
  def getDtosByMeasureString(colValue : String) : List[VResourceManagerMeasureDto] = {
    implicit val connection = getConnection();
    val dtos : List[VResourceManagerMeasureDto] = SQL("select * from vResourceManagerMeasure where measureString = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VResourceManagerMeasureDto].*);
    dtos
  }
  def getDtosByMeasureValue(colValue : Double) : List[VResourceManagerMeasureDto] = {
    implicit val connection = getConnection();
    val dtos : List[VResourceManagerMeasureDto] = SQL("select * from vResourceManagerMeasure where measureValue = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VResourceManagerMeasureDto].*);
    dtos
  }
  def getDtosByInsertedRowDate(colValue : java.util.Date) : List[VResourceManagerMeasureDto] = {
    implicit val connection = getConnection();
    val dtos : List[VResourceManagerMeasureDto] = SQL("select * from vResourceManagerMeasure where insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VResourceManagerMeasureDto].*);
    dtos
  }
  def getDtosByLastUpdatedDate(colValue : java.util.Date) : List[VResourceManagerMeasureDto] = {
    implicit val connection = getConnection();
    val dtos : List[VResourceManagerMeasureDto] = SQL("select * from vResourceManagerMeasure where lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VResourceManagerMeasureDto].*);
    dtos
  }
  def getDtosByResourceManager_resourceManagerId(colValue : Long) : List[VResourceManagerMeasureDto] = {
    implicit val connection = getConnection();
    val dtos : List[VResourceManagerMeasureDto] = SQL("select * from vResourceManagerMeasure where resourceManager_resourceManagerId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VResourceManagerMeasureDto].*);
    dtos
  }
  def getDtosByResourceManager_guid(colValue : Long) : List[VResourceManagerMeasureDto] = {
    implicit val connection = getConnection();
    val dtos : List[VResourceManagerMeasureDto] = SQL("select * from vResourceManagerMeasure where resourceManager_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VResourceManagerMeasureDto].*);
    dtos
  }
  def getDtosByResourceManager_resourceManagerTypeId(colValue : Long) : List[VResourceManagerMeasureDto] = {
    implicit val connection = getConnection();
    val dtos : List[VResourceManagerMeasureDto] = SQL("select * from vResourceManagerMeasure where resourceManager_resourceManagerTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VResourceManagerMeasureDto].*);
    dtos
  }
  def getDtosByResourceManager_executorHostId(colValue : Long) : List[VResourceManagerMeasureDto] = {
    implicit val connection = getConnection();
    val dtos : List[VResourceManagerMeasureDto] = SQL("select * from vResourceManagerMeasure where resourceManager_executorHostId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VResourceManagerMeasureDto].*);
    dtos
  }
  def getDtosByResourceManager_resourceManagerStatus(colValue : String) : List[VResourceManagerMeasureDto] = {
    implicit val connection = getConnection();
    val dtos : List[VResourceManagerMeasureDto] = SQL("select * from vResourceManagerMeasure where resourceManager_resourceManagerStatus = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VResourceManagerMeasureDto].*);
    dtos
  }
  def getDtosByResourceManager_insertedRowDate(colValue : java.util.Date) : List[VResourceManagerMeasureDto] = {
    implicit val connection = getConnection();
    val dtos : List[VResourceManagerMeasureDto] = SQL("select * from vResourceManagerMeasure where resourceManager_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VResourceManagerMeasureDto].*);
    dtos
  }
  def getDtosByResourceManager_lastUpdatedDate(colValue : java.util.Date) : List[VResourceManagerMeasureDto] = {
    implicit val connection = getConnection();
    val dtos : List[VResourceManagerMeasureDto] = SQL("select * from vResourceManagerMeasure where resourceManager_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VResourceManagerMeasureDto].*);
    dtos
  }
  def getDtosByResourceMeasure_resourceMeasureId(colValue : Long) : List[VResourceManagerMeasureDto] = {
    implicit val connection = getConnection();
    val dtos : List[VResourceManagerMeasureDto] = SQL("select * from vResourceManagerMeasure where resourceMeasure_resourceMeasureId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VResourceManagerMeasureDto].*);
    dtos
  }
  def getDtosByResourceMeasure_guid(colValue : Long) : List[VResourceManagerMeasureDto] = {
    implicit val connection = getConnection();
    val dtos : List[VResourceManagerMeasureDto] = SQL("select * from vResourceManagerMeasure where resourceMeasure_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VResourceManagerMeasureDto].*);
    dtos
  }
  def getDtosByResourceMeasure_resourceMeasureName(colValue : String) : List[VResourceManagerMeasureDto] = {
    implicit val connection = getConnection();
    val dtos : List[VResourceManagerMeasureDto] = SQL("select * from vResourceManagerMeasure where resourceMeasure_resourceMeasureName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VResourceManagerMeasureDto].*);
    dtos
  }
  def getDtosByResourceMeasure_insertedRowDate(colValue : java.util.Date) : List[VResourceManagerMeasureDto] = {
    implicit val connection = getConnection();
    val dtos : List[VResourceManagerMeasureDto] = SQL("select * from vResourceManagerMeasure where resourceMeasure_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VResourceManagerMeasureDto].*);
    dtos
  }
  def getDtosByResourceMeasure_lastUpdatedDate(colValue : java.util.Date) : List[VResourceManagerMeasureDto] = {
    implicit val connection = getConnection();
    val dtos : List[VResourceManagerMeasureDto] = SQL("select * from vResourceManagerMeasure where resourceMeasure_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VResourceManagerMeasureDto].*);
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
    val dtos : VSourceDownloadDto= SQL("select * from vSourceDownload order by insertedRowDate asc ").as(anorm.Macro.namedParser[VSourceDownloadDto].*).head;
    dtos
  }
  def getVSourceDownloadLast() : VSourceDownloadDto = {
    implicit val connection = getConnection();
    val dtos : VSourceDownloadDto= SQL("select * from vSourceDownload order by insertedRowDate desc ").as(anorm.Macro.namedParser[VSourceDownloadDto].*).head;
    dtos
  }
  def getVSourceDownloadByGuid(guid : Long) : VSourceDownloadDto = {
    implicit val connection = getConnection();
    val dtos : VSourceDownloadDto= SQL("select * from vSourceDownload where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VSourceDownloadDto].single);
    dtos
  }
  def getDtosBySourceDownloadId(colValue : Long) : List[VSourceDownloadDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where sourceDownloadId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);
    dtos
  }
  def getDtosBySourceScheduleId(colValue : Long) : List[VSourceDownloadDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where sourceScheduleId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);
    dtos
  }
  def getDtosByInsertedRowDate(colValue : java.util.Date) : List[VSourceDownloadDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);
    dtos
  }
  def getDtosByLastUpdatedDate(colValue : java.util.Date) : List[VSourceDownloadDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);
    dtos
  }
  def getDtosByGuid(colValue : Long) : List[VSourceDownloadDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);
    dtos
  }
  def getDtosByRetryNumber(colValue : Int) : List[VSourceDownloadDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where retryNumber = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);
    dtos
  }
  def getDtosByIsRunning(colValue : Int) : List[VSourceDownloadDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where isRunning = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);
    dtos
  }
  def getDtosByIsFinished(colValue : Int) : List[VSourceDownloadDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where isFinished = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);
    dtos
  }
  def getDtosByIsExcecption(colValue : Int) : List[VSourceDownloadDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where isExcecption = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);
    dtos
  }
  def getDtosByExcecptionDescription(colValue : String) : List[VSourceDownloadDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where excecptionDescription = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);
    dtos
  }
  def getDtosBySourceSchedule_sourceScheduleId(colValue : Long) : List[VSourceDownloadDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where sourceSchedule_sourceScheduleId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);
    dtos
  }
  def getDtosBySourceSchedule_sourceViewId(colValue : Long) : List[VSourceDownloadDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where sourceSchedule_sourceViewId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);
    dtos
  }
  def getDtosBySourceSchedule_executorStorageId(colValue : Long) : List[VSourceDownloadDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where sourceSchedule_executorStorageId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);
    dtos
  }
  def getDtosBySourceSchedule_insertedRowDate(colValue : java.util.Date) : List[VSourceDownloadDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where sourceSchedule_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);
    dtos
  }
  def getDtosBySourceSchedule_lastUpdatedDate(colValue : java.util.Date) : List[VSourceDownloadDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where sourceSchedule_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);
    dtos
  }
  def getDtosBySourceSchedule_guid(colValue : Long) : List[VSourceDownloadDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where sourceSchedule_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);
    dtos
  }
  def getDtosBySourceSchedule_onDemand(colValue : Int) : List[VSourceDownloadDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where sourceSchedule_onDemand = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);
    dtos
  }
  def getDtosBySourceSchedule_startTime(colValue : java.util.Date) : List[VSourceDownloadDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where sourceSchedule_startTime = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);
    dtos
  }
  def getDtosBySourceSchedule_intervalValue(colValue : Long) : List[VSourceDownloadDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadDto] = SQL("select * from vSourceDownload where sourceSchedule_intervalValue = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadDto].*);
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
    val dtos : VSourceDownloadStatDto= SQL("select * from vSourceDownloadStat order by insertedRowDate asc ").as(anorm.Macro.namedParser[VSourceDownloadStatDto].*).head;
    dtos
  }
  def getVSourceDownloadStatLast() : VSourceDownloadStatDto = {
    implicit val connection = getConnection();
    val dtos : VSourceDownloadStatDto= SQL("select * from vSourceDownloadStat order by insertedRowDate desc ").as(anorm.Macro.namedParser[VSourceDownloadStatDto].*).head;
    dtos
  }
  def getVSourceDownloadStatByGuid(guid : Long) : VSourceDownloadStatDto = {
    implicit val connection = getConnection();
    val dtos : VSourceDownloadStatDto= SQL("select * from vSourceDownloadStat where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VSourceDownloadStatDto].single);
    dtos
  }
  def getDtosBySourceDownloadStatId(colValue : Long) : List[VSourceDownloadStatDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadStatDto] = SQL("select * from vSourceDownloadStat where sourceDownloadStatId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatDto].*);
    dtos
  }
  def getDtosByGuid(colValue : Long) : List[VSourceDownloadStatDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadStatDto] = SQL("select * from vSourceDownloadStat where guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatDto].*);
    dtos
  }
  def getDtosBySourceDownloadId(colValue : Long) : List[VSourceDownloadStatDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadStatDto] = SQL("select * from vSourceDownloadStat where sourceDownloadId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatDto].*);
    dtos
  }
  def getDtosByInsertedRowDate(colValue : java.util.Date) : List[VSourceDownloadStatDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadStatDto] = SQL("select * from vSourceDownloadStat where insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatDto].*);
    dtos
  }
  def getDtosByLastUpdatedDate(colValue : java.util.Date) : List[VSourceDownloadStatDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadStatDto] = SQL("select * from vSourceDownloadStat where lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatDto].*);
    dtos
  }
  def getDtosByRowsCount(colValue : Long) : List[VSourceDownloadStatDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadStatDto] = SQL("select * from vSourceDownloadStat where rowsCount = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatDto].*);
    dtos
  }
  def getDtosByErrorRowsCount(colValue : Long) : List[VSourceDownloadStatDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadStatDto] = SQL("select * from vSourceDownloadStat where errorRowsCount = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatDto].*);
    dtos
  }
  def getDtosByTotalBytesCount(colValue : Long) : List[VSourceDownloadStatDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadStatDto] = SQL("select * from vSourceDownloadStat where totalBytesCount = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatDto].*);
    dtos
  }
  def getDtosByEmpryRowsCount(colValue : Long) : List[VSourceDownloadStatDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadStatDto] = SQL("select * from vSourceDownloadStat where empryRowsCount = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatDto].*);
    dtos
  }
  def getDtosBySourceDownload_sourceDownloadId(colValue : Long) : List[VSourceDownloadStatDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadStatDto] = SQL("select * from vSourceDownloadStat where sourceDownload_sourceDownloadId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatDto].*);
    dtos
  }
  def getDtosBySourceDownload_sourceScheduleId(colValue : Long) : List[VSourceDownloadStatDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadStatDto] = SQL("select * from vSourceDownloadStat where sourceDownload_sourceScheduleId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatDto].*);
    dtos
  }
  def getDtosBySourceDownload_insertedRowDate(colValue : java.util.Date) : List[VSourceDownloadStatDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadStatDto] = SQL("select * from vSourceDownloadStat where sourceDownload_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatDto].*);
    dtos
  }
  def getDtosBySourceDownload_lastUpdatedDate(colValue : java.util.Date) : List[VSourceDownloadStatDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadStatDto] = SQL("select * from vSourceDownloadStat where sourceDownload_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatDto].*);
    dtos
  }
  def getDtosBySourceDownload_guid(colValue : Long) : List[VSourceDownloadStatDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadStatDto] = SQL("select * from vSourceDownloadStat where sourceDownload_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatDto].*);
    dtos
  }
  def getDtosBySourceDownload_retryNumber(colValue : Int) : List[VSourceDownloadStatDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadStatDto] = SQL("select * from vSourceDownloadStat where sourceDownload_retryNumber = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatDto].*);
    dtos
  }
  def getDtosBySourceDownload_isRunning(colValue : Int) : List[VSourceDownloadStatDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadStatDto] = SQL("select * from vSourceDownloadStat where sourceDownload_isRunning = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatDto].*);
    dtos
  }
  def getDtosBySourceDownload_isFinished(colValue : Int) : List[VSourceDownloadStatDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadStatDto] = SQL("select * from vSourceDownloadStat where sourceDownload_isFinished = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatDto].*);
    dtos
  }
  def getDtosBySourceDownload_isExcecption(colValue : Int) : List[VSourceDownloadStatDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadStatDto] = SQL("select * from vSourceDownloadStat where sourceDownload_isExcecption = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatDto].*);
    dtos
  }
  def getDtosBySourceDownload_excecptionDescription(colValue : String) : List[VSourceDownloadStatDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadStatDto] = SQL("select * from vSourceDownloadStat where sourceDownload_excecptionDescription = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatDto].*);
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
    val dtos : VSourceDownloadStatColumnDto= SQL("select * from vSourceDownloadStatColumn order by insertedRowDate asc ").as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*).head;
    dtos
  }
  def getVSourceDownloadStatColumnLast() : VSourceDownloadStatColumnDto = {
    implicit val connection = getConnection();
    val dtos : VSourceDownloadStatColumnDto= SQL("select * from vSourceDownloadStatColumn order by insertedRowDate desc ").as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*).head;
    dtos
  }
  def getVSourceDownloadStatColumnByGuid(guid : Long) : VSourceDownloadStatColumnDto = {
    implicit val connection = getConnection();
    val dtos : VSourceDownloadStatColumnDto= SQL("select * from vSourceDownloadStatColumn where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].single);
    dtos
  }
  def getDtosBySourceDownloadStatColumnId(colValue : Long) : List[VSourceDownloadStatColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadStatColumnDto] = SQL("select * from vSourceDownloadStatColumn where sourceDownloadStatColumnId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*);
    dtos
  }
  def getDtosByGuid(colValue : Long) : List[VSourceDownloadStatColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadStatColumnDto] = SQL("select * from vSourceDownloadStatColumn where guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*);
    dtos
  }
  def getDtosBySourceDownloadId(colValue : Long) : List[VSourceDownloadStatColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadStatColumnDto] = SQL("select * from vSourceDownloadStatColumn where sourceDownloadId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*);
    dtos
  }
  def getDtosBySourceViewColumnId(colValue : Long) : List[VSourceDownloadStatColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadStatColumnDto] = SQL("select * from vSourceDownloadStatColumn where sourceViewColumnId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*);
    dtos
  }
  def getDtosByInsertedRowDate(colValue : java.util.Date) : List[VSourceDownloadStatColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadStatColumnDto] = SQL("select * from vSourceDownloadStatColumn where insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*);
    dtos
  }
  def getDtosByLastUpdatedDate(colValue : java.util.Date) : List[VSourceDownloadStatColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadStatColumnDto] = SQL("select * from vSourceDownloadStatColumn where lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*);
    dtos
  }
  def getDtosByColumnMinNumber(colValue : Double) : List[VSourceDownloadStatColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadStatColumnDto] = SQL("select * from vSourceDownloadStatColumn where columnMinNumber = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*);
    dtos
  }
  def getDtosByColumnMaxNumber(colValue : Double) : List[VSourceDownloadStatColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadStatColumnDto] = SQL("select * from vSourceDownloadStatColumn where columnMaxNumber = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*);
    dtos
  }
  def getDtosByColumnMinStr(colValue : String) : List[VSourceDownloadStatColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadStatColumnDto] = SQL("select * from vSourceDownloadStatColumn where columnMinStr = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*);
    dtos
  }
  def getDtosByColumnMaxStr(colValue : String) : List[VSourceDownloadStatColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadStatColumnDto] = SQL("select * from vSourceDownloadStatColumn where columnMaxStr = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*);
    dtos
  }
  def getDtosByColumnNonemptyCount(colValue : Long) : List[VSourceDownloadStatColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadStatColumnDto] = SQL("select * from vSourceDownloadStatColumn where columnNonemptyCount = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*);
    dtos
  }
  def getDtosBySourceDownload_sourceDownloadId(colValue : Long) : List[VSourceDownloadStatColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadStatColumnDto] = SQL("select * from vSourceDownloadStatColumn where sourceDownload_sourceDownloadId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*);
    dtos
  }
  def getDtosBySourceDownload_sourceScheduleId(colValue : Long) : List[VSourceDownloadStatColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadStatColumnDto] = SQL("select * from vSourceDownloadStatColumn where sourceDownload_sourceScheduleId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*);
    dtos
  }
  def getDtosBySourceDownload_insertedRowDate(colValue : java.util.Date) : List[VSourceDownloadStatColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadStatColumnDto] = SQL("select * from vSourceDownloadStatColumn where sourceDownload_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*);
    dtos
  }
  def getDtosBySourceDownload_lastUpdatedDate(colValue : java.util.Date) : List[VSourceDownloadStatColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadStatColumnDto] = SQL("select * from vSourceDownloadStatColumn where sourceDownload_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*);
    dtos
  }
  def getDtosBySourceDownload_guid(colValue : Long) : List[VSourceDownloadStatColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadStatColumnDto] = SQL("select * from vSourceDownloadStatColumn where sourceDownload_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*);
    dtos
  }
  def getDtosBySourceDownload_retryNumber(colValue : Int) : List[VSourceDownloadStatColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadStatColumnDto] = SQL("select * from vSourceDownloadStatColumn where sourceDownload_retryNumber = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*);
    dtos
  }
  def getDtosBySourceDownload_isRunning(colValue : Int) : List[VSourceDownloadStatColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadStatColumnDto] = SQL("select * from vSourceDownloadStatColumn where sourceDownload_isRunning = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*);
    dtos
  }
  def getDtosBySourceDownload_isFinished(colValue : Int) : List[VSourceDownloadStatColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadStatColumnDto] = SQL("select * from vSourceDownloadStatColumn where sourceDownload_isFinished = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*);
    dtos
  }
  def getDtosBySourceDownload_isExcecption(colValue : Int) : List[VSourceDownloadStatColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadStatColumnDto] = SQL("select * from vSourceDownloadStatColumn where sourceDownload_isExcecption = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*);
    dtos
  }
  def getDtosBySourceDownload_excecptionDescription(colValue : String) : List[VSourceDownloadStatColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadStatColumnDto] = SQL("select * from vSourceDownloadStatColumn where sourceDownload_excecptionDescription = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*);
    dtos
  }
  def getDtosBySourceViewColumn_sourceViewColumnId(colValue : Long) : List[VSourceDownloadStatColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadStatColumnDto] = SQL("select * from vSourceDownloadStatColumn where sourceViewColumn_sourceViewColumnId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*);
    dtos
  }
  def getDtosBySourceViewColumn_sourceViewId(colValue : Long) : List[VSourceDownloadStatColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadStatColumnDto] = SQL("select * from vSourceDownloadStatColumn where sourceViewColumn_sourceViewId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*);
    dtos
  }
  def getDtosBySourceViewColumn_insertedRowDate(colValue : java.util.Date) : List[VSourceDownloadStatColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadStatColumnDto] = SQL("select * from vSourceDownloadStatColumn where sourceViewColumn_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*);
    dtos
  }
  def getDtosBySourceViewColumn_lastUpdatedDate(colValue : java.util.Date) : List[VSourceDownloadStatColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadStatColumnDto] = SQL("select * from vSourceDownloadStatColumn where sourceViewColumn_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*);
    dtos
  }
  def getDtosBySourceViewColumn_guid(colValue : Long) : List[VSourceDownloadStatColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadStatColumnDto] = SQL("select * from vSourceDownloadStatColumn where sourceViewColumn_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*);
    dtos
  }
  def getDtosBySourceViewColumn_columnName(colValue : String) : List[VSourceDownloadStatColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadStatColumnDto] = SQL("select * from vSourceDownloadStatColumn where sourceViewColumn_columnName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*);
    dtos
  }
  def getDtosBySourceViewColumn_columnType(colValue : String) : List[VSourceDownloadStatColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceDownloadStatColumnDto] = SQL("select * from vSourceDownloadStatColumn where sourceViewColumn_columnType = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceDownloadStatColumnDto].*);
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
    val dtos : VSourceInstanceDto= SQL("select * from vSourceInstance order by insertedRowDate asc ").as(anorm.Macro.namedParser[VSourceInstanceDto].*).head;
    dtos
  }
  def getVSourceInstanceLast() : VSourceInstanceDto = {
    implicit val connection = getConnection();
    val dtos : VSourceInstanceDto= SQL("select * from vSourceInstance order by insertedRowDate desc ").as(anorm.Macro.namedParser[VSourceInstanceDto].*).head;
    dtos
  }
  def getVSourceInstanceByGuid(guid : Long) : VSourceInstanceDto = {
    implicit val connection = getConnection();
    val dtos : VSourceInstanceDto= SQL("select * from vSourceInstance where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VSourceInstanceDto].single);
    dtos
  }
  def getDtosBySourceInstanceId(colValue : Long) : List[VSourceInstanceDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceInstanceDto] = SQL("select * from vSourceInstance where sourceInstanceId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceInstanceDto].*);
    dtos
  }
  def getDtosByGuid(colValue : Long) : List[VSourceInstanceDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceInstanceDto] = SQL("select * from vSourceInstance where guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceInstanceDto].*);
    dtos
  }
  def getDtosBySourceTypeId(colValue : Long) : List[VSourceInstanceDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceInstanceDto] = SQL("select * from vSourceInstance where sourceTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceInstanceDto].*);
    dtos
  }
  def getDtosBySourceInstanceName(colValue : String) : List[VSourceInstanceDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceInstanceDto] = SQL("select * from vSourceInstance where sourceInstanceName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceInstanceDto].*);
    dtos
  }
  def getDtosByErrorCount(colValue : Long) : List[VSourceInstanceDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceInstanceDto] = SQL("select * from vSourceInstance where errorCount = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceInstanceDto].*);
    dtos
  }
  def getDtosByCorrectCount(colValue : Long) : List[VSourceInstanceDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceInstanceDto] = SQL("select * from vSourceInstance where correctCount = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceInstanceDto].*);
    dtos
  }
  def getDtosByLastStatus(colValue : String) : List[VSourceInstanceDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceInstanceDto] = SQL("select * from vSourceInstance where lastStatus = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceInstanceDto].*);
    dtos
  }
  def getDtosByLastConnectionDate(colValue : java.util.Date) : List[VSourceInstanceDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceInstanceDto] = SQL("select * from vSourceInstance where lastConnectionDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceInstanceDto].*);
    dtos
  }
  def getDtosByInsertedRowDate(colValue : java.util.Date) : List[VSourceInstanceDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceInstanceDto] = SQL("select * from vSourceInstance where insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceInstanceDto].*);
    dtos
  }
  def getDtosByLastUpdatedDate(colValue : java.util.Date) : List[VSourceInstanceDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceInstanceDto] = SQL("select * from vSourceInstance where lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceInstanceDto].*);
    dtos
  }
  def getDtosBySourceType_sourceTypeId(colValue : Long) : List[VSourceInstanceDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceInstanceDto] = SQL("select * from vSourceInstance where sourceType_sourceTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceInstanceDto].*);
    dtos
  }
  def getDtosBySourceType_guid(colValue : Long) : List[VSourceInstanceDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceInstanceDto] = SQL("select * from vSourceInstance where sourceType_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceInstanceDto].*);
    dtos
  }
  def getDtosBySourceType_sourceTypeName(colValue : String) : List[VSourceInstanceDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceInstanceDto] = SQL("select * from vSourceInstance where sourceType_sourceTypeName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceInstanceDto].*);
    dtos
  }
  def getDtosBySourceType_sourceTypeClass(colValue : String) : List[VSourceInstanceDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceInstanceDto] = SQL("select * from vSourceInstance where sourceType_sourceTypeClass = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceInstanceDto].*);
    dtos
  }
  def getDtosBySourceType_insertedRowDate(colValue : java.util.Date) : List[VSourceInstanceDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceInstanceDto] = SQL("select * from vSourceInstance where sourceType_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceInstanceDto].*);
    dtos
  }
  def getDtosBySourceType_lastUpdatedDate(colValue : java.util.Date) : List[VSourceInstanceDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceInstanceDto] = SQL("select * from vSourceInstance where sourceType_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceInstanceDto].*);
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
    val dtos : VSourceParamValueDto= SQL("select * from vSourceParamValue order by insertedRowDate asc ").as(anorm.Macro.namedParser[VSourceParamValueDto].*).head;
    dtos
  }
  def getVSourceParamValueLast() : VSourceParamValueDto = {
    implicit val connection = getConnection();
    val dtos : VSourceParamValueDto= SQL("select * from vSourceParamValue order by insertedRowDate desc ").as(anorm.Macro.namedParser[VSourceParamValueDto].*).head;
    dtos
  }
  def getVSourceParamValueByGuid(guid : Long) : VSourceParamValueDto = {
    implicit val connection = getConnection();
    val dtos : VSourceParamValueDto= SQL("select * from vSourceParamValue where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VSourceParamValueDto].single);
    dtos
  }
  def getDtosBySourceParamValueId(colValue : Long) : List[VSourceParamValueDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceParamValueDto] = SQL("select * from vSourceParamValue where sourceParamValueId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceParamValueDto].*);
    dtos
  }
  def getDtosBySourceInstanceId(colValue : Long) : List[VSourceParamValueDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceParamValueDto] = SQL("select * from vSourceParamValue where sourceInstanceId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceParamValueDto].*);
    dtos
  }
  def getDtosBySourceParamId(colValue : Long) : List[VSourceParamValueDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceParamValueDto] = SQL("select * from vSourceParamValue where sourceParamId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceParamValueDto].*);
    dtos
  }
  def getDtosBySourceParamValueVersion(colValue : String) : List[VSourceParamValueDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceParamValueDto] = SQL("select * from vSourceParamValue where sourceParamValueVersion = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceParamValueDto].*);
    dtos
  }
  def getDtosByGuid(colValue : Long) : List[VSourceParamValueDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceParamValueDto] = SQL("select * from vSourceParamValue where guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceParamValueDto].*);
    dtos
  }
  def getDtosByInsertedRowDate(colValue : java.util.Date) : List[VSourceParamValueDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceParamValueDto] = SQL("select * from vSourceParamValue where insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceParamValueDto].*);
    dtos
  }
  def getDtosByLastUpdatedDate(colValue : java.util.Date) : List[VSourceParamValueDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceParamValueDto] = SQL("select * from vSourceParamValue where lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceParamValueDto].*);
    dtos
  }
  def getDtosByParamValue(colValue : String) : List[VSourceParamValueDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceParamValueDto] = SQL("select * from vSourceParamValue where paramValue = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceParamValueDto].*);
    dtos
  }
  def getDtosBySourceInstance_sourceInstanceId(colValue : Long) : List[VSourceParamValueDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceParamValueDto] = SQL("select * from vSourceParamValue where sourceInstance_sourceInstanceId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceParamValueDto].*);
    dtos
  }
  def getDtosBySourceInstance_guid(colValue : Long) : List[VSourceParamValueDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceParamValueDto] = SQL("select * from vSourceParamValue where sourceInstance_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceParamValueDto].*);
    dtos
  }
  def getDtosBySourceInstance_sourceTypeId(colValue : Long) : List[VSourceParamValueDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceParamValueDto] = SQL("select * from vSourceParamValue where sourceInstance_sourceTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceParamValueDto].*);
    dtos
  }
  def getDtosBySourceInstance_sourceInstanceName(colValue : String) : List[VSourceParamValueDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceParamValueDto] = SQL("select * from vSourceParamValue where sourceInstance_sourceInstanceName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceParamValueDto].*);
    dtos
  }
  def getDtosBySourceInstance_errorCount(colValue : Long) : List[VSourceParamValueDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceParamValueDto] = SQL("select * from vSourceParamValue where sourceInstance_errorCount = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceParamValueDto].*);
    dtos
  }
  def getDtosBySourceInstance_correctCount(colValue : Long) : List[VSourceParamValueDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceParamValueDto] = SQL("select * from vSourceParamValue where sourceInstance_correctCount = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceParamValueDto].*);
    dtos
  }
  def getDtosBySourceInstance_lastStatus(colValue : String) : List[VSourceParamValueDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceParamValueDto] = SQL("select * from vSourceParamValue where sourceInstance_lastStatus = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceParamValueDto].*);
    dtos
  }
  def getDtosBySourceInstance_lastConnectionDate(colValue : java.util.Date) : List[VSourceParamValueDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceParamValueDto] = SQL("select * from vSourceParamValue where sourceInstance_lastConnectionDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceParamValueDto].*);
    dtos
  }
  def getDtosBySourceInstance_insertedRowDate(colValue : java.util.Date) : List[VSourceParamValueDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceParamValueDto] = SQL("select * from vSourceParamValue where sourceInstance_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceParamValueDto].*);
    dtos
  }
  def getDtosBySourceInstance_lastUpdatedDate(colValue : java.util.Date) : List[VSourceParamValueDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceParamValueDto] = SQL("select * from vSourceParamValue where sourceInstance_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceParamValueDto].*);
    dtos
  }
  def getDtosBySourceParam_sourceParamId(colValue : Long) : List[VSourceParamValueDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceParamValueDto] = SQL("select * from vSourceParamValue where sourceParam_sourceParamId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceParamValueDto].*);
    dtos
  }
  def getDtosBySourceParam_guid(colValue : Long) : List[VSourceParamValueDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceParamValueDto] = SQL("select * from vSourceParamValue where sourceParam_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceParamValueDto].*);
    dtos
  }
  def getDtosBySourceParam_sourceParamName(colValue : String) : List[VSourceParamValueDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceParamValueDto] = SQL("select * from vSourceParamValue where sourceParam_sourceParamName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceParamValueDto].*);
    dtos
  }
  def getDtosBySourceParam_sourceParamType(colValue : String) : List[VSourceParamValueDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceParamValueDto] = SQL("select * from vSourceParamValue where sourceParam_sourceParamType = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceParamValueDto].*);
    dtos
  }
  def getDtosBySourceParam_possibleValues(colValue : String) : List[VSourceParamValueDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceParamValueDto] = SQL("select * from vSourceParamValue where sourceParam_possibleValues = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceParamValueDto].*);
    dtos
  }
  def getDtosBySourceParam_insertedRowDate(colValue : java.util.Date) : List[VSourceParamValueDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceParamValueDto] = SQL("select * from vSourceParamValue where sourceParam_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceParamValueDto].*);
    dtos
  }
  def getDtosBySourceParam_lastUpdatedDate(colValue : java.util.Date) : List[VSourceParamValueDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceParamValueDto] = SQL("select * from vSourceParamValue where sourceParam_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceParamValueDto].*);
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
    val dtos : VSourceScheduleDto= SQL("select * from vSourceSchedule order by insertedRowDate asc ").as(anorm.Macro.namedParser[VSourceScheduleDto].*).head;
    dtos
  }
  def getVSourceScheduleLast() : VSourceScheduleDto = {
    implicit val connection = getConnection();
    val dtos : VSourceScheduleDto= SQL("select * from vSourceSchedule order by insertedRowDate desc ").as(anorm.Macro.namedParser[VSourceScheduleDto].*).head;
    dtos
  }
  def getVSourceScheduleByGuid(guid : Long) : VSourceScheduleDto = {
    implicit val connection = getConnection();
    val dtos : VSourceScheduleDto= SQL("select * from vSourceSchedule where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VSourceScheduleDto].single);
    dtos
  }
  def getDtosBySourceScheduleId(colValue : Long) : List[VSourceScheduleDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceScheduleDto] = SQL("select * from vSourceSchedule where sourceScheduleId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceScheduleDto].*);
    dtos
  }
  def getDtosBySourceViewId(colValue : Long) : List[VSourceScheduleDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceScheduleDto] = SQL("select * from vSourceSchedule where sourceViewId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceScheduleDto].*);
    dtos
  }
  def getDtosByExecutorStorageId(colValue : Long) : List[VSourceScheduleDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceScheduleDto] = SQL("select * from vSourceSchedule where executorStorageId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceScheduleDto].*);
    dtos
  }
  def getDtosByInsertedRowDate(colValue : java.util.Date) : List[VSourceScheduleDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceScheduleDto] = SQL("select * from vSourceSchedule where insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceScheduleDto].*);
    dtos
  }
  def getDtosByLastUpdatedDate(colValue : java.util.Date) : List[VSourceScheduleDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceScheduleDto] = SQL("select * from vSourceSchedule where lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceScheduleDto].*);
    dtos
  }
  def getDtosByGuid(colValue : Long) : List[VSourceScheduleDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceScheduleDto] = SQL("select * from vSourceSchedule where guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceScheduleDto].*);
    dtos
  }
  def getDtosByOnDemand(colValue : Int) : List[VSourceScheduleDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceScheduleDto] = SQL("select * from vSourceSchedule where onDemand = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceScheduleDto].*);
    dtos
  }
  def getDtosByStartTime(colValue : java.util.Date) : List[VSourceScheduleDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceScheduleDto] = SQL("select * from vSourceSchedule where startTime = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceScheduleDto].*);
    dtos
  }
  def getDtosByIntervalValue(colValue : Long) : List[VSourceScheduleDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceScheduleDto] = SQL("select * from vSourceSchedule where intervalValue = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceScheduleDto].*);
    dtos
  }
  def getDtosByExecutorStorage_executorStorageId(colValue : Long) : List[VSourceScheduleDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceScheduleDto] = SQL("select * from vSourceSchedule where executorStorage_executorStorageId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceScheduleDto].*);
    dtos
  }
  def getDtosByExecutorStorage_guid(colValue : Long) : List[VSourceScheduleDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceScheduleDto] = SQL("select * from vSourceSchedule where executorStorage_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceScheduleDto].*);
    dtos
  }
  def getDtosByExecutorStorage_executorHostId(colValue : Long) : List[VSourceScheduleDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceScheduleDto] = SQL("select * from vSourceSchedule where executorStorage_executorHostId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceScheduleDto].*);
    dtos
  }
  def getDtosByExecutorStorage_executorStorageTypeId(colValue : Long) : List[VSourceScheduleDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceScheduleDto] = SQL("select * from vSourceSchedule where executorStorage_executorStorageTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceScheduleDto].*);
    dtos
  }
  def getDtosByExecutorStorage_storageDefinition(colValue : String) : List[VSourceScheduleDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceScheduleDto] = SQL("select * from vSourceSchedule where executorStorage_storageDefinition = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceScheduleDto].*);
    dtos
  }
  def getDtosByExecutorStorage_storageBasePath(colValue : String) : List[VSourceScheduleDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceScheduleDto] = SQL("select * from vSourceSchedule where executorStorage_storageBasePath = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceScheduleDto].*);
    dtos
  }
  def getDtosByExecutorStorage_storageFulllPath(colValue : String) : List[VSourceScheduleDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceScheduleDto] = SQL("select * from vSourceSchedule where executorStorage_storageFulllPath = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceScheduleDto].*);
    dtos
  }
  def getDtosByExecutorStorage_isRunning(colValue : Int) : List[VSourceScheduleDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceScheduleDto] = SQL("select * from vSourceSchedule where executorStorage_isRunning = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceScheduleDto].*);
    dtos
  }
  def getDtosByExecutorStorage_portNumber(colValue : Int) : List[VSourceScheduleDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceScheduleDto] = SQL("select * from vSourceSchedule where executorStorage_portNumber = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceScheduleDto].*);
    dtos
  }
  def getDtosByExecutorStorage_insertedRowDate(colValue : java.util.Date) : List[VSourceScheduleDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceScheduleDto] = SQL("select * from vSourceSchedule where executorStorage_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceScheduleDto].*);
    dtos
  }
  def getDtosByExecutorStorage_lastUpdatedDate(colValue : java.util.Date) : List[VSourceScheduleDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceScheduleDto] = SQL("select * from vSourceSchedule where executorStorage_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceScheduleDto].*);
    dtos
  }
  def getDtosBySourceView_sourceViewId(colValue : Long) : List[VSourceScheduleDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceScheduleDto] = SQL("select * from vSourceSchedule where sourceView_sourceViewId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceScheduleDto].*);
    dtos
  }
  def getDtosBySourceView_guid(colValue : Long) : List[VSourceScheduleDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceScheduleDto] = SQL("select * from vSourceSchedule where sourceView_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceScheduleDto].*);
    dtos
  }
  def getDtosBySourceView_sourceInstanceId(colValue : Long) : List[VSourceScheduleDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceScheduleDto] = SQL("select * from vSourceSchedule where sourceView_sourceInstanceId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceScheduleDto].*);
    dtos
  }
  def getDtosBySourceView_sourceViewTypeId(colValue : Long) : List[VSourceScheduleDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceScheduleDto] = SQL("select * from vSourceSchedule where sourceView_sourceViewTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceScheduleDto].*);
    dtos
  }
  def getDtosBySourceView_sourceViewName(colValue : String) : List[VSourceScheduleDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceScheduleDto] = SQL("select * from vSourceSchedule where sourceView_sourceViewName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceScheduleDto].*);
    dtos
  }
  def getDtosBySourceView_sourceViewDefinition(colValue : String) : List[VSourceScheduleDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceScheduleDto] = SQL("select * from vSourceSchedule where sourceView_sourceViewDefinition = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceScheduleDto].*);
    dtos
  }
  def getDtosBySourceView_insertedRowDate(colValue : java.util.Date) : List[VSourceScheduleDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceScheduleDto] = SQL("select * from vSourceSchedule where sourceView_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceScheduleDto].*);
    dtos
  }
  def getDtosBySourceView_lastUpdatedDate(colValue : java.util.Date) : List[VSourceScheduleDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceScheduleDto] = SQL("select * from vSourceSchedule where sourceView_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceScheduleDto].*);
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
    val dtos : VSourceTypeParamDto= SQL("select * from vSourceTypeParam order by insertedRowDate asc ").as(anorm.Macro.namedParser[VSourceTypeParamDto].*).head;
    dtos
  }
  def getVSourceTypeParamLast() : VSourceTypeParamDto = {
    implicit val connection = getConnection();
    val dtos : VSourceTypeParamDto= SQL("select * from vSourceTypeParam order by insertedRowDate desc ").as(anorm.Macro.namedParser[VSourceTypeParamDto].*).head;
    dtos
  }
  def getVSourceTypeParamByGuid(guid : Long) : VSourceTypeParamDto = {
    implicit val connection = getConnection();
    val dtos : VSourceTypeParamDto= SQL("select * from vSourceTypeParam where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VSourceTypeParamDto].single);
    dtos
  }
  def getDtosBySourceTypeParamId(colValue : Long) : List[VSourceTypeParamDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceTypeParamDto] = SQL("select * from vSourceTypeParam where sourceTypeParamId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceTypeParamDto].*);
    dtos
  }
  def getDtosBySourceTypeId(colValue : Long) : List[VSourceTypeParamDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceTypeParamDto] = SQL("select * from vSourceTypeParam where sourceTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceTypeParamDto].*);
    dtos
  }
  def getDtosBySourceParamId(colValue : Long) : List[VSourceTypeParamDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceTypeParamDto] = SQL("select * from vSourceTypeParam where sourceParamId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceTypeParamDto].*);
    dtos
  }
  def getDtosBySourceTypeName(colValue : String) : List[VSourceTypeParamDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceTypeParamDto] = SQL("select * from vSourceTypeParam where sourceTypeName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceTypeParamDto].*);
    dtos
  }
  def getDtosBySourceParamName(colValue : String) : List[VSourceTypeParamDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceTypeParamDto] = SQL("select * from vSourceTypeParam where sourceParamName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceTypeParamDto].*);
    dtos
  }
  def getDtosByIsRequired(colValue : Int) : List[VSourceTypeParamDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceTypeParamDto] = SQL("select * from vSourceTypeParam where isRequired = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceTypeParamDto].*);
    dtos
  }
  def getDtosByGuid(colValue : Long) : List[VSourceTypeParamDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceTypeParamDto] = SQL("select * from vSourceTypeParam where guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceTypeParamDto].*);
    dtos
  }
  def getDtosByInsertedRowDate(colValue : java.util.Date) : List[VSourceTypeParamDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceTypeParamDto] = SQL("select * from vSourceTypeParam where insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceTypeParamDto].*);
    dtos
  }
  def getDtosByLastUpdatedDate(colValue : java.util.Date) : List[VSourceTypeParamDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceTypeParamDto] = SQL("select * from vSourceTypeParam where lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceTypeParamDto].*);
    dtos
  }
  def getDtosBySourceParam_sourceParamId(colValue : Long) : List[VSourceTypeParamDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceTypeParamDto] = SQL("select * from vSourceTypeParam where sourceParam_sourceParamId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceTypeParamDto].*);
    dtos
  }
  def getDtosBySourceParam_guid(colValue : Long) : List[VSourceTypeParamDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceTypeParamDto] = SQL("select * from vSourceTypeParam where sourceParam_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceTypeParamDto].*);
    dtos
  }
  def getDtosBySourceParam_sourceParamName(colValue : String) : List[VSourceTypeParamDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceTypeParamDto] = SQL("select * from vSourceTypeParam where sourceParam_sourceParamName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceTypeParamDto].*);
    dtos
  }
  def getDtosBySourceParam_sourceParamType(colValue : String) : List[VSourceTypeParamDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceTypeParamDto] = SQL("select * from vSourceTypeParam where sourceParam_sourceParamType = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceTypeParamDto].*);
    dtos
  }
  def getDtosBySourceParam_possibleValues(colValue : String) : List[VSourceTypeParamDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceTypeParamDto] = SQL("select * from vSourceTypeParam where sourceParam_possibleValues = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceTypeParamDto].*);
    dtos
  }
  def getDtosBySourceParam_insertedRowDate(colValue : java.util.Date) : List[VSourceTypeParamDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceTypeParamDto] = SQL("select * from vSourceTypeParam where sourceParam_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceTypeParamDto].*);
    dtos
  }
  def getDtosBySourceParam_lastUpdatedDate(colValue : java.util.Date) : List[VSourceTypeParamDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceTypeParamDto] = SQL("select * from vSourceTypeParam where sourceParam_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceTypeParamDto].*);
    dtos
  }
  def getDtosBySourceType_sourceTypeId(colValue : Long) : List[VSourceTypeParamDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceTypeParamDto] = SQL("select * from vSourceTypeParam where sourceType_sourceTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceTypeParamDto].*);
    dtos
  }
  def getDtosBySourceType_guid(colValue : Long) : List[VSourceTypeParamDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceTypeParamDto] = SQL("select * from vSourceTypeParam where sourceType_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceTypeParamDto].*);
    dtos
  }
  def getDtosBySourceType_sourceTypeName(colValue : String) : List[VSourceTypeParamDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceTypeParamDto] = SQL("select * from vSourceTypeParam where sourceType_sourceTypeName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceTypeParamDto].*);
    dtos
  }
  def getDtosBySourceType_sourceTypeClass(colValue : String) : List[VSourceTypeParamDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceTypeParamDto] = SQL("select * from vSourceTypeParam where sourceType_sourceTypeClass = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceTypeParamDto].*);
    dtos
  }
  def getDtosBySourceType_insertedRowDate(colValue : java.util.Date) : List[VSourceTypeParamDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceTypeParamDto] = SQL("select * from vSourceTypeParam where sourceType_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceTypeParamDto].*);
    dtos
  }
  def getDtosBySourceType_lastUpdatedDate(colValue : java.util.Date) : List[VSourceTypeParamDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceTypeParamDto] = SQL("select * from vSourceTypeParam where sourceType_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceTypeParamDto].*);
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
    val dtos : VSourceViewDto= SQL("select * from vSourceView order by insertedRowDate asc ").as(anorm.Macro.namedParser[VSourceViewDto].*).head;
    dtos
  }
  def getVSourceViewLast() : VSourceViewDto = {
    implicit val connection = getConnection();
    val dtos : VSourceViewDto= SQL("select * from vSourceView order by insertedRowDate desc ").as(anorm.Macro.namedParser[VSourceViewDto].*).head;
    dtos
  }
  def getVSourceViewByGuid(guid : Long) : VSourceViewDto = {
    implicit val connection = getConnection();
    val dtos : VSourceViewDto= SQL("select * from vSourceView where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VSourceViewDto].single);
    dtos
  }
  def getDtosBySourceViewId(colValue : Long) : List[VSourceViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceViewDto] = SQL("select * from vSourceView where sourceViewId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewDto].*);
    dtos
  }
  def getDtosByGuid(colValue : Long) : List[VSourceViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceViewDto] = SQL("select * from vSourceView where guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewDto].*);
    dtos
  }
  def getDtosBySourceInstanceId(colValue : Long) : List[VSourceViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceViewDto] = SQL("select * from vSourceView where sourceInstanceId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewDto].*);
    dtos
  }
  def getDtosBySourceViewTypeId(colValue : Long) : List[VSourceViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceViewDto] = SQL("select * from vSourceView where sourceViewTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewDto].*);
    dtos
  }
  def getDtosBySourceViewName(colValue : String) : List[VSourceViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceViewDto] = SQL("select * from vSourceView where sourceViewName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewDto].*);
    dtos
  }
  def getDtosBySourceViewDefinition(colValue : String) : List[VSourceViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceViewDto] = SQL("select * from vSourceView where sourceViewDefinition = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewDto].*);
    dtos
  }
  def getDtosByInsertedRowDate(colValue : java.util.Date) : List[VSourceViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceViewDto] = SQL("select * from vSourceView where insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewDto].*);
    dtos
  }
  def getDtosByLastUpdatedDate(colValue : java.util.Date) : List[VSourceViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceViewDto] = SQL("select * from vSourceView where lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewDto].*);
    dtos
  }
  def getDtosBySourceInstance_sourceInstanceId(colValue : Long) : List[VSourceViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceViewDto] = SQL("select * from vSourceView where sourceInstance_sourceInstanceId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewDto].*);
    dtos
  }
  def getDtosBySourceInstance_guid(colValue : Long) : List[VSourceViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceViewDto] = SQL("select * from vSourceView where sourceInstance_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewDto].*);
    dtos
  }
  def getDtosBySourceInstance_sourceTypeId(colValue : Long) : List[VSourceViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceViewDto] = SQL("select * from vSourceView where sourceInstance_sourceTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewDto].*);
    dtos
  }
  def getDtosBySourceInstance_sourceInstanceName(colValue : String) : List[VSourceViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceViewDto] = SQL("select * from vSourceView where sourceInstance_sourceInstanceName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewDto].*);
    dtos
  }
  def getDtosBySourceInstance_errorCount(colValue : Long) : List[VSourceViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceViewDto] = SQL("select * from vSourceView where sourceInstance_errorCount = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewDto].*);
    dtos
  }
  def getDtosBySourceInstance_correctCount(colValue : Long) : List[VSourceViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceViewDto] = SQL("select * from vSourceView where sourceInstance_correctCount = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewDto].*);
    dtos
  }
  def getDtosBySourceInstance_lastStatus(colValue : String) : List[VSourceViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceViewDto] = SQL("select * from vSourceView where sourceInstance_lastStatus = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewDto].*);
    dtos
  }
  def getDtosBySourceInstance_lastConnectionDate(colValue : java.util.Date) : List[VSourceViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceViewDto] = SQL("select * from vSourceView where sourceInstance_lastConnectionDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewDto].*);
    dtos
  }
  def getDtosBySourceInstance_insertedRowDate(colValue : java.util.Date) : List[VSourceViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceViewDto] = SQL("select * from vSourceView where sourceInstance_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewDto].*);
    dtos
  }
  def getDtosBySourceInstance_lastUpdatedDate(colValue : java.util.Date) : List[VSourceViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceViewDto] = SQL("select * from vSourceView where sourceInstance_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewDto].*);
    dtos
  }
  def getDtosBySourceViewType_sourceViewTypeId(colValue : Long) : List[VSourceViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceViewDto] = SQL("select * from vSourceView where sourceViewType_sourceViewTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewDto].*);
    dtos
  }
  def getDtosBySourceViewType_guid(colValue : Long) : List[VSourceViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceViewDto] = SQL("select * from vSourceView where sourceViewType_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewDto].*);
    dtos
  }
  def getDtosBySourceViewType_sourceViewTypeName(colValue : String) : List[VSourceViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceViewDto] = SQL("select * from vSourceView where sourceViewType_sourceViewTypeName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewDto].*);
    dtos
  }
  def getDtosBySourceViewType_sourceViewTypeClass(colValue : String) : List[VSourceViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceViewDto] = SQL("select * from vSourceView where sourceViewType_sourceViewTypeClass = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewDto].*);
    dtos
  }
  def getDtosBySourceViewType_insertedRowDate(colValue : java.util.Date) : List[VSourceViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceViewDto] = SQL("select * from vSourceView where sourceViewType_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewDto].*);
    dtos
  }
  def getDtosBySourceViewType_lastUpdatedDate(colValue : java.util.Date) : List[VSourceViewDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceViewDto] = SQL("select * from vSourceView where sourceViewType_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewDto].*);
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
    val dtos : VSourceViewColumnDto= SQL("select * from vSourceViewColumn order by insertedRowDate asc ").as(anorm.Macro.namedParser[VSourceViewColumnDto].*).head;
    dtos
  }
  def getVSourceViewColumnLast() : VSourceViewColumnDto = {
    implicit val connection = getConnection();
    val dtos : VSourceViewColumnDto= SQL("select * from vSourceViewColumn order by insertedRowDate desc ").as(anorm.Macro.namedParser[VSourceViewColumnDto].*).head;
    dtos
  }
  def getVSourceViewColumnByGuid(guid : Long) : VSourceViewColumnDto = {
    implicit val connection = getConnection();
    val dtos : VSourceViewColumnDto= SQL("select * from vSourceViewColumn where guid = {guid} ").on("guid" -> guid).as(anorm.Macro.namedParser[VSourceViewColumnDto].single);
    dtos
  }
  def getDtosBySourceViewColumnId(colValue : Long) : List[VSourceViewColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceViewColumnDto] = SQL("select * from vSourceViewColumn where sourceViewColumnId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewColumnDto].*);
    dtos
  }
  def getDtosBySourceViewId(colValue : Long) : List[VSourceViewColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceViewColumnDto] = SQL("select * from vSourceViewColumn where sourceViewId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewColumnDto].*);
    dtos
  }
  def getDtosByInsertedRowDate(colValue : java.util.Date) : List[VSourceViewColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceViewColumnDto] = SQL("select * from vSourceViewColumn where insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewColumnDto].*);
    dtos
  }
  def getDtosByLastUpdatedDate(colValue : java.util.Date) : List[VSourceViewColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceViewColumnDto] = SQL("select * from vSourceViewColumn where lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewColumnDto].*);
    dtos
  }
  def getDtosByGuid(colValue : Long) : List[VSourceViewColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceViewColumnDto] = SQL("select * from vSourceViewColumn where guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewColumnDto].*);
    dtos
  }
  def getDtosByColumnName(colValue : String) : List[VSourceViewColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceViewColumnDto] = SQL("select * from vSourceViewColumn where columnName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewColumnDto].*);
    dtos
  }
  def getDtosByColumnType(colValue : String) : List[VSourceViewColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceViewColumnDto] = SQL("select * from vSourceViewColumn where columnType = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewColumnDto].*);
    dtos
  }
  def getDtosBySourceView_sourceViewId(colValue : Long) : List[VSourceViewColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceViewColumnDto] = SQL("select * from vSourceViewColumn where sourceView_sourceViewId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewColumnDto].*);
    dtos
  }
  def getDtosBySourceView_guid(colValue : Long) : List[VSourceViewColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceViewColumnDto] = SQL("select * from vSourceViewColumn where sourceView_guid = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewColumnDto].*);
    dtos
  }
  def getDtosBySourceView_sourceInstanceId(colValue : Long) : List[VSourceViewColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceViewColumnDto] = SQL("select * from vSourceViewColumn where sourceView_sourceInstanceId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewColumnDto].*);
    dtos
  }
  def getDtosBySourceView_sourceViewTypeId(colValue : Long) : List[VSourceViewColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceViewColumnDto] = SQL("select * from vSourceViewColumn where sourceView_sourceViewTypeId = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewColumnDto].*);
    dtos
  }
  def getDtosBySourceView_sourceViewName(colValue : String) : List[VSourceViewColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceViewColumnDto] = SQL("select * from vSourceViewColumn where sourceView_sourceViewName = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewColumnDto].*);
    dtos
  }
  def getDtosBySourceView_sourceViewDefinition(colValue : String) : List[VSourceViewColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceViewColumnDto] = SQL("select * from vSourceViewColumn where sourceView_sourceViewDefinition = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewColumnDto].*);
    dtos
  }
  def getDtosBySourceView_insertedRowDate(colValue : java.util.Date) : List[VSourceViewColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceViewColumnDto] = SQL("select * from vSourceViewColumn where sourceView_insertedRowDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewColumnDto].*);
    dtos
  }
  def getDtosBySourceView_lastUpdatedDate(colValue : java.util.Date) : List[VSourceViewColumnDto] = {
    implicit val connection = getConnection();
    val dtos : List[VSourceViewColumnDto] = SQL("select * from vSourceViewColumn where sourceView_lastUpdatedDate = {colValue} ").on("colValue" -> colValue).as(anorm.Macro.namedParser[VSourceViewColumnDto].*);
    dtos
  }

}
