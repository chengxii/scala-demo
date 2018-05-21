package com.cx.demo00

/**
  * Scala 常量、变量的使用以及各类型的申明
  * Created by xi.cheng on 2018/5/21.
  */
object Chapter02_TypeAndValue {
  def main(args: Array[String]): Unit = {
    //  一、这里演示的是常量的使用
    //  val用于定义常量，常量的类型为Int ,初始值为18
    val age: Int = 18
    println(age)
    //  常量的类型可以省略，scala有类型推断机制
    val score = 59
    println(score)
    //  不可以对变常量进行赋值操作
    //  score=60;

    //  二、这里演示的是变量的使用
    //  用var 定义变量，变量名称为age2,变量的值为20
    var age2: Int = 20
    println(age2)
    //  对变量进行赋值操作
    age2 = 22
    println(age2)
    //  变量的类型也可以省略(如果变量没有赋值操作，可以将其定义为常量)
    var score2 = 88
    println(score2)

    // 三、连续声明
    // 连续定义三个常量
    val i, j, k = 7
    println("i=" + i + ",j=" + j + ",k=" + k)
    // 连续定义三个变量
    var a, b, c = 17
    println("i=" + i + ",j=" + j + ",k=" + k)

    // 四、其他类型的声明
    // scala的类型有 Byte,Short,Int,Long,Float,Double,Boolean,Char,String(是java的)
    // 1.整形的声明
    val bt: scala.Byte = 8
    println(bt)
    val sh: scala.Short = 9
    println(sh)
    val in: scala.Int = 10
    println(in)
    val lo: scala.Long = 10
    println(lo)
    val lol: scala.Long = 10L
    println(lol)
    val lol2: scala.Long = 10l
    println(lol2)
    // 2.浮点型声明如下
    val de: scala.Double = 1.0
    println(de)
    // Float类型后面必须用F或f
    val fl: scala.Float = 2.0f
    println(fl)
    // 3.Boolean类型声明如下
    val bo: scala.Boolean = true
    println(bo)
    // 4.Char类型声明如下
    val chr: scala.Char = 'g'
    println(chr)
    // 5.String类型声明如下(scala没有String类型，直接使用的是java.lang.String)
    val str: String = "zhangsan"
    println(str)
    // 五、字面值也是对象
    val ii = (-2.7).abs
    println(ii)
  }
}
