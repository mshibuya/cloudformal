package com.github.mshibuya.cloudformal.aws.redshift

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clusterparametergroup.html
 */

trait ClusterParameterGroup extends Resource {
  val resourceTypeName = "AWS::Redshift::ClusterParameterGroup"

  def description: String
  def parameterGroupFamily: String
  def parameters: Option[Seq[Parameter]] = None
  def tags: Option[Seq[Tag]] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "Description" -> Some(Formattable(description)),
    "ParameterGroupFamily" -> Some(Formattable(parameterGroupFamily)),
    "Parameters" -> parameters.map(Formattable(_)),
    "Tags" -> tags.map(Formattable(_))
  )
}
