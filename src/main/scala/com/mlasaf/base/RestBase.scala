/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.base

import com.mlasaf.rest.RestManager

/** base class for all REST objects for all methods */
trait RestBase {

  /** common logger for REST classes */
  val logger = org.slf4j.LoggerFactory.getLogger("RestBase");
  /** parent REST */
  var parentRest : RestManager = null;
  /** set parent REST*/
  def setParentRest(parent : RestManager) : Unit = {
    parentRest = parent;
  }
  /** */
  implicit def functionToRoute(fun: (spark.Request, spark.Response) => AnyRef): spark.Route = {
    new spark.Route {
      override def handle(request: spark.Request, response: spark.Response): AnyRef = {
        // response.raw().setContentType("")
        fun(request, response)
      }
    }
  }
  /** initialization for all RESTs */
  def initialize() : Unit;

}
