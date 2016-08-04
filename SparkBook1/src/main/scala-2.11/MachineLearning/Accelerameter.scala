package MachineLearning

/**
  * Created by Bhargav on 8/2/16.
  */

import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.mllib.linalg._
import org.apache.spark.sql.SQLContext
import org.apache.spark.sql.types.{IntegerType, StringType, StructField, StructType};

class Accelerameter {

}


object test1{
  def main(args: Array[String]): Unit = {
//    val denseVector = Vectors.dense(1.0, 0.0, 3.0)
//    println(denseVector)

    //println("hello world")
    val config = new SparkConf().setAppName("FirstTest").setMaster("local")
    val sc = new SparkContext(config)

    val sqlContext = new SQLContext(sc)
    val df = sqlContext.read
      .format("com.databricks.spark.csv")
      .load("/Users/Bhargav/Documents/Datasets/Accelerameter_data/1.csv")

    println(df.show(5))

  }
}
