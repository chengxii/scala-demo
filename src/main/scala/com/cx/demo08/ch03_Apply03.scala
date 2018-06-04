package com.cx.demo08

/**
  * Scala apply方法03 创建对象demo
  *
  * Scala apply() 创建对象demo
  * Created by xi.cheng on 2018/6/4.
  */
object ch03_Apply03 {
  def main(args: Array[String]) {
    //用object  Student的apple()方法，创建对象
    Student("stu001", "zhangsan", "shandong")
  }

}

class Student(var id: String, var name: String, var addr: String) {
}

object Student {
  def apply(id: String, name: String, addr: String) = {
    println("object Student.apple()")
    new Student(id, name, addr)
  }

}
