package com.github.mshibuya.cloudformal.aws.waf

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-webacl-rules.html
 */

case class ActivatedRule(
    action: WafAction,
    priority: Int,
    ruleId: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Action" -> Some(Formattable(action)),
    "Priority" -> Some(Formattable(priority)),
    "RuleId" -> Some(Formattable(ruleId))
  )
}
