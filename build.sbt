lazy val root = (project in file(".")).
  settings(
    name := "PrimeFactorsKata",
    version := "1.0",
    scalaVersion := "2.11.5"
  )

libraryDependencies ++= Seq(
  "junit" % "junit" % "4.10" % Test,
  "org.assertj" % "assertj-core" % "3.3.0" % Test)

