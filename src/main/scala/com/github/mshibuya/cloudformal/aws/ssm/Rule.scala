package com.github.mshibuya.cloudformal.aws.ssm

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rule.html
 */

case class Rule(
    patchFilterGroup: Option[PatchFilterGroup] = None,
    approveAfterDays: Option[Int] = None,
    complianceLevel: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "PatchFilterGroup" -> patchFilterGroup.map(Formattable(_)),
    "ApproveAfterDays" -> approveAfterDays.map(Formattable(_)),
    "ComplianceLevel" -> complianceLevel.map(Formattable(_))
  )
}
