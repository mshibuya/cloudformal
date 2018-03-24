package com.github.mshibuya.cloudformal.aws.codedeploy

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-targetgroupinfo.html
 */

case class TargetGroupInfo(
    name: Property[String] = Empty) extends Expression[TargetGroupInfo] {
  def render: Formattable = Value(
    "Name" -> name
  )
}
