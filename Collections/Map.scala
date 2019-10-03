package Collections

object MapObject {
  def main(args: Array[String]): Unit = {
    var map1 = Map(1->"Radhe", 2->"krishna")
    var map2 = Map(("a","Hello"), ("b","Hi"))
    println(map1)
    println(map2)
    map1 = map1+(3->"Ram")
    println(map1)
    map2 = map2-("b")
    println(map2)
  }
}
