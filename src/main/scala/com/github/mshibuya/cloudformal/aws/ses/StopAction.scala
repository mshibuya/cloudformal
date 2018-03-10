package com.github.mshibuya.cloudformal.aws.ses

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-stopaction.html
 */

case class StopAction(
    scope: NonEmptyProperty[String],
    topicArn: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "Scope" -> scope,
    "TopicArn" -> topicArn
  )
}
