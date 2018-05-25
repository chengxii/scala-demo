package com.cx.demo04

/**
  * 多态01
  * Created by xi.cheng on 2018/5/25.
  */
object ch01_Overrider01 {

  def main(args: Array[String]) {
    //创造子类对象
    val dog = new Dog
    dog.run
    //多态，父类型引用操纵子类型对象
    val a: Animal = new Dog
    a.run
  }
}

class Animal {
  def run(): Unit = {
    println("animal run")
  }
}

class Dog extends Animal {

  //override关键字用于标示子类重写父类的方法
  override def run(): Unit = {
    println("dog run")
  }
}
