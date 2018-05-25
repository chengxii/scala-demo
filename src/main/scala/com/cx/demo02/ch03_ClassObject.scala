package com.cx.demo02

/**
  * 伴生类
  * Created by xi.cheng on 2018/5/25.
  */
object ch03_ClassObject {
  def main(args: Array[String]) {
    //1.伴生对象调用
    println(Student.Country)
    //2.
    val s= new Student
    //println(s.Country)//error,类的实例不能直接访问伴生对象中的成员
    println(s.c)
  }
}

//类
class Student{
  //在类中可以访问伴生对象的成员
  var c=Student.Country
  //在类中可以访问伴生对象的成员,哪怕是私有的
  var c2=Student.Country2
  //var c3=Student.Country3//error,权限不足
}
//类的伴生对象，可以认为是类对象，为了封装Java中的static成员
object Student{
  var Country="china"
  private var Country2="china2"//对其类私有
  private[this] var Country3="china3"//对伴生对象本身私有

}
