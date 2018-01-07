package com.github.mshibuya.cloudformal.aws.guardduty

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html
 */

trait Detector extends Resource {
  val resourceTypeName = "AWS::GuardDuty::Detector"

  def enable: NonEmptyProperty[Boolean]

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "Enable" -> enable
  )
}
