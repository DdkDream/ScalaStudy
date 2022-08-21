package chapter02
/*
128: Int类型，占据4个字节，32位

原码：0000 0000 0000 0000 0000 0000 1000 0000
补码：0000 0000 0000 0000 0000 0000 1000 0000

截取最后一个字节，Byte
得到补码 1000 0000
表示最大负数  -128


128: Int类型，占据4个字节，32位

原码：0000 0000 0000 0000 0000 0000 1000 0010
补码：0000 0000 0000 0000 0000 0000 1000 0010

截取最后一个字节，Byte
得到补码 1000 0010
得到原码 1111 1110
 -126
 */
object Test09_Problem_DataTypeConversion {
  def main(args: Array[String]): Unit = {
    val n: Int = 130
    val b: Byte = n.toByte
    println(b)

  }

}
