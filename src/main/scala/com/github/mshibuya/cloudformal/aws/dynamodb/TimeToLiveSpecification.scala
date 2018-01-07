package com.github.mshibuya.cloudformal.aws.dynamodb

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-timetolivespecification.html
 */

case class TimeToLiveSpecification(
    attributeName: NonEmptyProperty[String],
    enabled: NonEmptyProperty[Boolean]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "AttributeName" -> attributeName,
    "Enabled" -> enabled
  )
}
