package com.github.mshibuya.cloudformal.aws.codebuild

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projecttriggers.html
 */

case class ProjectTriggers(
    webhook: Property[Boolean] = Empty) extends Expression[ProjectTriggers] {
  def render: Formattable = Value(
    "Webhook" -> webhook
  )
}
