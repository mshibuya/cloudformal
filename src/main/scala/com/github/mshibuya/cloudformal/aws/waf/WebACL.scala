package com.github.mshibuya.cloudformal.aws.waf

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-webacl.html
 */

trait WebACL extends Resource {
  val resourceTypeName = "AWS::WAF::WebACL"

  def defaultAction: NonEmptyProperty[WafAction]
  def metricName: NonEmptyProperty[String]
  def name: NonEmptyProperty[String]
  def rules: Property[Seq[ActivatedRule]] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "DefaultAction" -> defaultAction,
    "MetricName" -> metricName,
    "Name" -> name,
    "Rules" -> rules
  )
}
