package chapter05

object Test03_FunctionParameter {
  def main(args: Array[String]): Unit = {

    def f1(str : String*) : Unit = {
      println(str)
    }
    f1("alice")
    f1("alice", "bbb")
    f1("aaa", "bbb", "ccc")

    def f2(str1: String, str2: String*): Unit = {
      println("str1:" + str1 + " str2:" + str2)
    }
    f2("alice")
    f2("aaa", "bbb", "ccc")

    def f3(name: String = "atguigu"): Unit = {
      println("My school is " + name)
    }
    f3("school")
    f3()

    def f4(name : String = "atguigu", age : Int): Unit = {
      println(s"${age}岁的${name}在尚硅谷学习")
    }
    f4("alice", 20)
    f4(age = 23)


  }

}
