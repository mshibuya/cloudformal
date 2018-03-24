package com.github.mshibuya.cloudformal.aws.ssm

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowlambdaparameters.html
 */

case class MaintenanceWindowLambdaParameters(
    clientContext: Property[String] = Empty,
    qualifier: Property[String] = Empty,
    payload: Property[String] = Empty) extends Expression[MaintenanceWindowLambdaParameters] {
  def render: Formattable = Value(
    "ClientContext" -> clientContext,
    "Qualifier" -> qualifier,
    "Payload" -> payload
  )
}
