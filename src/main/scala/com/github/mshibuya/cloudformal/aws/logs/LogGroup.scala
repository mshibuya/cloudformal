package com.github.mshibuya.cloudformal.aws.logs

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loggroup.html
 */

trait LogGroup extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::Logs::LogGroup"

  def arnAttribute: Expression[String] = Fn.GetAtt(logicalId, "Arn")

  def logGroupName: Property[String] = Empty
  def retentionInDays: Property[Int] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "LogGroupName" -> logGroupName,
    "RetentionInDays" -> retentionInDays
  )
}
