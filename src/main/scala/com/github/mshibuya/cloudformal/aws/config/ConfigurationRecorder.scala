package com.github.mshibuya.cloudformal.aws.config

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationrecorder.html
 */

trait ConfigurationRecorder extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::Config::ConfigurationRecorder"

  def name: Property[String] = Empty
  def recordingGroup: Property[RecordingGroup] = Empty
  def roleARN: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "Name" -> name,
    "RecordingGroup" -> recordingGroup,
    "RoleARN" -> roleARN
  )
}
