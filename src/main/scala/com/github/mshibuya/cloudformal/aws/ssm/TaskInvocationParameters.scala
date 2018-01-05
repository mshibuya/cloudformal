package com.github.mshibuya.cloudformal.aws.ssm

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-taskinvocationparameters.html
 */

case class TaskInvocationParameters(
    maintenanceWindowRunCommandParameters: Option[MaintenanceWindowRunCommandParameters] = None,
    maintenanceWindowAutomationParameters: Option[MaintenanceWindowAutomationParameters] = None,
    maintenanceWindowStepFunctionsParameters: Option[MaintenanceWindowStepFunctionsParameters] = None,
    maintenanceWindowLambdaParameters: Option[MaintenanceWindowLambdaParameters] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "MaintenanceWindowRunCommandParameters" -> maintenanceWindowRunCommandParameters.map(Formattable(_)),
    "MaintenanceWindowAutomationParameters" -> maintenanceWindowAutomationParameters.map(Formattable(_)),
    "MaintenanceWindowStepFunctionsParameters" -> maintenanceWindowStepFunctionsParameters.map(Formattable(_)),
    "MaintenanceWindowLambdaParameters" -> maintenanceWindowLambdaParameters.map(Formattable(_))
  )
}
