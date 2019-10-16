package com.virtuslab.scalaworkshop.loops

object ForComprehensionBonusSandbox {

  case class Person(name: String, age: Int)

  case class Restaurant(name: String)

  val p1 = Person("Jan", 20)
  val p2 = Person("Paul", 17)
  val p3 = Person("Mike", 19)
  val people: Seq[Person] = Seq(p1, p2, p3)

  val r1 = Restaurant("McDuck")
  val r2 = Restaurant("TikaMasala Corner")
  val r3 = Restaurant("Mama's")
  val restaurants: Seq[Restaurant] = Seq(r1, r2, r3)

   // let's assume every person adds some score every time he/she visits a given restaurant
  def getHighRatesOfAdultsUsingForExpression(rates: Map[(Person, Restaurant), Seq[Int]]): Seq[(Person, Restaurant, Int)] = {
    // TODO replace ??? with for-expression which returns all (person, restaurant, rate) where
    // age is >= 18 and rate is >= 8
    // hint: Map has 'getOrElse' method where one can pass empty seq as a default value
    ???
  }
}
