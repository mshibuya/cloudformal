package com.github.mshibuya.cloudformal.aws.applicationautoscaling

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html
 */

trait ScalableTarget extends Resource {
  val resourceTypeName = "AWS::ApplicationAutoScaling::ScalableTarget"

  def maxCapacity: Int
  def minCapacity: Int
  def resourceId: String
  def roleARN: String
  def scalableDimension: String
  def scheduledActions: Option[Seq[ScheduledAction]] = None
  def serviceNamespace: String

  def resourceProperties: FormattableMap = Formattable.opt(
    "MaxCapacity" -> Some(Formattable(maxCapacity)),
    "MinCapacity" -> Some(Formattable(minCapacity)),
    "ResourceId" -> Some(Formattable(resourceId)),
    "RoleARN" -> Some(Formattable(roleARN)),
    "ScalableDimension" -> Some(Formattable(scalableDimension)),
    "ScheduledActions" -> scheduledActions.map(Formattable(_)),
    "ServiceNamespace" -> Some(Formattable(serviceNamespace))
  )
}
