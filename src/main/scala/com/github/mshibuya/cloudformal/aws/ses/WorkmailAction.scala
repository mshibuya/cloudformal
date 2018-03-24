package com.github.mshibuya.cloudformal.aws.ses

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-workmailaction.html
 */

case class WorkmailAction(
    topicArn: Property[String] = Empty,
    organizationArn: NonEmptyProperty[String]) extends Expression[WorkmailAction] {
  def render: Formattable = Value(
    "TopicArn" -> topicArn,
    "OrganizationArn" -> organizationArn
  )
}
