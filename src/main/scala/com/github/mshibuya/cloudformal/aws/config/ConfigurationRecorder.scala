package com.github.mshibuya.cloudformal.aws.config

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationrecorder.html
 */

trait ConfigurationRecorder extends Resource {
  val resourceTypeName = "AWS::Config::ConfigurationRecorder"

  def name: Option[String] = None
  def recordingGroup: Option[RecordingGroup] = None
  def roleARN: String

  def resourceProperties: FormattableMap = Formattable.opt(
    "Name" -> name.map(Formattable(_)),
    "RecordingGroup" -> recordingGroup.map(Formattable(_)),
    "RoleARN" -> Some(Formattable(roleARN))
  )
}
