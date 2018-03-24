package com.github.mshibuya.cloudformal.aws.dax

import argonaut.Json
import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-parametergroup.html
 */

trait ParameterGroup extends Resource[ParameterGroup] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::DAX::ParameterGroup"

  def parameterNameValues: Property[Json] = Empty
  def description: Property[String] = Empty
  def parameterGroupName: Property[String] = Empty

  def render(): MapValue[_] = Value(
    "ParameterNameValues" -> parameterNameValues,
    "Description" -> description,
    "ParameterGroupName" -> parameterGroupName
  )
}
