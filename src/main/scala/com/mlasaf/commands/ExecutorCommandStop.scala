/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.commands

import com.mlasaf.base._
import com.mlasaf.domain.Context

/** stop command for context */
class ExecutorCommandStop extends ExecutorCommand {

  /** run given command for context and params */
  def runCommand(ctx : Context, params : Array[String]) : Unit = {
    ctx.isStopped = true;
  }


}
