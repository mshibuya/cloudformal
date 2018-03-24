package com.github.mshibuya.cloudformal.aws.ssm

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-taskinvocationparameters.html
 */

case class TaskInvocationParameters(
    maintenanceWindowRunCommandParameters: Property[MaintenanceWindowRunCommandParameters] = Empty,
    maintenanceWindowAutomationParameters: Property[MaintenanceWindowAutomationParameters] = Empty,
    maintenanceWindowStepFunctionsParameters: Property[MaintenanceWindowStepFunctionsParameters] = Empty,
    maintenanceWindowLambdaParameters: Property[MaintenanceWindowLambdaParameters] = Empty) extends Expression[TaskInvocationParameters] {
  def render: Formattable = Value(
    "MaintenanceWindowRunCommandParameters" -> maintenanceWindowRunCommandParameters,
    "MaintenanceWindowAutomationParameters" -> maintenanceWindowAutomationParameters,
    "MaintenanceWindowStepFunctionsParameters" -> maintenanceWindowStepFunctionsParameters,
    "MaintenanceWindowLambdaParameters" -> maintenanceWindowLambdaParameters
  )
}
