package com.github.mshibuya.cloudformal.aws.dax

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-parametergroup.html
 */

trait ParameterGroup extends Resource {
  val resourceTypeName = "AWS::DAX::ParameterGroup"

  def parameterNameValues: Option[Json] = None
  def description: Option[String] = None
  def parameterGroupName: Option[String] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "ParameterNameValues" -> parameterNameValues.map(Formattable(_)),
    "Description" -> description.map(Formattable(_)),
    "ParameterGroupName" -> parameterGroupName.map(Formattable(_))
  )
}
