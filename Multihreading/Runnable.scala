package Multihreading

class RunnableExample extends Runnable{
  override def run() = {
    println("thread runnable running ...!")
  }
}
object RunnableExample {
  def main(args: Array[String]): Unit = {
    val runnableExample = new RunnableExample
    val t = new Thread(runnableExample)
    t.start()
  }
}
