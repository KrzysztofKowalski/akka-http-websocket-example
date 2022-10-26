name := "akka-http-websocket-example"

version := "0.1"

scalaVersion := "2.13.10"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-http" % "10.4.0",
  "com.typesafe.akka" %% "akka-stream" % "2.7.0",

  // TEST
  "org.scalatest" %% "scalatest" % "3.2.14" % Test,
  "com.typesafe.akka" %% "akka-http-testkit" % "10.4.0" % Test,
  // https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream-testkit
  "com.typesafe.akka" %% "akka-stream-testkit" % "2.7.0" % Test

)