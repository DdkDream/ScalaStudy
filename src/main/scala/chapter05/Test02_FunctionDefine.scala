package chapter05

object Test02_FunctionDefine {
  def main(args: Array[String]): Unit = {
    def f1(): Unit = {
      println("1. 无参，无返回值")
    }
    f1()
    println(f1())

    println("========")

    def f2(): Unit = {
      println("2.无参，有返回值")
      return 12
    }
    println(f2())

    println("=========")

    def f3(name : String): Unit = {
      println("3. 有参数，无返回值" + name)
    }

    println(f3("Alice"))

    print("=========")
    def f4(name : String) : String = {
      println("4. 有参，有返回值" + name)
      return "hi, " + name
    }

    println(f4("alice"))


  }

}
