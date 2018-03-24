package com.github.mshibuya.cloudformal.aws.ssm

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowstepfunctionsparameters.html
 */

case class MaintenanceWindowStepFunctionsParameters(
    input: Property[String] = Empty,
    name: Property[String] = Empty) extends Expression[MaintenanceWindowStepFunctionsParameters] {
  def render: Formattable = Value(
    "Input" -> input,
    "Name" -> name
  )
}
