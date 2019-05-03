package com.virtuslab.scalaworkshop.fp

import java.time.{ LocalDate, ZonedDateTime }

import scala.util.Try

class TrySandbox {

  case class DateToTimeInterval(
    startDate: LocalDate,
    endTime: ZonedDateTime
  )

  def buildInterval(startDateStr: String, endTimeStr: String): Try[DateToTimeInterval] = {
    // TODO: Implement this method using LocalDate.parse, ZonedDateTime.parse and a for-comprehension.
    ???
  }
}
