package com.github.mshibuya.cloudformal.aws.elasticbeanstalk

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment-tier.html
 */

case class Tier(
    name: Property[String] = Empty,
    `type`: Property[String] = Empty,
    version: Property[String] = Empty) extends Expression[Tier] {
  def render: Formattable = Value(
    "Name" -> name,
    "Type" -> `type`,
    "Version" -> version
  )
}
