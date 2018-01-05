package com.github.mshibuya.cloudformal.aws.redshift

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html
 */

trait ClusterSecurityGroupIngress extends Resource {
  val resourceTypeName = "AWS::Redshift::ClusterSecurityGroupIngress"

  def cIDRIP: Option[String] = None
  def clusterSecurityGroupName: String
  def eC2SecurityGroupName: Option[String] = None
  def eC2SecurityGroupOwnerId: Option[String] = None

  def resourceProperties: FormattableMap = Formattable.opt(
    "CIDRIP" -> cIDRIP.map(Formattable(_)),
    "ClusterSecurityGroupName" -> Some(Formattable(clusterSecurityGroupName)),
    "EC2SecurityGroupName" -> eC2SecurityGroupName.map(Formattable(_)),
    "EC2SecurityGroupOwnerId" -> eC2SecurityGroupOwnerId.map(Formattable(_))
  )
}
