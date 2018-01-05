package com.github.mshibuya.cloudformal.aws.ssm

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowlambdaparameters.html
 */

case class MaintenanceWindowLambdaParameters(
    clientContext: Option[String] = None,
    qualifier: Option[String] = None,
    payload: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "ClientContext" -> clientContext.map(Formattable(_)),
    "Qualifier" -> qualifier.map(Formattable(_)),
    "Payload" -> payload.map(Formattable(_))
  )
}
