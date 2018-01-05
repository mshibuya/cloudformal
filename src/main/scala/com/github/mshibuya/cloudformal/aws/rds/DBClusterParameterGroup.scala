package com.github.mshibuya.cloudformal.aws.rds

import argonaut.Json
import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbclusterparametergroup.html
 */

trait DBClusterParameterGroup extends Resource {
  val resourceTypeName = "AWS::RDS::DBClusterParameterGroup"

  def description: String
  def family: String
  def parameters: Json
  def tags: Option[Seq[Tag]] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "Description" -> Some(Formattable(description)),
    "Family" -> Some(Formattable(family)),
    "Parameters" -> Some(Formattable(parameters)),
    "Tags" -> tags.map(Formattable(_))
  )
}
