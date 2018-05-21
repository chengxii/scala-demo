package com.cx.demo01

/**
  * Created by xi.cheng on 2018/5/21.  
  */
class ch02_StatementsDemo {

}

object ch02_StatementsDemo {
  def main(args: Array[String]) {
    fun1
    println("*********************************************************************")
    fun2
    println("*********************************************************************")
    fun3
  }

  // 用于解释if语句
  def fun1() {
    val a: Int = 1
    // scala中的if语句和java中基本一致，但是它是有返回值的，java中是没有的
    val b = if (a == 1) {
      10
    } else 20;
    println(b)
  }

  // 用于解释while循环，scala中循环是没有break和continue的
  def fun2() {
    var i = 0
    while (i < 5) {
      print(i)

      //  i++// 错误,scala中没有++,--操作
      i = i + 1
    }
    println()
  }

  // 用于解释for循环，scala中循环是没有break和continue的
  def fun3(): Unit = {

    println("****************************for[0,5]")
    // [0,5]
    for (i <- 0 to 5) {
      print(i)
    }
    println()
    println("****************************for[0,5]")
    // [0,5],0是个数字，是个对象，to是对象身上的函数，5是这个to函数的实参
    for (i <- 0.to(5)) {
      print(i)
    }
    println()
    println("****************************for[0,5)")
    // [0,5)
    for (i <- 0 until 5) {
      print(i)
    }
    println()
    println("****************************for[0,5)")
    // [0,5),0是个数字，是个对象，until是对象身上的函数，5是这个until函数的实参
    for (i <- 0.until(5)) {
      print(i)
    }
    println()
    println("****************************for[0,10]之间的偶数")
    // [0,5],scala中的for()内可以有0-N个if语句(守卫)
    for (i <- 0 to 10; if (i % 2 == 0)) {
      print(i)
    }
    println()
    println("****************************for[0,10]之间的大于2的偶数")
    // [0,5]
    for (i <- 0 to 10; if (i % 2 == 0); if (i > 2)) {
      print(i)
    }
    println()
    println("****************************for[0,10]之间的大于2小于8的偶数")
    // [0,5]
    for (i <- 0 to 10; if (i % 2 == 0); if (i > 2); if (i < 8)) {
      print(i)
    }
    println()
    println("****************************for[0,10]之间的大于2小于8的偶数")
    // [0,5]
    for (i <- 0 to 10; if (i % 2 == 0); if (i > 2 && i < 8)) {
      print(i)
    }
    println()
    println("****************************大致的for循环嵌套**********************************")
    for (i <- 0 to 5; j <- 0 to 4) {
      println("i=" + i + ",j=" + j)
    }
    println("****************************正方形打印**********************************")
    for (i <- 0 to 5) {
      for (j <- 0 to 5) {
        print("*")
      }
      println()
    }
    println("****************************for中的yield**********************************")
    val no = for (i <- "hello") yield i
    println("no=" + no) // no=hello
    val no2 = for (i <- 1 to 2) yield i.toChar
    println("no2=" + no2) // no2=Vector(,)
    val no3 = for (i <- "hello"; j <- 1 to 2) yield (i + j).toChar
    println("no3=" + no3) // no3=ijfgmnmnpq
    val no4 = for (i <- 1 to 2; j <- "hello") yield (i + j).toChar
    println("no4=" + no4) // no4=Vector(i, f, m, m, p, j, g, n, n, q)
  }
}