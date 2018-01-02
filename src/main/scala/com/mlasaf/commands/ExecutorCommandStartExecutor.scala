/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.commands

import com.mlasaf.domain._
import com.mlasaf.base._

/** */
class ExecutorCommandStartExecutor extends ExecutorCommand {

  /** run given command for context and params */
  def runCommand(ctx : Context, params : Array[String]) : Unit = {
    ctx.defineExecutor(params(0), params(1).asInstanceOf[Int]);
  }

}
