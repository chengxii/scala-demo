package com.cx.demo06

/**
  * Scala 的特质（接口02）
  * 一个类可以extends一个类或特质后，然后with多个特质
  * 这些特质将从左至右依次被构造
  *
  * Created by xi.cheng on 2018/5/25.
  */
object ch02_Trait02 {

  def main(args: Array[String]) {
    val pig = new Pig
    pig.breath
    pig.sleep
    pig.run

  }
}

trait T0 {
  println("T0 constructed ...")

  def breath: Unit = {
    println("T0 breath")
  }
}

trait T1 {
  println("T1 constructed ...")

  def sleep: Unit = {
    println("T1 sleep")
  }
}

trait T2 {
  println("T2 constructed ...")

  def run: Unit = {
    println("T2 run")
  }
}

//一个类可以extends一个类或特质后，然后with多个特质
//这些特质将从左至右依次被构造
class Pig extends T0 with T1 with T2 {

}
