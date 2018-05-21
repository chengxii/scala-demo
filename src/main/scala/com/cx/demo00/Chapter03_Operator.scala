package com.cx.demo00

/**
  * scala的操作符
  *     和java是一致的
  *
  * scala运算符实质
  * scala本质无运算符，所有运算均为函数调用
  * +等价于.+()
  * a+b等价于a.+(b)
  * -等价于.-()
  * a-b等价于a.-(b)
  *
  * Created by xi.cheng on 2018/5/21.  
  */
object Chapter03_Operator {
  def test0(): Unit = {
    var a = 10
    var b = 20
    var c = 25
    var d = 25
    println("a + b = " + (a + b))
    println("a - b = " + (a - b))
    println("a * b = " + (a * b))
    println("b / a = " + (b / a))
    println("b % a = " + (b % a))
    println("c % a = " + (c % a))
  }

  def test1(): Unit = {
    var a = 10
    var b = 20
    println("a == b = " + (a == b))
    println("a != b = " + (a != b))
    println("a > b = " + (a > b))
    println("a < b = " + (a < b))
    println("b >= a = " + (b >= a))
    println("b <= a = " + (b <= a))
  }

  def test2(): Unit = {
    var a = true
    var b = false
    println("!(a && b) = " + !(a))
    println("a && b = " + (a && b))
    println("a || b = " + (a || b))
  }

  def test3(): Unit = {
    var a = 60 /* 60 = 0011 1100 */
    var b = 13 /* 13 = 0000 1101 */
    var c = 0 /* 0  = 0000 0000 */
    c = a & b /* 12 = 0000 1100 */
    println("a & b = " + c)
    c = a | b /* 61 = 0011 1101 */
    println("a | b = " + c)
    c = a ^ b /* 49 = 0011 0001 */
    println("a ^ b = " + c)
    c = ~a /* -61 = 1100 0011 */
    println("~a = " + c)
    c = a << 2 /* 240 = 1111 0000 */
    println("a << 2 = " + c)
    c = a >> 2 /* 215 = 1111 （左补最高位）*/
    println("a >> 2 = " + c)
    c = a >>> 2 /* 215 = 0000 1111 (左补0)*/
    println("a >>> 2 = " + c)
  }

  def test4: Unit = {
    var a = 10
    var b = 20
    var c = 0
    c = a + b
    println("c = a + b = " + c)

    c += a
    println("c += a = " + c)

    c -= a
    println("c -= a = " + c)

    c *= a
    println("c *= a = " + c)

    a = 10
    c = 15
    c /= a
    println("c /= a = " + c)

    a = 10
    c = 15
    c %= a
    println("c %= a = " + c)

    c <<= 2
    println("c <<= 2 = " + c)

    c >>= 2
    println("c >>= 2 = " + c)

    c >>= 2
    println("c >>= a = " + c)

    c &= a
    println("c &= 2 = " + c)

    c ^= a
    println("c ^= a = " + c)

    c |= a
    println("c |= a = " + c)
  }
}
