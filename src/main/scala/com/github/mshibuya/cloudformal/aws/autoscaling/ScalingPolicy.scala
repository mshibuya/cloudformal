package com.github.mshibuya.cloudformal.aws.autoscaling

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html
 */

trait ScalingPolicy extends Resource {
  val resourceTypeName = "AWS::AutoScaling::ScalingPolicy"

  def adjustmentType: Option[String] = None
  def autoScalingGroupName: String
  def cooldown: Option[String] = None
  def estimatedInstanceWarmup: Option[Int] = None
  def metricAggregationType: Option[String] = None
  def minAdjustmentMagnitude: Option[Int] = None
  def policyType: Option[String] = None
  def scalingAdjustment: Option[Int] = None
  def stepAdjustments: Option[Seq[StepAdjustment]] = None
  def targetTrackingConfiguration: Option[TargetTrackingConfiguration] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "AdjustmentType" -> adjustmentType.map(Formattable(_)),
    "AutoScalingGroupName" -> Some(Formattable(autoScalingGroupName)),
    "Cooldown" -> cooldown.map(Formattable(_)),
    "EstimatedInstanceWarmup" -> estimatedInstanceWarmup.map(Formattable(_)),
    "MetricAggregationType" -> metricAggregationType.map(Formattable(_)),
    "MinAdjustmentMagnitude" -> minAdjustmentMagnitude.map(Formattable(_)),
    "PolicyType" -> policyType.map(Formattable(_)),
    "ScalingAdjustment" -> scalingAdjustment.map(Formattable(_)),
    "StepAdjustments" -> stepAdjustments.map(Formattable(_)),
    "TargetTrackingConfiguration" -> targetTrackingConfiguration.map(Formattable(_))
  )
}
