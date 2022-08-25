object Test14_HighLevelFunction_Map {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9)

    val evenList = list.filter( (elem: Int) => {elem % 2 == 0})
    println(evenList)

    println(list.filter(_ % 2 == 1))

    println("==============================")
    println(list.map(_ * 2))
    println(list.map( x => x * x))

    println("=============================")
    val nestedList: List[List[Int]] = List(List(1, 2, 3), List(4, 5), List(6, 7, 8, 9))

    val flatList = nestedList(0) ::: nestedList(1) ::: nestedList(2)
    println(flatList)

    val flatList2 = nestedList.flatten
    println(flatList2)

    println("============================")
    val strings: List[String] = List("hello world", "hello scala", "hello java", "we study")
    val splitList: List[Array[String]] = strings.map( _.split(" ") )
    val flattenList = splitList.flatten
    println(flattenList)

    val flatmapList = strings.flatMap(_.split(" "))
    println(flatmapList)


    println("============================")

    val groupMap: Map[Int, List[Int]] = list.groupBy(_ % 2)
    val groupMap2: Map[String, List[Int]] = list.groupBy( data => {
      if( data % 2 == 0) "偶数" else "奇数"
    })
    println(groupMap)
    println(groupMap2)

    val wordList = List("china", "america", "alice", "canda", "cary", "bob", "japan")
    println(wordList.groupBy( _.charAt(0)))

  }
}
