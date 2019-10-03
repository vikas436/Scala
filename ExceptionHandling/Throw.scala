package ExceptionHandling

class Throw {
  def fun(age: Int) = {
    if(age<18) {
      throw new ArithmeticException("Age <18 not allowed for voting")
    } else {
      println("Age = "+age)
    }
  }
}

object Throw {
  def main(args: Array[String]): Unit = {
    val t = new Throw
    t.fun(20)
    t.fun(10)
  }
}
