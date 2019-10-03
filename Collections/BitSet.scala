package Collections

import scala.collection.immutable._

object BitSetObject {
  def main(args: Array[String]): Unit = {
    /**
      * Bitsets are sets of non-negative integers which are represented as variable-size arrays of bits packed into 64-bit words.
      * The memory footprint of a bitset is determined by the largest number stored in it. It extends Set trait.
      */
    var bitSet = BitSet(1,3,4,3,6,12,0)
    bitSet.foreach(bit => print(bit + " "))
    println()
    println(bitSet.size)
    bitSet += 20
    println(bitSet.size)
  }
}
