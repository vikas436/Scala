package ExceptionHandling

class Throws {

  @throws(classOf[ArithmeticException])
  def fun(age : Int) {
    if(age<18) {
      throw new ArithmeticException("Age <18 not allowed for voting")
    } else {
      println("Age = "+age)
    }
  }
}

object Throws {
  def main(args: Array[String]): Unit = {
    val t = new Throws
    try {
      t.fun(20)
      t.fun(10)
    } catch {
      case e : ArithmeticException => println("Exception ArithmeticException :- "+e)
      case ex : Throwable => println("Exception Catch unknown :- "+ ex)
    }
    println("Rest of the code executing...")
  }
}
