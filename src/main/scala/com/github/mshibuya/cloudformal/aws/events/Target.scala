package com.github.mshibuya.cloudformal.aws.events

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html
 */

case class Target(
    arn: NonEmptyProperty[String],
    ecsParameters: Property[EcsParameters] = Empty,
    id: NonEmptyProperty[String],
    input: Property[String] = Empty,
    inputPath: Property[String] = Empty,
    inputTransformer: Property[InputTransformer] = Empty,
    kinesisParameters: Property[KinesisParameters] = Empty,
    roleArn: Property[String] = Empty,
    runCommandParameters: Property[RunCommandParameters] = Empty) extends Expression[Target] {
  def render: Formattable = Value(
    "Arn" -> arn,
    "EcsParameters" -> ecsParameters,
    "Id" -> id,
    "Input" -> input,
    "InputPath" -> inputPath,
    "InputTransformer" -> inputTransformer,
    "KinesisParameters" -> kinesisParameters,
    "RoleArn" -> roleArn,
    "RunCommandParameters" -> runCommandParameters
  )
}
