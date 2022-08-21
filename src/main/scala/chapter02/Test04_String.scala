package chapter02

object Test04_String {
  def main(args: Array[String]): Unit = {

    val name: String = "alice"
    val age: Int = 18
    println(age + "岁的" + name + "在尚硅谷学习")

    // * 用于将一个字符串复制多次并拼接
    println(name * 3)

    printf("%d岁的%s在尚硅谷学习", age, name)
    println()

    println(s"${age}岁的${name}在尚硅谷学习")

    val num: Double = 2.3456
    println(f"The num is ${num}%2.2f")   // 格式化模版字符串
    println(raw"The num is ${num}%2.2f")

    // 三引号表示字符串，保持多行字符串的原格式输出
    val sql = s"""
       |select *
       |from
       |  student
       |where
       |  name = ${name}
       |and
       |  age > ${age}
       |""".stripMargin
    println(sql)

  }

}
