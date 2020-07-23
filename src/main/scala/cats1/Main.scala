package com.example.quickstart.cats1

import cats.effect._
import cats.implicits._
import cats.Eval
import java.util.concurrent.ScheduledExecutorService
import scala.concurrent.duration._

object Main extends IOApp {
  def run(args: List[String]): IO[ExitCode] = {
    val ioa  = IO { println("hey!") }
    val yawn = IO.sleep(1.seconds) *> IO(println("yawn!"))

    val now = Eval.now(println(s"evan now now! ${math.random}"))

    val evalNow = IO { Eval.now(println(s"evan now! ${math.random}")) }

    //val program: IO[ExitCode] =
    for {
      _ <- ioa
      _ <- yawn
      _ <- ioa
      _ <- yawn
      _ <- ioa
      _ <- evalNow
      _ <- evalNow
      _ <- IO { now }
      _ <- IO { now }
    } yield ExitCode.Success

    //program.unsafeRunSync() >> IO(ExitCode.Success)
    //program >> IO(ExitCode.Success)
  }

}
