import example.Lists

import scala.annotation.tailrec

object Main extends App {

  println(Lists.max(List(1, 2, 3)))


  def fact(n: Int): Int = {

    @tailrec
    def loop(x: Int, acc: Int): Int = {
      if (x == 1) acc
      else loop(x - 1, acc * x)
    }

    loop(n, 1)
  }

  println(fact(4))
  println(fact(5))
  println(fact(6))


}
