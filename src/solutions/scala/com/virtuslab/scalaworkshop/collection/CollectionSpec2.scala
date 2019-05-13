package com.virtuslab.scalaworkshop.collection

import org.scalatest.{Matchers, WordSpec}


class CollectionSpec2 extends WordSpec with Matchers {

  "Collection tasks" should {
    "cube every element" in {

      def cubeList(list: List[Int]): List[Int] = {
        // solution

        list.map(x => x * x * x )

        // foldLeft solution

//        list.foldLeft(List[Int]()) { (acc, e) =>
//          acc :+ e * e * e
//        }
      }


      cubeList(List(1, 2, 3, 4)) shouldBe List(1, 8, 27, 64)

      cubeList(List()) shouldBe Nil

      cubeList(List(0, -5)) shouldBe List(0, -125)
    }


    "concatenate all letters" in {

      def concatenate(list: List[Char]): String = {

        // solution

        list.mkString

        // foldLeft solution

//        list.foldLeft("") { (acc, e) =>
//          acc + e
//        }
      }


      concatenate(List('t', 'e', 's', 't')) shouldBe "test"

      concatenate(List()) shouldBe ""

      concatenate(List('a')) shouldBe "a"
    }

    "sum even" in {

      def sumEven(list: List[Int]): Int = {

        // solution

        list.filter(_ % 2 == 0).sum

        // foldLeft solution

//        list.foldLeft(0) { (a, b) =>
//          if(b % 2 == 0) a + b else a
//        }
      }


      sumEven(List(1, 2, 3, 4, 5, 6)) shouldBe 12

      sumEven(List()) shouldBe 0

      sumEven(List(1)) shouldBe 0
    }

    "find longest string in map" in {

      def findLongest(list: Map[Int, String]): Int = {

        // solution

        list.maxBy(_._2.length)._1

        // foldLeft solution

//        list.foldLeft((-1, "")) { (acc, e) =>
//          if(acc._2.length > e._2.length) acc else e
//        }._1

      }


      findLongest(Map(1 -> "t", 2 -> "test", 3 -> "loooooong", 4 -> "d")) shouldBe 3
    }
  }
}
