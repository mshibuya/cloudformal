package com.github.mshibuya.cloudformal.aws.codepipeline

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html
 */

trait Pipeline extends Resource {
  val resourceTypeName = "AWS::CodePipeline::Pipeline"

  def artifactStore: ArtifactStore
  def disableInboundStageTransitions: Option[Seq[StageTransition]] = None
  def name: Option[String] = None
  def restartExecutionOnUpdate: Option[Boolean] = None
  def roleArn: String
  def stages: Seq[StageDeclaration]

  def resourceProperties: FormattableMap = Formattable.opt(
    "ArtifactStore" -> Some(Formattable(artifactStore)),
    "DisableInboundStageTransitions" -> disableInboundStageTransitions.map(Formattable(_)),
    "Name" -> name.map(Formattable(_)),
    "RestartExecutionOnUpdate" -> restartExecutionOnUpdate.map(Formattable(_)),
    "RoleArn" -> Some(Formattable(roleArn)),
    "Stages" -> Some(Formattable(stages))
  )
}
