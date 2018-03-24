package com.github.mshibuya.cloudformal.aws.ssm

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rule.html
 */

case class Rule(
    enableNonSecurity: Property[Boolean] = Empty,
    patchFilterGroup: Property[PatchFilterGroup] = Empty,
    approveAfterDays: Property[Int] = Empty,
    complianceLevel: Property[String] = Empty) extends Expression[Rule] {
  def render: Formattable = Value(
    "EnableNonSecurity" -> enableNonSecurity,
    "PatchFilterGroup" -> patchFilterGroup,
    "ApproveAfterDays" -> approveAfterDays,
    "ComplianceLevel" -> complianceLevel
  )
}
