package com.github.mshibuya.cloudformal.aws.applicationautoscaling

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html
 */

trait ScalableTarget extends Resource[ScalableTarget] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::ApplicationAutoScaling::ScalableTarget"

  def maxCapacity: NonEmptyProperty[Int]
  def minCapacity: NonEmptyProperty[Int]
  def resourceId: NonEmptyProperty[String]
  def roleARN: NonEmptyProperty[String]
  def scalableDimension: NonEmptyProperty[String]
  def scheduledActions: Property[Seq[ScheduledAction]] = Empty
  def serviceNamespace: NonEmptyProperty[String]

  def render(): MapValue[_] = Value(
    "MaxCapacity" -> maxCapacity,
    "MinCapacity" -> minCapacity,
    "ResourceId" -> resourceId,
    "RoleARN" -> roleARN,
    "ScalableDimension" -> scalableDimension,
    "ScheduledActions" -> scheduledActions,
    "ServiceNamespace" -> serviceNamespace
  )
}
