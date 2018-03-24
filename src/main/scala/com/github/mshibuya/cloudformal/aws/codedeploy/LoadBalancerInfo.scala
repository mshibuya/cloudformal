package com.github.mshibuya.cloudformal.aws.codedeploy

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-loadbalancerinfo.html
 */

case class LoadBalancerInfo(
    elbInfoList: Property[Seq[ELBInfo]] = Empty,
    targetGroupInfoList: Property[Seq[TargetGroupInfo]] = Empty) extends Expression[LoadBalancerInfo] {
  def render: Formattable = Value(
    "ElbInfoList" -> elbInfoList,
    "TargetGroupInfoList" -> targetGroupInfoList
  )
}
