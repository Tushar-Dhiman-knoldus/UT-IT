package validatortest

import Question3.models.User
import Question3.validator.UserValidator
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class UserValidatorSpec extends AnyFlatSpec with Matchers {

  val userValidator = new UserValidator

  "userIsValid" should "return true as company name already exist and email is valid" in {
    val user: User = User("Manish", "Mishra", 20, 20000.0, "SDE", "GoldmanSachs", "@GoldmanSachs.com")
    userValidator.userIsValid(user) shouldEqual false
  }

  "userIsValid" should "return false as company name doesn't exist" in {
    val user = User("Sant", "Narayan", 21, 12000.0, "SDE", "Knoldus", "sant.singh@knoldus.com")
    userValidator.userIsValid(user) shouldEqual true
  }

  "userIsValid" should "return false as company name exist but emailid is not valid" in {
    val user = User("Tushar", "Dhiman", 22, 100000.0, "SDE", "MorganStanley", "tushar.dhiman@morganstanley.in")
    userValidator.userIsValid(user) shouldEqual false
  }
}