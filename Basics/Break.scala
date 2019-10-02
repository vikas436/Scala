package Demo
import scala.util.control.Breaks._

object Break {
  def main(args: Array[String]): Unit = {
    for(i <- 1 to 10) {
      if(i==5) break
      println(i)
    }


    breakable {                                 // Breakable method to avoid exception
      for(i<-1 to 10 by 2){
        if(i==7)
          break                           // Break used here
        else
          println(i)
      }
    }
  }
}
