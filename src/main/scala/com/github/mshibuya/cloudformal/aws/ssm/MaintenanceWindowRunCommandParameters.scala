package com.github.mshibuya.cloudformal.aws.ssm

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html
 */

case class MaintenanceWindowRunCommandParameters(
    timeoutSeconds: Property[Int] = Empty,
    comment: Property[String] = Empty,
    outputS3KeyPrefix: Property[String] = Empty,
    parameters: Property[Json] = Empty,
    documentHashType: Property[String] = Empty,
    serviceRoleArn: Property[String] = Empty,
    notificationConfig: Property[NotificationConfig] = Empty,
    outputS3BucketName: Property[String] = Empty,
    documentHash: Property[String] = Empty) extends Expression[MaintenanceWindowRunCommandParameters] {
  def render: Formattable = Value(
    "TimeoutSeconds" -> timeoutSeconds,
    "Comment" -> comment,
    "OutputS3KeyPrefix" -> outputS3KeyPrefix,
    "Parameters" -> parameters,
    "DocumentHashType" -> documentHashType,
    "ServiceRoleArn" -> serviceRoleArn,
    "NotificationConfig" -> notificationConfig,
    "OutputS3BucketName" -> outputS3BucketName,
    "DocumentHash" -> documentHash
  )
}
