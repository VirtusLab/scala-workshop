package com.virtuslab.scalaworkshop.patmat

object PatternMatchingSandbox {

  case class Weight(number: Int, unit: String)

  // TODO you're parsing a file which contains following kinds of lines
  // 1. <number> <unit>
  // 2. <unit> <number>
  // 3. lines in other format which are not important
  // collect all weights
  def collectWeights(lines: Seq[String]): Seq[Weight] = {
    val pattern1 = "([0-9]+) ([A-Za-z]+)".r
    val pattern2 = "([A-Za-z]+) ([0-9]+)".r
    lines.collect {
      case pattern1(number, unit) => Weight(number.toInt, unit)
      case pattern2(unit, number) => Weight(number.toInt, unit)
    }
  }
}
