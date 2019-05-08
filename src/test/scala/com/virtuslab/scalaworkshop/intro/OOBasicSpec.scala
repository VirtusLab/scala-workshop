package com.virtuslab.scalaworkshop.intro

import org.scalatest.{Matchers, WordSpec}

class OOBasicSpec extends WordSpec with Matchers {


  s"OO Basics" should {
    "simple case class" in {

      class MyCls1(name: String)
      val cls1 = new MyCls1("test")

      class MyCls2(val name: String)
      val cls2 = new MyCls2("test")

      class MyCls3(var name: String)
      val cls3 = new MyCls3("test")

      class MyCls4(private var name: String)
      val cls4 = new MyCls4("test")

      class MyCls5(private var aName: String) {
        def name_=(name: String): Unit = {
          aName = name
          println("Mutator accessed")
        }

        def name = {
          println("Accessor accessed")
          aName
        }
      }
      val cls5 = new MyCls5("test")
    }
  }
}
