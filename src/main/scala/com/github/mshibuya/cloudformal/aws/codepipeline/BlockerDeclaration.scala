package com.github.mshibuya.cloudformal.aws.codepipeline

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-blockers.html
 */

case class BlockerDeclaration(
    name: NonEmptyProperty[String],
    `type`: NonEmptyProperty[String]) extends Expression[BlockerDeclaration] {
  def render: Formattable = Value(
    "Name" -> name,
    "Type" -> `type`
  )
}
