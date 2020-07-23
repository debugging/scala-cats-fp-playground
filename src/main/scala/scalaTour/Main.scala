package scalaTour

/*
  scalac HelloWorld.scala
 */
object HelloWorld {
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

  }
}
