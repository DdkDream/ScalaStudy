package chapter05

import scala.Console.println

object Test05_Lambda {
  def main(args: Array[String]): Unit = {
    val fun = (name: String) => {
      println(name)
    }
    fun("atguigu")

    println("=======================")

    // 定义一个函数，以函数作为参数输入
    def f(func: String => Unit): Unit = {
      func("atguigu")
    }

    f(fun)
    f((name: String) => {
      println(name)
    })

    println("=========================")

    // 匿名函数的简化原则
    f((name) => {
      println(name)
    })

    f(name => {
      println(name)
    })

    f(name => println(name))

    f( println(_) )

    // 如果可以推导出，当前船渡的println是一个函数体，而不是调用语句，可以直接省略下划线
    f(println)

    println("========")

    // 实际实例，定义一个"二元运算"函数，只操作1和2两个数，但是具体运算通过参数传入
    def dualFunctionOneAndTwo(fun: (Int, Int) => Int): Int = {
      fun(1, 2)
    }

    val add = (a: Int, b: Int) => a + b
    val minus = (a: Int, b : Int) => a - b

    println(dualFunctionOneAndTwo(add))
    println(dualFunctionOneAndTwo(minus))

    // 匿名函数简化
    println(dualFunctionOneAndTwo((a: Int, b: Int) => a + b))
    println(dualFunctionOneAndTwo((a: Int, b : Int) => a - b))

    println(dualFunctionOneAndTwo((a, b) => a + b))
    println(dualFunctionOneAndTwo(_ + _))
    println(dualFunctionOneAndTwo(_ - _))

    println(dualFunctionOneAndTwo((a, b) => b - a))
    println(dualFunctionOneAndTwo(-_ + _))



  }

}
