package chapter02

object Test02_Variable {
  def main(args: Array[String]): Unit = {
    // 声明一个变量的通用语法
    var a : Int = 10

    // (1)声明变量时，类型可以省略，编译器自动推导，即类型推导
    var a1 = 10
    val b1 = 23

    // (2)类型确定后，就不能修改，说明Scala是强数据类型语言
    var a2 = 15    // a2类型为Int
//    a2 = "hello"

    // (3)变量声明时，必须要有初始值
//    var a3: Int

    // (4)在声明/定义一个变量时，可以使用var或者val来修饰，var修饰的变量可改变，val修饰的变量不可改
    a1 = 12
//    b1 = 25



  }
}
