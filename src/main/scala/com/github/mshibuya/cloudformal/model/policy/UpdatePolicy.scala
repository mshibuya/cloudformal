package com.github.mshibuya.cloudformal.model.policy

import com.github.mshibuya.cloudformal.model._

case class UpdatePolicy(
    autoScalingReplacingUpdate: Property[AutoScalingReplacingUpdate] = Empty,
    autoScalingRollingUpdate: Property[AutoScalingRollingUpdate] = Empty,
    autoScalingScheduledAction: Property[AutoScalingScheduledAction] = Empty,
    codeDeployLambdaAliasUpdate: Property[CodeDeployLambdaAliasUpdate] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "AutoScalingReplacingUpdate" -> autoScalingReplacingUpdate,
    "AutoScalingRollingUpdate" -> autoScalingRollingUpdate,
    "AutoScalingScheduledAction" -> autoScalingScheduledAction,
    "CodeDeployLambdaAliasUpdate" -> codeDeployLambdaAliasUpdate
  )
}