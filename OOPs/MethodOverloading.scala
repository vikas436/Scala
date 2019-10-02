package OOPs

class MethodOverloading {
  def add(a: Int, b: Int)= {
    a+b
  }
  def add(a: Double, b: Double)= {
    a+b
  }
  def add(a: Int, b: Int, c: Int)= {
    a+b+c
  }
}
object MainOverloading {
  def main(args: Array[String]): Unit = {
    val methodOverloading = new MethodOverloading
    println(methodOverloading.add(2,9))
    println(methodOverloading.add(2.7,9.3))
    println(methodOverloading.add(2, 9, 1))
  }
}
