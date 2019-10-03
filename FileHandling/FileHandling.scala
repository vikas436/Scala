package FileHandling
import java.io._
import scala.io.Source

object FileHandling {
  val fileName : String =  "ScalaFileTest.txt"

  def writeIntoFile() = {
    val fileObject = new File(fileName)
    val printWriter = new PrintWriter(fileObject)
    printWriter.write("Hello, This is scala file 1\n")
    printWriter.write("Hello, This is scala file 2")
    printWriter.close()
  }
  def readIntoFile1() = {
    val filename = fileName
    val fileSource = Source.fromFile(filename)
    while(fileSource.hasNext){
      println(fileSource.next)
    }
    fileSource.close()
  }
  def readIntoFile2() = {
    val filename = fileName
    val fileSource = Source.fromFile(filename)
    for(line<-fileSource.getLines){
      println(line)
    }
    fileSource.close()
  }

  def main(args: Array[String]): Unit = {
    writeIntoFile()
    readIntoFile1()
    println()
    readIntoFile2()
  }
}
