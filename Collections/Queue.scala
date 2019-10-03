package Collections

import scala.collection.immutable.Queue

object QueueObject {
  def main(args: Array[String]): Unit = {
    /**
      * Queue implements a data structure that allows inserting and retrieving elements in a first-in-first-out (FIFO) manner.
      */
    var queue: Queue[Int] = Queue(2,3,5,7,5,2,1)
    queue.foreach(num=>print(num+" "))
    println(queue.front)
    println(queue.isEmpty)
    println(queue.size)
    println(queue.enqueue(100))
    println(queue)
    queue = queue.enqueue(100)
    println(queue)
    val queue1 = queue.dequeue
    println(queue1)
    queue = queue1._2
    queue.foreach(num=>print(num+" "))
  }
}
