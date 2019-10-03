package Multihreading

class ThreadExcample extends Thread{
  override def run() = {
    println("Thread running...!")
  }
}
object ThreadObject {
  def main(args: Array[String]): Unit = {
    val threadExample = new ThreadExcample
    threadExample.start()
  }
}
