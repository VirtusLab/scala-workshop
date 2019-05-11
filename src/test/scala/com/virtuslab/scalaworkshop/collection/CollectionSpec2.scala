package com.virtuslab.scalaworkshop.collection

import org.scalatest.{Matchers, WordSpec}


class CollectionSpec2 extends WordSpec with Matchers {

  "Collection tasks" should {
    "cube every element" in {

      def cubeList(list: List[Int]): List[Int] = {
        ???
      }


      cubeList(List(1, 2, 3, 4)) shouldBe List(1, 8, 27, 64)

      cubeList(List()) shouldBe Nil

      cubeList(List(0, -5)) shouldBe List(0, -125)
    }


    "concatenate all letters" in {

      def concatenate(list: List[Char]): String = {
        ???
      }


      concatenate(List('t', 'e', 's', 't')) shouldBe "test"

      concatenate(List()) shouldBe Nil

      concatenate(List('a')) shouldBe List("a")
    }

    "sum even" in {

      def sumEven(list: List[Int]): Int = {
        ???
      }


      sumEven(List(1, 2, 3, 4, 5, 6)) shouldBe 12

      sumEven(List()) shouldBe 0

      sumEven(List(1)) shouldBe 0
    }

    "find longest string in map" in {

      def findLongest(list: Map[Int, String]): Int = {
        ???
      }


      findLongest(Map(1 -> "t", 2 -> "test", 3 -> "loooooong", 4 -> "d")) shouldBe 3
    }
  }
}
