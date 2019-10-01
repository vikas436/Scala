package Demo

object WhileLoop {

  def doWhile(a : Int): Unit = {
    println("from number "+a +" to 10.")
    var i = a
    do {
      println(i)
      i+=1
    } while (i<=10)
  }

  def main(args: Array[String]): Unit = {
    var a = 0
    while (a<=10) {
      println(a)
      a+=2
    }
    doWhile(0)
  }
}
