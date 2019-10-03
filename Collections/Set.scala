package Collections

import scala.collection.SortedSet

object SetObject {
  def main(args: Array[String]): Unit = {
    val set1 = Set()
    val set2 = Set(1,2,3)
    val set3 = Set(3,4,5)
    println(set1)
    println(set2)

    println(set2.head)
    println(set2.tail)
    println(set2.isEmpty)

    val set4 = set2 ++ set3
    println(set4)
    println(set4.size)
    println(set4.contains(4))
    println(set4.contains(42))

    /**
      * You can add or remove elements from the set. You can add only when your code is mutable.
      * In this example, we are adding and removing elements of the set.
      */

    var games = Set("Cricket","Football","Hocky","Golf")
    println(games)
    games += "Racing"               // Adding new element
    println(games)
    games += "Cricket"              // Adding new element, it does not allow duplicacy.
    println(games)
    games -= "Golf"             // Removing element
    println(games)

    for(game <- games) {
      println(game)
    }
    games.foreach(game=>println(game))

    var intersection = set2.intersect(set3)
    println(intersection)
    println(set2 & set3) //intersection using &
    var union = set2.union(set3)
    println(union)
    val numbers = SortedSet(4,3,2,1,5,6,40)
    numbers.foreach(num=>print(num+" "))
  }
}
