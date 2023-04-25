package Question1and2

import org.slf4j.{Logger, LoggerFactory}

class PasswordValidation {

  private val logger: Logger = LoggerFactory.getLogger(getClass)

  def passwordValidator(userPassword: String, userName: String): Boolean = {

    val passwordValidationResult = userPassword.exists(_.isUpper) &&
      userPassword.exists(_.isLower) &&
      userPassword.exists(_.isDigit) &&
      !userPassword.contains(userName) &&
      checkSpecialCharacter(userPassword)

    logger.info("user Password is  = " +userPassword + "user Name is = " +userName)
    passwordValidationResult
  }

  private def checkSpecialCharacter(userPassword: String): Boolean = {
    userPassword.exists(char => char == '%' || char == '@' || char == '#' || char == '&' || char == '$')
  }

}
