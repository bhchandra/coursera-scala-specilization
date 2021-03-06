package recfun

import scala.annotation.tailrec

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    def loop(c: Int, r: Int): Int = {
      if (c == 0 || c == r) 1
      else loop(c - 1, r - 1) + loop(c, r - 1)
    }

    loop(c, r)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {

    @tailrec
    def helper(chars: List[Char], sum: Int): Boolean = {
      if (sum < 0) false
      else if (chars.isEmpty) sum == 0
      else if (chars.head == '(') helper(chars.tail, sum + 1)
      else if (chars.head == ')') helper(chars.tail, sum - 1)
      else helper(chars.tail, sum)
    }

    helper(chars, 0)
  }

  /**
   * Exercise 3
   */
  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {

    def loop(money: Int, coins: List[Int]): Int = {
      if (money == 0) 1
      else if (money < 0) 0
      else if (coins.isEmpty) 0
      else loop(money - coins.head, coins) + loop(money, coins.tail)
    }

    loop(money, coins)
  }
}
