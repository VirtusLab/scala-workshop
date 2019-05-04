package com.virtuslab.scalaworkshop.fp

import org.scalatest.{ Matchers, WordSpec }

import scala.util.{ Failure, Success }

class TrySandboxSpec extends WordSpec with Matchers {
  val trySandbox = new TrySandbox

  val className = classOf[TrySandbox].getSimpleName

  s"$className#buildInterval" should {
    "return a Success when both values are correct" in {
      trySandbox.buildInterval("2019-01-01", "2020-01-01T12:00:00Z") shouldBe a[Success[_]]
    }

    "return a Failure when first value is incorrect" in {
      trySandbox.buildInterval("2019_i_am_invalid", "2020-01-01T12:00:00Z") shouldBe a[Failure[_]]
    }

    "return a Failure when second value is incorrect" in {
      trySandbox.buildInterval("2019-01-01", "2020-01-01T12:xx:yyZ") shouldBe a[Failure[_]]
    }

    "return a Failure when both values are incorrect" in {
      trySandbox.buildInterval("2019_i_am_invalid", "2020-01-01T12:xx:yyZ") shouldBe a[Failure[_]]
    }
  }
}
