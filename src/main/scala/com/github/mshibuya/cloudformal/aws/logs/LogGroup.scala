package com.github.mshibuya.cloudformal.aws.logs

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loggroup.html
 */

trait LogGroup extends Resource[LogGroup] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::Logs::LogGroup"

  object attributes {
    val arn: Expression[String] = Fn.GetAtt(logicalId, "Arn")
  }

  def logGroupName: Property[String] = Empty
  def retentionInDays: Property[Int] = Empty

  def render(): MapValue[_] = Value(
    "LogGroupName" -> logGroupName,
    "RetentionInDays" -> retentionInDays
  )
}
