package com.github.mshibuya.cloudformal.aws.codedeploy

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-loadbalancerinfo.html
 */

case class LoadBalancerInfo(
    elbInfoList: Option[Seq[ELBInfo]] = None,
    targetGroupInfoList: Option[Seq[TargetGroupInfo]] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "ElbInfoList" -> elbInfoList.map(Formattable(_)),
    "TargetGroupInfoList" -> targetGroupInfoList.map(Formattable(_))
  )
}
