package com.github.mshibuya.cloudformal.aws.logs

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html
 */

trait SubscriptionFilter extends Resource {
  val resourceTypeName = "AWS::Logs::SubscriptionFilter"

  def destinationArn: String
  def filterPattern: String
  def logGroupName: String
  def roleArn: Option[String] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "DestinationArn" -> Some(Formattable(destinationArn)),
    "FilterPattern" -> Some(Formattable(filterPattern)),
    "LogGroupName" -> Some(Formattable(logGroupName)),
    "RoleArn" -> roleArn.map(Formattable(_))
  )
}
