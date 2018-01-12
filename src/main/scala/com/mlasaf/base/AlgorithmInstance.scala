/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.base

import com.mlasaf.domain.AlgorithmRun
import com.mlasaf.dto.VExecutorTypeHostParamDto

/** base class for any implementation of ML algorithm */
trait AlgorithmInstance {

  /** all configuration parameters for instance of algorithm - this could contain path to R.exe or spark commit path or spark API port or SAS user/password */
  var paramsForHostExecutorType : scala.collection.mutable.ListBuffer[VExecutorTypeHostParamDto] = new scala.collection.mutable.ListBuffer();

  def initialize() : Unit = {
    onInitialize();
  }
  /** to override - initialization if need */
  def onInitialize() : Unit = {
  }
  /** run of algorithm to produce outputs */
  def run(run : AlgorithmRun) : String = {
    // basic check
    // TODO: implement basic checks for input/output parameters for all algorithms
    // run algorithm
    onAlgorithmRun(run);
    // implement basic output from algorithm
  }
  /** to override for all algorithms */
  def onAlgorithmRun(run : AlgorithmRun) : String;


}
object AlgorithmInstance {
  val STATUS_OK = "OK";
  val STATUS_WARNING = "WARNING";
  val STATUS_ERROR = "ERROR";
  val STATUS_ERROR_INCORRECT_INPUT = "ERROR_INCORRECT_INPUT";
  val STATUS_ERROR_INCORRECT_OUTPUT = "ERROR_INCORRECT_OUTPUT";

}