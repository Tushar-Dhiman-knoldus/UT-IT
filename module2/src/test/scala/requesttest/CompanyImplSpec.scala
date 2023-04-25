package com.knoldus.request

import Question3.models.Company
import Question3.request.CompanyImpl
import Question3.validator.CompanyValidator
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers


class CompanyImplSpec extends AnyFlatSpec with Matchers {

  val companyValidator = new CompanyValidator
  val companyImpl = new CompanyImpl(companyValidator)

  "createCompany" should "return valid company name" in {
    val company: Company = Company("MorganStanley", "morganstanley123@gmail.com", "Boston")
    companyImpl.createCompany(company) shouldEqual Some(company.name)
  }

  it should "return None as invalid email has been provided" in {
    val company: Company = Company("GoldmanSachs", "goldmansachs.gmail.com", "Washington")
    companyImpl.createCompany(company) shouldEqual None
  }

  it should "return none as the company already present in database" in {
    val company: Company = Company("Knoldus", "wipro123@gmail.com", "Noida")
    companyImpl.createCompany(company) shouldEqual None
  }


}