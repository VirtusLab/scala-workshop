package com.virtuslab.scalaworkshop.fp

import org.scalatest.{ Matchers, WordSpec }

import scala.util.Success

class TrySandboxSpec extends WordSpec with Matchers {
  val trySandbox = new TrySandbox

  val className = classOf[TrySandbox].getSimpleName

  s"$className#buildInterval" should {
    "return" in {
      trySandbox.buildInterval("2019-01-01", "2020-01-01T12:00:00Z") shouldBe a[Success[_]]
    }
  }
}
