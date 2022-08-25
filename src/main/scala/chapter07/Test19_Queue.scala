import scala.collection.immutable.Queue
import scala.collection.mutable
import scala.collection.parallel.immutable

object Test19_Queue {
  def main(args: Array[String]): Unit = {
    val queue: mutable.Queue[String] = new mutable.Queue[String]()

    queue.enqueue("a", "b", "c")
    println(queue)
    println(queue.dequeue())
    println(queue)
    println(queue.dequeue())
    println(queue)

    queue.enqueue("d", "e")

    println(queue)
    println(queue.dequeue())
    println(queue)

    val queue2: Queue[String] = Queue("a", "b", "C")
    val queue3 = queue2.enqueue("d")
    println(queue2)
    println(queue3)


  }
}
