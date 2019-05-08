package com.virtuslab.scalaworkshop.cc

object ApplySandbox {

  case class Person(id: String, age: Int)

  object Person {
    def apply(id: String): Person = Person(id, age = 0)
  }

  object OneYearOlderPerson {
    def apply(p: Person): Person = p.copy(age = p.age + 1)
  }

  def personFromCsvLine(line: String): Person = {
    val array = line.split(",")
    require(array.size == 2, s"$line should have format <id>,<age>")
    val id = array.head
    val age = Integer.parseInt(array.last)
    Person(id, age)
  }

  def createNewborn(id: String): Person = {
    Person(id)
  }

  def applyNextBirthday(person: Person): Person = {
    OneYearOlderPerson(person)
  }
}
