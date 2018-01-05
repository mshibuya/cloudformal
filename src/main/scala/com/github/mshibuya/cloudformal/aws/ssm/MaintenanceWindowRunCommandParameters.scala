package com.github.mshibuya.cloudformal.aws.ssm

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html
 */

case class MaintenanceWindowRunCommandParameters(
    timeoutSeconds: Option[Int] = None,
    comment: Option[String] = None,
    outputS3KeyPrefix: Option[String] = None,
    parameters: Option[Json] = None,
    documentHashType: Option[String] = None,
    serviceRoleArn: Option[String] = None,
    notificationConfig: Option[NotificationConfig] = None,
    outputS3BucketName: Option[String] = None,
    documentHash: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "TimeoutSeconds" -> timeoutSeconds.map(Formattable(_)),
    "Comment" -> comment.map(Formattable(_)),
    "OutputS3KeyPrefix" -> outputS3KeyPrefix.map(Formattable(_)),
    "Parameters" -> parameters.map(Formattable(_)),
    "DocumentHashType" -> documentHashType.map(Formattable(_)),
    "ServiceRoleArn" -> serviceRoleArn.map(Formattable(_)),
    "NotificationConfig" -> notificationConfig.map(Formattable(_)),
    "OutputS3BucketName" -> outputS3BucketName.map(Formattable(_)),
    "DocumentHash" -> documentHash.map(Formattable(_))
  )
}
