name := "mlasaf"

organization := "com.mlasaf"

scalaVersion := "2.11.8"

version := "0.1.0"

crossPaths := false

resolvers += "Atlassian" at "https://maven.atlassian.com/3rdparty/"
resolvers += "Atlassian Maven Repository" at "https://maven.atlassian.com/repository/public"
resolvers += "bigtoast-github" at "http://bigtoast.github.com/repo/"
resolvers += "Sonatype release repository" at "https://oss.sonatype.org/content/repositories/releases/"

libraryDependencies ++= Seq(
 "net.sourceforge.jtds" % "jtds" % "1.3.1",
 "org.postgresql" % "postgresql" % "9.4.1210",

 "org.slf4j" % "slf4j-api" % "1.7.21",
 "log4j" % "log4j" % "1.2.17",

 "net.sourceforge.jexcelapi" % "jxl" % "2.6.12",

 "commons-collections" % "commons-collections" % "3.2.2",
 "org.apache.commons" % "commons-lang3" % "3.1",
 "commons-lang" % "commons-lang" % "2.2",
 "commons-logging" % "commons-logging" % "1.1.1",
 "commons-math" % "commons-math" % "1.2",
 "commons-codec" % "commons-codec" % "1.10",
 "commons-dbcp" % "commons-dbcp" % "1.4",
 "commons-io" % "commons-io" % "2.6",
"com.google.guava" % "guava" % "23.4-jre",

 "org.apache.hadoop" % "hadoop-common" % "2.6.3",
 "org.apache.hadoop" % "hadoop-nfs" % "2.6.3",
 "gov.nist.math" % "jama" % "1.0.2",

 "javax.mail" % "javax.mail-api" % "1.5.6",
 "com.microsoft.sqlserver" % "sqljdbc4" % "4.0" % "test",
 //"com.oracle.jdbc" % "ojdbc8" % "12.2.0.1",
 "mysql" % "mysql-connector-java" % "5.1.16",

 "tw.edu.ntu.csie" % "libsvm" % "3.17",
 "ch.qos.logback" % "logback-classic" % "1.1.7",
 "ch.qos.logback" % "logback-core" % "1.1.7",
 "net.java.dev.jna" % "jna-platform" % "4.1.0",
 "net.java.dev.jna" % "jna" % "4.1.0",

 "javax.servlet" % "servlet-api" % "2.5",
 "com.sparkjava" % "spark-core" % "2.6.0",
 "org.eclipse.jetty" % "jetty-server" % "9.3.14.v20161028",

 "org.bouncycastle" % "bcpkix-jdk15on" % "1.51",
 "com.hierynomus" % "sshj" % "0.16.0",
 "net.vrallev.ecc" % "ecc-25519-java" % "1.0.1",
 "com.veact" % "scala-ssh_2.11" % "0.8.0",
 "com.typesafe" % "config" % "1.3.1",
 "com.typesafe.scala-logging" % "scala-logging_2.11" % "3.5.0",
 "com.lucidchart" %% "relate" % "2.0.1",

 "com.typesafe.play" % "anorm_2.11" % "2.5.1",

 "net.sourceforge.jtds" % "jtds" % "1.3.1",
 "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.7.8",
 "com.fasterxml.jackson.core"   %  "jackson-databind"  % "2.7.8",

 "org.scalatest" %% "scalatest" % "3.0.0",
 "com.veact" %% "scala-ssh" % "0.8.0" exclude("net.schmizz", "sshj" /*net.schmizz:sshj:[0.8.1,) - unbounded version caused problems*/ ),
 "net.schmizz" % "sshj" % "0.10.0",

 "com.fasterxml.jackson.core" % "jackson-databind" % "2.0.2",

"com.jcraft" % "jsch.agentproxy.connector-factory" % "0.0.9",
"com.jcraft" % "jsch.agentproxy.core" % "0.0.9",
"com.jcraft" % "jsch.agentproxy.pageant" % "0.0.9",
"com.jcraft" % "jsch.agentproxy.usocket-jna" % "0.0.9",
"com.jcraft" % "jsch.agentproxy.usocket-nc" % "0.0.9",
"com.jcraft" % "jsch.agentproxy.sshagent" % "0.0.9",
"com.jcraft" % "jsch.agentproxy.sshj" % "0.0.9"

)
