package com.github.mshibuya.cloudformal.aws.codedeploy

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-ec2tagfilters.html
 */

case class EC2TagFilter(
    key: Property[String] = Empty,
    `type`: Property[String] = Empty,
    value: Property[String] = Empty) extends Expression[EC2TagFilter] {
  def render: Formattable = Value(
    "Key" -> key,
    "Type" -> `type`,
    "Value" -> value
  )
}
