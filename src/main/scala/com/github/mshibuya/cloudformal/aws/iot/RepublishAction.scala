package com.github.mshibuya.cloudformal.aws.iot

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-republishaction.html
 */

case class RepublishAction(
    roleArn: NonEmptyProperty[String],
    topic: NonEmptyProperty[String]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "RoleArn" -> roleArn,
    "Topic" -> topic
  )
}
