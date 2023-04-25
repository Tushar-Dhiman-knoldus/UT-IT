package Question1and2

import org.slf4j.{Logger, LoggerFactory}

import scala.annotation.tailrec
import scala.util.Try

class Factorial {

  private val logger: Logger = LoggerFactory.getLogger(getClass)

  def findFactorial(number: Int): Try[Double] = {
    if (number < 0) {
      logger.error("Input must be a non-negative integer.")
      Try(throw new IllegalArgumentException("Input must be a non-negative integer."))
    }
    else {
      @tailrec
      def helper(number: Int, result: Double): Double = {
        if (number == 0) result
        else {
          helper(number - 1, number * result)
        }
      }
      val result = Try(helper(number, 1))
      result
    }
  }
}
