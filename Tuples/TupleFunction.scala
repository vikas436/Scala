package Tuples

object TupleFunction {

  def getTuple() = {
    val tuples = (1,3.0,"Radhe",true)
    tuples
  }

  def main(args: Array[String]): Unit = {
    /**
      * You can return multiple values by using tuple. Function does not return multiple values but you can do this with the help of tuple.
      * In the following example, we are describing this process.
       */
    val tuples = getTuple()
    tuples.productIterator.foreach(num=>println(num))

  }
}
