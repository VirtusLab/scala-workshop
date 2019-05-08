package com.virtuslab.scalaworkshop.fp

import org.scalatest.{ Matchers, WordSpec }

class OptionSandboxSpec extends WordSpec with Matchers {

  "OptionSandbox#extractPersonalData" should {
    "return a correct person if all fields are present" in {
      OptionSandbox.extractPersonalData(
        Map("firstName" -> "John", "lastName" -> "Doe", "nationality" -> "US")
      ) shouldBe Some(Person("John", "Doe", "US"))
    }

    "return None if first name is missing" in {
      OptionSandbox.extractPersonalData(
        Map("lastName" -> "Doe", "nationality" -> "US")
      ) shouldBe None
    }

    "return None if nationality is missing (and superfluous fields are provided)" in {
      OptionSandbox.extractPersonalData(
        Map("firstName" -> "John", "lastName" -> "Doe", "birthDate" -> "1990-01-01")
      ) shouldBe None
    }

    "return None if no fields are provided" in {
      OptionSandbox.extractPersonalData(Map.empty) shouldBe None
    }
  }
}
