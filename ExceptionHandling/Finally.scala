package ExceptionHandling

class Finally {
  def divide(a: Int, b: Int) = {
    try {
      a/b
      val arr = Array(1,2,3)
      arr(4)
    } catch {
      case e : ArithmeticException => println("Exception ArithmeticException :- "+e)
      case e : ArrayIndexOutOfBoundsException => println("Exception ArrayIndexOutOfBoundsException :- "+e)
      case ex : Throwable => println("Unknown exception catch :- "+ ex)
    } finally {
      println("finally block of divide function")
    }
  }
}
object Finally {
  def main(args: Array[String]): Unit = {
    val f = new Finally
    f.divide(100,0)
    f.divide(100,1)
  }
}
