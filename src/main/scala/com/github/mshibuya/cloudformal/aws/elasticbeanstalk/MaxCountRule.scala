package com.github.mshibuya.cloudformal.aws.elasticbeanstalk

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxcountrule.html
 */

case class MaxCountRule(
    deleteSourceFromS3: Option[Boolean] = None,
    enabled: Option[Boolean] = None,
    maxCount: Option[Int] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "DeleteSourceFromS3" -> deleteSourceFromS3.map(Formattable(_)),
    "Enabled" -> enabled.map(Formattable(_)),
    "MaxCount" -> maxCount.map(Formattable(_))
  )
}
