/* P01 (*) Find the last element of a list.
     Example:
     scala> last(List(1, 1, 2, 3, 5, 8))
     res0: Int = 8
*/
object P01 {
  def main(args: Array[String]): Unit = {
    // Using an integer list for a run. Any type of list should work fine otherwise
    val result = if (args.length == 0) last(List(1, 1, 2, 3, 5, 8)) else last(args(0).split(",").toList.map(_.toInt))
    println(result)
  }
  
  def last[A](list: List[A]): A = {
    list.last
  }

  def lastRecursive[A](list: List[A]): A = {
    list match {
      case head :: Nil => head
      case head +: tail => lastRecursive(tail)
      case _ => throw new NoSuchElementException("List is empty")
    }
  }
}
