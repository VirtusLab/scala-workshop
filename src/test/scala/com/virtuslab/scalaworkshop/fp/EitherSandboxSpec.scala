package com.virtuslab.scalaworkshop.fp

import org.scalatest.{ Matchers, WordSpec }

class EitherSandboxSpec extends WordSpec with Matchers {

  "EitherSandbox#parse" should {
    "return" in {
      EitherSandbox.getCompanyTaxId(Map("companyName" -> "Amazon")) shouldBe Right(789123)
    }

    // TODO add more tests!
  }
}
