package com.github.mshibuya.cloudformal

import com.github.mshibuya.cloudformal.command._

trait CLI {
  case class Config(command: Option[Command] = None,
                    stackName: Option[String] = None)

  val parser = new scopt.OptionParser[Config]("cloudformal") {
    help("help").text("Prints this help message.")

    cmd("convert").action { (_, c) =>
      c.copy(command = Some(Convert))
    }.text("Converts and outputs given stack to CloudFormation template.")
      .children(
        arg[String]("<className>").action( (x, c) =>
          c.copy(stackName = Some(x)) ).text("Fully classified class name of a Stack to process.")
      )
  }

  def run(args: Array[String]): Unit = {
    parser.parse(args, Config()) match {
      case Some(config) => {
        config match {
          case Config(Some(Convert), Some(stackName)) => Convert.execute(stackName)
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
