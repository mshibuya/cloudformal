package com.github.mshibuya.cloudformal.aws.waf

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-ipset-ipsetdescriptors.html
 */

case class IPSetDescriptor(
    `type`: NonEmptyProperty[String],
    value: NonEmptyProperty[String]) extends Expression[IPSetDescriptor] {
  def render: Formattable = Value(
    "Type" -> `type`,
    "Value" -> value
  )
}
