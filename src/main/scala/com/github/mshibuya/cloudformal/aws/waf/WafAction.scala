package com.github.mshibuya.cloudformal.aws.waf

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-webacl-action.html
 */

case class WafAction(
    `type`: NonEmptyProperty[String]) extends Expression[WafAction] {
  def render: Formattable = Value(
    "Type" -> `type`
  )
}
