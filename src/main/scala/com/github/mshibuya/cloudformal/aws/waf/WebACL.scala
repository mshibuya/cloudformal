package com.github.mshibuya.cloudformal.aws.waf

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-webacl.html
 */

trait WebACL extends Resource {
  val resourceTypeName = "AWS::WAF::WebACL"

  def defaultAction: WafAction
  def metricName: String
  def name: String
  def rules: Option[Seq[ActivatedRule]] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "DefaultAction" -> Some(Formattable(defaultAction)),
    "MetricName" -> Some(Formattable(metricName)),
    "Name" -> Some(Formattable(name)),
    "Rules" -> rules.map(Formattable(_))
  )
}
