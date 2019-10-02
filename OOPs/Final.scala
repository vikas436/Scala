package OOPs

class Bank1 {
  final val id : Int = 1
  val name : String = "BANK"

  final def info(): Unit = {
    println("Bank Info")
  }
}

class SBI1 extends Bank1 {
//  override val id: Int = _      can not override it's final member
  override val name: String = "SBI"

  /* can not override it's final method
    override def info(): Unit = {

    }
   */


}
object Final {
  def main(args: Array[String]): Unit = {
    println(new SBI1().id)
  }
}
