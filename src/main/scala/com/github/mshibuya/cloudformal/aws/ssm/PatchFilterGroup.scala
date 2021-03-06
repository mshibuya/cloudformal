package com.github.mshibuya.cloudformal.aws.ssm

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfiltergroup.html
 */

case class PatchFilterGroup(
    patchFilters: Property[Seq[PatchFilter]] = Empty) extends Expression[PatchFilterGroup] {
  def render: Formattable = Value(
    "PatchFilters" -> patchFilters
  )
}
