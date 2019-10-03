package Collections

object ListObject {
  def main(args: Array[String]): Unit = {
    /**
      * List is used to store ordered elements. It extends LinearSeq trait. It is a class for immutable linked lists.
      * This class is good for last-in-first-out (LIFO), stack-like access patterns.
      */
    var list = List(2,5,6,4,1,9)
    list.foreach(num=>print(num+" "))
    println(list.tail)
    println(list.sorted)
    println(list.reverse)
    println(list.size)
    println(list.isEmpty)
  }
}
