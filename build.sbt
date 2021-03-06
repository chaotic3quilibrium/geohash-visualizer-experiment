enablePlugins(ScalaJSPlugin)

name := "GeohashVisualizer"

version := "0.1-SNAPSHOT"

scalaVersion := "2.12.3"

//scalaJSUseMainModuleInitializer := true

//testFrameworks += new TestFramework("utest.runner.Framework")

libraryDependencies ++= Seq(
    "org.scala-js" %%% "scalajs-dom" % "0.9.1",
    "com.lihaoyi" %%% "utest" % "0.4.5" % "test"
)