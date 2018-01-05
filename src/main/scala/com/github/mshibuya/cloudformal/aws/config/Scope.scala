package com.github.mshibuya.cloudformal.aws.config

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html
 */

case class Scope(
    complianceResourceId: Option[String] = None,
    complianceResourceTypes: Option[Seq[String]] = None,
    tagKey: Option[String] = None,
    tagValue: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "ComplianceResourceId" -> complianceResourceId.map(Formattable(_)),
    "ComplianceResourceTypes" -> complianceResourceTypes.map(Formattable(_)),
    "TagKey" -> tagKey.map(Formattable(_)),
    "TagValue" -> tagValue.map(Formattable(_))
  )
}
