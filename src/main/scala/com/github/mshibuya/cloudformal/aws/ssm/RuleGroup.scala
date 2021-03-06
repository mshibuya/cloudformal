package com.github.mshibuya.cloudformal.aws.ssm

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rulegroup.html
 */

case class RuleGroup(
    patchRules: Property[Seq[Rule]] = Empty) extends Expression[RuleGroup] {
  def render: Formattable = Value(
    "PatchRules" -> patchRules
  )
}
