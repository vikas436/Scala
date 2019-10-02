package Demo

import Array._

object Demo {

  def str(): Unit = {
    val st1 : String = " vikas "
    val st2 : String = " hello "
    val n1 = 75
    val n2 = 100.25
    val res = printf("(%d -- %f -- %s)", n1, n2, st1)
    println(res)
    println("(%d -- %f -- %s)".format(n1,n2,st1))
  }
  def arr(): Unit = {
    val array1 : Array[Int] = new Array[Int](5)
    val array2 = new Array[Int](5)
    for(i <- 0.to(4)) {
      array1(i) = i
    }
    for(i <-array1) {
      println(array1(i))
    }
    val array = concat(array1,array2)
    for(i <-array) {
      println(array(i))
    }
  }
  def list(): Unit = {
    val list : List[Int] = List(1,2,3,4,5)
    for (i<- list) {
      println(i)
    }
    println(list.head)
    println(list.tail)
    println(list.isEmpty)
    println(list.reverse)
    println(List.fill(5)(1))
    println(list.max)
    println(list.min)
    list.foreach(println)
    var sum : Int = 0
    list.foreach(sum+=_)
    println(sum)
  }

  def set(): Unit = {
    val set : Set[Int] = Set(2,3,4,3,2,1)
    println(set)
    println(set+10)
    println(set(4))
    println(set.head)
    println(set.tail)
    println(set.isEmpty)
    for(i<-set) {
      print(i)
      print(" ")
    }
    println()
    val set1 : Set[Int] = Set(5,6,7,2)
    println(set ++ set1)
    println(set.++(set1))
    println(set.--(set1))
    println(set.&(set1))
    println(set.intersect(set1))
    set.foreach(println)
  }

  def map(): Unit ={
    val map : Map[Int, String] = Map(1->"radhe", 2->"krishna", 4->"vikas", 4->"Vikas")
    val map1 : Map[Int, String] = Map(1->"radhe", 2->"krishna", 3->"Hello", 5->"Hi")
    println(map)
    for(i <- map) {
      println(i._1)
      println(i._2)
    }
    println(map(2))
    println(map.keys)
    println(map.values)
    map.keys.foreach { key =>
      println("Key " + key +"  Value "+ map(key) )
    }
    println(map.contains(2))
    println(map.isEmpty)
    println(map ++ map1)
    println(map.head)
    println(map.tail)
    println(map.size)
  }

  def tuple(): Unit ={
    val tuple = (1, 2, "Hello", 1.1, true)
    println(tuple)
    val tuple1 = new Tuple2(1,2)
    println(tuple1)

    println(tuple._1)
    println(tuple._3)

    tuple.productIterator.foreach {
      i => println(i)
    }
  }

  def option(): Unit ={
    val list = List(1,2,3)
    println(list.find(_ > 0))
  }
  def reduce(): Unit = {
    val list = List(1,2,3,4,5,6,7)
    list.reduceLeft((x,y)=> {
      println(x + " "+ y);
      x+y
    })
  }

  def main(args: Array[String]) {
//    str()
//    arr()
//    list()
//    set()
//    map()
//    tuple()
//    option()
    reduce()
    return
    val name = "Radhe"
    val age = 10.9f

    println(name + " is " + age + " days old")
    println(s"$name is $age days old")
    println(f"$name%s is $age%f days old")
    println(s"Hello \nWorld")
    println(raw"Hello \nWorlds")
    if(age == 10.9f) {
      println("Equal")
    } else print("Not Equal")
    var y = 0
    while(y<10) {
      println("value y = "+y);
      y +=1
    }

    for(i <- 1 to 10) {
        println("value of i = "+i)
    }
    for(i <- 1.to(10)) {
      println("value of i = "+i)
    }
    for(i <- 1 until 11) {
      println("value of i = "+i)
    }

    val sum = (x : Int, y : Int) => x + y
    println(sum(1,2))

  }
}