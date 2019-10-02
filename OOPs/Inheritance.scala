package OOPs

class  Employee {
  var salary : Int = 100000
}

class Programmer extends Employee {
  var bonus : Int = 50000
}

class Finance extends Programmer {
  def show(): Unit = {
    println("salary "+ salary)
    println("bonus "+ bonus)
  }
}

object Inheritance {
  def main(args: Array[String]): Unit = {
    new Finance().show()
  }
}
