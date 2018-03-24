package com.github.mshibuya.cloudformal.aws.dynamodb

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-timetolivespecification.html
 */

case class TimeToLiveSpecification(
    attributeName: NonEmptyProperty[String],
    enabled: NonEmptyProperty[Boolean]) extends Expression[TimeToLiveSpecification] {
  def render: Formattable = Value(
    "AttributeName" -> attributeName,
    "Enabled" -> enabled
  )
}
