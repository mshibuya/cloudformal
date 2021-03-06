package com.github.mshibuya.cloudformal.aws.ses

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationseteventdestination.html
 */

trait ConfigurationSetEventDestination extends Resource[ConfigurationSetEventDestination] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::SES::ConfigurationSetEventDestination"

  def configurationSetName: NonEmptyProperty[String]
  def eventDestination: NonEmptyProperty[EventDestination]

  def render(): MapValue[_] = Value(
    "ConfigurationSetName" -> configurationSetName,
    "EventDestination" -> eventDestination
  )
}
