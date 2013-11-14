import play.Project._

name := "play-meetup"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  "org.webjars" %% "webjars-play" % "2.2.0", 
  "org.webjars" % "bootstrap" % "3.0.2"
)

playScalaSettings

atmosPlaySettings
