package com.github.mshibuya.cloudformal.aws.codepipeline

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages-blockers.html
 */

case class BlockerDeclaration(
    name: String,
    `type`: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Name" -> Some(Formattable(name)),
    "Type" -> Some(Formattable(`type`))
  )
}
