package com.github.mshibuya.cloudformal.aws.batch

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-volumeshost.html
 */

case class VolumesHost(
    sourcePath: Property[String] = Empty) extends Expression[VolumesHost] {
  def render: Formattable = Value(
    "SourcePath" -> sourcePath
  )
}
