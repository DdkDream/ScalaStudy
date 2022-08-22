package chapter05

// 函数至简原则
object Test04_Simplify {
  def main(args: Array[String]): Unit = {

    def f0(name: String): String = {
      return name
    }

    println(f0("atguigu"))

    println("================")

    def f1(name: String): String = {
      name
    }
    println(f1("atguigu"))

    println("============")
    def f2(name: String): String = name
    println(f2("atguigu"))

    println("==============")

    def f3(name: String) = name
    println(f3("atguigu"))

    println("===========")

    def f4(name: String): String = {
      return name
    }
    println(f4("atguigu"))

    println("============")

    def f5(name: String) : Unit = {
      return name
    }
    println(f5("atguigu"))

    println("=============")

    def f6(name: String) {
      println(name)
    }
    println(f6("atguigu"))

    println("============")

    def f7() : Unit = {
      println("atguigu")
    }
    f7()
    f7

    println("===========")

    (name: String) => {println(name)}

    println("======")

  }
}
