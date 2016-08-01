/**
  * Created by Bhargav on 7/31/16.
  */
class Car(mk: String, ml: String, cr: String){
  val make = mk
  val model = ml
  var color = cr

  def repaint(newColor: String) ={
    color = newColor

  }
}

object intro{

  def add(fi: Int, si: Int): Int = {
    val sum = fi + si
    return sum

  }

  def add2(fi: Int, si: Int) = fi + si

  def f(i:Int): Long ={
    val res = i *10
    return res

  }

  //Higher order function
  def encode(n: Int, f: (Int) => Long): Long = {
    val x = n*10
    f(x)
  }


  //Closure function
  def encodeWithSeed(num: Int, seed: Int): Long = {
    def encode2(x: Int, func: (Int) => Long): Long = {
      val y = x + 1000
      func(y)
    }

    val result = encode2(num,(n:Int)=>(n*seed))
    result

  }

  //Pattern matching
  def matchTest(x: Int): String = x match {
    case 1 => "one"
    case 2 => "two"
    case _ => "many"
  }

  //Option Type: It helps prevent null pointer exception
  def colorCode(color: String): Option[Int] = {
    color match {
      case "red" => Some(1)
      case "blue" => Some(2)
      case _ => None
    }
  }

  def main(args: Array[String]): Unit = {
    println("Hello from main of class")
    println(add(1,2), add2(3,4))
    val i =2
    println(encode(i,f))
    val i2 = 4
    println(encodeWithSeed(i,i2))

    //Instances
    val mustang = new Car("Ford", "Mustang", "Red")
    val corvette = new Car("GM", "Corvette", "Black")

    //Trait test
    val square = new Square(10)
    val area = square.area

    println(area)

    //Tuples = elements of different types can be grouped together
    val two = ("10", true)
    println(two)

    val first = two._1
    println(first)

    //Testing Option Type
    println(colorCode("red"))

    //Array same type mutable datastructure
    val arr = Array(10,20,30,40)
    arr(0) = 50
    val fir = arr(0)

    println(fir)

    //List same type immutable data structure
    val xs = List(10,20,30,40)
    val ys = (1 to 100).toList

    println(xs)

    //Vector hybrid of List and Array classes. Provides constant time indexed access and constant time linear access
    val v1 = Vector(0,10,20,30,40)
    val v2 = v1 :+ 50
    val v3 = v2 :+ 60
    val v4 = v3(4)
    val v5 = v3(5)
    println(v1,v2,v3,v4,v5)

    //Set is an unordered collection of distinct element. No duplicates. No access by index. Supports contains and isEmpty functions
    val fruits = Set("apple", "orange", "pear", "banana")
    println(fruits)

    //Map is collection of key-value pairs. Known as a dictionary(hasmap). Map refers to an operation on a collection
    val capitals = Map("USA" -> "Washington D.C.", "UK" -> "London", "India" -> "New Delhi")
    val indiaCapital = capitals("India")
    println(capitals, indiaCapital)

    //map method and different ways of calling it
    val xs1 = List(1,2,3,4)
    val ys1 = xs.map((x:Int) => x * 10.0)
    val ys2 = xs map {(x:Int) => x * 10.0}
    val ys3 = xs map {_ * 10.0}
    println(xs1, ys1, ys2,ys3)

    //flatMap is similar to map. However generates a collection for each element in the original collection. URL: http://alvinalexander.com/scala/collection-scala-flatmap-examples-map-flatten
    val line = "Scala is fun"
    val SingleSpace = " "
    val words = line.split(SingleSpace)
    val arrayOfChars = words flatMap{_.toList}
    println(words.length,arrayOfChars.length)//check if there is a way to display it

    //filter
    val xs2 = (1 to 100).toList
    val even = xs2 filter {_ %2 == 0}
    println(xs2,even)

    //foreach
    val words1 = "Scala is fun".split(" ")
    words1.foreach(println)

    //reduce is very useful
    val t = List(2,4,6,8,10)
    val sum = t reduce{(x,y) => x + y}
    val product = t reduce{(x,y) => x * y}
    val max = t reduce {(x,y) => if (x>y) x else y}
    val min = t reduce {(x,y) => if (x<y) x else y}
    println(sum,product, max, min)

    val words2 = "Scala is fun".split(" ")
    val longestWord = words reduce {(w1,w2) => if(w1.length > w2.length) w1 else w2}
    println(longestWord)

  }
}
