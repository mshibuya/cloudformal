package com.github.mshibuya.cloudformal.aws.waf

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-rule.html
 */

trait Rule extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::WAF::Rule"

  def metricName: NonEmptyProperty[String]
  def name: NonEmptyProperty[String]
  def predicates: Property[Seq[Predicate]] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "MetricName" -> metricName,
    "Name" -> name,
    "Predicates" -> predicates
  )
}
