package com.github.mshibuya.cloudformal.aws.codepipeline

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html
 */

trait Pipeline extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::CodePipeline::Pipeline"

  def artifactStore: NonEmptyProperty[ArtifactStore]
  def disableInboundStageTransitions: Property[Seq[StageTransition]] = Empty
  def name: Property[String] = Empty
  def restartExecutionOnUpdate: Property[Boolean] = Empty
  def roleArn: NonEmptyProperty[String]
  def stages: NonEmptyProperty[Seq[StageDeclaration]]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "ArtifactStore" -> artifactStore,
    "DisableInboundStageTransitions" -> disableInboundStageTransitions,
    "Name" -> name,
    "RestartExecutionOnUpdate" -> restartExecutionOnUpdate,
    "RoleArn" -> roleArn,
    "Stages" -> stages
  )
}
