package com.github.mshibuya.cloudformal.aws.redshift

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersubnetgroup.html
 */

trait ClusterSubnetGroup extends Resource {
  val resourceTypeName = "AWS::Redshift::ClusterSubnetGroup"

  def description: String
  def subnetIds: Seq[String]
  def tags: Option[Seq[Tag]] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "Description" -> Some(Formattable(description)),
    "SubnetIds" -> Some(Formattable(subnetIds)),
    "Tags" -> tags.map(Formattable(_))
  )
}
