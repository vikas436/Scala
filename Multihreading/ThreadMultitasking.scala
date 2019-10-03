package Multihreading

class ThreadMultitasking extends Thread{
  override def run() = {
    for(i<- 1 to 5){
      println(i)
      Thread.sleep(500)
    }
  }
  def task(){
    for(i<- 1 to 5){
      println(i)
      Thread.sleep(200)
    }
  }
}

object ThreadMultitaskingObject {
  def main(args: Array[String]): Unit = {
    val t1 = new ThreadMultitasking
    val t2 = new ThreadMultitasking
    t1.start()
    t1.task()
  }
}
