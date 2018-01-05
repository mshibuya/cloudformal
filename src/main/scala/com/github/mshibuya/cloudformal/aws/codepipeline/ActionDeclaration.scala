package com.github.mshibuya.cloudformal.aws.codepipeline

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions.html
 */

case class ActionDeclaration(
    actionTypeId: ActionTypeId,
    configuration: Option[Json] = None,
    inputArtifacts: Option[Seq[InputArtifact]] = None,
    name: String,
    outputArtifacts: Option[Seq[OutputArtifact]] = None,
    roleArn: Option[String] = None,
    runOrder: Option[Int] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "ActionTypeId" -> Some(Formattable(actionTypeId)),
    "Configuration" -> configuration.map(Formattable(_)),
    "InputArtifacts" -> inputArtifacts.map(Formattable(_)),
    "Name" -> Some(Formattable(name)),
    "OutputArtifacts" -> outputArtifacts.map(Formattable(_)),
    "RoleArn" -> roleArn.map(Formattable(_)),
    "RunOrder" -> runOrder.map(Formattable(_))
  )
}
