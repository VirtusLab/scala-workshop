package com.virtuslab.scalaworkshop.patmat

object PatternMatchingSandbox {

  sealed trait Person

  case object Host extends Person

  case class Friend(invited: Boolean) extends Person

  def canJoinParty(person: Person): Boolean = {
    // TODO check whether a person is a host or an invited friend
    person match {
      case Host => true
      case Friend(invited) => invited
    }
  }

  case class Weight(number: Int, unit: String)

  def collectWeights(lines: Seq[String]): Seq[Weight] = {
    // TODO you're parsing a file which contains following kinds of lines
    // 1. <number> <unit>
    // 2. <unit> <number>
    // 3. lines in other format which are not important
    // collect all weights
    val pattern1 = "([0-9]+) ([A-Za-z]+)".r
    val pattern2 = "([A-Za-z]+) ([0-9]+)".r
    lines.collect {
      case pattern1(number, unit) => Weight(number.toInt, unit)
      case pattern2(unit, number) => Weight(number.toInt, unit)
    }
  }
}
