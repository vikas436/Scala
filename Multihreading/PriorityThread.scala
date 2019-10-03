package Multihreading

class PriorityThread extends Thread{
  override def run() = {
    for(i <- 1 to 5) {
      println(this.getName+i)
      println(this.getPriority)
      Thread.sleep(500)
    }
  }
}
object PriorityThread {
  def main(args: Array[String]): Unit = {
    val t1 = new PriorityThread
    val t2 = new PriorityThread
    t1.setName("First Thread - ")
    t2.setName("Second Thread - ")
    t1.setPriority(Thread.MIN_PRIORITY)
    t2.setPriority(Thread.MAX_PRIORITY)
    t1.start()
    t2.start()
  }
}
