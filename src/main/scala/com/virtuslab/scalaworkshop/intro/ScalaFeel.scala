package com.virtuslab.scalaworkshop.intro

object ScalaFeel {
  case class Car(brand: String, model: String, engine: BigDecimal, clazz: String)

  def main(args: Array[String]): Unit = {
    val cars = List(
      new Car("Fiat", "500", BigDecimal("1.0"), "C"),
      new Car("Audi", "A4", BigDecimal("1.6"), "C"),
      new Car("Ford", "Focus", BigDecimal("1.8"), "C"),
      new Car("BMW", "1", BigDecimal("2.0"), "C"),
      new Car("Ford", "Focus", BigDecimal("1.8"), "C")
    )
    //
  }
}
