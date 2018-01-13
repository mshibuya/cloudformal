package com.github.mshibuya.cloudformal.aws.autoscaling

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html
 */

trait ScalingPolicy extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::AutoScaling::ScalingPolicy"

  def adjustmentType: Property[String] = Empty
  def autoScalingGroupName: NonEmptyProperty[String]
  def cooldown: Property[String] = Empty
  def estimatedInstanceWarmup: Property[Int] = Empty
  def metricAggregationType: Property[String] = Empty
  def minAdjustmentMagnitude: Property[Int] = Empty
  def policyType: Property[String] = Empty
  def scalingAdjustment: Property[Int] = Empty
  def stepAdjustments: Property[Seq[StepAdjustment]] = Empty
  def targetTrackingConfiguration: Property[TargetTrackingConfiguration] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "AdjustmentType" -> adjustmentType,
    "AutoScalingGroupName" -> autoScalingGroupName,
    "Cooldown" -> cooldown,
    "EstimatedInstanceWarmup" -> estimatedInstanceWarmup,
    "MetricAggregationType" -> metricAggregationType,
    "MinAdjustmentMagnitude" -> minAdjustmentMagnitude,
    "PolicyType" -> policyType,
    "ScalingAdjustment" -> scalingAdjustment,
    "StepAdjustments" -> stepAdjustments,
    "TargetTrackingConfiguration" -> targetTrackingConfiguration
  )
}
