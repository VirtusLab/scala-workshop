package com.virtuslab.scalaworkshop.intro

import org.scalatest.{Matchers, WordSpec}

class IntroSpec extends WordSpec with Matchers {


  s"Basic language traits" should {
    "have everything as expression" in {
      val number = 5

      val numberIs = if (number > 100) "large" else "small"

      numberIs shouldBe ("small")
    }

    "even while is expression" in {
      val startTime = System.currentTimeMillis()
      val doneAlready = while (System.currentTimeMillis() - startTime < 1000L) {
        println("Still waiting...")
        Thread.sleep(100L)
      }
      doneAlready shouldBe (())
    }

    "and even throw" in {
      try {
        val value = throw new IllegalStateException()
        fail("Exception shoud have been thrown")
      } catch {
        case ex => println("I am done")
      }
    }
  }
}
