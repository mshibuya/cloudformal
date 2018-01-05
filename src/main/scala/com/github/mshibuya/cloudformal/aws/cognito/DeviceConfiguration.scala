package com.github.mshibuya.cloudformal.aws.cognito

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-deviceconfiguration.html
 */

case class DeviceConfiguration(
    deviceOnlyRememberedOnUserPrompt: Option[Boolean] = None,
    challengeRequiredOnNewDevice: Option[Boolean] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "DeviceOnlyRememberedOnUserPrompt" -> deviceOnlyRememberedOnUserPrompt.map(Formattable(_)),
    "ChallengeRequiredOnNewDevice" -> challengeRequiredOnNewDevice.map(Formattable(_))
  )
}
