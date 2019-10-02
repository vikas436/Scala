package OOPs

case class CaseClasses(a: Int, b: Int)

trait SuperTrait
case class CaseClass1(a: Int, b: Int) extends SuperTrait
case class CaseClass2(a: Int) extends SuperTrait
case object CaseClass extends SuperTrait

object Main {
  def caseClassMethod(f: SuperTrait) = {
    f match {
      case CaseClass1(a, b) => println("a = "+ a + " b = "+b)

      case CaseClass2(a) => println("a = "+ a)

      case CaseClass => println("no args")
    }
  }

  def main(args: Array[String]): Unit = {
    var caseClasses = CaseClasses(10, 20)
    println(caseClasses.a)
    println(caseClasses.b)
    caseClassMethod(CaseClass1(1,2))
    caseClassMethod(CaseClass2(1))
    caseClassMethod(CaseClass)
  }
}
