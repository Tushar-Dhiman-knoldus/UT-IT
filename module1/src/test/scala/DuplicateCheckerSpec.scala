
import Question1and2.DuplicateChecker
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class DuplicateCheckerSpec extends AnyFlatSpec with Matchers {

  "DuplicateChecker.checkDuplicateInList" should "return false when given a list without duplicates" in {
    val checker = new DuplicateChecker()
    val list = List(1, 2, 3, 4, 5)
    checker.checkDuplicateInList(list) shouldEqual false
  }

  it should "return true when given a list with duplicates" in {
    val checker = new DuplicateChecker()
    val list = List(1, 2, 3, 4, 4, 5)
    checker.checkDuplicateInList(list) shouldEqual true
  }

}
