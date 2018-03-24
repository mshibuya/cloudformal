package com.github.mshibuya.cloudformal.aws.waf

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-webacl.html
 */

trait WebACL extends Resource[WebACL] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::WAF::WebACL"

  def defaultAction: NonEmptyProperty[WafAction]
  def metricName: NonEmptyProperty[String]
  def name: NonEmptyProperty[String]
  def rules: Property[Seq[ActivatedRule]] = Empty

  def render(): MapValue[_] = Value(
    "DefaultAction" -> defaultAction,
    "MetricName" -> metricName,
    "Name" -> name,
    "Rules" -> rules
  )
}
