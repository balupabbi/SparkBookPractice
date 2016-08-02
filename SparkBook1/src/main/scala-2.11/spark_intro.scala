/**
  * Created by I852627 on 8/1/2016.
  */
import org.apache.spark.{SparkContext, SparkConf}

object spark_intro {

  def main(args: Array[String]): Unit = {

    //println("hello world")
    val config = new SparkConf().setAppName("FirstTest").setMaster("local")
    val sc = new SparkContext(config)

    //returns rdd but this kind of code is not used in production code
    val xs = (1 to 10000).toList
    println(xs)
    val rdd = sc.parallelize(xs)
    println(rdd)

  }
}
