package com.github.mshibuya.cloudformal.aws.elasticbeanstalk

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxagerule.html
 */

case class MaxAgeRule(
    deleteSourceFromS3: Property[Boolean] = Empty,
    enabled: Property[Boolean] = Empty,
    maxAgeInDays: Property[Int] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "DeleteSourceFromS3" -> deleteSourceFromS3,
    "Enabled" -> enabled,
    "MaxAgeInDays" -> maxAgeInDays
  )
}
