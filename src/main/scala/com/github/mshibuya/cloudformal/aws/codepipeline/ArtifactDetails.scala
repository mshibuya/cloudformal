package com.github.mshibuya.cloudformal.aws.codepipeline

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-artifactdetails.html
 */

case class ArtifactDetails(
    maximumCount: NonEmptyProperty[Int],
    minimumCount: NonEmptyProperty[Int]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "MaximumCount" -> maximumCount,
    "MinimumCount" -> minimumCount
  )
}
