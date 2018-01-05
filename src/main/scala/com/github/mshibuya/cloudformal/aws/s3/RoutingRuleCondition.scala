package com.github.mshibuya.cloudformal.aws.s3

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-routingrulecondition.html
 */

case class RoutingRuleCondition(
    httpErrorCodeReturnedEquals: Option[String] = None,
    keyPrefixEquals: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "HttpErrorCodeReturnedEquals" -> httpErrorCodeReturnedEquals.map(Formattable(_)),
    "KeyPrefixEquals" -> keyPrefixEquals.map(Formattable(_))
  )
}
