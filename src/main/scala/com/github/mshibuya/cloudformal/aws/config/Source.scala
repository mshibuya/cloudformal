package com.github.mshibuya.cloudformal.aws.config

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source.html
 */

case class Source(
    owner: String,
    sourceDetails: Option[Seq[SourceDetail]] = None,
    sourceIdentifier: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Owner" -> Some(Formattable(owner)),
    "SourceDetails" -> sourceDetails.map(Formattable(_)),
    "SourceIdentifier" -> Some(Formattable(sourceIdentifier))
  )
}
