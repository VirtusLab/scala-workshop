package com.virtuslab.scalaworkshop.patmat

import org.scalatest.{Matchers, WordSpec}

class PatternMatchingSandboxSpec extends WordSpec with Matchers {

  import PatternMatchingSandbox._

  "canJoinParty" should {
    "recognise permitted people" in {
      canJoinParty(Host) shouldBe true
      canJoinParty(Friend(invited = true)) shouldBe true
      canJoinParty(Friend(invited = false)) shouldBe false
    }
  }

  "collectWeights" should {
    "properly filter and build weights from lines" in {
      val lines = Seq(
        "110",
        "10 kg",
        "kg",
        "g 20"
      )
      collectWeights(lines) shouldBe Seq(Weight(10, "kg"), Weight(20, "g"))
    }
  }
}
