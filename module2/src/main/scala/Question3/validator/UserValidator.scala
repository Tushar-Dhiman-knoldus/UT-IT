package Question3.validator

import Question3.db.CompanyReadDto
import Question3.models.User

class UserValidator {

  def userIsValid(user: User): Boolean = {
    val emailValidator = new EmailValidator
    val companyReadDto = new CompanyReadDto
    companyReadDto.getCompanyByName(user.companyName) match {
      case Some(_) => if (emailValidator.emailIdIsValid(user.emailId)) true else false
      case None => false
    }
  }
}