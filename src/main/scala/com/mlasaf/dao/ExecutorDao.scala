package com.mlasaf.dao


import com.mlasaf.dto._

trait ExecutorDao {

  def getExecutorTypes() : List[ExecutorTypeDto];

  def getHosts() : Seq[ExecutorHostDto];
  def registerExecutorInstance(executorTypeId : Int, guid : Long) : ExecutorInstanceDto;

}
