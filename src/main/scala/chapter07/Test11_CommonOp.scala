object Test11_CommonOp {
  def main(args: Array[String]): Unit = {
    val list = List(1, 3, 5, 7, 2, 89)
    val set = Set(23, 34, 423, 75)

    println(list.length)

    println(set.size)

    for(elem <- list){
      println(elem)
    }
    set.foreach(println)

    for(elem <- list.iterator) println(elem)


    println("===============")

    println(list)
    println(set)
    println(list.mkString("--"))

    println(list.contains(23))
    println(set.contains(23))

  }
}
