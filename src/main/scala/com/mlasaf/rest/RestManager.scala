/*
  Author(s): Slawomir Bankowski
  Project: mlasaf
*/
package com.mlasaf.rest

import com.mlasaf.base.ThreadBase
import com.mlasaf.loaders.CreateAlgorithmSchedule.logger
import org.apache.http.{HttpRequest, HttpResponse}
import spark.Spark._;

/** */
class RestManager extends ThreadBase  {

  /** default PORT number for REST */
  var restDefaultPort : Int = 8301;
  /** */
  var restAlternativePort : Int = 8305;
  /** */
  val daoRest : DaoRests = new DaoRests();
  /** */
  val contextRest : ContextRests = new ContextRests();
  /** */
  val createRest : CreateRests = new CreateRests();
  /** */
  val executorRest : ExecutorRests = new ExecutorRests();

    /** ROUTE METHOD for SparkJava*/
    implicit def functionToRoute(fun: (spark.Request, spark.Response) => AnyRef): spark.Route = {
      new spark.Route {
        override def handle(request: spark.Request, response: spark.Response): AnyRef = fun(request, response)
      }
    }
    /** START ALL RESTs */
    def onRunBegin() : Unit = {
      logger.info("Start REST for Context on port " + restDefaultPort);
      spark.Spark.port(restDefaultPort);
      spark.Spark.get("/ping", (req: spark.Request, resp: spark.Response) => {
        println("========================== attributes: " + req.attributes().toArray.mkString(","))
        println("========================== body: " + req.body())
        println("========================== contentLength: " + req.contentLength())
        println("========================== headers: " + req.headers().toArray.mkString(","))
        println("========================== host: " + req.host())
        println("========================== ip: " + req.ip())
        println("========================== pathInfo: " + req.pathInfo())
        println("========================== contentType: " + req.contentType())
        println("========================== contextPath: " + req.contextPath())
        println("========================== pathInfo: " + req.pathInfo())
        println("========================== port: " + req.port())
        println("========================== protocol: " + req.protocol())
        println("========================== queryString: " + req.queryString())
        println("========================== params.keySet: " + req.params().keySet().toArray().mkString(","));
        println("========================== params.values: " + req.params().values().toArray().mkString(","));
        "pong"
      } );
      spark.Spark.post("/ping", (req: spark.Request, resp: spark.Response) => {
        println("========================== attributes: " + req.attributes().toArray.mkString(","))
        println("========================== body: " + req.body())
        println("========================== contentLength: " + req.contentLength())
        println("========================== headers: " + req.headers().toArray.mkString(","))
        println("========================== host: " + req.host())
        println("========================== ip: " + req.ip())
        println("========================== pathInfo: " + req.pathInfo())
        println("========================== contentType: " + req.contentType())
        println("========================== contextPath: " + req.contextPath())
        println("========================== pathInfo: " + req.pathInfo())
        println("========================== port: " + req.port())
        println("========================== protocol: " + req.protocol())
        println("========================== queryString: " + req.queryString())
        println("========================== params.keySet: " + req.params().keySet().toArray().mkString(","));
        println("========================== params.values: " + req.params().values().toArray().mkString(","));
        "pong"

      } );
      logger.info("Initialize REST - contextRest " );
      contextRest.setParentRest(this);
      contextRest.initialize();
      logger.info("Initialize REST - createRest " );
      createRest.setParentRest(this);
      createRest.initialize();
      logger.info("Initialize REST - executorRest " );
      executorRest.setParentRest(this);
      executorRest.initialize();
      logger.info("Initialize REST - daoRest " );
      daoRest.setParentRest(this);
      daoRest.initialize();
      spark.Spark.init();
      logger.info("All REST methods for RestManager have been initialized");
    }
    def onRun() : Unit = {
    }
    def onRunEnd() : Unit = {
    }
    def getName() : String = "CONTEXT_REST";
    def onStop() : Unit = {
      spark.Spark.stop();
      logger.info("All REST methods for Context have been stopped");
    }
    def getInfoJson() : String = {
      " { restDefaultPort: " + restDefaultPort + " } "
    }

}
