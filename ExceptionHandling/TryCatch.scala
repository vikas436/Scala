package ExceptionHandling

class TryCatch {
  def divide(a: Int, b: Int) = {
    try {
      a/b
      val arr = Array(1,2)
      arr(10)
    } catch {
      case e : ArithmeticException => println("Exception ArithmeticException :- "+e)
      case e : ArrayIndexOutOfBoundsException =>   println("Exception ArrayIndexOutOfBoundsException :- "+e)
      case ex : Throwable => println("Found an unknown exception :- " + ex)
    }
    println("Out of divide function")
  }
}

object TryCatch {
  def main(args: Array[String]): Unit = {
    val tryCatch = new TryCatch
    tryCatch.divide(10,0)
    tryCatch.divide(10,1)
  }
}
