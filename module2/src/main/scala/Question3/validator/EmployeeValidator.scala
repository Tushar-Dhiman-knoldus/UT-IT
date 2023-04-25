
package Question3.validator

import Question3.db.CompanyReadDto
import Question3.models.Employee

class EmployeeValidator {

  def employeeIsValid(employee: Employee): Boolean = {
    val emailValidator = new EmailValidator
    val companyReadDto = new CompanyReadDto
    companyReadDto.getCompanyByName(employee.companyName) match {
      case Some(_) => if (emailValidator.emailIdIsValid(employee.emailId)) true else false
      case None => false
    }
  }
}

