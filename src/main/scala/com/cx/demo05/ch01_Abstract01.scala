package com.cx.demo05

/**
  * 抽象类01
  * Created by xi.cheng on 2018/5/25.
  */
object ch01_Abstract01 {

  def main(args: Array[String]) {
    //创建父类型引用操作子类型对象
    val p: Person = new Student
    //使用对象
    p.eat
    println(p.name + "\t" + p.age)
  }
}

//定义一个抽象类，使用abstract class
abstract class Person {
  //定义一个抽象字段
  val name: String
  //定义一个具体字段(有具体值)
  val name2: String = "person"
  //定义一个抽象字段
  var age: Int
  //定义一个具体字段(无具体值)
  var age2: Int = _

  //定义一个抽象方法,不能写abstract关键字
  def eat
}

class Student extends Person {
  //重写父类的抽象字段
  override val name: String = "zhangsan"
  //重写父类的具体字段
  override val name2: String = "stuend"
  override var age: Int = 19

  //重写父类的抽象方法，其中override可以省略
  override def eat: Unit = {
    println("student eating....")
  }
}
