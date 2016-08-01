/**
  * Created by Bhargav on 7/31/16.
  */
trait Shape {

}


class Square(length: Int) extends Shape{
  def area = length * length
}

class Rectangle(length: Int, width: Int) extends Shape {
  def area = length * width
}

//val square = new Square(10)
//val area = square.area
//
//println(area)