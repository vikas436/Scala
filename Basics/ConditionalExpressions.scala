package Demo

object ConditionalExpressions {

  def isOdd(a: Int) = if(a%2==1) true else false

  def main(args: Array[String]): Unit = {
    val a = 15
    if(a>10) {
      println("number is greater than 10")
    } else if(a==10) {
      println("number is equal to 10")
    } else {
      println("number is less than 10")
    }

    println("Number 5 is Odd : "+isOdd(5))
  }
}
