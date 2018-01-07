package com.github.mshibuya.cloudformal.aws.codedeploy

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-loadbalancerinfo.html
 */

case class LoadBalancerInfo(
    elbInfoList: Property[Seq[ELBInfo]] = Empty,
    targetGroupInfoList: Property[Seq[TargetGroupInfo]] = Empty) extends Renderable {
  def render: Formattable = Formattable.withProperties(
    "ElbInfoList" -> elbInfoList,
    "TargetGroupInfoList" -> targetGroupInfoList
  )
}
