package Demo

object SwitchCase {

  def search(value: Any) : Any  = value match {
      case 1 => println("value is 1")
      case "Radhe" => println("value is Radhe")
      case 10.0 => println("value is 10.0")
      case _ => println("default value")
    }

  def main(args: Array[String]): Unit = {
    val a = 1
    a match {
      case 1 => println("number is 1")

      case 2 => println("number is 2")

      case _ => println("default case")
    }

    search("Radhe")
  }
}
