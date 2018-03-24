package com.github.mshibuya.cloudformal.aws.redshift

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroup.html
 */

trait ClusterSecurityGroup extends Resource[ClusterSecurityGroup] with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::Redshift::ClusterSecurityGroup"

  def description: NonEmptyProperty[String]
  def tags: Property[Seq[Tag]] = Empty

  def render(): MapValue[_] = Value(
    "Description" -> description,
    "Tags" -> tags
  )
}
