/* P02 (*) Find the last but one element of a list.
     Example:
     scala> penultimate(List(1, 1, 2, 3, 5, 8))
     res0: Int = 5
*/
object P02 {
  def main(args: Array[String]): Unit = {
    val result = if(args.length == 0) penultimate(List(1, 1, 2, 3, 5, 8)) else penultimate(args(0).split(",").toList.map(_.toInt))
    println(result)
  }

  def penultimate[A](list: List[A]): A = {
    if (list.isEmpty) throw new NoSuchElementException("List is empty")
    list.init.last
  }
  
  def penultimateRecursive[A](list: List[A]): A = {
    list match {
      case penultimate :: last :: Nil => penultimate
      case head +: tail if tail.size > 1 => penultimate(tail)
      case _ => throw new NoSuchElementException("Not found")
    }
  }
}
