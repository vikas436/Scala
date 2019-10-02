package OOPs

class Constructor {
  println("hello default Constructor")
}

class Students(id: Int, name: String) {
  var marks : Float= 0.0f
  def this(id: Int, name: String, marks: Float) {
    this(id,name)
    this.marks=marks
  }
  def show: Unit = {
    println("id "+ id+ " name "+ name + " marks "+marks)
  }
}

class Student2(id: Int) {
  def this(id: Int, name: String) {
    this(id)
    println(id+" "+name)
  }
  println(id)
}

object MainConstructor {
  def main(args: Array[String]): Unit = {
    val c = new Constructor
    var s = new Students(1,"Radhe", 100.0f)
    s.show
    var s1 = new Students(1,"Radhe")
    s1.show
    new Student2(20)
    new Student2(20, "Krsna")
  }
}
