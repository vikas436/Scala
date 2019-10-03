package ExceptionHandling

class TryCatch {
  def divide(a: Int, b: Int) = {
    try {
      a/b
    } catch {
      case e : ArithmeticException => println("Exception ArithmeticException :- "+e)
    }
  }
}

object TryCatch {
  def main(args: Array[String]): Unit = {
    val tryCatch = new TryCatch
    tryCatch.divide(10,0)
  }
}
