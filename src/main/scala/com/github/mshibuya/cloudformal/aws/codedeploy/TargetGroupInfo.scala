package com.github.mshibuya.cloudformal.aws.codedeploy

import com.github.mshibuya.cloudformal.model._

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-targetgroupinfo.html
 */

case class TargetGroupInfo(
    name: Option[String] = None) extends Renderable {
  def render: Formattable = Formattable.opt(
    "Name" -> name.map(Formattable(_))
  )
}
