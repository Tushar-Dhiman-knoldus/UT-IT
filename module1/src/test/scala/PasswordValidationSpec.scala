import Question1and2.PasswordValidation
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class PasswordValidationSpec extends AnyFlatSpec with Matchers {

  val passwordValidatorObject = new PasswordValidation

  "A password" should "be valid if it contains an uppercase letter, a lowercase letter, a digit, and a special character" in {
    val result = passwordValidatorObject.passwordValidator("Dhiman@9", "Tushar")
    result shouldBe true
  }

  it should "not be valid if it does not contain an uppercase letter" in {
    val result = passwordValidatorObject.passwordValidator("password123!", "username")
    result shouldBe false
  }

  it should "not be valid if it does not contain a lowercase letter" in {
    val result = passwordValidatorObject.passwordValidator("PASSWORD123!", "username")
    result shouldBe false
  }

  it should "not be valid if it does not contain a digit" in {
    val result = passwordValidatorObject.passwordValidator("Password!", "username")
    result shouldBe false
  }

  it should "not be valid if it contains the username" in {
    val result = passwordValidatorObject.passwordValidator("Password123!", "password123")
    result shouldBe false
  }

  it should "not be valid if it does not contain a special character" in {
    val result = passwordValidatorObject.passwordValidator("Password123", "username")
    result shouldBe false
  }
}
