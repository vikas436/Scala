package OOPs

class Bank {
  val id : Int=1
  def roi() = {
    0
  }
}
class SBI extends Bank {
  override val id : Int=2
  override def roi() = {
    8
  }
}

class Axis extends Bank {
  override val id : Int=3
  override def roi(): Int = {
    9
  }
}

class BOI extends Bank {
  override val id : Int=4
  override def roi(): Int = {
    7
  }
}
object MethodOverriding{
  def main(args: Array[String]): Unit = {
    val s = new SBI
    val a = new Axis
    val b = new BOI
    println("SBI rate of interest "+s.roi())
    println("Axis rate of interest "+a.roi())
    println("BOI rate of interest "+b.roi())
    println("Axis id "+a.id)
  }
}
