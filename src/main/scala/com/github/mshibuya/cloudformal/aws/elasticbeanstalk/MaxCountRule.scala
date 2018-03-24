package com.github.mshibuya.cloudformal.aws.elasticbeanstalk

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxcountrule.html
 */

case class MaxCountRule(
    deleteSourceFromS3: Property[Boolean] = Empty,
    enabled: Property[Boolean] = Empty,
    maxCount: Property[Int] = Empty) extends Expression[MaxCountRule] {
  def render: Formattable = Value(
    "DeleteSourceFromS3" -> deleteSourceFromS3,
    "Enabled" -> enabled,
    "MaxCount" -> maxCount
  )
}
