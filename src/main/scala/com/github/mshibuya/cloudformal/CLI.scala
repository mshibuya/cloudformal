package com.github.mshibuya.cloudformal

import java.io.File

import com.github.mshibuya.cloudformal.command._

trait CLI {
  case class Config(command: Option[Command] = None,
                    output: Option[File] = None,
                    stackName: Option[String] = None)

  val parser = new scopt.OptionParser[Config]("cloudformal") {
    help("help").text("Prints this help message.")

    cmd("generate").action { (_, c) =>
      c.copy(command = Some(Generate))
    }.text("Converts and outputs given stack to CloudFormation template.")
      .children(
        opt[File]('o', "output").valueName("<file>").
          action( (x, c) => c.copy(output = Some(x)) ).
          text("Filename to output. If not given, STDOUT is used."),
        arg[String]("<className>").action( (x, c) =>
        c.copy(stackName = Some(x)) ).text("Fully classified class name of a Stack to process.")
      )
  }

  def run(args: Array[String]): Unit = {
    parser.parse(args, Config()) match {
      case Some(config) => {
        config match {
          case Config(Some(Generate), output, Some(stackName)) => Generate.execute(stackName, output)
          case _ => {
            println(s"Not enough arguments.")
            System.exit(1)
          }
        }
      }
      case None => {
        println(s"Unable to parse arguments: ${args.mkString(" ")}")
        System.exit(1)
      }
    }
  }
}
