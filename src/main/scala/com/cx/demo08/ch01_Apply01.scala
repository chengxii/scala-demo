package com.cx.demo08

/**
  * apply方法01 调用
  * Created by xi.cheng on 2018/6/4.
  */
object ch0_Apply02 {
  def main(args: Array[String]) {
    //调用apply()方法的方式一
    Dog.apply()
    //调用apply()方法的方式二
    Dog()
  }
}

class Dog {
}

object Dog {
  //对象中的apply()方法
  def apply(): Unit = {
    println("object Dog apply()")
  }
}
