package com.github.mshibuya.cloudformal.aws.autoscalingplans

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html
 */

case class ScalingInstruction(
    resourceId: NonEmptyProperty[String],
    serviceNamespace: NonEmptyProperty[String],
    scalableDimension: NonEmptyProperty[String],
    minCapacity: NonEmptyProperty[Int],
    targetTrackingConfigurations: NonEmptyProperty[Seq[TargetTrackingConfiguration]],
    maxCapacity: NonEmptyProperty[Int]) extends Expression[ScalingInstruction] {
  def render: Formattable = Value(
    "ResourceId" -> resourceId,
    "ServiceNamespace" -> serviceNamespace,
    "ScalableDimension" -> scalableDimension,
    "MinCapacity" -> minCapacity,
    "TargetTrackingConfigurations" -> targetTrackingConfigurations,
    "MaxCapacity" -> maxCapacity
  )
}
