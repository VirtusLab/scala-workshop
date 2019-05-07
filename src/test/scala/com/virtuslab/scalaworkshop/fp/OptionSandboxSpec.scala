package com.virtuslab.scalaworkshop.fp

import org.scalatest.{ Matchers, WordSpec }

class OptionSandboxSpec extends WordSpec with Matchers {
  val optionSandbox = new OptionSandbox

  val className = classOf[OptionSandbox].getSimpleName

  s"$className#extractPersonalData" should {
    "return a correct person if all fields are present" in {
      optionSandbox.extractPersonalData(
        Map("firstName" -> "John", "lastName" -> "Doe", "nationality" -> "US")
      ) shouldBe Some(Person("John", "Doe", "US"))
    }

    "return None if no fields are provided" in {
      optionSandbox.extractPersonalData(Map.empty) shouldBe None
    }

    // TODO more cases
    // TODO more cases
    // TODO more cases
    // TODO more cases
  }
}
