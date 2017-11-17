name := "mlasaf"

organization := "com.mlasaf"

scalaVersion := "2.11.8"

version := "1.0"

crossPaths := false

resolvers += "Atlassian" at "https://maven.atlassian.com/3rdparty/"
resolvers += "Atlassian Maven Repository" at "https://maven.atlassian.com/repository/public"

libraryDependencies ++= Seq(
 "net.sourceforge.jtds" % "jtds" % "1.3.1",
 "commons-collections" % "commons-collections" % "3.2.2",
 "org.apache.commons" % "commons-lang3" % "3.1",
 "commons-lang" % "commons-lang" % "2.2",
 "commons-logging" % "commons-logging" % "1.1.1",
 "commons-math" % "commons-math" % "1.2",
 "commons-codec" % "commons-codec" % "1.10",
 "org.apache.hadoop" % "hadoop-common" % "2.6.3",
 "org.apache.hadoop" % "hadoop-nfs" % "2.6.3",
 "gov.nist.math" % "jama" % "1.0.2",
 "net.sourceforge.jexcelapi" % "jxl" % "2.6.12",
 "log4j" % "log4j" % "1.2.15",
 "javax.mail" % "javax.mail-api" % "1.5.6",
 "org.postgresql" % "postgresql" % "9.4.1210",
 "javax.servlet" % "servlet-api" % "2.5",
 "tw.edu.ntu.csie" % "libsvm" % "3.17",
 "ch.qos.logback" % "logback-classic" % "1.1.7",
 "ch.qos.logback" % "logback-core" % "1.1.7",
 "net.java.dev.jna" % "jna-platform" % "4.1.0",
 "net.java.dev.jna" % "jna" % "4.1.0",
 "com.jcraft" % "jsch.agentproxy.connector-factory" % "0.0.9",
 "com.jcraft" % "jsch.agentproxy.core" % "0.0.9",
 "com.jcraft" % "jsch.agentproxy.pageant" % "0.0.9",
 "com.jcraft" % "jsch.agentproxy.usocket-jna" % "0.0.9",
 "com.jcraft" % "jsch.agentproxy.usocket-nc" % "0.0.9",
 "com.jcraft" % "jsch.agentproxy.sshagent" % "0.0.9",
 "com.jcraft" % "jsch.agentproxy.sshj" % "0.0.9",
 "org.bouncycastle" % "bcpkix-jdk15on" % "1.51",
 "com.hierynomus" % "sshj" % "0.16.0",
 "net.vrallev.ecc" % "ecc-25519-java" % "1.0.1",
 "com.veact" % "scala-ssh_2.11" % "0.8.0",
 "com.typesafe" % "config" % "1.3.1",
 "com.typesafe.scala-logging" % "scala-logging_2.11" % "3.5.0",
 "org.slf4j" % "slf4j-api" % "1.7.21",
 "net.sourceforge.jtds" % "jtds" % "1.3.1",
 "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.7.8",
 "com.fasterxml.jackson.core"   %  "jackson-databind"                 % "2.7.8",
 "org.eclipse.jetty" % "jetty-server" % "9.3.14.v20161028",
 "org.scalatest" %% "scalatest" % "3.0.0",
 "com.veact" %% "scala-ssh" % "0.8.0" exclude("net.schmizz", "sshj" /*net.schmizz:sshj:[0.8.1,) - unbounded version caused problems*/ ),
 "net.schmizz" % "sshj" % "0.10.0",
 "com.sparkjava" % "spark-core" % "2.6.0",
 "com.fasterxml.jackson.core" % "jackson-databind" % "2.0.2"
)

