class StringExample {
  var st = "String example"
  st = st+" append"

  var s1 = "Scala String"
  var s2 = "Hello Scala"
  var s3 = "Hello Scala"
  def compare(): Unit = {
    if(s1==s2) {
      println("s1 and s2 are equal")
    }
    if(s2==s3) {
      println("s2 and s3 are equal")
    }
  }

  def show(): Unit = {
    println(st)
  }
}

object Strings {
  def main(args: Array[String]): Unit = {
    val stringExample = new StringExample
    stringExample.show()
    stringExample.compare()
  }
}
