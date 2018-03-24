package com.github.mshibuya.cloudformal.aws.wafregional

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-ipset-ipsetdescriptor.html
 */

case class IPSetDescriptor(
    `type`: NonEmptyProperty[String],
    value: NonEmptyProperty[String]) extends Expression[IPSetDescriptor] {
  def render: Formattable = Value(
    "Type" -> `type`,
    "Value" -> value
  )
}
