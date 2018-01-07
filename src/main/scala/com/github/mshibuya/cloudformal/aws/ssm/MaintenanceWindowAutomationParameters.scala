package com.github.mshibuya.cloudformal.aws.ssm

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowautomationparameters.html
 */

case class MaintenanceWindowAutomationParameters(
    parameters: Property[Json] = Empty,
    documentVersion: Property[String] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "Parameters" -> parameters,
    "DocumentVersion" -> documentVersion
  )
}
