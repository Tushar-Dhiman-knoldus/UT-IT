package Question3.request

import Question3.models.Employee
import Question3.validator.EmployeeValidator

class EmployeeImpl(employeeValidator: EmployeeValidator) {

  def createEmployee(employee: Employee): Option[String] = {
    if (employeeValidator.employeeIsValid(employee)) Option(employee.emailId)
    else None
  }
}
