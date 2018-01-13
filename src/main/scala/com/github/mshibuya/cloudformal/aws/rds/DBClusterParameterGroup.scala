package com.github.mshibuya.cloudformal.aws.rds

import argonaut.Json
import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbclusterparametergroup.html
 */

trait DBClusterParameterGroup extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::RDS::DBClusterParameterGroup"

  def description: NonEmptyProperty[String]
  def family: NonEmptyProperty[String]
  def parameters: NonEmptyProperty[Json]
  def tags: Property[Seq[Tag]] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "Description" -> description,
    "Family" -> family,
    "Parameters" -> parameters,
    "Tags" -> tags
  )
}
