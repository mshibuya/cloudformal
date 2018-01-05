package com.github.mshibuya.cloudformal.aws.codepipeline

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stages.html
 */

case class StageDeclaration(
    actions: Seq[ActionDeclaration],
    blockers: Option[Seq[BlockerDeclaration]] = None,
    name: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Actions" -> Some(Formattable(actions)),
    "Blockers" -> blockers.map(Formattable(_)),
    "Name" -> Some(Formattable(name))
  )
}
