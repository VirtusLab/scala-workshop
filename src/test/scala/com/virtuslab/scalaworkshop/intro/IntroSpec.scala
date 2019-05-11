package com.virtuslab.scalaworkshop.intro

import org.scalatest.{Matchers, WordSpec}

class IntroSpec extends WordSpec with Matchers {


  s"Basic language traits" should {
    "type inference" in {
      var num: Int = 1

      var test: String = "abcded"

      var num2 = 1 * 1.5
    }

    "immutability" in {
      val num = 5

//      num = num + 3
    }

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
        fail("Exception should have been thrown")
      } catch {
        case ex => println("I am done")
      }
    }


    "but also everything is an object" in {
      println(s"5 isNan: ${5.isNaN}")

      println(s"true.toString: ${true.toString}")

      val d: (Int => Char) = "4343323".charAt
      println(d)
    }
  }
}
