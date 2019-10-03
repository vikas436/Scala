package Collections

object SeqObject {
  def main(args: Array[String]): Unit = {
    var seq = Seq(1,4,3,6,8,5,4 )
    seq.foreach(num => print(num+" "))
    println(seq.isEmpty)
    println(seq.endsWith(Seq(5,4)))
    println(seq.contains(4))
    println(seq.lastIndexOf(4))
    println(seq.reverse)
  }
}
