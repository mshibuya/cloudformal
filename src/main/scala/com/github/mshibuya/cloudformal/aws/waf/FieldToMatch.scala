package com.github.mshibuya.cloudformal.aws.waf

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples-fieldtomatch.html
 */

case class FieldToMatch(
    data: Property[String] = Empty,
    `type`: NonEmptyProperty[String]) extends Expression[FieldToMatch] {
  def render: Formattable = Value(
    "Data" -> data,
    "Type" -> `type`
  )
}
