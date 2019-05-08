package com.virtuslab.scalaworkshop.fp

case class Person(firstName: String, lastName: String, nationality: String)

object OptionSandbox {

  def extractPersonalData(params: Map[String, String]): Option[Person] = {
    // TODO extract first name, last name and nationality using get(...) on Map
    //  and combine them into a Person object if (and only if) all three keys `firstName`, `lastName` and `nationality` are present.
    for {
      firstName <- params.get("firstName")
      lastName <- params.get("lastName")
      nationality <- params.get("nationality")
    } yield Person(firstName, lastName, nationality)
  }
}
