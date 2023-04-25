package validatortest

import Question3.models.Company
import Question3.validator.CompanyValidator
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers


class CompanyValidatorSpec extends AnyFlatSpec with Matchers {

  val companyValidator = new CompanyValidator

  "companyIsValid" should "return true as new company doesn't exist and have valid emailid" in {
    val newCompany: Company = Company("MorganStanley", "morganstanley123@gmail.com", "Boston")
    companyValidator.companyIsValid(newCompany) shouldEqual true
  }

  it should "return false as company already exist" in {
    val newCompany: Company = Company("GoldmanSachs", "goldmansachs.gmail.com", "Washington")
    companyValidator.companyIsValid(newCompany) shouldEqual false
  }

  it should "return false as emaild is not valid" in {
    val newCompany = Company("Knoldus", "wipro123@gmail.com", "Noida")
    companyValidator.companyIsValid(newCompany) shouldEqual false
  }
}