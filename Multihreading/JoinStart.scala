package Multihreading

class JoinStart extends Thread{
  override def run() = {
    for(i<- 1 to 5) {
      println(i)
      Thread.sleep(500)
    }
  }
}
object JoinStart {
  def main(args: Array[String]): Unit = {
    var t1 = new JoinStart
    var t2 = new JoinStart
    var t3 = new JoinStart
    t1.start()
    t1.join()
    t2.start()
    t3.start()
  }
}
