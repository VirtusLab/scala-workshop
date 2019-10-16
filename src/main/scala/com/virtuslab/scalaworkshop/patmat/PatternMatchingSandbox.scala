package com.virtuslab.scalaworkshop.patmat

object PatternMatchingSandbox {

  sealed trait Person

  case object Host extends Person

  case class Friend(invited: Boolean) extends Person

  def canJoinParty(person: Person): Boolean = {
    // TODO check whether a person is a host or an invited friend
    ???
  }

  case class Weight(number: Int, unit: String)

  def collectWeights(lines: Seq[String]): Seq[Weight] = {
    // TODO you're parsing a file which contains following kinds of lines
    // 1. <number> <unit>
    // 2. <unit> <number>
    // 3. lines in other format which are not important
    // use collect method to collect all weights
    // we can use just [0-9]+ and [A-Za-z]+ as patterns
    ???
  }
}
