/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.sources

import java.util

import com.mlasaf.domain._
import anorm.{SQL, SqlParser}
import com.mlasaf.dto.TableDetailDto
import com.mlasaf.dto._

class JdbcSource extends Source {

  var jdbcString : String = "";
  var jdbcUser : String = "";
  var jdbcPass : String = "";
  var jdbcDriver : String = "";

  def createConnection() : java.sql.Connection = {
    val connection = java.sql.DriverManager.getConnection(jdbcString, jdbcUser, jdbcPass);
    connection
  }
  override def getSourceViews() : Array[SourceViewDto] = {
    val existingViews = parentContext.daoFactory.daos.sourceViewDao.getSourceViewByFkSourceInstanceId(vSourceDto.sourceInstanceId);
    println("Got previous source views for source: " + vSourceDto + ", views: " + existingViews.size);
    val checkedSourceViewsDtos = new util.LinkedList[SourceViewDto]()
    try {
      println("Try to get source views for source: " + vSourceDto);
      implicit val connection = createConnection();
      val tables = SQL("select * from INFORMATION_SCHEMA.TABLES").as[List[TableDetailDto]](anorm.Macro.namedParser[TableDetailDto].*);
      println("Got all views from Source, count: " + tables.size + "");
      tables.foreach(tab => {
        val fullViewName = tab.TABLE_SCHEMA + "." + tab.TABLE_NAME;
        val sourceViewDefinition = "SOURCE_TYPE='" + vSourceDto.sourceType_sourceTypeName + "',TABLE_SCHEMA='" + tab.TABLE_SCHEMA + "',TABLE_NAME='" + tab.TABLE_NAME + "',TABLE_CATALOG=" + tab.TABLE_CATALOG + ",TABLE_TYPE='" + tab.TABLE_TYPE + ";";
        //InsertSourceViewDto.
        val srcViewDto = com.mlasaf.dto.SourceViewDto.createNewSourceViewDto(vSourceDto.sourceInstanceId, 1, fullViewName, sourceViewDefinition);
        //val srcViewDto = parentContext.daoFactory.daos.sourceViewDao.createAndInsertSourceViewDto(vSourceDto.sourceInstanceId, 1, fullViewName, sourceViewDefinition);
        checkedSourceViewsDtos.add(srcViewDto);
      });
    } catch {
      case ex : Exception => { null }
    }
    val existingViewsNames = existingViews.map(v => v.sourceViewName);
    val sourceViewsToInsert = checkedSourceViewsDtos.toArray(new Array[SourceViewDto](0)).filter(sv => !existingViewsNames.contains(sv.sourceViewName));
    println("Source views to be inserted to CFG DB: " + sourceViewsToInsert.size)
    sourceViewsToInsert.foreach(d => {
      parentContext.daoFactory.daos.sourceViewDao.insertSourceViewDto(d);
    });
    views = checkedSourceViewsDtos.toArray(new Array[SourceViewDto](0));
    views
  }
  def onInitialize() : Unit = {
    // get tables
    jdbcString = this.vSourceParamsDtos.filter(p => p.sourceParam_sourceParamName.equals("Connection String")).head.paramValue;
    jdbcUser = this.vSourceParamsDtos.filter(p => p.sourceParam_sourceParamName.equals("User")).head.paramValue;
    jdbcPass = this.vSourceParamsDtos.filter(p => p.sourceParam_sourceParamName.equals("Password")).head.paramValue;
    jdbcDriver = this.vSourceParamsDtos.filter(p => p.sourceParam_sourceParamName.equals("Driver Class")).head.paramValue;
  }
  def downloadView(viewDto : VSourceViewDto) : SouceViewDownloader = {
    val connection = createConnection();
    val downloader = new JdbcSouceViewDownloader();
    downloader.setParameters(connection, viewDto);
    downloader
  }
}

class JdbcSouceViewDownloader extends SouceViewDownloader {

  var connection : java.sql.Connection = null;
  var viewDto : VSourceViewDto = null;
  var rs : java.sql.ResultSet = null;
  var headerRow : IndexedSeq[String] = null;
  var isClosed : Boolean = false;

  def setParameters(conn : java.sql.Connection, vdto : VSourceViewDto): Unit = {
    connection = conn;
    viewDto = vdto;
  }
  def initialize(): Unit = {
    val sql = "select * from " + viewDto.sourceViewName;
    rs = connection.prepareStatement(sql).executeQuery();
    headerRow = (1 to rs.getMetaData.getColumnCount).map(i => rs.getMetaData.getColumnName(i));
    println("Got header row: " + headerRow.mkString(","));
  }
  def getHeaderRow() : IndexedSeq[String] = {
    headerRow;
  }
  def getNextRow() : Option[IndexedSeq[AnyRef]]= {
    if (isClosed) {
      None
    } else {
      if (rs.next()) {
        val row = (1 to rs.getMetaData.getColumnCount).map(i => rs.getObject(i));
        Some(row);
      } else {
        isClosed = true;
        None;
      }
    }
  }
  def close(): Unit = {
    connection.close();
  }

}