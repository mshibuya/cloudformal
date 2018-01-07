package com.github.mshibuya.cloudformal.aws.config

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html
 */

case class Scope(
    complianceResourceId: Property[String] = Empty,
    complianceResourceTypes: Property[Seq[String]] = Empty,
    tagKey: Property[String] = Empty,
    tagValue: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "ComplianceResourceId" -> complianceResourceId,
    "ComplianceResourceTypes" -> complianceResourceTypes,
    "TagKey" -> tagKey,
    "TagValue" -> tagValue
  )
}
