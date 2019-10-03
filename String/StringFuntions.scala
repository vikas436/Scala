package String

class StringFun {
  var s1 = "Hello Scala";
  var s2 = "Hello String";
  def print() = {
    println("s1 = "+ s1 + "\ns2 ="+ s2)
  }
  def equal() = {
    if(s1.equals(s2)) {
      println("string s1 and s2 are equal")
    } else {
      println("string s1 and s2 are not equal")
    }
  }

  def compareTo() = {
    println("s1.compareTo(s2) " + s1.compareTo(s2))
  }

  def compare() = {
    println("s1.compare(s2) " + s1.compare(s2))
  }

  def subStr() = {
    println("s1.substring(1,5) "+ s1.substring(1,5))
  }
}
object StringFuntions {
  def main(args: Array[String]): Unit = {
    val stringFun = new StringFun
    stringFun.print()
    stringFun.equal()
    stringFun.compareTo()
    stringFun.compare()
    stringFun.subStr()
  }
}
