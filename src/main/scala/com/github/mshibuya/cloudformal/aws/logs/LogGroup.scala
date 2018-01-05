package com.github.mshibuya.cloudformal.aws.logs

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loggroup.html
 */

trait LogGroup extends Resource {
  val resourceTypeName = "AWS::Logs::LogGroup"

  def logGroupName: Option[String] = None
  def retentionInDays: Option[Int] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "LogGroupName" -> logGroupName.map(Formattable(_)),
    "RetentionInDays" -> retentionInDays.map(Formattable(_))
  )
}
