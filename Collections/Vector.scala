package Collections

object VectorObject {
  def main(args: Array[String]): Unit = {
    var vector = Vector(2,4,6,5,3,1,8)
    vector.foreach(num=>print(num+" " ))
    println()
    vector = vector.reverse
    println(vector)
    println(vector.size)
    println(vector.isEmpty)
    println(vector.sorted)
  }
}
