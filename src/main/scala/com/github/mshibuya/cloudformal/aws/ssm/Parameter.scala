package com.github.mshibuya.cloudformal.aws.ssm

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-parameter.html
 */

trait Parameter extends Resource {
  val resourceTypeName = "AWS::SSM::Parameter"

  def `type`: String
  def description: Option[String] = None
  def allowedPattern: Option[String] = None
  def value: String
  def name: Option[String] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "Type" -> Some(Formattable(`type`)),
    "Description" -> description.map(Formattable(_)),
    "AllowedPattern" -> allowedPattern.map(Formattable(_)),
    "Value" -> Some(Formattable(value)),
    "Name" -> name.map(Formattable(_))
  )
}
