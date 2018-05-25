package com.cx.demo04

/**
  * 多态02
  * Created by xi.cheng on 2018/5/25.
  */
object ch02_Overrider02 {

  def main(args: Array[String]) {
    //创造子类对象
    val dog2 = new Dog2
    println(dog2.name+ "\t" + dog2.age)
    //多态，父类型引用操纵子类型对象,这一点和java不一样，java中成员变量是不参与重写的
    val a2: Animal2 = new Dog2
    println(a2.name + "\t" + a2.age)
  }
}

class Animal2 {
  val name = "ketty"
  val age = 3
}

class Dog2 extends Animal2 {

  //override关键字用于标示子类重写父类的成员变量
  //val name="zhangsan"//错误，此成员变量以从父类继承而来
  override val name = "mikky"
}
