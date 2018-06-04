package com.cx.demo06

/**
  * Scala 重写冲突
  *
  * 如果一个类混入的多个特质，切这些特质中有同名方法，造成冲突
  * 那么解决这个方法冲突的办法是重写冲突的方法。（冲突变量也是如此）
  * 抽象方法和抽象字段都必须重写，因此它们中有冲突的成员字段和成员方法
  * 其解决办法也是重写
  * Created by xi.cheng on 2018/6/4.
  */
object ch04_Trait04 {
  def main(args: Array[String]) {
    //创建对象
    val v1 = new ZZ
    //使用对象
    v1.t1
    println(v1.name + "\t" + v1.age)
  }
}

trait AA {
  val name = "aa"
  var age: Int

  def t1: Unit = {
    println("AA   t1....")
  }
}

trait BB {
  val name = "bb"
  var age: Int

  def t1: Unit = {
    println("BB  t1....")
  }
}


class ZZ extends Object with AA with BB {
  //重写冲突成员常量
  override val name = "zz"
  //重写冲突成员变量,必须是抽象的成员变量才能重写，具体的成员变量不能重写
  override var age: Int = 10

  //重写冲突成员方法
  override def t1: Unit = {
    println("ZZ  t1....")
  }
}
