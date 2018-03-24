package com.github.mshibuya.cloudformal.aws.wafregional

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-rule.html
 */

trait Rule extends Resource[Rule] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::WAFRegional::Rule"

  def metricName: NonEmptyProperty[String]
  def predicates: Property[Seq[Predicate]] = Empty
  def name: NonEmptyProperty[String]

  def render(): MapValue[_] = Value(
    "MetricName" -> metricName,
    "Predicates" -> predicates,
    "Name" -> name
  )
}
