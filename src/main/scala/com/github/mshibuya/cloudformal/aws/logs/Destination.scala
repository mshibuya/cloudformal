package com.github.mshibuya.cloudformal.aws.logs

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-destination.html
 */

trait Destination extends Resource[Destination] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::Logs::Destination"

  object attributes {
    val arn: Expression[String] = Fn.GetAtt(logicalId, "Arn")
  }

  def destinationName: NonEmptyProperty[String]
  def destinationPolicy: NonEmptyProperty[String]
  def roleArn: NonEmptyProperty[String]
  def targetArn: NonEmptyProperty[String]

  def render(): MapValue[_] = Value(
    "DestinationName" -> destinationName,
    "DestinationPolicy" -> destinationPolicy,
    "RoleArn" -> roleArn,
    "TargetArn" -> targetArn
  )
}
