package com.cx.demo00

/**
  * Scala表达式及循环
  * Created by xi.cheng on 2018/5/21.  
  */
object Chapter04_StatementsAndLoop {
  def tes1(): Unit = {
    //scala的表达式都是有返回值的，最后一个表达式作为函数的返回值，因此函数中应避免return
    //一、以下是if语句的写法
    if (true) {
      println("good")
    }
    if (3 > 5) {
      println("yes")
    } else {
      println("no")
    }

    val score = 90
    if (score > 80) {
      println("gread 1")
    } else if (score > 70) {
      println("gread 2")
    } else {
      println("gread 3")
    }
    //二、以下是while的写法
    var i = 0
    while (i < 5) {
      println(i)
      //scala不支持i++或者++i或者--i或者i--之类的操作
      i += 1
    }

    //三、以下是for的写法
    println("****************************for[0,5]**********************************")
    //[0,5]
    for (i <- 0 to 5) {
      println(i)
    }
    println("****************************for[0,5)**********************************")
    //[0,5)
    for (i <- 0 until 5) {
      println(i)
    }
    println("****************************for中可以写多个if需要用';'分开**********************************")
    for (i <- 0 until 5; if i % 2 == 0; if i < 6) {
      println(i)
    }

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

    println("****************************for中的yield(yield用于产生循环语句的返回值)**********************************")

    val no1 = for (i <- 1 to 10) yield i
    println(no1) //Vector(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val no2 = for (i <- 1 to 10 if i % 5 == 0) yield i
    println(no2) //Vector(5, 10)

  }

  def test2(): Unit = {
    println("****************************scala中的break和countiue**********************************")
    var a = 0
    val numList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    import scala.util.control._
    val loop = new Breaks
    loop.breakable {
      for (a <- numList) {
        println("Value of a: " + a)
        if (a == 4) {
          loop.break
        }
      }
    }
    println("After the loop")
  }

  def test3(): Unit = {
    println("****************************scala中的break和countiue(循环嵌套)**********************************")
    var a = 0
    var b = 0
    val numList1 = List(1, 2, 3, 4, 5)
    val numList2 = List(11, 12, 13)
    import scala.util.control._
    val outer = new Breaks
    val inner = new Breaks
    outer.breakable {
      for (a <- numList1) {
        println("Value of a: " + a)
        inner.breakable {
          for (b <- numList2) {
            println("Value of b: " + b)
            if (b == 12) {
              inner.break
            }
          }
        } // inner breakable } } // outer breakable.
      }
    }
  }

  def main(args: Array[String]) {
    tes1()
    test2()
    test3()
  }
}
