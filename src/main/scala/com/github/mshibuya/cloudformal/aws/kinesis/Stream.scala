package com.github.mshibuya.cloudformal.aws.kinesis

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html
 */

trait Stream extends Resource {
  val resourceTypeName = "AWS::Kinesis::Stream"

  def name: Option[String] = None
  def retentionPeriodHours: Option[Int] = None
  def shardCount: Int
  def tags: Option[Seq[Tag]] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "Name" -> name.map(Formattable(_)),
    "RetentionPeriodHours" -> retentionPeriodHours.map(Formattable(_)),
    "ShardCount" -> Some(Formattable(shardCount)),
    "Tags" -> tags.map(Formattable(_))
  )
}
