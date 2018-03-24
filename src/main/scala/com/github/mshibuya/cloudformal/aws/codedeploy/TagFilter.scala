package com.github.mshibuya.cloudformal.aws.codedeploy

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-onpremisesinstancetagfilters.html
 */

case class TagFilter(
    key: Property[String] = Empty,
    `type`: Property[String] = Empty,
    value: Property[String] = Empty) extends Expression[TagFilter] {
  def render: Formattable = Value(
    "Key" -> key,
    "Type" -> `type`,
    "Value" -> value
  )
}
