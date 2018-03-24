package com.github.mshibuya.cloudformal.aws.config

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordinggroup.html
 */

case class RecordingGroup(
    allSupported: Property[Boolean] = Empty,
    includeGlobalResourceTypes: Property[Boolean] = Empty,
    resourceTypes: Property[Seq[String]] = Empty) extends Expression[RecordingGroup] {
  def render: Formattable = Value(
    "AllSupported" -> allSupported,
    "IncludeGlobalResourceTypes" -> includeGlobalResourceTypes,
    "ResourceTypes" -> resourceTypes
  )
}
