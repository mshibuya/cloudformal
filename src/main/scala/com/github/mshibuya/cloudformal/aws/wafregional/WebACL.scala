package com.github.mshibuya.cloudformal.aws.wafregional

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html
 */

trait WebACL extends Resource {
  val resourceTypeName = "AWS::WAFRegional::WebACL"

  def metricName: String
  def defaultAction: Action
  def rules: Option[Seq[Rule]] = None
  def name: String

  def resourceProperties: FormattableMap = Formattable.opt(
    "MetricName" -> Some(Formattable(metricName)),
    "DefaultAction" -> Some(Formattable(defaultAction)),
    "Rules" -> rules.map(Formattable(_)),
    "Name" -> Some(Formattable(name))
  )
}
