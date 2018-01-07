package com.github.mshibuya.cloudformal.aws.kinesisanalytics

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-jsonmappingparameters.html
 */

case class JSONMappingParameters(
    recordRowPath: NonEmptyProperty[String]) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "RecordRowPath" -> recordRowPath
  )
}
