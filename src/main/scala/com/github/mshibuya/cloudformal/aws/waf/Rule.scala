package com.github.mshibuya.cloudformal.aws.waf

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-rule.html
 */

trait Rule extends Resource {
  val resourceTypeName = "AWS::WAF::Rule"

  def metricName: String
  def name: String
  def predicates: Option[Seq[Predicate]] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "MetricName" -> Some(Formattable(metricName)),
    "Name" -> Some(Formattable(name)),
    "Predicates" -> predicates.map(Formattable(_))
  )
}
