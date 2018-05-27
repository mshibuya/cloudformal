# Cloudformal

A type-safe CloudFormation DSL written in Scala, which you can apply changes casually!

[![Build Status](https://travis-ci.org/mshibuya/cloudformal.svg?branch=master)](https://travis-ci.org/mshibuya/cloudformal)

## Motivation

In this DevOps and Infrastructure as Code age, Infrastructure automation is unavoidable. Such a automation has a dangerous pitfall - if something goes wrong in automated operation, the automation can cause devastating effect, such as sweeping all of your production servers.

What can we do now? My idea is to enforce strict type-checking to infrastructure codes in compile time, before we ship it to production, making use of Scala's powerful type-system.

## How to use

1. First, you have to compile cloudformal locally(until forthcoming maven release, at least):

    ```
    git clone git@github.com:mshibuya/cloudformal.git
    cd cloudformal
    sbt publishLocal
    ```

1. Create your sbt project:

    build.sbt
    ```scala
    lazy val root = (project in file(".")).
      settings(
        inThisBuild(List(
          organization := "com.example",
          scalaVersion := "2.12.5",
          version      := "0.1.0-SNAPSHOT"
        )),
        name := "your-project-name",
        libraryDependencies += "com.github.mshibuya" %% "cloudformal" % "0.1.0-SNAPSHOT"
      )
    ```

    src/main/scala/com/example/Main.scala
    ```scala
    package com.example

    import com.github.mshibuya.cloudformal.CLI

    object Main extends CLI {
      def main(args: Array[String]): Unit = run(args)
    }
    ```


1. Describe your CloudFormation stacks:

    src/main/scala/com/example/YourStack.scala
    ```scala
    package com.example

    import com.github.mshibuya.cloudformal.aws.ec2
    import com.github.mshibuya.cloudformal.model._

    object YourStack extends Stack {
      val name = "YourStack"
      val description = "Example stack"

      val myServer = new ec2.Instance {
        val logicalId = "MyServer"
        val imageId = Value("ami-97785bed")
      }

      // These are macros which will pick up all members of corresponding type:
      val parameters: Seq[Parameter[_, _]] = Macros.parametersIn(this)
      val mappings: Seq[Mapping] = Macros.mappingsIn(this)
      val resources: Seq[Resource[_]] = Macros.resourcesIn(this)
      val outputs: Seq[Output[_]] = Macros.outputsIn(this)
      // Instead, you can do it manually like:
      //   val resources: Seq[Resource[_]] = Seq(myServer)
    }
    ```
1. Running `sbt "run generate com.example.YourStack"` will produce the CloudFormation template output.

    ```
    {
      "AWSTemplateFormatVersion" : "2010-09-09",
      "Description" : "Example stack",
      ...
    }
    ```

1. See `sbt "run --help"` for more commands and options.

## Alternatives

### [cloudform](https://github.com/bright/cloudform)

A young(it has almost the same birthday with ours), promising new CloudFormation DSL, utilizing TypeScript's robust type system and JSON friendliness.

### [cloudformation-template-generator](https://github.com/MonsantoCo/cloudformation-template-generator)

It was written in Scala like us, but comes with no auto-generation from AWS's CloudFormation resource specification, which makes it harder to keep up to CloudFormation new features and updates.
It's use case classes with resource representation leads to less margin of using user-defined type constraint, IMHO.

## License

[MIT](./LICENSE.md)
