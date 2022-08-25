object Test12_DerivedCollection {
  def main(args: Array[String]): Unit = {
    val list1 = List(1, 3, 5, 7, 2, 89)
    val list2 = List(3, 7, 2, 45, 4, 8, 19)

    println(list1.head)

    println(list1.tail)

    println(list2.last)

    println(list2.init)

    println(list1.reverse)

    println(list1.take(3))
    println(list1.takeRight(4))

    println(list1.drop(3))
    println(list1.dropRight(4))

    println("==========")

    val union = list1.union(list2)
    println("union: " + union)
    println(list1 ::: list2)

    val set1 = Set(1, 3, 5, 7, 2, 89)
    val set2 = Set(3, 7, 2, 45, 4, 8, 19)

    val union2 = set1.union(set2)
    println("union2: " + union2)
    println(set1 ++ set2)

    val itersection = list1.intersect(list2)
    println("intersection:" + itersection)

    val diff1 = list1.diff(list2)
    val diff2 = list2.diff(list1)

    println("diff1: " + diff1)
    println("diff2: " + diff2)

    println("===========")

    println("zip: " + list1.zip(list2))
    println("zip: " + list2.zip(list1))

    for(elem <- list1.sliding(3)){
      println(elem)
    }

    println("===========")

    for (elem <- list2.sliding(4, 2)) {
      println(elem)
    }
    println("===========")
    for (elem <- list2.sliding(3, 3)) {
      println(elem)
    }
  }
}
