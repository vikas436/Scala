package ExceptionHandling

class InvalidAgeException(s:String) extends Exception(s){}

class CustomException {

  @throws(classOf[InvalidAgeException])
  def fun(age: Int) = {
    if(age<18) {
      throw new InvalidAgeException("Age <18 not allowed for voting")
    } else {
      println("Age = "+age)
    }
  }
}

object CustomException {
  def main(args: Array[String]): Unit = {
    val c = new CustomException
    try {
      c.fun(20)
      c.fun(10)
    } catch {
      case e : InvalidAgeException => println("Exception InvalidAgeException :- "+e)
      case th : Throwable => println("Unknown Exception :- "+th)
    }
  }
}
