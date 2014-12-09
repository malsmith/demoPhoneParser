import sbt._

import Keys._

EclipseKeys.withSource := true

// import com.github.retronym.SbtOneJar._

oneJarSettings

version := "1.0"

name := "phonecleaner"

scalaVersion := "2.10.4"

// mainClass in oneJar := Some("com.paychex.nssproject.Util")

// libraryDependencies += "postgresql" % "postgresql" % "9.1-901.jdbc4"

// libraryDependencies += "com.force.api" % "force-wsc" % "30.0.0"

// libraryDependencies += "joda-time" % "joda-time" % "2.3"

// libraryDependencies += "joda-time" % "joda-time" % "2.3"

// libraryDependencies += "org.joda" % "joda-convert" % "1.6"

libraryDependencies += "log4j" % "log4j" % "1.2.17"

libraryDependencies += "net.sourceforge.jtds" % "jtds" % "1.3.1"

// libraryDependencies += "com.force.api" % "force-partner-api" % "29.0.0"

libraryDependencies += "commons-codec" % "commons-codec" % "1.9"

// libraryDependencies += "org.springframework" % "spring-jdbc" % "4.0.5.RELEASE"

libraryDependencies += "com.googlecode.libphonenumber" % "libphonenumber" % "7.0.1"

libraryDependencies += "com.googlecode.libphonenumber" % "prefixmapper" % "2.18"

libraryDependencies += "com.googlecode.libphonenumber" % "geocoder" % "2.18"

libraryDependencies += "com.googlecode.libphonenumber" % "carrier" % "1.8"

libraryDependencies +=  "org.apache.commons" % "commons-csv" % "1.0"

// libraryDependencies += "org.clapper" %% "scalasti" % "2.0.0"

libraryDependencies ++= Seq(
  "com.fasterxml.jackson.core" % "jackson-core" % "2.1.1",
  "com.fasterxml.jackson.core" % "jackson-annotations" % "2.1.1",
  "com.fasterxml.jackson.core" % "jackson-databind" % "2.1.1",
  "com.fasterxml.jackson.module" % "jackson-module-scala_2.10" % "2.4.2",
  "com.fasterxml.jackson.dataformat" % "jackson-dataformat-yaml" % "2.1.1"
)

libraryDependencies += "net.sf.opencsv" % "opencsv" % "2.3"
