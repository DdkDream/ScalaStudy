package chapter02

object Test08_DataTypeConversion {
  def main(args: Array[String]): Unit = {
    // 1、自动转换

    val a1: Byte = 10
    val b1: Long = 2353L
    val result1: Long = a1 + b1
    val result11: Int = (a1 + b1).toInt

    val a2: Byte = 10
    val b2: Int = a2
//    val c2: Byte = b2     // error

    val a3: Byte = 10
    val b3: Char = 'b'
//    val c3: Byte = b3     // error
    val c3: Int = b3
    println(c3)


    val a4: Byte = 12
    val b4: Short = 25
    val c4: Char = 'c'
    val result4: Int = a4 + b4
    val result44: Int = a4 + b4 + c4
    println(result4)

    // 2、强制类型转换
    val n1: Int = 2.5.toInt
    println("n1:" + n1)

    val n2: Int = 2.6.toInt + 3.7.toInt
    val n3: Int = (2.6 + 3.7).toInt
    println("n2: " + n2)
    println("n3: " + n3)


    // 3、数值类型和String类型的转换
    val n: Int = 27
    val s: String = n + ""
    println(s)

    val m: Int = "12".toInt
    val f: Float = "12.3".toFloat
    val f2: Int = "12.3".toInt
    println(f2)


  }

}
