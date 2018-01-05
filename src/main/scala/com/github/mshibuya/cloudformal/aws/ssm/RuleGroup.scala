package com.github.mshibuya.cloudformal.aws.ssm

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rulegroup.html
 */

case class RuleGroup(
    patchRules: Option[Seq[Rule]] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "PatchRules" -> patchRules.map(Formattable(_))
  )
}
