package com.cx.demo02

/**
  * 创建对象 以及类的介绍
  * Created by xi.cheng on 2018/5/25.
  */
object ch01_Object {

  def main(args: Array[String]) {
    //创建一个Person对象,使用Person类的无参构造方法
    val p = new Person()
    println(p)
    //创建另一个Person对象,无参构造可以省略()
    val p2 = new Person
    println(p2)
    //使用对象
    p.name = "lisi"
    p.age = 18
    //p.country="usa"//错误，常量不能赋值
    println(p.age + "\t" + p.name + "\t" + p.country)
    //println(p.city)
  }
}

//用于介绍类
//类默认都是public class ,一个文件中可以有多个public class
//而java中源文件中最多只能有一个public class ,并且和源文件名相同
class Person {
  //定义常量,可以省略String
  //系统为成员常量生成getter
  val country: String = "china"
  //定义私有成员,私有成员只能在类的内部使用,其中[this]可以省略
  private[this] val city = "caoxian"
  //定义成员变量，_是占位符,_必须有,且String类型不能省略
  //系统默认为成员变量生成getter和setter
  var name: String = _
  var age: Int = _
}
