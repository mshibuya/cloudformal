package com.github.mshibuya.cloudformal.aws.logs

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-logstream.html
 */

trait LogStream extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::Logs::LogStream"

  def logGroupName: NonEmptyProperty[String]
  def logStreamName: Property[String] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "LogGroupName" -> logGroupName,
    "LogStreamName" -> logStreamName
  )
}
