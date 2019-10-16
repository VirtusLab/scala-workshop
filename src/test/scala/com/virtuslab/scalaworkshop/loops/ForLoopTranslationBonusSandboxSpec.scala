package com.virtuslab.scalaworkshop.loops

import org.scalatest.{Matchers, WordSpec}

class ForLoopTranslationBonusSandboxSpec extends WordSpec with Matchers {

  import ForLoopTranslationBonusSandbox._

  private val ratesSeq = Seq(
    (p1, r1) -> Seq(5, 7),
    (p1, r3) -> Seq(2, 9),
    (p2, r2) -> Seq(10),
    (p2, r3) -> Seq(1),
    (p3, r1) -> Seq(8),
    (p3, r2) -> Seq(9)
  )

  private val ratesMap = ratesSeq.toMap

  private val expectedFilteredRates = Seq((p1, r3, 9), (p3, r1, 8), (p3, r2, 9))

  "getHighRatesOfAdultsUsingFor" should {
    "find proper rates" in {
      getHighRatesOfAdultsUsingFor(ratesMap) shouldBe expectedFilteredRates
    }
  }

  "getHighRatesOfAdultsWithoutFor" should {
    "find proper rates" in {
      getHighRatesOfAdultsWithoutFor(ratesMap) shouldBe expectedFilteredRates
    }
  }
}
