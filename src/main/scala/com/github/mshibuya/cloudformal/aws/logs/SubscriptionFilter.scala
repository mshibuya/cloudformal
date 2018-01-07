package com.github.mshibuya.cloudformal.aws.logs

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html
 */

trait SubscriptionFilter extends Resource {
  val resourceTypeName = "AWS::Logs::SubscriptionFilter"

  def destinationArn: NonEmptyProperty[String]
  def filterPattern: NonEmptyProperty[String]
  def logGroupName: NonEmptyProperty[String]
  def roleArn: Property[String] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "DestinationArn" -> destinationArn,
    "FilterPattern" -> filterPattern,
    "LogGroupName" -> logGroupName,
    "RoleArn" -> roleArn
  )
}
