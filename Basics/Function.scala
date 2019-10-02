package Demo

object Function {
  def fun(): Unit = {
    println("fun called")
  }

  def fun1() {
    println("fun1 called")
  }

  def fun4(a: Int = 0, b: Int = 0) ={
    a+b
  }


  def fun2(a: Int, b: Int) = {
    a+b
  }

  def fun3(a: Int, b: Int) = {
    println(a+b)
  }

  def main(args: Array[String]): Unit = {
    fun()
    fun1()
    val res2 = fun2(2,3)
    println(res2)
    fun3(3,4)
    val res4 = fun4(a=4,b=5)
    val res5 = fun4(b=5,a=4)
    val res6 = fun4(4,5)
    val res7 = fun4(5)
    val res8 = fun4(4)
    val res9 = fun4(0)
    println(res4+"\n"+res5+"\n"+res6+"\n"+res7+"\n"+res8+"\n"+res9+"\n")

  }
}
