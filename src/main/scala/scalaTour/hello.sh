#!/bin/sh
exec scala "$0" "$@"
!#


# chmod +x hello.sh
# ./hello.sh
object HelloWorld extends App {
  println("Hello, world!")
}