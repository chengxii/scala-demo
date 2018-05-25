package com.cx.demo03

/**
  * 继承关系
  * Created by xi.cheng on 2018/5/25.
  */
object ch01_Extend {

  def main(args: Array[String]) {
    //创建子类对象
    val s = new Student
    println(s.country)
    s.fun1

  }
}

class Person() {
  val country = "china"

  def fun1(): Unit = {
    print("hello world person")
  }
}

//创建一个Student类继承Person类，它将拥有Person类的成员变量和成员方法
//其中两个()可以省略
class Student() extends Person() {

}
