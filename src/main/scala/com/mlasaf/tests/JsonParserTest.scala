package com.mlasaf.tests

import org.json4s.native.JsonMethods._
import org.json4s.Formats._

object JsonParserTest {

  def main(args : Array[String]) : Unit = {
    println(" START ")
    implicit val formats = org.json4s.DefaultFormats
    val executorDef1 = " {\"executorType\":\"RExecutor\",\"portNumber\":8806}";
    val e1 = parse(executorDef1).extract[CEDefinition];
    println(e1);

    val executorDef2 = "  [{\"executorType\":\"RExecutor\",\"portNumber\":8806},{\"executorType\":\"LocalExecutor\",\"portNumber\":8806}] ";
    val e2 = parse(executorDef2).extract[Array[CEDefinition]];
    println("executors: " + e2.size + ", " +e2.map(e => e.executorType + "-" + e.portNumber).mkString(",") );
    //println(e2.executors.map(e => e.executorType + "-" + e.portNumber).mkString(" , "));
    //org.json4s.native.JsonMethods.compact(org.json4s.native.JsonMethods.render(e2));

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