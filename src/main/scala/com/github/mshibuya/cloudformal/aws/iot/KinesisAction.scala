package com.github.mshibuya.cloudformal.aws.iot

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kinesisaction.html
 */

case class KinesisAction(
    partitionKey: Property[String] = Empty,
    roleArn: NonEmptyProperty[String],
    streamName: NonEmptyProperty[String]) extends Expression[KinesisAction] {
  def render: Formattable = Value(
    "PartitionKey" -> partitionKey,
    "RoleArn" -> roleArn,
    "StreamName" -> streamName
  )
}
