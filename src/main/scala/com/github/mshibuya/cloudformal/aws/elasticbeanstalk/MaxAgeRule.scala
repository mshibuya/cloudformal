package com.github.mshibuya.cloudformal.aws.elasticbeanstalk

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxagerule.html
 */

case class MaxAgeRule(
    deleteSourceFromS3: Option[Boolean] = None,
    enabled: Option[Boolean] = None,
    maxAgeInDays: Option[Int] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "DeleteSourceFromS3" -> deleteSourceFromS3.map(Formattable(_)),
    "Enabled" -> enabled.map(Formattable(_)),
    "MaxAgeInDays" -> maxAgeInDays.map(Formattable(_))
  )
}
