package com.github.mshibuya.cloudformal.aws.logs

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-destination.html
 */

trait Destination extends Resource {
  val resourceTypeName = "AWS::Logs::Destination"

  def destinationName: String
  def destinationPolicy: String
  def roleArn: String
  def targetArn: String

  def resourceProperties: FormattableMap = Formattable.opt(
    "DestinationName" -> Some(Formattable(destinationName)),
    "DestinationPolicy" -> Some(Formattable(destinationPolicy)),
    "RoleArn" -> Some(Formattable(roleArn)),
    "TargetArn" -> Some(Formattable(targetArn))
  )
}
