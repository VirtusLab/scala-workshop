package com.virtuslab.scalaworkshop.loops

import org.scalatest.{Matchers, WordSpec}

class ForComprehensionBonusSandboxSpec extends WordSpec with Matchers {

  import ForComprehensionBonusSandbox._

  private val rates = Map(
    (p1, r1) -> Seq(5, 7),
    (p1, r3) -> Seq(2, 9),
    (p2, r2) -> Seq(10),
    (p2, r3) -> Seq(1),
    (p3, r1) -> Seq(8),
    (p3, r2) -> Seq(9)
  )

  private val expectedFilteredRates = Seq((p1, r3, 9), (p3, r1, 8), (p3, r2, 9))

  "getHighRatesOfAdultsUsingForExpression" should {
    "find proper rates" in {
      getHighRatesOfAdultsUsingForExpression(rates) shouldBe expectedFilteredRates
    }
  }
}
