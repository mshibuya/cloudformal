package com.github.mshibuya.cloudformal.aws.logs

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loggroup.html
 */

trait LogGroup extends Resource {
  val resourceTypeName = "AWS::Logs::LogGroup"

  def arnAttribute: Expression[String] = Fn.GetAtt(logicalId, "Arn")

  def logGroupName: Property[String] = Empty
  def retentionInDays: Property[Int] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "LogGroupName" -> logGroupName,
    "RetentionInDays" -> retentionInDays
  )
}
