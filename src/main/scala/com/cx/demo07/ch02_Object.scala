package com.cx.demo07

import com.cx.demo08

/**
  * Scala 单例对象
  * Created by xi.cheng on 2018/6/4.
  */
object ch02_Object {
  def main(args: Array[String]) {
    for (j <- 1 to 5) {
      demo08.Dog.icre
    }
    println(demo08.Dog.i)
  }
}

class Dog {

}

//此对象就是一个单例对象
object Dog {
  var i = 0

  def icre: Unit = {
    i += 1
  }
}
