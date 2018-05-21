package com.cx.demo00

/**
  * Scala函数定义与调用方式
  * Created by xi.cheng on 2018/5/21.
  */
object Chapter05_Function {
  def main(args: Array[String]) {
    // 函数调用
    val i: Int = addOne(3)
    println(i)
    // 函数调用
    print()
    // 函数调用，如果无参，可以省略（）
    print
    // 
    val m = max(3, 40)
    println(m)
  }

  // 函数定义
  def addOne(m: Int): Int = m + 1

  // 函数定义
  def print() {
    println("this is a function")
  }

  def max(x: Int, y: Int) = if (x > y) x else y
}
