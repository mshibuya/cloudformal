package com.github.mshibuya.cloudformal.aws.ssm

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html
 */

trait Parameter extends Resource[Parameter] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::SSM::Parameter"

  object attributes {
    val `type`: Expression[String] = Fn.GetAtt(logicalId, "Type")
    val value: Expression[String] = Fn.GetAtt(logicalId, "Value")
  }

  def `type`: NonEmptyProperty[String]
  def description: Property[String] = Empty
  def allowedPattern: Property[String] = Empty
  def value: NonEmptyProperty[String]
  def name: Property[String] = Empty

  def render(): MapValue[_] = Value(
    "Type" -> `type`,
    "Description" -> description,
    "AllowedPattern" -> allowedPattern,
    "Value" -> value,
    "Name" -> name
  )
}
