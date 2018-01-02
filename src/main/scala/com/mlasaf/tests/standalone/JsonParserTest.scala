package com.mlasaf.tests.standalone

import com.mlasaf.dao.DaoFactory
import com.mlasaf.dto._
import org.json4s._
import org.json4s.native.JsonMethods._


object JsonParserTest {

  def main(args : Array[String]) : Unit = {
    println(" START ")
    val jdbcString = "jdbc:mysql://localhost:3307/mlasaf32"
    val jdbcUser =  System.getenv("MLASAF_USER");
    val jdbcPass = System.getenv("MLASAF_PASS");
    val jdbcDriver = System.getenv("MLASAF_DRIVER");

    implicit val formats = org.json4s.DefaultFormats

    val daoFactory = new DaoFactory();
    daoFactory.initialize(jdbcString, jdbcUser, jdbcPass, jdbcDriver);
    val actJson = "[" + daoFactory.daos.algorithmColumnTypeDao.getAlgorithmColumnTypesList().map(a => a.toJson()).mkString(",") + "]";
    println("ACTs: " + actJson);
    var actsObj = parse(actJson).extract[Array[AlgorithmColumnTypeDto]];
    println("actsObj: " + actsObj);

    val executorDef1 = " {\"executorType\":\"RExecutor\",\"portNumber\":8806}";
    val e1 = parse(executorDef1).extract[CEDefinition];
    println(e1);

    val executorDef2 = "  [{\"executorType\":\"RExecutor\",\"portNumber\":8806},{\"executorType\":\"LocalExecutor\",\"portNumber\":8806},{\"executorType\":\"LocalExecutor\",\"portNumber\":8877}] ";
    val e2 = parse(executorDef2).extract[Array[CEDefinition]];
    println("executors: " + e2.size + ", " +e2.map(e => e.executorType + "-" + e.portNumber).mkString(",") );

    //println(e2.executors.map(e => e.executorType + "-" + e.portNumber).mkString(" , "));
    //org.json4s.native.JsonMethods.compact(org.json4s.native.JsonMethods.render(e2));
      //org.json4s.jackson.JsonMethods.
    val mapper = new com.fasterxml.jackson.databind.ObjectMapper();
    val jsonValue = mapper.writeValueAsString(e2);

      //org.json4s.native.JsonMethods.
    //val jsonValue2= compact(render(e2));


    println("jsonValue: "  + jsonValue);
    //val mapper = new com.fasterxml.jackson.databind.ObjectMapper();
    //val execDef = mapper.readValue[CEDefinitions](executorDef2, classOf[CEDefinitions])
    //println(" execDef: " + execDef)

    println(" END ")
  }
}

case class CEDefinition(executorType : String, portNumber : Int) {}
case class CEDefinitions(executors : java.util.List[CEDefinition]) {}

class EDefinition {
  var executorType : String = "";
}
class EsDefinition {
  var executors : Seq[EDefinition] = null;
}