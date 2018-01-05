package com.github.mshibuya.cloudformal.aws.iot

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-republishaction.html
 */

case class RepublishAction(
    roleArn: String,
    topic: String) extends Renderable {
  def render: Formattable = Formattable.opt(
    "RoleArn" -> Some(Formattable(roleArn)),
    "Topic" -> Some(Formattable(topic))
  )
}
