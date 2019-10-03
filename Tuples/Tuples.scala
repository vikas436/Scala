package Tuples

object Tuples {
  def main(args: Array[String]): Unit = {
    var tuple = (1,5,8,6,4)                     // Tuple of integer values
    var tuple2 = ("Apple","Banana","Gavava")        // Tuple of string values
    var tuple3 = (2.5,8.4,10.50)                // Tuple of float values
    var tuple4 = (1,2.5,"India")                // Tuple of mix type values
    println(tuple)
    println(tuple2)
    println(tuple3)
    println(tuple4)
    tuple.productIterator.foreach(num=>println(num))
    println(tuple._1)
    println(tuple._4)
  }
}
