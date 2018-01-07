/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.base

import java.util.Map

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
        val startTime = System.currentTimeMillis();
        val ret = fun(request, response);
        val executeTime : Long = System.currentTimeMillis() - startTime;
        try {
          val requestHeader = request.queryString()
          val headersStr = request.headers().toArray.mkString(",")
          val cookiesStr = "" + request.cookies().keySet().toArray.map(c => c + ":'" + request.cookie("" + c) + "'").mkString(",");
          val sessionStr = "" + request.session();
          val requestMethod = request.requestMethod();
          val requestBody = "";
          val responseBody = "";
          val clientHost = request.host();
          val protocol = request.protocol();
          // + request.body()
          // + request.protocol()
          parentRest.parentContext.daoFactory.daos.executorRestCallDao.createAndInsertExecutorRestCallDto(parentRest.parentContext.hostDto.executorHostId, parentRest.executorRestDto.executorRestId, requestMethod, requestHeader , requestBody , responseBody, executeTime, headersStr, cookiesStr, clientHost, protocol, sessionStr);
        } catch {
          case ex : Exception => {
            logger.error("Exception while inserting REST CALL: " + ex.getMessage + " ", ex);
          }
        }
        ret
      }
    }
  }
  /** initialization for all RESTs */
  def initialize() : Unit;

}
