package com.virtuslab.scalaworkshop.intro

import org.scalactic.TolerantNumerics
import org.scalatest.{Matchers, WordSpec}


trait Shape {
  def area: Double
  def circumference: Double
}


class Circle(r: Double) extends Shape {
  require(r > 0)

  override def area: Double = Math.PI * r * r

  override def circumference: Double = 2 * Math.PI * r
}

class Square(a: Double) extends Shape {
  require(a > 0)

  override def area: Double = a * a

  override def circumference: Double = 4 * a
}

class Rectangle(a: Double, b: Double) extends Shape {
  require(a > 0 && b > 0)

  override def area: Double = a * b

  override def circumference: Double = 2 * a + 2 * b
}


class ShapesSpec extends WordSpec with Matchers {

  s"Shapes" should {

    "correctly inherit" in {
      val shape1: Shape = new Circle(1)
      val shape2: Shape = new Square(1)
      val shape3: Shape = new Rectangle(1, 2)

      succeed
    }

    "correctly calculate circle area and circumference" in {

      new Circle(5).area shouldBe 78.5 +- 0.1
      new Circle(7.5).area shouldBe 176.7 +- 0.1
      new Circle(5).circumference shouldBe 31.4 +- 0.1
      new Circle(7.5).circumference shouldBe 47.1 +- 0.1

    }

    "correctly calculate square area and circumference" in {

      new Square(3).area shouldBe 9
      new Square(7).area shouldBe 49
      new Square(19).circumference shouldBe 76
      new Square(9).circumference shouldBe 36

    }

    "correctly calculate rectange area and circumference" in {

      new Rectangle(3, 1).area shouldBe 3
      new Rectangle(5, 3).area shouldBe 15
      new Rectangle(7, 9).circumference shouldBe 32
      new Rectangle(1, 15).circumference shouldBe 32

    }

    "invariants should be checked" in {
      assertThrows[IllegalArgumentException] {
        new Rectangle(-3, 9)
      }

      assertThrows[IllegalArgumentException] {
        new Circle(-9)
      }

      assertThrows[IllegalArgumentException] {
        new Square(0)
      }
    }
  }
}
