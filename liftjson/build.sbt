name := "dispatch-lift-json"

description :=
  "Dispatch module providing lift json support"

seq(lsSettings :_*)

libraryDependencies <++= scalaVersion( sv =>
  Seq(sv.split("[.-]").toList match {
    case "2" :: "9" :: _ =>
      "net.liftweb" % "lift-json_2.9.1" % "2.4"
    case _ => "net.liftweb" % "lift-json_2.9.1" % "2.4"
  }, "net.databinder" %% "unfiltered-json" % "0.6.1" % "test" cross CrossVersion.binaryMapped {
                                                                                                                                   case "2.10.0-RC3" => "2.9.2"
                                                                                                                                   case x => x
                                                                                                                                 })
)
