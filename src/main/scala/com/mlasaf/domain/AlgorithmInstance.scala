/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.domain

/** base class for any implementation of ML algorithm */
trait AlgorithmInstance {

  /** */
  def run(run : AlgorithmRun) : Unit;


}
