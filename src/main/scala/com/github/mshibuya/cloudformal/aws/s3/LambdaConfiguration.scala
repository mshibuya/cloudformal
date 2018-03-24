package com.github.mshibuya.cloudformal.aws.s3

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-lambdaconfig.html
 */

case class LambdaConfiguration(
    event: NonEmptyProperty[String],
    filter: Property[NotificationFilter] = Empty,
    function: NonEmptyProperty[String]) extends Expression[LambdaConfiguration] {
  def render: Formattable = Value(
    "Event" -> event,
    "Filter" -> filter,
    "Function" -> function
  )
}
