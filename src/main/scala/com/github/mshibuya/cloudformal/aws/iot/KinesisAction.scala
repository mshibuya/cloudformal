package com.github.mshibuya.cloudformal.aws.iot

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kinesisaction.html
 */

case class KinesisAction(
    partitionKey: Option[String] = None,
    roleArn: String,
    streamName: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "PartitionKey" -> partitionKey.map(Formattable(_)),
    "RoleArn" -> Some(Formattable(roleArn)),
    "StreamName" -> Some(Formattable(streamName))
  )
}
