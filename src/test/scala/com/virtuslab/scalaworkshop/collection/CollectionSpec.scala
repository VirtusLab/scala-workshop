package com.virtuslab.scalaworkshop.collection

import org.scalatest.{Matchers, WordSpec}


class CollectionSpec extends WordSpec with Matchers {

  "List" should {
    "have basic operations" in {
      val list = List(1, 2, 3, 4)

      list.size shouldBe 4
      list.drop(2) shouldBe List(3, 4)
      list.take(2) shouldBe List(1, 2)

      list :+5
      list shouldBe List(1, 2, 3, 4)

      val newList = list :+ 5
      newList shouldBe List(1, 2, 3, 4, 5)


      val prepended = 0 :: list
      prepended shouldBe List(0, 1, 2, 3, 4)

      List(1, 2, 3, 4, 5) match {
        case 1 :: rest =>
          println("Matched")

        case _ =>
          println("Not Matched")
      }
    }

    "higher order operations" in {
      val list = List(10, 20, 30, 40 , 50)

      list.map(e => e / 10) shouldBe List(1, 2, 3, 4, 5)

      list.map(_ / 10) shouldBe List(1, 2, 3, 4, 5)

      List(1, 10, 100).flatMap(i => List(i, i + 1, i + 2)) shouldBe List(1, 2, 3, 10, 11, 12, 100, 101, 102)

      List(1, 5, 3, 8, 19).foldLeft(0) { (accum, elem) =>
        accum + elem
      } shouldBe 36

      List(1, 2, 3, 4, 5).sum shouldBe 15


      List(1, 2, 3, 4, 5, 6).filter(_ % 2 == 0) shouldBe List(2, 4, 6)
    }
  }

  "map" should {
    "have operations" in {

      val map1 = Map((1, "one"), (2, "two"), (3, "three"))

      map1.get(2) shouldBe Some("two")

      val map2 = Map(1 -> "one", 2 -> "two", 3 -> "three")
      map2.foreach(keyVal => println(s"Key: ${keyVal._1}, value: ${keyVal._2}"))

      map2.foreach { case (k, v) => println(s"Key: ${k}, value: ${v}") }



      List(1, 2, 3, 4, 5, 6, 7, 9).groupBy(i => if(i % 2 == 0) "even" else "odd") shouldBe Map(
        "odd" -> List(1, 3, 5, 7, 9),
        "even" -> List(2, 4, 6)
      )


      map1 + (7 -> "seven") shouldBe Map(1 -> "one", 2 -> "two", 3 -> "three", 7 -> "seven")
    }
  }
}
