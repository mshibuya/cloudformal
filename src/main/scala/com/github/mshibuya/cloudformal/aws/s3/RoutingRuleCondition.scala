package com.github.mshibuya.cloudformal.aws.s3

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-routingrulecondition.html
 */

case class RoutingRuleCondition(
    httpErrorCodeReturnedEquals: Property[String] = Empty,
    keyPrefixEquals: Property[String] = Empty) extends Expression[RoutingRuleCondition] {
  def render: Formattable = Value(
    "HttpErrorCodeReturnedEquals" -> httpErrorCodeReturnedEquals,
    "KeyPrefixEquals" -> keyPrefixEquals
  )
}
