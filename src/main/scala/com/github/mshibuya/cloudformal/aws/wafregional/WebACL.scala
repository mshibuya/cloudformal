package com.github.mshibuya.cloudformal.aws.wafregional

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html
 */

trait WebACL extends Resource {
  val resourceTypeName = "AWS::WAFRegional::WebACL"

  def metricName: NonEmptyProperty[String]
  def defaultAction: NonEmptyProperty[Action]
  def rules: Property[Seq[Rule]] = Empty
  def name: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "MetricName" -> metricName,
    "DefaultAction" -> defaultAction,
    "Rules" -> rules,
    "Name" -> name
  )
}
