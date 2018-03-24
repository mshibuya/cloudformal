package com.github.mshibuya.cloudformal.aws.codepipeline

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages.html
 */

case class StageDeclaration(
    actions: NonEmptyProperty[Seq[ActionDeclaration]],
    blockers: Property[Seq[BlockerDeclaration]] = Empty,
    name: NonEmptyProperty[String]) extends Expression[StageDeclaration] {
  def render: Formattable = Value(
    "Actions" -> actions,
    "Blockers" -> blockers,
    "Name" -> name
  )
}
