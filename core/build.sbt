name := "dispatch-core"

unmanagedSourceDirectories in Compile <++= (scalaBinaryVersion, baseDirectory) { (sv, bd) =>
    sv match {
      case "2.10" => Seq(bd / "src" / "main" / ("scala-2.10"))
      case _ => Seq(bd / "src" / "main" / ("scala-2.9"))
    }
}

description :=
  "Core Dispatch module wrapping sonatype/async-http-client"

libraryDependencies ++= Seq(
  "com.ning" % "async-http-client" % "1.7.5",
  "com.typesafe.akka" % "akka-actor" % "2.0.3"
)

seq(lsSettings :_*)
