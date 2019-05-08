package com.virtuslab.scalaworkshop.fp

import java.time.{ LocalDate, ZonedDateTime }

import scala.util.Try

object TrySandbox {

  case class DateToTimeInterval(
    startDate: LocalDate,
    endTime: ZonedDateTime
  )

  def buildInterval(startDateStr: String, endTimeStr: String): Try[DateToTimeInterval] = {
    // TODO: Implement this method using LocalDate.parse, ZonedDateTime.parse and a for-comprehension.
    for {
      startDate <- Try(LocalDate.parse(startDateStr))
      endTime <- Try(ZonedDateTime.parse(endTimeStr))
    } yield DateToTimeInterval(startDate, endTime)
  }
}
