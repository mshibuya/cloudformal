package com.github.mshibuya.cloudformal.aws.emr

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingrule.html
 */

case class ScalingRule(
    action: NonEmptyProperty[ScalingAction],
    description: Property[String] = Empty,
    name: NonEmptyProperty[String],
    trigger: NonEmptyProperty[ScalingTrigger]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "Action" -> action,
    "Description" -> description,
    "Name" -> name,
    "Trigger" -> trigger
  )
}
