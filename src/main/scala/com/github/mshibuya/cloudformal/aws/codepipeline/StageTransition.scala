package com.github.mshibuya.cloudformal.aws.codepipeline

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-disableinboundstagetransitions.html
 */

case class StageTransition(
    reason: NonEmptyProperty[String],
    stageName: NonEmptyProperty[String]) extends Expression[StageTransition] {
  def render: Formattable = Value(
    "Reason" -> reason,
    "StageName" -> stageName
  )
}
