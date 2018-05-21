package com.cx.demo01

/**
  * Scala函数
  * Created by xi.cheng on 2018/5/21.  
  */
class ch01_FunDemo {

}

object ch01_FunDemo {
  // 在scala中函数是一等公民，你甚至可以将它赋值给一个常量
  // val sum声明了一个常量，(a: Int ,b: Int)=>a+b是一个匿名函数
  val sum = (a: Int, b: Int) => a + b

  // main方法
  def main(args: Array[String]) {
    // 第一条输出语句
    print("hello scala main");
    // 第二条输出语句,语句的结尾;可以省略
    println("hello scala main")
    // 调用fun1
    fun1()
    // 调用fun1,如果函数定义时无参，()可以省略不写
    fun1
    // 调用fun2
    fun2
    // 调用fun3
    fun3
    // 调用fun4
    fun4("jack")
    // 调用fun5,并打印结果
    println(fun5(5, 5))
    // 调用fun6,并打印结果
    println(fun6(6, 6))
    // 调用fun7,并打印结果
    println(fun7(7, 7))
    // 调用fun8,并打印结果
    println(fun8(8, 8))
    // 打印常量sum
    println(sum(9, 9))
    // 调用fun10,并打印结果,柯里化的函数调用每个参数都要用()传递
    println(fun10(10)(10))
    // 调用fun11,并打印结果,用柯里化函数定义的函数，只需传递未知参数
    println(fun11(11))
    // 调用fun12,并打印结果
    println(fun12(12)(12)(12)(12))
    // 调用fun13,并打印结果
    println(fun13(13)(13)(13))
    // 调用fun14,并打印结果
    println(fun14(14)(14))
    // 调用fun15,并打印结果
    println(fun15(15))
    // 调用fun16
    fun16("jack", "lily", "tom")
    // 调用fun17
    fun17(17, "jack", "lily", "tom")
    // 调用fun18，掉用时不传参，将采用参数的默认值,但此时()不能省略
    fun18()
    // 调用fun18，调用是传参数，将采用你传的值
    fun18(19, "lisi", "male")
    // 调用fun18，也可以前部分传参，后部分使用默认值
    fun18(20, "m")
    fun18(21)
    // 调用fac，函数递归调用必须指明返回值类型
    println(fac(10))

  }

  // 定义函数fun1
  def fun1(): Unit = {
    println("hello scala fun1")
  }

  // 定义函数fun2,如果没有返回值，: Unit =也可以省略
  def fun2() {
    println("hello scala fun2")
  }

  // 定义函数fun3,没有入参，定义时()也可以省略
  def fun3 {
    println("hello scala fun3")
  }

  // 定义函数fun4,入参的写法需要注意name: String对应参数名称:参数类型
  def fun4(name: String) {
    println("hello scala fun4 " + name)
  }

  // 定义函数fun5,入参有多个用,分割。有返回值,可以用return
  def fun5(a: Int, b: Int): Int = {
    return a + b
  }

  // 定义函数fun6,return 可以省略。scala中最后一个语句或最后一个语句块就是返回值。
  def fun6(a: Int, b: Int): Int = {
    a + b
  }

  // 定义函数fun7,入参列表为(a: Int ,b: Int)，函数体为{a+b}
  // 匿名函数用=>,不能有返回值类型
  def fun7 = (a: Int, b: Int)=> {
    a + b
  }

  // 定义函数fun8,如果函数体中只有一句,{}也可以省略
  def fun8 = (a: Int, b: Int) => a + b

  // 定义函数fun10,(a: Int)(b: Int)这种写法是函数的柯里化
  def fun10(a: Int)(b: Int) = a + b

  // 定义函数fun11,此函数由fun10推导而来，大致相当于
  // denf fun11(b:Int)=11+b
  def fun11 = fun10(11) _


  // 定义函数fun12
  def fun12(a: Int)(b: Int)(c: Int)(d: Int) = a + b + c + d

  // 定义函数fun13，此函数由fun12推导而来，大致相当于
  // def fun13(b: Int,c: Int,d: Int)=13+b+c+d
  def fun13 = fun12(13) _

  // 定义函数fun14，此函数由fun12推导而来，大致相当于
  // def fun14(c: Int,d: Int)=14+14+c+d
  def fun14 = fun12(14)(14) _

  // 定义函数fun15，此函数由fun12推导而来，大致相当于
  // def fun15(d: Int)=15+15+15+d
  def fun15 = fun12(15)(15)(15) _
  // 定义函数fun16，names是一个数组，相当于java中的可变参数,可变参数必须是最后一个参数
  def fun16(names: String*) {
    println(names)
  }

  // 定义函数fun17，可变参数在参数列表中只能在最后
  def fun17(i: Int, names: String*) {
    println(i + "\t" + names)
  }

  // 定义函数fun18，函数参数可以有默认值
  def fun18(age: Int = 18, name: String = "zhangsan", sex: String = "female") {
    println(age + "\t" + name + "\t" + sex)
  }
  // 函数递归调用必须指明返回值类型
  def fac(c:Int):Int=if (c<0)20*c else fac(c-1)
  def test8(): Unit ={
    println("great")
  }
}