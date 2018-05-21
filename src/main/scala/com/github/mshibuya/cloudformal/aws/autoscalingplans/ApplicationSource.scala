package com.github.mshibuya.cloudformal.aws.autoscalingplans

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-applicationsource.html
 */

case class ApplicationSource(
    cloudFormationStackARN: Property[String] = Empty,
    tagFilters: Property[Seq[TagFilter]] = Empty) extends Expression[ApplicationSource] {
  def render: Formattable = Value(
    "CloudFormationStackARN" -> cloudFormationStackARN,
    "TagFilters" -> tagFilters
  )
}
