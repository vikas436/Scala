package Collections

import scala.collection.immutable.HashMap

object HashMapObject {
  def main(args: Array[String]): Unit = {
    /**
      * HashMap is used to store element. It use hash code to store elements and return a map.
      */
    var hashMap = HashMap(1->"ram",2->"radhe",3->"krishna")
    hashMap.foreach(num=>println(num))
    hashMap = hashMap+(1->"Gopala")
    hashMap.foreach {
     case (key, value) => println(key + " -> " + value)
    }
  }
}
