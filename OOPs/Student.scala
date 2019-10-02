package OOPs

class Student {
  var id : Int = 0
  val name : String = null
}

object mainObject {
  def main(args: Array[String]): Unit = {
    val student = new Student;
    println("id "+student.id + " name "+ student.name)
  }
}
