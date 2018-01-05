package com.github.mshibuya.cloudformal.aws.autoscaling

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html
 */

trait LifecycleHook extends Resource {
  val resourceTypeName = "AWS::AutoScaling::LifecycleHook"

  def autoScalingGroupName: String
  def defaultResult: Option[String] = None
  def heartbeatTimeout: Option[Int] = None
  def lifecycleHookName: Option[String] = None
  def lifecycleTransition: String
  def notificationMetadata: Option[String] = None
  def notificationTargetARN: Option[String] = None
  def roleARN: Option[String] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "AutoScalingGroupName" -> Some(Formattable(autoScalingGroupName)),
    "DefaultResult" -> defaultResult.map(Formattable(_)),
    "HeartbeatTimeout" -> heartbeatTimeout.map(Formattable(_)),
    "LifecycleHookName" -> lifecycleHookName.map(Formattable(_)),
    "LifecycleTransition" -> Some(Formattable(lifecycleTransition)),
    "NotificationMetadata" -> notificationMetadata.map(Formattable(_)),
    "NotificationTargetARN" -> notificationTargetARN.map(Formattable(_)),
    "RoleARN" -> roleARN.map(Formattable(_))
  )
}
