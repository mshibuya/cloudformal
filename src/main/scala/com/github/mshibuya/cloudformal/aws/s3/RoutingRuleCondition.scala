package com.github.mshibuya.cloudformal.aws.s3

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-routingrulecondition.html
 */

case class RoutingRuleCondition(
    httpErrorCodeReturnedEquals: Property[String] = Empty,
    keyPrefixEquals: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "HttpErrorCodeReturnedEquals" -> httpErrorCodeReturnedEquals,
    "KeyPrefixEquals" -> keyPrefixEquals
  )
}
