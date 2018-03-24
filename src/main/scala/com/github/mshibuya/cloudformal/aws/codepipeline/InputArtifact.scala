package com.github.mshibuya.cloudformal.aws.codepipeline

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions-inputartifacts.html
 */

case class InputArtifact(
    name: NonEmptyProperty[String]) extends Expression[InputArtifact] {
  def render: Formattable = Value(
    "Name" -> name
  )
}
