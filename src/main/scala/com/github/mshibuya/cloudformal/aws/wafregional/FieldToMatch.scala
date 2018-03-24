package com.github.mshibuya.cloudformal.aws.wafregional

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sqlinjectionmatchset-fieldtomatch.html
 */

case class FieldToMatch(
    `type`: NonEmptyProperty[String],
    data: Property[String] = Empty) extends Expression[FieldToMatch] {
  def render: Formattable = Value(
    "Type" -> `type`,
    "Data" -> data
  )
}
