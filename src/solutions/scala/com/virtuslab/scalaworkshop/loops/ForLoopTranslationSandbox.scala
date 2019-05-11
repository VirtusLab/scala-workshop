package com.virtuslab.scalaworkshop.loops

object ForLoopTranslationSandbox {

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

  def getAllScoresUsingFor(rates: Map[(Person, Restaurant), Seq[Int]]): Seq[Int] = for {
    person <- people
    restaurant <- restaurants
    rate <- rates.getOrElse((person, restaurant), Seq.empty)
  } yield rate

  def getAllScoresWithoutFor(rates: Map[(Person, Restaurant), Seq[Int]]): Seq[Int] = {
    // TODO write an equivalent of getAllScoresUsingFor using flatMap, map
    people.flatMap { person =>
      restaurants.flatMap { restaurant =>
        rates.getOrElse((person, restaurant), Seq.empty)
      }
    }
  }

  // let's assume every person adds some score every time he/she visits a given restaurant
  def getHighRatesOfAdultsUsingFor(rates: Map[(Person, Restaurant), Seq[Int]]): Seq[(Person, Restaurant, Int)] = for {
    person <- people if person.age >= 18
    restaurant <- restaurants
    rate <- rates.getOrElse((person, restaurant), Seq.empty) if rate >= 8
  } yield (person, restaurant, rate)

  def getHighRatesOfAdultsWithoutFor(rates: Map[(Person, Restaurant), Seq[Int]]): Seq[(Person, Restaurant, Int)] = {
    // TODO write an equivalent of getHighRatesOfAdultsUsingFor using flatMap, map and filter (without if)
    people.filter(_.age >= 18).flatMap { person =>
      restaurants.flatMap { restaurant =>
        rates.getOrElse((person, restaurant), Seq.empty).filter(_ >= 8).map { rate =>
          (person, restaurant, rate)
        }
      }
    }
  }
}
