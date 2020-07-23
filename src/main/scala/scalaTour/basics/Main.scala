package com.scalaTour

/*
  scalac Basics.scala
 */
object Basics {
  def main(args: Array[String]): Unit = {
    println("Hello, World!")

    // expressions
    val x1: Int = 1 + 1
    val x2      = 2 + 3
    println(x2 * x2)

    // functions
    val addOne = (x: Int) => x + 1
    println(addOne(1))

    val add2 = (x: Int, y: Int) => x + y
    println(add2(1, 2))

    val noParams = () => 42
    println(noParams)

    // methods
    def add(x: Int, y: Int): Int = x + y
    println(add(5, 11))

    def addThenMultiply(x: Int, y: Int)(multiplier: Int): Int = (x + y) * multiplier

    // classes
    class Greeter(prefix: String, suffix: String) {
      def greet(name: String): Unit =
        println(prefix + name + suffix)
    }

    new Greeter("Hello, ", "!").greet("Scala developer")

    case class Point(x: Int, y: Int)

    val point1 = Point(1, 2)
    val point2 = Point(2, 4)

    println(point1 == point2) // compared by value

    println(IdFactory.create())
    println(IdFactory.create())

    println(new DefaultGreeter().greet("Scala developer"))
    println(new CustomizableGreeter("How are you, ", "?").greet("Scala developer"))

  }

  object IdFactory {
    private var counter = 0
    def create(): Int = {
      counter += 1
      counter
    }
  }

  trait Greeter {
    def greet(name: String): Unit =
      println(s"hello $name")
  }

  class DefaultGreeter extends Greeter
  class CustomizableGreeter(prefix: String, suffix: String) extends Greeter {
    override def greet(name: String): Unit =
      println(prefix + name + suffix)
  }

}
