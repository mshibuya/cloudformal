package com.github.mshibuya.cloudformal.aws.autoscaling

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html
 */

trait LifecycleHook extends Resource[LifecycleHook] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::AutoScaling::LifecycleHook"

  def autoScalingGroupName: NonEmptyProperty[String]
  def defaultResult: Property[String] = Empty
  def heartbeatTimeout: Property[Int] = Empty
  def lifecycleHookName: Property[String] = Empty
  def lifecycleTransition: NonEmptyProperty[String]
  def notificationMetadata: Property[String] = Empty
  def notificationTargetARN: Property[String] = Empty
  def roleARN: Property[String] = Empty

  def render(): MapValue[_] = Value(
    "AutoScalingGroupName" -> autoScalingGroupName,
    "DefaultResult" -> defaultResult,
    "HeartbeatTimeout" -> heartbeatTimeout,
    "LifecycleHookName" -> lifecycleHookName,
    "LifecycleTransition" -> lifecycleTransition,
    "NotificationMetadata" -> notificationMetadata,
    "NotificationTargetARN" -> notificationTargetARN,
    "RoleARN" -> roleARN
  )
}
