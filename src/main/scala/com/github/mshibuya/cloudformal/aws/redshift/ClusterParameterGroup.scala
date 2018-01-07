package com.github.mshibuya.cloudformal.aws.redshift

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clusterparametergroup.html
 */

trait ClusterParameterGroup extends Resource {
  val resourceTypeName = "AWS::Redshift::ClusterParameterGroup"

  def description: NonEmptyProperty[String]
  def parameterGroupFamily: NonEmptyProperty[String]
  def parameters: Property[Seq[Parameter]] = Empty
  def tags: Property[Seq[Tag]] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "Description" -> description,
    "ParameterGroupFamily" -> parameterGroupFamily,
    "Parameters" -> parameters,
    "Tags" -> tags
  )
}
