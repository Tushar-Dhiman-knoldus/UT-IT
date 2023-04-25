package requesttest

import Question3.models.User
import Question3.request.UserImpl
import Question3.validator.UserValidator
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class UserImplSpec extends AnyFlatSpec with Matchers {

  val userValidator = new UserValidator
  val userImpl = new UserImpl(userValidator)

  "createUser" should "return a valid email id" in {
    val user: User = User("Sant", "Narayan", 100, 12000.0, "SDE", "Knoldus", "sant.singh@knoldus.com")
    userImpl.createUser(user) shouldEqual Some(user.emailId)
  }

  it should "return none as email id is not valid" in {
    val user = User("Manish", "Mishra", 101, 20000.0, "SDE", "GoldmanSachs", "@GoldmanSachs.com")
    userImpl.createUser(user) shouldEqual None
  }

  it should "return none because Company Name doesn't exist" in {
    val user = User("Tushar", "Dhiman", 102, 100000.0, "SDE", "MorganStanley", "tushar.dhiman@morganstanley.in")
    userImpl.createUser(user) shouldEqual None
  }


}