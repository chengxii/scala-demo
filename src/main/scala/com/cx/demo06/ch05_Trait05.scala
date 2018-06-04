package com.cx.demo06

/**
  * Scala 的特质 （接口）05
  * Created by xi.cheng on 2018/6/4.
  */
object ch05_Trait05 {
  def main(args: Array[String]) {
    val  d = new Dugg()
  }
}
class Human{
  println("construct Human!")
}
//trait可以继承自类，Java不可以
trait Student extends  Human{
  println("construct Student!")
}
trait Teacher extends  Human{
  println("construct Teacher!")
}
//构造顺序是从左至右，但不会重复构造Human
class Dugg extends  Human with  Student with Teacher{
  println("construct Dugg!")
}