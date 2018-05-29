package com.cx.demo06

/**
  * Scala 的特质 （接口）01
  * Created by xi.cheng on 2018/5/25.
  */
object ch01_Trait01 {

  def main(args: Array[String]) {
    //创建对象
    var animal: Animal = new Dog
    //使用对象的字段
    println(animal.name + "\t" + animal.age + "\t" + animal.weight)
    //使用对象的方法
    animal.sleep
    animal.run

    println("*****************************************")
    //创建对象
    animal = new Cat
    //使用对象的字段
    println(animal.name + "\t" + animal.age + "\t" + animal.weight)
    //使用对象的方法
    animal.sleep
    animal.run

  }
}

//定义一个trait，代表一种特质,可以将它理解为java8中的接口
//特质是抽象的概念是不能直接创建实例的
trait Animal {
  //特质中定义了两个抽象的成员字段
  val name: String
  var age: Int
  //特质中定义了一个具体的成员字段（可以有具体字段）
  val weight = 18


  //特质中可以有具体方法
  def sleep(): Unit = {
    println("animal runing... !")
  }

  //特质中也可以有抽象的方法
  def run
}

//一个类去继承一个特质，就用有了这个特质的方法和字段
class Dog extends Animal {
  //特质中的抽象变量必须被重写，不然类要变成抽象类,override可以省略
  override val name: String = "wangcai"
  override var age: Int = 3

  //特质中的抽象方法要被重写，不然类要变成抽象类,override可以省略
  override def run: Unit = {
    println("dog runing...")
  }
}

//一个类必须先extends一个类后，才能with一个特质
class Cat extends Object with Animal {
  //特质中的抽象变量必须被重写，不然类要变成抽象类,override可以省略
  override val name: String = "ketty"
  override var age: Int = 5

  //特质中的抽象方法要被重写，不然类要变成抽象类,override可以省略
  override def run: Unit = {
    println("cat running ......")
  }
}