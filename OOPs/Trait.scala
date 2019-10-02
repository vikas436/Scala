package OOPs

trait Printable {
  def print()
}
trait Showable {
  def show()
  def color: Unit = {
    println("Black & White")
  }
}
class A4 extends Printable with Showable {
  def print(): Unit = {
    println("print page")
  }
  def show(): Unit = {
    println("show page")
  }
}

object MainTrait {
  def main(args: Array[String]): Unit = {
    val a4 = new A4;
    a4.print();
    a4.show()
    a4.color
  }
}

// if entends class not overriding method then class should be abstract,same as java
trait A {
  def Hi()
}
abstract class B extends A {
  def Hello()
}
class C extends B {
  def Hi(): Unit = {
  }
  def Hello(): Unit = {
  }
}
