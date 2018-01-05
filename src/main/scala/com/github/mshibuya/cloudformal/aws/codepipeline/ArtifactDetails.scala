package com.github.mshibuya.cloudformal.aws.codepipeline

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-artifactdetails.html
 */

case class ArtifactDetails(
    maximumCount: Int,
    minimumCount: Int) extends Renderable {
  def render: Formattable = Formattable.opt(
    "MaximumCount" -> Some(Formattable(maximumCount)),
    "MinimumCount" -> Some(Formattable(minimumCount))
  )
}
