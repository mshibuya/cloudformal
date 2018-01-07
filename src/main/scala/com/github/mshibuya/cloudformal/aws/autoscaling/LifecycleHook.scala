package com.github.mshibuya.cloudformal.aws.autoscaling

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html
 */

trait LifecycleHook extends Resource {
  val resourceTypeName = "AWS::AutoScaling::LifecycleHook"

  def autoScalingGroupName: NonEmptyProperty[String]
  def defaultResult: Property[String] = Empty
  def heartbeatTimeout: Property[Int] = Empty
  def lifecycleHookName: Property[String] = Empty
  def lifecycleTransition: NonEmptyProperty[String]
  def notificationMetadata: Property[String] = Empty
  def notificationTargetARN: Property[String] = Empty
  def roleARN: Property[String] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
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
