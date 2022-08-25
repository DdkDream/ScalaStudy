object Test13_SimpleFunction {
  def main(args: Array[String]): Unit = {
    val list = List(5, 1, 8, 2, -3, 4)
    val list2 = List(("a", 5), ("b", 1), ("c", 8), ("d", 2), ("e", -3), ("f", 4))

    var sum = 0
    for (elem <- list) {
      sum += elem
    }
    println(sum)

    println(list.sum)


    println(list.product)

    println(list.max)
    println(list2.maxBy((tuple: (String, Int)) => tuple._2))
    println(list2.maxBy(_._2))


    println(list.min)
    println(list2.minBy(_._2))

    println("=========")
    val sortedList = list.sorted
    println(sortedList)

    println(list.sorted.reverse)

    println(list.sorted(Ordering[Int].reverse))

    println(list2.sorted)

    println(list2.sortBy(_._2))
    println(list2.sortBy(_._2)(Ordering[Int].reverse))

    println(list.sortWith((a: Int, b: Int) => {
      a < b
    }))
    println(list.sortWith(_ < _))
    println(list.sortWith(_ > _))

  }

}
