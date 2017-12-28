/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.rest

import com.mlasaf.base.ThreadBase
import org.apache.http.{HttpRequest, HttpResponse}
import spark.Spark._;

class ContextRest extends ThreadBase  {

  var restDefaultPort : Int = 8301;
  var restAlternativePort : Int = 8305;

  implicit def functionToRoute(fun: (spark.Request, spark.Response) => AnyRef): spark.Route = {
    new spark.Route {
      override def handle(request: spark.Request, response: spark.Response): AnyRef = fun(request, response)
    }
  }
  def onRunBegin() : Unit = {
    println("Start REST for Context on port " + restDefaultPort);
    spark.Spark.port(restDefaultPort);
    spark.Spark.get("/ping", (req: spark.Request, resp: spark.Response) => "pong" );
    spark.Spark.get("/executor-instance", (req: spark.Request, resp: spark.Response) => "OK" );
    spark.Spark.init();
    println("All REST methods for Context have been initialized");
  }
  def onRun() : Unit = {
  }
  def onRunEnd() : Unit = {
  }
  def getName() : String = "CONTEXT_REST";
  def onStop() : Unit = {
    spark.Spark.stop();
    println("All REST methods for Context have been stopped");
  }

}
