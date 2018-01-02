/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.base

import com.mlasaf.domain.AlgorithmRun

/** base class for any implementation of ML algorithm */
trait AlgorithmInstance {

  /** run of algorithm to produce outputs */
  def run(run : AlgorithmRun) : String;

}
object AlgorithmInstance {
  val STATUS_OK = "OK";
  val STATUS_WARNING = "WARNING";
  val STATUS_ERROR = "ERROR";
  val STATUS_ERROR_INCORRECT_INPUT = "ERROR_INCORRECT_INPUT";
  val STATUS_ERROR_INCORRECT_OUTPUT = "ERROR_INCORRECT_OUTPUT";

}