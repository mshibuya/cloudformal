package com.github.mshibuya.cloudformal.command

import com.github.mshibuya.cloudformal.model._

import scala.annotation.tailrec
import scala.io.StdIn
import scala.util.{Success, Try}

abstract class Command {
  def loadStack(name: String): Try[Stack] = Try {
    StackLoader().findStacksBy(name) match {
      case Nil => throw new StackLoadException(s"No stack found to match: $name")
      case Seq(e) => e
      case stacks => throw new StackLoadException(s"Ambiguous match: ${stacks.mkString(",")}")
    }
  }

  def prompt(config: Config, message: String)(op: => Try[Unit]): Try[Unit] = {
    System.out.print(message)

    @tailrec
    def loop(): Try[Unit] = {
      System.out.println("(yes/No)")
      val input = StdIn.readLine()
      input.toLowerCase match {
        case "yes" | "y" => op
        case "no" | "n" | "" =>
          System.out.println("Cancelling...")
          Success()
        case _ =>
          System.out.println("Type yes or no.")
          loop()
      }
    }
    if (config.force)
      op
    else
      loop()
  }

  def execute(config: Config): Try[Unit]
}
