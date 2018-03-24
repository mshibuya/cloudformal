package com.github.mshibuya.cloudformal.aws.ssm

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfilter.html
 */

case class PatchFilter(
    values: Property[Seq[String]] = Empty,
    key: Property[String] = Empty) extends Expression[PatchFilter] {
  def render: Formattable = Value(
    "Values" -> values,
    "Key" -> key
  )
}
