package String

class StringInterpolation {
  val s1 = raw"Hello \tStringInterpolation \nScala"
  val s2 = "Hello \tStringInterpolation \nScala"
  val pi = 3.14
  def show(){
    println("value of pi = "+pi)
    println(s"value of pi = $pi")
    println(s"value of s1 = $s1")
    println(f"value of pi = $pi%f")
    println("s1 = "+s1)
    println("s1= "+s2)
  }
}

object StringInterpolation {
  def main(args: Array[String]): Unit = {
    val stringInterpolation = new StringInterpolation
    stringInterpolation.show()
  }
}
