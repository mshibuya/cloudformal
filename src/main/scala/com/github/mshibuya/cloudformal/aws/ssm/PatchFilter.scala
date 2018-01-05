package com.github.mshibuya.cloudformal.aws.ssm

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfilter.html
 */

case class PatchFilter(
    values: Option[Seq[String]] = None,
    key: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Values" -> values.map(Formattable(_)),
    "Key" -> key.map(Formattable(_))
  )
}
