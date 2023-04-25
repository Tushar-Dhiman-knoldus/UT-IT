import Question1and2.Factorial
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

import scala.util.{Failure, Success}

class FactorialSpec extends AnyFlatSpec with Matchers {

  "Factorial.findFactorial" should "return Success(1) when given input 0" in {
    val factorial = new Factorial()
    factorial.findFactorial(0) shouldEqual Success(1)
  }

  it should "return Success(1) when given input 1" in {
    val factorial = new Factorial()
    factorial.findFactorial(1) shouldEqual Success(1)
  }

  it should "return Success(120) when given input 5" in {
    val factorial = new Factorial()
    factorial.findFactorial(5) shouldEqual Success(120)
  }

  it should "return a Failure with IllegalArgumentException when given a negative input" in {
    val factorial = new Factorial()
    factorial.findFactorial(-1) shouldBe a [Failure[_]]
    factorial.findFactorial(-1).failed.get shouldBe an [IllegalArgumentException]
    factorial.findFactorial(-1).failed.get.getMessage shouldEqual "Input must be a non-negative integer."
  }

}
