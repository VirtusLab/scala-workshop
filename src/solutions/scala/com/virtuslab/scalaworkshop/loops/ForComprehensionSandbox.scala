package com.virtuslab.scalaworkshop.loops

object ForComprehensionSandbox {

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

  val restaurantsVisitedByPerson: Map[Person, Seq[Restaurant]] = Map(
    p1 -> Seq(r1, r3), p2 -> Seq(r2), p3 -> Seq(r1)
  )

  def getAdultsUsingForExpression(): Seq[Person] = {
    // TODO replace ??? with for-expression which returns all people where age is >= 18
    for (person <- people if person.age >= 18) yield person
  }

  def getRestaurantsVisitedByAdultsUsingForExpression(): Seq[Restaurant] = {
    // TODO replace ??? with for-expression which returns all restaurants visited by adults
    // please use 'distinct' method on collections to get read of the repeated entries
    (for {
      adult <- getAdultsUsingForExpression()
      restaurant <- restaurantsVisitedByPerson(adult)
    } yield restaurant).distinct
  }
}
