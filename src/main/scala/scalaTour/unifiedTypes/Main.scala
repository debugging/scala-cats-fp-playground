package com.scalaTour

object UnifiedTypes {
  def main(args: Array[String]): Unit = {
    val a: Any = "I am Anytype, subtypes call me Any"
    println(s"what type are you Mr? $a")
    /*
           Any
        /      \
      AnyVal  AnyRef
     */

    // Any
    // a.equals()
    // a.hashCode()
    // a.toString()

    // AnyVal represents value types
    // Double
    // Float
    // Long
    // Int
    // Short
    // Byte
    // Char
    // Unit -- one instance of Unit
    // Boolean

    // AnyRef represents reference types
    // user-defined type is a subtype of AnyRef
    // Nothing is a subtype of all types, aka bottom type
    // Null is a subtype of all reference types - single value of null (never use this!)

  }
}
