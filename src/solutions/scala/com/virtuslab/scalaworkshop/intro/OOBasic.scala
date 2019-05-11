package com.virtuslab.scalaworkshop.intro

object OOBasic {


  def main(args: Array[String]): Unit = {

      class MyCls1(name: String)
      val cls1 = new MyCls1("test")

      class MyCls2(val name: String)
      val cls2 = new MyCls2("test")

      class MyCls3(var name: String)
      val cls3 = new MyCls3("test")

      class MyCls4(private var name: String)
      val cls4 = new MyCls4("test")


      class MyClsWithMet(name: String) {
        def method(param: String): Int = {
          return param.length
        }
      }

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

      class MyCls6(name: String) {
        require(!name.isEmpty)
      }

      class MyCls7(name: String, another: Int) {
        def this() = this("123", 5)

        def this(aName: String) = this(aName, 5)
      }

      new MyCls7("fdas")
    }
}
