package Question3.request

import Question3.models.User
import Question3.validator.UserValidator

class UserImpl(userValidator: UserValidator) {

  def createUser(user: User): Option[String] = {
    if (userValidator.userIsValid(user)) Option(user.emailId)
    else None
  }
}