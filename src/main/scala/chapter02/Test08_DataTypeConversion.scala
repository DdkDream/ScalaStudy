package chapter02

object Test08_DataTypeConversion {
  def main(args: Array[String]): Unit = {
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

  }

}
