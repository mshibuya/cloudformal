package com.github.mshibuya.cloudformal.aws.guardduty

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-ipset.html
 */

trait IPSet extends Resource {
  val resourceTypeName = "AWS::GuardDuty::IPSet"

  def format: NonEmptyProperty[String]
  def activate: NonEmptyProperty[Boolean]
  def detectorId: NonEmptyProperty[String]
  def name: Property[String] = Empty
  def location: NonEmptyProperty[String]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "Format" -> format,
    "Activate" -> activate,
    "DetectorId" -> detectorId,
    "Name" -> name,
    "Location" -> location
  )
}
