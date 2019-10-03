package Collections

import scala.collection.immutable.ListSet

object ListSetObject {
  def main(args: Array[String]): Unit = {
    var list = ListSet(1,12,4,5,2,4)
    list.foreach(num=>print(num+" "))
    println()
    println(list.size)
    list+=50
    println(list.size)
  }
}
