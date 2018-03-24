package com.github.mshibuya.cloudformal.aws.applicationautoscaling

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html
 */

trait ScalingPolicy extends Resource[ScalingPolicy] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::ApplicationAutoScaling::ScalingPolicy"

  def policyName: NonEmptyProperty[String]
  def policyType: NonEmptyProperty[String]
  def resourceId: Property[String] = Empty
  def scalableDimension: Property[String] = Empty
  def scalingTargetId: Property[String] = Empty
  def serviceNamespace: Property[String] = Empty
  def stepScalingPolicyConfiguration: Property[StepScalingPolicyConfiguration] = Empty
  def targetTrackingScalingPolicyConfiguration: Property[TargetTrackingScalingPolicyConfiguration] = Empty

  def render(): MapValue[_] = Value(
    "PolicyName" -> policyName,
    "PolicyType" -> policyType,
    "ResourceId" -> resourceId,
    "ScalableDimension" -> scalableDimension,
    "ScalingTargetId" -> scalingTargetId,
    "ServiceNamespace" -> serviceNamespace,
    "StepScalingPolicyConfiguration" -> stepScalingPolicyConfiguration,
    "TargetTrackingScalingPolicyConfiguration" -> targetTrackingScalingPolicyConfiguration
  )
}
