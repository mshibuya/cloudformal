package com.github.mshibuya.cloudformal.aws.emr

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-step-keyvalue.html
 */

case class KeyValue(
    key: Property[String] = Empty,
    value: Property[String] = Empty) extends Expression[KeyValue] {
  def render: Formattable = Value(
    "Key" -> key,
    "Value" -> value
  )
}
