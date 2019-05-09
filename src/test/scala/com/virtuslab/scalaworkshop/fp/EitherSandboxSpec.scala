package com.virtuslab.scalaworkshop.fp

import org.scalatest.{ Matchers, WordSpec }

class EitherSandboxSpec extends WordSpec with Matchers {

  "EitherSandbox#parse" should {
    "find correct tax id for an existing company" in {
      EitherSandbox.getCompanyTaxId(Map("companyName" -> "Amazon")) shouldBe Right(789123)
    }

    "return an exception when the company doesn't exist in the database" in {
      EitherSandbox.getCompanyTaxId(Map("companyName" -> "Microsoft")) shouldBe a[Left[_, _]]
    }

    "return an exception when the parameter is missing in the input" in {
      EitherSandbox.getCompanyTaxId(Map("name" -> "Amazon")) shouldBe a[Left[_, _]]
    }
  }
}
