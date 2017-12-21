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
import java.sql.Connection


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






