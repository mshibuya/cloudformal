package com.github.mshibuya.cloudformal.aws.ssm

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowautomationparameters.html
 */

case class MaintenanceWindowAutomationParameters(
    parameters: Option[Json] = None,
    documentVersion: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Parameters" -> parameters.map(Formattable(_)),
    "DocumentVersion" -> documentVersion.map(Formattable(_))
  )
}
