package com.github.mshibuya.cloudformal

import java.io.File

import com.github.mshibuya.cloudformal.command._

trait CLI {
  val parser = new scopt.OptionParser[Config]("cloudformal") {
    help("help").text("Prints this help message.")

    opt[String]("profile").action( (str, c) =>
      c.copy(profile = Some(str))).text("Use a specific profile from your aws credential file.")

    opt[String]("region").action( (str, c) =>
      c.copy(region = Some(str))).text("The aws region to use. Overrides config/env settings.")

    cmd("create").action { (_, c) =>
      c.copy(command = Some(Create))
    }.text("Creates a stack using given template.")
      .children(
        opt[String]("parameters").valueName("<list of parameters>").
          action { (str, c) =>
            c.copy(rawParameters = Some(str))
          }.text("Parameters to use, in format of --parameters key1=value1,key2=value2"),
        opt[String]("tags").valueName("<list of tags>").
          action { (str, c) =>
            c.copy(rawParameters = Some(str))
          }.text("Tags to set, in format of --tags key1=value1,key2=value2"),
        arg[String]("<className>").
          action { (str, c) =>
            c.copy(stackName = Some(str))
          }.maxOccurs(1).text("Fully classified class name of a Stack to process.")
      )

    cmd("delete").action { (_, c) =>
      c.copy(command = Some(Delete))
    }.text("Deletes a given stack.")
      .children(
        arg[String]("<className or stackName>").
          action { (str, c) =>
            c.copy(stackName = Some(str))
          }.maxOccurs(1).text("Fully classified class name of a Stack class or a CloudFormation stack name to process.")
      )

    cmd("diff").action { (_, c) =>
      c.copy(command = Some(Diff))
    }.text("Shows diff of current and generated templates of given stack.")
      .children(
        opt[File]("backend").valueName("<command line>").
          action { (file, c) =>
            c.copy(output = Some(file))
          }.text("Diff backend to use. If not given, 'git diff' is used."),
        arg[String]("<className>").
          action { (str, c) =>
            c.copy(stackName = Some(str))
          }.maxOccurs(1).text("Fully classified class name of a Stack to process.")
      )

    cmd("generate").action { (_, c) =>
      c.copy(command = Some(Generate))
    }.text("Generates and outputs given stack to CloudFormation template.")
      .children(
        opt[File]('o', "output").valueName("<file>").
          action { (file, c) =>
            c.copy(output = Some(file))
          }.text("Filename to output. If not given, STDOUT is used."),
        arg[String]("<className>").
          action { (str, c) =>
            c.copy(stackName = Some(str))
          }.maxOccurs(1).text("Fully classified class name of a Stack class to process.")
      )

    cmd("get").action { (_, c) =>
      c.copy(command = Some(Get))
    }.text("Gets and outputs current CloudFormation template.")
      .children(
        opt[File]('o', "output").valueName("<file>").
          action { (file, c) =>
            c.copy(output = Some(file))
          }.text("Filename to output. If not given, STDOUT is used."),
        arg[String]("<className or stackName>").
          action { (str, c) =>
            c.copy(stackName = Some(str))
          }.maxOccurs(1).text("Fully classified class name of a Stack class or a CloudFormation stack name to process.")
      )

    cmd("validate").action { (_, c) =>
      c.copy(command = Some(Validate))
    }.text("Validates given template.")
      .children(
        arg[String]("<className>").
          action { (str, c) =>
            c.copy(stackName = Some(str))
          }.maxOccurs(1).text("Fully classified class name of a Stack to process.")
      )
  }

  def run(args: Array[String]): Unit = {
    parser.parse(args, Config()) match {
      case Some(config) =>
        config.command.foreach(_.execute(config).get)
      case None =>
        println(s"Unable to parse arguments: ${args.mkString(" ")}")
        System.exit(1)
    }
  }
}
