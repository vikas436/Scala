package OOPs

class Student {
  var id : Int = 0
  val name : String = null
}

class Student1 (id: Int, name : String) {
  def show(): Unit = {
    println("id "+id + " name "+ name)
  }
}

class Arithmetic {
  def add(a: Int, b: Int) = {
    val c = a+b
    println("sum = " + c)
  }
}
object mainObject {
  def main(args: Array[String]): Unit = {
    val student = new Student
    println("id "+student.id + " name "+ student.name)
    val student1 = new Student1(1, "Radhe")
    val student2 = new Student1(2, "Krishna")
    student1.show()
    student2.show()
    new Arithmetic().add(4,6)
  }
}
