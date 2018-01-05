package com.github.mshibuya.cloudformal.aws.rds

import com.github.mshibuya.cloudformal.model._

import scala.collection.immutable.ListMap

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbparametergroup.html
 */

trait DBParameterGroup extends Resource {
  val resourceTypeName = "AWS::RDS::DBParameterGroup"

  def description: String
  def family: String
  def parameters: Option[ListMap[String, String]] = None
  def tags: Option[Seq[Tag]] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "Description" -> Some(Formattable(description)),
    "Family" -> Some(Formattable(family)),
    "Parameters" -> parameters.map(Formattable(_)),
    "Tags" -> tags.map(Formattable(_))
  )
}
