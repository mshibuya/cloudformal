package com.github.mshibuya.cloudformal.aws.redshift

import com.github.mshibuya.cloudformal.model._
import com.github.mshibuya.cloudformal.model.policy._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html
 */

trait ClusterSecurityGroupIngress extends Resource with Resource.WithDeletionPolicy {
  val resourceTypeName = "AWS::Redshift::ClusterSecurityGroupIngress"

  def cidriP: Property[String] = Empty
  def clusterSecurityGroupName: NonEmptyProperty[String]
  def eC2SecurityGroupName: Property[String] = Empty
  def eC2SecurityGroupOwnerId: Property[String] = Empty

  def resourceProperties: FormattableMap = Formattable.withProperties(
    "CIDRIP" -> cidriP,
    "ClusterSecurityGroupName" -> clusterSecurityGroupName,
    "EC2SecurityGroupName" -> eC2SecurityGroupName,
    "EC2SecurityGroupOwnerId" -> eC2SecurityGroupOwnerId
  )
}
