package com.github.mshibuya.cloudformal.aws.rds

import com.github.mshibuya.cloudformal.model._

import scala.collection.immutable.ListMap

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbparametergroup.html
 */

trait DBParameterGroup extends Resource {
  val resourceTypeName = "AWS::RDS::DBParameterGroup"

  def description: NonEmptyProperty[String]
  def family: NonEmptyProperty[String]
  def parameters: Property[ListMap[String, String]] = Empty
  def tags: Property[Seq[Tag]] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "Description" -> description,
    "Family" -> family,
    "Parameters" -> parameters,
    "Tags" -> tags
  )
}
