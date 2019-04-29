package com.virtuslab.scalaworkshop.fp

import org.scalatest.{ Matchers, WordSpec }

class OptionSandboxSpec extends WordSpec with Matchers {
  val optionSandbox = new OptionSandbox

  val className = classOf[OptionSandbox].getSimpleName

  s"$className#parse" should {
    "return" in {
      optionSandbox.parse("foo", "bar") shouldBe Some(1)
    }
  }
}
