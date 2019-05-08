package com.virtuslab.scalaworkshop.intro

import java.math.MathContext

object ScalaFeel {
  case class Car(brand: String, model: String, engine: BigDecimal, clazz: String)

  def main(args: Array[String]) {
    val cars = List(
      new Car("Fiat", "500", BigDecimal("1.0", MathContext.DECIMAL32), "C"),
      new Car("Audi", "A4", BigDecimal("1.6", MathContext.DECIMAL32), "C"),
      new Car("Ford", "Focus", BigDecimal("1.8", MathContext.DECIMAL32), "C"),
      new Car("BMW", "1", BigDecimal("2.0", MathContext.DECIMAL32), "C"),
      new Car("Ford", "Focus", BigDecimal("1.8", MathContext.DECIMAL32), "C")
    )
    val carsWithlargerEngine = cars.groupBy(_.clazz).getOrElse("C", Nil).filter(_.engine > BigDecimal("1.5", MathContext.DECIMAL32)).distinct
    println(s"Cars with larger engine:\n\t${carsWithlargerEngine.mkString("\n\t")}")
  }
}
