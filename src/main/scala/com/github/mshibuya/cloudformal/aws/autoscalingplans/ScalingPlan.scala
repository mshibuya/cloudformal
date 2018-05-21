package com.github.mshibuya.cloudformal.aws.autoscalingplans

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscalingplans-scalingplan.html
 */

trait ScalingPlan extends Resource[ScalingPlan] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::AutoScalingPlans::ScalingPlan"

  def applicationSource: NonEmptyProperty[ApplicationSource]
  def scalingInstructions: NonEmptyProperty[Seq[ScalingInstruction]]

  def render(): MapValue[_] = Value(
    "ApplicationSource" -> applicationSource,
    "ScalingInstructions" -> scalingInstructions
  )
}
