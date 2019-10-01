package Demo

object ForLoop {

  def for1(): Unit = {
    for (i<-1.to(5)) {
      println(i)
    }
  }

  def for2(): Unit = {
    for (i<-1 until 5) {
      println(i)
    }
  }

  def for3(): Unit = {
    val res = for(i<-1 to 5) yield i
    for (i<-res) {
      println(i)
    }
  }

  def for4(): Unit = {
    for (i <- 1 to 5 by 2) {
      println(i)
    }
  }

  def for5(): Unit = {
    val a = List(1,2,3,4,5)
    for(i<-a) {
      println(i)
    }
  }

  def for6() : Unit = {
    val a = List(1,2,3,4,5)
    a.foreach(println)
  }

  def for7() : Unit = {
    val a = List(1,2,3,4,5)
    a.foreach((i:Int)=> {println(i+" ")})
  }

  def main(args: Array[String]): Unit = {
    for (i <- 1 to 5) {
      println(i)
    }
    println()
    for1()
    println()
    for2()
    println()
    for3()
    println()
    for4()
    println()
    for5()
    println()
    for6()
    println()
    for7()
  }
}
