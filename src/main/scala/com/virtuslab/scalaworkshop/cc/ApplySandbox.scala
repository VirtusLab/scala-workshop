package com.virtuslab.scalaworkshop.cc

object ApplySandbox {

  class Person(id: String, age: Int)

  object OneYearOlderPerson

  def personFromCsvLine(line: String): Person = {
    val array = line.split(",")
    require(array.size == 2, s"$line should have format <id>,<age>")
    val id = array.head
    val age = Integer.parseInt(array.last)
    // TODO replace with Person(id, age) and make it working
    ??? // Person(id, age)
  }

  def createNewborn(id: String): Person = {
    // TODO replace with Person(id) and create your own apply method taking only id as param and passing 0 as age
    ??? // Person(id)
  }

  def applyNextBirthday(person: Person): Person = {
    // TODO replace with OneYearOlderPerson(person) and make it working
    ??? // OneYearOlderPerson(person)
  }
}
