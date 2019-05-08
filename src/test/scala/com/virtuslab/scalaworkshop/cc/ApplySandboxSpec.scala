package com.virtuslab.scalaworkshop.cc

import org.scalatest.{Matchers, WordSpec}

class ApplySandboxSpec extends WordSpec with Matchers {

  import ApplySandbox._

  "personFromCsvLine" should {
    "properly create a person using apply generated for case class" in {
      personFromCsvLine("Jan Kowalski,27") shouldBe new Person("Jan Kowalski", 27)
    }
  }

  "createNewborn" should {
    "properly create a person using custom apply" in {
      createNewborn("John Smith") shouldBe new Person("John Smith", 0)
    }
  }

  "applyNextBirthday" should {
    "properly create an older person using apply inside an object with a different name" in {
      val person = new Person("John Smith", 1)
      applyNextBirthday(person) shouldBe new Person("John Smith", 2)
    }
  }
}
