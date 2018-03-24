package com.github.mshibuya.cloudformal.model.policy

import com.github.mshibuya.cloudformal.model._

case class CodeDeployLambdaAliasUpdate(
    afterAllowTrafficHook: Property[String] = Empty,
    applicationName: Property[String] = Empty,
    beforeAllowTrafficHook: Property[String] = Empty,
    deploymentGroupName: Property[String] = Empty) extends Expression[CodeDeployLambdaAliasUpdate] {
  def render: Formattable = Value(
    "AfterAllowTrafficHook" -> afterAllowTrafficHook,
    "ApplicationName" -> applicationName,
    "BeforeAllowTrafficHook" -> beforeAllowTrafficHook,
    "DeploymentGroupName" -> deploymentGroupName
  )
}