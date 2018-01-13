package com.github.mshibuya.cloudformal.aws.logs

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-destination.html
 */

trait Destination extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::Logs::Destination"

  def arnAttribute: Expression[String] = Fn.GetAtt(logicalId, "Arn")

  def destinationName: NonEmptyProperty[String]
  def destinationPolicy: NonEmptyProperty[String]
  def roleArn: NonEmptyProperty[String]
  def targetArn: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "DestinationName" -> destinationName,
    "DestinationPolicy" -> destinationPolicy,
    "RoleArn" -> roleArn,
    "TargetArn" -> targetArn
  )
}
