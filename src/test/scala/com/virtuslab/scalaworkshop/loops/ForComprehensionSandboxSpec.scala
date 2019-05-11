package com.virtuslab.scalaworkshop.loops

import org.scalatest.{Matchers, WordSpec}

class ForComprehensionSandboxSpec extends WordSpec with Matchers {

  import ForComprehensionSandbox._

  private val rates = Map(
    (p1, r1) -> Seq(5, 7),
    (p1, r3) -> Seq(2, 9),
    (p2, r2) -> Seq(10),
    (p2, r3) -> Seq(1),
    (p3, r1) -> Seq(8),
    (p3, r2) -> Seq(9)
  )

  private val expectedFilteredRates = Seq((p1, r3, 9), (p3, r1, 8), (p3, r2, 9))
  private val adults = Seq(p1, p3)

  "getAdultsUsingForExpression" should {
    "return proper people" in {
      getAdultsUsingForExpression() shouldBe adults
    }
  }

  "getHighRatesOfAdultsUsingForExpression" should {
    "find proper rates" in {
      getHighRatesOfAdultsUsingForExpression(rates) shouldBe expectedFilteredRates
    }
  }
}
