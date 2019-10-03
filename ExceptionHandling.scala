class ExceptionHandling {
  val num = 100
  def divide() = {
    num/0
    println("Rest of the code after divide ops")
  }
}

object ExceptionHandling {
  def main(args: Array[String]): Unit = {
    val exceptionHandling = new ExceptionHandling
    exceptionHandling.divide()
  }
}
