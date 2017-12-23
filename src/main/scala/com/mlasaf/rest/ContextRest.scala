/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.rest

import org.apache.http.{HttpRequest, HttpResponse}
import spark.Spark._;

class ContextRest {

  implicit def functionToRoute(fun: (spark.Request, spark.Response) => AnyRef): spark.Route = {
    new spark.Route {
      override def handle(request: spark.Request, response: spark.Response): AnyRef = fun(request, response)
    }
  }
  def start() : Unit = {
    spark.Spark.get("/ping", (req: spark.Request, resp: spark.Response) => "OK" );
    spark.Spark.init();
    //spark.Spark.get("" new spark.RouteImpl());
  }


}
