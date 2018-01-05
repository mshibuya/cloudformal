package com.github.mshibuya.cloudformal.aws.config

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordinggroup.html
 */

case class RecordingGroup(
    allSupported: Option[Boolean] = None,
    includeGlobalResourceTypes: Option[Boolean] = None,
    resourceTypes: Option[Seq[String]] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "AllSupported" -> allSupported.map(Formattable(_)),
    "IncludeGlobalResourceTypes" -> includeGlobalResourceTypes.map(Formattable(_)),
    "ResourceTypes" -> resourceTypes.map(Formattable(_))
  )
}
