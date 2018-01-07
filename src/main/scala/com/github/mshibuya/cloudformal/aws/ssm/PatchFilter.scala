package com.github.mshibuya.cloudformal.aws.ssm

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfilter.html
 */

case class PatchFilter(
    values: Property[Seq[String]] = Empty,
    key: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "Values" -> values,
    "Key" -> key
  )
}
