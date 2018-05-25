package com.cx.demo03

/**
  * 子类对象
  * Created by xi.cheng on 2018/5/25.
  */
object ch02_Extends {

  def main(args: Array[String]) {
    //创造子类对象
    val s1 = new Student2("zhangsan", 18)
    //子类对象可以使用继承自父类的成员变量和成员方法
    println(s1.name + "\t" + s1.age)
    s1.fun1
  }
}

class Person2(var name: String, var age: Int) {
  def fun1(): Unit = {
    print("hello world! fun1")
  }
  println("Person2 ...ok! name=" + name + ",age =" + age)
}

//子类的主构造器中一定包含父类主构造器的参数，参数的顺序不做要求
//写成class Student(name: String, age: Int) extends Person(name, age)也是可以的
//在构造子类对象的时候也是先构造它父类的那部分，因此父类的主构造器必须被调用。这一点和java是一致的
class Student2(name: String, age: Int) extends Person2(name, age) {
  println("Student2 ...ok! name=" + name + ",age =" + age)
}