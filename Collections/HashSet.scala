package Collections

import scala.collection.immutable.HashSet

object HashSetObject {
  def main(args: Array[String]): Unit = {
    /**
      * HashSet is a sealed class. It extends AbstractSet and immutable Set trait. It uses hash code to store elements.
      *
      * It neither maintains insertion order nor sorts the elements.
      */
    
    var hashSet : HashSet[Int] = HashSet(2,3,4,5,4,5,8,9,10)
    hashSet += 12
    hashSet.foreach(num=>print(num+" "))
  }
}
