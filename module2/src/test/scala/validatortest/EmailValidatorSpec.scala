package validatortest

import Question3.validator.EmailValidator
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class EmailValidatorSpec extends AnyFlatSpec with Matchers {

  val emailValidator = new EmailValidator

  behavior of "EmailValidatorSpec"

  it should "emailIdIsValid" in {
    val email = "tushar@gmail.com"
    emailValidator.emailIdIsValid(email) shouldEqual true
  }

  it should "emailIdIsValid as email can have numbers" in {
    val email = "he12.she@xyz.com"
    emailValidator.emailIdIsValid(email) shouldEqual true
  }

  it should "emailIdIsInValid as @ not available" in {
    val email = "he.she.xyz.com"
    emailValidator.emailIdIsValid(email) shouldEqual false
  }

  it should "emailIdIsValid as . can be added before @" in {
    val email = "he.she@xyz.com"
    emailValidator.emailIdIsValid(email) shouldEqual true
  }

  it should "emailIdIsInValid as domain not available" in {
    val email = "he.she@"
    emailValidator.emailIdIsValid(email) shouldEqual false
  }

}