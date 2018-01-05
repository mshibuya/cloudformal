package com.github.mshibuya.cloudformal.aws.guardduty

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-threatintelset.html
 */

trait ThreatIntelSet extends Resource {
  val resourceTypeName = "AWS::GuardDuty::ThreatIntelSet"

  def format: String
  def activate: Boolean
  def detectorId: String
  def name: Option[String] = None
  def location: String

  def resourceProperties: FormattableMap = Formattable.opt(
    "Format" -> Some(Formattable(format)),
    "Activate" -> Some(Formattable(activate)),
    "DetectorId" -> Some(Formattable(detectorId)),
    "Name" -> name.map(Formattable(_)),
    "Location" -> Some(Formattable(location))
  )
}
