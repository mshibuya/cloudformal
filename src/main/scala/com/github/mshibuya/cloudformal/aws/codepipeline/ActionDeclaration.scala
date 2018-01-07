package com.github.mshibuya.cloudformal.aws.codepipeline

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions.html
 */

case class ActionDeclaration(
    actionTypeId: NonEmptyProperty[ActionTypeId],
    configuration: Property[Json] = Empty,
    inputArtifacts: Property[Seq[InputArtifact]] = Empty,
    name: NonEmptyProperty[String],
    outputArtifacts: Property[Seq[OutputArtifact]] = Empty,
    roleArn: Property[String] = Empty,
    runOrder: Property[Int] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "ActionTypeId" -> actionTypeId,
    "Configuration" -> configuration,
    "InputArtifacts" -> inputArtifacts,
    "Name" -> name,
    "OutputArtifacts" -> outputArtifacts,
    "RoleArn" -> roleArn,
    "RunOrder" -> runOrder
  )
}
