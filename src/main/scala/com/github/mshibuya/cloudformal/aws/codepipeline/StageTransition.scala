package com.github.mshibuya.cloudformal.aws.codepipeline

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-disableinboundstagetransitions.html
 */

case class StageTransition(
    reason: String,
    stageName: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Reason" -> Some(Formattable(reason)),
    "StageName" -> Some(Formattable(stageName))
  )
}
