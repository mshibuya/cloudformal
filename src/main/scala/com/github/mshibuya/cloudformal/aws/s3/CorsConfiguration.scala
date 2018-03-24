package com.github.mshibuya.cloudformal.aws.s3

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors.html
 */

case class CorsConfiguration(
    corsRules: NonEmptyProperty[Seq[CorsRule]]) extends Expression[CorsConfiguration] {
  def render: Formattable = Value(
    "CorsRules" -> corsRules
  )
}
