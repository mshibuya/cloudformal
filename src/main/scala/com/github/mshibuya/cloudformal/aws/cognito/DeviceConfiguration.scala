package com.github.mshibuya.cloudformal.aws.cognito

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-deviceconfiguration.html
 */

case class DeviceConfiguration(
    deviceOnlyRememberedOnUserPrompt: Property[Boolean] = Empty,
    challengeRequiredOnNewDevice: Property[Boolean] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "DeviceOnlyRememberedOnUserPrompt" -> deviceOnlyRememberedOnUserPrompt,
    "ChallengeRequiredOnNewDevice" -> challengeRequiredOnNewDevice
  )
}
