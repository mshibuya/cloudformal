package com.github.mshibuya.cloudformal.aws.autoscaling

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html
 */

case class LifecycleHookSpecification(
    defaultResult: Option[String] = None,
    heartbeatTimeout: Option[Int] = None,
    lifecycleHookName: String,
    lifecycleTransition: String,
    notificationMetadata: Option[String] = None,
    notificationTargetARN: Option[String] = None,
    roleARN: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "DefaultResult" -> defaultResult.map(Formattable(_)),
    "HeartbeatTimeout" -> heartbeatTimeout.map(Formattable(_)),
    "LifecycleHookName" -> Some(Formattable(lifecycleHookName)),
    "LifecycleTransition" -> Some(Formattable(lifecycleTransition)),
    "NotificationMetadata" -> notificationMetadata.map(Formattable(_)),
    "NotificationTargetARN" -> notificationTargetARN.map(Formattable(_)),
    "RoleARN" -> roleARN.map(Formattable(_))
  )
}
