package com.github.mshibuya.cloudformal.aws.redshift

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroup.html
 */

trait ClusterSecurityGroup extends Resource {
  val resourceTypeName = "AWS::Redshift::ClusterSecurityGroup"

  def description: String
  def tags: Option[Seq[Tag]] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "Description" -> Some(Formattable(description)),
    "Tags" -> tags.map(Formattable(_))
  )
}
