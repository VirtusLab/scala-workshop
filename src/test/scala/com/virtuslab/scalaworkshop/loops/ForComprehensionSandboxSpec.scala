package com.virtuslab.scalaworkshop.loops

import org.scalatest.{Matchers, WordSpec}

class ForComprehensionSandboxSpec extends WordSpec with Matchers {

  import ForComprehensionSandbox._

  private val adults = Seq(p1, p3)
  private val restaurantsVisitedByAdults = Seq(r1, r3)

  "getAdultsUsingForExpression" should {
    "return proper people" in {
      getAdultsUsingForExpression() shouldBe adults
    }
  }

  "getRestaurantsVisitedByAdultsUsingForExpression" should {
    "return proper restaurants" in {
      getRestaurantsVisitedByAdultsUsingForExpression() shouldBe restaurantsVisitedByAdults
    }
  }
}
