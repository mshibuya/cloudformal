package com.github.mshibuya.cloudformal.aws.codepipeline

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-actions-outputartifacts.html
 */

case class OutputArtifact(
    name: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Name" -> Some(Formattable(name))
  )
}
