package com.virtuslab.scalaworkshop.fp

import org.scalatest.{ Matchers, WordSpec }

class EitherSandboxSpec extends WordSpec with Matchers {
  val eitherSandbox = new EitherSandbox

  val className = classOf[EitherSandbox].getSimpleName

  s"$className#parse" should {
    "return" in {
      eitherSandbox.combine("foo", "bar") shouldBe Some(1)
    }
  }
}
