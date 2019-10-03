package Collections

import scala.collection.immutable.ListMap

object ListMapObject {
  def main(args: Array[String]): Unit = {
    var list = ListMap(1->"hi",2->"hello",1->"hey")
    println(list)
    println(list(2))
    list+=(3->"how")
    list.foreach{
      case (key, value) => println(key+" -> "+value)
    }
    var list1 = new ListMap()
    var list2 = ListMap.empty
    println(list1)
    println(list2)
  }
}
