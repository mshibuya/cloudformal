package com.github.mshibuya.cloudformal.aws.iot

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-policyprincipalattachment.html
 */

trait PolicyPrincipalAttachment extends Resource {
  val resourceTypeName = "AWS::IoT::PolicyPrincipalAttachment"

  def policyName: String
  def principal: String

  def resourceProperties: FormattableMap = Formattable.opt(
    "PolicyName" -> Some(Formattable(policyName)),
    "Principal" -> Some(Formattable(principal))
  )
}
