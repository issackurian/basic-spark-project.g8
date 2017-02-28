name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "$scala_version$"

resolvers ++= Seq("cloudera" at "https://repository.cloudera.com/artifactory/cloudera-repos/")

libraryDependencies ++= Seq(
  "org.scalatest"     %% "scalatest"  % "2.2.4",
  "org.scalacheck"    %% "scalacheck" % "1.12.5",

  "com.github.scopt" %% "scopt"           % "3.5.0",
  "com.typesafe"      % "config"          % "1.3.1",

  "org.apache.hadoop" % "hadoop-common"   % "2.7.0" excludeAll ExclusionRule(organization = "javax.servlet"), // to avoid conflict with spark dependency

  "org.apache.spark"  % "spark-core" % "2.1.0",
  "org.apache.spark"  % "spark-sql"  % "2.1.0",
  "org.apache.spark"  % "spark-hive" % "2.1.0",
  "org.apache.spark"  % "spark-yarn" % "2.1.0",

  "com.holdenkarau"   %% "spark-testing-base" % "2.0.0_0.6.0" excludeAll ExclusionRule(organization = "javax.servlet"),
  //"com.databricks"    % "spark-csv_2.10"  % "1.4.0",
  "com.databricks"    %% "spark-avro" % "3.0.1" excludeAll ExclusionRule(organization = "javax.servlet")

)


initialCommands := "import $organization$.$name;format="lower,word"$._"

