package com.github.mshibuya.cloudformal.aws.logs

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-logstream.html
 */

trait LogStream extends Resource {
  val resourceTypeName = "AWS::Logs::LogStream"

  def logGroupName: String
  def logStreamName: Option[String] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "LogGroupName" -> Some(Formattable(logGroupName)),
    "LogStreamName" -> logStreamName.map(Formattable(_))
  )
}
