package com.github.mshibuya.cloudformal.aws.wafregional

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-rule.html
 */

trait Rule extends Resource {
  val resourceTypeName = "AWS::WAFRegional::Rule"

  def metricName: String
  def predicates: Option[Seq[Predicate]] = None
  def name: String

  def resourceProperties: FormattableMap = Formattable.opt(
    "MetricName" -> Some(Formattable(metricName)),
    "Predicates" -> predicates.map(Formattable(_)),
    "Name" -> Some(Formattable(name))
  )
}
