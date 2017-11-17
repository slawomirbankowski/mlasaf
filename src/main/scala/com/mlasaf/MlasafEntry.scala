/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf

import com.mlasaf.domain._

object MlasafEntry {

  def main(args : Array[String]) = {
    println("START MLASAF");

    val context = new Context();
    context.run(args);

    println("End MLASAF");
  }

}
