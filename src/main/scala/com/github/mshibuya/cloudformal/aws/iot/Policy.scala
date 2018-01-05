package com.github.mshibuya.cloudformal.aws.iot

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-policy.html
 */

trait Policy extends Resource {
  val resourceTypeName = "AWS::IoT::Policy"

  def policyDocument: Json
  def policyName: Option[String] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "PolicyDocument" -> Some(Formattable(policyDocument)),
    "PolicyName" -> policyName.map(Formattable(_))
  )
}
