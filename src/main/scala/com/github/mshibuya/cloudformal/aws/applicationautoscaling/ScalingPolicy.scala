package com.github.mshibuya.cloudformal.aws.applicationautoscaling

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html
 */

trait ScalingPolicy extends Resource {
  val resourceTypeName = "AWS::ApplicationAutoScaling::ScalingPolicy"

  def policyName: String
  def policyType: String
  def resourceId: Option[String] = None
  def scalableDimension: Option[String] = None
  def scalingTargetId: Option[String] = None
  def serviceNamespace: Option[String] = None
  def stepScalingPolicyConfiguration: Option[StepScalingPolicyConfiguration] = None
  def targetTrackingScalingPolicyConfiguration: Option[TargetTrackingScalingPolicyConfiguration] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "PolicyName" -> Some(Formattable(policyName)),
    "PolicyType" -> Some(Formattable(policyType)),
    "ResourceId" -> resourceId.map(Formattable(_)),
    "ScalableDimension" -> scalableDimension.map(Formattable(_)),
    "ScalingTargetId" -> scalingTargetId.map(Formattable(_)),
    "ServiceNamespace" -> serviceNamespace.map(Formattable(_)),
    "StepScalingPolicyConfiguration" -> stepScalingPolicyConfiguration.map(Formattable(_)),
    "TargetTrackingScalingPolicyConfiguration" -> targetTrackingScalingPolicyConfiguration.map(Formattable(_))
  )
}
