package com.virtuslab.scalaworkshop.loops

object ForLoopTranslationBonusSandbox {

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
  def getHighRatesOfAdultsUsingFor(rates: Map[(Person, Restaurant), Seq[Int]]): Seq[(Person, Restaurant, Int)] = for {
    person <- people if person.age >= 18
    restaurant <- restaurants
    rate <- rates.getOrElse((person, restaurant), Seq.empty) if rate >= 8
  } yield (person, restaurant, rate)

  def getHighRatesOfAdultsWithoutFor(rates: Map[(Person, Restaurant), Seq[Int]]): Seq[(Person, Restaurant, Int)] = {
    // TODO write an equivalent of getHighRatesOfAdultsUsingFor using flatMap, map and filter (without if)
    ???
  }
}
