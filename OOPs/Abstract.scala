package OOPs

abstract class Bike {
  def run()
}
class Hero extends Bike {
  def run(): Unit = {
    println("Run Hero Bike")
  }
}

abstract class Flat (id :Int) {
  var name : String="radhe"
  val size : Int = 10000
  def facility()
  def types() = {
    println("2 BHK")
  }
}
class Room(id :Int) extends Flat(id) {
  name = "Radhe-Krishna"

  def facility(): Unit = {
    println("Room facility")
    println("id "+id)
    println("name "+name)
    println("size "+size)
  }
}
object Abstract {
  def main(args: Array[String]): Unit = {
    val h = new Hero;
    h.run()
    val r = new Room(100)
    r.facility()
  }
}
