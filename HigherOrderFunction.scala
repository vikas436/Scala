package Demo

object HigherOrderFunction {
  def add(a: Int, b: Int=>AnyVal) = {
    println(b(a))
  }
  def multipyBy2(a: Int) = {
    a*2
  }
  def add2(a: Int)= {
    a+2
  }

  def fun(): Unit = {
    val res1 = (a:Int, b:Int) => {
      a+b
    }
    val res2 = (_: Int) + (_: Int)
    println(res1(3,5))
    println(res2(3,4))
  }

  def fun1(a: Int) (b: Int) = {
    a+b
  }

  def addition(a: Int, b: Int, c: Int) = {
    def add(x: Int, y: Int) = {
      x+y
    }
    add(a, add(b,c))
  }

  def sum(a : Int*) = {
    var sum=0
    a.foreach((i=> sum+=i))
    sum
  }

  def main(args: Array[String]): Unit = {
    add(25, multipyBy2)
    println(multipyBy2(add2(5)))
    fun()
    val res = fun1(5)(8)
    println(res)
    val add1 = fun1(4)_
    val res1 = add1(5)
    println(res1)
    val res2 = addition(2,3,4)
    println(res2)
    val result = sum(1,2,3,4,5)
    println(result)
  }
}
