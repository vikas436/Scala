package Multihreading

class SleepStart extends Thread{
  override def run() = {
    for(i<- 1 to 5) {
      println(i)
      Thread.sleep(500)
    }
  }
}
object SleepStart {
  def main(args: Array[String]): Unit = {
    val s1 = new SleepStart
    val s2 = new SleepStart
    s1.start()
    s2.start()
  }
}
