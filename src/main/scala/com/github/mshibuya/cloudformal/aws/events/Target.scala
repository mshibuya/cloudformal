package com.github.mshibuya.cloudformal.aws.events

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html
 */

case class Target(
    arn: String,
    ecsParameters: Option[EcsParameters] = None,
    id: String,
    input: Option[String] = None,
    inputPath: Option[String] = None,
    inputTransformer: Option[InputTransformer] = None,
    kinesisParameters: Option[KinesisParameters] = None,
    roleArn: Option[String] = None,
    runCommandParameters: Option[RunCommandParameters] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Arn" -> Some(Formattable(arn)),
    "EcsParameters" -> ecsParameters.map(Formattable(_)),
    "Id" -> Some(Formattable(id)),
    "Input" -> input.map(Formattable(_)),
    "InputPath" -> inputPath.map(Formattable(_)),
    "InputTransformer" -> inputTransformer.map(Formattable(_)),
    "KinesisParameters" -> kinesisParameters.map(Formattable(_)),
    "RoleArn" -> roleArn.map(Formattable(_)),
    "RunCommandParameters" -> runCommandParameters.map(Formattable(_))
  )
}
