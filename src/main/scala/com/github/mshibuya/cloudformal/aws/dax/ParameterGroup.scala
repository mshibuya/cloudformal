package com.github.mshibuya.cloudformal.aws.dax

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-parametergroup.html
 */

trait ParameterGroup extends Resource {
  val resourceTypeName = "AWS::DAX::ParameterGroup"

  def parameterNameValues: Property[Json] = Empty
  def description: Property[String] = Empty
  def parameterGroupName: Property[String] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "ParameterNameValues" -> parameterNameValues,
    "Description" -> description,
    "ParameterGroupName" -> parameterGroupName
  )
}
