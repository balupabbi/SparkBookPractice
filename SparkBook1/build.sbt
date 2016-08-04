name := "SparkBook1"

version := "1.0"

scalaVersion := "2.11.5"

libraryDependencies ++= Seq(
  "org.apache.spark"	%% "spark-core"   % "1.5.2",
  "org.apache.spark"  %% "spark-mllib"  % "1.5.2",
  "org.apache.spark" %% "spark-sql" % "1.5.2",
  "com.databricks" % "spark-csv_2.11" % "1.4.0")
