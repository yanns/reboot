seq(lsSettings :_*)

name := "core"

description :=
  "Core Dispatch module wrapping sonatype/async-http-client"

libraryDependencies ++= Seq(
  "com.ning" % "async-http-client" % "1.7.0-RC1",
  "net.databinder" %% "unfiltered-netty-server" % "0.5.3" % "test"
)

crossScalaVersions :=
  Seq("2.8.0", "2.8.1", "2.8.2", "2.9.0", "2.9.0-1", "2.9.1")

version := "0.9.0-alpha1"

organization := "net.databinder.dispatch"

publishTo := Some("Scala Tools Nexus" at
  "http://nexus.scala-tools.org/content/repositories/releases/")

credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")

homepage :=
  Some(new java.net.URL("http://dispatch.databinder.net/"))
