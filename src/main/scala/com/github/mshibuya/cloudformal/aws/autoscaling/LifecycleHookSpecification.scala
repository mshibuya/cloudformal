package com.github.mshibuya.cloudformal.aws.autoscaling

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html
 */

case class LifecycleHookSpecification(
    defaultResult: Property[String] = Empty,
    heartbeatTimeout: Property[Int] = Empty,
    lifecycleHookName: NonEmptyProperty[String],
    lifecycleTransition: NonEmptyProperty[String],
    notificationMetadata: Property[String] = Empty,
    notificationTargetARN: Property[String] = Empty,
    roleARN: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "DefaultResult" -> defaultResult,
    "HeartbeatTimeout" -> heartbeatTimeout,
    "LifecycleHookName" -> lifecycleHookName,
    "LifecycleTransition" -> lifecycleTransition,
    "NotificationMetadata" -> notificationMetadata,
    "NotificationTargetARN" -> notificationTargetARN,
    "RoleARN" -> roleARN
  )
}
